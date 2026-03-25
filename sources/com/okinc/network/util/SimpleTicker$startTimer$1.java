package com.okinc.network.util;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes9.dex */
public final class SimpleTicker$startTimer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $action;
    final /* synthetic */ long $intervalMillis;
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SimpleTicker$startTimer$1(Function1<? super Continuation<? super Unit>, ? extends Object> function1, long j, Continuation<? super SimpleTicker$startTimer$1> continuation) {
        super(2, continuation);
        this.$action = function1;
        this.$intervalMillis = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SimpleTicker$startTimer$1(this.$action, this.$intervalMillis, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SimpleTicker$startTimer$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045 A[Catch: Exception -> 0x0032, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0032, blocks: (B:16:0x0045, B:10:0x002e), top: B:26:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007e -> B:23:0x0081). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j;
        Function1<Continuation<? super Unit>, Object> function1;
        int i;
        int i2;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = this.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            Function1<Continuation<? super Unit>, Object> function12 = this.$action;
            j = this.$intervalMillis;
            function1 = function12;
            i = Integer.MAX_VALUE;
            i2 = 0;
            if (i2 >= i) {
            }
        } else if (i3 == 1) {
            i2 = this.I$1;
            j = this.J$0;
            i = this.I$0;
            function1 = (Function1) this.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (Exception e) {
                pUU.AEQbTJ("SimpleTicker", "Timer execution error: " + e.getMessage(), e);
            }
            this.L$0 = function1;
            this.I$0 = i;
            this.J$0 = j;
            this.I$1 = i2;
            this.label = 2;
            if (DelayKt.delay(j, this) == objCopydefault) {
            }
            i2++;
            if (i2 >= i) {
            }
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.I$1;
            j = this.J$0;
            i = this.I$0;
            function1 = (Function1) this.L$0;
            C56391yDq.AEQbTJ(obj);
            i2++;
            if (i2 >= i) {
                this.L$0 = function1;
                this.I$0 = i;
                this.J$0 = j;
                this.I$1 = i2;
                this.label = 1;
                if (function1.invoke(this) == objCopydefault) {
                    return objCopydefault;
                }
                this.L$0 = function1;
                this.I$0 = i;
                this.J$0 = j;
                this.I$1 = i2;
                this.label = 2;
                if (DelayKt.delay(j, this) == objCopydefault) {
                    return objCopydefault;
                }
                i2++;
                if (i2 >= i) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
