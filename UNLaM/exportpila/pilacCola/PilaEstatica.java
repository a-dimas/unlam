package pilacCola;


public class PilaEstatica implements Pila {
	double[] vec;
	int top;
	public PilaEstatica(int cant) {
		vec = new double[cant];
		top = -1;
	}
	


	@Override
	public boolean push(double valor) {
		if (top + 2 <= vec.length) {
			vec[++top] = valor;
			return true;
		}				
		return false;
	}

	@Override
	public double pop() {
		if (!isEmpty()){ 
			return vec[top--];
		}
		return (Double) null;
	}

	@Override
	public double peek() {
		// TODO Auto-generated method stub
		return vec[top];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}

	@Override
	public boolean empty() {
		while (top > -1){
			vec[top--] = (Double) null;			
		}
		return true;
	}

}
