package o;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.aYJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C6908aYJ {
    public static java.lang.String EZpvd(InterfaceC6911aYM interfaceC6911aYM) {
        JSONObject jSONObject = new JSONObject();
        if (interfaceC6911aYM != null) {
            try {
                for (Map.Entry<java.lang.String, java.lang.String> entry : interfaceC6911aYM.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (JSONException e) {
                pUU.AEQbTJ("tag", e);
                pUU.KWHzl("DataReporter", "eventParams2JSONString()->" + e.getMessage());
            }
        }
        return jSONObject.toString();
    }

    public static InterfaceC6911aYM AEQbTJ(java.lang.String str) {
        C6909aYK c6909aYK = new C6909aYK();
        try {
            JSONObject jSONObject = new JSONObject(str);
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                c6909aYK.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e) {
            pUU.AEQbTJ("tag", e);
            pUU.KWHzl("DataReporter", "json2EventParams()->" + e.getMessage());
        }
        return c6909aYK;
    }
}
