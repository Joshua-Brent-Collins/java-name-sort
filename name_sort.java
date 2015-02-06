//Joshua Brent Collins 4/5/2013
package nspack;

import java.io.*;
import java.util.*;

public class name_sort {
public String[] names;
public String[] lnames;
public int lcount = 1;
public int index = 0;
public String hold = null;
public File dfile;
	
public void read_file(String filename){	
try{
 dfile = new File(filename);	
	
BufferedReader freader = new BufferedReader(new FileReader(dfile)); 
hold = freader.readLine();
while((hold = freader.readLine())!=null){
lcount++;	
}
names = new String[lcount];
lnames = new String[lcount];
freader.close();
freader = new BufferedReader(new FileReader(dfile)); 
while((hold = freader.readLine())!=null){
	names[index]=hold.split("\\s+")[0];
	lnames[index]=hold.split("\\s+")[1];

	index++;
}
freader.close();
} catch(Exception e){
	e.printStackTrace();	
}
}	

public void sort(){
for(int out= 0; out<names.length;out++){
	for(int ins=0;ins<names.length;ins++){
		if(lnames[out].compareToIgnoreCase(lnames[ins])<0){
			hold = lnames[out];
			lnames[out]=lnames[ins];
			lnames[ins]=hold;
			hold = names[out];
			names[out]=names[ins];
			names[ins]=hold;
			
		}
	}
	
	
}
	
}

public void wirte_to_file_screen(String ftwrite){
try{
dfile = new File(ftwrite);	
BufferedWriter fwriter = new BufferedWriter(new FileWriter(ftwrite));
for(int id = 0; id< names.length;id++){
System.out.println(String.format("%-19s %1s",names[id],lnames[id]));
fwriter.write(String.format("%-19s %1s",names[id],lnames[id])+"\n");
}
fwriter.close();
} catch(Exception e){
	e.printStackTrace();	
}
}

}
