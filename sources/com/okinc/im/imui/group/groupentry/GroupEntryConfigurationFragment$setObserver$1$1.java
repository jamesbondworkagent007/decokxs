package com.okinc.im.imui.group.groupentry;

import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C34141nSy;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.nJF;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class GroupEntryConfigurationFragment$setObserver$1$1 extends SuspendLambda implements yHO<CoroutineScope, Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C34141nSy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupEntryConfigurationFragment$setObserver$1$1(C34141nSy c34141nSy, Continuation<? super GroupEntryConfigurationFragment$setObserver$1$1> continuation) {
        super(3, continuation);
        this.this$0 = c34141nSy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, Boolean bool, Continuation<? super Unit> continuation) {
        GroupEntryConfigurationFragment$setObserver$1$1 groupEntryConfigurationFragment$setObserver$1$1 = new GroupEntryConfigurationFragment$setObserver$1$1(this.this$0, continuation);
        groupEntryConfigurationFragment$setObserver$1$1.L$0 = bool;
        return groupEntryConfigurationFragment$setObserver$1$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Boolean bool = (Boolean) this.L$0;
            nJF njf = this.this$0.KWHzl;
            nJF njf2 = null;
            if (njf == null) {
                Intrinsics.gEmmrt("");
                njf = null;
            }
            LinearLayout linearLayout = njf.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true)) ? 0 : 8);
            nJF njf3 = this.this$0.KWHzl;
            if (njf3 == null) {
                Intrinsics.gEmmrt("");
                njf3 = null;
            }
            njf3.ejfBZ.setChecked(Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true)));
            nJF njf4 = this.this$0.KWHzl;
            if (njf4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                njf2 = njf4;
            }
            C52794wYp c52794wYp = njf2.isConnected;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true)) ? 0 : 8);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
