package com.okinc.business.dex.tee.common.ws.data.domain.model;

import com.okinc.business.dex.tee.common.ws.data.domain.model.WsMarketOrderInfo;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.TradeState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import o.C33489mxS;
import o.C56392yDr;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class WsMarketOrderInfo {
    private final JsonObject dexData;
    private final InterfaceC56387yDm tradeState$delegate;
    private final String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WsMarketOrderInfo copy$default(WsMarketOrderInfo wsMarketOrderInfo, String str, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wsMarketOrderInfo.type;
        }
        if ((i & 2) != 0) {
            jsonObject = wsMarketOrderInfo.dexData;
        }
        return wsMarketOrderInfo.copy(str, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component2() {
        return this.dexData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WsMarketOrderInfo copy(@NotNull String str, @NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        return new WsMarketOrderInfo(str, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsMarketOrderInfo)) {
            return false;
        }
        WsMarketOrderInfo wsMarketOrderInfo = (WsMarketOrderInfo) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) wsMarketOrderInfo.type) && Intrinsics.EZpvd(this.dexData, wsMarketOrderInfo.dexData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject getDexData() {
        return this.dexData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.type.hashCode() * 31) + this.dexData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WsMarketOrderInfo(type=" + this.type + ", dexData=" + this.dexData + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.common.ws.data.domain.model.WsMarketOrderInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WsMarketOrderInfo> serializer() {
            return WsMarketOrderInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WsMarketOrderInfo(int i, String str, JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, WsMarketOrderInfo$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.type = "";
        } else {
            this.type = str;
        }
        this.dexData = jsonObject;
        this.tradeState$delegate = C56392yDr.copydefault(new Function0() { // from class: o.gMj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return WsMarketOrderInfo._init_$lambda$1(this.AEQbTJ);
            }
        });
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(WsMarketOrderInfo wsMarketOrderInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) wsMarketOrderInfo.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, wsMarketOrderInfo.type);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, JsonObjectSerializer.INSTANCE, wsMarketOrderInfo.dexData);
    }

    public WsMarketOrderInfo(@NotNull String str, @NotNull JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        this.type = str;
        this.dexData = jsonObject;
        this.tradeState$delegate = C56392yDr.copydefault(new Function0() { // from class: o.gMf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return WsMarketOrderInfo.tradeState_delegate$lambda$0(this.copydefault);
            }
        });
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (r2v0 kotlinx.serialization.json.JsonObject)
 A[MD:(java.lang.String, kotlinx.serialization.json.JsonObject):void (m)] (LINE:185) call: com.okinc.business.dex.tee.common.ws.data.domain.model.WsMarketOrderInfo.<init>(java.lang.String, kotlinx.serialization.json.JsonObject):void type: THIS */
    public /* synthetic */ WsMarketOrderInfo(String str, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, jsonObject);
    }

    public final TradeState getTradeState() {
        return (TradeState) this.tradeState$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TradeState _init_$lambda$1(WsMarketOrderInfo wsMarketOrderInfo) {
        if (Intrinsics.EZpvd((Object) wsMarketOrderInfo.type, (Object) "1")) {
            return (TradeState) C33489mxS.KWHzl.AEQbTJ().decodeFromJsonElement(TradeState.Companion.serializer(), wsMarketOrderInfo.dexData);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TradeState tradeState_delegate$lambda$0(WsMarketOrderInfo wsMarketOrderInfo) {
        if (Intrinsics.EZpvd((Object) wsMarketOrderInfo.type, (Object) "1")) {
            return (TradeState) C33489mxS.KWHzl.AEQbTJ().decodeFromJsonElement(TradeState.Companion.serializer(), wsMarketOrderInfo.dexData);
        }
        return null;
    }
}
