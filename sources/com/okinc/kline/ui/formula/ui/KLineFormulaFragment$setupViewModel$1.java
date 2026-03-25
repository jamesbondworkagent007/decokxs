package com.okinc.kline.ui.formula.ui;

import android.graphics.drawable.Drawable;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.C36246oUr;
import o.C37908pFd;
import o.C39507pte;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class KLineFormulaFragment$setupViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ KLineFormulaFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineFormulaFragment$setupViewModel$1(KLineFormulaFragment kLineFormulaFragment, Continuation<? super KLineFormulaFragment$setupViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = kLineFormulaFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineFormulaFragment$setupViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KLineFormulaFragment$setupViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedFlow<C39507pte.Activity> sharedFlowEZpvd = this.this$0.OJuSTm().EZpvd();
            final KLineFormulaFragment kLineFormulaFragment = this.this$0;
            FlowCollector<? super C39507pte.Activity> flowCollector = new FlowCollector() { // from class: com.okinc.kline.ui.formula.ui.KLineFormulaFragment$setupViewModel$1.5
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                public final Object emit(C39507pte.Activity activity, Continuation<? super Unit> continuation) {
                    if (activity instanceof C39507pte.Activity.Application) {
                        C39507pte.Activity.Application application = (C39507pte.Activity.Application) activity;
                        C37908pFd.AEQbTJ(application.EZpvd().OLrzqt().getCalcExpression());
                        kLineFormulaFragment.EZpvd(application.EZpvd().KWHzl(), application.EZpvd().OLrzqt());
                    } else {
                        if (!(activity instanceof C39507pte.Activity.C0920Activity)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        C36246oUr.copydefault().isConnected(false);
                        C55326xho.toast$default(((C39507pte.Activity.C0920Activity) activity).AEQbTJ(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (sharedFlowEZpvd.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
