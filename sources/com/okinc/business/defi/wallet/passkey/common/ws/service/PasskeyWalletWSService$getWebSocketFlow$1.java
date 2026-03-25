package com.okinc.business.defi.wallet.passkey.common.ws.service;

import com.okinc.business.defi.wallet.passkey.common.ws.service.PasskeyWalletWSService$getWebSocketFlow$1;
import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import o.AbstractC33132mqg;
import o.AbstractC57556yke;
import o.C17663fNr;
import o.C33489mxS;
import o.C56391yDq;
import o.C56442yFn;
import o.C57554ykc;
import o.C57567ykp;
import o.pUU;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes5.dex */
public final class PasskeyWalletWSService$getWebSocketFlow$1<R> extends SuspendLambda implements Function2<ProducerScope<? super R>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ArrayList<WsArgV5ForWeb3> $args;
    final /* synthetic */ String $argsString;
    final /* synthetic */ String $channelId;
    final /* synthetic */ DeserializationStrategy<R> $deserializer;
    final /* synthetic */ boolean $isPublic;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C17663fNr this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlinx.serialization.DeserializationStrategy<? extends R> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PasskeyWalletWSService$getWebSocketFlow$1(String str, C17663fNr c17663fNr, boolean z, ArrayList<WsArgV5ForWeb3> arrayList, String str2, DeserializationStrategy<? extends R> deserializationStrategy, Continuation<? super PasskeyWalletWSService$getWebSocketFlow$1> continuation) {
        super(2, continuation);
        this.$channelId = str;
        this.this$0 = c17663fNr;
        this.$isPublic = z;
        this.$args = arrayList;
        this.$argsString = str2;
        this.$deserializer = deserializationStrategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasskeyWalletWSService$getWebSocketFlow$1 passkeyWalletWSService$getWebSocketFlow$1 = new PasskeyWalletWSService$getWebSocketFlow$1(this.$channelId, this.this$0, this.$isPublic, this.$args, this.$argsString, this.$deserializer, continuation);
        passkeyWalletWSService$getWebSocketFlow$1.L$0 = obj;
        return passkeyWalletWSService$getWebSocketFlow$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super R> producerScope, Continuation<? super Unit> continuation) {
        return ((PasskeyWalletWSService$getWebSocketFlow$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            C57554ykc.Application application = C57554ykc.Companion;
            String str = this.$channelId;
            C57567ykp c57567ykpCopydefault = this.this$0.EZpvd.copydefault(this.$isPublic);
            ArrayList<WsArgV5ForWeb3> arrayList = this.$args;
            final C17663fNr c17663fNr = this.this$0;
            final String str2 = this.$argsString;
            final String str3 = this.$channelId;
            final DeserializationStrategy<R> deserializationStrategy = this.$deserializer;
            final AbstractC57556yke abstractC57556ykeAEQbTJ = application.AEQbTJ(str, c57567ykpCopydefault, arrayList, new Function2() { // from class: o.fNs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return PasskeyWalletWSService$getWebSocketFlow$1.invokeSuspend$lambda$1(c17663fNr, str2, str3, producerScope, deserializationStrategy, (AbstractC33132mqg) obj2, (OKIncomingData) obj3);
                }
            });
            abstractC57556ykeAEQbTJ.AhwBna();
            pUU.copydefault(this.this$0.copydefault, "okWSListener = " + this.$channelId + " " + this.$argsString + " start() : getConnectionState = " + abstractC57556ykeAEQbTJ.EZpvd() + " : getConnId = " + abstractC57556ykeAEQbTJ.AEQbTJ());
            final C17663fNr c17663fNr2 = this.this$0;
            final String str4 = this.$channelId;
            final String str5 = this.$argsString;
            Function0 function0 = new Function0() { // from class: o.fNu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return PasskeyWalletWSService$getWebSocketFlow$1.invokeSuspend$lambda$2(c17663fNr2, str4, str5, abstractC57556ykeAEQbTJ);
                }
            };
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, function0, this) == objCopydefault) {
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

    /* JADX DEBUG: Multi-variable search result rejected for r5v8, resolved type: kotlinx.serialization.json.JsonElement */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit invokeSuspend$lambda$1(C17663fNr c17663fNr, String str, String str2, ProducerScope producerScope, DeserializationStrategy deserializationStrategy, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        try {
            pUU.copydefault(c17663fNr.copydefault, "websocket receive -- args = " + str + ", channelId = " + str2 + " : connId = " + abstractC33132mqg.AEQbTJ() + " response data = " + oKIncomingData.getPayload());
            String string = oKIncomingData.getPayload().toString();
            Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
            JsonElement toJsonElement = jsonAEQbTJ.parseToJsonElement(string);
            if (!(toJsonElement instanceof JsonArray)) {
                if (!(toJsonElement instanceof JsonObject)) {
                    pUU.copydefault(c17663fNr.copydefault, "Unknown jsonElement: " + toJsonElement.getClass());
                } else {
                    ChannelResult.m7420boximpl(producerScope.mo5769trySendJP2dKIU(jsonAEQbTJ.decodeFromJsonElement(deserializationStrategy, toJsonElement)));
                }
            } else {
                Iterator it = ((Iterable) toJsonElement).iterator();
                while (it.hasNext()) {
                    producerScope.mo5769trySendJP2dKIU(jsonAEQbTJ.decodeFromJsonElement(deserializationStrategy, (JsonElement) it.next()));
                }
            }
        } catch (Exception e) {
            pUU.AEQbTJ("BasePasskeyWalletWSListener", "deserialize incoming data failed", e);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2(C17663fNr c17663fNr, String str, String str2, AbstractC57556yke abstractC57556yke) {
        pUU.copydefault(c17663fNr.copydefault, "okWSListener = " + str + " " + str2 + " stop() : getConnId = " + abstractC57556yke.AEQbTJ());
        abstractC57556yke.djBIcL();
        return Unit.INSTANCE;
    }
}
