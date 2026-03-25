package com.okinc.business.defi.wallet.common.okxconnect.network;

import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data;
import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.DisconnectedTopic;
import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C16000ebf;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectNetworkUtils$startObservingFetchSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C16000ebf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectNetworkUtils$startObservingFetchSuccess$1(C16000ebf c16000ebf, Continuation<? super OKXConnectNetworkUtils$startObservingFetchSuccess$1> continuation) {
        super(2, continuation);
        this.this$0 = c16000ebf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectNetworkUtils$startObservingFetchSuccess$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKXConnectNetworkUtils$startObservingFetchSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd("OKXConnectNetworkUtils", "startObservingIncomingFetches");
            MutableSharedFlow mutableSharedFlow = this.this$0.AkhnZx;
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0);
            this.label = 1;
            if (mutableSharedFlow.collect(anonymousClass4, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$startObservingFetchSuccess$1$4, reason: invalid class name */
    public static final class AnonymousClass4<T> implements FlowCollector {
        public final /* synthetic */ C16000ebf EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4(C16000ebf c16000ebf) {
            this.EZpvd = c16000ebf;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(RpcResponse.FetchSuccess fetchSuccess, Continuation<? super Unit> continuation) throws Throwable {
            OKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1 oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1;
            C16000ebf c16000ebf;
            AnonymousClass4<T> anonymousClass4;
            RpcResponse.FetchSuccess fetchSuccess2;
            Iterator<T> it;
            C16000ebf c16000ebf2;
            Iterator<T> it2;
            RpcResponse.FetchSuccess fetchSuccess3;
            AnonymousClass4<T> anonymousClass42;
            Data data;
            String topic;
            if (continuation instanceof OKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1) {
                oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1 = (OKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1) continuation;
                int i = oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1 = new OKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1(this, continuation);
                }
            }
            Object obj = oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                List<Data> data2 = fetchSuccess.getResult().getData();
                c16000ebf = this.EZpvd;
                anonymousClass4 = this;
                fetchSuccess2 = fetchSuccess;
                it = data2.iterator();
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it2 = (Iterator) oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1.L$3;
                    c16000ebf2 = (C16000ebf) oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1.L$2;
                    fetchSuccess3 = (RpcResponse.FetchSuccess) oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1.L$1;
                    anonymousClass42 = (AnonymousClass4) oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1.L$0;
                    C56391yDq.AEQbTJ(obj);
                    while (it2.hasNext()) {
                        DisconnectedTopic disconnectedTopic = (DisconnectedTopic) it2.next();
                        MutableSharedFlow mutableSharedFlow = c16000ebf2.copydefault;
                        oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1.L$0 = anonymousClass42;
                        oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1.L$1 = fetchSuccess3;
                        oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1.L$2 = c16000ebf2;
                        oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1.L$3 = it2;
                        oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1.label = 2;
                        if (mutableSharedFlow.emit(disconnectedTopic, oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    anonymousClass4 = anonymousClass42;
                    fetchSuccess2 = fetchSuccess3;
                    if (fetchSuccess2.getResult().getHasMore() && (data = (Data) CollectionsKt___CollectionsKt.firstOrNull(fetchSuccess2.getResult().getData())) != null && (topic = data.getTopic()) != null) {
                        C16000ebf.fetchMessages$default(anonymousClass4.EZpvd, topic, false, 2, null);
                    }
                    return Unit.INSTANCE;
                }
                it = (Iterator) oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1.L$3;
                c16000ebf = (C16000ebf) oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1.L$2;
                fetchSuccess2 = (RpcResponse.FetchSuccess) oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1.L$1;
                anonymousClass4 = (AnonymousClass4) oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            while (it.hasNext()) {
                Data data3 = (Data) it.next();
                oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1.L$0 = anonymousClass4;
                oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1.L$1 = fetchSuccess2;
                oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1.L$2 = c16000ebf;
                oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1.L$3 = it;
                oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1.label = 1;
                if (c16000ebf.EZpvd(data3, (Continuation<? super Unit>) oKXConnectNetworkUtils$startObservingFetchSuccess$1$1$emit$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
            List<DisconnectedTopic> disconnectedTopics = fetchSuccess2.getResult().getDisconnectedTopics();
            if (disconnectedTopics != null) {
                c16000ebf2 = anonymousClass4.EZpvd;
                it2 = disconnectedTopics.iterator();
                fetchSuccess3 = fetchSuccess2;
                anonymousClass42 = anonymousClass4;
                while (it2.hasNext()) {
                }
                anonymousClass4 = anonymousClass42;
                fetchSuccess2 = fetchSuccess3;
            }
            if (fetchSuccess2.getResult().getHasMore()) {
                C16000ebf.fetchMessages$default(anonymousClass4.EZpvd, topic, false, 2, null);
            }
            return Unit.INSTANCE;
        }
    }
}
