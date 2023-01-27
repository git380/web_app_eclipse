package model;

import dao.UserDAO;

public class LoginLogic {
	public boolean execute(User user) {
		/*if (user.getPass().equals("1234")) {
		  return true;
		}
		return false;*/
		return UserDAO.UserData(user.getName(), user.getPass());
	}
}