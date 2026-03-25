package o;

import com.fasterxml.jackson.core.JsonLocation;

/* JADX INFO: renamed from: o.Wi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5558Wi {
    public final java.lang.Object AEQbTJ;
    public final JsonLocation EZpvd;
    public final java.lang.Class<?> KWHzl;

    public C5558Wi(java.lang.Object obj, java.lang.Class<?> cls, JsonLocation jsonLocation) {
        this.AEQbTJ = obj;
        this.KWHzl = cls;
        this.EZpvd = jsonLocation;
    }

    public java.lang.String toString() {
        return java.lang.String.format("Object id [%s] (for %s) at %s", this.AEQbTJ, C5619Yr.uzCIH(this.KWHzl), this.EZpvd);
    }
}
