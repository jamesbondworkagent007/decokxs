package com.okinc.liveness.eop.activity;

import com.okinc.liveness.eop.bean.LivenessRouter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class EopLivenessActivity$startLcaLiveness$1$1$onRestartDialogClicked$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $releaseLca;
    final /* synthetic */ String $vendorType;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EopLivenessActivity$startLcaLiveness$1$1$onRestartDialogClicked$1$2$1(String str, Function0<Unit> function0, Continuation<? super EopLivenessActivity$startLcaLiveness$1$1$onRestartDialogClicked$1$2$1> continuation) {
        super(2, continuation);
        this.$vendorType = str;
        this.$releaseLca = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EopLivenessActivity$startLcaLiveness$1$1$onRestartDialogClicked$1$2$1(this.$vendorType, this.$releaseLca, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EopLivenessActivity$startLcaLiveness$1$1$onRestartDialogClicked$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Function0<Unit> function0;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!Intrinsics.EZpvd((Object) this.$vendorType, (Object) LivenessRouter.LCA.getVendorName()) && (function0 = this.$releaseLca) != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
