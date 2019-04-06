package com.fh.zl.util;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class FileUtil {


	/**
	 * <pre>copyFile(图片上传)   
	 * 创建人：ZhangLong 1581044363@qq.com   
	 * 创建时间：2018年11月21日 上午9:41:38    
	 * 修改人：ZhangLong 1581044363@qq.com     
	 * 修改时间：2018年11月21日 上午9:41:38    
	 * 修改备注： 
	 * @param request 
	 * @param mkname
	 * @param fileData
	 * @return</pre>
	 */
	public static String copyFile(HttpServletRequest request,String mkname,MultipartFile fileData){
		//文件重命名
		String filename=fileData.getOriginalFilename();
		String suffix=filename.substring(filename.lastIndexOf("."));
		
		//获取UUID
		String uuid=UUID.randomUUID().toString().replace("-", "");
		String newfilename=uuid+suffix;
		
		//获取绝对路径
		String realPath=request.getSession().getServletContext().getRealPath("/");
		
		//创建目录
		File mkFile=new File(realPath+mkname);
		
		if(!mkFile.exists()){
			mkFile.mkdirs();
		}
		
			try {
				fileData.transferTo(new File(mkFile+"//"+newfilename));
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
		return mkname+"/"+newfilename;
	}

	/**
	 * 删除
	 * @param realPath
	 */
	public static void deleteImg(String realPath){
		File file=new File(realPath);
		if(file.exists()){
			file.delete();
		}
	}
}
