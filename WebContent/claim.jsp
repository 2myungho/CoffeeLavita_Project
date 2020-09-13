<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<link rel="stylesheet" href="css/claim.css">
	<link rel="stylesheet" href="css/nav-footer.css">
	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	 <script type="text/javascript" src="js/main.js"></script>
	<meta name="viewport" content="width=device-width">
    <title></title>
  </head>
  <body>
    <div id = "wrap">
      <div id = "header">
        <div class = "header-inner">
          <h1 class ="logo">
            <a href="index.jsp" title="���Ÿ ���� �ΰ�">���Ÿ �ΰ�</a>
          </h1>

          <ul class="header-text">
            <li>
				<c:if test="${member != null}">
					<p><span class="memberName">${member.name}</span>�� �ȳ��ϼ���.</p>
				</c:if>
			</li>
            <li><a href="#">�˸�</a></li>
            <li>
            	<c:if test="${member == null}"> <a href="log.jsp">�α���</a> </c:if>
            	<c:if test="${member != null}"><a href="index.jsp">�α׾ƿ�</a></c:if>
            </li>
            <li><a href="mypage.jsp">����������</a></li>
            <li><a href="claim.jsp">������</a></li>
            <li>
              <form>
                <select class="length">
                  <option selected>KOREA</option>
                  <option>English</option>
                  <option>China</option>
                  <option>Japan</option>
              </select>
            </form>
            </li>
          </ul>
		  <div class="last-gnb">
			<a href="#" class="two_bar"></a>
			<a href="#" class="two_bar"></a>
			</div>
		 </div>
		  
		  <div id = "nav">
			<!--<div class = "nav-inner">-->
			  <ul class="nav-bar">
				<li>
				  <a href="#">COFFEE & LAVITA</a>
				  <ul class="nav-subbar">
					<li><a href="#">LAVITA �Ұ�</a></li>
					<li><a href="#">LAVITA BI</a></li>
					<li><a href="#">LAVITA ä��</a></li>
					<li><a href="#">LAVITA Ŀ��</a></li>
				  </ul>

				</li>

				<li>
				  <a href="#">MENU</a>
				   <ul class="nav-subbar">
					 <li><a href="coffee-menu.jsp">Ŀ��</a></li>
					 <li><a href="#">����&��</a></li>
					 <li><a href="#">����Ʈ</a></li>
					 <li><a href="#">��ǰ</a></li>
					 <li><a href="#">ī��</a></li>
					 <li><a href="#">���缺��ǥ</a></li>
				   </ul>
				</li>

				<li>
				  <a href="#">EVENT</a>
				   <ul class="nav-subbar">
					 <li><a href="#">�������� �̺�Ʈ</a></li>
					 <li><a href="#">����� �̺�Ʈ</a></li>
					 <li><a href="#">��÷�� ��ǥ</a></li>
				   </ul>
				</li>

				<li>
				  <a href="#">CARD</a>
				   <ul class="nav-subbar">
					 <li><a href="#">LAVITA ī��</a></li>
					 <li><a href="#">��� �� ����</a></li>
					 <li><a href="#">���� ���� ī��</a></li>
				   </ul>
				</li>

				<li>
				  <a href="#">STORE</a>
				   <ul class="nav-subbar">
					 <li><a href="#">���� ã��</a></li>
					 <li><a href="#">Ư�� ����</a></li>
					 <li><a href="#">�ű� ����</a></li>
					 <li><a href="#">���� ����</a></li>
				   </ul>
				</li>

				<li>
				  <a href="#">��������</a>
				   <ul class="nav-subbar">
					 <li><a href="#">��������</a></li>
					 <li><a href="#">���ҽ�</a></li>
				   </ul>
				</li>
			  </ul>
			</div>
		  </div>
      </div>

      <div id = "content">
	  		<div class="content-claim">
				<div class="background-top">
					<h2>���� �Ҹ�</h2>
				</div>
				<div class="claim-bottom">
					<div class="location"><a href="main.jsp">����></a><a href="claim.jsp">���ǼҸ�</a></div>
					<div class="claim-left">
						<div class="claim-left-fristbox">
							<h3>������ ���� �ʹ�� ��ڽ��ϴ�.</h3>
							<p>������������ ���̳� �����ϼ̴� ���� �����ôٸ� ���� �ǰ� ����ֽñ� �ٶ��ϴ�.<br>
								�׻� ���� ���� ���񽺷� �����ϰڽ��ϴ�.</p>
							<a href="#">���� ���� ����</a>
						</div>
						<form method="post">
							<div class="claim-left-secondbox">
								<table cellspacing="0">
									<colgroup>
										<col width="30%">
										<col width="70%">
									</colgroup>
									<tr>
										<th>���о�</th>
										<td>
											<select class="claim-select"name="type" id="type">
												<option value="">��������</option>
												<option value="1">����</option>
												<option value="2">Ī��</option>
												<option value="3">����</option>
												<option value="4">�Ҹ�</option>
											</select>

											<select class="claim-select" name="selection" id="selection">
												<option value="">����</option>
												<option value="1">����Ʈ</option>
												<option value="2">����� ī��</option>
												<option value="3">����Ʈ ī��</option>
												<option value="4">ȸ������</option>
												<option value="5">�̺�Ʈ</option>
											</select>
										</td>
									</tr>

									<tr>
										<th>
											<label for="notice-service">�亯 �˶� ����</label>
										</th>
										
										<td>
											<label for="receive"><span>�޴�</span></label>
												<input class="notice-service" type="radio" name="notice-service" value="receive" id="receive" checked>
											<label for="not-receive"><span>���� �ʴ�</span></label>
												<input class="notice-service" type="radio" name="notice-service" value="not-receive" id="not-receive">
										</td>
									</tr>

									<tr>
										<th>
											<label for="phone-number">����ó</label>
										</th>
										<td>
											<select class="claim-select" name="phone-number">
												<option value="010">010</option>
												<option value="011">011</option>
												<option value="016">016</option>
											</select><p class="phone-line">-</p>

											<input class="claim-select-input" type="text" size="4" maxlength="4">
											<p class="phone-line">-</p>
											<input class="claim-select-input" type="password" size="4" maxlength="4">
										</td>
									</tr>

									<tr>
										<th>
											<label for="title">����</label>
										</th>
										<td>
											<input class="claim-title" type="text" size="20" maxlength="20" placeholder="������ �Է��ϼ���.">
										</td>
									</tr>

									<tr>
										<th>
											<label for="consultation">����</label>
										</th>
										<td>
											<textarea name="consultation" id="consultation" rows="5" cols="45">������ �Է��ϼ���.</textarea>
										</td>
									</tr>
									

									<tr>
										<th>
											<label for="myfile">����÷��</label>
										</th>
										<td>
											<div class="file-uplode">
												<input type="text" value="���ϼ���" readonly>
												<input type="file" id="myfile">
												<p>���� ÷�δ� �Ʒ��� ���ϸ� ����� �����ϸ� �ִ� 2��(1���� �ִ�5MB), �� 10MB���� ����� �����մϴ�.<br>
												(��� ���� Ȯ���� : jpg, jpeg, png, gif)</p>
											</div>
										</td>
									</tr>
								</table>
								<input type="submit" value="����ϱ�">
								<div class="claim-left-third">
									<p>����� �ʸӿ� �ִ� ������ �� �������� ������ ���� �� �� ����� �� �ֽ��ϴ�.<br>
									*������ ���� �������(�弳, ���, �����)�� �������� ���� �Խù��� ���� �� �� �ֽ��ϴ�.</p>
									<div class="claim-left-third-inner">
										<div class="claim-left-third-left">
											<h3>���� �Ҹ�</h3>
											<p>-���� : ���� �� �亯�Ϸ�<br>
											   -���� ������ : ���� ���� �亯�Ϸ�</p>
										</div>
										<div class="claim-left-third-right">
											<h3>��ȭ:000-0000-0000</h3>
											<p>-���� : ���� 9�� ~ ���� 6��<br>
											   -��,��,������ : �޹�</p>
										</div>
									</div>
								 </div>
							</div>
						</form>
					</div>

					<div class="side-right">
						<ul class="side-right-inner">
							<li><a href="claim.jsp">���� �Ҹ�</a></li>
							<li><a href="#">�����ϴ� ����</a></li>
							<li><a href="#">����, ����������</a></li>
							<li><a href="#">ä�� ����</a></li>
						</ul>
					</div>
				</div>
			</div>
		</form>
	  </div>
        
      <div id = "footer1">
        <div class = "footer1-inner">
          <ul>
            <li><a href="#">�������� ó�� ��ħ</a></li>
            <li><a href="#">��������ó�����������ħ</a></li>
            <li><a href="#">Ȩ������ �̿���</a></li>
            <li><a href="#">�����濵</a></li>
          </ul>
      </div>
      </div>

      <div id = "footer2">
        <div class="footer2-inner">
          <p class="footer-lavita">COFFEE & LAVITA</p>
          <P>(��)COFFEE & LAVITA ��ǥ�̻�: �̸�ȣ ����ڵ�Ϲ�ȣ 000-00-00000 ����Ǹž��Ű� �� 2019-���ﰭ��-00560
          <br>����� ������ ������� 99�� 7 ������ 02-000-0000 (09:00 ~ 18:00) Email: cl@lavitako.combako.com
          <br>copyright�� 2019.COFFEE & LAVITA
        </div>
      </div>
    </div>


  </body>
</html>