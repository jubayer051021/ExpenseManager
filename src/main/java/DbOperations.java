import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

public class DbOperations {
    Connection con;
    Statement st;
    public void doConnectDb() throws SQLException{
        String connectionStr = "jdbc:mysql://localhost:3306/expensemanager";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(connectionStr, Utils.USER, Utils.PASSWORD);
            System.out.println("SuccessFully db connected");

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void InsertData(String name,Integer amount,String category,String date,String description) throws SQLException {
        Statement st=con.createStatement();
        PreparedStatement preparedStatement=con.prepareStatement(Utils.INSERT_SQL);
        preparedStatement.setString(1,name);
        preparedStatement.setInt(2,amount);
        preparedStatement.setString(3,category);
        preparedStatement.setString(4,date);
        preparedStatement.setString(5,description);
        preparedStatement.executeUpdate();
        System.out.println("successFully Inserted");
    }
    public ArrayList<PersonDetails> fetchData() throws SQLException{
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM "+Utils.USER_TABLE);
        ArrayList<PersonDetails> arrayList=new ArrayList<>();
        while (rs.next()){
            String name=rs.getString(Utils.COLUMN_EXNAME);
            String category=rs.getString(Utils.COLUMN_EXPENSECATEGORY);
            Integer amount=Integer.parseInt(rs.getString(Utils.COLUMN_AMOUNT));
            String date=rs.getString(Utils.COLUMN_DATE);
            String description=rs.getString(Utils.COLUMN_DESCRIPTION);
            arrayList.add(new PersonDetails(name,amount,category,date,description));
        }
        System.out.println(arrayList);
        return arrayList;
    }
}
