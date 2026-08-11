-- Last updated: 11/08/2026, 14:17:25
# Write your MySQL query statement below
select name
from customer
WHERE referee_id != 2 or referee_id is null;