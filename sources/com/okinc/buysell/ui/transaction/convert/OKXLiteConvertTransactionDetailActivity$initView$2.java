package com.okinc.buysell.ui.transaction.convert;

import com.okinc.crcore.shared.net.responsebean.MarketHistoryBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31722mBm;
import o.C33134mqi;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes15.dex */
public final class OKXLiteConvertTransactionDetailActivity$initView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OKXLiteConvertTransactionDetailActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXLiteConvertTransactionDetailActivity$initView$2(OKXLiteConvertTransactionDetailActivity oKXLiteConvertTransactionDetailActivity, Continuation<? super OKXLiteConvertTransactionDetailActivity$initView$2> continuation) {
        super(2, continuation);
        this.this$0 = oKXLiteConvertTransactionDetailActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXLiteConvertTransactionDetailActivity$initView$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKXLiteConvertTransactionDetailActivity$initView$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C31722mBm c31722mBmValueOf = this.this$0.valueOf();
            String str = this.this$0.fJNWhG;
            Intrinsics.copydefault((Object) str);
            long j = Long.parseLong(str);
            this.label = 1;
            obj = c31722mBmValueOf.AEQbTJ(j, this);
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
        OKXLiteConvertTransactionDetailActivity oKXLiteConvertTransactionDetailActivity = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            MarketHistoryBean marketHistoryBean = (MarketHistoryBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            oKXLiteConvertTransactionDetailActivity.dismissLoading();
            oKXLiteConvertTransactionDetailActivity.fARcdN = marketHistoryBean.getToCurrencyName();
            oKXLiteConvertTransactionDetailActivity.AkhnZx = marketHistoryBean.getToCurrencyFullName();
            oKXLiteConvertTransactionDetailActivity.AuCTel = marketHistoryBean.getToCurrencyIcon();
            oKXLiteConvertTransactionDetailActivity.fetchVPNInfo = marketHistoryBean.getToAmount();
            oKXLiteConvertTransactionDetailActivity.DbNXlk = marketHistoryBean.getFromCurrencyName();
            oKXLiteConvertTransactionDetailActivity.AYXKKw = marketHistoryBean.getFromCurrencyFullName();
            oKXLiteConvertTransactionDetailActivity.values = marketHistoryBean.getFromCurrencyIcon();
            oKXLiteConvertTransactionDetailActivity.gEmmrt = marketHistoryBean.getFromAmount();
            oKXLiteConvertTransactionDetailActivity.djBIcL = marketHistoryBean.getConvertRate();
            oKXLiteConvertTransactionDetailActivity.valueOf = marketHistoryBean.getEventTime();
            oKXLiteConvertTransactionDetailActivity.AhwBna = marketHistoryBean.getEventType();
            oKXLiteConvertTransactionDetailActivity.AYXKKw();
        }
        OKXLiteConvertTransactionDetailActivity oKXLiteConvertTransactionDetailActivity2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
            oKXLiteConvertTransactionDetailActivity2.dismissLoading();
            C33134mqi.AEQbTJ(oKServerException.getMessage());
        }
        return Unit.INSTANCE;
    }
}
