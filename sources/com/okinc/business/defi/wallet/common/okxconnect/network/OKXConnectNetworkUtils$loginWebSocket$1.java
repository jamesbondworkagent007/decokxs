package com.okinc.business.defi.wallet.common.okxconnect.network;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession;
import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcMessage;
import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;
import o.AbstractC57572yku;
import o.C16000ebf;
import o.C16011ebq;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectNetworkUtils$loginWebSocket$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C16000ebf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectNetworkUtils$loginWebSocket$1(C16000ebf c16000ebf, Continuation<? super OKXConnectNetworkUtils$loginWebSocket$1> continuation) {
        super(2, continuation);
        this.this$0 = c16000ebf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectNetworkUtils$loginWebSocket$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKXConnectNetworkUtils$loginWebSocket$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objFirst;
        RpcResponse rpcResponse;
        C16000ebf c16000ebf;
        Object value;
        Object value2;
        Object objOLrzqt;
        List listQOLQEE;
        Iterator it;
        Iterator it2;
        List list;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C16000ebf c16000ebf2 = this.this$0;
            this.label = 1;
            objAEQbTJ = c16000ebf2.AEQbTJ((Continuation<? super String>) this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    objFirst = obj;
                    rpcResponse = (RpcResponse) objFirst;
                    c16000ebf = this.this$0;
                    if (!(rpcResponse instanceof RpcResponse.Success)) {
                        pUU.KWHzl("OKXConnectNetworkUtils", "Login success");
                        MutableStateFlow mutableStateFlow = c16000ebf.AYXKKw;
                        do {
                            value2 = mutableStateFlow.getValue();
                            ((Boolean) value2).booleanValue();
                        } while (!mutableStateFlow.compareAndSet(value2, C56443yFo.KWHzl(true)));
                        C16011ebq c16011ebq = c16000ebf.DbNXlk;
                        this.L$0 = c16000ebf;
                        this.label = 3;
                        objOLrzqt = c16011ebq.OLrzqt(this);
                        if (objOLrzqt == objCopydefault) {
                            return objCopydefault;
                        }
                        listQOLQEE = C56403yEb.QOLQEE(((Map) objOLrzqt).values());
                        it = listQOLQEE.iterator();
                        it2 = it;
                        list = listQOLQEE;
                        C16000ebf c16000ebf3 = c16000ebf;
                        while (it2.hasNext()) {
                        }
                        if (!list.isEmpty()) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (rpcResponse instanceof RpcResponse.Error) {
                        RpcResponse.Error error = (RpcResponse.Error) rpcResponse;
                        MutableStateFlow mutableStateFlow2 = c16000ebf.AYXKKw;
                        do {
                            value = mutableStateFlow2.getValue();
                            ((Boolean) value).booleanValue();
                        } while (!mutableStateFlow2.compareAndSet(value, C56443yFo.KWHzl(error.getError().getCode() == -32001)));
                        pUU.copydefault("OKXConnectNetworkUtils", "Error logging in - " + error.getError().getCode() + ":" + error.getError().getMessage());
                    }
                    return Unit.INSTANCE;
                }
                if (i == 3) {
                    C16000ebf c16000ebf4 = (C16000ebf) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    c16000ebf = c16000ebf4;
                    objOLrzqt = obj;
                    listQOLQEE = C56403yEb.QOLQEE(((Map) objOLrzqt).values());
                    it = listQOLQEE.iterator();
                    it2 = it;
                    list = listQOLQEE;
                    C16000ebf c16000ebf32 = c16000ebf;
                    while (it2.hasNext()) {
                    }
                    if (!list.isEmpty()) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                it = (Iterator) this.L$2;
                listQOLQEE = (List) this.L$1;
                c16000ebf = (C16000ebf) this.L$0;
                C56391yDq.AEQbTJ(obj);
                ((Result) obj).m7386unboximpl();
                it2 = it;
                list = listQOLQEE;
                C16000ebf c16000ebf322 = c16000ebf;
                while (it2.hasNext()) {
                    String topic = ((DAppSession) it2.next()).getTopic();
                    this.L$0 = c16000ebf322;
                    this.L$1 = list;
                    this.L$2 = it2;
                    this.label = 4;
                    if (C16000ebf.m8598subscribeBWLJW6A$default(c16000ebf322, topic, false, false, this, 6, null) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                if (!list.isEmpty()) {
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((DAppSession) it3.next()).getTopic());
                    }
                    c16000ebf322.EZpvd((List<String>) arrayList);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    if (c16000ebf322.OLrzqt((List<String>) arrayList, (Continuation<? super Job>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
        }
        String str = (String) objAEQbTJ;
        if (str == null) {
            return Unit.INSTANCE;
        }
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder, "token", str);
        Unit unit = Unit.INSTANCE;
        RpcMessage rpcMessage = new RpcMessage((String) null, (String) null, FirebaseAnalytics.Event.LOGIN, jsonObjectBuilder.build(), 3, (DefaultConstructorMarker) null);
        AbstractC57572yku abstractC57572ykuFetchVPNInfo = this.this$0.fetchVPNInfo();
        Json jsonKWHzl = this.this$0.KWHzl();
        jsonKWHzl.getSerializersModule();
        abstractC57572ykuFetchVPNInfo.copydefault(jsonKWHzl.encodeToString(RpcMessage.Companion.serializer(), rpcMessage));
        pUU.KWHzl("OKXConnectNetworkUtils", "Logging in websocket");
        MutableSharedFlow mutableSharedFlow = this.this$0.fJNWhG;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(rpcMessage, null);
        this.label = 2;
        objFirst = FlowKt.first(mutableSharedFlow, anonymousClass1, this);
        if (objFirst == objCopydefault) {
            return objCopydefault;
        }
        rpcResponse = (RpcResponse) objFirst;
        c16000ebf = this.this$0;
        if (!(rpcResponse instanceof RpcResponse.Success)) {
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$loginWebSocket$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<RpcResponse, Continuation<? super Boolean>, Object> {
        final /* synthetic */ RpcMessage $loginMsg;
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RpcMessage rpcMessage, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$loginMsg = rpcMessage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$loginMsg, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RpcResponse rpcResponse, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass1) create(rpcResponse, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return C56443yFo.KWHzl(Intrinsics.EZpvd((Object) ((RpcResponse) this.L$0).getId(), (Object) this.$loginMsg.getId()));
        }
    }
}
