


public class Object{
public static void main(String[] args){
	
	Student student01=new Student("alex",100,100,90);
	
	/*
	student01.sum();
	student01.avg();
	student01.mix();
	student01.min();
	*/
	System.out.println("My name is "+student01.getName());
	System.out.println("My sum  is "+student01.sum());
	System.out.println("My avg  is "+student01.avg());
	System.out.println("My mix  is "+student01.mix());
	System.out.println("My min  is "+student01.min());
	System.out.println("my all data is "+student01.showAll());

	student01.setComputer(120);
	System.out.println("mjj "+student01.getComputer());




	}
}

class Student{
	private String name;
	private float computer;
	private float sport;
	private float music;
	//--------------------constructor
	Student(){

	}

	Student(String nam ,float com , float spo, float mus){
		this.name = nam;
		this.computer = com;
		this.sport = spo;
		this.music= mus;


	}

	//-----------------------publis (get/set)methad
	public void setName(String encapName){
		this.name= encapName;
	}
	public String getName(){
		return name;
	}

	public void setComputer(float encapComputer){
		  if(encapComputer < 0 && encapComputer >100){
            System.out.println("ERROR：error age input....");    //提示錯誤信息
        }else{
            this.computer = encapComputer;
        }

		
	}


	public float getComputer(){
		return computer;

	}

	public void setSport(float encapSport){
		this.sport = encapSport;
	}
	public float getSport(){
		return sport;

	}

	public void setMusic(float encapMusic){
		this.music = encapMusic;
	}
	public float getMusic(){
		return music;

	}


	//---------------------method

	public float sum(){
		float sum ;
		sum = computer+sport+music;
		return sum;
	}

	public float avg(){
		float avg = sum()/3;      //use sum() method
		return avg;

	}

	public float mix(){
		float mix = computer>=sport?computer:sport;
			mix = mix>=music?mix:music;
			return mix;

	}

	public float min(){
		float min = computer<=sport?computer:sport;
		min = min<=music?min:music;
			return min;
	}

	
	public String showAll(){
		return "Name is :"+name+". MY computer soure is : "+computer ;

	}

}