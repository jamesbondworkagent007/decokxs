package o;

import com.google.gson.JsonObject;
import com.immomo.mls.fun.ud.okhttp.UDSystemException;
import com.okinc.wholesale.net.UDGrowthImageApiService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ykG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57532ykG {
    public final InterfaceC58217yxC OLrzqt(@NotNull java.lang.String str, @NotNull java.util.List<MultipartBody.Part> list, @NotNull java.lang.String str2, @NotNull final InterfaceC7433ajj<JsonObject> interfaceC7433ajj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC7433ajj, "");
        return C33024moe.subscribeOnIO$default(UDGrowthImageApiService.Companion.OLrzqt().mlnUploadFile(str, list, str2), new Function1() { // from class: o.ykO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57532ykG.OLrzqt(interfaceC7433ajj, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.ykL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57532ykG.OLrzqt(interfaceC7433ajj, this, (JsonObject) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(InterfaceC7433ajj interfaceC7433ajj, C57532ykG c57532ykG, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        interfaceC7433ajj.OLrzqt(c57532ykG.KWHzl(jsonObject), jsonObject, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(InterfaceC7433ajj interfaceC7433ajj, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC7433ajj.OLrzqt(false, C43422row.AEQbTJ(th), new UDSystemException(th.getMessage()));
        return Unit.INSTANCE;
    }

    public final boolean EZpvd(JsonObject jsonObject) {
        return C33129mqd.AhwBna(jsonObject.get("code")) == 0;
    }

    public final boolean copydefault(JsonObject jsonObject) {
        return jsonObject.get("data") != null;
    }

    public final boolean KWHzl(JsonObject jsonObject) {
        return EZpvd(jsonObject) && copydefault(jsonObject);
    }
}
