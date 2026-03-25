package o;

import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ValueAndName;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rBL {
    public final InterfaceC41969rBm copydefault;

    public rBL(@NotNull InterfaceC41969rBm interfaceC41969rBm) {
        Intrinsics.checkNotNullParameter(interfaceC41969rBm, "");
        this.copydefault = interfaceC41969rBm;
    }

    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43728ruk<? extends java.util.HashMap<java.lang.String, ValueAndName>, ResponseFailedException>> continuation) {
        return this.copydefault.OLrzqt(str, map, str2, continuation);
    }
}
