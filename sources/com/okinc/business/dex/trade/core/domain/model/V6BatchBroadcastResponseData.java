package com.okinc.business.dex.trade.core.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class V6BatchBroadcastResponseData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String swapOrderId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public V6BatchBroadcastResponseData() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ V6BatchBroadcastResponseData copy$default(V6BatchBroadcastResponseData v6BatchBroadcastResponseData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = v6BatchBroadcastResponseData.swapOrderId;
        }
        return v6BatchBroadcastResponseData.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.swapOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6BatchBroadcastResponseData copy(String str) {
        return new V6BatchBroadcastResponseData(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof V6BatchBroadcastResponseData) && Intrinsics.EZpvd((Object) this.swapOrderId, (Object) ((V6BatchBroadcastResponseData) obj).swapOrderId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwapOrderId() {
        return this.swapOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.swapOrderId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "V6BatchBroadcastResponseData(swapOrderId=" + this.swapOrderId + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.V6BatchBroadcastResponseData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<V6BatchBroadcastResponseData> serializer() {
            return V6BatchBroadcastResponseData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ V6BatchBroadcastResponseData(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.swapOrderId = null;
        } else {
            this.swapOrderId = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(V6BatchBroadcastResponseData v6BatchBroadcastResponseData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && v6BatchBroadcastResponseData.swapOrderId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, v6BatchBroadcastResponseData.swapOrderId);
    }

    public V6BatchBroadcastResponseData(String str) {
        this.swapOrderId = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:77) call: com.okinc.business.dex.trade.core.domain.model.V6BatchBroadcastResponseData.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ V6BatchBroadcastResponseData(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
