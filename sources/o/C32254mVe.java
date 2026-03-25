package o;

import com.okinc.dexkline.market.common.marketconfig.domain.MarketConfig;
import com.okinc.dexkline.market.common.marketconfig.domain.MarketConfigUseCase$getMarketConfig$2;
import com.okinc.dexkline.market.common.marketconfig.domain.MarketConfigUseCase$isExpandV2DataSupportedChain$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mVe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C32254mVe {
    public final InterfaceC32256mVg AEQbTJ;
    public final mWJ KWHzl;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C32254mVe(@NotNull InterfaceC32256mVg interfaceC32256mVg, @NotNull mWJ mwj, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC32256mVg, "");
        Intrinsics.checkNotNullParameter(mwj, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC32256mVg;
        this.KWHzl = mwj;
        this.copydefault = coroutineDispatcher;
    }

    public static /* synthetic */ java.lang.Object getMarketConfig$default(C32254mVe c32254mVe, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c32254mVe.OLrzqt(z, continuation);
    }

    public final java.lang.Object OLrzqt(boolean z, @NotNull Continuation<? super MarketConfig> continuation) {
        return BuildersKt.withContext(this.copydefault, new MarketConfigUseCase$getMarketConfig$2(this, z, null), continuation);
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.copydefault, new MarketConfigUseCase$isExpandV2DataSupportedChain$2(this, str, null), continuation);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ.KWHzl(str, str2, z);
    }

    public final boolean copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.AEQbTJ.OLrzqt(str, str2);
    }
}
