# Household Water Program

A small Java program I wrote to practice the basics. It shows some details about a household, works out a water bill, and adds up how much water was used in a day.

## What it does

1. Prints the household details (family members, water used, house number and usage status).
2. Asks you how many liters of water were used and tells you the bill.
3. Asks for morning and evening usage and shows the total.

## How the bill works

- 500 liters or less: Rs. 100
- More than 500 liters: Rs. 200

## How to run it

You need Java installed. Save the code as `HouseholdWater.java`, then run these in your terminal:

```
javac HouseholdWater.java
java HouseholdWater
```

## Example

```
======Household Details======
Family Members: 4
Water Consumed in liters: 590.25L
House Number: 12
Water Usage Status: H

======Water Billing======
Enter water consumption in liters:
550
Water Bill Amount: Rs. 200

======Total Water Consumption======
Enter morning usage:
300
Enter evening usage:
250
Total Water Consumption: 550L
```

## Good to know

- The household details are fixed in the code, so you can't change them while the program runs.
- Only whole numbers work as input. Typing a decimal like 12.5 will crash the program.
