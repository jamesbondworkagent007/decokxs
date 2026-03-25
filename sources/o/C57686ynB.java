package o;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ynB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57686ynB {
    public final JSONObject copydefault;

    public C57686ynB() {
        this.copydefault = new JSONObject();
    }

    public C57686ynB(JSONObject jSONObject) {
        this.copydefault = jSONObject;
    }

    public boolean KWHzl(java.lang.String str) {
        return this.copydefault.has(str);
    }

    public java.lang.String EZpvd(java.lang.String str) {
        return this.copydefault.optString(str);
    }

    public java.lang.String copydefault(java.lang.String str, java.lang.String str2) {
        return this.copydefault.optString(str, str2);
    }

    public boolean copydefault(java.lang.String str) {
        return this.copydefault.optBoolean(str);
    }

    public boolean copydefault(java.lang.String str, boolean z) {
        return this.copydefault.optBoolean(str, z);
    }

    public int OLrzqt(java.lang.String str, int i) {
        return this.copydefault.optInt(str, i);
    }

    public JSONObject AEQbTJ(java.lang.String str) {
        return this.copydefault.optJSONObject(str);
    }

    public java.lang.String toString() {
        return "ImmutableJSONObject{jsonObject=" + this.copydefault + AbstractJsonLexerKt.END_OBJ;
    }
}
