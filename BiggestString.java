/* class BiggestString
{
	static String findBiggestString(String S,String K)
	{
		int i=S.length();
		int j=K.length();
		if(i>j)
		{
			return S;
		}
		else
		{
			return K;
		}
	}
}   or */ 

class BiggestString
{	
	static String findBiggestString(String S,String K)
	{
		int maxlen=Integer.max(S.length(),K.length());
		if(S.length()==maxlen)
		{
		return S;
		}
		else
		{
		return K;
		}
	}

}
//saved  local changes done
//changes done remotely
