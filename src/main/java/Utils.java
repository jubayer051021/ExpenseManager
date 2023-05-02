public class Utils {
    public static final String DB_NAME="ExpenseManager";
//    public static final String CONNECTION_STR="jdbc:mysql://localhost:3306/ExpenseManager";
    public static final String USER="root";
    public static final String USER_TABLE="userTable";
    public static final String PASSWORD="";
    public static final String COLUMN_EXNAME="name";
    public static final String COLUMN_DESCRIPTION="description";
    public static final String COLUMN_DATE="date";
    public static final String COLUMN_AMOUNT="amount";
    public static final String COLUMN_EXPENSECATEGORY="category";
    public static final String INSERT_SQL="INSERT INTO `usertable`(`name`, `amount`, `date`, `category`, `description`) VALUES (?,?,?,?,?)";
}
