package Course1;

public class min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[10];
		System.out.println("course1:길보미");
		for(int i=0;i<10;i++) {
			array[i]=(int) (Math.random()*101);
			System.out.print(array[i]+" ");
		}
		int min=array[0];
		int index = 0;
		for(int i=1;i<10;i++) {
			if(min>array[i]) {
				min=array[i];
				index=i;
			}
		}
		System.out.println("\n최소값="+min);
		System.out.println("최소값 인덱스="+index);
		int temp=array[0];
		array[0]=min;
		array[index]=temp;
		for(int i=0;i<10;i++)
			System.out.print(array[i]+" ");
		}

}
