
/**
 * @author Anne Marie Docherty
 */
    import java.io.File;
    import java.io.FileNotFoundException;   //import appropriate in-built java packages / classes
    import java.io.PrintWriter;
    import java.util.Scanner;

public class Java_tenis_game { 
	
	public static PrintWriter out;
	public static File fileName;    //declare global variables i.e. the PrintWriter, File and scanner can be used
              public static Scanner sc;       // (or seen) by any method in the class StringSplitExample 
	
	public static void main(String[] args) throws FileNotFoundException {    // As we are going to be reading in from a file, 
                                                                                                                                                // in case the file is not found we must
                                                                                                                                               // make use of the java FileNotFoundException 
                                                                                                                                               // class
		readFile();      //call method readFile from main method 
	}	
public static void readFile() throws FileNotFoundException   //this method will be used to read in the data contained in the file 'names'
{	
	String nameOfFile = "src/names.csv";  // declare and assign the file (i.e. location and name of file) to variable nameOfFile
	fileName = new File(nameOfFile);       // create file object and pass the name of the file (assigned to variable nameOfFile) to file object
	sc = new Scanner(fileName);             // create scanner object and pass the file object to the scanner object
	
	int max = 0;
               String title = null;      //declare and initialise the variables that will be used to hold values read in from the file
	String forename = null;
	String surname= null;
		
	while(sc.hasNext()){     // use a while loop which will loop as long as there are values to be read
            
		String allWords = sc.next();       // assign every word read (including commas) from the file to variable allWords                      
                            System.out.println(allWords);   // I have added in a print to console just so you can see what has been assigned
                                                                                     // to the variable allWords
			
		String[] Words = allWords.split (",");     //Use the Split method on the String allWords to split the string at each comma and
                                                                                                 // assign each word into a String Array i.e. each individual word will now be one element of the array
                                                      
                                                             
		int[] age = new int[Words.length];   // in order to access and assign the String element that contains the age we have to set
                                                                                             // up an array of Integer objects(i.e. use new keyword)so we can use the Words.Length java method
                                                                                             // this method can only be used for an Integer object and not a primitive int value
		                                                                                               
		for(int i=3; i< Words.length; i=i+4){   // we can now use a for loop to loop around the array Words[] in order to find and store the value found.
                                                                                              // This is done until the end of the Words [] Array i.e. Words.length is reached.
                                                                                              // Note how we have started / initialised i at 3 i.e. i=3 - this is because the initial element we need to find 
                                                                                             // will be at index 3, remember the index of an array starts at 0. The first four values of the array are (read from file)
                                                                                             // String [] Words = {Miss, Jane, Morrison, 45} meaning the first element we need to find is at index 3.
                                                                                             // in order to access the next element that contains the age we need to add 4 to the i (counter)i=i+4.
                                                                                              
	        age[i]= Integer.parseInt(Words[i]);     //Because the original value found is still a string we have to parse or convert this to an Integer
                                                                                        // value in order to find the maximum. First value found is assigned to age.
                                                            			 
			if(age[i]>max){     // we now use an if statement to check the value contained in age in order to find the max value.
                            
				max = age[i];    // value contained in age is assigned to variable max
                                
                                                         title = Words[i-3];     // in order to assign the value needed for title we need to move back through the elements in the Array Words 
                                                                                             // i.e. String [] Words = {Miss, Jane, Morrison, 45} we need to move back by 3 elements from the age to find 
                                                                                             // the title i.e Miss
                                                    
				forename = Words[i-2];   // we need to move back by two elements to find firstName
                                
				surname = Words[i-1];    // we need to move back by one element to find surname
                                
			}
		}
		}
		output(max, title, surname, forename);    // pass the values contained in max, title, surname and forename to another method 
                                                                                                         // output () in order to create / print out file	
}	
public static void output(int max,String title,String surname,String forename) {    //note no FileNotFoundException as we are going to use a try/catch block
		         
	
	try{         //use a try/catch block for any possible errors i.e. to test this change the name of the output file to "" and see what happens
            
		out = new PrintWriter("src/OldestPerson.txt");     //create new PrintWriter object and name the location and name of file to be printed
                
		out.print("The oldest person is:  " + title + " " + forename + " " + surname + " who is "+ max);     // tell the PrintWriter Object what
                                                                                                                                                                                                          // what is to be printed in the output file
                                                                                                                 
		System.out.println("The oldest person is:  " + title + " " + forename + " " + surname + " who is " + max);     // output to console 
                
		out.close();    //close PrinterWriter
	}	
	catch (Exception e)    //generic catch block for any errors encountered when trying to print file
	{
		System.out.println("Unexpected error: Please run the program again.");    // output message to the console if error occurs
	}
}
}
