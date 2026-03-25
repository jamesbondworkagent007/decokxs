package o;

import com.okinc.business.market.common.marketconfig.domain.BannerConfig;
import com.okinc.business.market.common.marketconfig.domain.BannerTokenInfo;
import com.okinc.business.market.common.marketconfig.domain.MarketConfig;
import com.okinc.business.market.common.marketconfig.domain.MarketConfigUseCase$getMarketConfig$2;
import com.okinc.business.market.common.marketconfig.domain.MarketConfigUseCase$getNativeTokenPrice$1;
import com.okinc.business.market.common.marketconfig.domain.MarketConfigUseCase$getNativeTokenPricegIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.common.marketconfig.domain.MarketConfigUseCase$isExpandV2DataSupportedChain$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jyq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27633jyq {
    public final jNW KWHzl;
    public final InterfaceC27636jyt OLrzqt;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C27633jyq(@NotNull InterfaceC27636jyt interfaceC27636jyt, @NotNull jNW jnw, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27636jyt, "");
        Intrinsics.checkNotNullParameter(jnw, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC27636jyt;
        this.KWHzl = jnw;
        this.copydefault = coroutineDispatcher;
    }

    public static /* synthetic */ java.lang.Object getMarketConfig$default(C27633jyq c27633jyq, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c27633jyq.copydefault(z, (Continuation<? super MarketConfig>) continuation);
    }

    public final java.lang.Object copydefault(boolean z, @NotNull Continuation<? super MarketConfig> continuation) {
        return BuildersKt.withContext(this.copydefault, new MarketConfigUseCase$getMarketConfig$2(this, z, null), continuation);
    }

    public final BannerConfig KWHzl(MarketConfig marketConfig, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        BannerConfig bannerConfigAEQbTJ;
        java.util.List<java.lang.String> listEZpvd;
        BannerTokenInfo bannerTokenInfo;
        java.lang.Object next;
        java.util.List<BannerTokenInfo> listAEQbTJ;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (marketConfig == null || (bannerConfigAEQbTJ = marketConfig.AEQbTJ()) == null) {
            return null;
        }
        java.util.List<java.lang.String> listEZpvd2 = bannerConfigAEQbTJ.EZpvd();
        if ((listEZpvd2 == null || !listEZpvd2.isEmpty() || (listAEQbTJ = bannerConfigAEQbTJ.AEQbTJ()) == null || !listAEQbTJ.isEmpty()) && ((listEZpvd = bannerConfigAEQbTJ.EZpvd()) == null || !listEZpvd.contains(str))) {
            java.util.List<BannerTokenInfo> listAEQbTJ2 = bannerConfigAEQbTJ.AEQbTJ();
            if (listAEQbTJ2 != null) {
                java.util.Iterator<T> it = listAEQbTJ2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    BannerTokenInfo bannerTokenInfo2 = (BannerTokenInfo) next;
                    if (Intrinsics.EZpvd((java.lang.Object) bannerTokenInfo2.KWHzl(), (java.lang.Object) str2) && Intrinsics.EZpvd((java.lang.Object) bannerTokenInfo2.AEQbTJ(), (java.lang.Object) str)) {
                        break;
                    }
                }
                bannerTokenInfo = (BannerTokenInfo) next;
            } else {
                bannerTokenInfo = null;
            }
            if (bannerTokenInfo == null) {
                return null;
            }
        }
        return bannerConfigAEQbTJ;
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.copydefault, new MarketConfigUseCase$isExpandV2DataSupportedChain$2(this, str, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Result<jNY>> continuation) throws java.lang.Throwable {
        MarketConfigUseCase$getNativeTokenPrice$1 marketConfigUseCase$getNativeTokenPrice$1;
        if (continuation instanceof MarketConfigUseCase$getNativeTokenPrice$1) {
            marketConfigUseCase$getNativeTokenPrice$1 = (MarketConfigUseCase$getNativeTokenPrice$1) continuation;
            int i = marketConfigUseCase$getNativeTokenPrice$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketConfigUseCase$getNativeTokenPrice$1.label = i - Integer.MIN_VALUE;
            } else {
                marketConfigUseCase$getNativeTokenPrice$1 = new MarketConfigUseCase$getNativeTokenPrice$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = marketConfigUseCase$getNativeTokenPrice$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketConfigUseCase$getNativeTokenPrice$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            MarketConfigUseCase$getNativeTokenPricegIAlus$$inlined$dexRunCatching$1 marketConfigUseCase$getNativeTokenPricegIAlus$$inlined$dexRunCatching$1 = new MarketConfigUseCase$getNativeTokenPricegIAlus$$inlined$dexRunCatching$1(null, this, str);
            marketConfigUseCase$getNativeTokenPrice$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, marketConfigUseCase$getNativeTokenPricegIAlus$$inlined$dexRunCatching$1, marketConfigUseCase$getNativeTokenPrice$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt.copydefault(str, str2, z);
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.OLrzqt.AEQbTJ(str, str2);
    }
}
