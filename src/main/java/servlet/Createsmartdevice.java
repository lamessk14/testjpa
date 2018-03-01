package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ElectronicDeviceDAO;
import domain.ElectronicDevice;
import domain.SmartDevice;

/**
 * 
 * @author Fanta COULIBALY & Louise-Agnès MACKONGO
 *
 */
@WebServlet(name = "createsmartdevice", urlPatterns = { "/Createsmartdevice" })

public class Createsmartdevice extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		ElectronicDeviceDAO daoDevice = new ElectronicDeviceDAO();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ElectronicDeviceDAO daoDev = new ElectronicDeviceDAO();
		ElectronicDevice device = new ElectronicDevice();
		
		device.setType(request.getParameter("type"));
		//device.setConsoMoyenne(request.getParameter("consomoyenne"));
		daoDev.create(device);

		out.println("<HTML>\n<BODY>\n" + "<H1>Formulaire</H1>\n" + "<UL>\n" + " <LI>Type d'equipement: "
				+ request.getParameter("type") + "\n" + " <LI>Consommation moyenne: " + request.getParameter("consomoyenne") + "\n"
				+ "\n" + "</UL>\n" + "</BODY></HTML>");
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ElectronicDeviceDAO daodev = new ElectronicDeviceDAO();
		List<ElectronicDevice> devices = daodev.readAll();
		PrintWriter out = resp.getWriter();
	
		out.write("<table>");
		for(ElectronicDevice device : devices){ 
			out.write("<tr>"); 
		    out.write("<p>"+device.getType()+"</p>");    ///
		    out.write("</tr>");
		 }
		 out.write("</table>"); 
	}
	
	

}
