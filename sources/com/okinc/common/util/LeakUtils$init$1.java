package com.okinc.common.util;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32584mgO;
import o.C32588mgS;
import o.C56391yDq;
import o.C56442yFn;
import o.mNP;
import o.pJU;
import o.pJX;
import o.pUU;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class LeakUtils$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C32588mgS this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeakUtils$init$1(C32588mgS c32588mgS, Continuation<? super LeakUtils$init$1> continuation) {
        super(2, continuation);
        this.this$0 = c32588mgS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LeakUtils$init$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LeakUtils$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        pJX.StateListAnimator stateListAnimatorAEQbTJ;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            JSONObject jSONObjectEZpvd = this.this$0.EZpvd(true);
            if (jSONObjectEZpvd != null && (stateListAnimatorAEQbTJ = this.this$0.AEQbTJ(jSONObjectEZpvd)) != null) {
                if (!stateListAnimatorAEQbTJ.djBIcL()) {
                    stateListAnimatorAEQbTJ = null;
                }
                if (stateListAnimatorAEQbTJ != null) {
                    C32588mgS c32588mgS = this.this$0;
                    pJU pjuCopydefault = pJU.Companion.copydefault(c32588mgS.EZpvd, stateListAnimatorAEQbTJ);
                    pjuCopydefault.copydefault(C32584mgO.OLrzqt());
                    if (mNP.AEQbTJ.copydefault()) {
                        pjuCopydefault.copydefault(C32584mgO.KWHzl());
                    }
                    pjuCopydefault.KWHzl(c32588mgS.OLrzqt);
                    pUU.KWHzl(c32588mgS.OLrzqt(), "Initializing: " + stateListAnimatorAEQbTJ);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
