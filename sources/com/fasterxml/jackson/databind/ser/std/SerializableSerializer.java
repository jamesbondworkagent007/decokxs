package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import o.AbstractC5601Xz;
import o.InterfaceC5584Xi;
import o.VF;
import o.VI;
import o.VK;

/* JADX INFO: loaded from: classes21.dex */
@VK
public class SerializableSerializer extends StdSerializer<VF> {
    public static final SerializableSerializer instance = new SerializableSerializer();

    public SerializableSerializer() {
        super(VF.class);
    }

    /* JADX DEBUG: Method merged with bridge method: isEmpty(Lo/VI;Ljava/lang/Object;)Z */
    @Override // o.VD
    public boolean isEmpty(VI vi, VF vf) {
        if (vf instanceof VF.Application) {
            return ((VF.Application) vf).isEmpty(vi);
        }
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void serialize(VF vf, JsonGenerator jsonGenerator, VI vi) throws IOException {
        vf.serialize(jsonGenerator, vi);
    }

    /* JADX DEBUG: Method merged with bridge method: serializeWithType(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;Lo/Xz;)V */
    @Override // o.VD
    public final void serializeWithType(VF vf, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
        vf.serializeWithType(jsonGenerator, vi, abstractC5601Xz);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
        interfaceC5584Xi.EZpvd(javaType);
    }
}
