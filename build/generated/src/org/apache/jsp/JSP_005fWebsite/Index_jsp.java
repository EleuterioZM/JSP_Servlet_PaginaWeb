package org.apache.jsp.JSP_005fWebsite;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("        integrity=\"sha384-0Fs1Z1DFkLhzIvLjLy46xvVj8AyRXjKaz4Y6oTML1uMA+EpkLVhIQEPvLsJ3eYzP\" crossorigin=\"anonymous\">\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <title>ISCIM</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <nav class=\"navbar_1\">\n");
      out.write("            <p id=\"iscim\">ISCIM</p>\n");
      out.write("            <img src=\"img/download.png\" alt=\"\">\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <nav class=\"navbar_2\">\n");
      out.write("            <div id=\"button-menu\">\n");
      out.write("                <button class=\"home_button\">Home</button>\n");
      out.write("                <button class=\"about_button\">About</button>\n");
      out.write("                <button class=\"contact_button\">Contact</button>\n");
      out.write("                <button class=\"help_button\">Help</button>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </header>\n");
      out.write("    <section>\n");
      out.write("        <table class=\"professional-table\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Nome</th>\n");
      out.write("                    <th>Código</th>\n");
      out.write("                    <th>Turma</th>\n");
      out.write("                    <th>Curso</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>João Silva</td>\n");
      out.write("                    <td>001</td>\n");
      out.write("                    <td>Turma A</td>\n");
      out.write("                    <td>Engenharia Civil</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Maria Santos</td>\n");
      out.write("                    <td>002</td>\n");
      out.write("                    <td>Turma B</td>\n");
      out.write("                    <td>Medicina</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                    <td>Carlos Oliveira</td>\n");
      out.write("                    <td>003</td>\n");
      out.write("                    <td>Turma C</td>\n");
      out.write("                    <td>Direito</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Ana Pereira</td>\n");
      out.write("                    <td>004</td>\n");
      out.write("                    <td>Turma D</td>\n");
      out.write("                    <td>Administração</td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("    </section>\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"footer-content\">\n");
      out.write("                <div class=\"footer-section\">\n");
      out.write("                    <h3>Author</h3>\n");
      out.write("                    <p>Mabecuane Eleuterio.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer-section\">\n");
      out.write("                    <h3>Contact</h3>\n");
      out.write("                    <ul class=\"contact-links\">\n");
      out.write("                        <li><a href=\"#\" class=\"contact\"><span>Email</span> <i class=\"fas fa-envelope\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\" class=\"contact\"><span>Phone</span> <i class=\"fas fa-phone\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\" class=\"contact\"><span>Address</span> <i class=\"fas fa-map-marker-alt\"></i></a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer-section\">\n");
      out.write("                    <h3>Follow Us</h3>\n");
      out.write("                    <ul class=\"social-links\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fab fa-facebook-f\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fab fa-twitter\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fab fa-instagram\"></i></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
