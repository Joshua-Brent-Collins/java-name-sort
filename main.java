package nspack;

public class main {

	
	public static void main(String[] args) {
		name_sort ns  = new name_sort(); 
		ns.read_file("unsortednames.txt");
		ns.sort();
		ns.wirte_to_file_screen("sortednames.txt");
	}

}
