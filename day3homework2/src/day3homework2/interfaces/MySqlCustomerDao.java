package day3homework2.interfaces;

public class MySqlCustomerDao implements CustomerDao, Repository {

	@Override
	public void add() {
		System.out.println("mysql eklendi");
	}

}
