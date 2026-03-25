package com.okinc.buysell.ui.paymentmethod.buy;

import android.graphics.drawable.Drawable;
import com.okinc.crcore.shared.net.responsebean.B2CQuotePriceBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31351lsQ;
import o.C31657lze;
import o.C31661lzi;
import o.C33129mqd;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.lKH;
import o.lTV;
import o.mHA;

/* JADX INFO: loaded from: classes7.dex */
public final class BscBuyPaymentMethodViewModel$quotedPriceAndUpdateAmountCard$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BscBuyPaymentMethodViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BscBuyPaymentMethodViewModel$quotedPriceAndUpdateAmountCard$1(BscBuyPaymentMethodViewModel bscBuyPaymentMethodViewModel, Continuation<? super BscBuyPaymentMethodViewModel$quotedPriceAndUpdateAmountCard$1> continuation) {
        super(2, continuation);
        this.this$0 = bscBuyPaymentMethodViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BscBuyPaymentMethodViewModel$quotedPriceAndUpdateAmountCard$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BscBuyPaymentMethodViewModel$quotedPriceAndUpdateAmountCard$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C31657lze c31657lze = this.this$0.gGvvIC;
            String strAubY = this.this$0.AubY();
            String strAwvSrB = this.this$0.AwvSrB();
            String type = this.this$0.UeEOUB().getType();
            String strZuBGHE = this.this$0.zuBGHE();
            int iAKErDB = this.this$0.aKErDB();
            String strAxsJAY = this.this$0.AxsJAY();
            String strORxRYg = this.this$0.ORxRYg();
            this.label = 1;
            obj = c31657lze.OLrzqt(strAubY, strAwvSrB, type, strZuBGHE, iAKErDB, strAxsJAY, strORxRYg, this);
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
        BscBuyPaymentMethodViewModel bscBuyPaymentMethodViewModel = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            List list = (List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            String strGHZMYf = bscBuyPaymentMethodViewModel.gHZMYf();
            String strZuBGHE2 = bscBuyPaymentMethodViewModel.zuBGHE();
            String price = ((B2CQuotePriceBean) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getPrice();
            int iAKErDB2 = bscBuyPaymentMethodViewModel.aKErDB();
            if (iAKErDB2 == 0) {
                strZuBGHE2 = lTV.copydefault.OLrzqt(bscBuyPaymentMethodViewModel.gHZMYf(), price, bscBuyPaymentMethodViewModel.hDKMBd());
            } else if (iAKErDB2 == 1) {
                strGHZMYf = lTV.copydefault.EZpvd(bscBuyPaymentMethodViewModel.zuBGHE(), price, bscBuyPaymentMethodViewModel.iwGUEr());
            }
            mHA mha = mHA.OLrzqt;
            mha.OLrzqt(bscBuyPaymentMethodViewModel.fFgQHt(), new lKH.TaskDescription(C31661lzi.copydefault(strGHZMYf, false), bscBuyPaymentMethodViewModel.AubY()));
            mha.OLrzqt(bscBuyPaymentMethodViewModel.fZBcTu(), bscBuyPaymentMethodViewModel.KWHzl(C31351lsQ.Activity.call, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C31661lzi.copydefault(strZuBGHE2, false) + " " + bscBuyPaymentMethodViewModel.AwvSrB()))));
        }
        BscBuyPaymentMethodViewModel bscBuyPaymentMethodViewModel2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
            C55326xho.toast$default(oKServerException.getMessage(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            lKH.updateDescription$default(bscBuyPaymentMethodViewModel2, bscBuyPaymentMethodViewModel2.AwvSrB(), null, 2, null);
            lKH.updateAmountCard$default(bscBuyPaymentMethodViewModel2, bscBuyPaymentMethodViewModel2.AubY(), null, 2, null);
            bscBuyPaymentMethodViewModel2.OLrzqt(C33129mqd.gEmmrt(C56443yFo.AEQbTJ(oKServerException.getCode())), C33129mqd.gEmmrt(oKServerException.getRequestUrl()), C33129mqd.gEmmrt(oKServerException.getMessage()));
        }
        mHA.OLrzqt.OLrzqt(this.this$0.dxcTrN(), C56443yFo.KWHzl(false));
        return Unit.INSTANCE;
    }
}
