package o;

import com.okinc.business.defi.biz.net.api.DappApiService;
import com.okinc.business.defi.biz.net.loader.DappLoader$getAptosAbi$2;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.dbm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13926dbm {
    public final DappApiService AEQbTJ() {
        return DappApiService.Companion.EZpvd();
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super ResponseData<java.lang.String>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new DappLoader$getAptosAbi$2(this, str, str2, null), continuation);
    }

    public final AbstractC58185ywX<JsonObject> copydefault(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        return C33527myD.KWHzl(DappApiService.StateListAnimator.getRequest$default(AEQbTJ(), str, map, null, 4, null));
    }

    public final AbstractC58185ywX<JsonObject> KWHzl(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.String string = new JSONObject(map).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return C33527myD.KWHzl(DappApiService.StateListAnimator.postRequest$default(AEQbTJ(), str, Json.Default.parseToJsonElement(string), null, 4, null));
    }
}
