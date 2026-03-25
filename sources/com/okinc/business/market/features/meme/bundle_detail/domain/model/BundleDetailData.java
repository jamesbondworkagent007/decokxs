package com.okinc.business.market.features.meme.bundle_detail.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class BundleDetailData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String bundleAth;
    private final String bundleHoldingRatio;
    private final String bundleHoldingTokenAmount;
    private final String nativeTokenSymbol;
    private final String totalBundledValue;
    private final String totalBundlers;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BundleDetailData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BundleDetailData copy$default(BundleDetailData bundleDetailData, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bundleDetailData.bundleAth;
        }
        if ((i & 2) != 0) {
            str2 = bundleDetailData.bundleHoldingRatio;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = bundleDetailData.bundleHoldingTokenAmount;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = bundleDetailData.nativeTokenSymbol;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = bundleDetailData.totalBundledValue;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = bundleDetailData.totalBundlers;
        }
        return bundleDetailData.copy(str, str7, str8, str9, str10, str6);
    }

    @SerialName("bundleAth")
    public static /* synthetic */ void getBundleAth$annotations() {
    }

    @SerialName("bundleHoldingRatio")
    public static /* synthetic */ void getBundleHoldingRatio$annotations() {
    }

    @SerialName("bundleHoldingTokenAmount")
    public static /* synthetic */ void getBundleHoldingTokenAmount$annotations() {
    }

    @SerialName("nativeTokenSymbol")
    public static /* synthetic */ void getNativeTokenSymbol$annotations() {
    }

    @SerialName("totalBundledValue")
    public static /* synthetic */ void getTotalBundledValue$annotations() {
    }

    @SerialName("totalBundlers")
    public static /* synthetic */ void getTotalBundlers$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.bundleAth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.bundleHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.bundleHoldingTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.nativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.totalBundledValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.totalBundlers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BundleDetailData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new BundleDetailData(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundleDetailData)) {
            return false;
        }
        BundleDetailData bundleDetailData = (BundleDetailData) obj;
        return Intrinsics.EZpvd((Object) this.bundleAth, (Object) bundleDetailData.bundleAth) && Intrinsics.EZpvd((Object) this.bundleHoldingRatio, (Object) bundleDetailData.bundleHoldingRatio) && Intrinsics.EZpvd((Object) this.bundleHoldingTokenAmount, (Object) bundleDetailData.bundleHoldingTokenAmount) && Intrinsics.EZpvd((Object) this.nativeTokenSymbol, (Object) bundleDetailData.nativeTokenSymbol) && Intrinsics.EZpvd((Object) this.totalBundledValue, (Object) bundleDetailData.totalBundledValue) && Intrinsics.EZpvd((Object) this.totalBundlers, (Object) bundleDetailData.totalBundlers);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBundleAth() {
        return this.bundleAth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBundleHoldingRatio() {
        return this.bundleHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBundleHoldingTokenAmount() {
        return this.bundleHoldingTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenSymbol() {
        return this.nativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalBundledValue() {
        return this.totalBundledValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalBundlers() {
        return this.totalBundlers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.bundleAth.hashCode() * 31) + this.bundleHoldingRatio.hashCode()) * 31) + this.bundleHoldingTokenAmount.hashCode()) * 31) + this.nativeTokenSymbol.hashCode()) * 31) + this.totalBundledValue.hashCode()) * 31) + this.totalBundlers.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BundleDetailData(bundleAth=" + this.bundleAth + ", bundleHoldingRatio=" + this.bundleHoldingRatio + ", bundleHoldingTokenAmount=" + this.bundleHoldingTokenAmount + ", nativeTokenSymbol=" + this.nativeTokenSymbol + ", totalBundledValue=" + this.totalBundledValue + ", totalBundlers=" + this.totalBundlers + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.bundle_detail.domain.model.BundleDetailData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BundleDetailData> serializer() {
            return BundleDetailData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BundleDetailData(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.bundleAth = "";
        } else {
            this.bundleAth = str;
        }
        if ((i & 2) == 0) {
            this.bundleHoldingRatio = "";
        } else {
            this.bundleHoldingRatio = str2;
        }
        if ((i & 4) == 0) {
            this.bundleHoldingTokenAmount = "";
        } else {
            this.bundleHoldingTokenAmount = str3;
        }
        if ((i & 8) == 0) {
            this.nativeTokenSymbol = "";
        } else {
            this.nativeTokenSymbol = str4;
        }
        if ((i & 16) == 0) {
            this.totalBundledValue = "";
        } else {
            this.totalBundledValue = str5;
        }
        if ((i & 32) == 0) {
            this.totalBundlers = "";
        } else {
            this.totalBundlers = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(BundleDetailData bundleDetailData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) bundleDetailData.bundleAth, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, bundleDetailData.bundleAth);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) bundleDetailData.bundleHoldingRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, bundleDetailData.bundleHoldingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) bundleDetailData.bundleHoldingTokenAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, bundleDetailData.bundleHoldingTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) bundleDetailData.nativeTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, bundleDetailData.nativeTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) bundleDetailData.totalBundledValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, bundleDetailData.totalBundledValue);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) bundleDetailData.totalBundlers, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, bundleDetailData.totalBundlers);
    }

    public BundleDetailData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.bundleAth = str;
        this.bundleHoldingRatio = str2;
        this.bundleHoldingTokenAmount = str3;
        this.nativeTokenSymbol = str4;
        this.totalBundledValue = str5;
        this.totalBundlers = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:9) call: com.okinc.business.market.features.meme.bundle_detail.domain.model.BundleDetailData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BundleDetailData(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
