package com.okinc.business.trade.features.home.advanced.viewmodel;

import androidx.camera.video.AudioStats;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMainConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
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
            AdvancedMainConfig advancedMainConfigKWHzl = this.this$0.fJNWhG.KWHzl(this.$token.getChainId());
            String wrapperTokenAddress = advancedMainConfigKWHzl != null ? advancedMainConfigKWHzl.getWrapperTokenAddress() : null;
            MutableStateFlow mutableStateFlow = this.this$0.copydefault;
            DexMultiTokenInfoBean dexMultiTokenInfoBean = this.$token;
            mutableStateFlow.setValue(dexMultiTokenInfoBean.copy(((-69633) & 1) != 0 ? dexMultiTokenInfoBean.id : null, ((-69633) & 2) != 0 ? dexMultiTokenInfoBean.chainId : null, ((-69633) & 4) != 0 ? dexMultiTokenInfoBean.chainName : null, ((-69633) & 8) != 0 ? dexMultiTokenInfoBean.tokenSymbol : null, ((-69633) & 16) != 0 ? dexMultiTokenInfoBean.tokenName : null, ((-69633) & 32) != 0 ? dexMultiTokenInfoBean.tokenType : null, ((-69633) & 64) != 0 ? dexMultiTokenInfoBean.tokenContractAddress : null, ((-69633) & 128) != 0 ? dexMultiTokenInfoBean.tokenLogoUrl : null, ((-69633) & 256) != 0 ? dexMultiTokenInfoBean.explorerUrl : null, ((-69633) & 512) != 0 ? dexMultiTokenInfoBean.decimals : null, ((-69633) & 1024) != 0 ? dexMultiTokenInfoBean.isNativeToken : null, ((-69633) & 2048) != 0 ? dexMultiTokenInfoBean.amount : null, ((-69633) & 4096) != 0 ? dexMultiTokenInfoBean.currencyAmount : null, ((-69633) & 8192) != 0 ? dexMultiTokenInfoBean.amountNumBigDecimal : AudioStats.AUDIO_AMPLITUDE_NONE, ((-69633) & 16384) != 0 ? dexMultiTokenInfoBean.isDeleteCustomCoin : false, ((-69633) & 32768) != 0 ? dexMultiTokenInfoBean.isDefault : null, ((-69633) & 65536) != 0 ? dexMultiTokenInfoBean.amountNum : null, ((-69633) & 131072) != 0 ? dexMultiTokenInfoBean.spotBalance : null, ((-69633) & 262144) != 0 ? dexMultiTokenInfoBean.isLocalCheck : false, ((-69633) & 524288) != 0 ? dexMultiTokenInfoBean.isCustomToken : 0, ((-69633) & 1048576) != 0 ? dexMultiTokenInfoBean.chainLogoUrl : null, ((-69633) & 2097152) != 0 ? dexMultiTokenInfoBean.isSupportCrossChain : null, ((-69633) & 4194304) != 0 ? dexMultiTokenInfoBean.sourceLogo : null, ((-69633) & 8388608) != 0 ? dexMultiTokenInfoBean.source : null, ((-69633) & 16777216) != 0 ? dexMultiTokenInfoBean.isSafeMoonToken : 0, ((-69633) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? dexMultiTokenInfoBean.chainBWLogoUrl : null, ((-69633) & 67108864) != 0 ? dexMultiTokenInfoBean.isHoneypot : 0, ((-69633) & 134217728) != 0 ? dexMultiTokenInfoBean.sellTaxes : null, ((-69633) & 268435456) != 0 ? dexMultiTokenInfoBean.buyTaxes : null, ((-69633) & 536870912) != 0 ? dexMultiTokenInfoBean.isCollectToken : null, ((-69633) & 1073741824) != 0 ? dexMultiTokenInfoBean.tvlUsd : null, ((-69633) & Integer.MIN_VALUE) != 0 ? dexMultiTokenInfoBean.collectTime : null, (134217727 & 1) != 0 ? dexMultiTokenInfoBean.isSubscribe : 0, (134217727 & 2) != 0 ? dexMultiTokenInfoBean.isAuth : 0, (134217727 & 4) != 0 ? dexMultiTokenInfoBean.topPlacement : 0, (134217727 & 8) != 0 ? dexMultiTokenInfoBean.price : null, (134217727 & 16) != 0 ? dexMultiTokenInfoBean.change : null, (134217727 & 32) != 0 ? dexMultiTokenInfoBean.volume : null, (134217727 & 64) != 0 ? dexMultiTokenInfoBean.availableCurrencyAmount : null, (134217727 & 128) != 0 ? dexMultiTokenInfoBean.availableAmountNum : null, (134217727 & 256) != 0 ? dexMultiTokenInfoBean.isLeveraged : null, (134217727 & 512) != 0 ? dexMultiTokenInfoBean.displayToken : false, (134217727 & 1024) != 0 ? dexMultiTokenInfoBean.crossAbility : null, (134217727 & 2048) != 0 ? dexMultiTokenInfoBean.systemTokenType : null, (134217727 & 4096) != 0 ? dexMultiTokenInfoBean.netPurchaseAmount : null, (134217727 & 8192) != 0 ? dexMultiTokenInfoBean.avgBuyPrice : null, (134217727 & 16384) != 0 ? dexMultiTokenInfoBean.unrealizedPnl : null, (134217727 & 32768) != 0 ? dexMultiTokenInfoBean.unrealizedPnlPercent : null, (134217727 & 65536) != 0 ? dexMultiTokenInfoBean.lastTxPrice : null, (134217727 & 131072) != 0 ? dexMultiTokenInfoBean.liquidity : null, (134217727 & 262144) != 0 ? dexMultiTokenInfoBean.t : null, (134217727 & 524288) != 0 ? dexMultiTokenInfoBean.riskLevel : null, (134217727 & 1048576) != 0 ? dexMultiTokenInfoBean.totalLiquidity : null, (134217727 & 2097152) != 0 ? dexMultiTokenInfoBean.marketCap : null, (134217727 & 4194304) != 0 ? dexMultiTokenInfoBean.turnOver24H : null, (134217727 & 8388608) != 0 ? dexMultiTokenInfoBean.needApprove : null, (134217727 & 16777216) != 0 ? dexMultiTokenInfoBean.wTokenAddress : wrapperTokenAddress, (134217727 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? dexMultiTokenInfoBean.tokenCategories : null, (134217727 & 67108864) != 0 ? dexMultiTokenInfoBean.tokenInfoForApp : null));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
