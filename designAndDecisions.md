# Design and design decisions


## Some design decisions

**Representation of dates**
>Dates across the entire system is Java's `LocalDateTime` and when printed or serialized is represented in [ISO-8601](https://en.wikipedia.org/wiki/ISO_8601) format.


**Water delivery status**
> [WaterDeliveryStatus](src/main/java/com/rubiconwater/codingchallenge/joshluisaac/businessactivities/deliverymanagement/domain/WaterDeliveryStatus) is represented as an enum
>with an `allowCancel` attribute. This attribute indicates which statues can be cancelled, taking away the complexities of if/else conditional statements.
> It also makes it easy to add new delivery statues without having to change business logic. 


**Error handling**
>Maintained a centralised copy of the list of possible errors known to the application aimed at reducing error code duplication.
Each error object contains a code and the description of the error can be easily retrieved across the entire system without having to duplicate error descriptions.
This can also be used as a customer reference code for back-office investigation in the event that an error occurred while trying to interact with the APIs.

**Bulk placing of orders**
>In the event that one or more entries is invalid while performing bulk placing/cancelling of orders, only those invalid entries would be rejected