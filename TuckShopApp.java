	 /*
		This project had to be group thing but my group wasn't interactive then I decided to do it on my own.
		And then I programmed the following code, it took less than 3 weeks only.
	 */
	 
import java.util.Scanner;
import java.text.DecimalFormat;
 
public class TuckShopApp
{
	public static void main(String[] args)
	{
		// Parallel Arrays holds Items holderName, average itemsQuantity and average itemPrices
		String[] itemNames = {"SandWiches","Noodles","Snacks","Beverages","Popcorns","Candy"};
		int[] itemsQuantity = {25,15,30,30,20,20};
		double[] itemPrices = {24.50,14.00,18.00,13.00,21.00,15.50};
		
		// Fixed Items Count
		final int SANDW1N2 = 8, SANDW3 = 9, NOODLE123 = 5, BEVE123 = 10, SNACK12 = 15, POPCO12 = 10, CAND12 = 10;
		
		// Objects
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R0.00");
		
		// Declare variables
		String managerName, itemName, cashierName, selectedItems ="", totalSelectedItems ="", item ="";
		String favouriteSandw, favouriteNoodles, favouriteSnack, favouriteBeverage, favouriteCandy, favouritePopcorn;
		int cashierAnswer, itemQuant, payOrContinue, userOption, sandWichOption, noodlesOption, snacksOption, beveragesOption, popCornOption, candyOption;
		int countSandwiches = 0,countNoodles = 0, countSnacks = 0, countBeverages = 0, countPopcorns = 0, countCandy = 0;
		int cntGranolBar = 0, cntfruitCups = 0, dayCustomers = 0, cntWater = 0, cntEnergyDrink = 0, cntSoftDrinks = 0, cntChicSalad = 0, cntHam = 0, cntVeggie = 0, cntInstRamen = 0, cntUdon = 0, cntSoba = 0, cntGummy = 0, cntChocBar = 0, cntBagChips = 0, cntPopc = 0;
		double itemPrice, totalSelectedItemsAmount = 0, priceSand = 0, priceNod = 0, priceSnack = 0, priceBev = 0, pricePop = 0, priceCandy = 0, selectedItemsAmount = 0, amount, change;
		boolean isItValid;
		
		// Prompt managers for his/ her name
		System.out.print("\nName of the tuck shop manager : ");
		managerName = sc.next();
		
		// Cashier to the enter his/her name, working at the till
		System.out.print("\nEnter your name(Cashier): ");
		cashierName = sc.next();
			
		// Cashier check if there is a customer
		cashierAnswer = checkCustomer(sc);
		
	   while(cashierAnswer != 3)
	   {
	     if(cashierAnswer == 1)
	     {	
			// Prompt the customer
			System.out.println("\n\n\tWelcome to Old Lady Tuckshop!, Grab a bite, fuel up, and enjoy your day.");
			userOption = displayMenu(cashierName, sc);
			
			// Iterate for as long customer want to buy			
			while(userOption != 7)
			{
				switch(userOption)
				{
					case 1:
						countSandwiches = countItems(countSandwiches);
						
						if(countSandwiches <= itemsQuantity[0]) // Count the sandwiches orders
						{
							// Display Options
							sandWichOption = displaySandWiches(sc);
						
							if((sandWichOption >= 1) && (sandWichOption <=3))
							{						
								//Calculate
								switch(sandWichOption)
								{
									case 1:
									
									priceSand = 30.00;
									item = "Chicken Salad\t\tR"+priceSand;								
									// Count
									cntChicSalad = countItems(cntChicSalad);
									
									// Check availability 
									isItValid = checkItemQuantity(cntChicSalad, SANDW1N2);
									
									if(!isItValid)
									{
										priceSand = 0.0;
										item ="";
									}
									
									break;
									
									case 2:
								
									priceSand = 25.00;
									item = "Classic Ham and Cheese\tR"+priceSand;
									// Count
									cntHam = countItems(cntHam);
									
									// Check availability 
									isItValid = checkItemQuantity(cntHam, SANDW1N2);
									
									if(!isItValid)
									{
										priceSand = 0.0;
										item ="";
									}
									break;
									
									case 3:
								
									priceSand = 20.00;
									item = "Veggie delight\t\tR"+priceSand;
									// Count
									cntVeggie = countItems(cntVeggie);
									
									// Check availability 
									isItValid = checkItemQuantity(cntVeggie, SANDW3);
									
									if(!isItValid)
									{
										priceSand = 0.0;
										item ="";
									}
									break;
								}
							  
							  selectedItems = item;
							  selectedItemsAmount = priceSand;
								
							} else{
								do{
									System.out.println("\nWe only have 3 Sandwich options.\n");
									sandWichOption = displaySandWiches(sc);
									
									// Comfirm validity								
									switch(sandWichOption)
									{
									  case 1:
										
										priceSand = 30.00;
										item = "Chicken Salad\t\tR"+priceSand;								
										// Count
										cntChicSalad = countItems(cntChicSalad);
										
										// Check availability 
										isItValid = checkItemQuantity(cntChicSalad, SANDW1N2);
										
										if(!isItValid)
										{
											priceSand = 0.0;
											item ="";
										}
										
										break;
										
									  case 2:
									
										priceSand = 25.00;
										item = "Classic Ham and Cheese\tR"+priceSand;
										// Count
										cntHam = countItems(cntHam);
										
										// Check availability 
										isItValid = checkItemQuantity(cntHam, SANDW1N2);
										
										if(!isItValid)
										{
											priceSand = 0.0;
											item ="";
										}
										break;
										
									  case 3:
									
										priceSand = 20.00;
										item = "Veggie delight\t\tR"+priceSand;
										// Count
										cntVeggie = countItems(cntVeggie);
										
										// Check availability 
										isItValid = checkItemQuantity(cntVeggie, SANDW3);
										
										if(!isItValid)
										{
											priceSand = 0.0;
											item ="";
										}
										break;
									}
								
								}
								while(!((sandWichOption >= 1) && (sandWichOption <= 3)));
								
								// Store valid items
								selectedItems = item;
								selectedItemsAmount = priceSand;
							}
						} else{
							System.out.println("\nOut of stock for sandwiches!!.");
						}
						break;
						
					case 2:
					
					 // Count
					 countNoodles = countItems(countNoodles);
					  
					 if(countNoodles <= itemsQuantity[1]) // Noodles Count orders
					 {
					  // Display Options
					  noodlesOption = displayNoodles(sc);
						
						if((noodlesOption >= 1) && (noodlesOption <=3))
						{
						   //Calculate
						   switch(noodlesOption)
						   {
							 case 1:
							
								priceNod = 12.50;
								item = "Instant Romen\t\tR"+priceNod;
								// Count
								cntInstRamen = countItems(cntInstRamen);
								
								// Check availability 
									isItValid = checkItemQuantity(cntInstRamen, NOODLE123);
									
									if(!isItValid)
									{
										priceNod = 0.0;
										item ="";
									}
									
								break;
								
							 case 2:
							
								priceNod = 15.50;
								item = "Udon Noodles\t\tR"+priceNod;
								// Count
								cntUdon = countItems(cntUdon);
								
								// Check availability 
									isItValid = checkItemQuantity(cntUdon, NOODLE123);
									
									if(!isItValid)
									{
										priceNod = 0.0;
										item ="";
									}
									
								break;
								
							 case 3:
							
								priceNod = 15.50;
								item = "Soba Noodles\t\tR"+priceNod;
								// Count
								cntSoba = countItems(cntSoba);
								
								// Check availability 
									isItValid = checkItemQuantity(cntSoba, NOODLE123);
									
									if(!isItValid)
									{
										priceNod = 0.0;
										item ="";
									}
									
								break;
							}
						  
						  selectedItems = item;
						  selectedItemsAmount = priceNod;
						  
						} else{						
							do{
								System.out.println("\nWe only have 3 Noodles options.");					
								noodlesOption = displayNoodles(sc);
								
								// Cofirm validity							
								switch(noodlesOption)
								{
								 case 1:
								
									priceNod = 12.50;
									item = "Instant Romen\t\tR"+priceNod;
									// Count
									cntInstRamen = countItems(cntInstRamen);
									
									// Check availability 
									isItValid = checkItemQuantity(cntInstRamen, NOODLE123);
									
										if(!isItValid)
										{
											priceNod = 0.0;
											item ="";
										}
									
									break;
									
								 case 2:
								
									priceNod = 15.50;
									item = "Udon Noodles\t\tR"+priceNod;
									// Count
									cntUdon = countItems(cntUdon);
									
									// Check availability 
									isItValid = checkItemQuantity(cntUdon, NOODLE123);
									
										if(!isItValid)
										{
											priceNod = 0.0;
											item ="";
										}
									
									break;
									
								 case 3:
								
									priceNod = 15.50;
									item = "Soba Noodles\t\tR"+priceNod;
									// Count
									cntSoba = countItems(cntSoba);
									
									// Check availability 
									isItValid = checkItemQuantity(cntSoba, NOODLE123);
									
										if(!isItValid)
										{
											priceNod = 0.0;
											item ="";
										}
									
									break;
								}
							
							}while(!((noodlesOption >= 1) && (noodlesOption <=3)));
							
							// Update
							selectedItems = item;
							selectedItemsAmount = priceNod;
						 }
						} else{
							System.out.println("\nOut of stock for Noodles!!.");
						}						
						break;
						
					case 3:
					
					  // Count
					  countSnacks = countItems(countSnacks);
						
					  if(countSnacks <= itemsQuantity[2]) // Count Snacks orders
					  {
						// Display Options
						snacksOption = displaySnacks(sc);
						
						if((snacksOption >= 1) && (snacksOption <=2))
						{
							//Calculate
							switch(snacksOption)
							{
							   case 1:
								
								priceSnack = 15.00;
								item = "Granola Bar\t\tR"+priceSnack;
								// Count
								cntGranolBar = countItems(cntGranolBar);
								
								// Check availability 
								isItValid = checkItemQuantity(cntGranolBar, SNACK12);
								
									if(!isItValid)
									{
										priceSnack = 0.0;
										item ="";
									}								
								break;
								
							   case 2:
							   
								priceSnack = 20.00;
								item = "Fruit Cups\t\tR"+priceSnack;
								// Count
								cntfruitCups = countItems(cntfruitCups);
								
								// Check availability 
								isItValid = checkItemQuantity(cntfruitCups, SNACK12);
								
									if(!isItValid)
									{
										priceSnack = 0.0;
										item ="";
									}
								break;
							 }
							 
						  selectedItems = item;
						  selectedItemsAmount = priceSnack;
						} else{
							do{
								System.out.println("\nWe only have 2 Snacks options.");
								snacksOption = displaySnacks(sc);
								
								// Comfirm validity								
								switch(snacksOption)
								{
								   case 1:
									
									priceSnack = 15.00;
									item = "Granola Bar\t\tR"+priceSnack;
									// Count
									cntGranolBar = countItems(cntGranolBar);
									
									// Check availability 
									isItValid = checkItemQuantity(cntGranolBar, SNACK12);
									
										if(!isItValid)
										{
											priceSnack = 0.0;
											item ="";
										}
									break;
									
								   case 2:
								   
									priceSnack = 20.00;
									item = "Fruit Cups\t\tR"+priceSnack;
									// Count
									cntfruitCups = countItems(cntfruitCups);
									
									// Check availability 
									isItValid = checkItemQuantity(cntfruitCups, SNACK12);
									
										if(!isItValid)
										{
											priceSnack = 0.0;
											item ="";
										}
									break;
								 }
							 
							}while(!((snacksOption >= 1) && (snacksOption <=2)));
							
							// Update
							selectedItems = item;
							selectedItemsAmount = priceSnack;
						 }
						 
					  } else{
							System.out.println("\nOut of stock for Snacks!!.");
						}						
						break;
						
					case 4:
					
					  // Count
					  countBeverages = countItems(countBeverages);
						 
					  if(countBeverages <= itemsQuantity[3]) // Count Beverages orders
					  {
						 // Display Options
						 beveragesOption = displayBevarages(sc);
						
						 if((beveragesOption >= 1) && (beveragesOption <=3))
						 {
							//Calculate
							switch(beveragesOption)
							{
							  case 1:
							  
								priceBev = 10.00;
								item = "Water\t\t\tR"+priceBev;
								// Count
								cntWater = countItems(cntWater);								
								
								// Check availability 
								isItValid = checkItemQuantity(cntWater, BEVE123);
								
									if(!isItValid)
									{
										priceBev = 0.0;
										item ="";
									}	
								break;
								
							  case 2:
							  
								priceBev = 13.00;
								item = "Energy Drink\t\tR"+priceBev;
								// Count
								cntEnergyDrink = countItems(cntEnergyDrink);
								
								// Check availability 
								isItValid = checkItemQuantity(cntEnergyDrink, BEVE123);
								
									if(!isItValid)
									{
										priceBev = 0.0;
										item ="";
									}	
								break;
								
							  case 3:
							  
								priceBev = 15.00;
								item = "Soft Drink\t\tR"+priceBev;
								// Count
								cntSoftDrinks = countItems(cntSoftDrinks);
								
								// Check availability 
								isItValid = checkItemQuantity(cntSoftDrinks, BEVE123);
								
									if(!isItValid)
									{
										priceBev = 0.0;
										item ="";
									}
								break;								
							}
						  
						  selectedItems = item;
						  selectedItemsAmount = priceBev;
						  
						 } else{
							do{
								System.out.println("\nWe only have 3 Beverage options.");
								beveragesOption = displayBevarages(sc);
								
								// Comfirm validity							
								switch(beveragesOption)
								{
								  case 1:
								  
									priceBev = 10.00;
									item = "Water\t\tR"+priceBev;
									// Count
									cntWater = countItems(cntWater);
									
									// Check availability 
									isItValid = checkItemQuantity(cntWater, BEVE123);
									
										if(!isItValid)
										{
											priceBev = 0.0;
											item ="";
										}
									break;
									
								  case 2:
								  
									priceBev = 13.00;
									item = "Energy Drink\t\tR"+priceBev;
									// Count
									cntEnergyDrink = countItems(cntEnergyDrink);
									
									// Check availability 
									isItValid = checkItemQuantity(cntEnergyDrink, BEVE123);
									
										if(!isItValid)
										{
											priceBev = 0.0;
											item ="";
										}
									break;
									
								  case 3:
								  
									priceBev = 15.00;
									item = "Soft Drink\t\tR"+priceBev;
									// Count
									cntSoftDrinks = countItems(cntSoftDrinks);
									
									// Check availability 
									isItValid = checkItemQuantity(cntSoftDrinks, BEVE123);
									
										if(!isItValid)
										{
											priceBev = 0.0;
											item ="";
										}
									break;								
								}
								
							}while(!((beveragesOption >= 1) && (beveragesOption <=3)));
							
							// Update
							selectedItems = item;
							selectedItemsAmount = priceBev;						
						 }
					    
					  } else{
							System.out.println("\nOut of stock for Beverages!!.");
						}
						break;
						
					case 5:				
					
					  // Count
					  countPopcorns = countItems(countPopcorns);
					  
					  if(countPopcorns <= itemsQuantity[4]) // Count popcorn orders
					  {
						// Display Options
						popCornOption = displayPopcorns(sc);
						
						if((popCornOption >= 1) && (popCornOption <=2))
						{
							//Calculate
							switch(popCornOption)
							{
							   case 1:
							   
								pricePop = 20.00;
								item = "Bag of Chips\t\tR"+pricePop;
								// Count
								cntBagChips = countItems(cntBagChips);								
								
								// Check availability 
								isItValid = checkItemQuantity(cntBagChips, POPCO12);
								
									if(!isItValid)
									{
										pricePop = 0.0;
										item ="";
									}
								break;
								
							    case 2:
							 
								pricePop = 22.00;
								item = "Popcorn\t\t\tR"+pricePop;
								// Count
								cntPopc = countItems(cntPopc);
								
								// Check availability 
								isItValid = checkItemQuantity(cntPopc, POPCO12);
								
									if(!isItValid)
									{
										pricePop = 0.0;
										item ="";
									}
								break;								
							 }
							 
						  selectedItems = item;
						  selectedItemsAmount = pricePop;
						  
						} else{
							do{
								System.out.println("\nWe only have 2 Popcorns options.");
								popCornOption = displayPopcorns(sc);
								
								// Comfirm validity								
								switch(popCornOption)
								{
								   case 1:
								   
									pricePop = 20.00;
									item = "Bag of Chips\t\tR"+pricePop;
									// Count
									cntBagChips = countItems(cntBagChips);
									
									// Check availability 
									isItValid = checkItemQuantity(cntPopc, POPCO12);
									
										if(!isItValid)
										{
											pricePop = 0.0;
											item ="";
										}
									break;
									
									case 2:
								 
									pricePop = 22.00;
									item = "Popcorn\t\t\tR"+pricePop;
									// Count
									cntPopc = countItems(cntPopc);
									
									// Check availability 
									isItValid = checkItemQuantity(cntPopc, POPCO12);
									
										if(!isItValid)
										{
											pricePop = 0.0;
											item ="";
										}
									break;								
								}
								
							}while(!((popCornOption >= 1) && (popCornOption <=2)));
							
							//Update
							selectedItems = item;
							selectedItemsAmount = pricePop;
						}
							
					  } else{
							System.out.println("\nOut of stock for Popcorns!!.");
						}
						
						break;
						
					case 6:
					
					  // Count
					  countCandy = countItems(countCandy);
					  
					  if(countCandy <= itemsQuantity[5]) // Count candy orders
					  {
						// Display Options
						candyOption = displayCandySweets(sc);
						
						if((candyOption >= 1) && (candyOption <=2))
						{
							//Calculate
							switch(candyOption)
							{
							   case 1:
							   
								priceCandy = 15.00;
								item = "Chocolate Bar\t\tR"+priceCandy;
								// Count
								cntChocBar = countItems(cntChocBar);								
								
								// Check availability 
								isItValid = checkItemQuantity(cntChocBar, CAND12);
								
									if(!isItValid)
									{
										priceCandy = 0.0;
										item ="";
									}
								break;
								
							   case 2:
							 
								priceCandy = 16.00;
								item = "Gummy Packs\t\tR"+priceCandy;
								// Count
								cntGummy = countItems(cntGummy);
								
								// Check availability 
								isItValid = checkItemQuantity(cntGummy, CAND12);
								
									if(!isItValid)
									{
										priceCandy = 0.0;
										item ="";
									}
								break;
							 }
							 
						  selectedItems = item;
						  selectedItemsAmount = priceCandy;
							 
						} else{
							do{
								System.out.println("\nWe only have 2 Candy options.");
								candyOption = displayCandySweets(sc);
								
								// Comfirm validity
								switch(candyOption)
								{
								   case 1:
								   
									priceCandy = 15.00;
									item = "Chocolate Bar\t\tR"+priceCandy;
									// Count
									cntChocBar = countItems(cntChocBar);
									
									// Check availability 
									isItValid = checkItemQuantity(cntChocBar, CAND12);
									
										if(!isItValid)
										{
											priceCandy = 0.0;
											item ="";
										}
									break;
									
								   case 2:
								 
									priceCandy = 16.00;
									item = "Gummy Packs\t\tR"+priceCandy;
									// Count
									cntGummy = countItems(cntGummy);
									
									// Check availability 
									isItValid = checkItemQuantity(cntGummy, CAND12);
									
										if(!isItValid)
										{
											priceCandy = 0.0;
											item ="";
										}
									break;
								}
							 
							}while(!((candyOption >= 1) && (candyOption <=2)));
							
							// Update
							selectedItems = item;
							selectedItemsAmount = priceCandy;							
						}	
					   
					  } else{
							System.out.println("\nOut of stock for Candies!!.");
						}
						
						break;
						
					default:
						System.out.println("\nOption selected is invalid, choose from [1 - 7]..PRESS 2 TO CONTINUE");
				}
				
				// Store values
				totalSelectedItemsAmount += selectedItemsAmount;
				selectedItemsAmount = 0;
				
				totalSelectedItems += "\n"+"\t\t\t\t"+ selectedItems+"\t";
				selectedItems ="";
				
				System.out.print("\nSelect one option"+"\n"+
								   "1 ==> You pay"+"\n"+
								   "2 ==> Countinue selecting items"+"\n"+
								   "Option: ");
				payOrContinue = sc.nextInt();
				
				if(payOrContinue == 1)
				{
					System.out.println("\nChoosen items costs : "+df.format(totalSelectedItemsAmount)+" VAT(15%) included");
					// Prompt for amount
					
					if(totalSelectedItemsAmount > 0) // Check if ordered items costs is valid
					{
						amount = customerAmount(sc);
						
						// Method to pay
						change = customerChange(amount, totalSelectedItemsAmount);
						
						if(change >= 0)
						{
							// Display customer receipts
							System.out.println("\nRECEIPT FOR CUSTOMER "+(dayCustomers + 1)+" OF THE DAY");
							printCustomerReceipt(totalSelectedItemsAmount, amount, change, totalSelectedItems, cashierName, managerName);
						
							System.out.println("\n\n\t\t\tFeel free to customize it further to match your tuckshop's vibe!"+"\n"+
										"\t\tGive thanks in all circumstances; for this is God's will for you in Christ Jesus."+"\n"+
										"\t\t\t\t\t1 Thessalonians 5:18");
						}else {
							System.out.println("\nOR You can pick another products that your amount can purchase, Thanks.");
						}
						break;
				  }
				  
				} else if(payOrContinue == 2)
				{				
				 // Display menu again to avoid endeless loop
				  userOption = displayMenu(cashierName, sc);
				}			
			}
			
			//Reset
			totalSelectedItemsAmount = 0;
			totalSelectedItems ="";
			
			// Count customers that came in today
			dayCustomers = countItems(dayCustomers);
	    }
		// Cashier check if there is a another customer
		cashierAnswer = checkCustomer(sc);
		
	   }
	   
	   // Get the mostly boughts
	   favouriteSandw = getFavouriteSandwiches(cntChicSalad, cntHam, cntVeggie);
	   favouriteNoodles = getFavouriteNoodles(cntInstRamen, cntUdon, cntSoba);
	   favouriteSnack = getFavouriteSnacks(cntGranolBar, cntfruitCups);
	   favouriteBeverage = getFavouriteBevarages(cntEnergyDrink, cntSoftDrinks, cntWater);
	   favouritePopcorn = getFavouritePopcorn(cntBagChips, cntPopc);
	   favouriteCandy = getFavouriteCandySweets(cntChocBar, cntGummy);
	   
	   // Display summary of the shop
	   printShopSummary(itemNames, itemsQuantity, itemPrices, favouriteSandw, favouriteNoodles, favouriteSnack, favouriteBeverage, favouritePopcorn, favouriteCandy);
	   
	   // Get the counts of items
	   printBoughtItemsCount(cntChicSalad, cntHam, cntVeggie, cntInstRamen, cntUdon, cntSoba, cntGranolBar, cntfruitCups, cntEnergyDrink, cntSoftDrinks, cntWater, cntBagChips, cntPopc, cntChocBar, cntGummy, countSandwiches, countNoodles, countSnacks, countBeverages, countPopcorns, countCandy);
	   
	   System.out.print("\n\n"+"\t\t\t\tGOODBYE!!!, WE'LL MEET THE NEXT BUSINESS DAY.");
	} // End of Main
	
