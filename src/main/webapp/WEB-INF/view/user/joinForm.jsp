<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <%@ include file="../layout/header.jsp" %>

        <div class="flex_box">
            <div>
                <h1>회원가입 페이지</h1>
                <hr />
                <form action="/join" method="post">
                    <input type="text" name="username" placeholder="Enter username" required><br />
                    <input type="password" name="password" placeholder="Enter password" required><br />
                    <input type="email" name="email" placeholder="Enter email" required><br />
                    <button type="submit">회원가입완료</button>
                </form>
            </div>
        </div>
        <%@ include file="../layout/footer.jsp" %>