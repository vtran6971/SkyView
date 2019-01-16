package com.company;

public class SkyView {
    private double[][] view;

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
            for (int i = 0; i<view.length; i++)
            {
                for (int j = 0; j < view[0].length; j++)
                {
                    System.out.print(view[i][j]+" ");
                }
                System.out.println("");
            }

        }
        else
        {
            System.out.println("Please increase 2D array rows or columns to increase array size!");
        }
    }
}
