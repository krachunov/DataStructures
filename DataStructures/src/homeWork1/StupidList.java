	package homeWork1;
	
	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.PrintWriter;
	
	public class StupidList<T> {
		private T[] arr = (T[]) new Object[0];
	
		public int getLength() throws IOException {
			long startTime = System.nanoTime();
			int lenght = this.arr.length;
			long endTime = System.nanoTime();
			saveStringToFile("Total Time: " + (endTime - startTime)
					+ " nanosecond to get lenght");
			return lenght;
		}
	
		public int getLength2() {
			return this.arr.length;
		}
	
		public T getIndex(int index) throws IOException {
			long startTime = System.nanoTime();
			T element = this.arr[index];
			long endTime = System.nanoTime();
			saveStringToFile("Total Time: " + (endTime - startTime)
					+ " nanosecond to get element in to " + index + " position");
			return element;
		}
	
		public T getFirst() throws IOException {
			return getIndex(0);
		}
	
		public T getLast() throws IOException {
			return getIndex(arr.length - 1);
		}
	
		public void Add(T item) throws IOException {
			long startTime = System.nanoTime();
	
			T[] newArr = (T[]) new Object[this.arr.length + 1];
			System.arraycopy(arr, 0, newArr, 0, this.arr.length);
			newArr[newArr.length - 1] = item;
			this.arr = newArr;
	
			long endTime = System.nanoTime();
			saveStringToFile("Total Time: " + (endTime - startTime)
					+ " nanosecond to add element in to " + (newArr.length - 1)
					+ " position");
	
		}
	
		public T Remove(int index) throws IOException {
			long startTime = System.nanoTime();
			T result = this.arr[index];
			T[] newArr = (T[]) new Object[this.arr.length - 1];
			System.arraycopy(this.arr, 0, newArr, 0, index);
			System.arraycopy(this.arr, index + 1, newArr, index, this.arr.length
					- index - 1);
			this.arr = newArr;
			long endTime = System.nanoTime();
			System.out.println("Total Time: " + (endTime - startTime)
					+ " nanosecond to remove ");
	
			saveStringToFile("Total Time: " + (endTime - startTime)
					+ " nanosecond to remove " + index + " element");
			return result;
		}
	
		public T RemoveFirst() throws IOException {
			return this.Remove(0);
		}
	
		public T RemoveLast() throws IOException {
			return this.Remove(this.arr.length - 1);
		}
	
		public void saveStringToFile(String element) throws IOException {
			StringBuilder sb = new StringBuilder();
			sb.append(element);
	
			File file = new File("c:\\result.txt");
			FileWriter fileWriter = new FileWriter(file, true);
			fileWriter.write("\r\n");
			try {
				fileWriter.write(sb.toString());
	
			} finally {
				if (fileWriter != null)
					fileWriter.close();
			}
		}
	
	}
