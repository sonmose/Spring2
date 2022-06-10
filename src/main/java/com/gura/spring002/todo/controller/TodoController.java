package com.gura.spring002.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring002.todo.dto.TodoDto;
import com.gura.spring002.todo.service.TodoService;

@Controller
public class TodoController {

   @Autowired
   private TodoService service;
   
   //할 일 수정 요청 처리
   @RequestMapping("/todo/update")
   public String update(TodoDto dto) {
      service.updateTodo(dto);
      return "todo/update";
      
   }
   //할 일 수정 <form> 요청 처리
   @RequestMapping("/todo/updateform")
   public ModelAndView updateform(int num, ModelAndView mView) {
      service.getListTodo(num, mView);
      mView.setViewName("todo/updateform");
      return mView;
      
   }
   //할 일 삭제 요청 처리
   @RequestMapping("/todo/delete")
   public String delete(int num) {
      service.deleteTodo(num);
      return "redirect:/todo/list.do";
      
   }
   //할 일 추가 요청 처리
   @RequestMapping("/todo/insert")
   public String insert(TodoDto dto) {
      service.addTodo(dto);
      return "todo/insert";
      
   }
   //할 일 추가 <form> 요청 처리
   @RequestMapping("/todo/insertform")
   public String insertform() {
      
      return "todo/insertform";
      
   }
   //할 일 정보
   @RequestMapping("/todo/list")
   public ModelAndView list(ModelAndView mView) {
      service.getListTodo(mView);
      mView.setViewName("todo/list");
      return mView;
      
   }
   
}