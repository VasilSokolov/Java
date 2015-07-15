package controller;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entities.*;
import model.*;
import java.util.*;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductModel pm = new ProductModel();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equals("delete")) {
			Integer id = Integer.valueOf(request.getParameter("id"));
			this.pm.delete(this.pm.find(id));
			request.getRequestDispatcher("index.jsp")
			.forward(request, response);
		}
		else if (action.equals("edit")) {
			request.setAttribute("p",
					this.pm.find(Integer.parseInt(request.getParameter("id"))) );
			request.getRequestDispatcher("edit.jsp")
			.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equals("add")) {
			Product p = new Product();
			p.setDescription(request.getParameter("description"));
			p.setName(request.getParameter("name"));
			p.setPrice(Integer.parseInt(request.getParameter("price")));
			p.setQuantity(Integer.parseInt(request.getParameter("quantity")));
			this.pm.create(p);
			request.getRequestDispatcher("index.jsp")
			.forward(request, response);
		}
		else if (action.equals("processedit")) {
			Product p = this.pm.find(Integer.parseInt(request.
					getParameter("id")));
			p.setDescription(request.getParameter("description"));
			p.setName(request.getParameter("name"));
			p.setPrice(Integer.parseInt(request.getParameter("price")));
			p.setQuantity(Integer.parseInt(request.getParameter("quantity")));
			this.pm.update(p);
			request.getRequestDispatcher("index.jsp")
			.forward(request, response);
		}
		
	}

}
