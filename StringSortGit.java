class StringSortGit{
	public static void main(String ar[]){
		String name[]={"ranpreet","gurpreet","manpreet","ashpreet","bhavpreet"};
		
		System.out.println("\n Original String is \n");
		for(int i=0;i<name.length;i++)
			System.out.print(" "+name[i]+" ");
		
		for(int i=0;i<name.length;i++){
			for(int j=i+1;j<name.length;j++){
				if(name[i].compareTo(name[j])>0){
					String temp=name[i];
					name[i]=name[j];
					name[j]=temp;
				}
			}
		}
		
		System.out.println("\n Sorted String is \n");
		for(int i=0;i<name.length;i++)
			System.out.print(" "+name[i]+" ");
	}
}