package view;

import docarmo.ArvoreInt.Arvore;

public class main {

	public static void main(String[] args) {
		
		Arvore a = new Arvore();
		
		int vt [] = {12, 4, 16, 2, 8, 6};
		
		for(int i : vt) {
			a.insert(i);
		}
		
		try {
			a.search(6);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
