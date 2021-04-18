package edu.web.member;

public interface DBConnectionQuery {
	//DB 접속에 필요한 상수 정의
	public static final String URL="jdbc:oracle:thin:@localhost:1521:orcl";
	public static final String USER = "c##dongwoo";
	public static final String PASSWORD = "1234";
	
	// DB 테이블 컬럼 상수 정의
	public static final String TABLE_NAME = "MEMBER";
	public static final String COL_USERID = "USERID";
	public static final String COL_PASSWORD= "PASSWORD";
	public static final String COL_EMAIL = "EMAIL";
	public static final String COL_EMAILAGREE = "EMAILAGREE";
	public static final String COL_INTEREST = "INTEREST";
	public static final String COL_PHONE = "PHONE";
	public static final String COL_INTRODUCE = "INTRODUCE";
	
	//	insert into member values
	//	(?, ?, ?, ?, ?, ?, ?);
	public static final String SQL_INSERT = "insert into " + TABLE_NAME
			+ " values (?, ?, ?, ?, ?, ?, ?)";
	
	//select * from member where userid = ?
	public static final String SQL_SELECT_BY_USERID =
			"select * from " + TABLE_NAME + " where " + COL_USERID + " = ?";
	//update member set
	//password = ?, email = ?, emailagree = ?
	//where userid = ?
	public static final String SQL_UPDATE_BY_USERID =
			"update " + TABLE_NAME + " set " +
					COL_PASSWORD + " = ?, " +
					COL_EMAIL + " = ?, " +
					COL_EMAILAGREE + " = ?, " +
					COL_INTEREST + " = ?, " +
					COL_PHONE + " = ?, " +
					COL_INTRODUCE + " = ? " +
					"where " + COL_USERID + " = ?";
	
	//delete from member where userid = ?
	public static final String SQL_DELETE_BY_USERID =
			"delete from " + TABLE_NAME + " where " + COL_USERID + " = ?";
	
	//select * from member where userid = ? and password = ?
	public static final String SQL_SELECT_BY_USERID_PASSWORD =
			"select * from " + TABLE_NAME + " where " + COL_USERID + " = ?" + " and " + COL_PASSWORD + " = ?";
	
}
