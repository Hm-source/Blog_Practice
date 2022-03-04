# Blog_Practice
블로그 기본 기능 구현 및 추가 기능 구현

## Blog 기본 기능 개발
<br>

1. 글 목록 기능 개발

  * 메인 페이지에서 모든 글의 목록을 조회할 수 있다.
  * Mustache를 활용한다.

  * 개발 순서는
    1. MyBatis Mapper 개발
    2. Service 개발
    3. Controller 개발
    4. Mustache 파일 개발

<br>
<br>

2. 글 목록 더보기 기능 개발
  * Blog 글의 개수가 많아지면 한 번에 모든 글을 조회 불가능하다.
  * Paging(더보기) 기능으로 정해진 수 만큼의 추가 데이터를 조회한다.
  * Paging을 위해 2개의 정보를 활용한다.
    + 조회할 현재 Page
    + Page 당 조회 데이터의 개수
   
  * Page 구현의 종류 
    + page 번호가 있고 번호를 누르면 그 페이지의 다음 게시물 리스트를 볼 수 있음.
    + 더보기 버튼을 눌러서 페이지 글을 연속적으로 더 볼 수 있도록 함
    + 스크롤을 내리면 리스트들이 나타남.
  
  여기서는 Blog Index(메인페이지) 진입 시 상위 3개의 글만 조회되고 <br>
  MORE 버튼을 클릭할 때마다 3개의 추가 데이터를 조회할 수 있도록 한다.
  
  * page 별 블로그 글 데이터 조회 API 호출
  * jQuery Ajax 사용
  * Response 데이텉를 활용하여 HTML 태그를 append


  
