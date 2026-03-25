package o;

import com.fasterxml.jackson.core.JsonGenerator;

/* JADX INFO: loaded from: classes21.dex */
public interface VF {

    public static abstract class Application implements VF {
        public boolean isEmpty(VI vi) {
            return false;
        }
    }

    void serialize(JsonGenerator jsonGenerator, VI vi) throws java.io.IOException;

    void serializeWithType(JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws java.io.IOException;
}
