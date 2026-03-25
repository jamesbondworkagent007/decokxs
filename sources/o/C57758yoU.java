package o;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yoU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C57758yoU {
    public C57753yoP AEQbTJ;
    public C57753yoP EZpvd;

    public C57758yoU(C57753yoP c57753yoP, C57753yoP c57753yoP2) {
        this.AEQbTJ = c57753yoP;
        this.EZpvd = c57753yoP2;
    }

    public JSONObject KWHzl() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.AEQbTJ.AhwBna());
            jSONObject.put("to", this.EZpvd.AhwBna());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public java.lang.String toString() {
        return KWHzl().toString();
    }
}
