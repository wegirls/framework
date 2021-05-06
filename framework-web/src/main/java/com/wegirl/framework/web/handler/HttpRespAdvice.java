package com.wegirl.framework.web.handler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
import javax.annotation.Resource;

/**
 * @author rui.zhou
 * @date 2021/05/06 16:50
 */
@Slf4j
@RestControllerAdvice
public class HttpRespAdvice implements ResponseBodyAdvice<Object> {

    @Resource
    ObjectMapper objectMapper;


    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        //TODO 通过 messagesource 实现国际化
        /*if( body instanceof ResponseData){
            try{
                log.info("response data:{}",objectMapper.writeValueAsString(body));
            }catch(JsonProcessingException e){
                // never occur
                log.warn("response data json process fail",e);
            }
        }*/
        return body;
    }
}
