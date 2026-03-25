package com.okinc.buysell.ui.bsc;

import android.graphics.drawable.Drawable;
import com.okinc.buysell.ui.bsc.BaseBuySellViewModel;
import com.okinc.crcore.shared.net.responsebean.bsc.B2CQuoteBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.experience.BuySellCurrency;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C33129mqd;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.lyX;
import o.mHA;

/* JADX INFO: loaded from: classes7.dex */
public final class BaseBuySellViewModel$getQuoteAndShowQPDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $baseAmount;
    final /* synthetic */ ChannelCategoryCode $categoryCode;
    final /* synthetic */ String $quoteAmount;
    final /* synthetic */ int $standard;
    int label;
    final /* synthetic */ BaseBuySellViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseBuySellViewModel$getQuoteAndShowQPDialog$1(BaseBuySellViewModel baseBuySellViewModel, String str, String str2, int i, ChannelCategoryCode channelCategoryCode, Continuation<? super BaseBuySellViewModel$getQuoteAndShowQPDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = baseBuySellViewModel;
        this.$baseAmount = str;
        this.$quoteAmount = str2;
        this.$standard = i;
        this.$categoryCode = channelCategoryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseBuySellViewModel$getQuoteAndShowQPDialog$1(this.this$0, this.$baseAmount, this.$quoteAmount, this.$standard, this.$categoryCode, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseBuySellViewModel$getQuoteAndShowQPDialog$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strEjfBZ;
        String currency;
        Object objOLrzqt;
        String depositName;
        PaymentMethod paymentMethod;
        String payment;
        BuySellCurrency buySellCurrencyAEQbTJ;
        CurrencyToken currencyTokenCopydefault;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            lyX lyxIwGUEr = this.this$0.iwGUEr();
            mHA mha = mHA.OLrzqt;
            BaseBuySellViewModel.ActionBar actionBar = (BaseBuySellViewModel.ActionBar) mha.AEQbTJ(this.this$0.QOLQEE());
            if (actionBar == null || (currencyTokenCopydefault = actionBar.copydefault()) == null || (strEjfBZ = currencyTokenCopydefault.getCurrency()) == null) {
                strEjfBZ = this.this$0.ejfBZ();
            }
            String str = this.$baseAmount;
            BaseBuySellViewModel.ActionBar actionBar2 = (BaseBuySellViewModel.ActionBar) mha.AEQbTJ(this.this$0.QOLQEE());
            if (actionBar2 == null || (buySellCurrencyAEQbTJ = actionBar2.AEQbTJ()) == null || (currency = buySellCurrencyAEQbTJ.getCurrency()) == null) {
                currency = "";
            }
            String str2 = this.$quoteAmount;
            TradeType tradeTypeFlVtFt = this.this$0.flVtFt();
            Pair pair = (Pair) mha.AEQbTJ(this.this$0.sSMYrx());
            String str3 = (pair == null || (paymentMethod = (PaymentMethod) pair.getSecond()) == null || (payment = paymentMethod.getPayment()) == null) ? "" : payment;
            int i2 = this.$standard;
            String str4 = this.$quoteAmount;
            Channel channelAwvSrB = this.this$0.AwvSrB();
            String str5 = (channelAwvSrB == null || (depositName = channelAwvSrB.getDepositName()) == null) ? "" : depositName;
            this.label = 1;
            objOLrzqt = lyxIwGUEr.OLrzqt(strEjfBZ, str, currency, str2, tradeTypeFlVtFt, str3, i2, 1, str4, str5, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objOLrzqt;
        BaseBuySellViewModel baseBuySellViewModel = this.this$0;
        ChannelCategoryCode channelCategoryCode = this.$categoryCode;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            B2CQuoteBean b2CQuoteBean = (B2CQuoteBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            mHA.OLrzqt.OLrzqt(baseBuySellViewModel.fJNWhG, C56443yFo.KWHzl(false));
            if (b2CQuoteBean.isConvert()) {
                baseBuySellViewModel.wlaJM().setP2pConvertBaseCurrency(b2CQuoteBean.getBaseCurrencySymbol());
                baseBuySellViewModel.wlaJM().setP2pConvertBaseAmount(b2CQuoteBean.getBaseAmount());
                baseBuySellViewModel.copydefault(channelCategoryCode, b2CQuoteBean);
            }
        }
        BaseBuySellViewModel baseBuySellViewModel2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
            mHA.OLrzqt.OLrzqt(baseBuySellViewModel2.fJNWhG, C56443yFo.KWHzl(false));
            baseBuySellViewModel2.AYXKKw(false);
            baseBuySellViewModel2.EZpvd(C33129mqd.gEmmrt(C56443yFo.AEQbTJ(oKServerException.getCode())), C33129mqd.gEmmrt(oKServerException.getRequestUrl()), C33129mqd.gEmmrt(oKServerException.getMessage()));
            C55326xho.toast$default(oKServerException.getMessage(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
