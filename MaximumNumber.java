//To find maximum number in array

class MaximumNumber
{
        public static void main(String args[])
	{
	int max[] = {10, 12, 7, 8 , 9, 3, 4, 5, 1, 11};
	int large = max[0];
	for(int index = 1; index < max.length-1; index++)
	{
		
		if(max[index]>large)
		{
			large = max[index];
			System.out.println("Maximum number of array = "+ large);
		}	
	}
	}
}