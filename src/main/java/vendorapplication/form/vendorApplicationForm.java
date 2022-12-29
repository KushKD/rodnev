package vendorapplication.form;

import org.springframework.web.multipart.MultipartFile;
import vendorapplication.modal.FamilyMemberList;

import java.io.Serializable;
import java.util.List;

public class vendorApplicationForm implements Serializable {


    /**
     * Commmon Details
     */
    private String aadhaarNumber;  //new
    private String villageName; //New
    private String category; //new
    private String familyHead; //New
    private String educationalQualification; //new

    private String governmentEmp; //new
    private String selfEmp; //new
    private String outsourcedEmp; //new
    private String pmuEmp; //new
    private String privateEmp; //new

    private String cowNum;
    private String buffaloNum;
    private String otherNum;
    private String totalNum;

    private String buffaloMilkProduction;
    private String cowMilkProduction;
    private String houseMilkProduction;

    private String milkquantitySold;
    private String milkwheresold;
    private String milksellingprice;

    private String willingsellmilk;
    private String qyantitytosell;
    private String willingtosell;


    private String firstname;
    private String lastname;
    private String gender;
    private String mobileNumber;
    private String age;
    private String emailAddress;
    private String state;
    private String localBlock;
    private String localDistrict;
    private String localTehsil;
    private String localgp;
    private String p_address;
    private String vstate;
    private String vlocalDistrict;
    private String vlocalBlock;
    private String vlocalTehsil;
    private String vlocalgp;
    private String loc_address;
    private String fromDate;
    private String toDate;
    private String totalDays;
    private String nationality;
    private String vendor;
    private String vendorType;
    private String landType;
    private String regional_national;
    private String item;
    private  List<FamilyMemberList> itemsForm;
    private MultipartFile identityDoc;
    private MultipartFile photoDoc;
    private String captcha;
    private String roleId;
    private String numberItems;

    public String getWillingsellmilk() {
        return willingsellmilk;
    }

    public void setWillingsellmilk(String willingsellmilk) {
        this.willingsellmilk = willingsellmilk;
    }

    public String getQyantitytosell() {
        return qyantitytosell;
    }

    public void setQyantitytosell(String qyantitytosell) {
        this.qyantitytosell = qyantitytosell;
    }

    public String getWillingtosell() {
        return willingtosell;
    }

    public void setWillingtosell(String willingtosell) {
        this.willingtosell = willingtosell;
    }

    public String getMilksellingprice() {
        return milksellingprice;
    }

    public void setMilksellingprice(String milksellingprice) {
        this.milksellingprice = milksellingprice;
    }

    public String getMilkquantitySold() {
        return milkquantitySold;
    }

    public void setMilkquantitySold(String milkquantitySold) {
        this.milkquantitySold = milkquantitySold;
    }

    public String getMilkwheresold() {
        return milkwheresold;
    }

    public void setMilkwheresold(String milkwheresold) {
        this.milkwheresold = milkwheresold;
    }

    public String getHouseMilkProduction() {
        return houseMilkProduction;
    }

    public void setHouseMilkProduction(String houseMilkProduction) {
        this.houseMilkProduction = houseMilkProduction;
    }

    public String getBuffaloMilkProduction() {
        return buffaloMilkProduction;
    }

    public void setBuffaloMilkProduction(String buffaloMilkProduction) {
        this.buffaloMilkProduction = buffaloMilkProduction;
    }

    public String getCowMilkProduction() {
        return cowMilkProduction;
    }

    public void setCowMilkProduction(String cowMilkProduction) {
        this.cowMilkProduction = cowMilkProduction;
    }

    public String getCowNum() {
        return cowNum;
    }

    public void setCowNum(String cowNum) {
        this.cowNum = cowNum;
    }

    public String getBuffaloNum() {
        return buffaloNum;
    }

    public void setBuffaloNum(String buffaloNum) {
        this.buffaloNum = buffaloNum;
    }

    public String getOtherNum() {
        return otherNum;
    }

    public void setOtherNum(String otherNum) {
        this.otherNum = otherNum;
    }

    public String getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(String totalNum) {
        this.totalNum = totalNum;
    }

    public String getGovernmentEmp() {
        return governmentEmp;
    }

    public void setGovernmentEmp(String governmentEmp) {
        this.governmentEmp = governmentEmp;
    }

    public String getSelfEmp() {
        return selfEmp;
    }

    public void setSelfEmp(String selfEmp) {
        this.selfEmp = selfEmp;
    }

    public String getOutsourcedEmp() {
        return outsourcedEmp;
    }

    public void setOutsourcedEmp(String outsourcedEmp) {
        this.outsourcedEmp = outsourcedEmp;
    }

    public String getPmuEmp() {
        return pmuEmp;
    }

    public void setPmuEmp(String pmuEmp) {
        this.pmuEmp = pmuEmp;
    }

    public String getPrivateEmp() {
        return privateEmp;
    }

    public void setPrivateEmp(String privateEmp) {
        this.privateEmp = privateEmp;
    }

    public String getFamilyHead() {
        return familyHead;
    }

    public void setFamilyHead(String familyHead) {
        this.familyHead = familyHead;
    }

