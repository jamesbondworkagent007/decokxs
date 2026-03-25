package com.okinc.ok_kyc_core.presentation.processing;

import com.okinc.ok_kyc_core.data.remote.networkmodel.Onboarding;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ProcessingAppModel;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.rIF;
import o.rIM;

/* JADX INFO: loaded from: classes23.dex */
public final class ProcessingFragment$getWCResult$1$1$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProcessingAppModel $processingAppModel;
    int label;
    final /* synthetic */ rIF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessingFragment$getWCResult$1$1$1$2$1(rIF rif, ProcessingAppModel processingAppModel, Continuation<? super ProcessingFragment$getWCResult$1$1$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = rif;
        this.$processingAppModel = processingAppModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProcessingFragment$getWCResult$1$1$1$2$1(this.this$0, this.$processingAppModel, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProcessingFragment$getWCResult$1$1$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String target;
        HashMap<String, String> map;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            rIM rimFetchVPNInfo = this.this$0.fetchVPNInfo();
            String strAYXKKw = this.this$0.AYXKKw();
            String strCopydefault = this.this$0.copydefault();
            HashMap<String, String> mapValueOf = this.this$0.valueOf();
            String id = this.$processingAppModel.getId();
            if (id == null) {
                id = "";
            }
            Onboarding onboarding = this.$processingAppModel.getOnboarding();
            if (onboarding == null || (target = onboarding.getTarget()) == null) {
                target = "";
            }
            Onboarding onboarding2 = this.$processingAppModel.getOnboarding();
            if (onboarding2 == null || (map = onboarding2.getOnboardingParam()) == null) {
                map = new HashMap<>();
            }
            rimFetchVPNInfo.copydefault(strAYXKKw, strCopydefault, mapValueOf, id, target, map);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
