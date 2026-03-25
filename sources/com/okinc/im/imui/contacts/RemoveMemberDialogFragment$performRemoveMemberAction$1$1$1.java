package com.okinc.im.imui.contacts;

import com.okinc.okimcore.model.other.GroupInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.sIR;

/* JADX INFO: loaded from: classes8.dex */
public final class RemoveMemberDialogFragment$performRemoveMemberAction$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ GroupInfo $groupInfo;
    final /* synthetic */ List<String> $ids;
    final /* synthetic */ InterfaceC35180nqU $okimService;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoveMemberDialogFragment$performRemoveMemberAction$1$1$1(InterfaceC35180nqU interfaceC35180nqU, GroupInfo groupInfo, List<String> list, Continuation<? super RemoveMemberDialogFragment$performRemoveMemberAction$1$1$1> continuation) {
        super(1, continuation);
        this.$okimService = interfaceC35180nqU;
        this.$groupInfo = groupInfo;
        this.$ids = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new RemoveMemberDialogFragment$performRemoveMemberAction$1$1$1(this.$okimService, this.$groupInfo, this.$ids, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((RemoveMemberDialogFragment$performRemoveMemberAction$1$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sIR sirCopydefault = this.$okimService.AEQbTJ().copydefault();
            String groupId = this.$groupInfo.getGroupId();
            List<String> list = this.$ids;
            this.label = 1;
            if (sirCopydefault.KWHzl(groupId, list, this) == objCopydefault) {
                return objCopydefault;
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
