package com.okinc.business.invest_biz.ui.widget.transaction;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C27446jvO;
import o.C56391yDq;
import o.C56442yFn;
import o.C56548yJl;

/* JADX INFO: loaded from: classes6.dex */
public final class CircularCountdownProgressView$start$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    long J$0;
    long J$1;
    int label;
    final /* synthetic */ C27446jvO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircularCountdownProgressView$start$1(C27446jvO c27446jvO, Continuation<? super CircularCountdownProgressView$start$1> continuation) {
        super(2, continuation);
        this.this$0 = c27446jvO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CircularCountdownProgressView$start$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CircularCountdownProgressView$start$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0062 -> B:16:0x0065). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        long j;
        long j2;
        C27446jvO.TaskDescription taskDescription;
        C27446jvO.TaskDescription taskDescription2;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            long j3 = ((long) (this.this$0.djBIcL - this.this$0.valueOf)) * 1000;
            i = 0;
            j = ((long) this.this$0.djBIcL) * 1000;
            j2 = j3;
            if (this.this$0.valueOf > 0) {
            }
            if (this.this$0.gEmmrt) {
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = this.I$0;
        j = this.J$1;
        j2 = this.J$0;
        C56391yDq.AEQbTJ(obj);
        if (this.this$0.gEmmrt) {
            j2 += this.this$0.fetchVPNInfo;
            i++;
            if (i >= 10) {
                this.this$0.valueOf--;
                i = 0;
            }
            this.this$0.OLrzqt = C56548yJl.KWHzl(j2 / j, 0.0f, 1.0f);
            this.this$0.invalidate();
            if (i == 0 && (taskDescription2 = this.this$0.copydefault) != null) {
                taskDescription2.AEQbTJ(this.this$0.valueOf, this.this$0.djBIcL, this.this$0.OLrzqt);
            }
        }
        if (this.this$0.valueOf > 0 || !this.this$0.gEmmrt) {
            if (this.this$0.gEmmrt && this.this$0.valueOf == 0) {
                this.this$0.OLrzqt = 1.0f;
                this.this$0.invalidate();
                taskDescription = this.this$0.copydefault;
                if (taskDescription != null) {
                    taskDescription.KWHzl();
                }
                this.this$0.setVisibility(8);
                this.this$0.gEmmrt = false;
            }
            return Unit.INSTANCE;
        }
        long j4 = this.this$0.fetchVPNInfo;
        this.J$0 = j2;
        this.J$1 = j;
        this.I$0 = i;
        this.label = 1;
        if (DelayKt.delay(j4, this) == objCopydefault) {
            return objCopydefault;
        }
        if (this.this$0.gEmmrt) {
        }
        if (this.this$0.valueOf > 0) {
        }
        if (this.this$0.gEmmrt) {
            this.this$0.OLrzqt = 1.0f;
            this.this$0.invalidate();
            taskDescription = this.this$0.copydefault;
            if (taskDescription != null) {
            }
            this.this$0.setVisibility(8);
            this.this$0.gEmmrt = false;
        }
        return Unit.INSTANCE;
    }
}
