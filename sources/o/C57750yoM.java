package o;

import com.onesignal.influence.domain.OSInfluenceType;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yoM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57750yoM {
    public OSInfluenceType AEQbTJ;
    public long EZpvd;
    public JSONArray KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.Float copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OSInfluenceType OLrzqt() {
        return this.AEQbTJ;
    }

    public C57750yoM(@androidx.annotation.NonNull OSInfluenceType oSInfluenceType, @androidx.annotation.Nullable JSONArray jSONArray, @androidx.annotation.NonNull java.lang.String str, long j, float f) {
        this.AEQbTJ = oSInfluenceType;
        this.KWHzl = jSONArray;
        this.OLrzqt = str;
        this.EZpvd = j;
        this.copydefault = java.lang.Float.valueOf(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C57750yoM AEQbTJ(C57885yqp c57885yqp) {
        JSONArray jSONArrayOLrzqt;
        OSInfluenceType oSInfluenceType = OSInfluenceType.UNATTRIBUTED;
        if (c57885yqp.EZpvd() != null) {
            C57891yqv c57891yqvEZpvd = c57885yqp.EZpvd();
            if (c57891yqvEZpvd.EZpvd() != null && c57891yqvEZpvd.EZpvd().OLrzqt() != null && c57891yqvEZpvd.EZpvd().OLrzqt().length() > 0) {
                oSInfluenceType = OSInfluenceType.DIRECT;
                jSONArrayOLrzqt = c57891yqvEZpvd.EZpvd().OLrzqt();
            } else if (c57891yqvEZpvd.KWHzl() == null || c57891yqvEZpvd.KWHzl().OLrzqt() == null || c57891yqvEZpvd.KWHzl().OLrzqt().length() <= 0) {
                jSONArrayOLrzqt = null;
            } else {
                oSInfluenceType = OSInfluenceType.INDIRECT;
                jSONArrayOLrzqt = c57891yqvEZpvd.KWHzl().OLrzqt();
            }
        }
        return new C57750yoM(oSInfluenceType, jSONArrayOLrzqt, c57885yqp.KWHzl(), c57885yqp.AEQbTJ(), c57885yqp.copydefault());
    }

    public JSONObject AEQbTJ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = this.KWHzl;
        if (jSONArray != null && jSONArray.length() > 0) {
            jSONObject.put("notification_ids", this.KWHzl);
        }
        jSONObject.put("id", this.OLrzqt);
        if (this.copydefault.floatValue() > 0.0f) {
            jSONObject.put("weight", this.copydefault);
        }
        long j = this.EZpvd;
        if (j > 0) {
            jSONObject.put("timestamp", j);
        }
        return jSONObject;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C57750yoM c57750yoM = (C57750yoM) obj;
        return this.AEQbTJ.equals(c57750yoM.AEQbTJ) && this.KWHzl.equals(c57750yoM.KWHzl) && this.OLrzqt.equals(c57750yoM.OLrzqt) && this.EZpvd == c57750yoM.EZpvd && this.copydefault.equals(c57750yoM.copydefault);
    }

    public int hashCode() {
        java.lang.Object[] objArr = {this.AEQbTJ, this.KWHzl, this.OLrzqt, java.lang.Long.valueOf(this.EZpvd), this.copydefault};
        int iHashCode = 1;
        for (int i = 0; i < 5; i++) {
            java.lang.Object obj = objArr[i];
            iHashCode = (iHashCode * 31) + (obj == null ? 0 : obj.hashCode());
        }
        return iHashCode;
    }

    public java.lang.String toString() {
        return "OutcomeEvent{session=" + this.AEQbTJ + ", notificationIds=" + this.KWHzl + ", name='" + this.OLrzqt + "', timestamp=" + this.EZpvd + ", weight=" + this.copydefault + AbstractJsonLexerKt.END_OBJ;
    }
}
