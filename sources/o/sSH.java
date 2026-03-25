package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sSH {
    public final InterfaceC44177sGd AEQbTJ;

    @yCM
    public sSH(@NotNull InterfaceC44177sGd interfaceC44177sGd) {
        Intrinsics.checkNotNullParameter(interfaceC44177sGd, "");
        this.AEQbTJ = interfaceC44177sGd;
    }

    public final java.lang.Object EZpvd(@NotNull Continuation<? super com.okinc.okimcore.model.remote.UserInfo> continuation) {
        return this.AEQbTJ.KWHzl(false, continuation);
    }
}
