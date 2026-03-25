package o;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yow, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C57786yow {
    public JSONArray KWHzl;
    public JSONObject OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JSONArray EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JSONObject KWHzl() {
        return this.OLrzqt;
    }

    public C57786yow(@androidx.annotation.NonNull JSONObject jSONObject) throws JSONException {
        this.OLrzqt = jSONObject.has("adds") ? jSONObject.getJSONObject("adds") : null;
        this.KWHzl = jSONObject.has("removes") ? jSONObject.getJSONArray("removes") : null;
    }

    public java.lang.String toString() {
        return "OSInAppMessageTag{adds=" + this.OLrzqt + ", removes=" + this.KWHzl + AbstractJsonLexerKt.END_OBJ;
    }
}
