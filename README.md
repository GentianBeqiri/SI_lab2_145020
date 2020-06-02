# Втора лабораториска вежба по Софтверско инженерство

## Гентиан Беќири, бр. на индекс 145020

### Група на код: 

Ја добив групата на код 1

###  Control Flow Graph

![Control Flow Graph](https://user-images.githubusercontent.com/38784370/83469229-632e4500-a47f-11ea-86a2-1c2573694c5e.jpg)



### Цикломатска комплексност

Цикломатската комплексност на овој код е 8, истата ја добив преку формулата
 V(G) = E - N + 2, каде E го означува бројот на ребра во control flow графот, а N го означува бројот на јазли во control flow графот. 

  V(G) = E - N + 2 : E=22, N=16 ---> 22 - 16 + 2 = 8


### Тест случаи според критериумот Every path  

ath1 : 1, 2, 14
path2 : 1, 2, 3, 14
path3 : 1, 2, 3,  4,  5.1, 5.2,  /6,  8,  5.3, 5.2/ 10, 11,12, 14
path4 : 1, 2, 3,  4,  5.1, 5.2,  /6, 7,  8,  5.3, 5.2/ 10, 11,12, 14
path5 : 1, 2, 3,  4,  5.1, 5.2,  /6, 7,  8, 9,  5.3, 5.2/ 10, 11,12,13 14


Во сите тест случаи List allUsers може да биде било што бидејќи листата никаде не се користи ,исто така и за User.password

test 1: User  = null, allUsers=emtyList 
	Овој тест случај ја опфаќа path1
assumption : False

test 2:User.username=null, User.email=anything
	Овој тест случај ја опфаќа path2
assumption : False

test 3:User.username="genti", User.email="genti#live.com"
	Овој тест случај ја опфаќа path3
assumption : False

test 4:User.username="genti", User.email ="genti.live@com"
	Овој тест случај ја опфаќа path4
assumption : False

test 5:User.username="genti", User.email="genti@live.com"
	Овој тест случај ја опфаќа path5
assumption : True

### Тест случаи според критериумот  Every statement

statement coverage = number of executable statemant / total number of statements * 100

1.User  = null, allUsers=emtyList ------------------------- 3/18 x 100 = 16.6%

2.User.username=null, User.email=anything---------------- 4 / 18 x 100 = 22.2%

3.User.username="genti", User.email="genti#live.com"--------11 / 18 x 100 = 61.1%

4.User.username="genti", User.email ="genti.live@com"----12 / 18 x 100 = 66.6%

5.User.username="genti", User.email="genti@live.com"-----14 / 18 x 100 = 77.7%

### Објаснување на напишаните unit tests

UnitTesting е еден вид софтверско тестирање каде се тестираат индивидуални единици или компоненти на софтвер.

Mојата задача беше да го тестирам кодот со  Every path критериумот и Every statement критериумот.
За да го направам тестирањето го употребив аssertTrue и assertFalse кои се tврди дека состојбата е вистинита или не.

@Test ->  Анотацијата на Test му кажува на JUnit дека јавниот празен метод на кој е прикачен може да се смета како тест случај.

Изјава assert се користи за прогласување на очекувана булева состојба во програмата. Ако програмата работи со активирани тврдења, тогаш состојбата се проверува на време на траење.


Првиот unit тест Every Path се состои од 5 проверки  кои проверуваат дали резултатот кој го враќа функцијата е оној кој треба да го врати е истата. 
1.Кога user = null и allusers = emtyList, очекуваме дека крајниот исход ќе биде false.
2.Кога User.username=null, User.email=anything, крајниот исход претпоставуваме дека ќе биде false.
3.Кога User.username="genti", User.email="genti#live.com",во емаилот не е исполнет критериумот дека треба да има специјален знак '@',крајниот исход претпоставуваме дека ќе биде false.
4.Кога User.username="genti", User.email ="genti.live@com",во емаилот ги има и двата потребни специјални знаци, но не во бараниот редослед,крајниот исход претпоставуваме дека ќе биде false.
5.Кога User.username="genti", User.email="genti@live.com",емаилот е валиден,крајниот исход е true.


Вториот unit тест Every Statement се состои од 5 проверки со кој проверуваме дали функцијата го враќа саканиот резултат, дали ги исполнува дополнителните барања за „валиден“ емаил адреса.


