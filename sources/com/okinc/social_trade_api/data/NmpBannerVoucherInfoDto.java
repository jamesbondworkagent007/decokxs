package com.okinc.social_trade_api.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class NmpBannerVoucherInfoDto {
    private final String amount;
    private final AprVoucherDto aprVoucher;
    private final String batchNo;
    private final LossVoucherDto lossVoucher;
    private final String remainCount;
    private final String unit;
    private final String voucherPnlRatio;
    private final String voucherType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NmpBannerVoucherInfoDto() {
        this((String) null, (String) null, (String) null, (AprVoucherDto) null, (String) null, (LossVoucherDto) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.batchNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.remainCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.voucherType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AprVoucherDto component4() {
        return this.aprVoucher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.voucherPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LossVoucherDto component6() {
        return this.lossVoucher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NmpBannerVoucherInfoDto copy(@NotNull String str, @NotNull String str2, @NotNull String str3, AprVoucherDto aprVoucherDto, @NotNull String str4, LossVoucherDto lossVoucherDto, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new NmpBannerVoucherInfoDto(str, str2, str3, aprVoucherDto, str4, lossVoucherDto, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NmpBannerVoucherInfoDto)) {
            return false;
        }
        NmpBannerVoucherInfoDto nmpBannerVoucherInfoDto = (NmpBannerVoucherInfoDto) obj;
        return Intrinsics.EZpvd((Object) this.batchNo, (Object) nmpBannerVoucherInfoDto.batchNo) && Intrinsics.EZpvd((Object) this.remainCount, (Object) nmpBannerVoucherInfoDto.remainCount) && Intrinsics.EZpvd((Object) this.voucherType, (Object) nmpBannerVoucherInfoDto.voucherType) && Intrinsics.EZpvd(this.aprVoucher, nmpBannerVoucherInfoDto.aprVoucher) && Intrinsics.EZpvd((Object) this.voucherPnlRatio, (Object) nmpBannerVoucherInfoDto.voucherPnlRatio) && Intrinsics.EZpvd(this.lossVoucher, nmpBannerVoucherInfoDto.lossVoucher) && Intrinsics.EZpvd((Object) this.amount, (Object) nmpBannerVoucherInfoDto.amount) && Intrinsics.EZpvd((Object) this.unit, (Object) nmpBannerVoucherInfoDto.unit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AprVoucherDto getAprVoucher() {
        return this.aprVoucher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBatchNo() {
        return this.batchNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LossVoucherDto getLossVoucher() {
        return this.lossVoucher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemainCount() {
        return this.remainCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVoucherPnlRatio() {
        return this.voucherPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVoucherType() {
        return this.voucherType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.batchNo.hashCode();
        int iHashCode2 = this.remainCount.hashCode();
        int iHashCode3 = this.voucherType.hashCode();
        AprVoucherDto aprVoucherDto = this.aprVoucher;
        int iHashCode4 = aprVoucherDto == null ? 0 : aprVoucherDto.hashCode();
        int iHashCode5 = this.voucherPnlRatio.hashCode();
        LossVoucherDto lossVoucherDto = this.lossVoucher;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (lossVoucherDto != null ? lossVoucherDto.hashCode() : 0)) * 31) + this.amount.hashCode()) * 31) + this.unit.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NmpBannerVoucherInfoDto(batchNo=" + this.batchNo + ", remainCount=" + this.remainCount + ", voucherType=" + this.voucherType + ", aprVoucher=" + this.aprVoucher + ", voucherPnlRatio=" + this.voucherPnlRatio + ", lossVoucher=" + this.lossVoucher + ", amount=" + this.amount + ", unit=" + this.unit + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.social_trade_api.data.NmpBannerVoucherInfoDto.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NmpBannerVoucherInfoDto> serializer() {
            return NmpBannerVoucherInfoDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NmpBannerVoucherInfoDto(int i, String str, String str2, String str3, AprVoucherDto aprVoucherDto, String str4, LossVoucherDto lossVoucherDto, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.batchNo = "";
        } else {
            this.batchNo = str;
        }
        if ((i & 2) == 0) {
            this.remainCount = "";
        } else {
            this.remainCount = str2;
        }
        if ((i & 4) == 0) {
            this.voucherType = "";
        } else {
            this.voucherType = str3;
        }
        if ((i & 8) == 0) {
            this.aprVoucher = null;
        } else {
            this.aprVoucher = aprVoucherDto;
        }
        if ((i & 16) == 0) {
            this.voucherPnlRatio = "";
        } else {
            this.voucherPnlRatio = str4;
        }
        if ((i & 32) == 0) {
            this.lossVoucher = null;
        } else {
            this.lossVoucher = lossVoucherDto;
        }
        if ((i & 64) == 0) {
            this.amount = "";
        } else {
            this.amount = str5;
        }
        if ((i & 128) == 0) {
            this.unit = "";
        } else {
            this.unit = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKSocialTrading_trading_eco_api(NmpBannerVoucherInfoDto nmpBannerVoucherInfoDto, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) nmpBannerVoucherInfoDto.batchNo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, nmpBannerVoucherInfoDto.batchNo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) nmpBannerVoucherInfoDto.remainCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, nmpBannerVoucherInfoDto.remainCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) nmpBannerVoucherInfoDto.voucherType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, nmpBannerVoucherInfoDto.voucherType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || nmpBannerVoucherInfoDto.aprVoucher != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, AprVoucherDto$$serializer.INSTANCE, nmpBannerVoucherInfoDto.aprVoucher);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) nmpBannerVoucherInfoDto.voucherPnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, nmpBannerVoucherInfoDto.voucherPnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || nmpBannerVoucherInfoDto.lossVoucher != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LossVoucherDto$$serializer.INSTANCE, nmpBannerVoucherInfoDto.lossVoucher);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) nmpBannerVoucherInfoDto.amount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, nmpBannerVoucherInfoDto.amount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) nmpBannerVoucherInfoDto.unit, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, nmpBannerVoucherInfoDto.unit);
    }

    public NmpBannerVoucherInfoDto(@NotNull String str, @NotNull String str2, @NotNull String str3, AprVoucherDto aprVoucherDto, @NotNull String str4, LossVoucherDto lossVoucherDto, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.batchNo = str;
        this.remainCount = str2;
        this.voucherType = str3;
        this.aprVoucher = aprVoucherDto;
        this.voucherPnlRatio = str4;
        this.lossVoucher = lossVoucherDto;
        this.amount = str5;
        this.unit = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:com.okinc.social_trade_api.data.AprVoucherDto:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.social_trade_api.data.AprVoucherDto) : (r13v0 com.okinc.social_trade_api.data.AprVoucherDto))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:com.okinc.social_trade_api.data.LossVoucherDto:?: TERNARY null = ((wrap:int:0x0028: ARITH (r18v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r15v0 com.okinc.social_trade_api.data.LossVoucherDto) : (null com.okinc.social_trade_api.data.LossVoucherDto))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.social_trade_api.data.AprVoucherDto, java.lang.String, com.okinc.social_trade_api.data.LossVoucherDto, java.lang.String, java.lang.String):void (m)] (LINE:66) call: com.okinc.social_trade_api.data.NmpBannerVoucherInfoDto.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.social_trade_api.data.AprVoucherDto, java.lang.String, com.okinc.social_trade_api.data.LossVoucherDto, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NmpBannerVoucherInfoDto(String str, String str2, String str3, AprVoucherDto aprVoucherDto, String str4, LossVoucherDto lossVoucherDto, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : aprVoucherDto, (i & 16) != 0 ? "" : str4, (i & 32) == 0 ? lossVoucherDto : null, (i & 64) != 0 ? "" : str5, (i & 128) == 0 ? str6 : "");
    }
}
