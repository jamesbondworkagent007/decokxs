package com.okinc.business.trade.features.home.meme.usecase.transaction.v6;

import com.okinc.business.dex.trade.core.domain.model.CommonDexInfo;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.trade.features.home.ui.meme.statepool.CheckStep;
import com.okinc.business.trade.features.home.ui.meme.statepool.SwapState;
import com.okinc.business.trade.features.home.ui.meme.statepool.TradeStatePool;
import com.okinc.business.trade.features.home.ui.meme.statepool.TradeStep;
import com.okinc.wallet.api.MpcWalletService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC28268kVc;
import o.InterfaceC28330kXk;
import o.kWH;
import o.kWL;
import o.kWQ;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeV6TradeStateUseCase {
    public final kWH AEQbTJ;
    public final kWL EZpvd;
    public final kWQ KWHzl;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CheckStep.values().length];
            try {
                iArr[CheckStep.INIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckStep.WALLET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckStep.INPUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CheckStep.QUOTES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CheckStep.BALANCE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CheckStep.APPROVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CheckStep.SWAP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            copydefault = iArr;
        }
    }

    @yCM
    public MemeV6TradeStateUseCase(@NotNull kWL kwl, @NotNull kWH kwh, @NotNull kWQ kwq) {
        Intrinsics.checkNotNullParameter(kwl, "");
        Intrinsics.checkNotNullParameter(kwh, "");
        Intrinsics.checkNotNullParameter(kwq, "");
        this.EZpvd = kwl;
        this.AEQbTJ = kwh;
        this.KWHzl = kwq;
    }

    public static final class StateCheckParams {
        public static final int $stable = 8;
        private final String chainId;
        private final String coinAssetAmount;
        private final Pair<InterfaceC28268kVc, InterfaceC28268kVc> fromToToken;
        private final boolean isPreCheckSupported;
        private final MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus;
        private final V6QuoteResponseData quoteResponse;
        private final String realAmount;
        private final String selectedDeFiPlatformId;
        private final String sourceType;
        private final TransactionType transactionType;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.sourceType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component10() {
            return this.coinAssetAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MpcWalletService.MpcWalletAbleStatus component3() {
            return this.mpcWalletAbleStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.realAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Pair<InterfaceC28268kVc, InterfaceC28268kVc> component5() {
            return this.fromToToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransactionType component6() {
            return this.transactionType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component7() {
            return this.isPreCheckSupported;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final V6QuoteResponseData component8() {
            return this.quoteResponse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component9() {
            return this.selectedDeFiPlatformId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateCheckParams copy(@NotNull String str, @NotNull String str2, @NotNull MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus, @NotNull String str3, Pair<? extends InterfaceC28268kVc, ? extends InterfaceC28268kVc> pair, @NotNull TransactionType transactionType, boolean z, V6QuoteResponseData v6QuoteResponseData, @NotNull String str4, String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(mpcWalletAbleStatus, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(transactionType, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new StateCheckParams(str, str2, mpcWalletAbleStatus, str3, pair, transactionType, z, v6QuoteResponseData, str4, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateCheckParams)) {
                return false;
            }
            StateCheckParams stateCheckParams = (StateCheckParams) obj;
            return Intrinsics.EZpvd((Object) this.sourceType, (Object) stateCheckParams.sourceType) && Intrinsics.EZpvd((Object) this.chainId, (Object) stateCheckParams.chainId) && this.mpcWalletAbleStatus == stateCheckParams.mpcWalletAbleStatus && Intrinsics.EZpvd((Object) this.realAmount, (Object) stateCheckParams.realAmount) && Intrinsics.EZpvd(this.fromToToken, stateCheckParams.fromToToken) && this.transactionType == stateCheckParams.transactionType && this.isPreCheckSupported == stateCheckParams.isPreCheckSupported && Intrinsics.EZpvd(this.quoteResponse, stateCheckParams.quoteResponse) && Intrinsics.EZpvd((Object) this.selectedDeFiPlatformId, (Object) stateCheckParams.selectedDeFiPlatformId) && Intrinsics.EZpvd((Object) this.coinAssetAmount, (Object) stateCheckParams.coinAssetAmount);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCoinAssetAmount() {
            return this.coinAssetAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Pair<InterfaceC28268kVc, InterfaceC28268kVc> getFromToToken() {
            return this.fromToToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MpcWalletService.MpcWalletAbleStatus getMpcWalletAbleStatus() {
            return this.mpcWalletAbleStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final V6QuoteResponseData getQuoteResponse() {
            return this.quoteResponse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRealAmount() {
            return this.realAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSelectedDeFiPlatformId() {
            return this.selectedDeFiPlatformId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSourceType() {
            return this.sourceType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransactionType getTransactionType() {
            return this.transactionType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.sourceType.hashCode();
            int iHashCode2 = this.chainId.hashCode();
            int iHashCode3 = this.mpcWalletAbleStatus.hashCode();
            int iHashCode4 = this.realAmount.hashCode();
            Pair<InterfaceC28268kVc, InterfaceC28268kVc> pair = this.fromToToken;
            int iHashCode5 = pair == null ? 0 : pair.hashCode();
            int iHashCode6 = this.transactionType.hashCode();
            int iHashCode7 = Boolean.hashCode(this.isPreCheckSupported);
            V6QuoteResponseData v6QuoteResponseData = this.quoteResponse;
            int iHashCode8 = v6QuoteResponseData == null ? 0 : v6QuoteResponseData.hashCode();
            int iHashCode9 = this.selectedDeFiPlatformId.hashCode();
            String str = this.coinAssetAmount;
            return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str != null ? str.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isPreCheckSupported() {
            return this.isPreCheckSupported;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "StateCheckParams(sourceType=" + this.sourceType + ", chainId=" + this.chainId + ", mpcWalletAbleStatus=" + this.mpcWalletAbleStatus + ", realAmount=" + this.realAmount + ", fromToToken=" + this.fromToToken + ", transactionType=" + this.transactionType + ", isPreCheckSupported=" + this.isPreCheckSupported + ", quoteResponse=" + this.quoteResponse + ", selectedDeFiPlatformId=" + this.selectedDeFiPlatformId + ", coinAssetAmount=" + this.coinAssetAmount + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.Pair<? extends o.kVc, ? extends o.kVc> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateCheckParams(@NotNull String str, @NotNull String str2, @NotNull MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus, @NotNull String str3, Pair<? extends InterfaceC28268kVc, ? extends InterfaceC28268kVc> pair, @NotNull TransactionType transactionType, boolean z, V6QuoteResponseData v6QuoteResponseData, @NotNull String str4, String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(mpcWalletAbleStatus, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(transactionType, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.sourceType = str;
            this.chainId = str2;
            this.mpcWalletAbleStatus = mpcWalletAbleStatus;
            this.realAmount = str3;
            this.fromToToken = pair;
            this.transactionType = transactionType;
            this.isPreCheckSupported = z;
            this.quoteResponse = v6QuoteResponseData;
            this.selectedDeFiPlatformId = str4;
            this.coinAssetAmount = str5;
        }
    }

    public final void KWHzl(@NotNull CheckStep checkStep, @NotNull StateCheckParams stateCheckParams, @NotNull TradeStatePool tradeStatePool, @NotNull InterfaceC28330kXk interfaceC28330kXk) {
        Intrinsics.checkNotNullParameter(checkStep, "");
        Intrinsics.checkNotNullParameter(stateCheckParams, "");
        Intrinsics.checkNotNullParameter(tradeStatePool, "");
        Intrinsics.checkNotNullParameter(interfaceC28330kXk, "");
        switch (Activity.copydefault[checkStep.ordinal()]) {
            case 1:
                AEQbTJ(tradeStatePool);
                return;
            case 2:
                EZpvd(stateCheckParams, tradeStatePool);
                return;
            case 3:
                OLrzqt(stateCheckParams, tradeStatePool, interfaceC28330kXk);
                return;
            case 4:
                OLrzqt(stateCheckParams, interfaceC28330kXk);
                return;
            case 5:
                OLrzqt(stateCheckParams, tradeStatePool);
                return;
            case 6:
                EZpvd(stateCheckParams, tradeStatePool, interfaceC28330kXk);
                return;
            case 7:
                KWHzl(tradeStatePool);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void AEQbTJ(TradeStatePool tradeStatePool) {
        tradeStatePool.refreshStatePool(new TradeStep(CheckStep.INIT, true, SwapState.INIT_SUCCESS, false, true));
    }

    public final void EZpvd(StateCheckParams stateCheckParams, TradeStatePool tradeStatePool) {
        this.KWHzl.AEQbTJ(stateCheckParams.getSourceType(), stateCheckParams.getChainId(), stateCheckParams.getMpcWalletAbleStatus(), tradeStatePool);
    }

    public final void OLrzqt(StateCheckParams stateCheckParams, TradeStatePool tradeStatePool, InterfaceC28330kXk interfaceC28330kXk) {
        interfaceC28330kXk.KWHzl();
        this.EZpvd.OLrzqt(stateCheckParams.getRealAmount(), tradeStatePool, stateCheckParams.getFromToToken(), stateCheckParams.getTransactionType(), !stateCheckParams.isPreCheckSupported());
    }

    public final void OLrzqt(StateCheckParams stateCheckParams, InterfaceC28330kXk interfaceC28330kXk) {
        if (stateCheckParams.isPreCheckSupported()) {
            interfaceC28330kXk.EZpvd();
        }
    }

    public final void OLrzqt(StateCheckParams stateCheckParams, TradeStatePool tradeStatePool) {
        kWH kwh = this.AEQbTJ;
        String realAmount = stateCheckParams.getRealAmount();
        String coinAssetAmount = stateCheckParams.getCoinAssetAmount();
        if (coinAssetAmount == null) {
            coinAssetAmount = "";
        }
        kwh.EZpvd(realAmount, coinAssetAmount, tradeStatePool);
    }

    public final void EZpvd(StateCheckParams stateCheckParams, TradeStatePool tradeStatePool, InterfaceC28330kXk interfaceC28330kXk) {
        CommonDexInfo commonDexInfo;
        V6QuoteResponseData quoteResponse = stateCheckParams.getQuoteResponse();
        if (quoteResponse == null || (commonDexInfo = quoteResponse.getCommonDexInfo()) == null || commonDexInfo.getFromToken() == null || commonDexInfo.getToToken() == null) {
            return;
        }
        interfaceC28330kXk.KWHzl(commonDexInfo.getFromToken().getChainId(), commonDexInfo.getFromToken().getTokenContractAddress(), commonDexInfo.getToToken().getTokenContractAddress(), commonDexInfo.getFromToken().getDecimals(), stateCheckParams.getRealAmount(), tradeStatePool, stateCheckParams.getSelectedDeFiPlatformId());
    }

    public final void KWHzl(TradeStatePool tradeStatePool) {
        tradeStatePool.refreshStatePool(new TradeStep(CheckStep.SWAP, true, SwapState.SWAP, true, false));
    }
}
