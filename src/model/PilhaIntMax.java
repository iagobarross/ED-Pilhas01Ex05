package model;

public class PilhaIntMax {

		No topo;
		
		public PilhaIntMax() {
			topo = null;
		}
		
		public boolean isEmpty() {
			if(topo == null) {
				return true;
			}
			return false;
		}
		
		public void push(int valor) {
			No elemento = new No();
			elemento.dado = valor;
			elemento.proximo = topo;
			topo = elemento;
		}
		
		public int pop() throws Exception{
			if(isEmpty()) {
				throw new Exception("Pilha Vazia");
			}
			
			int valor = topo.dado;
			topo = topo.proximo;
			return valor;
		}
		
		public int top() throws Exception{
			if(isEmpty()) {
				throw new Exception("Pilha Vazia");
			}
			
			int valor = topo.dado;
			return valor;
		}
		
		public int size() {
			int count = 0;
			if(!isEmpty()) {
				No aux = topo;
				count = 1;
				while(aux.proximo != null) {
					count++;
					aux = aux.proximo;
				}
			}
			
			return count;
		}
		
		public int max() throws Exception {
			if(isEmpty()) {
				 throw new Exception("Pilha Vazia");
			}
			
			PilhaIntMax aux = new PilhaIntMax();
			int max = top();
			
			while(!isEmpty()) {
				int valor = pop();
				if (valor > max) {
				max = valor;
				}
				aux.push(valor);
			}
			
			while(!aux.isEmpty()) {
				push(aux.pop());
			}
			
			return max;
		}
}

	

