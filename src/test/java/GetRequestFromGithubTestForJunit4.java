import io.restassured.response.Response;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static io.restassured.RestAssured.get;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GetRequestFromGithubTestForJunit4 {
    String stringURL = "https://api.github.com/users/rusakov66";
    Response response = get(stringURL);
    public JSONObject jsonResponse = new JSONObject(response.asString());

    @Test
    public void getStatusLineAndStatusCode() throws JSONException {
        int i = response.getStatusCode();
        System.out.println("----------- Status code is " + i);
        String statusLine = response.getStatusLine();
        assertThat(statusLine, is("HTTP/1.1 200 OK"));
        System.out.println(statusLine);
    }

    @Test
    public void getRequestFromGithubTest1() throws JSONException {
        String login = jsonResponse.getString("login");
        assertThat(login, is("rusakov66"));
    }

    @Test
    public void getRequestFromGithubTes2() throws JSONException {
        String name = jsonResponse.getString("name");
        assertThat(name, is("Iurii Rusakov"));
    }

    @Test
    public void getRequestFromGithubTes3() throws JSONException {
        int id = jsonResponse.getInt("id");
        assertThat(id, equalTo(16705398));
    }

    @Test
    public void getRequestFromGithubTest4() throws JSONException {
        String node_id = jsonResponse.getString("node_id");
        assertThat(node_id, is("MDQ6VXNlcjE2NzA1Mzk4"));
    }

    @Test
    public void getRequestFromGithubTest5() throws JSONException {
        String url = jsonResponse.getString("url");
        assertThat(url, is("https://api.github.com/users/rusakov66"));
    }

    @Test
    public void getRequestFromGithubTest6() throws JSONException {
        String html_url = jsonResponse.getString("html_url");
        assertThat(html_url, is("https://github.com/rusakov66"));
    }

    @Test
    public void getRequestFromGithubTest7() throws JSONException {
        String followers_url = jsonResponse.getString("followers_url");
        assertThat(followers_url, is("https://api.github.com/users/rusakov66/followers"));
    }

    @Test
    public void getRequestFromGithubTest8() throws JSONException {
        String following_url = jsonResponse.getString("following_url");
        assertThat(following_url, is("https://api.github.com/users/rusakov66/following{/other_user}"));
    }

    @Test
    public void getRequestFromGithubTest9() throws JSONException {
        String gists_url = jsonResponse.getString("gists_url");
        assertThat(gists_url, is("https://api.github.com/users/rusakov66/gists{/gist_id}"));
    }

    @Test
    public void getRequestFromGithubTest10() throws JSONException {
        String starred_url = jsonResponse.getString("starred_url");
        assertThat(starred_url, is("https://api.github.com/users/rusakov66/starred{/owner}{/repo}"));
    }

    @Test
    public void getRequestFromGithubTest11() throws JSONException {
        String subscriptions_url = jsonResponse.getString("subscriptions_url");
        assertThat(subscriptions_url, is("https://api.github.com/users/rusakov66/subscriptions"));
    }

    @Test
    public void getRequestFromGithubTest12() throws JSONException {
        String organizations_url = jsonResponse.getString("organizations_url");
        assertThat(organizations_url, is("https://api.github.com/users/rusakov66/orgs"));
    }

    @Test
    public void getRequestFromGithubTest13() throws JSONException {
        String repos_url = jsonResponse.getString("repos_url");
        assertThat(repos_url, is("https://api.github.com/users/rusakov66/repos"));
    }

    @Test
    public void getRequestFromGithubTest14() throws JSONException {
        String events_url = jsonResponse.getString("events_url");
        assertThat(events_url, is("https://api.github.com/users/rusakov66/events{/privacy}"));
    }

    @Test
    public void getRequestFromGithubTest15() throws JSONException {
        String received_events_url = jsonResponse.getString("received_events_url");
        assertThat(received_events_url, is("https://api.github.com/users/rusakov66/received_events"));
    }

    @Test
    public void getRequestFromGithubTest16() throws JSONException {
        String type = jsonResponse.getString("type");
        assertThat(type, is("User"));
    }

    @Test
    public void getRequestFromGithubTest17() throws JSONException {
        Boolean site_admin = jsonResponse.getBoolean("site_admin");
        assertThat(site_admin, is(false));
    }

    @Test
    public void getRequestFromGithubTest18() throws JSONException {
        String company = jsonResponse.getString("company");
        assertThat(company, is(notNullValue()));
    }

    @Test
    public void getRequestFromGithubTest19() throws JSONException {
        String blog = jsonResponse.getString("blog");
        assertThat(blog, is(""));
    }

    @Test
    public void getRequestFromGithubTest20() throws JSONException {
        String location = jsonResponse.getString("location");
        assertThat(location, is(notNullValue()));
    }

    @Test
    public void getRequestFromGithubTest21() throws JSONException {
        String email = jsonResponse.getString("email");
        assertThat(email, is(notNullValue()));
    }

    @Test
    public void getRequestFromGithubTest22() throws JSONException {
        String hireable = jsonResponse.getString("hireable");
        assertThat(hireable, is(notNullValue()));
    }

    @Test
    public void getRequestFromGithubTest23() throws JSONException {
        String bio = jsonResponse.getString("bio");
        assertThat(bio, is(notNullValue()));
    }

    @Test
    public void getRequestFromGithubTest24() throws JSONException {
        int public_repos = jsonResponse.getInt("public_repos");
        assertThat(public_repos, is(4));
    }

    @Test
    public void getRequestFromGithubTest25() throws JSONException {
        int public_gists = jsonResponse.getInt("public_gists");
        assertThat(public_gists, is(0));
    }

    @Test
    public void getRequestFromGithubTest26() throws JSONException {
        int followers = jsonResponse.getInt("followers");
        assertThat(followers, is(0));
    }

    @Test
    public void getRequestFromGithubTest27() throws JSONException {
        int following = jsonResponse.getInt("following");
        assertThat(following, is(0));
    }

    @Test
    public void getRequestFromGithubTest28() throws JSONException {
        int id = jsonResponse.getInt("id");
        assertThat(id, equalTo(16705398));
    }

    @Test
    public void getRequestFromGithubTest29() throws JSONException {
        String created_at = jsonResponse.getString("created_at");
        assertThat(created_at, is("2016-01-14T15:18:18Z"));
    }

    @Test
    public void getRequestFromGithubTest30() throws Exception {
        String updated_at = jsonResponse.getString("updated_at");
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("yyyy-MM-dd'T'HH:mm:ss");
        Date docDate = format.parse(updated_at);
        assertThat(updated_at, greaterThan("2016-05-21T08:12:28Z"));
    }

    @Test
    public void getRequestFromGithubTest31() throws Exception {
        String gravatar_id = jsonResponse.getString("gravatar_id");
        assertThat(gravatar_id, is(""));
        System.out.println(gravatar_id);
    }

    @Test
    public void getRequestFromGithubTest32() throws Exception {
        String avatar_url = jsonResponse.getString("avatar_url");
        assertThat(avatar_url, is("https://avatars1.githubusercontent.com/u/16705398?v=4"));
        Response response2 = get(avatar_url);

        int i = response2.getStatusCode();
        System.out.println("----------- Status code is " + i);
        String statusLine = response2.getStatusLine();
        assertThat(statusLine, is("HTTP/1.1 200 OK"));
        System.out.println(statusLine);
    }
}