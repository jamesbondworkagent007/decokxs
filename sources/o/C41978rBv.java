package o;

import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorTokenResp;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rBv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41978rBv {
    public final InterfaceC41969rBm copydefault;

    public C41978rBv(@NotNull InterfaceC41969rBm interfaceC41969rBm) {
        Intrinsics.checkNotNullParameter(interfaceC41969rBm, "");
        this.copydefault = interfaceC41969rBm;
    }

    public java.lang.Object EZpvd(@NotNull Continuation<? super AbstractC43728ruk<MultiVendorTokenResp, ResponseFailedException>> continuation) {
        return this.copydefault.AEQbTJ(continuation);
    }
}
