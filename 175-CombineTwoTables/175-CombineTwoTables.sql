-- Last updated: 11/08/2026, 14:18:56
# Write your MySQL query statement below
select Person.firstName,Person.lastName,Address.city,Address.state
FROM Person
LEFT JOIN Address 
ON Person.PersonId = Address.PersonId;