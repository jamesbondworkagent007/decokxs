package o;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.immomo.mls.fun.ud.okhttp.UDApiException;
import com.immomo.mls.fun.ud.okhttp.UDOffsiteException;
import com.immomo.mls.fun.ud.okhttp.UDSystemException;
import com.okinc.network.okg.tag.RequestTagEnum;
import java.net.SocketTimeoutException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import o.InterfaceC7434ajk;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;

/* JADX INFO: renamed from: o.ajr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C7441ajr {
    public final InterfaceC58217yxC EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, int i2, @NotNull RequestTagEnum requestTagEnum, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.Map<java.lang.String, java.lang.String> map2, @NotNull final InterfaceC7433ajj<JsonObject> interfaceC7433ajj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(requestTagEnum, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(interfaceC7433ajj, "");
        return C33024moe.subscribeOnIO$default(((InterfaceC7434ajk) C43393roT.httpService$default(C56524yIo.AEQbTJ(InterfaceC7434ajk.class), null, 1, null)).KWHzl(str, str2, i, i2, map, requestTagEnum.getTag(), map2), new Function1() { // from class: o.ajp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7441ajr.OLrzqt(interfaceC7433ajj, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.ajt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7441ajr.OLrzqt(this.AEQbTJ, interfaceC7433ajj, (JsonObject) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(C7441ajr c7441ajr, InterfaceC7433ajj interfaceC7433ajj, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        c7441ajr.KWHzl(jsonObject, (InterfaceC7433ajj<JsonObject>) interfaceC7433ajj);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(InterfaceC7433ajj interfaceC7433ajj, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC7433ajj.OLrzqt(false, C43422row.AEQbTJ(th), new UDSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, int i2, @NotNull RequestTagEnum requestTagEnum, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull java.lang.String str3, @NotNull java.util.Map<java.lang.String, java.lang.String> map2, @NotNull final InterfaceC7433ajj<JsonObject> interfaceC7433ajj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(requestTagEnum, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(interfaceC7433ajj, "");
        return C33024moe.subscribeOnIO$default(((InterfaceC7434ajk) C43393roT.httpService$default(C56524yIo.AEQbTJ(InterfaceC7434ajk.class), null, 1, null)).KWHzl(str, str2, i, i2, Json.Default.parseToJsonElement(C33490mxT.OLrzqt(map)), requestTagEnum.getTag(), str3, map2), new Function1() { // from class: o.ajq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7441ajr.AEQbTJ(interfaceC7433ajj, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.ajo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7441ajr.copydefault(this.copydefault, interfaceC7433ajj, (JsonObject) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit copydefault(C7441ajr c7441ajr, InterfaceC7433ajj interfaceC7433ajj, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        c7441ajr.KWHzl(jsonObject, (InterfaceC7433ajj<JsonObject>) interfaceC7433ajj);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(InterfaceC7433ajj interfaceC7433ajj, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC7433ajj.OLrzqt(false, C43422row.AEQbTJ(th), new UDSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public final void KWHzl(JsonObject jsonObject, InterfaceC7433ajj<JsonObject> interfaceC7433ajj) {
        if (AEQbTJ(jsonObject)) {
            boolean zKWHzl = KWHzl(jsonObject);
            java.lang.String string = jsonObject.get("msg").toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            interfaceC7433ajj.OLrzqt(zKWHzl, jsonObject, new UDApiException(string, null, null, null, 14, null));
            return;
        }
        interfaceC7433ajj.OLrzqt(true, jsonObject, null);
    }

    public final InterfaceC58217yxC KWHzl(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.Map<java.lang.String, java.lang.String> map2, @NotNull final InterfaceC7433ajj<JsonElement> interfaceC7433ajj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(interfaceC7433ajj, "");
        return C33024moe.subscribeOnIO$default(C7400ajC.EZpvd.EZpvd().copydefault(str, map, map2), new Function1() { // from class: o.ajv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7441ajr.copydefault(this.AEQbTJ, interfaceC7433ajj, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.ajw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7441ajr.copydefault(interfaceC7433ajj, (JsonElement) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit copydefault(InterfaceC7433ajj interfaceC7433ajj, JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        interfaceC7433ajj.OLrzqt(true, jsonElement, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C7441ajr c7441ajr, InterfaceC7433ajj interfaceC7433ajj, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        c7441ajr.AEQbTJ(th, (InterfaceC7433ajj<JsonElement>) interfaceC7433ajj);
        return Unit.INSTANCE;
    }

    public final InterfaceC58217yxC OLrzqt(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.Map<java.lang.String, java.lang.String> map2, @NotNull final InterfaceC7433ajj<JsonElement> interfaceC7433ajj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(interfaceC7433ajj, "");
        return C33024moe.subscribeOnIO$default(C7400ajC.EZpvd.EZpvd().EZpvd(str, map, map2), new Function1() { // from class: o.ajB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7441ajr.EZpvd(this.KWHzl, interfaceC7433ajj, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.ajs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7441ajr.AEQbTJ(interfaceC7433ajj, (JsonElement) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(InterfaceC7433ajj interfaceC7433ajj, JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        interfaceC7433ajj.OLrzqt(true, jsonElement, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C7441ajr c7441ajr, InterfaceC7433ajj interfaceC7433ajj, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        c7441ajr.AEQbTJ(th, (InterfaceC7433ajj<JsonElement>) interfaceC7433ajj);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.lang.Throwable th, InterfaceC7433ajj<JsonElement> interfaceC7433ajj) {
        int iCode;
        if (th != null) {
            java.lang.String message = th.getMessage();
            if (th instanceof HttpException) {
                iCode = ((HttpException) th).code();
            } else {
                iCode = th instanceof SocketTimeoutException ? 408 : -1;
            }
            interfaceC7433ajj.OLrzqt(false, null, new UDOffsiteException(message, java.lang.String.valueOf(iCode)));
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ajk.StateListAnimator.mlnUploadFile$default(o.ajk, java.lang.String, java.util.List, int, int, java.lang.String, java.util.Map, int, java.lang.Object):o.ywX */
    public final InterfaceC58217yxC AEQbTJ(@NotNull java.lang.String str, @NotNull RequestTagEnum requestTagEnum, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.List<MultipartBody.Part> list, @NotNull final InterfaceC7433ajj<JsonObject> interfaceC7433ajj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(requestTagEnum, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC7433ajj, "");
        return C33024moe.subscribeOnIO$default(InterfaceC7434ajk.StateListAnimator.mlnUploadFile$default((InterfaceC7434ajk) C43393roT.httpService$default(C56524yIo.AEQbTJ(InterfaceC7434ajk.class), null, 1, null), str, list, 0, 0, requestTagEnum.getTag(), map, 12, null), new Function1() { // from class: o.aju
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7441ajr.valueOf(interfaceC7433ajj, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.ajx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7441ajr.EZpvd(interfaceC7433ajj, this, (JsonObject) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit EZpvd(InterfaceC7433ajj interfaceC7433ajj, C7441ajr c7441ajr, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        interfaceC7433ajj.OLrzqt(c7441ajr.KWHzl(jsonObject), jsonObject, null);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(InterfaceC7433ajj interfaceC7433ajj, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC7433ajj.OLrzqt(false, C43422row.AEQbTJ(th), new UDSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public final boolean copydefault(JsonObject jsonObject) {
        return C33129mqd.AhwBna(jsonObject.get("code")) == 0;
    }

    public final boolean OLrzqt(JsonObject jsonObject) {
        return jsonObject.get("data") != null;
    }

    public final boolean KWHzl(JsonObject jsonObject) {
        return copydefault(jsonObject) && OLrzqt(jsonObject);
    }

    public final boolean AEQbTJ(JsonObject jsonObject) {
        return (jsonObject.get("code") == null || jsonObject.get("data") == null || jsonObject.get("msg") == null) ? false : true;
    }
}
