package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.VoucherStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C55800xql;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TacticsVoucherInfo implements Parcelable {
    public static final int $stable = 0;
    private final String algoId;
    private final String amount;
    private final String bonusPeriod;
    private final String principalAmount;
    private final String status;
    private final String todayBonusAmount;
    private final String totalBonusAmount;
    private final String unit;
    private final String voucherId;
    private final String voucherPnlRatio;
    private final TacticsVoucherType voucherType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TacticsVoucherInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TacticsVoucherInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsVoucherInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TacticsVoucherInfo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TacticsVoucherType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsVoucherInfo[] newArray(int i) {
            return new TacticsVoucherInfo[i];
        }
    }

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TacticsVoucherType.values().length];
            try {
                iArr[TacticsVoucherType.INTEREST_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TacticsVoucherType.STRATEGY_COMPENSATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TacticsVoucherType.AIRDROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TacticsVoucherInfo() {
        this((String) null, (String) null, (TacticsVoucherType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    @Serializable(with = C55800xql.class)
    public static /* synthetic */ void getVoucherType$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.voucherId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsVoucherType component3() {
        return this.voucherType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.voucherPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.bonusPeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.todayBonusAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.totalBonusAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.principalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsVoucherInfo copy(@NotNull String str, @NotNull String str2, TacticsVoucherType tacticsVoucherType, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
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
        return new TacticsVoucherInfo(str, str2, tacticsVoucherType, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TacticsVoucherInfo)) {
            return false;
        }
        TacticsVoucherInfo tacticsVoucherInfo = (TacticsVoucherInfo) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) tacticsVoucherInfo.algoId) && Intrinsics.EZpvd((Object) this.voucherId, (Object) tacticsVoucherInfo.voucherId) && this.voucherType == tacticsVoucherInfo.voucherType && Intrinsics.EZpvd((Object) this.status, (Object) tacticsVoucherInfo.status) && Intrinsics.EZpvd((Object) this.voucherPnlRatio, (Object) tacticsVoucherInfo.voucherPnlRatio) && Intrinsics.EZpvd((Object) this.bonusPeriod, (Object) tacticsVoucherInfo.bonusPeriod) && Intrinsics.EZpvd((Object) this.todayBonusAmount, (Object) tacticsVoucherInfo.todayBonusAmount) && Intrinsics.EZpvd((Object) this.totalBonusAmount, (Object) tacticsVoucherInfo.totalBonusAmount) && Intrinsics.EZpvd((Object) this.principalAmount, (Object) tacticsVoucherInfo.principalAmount) && Intrinsics.EZpvd((Object) this.amount, (Object) tacticsVoucherInfo.amount) && Intrinsics.EZpvd((Object) this.unit, (Object) tacticsVoucherInfo.unit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBonusPeriod() {
        return this.bonusPeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrincipalAmount() {
        return this.principalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTodayBonusAmount() {
        return this.todayBonusAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalBonusAmount() {
        return this.totalBonusAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVoucherId() {
        return this.voucherId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVoucherPnlRatio() {
        return this.voucherPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsVoucherType getVoucherType() {
        return this.voucherType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.algoId.hashCode();
        int iHashCode2 = this.voucherId.hashCode();
        TacticsVoucherType tacticsVoucherType = this.voucherType;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + (tacticsVoucherType == null ? 0 : tacticsVoucherType.hashCode())) * 31) + this.status.hashCode()) * 31) + this.voucherPnlRatio.hashCode()) * 31) + this.bonusPeriod.hashCode()) * 31) + this.todayBonusAmount.hashCode()) * 31) + this.totalBonusAmount.hashCode()) * 31) + this.principalAmount.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.unit.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TacticsVoucherInfo(algoId=" + this.algoId + ", voucherId=" + this.voucherId + ", voucherType=" + this.voucherType + ", status=" + this.status + ", voucherPnlRatio=" + this.voucherPnlRatio + ", bonusPeriod=" + this.bonusPeriod + ", todayBonusAmount=" + this.todayBonusAmount + ", totalBonusAmount=" + this.totalBonusAmount + ", principalAmount=" + this.principalAmount + ", amount=" + this.amount + ", unit=" + this.unit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeString(this.voucherId);
        TacticsVoucherType tacticsVoucherType = this.voucherType;
        if (tacticsVoucherType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tacticsVoucherType.writeToParcel(parcel, i);
        }
        parcel.writeString(this.status);
        parcel.writeString(this.voucherPnlRatio);
        parcel.writeString(this.bonusPeriod);
        parcel.writeString(this.todayBonusAmount);
        parcel.writeString(this.totalBonusAmount);
        parcel.writeString(this.principalAmount);
        parcel.writeString(this.amount);
        parcel.writeString(this.unit);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TacticsVoucherInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TacticsVoucherInfo> serializer() {
            return TacticsVoucherInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TacticsVoucherInfo(int i, String str, String str2, TacticsVoucherType tacticsVoucherType, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.algoId = "";
        } else {
            this.algoId = str;
        }
        if ((i & 2) == 0) {
            this.voucherId = "";
        } else {
            this.voucherId = str2;
        }
        if ((i & 4) == 0) {
            this.voucherType = null;
        } else {
            this.voucherType = tacticsVoucherType;
        }
        if ((i & 8) == 0) {
            this.status = "";
        } else {
            this.status = str3;
        }
        if ((i & 16) == 0) {
            this.voucherPnlRatio = "";
        } else {
            this.voucherPnlRatio = str4;
        }
        if ((i & 32) == 0) {
            this.bonusPeriod = "";
        } else {
            this.bonusPeriod = str5;
        }
        if ((i & 64) == 0) {
            this.todayBonusAmount = "";
        } else {
            this.todayBonusAmount = str6;
        }
        if ((i & 128) == 0) {
            this.totalBonusAmount = "";
        } else {
            this.totalBonusAmount = str7;
        }
        if ((i & 256) == 0) {
            this.principalAmount = "";
        } else {
            this.principalAmount = str8;
        }
        if ((i & 512) == 0) {
            this.amount = "";
        } else {
            this.amount = str9;
        }
        if ((i & 1024) == 0) {
            this.unit = "";
        } else {
            this.unit = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TacticsVoucherInfo tacticsVoucherInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tacticsVoucherInfo.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tacticsVoucherInfo.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tacticsVoucherInfo.voucherId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tacticsVoucherInfo.voucherId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || tacticsVoucherInfo.voucherType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, C55800xql.EZpvd, tacticsVoucherInfo.voucherType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tacticsVoucherInfo.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tacticsVoucherInfo.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tacticsVoucherInfo.voucherPnlRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tacticsVoucherInfo.voucherPnlRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) tacticsVoucherInfo.bonusPeriod, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, tacticsVoucherInfo.bonusPeriod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) tacticsVoucherInfo.todayBonusAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, tacticsVoucherInfo.todayBonusAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) tacticsVoucherInfo.totalBonusAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, tacticsVoucherInfo.totalBonusAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) tacticsVoucherInfo.principalAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, tacticsVoucherInfo.principalAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) tacticsVoucherInfo.amount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, tacticsVoucherInfo.amount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Intrinsics.EZpvd((Object) tacticsVoucherInfo.unit, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 10, tacticsVoucherInfo.unit);
    }

    public TacticsVoucherInfo(@NotNull String str, @NotNull String str2, TacticsVoucherType tacticsVoucherType, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
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
        this.algoId = str;
        this.voucherId = str2;
        this.voucherType = tacticsVoucherType;
        this.status = str3;
        this.voucherPnlRatio = str4;
        this.bonusPeriod = str5;
        this.todayBonusAmount = str6;
        this.totalBonusAmount = str7;
        this.principalAmount = str8;
        this.amount = str9;
        this.unit = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.TacticsVoucherType:?: TERNARY null = ((wrap:int:0x0012: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.TacticsVoucherType) : (r15v0 com.okinc.unify_trade.biz.TacticsVoucherType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.TacticsVoucherType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:30) call: com.okinc.unify_trade.biz.TacticsVoucherInfo.<init>(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.TacticsVoucherType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TacticsVoucherInfo(String str, String str2, TacticsVoucherType tacticsVoucherType, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : tacticsVoucherType, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) == 0 ? str10 : "");
    }

    public final boolean getHasVoucher() {
        return this.voucherId.length() > 0;
    }

    public final VoucherStatus getVoucherStatus() {
        TacticsVoucherType tacticsVoucherType = this.voucherType;
        int i = tacticsVoucherType == null ? -1 : StateListAnimator.copydefault[tacticsVoucherType.ordinal()];
        int i2 = 0;
        if (i == 1) {
            VoucherStatus.InterestBoostVoucherStatus[] interestBoostVoucherStatusArrValues = VoucherStatus.InterestBoostVoucherStatus.values();
            int length = interestBoostVoucherStatusArrValues.length;
            while (i2 < length) {
                VoucherStatus.InterestBoostVoucherStatus interestBoostVoucherStatus = interestBoostVoucherStatusArrValues[i2];
                if (Intrinsics.EZpvd((Object) interestBoostVoucherStatus.getCode(), (Object) this.status)) {
                    return interestBoostVoucherStatus;
                }
                i2++;
            }
        } else if (i == 2) {
            VoucherStatus.LossInsuranceVoucherStatus[] lossInsuranceVoucherStatusArrValues = VoucherStatus.LossInsuranceVoucherStatus.values();
            int length2 = lossInsuranceVoucherStatusArrValues.length;
            while (i2 < length2) {
                VoucherStatus.LossInsuranceVoucherStatus lossInsuranceVoucherStatus = lossInsuranceVoucherStatusArrValues[i2];
                if (Intrinsics.EZpvd((Object) lossInsuranceVoucherStatus.getCode(), (Object) this.status)) {
                    return lossInsuranceVoucherStatus;
                }
                i2++;
            }
        } else if (i == 3) {
            VoucherStatus.AirdropVoucherStatus[] airdropVoucherStatusArrValues = VoucherStatus.AirdropVoucherStatus.values();
            int length3 = airdropVoucherStatusArrValues.length;
            while (i2 < length3) {
                VoucherStatus.AirdropVoucherStatus airdropVoucherStatus = airdropVoucherStatusArrValues[i2];
                if (Intrinsics.EZpvd((Object) airdropVoucherStatus.getCode(), (Object) this.status)) {
                    return airdropVoucherStatus;
                }
                i2++;
            }
        }
        return null;
    }
}
