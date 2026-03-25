package o;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.PropertyWriter;

/* JADX INFO: loaded from: classes21.dex */
public interface XX {
    @java.lang.Deprecated
    void depositSchemaProperty(PropertyWriter propertyWriter, ObjectNode objectNode, VI vi) throws JsonMappingException;

    void depositSchemaProperty(PropertyWriter propertyWriter, InterfaceC5593Xr interfaceC5593Xr, VI vi) throws JsonMappingException;

    void serializeAsField(java.lang.Object obj, JsonGenerator jsonGenerator, VI vi, PropertyWriter propertyWriter) throws java.lang.Exception;
}
