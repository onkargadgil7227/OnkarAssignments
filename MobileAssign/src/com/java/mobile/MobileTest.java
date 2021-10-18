package com.java.mobile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

class Phone {

}

class SmartPhone extends Phone 
{
  
	MobileUsedTime time(SocialMedia sm, Gaming gm, Browse br) 
	{
		System.out.println("Using Smart Phone");
		gaming();
		MobileUsedTime mobileusedtime = new MobileUsedTime();
		return mobileusedtime;
	}
	
	private void gaming() {
      System.out.println("Playing Games");
      surf();
	}
	private void surf() {
		System.out.println("Surfing the internet");
		System.out.println("______________________________________________");
	}
}

class SocialMedia {
}
abstract class Apps {
  abstract void useCase();
}

class WhatsApp extends Apps {
  WhatsApp() {
	  System.out.println("______________________________________________");
    System.out.println("Use of WhatsApp is: ");
  }
  void useCase() {
   
	 System.out.println("Chatting, Sharing media, Entertainment");
	 System.out.println("______________________________________________");
  }
}

class LinkedIn extends Apps {
   LinkedIn() {
    System.out.println("Use of LinkedIn is: ");
  }
  void useCase() {
    System.out.println("Professional Network, Offical Use");
    System.out.println("______________________________________________");
  }
}

class Instagram extends Apps {
  Instagram() {
    System.out.println("Use of Instagram is: ");
  }
  void useCase() {
    System.out.println("Entertainment, Sharing media, Chatting");

  }
}

class Gaming {
	
}
class Browse 
{
	
}
class Usage 
{
	
}

class MobileUsedTime extends Usage {
  int MobileUsedTimeIs = 3;

  public String toString() {
    return "MobileUsedTime [MobileUsedTimeIs=" + MobileUsedTimeIs + " hours]";
  }
}

class totalTimeUsed extends Exception {
  int averageTime = 2, inputTime;
  
  totalTimeUsed(int actualTime) {
    inputTime = actualTime;
  }
  
  public String toString() {
    if (averageTime < inputTime) {
    	System.out.println("______________________________________________");
      return ("Exception: The mobile usage has increased by " + (inputTime - averageTime) + " hour/hours.");
    } else {
      return ("Exception: The mobile usage is average.");
    }
  }
}

class mTo {
  public static class mobileTurnedOn {
    private static int nums;
    public static void incUsed() {
      nums++;
    }
    
    public static int mobTurnedOn() {
      return nums;
    }
  }
}

final class parentalUsageLimiter {
  final int usageLimit;//2 indicates 2 hours just for ref.
  int remainingTime;

  parentalUsageLimiter(int time) {
    usageLimit = time;
  }

  final void TimeLeft(int usedTime) {
    remainingTime = usageLimit - usedTime;
    if (remainingTime > 0) {
      System.out.println("Time remaining to use is " + remainingTime + " hours");
    } else {
      System.out.println("You have exausted your time limit");
    }
  }
}

interface mobileBrand {
  void printBrand(String model);

  void printPrice(int price);
}

class Samsung implements mobileBrand {
  public void printBrand(String model) {
    System.out.println("Samsung "+model);
  }
  public void printPrice(int price) {
    System.out.println("Price of the phone is "+price+" Rs");
    System.out.println("______________________________________________");
    
  }
}
class Apple implements mobileBrand {
  public void printBrand(String model) {
    System.out.println("Apple "+model);
  }
  public void printPrice(int price) {
    System.out.println("Price of the phone is "+price+" Rs");
    System.out.println("______________________________________________");
    
  }
}

class batteryPercentageException extends Exception {
  batteryPercentageException(String str) {
    super(str);
  }
}

class testBPException {
  static void validate(int percentage) throws batteryPercentageException {
    if (percentage < 15) {
    	System.out.println("______________________________________________");
      throw new batteryPercentageException("Battery Precentage is Low");
    } else if (percentage > 15 && percentage <= 20) {
    	System.out.println("______________________________________________");
      System.out.println("Turn On Battery Saver Mode");
    }
  }
}

class genralSet {
  private HashSet<String> appNames = new HashSet<String>(); //creating new hashset
  private TreeSet<String> contacts = new TreeSet<String>(); //creating new treeset
  private LinkedList<String> radio = new LinkedList<String>(); //creating new linkedset

  void installApp() {
    // adding values to hash set
    appNames.add("Google Paystore");
    appNames.add("WhatsApp");
    appNames.add("LinkedIn");
    appNames.add("Instagram");
    appNames.add("Youtube");
    System.out.println("______________________________________________");
    System.out.println("Installed Apps: " + appNames); //printing the hashset
   
  }

  void uninstallApp() {
    //removing item from hash set
    appNames.remove("WhatsApp"); // removing hashset item
    System.out.println("After Uninstlling Apps: " + appNames); //printing updated hash set
    System.out.println("______________________________________________");
  }

  void addContact() {
    // adding items to tree set
    contacts.add("Sidd");
    contacts.add("Jack");
    contacts.add("Sparrow");
    contacts.add("Sam");
    contacts.add("Max");
    System.out.println("Saved Contacts: " + contacts); //printing the treeset
  }

  void deleteContact() {
    contacts.remove("Sidd");// removing treeset item
    System.out.println("Updated Contacts: " + contacts);//printing updated treeset
    System.out.println("______________________________________________");
  }

