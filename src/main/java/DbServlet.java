import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;


@WebServlet("/ExpenseManager")
public class DbServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("hello");
        String name=req.getParameter("ename");
        String category=req.getParameter("category");
        Integer amount=Integer.parseInt(req.getParameter("amount"));
        String date=req.getParameter("date");
        String description=req.getParameter("des");

        PrintWriter out=res.getWriter();

        DbOperations dbObj=new DbOperations();
        try {
            dbObj.doConnectDb();
            dbObj.InsertData(name,amount,category,date,description);
            out.println(""+"<h1>Successfully inserted</h1>");
        }catch (SQLException e){
            e.printStackTrace();
        }
    };
}
