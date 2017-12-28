# Red
![Red Logo](https://image.ibb.co/kjHw1b/Red_Ico_2.png)


With this application it is possible to calculate how many notes and coins will be needed to achieve one or more values. Developed in Java, the project uses a simple division-based algorithm to accurately determine values, greatly reducing the volume of notes and coins required to achieve certain values.

After entering the values to be calculated, the program generates a PDF with the result.

Feel free to download or clone the source code!

## How it Works

#### Exemple 1: ####
If you enter the following values:

75.00


The following return will be generated:

1 x 50.00

1 x 20.00

1 x 5,00


#### Exemple 2: ####
If you enter the following values:

75.00

50.00

125,30

The following return will be generated:

1 x 100.00

2 x 50.00

2 x 20.00

2 x 5,00


1 x 0.25

1 x 0.05



**This algorithm works with the following notes and coins:**
- 100.00
- 50.00
- 20.00
- 10.00
- 5.00
- 2.00
- 1.00
- 0.50
- 0.25
- 0.10
- 0.05

Adding more notes and coins may make this algorithm inefficient.

## How to compile
You can import this project using NetBeans.

To compile this project you will need to import the [iText library](https://itextpdf.com/).


## Sample:
![Red Sample 1](https://image.ibb.co/gK2bZw/Red.jpg)

