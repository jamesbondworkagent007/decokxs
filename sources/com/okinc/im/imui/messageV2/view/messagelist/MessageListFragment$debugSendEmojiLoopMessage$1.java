package com.okinc.im.imui.messageV2.view.messagelist;

import androidx.fragment.app.FragmentActivity;
import com.okinc.okimcore.model.im.inhouseim.ws.SendReactionAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.AbstractActivityC33041mov;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class MessageListFragment$debugSendEmojiLoopMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Integer $delayTime;
    final /* synthetic */ Ref.ObjectRef<SendReactionAction> $reactionType;
    int label;
    final /* synthetic */ MessageListFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageListFragment$debugSendEmojiLoopMessage$1(MessageListFragment messageListFragment, Integer num, Ref.ObjectRef<SendReactionAction> objectRef, Continuation<? super MessageListFragment$debugSendEmojiLoopMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = messageListFragment;
        this.$delayTime = num;
        this.$reactionType = objectRef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageListFragment$debugSendEmojiLoopMessage$1(this.this$0, this.$delayTime, this.$reactionType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageListFragment$debugSendEmojiLoopMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jValueOf;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        do {
            FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
            if ((fragmentActivityRequireActivity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivityRequireActivity : null) != null) {
                Ref.ObjectRef<SendReactionAction> objectRef = this.$reactionType;
                SendReactionAction sendReactionAction = objectRef.element;
                SendReactionAction sendReactionAction2 = SendReactionAction.ADD;
                T t = sendReactionAction2;
                if (sendReactionAction == sendReactionAction2) {
                    t = SendReactionAction.REMOVE;
                }
                objectRef.element = t;
            }
            jValueOf = C33129mqd.valueOf(this.$delayTime);
            this.label = 1;
        } while (DelayKt.delay(jValueOf, this) != objCopydefault);
        return objCopydefault;
    }
}
