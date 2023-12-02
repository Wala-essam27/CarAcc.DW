Feature:  What installer can do?
availability and appointment scheduling.

Scenario: availability installer
When availability

Scenario: appointment scheduling
Given choose an available appointment
When Show the appointment to the customer
Then Book an appointment for the customer if it suits him
And Show another the appointment to the customer until he choose and book an appointment


Scenario: unavailability installer
Then Displaying a message explaining that he will send a notification when available