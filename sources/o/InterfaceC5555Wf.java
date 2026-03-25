package o;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;

/* JADX INFO: renamed from: o.Wf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC5555Wf {
    java.lang.Object getNullValue(DeserializationContext deserializationContext) throws JsonMappingException;

    default java.lang.Object getAbsentValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue(deserializationContext);
    }
}
