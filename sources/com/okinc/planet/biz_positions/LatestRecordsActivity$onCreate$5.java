package com.okinc.planet.biz_positions;

import android.app.Activity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AbstractC46197tLk;
import o.C46257tNq;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;
import o.tED;
import o.tEM;

/* JADX INFO: loaded from: classes19.dex */
public final class LatestRecordsActivity$onCreate$5 extends SuspendLambda implements Function2<AbstractC46197tLk<? extends tEM.TaskDescription>, Continuation<? super Unit>, Object> {
    final /* synthetic */ C46257tNq $binding;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ tED this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LatestRecordsActivity$onCreate$5(C46257tNq c46257tNq, tED ted, Continuation<? super LatestRecordsActivity$onCreate$5> continuation) {
        super(2, continuation);
        this.$binding = c46257tNq;
        this.this$0 = ted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LatestRecordsActivity$onCreate$5 latestRecordsActivity$onCreate$5 = new LatestRecordsActivity$onCreate$5(this.$binding, this.this$0, continuation);
        latestRecordsActivity$onCreate$5.L$0 = obj;
        return latestRecordsActivity$onCreate$5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(AbstractC46197tLk<? extends tEM.TaskDescription> abstractC46197tLk, Continuation<? super Unit> continuation) {
        return invoke2((AbstractC46197tLk<tEM.TaskDescription>) abstractC46197tLk, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(AbstractC46197tLk<tEM.TaskDescription> abstractC46197tLk, Continuation<? super Unit> continuation) {
        return ((LatestRecordsActivity$onCreate$5) create(abstractC46197tLk, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC46197tLk abstractC46197tLk = (AbstractC46197tLk) this.L$0;
            if (!(abstractC46197tLk instanceof AbstractC46197tLk.StateListAnimator)) {
                this.$binding.djBIcL.AEQbTJ();
                this.$binding.djBIcL.valueOf();
            }
            if (abstractC46197tLk instanceof AbstractC46197tLk.Application) {
                this.$binding.djBIcL.AhwBna(((tEM.TaskDescription) ((AbstractC46197tLk.Application) abstractC46197tLk).copydefault()).copydefault());
                if (!this.this$0.KWHzl) {
                    this.this$0.KWHzl = true;
                    rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                }
            } else if ((abstractC46197tLk instanceof AbstractC46197tLk.Activity) && !this.this$0.KWHzl) {
                this.this$0.KWHzl = true;
                rVN.reportFullyDrawn$default((Activity) this.this$0, false, (String) null, 2, (Object) null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
