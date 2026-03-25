package com.okinc.liveness.eop.activity;

import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.liveness.eop.activity.EopLivenessActivity$startLcaLiveness$1$1$onReloadScreenClicked$1;
import com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o.ActivityC38205pQc;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class EopLivenessActivity$startLcaLiveness$1$1$onReloadScreenClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $releaseLca;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC38205pQc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EopLivenessActivity$startLcaLiveness$1$1$onReloadScreenClicked$1(ActivityC38205pQc activityC38205pQc, Function0<Unit> function0, Continuation<? super EopLivenessActivity$startLcaLiveness$1$1$onReloadScreenClicked$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC38205pQc;
        this.$releaseLca = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EopLivenessActivity$startLcaLiveness$1$1$onReloadScreenClicked$1 eopLivenessActivity$startLcaLiveness$1$1$onReloadScreenClicked$1 = new EopLivenessActivity$startLcaLiveness$1$1$onReloadScreenClicked$1(this.this$0, this.$releaseLca, continuation);
        eopLivenessActivity$startLcaLiveness$1$1$onReloadScreenClicked$1.L$0 = obj;
        return eopLivenessActivity$startLcaLiveness$1$1$onReloadScreenClicked$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EopLivenessActivity$startLcaLiveness$1$1$onReloadScreenClicked$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        EopLivenessBasicViewModel eopLivenessBasicViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            if (CoroutineScopeKt.isActive(coroutineScope) && (eopLivenessBasicViewModel = this.this$0.KWHzl) != null) {
                final ActivityC38205pQc activityC38205pQc = this.this$0;
                Function0<Unit> function0 = new Function0() { // from class: o.pQx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return EopLivenessActivity$startLcaLiveness$1$1$onReloadScreenClicked$1.invokeSuspend$lambda$0(coroutineScope, activityC38205pQc);
                    }
                };
                final ActivityC38205pQc activityC38205pQc2 = this.this$0;
                final Function0<Unit> function02 = this.$releaseLca;
                Function1<? super String, Unit> function1 = new Function1() { // from class: o.pQB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return EopLivenessActivity$startLcaLiveness$1$1$onReloadScreenClicked$1.invokeSuspend$lambda$1(activityC38205pQc2, function02, (java.lang.String) obj2);
                    }
                };
                this.label = 1;
                if (eopLivenessBasicViewModel.copydefault(activityC38205pQc, function0, function1, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(CoroutineScope coroutineScope, ActivityC38205pQc activityC38205pQc) {
        EopLivenessBasicViewModel eopLivenessBasicViewModel;
        if (CoroutineScopeKt.isActive(coroutineScope) && (eopLivenessBasicViewModel = activityC38205pQc.KWHzl) != null) {
            eopLivenessBasicViewModel.copydefault(activityC38205pQc.getTAG());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(ActivityC38205pQc activityC38205pQc, Function0 function0, String str) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC38205pQc), null, null, new EopLivenessActivity$startLcaLiveness$1$1$onReloadScreenClicked$1$2$1(str, function0, null), 3, null);
        return Unit.INSTANCE;
    }
}
