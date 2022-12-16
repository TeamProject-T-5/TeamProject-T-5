package com.mealkit.product;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;



public class PdFile {

	public static void save(
			HashMap<String, Object> map,
			HttpServletRequest      request) {
		
		// �옄猷뚯떎  �뙆�씪 ���옣�맆 寃쎈줈(�뵒�젆�넗由�)  �뾾�쑝硫� �깮�꽦
		String   filePath =  "c:\\upload\\";
		File     dir      =  new File( filePath );		
		if( !dir.exists() ) {
			dir.mkdir();   // make directory
		}
				
		// �꽆�뼱�삩 �뙆�씪���옣(c:\\upload)泥섎━ (以묐났�뙆�씪泥섎━)
		CheckFileName  checkFile = new CheckFileName();
		
		// �뙆�씪 ���옣 �씪�씠釉뚮윭由� 
		MultipartHttpServletRequest  multipartHttpServletRequest
		  = (MultipartHttpServletRequest) request;
	
		// write.jsp 蹂대궦 file name�씠 �떖�씪�빞 �뿬�윭媛쒖쓽 �뙆�씪�쓣 泥섎━�븷 �닔 �엳�떎
		Iterator<String> iterator = multipartHttpServletRequest.getFileNames();
		
		MultipartFile  multipartFile =  null;
		
		List<FilesVo>  filesList   = new ArrayList<>();  
		
		String         fileName     = null;  
		String         orgFileName  = null;  
		String         fileExt      = null;  
		String         sFileName    = null;  
		
		// upload �맂 �뙆�씪留덈떎 諛섎났�븯�뿬 泥섎━
		// �뙆�씪�븯�굹�떦 諛섎났
		while( iterator.hasNext() ) {
			multipartFile    = multipartHttpServletRequest.getFile( iterator.next() );
			
			if( !multipartFile.isEmpty()  ) {
				fileName     =  multipartFile.getOriginalFilename();  // �넀.jpg
				orgFileName  =  fileName.substring(0, fileName.lastIndexOf('.')); // �넀
			    fileExt      =  fileName.substring(fileName.lastIndexOf('.'));    // .jpg
			    
			    // �넀_1.jpg
			    sFileName    =  checkFile.getCheckFileName(
			    		filePath, orgFileName, fileExt);
			    
			    FilesVo   vo   = new FilesVo(0, 0, fileName, fileExt, sFileName);   
			    filesList.add( vo );
			   		    
			    // �뙆�씪 ���옣
			    File  file = new File(filePath + sFileName );
			    try {
					multipartFile.transferTo(file);  // �떎�젣 �뙆�씪 ���옣
				} catch (IllegalStateException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}			    
			} // if end
		} // while end
		
		// ���옣�릺�뿀�뜕 �뙆�씪�뱾�쓽 �젙蹂대�� map �뿉 異붽� ���옣
		map.put("filesList", filesList);
	}
	
	
	
}





