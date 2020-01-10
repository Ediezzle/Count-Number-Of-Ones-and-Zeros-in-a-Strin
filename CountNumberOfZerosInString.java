 class CountNumberOfZerosInString
    {
		static String NumberOfZerosUsingCounter(String s)
		{
			int countForZero = 0;
			int countForOne = 0;
			for(int i=0; i<s.length(); i++)
			{
				if(s.charAt(i)=='0')
					countForZero++;

				else
					countForOne++;
			}
			return "The string " + s + " has" + " " + countForZero + " zeros" + " and"
				+ " " + countForOne + " ones";
		}

        public static void main(String[] args)
        {
            String str = "011001110";
            System.out.printf(NumberOfZerosUsingCounter(str) + "\n");

        }
	}