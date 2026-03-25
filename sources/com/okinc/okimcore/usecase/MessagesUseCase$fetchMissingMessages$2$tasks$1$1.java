package com.okinc.okimcore.usecase;

import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMMessageListSequenceQuery;
import com.okinc.okimcore.model.im.inhouseim.ws.WSGetMsgBySeqList;
import com.okinc.okimcore.model.im.inhouseim.ws.WSMessageListResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44489sRs;
import o.C44502sSe;
import o.C56391yDq;
import o.C56442yFn;
import o.sSK;

/* JADX INFO: loaded from: classes10.dex */
public final class MessagesUseCase$fetchMissingMessages$2$tasks$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super WSMessageListResponse>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ List<Long> $chunk;
    int label;
    final /* synthetic */ C44502sSe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesUseCase$fetchMissingMessages$2$tasks$1$1(C44502sSe c44502sSe, String str, List<Long> list, Continuation<? super MessagesUseCase$fetchMissingMessages$2$tasks$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c44502sSe;
        this.$channelId = str;
        this.$chunk = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MessagesUseCase$fetchMissingMessages$2$tasks$1$1(this.this$0, this.$channelId, this.$chunk, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super WSMessageListResponse> continuation) {
        return ((MessagesUseCase$fetchMissingMessages$2$tasks$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.okimcore.usecase.MessagesUseCase$fetchMissingMessages$2$tasks$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super WSMessageListResponse>, Object> {
        final /* synthetic */ String $channelId;
        final /* synthetic */ List<Long> $chunk;
        int label;
        final /* synthetic */ C44502sSe this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C44502sSe c44502sSe, String str, List<Long> list, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = c44502sSe;
            this.$channelId = str;
            this.$chunk = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$channelId, this.$chunk, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super WSMessageListResponse> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C44489sRs c44489sRs = this.this$0.fARcdN;
                WSGetMsgBySeqList wSGetMsgBySeqList = new WSGetMsgBySeqList(new InHouseIMMessageListSequenceQuery(this.$channelId, this.$chunk));
                this.label = 1;
                obj = c44489sRs.copydefault(wSGetMsgBySeqList, (Continuation<? super WSMessageListResponse>) this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return obj;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            sSK ssk = this.this$0.fetchVPNInfo;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$channelId, this.$chunk, null);
            this.label = 1;
            obj = ssk.KWHzl(3, anonymousClass1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
