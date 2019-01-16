package com.company;

public class SkyView {
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned)
    {
        view = new double[numRows][numCols];
        int index = 0;

        for(int i = 0; i < numRows; i++) {
            if(i%2 == 0)
            {
                for (int j = 0; j < numCols; j++)
                {
                    view[i][j] = scanned[index];
                    index++;
                }
            }

            if(i%2 == 1)
            {
                for (int j = numCols-1; j>0; j--)
                {
                    view[i][j] = scanned[index];
                    index++;
                }
            }
        }
    }
}
