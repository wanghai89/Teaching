package com.gs.qq.bean;

import java.net.Socket;

import com.gs.bean.Account;

/**
 * ���ڱ����¼������˵�QQ�û��뽨����Socket���ӵĹ�ϵ��һ��QQ�û���¼�󣬶�Ӧ��һ��socket����
 *
 */
public class QQSocket {
	
	private Account account;
	private Socket socket;
	
	public QQSocket() {

	}
	public QQSocket(Account account, Socket socket) {
		this.account = account;
		this.socket = socket;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Socket getSocket() {
		return socket;
	}
	public void setSocket(Socket socket) {
		this.socket = socket;
	}
	
}