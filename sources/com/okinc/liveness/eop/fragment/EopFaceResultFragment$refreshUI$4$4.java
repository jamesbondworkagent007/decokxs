package com.okinc.liveness.eop.fragment;

import android.content.Context;
import com.okinc.liveness.eop.fragment.EopFaceResultFragment$refreshUI$4$4;
import com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o.C38231pRb;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes9.dex */
public final class EopFaceResultFragment$refreshUI$4$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C38231pRb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EopFaceResultFragment$refreshUI$4$4(C38231pRb c38231pRb, Continuation<? super EopFaceResultFragment$refreshUI$4$4> continuation) {
        super(2, continuation);
        this.this$0 = c38231pRb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EopFaceResultFragment$refreshUI$4$4 eopFaceResultFragment$refreshUI$4$4 = new EopFaceResultFragment$refreshUI$4$4(this.this$0, continuation);
        eopFaceResultFragment$refreshUI$4$4.L$0 = obj;
        return eopFaceResultFragment$refreshUI$4$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EopFaceResultFragment$refreshUI$4$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        EopLivenessBasicViewModel eopLivenessBasicViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (CoroutineScopeKt.isActive((CoroutineScope) this.L$0) && (eopLivenessBasicViewModel = this.this$0.copydefault) != null) {
                Context context = this.this$0.getContext();
                final C38231pRb c38231pRb = this.this$0;
                Function0 function0 = new Function0() { // from class: o.pRx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return EopFaceResultFragment$refreshUI$4$4.invokeSuspend$lambda$0(c38231pRb);
                    }
                };
                this.label = 1;
                if (EopLivenessBasicViewModel.getLivenessRouter$default(eopLivenessBasicViewModel, context, function0, null, this, 4, null) == objCopydefault) {
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
    public static final Unit invokeSuspend$lambda$0(C38231pRb c38231pRb) {
        C52794wYp c52794wYp = c38231pRb.AEQbTJ;
        if (c52794wYp == null) {
            Intrinsics.gEmmrt("");
            c52794wYp = null;
        }
        c52794wYp.fIwbmz();
        return Unit.INSTANCE;
    }
}
