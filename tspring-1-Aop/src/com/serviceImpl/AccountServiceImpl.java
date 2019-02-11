package com.serviceImpl;

import com.model.Account;

public class AccountServiceImpl{
	public void updateAccountBalance(Account account, long amount ) {
		System.out.println(amount+" deposited to "+account.getDescription());
	}
}