	public static int checkCustomer(Scanner sc)
	{	
		int cashierAnswer;
	
		System.out.print("\nAre you a customer?"+"\n"+
						   "1 ==> YES"+"\n"+
						   "2 ==> NO"+"\n"+
						   "3 ==> DISPLAY TODAY'S RECORDS"+"\n"+
						   "ANSWER: ");
		cashierAnswer = sc.nextInt();
		
		return cashierAnswer;
	}
	
	//  DISPLAY
	public static int displayMenu(String cashierName, Scanner sc)
	{
		int userOption;
		
		System.out.print("\nHi I'm "+cashierName+" will be assisting you today"+"\n"+
						   "Select one of the options to proceed"+"\n"+
						   "1 --> SandWiches"+"\n"+
						   "2 --> Noodles"+"\n"+
						   "3 --> Snacks"+"\n"+
						   "4 --> Beverages"+"\n"+
						   "5 --> Popcorn or Chips"+"\n"+
						   "6 --> Candy or Sweets"+"\n"+
						   "7 --> EXIT"+"\n"+
						   "Your option: ");
		userOption = sc.nextInt();
		
		return userOption;
	}
	
	public static int displaySandWiches(Scanner sc)
	{
		int sandWichOption;
		
		System.out.print("\nWe have 3 options of Sandwiches"+"\n"+
						 "1 ==> Chicken Salad:				R30.00 each"+"\n"+
						 "2 ==> Classic Ham and Cheese:			R25.00 each"+"\n"+
						 "3 ==> Veggie Delight:				R20.00 each"+"\n"+
						 "Your option: ");
		sandWichOption = sc.nextInt();
		
		return sandWichOption;
	}
	
