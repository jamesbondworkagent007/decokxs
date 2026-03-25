package com.okinc.kline.timeanchor;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C36250oUv;
import o.C36348oYl;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC36351oYo;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineFastJumpManager$executeSmoothMoveAnimation$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C36250oUv $chartView;
    final /* synthetic */ float $distance;
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ InterfaceC36351oYo $presenter;
    int label;
    final /* synthetic */ C36348oYl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineFastJumpManager$executeSmoothMoveAnimation$1$1(C36348oYl c36348oYl, C36250oUv c36250oUv, float f, Fragment fragment, InterfaceC36351oYo interfaceC36351oYo, Continuation<? super KlineFastJumpManager$executeSmoothMoveAnimation$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c36348oYl;
        this.$chartView = c36250oUv;
        this.$distance = f;
        this.$fragment = fragment;
        this.$presenter = interfaceC36351oYo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineFastJumpManager$executeSmoothMoveAnimation$1$1(this.this$0, this.$chartView, this.$distance, this.$fragment, this.$presenter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineFastJumpManager$executeSmoothMoveAnimation$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C36348oYl c36348oYl = this.this$0;
            C36250oUv c36250oUv = this.$chartView;
            float f = this.$distance;
            this.label = 1;
            if (c36348oYl.KWHzl(c36250oUv, f, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.EZpvd(this.$fragment, this.$presenter);
        C36348oYl c36348oYl2 = this.this$0;
        C36250oUv c36250oUv2 = this.$chartView;
        this.label = 2;
        if (c36348oYl2.KWHzl(c36250oUv2, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
