package o;

import com.amplitude.experiment.evaluation.EvaluationVariant;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC5306Mq;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.Mz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5315Mz {
    public static final java.lang.String KWHzl(@NotNull LP lp) {
        Intrinsics.checkNotNullParameter(lp, "");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(JwtUtilsKt.DID_METHOD_KEY, lp.copydefault);
            java.lang.String str = lp.OLrzqt;
            if (str != null) {
                jSONObject.put("value", str);
            }
            java.lang.Object obj = lp.AEQbTJ;
            if (obj != null) {
                jSONObject.put("payload", obj);
            }
            java.lang.String str2 = lp.EZpvd;
            if (str2 != null) {
                jSONObject.put("expKey", str2);
            }
            java.util.Map<java.lang.String, java.lang.Object> map = lp.KWHzl;
            if (map != null) {
                jSONObject.put(TtmlNode.TAG_METADATA, C5308Ms.OLrzqt(map));
            }
        } catch (JSONException e) {
            C5310Mu.copydefault.AEQbTJ("Error converting Variant to json string", e);
        }
        java.lang.String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final LP OLrzqt(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return OLrzqt(new JSONObject(str));
    }

    public static final LP OLrzqt(JSONObject jSONObject) {
        java.util.Map<java.lang.String, java.lang.Object> mapKWHzl;
        java.util.Map map;
        java.lang.String str;
        if (jSONObject == null) {
            return null;
        }
        try {
            java.lang.String string = jSONObject.has(JwtUtilsKt.DID_METHOD_KEY) ? jSONObject.getString(JwtUtilsKt.DID_METHOD_KEY) : null;
            java.lang.String string2 = jSONObject.has("value") ? jSONObject.getString("value") : null;
            if (string == null && string2 == null) {
                return null;
            }
            java.lang.String str2 = (string != null || string2 == null) ? string : string2;
            java.lang.Object obj = jSONObject.has("payload") ? jSONObject.get("payload") : null;
            java.lang.String string3 = jSONObject.has("expKey") ? jSONObject.getString("expKey") : null;
            if (jSONObject.has(TtmlNode.TAG_METADATA)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(TtmlNode.TAG_METADATA);
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
                mapKWHzl = C5308Ms.KWHzl(jSONObject2);
            } else {
                mapKWHzl = null;
            }
            java.util.Map mapIsConnected = mapKWHzl != null ? C56424yEw.isConnected(mapKWHzl) : null;
            if (mapIsConnected != null && mapIsConnected.get("experimentKey") != null) {
                java.lang.Object obj2 = mapIsConnected.get("experimentKey");
                if (!(obj2 instanceof java.lang.String)) {
                    map = mapIsConnected;
                    str = null;
                    return new LP(string2, obj, str, str2, map);
                }
                string3 = (java.lang.String) obj2;
            } else if (string3 != null) {
                if (mapIsConnected == null) {
                    mapIsConnected = new java.util.HashMap();
                }
                mapIsConnected.put("experimentKey", string3);
            }
            map = mapIsConnected;
            str = string3;
            return new LP(string2, obj, str, str2, map);
        } catch (JSONException e) {
            e.printStackTrace();
            InterfaceC5306Mq.ActionBar.w$default(C5310Mu.copydefault, "Error parsing Variant from json string " + jSONObject + ", " + e, null, 2, null);
            return null;
        }
    }

    public static final LP AEQbTJ(@NotNull EvaluationVariant evaluationVariant) throws JSONException {
        java.lang.Object obj;
        java.lang.Object objKWHzl;
        java.lang.Object obj2;
        Intrinsics.checkNotNullParameter(evaluationVariant, "");
        java.util.Map<java.lang.String, java.lang.Object> mapEZpvd = evaluationVariant.EZpvd();
        java.lang.String string = (mapEZpvd == null || (obj2 = mapEZpvd.get("experimentKey")) == null) ? null : obj2.toString();
        java.lang.String string2 = evaluationVariant.copydefault() != null ? evaluationVariant.copydefault().toString() : null;
        java.lang.String str = string == null ? null : string;
        if (evaluationVariant.KWHzl() != null) {
            if (evaluationVariant.KWHzl() instanceof java.util.Map) {
                objKWHzl = C5308Ms.OLrzqt((java.util.Map) evaluationVariant.KWHzl());
            } else if (evaluationVariant.KWHzl() instanceof java.util.Collection) {
                objKWHzl = C5308Ms.EZpvd((java.util.Collection<?>) evaluationVariant.KWHzl());
            } else {
                objKWHzl = evaluationVariant.KWHzl();
            }
            obj = objKWHzl;
        } else {
            obj = null;
        }
        return new LP(string2, obj, str, evaluationVariant.OLrzqt(), evaluationVariant.EZpvd() != null ? evaluationVariant.EZpvd() : null);
    }
}
