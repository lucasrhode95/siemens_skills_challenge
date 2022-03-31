USE siemens;

SELECT DISTINCT name FROM (
  SELECT name from cats
  UNION
  SELECT name from dogs
) AS subSelect
