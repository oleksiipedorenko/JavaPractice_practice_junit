Provide an implementation for BookingManager and cover with unit tests all possible corner cases.
During implementation take into account following conditions:
* SessionRegistry contains inormation regarding already session for which client want to book places
* Session information contains prices per places, session start time and information regarding already booked places
* During booking client should be charged through PaymentSystem
* After booking procedure information of order should be stored into BookingRepository
* In case client executes unbooking, amount that will be returns depends on the time till session starts. 

Rules for payment returning:
* the day before - 100%
* 12 hours before - 75%
* less then 1 hour - 50%