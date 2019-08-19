package minimum;

public class find2min {

	public int find(String a)
	{
		a=a.trim();
		int arr[]=new int[a.length()];
		int count=0;
		
		//String result = "";
        for (String tok : a.split(" "))
        {
        	if(!tok.matches("^[ ]*$"))
        		arr[count++]=Integer.parseInt(tok);
        }
        //for (int i=0;i<count;i++)
        //	System.out.println(arr[i]);
        System.out.println(arr.length);
        System.out.println(count);
        
		if (arr.length<2)
		{
			System.out.println("INVALID INPUT there should be atleast 2 elements");
		}
        
        int min1=0;
        int min2=0;
        min1=min2=Integer.MAX_VALUE;
        for (int i=0;i<count;i++)
        {
        	if (arr[i]<min1)
        	{
        		min2=min1;
        		min1=arr[i];
        	}
        	else if (arr[i]<min2 && arr[i]!= min1)
        		min2=arr[i];
        }
        System.out.println(min2);
        return min2;
        //Ending of Business Logic
	}
}
