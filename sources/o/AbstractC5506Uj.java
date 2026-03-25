package o;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;

/* JADX INFO: renamed from: o.Uj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC5506Uj {
    public abstract InterfaceC5509Um createArrayNode();

    public abstract InterfaceC5509Um createObjectNode();

    public InterfaceC5509Um missingNode() {
        return null;
    }

    public InterfaceC5509Um nullNode() {
        return null;
    }

    public abstract <T extends InterfaceC5509Um> T readTree(JsonParser jsonParser) throws java.io.IOException;

    public abstract JsonParser treeAsTokens(InterfaceC5509Um interfaceC5509Um);

    public abstract void writeTree(JsonGenerator jsonGenerator, InterfaceC5509Um interfaceC5509Um) throws java.io.IOException;
}
