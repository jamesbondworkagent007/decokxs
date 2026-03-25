package com.okinc.im.usecase.conversation;

import com.okinc.okimcore.model.im.conversation.InAppConversationExtra;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import com.okinc.planet_api.model.LatestMessage;
import com.okinc.planet_api.model.WSMessageData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.oCK;
import o.pUU;
import o.sGI;
import o.tWL;
import o.yHO;

/* JADX INFO: loaded from: classes8.dex */
public final class ObserveOrbitNotificationUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ oCK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObserveOrbitNotificationUseCase$invoke$2(oCK ock, Continuation<? super ObserveOrbitNotificationUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = ock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ObserveOrbitNotificationUseCase$invoke$2 observeOrbitNotificationUseCase$invoke$2 = new ObserveOrbitNotificationUseCase$invoke$2(this.this$0, continuation);
        observeOrbitNotificationUseCase$invoke$2.L$0 = obj;
        return observeOrbitNotificationUseCase$invoke$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ObserveOrbitNotificationUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Flow<WSMessageData> flowGEmmrt;
        Flow flowM7441catch;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            tWL twl = this.this$0.EZpvd;
            if (twl == null || (flowGEmmrt = twl.gEmmrt()) == null || (flowM7441catch = FlowKt.m7441catch(flowGEmmrt, new AnonymousClass1(null))) == null) {
                return null;
            }
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(coroutineScope, this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowM7441catch, anonymousClass2, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.im.usecase.conversation.ObserveOrbitNotificationUseCase$invoke$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements yHO<FlowCollector<? super WSMessageData>, Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHO
        public final Object invoke(FlowCollector<? super WSMessageData> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = th;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.copydefault("ObserveOrbitNotificationUseCase", "Flow error: " + ((Throwable) this.L$0).getMessage());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.im.usecase.conversation.ObserveOrbitNotificationUseCase$invoke$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<WSMessageData, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineScope $$this$withContext;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ oCK this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CoroutineScope coroutineScope, oCK ock, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$$this$withContext = coroutineScope;
            this.this$0 = ock;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$$this$withContext, this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(WSMessageData wSMessageData, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(wSMessageData, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM7377constructorimpl;
            String eventTime;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    WSMessageData wSMessageData = (WSMessageData) this.L$0;
                    Integer totalUnreadCount = wSMessageData.getTotalUnreadCount();
                    LatestMessage latestMsg = wSMessageData.getLatestMsg();
                    String localizedTitle = latestMsg != null ? latestMsg.getLocalizedTitle() : null;
                    pUU.KWHzl("ObserveOrbitNotificationUseCase", "Received orbit notification updates: isLastMsgNull:" + (wSMessageData.getLatestMsg() == null) + ", Unread count:" + totalUnreadCount);
                    oCK ock = this.this$0;
                    Result.Application application = Result.Companion;
                    sGI sgi = ock.copydefault;
                    InHouseIMChannelType inHouseIMChannelType = InHouseIMChannelType.OrbitNotifications;
                    InAppConversationExtra inAppConversationExtra = localizedTitle != null ? new InAppConversationExtra(localizedTitle) : null;
                    LatestMessage latestMsg2 = wSMessageData.getLatestMsg();
                    Long lKWHzl = (latestMsg2 == null || (eventTime = latestMsg2.getEventTime()) == null) ? null : C56443yFo.KWHzl(C33129mqd.valueOf(eventTime));
                    this.label = 1;
                    obj = sgi.copydefault("orbit_updates", inHouseIMChannelType, inAppConversationExtra, lKWHzl, totalUnreadCount, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                objM7377constructorimpl = Result.m7377constructorimpl((InHouseIMConversationEntity) obj);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.copydefault("ObserveOrbitNotificationUseCase", "Failed to store orbit conversation: " + thM7380exceptionOrNullimpl.getMessage());
            }
            return Unit.INSTANCE;
        }
    }
}
