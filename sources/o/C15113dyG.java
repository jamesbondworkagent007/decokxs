package o;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.dyG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C15113dyG {
    public static boolean copydefault(java.lang.String str) {
        try {
            try {
                new JSONObject(str);
                return true;
            } catch (JSONException unused) {
                return false;
            }
        } catch (JSONException unused2) {
            new JSONArray(str);
            return true;
        }
    }
}
