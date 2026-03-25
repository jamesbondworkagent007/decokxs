package com.okinc.liveness.eop.fragment;

import com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes9.dex */
public final class EopAwsFaceLivenessFragment$onCreateView$1$1$1$1$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EopLivenessBasicViewModel $eopLivenessBasicViewModel;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EopAwsFaceLivenessFragment$onCreateView$1$1$1$1$1$2(EopLivenessBasicViewModel eopLivenessBasicViewModel, Continuation<? super EopAwsFaceLivenessFragment$onCreateView$1$1$1$1$1$2> continuation) {
        super(2, continuation);
        this.$eopLivenessBasicViewModel = eopLivenessBasicViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EopAwsFaceLivenessFragment$onCreateView$1$1$1$1$1$2 eopAwsFaceLivenessFragment$onCreateView$1$1$1$1$1$2 = new EopAwsFaceLivenessFragment$onCreateView$1$1$1$1$1$2(this.$eopLivenessBasicViewModel, continuation);
        eopAwsFaceLivenessFragment$onCreateView$1$1$1$1$1$2.L$0 = obj;
        return eopAwsFaceLivenessFragment$onCreateView$1$1$1$1$1$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EopAwsFaceLivenessFragment$onCreateView$1$1$1$1$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (CoroutineScopeKt.isActive((CoroutineScope) this.L$0)) {
                EopLivenessBasicViewModel eopLivenessBasicViewModel = this.$eopLivenessBasicViewModel;
                this.label = 1;
                if (EopLivenessBasicViewModel.getLivenessSessionResult$default(eopLivenessBasicViewModel, null, null, this, 3, null) == objCopydefault) {
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
}
