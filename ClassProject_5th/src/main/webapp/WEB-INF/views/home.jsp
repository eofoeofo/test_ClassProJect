<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  <br>
	<%
// 		int a = 10 ;
// 		int sum = 0 ;
// 		for( int i=1; i<= a; i++){
// 			sum += i ;
// 			out.print("현재 i값: " + i + " i까지 합계값: " + sum + "<br>");
// 		}
	
 		Random ran=new Random();
 		int nLottoNum =  6; 
 		int arrLotto[] = new int[nLottoNum] ;
 		for( int i=0; i<=nLottoNum-1; i++){
 			arrLotto[i] = 0 ;
 		}
 		
 		int nCurrentCnt = 0 ;
 		int nCurrentVal = 0 ;
 		boolean bExistVal = false ;
 		while(true){
 			nCurrentVal = ran.nextInt(45) + 1 ;
 			bExistVal = false ;
 			
 			for(int j=0; j<=nCurrentCnt; j++){
 				if( arrLotto[j]==nCurrentVal){
 					out.print("중복발생!!!!");
 					bExistVal = true;
 					continue;
 				}
 			}
			if( bExistVal == false){
				arrLotto[nCurrentCnt] = nCurrentVal ;
				nCurrentCnt ++ ;
			}
			if( nCurrentCnt == 6)
 				break ;
  		
 		} 			
 		
 		for( int i=0; i<=nLottoNum-1; i++){
 			out.print( i+1 + "번째 숫자: " + arrLotto[i] + "<br>" ) ;
 		}
 		
	%>
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
