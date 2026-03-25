package com.okinc.im.imui.messageinfo;

import com.okinc.im.message.MessageClusterType;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.SupervisorKt;
import o.C35254nrp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class MessageInfoViewModel$load$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ long $messageSeq;
    final /* synthetic */ MessageClusterType $previewClusterType;
    int label;
    final /* synthetic */ MessageInfoViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageInfoViewModel$load$1(MessageInfoViewModel messageInfoViewModel, String str, long j, MessageClusterType messageClusterType, Continuation<? super MessageInfoViewModel$load$1> continuation) {
        super(2, continuation);
        this.this$0 = messageInfoViewModel;
        this.$channelId = str;
        this.$messageSeq = j;
        this.$previewClusterType = messageClusterType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessageInfoViewModel$load$1(this.this$0, this.$channelId, this.$messageSeq, this.$previewClusterType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MessageInfoViewModel$load$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.messageinfo.MessageInfoViewModel$load$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $channelId;
        final /* synthetic */ long $messageSeq;
        final /* synthetic */ MessageClusterType $previewClusterType;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ MessageInfoViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MessageInfoViewModel messageInfoViewModel, String str, long j, MessageClusterType messageClusterType, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = messageInfoViewModel;
            this.$channelId = str;
            this.$messageSeq = j;
            this.$previewClusterType = messageClusterType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$channelId, this.$messageSeq, this.$previewClusterType, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00aa A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineScope coroutineScope;
            OKMessage oKMessage;
            OKConversation oKConversation;
            OKConversationType oKConversationType;
            MessageInfoViewModel messageInfoViewModel;
            String str;
            long j;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                MessageInfoViewModel messageInfoViewModel2 = this.this$0;
                String str2 = this.$channelId;
                long j2 = this.$messageSeq;
                this.L$0 = coroutineScope;
                this.label = 1;
                obj = messageInfoViewModel2.copydefault(str2, j2, (Continuation<? super Pair<OKConversation, OKMessage>>) this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    oKConversationType = (OKConversationType) this.L$2;
                    OKMessage oKMessage2 = (OKMessage) this.L$1;
                    OKConversation oKConversation2 = (OKConversation) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    oKMessage = oKMessage2;
                    oKConversation = oKConversation2;
                    this.this$0.EZpvd(this.$channelId, this.$messageSeq, oKConversationType, oKMessage, (C35254nrp) obj);
                    messageInfoViewModel = this.this$0;
                    str = this.$channelId;
                    j = this.$messageSeq;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    if (messageInfoViewModel.AEQbTJ(oKConversationType, str, j, oKConversation, oKMessage, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                coroutineScope = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            Pair pair = (Pair) obj;
            OKConversation oKConversation3 = (OKConversation) pair.component1();
            OKMessage oKMessage3 = (OKMessage) pair.component2();
            OKConversationType oKConversationTypeCopydefault = this.this$0.copydefault(oKConversation3, oKMessage3);
            this.this$0.KWHzl(coroutineScope, oKConversationTypeCopydefault, this.$channelId);
            MessageInfoViewModel messageInfoViewModel3 = this.this$0;
            MessageClusterType messageClusterType = this.$previewClusterType;
            this.L$0 = oKConversation3;
            this.L$1 = oKMessage3;
            this.L$2 = oKConversationTypeCopydefault;
            this.label = 2;
            Object objAEQbTJ = messageInfoViewModel3.AEQbTJ(oKMessage3, messageClusterType, (Continuation<? super C35254nrp>) this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            oKMessage = oKMessage3;
            obj = objAEQbTJ;
            oKConversation = oKConversation3;
            oKConversationType = oKConversationTypeCopydefault;
            this.this$0.EZpvd(this.$channelId, this.$messageSeq, oKConversationType, oKMessage, (C35254nrp) obj);
            messageInfoViewModel = this.this$0;
            str = this.$channelId;
            j = this.$messageSeq;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 3;
            if (messageInfoViewModel.AEQbTJ(oKConversationType, str, j, oKConversation, oKMessage, this) == objCopydefault) {
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$channelId, this.$messageSeq, this.$previewClusterType, null);
            this.label = 1;
            if (SupervisorKt.supervisorScope(anonymousClass1, this) == objCopydefault) {
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
