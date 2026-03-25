package com.okinc.im.usecase.group.join;

import com.okinc.okimcore.model.remote.GroupJoinApplicationRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.oDN;
import o.sIR;
import o.sOA;

/* JADX INFO: loaded from: classes8.dex */
public final class SubmitJoinRequestUseCase$invoke$result$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super sOA>, Object> {
    final /* synthetic */ GroupJoinApplicationRequest $request;
    final /* synthetic */ oDN $this_runCatching;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitJoinRequestUseCase$invoke$result$1$1(oDN odn, GroupJoinApplicationRequest groupJoinApplicationRequest, Continuation<? super SubmitJoinRequestUseCase$invoke$result$1$1> continuation) {
        super(2, continuation);
        this.$this_runCatching = odn;
        this.$request = groupJoinApplicationRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubmitJoinRequestUseCase$invoke$result$1$1(this.$this_runCatching, this.$request, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super sOA> continuation) {
        return ((SubmitJoinRequestUseCase$invoke$result$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sIR sir = this.$this_runCatching.OLrzqt;
            GroupJoinApplicationRequest groupJoinApplicationRequest = this.$request;
            this.label = 1;
            obj = sir.copydefault(groupJoinApplicationRequest, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
