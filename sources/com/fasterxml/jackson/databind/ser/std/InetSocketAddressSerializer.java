package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import o.AbstractC5601Xz;
import o.VI;

/* JADX INFO: loaded from: classes21.dex */
public class InetSocketAddressSerializer extends StdScalarSerializer<InetSocketAddress> {
    public InetSocketAddressSerializer() {
        super(InetSocketAddress.class);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void serialize(InetSocketAddress inetSocketAddress, JsonGenerator jsonGenerator, VI vi) throws IOException {
        String strSubstring;
        InetAddress address = inetSocketAddress.getAddress();
        String hostName = address == null ? inetSocketAddress.getHostName() : address.toString().trim();
        int iIndexOf = hostName.indexOf(47);
        if (iIndexOf >= 0) {
            if (iIndexOf == 0) {
                if (address instanceof Inet6Address) {
                    strSubstring = "[" + hostName.substring(1) + "]";
                } else {
                    strSubstring = hostName.substring(1);
                }
                hostName = strSubstring;
            } else {
                hostName = hostName.substring(0, iIndexOf);
            }
        }
        jsonGenerator.AhwBna(hostName + ":" + inetSocketAddress.getPort());
    }

    /* JADX DEBUG: Method merged with bridge method: serializeWithType(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;Lo/Xz;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, o.VD
    public void serializeWithType(InetSocketAddress inetSocketAddress, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
        WritableTypeId writableTypeIdAEQbTJ = abstractC5601Xz.AEQbTJ(jsonGenerator, abstractC5601Xz.copydefault(inetSocketAddress, InetSocketAddress.class, JsonToken.VALUE_STRING));
        serialize(inetSocketAddress, jsonGenerator, vi);
        abstractC5601Xz.copydefault(jsonGenerator, writableTypeIdAEQbTJ);
    }
}
