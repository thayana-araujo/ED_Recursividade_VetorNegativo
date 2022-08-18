package Controller;

public class ControllerVetorNegativo {
	
	
	public ControllerVetorNegativo () {
		super();
	}
	
	
	public int vetNegativo(int[] vet, int index) {
		
		
		if(index == 0) {
			return 0;
		}
		
		if(vet[index - 1] < 0) {
			return 1 + vetNegativo(vet, index - 1);
		}
		
		return vetNegativo(vet, index - 1);
	}
	

}
