# 지금 사용중인 이미지 이름
# nginx 이미지를 사용합니다. 뒤에 tag가 없으면 latest 를 사용합니다.
FROM nginx

# 이미지 내에서 명령어를 실행할(현 위치로 잡을) 디렉토리 설정
WORKDIR /home/node/build

# 이미지 생성 과정에서 실행할 명령어
# 이미지 생성 과정에서 npm 모듈을 설치가 된다.
# 기본 nginx 설정 파일을 삭제한다. (custom 설정과 충돌 방지)
RUN rm /etc/nginx/conf.d/default.conf

# host pc 의 nginx.conf 를 아래 경로에 복사
COPY ./nginx.conf /etc/nginx/conf.d

# 80 포트 오픈
EXPOSE 80

# 컨테이너 실행시 실행할 명령어
# WORKDIR에서 실행된다.
# 실행하자마자 설정이 된다.
# nginx 서버를 실행하고 백그라운드로 동작하도록 한다.
CMD ["nginx", "-g", "daemon off;"]

# 이미지 생성 명령어 (현 파일과 같은 디렉토리에서)
# . 는 Dockerfile이 있는 경로이다.
# docker build -t {원하는 이미지명} .

# 컨테이너 생성 & 실행 명령어
# -v $(pwd):/home/node/app : 현재 폴더와 컨테이너가 공유를 한다.
# -p 8080:8080 컨테이너의 8080을 : 집의 8080에 연결한다.
# -p 8080:8081 컨테이너의 8080을 : 집의 8081에 연결한다.
# docker run --name {컨테이너명} -v $(pwd):/home/node/app -p 8080:8080 {이미지명}