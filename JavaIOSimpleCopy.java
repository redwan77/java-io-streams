package com.redouan.test.Java_tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaIOSimpleCopy {

	public void CopyFile(String pathToFile, String fileNameWithExtension) throws IOException {

		// file of data source
		File file = new File(pathToFile + fileNameWithExtension);
		FileInputStream fis = new FileInputStream(file);

		// path of file to be created
		String pathOfFileToBeCreated = pathToFile + "copy of" + fileNameWithExtension;
		FileOutputStream fos = new FileOutputStream(pathOfFileToBeCreated);

		int a;
		while ((a = fis.read()) != -1) {
			fos.write(a);
		}

		fis.close();
		fos.close();

	}

}
