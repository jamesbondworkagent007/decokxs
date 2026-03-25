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
public final class LimitOrderDetailNetworkFeeInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String nativeTokenCostAmt;
    private final String usdValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LimitOrderDetailNetworkFeeInfo() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LimitOrderDetailNetworkFeeInfo copy$default(LimitOrderDetailNetworkFeeInfo limitOrderDetailNetworkFeeInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = limitOrderDetailNetworkFeeInfo.usdValue;
        }
        if ((i & 2) != 0) {
            str2 = limitOrderDetailNetworkFeeInfo.nativeTokenCostAmt;
        }
        return limitOrderDetailNetworkFeeInfo.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.usdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nativeTokenCostAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderDetailNetworkFeeInfo copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new LimitOrderDetailNetworkFeeInfo(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitOrderDetailNetworkFeeInfo)) {
            return false;
        }
        LimitOrderDetailNetworkFeeInfo limitOrderDetailNetworkFeeInfo = (LimitOrderDetailNetworkFeeInfo) obj;
        return Intrinsics.EZpvd((Object) this.usdValue, (Object) limitOrderDetailNetworkFeeInfo.usdValue) && Intrinsics.EZpvd((Object) this.nativeTokenCostAmt, (Object) limitOrderDetailNetworkFeeInfo.nativeTokenCostAmt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenCostAmt() {
        return this.nativeTokenCostAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdValue() {
        return this.usdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.usdValue.hashCode() * 31) + this.nativeTokenCostAmt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LimitOrderDetailNetworkFeeInfo(usdValue=" + this.usdValue + ", nativeTokenCostAmt=" + this.nativeTokenCostAmt + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailNetworkFeeInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LimitOrderDetailNetworkFeeInfo> serializer() {
            return LimitOrderDetailNetworkFeeInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LimitOrderDetailNetworkFeeInfo(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.usdValue = "";
        } else {
            this.usdValue = str;
        }
        if ((i & 2) == 0) {
            this.nativeTokenCostAmt = "";
        } else {
            this.nativeTokenCostAmt = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(LimitOrderDetailNetworkFeeInfo limitOrderDetailNetworkFeeInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) limitOrderDetailNetworkFeeInfo.usdValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, limitOrderDetailNetworkFeeInfo.usdValue);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) limitOrderDetailNetworkFeeInfo.nativeTokenCostAmt, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, limitOrderDetailNetworkFeeInfo.nativeTokenCostAmt);
    }

    public LimitOrderDetailNetworkFeeInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.usdValue = str;
        this.nativeTokenCostAmt = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:276) call: com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailNetworkFeeInfo.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LimitOrderDetailNetworkFeeInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
