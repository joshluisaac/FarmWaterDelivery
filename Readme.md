

## Application layers

The application is made of up three core layers.

[businessactivities](src/main/java/com/rubiconwater/codingchallenge/joshluisaac/businessactivities)

## Specifications
### Order record  - specification
Order record is the representation of an order request. It has the following attributes

1. `id`: A identifier which uniquely identifies this record making it different from others.
2. `dateReceived`: Represented as a [LocalDateTime](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/LocalDateTime.html). 
   This is the date the order was created. It is autogenerated on the back-end and formatted as `yyyy-MM-dd HH:mm:ss` when serialized into JSON.
   
   
### Order record  - invariants
The following invariants and preconditions must be met for `Order` to be in a valid state.
1. `orderStartDate` cannot be in the past
2. `supplyDuration` must be non-negative
   
   
## Order state diagram
1. A newly created order is flagged as `OrderStatus.REQUESTED`.
2. It is flagged as `OrderStatus.IN_PROGRESS` when the order is being delivered.Delivered in this context is defined as any period that falls between
`orderStartDate + supplyDuration`. Please note that the `Order` has an invariant on checking the value of `supplyDuration` for it to be in a valid state. 
3. 


##Querying an order API

## Bulk order cancellation API

* __Request endpoint__

     `PUT /api/farmers?cancel=true`

* __Request body__

    ```json
    {
        "farm_id": "975eebdd-b9fa-493b-ac55-273383b02c86",
        "orders": [
          "1334d383-78a1-4cd9-ac9d-c5faf980d6b4", 
          "9ef5c0f7-1d1f-4955-a051-ce9ba1eb2812", 
          "736038b4-481a-41a7-96d6-be9f3fd95fc4"
        ]
    }
    ```
* __Response body__


* Bulk order cancellation server-side logs

The following will be written to log file when 