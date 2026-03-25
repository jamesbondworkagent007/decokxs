package o;

import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.AlifaceResultResp;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rBl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C41968rBl {
    public final InterfaceC41969rBm OLrzqt;

    public C41968rBl(@NotNull InterfaceC41969rBm interfaceC41969rBm) {
        Intrinsics.checkNotNullParameter(interfaceC41969rBm, "");
        this.OLrzqt = interfaceC41969rBm;
    }

    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43728ruk<AlifaceResultResp, ResponseFailedException>> continuation) {
        return this.OLrzqt.AEQbTJ(str, continuation);
    }
}
