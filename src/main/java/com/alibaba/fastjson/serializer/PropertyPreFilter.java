package com.alibaba.fastjson.serializer;

public interface PropertyPreFilter extends SerializeFilter {

    boolean apply(JSONSerializer serializer, Object object, String name);
}
