package o;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

/* JADX INFO: renamed from: o.Xs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@java.lang.Deprecated
public class C5594Xs {
    public final ObjectNode KWHzl;

    @JsonCreator
    public C5594Xs(ObjectNode objectNode) {
        this.KWHzl = objectNode;
    }

    public java.lang.String toString() {
        return this.KWHzl.toString();
    }

    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C5594Xs)) {
            return false;
        }
        C5594Xs c5594Xs = (C5594Xs) obj;
        ObjectNode objectNode = this.KWHzl;
        if (objectNode == null) {
            return c5594Xs.KWHzl == null;
        }
        return objectNode.equals(c5594Xs.KWHzl);
    }

    public static JsonNode OLrzqt() {
        ObjectNode objectNode = JsonNodeFactory.instance.objectNode();
        objectNode.put("type", "any");
        return objectNode;
    }
}
