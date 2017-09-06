package capstone.twitter

import twitter4j._

object Util {
  val config = new twitter4j.conf.ConfigurationBuilder()
    .setOAuthConsumerKey("CONSUMER_KEY")
    .setOAuthConsumerSecret("CONSUMER_SECRET")
    .setOAuthAccessToken("ACCESS_TOKEN")
    .setOAuthAccessTokenSecret("ACCESS_TOKEN_SECRET")
    .build

    def simpleStatusListener = new StatusListener() {
        def onStatus(status: Status) { 
            if (status.getLang == "en") {
                println(status.getText) 
                println("---------")
            }
        }
        def onDeletionNotice(statusDeletionNotice: StatusDeletionNotice) {}
        def onTrackLimitationNotice(numberOfLimitedStatuses: Int) {}
        def onException(ex: Exception) { 
            ex.printStackTrace 
        }
        def onScrubGeo(arg0: Long, arg1: Long) {
            println("Geolocation: " + arg0 + "," + arg1)
        }
        def onStallWarning(warning: StallWarning) {}
    }
}