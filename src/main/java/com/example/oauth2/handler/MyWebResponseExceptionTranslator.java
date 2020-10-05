package com.example.oauth2.handler;

import com.example.oauth2.web.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.common.exceptions.InvalidGrantException;
import org.springframework.security.oauth2.common.exceptions.InvalidScopeException;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;
import org.springframework.security.oauth2.common.exceptions.UnsupportedGrantTypeException;
import org.springframework.security.oauth2.provider.error.WebResponseExceptionTranslator;

/**
 * @author sy
 * @date Created in 2020.10.5 16:30
 * @description oauth自定义的错误处理
 */
@Slf4j
public class MyWebResponseExceptionTranslator implements WebResponseExceptionTranslator {



    @Override
    public ResponseEntity translate(Exception e) throws Exception {

        log.error("oauth进来错误: "+e.toString());
        log.error("oauth错误类: "+e.getClass());
        log.error("oauth错误提示："+e.getMessage());
        if (e instanceof InvalidGrantException){
            return ResponseEntity.ok(R.fail(2001,"账号或密码错误！"));
        }else if (e instanceof UnsupportedGrantTypeException) {
            return ResponseEntity.ok(R.fail(2001,"不支持该认证方式！"));
        }else if (e instanceof InvalidScopeException){
            return ResponseEntity.ok(R.fail(2003,"授权范围错误"));
        }
        return ResponseEntity.ok(R.fail(2003,"登陆错误"));
    }



}
