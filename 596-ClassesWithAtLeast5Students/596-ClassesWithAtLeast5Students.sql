-- Last updated: 11/08/2026, 14:17:20
# Write your MySQL query statement below
select class
from Courses
GROUP BY class
HAVING COUNT(student)>=5; 