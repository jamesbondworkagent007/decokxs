package com.okinc.dexkline.dexui.main.market.detail.fragment.chart;

import com.okinc.dexkline.market.features.chart.ui.ChartDataViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C55052xcf;
import o.C56391yDq;
import o.C56442yFn;
import o.mSK;
import o.oNU;

/* JADX INFO: loaded from: classes15.dex */
public final class KlineVerticalFragment$initView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ oNU $binding;
    int label;
    final /* synthetic */ mSK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineVerticalFragment$initView$2(mSK msk, oNU onu, Continuation<? super KlineVerticalFragment$initView$2> continuation) {
        super(2, continuation);
        this.this$0 = msk;
        this.$binding = onu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineVerticalFragment$initView$2(this.this$0, this.$binding, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineVerticalFragment$initView$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ChartDataViewModel chartDataViewModelDjBIcL = this.this$0.djBIcL();
            this.label = 1;
            if (chartDataViewModelDjBIcL.EZpvd(this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C55052xcf c55052xcf = this.$binding.KWHzl;
        mSK msk = this.this$0;
        c55052xcf.setTitle(msk.copydefault(msk.djBIcL().AEQbTJ()));
        mSK msk2 = this.this$0;
        msk2.EZpvd(msk2.djBIcL().AEQbTJ());
        return Unit.INSTANCE;
    }
}
