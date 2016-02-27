package base;

public class MyInteger {
	private static int iValue;
	
	public MyInteger(int val)
	{
	MyInteger.iValue = val;
	}
	public int getVal()
	{
		return iValue;
	}
	public boolean isEven()
	{
		if (iValue % 2 == 0)
		{
		return true;
		}
		else
		{
		return false;
		}
	}
	public boolean isOdd()
	{
		if(iValue % 2 == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isPrime()
	{
        for (int i = 2; i * i < iValue; i++)
            if (iValue % i == 0){
            	return false;
            }
            	
        return true;
	}
	public static boolean isEven(int iValue)
	{
		if(iValue % 2 == 0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public static boolean isOdd(int iValue)
	{
		if(iValue % 2 == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isPrime(int iValue)
	{
        for (int i = 2; i * i < iValue; i++)
            if (iValue % i == 0){
            	return false;	
            }
        return true;
	}
	public static boolean isEven(MyInteger integer)
	{
		return MyInteger.isEven(integer.getVal());
	}
	public static boolean isOdd(MyInteger integer)
	{
		return MyInteger.isOdd(integer.getVal());
	}
	public static boolean isPrime(MyInteger integer)
	{
		return MyInteger.isPrime(integer.getVal());
	}
	public boolean equals(int val)
	{
		if (val == getVal())
		{
			return true;
		}
		return false;
	}
	public static boolean equals(MyInteger val)
	{
		return val.equals(val.getVal());
	}
}
