import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet("/viewAll")
public class ViewAllServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        DbOperations dbOperations=new DbOperations();
//        try {
//            dbOperations.doConnectDb();
//            ArrayList<PersonDetails> list=dbOperations.fetchData();
//            req.setAttribute("expense",list);
//            RequestDispatcher rd=req.getRequestDispatcher("ShowDetails.jsp");
//            rd.forward(req, res);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
        PrintWriter out=res.getWriter();
        try {
            dbOperations.doConnectDb();
            ArrayList<PersonDetails> list=dbOperations.fetchData();
            out.println(""+
                    "<html>"+
                    " <head>"+
                    "  <title>Expense Manager</title>"+
                    " </head>"+
                    "  <body>"+
                    "<table>"+
                    "<thead>"+
                    " <tr>"+
                    "   <th>Name</th>"+
                    "   <th>Amount</th>"+
                    "   <th>Category </th>"+
                    "   <th>Date</th>"+
                    "   <th>Description</th>"+
                    " </tr>"+
                    "</thead>");

            for (PersonDetails personDetails:list){
                out.println("<tbody>"+
                        "  <tr>"+
                        "   <td>"+personDetails.name+"</td>"+
                        "   <td>"+personDetails.amount+"</td>"+
                        "   <td>"+personDetails.description+"</td>"+
                        "   <td>"+personDetails.date+"</td>"+
                        "   <td>"+personDetails.category+"</td>"+
                        "  </tr>"+
                        "</tbody>");
            }

            out.println("</table>"+
                    "  <body>"+
                    "</html>");

        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
