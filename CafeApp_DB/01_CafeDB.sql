create table cafeUser(
    user_ID varchar2(20) primary key,
    user_PW varchar2(20),
    user_name varchar2(20) not null,
    user_phone varchar2(20) not null,
    user_point number(10) default 1000
);
select * from cafeUser;


-- 메뉴 테이블 생성
CREATE TABLE cafeMenus (
    menu_name VARCHAR2(40) NOT NULL,
    price NUMBER(10) NOT NULL,
    menu_type VARCHAR2(20) NOT NULL
);

drop table cafeMenus;

-- 메뉴 테이블 메뉴 추가
INSERT INTO cafeMenus
VALUES('아메리카노HOT', 1500, '커피');
INSERT INTO cafeMenus
VALUES('아메리카노ICE', 1500, '커피');
INSERT INTO cafeMenus
VALUES('카페라떼HOT', 2000, '커피');
INSERT INTO cafeMenus
VALUES('카페라떼ICE', 2000, '커피');
INSERT INTO cafeMenus
VALUES('카푸치노HOT', 2000, '커피');
INSERT INTO cafeMenus
VALUES('카푸치노ICE', 2000, '커피');
INSERT INTO cafeMenus
VALUES('카페모카HOT', 2500, '커피');
INSERT INTO cafeMenus
VALUES('카페모카ICE', 2500, '커피');
INSERT INTO cafeMenus
VALUES('카라멜마끼아또HOT', 2500, '커피');
INSERT INTO cafeMenus
VALUES('카라멜마끼아또HOT', 2500, '커피');
INSERT INTO cafeMenus
VALUES('헤이즐넛라떼HOT', 2500, '커피');
INSERT INTO cafeMenus
VALUES('헤이즐넛라떼HOT', 2500, '커피');
INSERT INTO cafeMenus
VALUES('디카페인아메리카노HOT', 3000, '커피');
INSERT INTO cafeMenus
VALUES('디카페인아메리카노HOT', 3000, '커피');
INSERT INTO cafeMenus
VALUES('디카페인라떼HOT', 3500, '커피');
INSERT INTO cafeMenus
VALUES('디카페인라떼HOT', 3500, '커피');
INSERT INTO cafeMenus
VALUES('초코라떼HOT', 3000, '음료');
INSERT INTO cafeMenus
VALUES('초코라떼ICE', 3000, '음료');
INSERT INTO cafeMenus
VALUES('녹차라떼HOT', 3000, '음료');
INSERT INTO cafeMenus
VALUES('녹차라떼ICE', 3000, '음료');
INSERT INTO cafeMenus
VALUES('고구마라떼HOT', 3000, '음료');
INSERT INTO cafeMenus
VALUES('고구마라떼ICE', 3000, '음료');
INSERT INTO cafeMenus
VALUES('자바초코칩', 4500, '스무디');
INSERT INTO cafeMenus
VALUES('쿠키앤크림', 4500, '스무디');
INSERT INTO cafeMenus
VALUES('플레인요거트', 4000, '스무디');
INSERT INTO cafeMenus
VALUES('딸기', 4000, '스무디');
INSERT INTO cafeMenus
VALUES('블루베리', 4000, '스무디');
INSERT INTO cafeMenus
VALUES('망고', 4000, '스무디');
INSERT INTO cafeMenus
VALUES('레몬에이드', 3500, '에이드');
INSERT INTO cafeMenus
VALUES('자몽에이드', 4000, '에이드');
INSERT INTO cafeMenus
VALUES('딸기에이드', 4000, '에이드');
INSERT INTO cafeMenus
VALUES('블루베리에이드', 4000, '에이드');
INSERT INTO cafeMenus
VALUES('망고에이드', 4000, '에이드');