  void randomNumGen() {
    int[] arr = { 8123, 2131, 4567 };
    System.out.println("Actual ArraySet: " + Arrays.toString(arr));
    Object obj = Array.get(arr, 1);
    System.out.println("Random Number: " + obj);
    //updating array set
    Array.set(arr, 1, 5673);
    System.out.println("Updated ArraySet: " + Arrays.toString(arr));
    System.out.println("______________________________________________");

  }

  void radioChannel() {
    radio.add("94.3");
    radio.add("98.4");
    radio.add("104.3");
    radio.add("99.1");
    radio.add("78.2");
    System.out.println("Saved Channels: " + radio);
  }

  void deleteRadioChannel() {
    radio.remove("104.3");
    System.out.println("Updated Channels: " + radio);
    System.out.println("______________________________________________");
  }
}

class fileHandler {
  String fileName;
  File file;

  // this constructor will initialize the filename to the file name sent from main fn 

  fileHandler(String fName) {
    fileName = fName;
    file = new File(fileName);
  }

  void createFile() {
    try {
      if (file.createNewFile()) {
        System.out.println("File: " + file.getName() + " created successfully");
      } else {
        System.out.println("File: " + file.getName() + " already exists");
      }
    } catch (IOException e) {
      System.out.println("An unexpected error is occurred.");
    }
  }

  void readFile() {
    try {
      Scanner sc = new Scanner(file);
      while (sc.hasNextLine()) {
        String fileData = sc.nextLine();
        System.out.println(fileData);
        System.out.println("______________________________________________");
      }
      sc.close();
    } catch (FileNotFoundException exception) {
      System.out.println("Unexcpected error occurred while trying to read from the file");
    }
  }

  void writeFile() {
    try {
      FileWriter filewrit = new FileWriter(fileName);
      // writing the content into the FileOperationExample.txt file  
      filewrit.write("This is demo");

      // Closing the stream  
      filewrit.close();
      System.out.println("Successfully wrote to the file.");
    } 
    catch (IOException e) {
      System.out.println("Unexpected error occurred while trying to write into the file");
    }
  }

  void deleteFile() {
    if (file.delete()) {
      System.out.println("File: " + file.getName() + " deleted successfully");
    } else {
      System.out.println("File: Unexpected error while deleteting file");
    }
  }
}

class favContact implements Comparable<favContact> {
  //this is 
  int noOfCalls;
  String name;

  favContact(int noOfCalls, String name) {
    this.noOfCalls = noOfCalls;
    this.name = name;
  }

  public int compareTo(favContact ct) {
    if (noOfCalls == ct.noOfCalls)
      return 0;
    else if(noOfCalls>ct.noOfCalls)
      return 1;
    else
      return -1;
    
  }
}

public class MobileTest 
{
  public static void main(String[] args) 
  {
    SmartPhone smartphone = new SmartPhone(); 
    Samsung m32 = new Samsung();
    m32.printBrand("m32");
    m32.printPrice(20000);
    Apple _13pro = new Apple();
    _13pro.printBrand("13 Pro");
    _13pro.printPrice(100000);
      parentalUsageLimiter pul = new parentalUsageLimiter(2);
			SocialMedia sm = new SocialMedia();
      mTo.mobileTurnedOn.incUsed();
			Gaming gm = new Gaming();
      mTo.mobileTurnedOn.incUsed();
			Browse br = new Browse();
      mTo.mobileTurnedOn.incUsed();
			MobileUsedTime mobileusedtime = smartphone.time(sm, gm, br);
      System.out.println(mobileusedtime);
      try{
        throw new totalTimeUsed(2);
      } catch (totalTimeUsed e) {
        System.out.println(e);
      }
      System.out.println("Mobile was accessed " + mTo.mobileTurnedOn.mobTurnedOn() + " times");
      pul.TimeLeft(1);
      
      Apps app1 = new WhatsApp();
      app1.useCase();
      Apps app2 = new LinkedIn();
      app2.useCase();
      Apps app3 = new Instagram();
      app3.useCase();
      
      try{
        testBPException.validate(10);
      } catch (batteryPercentageException e) {
        System.out.println("Caught an exception -> " + e);
      }
      
      genralSet gs = new genralSet();
      gs.installApp();
      gs.uninstallApp();

      gs.addContact();
      gs.deleteContact();
      
      gs.randomNumGen();

      gs.radioChannel();
      gs.deleteRadioChannel();

      //file functions
      fileHandler fHandler = new fileHandler("demo.txt");
      // file creating
      fHandler.createFile();
      // file writing
      fHandler.writeFile();
      // file reading
      fHandler.readFile();
      //  will delete the file
       //fHandler.deleteFile();

      // comperable example
      ArrayList<favContact> al=new ArrayList<favContact>();  
      al.add(new favContact(9,"Sidd"));  
      al.add(new favContact(01,"Jack"));  
      al.add(new favContact(105,"Sparrow"));  
  
      Collections.sort(al);  
      for (favContact st : al) {
        System.out.println(st.noOfCalls + " " + st.name);
      }
      
      // comperator example
      // numbers represent 
       //List<Integer> list = Arrays.asList(123,134,673,234);  
        //   Collections.sort(list, Collections.reverseOrder());  
         // System.out.println("List sorted in ReverseOrder: ");  
          //System.out.println(list); 

      ArrayList<favContact> fC = new ArrayList<favContact>();
      fC.add(new favContact(9,"Sidd"));  
      fC.add(new favContact(01,"Jack"));  
      fC.add(new favContact(105, "Sparrow"));
      Collections.sort(fC, Collections.reverseOrder());
      System.out.println("List sorted in ReverseOrder: ");
        for (favContact st : fC) {
        System.out.println(st.noOfCalls + " " + st.name);
      }
    }
}