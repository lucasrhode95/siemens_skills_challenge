USE siemens;

SELECT
    IF(n.grade >= 8, s.name,NULL) as name, n.grade, s.value
FROM students AS s
         JOIN notes AS n ON
            s.value >= n.min_value AND
            s.value <= n.max_value
ORDER BY n.grade DESC, s.name DESC;
