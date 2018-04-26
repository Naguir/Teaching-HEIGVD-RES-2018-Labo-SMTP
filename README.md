# Teaching-HEIGVD-RES-2018-Labo-SMTP

## Objectives and description

The purpose of this project is to generate and send forged emails. Our application called "PrankEmail" is a simple TCP Java client who will randomly choose some email address, where
there will be a sender and the victims, then it will choose a forged message which will finally be sent to the victims. 

There is a list of emails which are in the file "victims.txt", same for the messages there is a file where the application will read from.
You can also check the "config.properties" file, where you can modify the IP address and port and the number of groups of victims.


## SMTP MockMock Server running on Docker

In order to test the prank email application, we will use a MockMock SMTP server which enable us to send emails without having any problem of being banned because of SPAM.
We will run the MockMock server on a docker container. There is a friendly web interface so we can see emails we sent. If you want to run the SMTP server using Docker follow these steps :
1. Install Docker if you have not already...
2. Clone our repository on your computer
3. Launch Docker terminal and go to the directory "docker"
4. Create docker image using this command : ``` docker build -t res-smtp-mockmock . ```
5. Then run the container using command : ``` docker run -p 2525:2525 -p 8282:8282 res-smtp-mockmock ```

After that you're server should be up and running. Test it by going on your favorite browser and type ``` 192.168.99.100:8282 ``` this will open the web interface
where you will find the emails you sent to the server.
In case you want to change the SMTP port or the web port, please check and update carefully the Dockerfile and the commands you typed above.

## PrankEmail application
Now that you have a SMTP server running, try out by running the PrankEmail application and check the on the Web Interface emails that were sent.
Enjoy!
