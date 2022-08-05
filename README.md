# nacos micro

## build

Input comsumer or provider directory，Execute the following command：

```aidl
mvn clean package

docker build -t leis17/nacos-istio-comsumer:v1.0 .

docker push leis17/nacos-istio-comsumer:v1.0
```
Or

```aidl
mvn clean package

docker build -t leis17/nacos-istio-provider:v1.0 .

docker push leis17/nacos-istio-provider:v1.0
```







