class Solution {

    char[] cs;
    int i = 0;

    public TreeNode recoverFromPreorder(String traversal) {

        // Given the output traversal
        cs = traversal.toCharArray();

        // recover the tree
        var root = new TreeNode(readValue());
        // The depth of the root node is 0.
        var depth = 0;

        var stack = new Stack<TreeNode>();
        stack.push(root);

        // At each node in this traversal,
        while (i < cs.length) {

            // we output D dashes
            // (where D is the depth of this node),
            var nextDepth = countDashes();
            // then we output the value of this node
            var nextNode = new TreeNode(readValue());

            // If the depth of a node is D, the depth of its immediate child is D + 1
            while (nextDepth <= depth) {
                stack.pop();
                depth --;
            }

            var node = stack.peek();

            // If a node has only one child, that child is guaranteed to be the left child.
            if (node.left == null)
                node.left = nextNode;
            else
                node.right = nextNode;

            depth ++;
            stack.push(nextNode);

        }

        // return its root.
        return root;

    }

    int readValue() {
        var builder = new StringBuilder();
        while (i < cs.length && cs[i] >= '0' && cs[i] <= '9')
            builder.append(cs[i++]);
        return Integer.parseInt(builder.toString());
    }

    int countDashes() {
        var x = i;
        while (cs[i] == '-')
            i++;
        return i - x;
    }

}