package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import o.AbstractC5601Xz;
import o.InterfaceC5583Xh;
import o.InterfaceC5584Xi;
import o.VI;
import o.VK;

/* JADX INFO: loaded from: classes21.dex */
@VK
public class SqlBlobSerializer extends StdScalarSerializer<Blob> {
    /* JADX DEBUG: Method merged with bridge method: isEmpty(Lo/VI;Ljava/lang/Object;)Z */
    @Override // o.VD
    public boolean isEmpty(VI vi, Blob blob) {
        return blob == null;
    }

    public SqlBlobSerializer() {
        super(Blob.class);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void serialize(Blob blob, JsonGenerator jsonGenerator, VI vi) throws IOException {
        _writeValue(blob, jsonGenerator, vi);
    }

    /* JADX DEBUG: Method merged with bridge method: serializeWithType(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;Lo/Xz;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, o.VD
    public void serializeWithType(Blob blob, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
        WritableTypeId writableTypeIdAEQbTJ = abstractC5601Xz.AEQbTJ(jsonGenerator, abstractC5601Xz.AEQbTJ(blob, JsonToken.VALUE_EMBEDDED_OBJECT));
        _writeValue(blob, jsonGenerator, vi);
        abstractC5601Xz.copydefault(jsonGenerator, writableTypeIdAEQbTJ);
    }

    public void _writeValue(Blob blob, JsonGenerator jsonGenerator, VI vi) throws IOException {
        InputStream binaryStream;
        try {
            binaryStream = blob.getBinaryStream();
        } catch (SQLException e) {
            vi.reportMappingProblem(e, "Failed to access `java.sql.Blob` value to write as binary value", new Object[0]);
            binaryStream = null;
        }
        jsonGenerator.KWHzl(vi.getConfig().getBase64Variant(), binaryStream, -1);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
        InterfaceC5583Xh interfaceC5583XhKWHzl = interfaceC5584Xi.KWHzl(javaType);
        if (interfaceC5583XhKWHzl != null) {
            interfaceC5583XhKWHzl.AEQbTJ(JsonFormatTypes.INTEGER);
        }
    }
}
