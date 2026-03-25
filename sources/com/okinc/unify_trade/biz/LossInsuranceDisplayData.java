package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.VoucherStatus;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class LossInsuranceDisplayData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<LossInsuranceDisplayData> CREATOR = new Creator();
    private final String amount;
    private final String botType;
    private final Boolean eligible;
    private final ArrayList<String> instIds;
    private final boolean isShowExplainDialog;
    private String pTime;
    private final Long realTimestamp;
    private final boolean shouldReloadParams;
    private String status;
    private final String voucherCcy;
    private String voucherExpireTime;
    private final String voucherId;
    private final TacticsVoucherType voucherType;

    public static final class Creator implements Parcelable.Creator<LossInsuranceDisplayData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LossInsuranceDisplayData createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new LossInsuranceDisplayData(string, string2, boolValueOf, parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? TacticsVoucherType.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LossInsuranceDisplayData[] newArray(int i) {
            return new LossInsuranceDisplayData[i];
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TacticsVoucherType.values().length];
            try {
                iArr[TacticsVoucherType.AIRDROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TacticsVoucherType.STRATEGY_COMPENSATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TacticsVoucherType.COPYTRADING_COMPENSATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LossInsuranceDisplayData() {
        this(null, null, null, null, null, false, null, null, null, null, null, false, null, 8191, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.voucherCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.voucherId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.shouldReloadParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsVoucherType component13() {
        return this.voucherType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.eligible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.botType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component5() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isShowExplainDialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component7() {
        return this.realTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.voucherExpireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LossInsuranceDisplayData copy(String str, String str2, Boolean bool, String str3, ArrayList<String> arrayList, boolean z, Long l, String str4, String str5, String str6, String str7, boolean z2, TacticsVoucherType tacticsVoucherType) {
        return new LossInsuranceDisplayData(str, str2, bool, str3, arrayList, z, l, str4, str5, str6, str7, z2, tacticsVoucherType);
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
        if (!(obj instanceof LossInsuranceDisplayData)) {
            return false;
        }
        LossInsuranceDisplayData lossInsuranceDisplayData = (LossInsuranceDisplayData) obj;
        return Intrinsics.EZpvd((Object) this.amount, (Object) lossInsuranceDisplayData.amount) && Intrinsics.EZpvd((Object) this.status, (Object) lossInsuranceDisplayData.status) && Intrinsics.EZpvd(this.eligible, lossInsuranceDisplayData.eligible) && Intrinsics.EZpvd((Object) this.botType, (Object) lossInsuranceDisplayData.botType) && Intrinsics.EZpvd(this.instIds, lossInsuranceDisplayData.instIds) && this.isShowExplainDialog == lossInsuranceDisplayData.isShowExplainDialog && Intrinsics.EZpvd(this.realTimestamp, lossInsuranceDisplayData.realTimestamp) && Intrinsics.EZpvd((Object) this.voucherExpireTime, (Object) lossInsuranceDisplayData.voucherExpireTime) && Intrinsics.EZpvd((Object) this.pTime, (Object) lossInsuranceDisplayData.pTime) && Intrinsics.EZpvd((Object) this.voucherCcy, (Object) lossInsuranceDisplayData.voucherCcy) && Intrinsics.EZpvd((Object) this.voucherId, (Object) lossInsuranceDisplayData.voucherId) && this.shouldReloadParams == lossInsuranceDisplayData.shouldReloadParams && this.voucherType == lossInsuranceDisplayData.voucherType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBotType() {
        return this.botType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getEligible() {
        return this.eligible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getInstIds() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPTime() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getRealTimestamp() {
        return this.realTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShouldReloadParams() {
        return this.shouldReloadParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVoucherCcy() {
        return this.voucherCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVoucherExpireTime() {
        return this.voucherExpireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVoucherId() {
        return this.voucherId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsVoucherType getVoucherType() {
        return this.voucherType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.amount;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.status;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.eligible;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        String str3 = this.botType;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        ArrayList<String> arrayList = this.instIds;
        int iHashCode5 = arrayList == null ? 0 : arrayList.hashCode();
        int iHashCode6 = Boolean.hashCode(this.isShowExplainDialog);
        Long l = this.realTimestamp;
        int iHashCode7 = l == null ? 0 : l.hashCode();
        String str4 = this.voucherExpireTime;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.pTime;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.voucherCcy;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.voucherId;
        int iHashCode11 = str7 == null ? 0 : str7.hashCode();
        int iHashCode12 = Boolean.hashCode(this.shouldReloadParams);
        TacticsVoucherType tacticsVoucherType = this.voucherType;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (tacticsVoucherType != null ? tacticsVoucherType.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowExplainDialog() {
        return this.isShowExplainDialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPTime(String str) {
        this.pTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(String str) {
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVoucherExpireTime(String str) {
        this.voucherExpireTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LossInsuranceDisplayData(amount=" + this.amount + ", status=" + this.status + ", eligible=" + this.eligible + ", botType=" + this.botType + ", instIds=" + this.instIds + ", isShowExplainDialog=" + this.isShowExplainDialog + ", realTimestamp=" + this.realTimestamp + ", voucherExpireTime=" + this.voucherExpireTime + ", pTime=" + this.pTime + ", voucherCcy=" + this.voucherCcy + ", voucherId=" + this.voucherId + ", shouldReloadParams=" + this.shouldReloadParams + ", voucherType=" + this.voucherType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.amount);
        parcel.writeString(this.status);
        Boolean bool = this.eligible;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.botType);
        parcel.writeStringList(this.instIds);
        parcel.writeInt(this.isShowExplainDialog ? 1 : 0);
        Long l = this.realTimestamp;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.voucherExpireTime);
        parcel.writeString(this.pTime);
        parcel.writeString(this.voucherCcy);
        parcel.writeString(this.voucherId);
        parcel.writeInt(this.shouldReloadParams ? 1 : 0);
        TacticsVoucherType tacticsVoucherType = this.voucherType;
        if (tacticsVoucherType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tacticsVoucherType.writeToParcel(parcel, i);
        }
    }

    public LossInsuranceDisplayData(String str, String str2, Boolean bool, String str3, ArrayList<String> arrayList, boolean z, Long l, String str4, String str5, String str6, String str7, boolean z2, TacticsVoucherType tacticsVoucherType) {
        this.amount = str;
        this.status = str2;
        this.eligible = bool;
        this.botType = str3;
        this.instIds = arrayList;
        this.isShowExplainDialog = z;
        this.realTimestamp = l;
        this.voucherExpireTime = str4;
        this.pTime = str5;
        this.voucherCcy = str6;
        this.voucherId = str7;
        this.shouldReloadParams = z2;
        this.voucherType = tacticsVoucherType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0085: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0016: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r17v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0023: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r19v0 java.util.ArrayList))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002b: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r20v0 boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0033: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r21v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005b: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r26v0 boolean))
  (wrap:com.okinc.unify_trade.biz.TacticsVoucherType:?: TERNARY null = ((wrap:int:0x0063: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 com.okinc.unify_trade.biz.TacticsVoucherType) : (null com.okinc.unify_trade.biz.TacticsVoucherType))
 A[MD:(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.util.ArrayList<java.lang.String>, boolean, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.unify_trade.biz.TacticsVoucherType):void (m)] (LINE:4402) call: com.okinc.unify_trade.biz.LossInsuranceDisplayData.<init>(java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.util.ArrayList, boolean, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.unify_trade.biz.TacticsVoucherType):void type: THIS */
    public /* synthetic */ LossInsuranceDisplayData(String str, String str2, Boolean bool, String str3, ArrayList arrayList, boolean z, Long l, String str4, String str5, String str6, String str7, boolean z2, TacticsVoucherType tacticsVoucherType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? Boolean.TRUE : bool, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : arrayList, (i & 32) != 0 ? true : z, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? false : z2, (i & 4096) == 0 ? tacticsVoucherType : null);
    }

    public final boolean getCanShowVoucherInfo() {
        return (Intrinsics.EZpvd((Object) this.status, (Object) "issued") && Intrinsics.EZpvd(this.eligible, Boolean.TRUE)) || (C33129mqd.OLrzqt((CharSequence) this.voucherId) && Intrinsics.EZpvd(this.eligible, Boolean.TRUE) && !isExpired());
    }

    public final boolean isExpired() {
        TacticsVoucherType tacticsVoucherType = this.voucherType;
        int i = tacticsVoucherType == null ? -1 : TaskDescription.EZpvd[tacticsVoucherType.ordinal()];
        if (i == 1) {
            return Intrinsics.EZpvd((Object) this.status, (Object) VoucherStatus.AirdropVoucherStatus.EXPIRED.getCode());
        }
        if (i == 2 || i == 3) {
            return Intrinsics.EZpvd((Object) this.status, (Object) VoucherStatus.LossInsuranceVoucherStatus.EXPIRED.getCode());
        }
        return Intrinsics.EZpvd((Object) this.status, (Object) "expired");
    }
}
