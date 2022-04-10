## Understanding DTOs in Java

*   https://www.javatpoint.com/dto-java


Now, we add some dummy data of Location and User in the Hibernate database for testing purposes:

    insert into location(id, latitude, longitude, place, des) values (1511, 30.45, 78.06 ,'Mussoorie', ' Mussoorie is one of the most popular hill stations of country India.');
    insert into user(id, username, fName, lName, password, location_id) values (0043, 'amen@test.com', Amen, 'Louis' ,'fejdbibdl', 1511);
    insert into user(id, username, fName, lName, password, location_id) values (1512, 'emma@test.com', 'Emma', 'Watson' ,'fhfwkjdfhrk', 1511);
