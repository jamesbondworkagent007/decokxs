package o;

import org.json.JSONObject;

/* JADX INFO: renamed from: o.yoR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C57755yoR {
    public C57751yoN AEQbTJ;
    public C57751yoN OLrzqt;

    public C57755yoR(C57751yoN c57751yoN, C57751yoN c57751yoN2) {
        this.OLrzqt = c57751yoN;
        this.AEQbTJ = c57751yoN2;
    }

    public JSONObject OLrzqt() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.OLrzqt.copydefault());
            jSONObject.put("to", this.AEQbTJ.copydefault());
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public java.lang.String toString() {
        return OLrzqt().toString();
    }
}
