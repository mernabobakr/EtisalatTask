
# EtisalatTask
* I tried to resolve the Json infinite recursion while getting the employee by Id by using orika mapping . Orika mapping is done by excluding the fields that causes the infinite recursion like employeeList in the department and  manager's department in the department.
* This project is done using Orika mapping to map between the entity and dto but I still have an exception with orika  which I couldn't have  much time to resolve it .So please get the idea of resolving the Json Infiite recursion and there is other branch called demo you can test it  and it runs without exception because I ignoored the manager in json .
