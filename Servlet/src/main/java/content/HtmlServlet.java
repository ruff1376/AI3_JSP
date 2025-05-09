package content;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HtmlServlet")
public class HtmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 응답
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>HTML 컨텐츠 타입</title");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1>HTML 컨텐츠 타입</h1>");
		writer.println("<img src='https://i.namu.wiki/i/YAud2Nr0VoEGAK2Yd1fF9tC6rL1BycJheh338yZtL-Z23H3wRZzYIJ5HLj3wQ3l38wXTuvHQ6tybHtQ7yVzwIGKRJIhbJ7XYQhVQmj12NkMQB3QqnrbPKu-g4khw-Pm21wOz4RNOgjzRL04nIBbqjQ.webp' />");
		writer.println("</body>");
		writer.println("<html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST 요청");
	}

}
