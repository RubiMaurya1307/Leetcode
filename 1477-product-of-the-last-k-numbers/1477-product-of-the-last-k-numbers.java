// Asked in Meta, Google, Amazon, Apple, TikTok
class ProductOfNumbers {
    // Stores the prefix product of numbers
    List<Integer> prefix;

    public ProductOfNumbers() {
        prefix = new ArrayList<>();
    }

    // Adds a number to the sequence
    // Time Complexity: O(1)
    public void add(int num) {
        if (num == 0) { 
            // Reset the prefix product list when encountering zero
            // Since any product involving zero is zero, we need to discard previous values
            prefix = new ArrayList<>();
        } else if (prefix.size() == 0) {  
            // If it's the first number, simply add it
            prefix.add(num);
        } else {
            // Store the cumulative product
            prefix.add(num * prefix.get(prefix.size() - 1));
        }
    }

    // Returns the product of the last k numbers
    // Time Complexity: O(1)
    public int getProduct(int k) {
        int n = prefix.size();
        if (k > n) return 0;  // If k is larger than available numbers, return 0
        if (k == n) return prefix.get(n - 1);  // If k equals the size, return the last product

        // Otherwise, use the prefix array to compute the product in constant time
        return prefix.get(n - 1) / prefix.get(n - 1 - k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */