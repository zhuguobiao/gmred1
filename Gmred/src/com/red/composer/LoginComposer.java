package com.red.composer;

import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Textbox;

import com.red.storage.dao.UserDao;
import com.red.storage.entity.User;


public class LoginComposer extends GenericForwardComposer{
	
	private Textbox name_txt;
	
	private Textbox password_txt;
	
	private Button submit_btn;
	
	UserDao userDao = new UserDao();
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
	}
	
	public void onClick$submit_btn() {
		String name = name_txt.getText();
		String password = password_txt.getText();
		List<User> userList = userDao.findUserBynameAndPass(name, password);
		if(null != userList && userList.size() == 1) {
			Executions.sendRedirect("/guide.zul");
		}
	}
	
}
