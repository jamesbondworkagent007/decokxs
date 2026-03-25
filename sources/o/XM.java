package o;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.BaseJsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.Map;
import o.VF;

/* JADX INFO: loaded from: classes21.dex */
public final class XM {
    public static final ObjectReader AEQbTJ;
    public static final ObjectWriter EZpvd;
    public static final ObjectWriter KWHzl;
    public static final JsonMapper copydefault;

    static {
        JsonMapper jsonMapper = new JsonMapper();
        copydefault = jsonMapper;
        KWHzl = jsonMapper.writer();
        EZpvd = jsonMapper.writer().withDefaultPrettyPrinter();
        AEQbTJ = jsonMapper.readerFor(JsonNode.class);
    }

    public static java.lang.String AEQbTJ(BaseJsonNode baseJsonNode) {
        try {
            return KWHzl.writeValueAsString(copydefault(baseJsonNode));
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static java.lang.String OLrzqt(BaseJsonNode baseJsonNode) {
        try {
            return EZpvd.writeValueAsString(copydefault(baseJsonNode));
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static byte[] EZpvd(java.lang.Object obj) throws java.io.IOException {
        return copydefault.writeValueAsBytes(obj);
    }

    public static JsonNode copydefault(byte[] bArr) throws java.io.IOException {
        return (JsonNode) AEQbTJ.readValue(bArr);
    }

    public static VF copydefault(BaseJsonNode baseJsonNode) {
        return new TaskDescription(baseJsonNode);
    }

    public static class TaskDescription extends VF.Application {
        public VI KWHzl;
        public final BaseJsonNode OLrzqt;

        public TaskDescription(BaseJsonNode baseJsonNode) {
            this.OLrzqt = baseJsonNode;
        }

        @Override // o.VF
        public void serialize(JsonGenerator jsonGenerator, VI vi) throws java.io.IOException {
            this.KWHzl = vi;
            AEQbTJ(jsonGenerator, this.OLrzqt);
        }

        @Override // o.VF
        public void serializeWithType(JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws java.io.IOException {
            serialize(jsonGenerator, vi);
        }

        public void AEQbTJ(JsonGenerator jsonGenerator, JsonNode jsonNode) throws java.io.IOException {
            if (jsonNode instanceof ObjectNode) {
                jsonGenerator.EZpvd(this, jsonNode.size());
                EZpvd(jsonGenerator, new ActionBar(), jsonNode.fields());
            } else if (jsonNode instanceof ArrayNode) {
                jsonGenerator.AEQbTJ(this, jsonNode.size());
                EZpvd(jsonGenerator, new ActionBar(), jsonNode.elements());
            } else {
                jsonNode.serialize(jsonGenerator, this.KWHzl);
            }
        }

        public void EZpvd(JsonGenerator jsonGenerator, ActionBar actionBar, java.util.Iterator<?> it) throws java.io.IOException {
            JsonNode jsonNode;
            while (true) {
                if (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (next instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) next;
                        jsonGenerator.KWHzl((java.lang.String) entry.getKey());
                        jsonNode = (JsonNode) entry.getValue();
                    } else {
                        jsonNode = (JsonNode) next;
                    }
                    if (jsonNode instanceof ObjectNode) {
                        actionBar.OLrzqt(it);
                        it = jsonNode.fields();
                        jsonGenerator.EZpvd(jsonNode, jsonNode.size());
                    } else if (jsonNode instanceof ArrayNode) {
                        actionBar.OLrzqt(it);
                        it = jsonNode.elements();
                        jsonGenerator.AEQbTJ(jsonNode, jsonNode.size());
                    } else {
                        jsonNode.serialize(jsonGenerator, this.KWHzl);
                    }
                } else {
                    if (jsonGenerator.valueOf().valueOf()) {
                        jsonGenerator.fetchVPNInfo();
                    } else {
                        jsonGenerator.DbNXlk();
                    }
                    it = actionBar.OLrzqt();
                    if (it == null) {
                        return;
                    }
                }
            }
        }
    }

    public static final class ActionBar {
        public java.util.Iterator<?>[] AEQbTJ;
        public int EZpvd;
        public int OLrzqt;

        public void OLrzqt(java.util.Iterator<?> it) {
            int i = this.OLrzqt;
            int i2 = this.EZpvd;
            if (i < i2) {
                java.util.Iterator<?>[] itArr = this.AEQbTJ;
                this.OLrzqt = i + 1;
                itArr[i] = it;
                return;
            }
            if (this.AEQbTJ == null) {
                this.EZpvd = 10;
                this.AEQbTJ = new java.util.Iterator[10];
            } else {
                int iMin = i2 + java.lang.Math.min(4000, java.lang.Math.max(20, i2 >> 1));
                this.EZpvd = iMin;
                this.AEQbTJ = (java.util.Iterator[]) java.util.Arrays.copyOf(this.AEQbTJ, iMin);
            }
            java.util.Iterator<?>[] itArr2 = this.AEQbTJ;
            int i3 = this.OLrzqt;
            this.OLrzqt = i3 + 1;
            itArr2[i3] = it;
        }

        public java.util.Iterator<?> OLrzqt() {
            int i = this.OLrzqt;
            if (i == 0) {
                return null;
            }
            java.util.Iterator<?>[] itArr = this.AEQbTJ;
            int i2 = i - 1;
            this.OLrzqt = i2;
            return itArr[i2];
        }
    }
}
