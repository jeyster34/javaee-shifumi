package fr.mathieu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

public class ShifumiServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//chercher les scores et renvoyer le dispatch vers .jsp

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//choix du coup par le joueur à travers un formulaire dans .jsp (utiliser 3 <form> avec un boutton dedans et <input type="hidden" name="coup" value="0"/>) 
		
		//tirer le coup de l'ordi avec random entre entiers 0 et 2 inclus
		
		//comparer le coup du joueur avec celui de l'ordi
		
		//mettre à jour le score
	}
	
	

}
