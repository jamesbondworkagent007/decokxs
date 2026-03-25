package com.okinc.buysell.ui.paymentmethod.buy;

import android.graphics.drawable.Drawable;
import com.okinc.crcore.shared.net.responsebean.bsc.B2CQuoteBean;
import com.okinc.crcore.shared.net.responsebean.bsc.B2CSwapBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31351lsQ;
import o.C31661lzi;
import o.C33129mqd;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.lKH;
import o.lyX;
import o.mHA;

/* JADX INFO: loaded from: classes7.dex */
public final class BuyPaymentMethodViewModel$getQuoteAndUpdateAmountCard$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BuyPaymentMethodViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyPaymentMethodViewModel$getQuoteAndUpdateAmountCard$1(BuyPaymentMethodViewModel buyPaymentMethodViewModel, Continuation<? super BuyPaymentMethodViewModel$getQuoteAndUpdateAmountCard$1> continuation) {
        super(2, continuation);
        this.this$0 = buyPaymentMethodViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyPaymentMethodViewModel$getQuoteAndUpdateAmountCard$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BuyPaymentMethodViewModel$getQuoteAndUpdateAmountCard$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            lyX lyx = this.this$0.giSNqX;
            String strAubY = this.this$0.AubY();
            String strUzCIH = this.this$0.uzCIH();
            String strAwvSrB = this.this$0.AwvSrB();
            String strQbewEr = this.this$0.QbewEr();
            TradeType tradeType = this.this$0.gGvvIC;
            String strQOLQEE = this.this$0.QOLQEE();
            int iAKErDB = this.this$0.aKErDB();
            String strQbewEr2 = this.this$0.QbewEr();
            String strAxsJAY = this.this$0.AxsJAY();
            this.label = 1;
            objOLrzqt = lyx.OLrzqt(strAubY, strUzCIH, strAwvSrB, strQbewEr, tradeType, strQOLQEE, iAKErDB, 1, strQbewEr2, strAxsJAY, this);
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
        BuyPaymentMethodViewModel buyPaymentMethodViewModel = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            B2CQuoteBean b2CQuoteBean = (B2CQuoteBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            B2CSwapBean convertDetail = b2CQuoteBean.getConvertDetail();
            String convertBaseAmount = convertDetail != null ? convertDetail.getConvertBaseAmount() : null;
            if (convertBaseAmount == null) {
                convertBaseAmount = "";
            }
            if (buyPaymentMethodViewModel.iRxXKY() && C33129mqd.OLrzqt((CharSequence) convertBaseAmount)) {
                mHA.OLrzqt.OLrzqt(buyPaymentMethodViewModel.fFgQHt(), new lKH.TaskDescription(C31661lzi.copydefault(convertBaseAmount, false), buyPaymentMethodViewModel.AubY()));
            } else {
                mHA.OLrzqt.OLrzqt(buyPaymentMethodViewModel.fFgQHt(), new lKH.TaskDescription(C31661lzi.copydefault(b2CQuoteBean.getBaseAmount(), false), buyPaymentMethodViewModel.AubY()));
            }
            mHA.OLrzqt.OLrzqt(buyPaymentMethodViewModel.fZBcTu(), buyPaymentMethodViewModel.KWHzl(C31351lsQ.Activity.call, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C31661lzi.copydefault(b2CQuoteBean.getQuoteAmount(), false) + " " + buyPaymentMethodViewModel.AwvSrB()))));
        }
        BuyPaymentMethodViewModel buyPaymentMethodViewModel2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            C55326xho.toast$default(((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()).getMessage(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            lKH.updateDescription$default(buyPaymentMethodViewModel2, buyPaymentMethodViewModel2.AwvSrB(), null, 2, null);
            lKH.updateAmountCard$default(buyPaymentMethodViewModel2, buyPaymentMethodViewModel2.AubY(), null, 2, null);
        }
        mHA.OLrzqt.OLrzqt(this.this$0.dxcTrN(), C56443yFo.KWHzl(false));
        return Unit.INSTANCE;
    }
}
