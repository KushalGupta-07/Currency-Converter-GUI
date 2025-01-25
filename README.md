# Currency-Converter-Application
features:
 1.login page access.
 2.less code complexity.
 3. 6 country exchange rate are avaliable.

limitation:
 1.manually update exchange rate in the code.
 2.No API key is used.
 3.password is changed in the source code.

output:
<img src = "Screenshot (179).png" alt = "login page">
<img src = "Screenshot (180).png" alt = "converter">
<img src = "Screenshot (183).png" alt = "converter">

Time complexity:
 Generally, a program that solely uses a nested if-else statement will likely have a lower time complexity compared to a program utilizing an API call, as API calls usually involve network communication which can introduce additional processing time, making the API call potentially less efficient than a simple nested conditional check. 
 Key points to consider: 
  API overhead:
   Making an API request often involves network latency, data serialization, and server processing, which can significantly impact execution time compared to simple conditional logic within a program.
  Constant time complexity:
   In most cases, a nested if-else statement, regardless of the number of conditions, still has a time complexity of O(1) because only one branch of the conditions will be executed at a time. 