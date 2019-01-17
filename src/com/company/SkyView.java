package com.company;

public class SkyView {
    private double[][] view;

    //Sorts a 1d array into a 2d array designated by # of rows and columns
    public SkyView(int numRows, int numCols, double[] scanned)
    {
        view = new double[numRows][numCols];
        int index = 0;

        //Checks if 2d array is large enough to collect data points from the 1d array
        if(numRows*numCols == scanned.length) {
                //Row increment
                for (int i = 0; i < numRows; i++) {
                    //Even rows
                    if (i % 2 == 0) {
                        //Column increment left to right
                        for (int j = 0; j < numCols; j++) {
                            view[i][j] = scanned[index++];
                        }
                    }

                    //Odd rows
                    if (i % 2 == 1) {
                        //Column decrement right to left
                        for (int j = numCols-1; j >= 0; j--) {
                            view[i][j] = scanned[index++];
                        }
                    }
                }

        }
        //If the 2d array's size isn't big enough to fit all data from the 1d array
        else
        {
            System.out.println("Please increase 2D array rows or columns to increase array size!");
        }
    }

    public double[][] printView()
    {
        //prints out the SkyView array
        for (int i = 0; i<view.length; i++)
        {
            for (int j = 0; j < view[0].length; j++)
            {
                System.out.print(view[i][j]+" ");
            }
            System.out.println();
        }
        return view;
    }

    //gets the average of a window of the 2d array
    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        double average = 0;
        int count = 0;

        //indexes through the designated rows
        for(int i = startRow; i < endRow; i++)
        {
            //indexes through the designated columns
            //adding each index value to the average and incrementing counter
            for(int j = startCol; j < endCol; j++)
            {
             average += view[i][j];
             count++;
            }
        }
        average = average/count;
        return average;
    }


}
