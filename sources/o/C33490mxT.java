package o;

import com.fasterxml.jackson.core.JsonFactory;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mxT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33490mxT {
    public static final C33490mxT copydefault = new C33490mxT();
    public static final java.lang.String KWHzl = JsonFactory.FORMAT_NAME_JSON;

    private C33490mxT() {
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        java.lang.String json = C33488mxR.KWHzl().toJson(obj);
        Intrinsics.checkNotNullExpressionValue(json, "");
        return json;
    }

    public static final <T> T EZpvd(@NotNull java.lang.String str, @NotNull java.lang.Class<T> cls) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cls, "");
        try {
            return (T) C33488mxR.KWHzl().fromJson(str, (java.lang.Class) cls);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final JsonObject OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            return JsonParser.parseString(str).getAsJsonObject();
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(KWHzl, "parseObject JsonObject error: " + str, e);
            return null;
        }
    }

    public static final <T> java.util.List<T> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.Class<T> cls) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cls, "");
        try {
            java.lang.Object objFromJson = C33488mxR.KWHzl().fromJson(str, TypeToken.getParameterized(java.util.List.class, cls).getType());
            Intrinsics.copydefault(objFromJson);
            return (java.util.List) objFromJson;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(KWHzl, "parseArray error: " + str, e);
            return yDY.AhwBna();
        }
    }

    public static final <T> T EZpvd(@NotNull java.lang.String str, @NotNull java.lang.reflect.Type type) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(type, "");
        try {
            return (T) C33488mxR.KWHzl().fromJson(str, type);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(KWHzl, "parseObject error: " + str, e);
            return null;
        }
    }

    public static final <T> T KWHzl(@NotNull java.lang.String str, @NotNull TypeToken<T> typeToken) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(typeToken, "");
        try {
            return (T) C33488mxR.KWHzl().fromJson(str, typeToken.getType());
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(KWHzl, "parseObject error: " + str, e);
            return null;
        }
    }

    public static final JsonElement AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            return JsonParser.parseString(str);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(KWHzl, "parse error: " + str, e);
            return null;
        }
    }

    public static final JsonElement copydefault(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        JsonElement jsonTree = C33488mxR.KWHzl().toJsonTree(obj);
        Intrinsics.checkNotNullExpressionValue(jsonTree, "");
        return jsonTree;
    }
}
