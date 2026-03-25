package o;

import com.onesignal.OSSubscriptionState;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yoZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57763yoZ {
    public OSSubscriptionState OLrzqt;
    public OSSubscriptionState copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OSSubscriptionState AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OSSubscriptionState copydefault() {
        return this.OLrzqt;
    }

    public C57763yoZ(OSSubscriptionState oSSubscriptionState, OSSubscriptionState oSSubscriptionState2) {
        this.copydefault = oSSubscriptionState;
        this.OLrzqt = oSSubscriptionState2;
    }

    public JSONObject EZpvd() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.copydefault.gEmmrt());
            jSONObject.put("to", this.OLrzqt.gEmmrt());
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public java.lang.String toString() {
        return EZpvd().toString();
    }
}
