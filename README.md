"# SpringBootAws" 

Note:
	Region selection require: US East (N Virginia) or US East (N Virginia) for EC2
	Cần xác định đúng địa chỉ ip
	http://bullseye-ip-lookup.info/lookup.py
	http://docs.aws.amazon.com/general/latest/gr/rande.html

Login EC2
"C:\Program Files\Git\usr\bin\ssh.exe" 52.55.36.101 -l ec2-user -i keypairec2.pem
Using mvnw build project SpringBootAws to jar
Login EC2 and run jar   java -jar <file.jar>  (note update java 1.8)
Create group, user and role
	Role Type Amazon access
		AmazonS3FullAccess
		AmazonRDSFullAccess
	AcessKey AKIAJ2STHIJEGTPRTM6A
	Secret access key: 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
Create S3 s3groupeleven
	Region Singapore near
Create RSD
	Create secure -> segroupeleven
	Get connect MySQL test MySQL Workbench
	
Test localhost project


Create instance EC2 with AWS Linux AMI

Deploy App Spring boot
	Login EC2 
		"C:\Program Files\Git\usr\bin\ssh.exe" 54.85.117.143 -l ec2-user -i keypairec2.pem
	Config environment and update java compile
		sudo su
		yum remove java-1.7.0-openjdk -y
		yum install java-1.8.0
	
	Upload Project to EC2 AWS Linux AMI with WinSCP 
		http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/putty.html
		auto convert keypairec2.pem to keypairec2.ppk
	
	Using mvnw build project SpringBootAws to jar  mvnw clean package
	
	Login EC2 and run jar   java -jar <file.jar>  (note update java 1.8)
Upload Project to EC2 with WinSCP
http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/putty.html

