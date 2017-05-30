package com.zuo.union.mapper;

import java.util.Map;

import org.springframework.stereotype.Repository;

/**
 * 图片插入映射接口
 * @author Yao
 *
 */
@Repository("imageMapper")
public interface ImageMapper {
	
	/**
	 * 保存上传图片的路径
	 * @param image
	 * @return
	 * @throws Exception
	 */
	public int uploadImgs(Map<String, Object> imageMap) throws Exception;
}
