/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.tagsupport;

import java.io.IOException;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author ToSan
 */
public class SetAuthorizationBlock extends TagSupport {
    
    @Override
    public int doStartTag() throws JspException {
        HttpSession session = pageContext.getSession();
        String path;
        if (session.getAttribute("user") != null) {
            path = "/view/person/user/authorization.jsp";
        } else if (session.getAttribute("admin") != null) {
            path = "/view/person/admin/authorization.jsp";
        } else if (session.getAttribute("kitchen") != null) {
            path = "/view/kitchen/authorization.jsp";
        } else {
            path = "/view/guest/authorization.jsp";
        }
        try {
            JspWriter out = pageContext.getOut();
            out.print("<jsp:include page=\"/view/navigation.jsp\" />");
            out.print("Simple text");
        } catch (IOException e) {
            throw new JspException();
        }
        return SKIP_BODY;
    }
    
    @Override
    public int doEndTag() throws JspException {
        return EVAL_PAGE;
    }
}
