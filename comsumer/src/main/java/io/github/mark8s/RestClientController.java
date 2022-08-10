package io.github.mark8s;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author xielongwang
 * @create 2021/11/8 1:12 下午
 * @email xielong.wang@nvr-china.com
 * @description
 */
@RestController
@RequestMapping("/client")
public class RestClientController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/version")
    public String client() {

        return restTemplate.getForObject("http://mesh-server/server/info", String.class);
    }
}
