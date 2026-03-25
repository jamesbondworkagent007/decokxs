package o;

import com.appsflyer.AdRevenueScheme;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C5246Ki;
import o.C5253Kp;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class KX {
    public static final java.lang.String copydefault(@NotNull JSONObject jSONObject, @NotNull java.lang.String str, @NotNull java.lang.String str2) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!jSONObject.has(str)) {
            return str2;
        }
        java.lang.String string = jSONObject.getString(str);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final java.util.Set<java.lang.Integer> OLrzqt(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "");
        while (itKeys.hasNext()) {
            JSONArray jSONArray = jSONObject.getJSONArray(itKeys.next());
            Intrinsics.checkNotNullExpressionValue(jSONArray, "");
            for (int i : EZpvd(jSONArray)) {
                arrayList.add(java.lang.Integer.valueOf(i));
            }
        }
        return CollectionsKt___CollectionsKt.OqFWZa(arrayList);
    }

    public static final int[] EZpvd(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "");
        int length = jSONArray.length();
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = jSONArray.optInt(i);
        }
        return iArr;
    }

    public static final C5242Ke AEQbTJ(@NotNull JSONObject jSONObject) throws JSONException {
        C5253Kp c5253KpEZpvd;
        java.util.Map<java.lang.String, java.lang.Object> mapCopydefault;
        java.util.Map<java.lang.String, java.lang.Object> mapCopydefault2;
        java.util.Map<java.lang.String, java.lang.Object> mapCopydefault3;
        java.util.Map<java.lang.String, java.lang.Object> mapCopydefault4;
        Intrinsics.checkNotNullParameter(jSONObject, "");
        C5242Ke c5242Ke = new C5242Ke();
        java.lang.String string = jSONObject.getString("event_type");
        Intrinsics.checkNotNullExpressionValue(string, "");
        c5242Ke.OLrzqt(string);
        C5246Ki c5246KiCopydefault = null;
        c5242Ke.wlaJM(OLrzqt(jSONObject, MTCoreConstants.Register.KEY_USER_ID, (java.lang.String) null));
        c5242Ke.values(OLrzqt(jSONObject, "device_id", (java.lang.String) null));
        c5242Ke.copydefault(jSONObject.has(CrashHianalyticsData.TIME) ? java.lang.Long.valueOf(jSONObject.getLong(CrashHianalyticsData.TIME)) : null);
        JSONObject jSONObjectKWHzl = KWHzl(jSONObject, "event_properties", null);
        c5242Ke.AEQbTJ((jSONObjectKWHzl == null || (mapCopydefault4 = C5264La.copydefault(jSONObjectKWHzl)) == null) ? null : C56424yEw.isConnected(mapCopydefault4));
        JSONObject jSONObjectKWHzl2 = KWHzl(jSONObject, "user_properties", null);
        c5242Ke.EZpvd((jSONObjectKWHzl2 == null || (mapCopydefault3 = C5264La.copydefault(jSONObjectKWHzl2)) == null) ? null : C56424yEw.isConnected(mapCopydefault3));
        JSONObject jSONObjectKWHzl3 = KWHzl(jSONObject, "groups", null);
        c5242Ke.copydefault((jSONObjectKWHzl3 == null || (mapCopydefault2 = C5264La.copydefault(jSONObjectKWHzl3)) == null) ? null : C56424yEw.isConnected(mapCopydefault2));
        JSONObject jSONObjectKWHzl4 = KWHzl(jSONObject, "group_properties", null);
        c5242Ke.OLrzqt((jSONObjectKWHzl4 == null || (mapCopydefault = C5264La.copydefault(jSONObjectKWHzl4)) == null) ? null : C56424yEw.isConnected(mapCopydefault));
        c5242Ke.EZpvd(OLrzqt(jSONObject, "app_version", (java.lang.String) null));
        c5242Ke.iwGUEr(OLrzqt(jSONObject, MTPushConstants.PlatformNode.KEY_PLATFORM, (java.lang.String) null));
        c5242Ke.uzCIH(OLrzqt(jSONObject, "os_name", (java.lang.String) null));
        c5242Ke.hDKMBd(OLrzqt(jSONObject, "os_version", (java.lang.String) null));
        c5242Ke.djBIcL(OLrzqt(jSONObject, "device_brand", (java.lang.String) null));
        c5242Ke.isConnected(OLrzqt(jSONObject, "device_manufacturer", (java.lang.String) null));
        c5242Ke.fetchVPNInfo(OLrzqt(jSONObject, "device_model", (java.lang.String) null));
        c5242Ke.AhwBna(OLrzqt(jSONObject, "carrier", (java.lang.String) null));
        c5242Ke.gEmmrt(OLrzqt(jSONObject, AdRevenueScheme.COUNTRY, (java.lang.String) null));
        c5242Ke.zsXlph(OLrzqt(jSONObject, "region", (java.lang.String) null));
        c5242Ke.AYXKKw(OLrzqt(jSONObject, "city", (java.lang.String) null));
        c5242Ke.DbNXlk(OLrzqt(jSONObject, "dma", (java.lang.String) null));
        c5242Ke.fJNWhG(OLrzqt(jSONObject, "language", (java.lang.String) null));
        c5242Ke.copydefault(jSONObject.has(FirebaseAnalytics.Param.PRICE) ? java.lang.Double.valueOf(jSONObject.getDouble(FirebaseAnalytics.Param.PRICE)) : null);
        c5242Ke.OLrzqt(jSONObject.has(FirebaseAnalytics.Param.QUANTITY) ? java.lang.Integer.valueOf(jSONObject.getInt(FirebaseAnalytics.Param.QUANTITY)) : null);
        c5242Ke.EZpvd(jSONObject.has("revenue") ? java.lang.Double.valueOf(jSONObject.getDouble("revenue")) : null);
        c5242Ke.getNewProxyInstance(OLrzqt(jSONObject, "productId", (java.lang.String) null));
        c5242Ke.zLjUOn(OLrzqt(jSONObject, "revenueType", (java.lang.String) null));
        c5242Ke.OLrzqt(jSONObject.has("location_lat") ? java.lang.Double.valueOf(jSONObject.getDouble("location_lat")) : null);
        c5242Ke.AEQbTJ(jSONObject.has("location_lng") ? java.lang.Double.valueOf(jSONObject.getDouble("location_lng")) : null);
        c5242Ke.ejfBZ(OLrzqt(jSONObject, "ip", (java.lang.String) null));
        c5242Ke.AkhnZx(OLrzqt(jSONObject, "idfa", (java.lang.String) null));
        c5242Ke.fARcdN(OLrzqt(jSONObject, "idfv", (java.lang.String) null));
        c5242Ke.copydefault(OLrzqt(jSONObject, "adid", (java.lang.String) null));
        c5242Ke.KWHzl(OLrzqt(jSONObject, "android_id", (java.lang.String) null));
        c5242Ke.AEQbTJ(jSONObject.optString("android_app_set_id", null));
        c5242Ke.EZpvd(jSONObject.has("event_id") ? java.lang.Long.valueOf(jSONObject.getLong("event_id")) : null);
        c5242Ke.KWHzl(jSONObject.has(OtcExtraKeys.PARAMS_SESSION_ID) ? java.lang.Long.valueOf(jSONObject.getLong(OtcExtraKeys.PARAMS_SESSION_ID)) : null);
        c5242Ke.fIwbmz(OLrzqt(jSONObject, "insert_id", (java.lang.String) null));
        c5242Ke.AuCTel(jSONObject.has("library") ? jSONObject.getString("library") : null);
        c5242Ke.getFieldNames(OLrzqt(jSONObject, "partner_id", (java.lang.String) null));
        if (jSONObject.has("plan")) {
            C5253Kp.Application application = C5253Kp.Companion;
            JSONObject jSONObject2 = jSONObject.getJSONObject("plan");
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
            c5253KpEZpvd = application.EZpvd(jSONObject2);
        } else {
            c5253KpEZpvd = null;
        }
        c5242Ke.copydefault(c5253KpEZpvd);
        if (jSONObject.has("ingestion_metadata")) {
            C5246Ki.Activity activity = C5246Ki.Companion;
            JSONObject jSONObject3 = jSONObject.getJSONObject("ingestion_metadata");
            Intrinsics.checkNotNullExpressionValue(jSONObject3, "");
            c5246KiCopydefault = activity.copydefault(jSONObject3);
        }
        c5242Ke.copydefault(c5246KiCopydefault);
        return c5242Ke;
    }

    public static final java.util.List<C5242Ke> AEQbTJ(@NotNull JSONArray jSONArray) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONArray, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.Integer> it = C56548yJl.AhwBna(0, jSONArray.length()).iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = jSONArray.getJSONObject(((AbstractC56415yEn) it).nextInt());
            Intrinsics.checkNotNullExpressionValue(jSONObject, "");
            arrayList.add(AEQbTJ(jSONObject));
        }
        return arrayList;
    }

    public static final kotlin.Pair<java.util.List<JSONObject>, java.util.List<JSONObject>> copydefault(@NotNull JSONArray jSONArray) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONArray, "");
        int length = jSONArray.length() / 2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<java.lang.Integer> it = C56548yJl.AhwBna(0, jSONArray.length()).iterator();
        while (it.hasNext()) {
            int iNextInt = ((AbstractC56415yEn) it).nextInt();
            if (iNextInt < length) {
                JSONObject jSONObject = jSONArray.getJSONObject(iNextInt);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "");
                arrayList.add(jSONObject);
            } else {
                JSONObject jSONObject2 = jSONArray.getJSONObject(iNextInt);
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
                arrayList2.add(jSONObject2);
            }
        }
        return new kotlin.Pair<>(arrayList, arrayList2);
    }

    public static final java.util.List<JSONObject> OLrzqt(@NotNull JSONArray jSONArray) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONArray, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.Integer> it = C56548yJl.AhwBna(0, jSONArray.length()).iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = jSONArray.getJSONObject(((AbstractC56415yEn) it).nextInt());
            Intrinsics.checkNotNullExpressionValue(jSONObject, "");
            arrayList.add(jSONObject);
        }
        return arrayList;
    }

    public static final void OLrzqt(@NotNull JSONObject jSONObject, @NotNull java.lang.String str, java.lang.Object obj) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (obj != null) {
            jSONObject.put(str, obj);
        }
    }

    public static final JSONObject KWHzl(@NotNull JSONObject jSONObject, @NotNull java.lang.String str, JSONObject jSONObject2) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Intrinsics.checkNotNullParameter(str, "");
        return jSONObject.has(str) ? jSONObject.getJSONObject(str) : jSONObject2;
    }

    public static final java.lang.String OLrzqt(@NotNull JSONObject jSONObject, @NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        Intrinsics.checkNotNullParameter(str, "");
        return jSONObject.has(str) ? jSONObject.getString(str) : str2;
    }
}
