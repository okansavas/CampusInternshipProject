package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class DialogContent extends ParentPage {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[formcontrolname='username']")
    public WebElement username;
    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;
    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;
    @FindBy(xpath = "//span[text()='Internship']")
    public WebElement headText;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    public WebElement codeInput;
    @FindBy(xpath = "//ms-save-button/button")
    public WebElement saveButton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successMessage;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName' ]//input")
    public WebElement shortName;
    @FindBy(xpath = "//div[contains(text(),'already')]")
    public WebElement alreadyExist;
    @FindBy(xpath = "//ms-text-field//input[@data-placeholder='Name']")
    public WebElement searchInput;
    @FindBy(xpath = "//div[@class='control-full']/button")
    public WebElement searchButton;
    @FindBy(xpath = "//ms-delete-button//button")
    public WebElement deleteImageBtn;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBtn;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    public WebElement integrationCode;
    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    public WebElement priorityCode;
    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']")
    public WebElement toggleBar;
    @FindBy(xpath = "//mat-chip-list[@formcontrolname='roles' ]//input")
    public WebElement userType;
    @FindBy(xpath = "//span[text()=' Student ']")
    public WebElement student;
    @FindBy(xpath = "//span[text()=' Administrator ']")
    public WebElement administrator;
    @FindBy(xpath = "//tbody//tr//td[2]")
    public List<WebElement> nameList;
    @FindBy(xpath = "(//*[@data-icon='bars'])[1]")
    public WebElement hamburgerMenu;
    @FindBy(xpath = "//*[contains(text(),'Messaging')]")
    public WebElement hamburgerMessaging;
    @FindBy(xpath = "//*[contains(text(),'Finance')]")
    public WebElement hamburgerFinance;
    @FindBy(xpath = "//*[contains(text(),'My Finance')]")
    public WebElement hamburgerMyFinance;
    @FindBy(xpath = "(//student-image)[1]")
    public WebElement Studentbutton;
    @FindBy(xpath = "//div[@class='mdc-form-field mat-internal-form-field']/div[@class='mdc-radio']")
    public WebElement Stripe;
    @FindBy(xpath = "//mat-radio-button[@class='mat-mdc-radio-button mat-accent ng-star-inserted']//div[@class='mdc-radio']")
    public WebElement PayinFullButton;
    @FindBy(xpath = "//input[@id='mat-radio-54-input']")
    public WebElement Payinput;
    @FindBy(xpath = "//div[@class='mdc-form-field mat-internal-form-field']/div[@class='mdc-radio']")
    public WebElement Amountfield;
    @FindBy(xpath = "//span[contains(text(),'Pay')]")
    public WebElement Paybutton;
    @FindBy(xpath = "//div//*[contains(text(),'Student Payment successfully created')]")
    public WebElement Paymentverify;

    @FindBy(xpath = "//span[contains(text(),'Grading')]")
    public WebElement Gradingbutton;
    @FindBy(xpath = "//span[contains(text(),' Student Transcript ')]")
    public WebElement Studenttranscript;
    @FindBy(xpath = "//span[contains(text(),'Print')]")
    public WebElement Studenttranscriptdownload;
    @FindBy(xpath = "//button[@title='Yazdır (Ctrl+P)']")
    public WebElement Studenttranscriptprint;
    @FindBy(xpath = "//span[contains(text(),'Kaydet')]")
    public WebElement Studenttranscriptsave;

    @FindBy(xpath = "//span[contains(text(),'Course Grade')]")
    public WebElement coursegrade;
    @FindBy(xpath = "//faicon[@class='ng-fa-icon ng-star-inserted']//span[@class='mat-mdc-focus-indicator']")
    public WebElement coursegradedownload;
    @FindBy(xpath = "//button[@class='c0174 c0189 c0179 c0188 c0163 c0166']")
    public WebElement coursegradeprint;
    @FindBy(xpath = "button[@class='c01123 c01146 c01124']")
    public WebElement coursegradesave;



    @FindBy(xpath = "//input[@id='Field-numberInput']")
    public WebElement Cardnumberfield;
    @FindBy(xpath = "//input[@id='Field-expiryInput']")
    public WebElement Expirationfield;
    @FindBy(xpath = "//input[@id='Field-cvcInput']")
    public WebElement Cvcfield;
    @FindBy(xpath = "//form[@id='payment-form']")
    public WebElement paymentbutton;
    @FindBy(xpath = "//div[@class='mat-badge mat-badge-accent mat-badge-above mat-badge-after mat-badge-small']")
    public WebElement messagebutton;
    @FindBy(xpath = "//td[contains(text(),'Mon May 27, 2024 00:18')]")
    public WebElement paymentstatus;
    @FindBy(xpath = "//button[@style='background: inherit;']//span[@class='mat-mdc-focus-indicator']")
    public WebElement paymentstatusbttn;
    @FindBy(xpath = "//div[contains(text(),'Payment Intent Id : pi_3PKpolLLiYGgcZNg0LjrJjfv')]")
    public WebElement paymentstatustext;

    @FindBy(xpath = "//*[contains(text(),'New Message')]")
    public WebElement hamburgerNewMessage;
    @FindBy(xpath = "//*[contains(text(),'Calendar')]")
    public WebElement calendarMenu;
    @FindBy(xpath = "//*[contains(text(),'Trash')]")
    public WebElement hamburgerTrash;
    @FindBy(xpath = "//span[text()=' Students Fees ']")
    public WebElement studentFees;
    @FindBy(css = "[class='example-full-width full-size example-container-grid'] cdk-virtual-scroll-viewport+div>div>button")
    public WebElement threePointMenu;
    @FindBy(xpath = "//*[text()=' Excel Export ']")
    public WebElement excelReport;
    @FindBy(xpath = "//*[@data-icon='angle-down']")
    public WebElement profileSettings;
    @FindBy(xpath = "//span[text()='Settings']")
    public WebElement settings;
    @FindBy(css = "[formcontrolname='theme'] svg")
    public WebElement arrowButton;
    @FindBy(xpath = "//span[@class='mdc-list-item__primary-text']")
    public List<WebElement> themeList;
    @FindBy(xpath = "//*[@value='indigo-theme']")
    public WebElement indigoTheme;
    @FindBy(xpath = "//*[@icon='trash-restore']")
    public WebElement recoveryIcon;
    @FindBy(xpath = "//ms-delete-button[@table='true']/button")
    public WebElement garbageIcon;
    @FindBy(xpath = "//div[contains(text(),'Do you want to delete')]")
    public WebElement deleteMessage;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteButton;
    @FindBy(xpath = "//button//*[contains(text(),'Attendance')]")
    public WebElement attendanceButton;
    @FindBy(xpath = "//div//*[contains(text(),'ATTENDANCE EXCUSES')]")
    public WebElement excuseButton;
    @FindBy(xpath = "(//ms-add-button/button/span)[2]")
    public WebElement addExcuseButton;
    @FindBy(xpath = "//span[@class='title dialog-title']")
    public WebElement dialogTitle;
    @FindBy(xpath = "//div//*[contains(text(),'Full Day')]")
    public WebElement dateType;
    @FindBy(xpath = "(//div//*[contains(text(),'Full Day')])[2]")
    public WebElement fullDaySelected;
    @FindBy(xpath = "//div//*[contains(text(),'Date Range')]")
    public WebElement dateRangeSelected;
    @FindBy(xpath = "//input[@formcontrolname='date']")
    public WebElement date;
    @FindBy(xpath = "//input[@formcontrolname='startDate']")
    public WebElement startDate;
    @FindBy(xpath = "//input[@formcontrolname='endDate']")
    public WebElement endDate;
    @FindBy(css = "textarea")
    public WebElement excuseMessage;
    @FindBy(xpath = "//button[@role='menuitem']")
    public WebElement attachButton;
    @FindBy(xpath = "//button//*[contains(text(),'From My Files')]")
    public WebElement fromMyFiles;
    @FindBy(xpath = "//button//*[contains(text(),'From Local')]")
    public WebElement fromLocal;
    @FindBy(xpath = "//button//*[contains(text(),'From Google Drive')]")
    public WebElement fromDrive;
    @FindBy(xpath = "//button//*[contains(text(),'Send')]")
    public WebElement sendButton;
    @FindBy(xpath = "//div/h4/strong")
    public WebElement weekDate;
    @FindBy(xpath = "(//ms-browse//div[@class='ng-star-inserted']/div[@class='ng-star-inserted'])[1]")
    public WebElement pIcon;
    @FindBy(xpath = "(//ms-browse//div[@class='ng-star-inserted']/div[@class='ng-star-inserted'])[2]")
    public WebElement sIcon;
    @FindBy(xpath = "(//ms-browse//div[@class='ng-star-inserted']/div[@class='ng-star-inserted'])[3]")
    public WebElement eIcon;
    @FindBy(xpath = "(//ms-browse//div[@class='ng-star-inserted']/div[@class='ng-star-inserted'])[4]")
    public WebElement cIcon;
    @FindBy(xpath = "(//*[contains(text(),'Calendar')])[4]")
    public WebElement calendarButton;
    @FindBy(xpath = "//button[@title='Google Calendar']")
    public WebElement googleCalendar;
    @FindBy(xpath = "//*[contains(text(),'Weekly')]")
    public WebElement weeklyPlan;
    @FindBy(xpath = "(//button[@mat-icon-button]/span[@class='mat-mdc-focus-indicator'])[4]")
    public WebElement backwardIcon;
    @FindBy(xpath = "(//button[@mat-icon-button]/span[@class='mat-mdc-focus-indicator'])[6]")
    public WebElement forwardIcon;
    @FindBy(xpath = "(//button[@mat-icon-button]/span[@class='mat-mdc-focus-indicator'])[5]")
    public WebElement todayIcon;
    @FindBy(xpath = "(//td[@class='column100 column1 details ng-star-inserted'])[1]")
    public WebElement lesson1;
    @FindBy(xpath = "(//td[@class='column100 column1 details ng-star-inserted'])[2]")
    public WebElement lesson2;
    @FindBy(xpath = "(//td[@class='column100 column1 details ng-star-inserted'])[3]")
    public WebElement lesson3;
    @FindBy(xpath = "(//td[@class='column100 column1 details ng-star-inserted'])[4]")
    public WebElement lesson4;
    @FindBy(xpath = "(//td[@class='column100 column1 details ng-star-inserted'])[5]")
    public WebElement lesson5;
    @FindBy(xpath = "(//td[@class='column100 column1 details ng-star-inserted'])[6]")
    public WebElement lesson6;
    @FindBy(xpath = "(//td[@class='column100 column1 details ng-star-inserted'])[7]")
    public WebElement lesson7;
    @FindBy(xpath = "(//td[@class='column100 column1 details ng-star-inserted'])[8]")
    public WebElement lesson8;
    @FindBy(xpath = "(//td[@class='column100 column1 details ng-star-inserted'])[9]")
    public WebElement lesson9;
    @FindBy(xpath = "(//td[@class='column100 column1 details ng-star-inserted'])[10]")
    public WebElement lesson10;
    @FindBy(xpath = "(//td[@class='column100 column1 details ng-star-inserted'])[11]")
    public WebElement lesson11;
    @FindBy(xpath = "(//td[@class='column100 column1 details ng-star-inserted'])[12]")
    public WebElement lesson12;
    @FindBy(xpath = "(//td[@class='column100 column1 details ng-star-inserted'])[13]")
    public WebElement lesson13;
    @FindBy(xpath = "(//td[@class='column100 column1 details ng-star-inserted'])[14]")
    public WebElement lesson14;
    @FindBy(xpath = "(//td[@class='column100 column1 details ng-star-inserted'])[15]")
    public WebElement lesson15;
    @FindBy(xpath = "(//td[@class='column100 column1 details ng-star-inserted'])[16]")
    public WebElement lesson16;
    @FindBy(xpath = "(//td[@class='column100 column1 details ng-star-inserted'])[17]")
    public WebElement lesson17;
    @FindBy(xpath = "(//td[@class='column100 column1 details ng-star-inserted'])[18]")
    public WebElement lesson18;
    @FindBy(xpath = "(//td[@class='column100 column1 details ng-star-inserted'])[19]")
    public WebElement lesson19;
    @FindBy(xpath = "(//td[@class='column100 column1 details ng-star-inserted'])[20]")
    public WebElement lesson20;
    @FindBy(xpath = "//div[@class='ng-star-inserted']/img")
    public WebElement CompanyLogo;
    @FindBy(xpath = "//*[contains(text(),'Students Fees')]")
    public WebElement StudentFees;
    @FindBy(xpath = "//*[contains(text(),'Student ID')]")
    public WebElement StudentLine;
    @FindBy(xpath = "//*[contains(text(),'Fee/Balance Detail')]")
    public WebElement FeeBalanceDetail;
    @FindBy(xpath = "//*[contains(text(),'Date')]")
    public WebElement FinanceTable;
    @FindBy(xpath = "//*[contains(text(),'BIOLOGY')]")
    public WebElement biology;
    @FindBy(xpath = "//div[@id='cdk-overlay-9']")
    public WebElement DialogPage;
    @FindBy(xpath = "//span[@class='fc-icon fc-icon-chevron-left']")
    public WebElement leftButton;
    @FindBy(xpath = "//*[contains(text(),'0')]")
    public WebElement pubLesson;
    @FindBy(xpath = "//*[contains(text(),'Recording')]")
    public WebElement Recordingbutton;
    @FindBy(xpath = "//*[contains(text(),'Play Video')]")
    public WebElement Playvideo;
    @FindBy(xpath = "//*[contains(text(),'Calendar')]")
    public WebElement CalendarMenu;
    @FindBy(xpath = "(//tr/td)[9]")
    public WebElement Student_image;
    @FindBy(xpath = "//label[text()='Stripe ']")  //input[@type='radio' and @value='STRIPE']
    public WebElement StripeButton;
    @FindBy(xpath = "(//span[text()='Pay'])[1]") //(//span[text()='Pay'])[1]
    public WebElement payRadio;
    @FindBy(xpath = "//span[@class='w-50-p discount-class']") ////span[text()='Pay in full $1,729.00 at once.']
    public WebElement payinFullRadio;
    @FindBy(xpath = "//input[@placeholder='Amount']")
    public WebElement amountInput;
    @FindBy(xpath = "(//span[text()='Pay'])[2]")
    public WebElement payButton;
    @FindBy(id = "Field-numberInput")
    public WebElement cardNumber;
    @FindBy(id = "Field-expiryInput")
    public WebElement expiration;
    @FindBy(id = "Field-cvcInput")
    public WebElement cvc;
    @FindBy(xpath = "//*[@class='stripe-img']")
    public WebElement StripePaymentsButton;
    @FindBy(xpath = "//span[text()=' Student_9 11A']")
    public WebElement studentName;
    @FindBy(xpath = "//*[contains(text(),'Assignments')]")
    public WebElement assignments;
    @FindBy(xpath = "//mat-tooltip-component/div/div")
    public WebElement numberOfAssignments;
    @FindBy(xpath = "//mat-select[@id='mat-select-4']")
    public WebElement semester;
    @FindBy(xpath = "//mat-option[@value='all']")
    public WebElement allOption;
    @FindBy(xpath = "//fa-icon[@matsuffix]")
    public List<WebElement> assignmentsRow;
    @FindBy(xpath = "//span[text()='Grading']")
    public WebElement grading;
    @FindBy(xpath = "//*[text()=' Student Transcript ']")
    public WebElement studentTranscript;
    @FindBy(xpath = "//span[text()=' Internship ']")
    public WebElement internShipText;
    @FindBy(xpath = "//*[text()=' Transcript By Subject ']")
    public WebElement transcriptBySubject;
    @FindBy(xpath = "//*[text()=' Subject ']")
    public WebElement subjectText;
    @FindBy(xpath = "//*[text()=' Course Grade ']")
    public WebElement courseGrade;
    @FindBy(xpath = "//span[text()=' AVERAGE ']")
    public WebElement averageText;
    @FindBy(xpath = "//*[@data-icon='memo-circle-info']/ancestor::node()[4]")
    public List<WebElement> homeworks;
    @FindBy(xpath = "(//button[@mat-icon-button]/span[@class='mat-mdc-focus-indicator'])[4]")
    public WebElement discussionIcon;
    @FindBy(xpath = "//ms-standard-button[@icon='users']/button")
    public WebElement contactsIcon;
    @FindBy(xpath = "(//user-image)[3]/ancestor::node()[4]")
    public WebElement personIcon;
    @FindBy(xpath = "(//ms-icon-button[@icon='paperclip'])[2]")
    public WebElement attachIcon;
    @FindBy(css = "textarea")
    public WebElement textarea;
    @FindBy(xpath = "//ms-icon-button[@icon='paper-plane']")
    public WebElement sendIcon;
    @FindBy(xpath = "(//bdi)[last()]")
    public WebElement lastMessageInPopup;
    @FindBy(xpath = "((//bdi)[last()]/ancestor::node()[5]/div)[3]/div")
    public WebElement dateInPopup;
    @FindBy(xpath = "//ms-standard-button[@icon='messages']/button")
    public WebElement chatsIcon;
    @FindBy(xpath = "(//mat-selection-list/mat-list-option/span/span/div/div)[2]")
    public WebElement previousDiscuss;
    @FindBy(xpath = "//ms-icon-button[@icon='info']/button")
    public List<WebElement> infoIcon;
    @FindBy(xpath = "//ms-icon-button[@icon='star']/button")
    public List<WebElement> favoriteIcon;
    @FindBy(xpath = "//ms-icon-button[@icon='file-import']/button")
    public WebElement importIcon;
    @FindBy(xpath = "//ms-icon-button[@icon='comments-alt']/button")
    public WebElement commentIcon;
    @FindBy(xpath = "(//button[@mat-icon-button])[3]")
    public WebElement returnButton;
    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    public WebElement closeButton;


    public void deleteItem(String deleteName) {
        mySendKeys(searchInput, deleteName);
        myClick(searchButton);

        //search butonun tiklanabilir olana kadar bekle
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));

        myClick(deleteImageBtn);
        myClick(deleteDialogBtn);
    }

    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "addButton":
                return this.addButton;
            case "nameInput":
                return this.nameInput;
            case "codeInput":
                return this.codeInput;
            case "saveButton":
                return this.saveButton;
            case "shortName":
                return this.shortName;
            case "integrationCode":
                return this.integrationCode;
            case "priorityCode":
                return this.priorityCode;
            case "toggleBar":
                return this.toggleBar;
            case "userType":
                return this.userType;
            case "student":
                return this.student;
            case "administrator":
                return this.administrator;
            case "Trash":
                return this.hamburgerTrash;
            case "trash-restore":
                return this.recoveryIcon;
            case "garbage-box":
                return this.garbageIcon;
            case "Delete":
                return this.deleteButton;
            case "Attendance":
                return this.attendanceButton;
            case "Attendance Excuses":
                return this.excuseButton;
            case "Add Attendance Excuse":
                return this.addExcuseButton;
            case "Date Type":
                return this.dateType;
            case "Full Day":
                return this.fullDaySelected;
            case "Date Range":
                return this.dateRangeSelected;
            case "Attach Files":
                return this.attachButton;
            case "From Local":
                return this.fromLocal;
            case "From My Files":
                return this.fromMyFiles;
            case "From Google Drive":
                return this.fromDrive;
            case "Send":
                return this.sendButton;
            case "Calendar":
                return this.calendarMenu;
            case "P":
                return this.pIcon;
            case "C":
                return this.cIcon;
            case "E":
                return this.eIcon;
            case "S":
                return this.sIcon;
            case "calendarBtn":
                return this.calendarButton;
            case "Weekly Course Plan":
                return this.weeklyPlan;
            case "Backward":
                return this.backwardIcon;
            case "Forward":
                return this.forwardIcon;
            case "Today":
                return this.todayIcon;
            case "1":
                return this.lesson1;
            case "2":
                return this.lesson2;
            case "3":
                return this.lesson3;
            case "4":
                return this.lesson4;
            case "5":
                return this.lesson5;
            case "6":
                return this.lesson6;
            case "7":
                return this.lesson7;
            case "8":
                return this.lesson8;
            case "9":
                return this.lesson9;
            case "10":
                return this.lesson10;
            case "11":
                return this.lesson11;
            case "12":
                return this.lesson12;
            case "13":
                return this.lesson13;
            case "14":
                return this.lesson14;
            case "15":
                return this.lesson15;
            case "16":
                return this.lesson16;
            case "17":
                return this.lesson17;
            case "18":
                return this.lesson18;
            case "19":
                return this.lesson19;
            case "20":
                return this.lesson20;
            case "CompanyLogo":
                return this.CompanyLogo;
            case "Student_image":
                return this.Student_image;
            case "StripeButton":
                return this.StripeButton;
            case "payRadio":
                return this.payRadio;
            case "payinFullRadio":
                return this.payinFullRadio;
            case "Assignments":
                return this.assignments;
            case "Discussion":
                return this.discussionIcon;
            case "Contacts":
                return this.contactsIcon;
            case "Files":
                return this.attachIcon;
            case "Chats":
                return this.chatsIcon;
            case "Submit":
                return this.importIcon;
            case "Comment":
                return this.commentIcon;
        }
        return null;
    }

    public WebElement getWebElement2(String strElement) {

        switch (strElement) {
            case "hamburgerMenu":
                return this.hamburgerMenu;
            case "hamburgerFinance":
                return this.hamburgerFinance;
            case "threePointMenu":
                return this.threePointMenu;
            case "excelReport":
                return this.excelReport;
            case "profileSettings":
                return this.profileSettings;
            case "settings":
                return this.settings;
            case "arrowButton":
                return this.arrowButton;
            case "indigoTheme":
                return this.indigoTheme;
            case "saveButton":
                return this.saveButton;
            case "grading":
                return this.grading;
            case "studentTranscript":
                return this.studentTranscript;
            case "transcriptBySubject":
                return this.transcriptBySubject;
            case "courseGrade":
                return this.courseGrade;
        }

        return null;
    }

    @FindBy(xpath = "//ms-button[@icon='users-medical']/button")
    public WebElement addReceivers;


    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    public WebElement checkboxStudent2;

    @FindBy(xpath = "//*[contains(text(),'Add & Close')]")
    public WebElement buttonAddAndClose;

    @FindBy(xpath = "//*[text()='Outbox']")
    public WebElement outbox;

    @FindBy(xpath = "(//*[@icon='shopping-basket'])[1]")
    public WebElement moveToTrash;

    @FindBy(xpath = "//*[@class='cdk-overlay-container']//strong")
    public WebElement confirmDeleteOutboxMessage;

    @FindBy(xpath = "(//*[@class='cdk-overlay-container']//button)[2]")
    public WebElement yesDelete;

    @FindBy(xpath = "(//*[contains(text,'successfully')")
    public WebElement confirmationOfDeletion;

    public List<WebElement> getListWebElement(String element) {
        switch (element) {
            case "Info":
                return this.infoIcon;
            case "Favorite":
                return this.favoriteIcon;
        }
        return null;
    }

}