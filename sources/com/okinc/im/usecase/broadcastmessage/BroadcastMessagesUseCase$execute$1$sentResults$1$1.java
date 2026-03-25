package com.okinc.im.usecase.broadcastmessage;

import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.okimcore.model.im.OKMessage;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.channels.ProducerScope;
import o.AbstractC35761oCs;
import o.C35760oCr;
import o.C35762oCt;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;

/* JADX INFO: loaded from: classes23.dex */
public final class BroadcastMessagesUseCase$execute$1$sentResults$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Deferred<? extends Result<? extends OKMessage>>>, Object> {
    final /* synthetic */ ProducerScope<List<? extends AbstractC35761oCs>> $$this$channelFlow;
    final /* synthetic */ SendMessageRequestParam $param;
    final /* synthetic */ OKMessage $pendingMessage;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35762oCt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlinx.coroutines.channels.ProducerScope<? super java.util.List<? extends o.oCs>> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BroadcastMessagesUseCase$execute$1$sentResults$1$1(C35762oCt c35762oCt, OKMessage oKMessage, SendMessageRequestParam sendMessageRequestParam, ProducerScope<? super List<? extends AbstractC35761oCs>> producerScope, Continuation<? super BroadcastMessagesUseCase$execute$1$sentResults$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c35762oCt;
        this.$pendingMessage = oKMessage;
        this.$param = sendMessageRequestParam;
        this.$$this$channelFlow = producerScope;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BroadcastMessagesUseCase$execute$1$sentResults$1$1 broadcastMessagesUseCase$execute$1$sentResults$1$1 = new BroadcastMessagesUseCase$execute$1$sentResults$1$1(this.this$0, this.$pendingMessage, this.$param, this.$$this$channelFlow, continuation);
        broadcastMessagesUseCase$execute$1$sentResults$1$1.L$0 = obj;
        return broadcastMessagesUseCase$execute$1$sentResults$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Deferred<? extends Result<? extends OKMessage>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Deferred<Result<OKMessage>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Deferred<Result<OKMessage>>> continuation) {
        return ((BroadcastMessagesUseCase$execute$1$sentResults$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.im.usecase.broadcastmessage.BroadcastMessagesUseCase$execute$1$sentResults$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends OKMessage>>, Object> {
        final /* synthetic */ ProducerScope<List<? extends AbstractC35761oCs>> $$this$channelFlow;
        final /* synthetic */ SendMessageRequestParam $param;
        final /* synthetic */ OKMessage $pendingMessage;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C35762oCt this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlinx.coroutines.channels.ProducerScope<? super java.util.List<? extends o.oCs>> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(C35762oCt c35762oCt, OKMessage oKMessage, SendMessageRequestParam sendMessageRequestParam, ProducerScope<? super List<? extends AbstractC35761oCs>> producerScope, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c35762oCt;
            this.$pendingMessage = oKMessage;
            this.$param = sendMessageRequestParam;
            this.$$this$channelFlow = producerScope;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$pendingMessage, this.$param, this.$$this$channelFlow, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends OKMessage>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Result<OKMessage>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<OKMessage>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM7377constructorimpl;
            Throwable thM7380exceptionOrNullimpl;
            Object objKWHzl;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C35762oCt c35762oCt = this.this$0;
                OKMessage oKMessage = this.$pendingMessage;
                SendMessageRequestParam sendMessageRequestParam = this.$param;
                Result.Application application2 = Result.Companion;
                C35760oCr c35760oCr = c35762oCt.copydefault;
                this.label = 1;
                objKWHzl = c35760oCr.KWHzl(oKMessage, sendMessageRequestParam, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        objM7377constructorimpl = this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        return Result.m7376boximpl(objM7377constructorimpl);
                    }
                    objM7377constructorimpl = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    OKMessage oKMessage2 = this.$pendingMessage;
                    ProducerScope<List<? extends AbstractC35761oCs>> producerScope = this.$$this$channelFlow;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        List<? extends AbstractC35761oCs> listEZpvd = C56402yEa.EZpvd(new AbstractC35761oCs.StateListAnimator(oKMessage2.copy((262143 & 1) != 0 ? oKMessage2.seq : 0L, (262143 & 2) != 0 ? oKMessage2.clientMessageId : null, (262143 & 4) != 0 ? oKMessage2.targetId : null, (262143 & 8) != 0 ? oKMessage2.senderUserId : null, (262143 & 16) != 0 ? oKMessage2.messageType : null, (262143 & 32) != 0 ? oKMessage2.conversationType : null, (262143 & 64) != 0 ? oKMessage2.sentTime : 0L, (262143 & 128) != 0 ? oKMessage2.receivedTime : 0L, (262143 & 256) != 0 ? oKMessage2.extra : null, (262143 & 512) != 0 ? oKMessage2.objectName : null, (262143 & 1024) != 0 ? oKMessage2.messageDirection : null, (262143 & 2048) != 0 ? oKMessage2.sentStatus : OKMessage.SentStatus.FAILED, (262143 & 4096) != 0 ? oKMessage2.content : null, (262143 & 8192) != 0 ? oKMessage2.messagePushConfig : null, (262143 & 16384) != 0 ? oKMessage2.sourceJsonString : null, (262143 & 32768) != 0 ? oKMessage2.isVisible : false, (262143 & 65536) != 0 ? oKMessage2.error : null, (262143 & 131072) != 0 ? oKMessage2.reactionDisplay : null), thM7380exceptionOrNullimpl));
                        this.L$0 = objM7377constructorimpl;
                        this.label = 3;
                        if (producerScope.send(listEZpvd, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                C56391yDq.AEQbTJ(obj);
                objKWHzl = obj;
            }
            objM7377constructorimpl = Result.m7377constructorimpl((OKMessage) objKWHzl);
            ProducerScope<List<? extends AbstractC35761oCs>> producerScope2 = this.$$this$channelFlow;
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                List<? extends AbstractC35761oCs> listEZpvd2 = C56402yEa.EZpvd(new AbstractC35761oCs.Application((OKMessage) objM7377constructorimpl));
                this.L$0 = objM7377constructorimpl;
                this.label = 2;
                if (producerScope2.send(listEZpvd2, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            OKMessage oKMessage22 = this.$pendingMessage;
            ProducerScope<List<? extends AbstractC35761oCs>> producerScope3 = this.$$this$channelFlow;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return Result.m7376boximpl(objM7377constructorimpl);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, this.this$0.EZpvd, null, new AnonymousClass1(this.this$0, this.$pendingMessage, this.$param, this.$$this$channelFlow, null), 2, null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
