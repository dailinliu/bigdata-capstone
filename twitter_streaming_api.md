# Using Twitter Streaming api
## Setting up Authentication
1. Create a Twitter account
2. Visit [Twitter Apps](https://apps.twitter.com/) and create a new application
3. In "Key and Access Token" panel, generate 'Access Token'. 

    Note: Consumer Key (API Key), Consumer Secret (API Secret), Access Token, Access Token Secret are needed to authenticate in the future.

## Using Twurl to Peek the Streaming API
Twitter has disabled the Basic authentication for the streaming API in v1.1. To access the API, we need to go by the OAuth way. For API exploration, `Twurl` is recommended to use.
### Install
1. Install ruby
    ``` 
    brew install ruby 
    ```

2. Install twurl (Mac OSX El Capitain +)
    ``` 
    sudo gem install -n /usr/local/bin twurl 
    ```

### Authenticate
``` 
twurl authorize --consumer-key <app consumer key> --consumer-secret <app consumer secret>
```

Visit the url showed up on the terminal, grant the access, then enter the PIN.

### Call Twitter Streaming API endpoints
1. GET statuses/sample

    Returns a small random sample of all public statuses. 

    ```
    twurl -H stream.twitter.com /1.1/statuses/sample.json
    ```

    Example output tweets in JSON
```
{  
   "created_at":"Tue Sep 05 05:05:30 +0000 2017",
   "id":904933486384922626,
   "id_str":"904933486384922626",
   "text":"A bottle makes you forget about Monday. #Cheers https:\/\/t.co\/sHEdN0pfVy",
   "display_text_range":[  
      0,
      47
   ],
   "source":"\u003ca href=\"http:\/\/twitter.com\/download\/android\" rel=\"nofollow\"\u003eTwitter for Android\u003c\/a\u003e",
   "truncated":false,
   "in_reply_to_status_id":null,
   "in_reply_to_status_id_str":null,
   "in_reply_to_user_id":null,
   "in_reply_to_user_id_str":null,
   "in_reply_to_screen_name":null,
   "user":{  
      "id":14200004,
      "id_str":"14200004",
      "name":"Reggie",
      "screen_name":"regwald",
      "location":"Oilcountry Capital city",
      "url":null,
      "description":"Just another die hard Oiler fan and season ticket holder. Follow me if you like Oiler and hockey updates.",
      "translator_type":"none",
      "protected":false,
      "verified":false,
      "followers_count":1672,
      "friends_count":2276,
      "listed_count":83,
      "favourites_count":53535,
      "statuses_count":75738,
      "created_at":"Sun Mar 23 01:13:50 +0000 2008",
      "utc_offset":-21600,
      "time_zone":"Mountain Time (US & Canada)",
      "geo_enabled":true,
      "lang":"en",
      "contributors_enabled":false,
      "is_translator":false,
      "profile_background_color":"C0DEED",
      "profile_background_image_url":"http:\/\/pbs.twimg.com\/profile_background_images\/513548887416520704\/0GYOQcSM.jpeg",
      "profile_background_image_url_https":"https:\/\/pbs.twimg.com\/profile_background_images\/513548887416520704\/0GYOQcSM.jpeg",
      "profile_background_tile":true,
      "profile_link_color":"0084B4",
      "profile_sidebar_border_color":"FFFFFF",
      "profile_sidebar_fill_color":"DDEEF6",
      "profile_text_color":"333333",
      "profile_use_background_image":true,
      "profile_image_url":"http:\/\/pbs.twimg.com\/profile_images\/892236118740967424\/n_UwjV5l_normal.jpg",
      "profile_image_url_https":"https:\/\/pbs.twimg.com\/profile_images\/892236118740967424\/n_UwjV5l_normal.jpg",
      "profile_banner_url":"https:\/\/pbs.twimg.com\/profile_banners\/14200004\/1501993625",
      "default_profile":false,
      "default_profile_image":false,
      "following":null,
      "follow_request_sent":null,
      "notifications":null
   },
   "geo":null,
   "coordinates":null,
   "place":{  
      "id":"6a6d896ba1cb5dc4",
      "url":"https:\/\/api.twitter.com\/1.1\/geo\/id\/6a6d896ba1cb5dc4.json",
      "place_type":"city",
      "name":"Edmonton",
      "full_name":"Edmonton, Alberta",
      "country_code":"CA",
      "country":"Canada",
      "bounding_box":{  
         "type":"Polygon",
         "coordinates":[  
            [  
               [  
                  -113.713680,
                  53.395531
               ],
               [  
                  -113.713680,
                  53.716108
               ],
               [  
                  -113.271555,
                  53.716108
               ],
               [  
                  -113.271555,
                  53.395531
               ]
            ]
         ]
      },
      "attributes":{  

      }
   },
   "contributors":null,
   "is_quote_status":false,
   "quote_count":0,
   "reply_count":0,
   "retweet_count":0,
   "favorite_count":0,
   "entities":{  
      "hashtags":[  
         {  
            "text":"Cheers",
            "indices":[  
               40,
               47
            ]
         }
      ],
      "urls":[  

      ],
      "user_mentions":[  

      ],
      "symbols":[  

      ],
      "media":[  
         {  
            "id":904933474116689920,
            "id_str":"904933474116689920",
            "indices":[  
               48,
               71
            ],
            "media_url":"http:\/\/pbs.twimg.com\/media\/DI74Mz4V4AAh9O1.jpg",
            "media_url_https":"https:\/\/pbs.twimg.com\/media\/DI74Mz4V4AAh9O1.jpg",
            "url":"https:\/\/t.co\/sHEdN0pfVy",
            "display_url":"pic.twitter.com\/sHEdN0pfVy",
            "expanded_url":"https:\/\/twitter.com\/regwald\/status\/904933486384922626\/photo\/1",
            "type":"photo",
            "sizes":{  
               "thumb":{  
                  "w":150,
                  "h":150,
                  "resize":"crop"
               },
               "medium":{  
                  "w":768,
                  "h":1024,
                  "resize":"fit"
               },
               "large":{  
                  "w":768,
                  "h":1024,
                  "resize":"fit"
               },
               "small":{  
                  "w":510,
                  "h":680,
                  "resize":"fit"
               }
            }
         }
      ]
   },
   "extended_entities":{  
      "media":[  
         {  
            "id":904933474116689920,
            "id_str":"904933474116689920",
            "indices":[  
               48,
               71
            ],
            "media_url":"http:\/\/pbs.twimg.com\/media\/DI74Mz4V4AAh9O1.jpg",
            "media_url_https":"https:\/\/pbs.twimg.com\/media\/DI74Mz4V4AAh9O1.jpg",
            "url":"https:\/\/t.co\/sHEdN0pfVy",
            "display_url":"pic.twitter.com\/sHEdN0pfVy",
            "expanded_url":"https:\/\/twitter.com\/regwald\/status\/904933486384922626\/photo\/1",
            "type":"photo",
            "sizes":{  
               "thumb":{  
                  "w":150,
                  "h":150,
                  "resize":"crop"
               },
               "medium":{  
                  "w":768,
                  "h":1024,
                  "resize":"fit"
               },
               "large":{  
                  "w":768,
                  "h":1024,
                  "resize":"fit"
               },
               "small":{  
                  "w":510,
                  "h":680,
                  "resize":"fit"
               }
            }
         }
      ]
   },
   "favorited":false,
   "retweeted":false,
   "possibly_sensitive":false,
   "filter_level":"low",
   "lang":"en",
   "timestamp_ms":"1504587930662"
}
```