package com.okinc.kline.ui.component.business.klinequote.chart;

import com.okinc.kline.data.KLineEventBean;
import com.okinc.kline.ui.component.business.klinequote.viemodel.KlineQuoteViewModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class ChartUIComponent$observeDataChange$42$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ArrayList<KLineEventBean> $list;
    int label;
    final /* synthetic */ ChartUIComponent this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartUIComponent$observeDataChange$42$1$1(ChartUIComponent chartUIComponent, ArrayList<KLineEventBean> arrayList, Continuation<? super ChartUIComponent$observeDataChange$42$1$1> continuation) {
        super(2, continuation);
        this.this$0 = chartUIComponent;
        this.$list = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChartUIComponent$observeDataChange$42$1$1(this.this$0, this.$list, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChartUIComponent$observeDataChange$42$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            KlineQuoteViewModel klineQuoteViewModelValues = this.this$0.AYXKKw().values();
            ArrayList<KLineEventBean> arrayList = this.$list;
            Intrinsics.copydefault(arrayList);
            klineQuoteViewModelValues.OLrzqt(arrayList);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
