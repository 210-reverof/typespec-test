import "@typespec/http";
using TypeSpec.Http;

@service({
  title: "Post Service",
})
@server("https://post-example.com/api", "Post API Endpoint")
namespace Post;

// 회원가입 API
@route("/register")
interface Register {
  post(user: NewUser): User;
}

model NewUser {
  username: string;
  email: string;
  password: string;
}

model User {
  id: string;
  username: string;
  email: string;
  createdAt: utcDateTime;
}

// 로그인 API  
@route("/login")
interface Login {
  post(credentials: LoginCredentials): AuthToken;
}

model LoginCredentials {
  username: string;
  password: string;
}

model AuthToken {
  accessToken: string;
  refreshToken: string;
  expiresIn: int32;
}

// 게시물 작성 API
@route("/posts")
interface Posts {
  @post()
  post(post: NewPost, authorization: string): Post;

  @get()
  list(authorization: string): Post[];
}

model NewPost {
  title: string;
  content: string;
}

model Post {
  id: string;
  title: string;
  content: string;
  author: User;
  createdAt: utcDateTime;
  updatedAt: utcDateTime;
}

model Sample {
  name: string;
  age: int64;
}
