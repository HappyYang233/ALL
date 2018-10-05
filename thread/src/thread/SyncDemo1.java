package thread;

class MyThread implements Runnable{	// ʵ��Runnable�ӿ�
	private int ticket=5;
	public void run(){	// ��дrun()����
		for(int i=0;i<100;i++){
			synchronized (this) {
				if(ticket>0)
				{
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("��Ʊ��ticket="+ ticket--);
				}
			}
			}
			
	}
};
public class SyncDemo1{
	public static void main(String args[]){
		MyThread mt = new MyThread() ;	// ʵ����Runnable�������
		Thread t1= new Thread(mt) ;
		Thread t2= new Thread(mt);	
		Thread t3= new Thread(mt);
		t1.start();
		t2.start();
		t3.start();
	}
};