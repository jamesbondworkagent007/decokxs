package com.okinc.dexkline.trade.features.home.advanced.viewmodel;

import androidx.camera.video.AudioStats;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.dexkline.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class AdvancedMainVM$updateBaseToken$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DexMultiTokenInfoBean $token;
    int label;
    final /* synthetic */ AdvancedMainVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMainVM$updateBaseToken$1(AdvancedMainVM advancedMainVM, DexMultiTokenInfoBean dexMultiTokenInfoBean, Continuation<? super AdvancedMainVM$updateBaseToken$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedMainVM;
        this.$token = dexMultiTokenInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedMainVM$updateBaseToken$1(this.this$0, this.$token, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedMainVM$updateBaseToken$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
            DexMultiTokenInfoBean dexMultiTokenInfoBean = this.$token;
            mutableStateFlow.setValue(dexMultiTokenInfoBean.copy(((-1) & 1) != 0 ? dexMultiTokenInfoBean.id : null, ((-1) & 2) != 0 ? dexMultiTokenInfoBean.chainId : null, ((-1) & 4) != 0 ? dexMultiTokenInfoBean.chainName : null, ((-1) & 8) != 0 ? dexMultiTokenInfoBean.tokenSymbol : null, ((-1) & 16) != 0 ? dexMultiTokenInfoBean.tokenName : null, ((-1) & 32) != 0 ? dexMultiTokenInfoBean.tokenType : null, ((-1) & 64) != 0 ? dexMultiTokenInfoBean.tokenContractAddress : null, ((-1) & 128) != 0 ? dexMultiTokenInfoBean.tokenLogoUrl : null, ((-1) & 256) != 0 ? dexMultiTokenInfoBean.explorerUrl : null, ((-1) & 512) != 0 ? dexMultiTokenInfoBean.decimals : null, ((-1) & 1024) != 0 ? dexMultiTokenInfoBean.isNativeToken : null, ((-1) & 2048) != 0 ? dexMultiTokenInfoBean.amount : null, ((-1) & 4096) != 0 ? dexMultiTokenInfoBean.currencyAmount : null, ((-1) & 8192) != 0 ? dexMultiTokenInfoBean.amountNumBigDecimal : AudioStats.AUDIO_AMPLITUDE_NONE, ((-1) & 16384) != 0 ? dexMultiTokenInfoBean.isDeleteCustomCoin : false, ((-1) & 32768) != 0 ? dexMultiTokenInfoBean.isDefault : null, ((-1) & 65536) != 0 ? dexMultiTokenInfoBean.amountNum : null, ((-1) & 131072) != 0 ? dexMultiTokenInfoBean.isLocalCheck : false, ((-1) & 262144) != 0 ? dexMultiTokenInfoBean.isCustomToken : 0, ((-1) & 524288) != 0 ? dexMultiTokenInfoBean.chainLogoUrl : null, ((-1) & 1048576) != 0 ? dexMultiTokenInfoBean.isSupportCrossChain : null, ((-1) & 2097152) != 0 ? dexMultiTokenInfoBean.sourceLogo : null, ((-1) & 4194304) != 0 ? dexMultiTokenInfoBean.source : null, ((-1) & 8388608) != 0 ? dexMultiTokenInfoBean.isSafeMoonToken : 0, ((-1) & 16777216) != 0 ? dexMultiTokenInfoBean.chainBWLogoUrl : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? dexMultiTokenInfoBean.isHoneypot : 0, ((-1) & 67108864) != 0 ? dexMultiTokenInfoBean.sellTaxes : null, ((-1) & 134217728) != 0 ? dexMultiTokenInfoBean.buyTaxes : null, ((-1) & 268435456) != 0 ? dexMultiTokenInfoBean.isCollectToken : null, ((-1) & 536870912) != 0 ? dexMultiTokenInfoBean.tvlUsd : null, ((-1) & 1073741824) != 0 ? dexMultiTokenInfoBean.collectTime : null, ((-1) & Integer.MIN_VALUE) != 0 ? dexMultiTokenInfoBean.isSubscribe : 0, (25165823 & 1) != 0 ? dexMultiTokenInfoBean.isAuth : 0, (25165823 & 2) != 0 ? dexMultiTokenInfoBean.topPlacement : 0, (25165823 & 4) != 0 ? dexMultiTokenInfoBean.price : null, (25165823 & 8) != 0 ? dexMultiTokenInfoBean.change : null, (25165823 & 16) != 0 ? dexMultiTokenInfoBean.volume : null, (25165823 & 32) != 0 ? dexMultiTokenInfoBean.availableCurrencyAmount : null, (25165823 & 64) != 0 ? dexMultiTokenInfoBean.availableAmountNum : null, (25165823 & 128) != 0 ? dexMultiTokenInfoBean.isLeveraged : null, (25165823 & 256) != 0 ? dexMultiTokenInfoBean.displayToken : false, (25165823 & 512) != 0 ? dexMultiTokenInfoBean.crossAbility : null, (25165823 & 1024) != 0 ? dexMultiTokenInfoBean.systemTokenType : null, (25165823 & 2048) != 0 ? dexMultiTokenInfoBean.netPurchaseAmount : null, (25165823 & 4096) != 0 ? dexMultiTokenInfoBean.avgBuyPrice : null, (25165823 & 8192) != 0 ? dexMultiTokenInfoBean.unrealizedPnl : null, (25165823 & 16384) != 0 ? dexMultiTokenInfoBean.unrealizedPnlPercent : null, (25165823 & 32768) != 0 ? dexMultiTokenInfoBean.lastTxPrice : null, (25165823 & 65536) != 0 ? dexMultiTokenInfoBean.liquidity : null, (25165823 & 131072) != 0 ? dexMultiTokenInfoBean.t : null, (25165823 & 262144) != 0 ? dexMultiTokenInfoBean.riskLevel : null, (25165823 & 524288) != 0 ? dexMultiTokenInfoBean.totalLiquidity : null, (25165823 & 1048576) != 0 ? dexMultiTokenInfoBean.marketCap : null, (25165823 & 2097152) != 0 ? dexMultiTokenInfoBean.turnOver24H : null, (25165823 & 4194304) != 0 ? dexMultiTokenInfoBean.needApprove : null, (25165823 & 8388608) != 0 ? dexMultiTokenInfoBean.wTokenAddress : null, (25165823 & 16777216) != 0 ? dexMultiTokenInfoBean.tokenCategories : null));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
