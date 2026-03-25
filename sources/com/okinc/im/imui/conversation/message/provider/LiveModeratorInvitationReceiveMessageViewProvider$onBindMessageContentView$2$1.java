package com.okinc.im.imui.conversation.message.provider;

import android.content.Context;
import com.okinc.okimcore.model.im.OKLiveModeratorInvitationMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C52794wYp;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44531sTi;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveModeratorInvitationReceiveMessageViewProvider$onBindMessageContentView$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C52794wYp $btn;
    final /* synthetic */ OKLiveModeratorInvitationMessage $content;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveModeratorInvitationReceiveMessageViewProvider$onBindMessageContentView$2$1(C52794wYp c52794wYp, OKLiveModeratorInvitationMessage oKLiveModeratorInvitationMessage, Continuation<? super LiveModeratorInvitationReceiveMessageViewProvider$onBindMessageContentView$2$1> continuation) {
        super(2, continuation);
        this.$btn = c52794wYp;
        this.$content = oKLiveModeratorInvitationMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiveModeratorInvitationReceiveMessageViewProvider$onBindMessageContentView$2$1(this.$btn, this.$content, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiveModeratorInvitationReceiveMessageViewProvider$onBindMessageContentView$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC44531sTi interfaceC44531sTi = (InterfaceC44531sTi) C43251rlk.OLrzqt(InterfaceC44531sTi.class);
            if (interfaceC44531sTi != null) {
                Context context = this.$btn.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                String shareCode = this.$content.getShareCode();
                String str = shareCode != null ? shareCode : "";
                this.label = 1;
                if (interfaceC44531sTi.OLrzqt(context, str, this) == objCopydefault) {
                    return objCopydefault;
                }
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