	public static int displayNoodles(Scanner sc)
	{
		int noodlesOption;
		
		System.out.print("\nWe have 3 options of Noodles"+"\n"+
						 "1 ==> Instant Romen: 			R12.50 each"+"\n"+
						 "2 ==> Udon Noodles: 			R15.50 each"+"\n"+
						 "3 ==> Soba Noodles:			R15.50 each"+"\n"+
						 "Your option: ");
		noodlesOption = sc.nextInt();
		
		return noodlesOption;
	}
	
	public static int displaySnacks(Scanner sc)
	{
		int snacksOption;
		
		System.out.print("\nWe have 2 options of Snacks"+"\n"+
						 "1 ==> Granola Bar: 			R15.00 each"+"\n"+
						 "2 ==> Fruit Cups: 			R20.00 each"+"\n"+
						 "Your option: ");
		snacksOption = sc.nextInt();
		
		return snacksOption;
	}
	
	public static int displayBevarages(Scanner sc)
	{
		int beveragesOption;
		
		System.out.print("\nWe have 3 options of Noodles"+"\n"+
						 "1 ==> Water:				R10.00 each"+"\n"+
						 "2 ==> Energy Drinks: 			R13.00 each"+"\n"+
						 "3 ==> Soft Drinks:			R15.00 each"+"\n"+
						 "Your option: ");
		beveragesOption = sc.nextInt();
		
		return beveragesOption;
	}
	
