<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style = "background-color:pink">
<h1 style = "font-family: Cursive;color:blue;font-size: 50px"><i>Movie Ticket Booking</i></h1><br> <br>
<div>
<!-- <img src="https://lumiere-a.akamaihd.net/v1/images/image_5f5fd186.jpeg" alt="Movie Poster",height="10%",width=10%> -->
	<%-- Welcome ${object.movieName},${object.circleType},${object.dateOfBooking},${object.showDate},${object.noOfTickets} --%>

	<form action="booking" >
		<label for="movies" style="font-size:30px">Select a Movie:</label> <select name="movieName"
			id="movieName" style="font-size:24px">
			<option value="asuran">Asuran</option>
			<option value="rrr">RRR</option>
			<option value="don">Don</option>
			<option value="rebel">Rebel</option>
		</select> <br> <br>
		
		<br> <label for="dateOFBooking" style="font-size:30px" >Ticket Booking Date:</label> <input
			type="date" id="dateOfBooking" name="dateOfBooking" style="font-size:24px" value="date.getDate()"> <br>
			<br>
		<br> <label for="showDate" style="font-size:30px">Show Date:</label> <input type="date"
			id="showDate" name="showDate" style="font-size:24px"> <br> <br>
		
		<br> <label for="circletype" style="font-size:30px">Circle Type:</label> <select
			name="circleType" id="circleType" style="font-size:24px">
			<option value="king">King</option>
			<option value="queen">Queen</option>
		</select> <br>
		<br>
		<br> <label for="noOfTickets" style="font-size:30px">Number of Tickets:</label> <input
			type="number" id="noOfTickets" name="noOfTickets" min="1" max="500" style="font-size:24px"> <br> <br>
			<br> <label for="showtime" style="font-size:30px">Show Time:</label> <select name="showtime"
			id="showtime" style="font-size:24px">
			<option value="morning">morning</option>
			<option value="matinee">matinee</option>
			<option value="1stshow">1stshow</option>
			<option value="2ndshow">2ndshow</option>
		</select> <br> <br>
		<br> <br><button onclick=myFunction() style="font-size:24px" id="seatavail"> check availability </button>
		<input type="submit" value="Submit"  style="font-size:24px;background-color:green;color:white ">
	</form>
	</div>
	
		<script>
     	var date = new Date();
     	var tdate = date.getDate();
     	var month = date.getMonth() + 1;
     	var year = date.getUTCFullYear();
     	if(month<10){
     	month = "0" + month;
     	}
     	if(tdate < 10){
     	 tdate = "0" + tdate;
     	}
     	var minDate = year + "-" + month + "-" + tdate;
     	var maxDate = year + "-" + month + "-" + (tdate+5);
     
     	document.getElementById("showDate").setAttribute('min',minDate)
     	document.getElementById("showDate").setAttribute('max',maxDate)
     	document.getElementById("dateOfBooking").setAttribute('min',minDate)
     	document.getElementById("dateOfBooking").setAttribute('max',minDate)
     	
</script>
<script>
function myFunction() {
  var x, text;

  
  x = document.getElementById("noOfTickets").value;


  if (isNaN(x) || x < 0 || x > ${remseats}) {
    text = "sorry, only ${remseats} seats left..";
  } else {
    text = "book";
  }
  document.getElementById("seatavail").innerHTML = text;
}
</script>

<!--  <img src="https://miro.medium.com/max/3200/1*zWbTrJON-CJSnzNTd6LAvg.jpeg" alt="Image", height="80%",width="100%"> -->

</body>
</html>