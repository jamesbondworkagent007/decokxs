package com.okinc.business.defi.wallet.common.okxconnect.network;

import com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException;
import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcMessage;
import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.serialization.json.Json;
import o.C16000ebf;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C59462zhW;
import o.C59519zia;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectNetworkUtils$sendMessage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ boolean $isAwaitResponse;
    final /* synthetic */ RpcMessage $rpcMessage;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C16000ebf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectNetworkUtils$sendMessage$2(C16000ebf c16000ebf, RpcMessage rpcMessage, boolean z, Continuation<? super OKXConnectNetworkUtils$sendMessage$2> continuation) {
        super(2, continuation);
        this.this$0 = c16000ebf;
        this.$rpcMessage = rpcMessage;
        this.$isAwaitResponse = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKXConnectNetworkUtils$sendMessage$2 oKXConnectNetworkUtils$sendMessage$2 = new OKXConnectNetworkUtils$sendMessage$2(this.this$0, this.$rpcMessage, this.$isAwaitResponse, continuation);
        oKXConnectNetworkUtils$sendMessage$2.L$0 = obj;
        return oKXConnectNetworkUtils$sendMessage$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((OKXConnectNetworkUtils$sendMessage$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Result result;
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            C16000ebf c16000ebf = this.this$0;
            this.L$0 = coroutineScope;
            this.label = 1;
            if (c16000ebf.EZpvd(this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                result = (Result) obj;
                if (result == null) {
                    objM7377constructorimpl = result.m7386unboximpl();
                } else {
                    pUU.copydefault("OKXConnectNetworkUtils", "sendMessage " + this.$rpcMessage.getId() + " timeout");
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(new OKXConnectException(OKXConnectException.ErrorType.TIMEOUT, (String) null, 2, (DefaultConstructorMarker) null)));
                }
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        C59462zhW.Activity activity = C59462zhW.OLrzqt;
        long jAEQbTJ = C59519zia.AEQbTJ(this.this$0.gEmmrt(), DurationUnit.SECONDS);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$rpcMessage, this.$isAwaitResponse, null);
        this.L$0 = coroutineScope;
        this.label = 2;
        obj = TimeoutKt.m7403withTimeoutOrNullKLykuaI(jAEQbTJ, anonymousClass1, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        result = (Result) obj;
        if (result == null) {
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$sendMessage$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
        final /* synthetic */ boolean $isAwaitResponse;
        final /* synthetic */ RpcMessage $rpcMessage;
        Object L$0;
        int label;
        final /* synthetic */ C16000ebf this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C16000ebf c16000ebf, RpcMessage rpcMessage, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c16000ebf;
            this.$rpcMessage = rpcMessage;
            this.$isAwaitResponse = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$rpcMessage, this.$isAwaitResponse, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM7377constructorimpl;
            RpcMessage rpcMessage;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                RpcMessage rpcMessageKWHzl = this.this$0.KWHzl(this.$rpcMessage);
                Json jsonKWHzl = this.this$0.KWHzl();
                jsonKWHzl.getSerializersModule();
                String strEncodeToString = jsonKWHzl.encodeToString(RpcMessage.Companion.serializer(), rpcMessageKWHzl);
                pUU.KWHzl("OKXConnectNetworkUtils", "sendMessage: " + strEncodeToString);
                this.this$0.fetchVPNInfo().copydefault(strEncodeToString);
                if (this.$isAwaitResponse) {
                    MutableSharedFlow mutableSharedFlow = this.this$0.fJNWhG;
                    C02531 c02531 = new C02531(rpcMessageKWHzl, null);
                    this.L$0 = rpcMessageKWHzl;
                    this.label = 1;
                    Object objFirst = FlowKt.first(mutableSharedFlow, c02531, this);
                    if (objFirst == objCopydefault) {
                        return objCopydefault;
                    }
                    rpcMessage = rpcMessageKWHzl;
                    obj = objFirst;
                } else {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rpcMessage = (RpcMessage) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            RpcResponse rpcResponse = (RpcResponse) obj;
            if (rpcResponse instanceof RpcResponse.Success) {
                pUU.KWHzl("OKXConnectNetworkUtils", "sendMessage " + rpcMessage.getId() + " success");
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } else if (rpcResponse instanceof RpcResponse.Error) {
                RpcResponse.Error error = (RpcResponse.Error) rpcResponse;
                pUU.copydefault("OKXConnectNetworkUtils", "sendMessage " + rpcMessage.getId() + " error - " + error.getError().getCode() + ":" + error.getError().getMessage());
                Result.Application application3 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(error.getError()));
            } else {
                pUU.copydefault("OKXConnectNetworkUtils", "Response mismatch, expecting error or success");
                Result.Application application4 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(new Exception("Response mismatch, expecting error or success")));
            }
            return Result.m7376boximpl(objM7377constructorimpl);
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.common.okxconnect.network.OKXConnectNetworkUtils$sendMessage$2$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C02531 extends SuspendLambda implements Function2<RpcResponse, Continuation<? super Boolean>, Object> {
            final /* synthetic */ RpcMessage $finalRpcMessage;
            /* synthetic */ Object L$0;
            int label;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02531(RpcMessage rpcMessage, Continuation<? super C02531> continuation) {
                super(2, continuation);
                this.$finalRpcMessage = rpcMessage;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02531 c02531 = new C02531(this.$finalRpcMessage, continuation);
                c02531.L$0 = obj;
                return c02531;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(RpcResponse rpcResponse, Continuation<? super Boolean> continuation) {
                return ((C02531) create(rpcResponse, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return C56443yFo.KWHzl(Intrinsics.EZpvd((Object) ((RpcResponse) this.L$0).getId(), (Object) this.$finalRpcMessage.getId()));
            }
        }
    }
}
