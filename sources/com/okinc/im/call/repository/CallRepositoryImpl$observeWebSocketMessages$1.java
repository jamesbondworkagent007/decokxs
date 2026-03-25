package com.okinc.im.call.repository;

import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC35238nrZ;
import o.C35235nrW;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56524yIo;

/* JADX INFO: loaded from: classes8.dex */
public final class CallRepositoryImpl$observeWebSocketMessages$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C35235nrW this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallRepositoryImpl$observeWebSocketMessages$1(C35235nrW c35235nrW, Continuation<? super CallRepositoryImpl$observeWebSocketMessages$1> continuation) {
        super(2, continuation);
        this.this$0 = c35235nrW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CallRepositoryImpl$observeWebSocketMessages$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CallRepositoryImpl$observeWebSocketMessages$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.KWHzl("observeWebSocketMessages: Starting WebSocket message observation");
            StateFlow<List<InHouseIMMessageEntity>> stateFlowGEmmrt = this.this$0.AYXKKw.gEmmrt();
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0);
            this.label = 1;
            if (stateFlowGEmmrt.collect(anonymousClass4, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: com.okinc.im.call.repository.CallRepositoryImpl$observeWebSocketMessages$1$4, reason: invalid class name */
    public static final class AnonymousClass4<T> implements FlowCollector {
        public final /* synthetic */ C35235nrW KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4(C35235nrW c35235nrW) {
            this.KWHzl = c35235nrW;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(List<InHouseIMMessageEntity> list, Continuation<? super Unit> continuation) throws Throwable {
            CallRepositoryImpl$observeWebSocketMessages$1$1$emit$1 callRepositoryImpl$observeWebSocketMessages$1$1$emit$1;
            C35235nrW c35235nrW;
            Iterator<T> it;
            if (continuation instanceof CallRepositoryImpl$observeWebSocketMessages$1$1$emit$1) {
                callRepositoryImpl$observeWebSocketMessages$1$1$emit$1 = (CallRepositoryImpl$observeWebSocketMessages$1$1$emit$1) continuation;
                int i = callRepositoryImpl$observeWebSocketMessages$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    callRepositoryImpl$observeWebSocketMessages$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    callRepositoryImpl$observeWebSocketMessages$1$1$emit$1 = new CallRepositoryImpl$observeWebSocketMessages$1$1$emit$1(this, continuation);
                }
            }
            Object obj = callRepositoryImpl$observeWebSocketMessages$1$1$emit$1.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = callRepositoryImpl$observeWebSocketMessages$1$1$emit$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                c35235nrW = this.KWHzl;
                it = list.iterator();
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) callRepositoryImpl$observeWebSocketMessages$1$1$emit$1.L$1;
                c35235nrW = (C35235nrW) callRepositoryImpl$observeWebSocketMessages$1$1$emit$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            while (it.hasNext()) {
                InHouseIMMessageEntity inHouseIMMessageEntity = (InHouseIMMessageEntity) it.next();
                if (inHouseIMMessageEntity.getContentType() == InHouseIMContentType.VoiceCall.getApiValue()) {
                    String strKWHzl = C44157sFk.KWHzl();
                    boolean zEZpvd = Intrinsics.EZpvd((Object) strKWHzl, (Object) inHouseIMMessageEntity.getSenderUid());
                    Integer callStatus = inHouseIMMessageEntity.getCallStatus();
                    c35235nrW.KWHzl("observeWebSocketMessages: Received WS message signalType=" + callStatus + ", channelId=" + inHouseIMMessageEntity.getChannelId() + ", isSentByMe=" + zEZpvd);
                    AbstractC35238nrZ abstractC35238nrZCopydefault = c35235nrW.copydefault(callStatus, zEZpvd, inHouseIMMessageEntity.getChannelId(), inHouseIMMessageEntity.getCallerUid(), inHouseIMMessageEntity.getExtra(), strKWHzl);
                    if (abstractC35238nrZCopydefault != null) {
                        c35235nrW.KWHzl("observeWebSocketMessages: Emitting signal " + C56524yIo.AEQbTJ(abstractC35238nrZCopydefault.getClass()).valueOf());
                        MutableSharedFlow mutableSharedFlow = c35235nrW.EZpvd;
                        callRepositoryImpl$observeWebSocketMessages$1$1$emit$1.L$0 = c35235nrW;
                        callRepositoryImpl$observeWebSocketMessages$1$1$emit$1.L$1 = it;
                        callRepositoryImpl$observeWebSocketMessages$1$1$emit$1.label = 1;
                        if (mutableSharedFlow.emit(abstractC35238nrZCopydefault, callRepositoryImpl$observeWebSocketMessages$1$1$emit$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }
}
