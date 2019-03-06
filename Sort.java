
public class Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arr= new int[]{8,17,6,5,34,22,12};
		//冒泡排序
	/** bubbleSort(arr,7);
		System.out.println("冒泡排序:");
		print(arr);
	    //选择排序

        selectSort(arr,7);
		System.out.println("选择排序:");
		print(arr);
	**/	
		
		//插入排序
		insertSort(arr,7);
		System.out.println("插入排序:");
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
    		int pos=i;  //pos 姣忎竴杞瘮杈冩渶灏忓�鐨勪綅缃�
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
