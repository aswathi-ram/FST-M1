@Activity6
Featue: To test input with Datatables

Scenario: Adding to items to a to-do list
Given user is on the To-Do listpage
when user adds the following tasks
| task1 |
| task2 |
| task3 |
Then they can see the task added to the list

