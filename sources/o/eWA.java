package o;

import com.okinc.business.defi.biz.database.extra.entity.SupportPnlChainEntity;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eWA {
    public final C11285cIo KWHzl;

    @yCM
    public eWA(@NotNull C11285cIo c11285cIo) {
        Intrinsics.checkNotNullParameter(c11285cIo, "");
        this.KWHzl = c11285cIo;
    }

    public final java.lang.Object AEQbTJ(@NotNull java.util.List<SupportPnlChainEntity> list, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation) {
        return this.KWHzl.AEQbTJ(list, continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Continuation<? super java.util.List<SupportPnlChainEntity>> continuation) {
        return this.KWHzl.copydefault(continuation);
    }
}
