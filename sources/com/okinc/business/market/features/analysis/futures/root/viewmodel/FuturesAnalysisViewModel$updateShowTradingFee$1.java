package com.okinc.business.market.features.analysis.futures.root.viewmodel;

import com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.C25844jIl;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes23.dex */
public final class FuturesAnalysisViewModel$updateShowTradingFee$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $show;
    int label;
    final /* synthetic */ FuturesAnalysisViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisViewModel$updateShowTradingFee$1(boolean z, FuturesAnalysisViewModel futuresAnalysisViewModel, Continuation<? super FuturesAnalysisViewModel$updateShowTradingFee$1> continuation) {
        super(2, continuation);
        this.$show = z;
        this.this$0 = futuresAnalysisViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesAnalysisViewModel$updateShowTradingFee$1(this.$show, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisViewModel$updateShowTradingFee$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C25844jIl.EZpvd.OLrzqt(this.$show);
            FuturesAnalysisViewModel futuresAnalysisViewModel = this.this$0;
            AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel$updateShowTradingFee$1.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return Boolean.valueOf(((FuturesAnalysisViewModel.StateListAnimator) obj2).gEmmrt());
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((FuturesAnalysisViewModel.StateListAnimator) obj2).copydefault(((Boolean) obj3).booleanValue());
                }
            };
            Boolean boolKWHzl = C56443yFo.KWHzl(this.$show);
            this.label = 1;
            if (futuresAnalysisViewModel.KWHzl(anonymousClass1, boolKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
