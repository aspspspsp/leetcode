//��λ����
public class ShiftingBits {
	public static void main(String args[]) {
		System.err.println(rightArthmeticShifting(-8, 3));
		System.err.println(rightLogicalShifting(-4, 1));
		
		System.err.println(leftArthmeticShifting(8, 1));
	}
	
	//���g��λ����n�����Ƅ�iλ(�Ƅ�һλ���ǳ�2����λ��4)����ؓ��׃
	static int rightArthmeticShifting(int n, int i) {
		return n >> i;
	}
	
	//���g��λ����n�����Ƅ�iλ������׃��ؓ׃��(�Ƅӕr������1λ�a0)
	static int rightLogicalShifting(int n, int i) {
		return n >>> i;
	}
	
	//���g��λ����n�����Ƅ�iλ(�Ƅ�һλ���ǳ�2����λ��4)����ؓ��׃
	static int leftArthmeticShifting(int n, int i) {
		return n << i;
	}
		
	//�K�]�Ќ�n�����Ƅ�(߉݋��λ)
}