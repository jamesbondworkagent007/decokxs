package com.okinc.business.dex.trade.order.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class TeeOrderStatusData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chainId;
    private final String orderId;
    private final int status;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TeeOrderStatusData() {
        this((String) null, (String) null, 0, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TeeOrderStatusData copy$default(TeeOrderStatusData teeOrderStatusData, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = teeOrderStatusData.orderId;
        }
        if ((i2 & 2) != 0) {
            str2 = teeOrderStatusData.chainId;
        }
        if ((i2 & 4) != 0) {
            i = teeOrderStatusData.status;
        }
        return teeOrderStatusData.copy(str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeOrderStatusData copy(@NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TeeOrderStatusData(str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeeOrderStatusData)) {
            return false;
        }
        TeeOrderStatusData teeOrderStatusData = (TeeOrderStatusData) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) teeOrderStatusData.orderId) && Intrinsics.EZpvd((Object) this.chainId, (Object) teeOrderStatusData.chainId) && this.status == teeOrderStatusData.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.orderId.hashCode() * 31) + this.chainId.hashCode()) * 31) + Integer.hashCode(this.status);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeOrderStatusData(orderId=" + this.orderId + ", chainId=" + this.chainId + ", status=" + this.status + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.order.domain.model.TeeOrderStatusData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TeeOrderStatusData> serializer() {
            return TeeOrderStatusData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TeeOrderStatusData(int i, String str, String str2, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str;
        }
        if ((i & 2) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str2;
        }
        if ((i & 4) == 0) {
            this.status = 0;
        } else {
            this.status = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TeeOrderStatusData teeOrderStatusData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) teeOrderStatusData.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, teeOrderStatusData.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) teeOrderStatusData.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, teeOrderStatusData.chainId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && teeOrderStatusData.status == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, teeOrderStatusData.status);
    }

    public TeeOrderStatusData(@NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.orderId = str;
        this.chainId = str2;
        this.status = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(java.lang.String, java.lang.String, int):void (m)] (LINE:8) call: com.okinc.business.dex.trade.order.domain.model.TeeOrderStatusData.<init>(java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ TeeOrderStatusData(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i);
    }
}
