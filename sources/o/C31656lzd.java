package o;

import com.okinc.buysell.domain.SellCryptoListUseCase$getSellCryptoAndDexList$2;
import com.okinc.buysell.domain.SellCryptoListUseCase$getSellCryptoList$2;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lzd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31656lzd {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC31764mDa EZpvd;

    @yCM
    public C31656lzd(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC31764mDa interfaceC31764mDa) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC31764mDa, "");
        this.AEQbTJ = coroutineDispatcher;
        this.EZpvd = interfaceC31764mDa;
    }

    public static /* synthetic */ java.lang.Object getSellCryptoList$default(C31656lzd c31656lzd, java.lang.String str, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c31656lzd.copydefault(str, z, continuation);
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<CurrencyToken>, OKServerException>> continuation) {
        return BuildersKt.withContext(this.AEQbTJ, new SellCryptoListUseCase$getSellCryptoList$2(this, str, z, null), continuation);
    }

    public static /* synthetic */ java.lang.Object getSellCryptoAndDexList$default(C31656lzd c31656lzd, java.lang.String str, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c31656lzd.EZpvd(str, z, continuation);
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, boolean z, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<CurrencyToken>, OKServerException>> continuation) {
        return BuildersKt.withContext(this.AEQbTJ, new SellCryptoListUseCase$getSellCryptoAndDexList$2(this, str, z, null), continuation);
    }
}
