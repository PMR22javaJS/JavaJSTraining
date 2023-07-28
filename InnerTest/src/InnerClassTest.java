class Tree{
	Nest nest=new Nest();
	class Nest{
		void layEggs() {
			System.out.println("Bird is laying the eggs.............");
		}
	}
}

class Bird{
	void activity(Tree tree) {
		tree.nest.layEggs();
	}
}

public class InnerClassTest {
	public static void main(String[] args) {
		Tree tree=new Tree();
		Bird bird=new Bird();
		bird.activity(tree);
	}
}
