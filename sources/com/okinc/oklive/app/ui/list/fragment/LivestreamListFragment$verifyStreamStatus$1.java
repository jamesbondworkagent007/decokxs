package com.okinc.oklive.app.ui.list.fragment;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC44569sUu;
import o.C44573sUy;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.sTB;
import o.sUN;

/* JADX INFO: loaded from: classes16.dex */
public final class LivestreamListFragment$verifyStreamStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC44569sUu.Activity $stream;
    int label;
    final /* synthetic */ C44573sUy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamListFragment$verifyStreamStatus$1(C44573sUy c44573sUy, AbstractC44569sUu.Activity activity, Continuation<? super LivestreamListFragment$verifyStreamStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = c44573sUy;
        this.$stream = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LivestreamListFragment$verifyStreamStatus$1(this.this$0, this.$stream, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LivestreamListFragment$verifyStreamStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sUN sunDjBIcL = this.this$0.djBIcL();
            String strOLrzqt = this.$stream.OLrzqt();
            this.label = 1;
            obj = sunDjBIcL.copydefault(strOLrzqt, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        sTB stb = (sTB) obj;
        if (stb instanceof sTB.TaskDescription) {
            sTB.TaskDescription taskDescription = (sTB.TaskDescription) stb;
            if (taskDescription.copydefault()) {
                this.this$0.KWHzl(this.$stream.OLrzqt());
            } else if (taskDescription.djBIcL()) {
                this.this$0.djBIcL().AkhnZx();
            } else {
                this.this$0.djBIcL().gEmmrt();
            }
        } else if (stb instanceof sTB.Application) {
            this.this$0.djBIcL().gEmmrt();
        } else if (stb instanceof sTB.Activity) {
            pUU.copydefault(this.this$0.getTAG(), "Status check failed: " + ((sTB.Activity) stb).EZpvd());
            this.this$0.djBIcL().gEmmrt();
        } else if (stb instanceof sTB.StateListAnimator) {
            this.this$0.djBIcL().AEQbTJ(this.$stream);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
