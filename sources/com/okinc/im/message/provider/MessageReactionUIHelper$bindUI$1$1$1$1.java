package com.okinc.im.message.provider;

import com.okinc.im.view.MessageReaction;
import com.okinc.okimcore.model.im.ReactionAction;
import com.okinc.okimcore.model.im.inhouseim.ws.ReactionDisplay;
import com.okinc.okimcore.model.im.inhouseim.ws.SendReactionAction;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionData;
import com.okinc.rxutils.RxBus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35250nrl;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class MessageReactionUIHelper$bindUI$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ long $messageSeq;
    final /* synthetic */ MessageReaction $reaction;
    final /* synthetic */ List<ReactionDisplay> $reactionDisplay;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageReactionUIHelper$bindUI$1$1$1$1(MessageReaction messageReaction, String str, long j, List<ReactionDisplay> list, Continuation<? super MessageReactionUIHelper$bindUI$1$1$1$1> continuation) {
        super(2, continuation);
        this.$reaction = messageReaction;
        this.$channelId = str;
        this.$messageSeq = j;
        this.$reactionDisplay = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageReactionUIHelper$bindUI$1$1$1$1(this.$reaction, this.$channelId, this.$messageSeq, this.$reactionDisplay, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageReactionUIHelper$bindUI$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$reaction.isUserReacted()) {
                RxBus.AEQbTJ(new C35250nrl(new WSSendReactionData(this.$channelId, this.$messageSeq, C56402yEa.EZpvd(new ReactionAction(this.$reaction.getEmoji(), SendReactionAction.REMOVE)))));
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = this.$reactionDisplay.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((ReactionDisplay) next).isCurrentUserReaction()) {
                        break;
                    }
                }
                ReactionDisplay reactionDisplay = (ReactionDisplay) next;
                if (reactionDisplay != null) {
                    arrayList.add(new ReactionAction(reactionDisplay.getEmoji(), SendReactionAction.REMOVE));
                }
                arrayList.add(new ReactionAction(this.$reaction.getEmoji(), SendReactionAction.ADD));
                RxBus.AEQbTJ(new C35250nrl(new WSSendReactionData(this.$channelId, this.$messageSeq, arrayList)));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
