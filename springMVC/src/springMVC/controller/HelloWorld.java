package springMVC.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWorld implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		//1���ռ���������֤����
		 //2�����������������
		 //3�������������ҵ���������ҵ����
		 //4��ѡ����һ��ҳ��
		 ModelAndView mv = new ModelAndView();
		 //���ģ������ �����ǁ����POJO ����
		 mv.addObject("message", "Hello World!");
		 //ک���߼���ͼ������ͼ����������ݸ����ֽ���������Ĺ�ͼҳ��
		 mv.setViewName("hello");
		  return mv;
	}

}
