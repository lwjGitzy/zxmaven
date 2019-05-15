<!-- 富文本 -->
<!-- var detail=(data[i].detail==null)?"":data[i].detail;-->


add.jsp

<script type="text/javascript"  src="../js/kindeditor-4.1.10/kindeditor-all.js"></script>
<link  rel="styleSheet"   href="../js/kindeditor-4.1.10/themes/default/default.css" >


 <tr>
   <td>描述</td>
   <td>
    <textarea id="content"  ></textarea>
	<textarea  name="describe" id="hideDetail"  style="display: none;"></textarea>
   </td>
 </tr>
----------
update.jsp

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <script type="text/javascript"  src="../js/kindeditor-4.1.10/kindeditor-all.js"></script>
     <link  rel="styleSheet"   href="../js/kindeditor-4.1.10/themes/default/default.css" >
 <tr>
   <td>描述</td>
   <td>
    <textarea id="content"  >${beanInfo.describe }</textarea>
	<textarea  name="describe" id="hideDetail"  style="display: none;"></textarea>
   </td>
 </tr>

-------------------
//富文本
	
var editor = null;
	KindEditor.ready(function(K) {
		editor = K.create('#content', {
			cssPath : '<%=request.getContextPath()%>/js/kindeditor/plugins/code/prettify.css',
			uploadJson : '<%=request.getContextPath()%>/js/kindeditor/jsp/upload_json.jsp', 
			fileManagerJson : '<%=request.getContextPath()%>/js/kindeditor/jsp/file_manager_json.jsp',
			allowFileManager : true,
			afterCreate : function() {
				var self = this;
				K.ctrl(document, 13, function() {
					self.sync();
					document.forms['example'].submit();
				});
				K.ctrl(self.edit.doc, 13, function() {
					self.sync();
					document.forms['example'].submit();
				});
			}
		});
		//prettyPrint();
	});