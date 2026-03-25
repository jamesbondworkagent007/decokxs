package com.okinc.auth.impl.passkey.ui.rename;

import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AbstractActivityC33041mov;
import o.C56391yDq;
import o.C56442yFn;
import o.C6403aOg;

/* JADX INFO: loaded from: classes14.dex */
public final class SecurityFido2RenameBottomFragment$onViewCreated$1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ C6403aOg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityFido2RenameBottomFragment$onViewCreated$1(C6403aOg c6403aOg, Continuation<? super SecurityFido2RenameBottomFragment$onViewCreated$1> continuation) {
        super(2, continuation);
        this.this$0 = c6403aOg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SecurityFido2RenameBottomFragment$onViewCreated$1 securityFido2RenameBottomFragment$onViewCreated$1 = new SecurityFido2RenameBottomFragment$onViewCreated$1(this.this$0, continuation);
        securityFido2RenameBottomFragment$onViewCreated$1.Z$0 = ((Boolean) obj).booleanValue();
        return securityFido2RenameBottomFragment$onViewCreated$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
        return ((SecurityFido2RenameBottomFragment$onViewCreated$1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractActivityC33041mov abstractActivityC33041mov;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.Z$0) {
                FragmentActivity activity = this.this$0.getActivity();
                abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
                if (abstractActivityC33041mov != null) {
                    abstractActivityC33041mov.showLoadingAtOnce();
                }
            } else {
                FragmentActivity activity2 = this.this$0.getActivity();
                abstractActivityC33041mov = activity2 instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity2 : null;
                if (abstractActivityC33041mov != null) {
                    abstractActivityC33041mov.releaseLoading();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
