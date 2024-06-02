package org.zerock.w1.calc;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// /calc/input 경로 호출 시 처리를 HttpServlet 상속해서 구성할 수 있도록 처리
@WebServlet(name="inputController", urlPatterns = "/calc/input")
public class InputController extends HttpServlet {


    // doGet 메서드 재정의
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("InputController-doGet");

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/calc/input.jsp");

        dispatcher.forward(req, resp);
    }
}