    public String getEducationalQualification() {
        return educationalQualification;
    }

    public void setEducationalQualification(String educationalQualification) {
        this.educationalQualification = educationalQualification;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLocalBlock() {
        return localBlock;
    }

    public void setLocalBlock(String localBlock) {
        this.localBlock = localBlock;
    }

    public String getLocalDistrict() {
        return localDistrict;
    }

    public void setLocalDistrict(String localDistrict) {
        this.localDistrict = localDistrict;
    }

    public String getLocalTehsil() {
        return localTehsil;
    }

    public void setLocalTehsil(String localTehsil) {
        this.localTehsil = localTehsil;
    }

    public String getLocalgp() {
        return localgp;
    }

    public void setLocalgp(String localgp) {
        this.localgp = localgp;
    }

    public String getP_address() {
        return p_address;
    }

    public void setP_address(String p_address) {
        this.p_address = p_address;
    }

    public String getVstate() {
        return vstate;
    }

    public void setVstate(String vstate) {
        this.vstate = vstate;
    }

    public String getVlocalDistrict() {
        return vlocalDistrict;
    }

    public void setVlocalDistrict(String vlocalDistrict) {
        this.vlocalDistrict = vlocalDistrict;
    }

    public String getVlocalBlock() {
        return vlocalBlock;
    }

    public void setVlocalBlock(String vlocalBlock) {
        this.vlocalBlock = vlocalBlock;
    }

    public String getVlocalTehsil() {
        return vlocalTehsil;
    }

    public void setVlocalTehsil(String vlocalTehsil) {
        this.vlocalTehsil = vlocalTehsil;
    }

    public String getVlocalgp() {
        return vlocalgp;
    }

    public void setVlocalgp(String vlocalgp) {
        this.vlocalgp = vlocalgp;
    }

    public String getLoc_address() {
        return loc_address;
    }

    public void setLoc_address(String loc_address) {
        this.loc_address = loc_address;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(String totalDays) {
        this.totalDays = totalDays;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getVendorType() {
        return vendorType;
    }

    public void setVendorType(String vendorType) {
        this.vendorType = vendorType;
    }

    public String getLandType() {
        return landType;
    }

    public void setLandType(String landType) {
        this.landType = landType;
    }

    public String getRegional_national() {
        return regional_national;
    }

    public void setRegional_national(String regional_national) {
        this.regional_national = regional_national;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public List<FamilyMemberList> getItemsForm() {
        return itemsForm;
    }

    public void setItemsForm(List<FamilyMemberList> itemsForm) {
        this.itemsForm = itemsForm;
    }

    public MultipartFile getIdentityDoc() {
        return identityDoc;
    }

    public void setIdentityDoc(MultipartFile identityDoc) {
        this.identityDoc = identityDoc;
    }

    public MultipartFile getPhotoDoc() {
        return photoDoc;
    }

    public void setPhotoDoc(MultipartFile photoDoc) {
        this.photoDoc = photoDoc;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getNumberItems() {
        return numberItems;
    }

    public void setNumberItems(String numberItems) {
        this.numberItems = numberItems;
    }

    @Override
    public String toString() {
        return "vendorApplicationForm{" +
                "aadhaarNumber='" + aadhaarNumber + '\'' +
                ", villageName='" + villageName + '\'' +
                ", category='" + category + '\'' +
                ", familyHead='" + familyHead + '\'' +
                ", educationalQualification='" + educationalQualification + '\'' +
                ", governmentEmp='" + governmentEmp + '\'' +
                ", selfEmp='" + selfEmp + '\'' +
                ", outsourcedEmp='" + outsourcedEmp + '\'' +
                ", pmuEmp='" + pmuEmp + '\'' +
                ", privateEmp='" + privateEmp + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", age='" + age + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", state='" + state + '\'' +
                ", localBlock='" + localBlock + '\'' +
                ", localDistrict='" + localDistrict + '\'' +
                ", localTehsil='" + localTehsil + '\'' +
                ", localgp='" + localgp + '\'' +
                ", p_address='" + p_address + '\'' +
                ", vstate='" + vstate + '\'' +
                ", vlocalDistrict='" + vlocalDistrict + '\'' +
                ", vlocalBlock='" + vlocalBlock + '\'' +
                ", vlocalTehsil='" + vlocalTehsil + '\'' +
                ", vlocalgp='" + vlocalgp + '\'' +
                ", loc_address='" + loc_address + '\'' +
                ", fromDate='" + fromDate + '\'' +
                ", toDate='" + toDate + '\'' +
                ", totalDays='" + totalDays + '\'' +
                ", nationality='" + nationality + '\'' +
                ", vendor='" + vendor + '\'' +
                ", vendorType='" + vendorType + '\'' +
                ", landType='" + landType + '\'' +
                ", regional_national='" + regional_national + '\'' +
                ", item='" + item + '\'' +
                ", itemsForm=" + itemsForm +
                ", identityDoc=" + identityDoc +
                ", photoDoc=" + photoDoc +
                ", captcha='" + captcha + '\'' +
                ", roleId='" + roleId + '\'' +
                ", numberItems='" + numberItems + '\'' +
                '}';
    }
}
