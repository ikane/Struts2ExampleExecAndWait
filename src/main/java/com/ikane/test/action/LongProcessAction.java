package com.ikane.test.action;

import com.opensymphony.xwork2.ActionSupport;
 
public class LongProcessAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8679042338947806257L;
	
	
	private int counter;
	private int nbMax = 100000;

	public String execute() throws Exception {
	
		for(int i =0; i<nbMax; i++){
			System.out.println(i);
			counter = i;
		}
		return SUCCESS;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int getNbMax() {
		return nbMax;
	}

	public void setNbMax(int nbMax) {
		this.nbMax = nbMax;
	}
}