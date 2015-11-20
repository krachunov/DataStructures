package homeWork4;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import classWordTree.TreeClassWork;

public class Folder {
	private String name;
	private List<File> files;
	private List<Folder> childFolders;

	public Folder(String name) {
		setName(name);
		setFiles(new ArrayList<File>());
		setChildFolders(new ArrayList<Folder>());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}

	public List<Folder> getChildFolders() {
		return childFolders;
	}

	public void setChildFolders(List<Folder> childFolders) {
		this.childFolders = childFolders;
	}

	public boolean isDirectory() {
		File file = new File(getName());
		return file.isDirectory();
	}


	/**
	 * working with loop
	 * @param path
	 *            - start dir
	 */
	public void traversAllFileAndFolder(Folder path) {
		File start = new File(path.getName());
		Queue<File> queue = new LinkedList<File>();

		do {
			File[] fileAndDir = start.listFiles();
			if (fileAndDir != null) {
				for (File file : fileAndDir) {
					if (file.isDirectory()) {
						Folder subFolder = new Folder(file.getName());
						// System.out.println(subFolder.getName());
						getChildFolders().add(subFolder);
						queue.add(file);
					} else if (file.isFile()) {
						File subFile = new File(file.getName());
						// System.out.println(subFile.getName());
						getFiles().add(subFile);

					}
				}
			}
			start = queue.poll();

		} while (queue.size() > 0);
	}

	/**
	 * recursive method
	 * 
	 * @param path
	 */
	public void traversRecursiveAllFileAndFolder(Folder path) {
		File start = new File(path.getName());

		File[] fileAndDir = start.listFiles();
		if (fileAndDir != null) {
			for (File file : fileAndDir) {
				if (file.isDirectory()) {
					Folder subFolder = new Folder(file.getAbsolutePath());
					getChildFolders().add(subFolder);
//					System.out.println(subFolder.getName());
					traversRecursiveAllFileAndFolder(subFolder);
				} else if (file.isFile()) {
					File subFile = new File(file.getName());
					getFiles().add(subFile);
//					System.out.println(subFile.getName());

				}
			}
		}

	}

	public long folderSize() {
		long size = 0;
		File file = new File(this.getName());

		for (File singleFile : file.listFiles()) {
			if (!singleFile.isDirectory()) {
				size+=singleFile.length();
			} else {
				
			}
		}
		return size;
	}
	
	private double sumAllSubFiles(Folder startFolder) {
		File file = new File(startFolder.getName());
		File[] list = file.listFiles();
		long folderSize = 0;
		for (File singleFile : list) {
			folderSize += singleFile.length();
		}
		return folderSize*Math.pow(10,-6 );
	}

	/**
	 * 
	 * @return - file size in megabytes from folder
	 */
	public double sumAllSubFiles() {
		return sumAllSubFiles(this);
	}

	private void printTree(int indent) {
		char[] space = new char[indent];
		Arrays.fill(space, ' ');
		System.out.print(new String(space));
		System.out.println(this.getName());
		for (Folder child : getChildFolders()) {
			child.printTree(indent + 1);
		}
	}

	public void print() {
		printTree(0);
	}

}
