/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.27
 * Generated at: 2018-09-20 02:44:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.sys.music;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.cc.javabean.Music;
import java.util.List;

public final class music_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/css/bootstrap.min.css\"/>\r\n");
      out.write("\t\t<link href=\"//netdna.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"path/to/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("    \t<script src=\"https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("    \t<script src=\"https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js\"></script>\r\n");
      out.write("   \t\t <script src=\"https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t\t<title></title>\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("\t\t\tbody{\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\tcolor: dimgrey;\r\n");
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#centern{\r\n");
      out.write("\t\t\tpadding-top:0px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.container{\r\n");
      out.write("\t\t\t\twidth: 700px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#container{\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t#top{\r\n");
      out.write("\t\t\t\theight: 300px;\r\n");
      out.write("\t\t\t\tmargin-top: 50px;\r\n");
      out.write("\t\t\t\tbackground: gray;\r\n");
      out.write("\t\t\t\tcolor: #fff;\r\n");
      out.write("\t\t\t\ttext-align: center;\r\n");
      out.write("\t\t\t\tline-height: 300px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t.searchbar{\r\n");
      out.write("\t\t\t\tborder: 2px solid gray;\r\n");
      out.write("\t\t\t\twidth: 222px;\r\n");
      out.write("\t\t\t\tmargin: 20px 0 20px auto;\r\n");
      out.write("\t\t\t\tborder-radius: 5px 20px 20px 5px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.searchbar input{\r\n");
      out.write("\t\t\t\tdisplay: inline;\r\n");
      out.write("\t\t\t\theight: 30px;\r\n");
      out.write("\t\t\t\tborder-width: 0;\r\n");
      out.write("\t\t\t\tborder-radius:5px 0 0 5px;\r\n");
      out.write("\t\t\t\tcolor: gray;\r\n");
      out.write("\t\t\t\toutline: none;\r\n");
      out.write("\t\t\t\tfont-size: 16px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.searchbar input:focus .searchbar{\r\n");
      out.write("\t\t\t\tborder: 1px solid #00BFFF;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.searchbar i:hover{\r\n");
      out.write("\t\t\t\tcursor: pointer;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t.musicbar{\r\n");
      out.write("\t\t\t\tbackground: black;\r\n");
      out.write("\t\t\t\tcolor: #d6d6d6;\r\n");
      out.write("\t\t\t\tfont-size: 18px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.musicbar > td{\r\n");
      out.write("\t\t\t\tborder-right: 2px solid #fff;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.musicbar > td:hover{\r\n");
      out.write("\t\t\t\tcolor: #fff;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t.musicItem{\r\n");
      out.write("\t\t\t\tborder-width: 2px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.musicItem:hover{\r\n");
      out.write("\t\t\t\tborder: 2px solid #5BC0DE;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.musicItem > td{\r\n");
      out.write("\t\t\t\tborder-right: 1px solid #F2DEDE;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t.mid{\r\n");
      out.write("\t\t\t\tdisplay: none;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t.addtag{\r\n");
      out.write("\t\t\t\tdisplay:flex;\r\n");
      out.write("\t\t\t\tvisibility: hidden;\r\n");
      out.write("\t\t\t\theight: 20px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.addtag:hover{\r\n");
      out.write("\t\t\t\tcursor: pointer;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.addtag:before,\r\n");
      out.write("\t\t\t.addtag:after{\r\n");
      out.write("\t\t\t\tdisplay: inline-block;\r\n");
      out.write("\t\t\t\tposition: relative;\r\n");
      out.write("\t\t\t\tvisibility: visible;\r\n");
      out.write("\t\t\t\twidth: 6px;\r\n");
      out.write("\t\t\t\theight: 4px;\r\n");
      out.write("\t\t\t\tcontent: \"\";\r\n");
      out.write("\t\t\t\ttop: 6px;\r\n");
      out.write("\t\t\t\tbackground: gray;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.addtag > i{\r\n");
      out.write("\t\t\t\tdisplay: inline-block;\r\n");
      out.write("\t\t\t\tvisibility: visible;\r\n");
      out.write("\t\t\t\twidth: 4px;\r\n");
      out.write("\t\t\t\theight: 16px;\r\n");
      out.write("\t\t\t\tbackground: gray;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t#addmenu{\r\n");
      out.write("\t\t\t\tposition: fixed;\r\n");
      out.write("\t\t\t\tvisibility: hidden;\r\n");
      out.write("\t\t\t\twidth: 700px;\r\n");
      out.write("\t\t\t\theight: 600px;\r\n");
      out.write("\t\t\t\tbackground: #80808045;\r\n");
      out.write("\t\t\t\ttop:0;\r\n");
      out.write("\t\t\t\tleft: 0;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#addmenu > div{\r\n");
      out.write("\t\t\t\twidth: 350px;\r\n");
      out.write("\t\t\t\tborder: 2px solid gray;\r\n");
      out.write("\t\t\t\tpadding: 5px 10px;\r\n");
      out.write("\t\t\t\tbackground: #fff;\r\n");
      out.write("\t\t\t\tborder-radius: 5px;\r\n");
      out.write("\t\t\t\tmargin: 200px auto;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.menuclose{\r\n");
      out.write("\t\t\t\twidth: 35px;\r\n");
      out.write("\t\t\t\theight: 25px;\r\n");
      out.write("\t\t\t\tborder-radius: 3px;\r\n");
      out.write("\t\t\t\tmargin: 7px 7px auto auto;\r\n");
      out.write("\t\t\t\tbackground: #fff;\r\n");
      out.write("\t\t\t\ttext-align: center;\r\n");
      out.write("\t\t\t\tline-height: 25px;\r\n");
      out.write("\t\t\t\tfont-size: 12px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.menuclose:hover{\r\n");
      out.write("\t\t\t\tborder: 1px solid gray;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t#files{\r\n");
      out.write("\t\t\t\tborder-top: 1px solid gray;\r\n");
      out.write("\t\t\t\tmargin-top: 5px;\r\n");
      out.write("\t\t\t\tpadding-top: 10px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#files ul{\r\n");
      out.write("\t\t\t\tposition: relative;\r\n");
      out.write("\t\t\t\twidth: 60%;\r\n");
      out.write("\t\t\t\tleft: 20%;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#files li{\r\n");
      out.write("\t\t\t\tborder-width: 2px;\r\n");
      out.write("\t\t\t\tmargin-top: 10px;\r\n");
      out.write("\t\t\t\tborder-radius: 5px;\r\n");
      out.write("\t\t\t\ttext-align: center;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#files li:hover{\r\n");
      out.write("\t\t\t\tborder: 2px solid #00BFFF\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t#createfile{\r\n");
      out.write("\t\t\t\tborder-top: 1px solid gray;\r\n");
      out.write("\t\t\t\tmargin-top: 10px;\r\n");
      out.write("\t\t\t\tmargin-buttom: 5px;\r\n");
      out.write("\t\t\t\tpadding-top: 5px;\r\n");
      out.write("\t\t\t\tpadding-bottom: 5px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#createfile > input{\r\n");
      out.write("\t\t\t\twidth: 180px;\r\n");
      out.write("\t\t\t\theight: 33px;\r\n");
      out.write("\t\t\t\tborder-radius: 4px;\r\n");
      out.write("\t\t\t\tborder: 1px solid #d6d6d6;\r\n");
      out.write("\t\t\t\tmargin-left: 52px;\r\n");
      out.write("\t\t\t\tmargin-right: 11px;\r\n");
      out.write("\t\t\t\tbackground: #fbfbfb;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#createfile > input:focus{\r\n");
      out.write("\t\t\t\tborder-color: #00BFFF;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#createfile > button{\r\n");
      out.write("\t\t\t\twidth: 50px;\r\n");
      out.write("\t\t\t\theight: 30px;\r\n");
      out.write("\t\t\t\tborder-radius: 5px;\r\n");
      out.write("\t\t\t\tborder-width: 1px;\r\n");
      out.write("\t\t\t\tborder-color: #fff;\r\n");
      out.write("\t\t\t\tmargin-left: 10px;\r\n");
      out.write("\t\t\t\tmargin-right: auto;\r\n");
      out.write("\t\t\t\tbackground: #fff;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#createfile > button:hover{\r\n");
      out.write("\t\t\t\tborder-color: #00BFFF;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t.popupWindow{\r\n");
      out.write("\t\t\t\tvisibility: hidden;\r\n");
      out.write("\t\t\t\tposition: absolute;\r\n");
      out.write("\t\t\t\twidth: 50%;\r\n");
      out.write("\t\t\t\tborder: 2px solid gray;\r\n");
      out.write("\t\t\t\tborder-radius: 5px;\r\n");
      out.write("\t\t\t\tleft: 50%;\r\n");
      out.write("\t\t\t\ttop: 50%;\r\n");
      out.write("\t\t\t\ttransform: translate(-50%, -50%);\r\n");
      out.write("\t\t\t\tbackground: #fff;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.popupWindow > label{\r\n");
      out.write("\t\t\t\tdisplay: inline-block;\r\n");
      out.write("\t\t\t\tposition: relative;\r\n");
      out.write("\t\t\t\twidth: 70px;\r\n");
      out.write("\t\t\t\theight: 30px;\r\n");
      out.write("\t\t\t\tleft: 50%;\r\n");
      out.write("\t\t\t\ttransform: translate(-50%);\r\n");
      out.write("\t\t\t\ttext-align: center;\r\n");
      out.write("\t\t\t\tline-height: 30px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.popupWindow > div{\r\n");
      out.write("\t\t\t\tfloat: right;\r\n");
      out.write("\t\t\t\tdisplay: inline-block;\r\n");
      out.write("\t\t\t\twidth: 20px;\r\n");
      out.write("\t\t\t\theight:20px;\r\n");
      out.write("\t\t\t\tborder: 1px solid gray;\r\n");
      out.write("\t\t\t\tborder-radius: 5px;\r\n");
      out.write("\t\t\t\tmargin: 5px 5px;\r\n");
      out.write("\t\t\t\tcolor: gray;\r\n");
      out.write("\t\t\t\ttext-align: center;\r\n");
      out.write("\t\t\t\tline-height: 20px;\r\n");
      out.write("\t\t\t\tfont-size: 16px;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.popupWindow > div:hover{\r\n");
      out.write("\t\t\t\tcursor: pointer;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t#showbox{\r\n");
      out.write("            width: 50%;\r\n");
      out.write("            height: 20%;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            margin-top:0;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            box-shadow: 10px 10px 5px #b9bbbe;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("        .carousel-inner img {\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        #addmusic{\r\n");
      out.write("          width: 17%;\r\n");
      out.write("    \t\tfloat: left;\r\n");
      out.write("    \t\tmargin-left: 0;\r\n");
      out.write("   \t\t\tfont-size: 14px;\r\n");
      out.write("   \t\t \tcolor: #fff;\r\n");
      out.write("    \t\tbackground: #00b4ef;\r\n");
      out.write("    \t\tborder-radius: 13px;\r\n");
      out.write("    \t\tpadding: 10px 25px;\r\n");
      out.write("    \t\tborder: none;\r\n");
      out.write("    \t\ttext-transform: capitalize;\r\n");
      out.write("    \t\ttransition: all 0.5s ease 0s;\r\n");
      out.write("        }\r\n");
      out.write("        #addmusic:hover{\r\n");
      out.write("        \tbackground: #FF3333 ;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        #centern {\r\n");
      out.write("        padding-top=0;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("       \t #page{\r\n");
      out.write("       \tmargin-right:19%;\r\n");
      out.write("       \t}\r\n");
      out.write("       \t\r\n");
      out.write("       \t#add:hover{\r\n");
      out.write("       \tcursor:pointer;\r\n");
      out.write("       \t\tcolor:red;\r\n");
      out.write("       \t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class=\"container-fluid\" id=\"container\">\r\n");
      out.write("\t\t\t<div id=\"showbox\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("\r\n");
      out.write("    <!-- 指示符 -->\r\n");
      out.write("    <ul class=\"carousel-indicators\">\r\n");
      out.write("        <li data-target=\"#showbox\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("        <li data-target=\"#showbox\" data-slide-to=\"1\"></li>\r\n");
      out.write("        <li data-target=\"#showbox\" data-slide-to=\"2\"></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("    <!-- 轮播图片 -->\r\n");
      out.write("    <div class=\"carousel-inner\">\r\n");
      out.write("        <div class=\"carousel-item active\">\r\n");
      out.write("            <img src=\"sys/img/04.jpg\">\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"carousel-item\">\r\n");
      out.write("            <img src=\"sys/img/05.jpg\">\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"carousel-item\">\r\n");
      out.write("            <img src=\"sys/img/06.jpg\">\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- 左右切换按钮 -->\r\n");
      out.write("    <a class=\"carousel-control-prev\" href=\"#showbox\" data-slide=\"prev\">\r\n");
      out.write("        <span class=\"carousel-control-prev-icon\"></span>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a class=\"carousel-control-next\" href=\"#showbox\" data-slide=\"next\">\r\n");
      out.write("        <span class=\"carousel-control-next-icon\"></span>\r\n");
      out.write("    </a>\r\n");
      out.write("</div>\r\n");
      out.write("\t\t\t<div id=\"centern\" class=\"col-md-8 col-md-offset-2\">\r\n");
      out.write("\t\t\t\t<!-- 音乐搜索栏 -->\r\n");
      out.write("\t\t\t\t<div class=\"searchbar\">\r\n");
      out.write("\t\t\t\t\t<input value=\"\" placeholder=\"音乐查找\"/>\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-search\" aria-hidden=\"true\" onclick=\"searchMusic(this)\"></i>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<table class=\"table table-striped\" style=\"border: 1px solid #cccccc;-webkit-border-radius: 3px;-moz-border-radius: 3px;border-radius: 3px\">\r\n");
      out.write("\t\t\t\t\t<thead style=>\r\n");
      out.write("\t\t\t\t\t\t<tr class=\"musicbar\" style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t\t<td>专辑</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>音乐名</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>歌手</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>操作</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td> 添加到歌单   </td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr style=\"height: 10px;\"></tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t<body>\r\n");
      out.write("\t\t\t\t\t<form action=\"MusicServlet?flag=add1&type3=default\" method=\"post\" >\r\n");
      out.write("\t\t\t\t\t\t");
 List<Music> list = (List<Music>)request.getAttribute("list") ;
      out.write(" \r\n");
      out.write("\t\t\t\t\t\t");
 for(Music music:list){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<tr style=\"text-align: center;\">\r\n");
      out.write("\t\t\t\t\t\t\t<td><img src=\"sys/music/show.jsp?photo_no=");
      out.print(music.getId() );
      out.write("\" width=\"70px\" height=\"50px\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><a href=\"");
      out.print(music.getSrc());
      out.write("\" target=\"_blank\" id=\"");
      out.print(music.getSrc());
      out.write('"');
      out.write('>');
      out.print(music.getMusic() );
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>");
      out.print(music.getSinger());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"checkbox\" name=\"musicname\" value=\"");
      out.print(music.getMusic() );
      out.write("\" onclick=\"inputclick(this)\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"src\" value=\"");
      out.print(music.getSrc());
      out.write("\"  style=\"display:none\" >\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><a id= \"add\"  onclick=\"openAddMenu(this)\"  >添加</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"src\" value=\"");
      out.print(music.getSrc());
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t<!--  <td><a class=\"addtag\" href=\"MusicServlet?flag=add&music=");
      out.print(music.getMusic() );
      out.write("\">添加</a></i></div></td>-->\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t");
 	} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" id=\"addmusic\">一键添加</button>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"inline pull-right page\" id = \"page\">\r\n");
      out.write("         ");
      out.print(request.getAttribute("rows") );
      out.write("条记录 ");
      out.print(request.getAttribute("page") );
      out.write('/');
      out.print(request.getAttribute("pageNum") );
      out.write(" 页  \r\n");
      out.write("         ");
int prevPage = (int)request.getAttribute("page")-1; 
      out.write("\r\n");
      out.write("         ");
int nextPage = (int)request.getAttribute("page")+1; 
      out.write("\r\n");
      out.write("         <a href=\"MusicServlet?flag=queryByPage&page=");
      out.print(prevPage);
      out.write("\">上一页</a>     \r\n");
      out.write("         ");
for(int i=1;i<=(int)request.getAttribute("pageNum");i++){ 
      out.write("\r\n");
      out.write("         \t");
if(i==(int)request.getAttribute("page")){ 
      out.write("\r\n");
      out.write("         \t\t<span class='current'>");
      out.print(i );
      out.write("</span>\r\n");
      out.write("         \t");
}else{ 
      out.write("\r\n");
      out.write("         \t\t<a href=\"MusicServlet?flag=queryByPage&page=");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i );
      out.write("</a>\r\n");
      out.write("         \t");
} 
      out.write("\r\n");
      out.write("         ");
} 
      out.write("  \r\n");
      out.write("         <a href=\"MusicServlet?flag=queryByPage&page=");
      out.print(nextPage);
      out.write("\">下一页</a> \r\n");
      out.write("         <a href=\"MusicServlet?flag=queryByPage&page=");
      out.print(request.getAttribute("pageNum"));
      out.write("\">最后一页</a>    \r\n");
      out.write("    </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"addmenu\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t");
List<String> List =(List<String>)request.getAttribute("typelist"); 
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<form action=\"MusicServlet?flag=add2\" method=\"post\">\r\n");
      out.write("\t\t\t\t<div class=\"menuclose\" onclick=\"closeAddMenu()\">关闭</div>\r\n");
      out.write("\t\t\t\t<div id=\"files\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t歌曲名：<input type=\"text\"  name=\"musicname\" value=\"\" ><br>\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\"  name=\"src\" value=\"\">\r\n");
      out.write("\t\t\t\t\t请选择歌单：<br>\r\n");
      out.write("\t\t\t\t");
 for(String string : List) {
      out.write("\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" value=\"");
      out.print(string);
      out.write("\" name=\"type1\">");
      out.print(string );
      out.write("<br>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"确认\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<div id=\"createfile\">\r\n");
      out.write("\t\t\t\t<form action=\"MusicServlet?flag=createType\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"type2\" placeholder=\"请输入需要创建的歌单名\"/>\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"确定\" >\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!--音乐搜索结果展示-->\r\n");
      out.write("\t\t<div class=\"popupWindow\">\r\n");
      out.write("\t\t\t<label>音乐信息</label>\r\n");
      out.write("\t\t\t<div onclick=\"closeSearchMusic(this)\">X</div>\r\n");
      out.write("\t\t\t<table id=\"searchMusic\" class=\"table table-striped\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>音乐名</td>\r\n");
      out.write("\t\t\t\t\t\t<td>音乐ID</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><a target=\"_blank\"></a></td>\r\n");
      out.write("\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</body>\r\n");
      out.write("\t\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("function inputclick(e)\r\n");
      out.write("{\t\r\n");
      out.write("\tconsole.log(e.checked + \"aaaaaaaaaaaa\");\r\n");
      out.write("\tif(e.checked==true)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\tconsole.log(\"sdsdsds\");\r\n");
      out.write("\t\t\t\t var check =e.parentNode.getElementsByTagName(\"input\")[1];\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t\t check.cheked=true;\r\n");
      out.write("\t\t\t\t console.log(check.cheked);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("}\r\n");
      out.write("\tfunction openAddMenu(e){\r\n");
      out.write("\t\tvar musicname = e.parentNode.parentNode.getElementsByTagName(\"td\")[3].getElementsByTagName(\"input\")[0].value;\r\n");
      out.write("\t\tvar musicinput = document.getElementById(\"files\").getElementsByTagName(\"input\")[0];\r\n");
      out.write("\t\tmusicinput.value = musicname;\r\n");
      out.write("\t\tvar src =e.parentNode.parentNode.getElementsByTagName(\"td\")[1].getElementsByTagName(\"a\")[0].href;\r\n");
      out.write("\t\tvar inputsrc =document.getElementById(\"files\").getElementsByTagName(\"input\")[1];\r\n");
      out.write("\t\tinputsrc.value=src;\r\n");
      out.write("\t\tconsole.log(inputsrc);\r\n");
      out.write("\t\tvar addmenu = document.getElementById(\"addmenu\");\r\n");
      out.write("\t\taddmenu.style.width = document.body.clientWidth + \"px\";\r\n");
      out.write("\t\taddmenu.style.height = window.screen.availHeight + \"px\";\r\n");
      out.write("\t\taddmenu.style.visibility = \"visible\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction closeAddMenu(){\r\n");
      out.write("\t\tvar addmenu = document.getElementById(\"addmenu\");\r\n");
      out.write("\t\taddmenu.style.visibility = \"hidden\";\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction initializeFolder(){\r\n");
      out.write("\t\tvar xhr = new XMLHttpRequest();\r\n");
      out.write("\t\txhr.open(\"POST\", \"url\", true);\r\n");
      out.write("\t\txhr.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\r\n");
      out.write("\t\txhr.send();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\txhr.onreadystatechange = function(){\r\n");
      out.write("\t\t\tif(xhr.status == 200 && xhr.readyState == 4){\r\n");
      out.write("\t\t\t\tvar content = xhr.responseText;\r\n");
      out.write("\t\t\t\tif(content){\r\n");
      out.write("\t\t\t\t\tcreateFolder(content);\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\talert(\"数据获取失败\");\r\n");
      out.write("\t\t\t\t\tcloseAddMenu();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction addMusicData(){\r\n");
      out.write("\t\tvar xhr = new XMLHttpRequest();\r\n");
      out.write("\t\txhr.open(\"POST\", \"url\", true);\r\n");
      out.write("\t\txhr.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\r\n");
      out.write("\t\txhr.send(\"填写条件\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\txhr.onreadystatechange = function(){\r\n");
      out.write("\t\t\tif(xhr.status == 200 && xhr.readyState == 4){\r\n");
      out.write("\t\t\t\tvar content = xhr.responseText;\r\n");
      out.write("\t\t\t\tif(content){\r\n");
      out.write("\t\t\t\t\taddElementFromXML(content);\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\talert(\"数据获取失败\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction addElementFromXML(xmlstr){\r\n");
      out.write("\t\tvar parent = document.getElementById(\"musicdata\");\r\n");
      out.write("\t\tvar elems = new DOMParser().parseFromString(xmlstr, \"text/xml\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\telems = elems.getElementsByTagName(\"tr\");\r\n");
      out.write("\t\tfor(var i = 0, elem1; elem1 = elems[i]; ++i){\r\n");
      out.write("\t\t\tvar tem;\r\n");
      out.write("\t\t\tvar tr = document.createElement(\"tr\");\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\ttr.className = \"musicItem\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\telem1 = elem1.getElementsByTagName(\"td\");\r\n");
      out.write("\t\t\tfor(var j = 0, elem2; elem2 = elem1[j]; ++j){\r\n");
      out.write("\t\t\t\tvar td = document.createElement(\"td\");\r\n");
      out.write("\t\t\t\ttd.innerText = elem2.textContent;\r\n");
      out.write("\t\t\t\ttr.appendChild(td);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telem1[elem1.length - 1].className = \"mid\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\telem1 = document.createElement(\"td\");\r\n");
      out.write("\t\t\ttr.appendChild(elem1);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\ttem = document.createElement(\"div\");\r\n");
      out.write("\t\t\telem1.appendChild(tem);\r\n");
      out.write("\t\t\telem1 = document.createElement(\"i\");\r\n");
      out.write("\t\t\ttem.appendChild(elem1);\r\n");
      out.write("\t\t\ttem.className = \"addtag\";\r\n");
      out.write("\t\t\ttem.onclick = openAddMenu;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tparent.appendChild(tr);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t/**\r\n");
      out.write("\t * 音乐搜索函数\r\n");
      out.write("\t * @param {Object} e\r\n");
      out.write("\t */\r\n");
      out.write("\tfunction searchMusic(e){\r\n");
      out.write("\t\tvar value = e.parentNode.getElementsByTagName(\"input\")[0].value;\r\n");
      out.write("\t\tvar xhr = new XMLHttpRequest();\r\n");
      out.write("\t\tconsole.log(value);\r\n");
      out.write("\t\txhr.open(\"POST\", \"MusicServlet?flag=search\", true);\r\n");
      out.write("\t\txhr.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\r\n");
      out.write("\t\txhr.send(\"musicname=\" + value);\r\n");
      out.write("\t\t\r\n");
      out.write("\t\txhr.onreadystatechange = function(){\r\n");
      out.write("\t\t\tif(xhr.status == 200 && xhr.readyState == 4){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar content = JSON.parse(xhr.responseText);\r\n");
      out.write("\t\t\t\tconsole.log(content);\r\n");
      out.write("\t\t\t\tvar parent;\r\n");
      out.write("\t\t\t\tvar searchMusic = document.getElementById(\"searchMusic\");\r\n");
      out.write("\t\t\t\tparent = searchMusic.parentNode;\r\n");
      out.write("\t\t\t\tsearchMusic = searchMusic.getElementsByTagName(\"tbody\")[0].getElementsByTagName(\"tr\")[0].getElementsByTagName(\"td\");\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\tif(content[0]){\r\n");
      out.write("\t\t\t\t\tvar a = searchMusic[0].getElementsByTagName(\"a\")[0];\r\n");
      out.write("\t\t\t\t\ta.innerText = content[0].music;\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\ta.setAttribute(\"href\",content[0].src);\r\n");
      out.write("\t\t\t\t\tsearchMusic[1].innerText = content[0].id;\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tparent.style.visibility = \"visible\";\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\talert(\"音乐没找到\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t \r\n");
      out.write("\tfunction closeSearchMusic(e){\r\n");
      out.write("\t\te.parentNode.style.visibility = 'hidden';\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
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
