My Feelings right now: https://i.kym-cdn.com/entries/icons/original/000/028/021/work.jpg

# Spring-ATM

I Used SpringBoot
- Spring Security
- SpringBoot Web
- MVC
- Thymeleaf
- Spring Data JPA
- Database H2 (In Memory)

The functionality goes as follows:
  - When you start the aplication you are greeted with the home screen which has 2 buttons Login and Register
  - After you click register you are sent to another page on which you will fill the form out with your information and click       submit you are redirected back to the Home page.( your User acount being saved inside the H2 database)
  - When you click the Register button you are sent to the login page where you fill the login form with the information you       just registered and if the login is succesfull you are redirected to your personal ATM page.
      - Inside you personal page you can Deposit or Withdraw you specified amount of Money.
      - After you are done you can click logout and be redirected ack to the home page.

-> Because of how i configured the application it should run streight out of the box.
For the testing part ( i just tested all the scenarios i thought about and created some corner-cases
because i have not written tests that much ,but i can learn that too)
