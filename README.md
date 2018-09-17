Build a docker image using ./gradlew build docker

Go to terminal and exec -  docker images
You will see a docker image with this name com.poc/testk8s

Use docker login command to login to your docker hub repo.

docker tag poc-testk8s $DOCKER_ID_USER/poc-testk8s

docker push $DOCKER_ID_USER/my_image

Login to your dockerhub account and check if a public image is created or not.

Follow this link https://medium.com/@Oskarr3/setting-up-ingress-on-minikube-6ae825e98f82 to setup ingress.

kubectl create -f deployment.yml

kubectl create -f service.yml

kubectl create -f ingress.yml

add
 hostname_in_ingess_yml minikube_ip 
 to /etc/hosts file
 
Execute hostname_in_ingess_yml/api/poc to access the api exposed

