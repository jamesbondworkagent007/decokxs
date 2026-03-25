package com.okinc.im.usecase.message;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.usecase.message.SendReactionMessageUseCase$execute$2;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.ReactionAction;
import com.okinc.okimcore.model.im.inhouseim.ws.SendReactionAction;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendReactionData;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C32866mlf;
import o.C35771oDb;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44295sKn;
import o.oEE;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class SendReactionMessageUseCase$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<OKMessage, Throwable, Unit> $onError;
    final /* synthetic */ Function0<Unit> $onStart;
    final /* synthetic */ WSSendReactionData $request;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ oEE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.okimcore.model.im.OKMessage, ? super java.lang.Throwable, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SendReactionMessageUseCase$execute$2(WSSendReactionData wSSendReactionData, oEE oee, Function2<? super OKMessage, ? super Throwable, Unit> function2, Function0<Unit> function0, Continuation<? super SendReactionMessageUseCase$execute$2> continuation) {
        super(2, continuation);
        this.$request = wSSendReactionData;
        this.this$0 = oee;
        this.$onError = function2;
        this.$onStart = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SendReactionMessageUseCase$execute$2(this.$request, this.this$0, this.$onError, this.$onStart, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SendReactionMessageUseCase$execute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        Object next;
        ReactionAction reactionAction;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        String str = "";
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            Iterator<T> it = this.$request.getEmojiActions().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ReactionAction) next).getAction() == SendReactionAction.ADD) {
                    break;
                }
            }
            ReactionAction reactionAction2 = (ReactionAction) next;
            if (reactionAction2 != null) {
                C35771oDb c35771oDb = this.this$0.copydefault;
                String emoji = reactionAction2.getEmoji();
                if (emoji == null) {
                    emoji = "";
                }
                this.L$0 = objectRef;
                this.L$1 = reactionAction2;
                this.label = 1;
                if (c35771oDb.KWHzl(emoji, this) == objCopydefault) {
                    return objCopydefault;
                }
                reactionAction = reactionAction2;
            }
            this.this$0.AEQbTJ.OLrzqt(this.$request, new AnonymousClass3(objectRef, this.$onError, this.$onStart));
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        reactionAction = (ReactionAction) this.L$1;
        objectRef = (Ref.ObjectRef) this.L$0;
        C56391yDq.AEQbTJ(obj);
        String emoji2 = reactionAction.getEmoji();
        T t = str;
        if (emoji2 != null) {
            t = emoji2;
        }
        objectRef.element = t;
        this.this$0.AEQbTJ.OLrzqt(this.$request, new AnonymousClass3(objectRef, this.$onError, this.$onStart));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.im.usecase.message.SendReactionMessageUseCase$execute$2$3, reason: invalid class name */
    public static final class AnonymousClass3 implements InterfaceC44295sKn {
        public final /* synthetic */ Function0<Unit> KWHzl;
        public final /* synthetic */ Function2<OKMessage, Throwable, Unit> OLrzqt;
        public final /* synthetic */ Ref.ObjectRef<String> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC44289sKh
        public void copydefault(OKMessage oKMessage) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.okimcore.model.im.OKMessage, ? super java.lang.Throwable, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Ref.ObjectRef<String> objectRef, Function2<? super OKMessage, ? super Throwable, Unit> function2, Function0<Unit> function0) {
            this.copydefault = objectRef;
            this.OLrzqt = function2;
            this.KWHzl = function0;
        }

        @Override // o.InterfaceC44289sKh
        public void AEQbTJ(OKMessage oKMessage) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            pUU.KWHzl("SendReactionMessageUseCase", "send reaction success " + oKMessage);
            if (!StringsKt__StringsKt.fARcdN((CharSequence) this.copydefault.element)) {
                final Ref.ObjectRef<String> objectRef = this.copydefault;
                C32866mlf.onEvent$default("IMChat_Message_Reaction_Click\n", (TrackChannel[]) null, new Function1() { // from class: o.oEC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return SendReactionMessageUseCase$execute$2.AnonymousClass3.copydefault(objectRef, (EventParamsList) obj);
                    }
                }, 1, (Object) null);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit copydefault(Ref.ObjectRef objectRef, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "emoji", (String) objectRef.element, false, 4, null);
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC44289sKh
        public void OLrzqt(OKMessage oKMessage, Throwable th) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            Intrinsics.checkNotNullParameter(th, "");
            pUU.copydefault("SendReactionMessageUseCase", "send reaction error " + th.getMessage());
            this.OLrzqt.invoke(oKMessage, th);
        }

        @Override // o.InterfaceC44295sKn
        public void OLrzqt() {
            pUU.KWHzl("SendReactionMessageUseCase", "send reaction start ");
            this.KWHzl.invoke();
        }
    }
}
