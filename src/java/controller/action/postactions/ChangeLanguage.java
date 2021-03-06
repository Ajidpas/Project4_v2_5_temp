/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.action.postactions;

import controller.ConfigManager;
import controller.action.postactions.PostAction;
import java.io.IOException;
import javax.servlet.ServletException;

/**
 * Change language
 * @author Sasha
 */
public class ChangeLanguage extends PostAction {

    /**
     * Set languge block and set the language settings
     * @return property key value
     * @throws ServletException
     * @throws IOException 
     */
    @Override
    public void doExecute() throws ServletException, IOException {
        session.setAttribute("language", request.getParameter("language"));
        String path = request.getHeader("Referer");
        if (path == null) {
            path = ConfigManager.getProperty("path.page.home");
        }
        response.sendRedirect(path);
    }
    
}
