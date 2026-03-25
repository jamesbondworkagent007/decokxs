package o;

import com.onesignal.OneSignal;
import com.onesignal.OneSignalStateSynchronizer;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yoP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57753yoP implements java.lang.Cloneable {
    public C57749yoL<java.lang.Object, C57753yoP> AEQbTJ = new C57749yoL<>("changed", false);
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C57749yoL<java.lang.Object, C57753yoP> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean KWHzl() {
        return (this.EZpvd == null || this.KWHzl == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    public C57753yoP(boolean z) {
        if (z) {
            java.lang.String str = C57834ypr.copydefault;
            this.EZpvd = C57834ypr.AEQbTJ(str, "PREFS_OS_SMS_ID_LAST", (java.lang.String) null);
            this.KWHzl = C57834ypr.AEQbTJ(str, "PREFS_OS_SMS_NUMBER_LAST", (java.lang.String) null);
        } else {
            this.EZpvd = OneSignal.QfsBiF();
            this.KWHzl = OneSignalStateSynchronizer.AYXKKw().values();
        }
    }

    public void AEQbTJ(@androidx.annotation.NonNull java.lang.String str) {
        java.lang.String str2 = this.EZpvd;
        boolean z = str != null ? !str.equals(str2) : str2 != null;
        this.EZpvd = str;
        if (z) {
            this.AEQbTJ.KWHzl(this);
        }
    }

    public void copydefault() {
        java.lang.String str = C57834ypr.copydefault;
        C57834ypr.copydefault(str, "PREFS_OS_SMS_ID_LAST", this.EZpvd);
        C57834ypr.copydefault(str, "PREFS_OS_SMS_NUMBER_LAST", this.KWHzl);
    }

    public java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public JSONObject AhwBna() {
        JSONObject jSONObject = new JSONObject();
        try {
            java.lang.String str = this.EZpvd;
            if (str != null) {
                jSONObject.put("smsUserId", str);
            } else {
                jSONObject.put("smsUserId", JSONObject.NULL);
            }
            java.lang.String str2 = this.KWHzl;
            if (str2 != null) {
                jSONObject.put("smsNumber", str2);
            } else {
                jSONObject.put("smsNumber", JSONObject.NULL);
            }
            jSONObject.put("isSubscribed", KWHzl());
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public java.lang.String toString() {
        return AhwBna().toString();
    }
}
