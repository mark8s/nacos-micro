package io.github.mark8s;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xielongwang
 * @create 2021/11/8 1:05 下午
 * @email xielong.wang@nvr-china.com
 * @description
 */
@RestController
@RequestMapping("/server")
public class RestServerController {

    @GetMapping("/info")
    public String client() {
        return "ok";
    }
}
