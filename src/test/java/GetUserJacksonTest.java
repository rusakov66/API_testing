import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static io.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.jupiter.api.Assertions.assertAll;

public class GetUserJacksonTest {

    @Test
    public void getRequestFromGithubTest() throws IOException {
        final String stringURL = "https://api.github.com/users/rusakov66";
        String response = get(stringURL).asString();
        Response response2 = get(stringURL);
        ObjectMapper objectMapper = new ObjectMapper();
        User userObject = objectMapper.readValue(response, User.class);
        int statusCode = response2.getStatusCode();

        assertAll(
                () -> assertThat(userObject.getLogin(), is("rusakov667")),
                () -> assertThat(userObject.getName(), is("Iurii Rusakov")),
                () -> assertThat(statusCode, equalTo(2000)),
                () -> assertThat(userObject.getId(), equalTo(16705398)),
                () -> assertThat(userObject.getNode_id(), is("MDQ6VXNlcjE2NzA1Mzk4")),
                () -> assertThat(userObject.getUrl(), is("https://api.github.com/users/rusakov66")),
                () -> assertThat(userObject.getHtml_url(), is("https://github.com/rusakov66")),
                () -> assertThat(userObject.getFollowers_url(), is("https://api.github.com/users/rusakov66/followers")),
                () -> assertThat(userObject.getFollowing_url(), is("https://api.github.com/users/rusakov66/following{/other_user}")),
                () -> assertThat(userObject.getGists_url(), is("https://api.github.com/users/rusakov66/gists{/gist_id}")),
                () -> assertThat(userObject.getStarred_url(), is("https://api.github.com/users/rusakov66/starred{/owner}{/repo}")),
                () -> assertThat(userObject.getSubscriptions_url(), is("https://api.github.com/users/rusakov66/subscriptions")),
                () -> assertThat(userObject.getOrganizations_url(), is("https://api.github.com/users/rusakov66/orgs")),
                () -> assertThat(userObject.getRepos_url(), is("https://api.github.com/users/rusakov66/repos")),
                () -> assertThat(userObject.getEvents_url(), is("https://api.github.com/users/rusakov66/events{/privacy}")),
                () -> assertThat(userObject.getReceived_events_url(), is("https://api.github.com/users/rusakov66/received_events")),
                () -> assertThat(userObject.getType(), is("User")),
                () -> assertThat(userObject.isSite_admin(), is(false)),
                () -> assertThat(userObject.getCompany(), is(notNullValue())),
                () -> assertThat(userObject.getBlog(), is("")),
                () -> assertThat(userObject.getLocation(), is(notNullValue())),
                () -> assertThat(userObject.getEmail(), is(notNullValue())),
                () -> assertThat(userObject.getHireable(), is(notNullValue())),
                () -> assertThat(userObject.getBio(), is(notNullValue())),
                () -> assertThat(userObject.getPublic_repos(), is(4)),
                () -> assertThat(userObject.getPublic_gists(), is(0)),
                () -> assertThat(userObject.getFollowers(), is(0)),
                () -> assertThat(userObject.getFollowing(), is(0)),
                () -> assertThat(userObject.getId(), equalTo(16705398)),
                () -> assertThat(userObject.getCreated_at(), is("2016-01-14T15:18:18Z")),
                () -> assertThat(userObject.getUpdated_at(), greaterThan("2016-05-21T08:12:28Z")),
                () -> assertThat(userObject.getAvatar_url(), is("https://avatars1.githubusercontent.com/u/16705398?v=4"))
        );
    }
}

