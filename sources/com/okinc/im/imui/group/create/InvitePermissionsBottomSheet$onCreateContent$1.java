package com.okinc.im.imui.group.create;

import com.okinc.im.imui.group.create.viewmodel.CreateGroupViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import o.C34097nRh;
import o.C56391yDq;
import o.C56442yFn;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class InvitePermissionsBottomSheet$onCreateContent$1 extends SuspendLambda implements yHO<CoroutineScope, CreateGroupViewModel.InvitePermissions, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C34097nRh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvitePermissionsBottomSheet$onCreateContent$1(C34097nRh c34097nRh, Continuation<? super InvitePermissionsBottomSheet$onCreateContent$1> continuation) {
        super(3, continuation);
        this.this$0 = c34097nRh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, CreateGroupViewModel.InvitePermissions invitePermissions, Continuation<? super Unit> continuation) {
        InvitePermissionsBottomSheet$onCreateContent$1 invitePermissionsBottomSheet$onCreateContent$1 = new InvitePermissionsBottomSheet$onCreateContent$1(this.this$0, continuation);
        invitePermissionsBottomSheet$onCreateContent$1.L$0 = invitePermissions;
        return invitePermissionsBottomSheet$onCreateContent$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.KWHzl((CreateGroupViewModel.InvitePermissions) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
