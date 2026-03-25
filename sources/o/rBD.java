package o;

import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCAppModel;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rBD implements rBG {
    public final InterfaceC41969rBm KWHzl;

    public rBD(@NotNull InterfaceC41969rBm interfaceC41969rBm) {
        Intrinsics.checkNotNullParameter(interfaceC41969rBm, "");
        this.KWHzl = interfaceC41969rBm;
    }

    @Override // o.rBG
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str3, java.lang.String str4, @NotNull Continuation<? super AbstractC43728ruk<OnDemandKYCAppModel, ResponseFailedException>> continuation) {
        return this.KWHzl.AEQbTJ(str, str2, map, str3, str4, continuation);
    }
}
