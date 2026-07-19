SELECT s.student_id,s.student_name,su.subject_name,COUNT(ex.subject_name) as attended_exams
FROM Students s cross JOIN Subjects su Left Join Examinations ex
ON s.student_id=ex.student_id and su.subject_name=ex.subject_name
GROUP BY  s.student_id,s.student_name,su.subject_name
ORDER BY s.student_id,su.subject_name;