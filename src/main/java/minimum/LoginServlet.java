package minimum;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/find2min")
public class LoginServlet extends HttpServlet 
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException 
	{
		//PrintWriter out = response.getWriter();
		String a=request.getParameter("numbers");
        request.getRequestDispatcher("/WEB-INF/views/find2min.jsp").forward(request,response);
        
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException 
	{
		//PrintWriter out = response.getWriter();
		String a=request.getParameter("numbers");
		String msg="";
				if (a.contentEquals(""))
				{
					System.out.println("inside edge1");
					msg="WRONG INPUT: please enter any value ";
					request.setAttribute("msg", msg);
					request.getRequestDispatcher("/WEB-INF/views/message.jsp").forward(request, response);
				}
				//check the numeric of the elements in input
				else if (!a.matches("^[ 0-9]+$"))
				{
					System.out.println("inside edge2");
					msg="WRONG INPUT: please enter only numeric values";
					request.setAttribute("msg", msg);
					request.getRequestDispatcher("/WEB-INF/views/message.jsp").forward(request, response);
				}
				else
				{
					a=a.trim();
					int arr[]=new int[a.length()];
					int count=0;
					
					//String result = "";
			        for (String tok : a.split(" "))
			        {
			        	if(!tok.matches("^[ ]*$"))
			        		arr[count++]=Integer.parseInt(tok);
			        }
			        //System.out.println(count);
			        //System.out.println(arr.length);
			      
					if (count<2)
					{
						System.out.println("inside edge3");
						msg="WRONG INPUT: There must be atleast 2 values to find the 2nd minimum...";
						request.setAttribute("msg", msg);
						request.getRequestDispatcher("/WEB-INF/views/message.jsp").forward(request, response);
					}
					else
					{
						//calling business logical function
						find2min ob=new find2min();
						int min2=ob.find(a);
						
						//calling the DAO functionality
						//so that we can update the new data and fetch the history data 
						find2minDAO obj=new find2minDAO();
						String his=obj.updateAndFetch(min2, a);	  
						
						//UpdatingAttributes
						//request.setAttribute("msg", msg);
						request.setAttribute("his", his);
						request.setAttribute("nums", a);
				        request.setAttribute("min", min2);
						request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request,response);
					}
				}
	}

}