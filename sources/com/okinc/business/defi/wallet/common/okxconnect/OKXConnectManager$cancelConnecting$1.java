package com.okinc.business.defi.wallet.common.okxconnect;

import com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException;
import com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest;
import com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent;
import com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletInfo;
import com.okinc.wallet.core.sign.ton.X25519KeyPair;
import com.reown.android.internal.common.di.CoreNetworkModuleKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import o.C15935eaT;
import o.C16000ebf;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectManager$cancelConnecting$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ X25519KeyPair $clientKeypair;
    final /* synthetic */ DAppConnectRequest $connectRequest;
    final /* synthetic */ OKXConnectException.ErrorType $errorType;
    int label;
    final /* synthetic */ C15935eaT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectManager$cancelConnecting$1(DAppConnectRequest dAppConnectRequest, OKXConnectException.ErrorType errorType, C15935eaT c15935eaT, X25519KeyPair x25519KeyPair, Continuation<? super OKXConnectManager$cancelConnecting$1> continuation) {
        super(2, continuation);
        this.$connectRequest = dAppConnectRequest;
        this.$errorType = errorType;
        this.this$0 = c15935eaT;
        this.$clientKeypair = x25519KeyPair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectManager$cancelConnecting$1(this.$connectRequest, this.$errorType, this.this$0, this.$clientKeypair, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKXConnectManager$cancelConnecting$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            WalletEvent.ConnectError connectError = new WalletEvent.ConnectError(this.$connectRequest.getRequestId(), (String) null, new OKXConnectException(this.$errorType, (String) null, 2, (DefaultConstructorMarker) null), (WalletInfo) null, 10, (DefaultConstructorMarker) null);
            C15935eaT c15935eaT = this.this$0;
            Json json = c15935eaT.gEmmrt;
            json.getSerializersModule();
            String strAEQbTJ = c15935eaT.AEQbTJ(json.encodeToString(WalletEvent.ConnectError.Companion.serializer(), connectError), this.$clientKeypair.getPrvKey(), this.$connectRequest.getClientId());
            Json json2 = this.this$0.gEmmrt;
            X25519KeyPair x25519KeyPair = this.$clientKeypair;
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            JsonElementBuildersKt.put(jsonObjectBuilder, CoreNetworkModuleKt.KEY_CLIENT_ID, x25519KeyPair.getPubKey());
            JsonElementBuildersKt.put(jsonObjectBuilder, "message", strAEQbTJ);
            JsonObject jsonObjectBuild = jsonObjectBuilder.build();
            json2.getSerializersModule();
            String strEncodeToString = json2.encodeToString(JsonObject.Companion.serializer(), jsonObjectBuild);
            C16000ebf c16000ebf = this.this$0.fetchVPNInfo;
            String topic = this.$connectRequest.getTopic();
            this.label = 1;
            if (c16000ebf.KWHzl(topic, strEncodeToString, (28 & 4) != 0 ? false : false, (28 & 8) != 0, (28 & 16) != 0 ? false : false, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        this.this$0.AEQbTJ = null;
        return Unit.INSTANCE;
    }
}
