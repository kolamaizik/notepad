package by.training.epam.maizik;

/**
 * 
 * public class Notepad.
 * <p>Notepad.</p>
 */
public class Notepad {
	private RecordNotepad arrRec[]=new RecordNotepad[50];

	/**
	 * public void addRecord(int index, RecordNotepad value)
	 * @param index - array index
	 * @param value - records value
	 * 
	 * <p>Add record in notepad</p>
	 */
	public void addRecord(int index, RecordNotepad value){
		try {
			//if (index < arrRec.length)
			arrRec[index] = value;
		}
	    catch (ArrayIndexOutOfBoundsException e) {
	    	System.out.println("Array is out of Bounds" + e);
	    }		
	}
	
	/**
	 * public void editRecord(int index, RecordNotepad value)
	 * @param index - array index 
	 * @param value - records value
	 * 
	 * <p>Edit record in notepad</p>
	 */
	public void editRecord(int index, RecordNotepad value){
		try {
		//if (index < arrRec.length)
			arrRec[index] = value;
		}
	    catch (ArrayIndexOutOfBoundsException e) {
	    	System.out.println("Array is out of Bounds" + e);
	    }
	}
	
	/**
	 * public void delRecord(int index)
	 * @param index - array index
	 * 
	 * <p>Delete record in notepad</p>
	 */
	public void delRecord(int index){
		try {
		//if (index < arrRec.length)
			arrRec[index] = null;
		}
	    catch (ArrayIndexOutOfBoundsException e) {
	    	System.out.println("Array is out of Bounds" + e);
	    }
	}
	
	/**
	 * public void showRecord(int index)
	 * @param index - array index
	 * 
	 * <p>Shows record in notepad on the index</p>
	 */
	public void showRecord(int index){
		try {
			System.out.println(arrRec[index].getRec());
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is out of Bounds" + e);
		}
	}
	
	/**
	 * public void showAllRecords()
	 * 
	 * <p>Shows all records in notepad</p>
	 */
	public void showAllRecords(){
		for(int i=0; i<arrRec.length; i++){
			if (arrRec[i]!=null) {
				showRecord(i);
			}
		}
	}
}