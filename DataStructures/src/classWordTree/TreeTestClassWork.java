package classWordTree;

public class TreeTestClassWork {

	public static void main(String[] args) {
		@SuppressWarnings("unchecked")
		TreeClassWork<Integer> myTree = new TreeClassWork<Integer>(10, new TreeClassWork<Integer>(11,
				new TreeClassWork<Integer>(112), new TreeClassWork<Integer>(113),
				new TreeClassWork<Integer>(114)), new TreeClassWork<Integer>(12),
				new TreeClassWork<Integer>(13, new TreeClassWork<Integer>(131),
						new TreeClassWork<Integer>(132)), new TreeClassWork<Integer>(14));

		myTree.print();

	}

}
