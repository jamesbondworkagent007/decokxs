package o;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oEo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35811oEo {
    public final CoroutineDispatcher KWHzl;
    public final InterfaceC44375sNm copydefault;

    @yCM
    public C35811oEo(@NotNull InterfaceC44375sNm interfaceC44375sNm, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC44375sNm, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC44375sNm;
        this.KWHzl = coroutineDispatcher;
    }

    public final Flow<OKMessage> EZpvd(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return FlowKt.flowOn(FlowKt.distinctUntilChanged(this.copydefault.OLrzqt(str, j)), this.KWHzl);
    }
}
