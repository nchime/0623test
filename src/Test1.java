

/**<pre>
 * 
 * 
 * 여기는 브랜치 영역입니다. 
 * 
 * 
 * 
 * 클래스 설명 (첫라인의 설명은 brief 설명)
 * 보다 자세한 설명 (두번째 라인부터)
 *
 *@author : 곽채화 ( chkwak@mnlsolution.com ) 
 *@version : 1.0
 *@since : 2014. 6. 24.
 *update history 
 *-------------------------------------------------
 *@editor : 
 *@edit date : 
 *@edit content :
 *-------------------------------------------------
</pre>*/
public class Test1 {

	public static void main(String[] args) {

		/// 브랜치를 따서 완벽한 수정을 진행함
		/// 브랜치를 따서 완벽한 2차 수정을 진행함
		/// 브랜치를 따서 3차 수정 실패..
		
		
		Test2 test2 = new Test2();
		
		Test21 test21 = new Test21();
		
		
		String strMsg = test21.strMEthod();  
		
				
		test2.subMethod(); 
		
		testScript();  
		
		// 브랜치에서 4차 수정하고 서버로 push.. 
		
		
	}

	private static void testScript() {
		// TODO Auto-generated method stub
		
		System.out.println("test모듈 메소드입니다."); 
		
	}

}
