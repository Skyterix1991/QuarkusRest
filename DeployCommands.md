# Kubernetes
1. `mvn package -Pnative -Dquarkus.native.container-build=true`
2. `sudo docker build -f src/main/docker/Dockerfile.native -t skyterix1991/quarkusrest .`
3. `minikube start`
4. `kubectl run quarkusrest --image=skyterix1991/quarkusrest:latest --port=8080 --image-pull-policy=IfNotPresent`
5. `kubectl expose deployment quarkusrest --type=NodePort`
6. `curl $(minikube service quarkusrest --url)/name/random`