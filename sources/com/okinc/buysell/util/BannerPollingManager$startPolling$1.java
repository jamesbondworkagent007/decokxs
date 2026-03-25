package com.okinc.buysell.util;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class BannerPollingManager$startPolling$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $onPoll;
    final /* synthetic */ int $pollingInterval;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BannerPollingManager$startPolling$1(Function1<? super Continuation<? super Unit>, ? extends Object> function1, int i, Continuation<? super BannerPollingManager$startPolling$1> continuation) {
        super(2, continuation);
        this.$onPoll = function1;
        this.$pollingInterval = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BannerPollingManager$startPolling$1 bannerPollingManager$startPolling$1 = new BannerPollingManager$startPolling$1(this.$onPoll, this.$pollingInterval, continuation);
        bannerPollingManager$startPolling$1.L$0 = obj;
        return bannerPollingManager$startPolling$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BannerPollingManager$startPolling$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:11:0x002e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        long j;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
        } else if (i == 1) {
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            j = this.$pollingInterval;
            this.L$0 = coroutineScope;
            this.label = 2;
            if (DelayKt.delay(j * 1000, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (!CoroutineScopeKt.isActive(coroutineScope)) {
            Function1<Continuation<? super Unit>, Object> function1 = this.$onPoll;
            this.L$0 = coroutineScope;
            this.label = 1;
            if (function1.invoke(this) == objCopydefault) {
                return objCopydefault;
            }
            j = this.$pollingInterval;
            this.L$0 = coroutineScope;
            this.label = 2;
            if (DelayKt.delay(j * 1000, this) == objCopydefault) {
            }
            if (!CoroutineScopeKt.isActive(coroutineScope)) {
                return Unit.INSTANCE;
            }
        }
    }
}
