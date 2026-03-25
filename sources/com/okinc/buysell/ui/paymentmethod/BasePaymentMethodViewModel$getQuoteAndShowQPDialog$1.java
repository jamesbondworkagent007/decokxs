package com.okinc.buysell.ui.paymentmethod;

import android.graphics.drawable.Drawable;
import com.okinc.crcore.shared.net.responsebean.bsc.B2CQuoteBean;
import com.okinc.network.okg.response.OKServerException;
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
import o.lKH;
import o.lyX;
import o.mHA;

/* JADX INFO: loaded from: classes7.dex */
public final class BasePaymentMethodViewModel$getQuoteAndShowQPDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ lKH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePaymentMethodViewModel$getQuoteAndShowQPDialog$1(lKH lkh, Continuation<? super BasePaymentMethodViewModel$getQuoteAndShowQPDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = lkh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BasePaymentMethodViewModel$getQuoteAndShowQPDialog$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BasePaymentMethodViewModel$getQuoteAndShowQPDialog$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            lyX lyx = this.this$0.zLjUOn;
            String strAubY = this.this$0.AubY();
            String strUzCIH = this.this$0.uzCIH();
            String strAwvSrB = this.this$0.AwvSrB();
            String strQbewEr = this.this$0.QbewEr();
            TradeType tradeTypeUeEOUB = this.this$0.UeEOUB();
            String strORxRYg = this.this$0.ORxRYg();
            int iAKErDB = this.this$0.aKErDB();
            String strQbewEr2 = this.this$0.QbewEr();
            String strAxsJAY = this.this$0.AxsJAY();
            this.label = 1;
            objOLrzqt = lyx.OLrzqt(strAubY, strUzCIH, strAwvSrB, strQbewEr, tradeTypeUeEOUB, strORxRYg, iAKErDB, 1, strQbewEr2, strAxsJAY, this);
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
        lKH lkh = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            B2CQuoteBean b2CQuoteBean = (B2CQuoteBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            lkh.EZpvd(false);
            if (b2CQuoteBean.isConvert()) {
                lkh.copydefault(b2CQuoteBean.getBaseCurrencySymbol());
                lkh.KWHzl(b2CQuoteBean.getBaseAmount());
                mHA.OLrzqt.OLrzqt(lkh.fvQaOB(), new Pair(lkh.QVAiDq(), b2CQuoteBean));
            }
        }
        lKH lkh2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
            lkh2.EZpvd(false);
            lkh2.OLrzqt(C33129mqd.gEmmrt(C56443yFo.AEQbTJ(oKServerException.getCode())), C33129mqd.gEmmrt(oKServerException.getRequestUrl()), C33129mqd.gEmmrt(oKServerException.getMessage()));
            C55326xho.toast$default(oKServerException.getMessage(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
