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

@WebServlet
(name="mytest",urlPatterns={"/myurl"})


public class MyServlet extends HttpServlet {
	PersonDAO daop;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		daop = new PersonDAO();
	}
	
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
    	//List<Person> ps =  daop.readByName(req.getParameter("name"));
    	PrintWriter p = new PrintWriter(resp.getOutputStream());
        PersonDAO dao = new PersonDAO();
        Person p1 = dao.read((long) 2);
    	
        p.print("Hello world SIR" + p1.getEmail());
        p.flush();
        
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.doPost(req, resp);
    }    
}
