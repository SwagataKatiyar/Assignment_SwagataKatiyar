package WrapperClass;

public class WrapperDouble {

	public static void main(String[] args) {
	
		
		
        Double val = 55.05;
        
        
      //Double to Primitive double
        double x = val.doubleValue();
        System.out.println(x);

       //Double to primitive long
        long l = val.longValue();
        System.out.println(l);
  
       //Double to primitive Byte
        byte b = val.byteValue();
        System.out.println(b);
        
        //Double to primitive int
        int i = val.intValue();
        System.out.println(i);
        
        
        //Double to primitive short
        short s = val.shortValue();
        System.out.println(s);
        
        //Double to primitive short
        float f = val.floatValue();
        System.out.println(f);
        
        
        
        //double to Double
        
        double d= 8;
        Double D= Double.valueOf(d);
        System.out.println(D);
        
        
        //double to Integer
        
        int in=(int) d;
        Integer I= Integer.valueOf(in);
        System.out.println(I);
        
        
       //double to Short
        
        short st=(short) d;
        Short S= Short.valueOf(st);
        System.out.println(S);
        
       //double to Long
        
        long ln=(long) d;
        Long L= Long.valueOf(ln);
        System.out.println(L);
        
        
       //double to Byte
        
        byte bs=(byte) d;
        Byte B= Byte.valueOf(bs);
        System.out.println(B);

        
        
        
        
        
        
        
        

   
  
       
	}

}
