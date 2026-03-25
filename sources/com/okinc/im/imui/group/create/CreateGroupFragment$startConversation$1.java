package com.okinc.im.imui.group.create;

import android.content.Context;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33764nEz;
import o.C56391yDq;
import o.C56442yFn;
import o.nQQ;

/* JADX INFO: loaded from: classes16.dex */
public final class CreateGroupFragment$startConversation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OKConversation $conversation;
    final /* synthetic */ GroupInfo $groupInfo;
    int label;
    final /* synthetic */ nQQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateGroupFragment$startConversation$1(nQQ nqq, GroupInfo groupInfo, OKConversation oKConversation, Continuation<? super CreateGroupFragment$startConversation$1> continuation) {
        super(2, continuation);
        this.this$0 = nqq;
        this.$groupInfo = groupInfo;
        this.$conversation = oKConversation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateGroupFragment$startConversation$1(this.this$0, this.$groupInfo, this.$conversation, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateGroupFragment$startConversation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C33764nEz c33764nEz = C33764nEz.OLrzqt;
            Context contextRequireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            String groupId = this.$groupInfo.getGroupId();
            OKConversation oKConversation = this.$conversation;
            this.label = 1;
            if (c33764nEz.KWHzl(contextRequireContext, (22 & 2) != 0 ? null : null, (22 & 4) != 0 ? null : null, (22 & 8) != 0 ? null : groupId, (22 & 16) != 0 ? null : null, oKConversation, this) == objCopydefault) {
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
