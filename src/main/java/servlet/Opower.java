package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.PersonDAO;
import domain.Person;

@WebServlet(name = "opower", urlPatterns = { "/Opower" })

public class Opower extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		PersonDAO daop = new PersonDAO();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		PersonDAO dao = new PersonDAO();
		Person p1 = new Person();
		
		p1.setName(request.getParameter("name"));
		p1.setFirtsName(request.getParameter("firstname"));
		p1.setEmail(request.getParameter("email"));
		dao.create(p1);

		out.println("<HTML>\n<BODY>\n" + "<H1>Formulaire</H1>\n" + "<UL>\n" + " <LI>Nom: "
				+ request.getParameter("name") + "\n" + " <LI>Prenom: " + request.getParameter("firstname") + "\n"
				+ " <LI>email: " + request.getParameter("email") + "\n" + "</UL>\n" + "</BODY></HTML>");
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PersonDAO daop = new PersonDAO();
		List<Person> ps = daop.readAll();
		PrintWriter out = resp.getWriter();
		System.err.println(ps.size());
		out.write("<table>");
		for(Person person : ps){ //Running through the list to show all persons retrived
		    out.write("<tr>"); 
		    out.write("<p>"+person.getName()+"</p>");    ///
		    out.write("</tr>");
		 }
		 out.write("</table>"); 
		

	}

}
