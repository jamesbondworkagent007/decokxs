package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.tln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47214tln {
    public static final C47218tlr copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            JSONObject jSONObject = new JSONObject(str);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("needUploadFiles");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    int iOptInt = jSONArrayOptJSONArray.optInt(i, -1);
                    if (iOptInt >= 0) {
                        arrayList.add(java.lang.Integer.valueOf(iOptInt));
                    }
                }
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ossConfig");
            if (jSONObjectOptJSONObject == null) {
                return null;
            }
            java.lang.String strOptString = jSONObjectOptJSONObject.optString("accessKeyId");
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            java.lang.String strOptString2 = jSONObjectOptJSONObject.optString("accessKeySecret");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "");
            java.lang.String strOptString3 = jSONObjectOptJSONObject.optString("securityToken");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "");
            java.lang.String strOptString4 = jSONObjectOptJSONObject.optString("bucket");
            Intrinsics.checkNotNullExpressionValue(strOptString4, "");
            java.lang.String strOptString5 = jSONObjectOptJSONObject.optString("endpoint");
            Intrinsics.checkNotNullExpressionValue(strOptString5, "");
            long jOptLong = jSONObjectOptJSONObject.optLong("expiration", 0L);
            java.lang.String strOptString6 = jSONObjectOptJSONObject.optString("pathPrefix");
            Intrinsics.checkNotNullExpressionValue(strOptString6, "");
            C47211tlk c47211tlk = new C47211tlk(strOptString, strOptString2, strOptString3, strOptString4, strOptString5, jOptLong, strOptString6);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("app_list");
            if (jSONArrayOptJSONArray2 != null) {
                int length2 = jSONArrayOptJSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i2);
                    if (jSONObjectOptJSONObject2 != null) {
                        java.lang.String strOptString7 = jSONObjectOptJSONObject2.optString("path");
                        java.lang.String strOptString8 = jSONObjectOptJSONObject2.optString("md5");
                        int iOptInt2 = jSONObjectOptJSONObject2.optInt("index", -1);
                        Intrinsics.copydefault((java.lang.Object) strOptString7);
                        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOptString7)) {
                            Intrinsics.copydefault((java.lang.Object) strOptString8);
                            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOptString8)) {
                                arrayList2.add(new C47206tlf(strOptString7, strOptString8, iOptInt2));
                            }
                        }
                    }
                }
            }
            return new C47218tlr(arrayList, c47211tlk, arrayList2);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("OssUploadCoordinator - Failed to parse RSD OSS config: " + e.getMessage());
            return null;
        }
    }
}
