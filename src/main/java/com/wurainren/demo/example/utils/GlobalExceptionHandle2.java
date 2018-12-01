//package com.wurainren.demo.example.utils;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//@RestControllerAdvice
//public class GlobalExceptionHandle2 {
//	
//	@ExceptionHandler(RuntimeException.class)
//	public Map<String,Object> exceptionHandle(){
//		Map<String,Object> result = new HashMap<>();
//		result.put("code","500");
//		result.put("msg", "亲，系统出错了，请联系管理员");
//		return result;
//	}
//}
