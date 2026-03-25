package com.okinc.business.dex.trade.core.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class V6BroadcastResponseData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Boolean isSuccess;
    private final String orderId;
    private final String transactionHash;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public V6BroadcastResponseData() {
        this((String) null, (String) null, (Boolean) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ V6BroadcastResponseData copy$default(V6BroadcastResponseData v6BroadcastResponseData, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = v6BroadcastResponseData.orderId;
        }
        if ((i & 2) != 0) {
            str2 = v6BroadcastResponseData.transactionHash;
        }
        if ((i & 4) != 0) {
            bool = v6BroadcastResponseData.isSuccess;
        }
        return v6BroadcastResponseData.copy(str, str2, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.transactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.isSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6BroadcastResponseData copy(String str, String str2, Boolean bool) {
        return new V6BroadcastResponseData(str, str2, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V6BroadcastResponseData)) {
            return false;
        }
        V6BroadcastResponseData v6BroadcastResponseData = (V6BroadcastResponseData) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) v6BroadcastResponseData.orderId) && Intrinsics.EZpvd((Object) this.transactionHash, (Object) v6BroadcastResponseData.transactionHash) && Intrinsics.EZpvd(this.isSuccess, v6BroadcastResponseData.isSuccess);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionHash() {
        return this.transactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.orderId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.transactionHash;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.isSuccess;
        return (((iHashCode * 31) + iHashCode2) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isSuccess() {
        return this.isSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "V6BroadcastResponseData(orderId=" + this.orderId + ", transactionHash=" + this.transactionHash + ", isSuccess=" + this.isSuccess + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.V6BroadcastResponseData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<V6BroadcastResponseData> serializer() {
            return V6BroadcastResponseData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ V6BroadcastResponseData(int i, String str, String str2, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.orderId = null;
        } else {
            this.orderId = str;
        }
        if ((i & 2) == 0) {
            this.transactionHash = null;
        } else {
            this.transactionHash = str2;
        }
        if ((i & 4) == 0) {
            this.isSuccess = null;
        } else {
            this.isSuccess = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(V6BroadcastResponseData v6BroadcastResponseData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || v6BroadcastResponseData.orderId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, v6BroadcastResponseData.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || v6BroadcastResponseData.transactionHash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, v6BroadcastResponseData.transactionHash);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && v6BroadcastResponseData.isSuccess == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, v6BroadcastResponseData.isSuccess);
    }

    public V6BroadcastResponseData(String str, String str2, Boolean bool) {
        this.orderId = str;
        this.transactionHash = str2;
        this.isSuccess = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r4v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:13) call: com.okinc.business.dex.trade.core.domain.model.V6BroadcastResponseData.<init>(java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ V6BroadcastResponseData(String str, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool);
    }
}
