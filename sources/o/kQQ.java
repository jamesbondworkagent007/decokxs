package o;

import androidx.camera.video.AudioStats;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedBalanceUseCase$getTokenInfo$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedBalanceUseCase$getTokenInfoIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedBalanceUseCase$updateFromToken$1;
import com.okinc.business.trade.features.home.ui.cefi.placeorder.UIPricingToken;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kQQ {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final MutableStateFlow<DexMultiTokenInfoBean> AEQbTJ;
    public final C28196kSl AYXKKw;
    public final CoroutineDispatcher EZpvd;
    public final MutableStateFlow<java.lang.String> KWHzl;
    public final kQA OLrzqt;
    public final MutableStateFlow<java.util.List<UIPricingToken>> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<java.lang.String> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<DexMultiTokenInfoBean> copydefault() {
        return this.AEQbTJ;
    }

    @yCM
    public kQQ(@NotNull kQA kqa, @NotNull C28196kSl c28196kSl, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(kqa, "");
        Intrinsics.checkNotNullParameter(c28196kSl, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = kqa;
        this.AYXKKw = c28196kSl;
        this.EZpvd = coroutineDispatcher;
        this.gEmmrt = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = StateFlowKt.MutableStateFlow("");
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kQQ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void EZpvd(@NotNull java.util.List<UIPricingToken> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.gEmmrt.setValue(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AdvancedBalanceUseCase$updateFromToken$1 advancedBalanceUseCase$updateFromToken$1;
        if (continuation instanceof AdvancedBalanceUseCase$updateFromToken$1) {
            advancedBalanceUseCase$updateFromToken$1 = (AdvancedBalanceUseCase$updateFromToken$1) continuation;
            int i = advancedBalanceUseCase$updateFromToken$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedBalanceUseCase$updateFromToken$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedBalanceUseCase$updateFromToken$1 = new AdvancedBalanceUseCase$updateFromToken$1(this, continuation);
            }
        }
        java.lang.Object obj = advancedBalanceUseCase$updateFromToken$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedBalanceUseCase$updateFromToken$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            this.AEQbTJ.setValue(dexMultiTokenInfoBean);
            advancedBalanceUseCase$updateFromToken$1.label = 1;
            if (OLrzqt(advancedBalanceUseCase$updateFromToken$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Result<Unit>> continuation) {
        AdvancedBalanceUseCase$getTokenInfo$1 advancedBalanceUseCase$getTokenInfo$1;
        if (continuation instanceof AdvancedBalanceUseCase$getTokenInfo$1) {
            advancedBalanceUseCase$getTokenInfo$1 = (AdvancedBalanceUseCase$getTokenInfo$1) continuation;
            int i = advancedBalanceUseCase$getTokenInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedBalanceUseCase$getTokenInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedBalanceUseCase$getTokenInfo$1 = new AdvancedBalanceUseCase$getTokenInfo$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = advancedBalanceUseCase$getTokenInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedBalanceUseCase$getTokenInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            AdvancedBalanceUseCase$getTokenInfoIoAF18A$$inlined$dexRunCatching$1 advancedBalanceUseCase$getTokenInfoIoAF18A$$inlined$dexRunCatching$1 = new AdvancedBalanceUseCase$getTokenInfoIoAF18A$$inlined$dexRunCatching$1(null, this);
            advancedBalanceUseCase$getTokenInfo$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, advancedBalanceUseCase$getTokenInfoIoAF18A$$inlined$dexRunCatching$1, advancedBalanceUseCase$getTokenInfo$1);
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

    /* JADX DEBUG: Type inference failed for r4v5. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.util.List<com.okinc.business.trade.features.home.ui.cefi.placeorder.UIPricingToken>> */
    public final AbstractC58185ywX<java.util.List<UIPricingToken>> AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C22416heu.ejfBZ()) {
            AbstractC58185ywX<java.util.List<UIPricingToken>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl();
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<C9860bdZ> abstractC58185ywXEZpvd = C22380heK.OLrzqt.copydefault(str).fARcdN().EZpvd("key.dex_cefi_mode_assets");
        final Function1 function1 = new Function1() { // from class: o.kQT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(kQQ.KWHzl(this.AEQbTJ, (C9860bdZ) obj));
            }
        };
        AbstractC58185ywX<C9860bdZ> abstractC58185ywXKWHzl2 = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58239yxY() { // from class: o.kQR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58239yxY
            public final boolean test(java.lang.Object obj) {
                return kQQ.KWHzl(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.kQP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kQQ.copydefault(this.copydefault, (C9860bdZ) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl2.AEQbTJ(new InterfaceC58229yxO() { // from class: o.kQY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return kQQ.AEQbTJ(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final boolean KWHzl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean KWHzl(kQQ kqq, C9860bdZ c9860bdZ) {
        UIPricingToken uIPricingToken;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanEZpvd;
        Intrinsics.checkNotNullParameter(c9860bdZ, "");
        java.lang.String strValueOf = java.lang.String.valueOf(c9860bdZ.OLrzqt());
        java.util.List<UIPricingToken> value = kqq.gEmmrt.getValue();
        return Intrinsics.EZpvd((java.lang.Object) strValueOf, (java.lang.Object) ((value == null || (uIPricingToken = (UIPricingToken) CollectionsKt___CollectionsKt.firstOrNull(value)) == null || (dexMultiTokenInfoBeanEZpvd = uIPricingToken.EZpvd()) == null) ? null : dexMultiTokenInfoBeanEZpvd.getChainId()));
    }

    public static final java.util.List AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.List copydefault(kQQ kqq, C9860bdZ c9860bdZ) {
        boolean z;
        Intrinsics.checkNotNullParameter(c9860bdZ, "");
        java.lang.String strValueOf = java.lang.String.valueOf(c9860bdZ.OLrzqt());
        java.lang.String strAhwBna = c9860bdZ.AhwBna();
        if (strAhwBna == null) {
            strAhwBna = "";
        }
        java.lang.String strEZpvd = C23311hvo.EZpvd(strValueOf, strAhwBna, Intrinsics.EZpvd(c9860bdZ.AYXKKw(), java.lang.Boolean.TRUE));
        DexMultiTokenInfoBean value = kqq.AEQbTJ.getValue();
        java.util.List listAhwBna = null;
        java.lang.String strValueOf2 = java.lang.String.valueOf(value != null ? value.getChainId() : null);
        DexMultiTokenInfoBean value2 = kqq.AEQbTJ.getValue();
        java.lang.String tokenContractAddress = value2 != null ? value2.getTokenContractAddress() : null;
        if (tokenContractAddress == null) {
            tokenContractAddress = "";
        }
        DexMultiTokenInfoBean value3 = kqq.AEQbTJ.getValue();
        if (value3 != null) {
            z = value3.isMainChainCoin();
        }
        if (Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) C23311hvo.EZpvd(strValueOf2, tokenContractAddress, z))) {
            MutableStateFlow<java.lang.String> mutableStateFlow = kqq.KWHzl;
            java.lang.String strAEQbTJ = c9860bdZ.AEQbTJ();
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            mutableStateFlow.setValue(strAEQbTJ);
        }
        java.util.List<UIPricingToken> value4 = kqq.gEmmrt.getValue();
        if (value4 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(value4, 10));
            for (UIPricingToken uIPricingTokenCopy$default : value4) {
                if (Intrinsics.EZpvd((java.lang.Object) C23311hvo.EZpvd(uIPricingTokenCopy$default.EZpvd().getChainId(), uIPricingTokenCopy$default.EZpvd().getTokenContractAddress(), uIPricingTokenCopy$default.EZpvd().isMainChainCoin()), (java.lang.Object) strEZpvd)) {
                    DexMultiTokenInfoBean dexMultiTokenInfoBeanEZpvd = uIPricingTokenCopy$default.EZpvd();
                    java.lang.String strAEQbTJ2 = c9860bdZ.AEQbTJ();
                    java.lang.String str = strAEQbTJ2 == null ? "" : strAEQbTJ2;
                    java.lang.String strEZpvd2 = c9860bdZ.EZpvd();
                    uIPricingTokenCopy$default = UIPricingToken.copy$default(uIPricingTokenCopy$default, dexMultiTokenInfoBeanEZpvd.copy(((-69633) & 1) != 0 ? dexMultiTokenInfoBeanEZpvd.id : null, ((-69633) & 2) != 0 ? dexMultiTokenInfoBeanEZpvd.chainId : null, ((-69633) & 4) != 0 ? dexMultiTokenInfoBeanEZpvd.chainName : null, ((-69633) & 8) != 0 ? dexMultiTokenInfoBeanEZpvd.tokenSymbol : null, ((-69633) & 16) != 0 ? dexMultiTokenInfoBeanEZpvd.tokenName : null, ((-69633) & 32) != 0 ? dexMultiTokenInfoBeanEZpvd.tokenType : null, ((-69633) & 64) != 0 ? dexMultiTokenInfoBeanEZpvd.tokenContractAddress : null, ((-69633) & 128) != 0 ? dexMultiTokenInfoBeanEZpvd.tokenLogoUrl : null, ((-69633) & 256) != 0 ? dexMultiTokenInfoBeanEZpvd.explorerUrl : null, ((-69633) & 512) != 0 ? dexMultiTokenInfoBeanEZpvd.decimals : null, ((-69633) & 1024) != 0 ? dexMultiTokenInfoBeanEZpvd.isNativeToken : null, ((-69633) & 2048) != 0 ? dexMultiTokenInfoBeanEZpvd.amount : null, ((-69633) & 4096) != 0 ? dexMultiTokenInfoBeanEZpvd.currencyAmount : strEZpvd2 == null ? "" : strEZpvd2, ((-69633) & 8192) != 0 ? dexMultiTokenInfoBeanEZpvd.amountNumBigDecimal : AudioStats.AUDIO_AMPLITUDE_NONE, ((-69633) & 16384) != 0 ? dexMultiTokenInfoBeanEZpvd.isDeleteCustomCoin : false, ((-69633) & 32768) != 0 ? dexMultiTokenInfoBeanEZpvd.isDefault : null, ((-69633) & 65536) != 0 ? dexMultiTokenInfoBeanEZpvd.amountNum : str, ((-69633) & 131072) != 0 ? dexMultiTokenInfoBeanEZpvd.spotBalance : null, ((-69633) & 262144) != 0 ? dexMultiTokenInfoBeanEZpvd.isLocalCheck : false, ((-69633) & 524288) != 0 ? dexMultiTokenInfoBeanEZpvd.isCustomToken : 0, ((-69633) & 1048576) != 0 ? dexMultiTokenInfoBeanEZpvd.chainLogoUrl : null, ((-69633) & 2097152) != 0 ? dexMultiTokenInfoBeanEZpvd.isSupportCrossChain : null, ((-69633) & 4194304) != 0 ? dexMultiTokenInfoBeanEZpvd.sourceLogo : null, ((-69633) & 8388608) != 0 ? dexMultiTokenInfoBeanEZpvd.source : null, ((-69633) & 16777216) != 0 ? dexMultiTokenInfoBeanEZpvd.isSafeMoonToken : 0, ((-69633) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? dexMultiTokenInfoBeanEZpvd.chainBWLogoUrl : null, ((-69633) & 67108864) != 0 ? dexMultiTokenInfoBeanEZpvd.isHoneypot : 0, ((-69633) & 134217728) != 0 ? dexMultiTokenInfoBeanEZpvd.sellTaxes : null, ((-69633) & 268435456) != 0 ? dexMultiTokenInfoBeanEZpvd.buyTaxes : null, ((-69633) & 536870912) != 0 ? dexMultiTokenInfoBeanEZpvd.isCollectToken : null, ((-69633) & 1073741824) != 0 ? dexMultiTokenInfoBeanEZpvd.tvlUsd : null, ((-69633) & Integer.MIN_VALUE) != 0 ? dexMultiTokenInfoBeanEZpvd.collectTime : null, (134217727 & 1) != 0 ? dexMultiTokenInfoBeanEZpvd.isSubscribe : 0, (134217727 & 2) != 0 ? dexMultiTokenInfoBeanEZpvd.isAuth : 0, (134217727 & 4) != 0 ? dexMultiTokenInfoBeanEZpvd.topPlacement : 0, (134217727 & 8) != 0 ? dexMultiTokenInfoBeanEZpvd.price : null, (134217727 & 16) != 0 ? dexMultiTokenInfoBeanEZpvd.change : null, (134217727 & 32) != 0 ? dexMultiTokenInfoBeanEZpvd.volume : null, (134217727 & 64) != 0 ? dexMultiTokenInfoBeanEZpvd.availableCurrencyAmount : null, (134217727 & 128) != 0 ? dexMultiTokenInfoBeanEZpvd.availableAmountNum : null, (134217727 & 256) != 0 ? dexMultiTokenInfoBeanEZpvd.isLeveraged : null, (134217727 & 512) != 0 ? dexMultiTokenInfoBeanEZpvd.displayToken : false, (134217727 & 1024) != 0 ? dexMultiTokenInfoBeanEZpvd.crossAbility : null, (134217727 & 2048) != 0 ? dexMultiTokenInfoBeanEZpvd.systemTokenType : null, (134217727 & 4096) != 0 ? dexMultiTokenInfoBeanEZpvd.netPurchaseAmount : null, (134217727 & 8192) != 0 ? dexMultiTokenInfoBeanEZpvd.avgBuyPrice : null, (134217727 & 16384) != 0 ? dexMultiTokenInfoBeanEZpvd.unrealizedPnl : null, (134217727 & 32768) != 0 ? dexMultiTokenInfoBeanEZpvd.unrealizedPnlPercent : null, (134217727 & 65536) != 0 ? dexMultiTokenInfoBeanEZpvd.lastTxPrice : null, (134217727 & 131072) != 0 ? dexMultiTokenInfoBeanEZpvd.liquidity : null, (134217727 & 262144) != 0 ? dexMultiTokenInfoBeanEZpvd.t : null, (134217727 & 524288) != 0 ? dexMultiTokenInfoBeanEZpvd.riskLevel : null, (134217727 & 1048576) != 0 ? dexMultiTokenInfoBeanEZpvd.totalLiquidity : null, (134217727 & 2097152) != 0 ? dexMultiTokenInfoBeanEZpvd.marketCap : null, (134217727 & 4194304) != 0 ? dexMultiTokenInfoBeanEZpvd.turnOver24H : null, (134217727 & 8388608) != 0 ? dexMultiTokenInfoBeanEZpvd.needApprove : null, (134217727 & 16777216) != 0 ? dexMultiTokenInfoBeanEZpvd.wTokenAddress : null, (134217727 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? dexMultiTokenInfoBeanEZpvd.tokenCategories : null, (134217727 & 67108864) != 0 ? dexMultiTokenInfoBeanEZpvd.tokenInfoForApp : null), false, 2, null);
                }
                arrayList.add(uIPricingTokenCopy$default);
            }
            listAhwBna = arrayList;
        }
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        return CollectionsKt___CollectionsKt.EZpvd(listAhwBna, new TaskDescription());
    }

    public static final class TaskDescription<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(C33129mqd.AEQbTJ(((UIPricingToken) t2).EZpvd().getCurrencyAmount())), java.lang.Double.valueOf(C33129mqd.AEQbTJ(((UIPricingToken) t).EZpvd().getCurrencyAmount())));
        }
    }
}
