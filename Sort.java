
public class Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arr= new int[]{8,17,6,5,34,22,12};
		//ð������
	/** bubbleSort(arr,7);
		System.out.println("ð������:");
		print(arr);
	    //ѡ������

        selectSort(arr,7);
		System.out.println("ѡ������:");
		print(arr);
	**/	
		
		insertSort(arr,7);
		System.out.println("��������:");
		print(arr);
	
     
		
	
	}
	
    public static void bubbleSort(int[]a,int n){
     if(n<=1) return;
	 for(int i=0;i<n-1;i++){
		 boolean flag =false;
		 for(int j=0;j<n-i-1;j++){
			 if(a[j]>a[j+1]){
			     int temp=a[j];
				 a[j]=a[j+1];
				 a[j+1]=temp;
				 flag=true;
			 }
		 }
		 if(!flag) break;
	 }
	}
    
    public static void selectSort(int[]a,int n){
    	if(n<=1) return;
    	for(int i=0;i<n-1;i++){
    		int pos=i;  //pos ÿһ�ֱȽ���Сֵ��λ�� 
    		for(int j=i+1;j<n;j++){
    			if(a[pos]>a[j]){
    				pos=j;
    			}
    		}
    		if(i!=pos){
    			int temp =a[i];
    			a[i]=a[pos];
    			a[pos]=temp;
    		}
    		
    	}
    }
    
    public static void insertSort(int[]a,int n){
    	if(n<=1) return;
    	for(int i=1;i<n;i++){
    	  for(int j=i;j>0;j--){
    		  if(a[j]<a[j-1]){
    			  int temp =a[j];
    			  a[j]=a[j-1];
    			  a[j-1]=temp;
    		  }else{
    			  break;
    		  }
    		  
    	  }
    		
    	}
    }
    
    public static void print(int[] a){
    	for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
    }

}