	public static int displayPopcorns(Scanner sc)
	{
		int popCornOption;
		
		System.out.print("\nWe have 2 options of Popcorns"+"\n"+
						 "1 ==> Bag Of Chips: 				R20.00 each"+"\n"+
						 "2 ==> Popcorns: 				R22.00 each"+"\n"+
						 "Your option: ");
		popCornOption = sc.nextInt();
		
		return popCornOption;
	}
	
	public static int displayCandySweets(Scanner sc)
	{
		int candyOption;
		
		System.out.print("\nWe have 2 options of Popcorns"+"\n"+
						 "1 ==> Chocolate Bar: 				R15.00 each"+"\n"+
						 "2 ==> Gummy Packs: 				R16.00 each"+"\n"+
						 "Your option: ");
		candyOption = sc.nextInt();
		
		return candyOption;
	}
	
	public static int countItems(int cntItems)
	{
		cntItems++;
		
		return cntItems;
	}
	
	public static void printCustomerReceipt(double totalSelectedItemsAmount, double amount, double change, String totalSelectedItems, String cashierName, String managerName)
	{
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("\n\t\t\t\t\tOLD LADY'S TUCK SHOP TILL RECEIPT"+"\n\n"+
						   "\t\t\t\t================================================"+"\n"+
						   "\t\t\t\tYou bought:\n\t\t\t\t\t\t"+totalSelectedItems+"\n\n"+
						   "\t\t\t\t------------------------------------------------"+"\n"+
						   "\t\t\t\tAmount Cost:		R"+df.format(totalSelectedItemsAmount)+" VAT(15%) included\n"+
						   "\t\t\t\tAmount Payed:		R"+df.format(amount)+"\n"+
						   "\t\t\t\tChange:			R"+df.format(change)+"\n"+
						   "\t\t\t\t------------------------------------------------"+"\n"+
						   "\t\t\t\tYou're helped by:	 "+cashierName+"\n"+
						   "\t\t\t\tShop Manager:		 "+managerName+"\n"+
						   " "+"\n"+
						   "\t\t\t\t\t\t---THANK YOU!!!---"+"\n"+
						   "\t\t\t\t================================================");
	}
	
