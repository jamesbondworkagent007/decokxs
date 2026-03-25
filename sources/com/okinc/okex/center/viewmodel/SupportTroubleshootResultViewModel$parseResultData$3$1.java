package com.okinc.okex.center.viewmodel;

import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.viewmodel.SupportTroubleshootResultViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC45235slv;
import o.C44760scx;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class SupportTroubleshootResultViewModel$parseResultData$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SupportTroubleshootResultViewModel.ParseResult $parseResult;
    int label;
    final /* synthetic */ SupportTroubleshootResultViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportTroubleshootResultViewModel$parseResultData$3$1(SupportTroubleshootResultViewModel.ParseResult parseResult, SupportTroubleshootResultViewModel supportTroubleshootResultViewModel, Continuation<? super SupportTroubleshootResultViewModel$parseResultData$3$1> continuation) {
        super(2, continuation);
        this.$parseResult = parseResult;
        this.this$0 = supportTroubleshootResultViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportTroubleshootResultViewModel$parseResultData$3$1(this.$parseResult, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportTroubleshootResultViewModel$parseResultData$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                List<SelfServiceToolBean> selfServiceTools = this.$parseResult.getSelfServiceTools();
                if (selfServiceTools != null) {
                    this.this$0.gEmmrt.setValue(selfServiceTools);
                }
                if (this.$parseResult.getError() != null) {
                    this.this$0.valueOf.setValue(AbstractC45235slv.StateListAnimator.copydefault);
                }
            } catch (Exception e) {
                C44760scx.log$default("Failed to update UI state: " + e.getMessage(), null, 2, null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
