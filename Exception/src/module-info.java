class Exception {
 public int add()
 {
	 try
	 {
		 int a=1;
		 if(a==0)
		 {
			 return 0;
		 }
		 else
		 {
			 throw Exception("A value is not 0");
		 }
	 }
	 catch(Exception e)
	 {
		 return 1;
	 }
		finally
		{
			return 3;
		}
		return -1;
	 }
