package com.okinc.business.trade.features.home.ui.cefi.data;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class LimitPairRateRequest {
    private final long chainId;
    private final List<String> dexIds;
    private final String fromAmount;
    private final String fromTokenAddress;
    private final String refCode;
    private final String toTokenAddress;
    private final String userWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component6() {
        return this.dexIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.refCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitPairRateRequest copy(long j, @NotNull String str, @NotNull String str2, String str3, String str4, List<String> list, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new LimitPairRateRequest(j, str, str2, str3, str4, list, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitPairRateRequest)) {
            return false;
        }
        LimitPairRateRequest limitPairRateRequest = (LimitPairRateRequest) obj;
        return this.chainId == limitPairRateRequest.chainId && Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) limitPairRateRequest.fromTokenAddress) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) limitPairRateRequest.toTokenAddress) && Intrinsics.EZpvd((Object) this.fromAmount, (Object) limitPairRateRequest.fromAmount) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) limitPairRateRequest.userWalletAddress) && Intrinsics.EZpvd(this.dexIds, limitPairRateRequest.dexIds) && Intrinsics.EZpvd((Object) this.refCode, (Object) limitPairRateRequest.refCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getDexIds() {
        return this.dexIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAmount() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRefCode() {
        return this.refCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.chainId);
        int iHashCode2 = this.fromTokenAddress.hashCode();
        int iHashCode3 = this.toTokenAddress.hashCode();
        String str = this.fromAmount;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.userWalletAddress;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        List<String> list = this.dexIds;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        String str3 = this.refCode;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LimitPairRateRequest(chainId=" + this.chainId + ", fromTokenAddress=" + this.fromTokenAddress + ", toTokenAddress=" + this.toTokenAddress + ", fromAmount=" + this.fromAmount + ", userWalletAddress=" + this.userWalletAddress + ", dexIds=" + this.dexIds + ", refCode=" + this.refCode + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.data.LimitPairRateRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LimitPairRateRequest> serializer() {
            return LimitPairRateRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LimitPairRateRequest(int i, long j, String str, String str2, String str3, String str4, List list, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, LimitPairRateRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.chainId = j;
        this.fromTokenAddress = str;
        this.toTokenAddress = str2;
        if ((i & 8) == 0) {
            this.fromAmount = "";
        } else {
            this.fromAmount = str3;
        }
        if ((i & 16) == 0) {
            this.userWalletAddress = "";
        } else {
            this.userWalletAddress = str4;
        }
        if ((i & 32) == 0) {
            this.dexIds = null;
        } else {
            this.dexIds = list;
        }
        if ((i & 64) == 0) {
            this.refCode = "";
        } else {
            this.refCode = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(LimitPairRateRequest limitPairRateRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeLongElement(serialDescriptor, 0, limitPairRateRequest.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, limitPairRateRequest.fromTokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, limitPairRateRequest.toTokenAddress);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) limitPairRateRequest.fromAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, limitPairRateRequest.fromAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) limitPairRateRequest.userWalletAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, limitPairRateRequest.userWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || limitPairRateRequest.dexIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], limitPairRateRequest.dexIds);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) limitPairRateRequest.refCode, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, limitPairRateRequest.refCode);
    }

    public LimitPairRateRequest(long j, @NotNull String str, @NotNull String str2, String str3, String str4, List<String> list, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.chainId = j;
        this.fromTokenAddress = str;
        this.toTokenAddress = str2;
        this.fromAmount = str3;
        this.userWalletAddress = str4;
        this.dexIds = list;
        this.refCode = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (r12v0 long)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r18v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String):void (m)] (LINE:134) call: com.okinc.business.trade.features.home.ui.cefi.data.LimitPairRateRequest.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ LimitPairRateRequest(long j, String str, String str2, String str3, String str4, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : list, (i & 64) != 0 ? "" : str5);
    }
}
