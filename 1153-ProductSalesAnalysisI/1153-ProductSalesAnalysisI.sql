-- Last updated: 11/08/2026, 14:16:35
# Write your MySQL query statement below
select p.product_name,s.year,s.price
from Sales s
Join Product p ON p.product_id = s.product_id;