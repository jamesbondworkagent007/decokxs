package com.okinc.im.imui.group.create.viewmodel;

import com.okinc.im.imui.group.create.viewmodel.CreateGroupViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class InvitePermissionsViewModel$hasChanges$1 extends SuspendLambda implements yHO<CreateGroupViewModel.InvitePermissions, CreateGroupViewModel.InvitePermissions, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvitePermissionsViewModel$hasChanges$1(Continuation<? super InvitePermissionsViewModel$hasChanges$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CreateGroupViewModel.InvitePermissions invitePermissions, CreateGroupViewModel.InvitePermissions invitePermissions2, Continuation<? super Boolean> continuation) {
        InvitePermissionsViewModel$hasChanges$1 invitePermissionsViewModel$hasChanges$1 = new InvitePermissionsViewModel$hasChanges$1(continuation);
        invitePermissionsViewModel$hasChanges$1.L$0 = invitePermissions;
        invitePermissionsViewModel$hasChanges$1.L$1 = invitePermissions2;
        return invitePermissionsViewModel$hasChanges$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return C56443yFo.KWHzl(!Intrinsics.EZpvd((CreateGroupViewModel.InvitePermissions) this.L$0, (CreateGroupViewModel.InvitePermissions) this.L$1));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
