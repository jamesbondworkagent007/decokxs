package o;

import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FieldDisplay;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rBN {
    public final InterfaceC41969rBm EZpvd;

    public rBN(@NotNull InterfaceC41969rBm interfaceC41969rBm) {
        Intrinsics.checkNotNullParameter(interfaceC41969rBm, "");
        this.EZpvd = interfaceC41969rBm;
    }

    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull C41957rBa c41957rBa, @NotNull Continuation<? super AbstractC43728ruk<? extends java.util.ArrayList<FieldDisplay>, ResponseFailedException>> continuation) {
        return this.EZpvd.EZpvd(str, map, c41957rBa, continuation);
    }
}