	public static double customerAmount(Scanner sc)
	{
		double amount;
			
			System.out.print("\nPlease enter your amount: R");
			amount = sc.nextDouble();
			
		return amount;
	}
	
	public static double customerChange(double amount, double totalSelectedItemsAmount)
	{
		double change = 0;
			
			if(amount >= totalSelectedItemsAmount)
			{
				change += amount - totalSelectedItemsAmount;
				
			}else{
				System.out.println("\nYour amount is less than the items amount, we can't let you take the items.");
				change = -1;
			}
			
		return change;
	}
	
	// Determine favourite
	public static String getFavouriteSandwiches(int cntChicSalad, int cntHam, int cntVeggie)
	{
		String favouriteSandw ="";
		
		if(cntChicSalad > cntHam)
		{
			favouriteSandw +="Chicken Salad.";
		}
		
		if(cntHam > cntVeggie)
		{
			favouriteSandw +="Classic Ham and Cheese.";
		}
		
		if(cntVeggie > cntChicSalad)
		{
			favouriteSandw +="Delight Veggie.";
		}
		
		return favouriteSandw;
	}
	
	public static String getFavouriteNoodles(int cntInstRamen, int cntUdon, int cntSoba)
	{
		String favouriteNoodles ="";
		
		if(cntInstRamen > cntUdon)
		{
			favouriteNoodles +="Instant Romen.";
		}
		
		if(cntUdon > cntSoba)
		{
			favouriteNoodles +="Udon Noodles.";
		}
		
		if(cntSoba > cntInstRamen)
		{
			favouriteNoodles +="Soba Noodles.";
		}
		
		return favouriteNoodles;
	}
	
