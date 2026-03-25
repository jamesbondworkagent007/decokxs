package com.onesignal;

import androidx.annotation.Nullable;
import o.C57749yoL;
import o.C57751yoN;
import o.C57834ypr;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class OSSubscriptionState implements Cloneable {
    public boolean AEQbTJ;
    public String EZpvd;
    public String KWHzl;
    public boolean OLrzqt;
    public C57749yoL<Object, OSSubscriptionState> copydefault = new C57749yoL<>("changed", false);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C57749yoL<Object, OSSubscriptionState> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return (this.KWHzl == null || this.EZpvd == null || this.AEQbTJ || !this.OLrzqt) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.AEQbTJ;
    }

    public OSSubscriptionState(boolean z, boolean z2) {
        if (z) {
            String str = C57834ypr.copydefault;
            this.AEQbTJ = C57834ypr.AEQbTJ(str, "ONESIGNAL_SUBSCRIPTION_LAST", true);
            this.KWHzl = C57834ypr.AEQbTJ(str, "ONESIGNAL_PLAYER_ID_LAST", (String) null);
            this.EZpvd = C57834ypr.AEQbTJ(str, "ONESIGNAL_PUSH_TOKEN_LAST", (String) null);
            this.OLrzqt = C57834ypr.AEQbTJ(str, "ONESIGNAL_PERMISSION_ACCEPTED_LAST", false);
            return;
        }
        this.AEQbTJ = !OneSignalStateSynchronizer.gEmmrt();
        this.KWHzl = OneSignal.finit();
        this.EZpvd = OneSignalStateSynchronizer.AhwBna();
        this.OLrzqt = z2;
    }

    public void changed(C57751yoN c57751yoN) {
        KWHzl(c57751yoN.EZpvd());
    }

    public void copydefault(@Nullable String str) {
        String str2 = this.KWHzl;
        boolean z = str != null ? !str.equals(str2) : str2 != null;
        this.KWHzl = str;
        if (z) {
            this.copydefault.KWHzl(this);
        }
    }

    public void KWHzl(String str) {
        if (str == null) {
            return;
        }
        boolean zEquals = str.equals(this.EZpvd);
        this.EZpvd = str;
        if (!zEquals) {
            this.copydefault.KWHzl(this);
        }
    }

    public final void KWHzl(boolean z) {
        boolean zOLrzqt = OLrzqt();
        this.OLrzqt = z;
        if (zOLrzqt != OLrzqt()) {
            this.copydefault.KWHzl(this);
        }
    }

    public void djBIcL() {
        String str = C57834ypr.copydefault;
        C57834ypr.KWHzl(str, "ONESIGNAL_SUBSCRIPTION_LAST", this.AEQbTJ);
        C57834ypr.copydefault(str, "ONESIGNAL_PLAYER_ID_LAST", this.KWHzl);
        C57834ypr.copydefault(str, "ONESIGNAL_PUSH_TOKEN_LAST", this.EZpvd);
        C57834ypr.KWHzl(str, "ONESIGNAL_PERMISSION_ACCEPTED_LAST", this.OLrzqt);
    }

    public boolean copydefault(OSSubscriptionState oSSubscriptionState) {
        if (this.AEQbTJ == oSSubscriptionState.AEQbTJ) {
            String str = this.KWHzl;
            if (str == null) {
                str = "";
            }
            String str2 = oSSubscriptionState.KWHzl;
            if (str2 == null) {
                str2 = "";
            }
            if (str.equals(str2)) {
                String str3 = this.EZpvd;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = oSSubscriptionState.EZpvd;
                if (str3.equals(str4 != null ? str4 : "") && this.OLrzqt == oSSubscriptionState.OLrzqt) {
                    return false;
                }
            }
        }
        return true;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public JSONObject gEmmrt() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.KWHzl;
            if (str != null) {
                jSONObject.put("userId", str);
            } else {
                jSONObject.put("userId", JSONObject.NULL);
            }
            String str2 = this.EZpvd;
            if (str2 != null) {
                jSONObject.put("pushToken", str2);
            } else {
                jSONObject.put("pushToken", JSONObject.NULL);
            }
            jSONObject.put("isPushDisabled", copydefault());
            jSONObject.put("isSubscribed", OLrzqt());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return gEmmrt().toString();
    }
}
