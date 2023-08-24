FROM mysql:8.1

# 이미지 환경변수들 세팅
# 실전에서는 비밀번호 등을 이곳에 입력하지 말 것!
# 서버의 환경변수 등을 활용하세요.
ENV MYSQL_USER mysql_user
ENV MYSQL_PASSWORD mysql_password
ENV MYSQL_ROOT_PASSWORD mysql_root_password
ENV MYSQL_DATABASE visitlog

# 도커환경에서 컨테이너 생성시 스크립트를 실행하는 폴더로
# 미리 작성된 스크립트들을 이동
# 현재 로컬에 있는 ./scripts 파일들을 /docker-entrypoint-initdb.d/ 에 복사하는 것
# FROM mysql:5.7 의 이미지는 /docker-entrypoint-initdb.d/ 이파일들을 참조하도록 설계
# COPY는 이미지를 생성하는 과정에서 해당 이미지안에 복사해서 넣는 것
# -v 과는 다르다 volum은 외부 폴더와 컨테이너 폴더와 연결하는 과정
COPY ./scripts/ /docker-entrypoint-initdb.d/

# 이미지 빌드 명령어 (현 파일과 같은 디렉토리에서)
# docker build -t {이미지명} .

# 실행 명령어 (터미널에 로그 찍히는 것 보기)
# docker run --name {컨테이너명} -it -p 3306:3306 {이미지명}

# 실행 명령어 (데몬으로 실행)
# docker run --name {컨테이너명} -p 3306:3306 -d {이미지명}

# 도커의 컨테이너 실행 로그를 보는 방법
# docker logs -f {컨테이너명}