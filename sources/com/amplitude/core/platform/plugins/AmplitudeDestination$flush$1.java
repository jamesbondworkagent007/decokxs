package com.amplitude.core.platform.plugins;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C5255Kr;
import o.C5261Kx;
import o.C56391yDq;
import o.C56442yFn;
import o.KC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AmplitudeDestination$flush$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ KC this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmplitudeDestination$flush$1(KC kc, Continuation<? super AmplitudeDestination$flush$1> continuation) {
        super(2, continuation);
        this.this$0 = kc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new AmplitudeDestination$flush$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AmplitudeDestination$flush$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        C5255Kr c5255Kr = null;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C5261Kx c5261Kx = this.this$0.AEQbTJ;
            if (c5261Kx == null) {
                Intrinsics.gEmmrt("");
                c5261Kx = null;
            }
            this.label = 1;
            if (c5261Kx.copydefault(this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C5255Kr c5255Kr2 = this.this$0.AYXKKw;
        if (c5255Kr2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c5255Kr = c5255Kr2;
        }
        c5255Kr.AEQbTJ();
        return Unit.INSTANCE;
    }
}
