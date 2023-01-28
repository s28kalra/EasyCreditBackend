package com.sagar;

import org.junit.jupiter.api.Test;

class AopExampleApplicationTests {

	@Test
	void contextLoads() {
		String s= "WALLET_TXN_ID\n"
				+ "ACTION\n"
				+ "CHANNEL\n"
				+ "CREATION_TIME\n"
				+ "PAYER_WALLET_ID\n"
				+ "REQUEST_ID\n"
				+ "TOTAL_CREDIT_AMOUNT\n"
				+ "TOTAL_DEBIT_AMOUNT\n"
				+ "TRANSACTION_ID\n"
				+ "BANK_REFERENCE_ID\n"
				+ "PAYEE_WALLET_ID\n"
				+ "CLOSING_BALANCE\n"
				+ "OPENING_BALANCE";
		
		String data[]= s.split("\n");
		System.out.println(data.length);
		StringBuilder sb= new StringBuilder();
		for(String d: data) {
			sb.append(d+",");
		}
		System.out.println(sb.toString());
	}

}
