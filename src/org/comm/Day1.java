package org.comm;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Day1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file =new File("D:\\New\\Add\\Ranjith\\Ajith.txt");
		FileUtils.write(file, "PK");
		
	}

}
