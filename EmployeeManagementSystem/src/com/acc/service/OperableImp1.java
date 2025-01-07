package com.acc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.acc.model.Employee;
import com.acc.util.DBConnection;

public class OperableImp1 implements Operable {

	@Override
	public List<Employee> findAll() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Employee> emps = new ArrayList<Employee>();

		try {
			con = DBConnection.getDBConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employee");
			while (rs.next()) {
				emps.add(new Employee(rs.getInt("id"), rs.getInt("age"), rs.getString("fname"), rs.getString("lname"),
						rs.getFloat("salary")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {

					rs.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return emps;
	}

	@Override
	public Employee find(int id) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		Employee emp = null;
		try {
			con = DBConnection.getDBConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employee where id=" + id);
			while (rs.next()) {
				emp = new Employee(rs.getInt("id"), rs.getInt("age"), rs.getString("fname"), rs.getString("lname"),
						rs.getFloat("salary"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {

					rs.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return emp;
	}

	@Override
	public void delete(int id) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBConnection.getDBConnection();
			pstmt = con.prepareStatement("delete from employee where id=" + id);
			pstmt.executeUpdate();
			System.out.println("Record Deleted");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {

					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	@Override
	public void deleteAll() {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBConnection.getDBConnection();
			pstmt = con.prepareStatement("delete from employee");
			pstmt.executeUpdate();
			System.out.println("All Records Deleted");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {

					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void add(Employee emp) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBConnection.getDBConnection();
			pstmt = con.prepareStatement("insert into employee values(?,?,?,?,?)");
			pstmt.setInt(1, emp.getId());
			pstmt.setInt(2, emp.getAge());
			pstmt.setString(3, emp.getFname());
			pstmt.setString(4, emp.getLname());
			pstmt.setFloat(5, emp.getSalary());
			pstmt.executeUpdate();
			System.out.println("New record inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {

					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void updateAge(int id, int age) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBConnection.getDBConnection();
			pstmt = con.prepareStatement("update employee set age=? where id=" + id);
			pstmt.setInt(1, age);
			pstmt.executeUpdate();
			System.out.println("Record Updated");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {

					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	@Override
	public void updateSalary(int id, float salary) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBConnection.getDBConnection();
			pstmt = con.prepareStatement("update employee set salary=? where id=" + id);
			pstmt.setFloat(1, salary);
			pstmt.executeUpdate();
			System.out.println("Record Updated");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {

					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	
	@Override
	public void increaseSalary(float per) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBConnection.getDBConnection();
			pstmt = con.prepareStatement("update employee set salary=(salary*"+per+")/100+salary");
			pstmt.executeUpdate();
			System.out.println("Records Updated");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {

					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
