INSERT INTO tbl_user (user_id, username, name, role_id) VALUES
(1, 'jkim', '김진수', 1),
(2, 'pchoi', '최민호', 1),
(3, 'sshin', '신지은', 2),
(4, 'ypark', '박영수', 2),
(5, 'ohan', '한예린', 3);

INSERT INTO tbl_course (course_id, course_name, credits, professor_id) VALUES
(1, '데이터베이스', 3, 1),
(2, '알고리즘', 3, 1),
(3, '운영체제', 3, 2),
(4, '웹프로그래밍', 3, 2),
(5, '소프트웨어공학', 3, 1);

INSERT INTO tbl_timetable (timetable_id, course_id, start_time, end_time, location) VALUES
(1, 1, '09:00:00', '10:30:00', 'A101'),
(2, 2, '10:40:00', '12:10:00', 'A102'),
(3, 3, '13:00:00', '14:30:00', 'B201'),
(4, 4, '14:40:00', '16:10:00', 'B202'),
(5, 5, '16:20:00', '17:50:00', 'C301');
