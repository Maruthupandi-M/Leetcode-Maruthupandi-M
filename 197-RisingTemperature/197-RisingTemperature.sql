-- Last updated: 11/08/2026, 14:18:45
# Write your MySQL query statement below
select today.id
FROM Weather yesterday
CROSS JOIN Weather today
where DATEDIFF(today.recordDate,yesterday.recordDate)=1
AND today.temperature>yesterday.temperature;