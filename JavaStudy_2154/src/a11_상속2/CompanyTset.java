package a11_상속2;

public class CompanyTset {

	public static void main(String[] args) {
		ElectronicsCompany samsung = new ElectronicsCompany("삼성전자");
		ElectronicsCompany lg = new ElectronicsCompany("LG");
		DeliveryCompany baemin = new DeliveryCompany("배달의 민족");
		DeliveryCompany yogiyo = new DeliveryCompany("요기요");
		
		samsung.setCompanyName("삼숭");
		
		Company samsung_company = samsung;
		Company lg_company = lg;
		Company baemin_company = baemin;
		Company yogiyo_company = yogiyo;
		
		samsung_company.setCompanyName("삼성");
		
	//	samsung.setCompanyName();
	//	lg.setCompanyName();
	//	baemin.setCompanyName();
	//	yogiyo.setCompanyName();
		
		samsung.showCompanyInfo();
		lg.showCompanyInfo();
		baemin.showCompanyInfo();
		yogiyo.showCompanyInfo();
		
		samsung.addFactory();
		lg.addFactory();
		baemin.addMotorcycle();
		yogiyo.addMotorcycle();
		
		samsung_company.showCompanyInfo();
		
		ElectronicsCompany down_samsung_company = (ElectronicsCompany)samsung_company;
		down_samsung_company.addFactory();
		
		Company c = new Company();
	//	ElectronicsCompany ec = (ElectronicsCompany)c;
	//	ec.addFactory();
	//	DeliveryCompany ed = (DeliveryCompany)c;
	//	ed.addMotorcycle();
		c.setCompanyName("삼성");
		c.showCompanyInfo();
		
		
	}

}
