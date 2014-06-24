
/**<pre>
 * 
 * chimeBranch1을 하나 따서 테스트 진행 
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
		// master에서 수정하고 서버로 푸시까지 해 놓자..
		
	
		
		Test2 test2 = new Test2();
		
		Test21 test21 = new Test21();
		
		
		String strMsg = test21.strMEthod();  
		
				
		test2.subMethod(); 
		
		testScript();  
		
		
		ChimeSpring cp1 = new ChimeSpring();
		
		System.out.println(cp1.getVer());
		
		
	}

	private static void testScript() {
		// TODO Auto-generated method stub
		
		System.out.println("test모듈 메소드입니다."); 
		
	}

}
