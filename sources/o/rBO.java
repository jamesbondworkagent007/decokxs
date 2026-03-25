package o;

import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FieldDisplay;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rBO {
    public final InterfaceC41969rBm KWHzl;

    public rBO(@NotNull InterfaceC41969rBm interfaceC41969rBm) {
        Intrinsics.checkNotNullParameter(interfaceC41969rBm, "");
        this.KWHzl = interfaceC41969rBm;
    }

    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str2, @NotNull C41957rBa c41957rBa, @NotNull Continuation<? super AbstractC43728ruk<? extends java.util.ArrayList<FieldDisplay>, ResponseFailedException>> continuation) {
        return this.KWHzl.copydefault(str, str2, map, c41957rBa, continuation);
    }
}
