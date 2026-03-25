package o;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yqv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57891yqv {
    public C57890yqu KWHzl;
    public C57890yqu copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(C57890yqu c57890yqu) {
        this.KWHzl = c57890yqu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57890yqu EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57890yqu KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(C57890yqu c57890yqu) {
        this.copydefault = c57890yqu;
    }

    public C57891yqv(C57890yqu c57890yqu, C57890yqu c57890yqu2) {
        this.KWHzl = c57890yqu;
        this.copydefault = c57890yqu2;
    }

    public final JSONObject OLrzqt() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C57890yqu c57890yqu = this.KWHzl;
        if (c57890yqu != null) {
            jSONObject.put(DevicePublicKeyStringDef.DIRECT, c57890yqu.EZpvd());
        }
        C57890yqu c57890yqu2 = this.copydefault;
        if (c57890yqu2 != null) {
            jSONObject.put(DevicePublicKeyStringDef.INDIRECT, c57890yqu2.EZpvd());
        }
        return jSONObject;
    }

    public final C57891yqv EZpvd(C57890yqu c57890yqu) {
        AEQbTJ(c57890yqu);
        return this;
    }

    public final C57891yqv OLrzqt(C57890yqu c57890yqu) {
        KWHzl(c57890yqu);
        return this;
    }

    public java.lang.String toString() {
        return "OSOutcomeSource{directBody=" + this.KWHzl + ", indirectBody=" + this.copydefault + AbstractJsonLexerKt.END_OBJ;
    }
}
