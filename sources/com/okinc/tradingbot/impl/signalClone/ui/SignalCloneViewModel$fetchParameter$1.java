package com.okinc.tradingbot.impl.signalClone.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.C48158uHc;
import o.C52020vxx;
import o.C53740wrG;
import o.C53826wsn;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.uLU;

/* JADX INFO: loaded from: classes19.dex */
public final class SignalCloneViewModel$fetchParameter$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C53826wsn.StateListAnimator.TaskDescription $action;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C53826wsn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalCloneViewModel$fetchParameter$1(C53826wsn c53826wsn, C53826wsn.StateListAnimator.TaskDescription taskDescription, Continuation<? super SignalCloneViewModel$fetchParameter$1> continuation) {
        super(2, continuation);
        this.this$0 = c53826wsn;
        this.$action = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SignalCloneViewModel$fetchParameter$1 signalCloneViewModel$fetchParameter$1 = new SignalCloneViewModel$fetchParameter$1(this.this$0, this.$action, continuation);
        signalCloneViewModel$fetchParameter$1.L$0 = obj;
        return signalCloneViewModel$fetchParameter$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SignalCloneViewModel$fetchParameter$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Deferred deferred;
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            pUU.AEQbTJ("SignalCloneViewModel", "Fetch balance failed", e);
            this.this$0.OLrzqt.setValue(uLU.Companion.KWHzl(e));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new SignalCloneViewModel$fetchParameter$1$balanceResult$1(this.this$0, this.$action, null), 3, null);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new SignalCloneViewModel$fetchParameter$1$minimumInvestResult$1(this.this$0, this.$action, null), 3, null);
            this.L$0 = deferredAsync$default2;
            this.label = 1;
            Object objAwait = deferredAsync$default.await(this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
            deferred = deferredAsync$default2;
            obj = objAwait;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                C52020vxx.ActionBar actionBar = (C52020vxx.ActionBar) obj;
                this.this$0.OLrzqt.setValue(uLU.Companion.AEQbTJ(new C53740wrG(str, actionBar.OLrzqt(), actionBar.AEQbTJ())));
                this.this$0.KWHzl(actionBar);
                pUU.EZpvd("SignalCloneViewModel", "Fetch balance success: availableBalance=" + str + ", minInvestment=" + actionBar);
                return Unit.INSTANCE;
            }
            deferred = (Deferred) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        String strAEQbTJ = ((C48158uHc.Activity) obj).AEQbTJ();
        this.L$0 = strAEQbTJ;
        this.label = 2;
        Object objAwait2 = deferred.await(this);
        if (objAwait2 == objCopydefault) {
            return objCopydefault;
        }
        str = strAEQbTJ;
        obj = objAwait2;
        C52020vxx.ActionBar actionBar2 = (C52020vxx.ActionBar) obj;
        this.this$0.OLrzqt.setValue(uLU.Companion.AEQbTJ(new C53740wrG(str, actionBar2.OLrzqt(), actionBar2.AEQbTJ())));
        this.this$0.KWHzl(actionBar2);
        pUU.EZpvd("SignalCloneViewModel", "Fetch balance success: availableBalance=" + str + ", minInvestment=" + actionBar2);
        return Unit.INSTANCE;
    }
}
