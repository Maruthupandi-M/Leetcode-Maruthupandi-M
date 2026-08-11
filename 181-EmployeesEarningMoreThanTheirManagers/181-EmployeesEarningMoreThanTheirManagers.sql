-- Last updated: 11/08/2026, 14:18:55
# Write your MySQL query statement below
select e2.name as Employee from Employee e1
inner join Employee e2 on e1.id = e2.managerID where e1.salary<e2.salary;