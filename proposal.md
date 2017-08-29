# Social Network Trend Monitor
---
## Background
### Business requirement
One common question asked by the marketer is: how can my ads be more attractive to boost the CTR(click through rate) on social network? For example, if everyone is talking about Hurricane Harvey, it will be better to show ads that are related to disaster prevention or charity donations. To answer this question, marketers need to know the current trends, and then develop the business strategies. This project aims at providing a social network trend monitor tool for marketer to:
* Know what are the top x hot topics
    * In real-time
    * In history
    * By prediction
* Be able to track the trend of topics that are related to their product.
E.g., RV rentals may be interested in Burningman topics

Considering the time and resource limitation, this project will focus on the first feature. The second feature will be addressed if time is allowed.

### Technical requirement
Able to build a data driven product that utilizes big data skills including: data consuming, data persisting, data analyzing and data visualization.


## Objectives
### Required
* End-to-end data pipeline that is able to: load data, persist data, and process data
    * Ability to fetch real time tweets from Twitter
    * Ability to analyze the tweet for topics. 
    * Ability to give a reasonable rank of the topics. 
    * Ability to filter topics based on time and region. 
* UI for user interaction and data visualization
* System robustness 
    * system monitoring, logging and tests 

### Optional
* New features
    * Topic subscription
        * Allow users to search and subscribe/unsubscribe topics and observe the changing of popularity during the time
        * Allow users to manage their subscriptions in an aggregated webpage
    * Recommendation of topics
        * What may be the next hot topics
        * Related topics
* More data sources
    * Aggregate multiple social network data besides twitter
* Scalability & Maintenance
    * Deploy project to cloud


## Scope
MVP -  Handles only 1 social network source: Twitter.
* A streaming and storage system that can collect, store and fetch real time twitter tweets
* An end-to-end data processing framework that is able to
    * Fetch real-time tweets from twitter and persist them to Cassandra
        * For MVP, only up to 1 hour
    * Categorize topics and calculate the ranking
        * Real-time (current top 10 topics)
        * Batch (top 10 topic in last 10mins, 1 hour, from US)
* UI that can show the topics 
    * Current top 10 topics
    * Filtered top 10 topics in history
* UI that allow the user to filter the topics
    * By time (last 1min, last 30 min, last 1 hour)
    * By region (US)
* Visualization of the tweets
    * Graphs that can show the counts / percentage among all topics
    * Location distribution of the tweets


## Timeframe
|Phase         |Task                         |Start and End Dates    |
|--------------|-----------------------------|:---------------------:|
|Design the system, Research | * Research on Twitter API and evaluate the data model</br>* Design the algorithm to calculate topics and trend index</br>* Research and evaluate data visualization framework</br>* Design the data pipeline framework | 9/1 - 9/7 |
|Build the data processing framework|* ETL data from twitter API to Kafka</br>* Implement algorithm to calculate topics and the trend index</br>* Implement Cassandra schema to persist the tweets</br>* Setup spark streaming job for current trending calculation</br>* Setup spark batch job for history trend lookup and filtering| 9/8 - 9/14 |
|Build the web service framework for data visualization|* Implement RESTful API endpoints allow user to filter on the topics</br>* Apply Redis cache</br>* Design and implement UI for user interaction</br>* Design and implement tweets trend visualization| 9/15 - 9/21 |
|Wrap-up|* System monitoring: Zipkin, Tests</br>* Demo + Presentation</br>* Optional features| 9/22 - 9/30 |