	public static String getFavouriteSnacks(int cntGranolBar, int cntfruitCups)
	{
		String favouriteSnack ="";
		
		if(cntGranolBar > cntfruitCups)
		{
			favouriteSnack +="Granola Bar.";
		}
		
		if(cntfruitCups > cntGranolBar)
		{
			favouriteSnack +="Fruit Cups.";
		}
		
		return favouriteSnack;
	}
		
	public static String getFavouriteBevarages(int cntEnergyDrink, int cntSoftDrinks, int cntWater)
	{
		String favouriteBeverage ="";
		
		if(cntWater > cntEnergyDrink)
		{
			favouriteBeverage +="Water.";
		}
		
		if(cntEnergyDrink > cntSoftDrinks)
		{
			favouriteBeverage +="Energy Drink.";
		}
		
		if(cntSoftDrinks > cntWater)
		{
			favouriteBeverage +="Soft Drink.";
		}
		
		return favouriteBeverage;
	}
	
	public static String getFavouritePopcorn(int cntBagChips, int cntPopc)
	{
		String favouritePopcorn ="";
		
		if(cntBagChips > cntPopc)
		{
			favouritePopcorn +="Bag Of Chips.";
		}
		
		if(cntPopc > cntBagChips)
		{
			favouritePopcorn +="Popcorns.";
		}
		
		return favouritePopcorn;
	}
	
