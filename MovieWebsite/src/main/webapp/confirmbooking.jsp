<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: yellow">
 <h1 style="font-size: 60px">Confirmed booking</h1>
  <p style="font-size: 40px">  Movie : <i> ${object.movieName } </i><br>
    Ticket type :<i> ${object.circleType } </i><br>
    Number of Tickets : <i>  ${object.noOfTickets } </i><br>
    Showtime : <i> ${object.showtime }</i><br>
    Showdate : <i> ${object.showDate }</i><br> </p>
    <h1 style="font-size:50px'">Total cost: </h1> 
    <p  id="bill" style="font-size: 30px"> </p>
    
    <form action="success">
    <input type="submit" value="Pay Bill" name="Pay Bill" style="font-size:60px;background-color:green;color:white">
    </form>
    
    
    
    
    <script>
        var type = "${object.circleType}"
        var type1 = "king"
        var type2 = "queen"
        var amount
        
        
        
    	if(type1 == type)
    	{
    		amount = 150 * ${object.noOfTickets}	
    		
    	}
    	else{
    		amount = 250 * ${object.noOfTickets}
    		
    	}
    	
    	document.getElementById("bill").innerHTML = amount	
    	
    	
    </script>
</body>
</html>