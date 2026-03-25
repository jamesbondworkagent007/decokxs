package com.okinc.business.dexlogic.bean;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class MemeSimpleDexData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chainId;
    private final String fromAmount;
    private final String fromTokenSymbol;
    private final String orderId;
    private final Boolean sentSimpleVersion;
    private final String status;
    private final String toAmount;
    private final String toTokenSymbol;
    private final String transactionHash;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MemeSimpleDexData() {
        this((String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.transactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.sentSimpleVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.fromTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.toTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeSimpleDexData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, Boolean bool, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new MemeSimpleDexData(str, str2, str3, str4, bool, str5, str6, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemeSimpleDexData)) {
            return false;
        }
        MemeSimpleDexData memeSimpleDexData = (MemeSimpleDexData) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) memeSimpleDexData.chainId) && Intrinsics.EZpvd((Object) this.orderId, (Object) memeSimpleDexData.orderId) && Intrinsics.EZpvd((Object) this.status, (Object) memeSimpleDexData.status) && Intrinsics.EZpvd((Object) this.transactionHash, (Object) memeSimpleDexData.transactionHash) && Intrinsics.EZpvd(this.sentSimpleVersion, memeSimpleDexData.sentSimpleVersion) && Intrinsics.EZpvd((Object) this.fromAmount, (Object) memeSimpleDexData.fromAmount) && Intrinsics.EZpvd((Object) this.fromTokenSymbol, (Object) memeSimpleDexData.fromTokenSymbol) && Intrinsics.EZpvd((Object) this.toAmount, (Object) memeSimpleDexData.toAmount) && Intrinsics.EZpvd((Object) this.toTokenSymbol, (Object) memeSimpleDexData.toTokenSymbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAmount() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenSymbol() {
        return this.fromTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSentSimpleVersion() {
        return this.sentSimpleVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAmount() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenSymbol() {
        return this.toTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionHash() {
        return this.transactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainId.hashCode();
        int iHashCode2 = this.orderId.hashCode();
        int iHashCode3 = this.status.hashCode();
        int iHashCode4 = this.transactionHash.hashCode();
        Boolean bool = this.sentSimpleVersion;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool == null ? 0 : bool.hashCode())) * 31) + this.fromAmount.hashCode()) * 31) + this.fromTokenSymbol.hashCode()) * 31) + this.toAmount.hashCode()) * 31) + this.toTokenSymbol.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeSimpleDexData(chainId=" + this.chainId + ", orderId=" + this.orderId + ", status=" + this.status + ", transactionHash=" + this.transactionHash + ", sentSimpleVersion=" + this.sentSimpleVersion + ", fromAmount=" + this.fromAmount + ", fromTokenSymbol=" + this.fromTokenSymbol + ", toAmount=" + this.toAmount + ", toTokenSymbol=" + this.toTokenSymbol + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.MemeSimpleDexData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MemeSimpleDexData> serializer() {
            return MemeSimpleDexData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MemeSimpleDexData(int i, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str2;
        }
        if ((i & 4) == 0) {
            this.status = "";
        } else {
            this.status = str3;
        }
        if ((i & 8) == 0) {
            this.transactionHash = "";
        } else {
            this.transactionHash = str4;
        }
        if ((i & 16) == 0) {
            this.sentSimpleVersion = null;
        } else {
            this.sentSimpleVersion = bool;
        }
        if ((i & 32) == 0) {
            this.fromAmount = "";
        } else {
            this.fromAmount = str5;
        }
        if ((i & 64) == 0) {
            this.fromTokenSymbol = "";
        } else {
            this.fromTokenSymbol = str6;
        }
        if ((i & 128) == 0) {
            this.toAmount = "";
        } else {
            this.toAmount = str7;
        }
        if ((i & 256) == 0) {
            this.toTokenSymbol = "";
        } else {
            this.toTokenSymbol = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(MemeSimpleDexData memeSimpleDexData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) memeSimpleDexData.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, memeSimpleDexData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) memeSimpleDexData.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, memeSimpleDexData.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) memeSimpleDexData.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, memeSimpleDexData.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) memeSimpleDexData.transactionHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, memeSimpleDexData.transactionHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || memeSimpleDexData.sentSimpleVersion != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, memeSimpleDexData.sentSimpleVersion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) memeSimpleDexData.fromAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, memeSimpleDexData.fromAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) memeSimpleDexData.fromTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, memeSimpleDexData.fromTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) memeSimpleDexData.toAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, memeSimpleDexData.toAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) memeSimpleDexData.toTokenSymbol, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, memeSimpleDexData.toTokenSymbol);
    }

    public MemeSimpleDexData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, Boolean bool, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.chainId = str;
        this.orderId = str2;
        this.status = str3;
        this.transactionHash = str4;
        this.sentSimpleVersion = bool;
        this.fromAmount = str5;
        this.fromTokenSymbol = str6;
        this.toAmount = str7;
        this.toTokenSymbol = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r15v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:25) call: com.okinc.business.dexlogic.bean.MemeSimpleDexData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MemeSimpleDexData(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) == 0 ? str8 : "");
    }
}
