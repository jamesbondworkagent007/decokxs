package o;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yoG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57744yoG {
    public JSONObject AEQbTJ;
    public JSONArray copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C57744yoG copy$default(C57744yoG c57744yoG, JSONArray jSONArray, JSONObject jSONObject, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            jSONArray = c57744yoG.copydefault;
        }
        if ((i & 2) != 0) {
            jSONObject = c57744yoG.AEQbTJ;
        }
        return c57744yoG.OLrzqt(jSONArray, jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57744yoG OLrzqt(JSONArray jSONArray, JSONObject jSONObject) {
        return new C57744yoG(jSONArray, jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSONArray OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSONObject copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57744yoG)) {
            return false;
        }
        C57744yoG c57744yoG = (C57744yoG) obj;
        return Intrinsics.EZpvd(this.copydefault, c57744yoG.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c57744yoG.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        JSONArray jSONArray = this.copydefault;
        int iHashCode = jSONArray == null ? 0 : jSONArray.hashCode();
        JSONObject jSONObject = this.AEQbTJ;
        return (iHashCode * 31) + (jSONObject != null ? jSONObject.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OSNotificationIntentExtras(dataArray=" + this.copydefault + ", jsonData=" + this.AEQbTJ + ')';
    }

    public C57744yoG(JSONArray jSONArray, JSONObject jSONObject) {
        this.copydefault = jSONArray;
        this.AEQbTJ = jSONObject;
    }
}
