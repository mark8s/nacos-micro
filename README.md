# nacos micro

## build

### Env

JDK: 8

Maven: high 3.6

Nacos: 2.10.0

### Operate

Input comsumer or provider directory，Execute the following command：

```aidl
mvn clean package

docker build -t leis17/nacos-istio-consumer:v2.0 .

docker push leis17/nacos-istio-consumer:v2.0
```
Or

```aidl
mvn clean package

docker build -t leis17/nacos-istio-provider:v2.0 .

docker push leis17/nacos-istio-provider:v2.0
```







