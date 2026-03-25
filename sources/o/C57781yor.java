package o;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yor, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C57781yor {
    public boolean AEQbTJ;
    public float EZpvd;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean KWHzl() {
        return this.AEQbTJ;
    }

    public C57781yor(@androidx.annotation.NonNull JSONObject jSONObject) throws JSONException {
        this.copydefault = jSONObject.getString("name");
        this.EZpvd = jSONObject.has("weight") ? (float) jSONObject.getDouble("weight") : 0.0f;
        this.AEQbTJ = jSONObject.has("unique") && jSONObject.getBoolean("unique");
    }

    public java.lang.String toString() {
        return "OSInAppMessageOutcome{name='" + this.copydefault + "', weight=" + this.EZpvd + ", unique=" + this.AEQbTJ + AbstractJsonLexerKt.END_OBJ;
    }
}
