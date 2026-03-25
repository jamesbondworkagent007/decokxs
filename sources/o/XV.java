package o;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;

/* JADX INFO: loaded from: classes21.dex */
@java.lang.Deprecated
public interface XV {
    @java.lang.Deprecated
    void depositSchemaProperty(BeanPropertyWriter beanPropertyWriter, ObjectNode objectNode, VI vi) throws JsonMappingException;

    void depositSchemaProperty(BeanPropertyWriter beanPropertyWriter, InterfaceC5593Xr interfaceC5593Xr, VI vi) throws JsonMappingException;

    void serializeAsField(java.lang.Object obj, JsonGenerator jsonGenerator, VI vi, BeanPropertyWriter beanPropertyWriter) throws java.lang.Exception;
}
