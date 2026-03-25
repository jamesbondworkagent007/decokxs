package o;

import androidx.camera.video.AudioStats;
import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.dex.trade.core.domain.model.CommonDexInfo;
import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.dex.trade.core.domain.model.common.LiquidityConfig;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.TokenInfoForApp;
import com.okinc.business.dexlogic.track.enums.DexSwapLiquiditySource;
import com.okinc.business.dexui.main.swap.trade.single.defiplatform.data.V6QuoteRequestWrapper;
import com.okinc.business.dexui.main.swap.trade.single.defiplatform.strategy.V6SwapModeStrategy$executeQuoteRequest$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ioO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24994ioO {
    public final gYX AEQbTJ;
    public final kTW EZpvd;

    @yCM
    public C24994ioO(@NotNull gYX gyx, @NotNull kTW ktw) {
        Intrinsics.checkNotNullParameter(gyx, "");
        Intrinsics.checkNotNullParameter(ktw, "");
        this.AEQbTJ = gyx;
        this.EZpvd = ktw;
    }

    public java.lang.String KWHzl(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String fromTokenAmount = commonDexInfo != null ? commonDexInfo.getFromTokenAmount() : null;
        return fromTokenAmount == null ? "" : fromTokenAmount;
    }

    public DexMultiTokenInfoBean OLrzqt(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
        DexMultiTokenInfoBean fromToken;
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
        return (commonDexInfo == null || (fromToken = commonDexInfo.getFromToken()) == null) ? new DexMultiTokenInfoBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 0, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : fromToken;
    }

    public DexMultiTokenInfoBean AhwBna(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
        DexMultiTokenInfoBean toToken;
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
        return (commonDexInfo == null || (toToken = commonDexInfo.getToToken()) == null) ? new DexMultiTokenInfoBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 0, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : toToken;
    }

    public boolean AEQbTJ(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        DefiPlatformInfo selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform();
        return Intrinsics.EZpvd((java.lang.Object) (selectedDeFiPlatform != null ? selectedDeFiPlatform.getNeedApprove() : null), (java.lang.Object) "1");
    }

    public java.util.List<DefiPlatformInfo> copydefault(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        java.util.List<DefiPlatformInfo> defiPlatformInfoList = v6BaseQuoteResponse.getDefiPlatformInfoList();
        return defiPlatformInfoList == null ? yDY.AhwBna() : defiPlatformInfoList;
    }

    public void EZpvd(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (v6BaseQuoteResponse instanceof V6QuoteAndCalldataResponseData) {
            ((V6QuoteAndCalldataResponseData) v6BaseQuoteResponse).setLocalSelectedDeFiPlatformId(str);
        }
    }

    public boolean OLrzqt(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<DefiPlatformInfo> defiPlatformInfoList = v6BaseQuoteResponse.getDefiPlatformInfoList();
        java.lang.Object obj = null;
        if (defiPlatformInfoList != null) {
            java.util.Iterator<T> it = defiPlatformInfoList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((DefiPlatformInfo) next).getDefiPlatformId(), (java.lang.Object) str)) {
                    obj = next;
                    break;
                }
            }
            obj = (DefiPlatformInfo) obj;
        }
        return obj == null;
    }

    public boolean OLrzqt(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, @NotNull C24694iif c24694iif) {
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        Intrinsics.checkNotNullParameter(c24694iif, "");
        return v6BaseQuoteResponse.isOkxDexNotAvailableAnymore() && c24694iif.OLrzqt() != DexSwapLiquiditySource.All;
    }

    public java.lang.String EZpvd(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
        java.lang.Object next;
        java.lang.String quoteNetWorkFeeOfMoney;
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        java.util.List<DefiPlatformInfo> defiPlatformInfoList = v6BaseQuoteResponse.getDefiPlatformInfoList();
        if (defiPlatformInfoList == null) {
            return "";
        }
        java.util.Iterator<T> it = defiPlatformInfoList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            DefiPlatformInfo defiPlatformInfo = (DefiPlatformInfo) next;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) defiPlatformInfo.getQuoteNetWorkFeeOfMoney()) && C33129mqd.AEQbTJ(defiPlatformInfo.getQuoteNetWorkFeeOfMoney(), "0")) {
                break;
            }
        }
        DefiPlatformInfo defiPlatformInfo2 = (DefiPlatformInfo) next;
        return (defiPlatformInfo2 == null || (quoteNetWorkFeeOfMoney = defiPlatformInfo2.getQuoteNetWorkFeeOfMoney()) == null) ? "" : quoteNetWorkFeeOfMoney;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, boolean z, @NotNull V6QuoteRequestWrapper v6QuoteRequestWrapper, @NotNull Continuation<? super Result<? extends V6BaseQuoteResponse>> continuation) throws java.lang.Exception {
        V6SwapModeStrategy$executeQuoteRequest$1 v6SwapModeStrategy$executeQuoteRequest$1;
        LiquidityConfig liquidityConfigCopy$default;
        LiquidityConfig liquidityConfigCopy$default2;
        AbstractC43419rot abstractC43419rot;
        if (continuation instanceof V6SwapModeStrategy$executeQuoteRequest$1) {
            v6SwapModeStrategy$executeQuoteRequest$1 = (V6SwapModeStrategy$executeQuoteRequest$1) continuation;
            int i = v6SwapModeStrategy$executeQuoteRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                v6SwapModeStrategy$executeQuoteRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                v6SwapModeStrategy$executeQuoteRequest$1 = new V6SwapModeStrategy$executeQuoteRequest$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = v6SwapModeStrategy$executeQuoteRequest$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = v6SwapModeStrategy$executeQuoteRequest$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            java.util.Map<java.lang.String, java.lang.String> mapKWHzl = C56424yEw.KWHzl();
            if (v6QuoteRequestWrapper.EZpvd() != null) {
                gYX gyx = this.AEQbTJ;
                V6QuoteRequest v6QuoteRequestEZpvd = v6QuoteRequestWrapper.EZpvd();
                LiquidityConfig liquidityConfig = v6QuoteRequestWrapper.EZpvd().getLiquidityConfig();
                if (liquidityConfig != null) {
                    liquidityConfigCopy$default2 = LiquidityConfig.copy$default(liquidityConfig, null, null, z ? "11" : null, 3, null);
                } else {
                    liquidityConfigCopy$default2 = null;
                }
                AccountInfo accountInfo = v6QuoteRequestWrapper.EZpvd().getAccountInfo();
                V6QuoteRequest v6QuoteRequestCopy = v6QuoteRequestEZpvd.copy((FrameMetricsAggregator.EVERY_DURATION & 1) != 0 ? v6QuoteRequestEZpvd.userWalletAddress : null, (FrameMetricsAggregator.EVERY_DURATION & 2) != 0 ? v6QuoteRequestEZpvd.tradeMode : null, (FrameMetricsAggregator.EVERY_DURATION & 4) != 0 ? v6QuoteRequestEZpvd.slippageConfig : null, (FrameMetricsAggregator.EVERY_DURATION & 8) != 0 ? v6QuoteRequestEZpvd.liquidityConfig : liquidityConfigCopy$default2, (FrameMetricsAggregator.EVERY_DURATION & 16) != 0 ? v6QuoteRequestEZpvd.ext : null, (FrameMetricsAggregator.EVERY_DURATION & 32) != 0 ? v6QuoteRequestEZpvd.chainId : null, (FrameMetricsAggregator.EVERY_DURATION & 64) != 0 ? v6QuoteRequestEZpvd.fromTokenAddress : null, (FrameMetricsAggregator.EVERY_DURATION & 128) != 0 ? v6QuoteRequestEZpvd.toTokenAddress : null, (FrameMetricsAggregator.EVERY_DURATION & 256) != 0 ? v6QuoteRequestEZpvd.amount : null, (FrameMetricsAggregator.EVERY_DURATION & 512) != 0 ? v6QuoteRequestEZpvd.accountInfo : accountInfo != null ? AccountInfo.copy$default(accountInfo, null, null, C56443yFo.KWHzl(this.EZpvd.copydefault()), null, 11, null) : null);
                v6SwapModeStrategy$executeQuoteRequest$1.label = 1;
                objOLrzqt = gyx.EZpvd(v6QuoteRequestCopy, v6SwapModeStrategy$executeQuoteRequest$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                abstractC43419rot = (AbstractC43419rot) objOLrzqt;
            } else if (v6QuoteRequestWrapper.KWHzl() != null) {
                gYX gyx2 = this.AEQbTJ;
                V6QuoteAndCalldataRequest v6QuoteAndCalldataRequestKWHzl = v6QuoteRequestWrapper.KWHzl();
                LiquidityConfig liquidityConfig2 = v6QuoteRequestWrapper.KWHzl().getLiquidityConfig();
                if (liquidityConfig2 != null) {
                    liquidityConfigCopy$default = LiquidityConfig.copy$default(liquidityConfig2, null, null, z ? "11" : null, 3, null);
                } else {
                    liquidityConfigCopy$default = null;
                }
                AccountInfo accountInfo2 = v6QuoteRequestWrapper.KWHzl().getAccountInfo();
                V6QuoteAndCalldataRequest v6QuoteAndCalldataRequestCopy = v6QuoteAndCalldataRequestKWHzl.copy((32763 & 1) != 0 ? v6QuoteAndCalldataRequestKWHzl.simulate : null, (32763 & 2) != 0 ? v6QuoteAndCalldataRequestKWHzl.slippageConfig : null, (32763 & 4) != 0 ? v6QuoteAndCalldataRequestKWHzl.liquidityConfig : liquidityConfigCopy$default, (32763 & 8) != 0 ? v6QuoteAndCalldataRequestKWHzl.preSetConfig : null, (32763 & 16) != 0 ? v6QuoteAndCalldataRequestKWHzl.ext : null, (32763 & 32) != 0 ? v6QuoteAndCalldataRequestKWHzl.tradeMode : null, (32763 & 64) != 0 ? v6QuoteAndCalldataRequestKWHzl.orderSource : null, (32763 & 128) != 0 ? v6QuoteAndCalldataRequestKWHzl.networkFee : null, (32763 & 256) != 0 ? v6QuoteAndCalldataRequestKWHzl.chainId : null, (32763 & 512) != 0 ? v6QuoteAndCalldataRequestKWHzl.fromTokenAddress : null, (32763 & 1024) != 0 ? v6QuoteAndCalldataRequestKWHzl.toTokenAddress : null, (32763 & 2048) != 0 ? v6QuoteAndCalldataRequestKWHzl.amount : null, (32763 & 4096) != 0 ? v6QuoteAndCalldataRequestKWHzl.userWalletAddress : null, (32763 & 8192) != 0 ? v6QuoteAndCalldataRequestKWHzl.direction : null, (32763 & 16384) != 0 ? v6QuoteAndCalldataRequestKWHzl.accountInfo : accountInfo2 != null ? AccountInfo.copy$default(accountInfo2, null, null, C56443yFo.KWHzl(this.EZpvd.copydefault()), null, 11, null) : null);
                v6SwapModeStrategy$executeQuoteRequest$1.label = 2;
                objOLrzqt = gyx2.OLrzqt(mapKWHzl, v6QuoteAndCalldataRequestCopy, v6SwapModeStrategy$executeQuoteRequest$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                abstractC43419rot = (AbstractC43419rot) objOLrzqt;
            } else {
                throw new java.lang.Exception("Neither EOA or SA request, please check and fix.");
            }
        } else if (i2 == 1) {
            C56391yDq.AEQbTJ(objOLrzqt);
            abstractC43419rot = (AbstractC43419rot) objOLrzqt;
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
            abstractC43419rot = (AbstractC43419rot) objOLrzqt;
        }
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl());
        }
        if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Application application2 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd((java.lang.Throwable) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()));
    }
}
