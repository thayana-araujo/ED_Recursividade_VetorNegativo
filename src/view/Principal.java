package view;

import javax.swing.JOptionPane;

import Controller.ControllerVetorNegativo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//vari�vel que receber� o vetor
			int[] vetor = {-1, -2, 1, -5, 2, 3, -8,-10};
						
			//m�todo construtor
			ControllerVetorNegativo vn = new ControllerVetorNegativo();
			
			//vari�vel que ir� mostrar os elementos negativos	
			int resultado =  vn.vetNegativo(vetor, vetor.length);
			
			//resultado no console
			System.out.println("Neste vetor tem " +resultado+ " elementos negativos.");
		}

	}


