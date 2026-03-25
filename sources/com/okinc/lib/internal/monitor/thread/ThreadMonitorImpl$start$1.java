package com.okinc.lib.internal.monitor.thread;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import o.C38035pJv;
import o.C56391yDq;
import o.C56442yFn;
import o.C56548yJl;

/* JADX INFO: loaded from: classes9.dex */
public final class ThreadMonitorImpl$start$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C38035pJv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadMonitorImpl$start$1(C38035pJv c38035pJv, Continuation<? super ThreadMonitorImpl$start$1> continuation) {
        super(2, continuation);
        this.this$0 = c38035pJv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ThreadMonitorImpl$start$1 threadMonitorImpl$start$1 = new ThreadMonitorImpl$start$1(this.this$0, continuation);
        threadMonitorImpl$start$1.L$0 = obj;
        return threadMonitorImpl$start$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ThreadMonitorImpl$start$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:6:0x000f, B:24:0x0064, B:26:0x006a, B:29:0x0073, B:11:0x0023, B:13:0x0029, B:15:0x0031, B:19:0x0050, B:21:0x0059, B:18:0x0043), top: B:34:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:6:0x000f, B:24:0x0064, B:26:0x006a, B:29:0x0073, B:11:0x0023, B:13:0x0029, B:15:0x0031, B:19:0x0050, B:21:0x0059, B:18:0x0043), top: B:34:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:6:0x000f, B:24:0x0064, B:26:0x006a, B:29:0x0073, B:11:0x0023, B:13:0x0029, B:15:0x0031, B:19:0x0050, B:21:0x0059, B:18:0x0043), top: B:34:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:6:0x000f, B:24:0x0064, B:26:0x006a, B:29:0x0073, B:11:0x0023, B:13:0x0029, B:15:0x0031, B:19:0x0050, B:21:0x0059, B:18:0x0043), top: B:34:0x000f }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0057 -> B:24:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0061 -> B:24:0x0064). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            if (CoroutineScopeKt.isActive(coroutineScope)) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        coroutineScope = (CoroutineScope) this.L$0;
        try {
            C56391yDq.AEQbTJ(obj);
            if (CoroutineScopeKt.isActive(coroutineScope) && this.this$0.KWHzl) {
                this.this$0.AYXKKw = SystemClock.elapsedRealtime();
                this.this$0.KWHzl();
                if (CoroutineScopeKt.isActive(coroutineScope) && this.this$0.KWHzl) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long jCopydefault = C56548yJl.copydefault((this.this$0.AYXKKw != 0 ? jElapsedRealtime : this.this$0.AYXKKw + this.this$0.gEmmrt) - jElapsedRealtime, 0L);
                    if (jCopydefault > 0) {
                        this.L$0 = coroutineScope;
                        this.label = 1;
                        if (DelayKt.delay(jCopydefault, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    if (CoroutineScopeKt.isActive(coroutineScope)) {
                        this.this$0.AYXKKw = SystemClock.elapsedRealtime();
                        this.this$0.KWHzl();
                        if (CoroutineScopeKt.isActive(coroutineScope)) {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                            long jCopydefault2 = C56548yJl.copydefault((this.this$0.AYXKKw != 0 ? jElapsedRealtime2 : this.this$0.AYXKKw + this.this$0.gEmmrt) - jElapsedRealtime2, 0L);
                            if (jCopydefault2 > 0) {
                            }
                            if (CoroutineScopeKt.isActive(coroutineScope)) {
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return Unit.INSTANCE;
    }
}
