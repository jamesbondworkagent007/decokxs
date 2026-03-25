package com.okinc.buysell.ui.bsc;

import android.graphics.drawable.Drawable;
import com.okinc.crcore.shared.net.responsebean.bsc.TradeSuggestionBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31659lzg;
import o.C31667lzo;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.mHA;

/* JADX INFO: loaded from: classes7.dex */
public final class BaseBuySellViewModel$getTradeSuggestionDataForCefi$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $baseAmount;
    final /* synthetic */ String $baseCurrency;
    final /* synthetic */ String $quoteAmount;
    final /* synthetic */ String $quoteCurrency;
    final /* synthetic */ int $standard;
    int label;
    final /* synthetic */ BaseBuySellViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBuySellViewModel$getTradeSuggestionDataForCefi$1(BaseBuySellViewModel baseBuySellViewModel, String str, String str2, String str3, String str4, int i, Continuation<? super BaseBuySellViewModel$getTradeSuggestionDataForCefi$1> continuation) {
        super(2, continuation);
        this.this$0 = baseBuySellViewModel;
        this.$baseCurrency = str;
        this.$quoteCurrency = str2;
        this.$baseAmount = str3;
        this.$quoteAmount = str4;
        this.$standard = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseBuySellViewModel$getTradeSuggestionDataForCefi$1(this.this$0, this.$baseCurrency, this.$quoteCurrency, this.$baseAmount, this.$quoteAmount, this.$standard, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseBuySellViewModel$getTradeSuggestionDataForCefi$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C31659lzg c31659lzg = this.this$0.AxsJAYaxsJAY;
            TradeType tradeTypeFlVtFt = this.this$0.flVtFt();
            String str = this.$baseCurrency;
            String str2 = this.$quoteCurrency;
            String str3 = this.$baseAmount;
            String str4 = this.$quoteAmount;
            int i2 = this.$standard;
            boolean zDNCPSb = this.this$0.dNCPSb();
            String chainIndex = this.this$0.ORxRYg().getChainIndex();
            String tokenAddress = this.this$0.ORxRYg().getTokenAddress();
            this.label = 1;
            obj = c31659lzg.copydefault(tradeTypeFlVtFt, str, str2, str3, str4, i2, zDNCPSb, chainIndex, tokenAddress, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        BaseBuySellViewModel baseBuySellViewModel = this.this$0;
        String str5 = this.$baseCurrency;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            TradeSuggestionBean tradeSuggestionBean = (TradeSuggestionBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            baseBuySellViewModel.iRxXKY = baseBuySellViewModel.dNCPSb() && tradeSuggestionBean.getMultipleCurrencyEnabled();
            baseBuySellViewModel.gkJEwt = tradeSuggestionBean.getStableCoinEnabled() && tradeSuggestionBean.getPaymentChannels().isEmpty();
            baseBuySellViewModel.wlaJM = C31667lzo.AEQbTJ(tradeSuggestionBean);
            baseBuySellViewModel.OLrzqt(tradeSuggestionBean);
            baseBuySellViewModel.gEmmrt(C31667lzo.AEQbTJ(tradeSuggestionBean, str5));
            baseBuySellViewModel.djBIcL(false);
            baseBuySellViewModel.AEQbTJ(tradeSuggestionBean);
            if (baseBuySellViewModel.flVtFt() == TradeType.BUY) {
                mHA.OLrzqt.KWHzl(baseBuySellViewModel.getFieldNames);
            } else {
                mHA.OLrzqt.KWHzl(baseBuySellViewModel.zsXlph);
            }
            baseBuySellViewModel.AEQbTJ(false);
        }
        BaseBuySellViewModel baseBuySellViewModel2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
            baseBuySellViewModel2.AEQbTJ(false);
            C55326xho.toast$default(oKServerException.getMessage(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            mHA.OLrzqt.OLrzqt(baseBuySellViewModel2.AuCTel, C56443yFo.KWHzl(true));
        }
        return Unit.INSTANCE;
    }
}
