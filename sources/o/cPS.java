package o;

import com.okinc.business.defi.biz.database.wallet.repository.EIP7702DatabaseRepository$insertOrUpdateEIP7702Info$2;
import com.okinc.business.defi.biz.database.wallet.repository.EIP7702DatabaseRepository$queryChainEIP7702Info$2;
import com.okinc.business.defi.biz.database.wallet.repository.EIP7702DatabaseRepository$queryEIP7702Info$2;
import com.okinc.business.defi.biz.database.wallet.repository.EIP7702DatabaseRepository$queryEIP7702WalletIds$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cPS {
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC11330cKf KWHzl;

    public cPS(@NotNull InterfaceC11330cKf interfaceC11330cKf, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC11330cKf, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC11330cKf;
        this.EZpvd = coroutineDispatcher;
    }

    public final java.lang.Object KWHzl(@NotNull java.util.List<C11449cOr> list, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new EIP7702DatabaseRepository$insertOrUpdateEIP7702Info$2(this, list, null), continuation);
    }

    public final java.lang.Object copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<C11449cOr>>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new EIP7702DatabaseRepository$queryEIP7702Info$2(this, list, null), continuation);
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, long j, @NotNull Continuation<? super java.util.List<C11449cOr>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new EIP7702DatabaseRepository$queryChainEIP7702Info$2(this, str, j, null), continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull java.util.List<java.lang.String> list, int i, int i2, @NotNull java.util.List<java.lang.Long> list2, @NotNull Continuation<? super java.util.List<java.lang.String>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new EIP7702DatabaseRepository$queryEIP7702WalletIds$2(this, list, i, i2, list2, null), continuation);
    }
}
