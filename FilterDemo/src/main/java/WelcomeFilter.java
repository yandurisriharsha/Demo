

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class WelcomeFilter
 */
public class WelcomeFilter implements Filter {

    /**
     * Default constructor. 
     */
    public WelcomeFilter() {
       
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("--Filter Destroyed--");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		out.println("Before Servlet");
		out.println("<br>");
		chain.doFilter(request, response);
		out.println("<br>");
		out.println("After Servlet");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("--Filter Initiated--");
	}

}
