class Main {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        float profitPercentage = (profit/costPrice)*100;
        System.out.Println("The Cost Price is INR"+costPrice+" and Selling Price is INR"+sellingPrice);
        System.out.println("The Profit is INR"+profit+" and the Profit Percentage is"+profitPercentage);
    }
}