package o;

import com.appsflyer.AppsFlyerProperties;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.awx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8134awx {
    private C8134awx() {
    }

    public static C8135awy EZpvd(java.io.File file) {
        java.util.Map<java.lang.String, java.lang.String> mapKWHzl = KWHzl(file);
        if (mapKWHzl == null) {
            return null;
        }
        java.lang.String str = mapKWHzl.get(AppsFlyerProperties.CHANNEL);
        mapKWHzl.remove(AppsFlyerProperties.CHANNEL);
        return new C8135awy(str, mapKWHzl);
    }

    public static java.util.Map<java.lang.String, java.lang.String> KWHzl(java.io.File file) {
        try {
            java.lang.String strAEQbTJ = AEQbTJ(file);
            if (strAEQbTJ == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strAEQbTJ);
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            java.util.HashMap map = new java.util.HashMap();
            while (itKeys.hasNext()) {
                java.lang.String string = itKeys.next().toString();
                map.put(string, jSONObject.getString(string));
            }
            return map;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static java.lang.String AEQbTJ(java.io.File file) {
        return C8088awD.KWHzl(file, 1903654775);
    }
}
