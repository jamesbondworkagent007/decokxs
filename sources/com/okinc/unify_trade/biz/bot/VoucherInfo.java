package com.okinc.unify_trade.biz.bot;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import com.okinc.unify_trade.biz.TacticsVoucherType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C55800xql;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class VoucherInfo implements Parcelable {
    public static final int $stable = 0;
    private final String amount;
    private final String batchNo;
    private final boolean claimed;
    private final String expireTime;
    private final String unit;
    private final String voucherId;
    private final String voucherStatus;
    private final TacticsVoucherType voucherType;
    private final boolean voucherVisible;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<VoucherInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<VoucherInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VoucherInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new VoucherInfo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TacticsVoucherType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VoucherInfo[] newArray(int i) {
            return new VoucherInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VoucherInfo() {
        this((String) null, (String) null, (TacticsVoucherType) null, (String) null, (String) null, (String) null, (String) null, false, false, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    @Serializable(with = C55800xql.class)
    public static /* synthetic */ void getVoucherType$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsVoucherType component3() {
        return this.voucherType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.voucherId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.voucherStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.batchNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.voucherVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.claimed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VoucherInfo copy(@NotNull String str, @NotNull String str2, TacticsVoucherType tacticsVoucherType, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new VoucherInfo(str, str2, tacticsVoucherType, str3, str4, str5, str6, z, z2);
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
        if (!(obj instanceof VoucherInfo)) {
            return false;
        }
        VoucherInfo voucherInfo = (VoucherInfo) obj;
        return Intrinsics.EZpvd((Object) this.amount, (Object) voucherInfo.amount) && Intrinsics.EZpvd((Object) this.unit, (Object) voucherInfo.unit) && this.voucherType == voucherInfo.voucherType && Intrinsics.EZpvd((Object) this.voucherId, (Object) voucherInfo.voucherId) && Intrinsics.EZpvd((Object) this.voucherStatus, (Object) voucherInfo.voucherStatus) && Intrinsics.EZpvd((Object) this.expireTime, (Object) voucherInfo.expireTime) && Intrinsics.EZpvd((Object) this.batchNo, (Object) voucherInfo.batchNo) && this.voucherVisible == voucherInfo.voucherVisible && this.claimed == voucherInfo.claimed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBatchNo() {
        return this.batchNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getClaimed() {
        return this.claimed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpireTime() {
        return this.expireTime;
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
    public final String getVoucherStatus() {
        return this.voucherStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsVoucherType getVoucherType() {
        return this.voucherType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getVoucherVisible() {
        return this.voucherVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.amount.hashCode();
        int iHashCode2 = this.unit.hashCode();
        TacticsVoucherType tacticsVoucherType = this.voucherType;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + (tacticsVoucherType == null ? 0 : tacticsVoucherType.hashCode())) * 31) + this.voucherId.hashCode()) * 31) + this.voucherStatus.hashCode()) * 31) + this.expireTime.hashCode()) * 31) + this.batchNo.hashCode()) * 31) + Boolean.hashCode(this.voucherVisible)) * 31) + Boolean.hashCode(this.claimed);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VoucherInfo(amount=" + this.amount + ", unit=" + this.unit + ", voucherType=" + this.voucherType + ", voucherId=" + this.voucherId + ", voucherStatus=" + this.voucherStatus + ", expireTime=" + this.expireTime + ", batchNo=" + this.batchNo + ", voucherVisible=" + this.voucherVisible + ", claimed=" + this.claimed + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.amount);
        parcel.writeString(this.unit);
        TacticsVoucherType tacticsVoucherType = this.voucherType;
        if (tacticsVoucherType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tacticsVoucherType.writeToParcel(parcel, i);
        }
        parcel.writeString(this.voucherId);
        parcel.writeString(this.voucherStatus);
        parcel.writeString(this.expireTime);
        parcel.writeString(this.batchNo);
        parcel.writeInt(this.voucherVisible ? 1 : 0);
        parcel.writeInt(this.claimed ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.bot.VoucherInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VoucherInfo> serializer() {
            return VoucherInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VoucherInfo(int i, String str, String str2, TacticsVoucherType tacticsVoucherType, String str3, String str4, String str5, String str6, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.amount = "";
        } else {
            this.amount = str;
        }
        if ((i & 2) == 0) {
            this.unit = "";
        } else {
            this.unit = str2;
        }
        if ((i & 4) == 0) {
            this.voucherType = null;
        } else {
            this.voucherType = tacticsVoucherType;
        }
        if ((i & 8) == 0) {
            this.voucherId = "";
        } else {
            this.voucherId = str3;
        }
        if ((i & 16) == 0) {
            this.voucherStatus = "";
        } else {
            this.voucherStatus = str4;
        }
        if ((i & 32) == 0) {
            this.expireTime = "";
        } else {
            this.expireTime = str5;
        }
        if ((i & 64) == 0) {
            this.batchNo = "";
        } else {
            this.batchNo = str6;
        }
        if ((i & 128) == 0) {
            this.voucherVisible = false;
        } else {
            this.voucherVisible = z;
        }
        if ((i & 256) == 0) {
            this.claimed = false;
        } else {
            this.claimed = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(VoucherInfo voucherInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) voucherInfo.amount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, voucherInfo.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) voucherInfo.unit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, voucherInfo.unit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || voucherInfo.voucherType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, C55800xql.EZpvd, voucherInfo.voucherType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) voucherInfo.voucherId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, voucherInfo.voucherId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) voucherInfo.voucherStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, voucherInfo.voucherStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) voucherInfo.expireTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, voucherInfo.expireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) voucherInfo.batchNo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, voucherInfo.batchNo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || voucherInfo.voucherVisible) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, voucherInfo.voucherVisible);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || voucherInfo.claimed) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, voucherInfo.claimed);
        }
    }

    public VoucherInfo(@NotNull String str, @NotNull String str2, TacticsVoucherType tacticsVoucherType, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.amount = str;
        this.unit = str2;
        this.voucherType = tacticsVoucherType;
        this.voucherId = str3;
        this.voucherStatus = str4;
        this.expireTime = str5;
        this.batchNo = str6;
        this.voucherVisible = z;
        this.claimed = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.TacticsVoucherType:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.TacticsVoucherType) : (r13v0 com.okinc.unify_trade.biz.TacticsVoucherType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003f: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 boolean) : false)
 A[MD:(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.TacticsVoucherType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void (m)] (LINE:31) call: com.okinc.unify_trade.biz.bot.VoucherInfo.<init>(java.lang.String, java.lang.String, com.okinc.unify_trade.biz.TacticsVoucherType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ VoucherInfo(String str, String str2, TacticsVoucherType tacticsVoucherType, String str3, String str4, String str5, String str6, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : tacticsVoucherType, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) == 0 ? str6 : "", (i & 128) != 0 ? false : z, (i & 256) == 0 ? z2 : false);
    }
}
