package test;

public class ListCreator {

	private boolean sortDescending;
	
	private TableWriter writer;
	
	public ListCreator(TableWriter writer, boolean sortDescending) {
		this.sortDescending = sortDescending;
		this.writer = writer;
	}
}