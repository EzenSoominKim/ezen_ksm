package objectClass;
//은행계좌(통장) 클래스
public class Account {                             //클래스 이름(Account) : 용도에 맞게. 대문자로 쓰자. 
	
//멤버변수, 생성자, 메서드 =클래스 설계시 만들어야 하는 것.(메서드만 필수)
	
//ctrl+space를 통해 명령과 개체 이름들을 빠르게 볼러올 수 있다.	
	
//멤버변수(field): 필드,속성 = 객체 
	//정적 멤버변수
	static final String BANKNAME="신한은행";                  //static : 정적 필드. 원본 클래스에서 확정해버려 바꿀 수 없다.
	//인스턴스 멤버변수											//final : 해당 변수를 상수로 만들어 바꿀 수 없다.
	String accountNo; //계좌번호								.
    String ownerName; //예금주이름
    int balance; //잔액	
    
//생성자(Constructor): 변수에 값을 주는 초기화 기능. 멤버변수, 메서드와 달리 이름은 클래스 이름을 준다. 
	    /* public 클래스명(a, b, c = 매개변수) {
	       멤버변수=a;
	       멤버변수=b;                                      //매개변수 : 외부에서 값을 받을 수 있다. 멤버변수에 줄 값을 받아둘 임시 공간. 
	       멤버변수=c;
	       }
	     */
    //자바에서 Source에서 자동으로 생성자 만들어주는 명령을 : 메뉴에서 Source > Generate Constructor using fields...사용  
    
    public Account(String accountNo, String ownerName, int balance) {  
    	//super();											
    	this.accountNo = accountNo;						 
    	this.ownerName = ownerName;
    	this.balance = balance;
    }
	   /*
	    this.accountNo=accountNo;				 //this.멤버변수=매개변수;
	    this.ownerName=ownerName;                //매개변수에 멤버변수와 똑같은 이름을 쓰고 this.로 구분도 가능
	    this.balance=balance;					 
	   */ 	
    	
   public Account() {
	//빈 생성자. 빈 칸에 ctrl+space로도 호출. 
   }      			       

//메서드(Method) : 객체의 기능
    //예금한다 메서드                                    //deposit, amount 모두 개발자가 만든 이름.
    void deposit(int amount) {                       //void  : 기능만 수행하고 return값을 안받는 메서드.
       balance+=amount;
    }                	    

         //void : 다른 type과 달리 return값이 없이 어떤 기능만 수행하는 메서드 
		    /*void 변수명 (type 매개변수명) {            
		    //괄호 안에 개발자 스스로가 명령을 내린다.
		    }   */
		            
	//인출한다 메서드
    int withdraw(int amount) throws Exception {                          //throw Exception: 예외 처리용
    	if(balance < amount) {
    		throw new Exception("잔액이 부족합니다.");                       
    	}
    	balance-=amount;
    	return amount;                                                  //return : 연산 후 값을 돌려달라는 명령
    }
}

/* 참조변수.메서드() : 참조변수에 ()값을 넣어 메서드 수행
   참조변수.멤버변수 : 참조변수의 멤버변수의 값 출력
*/








