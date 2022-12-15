package com.mealkit.product;

import java.io.File;

public class CheckFileName {
	// filePath     : c:\\upload\\
	// orgFileName  : �넀�씎誘�
	// fileExt      : .jpg 
	
	public  String  getCheckFileName(
		String   filePath, String orgFileName, String fileExt	) {
		boolean  isCheck          = true;
		String   returnFileName   = null;
		
		String   fullFilePath     = null;
		File     file             = null;   
		
		String   fileName         = orgFileName;
		
		int i = 0;
		while( isCheck ) {
			fullFilePath   =  filePath + fileName + fileExt;
			// c:\\upload\\�넀�씎誘�.jpg
			file           =  new  File( fullFilePath );
			if( file.exists() ) {
				i += 1;
				fileName  = String.format("%s_%d", orgFileName, i );
			} else {
				isCheck = false;
			}			
		}
		
		returnFileName = fileName + fileExt;
		
		return  returnFileName;
	}
	
}



