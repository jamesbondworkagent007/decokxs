package o;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.onesignal.LocationController;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ypM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC57803ypM {
    public static final java.lang.String[] AEQbTJ;
    public static final java.util.Set<java.lang.String> KWHzl;
    public static final java.lang.Object copydefault = new java.lang.Object();
    public JSONObject EZpvd;
    public java.lang.String OLrzqt;
    public JSONObject djBIcL;

    public abstract AbstractC57803ypM AEQbTJ(java.lang.String str);

    public abstract void KWHzl();

    static {
        java.lang.String[] strArr = {"lat", "long", "loc_acc", "loc_type", "loc_bg", "loc_time_stamp"};
        AEQbTJ = strArr;
        KWHzl = new java.util.HashSet(java.util.Arrays.asList(strArr));
    }

    public C57686ynB AEQbTJ() {
        try {
            return new C57686ynB(EZpvd());
        } catch (JSONException e) {
            e.printStackTrace();
            return new C57686ynB();
        }
    }

    public void EZpvd(JSONObject jSONObject) {
        synchronized (copydefault) {
            this.EZpvd = jSONObject;
        }
    }

    public JSONObject EZpvd() throws JSONException {
        JSONObject jSONObject;
        synchronized (copydefault) {
            jSONObject = new JSONObject(this.EZpvd.toString());
        }
        return jSONObject;
    }

    public C57686ynB copydefault() {
        try {
            return new C57686ynB(AYXKKw());
        } catch (JSONException e) {
            e.printStackTrace();
            return new C57686ynB();
        }
    }

    public JSONObject AYXKKw() throws JSONException {
        JSONObject jSONObject;
        synchronized (copydefault) {
            jSONObject = new JSONObject(this.djBIcL.toString());
        }
        return jSONObject;
    }

    public void copydefault(@androidx.annotation.NonNull JSONObject jSONObject) {
        synchronized (copydefault) {
            this.djBIcL = jSONObject;
        }
    }

    public AbstractC57803ypM(java.lang.String str, boolean z) {
        this.OLrzqt = str;
        if (z) {
            gEmmrt();
        } else {
            this.EZpvd = new JSONObject();
            this.djBIcL = new JSONObject();
        }
    }

    public AbstractC57803ypM EZpvd(java.lang.String str) {
        AbstractC57803ypM abstractC57803ypMAEQbTJ = AEQbTJ(str);
        try {
            abstractC57803ypMAEQbTJ.EZpvd = EZpvd();
            abstractC57803ypMAEQbTJ.djBIcL = AYXKKw();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return abstractC57803ypMAEQbTJ;
    }

    public final java.util.Set<java.lang.String> AEQbTJ(AbstractC57803ypM abstractC57803ypM) {
        try {
            if (this.EZpvd.optLong("loc_time_stamp") == abstractC57803ypM.EZpvd.getLong("loc_time_stamp")) {
                return null;
            }
            java.util.HashMap<java.lang.String, java.lang.Object> map = new java.util.HashMap<>();
            map.put("loc_bg", abstractC57803ypM.EZpvd.opt("loc_bg"));
            map.put("loc_time_stamp", abstractC57803ypM.EZpvd.opt("loc_time_stamp"));
            KWHzl(abstractC57803ypM.djBIcL, map);
            return KWHzl;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public void EZpvd(java.lang.String str, java.lang.Object obj) throws JSONException {
        synchronized (copydefault) {
            this.djBIcL.put(str, obj);
        }
    }

    public void OLrzqt(java.lang.String str, java.lang.Object obj) throws JSONException {
        synchronized (copydefault) {
            this.EZpvd.put(str, obj);
        }
    }

    public final void KWHzl(JSONObject jSONObject, java.util.HashMap<java.lang.String, java.lang.Object> map) throws JSONException {
        synchronized (copydefault) {
            for (Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void copydefault(java.lang.String str) {
        synchronized (copydefault) {
            this.djBIcL.remove(str);
        }
    }

    public void KWHzl(java.lang.String str) {
        synchronized (copydefault) {
            this.EZpvd.remove(str);
        }
    }

    public void AEQbTJ(LocationController.ActionBar actionBar) {
        try {
            java.util.HashMap<java.lang.String, java.lang.Object> map = new java.util.HashMap<>();
            map.put("lat", actionBar.OLrzqt);
            map.put("long", actionBar.KWHzl);
            map.put("loc_acc", actionBar.EZpvd);
            map.put("loc_type", actionBar.AYXKKw);
            KWHzl(this.djBIcL, map);
            java.util.HashMap<java.lang.String, java.lang.Object> map2 = new java.util.HashMap<>();
            map2.put("loc_bg", actionBar.AEQbTJ);
            map2.put("loc_time_stamp", actionBar.copydefault);
            KWHzl(this.EZpvd, map2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void OLrzqt() {
        try {
            java.util.HashMap<java.lang.String, java.lang.Object> map = new java.util.HashMap<>();
            map.put("lat", null);
            map.put("long", null);
            map.put("loc_acc", null);
            map.put("loc_type", null);
            map.put("loc_bg", null);
            map.put("loc_time_stamp", null);
            KWHzl(this.djBIcL, map);
            java.util.HashMap<java.lang.String, java.lang.Object> map2 = new java.util.HashMap<>();
            map2.put("loc_bg", null);
            map2.put("loc_time_stamp", null);
            KWHzl(this.EZpvd, map2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public JSONObject EZpvd(AbstractC57803ypM abstractC57803ypM, boolean z) {
        KWHzl();
        abstractC57803ypM.KWHzl();
        JSONObject jSONObjectOLrzqt = OLrzqt(this.djBIcL, abstractC57803ypM.djBIcL, null, AEQbTJ(abstractC57803ypM));
        if (!z && jSONObjectOLrzqt.toString().equals("{}")) {
            return null;
        }
        try {
            if (!jSONObjectOLrzqt.has(HiAnalyticsConstant.BI_KEY_APP_ID)) {
                jSONObjectOLrzqt.put(HiAnalyticsConstant.BI_KEY_APP_ID, this.djBIcL.optString(HiAnalyticsConstant.BI_KEY_APP_ID));
            }
            if (this.djBIcL.has("email_auth_hash")) {
                jSONObjectOLrzqt.put("email_auth_hash", this.djBIcL.optString("email_auth_hash"));
            }
            if (this.djBIcL.has("sms_auth_hash")) {
                jSONObjectOLrzqt.put("sms_auth_hash", this.djBIcL.optString("sms_auth_hash"));
            }
            if (this.djBIcL.has("external_user_id_auth_hash") && !jSONObjectOLrzqt.has("external_user_id_auth_hash")) {
                jSONObjectOLrzqt.put("external_user_id_auth_hash", this.djBIcL.optString("external_user_id_auth_hash"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObjectOLrzqt;
    }

    public final void gEmmrt() {
        int iCopydefault;
        boolean z;
        java.lang.String str = C57834ypr.copydefault;
        java.lang.String strAEQbTJ = C57834ypr.AEQbTJ(str, "ONESIGNAL_USERSTATE_DEPENDVALYES_" + this.OLrzqt, (java.lang.String) null);
        if (strAEQbTJ == null) {
            EZpvd(new JSONObject());
            try {
                int i = 1;
                if (this.OLrzqt.equals("CURRENT_STATE")) {
                    iCopydefault = C57834ypr.copydefault(str, "ONESIGNAL_SUBSCRIPTION", 1);
                } else {
                    iCopydefault = C57834ypr.copydefault(str, "ONESIGNAL_SYNCED_SUBSCRIPTION", 1);
                }
                if (iCopydefault == -2) {
                    z = false;
                } else {
                    i = iCopydefault;
                    z = true;
                }
                java.util.HashMap<java.lang.String, java.lang.Object> map = new java.util.HashMap<>();
                map.put("subscribableStatus", java.lang.Integer.valueOf(i));
                map.put("userSubscribePref", java.lang.Boolean.valueOf(z));
                KWHzl(this.EZpvd, map);
            } catch (JSONException unused) {
            }
        } else {
            try {
                EZpvd(new JSONObject(strAEQbTJ));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        java.lang.String str2 = C57834ypr.copydefault;
        java.lang.String strAEQbTJ2 = C57834ypr.AEQbTJ(str2, "ONESIGNAL_USERSTATE_SYNCVALYES_" + this.OLrzqt, (java.lang.String) null);
        JSONObject jSONObject = new JSONObject();
        try {
            if (strAEQbTJ2 == null) {
                jSONObject.put("identifier", C57834ypr.AEQbTJ(str2, "GT_REGISTRATION_ID", (java.lang.String) null));
            } else {
                jSONObject = new JSONObject(strAEQbTJ2);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        copydefault(jSONObject);
    }

    public void valueOf() {
        synchronized (copydefault) {
            try {
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (this.djBIcL.has("external_user_id_auth_hash") && ((this.djBIcL.has("external_user_id") && this.djBIcL.get("external_user_id").toString() == "") || !this.djBIcL.has("external_user_id"))) {
                this.djBIcL.remove("external_user_id_auth_hash");
                java.lang.String str = C57834ypr.copydefault;
                C57834ypr.copydefault(str, "ONESIGNAL_USERSTATE_SYNCVALYES_" + this.OLrzqt, this.djBIcL.toString());
                C57834ypr.copydefault(str, "ONESIGNAL_USERSTATE_DEPENDVALYES_" + this.OLrzqt, this.EZpvd.toString());
            } else {
                java.lang.String str2 = C57834ypr.copydefault;
                C57834ypr.copydefault(str2, "ONESIGNAL_USERSTATE_SYNCVALYES_" + this.OLrzqt, this.djBIcL.toString());
                C57834ypr.copydefault(str2, "ONESIGNAL_USERSTATE_DEPENDVALYES_" + this.OLrzqt, this.EZpvd.toString());
            }
        }
    }

    public void EZpvd(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null) {
            JSONObject jSONObject3 = this.EZpvd;
            OLrzqt(jSONObject3, jSONObject, jSONObject3, null);
        }
        if (jSONObject2 != null) {
            JSONObject jSONObject4 = this.djBIcL;
            OLrzqt(jSONObject4, jSONObject2, jSONObject4, null);
            KWHzl(jSONObject2, (JSONObject) null);
        }
        if (jSONObject == null && jSONObject2 == null) {
            return;
        }
        valueOf();
    }

    public void KWHzl(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        if (jSONObject.has("tags")) {
            try {
                JSONObject jSONObjectAYXKKw = AYXKKw();
                if (jSONObjectAYXKKw.has("tags")) {
                    try {
                        jSONObject3 = new JSONObject(jSONObjectAYXKKw.optString("tags"));
                    } catch (JSONException unused) {
                        jSONObject3 = new JSONObject();
                    }
                } else {
                    jSONObject3 = new JSONObject();
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("tags");
                java.util.Iterator<java.lang.String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    java.lang.String next = itKeys.next();
                    if ("".equals(jSONObjectOptJSONObject.optString(next))) {
                        jSONObject3.remove(next);
                    } else if (jSONObject2 == null || !jSONObject2.has(next)) {
                        jSONObject3.put(next, jSONObjectOptJSONObject.optString(next));
                    }
                }
                synchronized (copydefault) {
                    if (jSONObject3.toString().equals("{}")) {
                        this.djBIcL.remove("tags");
                    } else {
                        this.djBIcL.put("tags", jSONObject3);
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public JSONObject OLrzqt(JSONObject jSONObject, java.util.Set<java.lang.String> set) {
        JSONObject jSONObjectEZpvd;
        synchronized (copydefault) {
            JSONObject jSONObject2 = this.djBIcL;
            jSONObjectEZpvd = C57685ynA.EZpvd(jSONObject2, jSONObject, jSONObject2, set);
        }
        return jSONObjectEZpvd;
    }

    public JSONObject EZpvd(JSONObject jSONObject, java.util.Set<java.lang.String> set) {
        JSONObject jSONObjectEZpvd;
        synchronized (copydefault) {
            JSONObject jSONObject2 = this.EZpvd;
            jSONObjectEZpvd = C57685ynA.EZpvd(jSONObject2, jSONObject, jSONObject2, set);
        }
        return jSONObjectEZpvd;
    }

    public JSONObject EZpvd(AbstractC57803ypM abstractC57803ypM, java.util.Set<java.lang.String> set) {
        JSONObject jSONObjectEZpvd;
        synchronized (copydefault) {
            jSONObjectEZpvd = C57685ynA.EZpvd(this.EZpvd, abstractC57803ypM.EZpvd, null, set);
        }
        return jSONObjectEZpvd;
    }

    public static JSONObject OLrzqt(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, java.util.Set<java.lang.String> set) {
        JSONObject jSONObjectEZpvd;
        synchronized (copydefault) {
            jSONObjectEZpvd = C57685ynA.EZpvd(jSONObject, jSONObject2, jSONObject3, set);
        }
        return jSONObjectEZpvd;
    }

    public java.lang.String toString() {
        return "UserState{persistKey='" + this.OLrzqt + "', dependValues=" + this.EZpvd + ", syncValues=" + this.djBIcL + AbstractJsonLexerKt.END_OBJ;
    }
}
