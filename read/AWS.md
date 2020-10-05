## 워크샵

- 아키텍쳐 구현 순서
- AWS 구현
- 다이어그램 살펴본뒤
- 아키텍쳐 구성


- 서버리스 웹 호스팅과 CloudFront 웹 가속화 구성
- EC2- LAMP- ELB 구성하기
- VPC와 중계 서버(Bastion) 구성
- RDS for MySQL 생성하기
- Auto Scaling으로 확장성 및 탄력성 구현하기


- 준비
    - 기본적인 선수 지식 및 개념
        - 주요 AWS 서비스 : S3, CloudFront, Ec2 ,ELB, VPC, RDS, Auto Scaling
        - Linux O/S , TCP/IP , 네트워크 , MySql
    - AWS Account
    - IAM User 생성 및 설정
    
- 서버리스 웹 호스팅과 CloudFront로 웹 가속화 구성
    - 아키텍쳐에 구현할 기술
        - 서버가 없어도 구성이 가능한 정적 웹 호스팅을 만들고, 웹 속도를 높이기 위해서 콘텐츠 전송 네트워크 서비스를 연결
    - S3 , CloudFont
    
- S3 버킷이름 유효사항
    - 기존에 있는 버킷이름 불가능
    - 최소 3자 최대 65 사이만 가능
    - 소문자 숫자 . - 만 가능 
    
- 기본값은 Block all public access
    - 기본은 공용 퍼블릭을 제한한다.
    
    
    
- 서버리스 구축계획
- 람다함수 만들기
- 다이나모 디비 테이블 생성 람다 호출하기
- IAM으로 DynamoDB 접근 권한 생성하기
- API GateWay 구축 GET Method
- POST Method
- PUT Method
- DeleteMethod