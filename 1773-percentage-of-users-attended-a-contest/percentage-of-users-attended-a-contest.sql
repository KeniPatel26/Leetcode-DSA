SELECT contest_id,
        ROUND (
            (COUNT(user_id)*100)/
            (SELECT Count(*) from Users)
            ,2
        ) as percentage
FROM register
GROUP BY contest_id
ORDER BY percentage DESC, contest_id ASC;