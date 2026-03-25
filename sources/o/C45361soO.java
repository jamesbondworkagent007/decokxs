package o;

import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.soO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45361soO {
    public static final JsonArray OLrzqt(JsonObject jsonObject, @NotNull java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        JsonElement jsonElement;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((jsonObject == null || (jsonElement = (JsonElement) jsonObject.get((java.lang.Object) str)) == null) ? null : JsonElementKt.getJsonArray(jsonElement));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (JsonArray) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public static final java.lang.String copydefault(JsonObject jsonObject, @NotNull java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        JsonElement jsonElement;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((jsonObject == null || (jsonElement = (JsonElement) jsonObject.get((java.lang.Object) str)) == null) ? null : JsonElementKt.getContentOrNull(JsonElementKt.getJsonPrimitive(jsonElement)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (java.lang.String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public static final java.lang.Boolean AEQbTJ(JsonObject jsonObject, @NotNull java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        JsonElement jsonElement;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((jsonObject == null || (jsonElement = (JsonElement) jsonObject.get((java.lang.Object) str)) == null) ? null : JsonElementKt.getBooleanOrNull(JsonElementKt.getJsonPrimitive(jsonElement)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (java.lang.Boolean) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public static final java.lang.Integer KWHzl(JsonObject jsonObject, @NotNull java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        JsonElement jsonElement;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((jsonObject == null || (jsonElement = (JsonElement) jsonObject.get((java.lang.Object) str)) == null) ? null : JsonElementKt.getIntOrNull(JsonElementKt.getJsonPrimitive(jsonElement)));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return (java.lang.Integer) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }
}
