# nacos micro

## build

### Env

JDK: 8

Maven: high 3.6

Nacos: 2.1


### Install Nacos

```shell
git clone https://ghproxy.com/https://github.com/nacos-group/nacos-docker.git
cd nacos-docker
```

We need edit standalone-derby.yaml, add env `nacos_istio_mcp_server_enabled=true` and expose 18848 port. 
```yaml
services:
  nacos:
    image: nacos/nacos-server:${NACOS_VERSION}
    container_name: nacos-standalone
    environment:
    - PREFER_HOST_MODE=hostname
    - MODE=standalone
    - nacos_istio_mcp_server_enabled=true
    volumes:
    - ./standalone-logs/:/home/nacos/logs
    - ./init.d/custom.properties:/home/nacos/init.d/custom.properties
    ports:
    - "8848:8848"
    - "9848:9848"
    - "18848:18848"
```
After that
```shell
docker-compose -f example/standalone-derby.yaml up
```

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







