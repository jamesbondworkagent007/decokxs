package o;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.yof, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C57769yof {
    public C57766yoc AEQbTJ;
    public C57766yoc KWHzl;

    public C57769yof(C57766yoc c57766yoc, C57766yoc c57766yoc2) {
        this.KWHzl = c57766yoc;
        this.AEQbTJ = c57766yoc2;
    }

    public JSONObject copydefault() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.KWHzl.AYXKKw());
            jSONObject.put("to", this.AEQbTJ.AYXKKw());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public java.lang.String toString() {
        return copydefault().toString();
    }
}
