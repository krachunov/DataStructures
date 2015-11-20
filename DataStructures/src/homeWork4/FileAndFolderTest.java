package homeWork4;

import java.util.List;

public class FileAndFolderTest {
	public static void main(String[] args) {
		String path = "C:\\Windows";

		// non-recursive
		Folder folder2 = new Folder(path);
		folder2.traversAllFileAndFolder(folder2);
		System.out
				.println("FOLDER NUMBER: " + folder2.getChildFolders().size());
		System.out.println("FOLDER NUMBER: " + folder2.getFiles().size());

		// recursive
		System.out.println("recursive");
		Folder folder = new Folder(path);
		folder.traversRecursiveAllFileAndFolder(folder);
		System.out.println("FOLDER NUMBER: " + folder.getChildFolders().size());
		System.out.println("FOLDER NUMBER: " + folder.getFiles().size());

		System.out.println("Size: " + folder.sumAllSubFiles());

	}

}
