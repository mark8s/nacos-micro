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

docker build -t registry.cn-shenzhen.aliyuncs.com/solarmesh/nacos-istio-consumer:v2.1 .

docker push registry.cn-shenzhen.aliyuncs.com/solarmesh/nacos-istio-consumer:v2.1
```
Or

```aidl
mvn clean package

docker build -t registry.cn-shenzhen.aliyuncs.com/solarmesh/nacos-istio-provider:v2.1 .

docker push registry.cn-shenzhen.aliyuncs.com/solarmesh/nacos-istio-provider:v2.1
```







