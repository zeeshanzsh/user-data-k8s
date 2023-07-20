# Docker Kubernetes Spring boot Deployment 

**Step1: Build the docker image**

```
docker build -t user-data .
```

**Step2: k8s Deployment**
```agsl
 kubectl apply -f k8s-deployment.yaml
 kubectl get deployments
 kubectl get pods
 kubectl logs <pod-name>
```

**Step3: k8s Service**
```agsl
 kubectl apply -f k8s-service.yaml
 kubectl get service
 kubectl get all
```






