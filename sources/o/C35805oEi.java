package o;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oEi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35805oEi {
    public final InterfaceC44375sNm EZpvd;

    @yCM
    public C35805oEi(@NotNull InterfaceC44375sNm interfaceC44375sNm) {
        Intrinsics.checkNotNullParameter(interfaceC44375sNm, "");
        this.EZpvd = interfaceC44375sNm;
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, long j, @NotNull Continuation<? super OKMessage> continuation) {
        return this.EZpvd.AEQbTJ(str, j, continuation);
    }
}
