public class Main {
  public static void main(String[] args) {
    int prices[] = {7,1,5,3,6,4};
    
    maxProf(prices);
}
public static int maxProf(int prices[]){
int maxProfit = 0;
for(int i = 0; i<prices.length - 1; i++){
  for(int j = i + 1; j<prices.length; j++){
    int profit = prices[j] - prices[i];
    if(profit>maxProfit)
      maxProfit = profit;
      }
}
return maxProfit;
}
}
