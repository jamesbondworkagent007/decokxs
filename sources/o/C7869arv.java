package o;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.arv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7869arv {
    public static JSONObject EZpvd(LuaTable luaTable) {
        JSONObject jSONObject = new JSONObject();
        if (luaTable != null) {
            InterfaceC60041zuQ<LuaTable.Application> it = luaTable.iterator();
            if (it != null) {
                while (it.hasNext()) {
                    try {
                        LuaTable.Application next = it.next();
                        java.lang.String javaString = next.AEQbTJ.toJavaString();
                        LuaValue luaValue = next.KWHzl;
                        if (luaValue instanceof LuaTable) {
                            jSONObject.put(javaString, EZpvd((LuaTable) luaValue));
                        } else {
                            jSONObject.put(javaString, C7910asj.EZpvd(luaValue));
                        }
                    } catch (java.lang.Throwable th) {
                        C7870arw.EZpvd("[LuaView Error-toJSONObject]-Json Parse Failed, Reason: Invalid Format!", th);
                    }
                }
                it.AEQbTJ();
            }
            luaTable.destroy();
        }
        return jSONObject;
    }

    public static LuaValue copydefault(Globals globals, JsonObject jsonObject) {
        LuaTable luaTableAEQbTJ = LuaTable.AEQbTJ(globals);
        if (!luaTableAEQbTJ.AubY()) {
            return luaTableAEQbTJ;
        }
        for (java.lang.String str : jsonObject.keySet()) {
            JsonElement jsonElement = jsonObject.get(str);
            if (jsonElement instanceof JsonObject) {
                luaTableAEQbTJ.AEQbTJ(str, copydefault(globals, (JsonObject) jsonElement), false);
            } else if (jsonElement instanceof JsonArray) {
                luaTableAEQbTJ.AEQbTJ(str, EZpvd(globals, (JsonArray) jsonElement), false);
            } else {
                luaTableAEQbTJ.AEQbTJ(str, C7910asj.KWHzl(globals, jsonElement), false);
            }
        }
        return luaTableAEQbTJ;
    }

    public static LuaValue KWHzl(Globals globals, JSONObject jSONObject) {
        LuaTable luaTableAEQbTJ = LuaTable.AEQbTJ(globals);
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            java.lang.Object objOpt = jSONObject.opt(next);
            if (objOpt instanceof JSONObject) {
                luaTableAEQbTJ.set(next, KWHzl(globals, (JSONObject) objOpt));
            } else if (objOpt instanceof JSONArray) {
                luaTableAEQbTJ.set(next, KWHzl(globals, (JSONArray) objOpt));
            } else {
                luaTableAEQbTJ.set(next, C7910asj.KWHzl(globals, objOpt));
            }
        }
        return luaTableAEQbTJ;
    }

    public static LuaValue EZpvd(Globals globals, JsonArray jsonArray) {
        LuaTable luaTableAEQbTJ = LuaTable.AEQbTJ(globals);
        int size = jsonArray.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            JsonElement jsonElement = jsonArray.get(i);
            if (jsonElement instanceof JsonObject) {
                luaTableAEQbTJ.set(i2, copydefault(globals, (JsonObject) jsonElement));
            } else if (jsonElement instanceof JsonArray) {
                luaTableAEQbTJ.set(i2, EZpvd(globals, (JsonArray) jsonElement));
            } else {
                luaTableAEQbTJ.set(i2, C7910asj.KWHzl(globals, jsonElement));
            }
            i = i2;
        }
        return luaTableAEQbTJ;
    }

    public static LuaValue KWHzl(Globals globals, JSONArray jSONArray) {
        LuaTable luaTableAEQbTJ = LuaTable.AEQbTJ(globals);
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            java.lang.Object objOpt = jSONArray.opt(i);
            if (objOpt instanceof JSONObject) {
                luaTableAEQbTJ.set(i2, KWHzl(globals, (JSONObject) objOpt));
            } else if (objOpt instanceof JSONArray) {
                luaTableAEQbTJ.set(i2, KWHzl(globals, (JSONArray) objOpt));
            } else {
                luaTableAEQbTJ.set(i2, C7910asj.KWHzl(globals, objOpt));
            }
            i = i2;
        }
        return luaTableAEQbTJ;
    }

    public static java.util.Map<java.lang.String, java.lang.Object> KWHzl(JSONObject jSONObject) {
        java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
        java.util.HashMap map = new java.util.HashMap();
        while (itKeys.hasNext()) {
            java.lang.String next = itKeys.next();
            java.lang.Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                map.put(next, KWHzl(objOpt));
            }
        }
        return map;
    }

    public static java.lang.Object KWHzl(@androidx.annotation.NonNull java.lang.Object obj) {
        if (obj instanceof JSONObject) {
            return KWHzl((JSONObject) obj);
        }
        return obj instanceof JSONArray ? KWHzl((JSONArray) obj) : obj;
    }

    public static java.util.List KWHzl(JSONArray jSONArray) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            java.lang.Object objOpt = jSONArray.opt(i);
            if (objOpt != null) {
                arrayList.add(KWHzl(objOpt));
            }
        }
        return arrayList;
    }

    public static JSONObject copydefault(java.util.Map map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (java.lang.Object obj : map.keySet()) {
                java.lang.String string = obj.toString();
                try {
                    java.lang.Object obj2 = map.get(obj);
                    if (obj2 instanceof java.util.Map) {
                        jSONObject.put(string, copydefault((java.util.Map) obj2));
                    } else if (obj2 instanceof java.util.List) {
                        jSONObject.put(string, copydefault((java.util.List) obj2));
                    } else {
                        jSONObject.put(string, obj2);
                    }
                } catch (JSONException e) {
                    pUU.copydefault("mln", android.util.Log.getStackTraceString(e));
                    C7870arw.EZpvd("[LuaView Error-toJson]-Json Parse Failed, Reason: Invalid Format!", e);
                }
            }
        }
        return jSONObject;
    }

    public static JSONArray copydefault(java.util.List list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            for (java.lang.Object obj : list) {
                if (obj instanceof java.util.Map) {
                    jSONArray.put(copydefault((java.util.Map) obj));
                } else if (obj instanceof java.util.List) {
                    jSONArray.put(copydefault((java.util.List) obj));
                } else {
                    jSONArray.put(obj);
                }
            }
        }
        return jSONArray;
    }
}
