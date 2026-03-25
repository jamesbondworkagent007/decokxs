package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class FundingFeeApyItem implements Parcelable {
    public static final int $stable = 0;
    private final String apy;
    private final String apyNormal;
    private final String arbApy;
    private final DailyYieldVo dailyYieldVo;
    private final String debitYearRate;
    private final String period;
    private final String stakingApy;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<FundingFeeApyItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<FundingFeeApyItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FundingFeeApyItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FundingFeeApyItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DailyYieldVo.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FundingFeeApyItem[] newArray(int i) {
            return new FundingFeeApyItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FundingFeeApyItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DailyYieldVo) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FundingFeeApyItem copy$default(FundingFeeApyItem fundingFeeApyItem, String str, String str2, String str3, String str4, String str5, String str6, DailyYieldVo dailyYieldVo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fundingFeeApyItem.period;
        }
        if ((i & 2) != 0) {
            str2 = fundingFeeApyItem.apy;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = fundingFeeApyItem.stakingApy;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = fundingFeeApyItem.arbApy;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = fundingFeeApyItem.apyNormal;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = fundingFeeApyItem.debitYearRate;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            dailyYieldVo = fundingFeeApyItem.dailyYieldVo;
        }
        return fundingFeeApyItem.copy(str, str7, str8, str9, str10, str11, dailyYieldVo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.stakingApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.arbApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.apyNormal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.debitYearRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DailyYieldVo component7() {
        return this.dailyYieldVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FundingFeeApyItem copy(String str, String str2, String str3, String str4, String str5, String str6, DailyYieldVo dailyYieldVo) {
        return new FundingFeeApyItem(str, str2, str3, str4, str5, str6, dailyYieldVo);
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
        if (!(obj instanceof FundingFeeApyItem)) {
            return false;
        }
        FundingFeeApyItem fundingFeeApyItem = (FundingFeeApyItem) obj;
        return Intrinsics.EZpvd((Object) this.period, (Object) fundingFeeApyItem.period) && Intrinsics.EZpvd((Object) this.apy, (Object) fundingFeeApyItem.apy) && Intrinsics.EZpvd((Object) this.stakingApy, (Object) fundingFeeApyItem.stakingApy) && Intrinsics.EZpvd((Object) this.arbApy, (Object) fundingFeeApyItem.arbApy) && Intrinsics.EZpvd((Object) this.apyNormal, (Object) fundingFeeApyItem.apyNormal) && Intrinsics.EZpvd((Object) this.debitYearRate, (Object) fundingFeeApyItem.debitYearRate) && Intrinsics.EZpvd(this.dailyYieldVo, fundingFeeApyItem.dailyYieldVo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApy() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApyNormal() {
        return this.apyNormal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getArbApy() {
        return this.arbApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DailyYieldVo getDailyYieldVo() {
        return this.dailyYieldVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDebitYearRate() {
        return this.debitYearRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStakingApy() {
        return this.stakingApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.period;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.apy;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.stakingApy;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.arbApy;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.apyNormal;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.debitYearRate;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        DailyYieldVo dailyYieldVo = this.dailyYieldVo;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (dailyYieldVo != null ? dailyYieldVo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FundingFeeApyItem(period=" + this.period + ", apy=" + this.apy + ", stakingApy=" + this.stakingApy + ", arbApy=" + this.arbApy + ", apyNormal=" + this.apyNormal + ", debitYearRate=" + this.debitYearRate + ", dailyYieldVo=" + this.dailyYieldVo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.period);
        parcel.writeString(this.apy);
        parcel.writeString(this.stakingApy);
        parcel.writeString(this.arbApy);
        parcel.writeString(this.apyNormal);
        parcel.writeString(this.debitYearRate);
        DailyYieldVo dailyYieldVo = this.dailyYieldVo;
        if (dailyYieldVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dailyYieldVo.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.FundingFeeApyItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FundingFeeApyItem> serializer() {
            return FundingFeeApyItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FundingFeeApyItem(int i, String str, String str2, String str3, String str4, String str5, String str6, DailyYieldVo dailyYieldVo, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.period = null;
        } else {
            this.period = str;
        }
        if ((i & 2) == 0) {
            this.apy = null;
        } else {
            this.apy = str2;
        }
        if ((i & 4) == 0) {
            this.stakingApy = null;
        } else {
            this.stakingApy = str3;
        }
        if ((i & 8) == 0) {
            this.arbApy = null;
        } else {
            this.arbApy = str4;
        }
        if ((i & 16) == 0) {
            this.apyNormal = null;
        } else {
            this.apyNormal = str5;
        }
        if ((i & 32) == 0) {
            this.debitYearRate = null;
        } else {
            this.debitYearRate = str6;
        }
        if ((i & 64) == 0) {
            this.dailyYieldVo = null;
        } else {
            this.dailyYieldVo = dailyYieldVo;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(FundingFeeApyItem fundingFeeApyItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || fundingFeeApyItem.period != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, fundingFeeApyItem.period);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || fundingFeeApyItem.apy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, fundingFeeApyItem.apy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || fundingFeeApyItem.stakingApy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, fundingFeeApyItem.stakingApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || fundingFeeApyItem.arbApy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, fundingFeeApyItem.arbApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || fundingFeeApyItem.apyNormal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, fundingFeeApyItem.apyNormal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || fundingFeeApyItem.debitYearRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, fundingFeeApyItem.debitYearRate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && fundingFeeApyItem.dailyYieldVo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, DailyYieldVo$$serializer.INSTANCE, fundingFeeApyItem.dailyYieldVo);
    }

    public FundingFeeApyItem(String str, String str2, String str3, String str4, String str5, String str6, DailyYieldVo dailyYieldVo) {
        this.period = str;
        this.apy = str2;
        this.stakingApy = str3;
        this.arbApy = str4;
        this.apyNormal = str5;
        this.debitYearRate = str6;
        this.dailyYieldVo = dailyYieldVo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.DailyYieldVo:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.DailyYieldVo) : (r13v0 com.okinc.unify_trade.biz.DailyYieldVo))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.DailyYieldVo):void (m)] (LINE:3882) call: com.okinc.unify_trade.biz.FundingFeeApyItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.DailyYieldVo):void type: THIS */
    public /* synthetic */ FundingFeeApyItem(String str, String str2, String str3, String str4, String str5, String str6, DailyYieldVo dailyYieldVo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : dailyYieldVo);
    }
}
