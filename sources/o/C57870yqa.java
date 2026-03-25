package o;

import com.onesignal.influence.domain.OSInfluenceChannel;
import com.onesignal.influence.domain.OSInfluenceType;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yqa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57870yqa {
    public OSInfluenceType AEQbTJ;
    public JSONArray EZpvd;
    public OSInfluenceChannel OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OSInfluenceChannel AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OSInfluenceType EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(JSONArray jSONArray) {
        this.EZpvd = jSONArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSONArray OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull OSInfluenceType oSInfluenceType) {
        Intrinsics.checkNotNullParameter(oSInfluenceType, "");
        this.AEQbTJ = oSInfluenceType;
    }

    public C57870yqa(@NotNull java.lang.String str) throws JSONException {
        Intrinsics.checkNotNullParameter(str, "");
        JSONObject jSONObject = new JSONObject(str);
        java.lang.String string = jSONObject.getString("influence_channel");
        java.lang.String string2 = jSONObject.getString("influence_type");
        java.lang.String string3 = jSONObject.getString("influence_ids");
        this.OLrzqt = OSInfluenceChannel.Companion.copydefault(string);
        this.AEQbTJ = OSInfluenceType.Companion.AEQbTJ(string2);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        this.EZpvd = string3.length() == 0 ? null : new JSONArray(string3);
    }

    public C57870yqa(@NotNull OSInfluenceChannel oSInfluenceChannel, @NotNull OSInfluenceType oSInfluenceType, JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(oSInfluenceChannel, "");
        Intrinsics.checkNotNullParameter(oSInfluenceType, "");
        this.OLrzqt = oSInfluenceChannel;
        this.AEQbTJ = oSInfluenceType;
        this.EZpvd = jSONArray;
    }

    public final C57870yqa KWHzl() {
        return new C57870yqa(this.OLrzqt, this.AEQbTJ, this.EZpvd);
    }

    public final java.lang.String copydefault() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("influence_channel", this.OLrzqt.toString()).put("influence_type", this.AEQbTJ.toString());
        JSONArray jSONArray = this.EZpvd;
        java.lang.String string = jSONObjectPut.put("influence_ids", jSONArray != null ? java.lang.String.valueOf(jSONArray) : "").toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public java.lang.String toString() {
        return "SessionInfluence{influenceChannel=" + this.OLrzqt + ", influenceType=" + this.AEQbTJ + ", ids=" + this.EZpvd + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.EZpvd(C57870yqa.class, obj.getClass())) {
            return false;
        }
        C57870yqa c57870yqa = (C57870yqa) obj;
        return this.OLrzqt == c57870yqa.OLrzqt && this.AEQbTJ == c57870yqa.AEQbTJ;
    }

    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode();
    }
}
