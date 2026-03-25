package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.net.InetAddress;
import o.AbstractC5601Xz;
import o.VD;
import o.VI;
import o.XT;

/* JADX INFO: loaded from: classes21.dex */
public class InetAddressSerializer extends StdScalarSerializer<InetAddress> implements XT {
    protected final boolean _asNumeric;

    public InetAddressSerializer() {
        this(false);
    }

    public InetAddressSerializer(boolean z) {
        super(InetAddress.class);
        this._asNumeric = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // o.XT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VD<?> createContextual(VI vi, BeanProperty beanProperty) throws JsonMappingException {
        boolean z;
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(vi, beanProperty, handledType());
        if (valueFindFormatOverrides != null) {
            JsonFormat.Shape shape = valueFindFormatOverrides.getShape();
            z = shape.isNumeric() || shape == JsonFormat.Shape.ARRAY;
        }
        return z != this._asNumeric ? new InetAddressSerializer(z) : this;
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void serialize(InetAddress inetAddress, JsonGenerator jsonGenerator, VI vi) throws IOException {
        String strTrim;
        if (this._asNumeric) {
            strTrim = inetAddress.getHostAddress();
        } else {
            strTrim = inetAddress.toString().trim();
            int iIndexOf = strTrim.indexOf(47);
            if (iIndexOf >= 0) {
                if (iIndexOf == 0) {
                    strTrim = strTrim.substring(1);
                } else {
                    strTrim = strTrim.substring(0, iIndexOf);
                }
            }
        }
        jsonGenerator.AhwBna(strTrim);
    }

    /* JADX DEBUG: Method merged with bridge method: serializeWithType(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;Lo/Xz;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, o.VD
    public void serializeWithType(InetAddress inetAddress, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
        WritableTypeId writableTypeIdAEQbTJ = abstractC5601Xz.AEQbTJ(jsonGenerator, abstractC5601Xz.copydefault(inetAddress, InetAddress.class, JsonToken.VALUE_STRING));
        serialize(inetAddress, jsonGenerator, vi);
        abstractC5601Xz.copydefault(jsonGenerator, writableTypeIdAEQbTJ);
    }
}
