package o;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ctD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12764ctD {
    public static final C12764ctD OLrzqt = new C12764ctD();
    public static Gson AEQbTJ = new Gson();
    public static final int KWHzl = 8;

    private C12764ctD() {
    }

    public final RequestBody KWHzl(java.lang.Object obj) {
        java.lang.String string;
        JsonElement jsonTree = AEQbTJ.toJsonTree(obj);
        if (jsonTree == null || (string = jsonTree.toString()) == null) {
            return null;
        }
        return RequestBody.Companion.create(string, MediaType.Companion.get("application/json;charset=utf-8"));
    }

    public final java.lang.String AEQbTJ(java.lang.Object obj) {
        if (obj instanceof JsonElement) {
            return ((JsonElement) obj).toString();
        }
        JsonElement jsonTree = AEQbTJ.toJsonTree(obj);
        if (jsonTree != null) {
            return jsonTree.toString();
        }
        return null;
    }

    public final java.lang.String EZpvd(java.lang.Object obj) {
        java.lang.String strAEQbTJ;
        if (obj == null) {
            return "";
        }
        Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
        java.lang.String strAEQbTJ2 = AEQbTJ(obj);
        if (strAEQbTJ2 == null) {
            strAEQbTJ2 = "";
        }
        kotlinx.serialization.json.JsonElement toJsonElement = jsonAEQbTJ.parseToJsonElement(strAEQbTJ2);
        JsonObject jsonObject = toJsonElement instanceof JsonObject ? (JsonObject) toJsonElement : null;
        return (jsonObject == null || (strAEQbTJ = C13933dbt.AEQbTJ(jsonObject)) == null) ? "" : strAEQbTJ;
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String json = new GsonBuilder().setPrettyPrinting().create().toJson((JsonElement) new JsonParser().parse(str).getAsJsonObject());
        Intrinsics.checkNotNullExpressionValue(json, "");
        return json;
    }

    public final com.google.gson.JsonObject OLrzqt(@NotNull com.google.gson.JsonObject jsonObject, @NotNull com.google.gson.JsonObject jsonObject2) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(jsonObject2, "");
        com.google.gson.JsonObject jsonObjectDeepCopy = jsonObject.deepCopy();
        for (Map.Entry<java.lang.String, JsonElement> entry : jsonObject2.entrySet()) {
            Intrinsics.copydefault(entry);
            jsonObjectDeepCopy.add(entry.getKey(), entry.getValue());
        }
        Intrinsics.copydefault(jsonObjectDeepCopy);
        return jsonObjectDeepCopy;
    }
}
