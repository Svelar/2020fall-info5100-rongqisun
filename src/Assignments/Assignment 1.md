# Answer:

## 1. Design a course management system (Like Canvas)

-Student

- Data: NUID, Password, Name

- Behaviors: logIn, seeCourseAnnouncements, seeAssignments, UploadAssignment, seeGrade, seeFile, seeMeetingLinks, seeCalendar

  

-Professor

- Data: NUID, Password

- Behaviors: logIn, publishAnnouncement, publishAssignment, giveGrade, publishFile, publishMeetingLinks

  

-Course

- Data: Announcement, Assignment, Grades, File, zoomMeetings, classTime

- Behaviors: 

  

-System

- Data: Courses, Calendar

- Behaviors: 

  

```pseudocode
Student Sun;
Professor Siva;
Course info5100;
Course info5100lab;
System Canvas;
Siva.logIn(NUID, password);
if Canvas isLegal
	Siva.publishAnnouncement(info5100);
	Siva.publishAssignment(info5100);
	Siva.publishFile(info5100);
	Siva.publishMeetingLinks(info5100);
	Siva.publishAnnouncement(info5100lab);
else Illegal Login
Sun.logIn(NUID, Password);
if Canvas isLegal
	Sun.seeCalendar(Canvas.Calendar);
	Sun.seeCourseAnnouncement(info5100);
	Sun.seeAssignments(info5100);
	Sun.seeFile(info5100);
	seeMeetingLinks(info5100);
	Sun.uploadAssignment(info5100);
else Illegal Login
Siva.logIn(NUID, password);
if Canvas isLegal
	Siva.giveGrade(info5100, Sun);
else Illegal Login
Sun.logIn(NUID, Password);
if Canvas isLegal
	Sun.seeGrade(info5100);
else Illegal Login
	
```



## 2. Design a pet adoption platform

-Adopter

- Data: Name, emailAddress, phoneNumber, Address

- Behaviors:  Search, Adopt, bookTime

  

-Pet

- Data: Breed, Color, Size, Location

- Behaviors: 

  

-Platform

- Data: Pets

- Behaviors: 

  

-CustomerService

- Data: Name
- Behaviors: confirmMatch, cancelMatch, returnCall



```pseudocode
Adopter Sun;
Platform PetAdopt;
Pet XiaoHei = Sun.Search(Breed, Color, Size, Location);
CustomerService Li;
if PetAdopt petIsThere
	Sun.Adopt(XiaoHei);
	Sun.bookTime(Time);
	if Sun change his mind
		Li.cancelMatch(Sun, Xiaohei);
	else
		Li.confirmMatch(Sun, Xiaohei, Time);
	Wait(every month)
		Li.returnCall(Sun.phoneNumber)
else Adopt Another

```



## 3. Design an app to book airline ticket.

-Customer

- Data: Name, emaiAddress, loginCredentials, phoneNumber, creditCard

- Behaviors: logIn, Search, Order, requestCancelOrder, requestFund

  

-TicketApp

- Data: Tickets

- Behaviors: comfirmWithAirline, checkOut, sendReceipt, Refund

  

-Ticket

- Data: AirlineCompany, Cabin, Departure, Destination, Duration, Date, Price 

- Behaviors:

  

-Airline

- Data:Tickets 

- Behaviors: Ticketing

  

-Courier

- Data: Name

- Behaviors: contactCustomer 

  

```pseudocode
Customer Sun;
TicketApp FlyPig;
Ariline SouthAirline;
Sun.logIn(loginCredentials);
Ticket T12306 = Sun.Search(AirlineCompany, Cabin, Departure, Destination, Date);
Flypig.comfirmWithAirline(T12306, SouthAirline);
if SouthAirline has T12306
	Sun.Order(T12306);
	Flypig.checkOut(Sun.phoneNumber, Sun.creditCard, T12306.Price);
	SouthAirline.Ticketing(T12306, Sun);
	Flypig.sendReceipt(Sun.emailAddress);
	if Sun changes his mind or Some emergency condition
		Courier GongHao9527;
		GongHao9527.contactCustomer(Sun); //Ask why cancel or explain the situation
		Sun.requestCancelOrder(T12306);
		Sun.requestFund(T12306.Price);
		Flypig.Refund(T12306.price, Sun);
	else
		Sun take flight;
else Order Another

```



## 4. Design a course registration platform.

-Student

- Data: NUID, Password, Name
- Behaviors: logIn, searchCourse, registerCourse, dropCourse, addToWaitlist, seeCalendar



-Instructor

- Data: NUID, Password, Name
- Behaviors: logIn,  approveApplication



-Course

- Data: classTime, Capacity, Description, InstructorName, Location

- Behaviors: 

  

-Platform

- Data: Courses, Calendar
- Behaviors: 



```pseudocode
Student Sun;
Instructor Siva;
Platform NeuCoRe;
Sun.logIn(NUID, Password);
Course info5100-1 = Sun.searchCourse(classTime, InstructorName, Location);
if RegistrationAmount < info5100-1.Capacity
	Sun.registerCourse(info5100-1);
	//Sun.registerCourse(info5100-Lab-1);
	Sun.seeCalendar(NeuCoRe.Calendar);
	if Sun dont like the course
		Sun.dropCourse(info5100-1);
else
	Sun.addToWaitlist(info5100-1);
	Siva.logIn(NUID, Password);
	Siva.approveApplication(Sun.Name, info5100-1);
	

```



## 5. Order food in a food delivery app.(Like Uber Eats)

-Customer

- Data: Name, emailAddress, loginCredentials, phoneNumber, creditCard, Address
- Behaviors: logIn, searchRestaurant, searchFood, addToCart, addToBookmark,  Order, requestCancelOrder, requestFund, writeReview



-Food Providers/Restaurant

- Data: Name, businessHour, Address, Foods
- Behaviors: logIn, publishFood, seeReview, confirmOrder



-Food

- Data: Name, Price, Description
- Behaviors:



-App

- Data: Restaurants, Cart
- Behaviors: checkOut, allocateDelivery, sendReceipt, Refund



-Food Delivery

- Data: Name
- Behaviors: Delivery



```pseudocode
Customer Wen;
App UberEat;
Wen.logIn(loginCredentials);
Restaurant ZHXDJ = Wen.searchRestaurant（Name, businessHour, Address）;
Food ChineseMian = Wen.searchFood(Name, Price);
Wen.addToCart(ChineseMian);
Food ChineseFan = Wen.searchFood(Name, Price);
Wen.addToCart(ChineseFan);
Wen.Order(Cart);
ZHXDJ.logIn(loginCredentials);
ZHXDJ.publishFood(ChineseBao);
if food isInstock
	ZHXDJ.confirmOrder(Wen, Cart);
	UberEat.checkOut(Wen.phoneNumber, Wen.creditCard, Sum(Food.Price));
	UberEat.sendReceipt(Wen.eamilAddress);
	if Wen Change her mind 
		Wen.requestCancelOrder(Cart);
		Uber.Refund(Sum(Food.Price), Wen);
	else
		FoodDelivery Chen;
		UberEat.allocateDelivery(Cart, Chen);
		Chen.Delivery(Cart, Wen.Address);
		if Wen is satisfied with the foods
			Wen.addToBookmark(ChineseFan);
			Wen.writeReview("Good!");
			ZHXDJ.seeReview(AllReviews);
		else
			Wen.writeReview("Bad!");
			Wen.requestFund(ChineseFan);
			UberEat.Refund(ChineseFan, Wen);
else Sorry, No Food

```

