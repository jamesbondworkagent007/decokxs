package com.okinc.business.defi.wallet.tee.timer;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import o.C17920fXe;
import o.C56391yDq;
import o.C56442yFn;
import o.C59462zhW;
import o.C59519zia;

/* JADX INFO: loaded from: classes5.dex */
public final class TeeTimer$start$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TeeTimer$start$1(Continuation<? super TeeTimer$start$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TeeTimer$start$1 teeTimer$start$1 = new TeeTimer$start$1(continuation);
        teeTimer$start$1.L$0 = obj;
        return teeTimer$start$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TeeTimer$start$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0053 -> B:11:0x002e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        long jEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
        } else if (i == 1) {
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            C59462zhW.Activity activity = C59462zhW.OLrzqt;
            jEZpvd = C59519zia.EZpvd(30, DurationUnit.SECONDS);
            this.L$0 = coroutineScope;
            this.label = 2;
            if (DelayKt.m7393delayVtjQ1oo(jEZpvd, this) == objCopydefault) {
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
            C17920fXe c17920fXe = C17920fXe.EZpvd;
            this.L$0 = coroutineScope;
            this.label = 1;
            if (c17920fXe.OLrzqt((Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
            C59462zhW.Activity activity2 = C59462zhW.OLrzqt;
            jEZpvd = C59519zia.EZpvd(30, DurationUnit.SECONDS);
            this.L$0 = coroutineScope;
            this.label = 2;
            if (DelayKt.m7393delayVtjQ1oo(jEZpvd, this) == objCopydefault) {
            }
            if (!CoroutineScopeKt.isActive(coroutineScope)) {
                return Unit.INSTANCE;
            }
        }
    }
}
