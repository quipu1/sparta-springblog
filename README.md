# README



## ๐ก Introduce

> 22.12.05 ~ 22.12.07

Spring์ผ๋ก ๋ก๊ทธ์ธ ์๋ ๋ธ๋ก๊ทธ๋ฅผ ๊ตฌํํฉ๋๋ค.

* ์ ์ฒด ๊ฒ์๊ธ ๋ชฉ๋ก ์กฐํ
* ๊ฒ์๊ธ ์์ฑ
* ์ ํํ ๊ฒ์๊ธ ์กฐํ, ์์ , ์ญ์ 



<br>



## โ Tool

<div>
    <img src = "https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white">
    <img src = "https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white">
    <img src = "https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white">
    <img src = "https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white">
</div>



<br>



## ๐ Usecase



![usecase](README.assets/usecase.png)



<br>



## ๐ API ๋ช์ธ

| ๊ธฐ๋ฅ                  | Method | URL            | Request                                                      | Response                                                     |
| :-------------------- | :----- | :------------- | :----------------------------------------------------------- | :----------------------------------------------------------- |
| ์ ์ฒด ๊ฒ์๊ธ ๋ชฉ๋ก ์กฐํ | GET    | /api/posts     | -                                                            | {<br/> { <br/>"createdAt": "2022-07-25T12:43:01.226062โ, <br/>"modifiedAt": "2022-07-25T12:43:01.226062โ,<br/> "id": 1, "title": "title2", "content": "content2",<br/> "author": "author2" <br/>}, <br/>{ <br/>"createdAt": "2022-07-25T12:43:01.226062โ, <br/>"modifiedAt": "2022-07-25T12:43:01.226062โ, <br/>"id": 2, <br/>"title": "title", <br/>"content": "content", <br/>"author": "author" <br/>}, <br/>โฆ <br/>} |
| ์ ํํ ๊ฒ์๊ธ ์กฐํ    | GET    | /api/post/{id} | -                                                            | { <br/>"createdAt": "2022-07-25T12:43:01.226062โ, <br/>"modifiedAt": "2022-07-25T12:43:01.226062โ, <br/>"id": 1, <br/>"title": "title2", <br/>"content": "content2", <br/>"author": "author2" <br/>} |
| ๊ฒ์๊ธ ์์ฑ           | POST   | /api/post      | {<br>"title" : "title", <br/>"content" : "content", <br/>"author" : "author", <br/>"password" : "password"<br/>} | { <br/>"createdAt": "2022-07-25T12:43:01.226062โ, <br/>"modifiedAt": "2022-07-25T12:43:01.226062โ, <br/>"id": 1, <br/>"title": "title", <br/>"content": "content", <br/>"author": "author" <br/>} |
| ์ ํํ ๊ฒ์๊ธ ์์     | PUT    | /api/post/{id} | {<br/>"title" : "newtitle", <br/>"content" : "newcontent", <br/>"author" : "author", <br/>"password" : "newpassword"<br/>} | { <br/>"createdAt": "2022-07-25T12:43:01.226062โ, <br/>"modifiedAt": "2022-07-25T12:43:01.226062โ, <br/>"id": 1, <br/>"title": "title2", <br/>"content": "content2", <br/>"author": "author2" <br/>} |
| ์ ํํ ๊ฒ์๊ธ ์ญ์     | DELETE | /api/post/{id} | { <br/>"password" :"password" <br/>}                         | {<br/> "success": true, <br/>}                               |



<br>



## ๐ Method

| ๊ธฐ๋ฅ               | Controller, Service    | (+)                       |
| ------------------ | ---------------------- | ------------------------- |
| ์ ์ฒด ๊ฒ์๊ธ ์กฐํ   | getPosts()             | ๋น๋ฐ๋ฒํธ ์ ์ธํ ์ ๋ณด ํ์ |
| ๊ฒ์๊ธ ์์ฑ        | createPost()           | -                         |
| ์ ํํ ๊ฒ์๊ธ ์กฐํ | getPost()              | ๋น๋ฐ๋ฒํธ ์ ์ธํ ์ ๋ณด ํ์ |
| ์ ํํ ๊ฒ์๊ธ ์์  | updatePost(), update() | ๋น๋ฐ๋ฒํธ ํ์ธ ํ ์คํ     |
| ์ ํํ ๊ฒ์๊ธ ์ญ์  | deletePost()           | ๋น๋ฐ๋ฒํธ ํ์ธ ํ ์คํ     |



