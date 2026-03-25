package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class AdjustLeverRequiredData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String availQuoteTransfer;
    private final String availTransfer;
    private final String existOrd;
    private final String liqPx;
    private final String margin;
    private final String maxAmount;
    private final String maxLevel;
    private final String minLevel;
    private final String quoteMargin;
    private final String quoteMaxAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AdjustLeverRequiredData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.maxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.existOrd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.quoteMaxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.margin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.quoteMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.availTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.availQuoteTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.liqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.minLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.maxLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdjustLeverRequiredData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new AdjustLeverRequiredData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdjustLeverRequiredData)) {
            return false;
        }
        AdjustLeverRequiredData adjustLeverRequiredData = (AdjustLeverRequiredData) obj;
        return Intrinsics.EZpvd((Object) this.maxAmount, (Object) adjustLeverRequiredData.maxAmount) && Intrinsics.EZpvd((Object) this.quoteMaxAmount, (Object) adjustLeverRequiredData.quoteMaxAmount) && Intrinsics.EZpvd((Object) this.margin, (Object) adjustLeverRequiredData.margin) && Intrinsics.EZpvd((Object) this.quoteMargin, (Object) adjustLeverRequiredData.quoteMargin) && Intrinsics.EZpvd((Object) this.availTransfer, (Object) adjustLeverRequiredData.availTransfer) && Intrinsics.EZpvd((Object) this.availQuoteTransfer, (Object) adjustLeverRequiredData.availQuoteTransfer) && Intrinsics.EZpvd((Object) this.liqPx, (Object) adjustLeverRequiredData.liqPx) && Intrinsics.EZpvd((Object) this.minLevel, (Object) adjustLeverRequiredData.minLevel) && Intrinsics.EZpvd((Object) this.maxLevel, (Object) adjustLeverRequiredData.maxLevel) && Intrinsics.EZpvd((Object) this.existOrd, (Object) adjustLeverRequiredData.existOrd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailQuoteTransfer() {
        return this.availQuoteTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailTransfer() {
        return this.availTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExistOrd() {
        return this.existOrd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiqPx() {
        return this.liqPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMargin() {
        return this.margin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxAmount() {
        return this.maxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxLevel() {
        return this.maxLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinLevel() {
        return this.minLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteMargin() {
        return this.quoteMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteMaxAmount() {
        return this.quoteMaxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.maxAmount.hashCode() * 31) + this.quoteMaxAmount.hashCode()) * 31) + this.margin.hashCode()) * 31) + this.quoteMargin.hashCode()) * 31) + this.availTransfer.hashCode()) * 31) + this.availQuoteTransfer.hashCode()) * 31) + this.liqPx.hashCode()) * 31) + this.minLevel.hashCode()) * 31) + this.maxLevel.hashCode()) * 31) + this.existOrd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AdjustLeverRequiredData(maxAmount=" + this.maxAmount + ", quoteMaxAmount=" + this.quoteMaxAmount + ", margin=" + this.margin + ", quoteMargin=" + this.quoteMargin + ", availTransfer=" + this.availTransfer + ", availQuoteTransfer=" + this.availQuoteTransfer + ", liqPx=" + this.liqPx + ", minLevel=" + this.minLevel + ", maxLevel=" + this.maxLevel + ", existOrd=" + this.existOrd + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.AdjustLeverRequiredData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AdjustLeverRequiredData> serializer() {
            return AdjustLeverRequiredData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AdjustLeverRequiredData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.maxAmount = "";
        } else {
            this.maxAmount = str;
        }
        if ((i & 2) == 0) {
            this.quoteMaxAmount = "";
        } else {
            this.quoteMaxAmount = str2;
        }
        if ((i & 4) == 0) {
            this.margin = "";
        } else {
            this.margin = str3;
        }
        if ((i & 8) == 0) {
            this.quoteMargin = "";
        } else {
            this.quoteMargin = str4;
        }
        if ((i & 16) == 0) {
            this.availTransfer = "";
        } else {
            this.availTransfer = str5;
        }
        if ((i & 32) == 0) {
            this.availQuoteTransfer = "";
        } else {
            this.availQuoteTransfer = str6;
        }
        if ((i & 64) == 0) {
            this.liqPx = "";
        } else {
            this.liqPx = str7;
        }
        if ((i & 128) == 0) {
            this.minLevel = "";
        } else {
            this.minLevel = str8;
        }
        if ((i & 256) == 0) {
            this.maxLevel = "";
        } else {
            this.maxLevel = str9;
        }
        if ((i & 512) == 0) {
            this.existOrd = "";
        } else {
            this.existOrd = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(AdjustLeverRequiredData adjustLeverRequiredData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) adjustLeverRequiredData.maxAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, adjustLeverRequiredData.maxAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) adjustLeverRequiredData.quoteMaxAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, adjustLeverRequiredData.quoteMaxAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) adjustLeverRequiredData.margin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, adjustLeverRequiredData.margin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) adjustLeverRequiredData.quoteMargin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, adjustLeverRequiredData.quoteMargin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) adjustLeverRequiredData.availTransfer, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, adjustLeverRequiredData.availTransfer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) adjustLeverRequiredData.availQuoteTransfer, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, adjustLeverRequiredData.availQuoteTransfer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) adjustLeverRequiredData.liqPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, adjustLeverRequiredData.liqPx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) adjustLeverRequiredData.minLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, adjustLeverRequiredData.minLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) adjustLeverRequiredData.maxLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, adjustLeverRequiredData.maxLevel);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) adjustLeverRequiredData.existOrd, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, adjustLeverRequiredData.existOrd);
    }

    public AdjustLeverRequiredData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.maxAmount = str;
        this.quoteMaxAmount = str2;
        this.margin = str3;
        this.quoteMargin = str4;
        this.availTransfer = str5;
        this.availQuoteTransfer = str6;
        this.liqPx = str7;
        this.minLevel = str8;
        this.maxLevel = str9;
        this.existOrd = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:151) call: com.okinc.unify_trade.biz.AdjustLeverRequiredData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AdjustLeverRequiredData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) == 0 ? str10 : "");
    }
}