	public static String getFavouriteCandySweets(int cntChocBar, int cntGummy)
	{
		String favouriteCandy ="";
		
		if(cntChocBar > cntGummy)
		{
			favouriteCandy +="Chocolate Bar.";
		}
		
		if(cntGummy > cntChocBar)
		{
			favouriteCandy +="Gummy Packs.";
		}
		
		return favouriteCandy;
	}
	
	public static boolean checkItemQuantity(int itemCount, int itemQuanti)
	{
		boolean isItValid = true;
		
		if(itemCount > itemQuanti)
		{
			System.out.println("\nOUT OF STOCK!!.");
			isItValid = false;
		}
		
		return isItValid;
	}
	
	public static void printShopSummary(String[] itemNames, int[] itemsQuantity, double[] itemPrices, String favouriteSandw, String favouriteNoodles, String favouriteSnack, String favouriteBeverage, String favouritePopcorn, String favouriteCandy)
	{
		DecimalFormat df = new DecimalFormat("R0.00");
		System.out.println("-------------------------------------------------------------------------------------------------------"+
						   "\n\t\t\t\t\tOLD LADY'S TUCK SHOP SUMMARY"+"\n"+
						   "-------------------------------------------------------------------------------------------------------");
		
		//Display Arrays	
		System.out.println("\n"+"Items Names"+"\t"+"Items Quantity"+"\t\t"+"Items Average Prices"+"\n");
						  
		for(int i = 0; i < itemNames.length; i++)
		{
			System.out.println(itemNames[i]+"\t\t"+itemsQuantity[i]+"\t\t\t"+df.format(itemPrices[i])+"\n"+
						       "---------------------------------------------------------");
		}
		
		// Display Contents
		System.out.println("\n\n"+"SandWiches"+"\t\t"+"Item Quantity"+"\t\t"+"Item Price"+"\t\t"+"Noodles"+"\t\t"+"Item Quantity"+"\t\t"+"Item Price"+"\n"+
						   "-------------------------------------------------------------------------------------------------------------------------"+"\n"+
						   "Chicken Salad"+"\t\t"+"8"+"\t\t\t"+"R30.00"+"\t\t\t"+"Instant Rumen"+"\t"+"5"+"\t\t\t"+"R12.00"+"\n"+
						   "Classic Ham and Cheese"+"\t"+"8"+"\t\t\t"+"R25.00"+"\t\t\t"+"Udon Noodles"+"\t"+"5"+"\t\t\t"+"R15.00"+"\n"+
						   "Veggie Delight"+"\t\t"+"9"+"\t\t\t"+"R20.00"+"\t\t\t"+"Soba Noodles"+"\t"+"5"+"\t\t\t"+"R15.00");
		System.out.println("=======================================================================================================================");
		System.out.println("\n\n"+"Snacks"+"\t\t\t"+"Item Quantity"+"\t\t"+"Item Price"+"\t\t"+"Popcorns"+"\t\t"+"Item Quantity"+"\t\t"+"Item Price"+"\n"+
						   "----------------------------------------------------------------------------------------------------------------------------------"+"\n"+
						   "Granola Bar Chips"+"\t"+"15"+"\t\t\t"+"R15.00"+"\t\t\t"+"Bag of Chips"+"\t\t"+"10"+"\t\t\t"+"R20.00"+"\n"+
						   "Fruit Cups"+"\t\t"+"15"+"\t\t\t"+"R20.00"+"\t\t\t"+"Popcorn"+"\t\t\t"+"10"+"\t\t\t"+"R22.00");
	    System.out.println("==================================================================================================================================");
		System.out.println("\n\n"+"Beverages"+"\t\t"+"Item Quantity"+"\t\t"+"Item Price"+"\t\t"+"Candy "+"\t\t"+"Item Quantity"+"\t\t"+"Item Price"+"\n"+
						   "------------------------------------------------------------------------------------------------------------------------"+"\n"+
						   "Water"+"\t\t\t"+"10"+"\t\t\t"+"R10.00"+"\t\t\t"+"Chocolate Bar"+"\t\t"+"10"+"\t\t"+"R15.00"+"\n"+
						   "Energy Drink"+"\t\t"+"10"+"\t\t\t"+"R13.00"+"\t\t\t"+"Gummy Packs"+"\t\t"+"10"+"\t\t"+"R16.00"+"\n"+
						   "Soft Drinks"+"\t\t"+"10"+"\t\t\t"+"R15.00");
		System.out.println("========================================================================================================================");
		
		// Display Mostly boughts
		System.out.println("\n\n"+
						   "Mostly bought SandWich	: "+favouriteSandw+"\n"+
						   "Mostly bought Noodles	: "+favouriteNoodles+"\n"+
						   "Mostly bought Snacks	: "+favouriteSnack+"\n"+
						   "Mostly bought Beverages	: "+favouriteBeverage+"\n"+
						   "Mostly bought Popcorn	: "+favouritePopcorn+"\n"+
						   "Mostly bought Candy	: "+favouriteCandy);
	}

