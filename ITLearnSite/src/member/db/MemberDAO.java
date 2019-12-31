package member.db;

public class MemberDAO implements MemberDAOInfc{
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    DataSource ds = null;
    String sql = "";
    Statement stmt = null;
    //DB연결
    private Connection getConnection() throws Exception {
        Context ctx = new InitialContext();
        ds = (DataSource)ctx.lookup("java:comp/env/jdbc/jspbeginner");
        return ds.getConnection();
    }
    
    //DB연결해제
    private void closeConnection(){
        try {
            if(rs != null) rs.close();
            if(pstmt != null) pstmt.close();
            if(con != null) con.close();
            if(stmt != null) stmt.close();
          
        } catch (SQLException e) {
            System.out.println("closeConnection()메소드에서 오류  : " +e);
        }
    }
	@Override
	public void deleteMember() {
		
	}
	
	@Override
	public void insertMember() {
		
	}
	
	@Override
	public void updateMember() {
		
	}
	
	@Override
	public void selectMember() {
		
	}
}
