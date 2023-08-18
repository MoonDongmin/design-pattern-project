# Design-Pattern-Project
각 자동차의 특징 프로그램(팩토리 메서드 패턴 + 어뎁터 패턴 + 데코레이터 패턴)

## 💻 프로젝트 소개
- 디자인 패턴 3개 이상을 써서 프로젝트 만들기
- 어뎁터, 옵저버, ... 을 써서 자동차 회사별 특징을 프로그램으로 만들어보자!

## ⚙️ 개발 환경
- `JAVA`

## 🎨 사용하는 디자인 패턴 소개
### 🏭 팩토리 메서드 패턴 - 자동차를 만들어주는 공장 형식으로 사용
객체 생성을 공장(Factory) 클래스로 캡슐화 처리하여 대신 생성하게 하는 생성 디자인 패턴
즉, 클라이언트에서 직접 `new` 연산자를 통해 객체를 생성하는 것이 아닌, **제품들을 도맡아 생성하는 공장 클래스를 만들고,
이를 상속하는 서브 공장 클래스의 메서드에서 여러가지 제품 객체 생성을 책임지는 것**.

### 🔌 어뎁터 패턴 - 어떻게 구현을 할지 모르겠네...
한 클래스의 인터페이스를 클라이언트에서 사용하고자 하는 다른 인터페이스로 변환함.<br>
어댑터를 이용하면 **인터페이스 호환성 문제 때문에 같이 쓸 수 없는 클래스들을 연결해서 쓸 수 있음.**

### 🎈 데코레이터 패턴 - 특정 차량에 옵션을 추가하는 형식으로 사용
객체의 결합을 통해 기능을 동적으로 유연하게 확장 할 수 있게 해주는 패턴<br>
즉, 기본 기능에 추가할 수 있는 종류가 많은 경우에 각 기능을 Decorator 클래스로 정의한 후 필요한 Decorator
객체를 조합함으로써 **추가 기능의 조합을 설계하는 방식**

###
### < 초기 원하던 프로그램 상황 >
1. **자동차 인터페이스**를 하나 만듦(`Car.interface`)
2. **자동차를 만드는 인터페이스**를 만듦(`Factory.CarFactory.interface`)
3. 각 **자동차의 회사**를 만드는 **클래스** 만듦(`Factory.Hyundai`, `Factory.Toyota`, `Factory.Lamborghini`, …)
4. 각 자동차들은 차동차 인터페이스를 상속해서 구현을 해보자
5. 프로젝트를 실행한다면 → 각 자동차의 시속 + 추가된 기능들 + 그래서 자동차의 총 가격? 정도...

<img width="510" alt="image" src="https://github.com/MoonDongmin/design-pattern-project/assets/109586658/02fc85b1-223c-438d-808e-8c9854f2dcb5"><br>
다이어그램에서 보시다시피 `Factory.CarFactory`와 `Car`를 각각 인터페이스를 설정해서 **데커레이터
패턴**과 **팩토리 메서드 패턴**을 쓰려고 설정한 것을 볼 수 있음.<br>

그리고 자동차 회사 클래스를 `Car` 인터페이를 상속시키고, 각 자동차 공장 클래스를 `Factory.CarFactory` 인터페이스에 상속 시킴.

---

### 📌 팩토리 메서드 패턴 사용
자동차들을 도맡아 생성하는 자동차 공장 클래스를 만들고,
이를 상속하는 서브 자동차 공장 클래스의 메서드에서 여러가지 자동차 객체 생성을 책임지도록 만듬.<br>
<img width="604" alt="image" src="https://github.com/MoonDongmin/design-pattern-project/assets/109586658/c89715af-6343-4bb3-bae6-92cf58e28cb0"><br>

<img width="477" alt="image" src="https://github.com/MoonDongmin/design-pattern-project/assets/109586658/d15611e5-8a6b-4ac1-920f-4660e184c9b7"><br>
코드에서 보시는 것과 같이 각 메소드에서 서로 다른 종류의 자동차를 생성하는 것을 볼 수 있음.<br>

---

### 📌 데코레이터 패턴 사용
이 프로젝트에서는 각 자동차에 블루투스, 온열시트를 옵션으로 추가할 수 있도록 하는 데코레이터 패턴을 사용함.<br>
<img width="548" alt="image" src="https://github.com/MoonDongmin/design-pattern-project/assets/109586658/2b52c8ed-5b09-4750-be28-cd217f6cc27b"><br>
`Decorate.CarWithOption`이라는 추상 클래스를 만들어서 각각의 옵션 클래스들이 상속받을 수 있도록 만들었다.<br>

<img width="490" alt="image" src="https://github.com/MoonDongmin/design-pattern-project/assets/109586658/cc170929-0b36-4244-ac9b-59f27f73dfea"><br>
메인 코드에서는 `basicCar`이라는 객체를 현대 자동차로 만들어 각각의 옵션을 추가하여 자동차를 주행하는 것을 볼 수 있음.<br>

---
### 📌 어뎁터 패턴 사용
자동차 말고 교통수단인 자전거를 사용하려고 합니다. 그래서 `Adapter.Bike`라는 클래스를 하나 만들었다.<br>
<img width="525" alt="image" src="https://github.com/MoonDongmin/design-pattern-project/assets/109586658/3abec816-ca89-432d-91de-fa07344adef0"><br>

그럼 이제 자전거용 어댑터가 필요함. 그래서 `Adapter.BikeAdapter`라는 클라스를 하나 만들어서 `Factory.Driveable` 인터페이스를 원하지만
자전거는 `start()`, `accelerate()` 메서드가 아닌 `ready()`, `biking()`이라는 메서드가 필요함. 그래서 다음 그림과 같이 어뎁터를 만듬.<br>
<img width="400" alt="image" src="https://github.com/MoonDongmin/design-pattern-project/assets/109586658/bf5dcd0d-25a0-4b2e-a255-5ed557744310"><br>

---

### 📌 2023. 08. 16
어뎁터, 데코레이터, 팩토리 메서드 패턴을 다 적용함. 하지만 추가적으로 옵션마다 가격을 추가해서 최종적으로 이 차의 가격이
어떻게 되는지 알려고했다. 그래서 랩실의 형에게 질문을 해서 일단 어떻게 진행을 하면 좋을지 물어봤다.
**나한테 있어서 문제점이 처음에 있던 파일들이 너무 정리가 안되서 쉽게 볼 수 없다는 지적을 받았다.**<br>
그래서 기존에 있던 파일들을 패턴들의 패키지별로 구별하여 정리하여 좀 더 쉽게 정리해 놓으니 어디를 어떻게 고쳐야할지 한 눈에 들어와서
좀 더 쉽게 고칠 수 있게 되었다.
<img width="227" alt="image" src="https://github.com/MoonDongmin/my-study/assets/109586658/65b0eef8-207f-49d4-93ea-cf8d004f3fea">

## ✏️ 느낀점
초기 생각했던 것은 자동차의 시속도 나오고, 추가되는 옵션마다 가격이 더 해지면서 총 가격까지 보여주고 싶었지만 거기까지는 
해보지 못했다. 그래도 주어진 조건 디자인 패턴 3개를 사용해서 직접 프로젝트를 만들다 보니 디자인 패턴을 쓰면 코드가 깔끔해지고 좀 더 보기 좋은
코드가 된다는 것을 직접 느껴보게 되었다.






