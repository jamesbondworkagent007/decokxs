package com.okinc.im.imui.group.join.viewmodel;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.oDL;

/* JADX INFO: loaded from: classes8.dex */
public final class JoinGroupViewModel$refreshInviteInfo$1$asyncResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super oDL.ActionBar>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ JoinGroupViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinGroupViewModel$refreshInviteInfo$1$asyncResult$1(JoinGroupViewModel joinGroupViewModel, Continuation<? super JoinGroupViewModel$refreshInviteInfo$1$asyncResult$1> continuation) {
        super(2, continuation);
        this.this$0 = joinGroupViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        JoinGroupViewModel$refreshInviteInfo$1$asyncResult$1 joinGroupViewModel$refreshInviteInfo$1$asyncResult$1 = new JoinGroupViewModel$refreshInviteInfo$1$asyncResult$1(this.this$0, continuation);
        joinGroupViewModel$refreshInviteInfo$1$asyncResult$1.L$0 = obj;
        return joinGroupViewModel$refreshInviteInfo$1$asyncResult$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super oDL.ActionBar> continuation) {
        return ((JoinGroupViewModel$refreshInviteInfo$1$asyncResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                JoinGroupViewModel joinGroupViewModel = this.this$0;
                Result.Application application = Result.Companion;
                oDL odl = joinGroupViewModel.getNewProxyInstance;
                String strDjBIcL = joinGroupViewModel.djBIcL();
                this.label = 1;
                obj = odl.copydefault(strDjBIcL, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((oDL.ActionBar) obj);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            return null;
        }
        return objM7377constructorimpl;
    }
}
