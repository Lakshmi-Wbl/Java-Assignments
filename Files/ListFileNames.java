package com.Files;

import java.io.File;

public class ListFileNames {

	public static void main(String[] args) {
		File folder = new File("C:\\Users\\lucky_emily\\whiteboxqa\\Java50-Programs-Assignment");	         
        File[] files = folder.listFiles();	         
        for (File file : files) 
        {
            if (file.isFile())
            {
                System.out.println(file.getName());
            }
        }

	}

}
