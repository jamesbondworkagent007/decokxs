package com.okinc.business.dex.tee.common.ws.data.domain.model;

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
public final class TeeWsData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String orderId;
    private final int status;
    private final String stoppedTime;
    private final String strategyId;
    private final int strategyMode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TeeWsData() {
        this((String) null, (String) null, 0, 0, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TeeWsData copy$default(TeeWsData teeWsData, String str, String str2, int i, int i2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = teeWsData.orderId;
        }
        if ((i3 & 2) != 0) {
            str2 = teeWsData.strategyId;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            i = teeWsData.strategyMode;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = teeWsData.status;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            str3 = teeWsData.stoppedTime;
        }
        return teeWsData.copy(str, str4, i4, i5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.strategyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.strategyMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.stoppedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeWsData copy(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new TeeWsData(str, str2, i, i2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeeWsData)) {
            return false;
        }
        TeeWsData teeWsData = (TeeWsData) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) teeWsData.orderId) && Intrinsics.EZpvd((Object) this.strategyId, (Object) teeWsData.strategyId) && this.strategyMode == teeWsData.strategyMode && this.status == teeWsData.status && Intrinsics.EZpvd((Object) this.stoppedTime, (Object) teeWsData.stoppedTime);
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
    public final String getStoppedTime() {
        return this.stoppedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyId() {
        return this.strategyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStrategyMode() {
        return this.strategyMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.orderId.hashCode() * 31) + this.strategyId.hashCode()) * 31) + Integer.hashCode(this.strategyMode)) * 31) + Integer.hashCode(this.status)) * 31) + this.stoppedTime.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeWsData(orderId=" + this.orderId + ", strategyId=" + this.strategyId + ", strategyMode=" + this.strategyMode + ", status=" + this.status + ", stoppedTime=" + this.stoppedTime + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TeeWsData> serializer() {
            return TeeWsData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TeeWsData(int i, String str, String str2, int i2, int i3, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str;
        }
        if ((i & 2) == 0) {
            this.strategyId = "";
        } else {
            this.strategyId = str2;
        }
        if ((i & 4) == 0) {
            this.strategyMode = 0;
        } else {
            this.strategyMode = i2;
        }
        if ((i & 8) == 0) {
            this.status = 0;
        } else {
            this.status = i3;
        }
        if ((i & 16) == 0) {
            this.stoppedTime = "";
        } else {
            this.stoppedTime = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TeeWsData teeWsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) teeWsData.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, teeWsData.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) teeWsData.strategyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, teeWsData.strategyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || teeWsData.strategyMode != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, teeWsData.strategyMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || teeWsData.status != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, teeWsData.status);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) teeWsData.stoppedTime, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, teeWsData.stoppedTime);
    }

    public TeeWsData(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.orderId = str;
        this.strategyId = str2;
        this.strategyMode = i;
        this.status = i2;
        this.stoppedTime = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r7v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0018: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, int, int, java.lang.String):void (m)] (LINE:52) call: com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsData.<init>(java.lang.String, java.lang.String, int, int, java.lang.String):void type: THIS */
    public /* synthetic */ TeeWsData(String str, String str2, int i, int i2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? "" : str3);
    }
}
