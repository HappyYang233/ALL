/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.27
 * Generated at: 2018-09-20 02:48:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.sys.usermusic;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.cc.javabean.Music;
import java.util.List;

public final class usermusic_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.cc.javabean.Music");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("     \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"WebContent/WEB-INF/lib/jQuery v3.3.1.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("div{\r\n");
      out.write("\twidth: 40%;\r\n");
      out.write("    margin: auto;\r\n");
      out.write("    margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("list-group{\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("}\r\n");
      out.write("list-group-item{\r\n");
      out.write("\twidth: 100%;  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".a{\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".title{\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\twidth: 80px;\r\n");
      out.write("\theight: 35px;\r\n");
      out.write("\tmargin: auto;\r\n");
      out.write("\tborder-width: 0;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tline-height: 35px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<label class=\"title\">所有歌单</label>\r\n");
      out.write(" \t");
List<String> List =(List<String>)request.getAttribute("list"); 
      out.write("\r\n");
      out.write(" \t");
 for(String string : List) {
      out.write("\r\n");
      out.write("<div id=\"");
      out.print(string );
      out.write("\" onclick=\"a(this)\">\r\n");
      out.write("<label>");
      out.print(string );
      out.write("</label>\r\n");
      out.write("</div>\r\n");
      out.write("   ");
 } 
      out.write("\r\n");
      out.write("   \r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\tfunction a(e)\r\n");
      out.write("\t{\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar child = e.getElementsByTagName(\"ol\")[0];\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(child){\r\n");
      out.write("\t\t\tconsole.log(child + \"aaaaaaaaa\");\r\n");
      out.write("\t\t\te.removeChild(child);\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar type =e.id;\r\n");
      out.write("\t\tconsole.log(type);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t var ajax = null;\r\n");
      out.write("         try{\r\n");
      out.write("             //如果IE5~IE12的话  \r\n");
      out.write("             ajax = new ActiveXObject(\"microsoft.xmlhttp\");\r\n");
      out.write("         }catch(e1){\r\n");
      out.write("             try{\r\n");
      out.write("                 //如果是非IE的话\r\n");
      out.write("                 ajax = new XMLHttpRequest();\r\n");
      out.write("             }catch(e2){\r\n");
      out.write("                 alert(\"你的浏览器中不支持异步对象，请换浏览器\");\r\n");
      out.write("             }\r\n");
      out.write("         }\r\n");
      out.write("         //NO2)准备发送请求\r\n");
      out.write("         ajax.open(\"POST\",\"UserServlet?flag=queryByIdType&type=\"+type,true);\r\n");
      out.write("         ajax.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\r\n");
      out.write("         \r\n");
      out.write("         //NO3)真正发送请求体的数据到服务器，如果请求体中无数据的话，就用null表示\r\n");
      out.write("         ajax.send(null);\r\n");
      out.write("         \r\n");
      out.write("         //-------------------------------------------------------------等待\r\n");
      out.write("     \r\n");
      out.write("         //NO4)AJAX异步对象不断监听服务器响应的状态0-1-2-3-【4】\r\n");
      out.write("         //一定要状态变化后，才可触发function(){}函数\r\n");
      out.write("         //如果状态永远是4-4-4-4-4，是不会触发function(){}函数的\r\n");
      out.write("         ajax.onreadystatechange = function(){\r\n");
      out.write("             //如果状态码为4的话\r\n");
      out.write("             if(ajax.readyState == 4){\r\n");
      out.write("                 //如果响应码为200的话\r\n");
      out.write("                 if(ajax.status == 200){\r\n");
      out.write("                  \r\n");
      out.write("                     var json=JSON.parse(ajax.responseText);\r\n");
      out.write("                     console.log(json);\r\n");
      out.write("                     var div=document.createElement(\"ol\");\r\n");
      out.write("                     div.className=\"list-group\";\r\n");
      out.write("                     for(var i in json )\r\n");
      out.write("                    \t {\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("                    \t if(json[i].music!=null)\r\n");
      out.write("                    \t { var para=document.createElement(\"li\");//创建需要增加的元素节点\r\n");
      out.write("                    \t \r\n");
      out.write("                    \t //para.className = \"list-group-item\";\r\n");
      out.write("                    \t //var node=document.createTextNode(json[i].music);//创建文本节点\r\n");
      out.write("                    \t// para.appendChild(node);//将文本节点增加至创建的元素中\r\n");
      out.write("                    \t var asrc=document.createElement(\"a\");\r\n");
      out.write("                    \t var nodesrc=document.createTextNode(json[i].music);\r\n");
      out.write("                    \t asrc.appendChild(nodesrc);\r\n");
      out.write("                    \t\tasrc.setAttribute(\"href\",json[i].src);\r\n");
      out.write("                    \t\tpara.appendChild(asrc);\r\n");
      out.write("                    \t\tasrc.setAttribute(\"target\",\"_blank\")\r\n");
      out.write("                    \t\t\r\n");
      out.write("                    \t\t var a = document.createElement(\"a\");\r\n");
      out.write("                    \t    var node = document.createTextNode(\"删除\");\r\n");
      out.write("                    \t    \t\r\n");
      out.write("                    \t    a.appendChild(node);\r\n");
      out.write("                    \t    a.setAttribute(\"class\",\"a\");\r\n");
      out.write("                    \t   a.setAttribute(\"href\",\"UserServlet?flag=del&type=\"+type+\"&music=\"+json[i].music);\r\n");
      out.write("                    \t/*var input = document.createElement(\"input\");\r\n");
      out.write("                   \t\t input.value = \"删除\";\r\n");
      out.write("                   \t\t input.type=\"b\";\r\n");
      out.write("                   \t\t \r\n");
      out.write("                    \t input.onclick = \"deleteMusic(json[i].music,type)\";*/\r\n");
      out.write("                    \t para.appendChild(a);\r\n");
      out.write("                    \t\r\n");
      out.write("                    \t div.appendChild(para);\r\n");
      out.write("                    \t }\r\n");
      out.write("                    \t \r\n");
      out.write("                    \t \r\n");
      out.write("                    \t }\r\n");
      out.write("                     var element=document.getElementById(type);//获取父节点\r\n");
      out.write("                \t element.appendChild(div);\r\n");
      out.write("                \t\r\n");
      out.write("                    \r\n");
      out.write("                 }\r\n");
      out.write("             }\r\n");
      out.write("         } \r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/*function deleteMusic(music,type){\r\n");
      out.write("\t\tvar music;\r\n");
      out.write("\t\tvar type;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar ajax = null;\r\n");
      out.write("        try{\r\n");
      out.write("            //如果IE5~IE12的话  \r\n");
      out.write("            ajax = new ActiveXObject(\"microsoft.xmlhttp\");\r\n");
      out.write("        }catch(e1){\r\n");
      out.write("            try{\r\n");
      out.write("                //如果是非IE的话\r\n");
      out.write("                ajax = new XMLHttpRequest();\r\n");
      out.write("            }catch(e2){\r\n");
      out.write("                alert(\"你的浏览器中不支持异步对象，请换浏览器\");\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        //NO2)准备发送请求\r\n");
      out.write("        ajax.open(\"POST\",\"UserServlet?flag=del&type=\"+type+\"&music=\"+music,true);\r\n");
      out.write("        ajax.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\r\n");
      out.write("        \r\n");
      out.write("        //NO3)真正发送请求体的数据到服务器，如果请求体中无数据的话，就用null表示\r\n");
      out.write("        ajax.send(null);\r\n");
      out.write("        \r\n");
      out.write("        //-------------------------------------------------------------等待\r\n");
      out.write("    \r\n");
      out.write("        //NO4)AJAX异步对象不断监听服务器响应的状态0-1-2-3-【4】\r\n");
      out.write("        //一定要状态变化后，才可触发function(){}函数\r\n");
      out.write("        //如果状态永远是4-4-4-4-4，是不会触发function(){}函数的\r\n");
      out.write("        ajax.onreadystatechange = function(){\r\n");
      out.write("            //如果状态码为4的话\r\n");
      out.write("            if(ajax.readyState == 4){\r\n");
      out.write("                //如果响应码为200的话\r\n");
      out.write("                if(ajax.status == 200){\r\n");
      out.write("                \tvar a=ajax.responseText;\r\n");
      out.write("                \tif(a==1){\r\n");
      out.write("                \t\talert(\"成功\");\r\n");
      out.write("                \t}\r\n");
      out.write("                \telse{\r\n");
      out.write("                \t\talert(\"失败\");\r\n");
      out.write("                \t}\r\n");
      out.write("                \t}\r\n");
      out.write("                \t}\r\n");
      out.write("                }\r\n");
      out.write("\t}*/\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
