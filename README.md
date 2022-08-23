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

docker build -t registry.cn-shenzhen.aliyuncs.com/solarmesh/nacos-istio-consumer:v2.0 .

docker push registry.cn-shenzhen.aliyuncs.com/solarmesh/nacos-istio-consumer:v2.0
```
Or

```aidl
mvn clean package

docker build -t registry.cn-shenzhen.aliyuncs.com/solarmesh/nacos-istio-provider:v2.0 .

docker push registry.cn-shenzhen.aliyuncs.com/solarmesh/nacos-istio-provider:v2.0
```

test版本，测试 cloud服务中不指定 metadata.version 后，是否影响流量的效果。

总结：经测试后发现， metadata.version 这是必要条件，直接影响 istio 设置 流量规则的效果。也即，每个服务必须都要有版本字段，才能做到配置流量策略。




