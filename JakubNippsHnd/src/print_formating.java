
public class print_formating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/* 
		%a	floating point (except BigDecimal)	Hex output of floating point number
		%b	Any type	“true” if non-null, “false” if null
		%c	character	Unicode character
		%d	integer (incl. byte, short, int, long, bigint)	Decimal Integer
		%e	floating point	decimal number in scientific notation
		%f	floating point	decimal number
		%g	floating point	decimal number, possibly in scientific notation depending on the precision and value.
		%h	any type	Hex String of value from hashCode() method.
		%n	none	Platform-specific line separator.
		%o	integer (incl. byte, short, int, long, bigint)	Octal number
		%s	any type	String value
		%t	Date/Time (incl. long, Calendar, Date and TemporalAccessor)	%t is the prefix for Date/Time conversions. More formatting flags are needed after this. See Date/Time conversion below.
		%x	integer (incl. byte, short, int, long, bigint)	
		Hex string.
		*/
		
		
		System.out.printf("%h%n",454.3); // prints encoded value 
		
		
		// Precision formating
		System.out.printf("%.2f%n",15.2314); // .number chooses how many numers after decimal point . its called precision here
		
		// Width Formating
		System.out.printf("%10s%n","Jakub"); // It creates number of blank spaces
		
		
	}

}
