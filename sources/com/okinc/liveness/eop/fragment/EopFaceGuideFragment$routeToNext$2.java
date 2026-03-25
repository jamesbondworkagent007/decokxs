package com.okinc.liveness.eop.fragment;

import android.content.Context;
import com.okinc.liveness.eop.fragment.EopFaceGuideFragment$routeToNext$2;
import com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o.AbstractC45510srQ;
import o.C56391yDq;
import o.C56442yFn;
import o.pQT;

/* JADX INFO: loaded from: classes9.dex */
public final class EopFaceGuideFragment$routeToNext$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC45510srQ $this_routeToNext;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ pQT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EopFaceGuideFragment$routeToNext$2(pQT pqt, AbstractC45510srQ abstractC45510srQ, Continuation<? super EopFaceGuideFragment$routeToNext$2> continuation) {
        super(2, continuation);
        this.this$0 = pqt;
        this.$this_routeToNext = abstractC45510srQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EopFaceGuideFragment$routeToNext$2 eopFaceGuideFragment$routeToNext$2 = new EopFaceGuideFragment$routeToNext$2(this.this$0, this.$this_routeToNext, continuation);
        eopFaceGuideFragment$routeToNext$2.L$0 = obj;
        return eopFaceGuideFragment$routeToNext$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EopFaceGuideFragment$routeToNext$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        EopLivenessBasicViewModel eopLivenessBasicViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (CoroutineScopeKt.isActive((CoroutineScope) this.L$0) && (eopLivenessBasicViewModel = this.this$0.AEQbTJ) != null) {
                Context context = this.this$0.getContext();
                final pQT pqt = this.this$0;
                final AbstractC45510srQ abstractC45510srQ = this.$this_routeToNext;
                Function0 function0 = new Function0() { // from class: o.pRc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return EopFaceGuideFragment$routeToNext$2.invokeSuspend$lambda$0(pqt, abstractC45510srQ);
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
    public static final Unit invokeSuspend$lambda$0(pQT pqt, AbstractC45510srQ abstractC45510srQ) {
        if (pqt.isVisible()) {
            abstractC45510srQ.AEQbTJ.fIwbmz();
        }
        return Unit.INSTANCE;
    }
}
