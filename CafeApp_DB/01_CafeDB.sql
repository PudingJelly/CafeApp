-- 카페 메뉴 테이블 생성
create table cafeUser(
    user_ID varchar2(20) primary key,
    user_PW varchar2(20) not null,
    user_name varchar2(20) not null,
    user_phone varchar2(20) not null,
    user_point number(10) default 1000
);

-- 주문내역 테이블 생성
create table orderMenus (
    order_num number(10) not null,
    o_menu_name varchar2(40) not null,
    order_price number(10) not null,
    payment varchar2(20) default ' ',
    who_order varchar2(20)
);

-- 주문내역 시퀀스 생성
create sequence orderMenus_seq
    start with 1
    increment by 1
    nocycle
    nocache;

-- 결제방법 테이블 생성
create table howpayment(
    howtopay varchar2(20) primary key
);
-- 결제방법 테이블 데이터 삽입
insert into howpayment values ('카드결제');
insert into howpayment values ('포인트결제');

-- 메뉴 테이블 생성
CREATE TABLE cafeMenus (
    menu_name VARCHAR2(40) primary key,
    price NUMBER(10) NOT NULL,
    menu_type VARCHAR2(20) NOT NULL
);

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
VALUES('카라멜마끼아또ICE', 2500, '커피');
INSERT INTO cafeMenus
VALUES('헤이즐넛라떼HOT', 2500, '커피');
INSERT INTO cafeMenus
VALUES('헤이즐넛라떼ICE', 2500, '커피');
INSERT INTO cafeMenus
VALUES('디카페인아메리카노HOT', 3000, '커피');
INSERT INTO cafeMenus
VALUES('디카페인아메리카노ICE', 3000, '커피');
INSERT INTO cafeMenus
VALUES('디카페인라떼HOT', 3500, '커피');
INSERT INTO cafeMenus
VALUES('디카페인라떼ICE', 3500, '커피');
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
VALUES('딸기스무디', 4000, '스무디');
INSERT INTO cafeMenus
VALUES('블루베리스무디', 4000, '스무디');
INSERT INTO cafeMenus
VALUES('망고스무디', 4000, '스무디');
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

commit;