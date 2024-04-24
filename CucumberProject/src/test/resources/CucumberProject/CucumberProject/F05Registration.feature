Feature: Registration Process

  Background: 
    Given Open Registration Page

  Scenario: To test registration process
    When Pass the data as follows
      | Jeya   | R | Kanyakumari | 9898989898 | jeya@gmail.com   |
      | Aparna | J | Satara      | 7878787878 | aparna@gmail.com |
    Then Registration should success

  Scenario: To test registration process new
    When Passing the data as follows
      | FName    | LName   | Address           | MNo        | MailId             |
      | Chetan   | andhale | Chh SammbajiNagar | 7878787878 | chetan@gmail.com   |
      | Shraddha | Naphade | Delhi             | 9696969696 | Shraddha@gmail.com |
    Then Registration is done
