package activities;

class CustomException extends Exception
{
	private String message = null;
	
	public CustomException(String custmsg)
	{
		message = custmsg;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}

public class Activity8 {

	public static void main(String[] args) {
		try {
			
			Activity8.exceptionTest("no error");
		}
		catch(Exception e)
		{
			System.out.println("exceptoion occuer");
		}
		

	}
	static void  exceptionTest(String msg) throws CustomException
	{
	  if(msg==null)
	  {
		  throw new CustomException("value messg is null");
	  }
	  else
	  {
		  System.out.println(msg);
	  }
	}

}
