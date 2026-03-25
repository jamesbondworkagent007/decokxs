package o;

import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCAppModel;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class rBP implements rBJ {
    public final InterfaceC41969rBm EZpvd;

    public rBP(@NotNull InterfaceC41969rBm interfaceC41969rBm) {
        Intrinsics.checkNotNullParameter(interfaceC41969rBm, "");
        this.EZpvd = interfaceC41969rBm;
    }

    @Override // o.rBJ
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str4, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map2, @NotNull java.util.Map<java.lang.String, java.lang.String> map3, java.lang.String str5, java.lang.String str6, @NotNull Continuation<? super AbstractC43728ruk<OnDemandKYCAppModel, ResponseFailedException>> continuation) {
        return this.EZpvd.KWHzl(str, str2, str3, map, str4, map2, map3, str5, str6, continuation);
    }

    @Override // o.rBJ
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str4, @NotNull C41957rBa c41957rBa, @NotNull java.util.Map<java.lang.String, java.lang.String> map2, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, @NotNull Continuation<? super AbstractC43728ruk<OnDemandKYCAppModel, ResponseFailedException>> continuation) {
        return this.EZpvd.OLrzqt(str, str2, str3, map, str4, c41957rBa, map2, str5, str6, str7, str8, continuation);
    }
}
