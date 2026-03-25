package com.okinc.business.dex.tee.domain.model;

import com.okinc.business.dexlogic.main.swap.trade.referral.data.ReferralParam;
import com.okinc.business.dexlogic.main.swap.trade.referral.data.ReferralParam$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class PlaceOrderParams {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Boolean enableJito;
    private final String gasPrice;
    private final String gasUsed;
    private final String maxSlippage;
    private final String mevInfo;
    private final String priorityFee;
    private final String priorityFeeType;
    private final ReferralParam refParam;
    private final String routerModeType;
    private final Preset sellPresetForTPSL;
    private final String slippage;
    private final String slippageType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PlaceOrderParams() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (Preset) null, (ReferralParam) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Preset component11() {
        return this.sellPresetForTPSL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReferralParam component12() {
        return this.refParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.priorityFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.enableJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.gasUsed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.mevInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlaceOrderParams copy(String str, @NotNull String str2, @NotNull String str3, String str4, @NotNull String str5, Boolean bool, @NotNull String str6, String str7, @NotNull String str8, @NotNull String str9, Preset preset, @NotNull ReferralParam referralParam) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(referralParam, "");
        return new PlaceOrderParams(str, str2, str3, str4, str5, bool, str6, str7, str8, str9, preset, referralParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceOrderParams)) {
            return false;
        }
        PlaceOrderParams placeOrderParams = (PlaceOrderParams) obj;
        return Intrinsics.EZpvd((Object) this.maxSlippage, (Object) placeOrderParams.maxSlippage) && Intrinsics.EZpvd((Object) this.priorityFeeType, (Object) placeOrderParams.priorityFeeType) && Intrinsics.EZpvd((Object) this.priorityFee, (Object) placeOrderParams.priorityFee) && Intrinsics.EZpvd((Object) this.routerModeType, (Object) placeOrderParams.routerModeType) && Intrinsics.EZpvd((Object) this.gasPrice, (Object) placeOrderParams.gasPrice) && Intrinsics.EZpvd(this.enableJito, placeOrderParams.enableJito) && Intrinsics.EZpvd((Object) this.gasUsed, (Object) placeOrderParams.gasUsed) && Intrinsics.EZpvd((Object) this.mevInfo, (Object) placeOrderParams.mevInfo) && Intrinsics.EZpvd((Object) this.slippageType, (Object) placeOrderParams.slippageType) && Intrinsics.EZpvd((Object) this.slippage, (Object) placeOrderParams.slippage) && Intrinsics.EZpvd(this.sellPresetForTPSL, placeOrderParams.sellPresetForTPSL) && Intrinsics.EZpvd(this.refParam, placeOrderParams.refParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getEnableJito() {
        return this.enableJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasUsed() {
        return this.gasUsed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSlippage() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMevInfo() {
        return this.mevInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFeeType() {
        return this.priorityFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReferralParam getRefParam() {
        return this.refParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRouterModeType() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Preset getSellPresetForTPSL() {
        return this.sellPresetForTPSL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippageType() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.maxSlippage;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.priorityFeeType.hashCode();
        int iHashCode3 = this.priorityFee.hashCode();
        String str2 = this.routerModeType;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        int iHashCode5 = this.gasPrice.hashCode();
        Boolean bool = this.enableJito;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        int iHashCode7 = this.gasUsed.hashCode();
        String str3 = this.mevInfo;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        int iHashCode9 = this.slippageType.hashCode();
        int iHashCode10 = this.slippage.hashCode();
        Preset preset = this.sellPresetForTPSL;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (preset != null ? preset.hashCode() : 0)) * 31) + this.refParam.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PlaceOrderParams(maxSlippage=" + this.maxSlippage + ", priorityFeeType=" + this.priorityFeeType + ", priorityFee=" + this.priorityFee + ", routerModeType=" + this.routerModeType + ", gasPrice=" + this.gasPrice + ", enableJito=" + this.enableJito + ", gasUsed=" + this.gasUsed + ", mevInfo=" + this.mevInfo + ", slippageType=" + this.slippageType + ", slippage=" + this.slippage + ", sellPresetForTPSL=" + this.sellPresetForTPSL + ", refParam=" + this.refParam + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.tee.domain.model.PlaceOrderParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PlaceOrderParams> serializer() {
            return PlaceOrderParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PlaceOrderParams(int i, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, Preset preset, ReferralParam referralParam, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.maxSlippage = null;
        } else {
            this.maxSlippage = str;
        }
        if ((i & 2) == 0) {
            this.priorityFeeType = "";
        } else {
            this.priorityFeeType = str2;
        }
        if ((i & 4) == 0) {
            this.priorityFee = "";
        } else {
            this.priorityFee = str3;
        }
        if ((i & 8) == 0) {
            this.routerModeType = null;
        } else {
            this.routerModeType = str4;
        }
        if ((i & 16) == 0) {
            this.gasPrice = "";
        } else {
            this.gasPrice = str5;
        }
        if ((i & 32) == 0) {
            this.enableJito = null;
        } else {
            this.enableJito = bool;
        }
        if ((i & 64) == 0) {
            this.gasUsed = "";
        } else {
            this.gasUsed = str6;
        }
        if ((i & 128) == 0) {
            this.mevInfo = null;
        } else {
            this.mevInfo = str7;
        }
        if ((i & 256) == 0) {
            this.slippageType = "";
        } else {
            this.slippageType = str8;
        }
        if ((i & 512) == 0) {
            this.slippage = "";
        } else {
            this.slippage = str9;
        }
        if ((i & 1024) == 0) {
            this.sellPresetForTPSL = null;
        } else {
            this.sellPresetForTPSL = preset;
        }
        if ((i & 2048) == 0) {
            this.refParam = new ReferralParam((String) null, (String) null, 3, (DefaultConstructorMarker) null);
        } else {
            this.refParam = referralParam;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(PlaceOrderParams placeOrderParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || placeOrderParams.maxSlippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, placeOrderParams.maxSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) placeOrderParams.priorityFeeType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, placeOrderParams.priorityFeeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) placeOrderParams.priorityFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, placeOrderParams.priorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || placeOrderParams.routerModeType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, placeOrderParams.routerModeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) placeOrderParams.gasPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, placeOrderParams.gasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || placeOrderParams.enableJito != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, placeOrderParams.enableJito);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) placeOrderParams.gasUsed, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, placeOrderParams.gasUsed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || placeOrderParams.mevInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, placeOrderParams.mevInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) placeOrderParams.slippageType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, placeOrderParams.slippageType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) placeOrderParams.slippage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, placeOrderParams.slippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || placeOrderParams.sellPresetForTPSL != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, Preset$$serializer.INSTANCE, placeOrderParams.sellPresetForTPSL);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && Intrinsics.EZpvd(placeOrderParams.refParam, new ReferralParam((String) null, (String) null, 3, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 11, ReferralParam$$serializer.INSTANCE, placeOrderParams.refParam);
    }

    public PlaceOrderParams(String str, @NotNull String str2, @NotNull String str3, String str4, @NotNull String str5, Boolean bool, @NotNull String str6, String str7, @NotNull String str8, @NotNull String str9, Preset preset, @NotNull ReferralParam referralParam) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(referralParam, "");
        this.maxSlippage = str;
        this.priorityFeeType = str2;
        this.priorityFee = str3;
        this.routerModeType = str4;
        this.gasPrice = str5;
        this.enableJito = bool;
        this.gasUsed = str6;
        this.mevInfo = str7;
        this.slippageType = str8;
        this.slippage = str9;
        this.sellPresetForTPSL = preset;
        this.refParam = referralParam;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0081: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002c: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r20v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r27v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r24v0 java.lang.String) : (""))
  (wrap:com.okinc.business.dex.tee.domain.model.Preset:?: TERNARY null = ((wrap:int:0x0053: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.tee.domain.model.Preset) : (r25v0 com.okinc.business.dex.tee.domain.model.Preset))
  (wrap:com.okinc.business.dexlogic.main.swap.trade.referral.data.ReferralParam:?: TERNARY null = ((wrap:int:0x005b: ARITH (r27v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0062: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:178) call: com.okinc.business.dexlogic.main.swap.trade.referral.data.ReferralParam.<init>(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r26v0 com.okinc.business.dexlogic.main.swap.trade.referral.data.ReferralParam))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.tee.domain.model.Preset, com.okinc.business.dexlogic.main.swap.trade.referral.data.ReferralParam):void (m)] (LINE:166) call: com.okinc.business.dex.tee.domain.model.PlaceOrderParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.tee.domain.model.Preset, com.okinc.business.dexlogic.main.swap.trade.referral.data.ReferralParam):void type: THIS */
    public /* synthetic */ PlaceOrderParams(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, String str9, Preset preset, ReferralParam referralParam, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? "" : str8, (i & 512) == 0 ? str9 : "", (i & 1024) != 0 ? null : preset, (i & 2048) != 0 ? new ReferralParam((String) null, (String) null, 3, (DefaultConstructorMarker) null) : referralParam);
    }
}
