package o;

import com.appsflyer.AdRevenueScheme;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class KW {
    public static final KW KWHzl = new KW();

    private KW() {
    }

    public final JSONObject AEQbTJ(@NotNull C5242Ke c5242Ke) throws JSONException {
        Intrinsics.checkNotNullParameter(c5242Ke, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_type", c5242Ke.copydefault());
        KX.OLrzqt(jSONObject, MTCoreConstants.Register.KEY_USER_ID, (java.lang.Object) c5242Ke.RcXXUw());
        KX.OLrzqt(jSONObject, "device_id", (java.lang.Object) c5242Ke.ejfBZ());
        KX.OLrzqt(jSONObject, CrashHianalyticsData.TIME, c5242Ke.RJOkX());
        KX.OLrzqt(jSONObject, "event_properties", OLrzqt(C5264La.OLrzqt(c5242Ke.AEQbTJ())));
        KX.OLrzqt(jSONObject, "user_properties", OLrzqt(C5264La.OLrzqt(c5242Ke.OLrzqt())));
        KX.OLrzqt(jSONObject, "groups", OLrzqt(C5264La.OLrzqt(c5242Ke.KWHzl())));
        KX.OLrzqt(jSONObject, "group_properties", OLrzqt(C5264La.OLrzqt(c5242Ke.EZpvd())));
        KX.OLrzqt(jSONObject, "app_version", (java.lang.Object) c5242Ke.valueOf());
        KX.OLrzqt(jSONObject, MTPushConstants.PlatformNode.KEY_PLATFORM, (java.lang.Object) c5242Ke.DTwDnp());
        KX.OLrzqt(jSONObject, "os_name", (java.lang.Object) c5242Ke.zuBGHE());
        KX.OLrzqt(jSONObject, "os_version", (java.lang.Object) c5242Ke.sSMYrx());
        KX.OLrzqt(jSONObject, "device_brand", (java.lang.Object) c5242Ke.fIwbmz());
        KX.OLrzqt(jSONObject, "device_manufacturer", (java.lang.Object) c5242Ke.fJNWhG());
        KX.OLrzqt(jSONObject, "device_model", (java.lang.Object) c5242Ke.AuCTel());
        KX.OLrzqt(jSONObject, "carrier", (java.lang.Object) c5242Ke.AkhnZx());
        KX.OLrzqt(jSONObject, AdRevenueScheme.COUNTRY, (java.lang.Object) c5242Ke.DbNXlk());
        KX.OLrzqt(jSONObject, "region", (java.lang.Object) c5242Ke.QfsBiF());
        KX.OLrzqt(jSONObject, "city", (java.lang.Object) c5242Ke.values());
        KX.OLrzqt(jSONObject, "dma", (java.lang.Object) c5242Ke.uzCIH());
        KX.OLrzqt(jSONObject, "language", (java.lang.Object) c5242Ke.zLjUOn());
        KX.OLrzqt(jSONObject, FirebaseAnalytics.Param.PRICE, c5242Ke.OcIXYQ());
        KX.OLrzqt(jSONObject, FirebaseAnalytics.Param.QUANTITY, c5242Ke.QOLQEE());
        KX.OLrzqt(jSONObject, "revenue", c5242Ke.QVAiDq());
        KX.OLrzqt(jSONObject, "productId", (java.lang.Object) c5242Ke.QKVWgx());
        KX.OLrzqt(jSONObject, "revenueType", (java.lang.Object) c5242Ke.QbewEr());
        KX.OLrzqt(jSONObject, "currency", (java.lang.Object) c5242Ke.fARcdN());
        KX.OLrzqt(jSONObject, "location_lat", c5242Ke.gHZMYf());
        KX.OLrzqt(jSONObject, "location_lng", c5242Ke.AwvSrB());
        KX.OLrzqt(jSONObject, "ip", (java.lang.Object) c5242Ke.AuCTelauCTel());
        KX.OLrzqt(jSONObject, "version_name", (java.lang.Object) c5242Ke.UeEOUB());
        KX.OLrzqt(jSONObject, "idfa", (java.lang.Object) c5242Ke.getFieldNames());
        KX.OLrzqt(jSONObject, "idfv", (java.lang.Object) c5242Ke.iwGUEr());
        KX.OLrzqt(jSONObject, "adid", (java.lang.Object) c5242Ke.AYXKKw());
        KX.OLrzqt(jSONObject, "android_id", (java.lang.Object) c5242Ke.gEmmrt());
        KX.OLrzqt(jSONObject, "event_id", c5242Ke.hDKMBd());
        KX.OLrzqt(jSONObject, OtcExtraKeys.PARAMS_SESSION_ID, c5242Ke.QUSxYX());
        KX.OLrzqt(jSONObject, "insert_id", (java.lang.Object) c5242Ke.AubY());
        KX.OLrzqt(jSONObject, "library", (java.lang.Object) c5242Ke.wlaJM());
        KX.OLrzqt(jSONObject, "partner_id", (java.lang.Object) c5242Ke.AxsJAY());
        KX.OLrzqt(jSONObject, "android_app_set_id", (java.lang.Object) c5242Ke.AhwBna());
        C5253Kp c5253KpORxRYg = c5242Ke.ORxRYg();
        if (c5253KpORxRYg != null) {
            jSONObject.put("plan", c5253KpORxRYg.KWHzl());
        }
        C5246Ki c5246KiZsXlph = c5242Ke.zsXlph();
        if (c5246KiZsXlph != null) {
            jSONObject.put("ingestion_metadata", c5246KiZsXlph.AEQbTJ());
        }
        return jSONObject;
    }

    public final java.lang.String OLrzqt(@NotNull C5242Ke c5242Ke) {
        Intrinsics.checkNotNullParameter(c5242Ke, "");
        java.lang.String string = AEQbTJ(c5242Ke).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final java.lang.String OLrzqt(@NotNull java.util.List<? extends C5242Ke> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        java.util.Iterator<? extends C5242Ke> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(AEQbTJ(it.next()));
        }
        java.lang.String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final JSONObject OLrzqt(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        if (jSONObject.length() > 1024) {
            throw new java.lang.IllegalArgumentException("Too many properties (more than 1024) in JSON");
        }
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "");
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            Intrinsics.copydefault(next, "");
            java.lang.String str = next;
            try {
                java.lang.Object obj = jSONObject.get(str);
                if (Intrinsics.EZpvd(obj.getClass(), java.lang.String.class)) {
                    Intrinsics.copydefault(obj, "");
                    jSONObject.put(str, EZpvd((java.lang.String) obj));
                } else if (Intrinsics.EZpvd(obj.getClass(), JSONObject.class)) {
                    Intrinsics.copydefault(obj, "");
                    jSONObject.put(str, OLrzqt((JSONObject) obj));
                } else if (Intrinsics.EZpvd(obj.getClass(), JSONArray.class)) {
                    Intrinsics.copydefault(obj, "");
                    jSONObject.put(str, EZpvd((JSONArray) obj));
                }
            } catch (JSONException unused) {
                throw new java.lang.IllegalArgumentException("JSON parsing error. Too long (> 1024 chars) or invalid JSON");
            }
        }
        return jSONObject;
    }

    public final JSONArray EZpvd(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return new JSONArray();
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            java.lang.Object obj = jSONArray.get(i);
            if (Intrinsics.EZpvd(obj.getClass(), java.lang.String.class)) {
                Intrinsics.copydefault(obj, "");
                jSONArray.put(i, EZpvd((java.lang.String) obj));
            } else if (Intrinsics.EZpvd(obj.getClass(), JSONObject.class)) {
                Intrinsics.copydefault(obj, "");
                jSONArray.put(i, OLrzqt((JSONObject) obj));
            } else if (Intrinsics.EZpvd(obj.getClass(), JSONArray.class)) {
                Intrinsics.copydefault(obj, "");
                jSONArray.put(i, EZpvd((JSONArray) obj));
            }
        }
        return jSONArray;
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        if (str.length() <= 1024) {
            return str;
        }
        java.lang.String strSubstring = str.substring(0, 1024);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }
}
