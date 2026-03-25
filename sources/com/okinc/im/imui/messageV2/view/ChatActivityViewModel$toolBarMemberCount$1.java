package com.okinc.im.imui.messageV2.view;

import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class ChatActivityViewModel$toolBarMemberCount$1 extends SuspendLambda implements yHO<GroupInfo, Boolean, Continuation<? super Integer>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChatActivityViewModel$toolBarMemberCount$1(Continuation<? super ChatActivityViewModel$toolBarMemberCount$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(GroupInfo groupInfo, boolean z, Continuation<? super Integer> continuation) {
        ChatActivityViewModel$toolBarMemberCount$1 chatActivityViewModel$toolBarMemberCount$1 = new ChatActivityViewModel$toolBarMemberCount$1(continuation);
        chatActivityViewModel$toolBarMemberCount$1.L$0 = groupInfo;
        chatActivityViewModel$toolBarMemberCount$1.Z$0 = z;
        return chatActivityViewModel$toolBarMemberCount$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* synthetic */ Object invoke(GroupInfo groupInfo, Boolean bool, Continuation<? super Integer> continuation) {
        return invoke(groupInfo, bool.booleanValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            GroupInfo groupInfo = (GroupInfo) this.L$0;
            if (this.Z$0 || groupInfo == null) {
                return null;
            }
            return C56443yFo.AEQbTJ(groupInfo.getGroupCount());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
