package o;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43401rob {
    public static final Gson AEQbTJ = new Gson();

    public static final JsonObject EZpvd(@NotNull ResponseData<?> responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        try {
            return AEQbTJ.toJsonTree(responseData).getAsJsonObject();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
