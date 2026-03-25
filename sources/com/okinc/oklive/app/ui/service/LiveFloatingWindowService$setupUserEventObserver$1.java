package com.okinc.oklive.app.ui.service;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC47263tmj;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes24.dex */
public final class LiveFloatingWindowService$setupUserEventObserver$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LiveFloatingWindowService this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveFloatingWindowService$setupUserEventObserver$1(LiveFloatingWindowService liveFloatingWindowService, Continuation<? super LiveFloatingWindowService$setupUserEventObserver$1> continuation) {
        super(2, continuation);
        this.this$0 = liveFloatingWindowService;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiveFloatingWindowService$setupUserEventObserver$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiveFloatingWindowService$setupUserEventObserver$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow<AbstractC47263tmj> flowFIwbmz = C44157sFk.gEmmrt().fIwbmz();
                final LiveFloatingWindowService liveFloatingWindowService = this.this$0;
                FlowCollector<? super AbstractC47263tmj> flowCollector = new FlowCollector() { // from class: com.okinc.oklive.app.ui.service.LiveFloatingWindowService$setupUserEventObserver$1.3
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public final Object emit(AbstractC47263tmj abstractC47263tmj, Continuation<? super Unit> continuation) {
                        if (abstractC47263tmj instanceof AbstractC47263tmj.ActionBar) {
                            pUU.EZpvd("LiveFloatingWindowService", "setupUserEventObserver: User logged in, stopping service");
                            liveFloatingWindowService.gEmmrt();
                        } else if (abstractC47263tmj instanceof AbstractC47263tmj.Activity) {
                            pUU.EZpvd("LiveFloatingWindowService", "setupUserEventObserver: User logged out, stopping service");
                            liveFloatingWindowService.gEmmrt();
                        } else if (abstractC47263tmj instanceof AbstractC47263tmj.StateListAnimator) {
                            pUU.EZpvd("LiveFloatingWindowService", "setupUserEventObserver: User switched account, stopping service");
                            liveFloatingWindowService.gEmmrt();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFIwbmz.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (Exception e) {
            pUU.AEQbTJ("LiveFloatingWindowService", "setupUserEventObserver: Error observing user events", e);
        }
        return Unit.INSTANCE;
    }
}
