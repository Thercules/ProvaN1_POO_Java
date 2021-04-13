package testando;

public class testando4 {
	public static void main(String[] args) {
		boolean[][] array = {{true, false, true}, 
				{false, true, false}}; 
		int linha_comprimento = array.length; 
		int coluna_comprimento = array[0].length;
		
		for (int i = 0; i < linha_comprimento; i++) {
			for (int j = 0; j < coluna_comprimento; j++) {
				
				if(array[i][j]) {
					System.out.print(" T ");
				}else {
					System.out.print(" F ");
				}
			}
			System.out.println();
		}
		}
	}

