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
public final class LimitOrderDetailTransactionInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String exploreUrl;
    private final String transactionHash;
    private final String transactionPrice;
    private final String transactionRate;
    private final String transactionTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LimitOrderDetailTransactionInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LimitOrderDetailTransactionInfo copy$default(LimitOrderDetailTransactionInfo limitOrderDetailTransactionInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = limitOrderDetailTransactionInfo.transactionPrice;
        }
        if ((i & 2) != 0) {
            str2 = limitOrderDetailTransactionInfo.transactionHash;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = limitOrderDetailTransactionInfo.transactionTime;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = limitOrderDetailTransactionInfo.transactionRate;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = limitOrderDetailTransactionInfo.exploreUrl;
        }
        return limitOrderDetailTransactionInfo.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.transactionPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.transactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.transactionTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.transactionRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.exploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderDetailTransactionInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new LimitOrderDetailTransactionInfo(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitOrderDetailTransactionInfo)) {
            return false;
        }
        LimitOrderDetailTransactionInfo limitOrderDetailTransactionInfo = (LimitOrderDetailTransactionInfo) obj;
        return Intrinsics.EZpvd((Object) this.transactionPrice, (Object) limitOrderDetailTransactionInfo.transactionPrice) && Intrinsics.EZpvd((Object) this.transactionHash, (Object) limitOrderDetailTransactionInfo.transactionHash) && Intrinsics.EZpvd((Object) this.transactionTime, (Object) limitOrderDetailTransactionInfo.transactionTime) && Intrinsics.EZpvd((Object) this.transactionRate, (Object) limitOrderDetailTransactionInfo.transactionRate) && Intrinsics.EZpvd((Object) this.exploreUrl, (Object) limitOrderDetailTransactionInfo.exploreUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExploreUrl() {
        return this.exploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionHash() {
        return this.transactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionPrice() {
        return this.transactionPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionRate() {
        return this.transactionRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionTime() {
        return this.transactionTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.transactionPrice.hashCode() * 31) + this.transactionHash.hashCode()) * 31) + this.transactionTime.hashCode()) * 31) + this.transactionRate.hashCode()) * 31) + this.exploreUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LimitOrderDetailTransactionInfo(transactionPrice=" + this.transactionPrice + ", transactionHash=" + this.transactionHash + ", transactionTime=" + this.transactionTime + ", transactionRate=" + this.transactionRate + ", exploreUrl=" + this.exploreUrl + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailTransactionInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LimitOrderDetailTransactionInfo> serializer() {
            return LimitOrderDetailTransactionInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LimitOrderDetailTransactionInfo(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.transactionPrice = "";
        } else {
            this.transactionPrice = str;
        }
        if ((i & 2) == 0) {
            this.transactionHash = "";
        } else {
            this.transactionHash = str2;
        }
        if ((i & 4) == 0) {
            this.transactionTime = "";
        } else {
            this.transactionTime = str3;
        }
        if ((i & 8) == 0) {
            this.transactionRate = "";
        } else {
            this.transactionRate = str4;
        }
        if ((i & 16) == 0) {
            this.exploreUrl = "";
        } else {
            this.exploreUrl = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(LimitOrderDetailTransactionInfo limitOrderDetailTransactionInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) limitOrderDetailTransactionInfo.transactionPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, limitOrderDetailTransactionInfo.transactionPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) limitOrderDetailTransactionInfo.transactionHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, limitOrderDetailTransactionInfo.transactionHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) limitOrderDetailTransactionInfo.transactionTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, limitOrderDetailTransactionInfo.transactionTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) limitOrderDetailTransactionInfo.transactionRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, limitOrderDetailTransactionInfo.transactionRate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) limitOrderDetailTransactionInfo.exploreUrl, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, limitOrderDetailTransactionInfo.exploreUrl);
    }

    public LimitOrderDetailTransactionInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.transactionPrice = str;
        this.transactionHash = str2;
        this.transactionTime = str3;
        this.transactionRate = str4;
        this.exploreUrl = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:290) call: com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailTransactionInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LimitOrderDetailTransactionInfo(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
