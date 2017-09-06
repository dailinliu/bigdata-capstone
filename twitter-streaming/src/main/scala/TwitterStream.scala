package capstone.twitter

import twitter4j._

object StatusStreamer {
    def main(args: Array[String]) {
        val twitterStream = new TwitterStreamFactory(Util.config).getInstance
        twitterStream.addListener(Util.simpleStatusListener)
        twitterStream.sample
    }
}