# Introduction
This repo contains source-code for a basic Micronaut application. The application itself
is quite small in which it currently contains only one REST endpoint. When the application
is running it can be accessed at the following location: `http://localhost:9080/greet/{name}` 
replace `name` with a valid name.

## Build Docker image locally
To build a Docker image locally based on the source one should then run the following 
command: `docker build -t jpdecastro/micronaut-basic:latest .` You can always choose another
TAG if you wish.

Read the Docker docs for more information about the `docker build` command. 
The `-t` flag in the command is used to TAG the image and the convention 
is `docker build -t {username}/{application}:{version}`. This TAG helps distinguish our
image from others and is also required when pushing the image to a Docker registry 
like Docker Hub.

After running the `docker build -t ..` command two images will be available in your local environment.
You can verify this by running `docker image ls`. The first image will be displayed as 
`jpdecastro/micronaut-basic` and contains the pre-built application. The second image was only needed to
build the artifact. Read more about multi-staged builds.

## Run Docker container
If the image is available on your machine the we can launch the application by running the
following command: `docker run -d -p 9080:9080 jpdecastro/micronaut-basic:latest`. This will
spin up a Docker container in detached mode and expose port 9080 to the Docker host. Use the
following command for verification: `docker ps -a`. The status of the container should not be
Exited.

## Accessing application REST endpoint
Now that we have a running container we can access the REST endpoint by making the
following HTTP GET request `http://localhost:9080/greet/Duke`. When the request has 
executed successfully then the following text should be visible: `Micronaut salutes you! Duke`.
