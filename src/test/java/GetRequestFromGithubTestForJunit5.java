import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static io.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;


// This is one test branch

public class GetRequestFromGithubTestForJunit5 {


    @Test
    public void getRequestFromGithubTest() throws ParseException {
        String stringURL = "https://api.github.com/users/rusakov66";
        Response response = get(stringURL);
        JSONObject jsonResponse = new JSONObject(response.asString());

        String name = jsonResponse.getString("name");
        String login = jsonResponse.getString("login");
        String statusLine = response.getStatusLine();
        int id = jsonResponse.getInt("id");
        String node_id = jsonResponse.getString("node_id");
        String url = jsonResponse.getString("url");
        String html_url = jsonResponse.getString("html_url");
        String followers_url = jsonResponse.getString("followers_url");
        String following_url = jsonResponse.getString("following_url");
        String gists_url = jsonResponse.getString("gists_url");
        String starred_url = jsonResponse.getString("starred_url");
        String subscriptions_url = jsonResponse.getString("subscriptions_url");
        String organizations_url = jsonResponse.getString("organizations_url");
        String repos_url = jsonResponse.getString("repos_url");
        String events_url = jsonResponse.getString("events_url");
        String received_events_url = jsonResponse.getString("received_events_url");
        String type = jsonResponse.getString("type");
        Boolean site_admin = jsonResponse.getBoolean("site_admin");
        Object company = jsonResponse.get("company");
        String blog = jsonResponse.getString("blog");
        Object location = jsonResponse.get("location");
        Object email = jsonResponse.get("email");
        Object hireable = jsonResponse.get("hireable");
        Object bio = jsonResponse.get("bio");
        int public_repos = jsonResponse.getInt("public_repos");
        int public_gists = jsonResponse.getInt("public_gists");
        int followers = jsonResponse.getInt("followers");
        int following = jsonResponse.getInt("following");
        String created_at = jsonResponse.getString("created_at");
        String updated_at = jsonResponse.getString("updated_at");
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("yyyy-MM-dd'T'HH:mm:ss");
        Date docDate = format.parse(updated_at);
        String gravatar_id = jsonResponse.getString("gravatar_id");
        String avatar_url = jsonResponse.getString("avatar_url");


        assertAll(
                () -> assertThat("rusakov66", is(login)),
                () -> assertThat("Iurii Rusakov", is(name)),
                () -> assertThat(statusLine, is("HTTP/1.1 200 OK")),
                () -> assertThat(id, equalTo(16705398)),
                () -> assertThat(node_id, is("MDQ6VXNlcjE2NzA1Mzk4")),
                () -> assertThat(url, is("https://api.github.com/users/rusakov66")),
                () -> assertThat(html_url, is("https://github.com/rusakov66")),
                () -> assertThat(followers_url, is("https://api.github.com/users/rusakov66/followers")),
                () -> assertThat(following_url, is("https://api.github.com/users/rusakov66/following{/other_user}")),
                () -> assertThat(gists_url, is("https://api.github.com/users/rusakov66/gists{/gist_id}")),
                () -> assertThat(starred_url, is("https://api.github.com/users/rusakov66/starred{/owner}{/repo}")),
                () -> assertThat(subscriptions_url, is("https://api.github.com/users/rusakov66/subscriptions")),
                () -> assertThat(organizations_url, is("https://api.github.com/users/rusakov66/orgs")),
                () -> assertThat(repos_url, is("https://api.github.com/users/rusakov66/repos")),
                () -> assertThat(events_url, is("https://api.github.com/users/rusakov66/events{/privacy}")),
                () -> assertThat(received_events_url, is("https://api.github.com/users/rusakov66/received_events")),
                () -> assertThat(type, is("User")),
                () -> assertThat(site_admin, is(false)),
                () -> assertThat(company, is(notNullValue())),
                () -> assertThat(blog, is("")),
                () -> assertThat(location, is(notNullValue())),
                () -> assertThat(email, is(notNullValue())),
                () -> assertThat(hireable, is(notNullValue())),
                () -> assertThat(bio, is(notNullValue())),
                () -> assertThat(public_repos, is(4)),
                () -> assertThat(public_gists, is(0)),
                () -> assertThat(followers, is(0)),
                () -> assertThat(following, is(0)),
                () -> assertThat(id, equalTo(16705398)),
                () -> assertThat(created_at, is("2016-01-14T15:18:18Z")),
                () -> assertThat(updated_at, greaterThan("2016-05-21T08:12:28Z")),
                () -> System.out.println(gravatar_id),
                () -> assertThat(avatar_url, is("https://avatars1.githubusercontent.com/u/16705398?v=4"))
        );
    }
}
