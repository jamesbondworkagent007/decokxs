package com.okinc.business.defi.wallet.tee.disable.ui;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractC14702dqT;
import o.ActivityC17866fVe;
import o.C13754dXa;
import o.C14703dqU;
import o.C16302ehP;
import o.C33070mpX;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.dTQ;
import o.fVE;
import o.fWX;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class DisableActivity$onCreate$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C16302ehP $binding;
    int label;
    final /* synthetic */ ActivityC17866fVe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisableActivity$onCreate$3(ActivityC17866fVe activityC17866fVe, C16302ehP c16302ehP, Continuation<? super DisableActivity$onCreate$3> continuation) {
        super(2, continuation);
        this.this$0 = activityC17866fVe;
        this.$binding = c16302ehP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DisableActivity$onCreate$3(this.this$0, this.$binding, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DisableActivity$onCreate$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedFlow<Result<Unit>> sharedFlowCopydefault = this.this$0.KWHzl().copydefault();
            final C16302ehP c16302ehP = this.$binding;
            final ActivityC17866fVe activityC17866fVe = this.this$0;
            FlowCollector<? super Result<Unit>> flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.tee.disable.ui.DisableActivity$onCreate$3.5
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation<? super Unit> continuation) {
                    dTQ dtq;
                    c16302ehP.copydefault.fIwbmz();
                    Result result = (Result) obj2;
                    if (Result.m7384isSuccessimpl(result.m7386unboximpl())) {
                        if (activityC17866fVe.EZpvd() && (dtq = (dTQ) C43251rlk.OLrzqt(dTQ.class)) != null && dtq.OLrzqt(activityC17866fVe.valueOf())) {
                            AbstractC14702dqT abstractC14702dqTKWHzl = C14703dqU.Companion.KWHzl();
                            ActivityC17866fVe activityC17866fVe2 = activityC17866fVe;
                            abstractC14702dqTKWHzl.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ComponentActivityExternalSyntheticLambda2));
                            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractC14702dqTKWHzl), null, null, new DisableActivity$onCreate$3$1$1$1(abstractC14702dqTKWHzl, activityC17866fVe2, null), 3, null);
                            FragmentManager supportFragmentManager = activityC17866fVe.getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                            abstractC14702dqTKWHzl.show(supportFragmentManager, "DefiCreateWalletLoadingDFragment");
                        } else {
                            activityC17866fVe.setResult(-1);
                            activityC17866fVe.finish();
                        }
                    } else {
                        fVE.Companion.EZpvd().EZpvd(new fWX.AssistContent());
                        pUU.AEQbTJ("DisableActivity", "disableTeeFlow error", Result.m7380exceptionOrNullimpl(result.m7386unboximpl()));
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (sharedFlowCopydefault.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
