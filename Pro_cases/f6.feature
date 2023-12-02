Feature: notifications
- Send order confirmations and updates to customers via email or push notifications.
- Inform installers about new installation requests.

Scenario: send to customers
When order confirmations

Scenario: confirmations
Given confirmations for what
Then send notification to customer

When order update
Scenario: update
Given updates for what
Then send notification to customer


Scenario: inform installers
Given had a new installation requests
When customer booked an appointment
Then send notification to installer about new installation requests