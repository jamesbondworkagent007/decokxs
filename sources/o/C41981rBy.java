package o;

import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MergeAccountResponse;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCAppModel;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rBy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C41981rBy {
    public final InterfaceC41969rBm EZpvd;

    public C41981rBy(@NotNull InterfaceC41969rBm interfaceC41969rBm) {
        Intrinsics.checkNotNullParameter(interfaceC41969rBm, "");
        this.EZpvd = interfaceC41969rBm;
    }

    public java.lang.Object KWHzl(@NotNull Continuation<? super AbstractC43728ruk<MergeAccountResponse, ResponseFailedException>> continuation) {
        return this.EZpvd.copydefault(continuation);
    }

    public java.lang.Object OLrzqt(@NotNull Continuation<? super AbstractC43728ruk<OnDemandKYCAppModel, ResponseFailedException>> continuation) {
        return this.EZpvd.EZpvd(continuation);
    }
}
