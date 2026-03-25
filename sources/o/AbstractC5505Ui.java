package o;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.Version;

/* JADX INFO: renamed from: o.Ui, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC5505Ui extends AbstractC5506Uj {
    @Override // o.AbstractC5506Uj
    public abstract InterfaceC5509Um createArrayNode();

    @Override // o.AbstractC5506Uj
    public abstract InterfaceC5509Um createObjectNode();

    @Override // o.AbstractC5506Uj
    public abstract <T extends InterfaceC5509Um> T readTree(JsonParser jsonParser) throws java.io.IOException;

    public abstract <T> T readValue(JsonParser jsonParser, java.lang.Class<T> cls) throws java.io.IOException;

    public abstract <T> T readValue(JsonParser jsonParser, AbstractC5531Vh abstractC5531Vh) throws java.io.IOException;

    public abstract <T> T readValue(JsonParser jsonParser, AbstractC5533Vj<T> abstractC5533Vj) throws java.io.IOException;

    public abstract <T> java.util.Iterator<T> readValues(JsonParser jsonParser, java.lang.Class<T> cls) throws java.io.IOException;

    public abstract <T> java.util.Iterator<T> readValues(JsonParser jsonParser, AbstractC5531Vh abstractC5531Vh) throws java.io.IOException;

    public abstract <T> java.util.Iterator<T> readValues(JsonParser jsonParser, AbstractC5533Vj<T> abstractC5533Vj) throws java.io.IOException;

    @Override // o.AbstractC5506Uj
    public abstract JsonParser treeAsTokens(InterfaceC5509Um interfaceC5509Um);

    public abstract <T> T treeToValue(InterfaceC5509Um interfaceC5509Um, java.lang.Class<T> cls) throws JsonProcessingException;

    public abstract Version version();

    @Override // o.AbstractC5506Uj
    public abstract void writeTree(JsonGenerator jsonGenerator, InterfaceC5509Um interfaceC5509Um) throws java.io.IOException;

    public abstract void writeValue(JsonGenerator jsonGenerator, java.lang.Object obj) throws java.io.IOException;

    @java.lang.Deprecated
    public JsonFactory getJsonFactory() {
        return getFactory();
    }

    public JsonFactory getFactory() {
        return getJsonFactory();
    }
}