<br>



## ๐ Answer a question

โ	**A1. ์์ , ์ญ์  API์ request๋ฅผ ์ด๋ค ๋ฐฉ์์ผ๋ก ์ฌ์ฉํ์จ๋์? (param, query, body)**

โ	=> body ์ฌ์ฉ / query์ param์ ์ฌ์ฉ ์, ์ฃผ์์ ๋ณ์๊ฐ๊ณผ ๋ณ์๋ก password๊ฐ ๋ค์ด๊ฐ์ ๋ ๋ณด์์ ์ ์ข์ ๊ฒ ๊ฐ๋ค๋ ์๊ฐ์ผ๋ก body๋ฅผ ์ผ์ต๋๋ค.

<br>

โ	**A2. ์ด๋ค ์ํฉ์ ์ด๋ค ๋ฐฉ์์ request๋ฅผ ์จ์ผํ๋์?** 

โ	=> param : ํ๋์ ๋ฐ์ดํฐ์ ๋ํ ์ ๋ณด๋ฅผ ๋ฐ์์ฌ ๋, ๋ฐ์ดํฐ๋ฅผ ์๋ณํ  ๋

โ	=> query : ์ฌ๋ฌ ๊ฐ์ ๋ฐ์ดํฐ๋ฅผ ๋๊ธธ ๋, ์ ๋ ฌ์ด๋ ํํฐ๋ง์ผ๋ก ์ํ๋ ์กฐ๊ฑด์ ๋ฐ์ดํฐ๋ฅผ ๋ฐ์์ฌ ๋

โ	=> body : JSON ๋ฑ์ ๋ฐ์ดํฐ๋ฅผ ๋ด์ ๋

<br>

โ	**A3. RESTfulํ API๋ฅผ ์ค๊ณํ๋์? ์ด๋ค ๋ถ๋ถ์ด ๊ทธ๋ฐ๊ฐ์? ์ด๋ค ๋ถ๋ถ์ด ๊ทธ๋ ์ง ์๋์?**

โ	=> ๊ฐ ๊ธฐ๋ฅ์ ๋ํด ์ ์ ํ API Method๋ฅผ ์ ํํ๊ณ  annotation์ ํตํด ํด๋น HTTP ์์ฒญ์ด ์์ ๋๋ง ๋์ํ๋๋ก RESTfulํ๊ฒ ๊ตฌํํ์ต๋๋ค.

<br>

โ	**A4. ์ ์ ํ ๊ด์ฌ์ฌ ๋ถ๋ฆฌ๋ฅผ ์ ์ฉํ์๋์? (Controller, Repository, Service)**

โ	=> ์ฌ์ฉ์์ ์์ฒญ์ ๋ฐ๋ ๊ณณ์ Controller, ์ค์ง์ ์ธ ์ฒ๋ฆฌ๋ฅผ ํ๋ ๊ณณ์ Service, DB์ ์ ๊ทผํ๋ ๋ฉ์๋๋ Repository๋ก ๋ถ๋ฆฌํ์ต๋๋ค.

<br>

โ	**A5. API ๋ช์ธ์ ์์ฑ ๊ฐ์ด๋๋ผ์ธ์ ๊ฒ์ํ์ฌ ์ง์  ์์ฑํ API ๋ช์ธ์์ ๋น๊ตํด๋ณด์ธ์!**

โ	=> statusCode๋ฅผ ์ถ๊ฐํ๊ณ  request์ query string๊ณผ body ๋ถ๋ถ์ ๋๋ ์ ์์ฑํ๋ค๋ฉด ๋ ์ข์์ ๊ฒ ๊ฐ๋ค.
