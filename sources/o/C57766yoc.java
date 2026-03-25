package o;

import androidx.autofill.HintConstants;
import com.onesignal.OneSignal;
import com.onesignal.OneSignalStateSynchronizer;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yoc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57766yoc implements java.lang.Cloneable {
    public C57749yoL<java.lang.Object, C57766yoc> AEQbTJ = new C57749yoL<>("changed", false);
    public java.lang.String KWHzl;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AEQbTJ() {
        return (this.KWHzl == null || this.copydefault == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C57749yoL<java.lang.Object, C57766yoc> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    public C57766yoc(boolean z) {
        if (z) {
            java.lang.String str = C57834ypr.copydefault;
            this.KWHzl = C57834ypr.AEQbTJ(str, "PREFS_ONESIGNAL_EMAIL_ID_LAST", (java.lang.String) null);
            this.copydefault = C57834ypr.AEQbTJ(str, "PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST", (java.lang.String) null);
        } else {
            this.KWHzl = OneSignal.AuCTelauCTel();
            this.copydefault = OneSignalStateSynchronizer.OLrzqt().values();
        }
    }

    public void EZpvd(@androidx.annotation.NonNull java.lang.String str) {
        java.lang.String str2 = this.KWHzl;
        boolean z = str != null ? !str.equals(str2) : str2 != null;
        this.KWHzl = str;
        if (z) {
            this.AEQbTJ.KWHzl(this);
        }
    }

    public void copydefault() {
        java.lang.String str = C57834ypr.copydefault;
        C57834ypr.copydefault(str, "PREFS_ONESIGNAL_EMAIL_ID_LAST", this.KWHzl);
        C57834ypr.copydefault(str, "PREFS_ONESIGNAL_EMAIL_ADDRESS_LAST", this.copydefault);
    }

    public java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public JSONObject AYXKKw() {
        JSONObject jSONObject = new JSONObject();
        try {
            java.lang.String str = this.KWHzl;
            if (str != null) {
                jSONObject.put("emailUserId", str);
            } else {
                jSONObject.put("emailUserId", JSONObject.NULL);
            }
            java.lang.String str2 = this.copydefault;
            if (str2 != null) {
                jSONObject.put(HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, str2);
            } else {
                jSONObject.put(HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, JSONObject.NULL);
            }
            jSONObject.put("isSubscribed", AEQbTJ());
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public java.lang.String toString() {
        return AYXKKw().toString();
    }
}
