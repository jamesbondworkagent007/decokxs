package o;

import com.amplifyframework.core.model.ModelIdentifier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.ynA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57685ynA {
    public static JSONObject EZpvd(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, java.util.Set<java.lang.String> set) {
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject2 == null) {
            return jSONObject3;
        }
        java.util.Iterator<java.lang.String> itKeys = jSONObject2.keys();
        JSONObject jSONObject4 = jSONObject3 != null ? jSONObject3 : new JSONObject();
        while (itKeys.hasNext()) {
            try {
                java.lang.String next = itKeys.next();
                java.lang.Object obj = jSONObject2.get(next);
                if (jSONObject.has(next)) {
                    if (obj instanceof JSONObject) {
                        java.lang.String string = EZpvd(jSONObject.getJSONObject(next), (JSONObject) obj, (jSONObject3 == null || !jSONObject3.has(next)) ? null : jSONObject3.getJSONObject(next), set).toString();
                        if (!string.equals("{}")) {
                            jSONObject4.put(next, new JSONObject(string));
                        }
                    } else if (obj instanceof JSONArray) {
                        AEQbTJ(next, (JSONArray) obj, jSONObject.getJSONArray(next), jSONObject4);
                    } else if (set != null && set.contains(next)) {
                        jSONObject4.put(next, obj);
                    } else {
                        java.lang.Object obj2 = jSONObject.get(next);
                        if (!obj.equals(obj2)) {
                            if (!(obj2 instanceof java.lang.Number) || !(obj instanceof java.lang.Number)) {
                                jSONObject4.put(next, obj);
                            } else if (((java.lang.Number) obj2).doubleValue() != ((java.lang.Number) obj).doubleValue()) {
                                jSONObject4.put(next, obj);
                            }
                        }
                    }
                } else if (obj instanceof JSONObject) {
                    jSONObject4.put(next, new JSONObject(obj.toString()));
                } else if (obj instanceof JSONArray) {
                    AEQbTJ(next, (JSONArray) obj, null, jSONObject4);
                } else {
                    jSONObject4.put(next, obj);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject4;
    }

    public static void AEQbTJ(java.lang.String str, JSONArray jSONArray, JSONArray jSONArray2, JSONObject jSONObject) throws JSONException {
        if (str.endsWith("_a") || str.endsWith("_d")) {
            jSONObject.put(str, jSONArray);
            return;
        }
        java.lang.String strAEQbTJ = AEQbTJ(jSONArray);
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        java.lang.String strAEQbTJ2 = jSONArray2 == null ? null : AEQbTJ(jSONArray2);
        for (int i = 0; i < jSONArray.length(); i++) {
            java.lang.String str2 = (java.lang.String) jSONArray.get(i);
            if (jSONArray2 == null || !strAEQbTJ2.contains(str2)) {
                jSONArray3.put(str2);
            }
        }
        if (jSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                java.lang.String string = jSONArray2.getString(i2);
                if (!strAEQbTJ.contains(string)) {
                    jSONArray4.put(string);
                }
            }
        }
        if (!jSONArray3.toString().equals(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
            jSONObject.put(str + "_a", jSONArray3);
        }
        if (jSONArray4.toString().equals(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
            return;
        }
        jSONObject.put(str + "_d", jSONArray4);
    }

    public static java.lang.String AEQbTJ(JSONArray jSONArray) {
        java.lang.String str = "[";
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                str = str + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR + jSONArray.getString(i) + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR;
            } catch (JSONException unused) {
            }
        }
        return str + "]";
    }

    public static java.lang.String AEQbTJ(JSONObject jSONObject) {
        java.lang.String strGroup;
        java.lang.String string = jSONObject.toString();
        if (!jSONObject.has("external_user_id")) {
            return string;
        }
        Matcher matcher = Pattern.compile("(?<=\"external_user_id\":\").*?(?=\")").matcher(string);
        return (!matcher.find() || (strGroup = matcher.group(0)) == null) ? string : matcher.replaceAll(Matcher.quoteReplacement(strGroup.replace("\\/", "/")));
    }

    public static JSONObject copydefault(C57686ynB c57686ynB, java.lang.String str) {
        if (!c57686ynB.KWHzl(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectAEQbTJ = c57686ynB.AEQbTJ(str);
        java.util.Iterator<java.lang.String> itKeys = jSONObjectAEQbTJ.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            try {
                java.lang.Object obj = jSONObjectAEQbTJ.get(next);
                if (!"".equals(obj)) {
                    jSONObject.put(next, obj);
                }
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean KWHzl(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    if (KWHzl(jSONArray.get(i)).equals(KWHzl(jSONArray2.get(i2)))) {
                        break;
                    }
                }
                return false;
            } catch (JSONException e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    public static java.lang.Object KWHzl(java.lang.Object obj) {
        java.lang.Class<?> cls = obj.getClass();
        if (cls.equals(java.lang.Integer.class)) {
            return java.lang.Long.valueOf(((java.lang.Integer) obj).intValue());
        }
        return cls.equals(java.lang.Float.class) ? java.lang.Double.valueOf(((java.lang.Float) obj).floatValue()) : obj;
    }
}
