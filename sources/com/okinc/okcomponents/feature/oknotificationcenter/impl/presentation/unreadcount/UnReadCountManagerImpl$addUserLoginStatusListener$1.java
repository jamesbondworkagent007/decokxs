package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.unreadcount;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC47263tmj;
import o.C32979mnm;
import o.C44629saY;
import o.C56391yDq;
import o.C56442yFn;
import o.rXL;
import o.xVV;

/* JADX INFO: loaded from: classes10.dex */
public final class UnReadCountManagerImpl$addUserLoginStatusListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C44629saY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnReadCountManagerImpl$addUserLoginStatusListener$1(C44629saY c44629saY, Continuation<? super UnReadCountManagerImpl$addUserLoginStatusListener$1> continuation) {
        super(2, continuation);
        this.this$0 = c44629saY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnReadCountManagerImpl$addUserLoginStatusListener$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UnReadCountManagerImpl$addUserLoginStatusListener$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow<AbstractC47263tmj> flowFIwbmz = this.this$0.DbNXlk.fIwbmz();
            final C44629saY c44629saY = this.this$0;
            FlowCollector<? super AbstractC47263tmj> flowCollector = new FlowCollector() { // from class: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.unreadcount.UnReadCountManagerImpl$addUserLoginStatusListener$1.1
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public final Object emit(AbstractC47263tmj abstractC47263tmj, Continuation<? super Unit> continuation) {
                    if (abstractC47263tmj instanceof AbstractC47263tmj.ActionBar) {
                        rXL.Companion.EZpvd();
                        c44629saY.KWHzl();
                    } else if (abstractC47263tmj instanceof AbstractC47263tmj.Activity) {
                        xVV.djBIcL(C32979mnm.EZpvd.OLrzqt(), 0);
                        rXL.Companion.EZpvd();
                    } else {
                        if (!(abstractC47263tmj instanceof AbstractC47263tmj.StateListAnimator)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        rXL.Companion.EZpvd();
                        c44629saY.KWHzl();
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
        return Unit.INSTANCE;
    }
}