	public static void printBoughtItemsCount(int cntChicSalad, int cntHam, int cntVeggie, int cntInstRamen, int cntUdon, int cntSoba,  int cntGranolBar, int cntfruitCups, int cntEnergyDrink, int cntSoftDrinks, int cntWater, int cntBagChips, int cntPopc, int cntChocBar, int cntGummy, int countSandwiches, int countNoodles, int countSnacks, int countBeverages, int countPopcorns, int countCandy)
	{		
		// Display the counts of Items
		System.out.println("\n\n"+"\t\t\t\t\tCOUNTS OF ITEMS BOUGHT"+"\n");
		
		System.out.println("SandWiches"+"\t\t"+"Item Count"+"\t\t"+"Item Price"+"\t\t"+"Noodles"+"\t\t"+"Item Count"+"\t\t"+"Item Price"+"\n"+
						   "-------------------------------------------------------------------------------------------------------------------------"+"\n"+
						   "Chicken Salad"+"\t\t"+cntChicSalad+"\t\t\t"+"R30.00"+"\t\t\t"+"Instant Rumen"+"\t"+cntInstRamen+"\t\t\t"+"R12.00"+"\n"+
						   "Classic Ham and Cheese"+"\t"+cntHam+"\t\t\t"+"R25.00"+"\t\t\t"+"Udon Noodles"+"\t"+cntUdon+"\t\t\t"+"R15.00"+"\n"+
						   "Veggie Delight"+"\t\t"+cntVeggie+"\t\t\t"+"R20.00"+"\t\t\t"+"Soba Noodles"+"\t"+cntSoba+"\t\t\t"+"R15.00");
		System.out.println("=======================================================================================================================");
		System.out.println("\n\n"+"Snacks"+"\t\t\t"+"Item Count"+"\t\t"+"Item Price"+"\t\t"+"Popcorns"+"\t\t"+"Item Count"+"\t\t"+"Item Price"+"\n"+
						   "----------------------------------------------------------------------------------------------------------------------------------"+"\n"+
						   "Granola Bar Chips"+"\t"+cntGranolBar+"\t\t\t"+"R15.00"+"\t\t\t"+"Bag of Chips"+"\t\t"+cntBagChips+"\t\t\t"+"R20.00"+"\n"+
						   "Fruit Cups"+"\t\t"+cntfruitCups+"\t\t\t"+"R20.00"+"\t\t\t"+"Popcorn"+"\t\t\t"+cntPopc+"\t\t\t"+"R22.00");
	    System.out.println("==================================================================================================================================");
		System.out.println("\n\n"+"Beverages"+"\t\t"+"Item Count"+"\t\t"+"Item Price"+"\t\t"+"Candy "+"\t\t"+"Item Count"+"\t\t"+"Item Price"+"\n"+
						   "------------------------------------------------------------------------------------------------------------------------"+"\n"+
						   "Water"+"\t\t\t"+cntWater+"\t\t\t"+"R10.00"+"\t\t\t"+"Chocolate Bar"+"\t\t"+cntChocBar+"\t\t"+"R15.00"+"\n"+
						   "Energy Drink"+"\t\t"+cntEnergyDrink+"\t\t\t"+"R13.00"+"\t\t\t"+"Gummy Packs"+"\t\t"+cntGummy+"\t\t"+"R16.00"+"\n"+
						   "Soft Drinks"+"\t\t"+cntSoftDrinks+"\t\t\t"+"R15.00");
		System.out.println("========================================================================================================================");
		
		// Display Mostly boughts 
		System.out.println("\n\n"+
						   "Mostly bought SandWich count	: "+countSandwiches+"\n"+
						   "Mostly bought Noodles count	: "+countNoodles+"\n"+
						   "Mostly bought Snacks count	: "+countSnacks+"\n"+
						   "Mostly bought Beverages count	: "+countBeverages+"\n"+
						   "Mostly bought Popcorn count	: "+countPopcorns+"\n"+
						   "Mostly bought Candy count	: "+countCandy);
	}
}