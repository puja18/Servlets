package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.entity.Player;

/**
 * Servlet implementation class Demo5
 */
@WebServlet("/Demo5")
public class Demo5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Set<Player> players = new HashSet<>();
	    Player p1 = new Player(101, "sachin", 500, 4500, 2, true);
	    Player p2 = new Player(102, "Rahil", 500, 4000, 2, false);
	    Player p3 = new Player(103, "maheendhar", 5000, 35000, 2, false);
	    Player p4 = new Player(104, "tendulkar", 500, 250, 2, false);
	    Player p5 = new Player(105, "kohli", 50, 4000, 2, false);
	    Player p6 = new Player(106, "sachin", 500, 4500, 2,false);
	    Player p7 = new Player(107, "shewag", 50, 41, 2, false);
	    Player p8 = new Player(108, "Dhoni", 500, 480, 2, false);
	    Player p9 = new Player(109, "sachin", 400, 4211, 2, false);
	    Player p10 = new Player(110, "kapil", 500, 410, 2, false);
	    Player p11 = new Player(111, "virat", 510, 4600, 2,false);
	    players.add(p1);
	    players.add(p2);
	    players.add(p3);
	    players.add(p4);
	    players.add(p5);
	    players.add(p6);
	    players.add(p7);
	    players.add(p8);
	    players.add(p9);
	    players.add(p10);
	    players.add(p11);
	    PrintWriter out = response.getWriter();
	    out.println("<link href='style.css' rel = 'Stylesheet'>");
	    out.println("<table><tr><th>Id</th>"
	    		+ "<th>Name</th>"
	    		+ "<th>noOfMatches</th>"
	    		+ "<th>totalRunsScored</th>"
	    		+ "<th>noOfWickets</th>"
	    		+ "<th>captain</th>"
	    		+ "<th>BattingRating</th>"
	    		+ "<th>BowlingRating</th></tr>");	
	    for (Player player : players) {
	    	out.println("<tr>");
	    
	    	out.println("<td>"+player.getPlayerId()+"</td>");
	    	out.println("<td>"+player.getPlayerName()+"</td>");
	    	out.println("<td>"+player.getTotalRunsScored()+"</td>");
	    	out.println("<td>"+player.isCaptain()+"</td>");
	    	out.println("<td>"+player.getNoOfWickets()+"</td>");
	    	out.println("<td>"+player.getNoOfMatches()+"</td>");
	    	out.println("<td>"+player.getBattingRating()+"</td>");
	    	out.println("<td>"+player.getBoulingRating()+"</td>");
	    	out.println("</tr>");
	    	
	    	
			
		}
	    out.println("</table>");
			
		}
				}


