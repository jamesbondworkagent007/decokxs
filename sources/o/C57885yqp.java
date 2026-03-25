package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yqp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57885yqp {
    public float AEQbTJ;
    public long EZpvd;
    public final C57891yqv KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57891yqv EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(long j) {
        this.EZpvd = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float copydefault() {
        return this.AEQbTJ;
    }

    public C57885yqp(@NotNull java.lang.String str, C57891yqv c57891yqv, float f, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.KWHzl = c57891yqv;
        this.AEQbTJ = f;
        this.EZpvd = j;
    }

    public final JSONObject valueOf() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("id", this.copydefault);
        C57891yqv c57891yqv = this.KWHzl;
        if (c57891yqv != null) {
            jSONObjectPut.put("sources", c57891yqv.OLrzqt());
        }
        float f = this.AEQbTJ;
        if (f > 0.0f) {
            jSONObjectPut.put("weight", java.lang.Float.valueOf(f));
        }
        long j = this.EZpvd;
        if (j > 0) {
            jSONObjectPut.put("timestamp", j);
        }
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "");
        return jSONObjectPut;
    }

    public final boolean OLrzqt() {
        C57891yqv c57891yqv = this.KWHzl;
        return c57891yqv == null || (c57891yqv.EZpvd() == null && this.KWHzl.KWHzl() == null);
    }

    public java.lang.String toString() {
        return "OSOutcomeEventParams{outcomeId='" + this.copydefault + "', outcomeSource=" + this.KWHzl + ", weight=" + this.AEQbTJ + ", timestamp=" + this.EZpvd + AbstractJsonLexerKt.END_OBJ;
    }
}
