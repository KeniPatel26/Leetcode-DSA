SELECT unique_id,name FROM Employees E LEFT JOIN EmployeeUNI EU
ON EU.id=E.id;