package com.okinc.liveness.eop.fragment;

import com.amplifyframework.ui.liveness.model.FaceLivenessDetectionException;
import com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o.C56391yDq;
import o.C56442yFn;
import o.pQD;

/* JADX INFO: loaded from: classes9.dex */
public final class EopAwsFaceLivenessFragment$onCreateView$1$1$1$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EopLivenessBasicViewModel $eopLivenessBasicViewModel;
    final /* synthetic */ FaceLivenessDetectionException $error;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ pQD this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EopAwsFaceLivenessFragment$onCreateView$1$1$1$2$1$1(FaceLivenessDetectionException faceLivenessDetectionException, pQD pqd, EopLivenessBasicViewModel eopLivenessBasicViewModel, Continuation<? super EopAwsFaceLivenessFragment$onCreateView$1$1$1$2$1$1> continuation) {
        super(2, continuation);
        this.$error = faceLivenessDetectionException;
        this.this$0 = pqd;
        this.$eopLivenessBasicViewModel = eopLivenessBasicViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EopAwsFaceLivenessFragment$onCreateView$1$1$1$2$1$1 eopAwsFaceLivenessFragment$onCreateView$1$1$1$2$1$1 = new EopAwsFaceLivenessFragment$onCreateView$1$1$1$2$1$1(this.$error, this.this$0, this.$eopLivenessBasicViewModel, continuation);
        eopAwsFaceLivenessFragment$onCreateView$1$1$1$2$1$1.L$0 = obj;
        return eopAwsFaceLivenessFragment$onCreateView$1$1$1$2$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EopAwsFaceLivenessFragment$onCreateView$1$1$1$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String simpleName;
        String message;
        Throwable cause;
        Throwable cause2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (CoroutineScopeKt.isActive((CoroutineScope) this.L$0)) {
                if (this.$error.getThrowable() == null) {
                    simpleName = this.$error.getClass().getSimpleName();
                    message = this.$error.getMessage();
                } else {
                    Throwable throwable = this.$error.getThrowable();
                    simpleName = (throwable == null || (cause2 = throwable.getCause()) == null) ? null : cause2.getClass().getSimpleName();
                    Throwable throwable2 = this.$error.getThrowable();
                    String message2 = (throwable2 == null || (cause = throwable2.getCause()) == null) ? null : cause.getMessage();
                    if (simpleName == null) {
                        Throwable throwable3 = this.$error.getThrowable();
                        simpleName = throwable3 != null ? throwable3.getClass().getSimpleName() : null;
                        message = this.$error.getMessage();
                    } else {
                        message = message2;
                    }
                }
                if (Intrinsics.EZpvd((Object) simpleName, (Object) "ProtocolException")) {
                    this.this$0.OLrzqt(message + "}");
                }
                EopLivenessBasicViewModel eopLivenessBasicViewModel = this.$eopLivenessBasicViewModel;
                String str = "{\"classifyCode\":\"" + simpleName + "\",\"errorMsg\":\"" + message + "\"}";
                this.label = 1;
                if (eopLivenessBasicViewModel.OLrzqt(str, this) == objCopydefault) {
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
