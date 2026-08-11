-- Last updated: 11/08/2026, 14:16:29
# Write your MySQL query statement below
select distinct author_id as id from Views
where author_id = viewer_id
order by id;



