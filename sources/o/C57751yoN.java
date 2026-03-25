package o;

import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yoN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57751yoN implements java.lang.Cloneable {
    public C57749yoL<java.lang.Object, C57751yoN> AEQbTJ = new C57749yoL<>("changed", false);
    public boolean EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C57749yoL<java.lang.Object, C57751yoN> KWHzl() {
        return this.AEQbTJ;
    }

    public C57751yoN(boolean z) {
        if (z) {
            this.EZpvd = C57834ypr.AEQbTJ(C57834ypr.copydefault, "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", false);
        } else {
            AEQbTJ();
        }
    }

    public void AEQbTJ() {
        EZpvd(OSUtils.AEQbTJ(OneSignal.AEQbTJ));
    }

    public final void EZpvd(boolean z) {
        boolean z2 = this.EZpvd != z;
        this.EZpvd = z;
        if (z2) {
            this.AEQbTJ.KWHzl(this);
        }
    }

    public void OLrzqt() {
        C57834ypr.KWHzl(C57834ypr.copydefault, "ONESIGNAL_ACCEPTED_NOTIFICATION_LAST", this.EZpvd);
    }

    public java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public JSONObject copydefault() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("areNotificationsEnabled", this.EZpvd);
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public java.lang.String toString() {
        return copydefault().toString();
    }
}
