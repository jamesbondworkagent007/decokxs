package com.okinc.buysell.ui.result;

import com.okinc.crcore.shared.net.responsebean.QuickChangeOrderDetailBean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56442yFn;
import o.C59449zhJ;
import o.mCZ;

/* JADX INFO: loaded from: classes7.dex */
public final class ConvertResultViewModel$loadConvertOrderData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $tradeId;
    int label;
    final /* synthetic */ ConvertResultViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConvertResultViewModel$loadConvertOrderData$1(ConvertResultViewModel convertResultViewModel, String str, Continuation<? super ConvertResultViewModel$loadConvertOrderData$1> continuation) {
        super(2, continuation);
        this.this$0 = convertResultViewModel;
        this.$tradeId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConvertResultViewModel$loadConvertOrderData$1(this.this$0, this.$tradeId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConvertResultViewModel$loadConvertOrderData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String quoteCurrencyId;
        Pair pair;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            mCZ mcz = this.this$0.isConnected;
            String str = this.$tradeId;
            this.label = 1;
            obj = mcz.EZpvd(str, this);
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
        ConvertResultViewModel convertResultViewModel = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            QuickChangeOrderDetailBean quickChangeOrderDetailBean = (QuickChangeOrderDetailBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            boolean zGEmmrt = C59449zhJ.gEmmrt(quickChangeOrderDetailBean.getSide(), "buy", true);
            if (zGEmmrt) {
                quoteCurrencyId = quickChangeOrderDetailBean.getBaseCurrencyId();
            } else {
                quoteCurrencyId = quickChangeOrderDetailBean.getQuoteCurrencyId();
            }
            if (zGEmmrt) {
                pair = new Pair(quickChangeOrderDetailBean.getQuoteCcy(), quickChangeOrderDetailBean.getBaseCcy());
            } else {
                pair = new Pair(quickChangeOrderDetailBean.getBaseCcy(), quickChangeOrderDetailBean.getQuoteCcy());
            }
            String str2 = (String) pair.component1();
            String str3 = (String) pair.component2();
            if (quoteCurrencyId == null) {
                quoteCurrencyId = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            if (str3 == null) {
                str3 = "";
            }
            convertResultViewModel.OLrzqt(quoteCurrencyId, str2, str3);
        }
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
