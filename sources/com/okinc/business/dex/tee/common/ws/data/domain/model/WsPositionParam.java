package com.okinc.business.dex.tee.common.ws.data.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class WsPositionParam {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String accountId;
    private final String strategyId;
    private final Integer strategyMode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WsPositionParam() {
        this((Integer) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WsPositionParam copy$default(WsPositionParam wsPositionParam, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = wsPositionParam.strategyMode;
        }
        if ((i & 2) != 0) {
            str = wsPositionParam.strategyId;
        }
        if ((i & 4) != 0) {
            str2 = wsPositionParam.accountId;
        }
        return wsPositionParam.copy(num, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.strategyMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.strategyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WsPositionParam copy(Integer num, String str, String str2) {
        return new WsPositionParam(num, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsPositionParam)) {
            return false;
        }
        WsPositionParam wsPositionParam = (WsPositionParam) obj;
        return Intrinsics.EZpvd(this.strategyMode, wsPositionParam.strategyMode) && Intrinsics.EZpvd((Object) this.strategyId, (Object) wsPositionParam.strategyId) && Intrinsics.EZpvd((Object) this.accountId, (Object) wsPositionParam.accountId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyId() {
        return this.strategyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStrategyMode() {
        return this.strategyMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.strategyMode;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.strategyId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.accountId;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WsPositionParam(strategyMode=" + this.strategyMode + ", strategyId=" + this.strategyId + ", accountId=" + this.accountId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.common.ws.data.domain.model.WsPositionParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WsPositionParam> serializer() {
            return WsPositionParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WsPositionParam(int i, Integer num, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.strategyMode = null;
        } else {
            this.strategyMode = num;
        }
        if ((i & 2) == 0) {
            this.strategyId = null;
        } else {
            this.strategyId = str;
        }
        if ((i & 4) == 0) {
            this.accountId = null;
        } else {
            this.accountId = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(WsPositionParam wsPositionParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || wsPositionParam.strategyMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, wsPositionParam.strategyMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || wsPositionParam.strategyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, wsPositionParam.strategyId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && wsPositionParam.accountId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, wsPositionParam.accountId);
    }

    public WsPositionParam(Integer num, String str, String str2) {
        this.strategyMode = num;
        this.strategyId = str;
        this.accountId = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String):void (m)] (LINE:121) call: com.okinc.business.dex.tee.common.ws.data.domain.model.WsPositionParam.<init>(java.lang.Integer, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ WsPositionParam(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
