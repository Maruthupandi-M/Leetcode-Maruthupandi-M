-- Last updated: 11/08/2026, 14:16:08
# Write your MySQL query statement below
select u.unique_id,e.name
from Employees e
left join EmployeeUNI u
ON u.id = e.id;