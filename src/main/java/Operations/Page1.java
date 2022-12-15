package Operations;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Page1 {
	public static AppiumDriver<MobileElement> driver;

	public Page1(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		this.driver = driver;
	}

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/et_name")
	public MobileElement FullName;
	
	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/et_number")
	public MobileElement Mob_Number;

	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/btn_submit")
	public WebElement Submit;
	
	@FindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/rb_delhi")
	public MobileElement SelectCity;

	@FindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/act_auto_complete")
	public MobileElement location;

	@FindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/btn_done")
	public MobileElement Next;

	@FindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/rg_male")
	public MobileElement Gender;

	@FindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/rb_graduate")
	public MobileElement qualification;

	@FindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/cb_english")
	public MobileElement medium;

	@FindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/rg_eng_level_4")
	public MobileElement language;

	@FindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/cb_fresher")
	public MobileElement experience;

	@FindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/tv_age")
	public MobileElement Age;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[7]")
	public MobileElement Selectage;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.GridView/android.widget.FrameLayout[18]/android.widget.CheckBox")
	public MobileElement otherbtn;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
	public MobileElement Choosebtn;
	@FindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/btn_done")
	public MobileElement done;

	@FindBy(id = "android:id/button1")
	public MobileElement SubmitButton;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
			+ "LinearLayout/android.widget.LinearLayout\r\n")
	public MobileElement IT_Hardware;
	
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.CheckBox")
	public MobileElement CheckBox;
	
	
	@FindBy(xpath = "	/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout\r\n")
	public MobileElement Degree;
	
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]")
	public MobileElement Stream;
	

	@FindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/ib_next")
	public MobileElement Btn_Done;
	

	@FindBy(id = "android:id/button1")
	public MobileElement SubmitButton1;
	

	@FindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/btn_english")
	public MobileElement English;
	

	public void name(String name) {
		System.out.println("name");
		FullName.sendKeys(name);
	}

	
	public void number(String number) {
		Mob_Number.sendKeys(number);
	}

	public void submit() {
		Submit.click();
	}

	public void Selectoption() {
		SelectCity.click();
	}

	public void Enterlocation(String Location) {
		location.sendKeys(Location);
	}

	public void next() {
		Next.click();
	}

	public void gender() {
		Gender.click();
	}

	public void qualification_option() {
		qualification.click();

	}

	public void medium_option() {
		medium.click();

	}

	public void language_option() {
		language.click();
	}

	public void experience_option() {
		experience.click();
	}

	public void year_option() {

		Age.click();
	}

	public void age_option() {
		Selectage.click();
	}

	public void interest() {
		otherbtn.click();
		Choosebtn.click();
		SubmitButton.click();
	}

	public void Submit_Details() {
		done.click();
	}

	public void Hardware_Choose() {
		IT_Hardware.click();
		CheckBox.click();
		SubmitButton1.click();
	}

	public void Degree_Details() {
		Degree.click();
		Stream.click();
		Btn_Done.click();
	}

	public void English_Choose() {
		English.click();
	}

}
