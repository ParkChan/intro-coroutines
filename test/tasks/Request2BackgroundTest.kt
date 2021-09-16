package tasks

import contributors.MockGithubService
import contributors.User
import contributors.expectedResults
import contributors.testRequestData
import org.junit.Assert
import org.junit.Test

class Request2BackgroundTest {

    @Test
    fun testDataIsLoaded() {
        loadContributorsBackground(MockGithubService, testRequestData) {
            Assert.assertEquals(
                "Wrong result for 'loadContributorsCallbacks'",
                expectedResults.users, it
            )
        }
    }
}