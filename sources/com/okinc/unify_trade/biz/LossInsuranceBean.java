package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class LossInsuranceBean implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private List<String> algoOrdTypes;
    private String appliedVoucherCount;
    private ArbitrageTotalPnlInfo arbitrageTotalPnlInfo;
    private final boolean claimed;
    private String deeplink;
    private final String endTime;
    private List<String> instIds;
    private Integer leveragePrincipal;
    private String pTime;
    private long realTimestamp;
    private String totalInterestAmt;
    private final String totalVoucherCount;
    private final String voucherBatch;
    private final String voucherCcy;
    private String voucherExpireTime;
    private String voucherIssueTime;
    private String voucherStatus;
    private final TacticsVoucherType voucherType;
    private final String voucherValue;
    private final boolean voucherVisible;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LossInsuranceBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LossInsuranceBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LossInsuranceBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LossInsuranceBean(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : TacticsVoucherType.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ArbitrageTotalPnlInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LossInsuranceBean[] newArray(int i) {
            return new LossInsuranceBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LossInsuranceBean() {
        this(false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0L, (List) null, (List) null, false, (TacticsVoucherType) null, (ArbitrageTotalPnlInfo) null, (Integer) null, (String) null, 1048575, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.voucherVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.voucherIssueTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.voucherExpireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component13() {
        return this.realTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component14() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component15() {
        return this.algoOrdTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component16() {
        return this.claimed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsVoucherType component17() {
        return this.voucherType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageTotalPnlInfo component18() {
        return this.arbitrageTotalPnlInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component19() {
        return this.leveragePrincipal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.voucherStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.totalInterestAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.voucherBatch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.voucherValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.voucherCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.appliedVoucherCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.totalVoucherCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LossInsuranceBean copy(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j, List<String> list, List<String> list2, boolean z2, TacticsVoucherType tacticsVoucherType, ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, Integer num, String str12) {
        return new LossInsuranceBean(z, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, j, list, list2, z2, tacticsVoucherType, arbitrageTotalPnlInfo, num, str12);
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
        if (!(obj instanceof LossInsuranceBean)) {
            return false;
        }
        LossInsuranceBean lossInsuranceBean = (LossInsuranceBean) obj;
        return this.voucherVisible == lossInsuranceBean.voucherVisible && Intrinsics.EZpvd((Object) this.voucherStatus, (Object) lossInsuranceBean.voucherStatus) && Intrinsics.EZpvd((Object) this.voucherBatch, (Object) lossInsuranceBean.voucherBatch) && Intrinsics.EZpvd((Object) this.voucherValue, (Object) lossInsuranceBean.voucherValue) && Intrinsics.EZpvd((Object) this.voucherCcy, (Object) lossInsuranceBean.voucherCcy) && Intrinsics.EZpvd((Object) this.appliedVoucherCount, (Object) lossInsuranceBean.appliedVoucherCount) && Intrinsics.EZpvd((Object) this.totalVoucherCount, (Object) lossInsuranceBean.totalVoucherCount) && Intrinsics.EZpvd((Object) this.pTime, (Object) lossInsuranceBean.pTime) && Intrinsics.EZpvd((Object) this.endTime, (Object) lossInsuranceBean.endTime) && Intrinsics.EZpvd((Object) this.voucherIssueTime, (Object) lossInsuranceBean.voucherIssueTime) && Intrinsics.EZpvd((Object) this.voucherExpireTime, (Object) lossInsuranceBean.voucherExpireTime) && Intrinsics.EZpvd((Object) this.deeplink, (Object) lossInsuranceBean.deeplink) && this.realTimestamp == lossInsuranceBean.realTimestamp && Intrinsics.EZpvd(this.instIds, lossInsuranceBean.instIds) && Intrinsics.EZpvd(this.algoOrdTypes, lossInsuranceBean.algoOrdTypes) && this.claimed == lossInsuranceBean.claimed && this.voucherType == lossInsuranceBean.voucherType && Intrinsics.EZpvd(this.arbitrageTotalPnlInfo, lossInsuranceBean.arbitrageTotalPnlInfo) && Intrinsics.EZpvd(this.leveragePrincipal, lossInsuranceBean.leveragePrincipal) && Intrinsics.EZpvd((Object) this.totalInterestAmt, (Object) lossInsuranceBean.totalInterestAmt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getAlgoOrdTypes() {
        return this.algoOrdTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppliedVoucherCount() {
        return this.appliedVoucherCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageTotalPnlInfo getArbitrageTotalPnlInfo() {
        return this.arbitrageTotalPnlInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getClaimed() {
        return this.claimed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getInstIds() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getLeveragePrincipal() {
        return this.leveragePrincipal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPTime() {
        return this.pTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getRealTimestamp() {
        return this.realTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalInterestAmt() {
        return this.totalInterestAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalVoucherCount() {
        return this.totalVoucherCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVoucherBatch() {
        return this.voucherBatch;
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
    public final String getVoucherIssueTime() {
        return this.voucherIssueTime;
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
    public final String getVoucherValue() {
        return this.voucherValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getVoucherVisible() {
        return this.voucherVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.voucherVisible);
        String str = this.voucherStatus;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.voucherBatch;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.voucherValue;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.voucherCcy;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.appliedVoucherCount;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.totalVoucherCount;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.pTime;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.endTime;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.voucherIssueTime;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.voucherExpireTime;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.deeplink;
        int iHashCode12 = str11 == null ? 0 : str11.hashCode();
        int iHashCode13 = Long.hashCode(this.realTimestamp);
        List<String> list = this.instIds;
        int iHashCode14 = list == null ? 0 : list.hashCode();
        List<String> list2 = this.algoOrdTypes;
        int iHashCode15 = list2 == null ? 0 : list2.hashCode();
        int iHashCode16 = Boolean.hashCode(this.claimed);
        TacticsVoucherType tacticsVoucherType = this.voucherType;
        int iHashCode17 = tacticsVoucherType == null ? 0 : tacticsVoucherType.hashCode();
        ArbitrageTotalPnlInfo arbitrageTotalPnlInfo = this.arbitrageTotalPnlInfo;
        int iHashCode18 = arbitrageTotalPnlInfo == null ? 0 : arbitrageTotalPnlInfo.hashCode();
        Integer num = this.leveragePrincipal;
        int iHashCode19 = num == null ? 0 : num.hashCode();
        String str12 = this.totalInterestAmt;
        return (((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + (str12 == null ? 0 : str12.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoOrdTypes(List<String> list) {
        this.algoOrdTypes = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAppliedVoucherCount(String str) {
        this.appliedVoucherCount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setArbitrageTotalPnlInfo(ArbitrageTotalPnlInfo arbitrageTotalPnlInfo) {
        this.arbitrageTotalPnlInfo = arbitrageTotalPnlInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeeplink(String str) {
        this.deeplink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstIds(List<String> list) {
        this.instIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeveragePrincipal(Integer num) {
        this.leveragePrincipal = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPTime(String str) {
        this.pTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRealTimestamp(long j) {
        this.realTimestamp = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalInterestAmt(String str) {
        this.totalInterestAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVoucherExpireTime(String str) {
        this.voucherExpireTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVoucherIssueTime(String str) {
        this.voucherIssueTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVoucherStatus(String str) {
        this.voucherStatus = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LossInsuranceBean(voucherVisible=" + this.voucherVisible + ", voucherStatus=" + this.voucherStatus + ", voucherBatch=" + this.voucherBatch + ", voucherValue=" + this.voucherValue + ", voucherCcy=" + this.voucherCcy + ", appliedVoucherCount=" + this.appliedVoucherCount + ", totalVoucherCount=" + this.totalVoucherCount + ", pTime=" + this.pTime + ", endTime=" + this.endTime + ", voucherIssueTime=" + this.voucherIssueTime + ", voucherExpireTime=" + this.voucherExpireTime + ", deeplink=" + this.deeplink + ", realTimestamp=" + this.realTimestamp + ", instIds=" + this.instIds + ", algoOrdTypes=" + this.algoOrdTypes + ", claimed=" + this.claimed + ", voucherType=" + this.voucherType + ", arbitrageTotalPnlInfo=" + this.arbitrageTotalPnlInfo + ", leveragePrincipal=" + this.leveragePrincipal + ", totalInterestAmt=" + this.totalInterestAmt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.voucherVisible ? 1 : 0);
        parcel.writeString(this.voucherStatus);
        parcel.writeString(this.voucherBatch);
        parcel.writeString(this.voucherValue);
        parcel.writeString(this.voucherCcy);
        parcel.writeString(this.appliedVoucherCount);
        parcel.writeString(this.totalVoucherCount);
        parcel.writeString(this.pTime);
        parcel.writeString(this.endTime);
        parcel.writeString(this.voucherIssueTime);
        parcel.writeString(this.voucherExpireTime);
        parcel.writeString(this.deeplink);
        parcel.writeLong(this.realTimestamp);
        parcel.writeStringList(this.instIds);
        parcel.writeStringList(this.algoOrdTypes);
        parcel.writeInt(this.claimed ? 1 : 0);
        TacticsVoucherType tacticsVoucherType = this.voucherType;
        if (tacticsVoucherType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tacticsVoucherType.writeToParcel(parcel, i);
        }
        ArbitrageTotalPnlInfo arbitrageTotalPnlInfo = this.arbitrageTotalPnlInfo;
        if (arbitrageTotalPnlInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            arbitrageTotalPnlInfo.writeToParcel(parcel, i);
        }
        Integer num = this.leveragePrincipal;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.totalInterestAmt);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.LossInsuranceBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LossInsuranceBean> serializer() {
            return LossInsuranceBean$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null, TacticsVoucherType.Companion.serializer(), null, null, null};
    }

    public /* synthetic */ LossInsuranceBean(int i, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j, List list, List list2, boolean z2, TacticsVoucherType tacticsVoucherType, ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, Integer num, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.voucherVisible = false;
        } else {
            this.voucherVisible = z;
        }
        if ((i & 2) == 0) {
            this.voucherStatus = null;
        } else {
            this.voucherStatus = str;
        }
        if ((i & 4) == 0) {
            this.voucherBatch = null;
        } else {
            this.voucherBatch = str2;
        }
        if ((i & 8) == 0) {
            this.voucherValue = null;
        } else {
            this.voucherValue = str3;
        }
        if ((i & 16) == 0) {
            this.voucherCcy = null;
        } else {
            this.voucherCcy = str4;
        }
        if ((i & 32) == 0) {
            this.appliedVoucherCount = null;
        } else {
            this.appliedVoucherCount = str5;
        }
        if ((i & 64) == 0) {
            this.totalVoucherCount = null;
        } else {
            this.totalVoucherCount = str6;
        }
        if ((i & 128) == 0) {
            this.pTime = null;
        } else {
            this.pTime = str7;
        }
        if ((i & 256) == 0) {
            this.endTime = null;
        } else {
            this.endTime = str8;
        }
        if ((i & 512) == 0) {
            this.voucherIssueTime = null;
        } else {
            this.voucherIssueTime = str9;
        }
        if ((i & 1024) == 0) {
            this.voucherExpireTime = null;
        } else {
            this.voucherExpireTime = str10;
        }
        if ((i & 2048) == 0) {
            this.deeplink = null;
        } else {
            this.deeplink = str11;
        }
        this.realTimestamp = (i & 4096) == 0 ? SystemClock.elapsedRealtime() : j;
        if ((i & 8192) == 0) {
            this.instIds = null;
        } else {
            this.instIds = list;
        }
        if ((i & 16384) == 0) {
            this.algoOrdTypes = null;
        } else {
            this.algoOrdTypes = list2;
        }
        if ((32768 & i) == 0) {
            this.claimed = false;
        } else {
            this.claimed = z2;
        }
        if ((65536 & i) == 0) {
            this.voucherType = null;
        } else {
            this.voucherType = tacticsVoucherType;
        }
        if ((131072 & i) == 0) {
            this.arbitrageTotalPnlInfo = null;
        } else {
            this.arbitrageTotalPnlInfo = arbitrageTotalPnlInfo;
        }
        if ((262144 & i) == 0) {
            this.leveragePrincipal = null;
        } else {
            this.leveragePrincipal = num;
        }
        if ((i & 524288) == 0) {
            this.totalInterestAmt = null;
        } else {
            this.totalInterestAmt = str12;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(LossInsuranceBean lossInsuranceBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || lossInsuranceBean.voucherVisible) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, lossInsuranceBean.voucherVisible);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || lossInsuranceBean.voucherStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, lossInsuranceBean.voucherStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || lossInsuranceBean.voucherBatch != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, lossInsuranceBean.voucherBatch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || lossInsuranceBean.voucherValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, lossInsuranceBean.voucherValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || lossInsuranceBean.voucherCcy != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, lossInsuranceBean.voucherCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || lossInsuranceBean.appliedVoucherCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, lossInsuranceBean.appliedVoucherCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || lossInsuranceBean.totalVoucherCount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, lossInsuranceBean.totalVoucherCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || lossInsuranceBean.pTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, lossInsuranceBean.pTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || lossInsuranceBean.endTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, lossInsuranceBean.endTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || lossInsuranceBean.voucherIssueTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, lossInsuranceBean.voucherIssueTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || lossInsuranceBean.voucherExpireTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, lossInsuranceBean.voucherExpireTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || lossInsuranceBean.deeplink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, lossInsuranceBean.deeplink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || lossInsuranceBean.realTimestamp != SystemClock.elapsedRealtime()) {
            compositeEncoder.encodeLongElement(serialDescriptor, 12, lossInsuranceBean.realTimestamp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || lossInsuranceBean.instIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr[13], lossInsuranceBean.instIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || lossInsuranceBean.algoOrdTypes != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, kSerializerArr[14], lossInsuranceBean.algoOrdTypes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || lossInsuranceBean.claimed) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 15, lossInsuranceBean.claimed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || lossInsuranceBean.voucherType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, kSerializerArr[16], lossInsuranceBean.voucherType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || lossInsuranceBean.arbitrageTotalPnlInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, ArbitrageTotalPnlInfo$$serializer.INSTANCE, lossInsuranceBean.arbitrageTotalPnlInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || lossInsuranceBean.leveragePrincipal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, IntSerializer.INSTANCE, lossInsuranceBean.leveragePrincipal);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) && lossInsuranceBean.totalInterestAmt == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, lossInsuranceBean.totalInterestAmt);
    }

    public LossInsuranceBean(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j, List<String> list, List<String> list2, boolean z2, TacticsVoucherType tacticsVoucherType, ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, Integer num, String str12) {
        this.voucherVisible = z;
        this.voucherStatus = str;
        this.voucherBatch = str2;
        this.voucherValue = str3;
        this.voucherCcy = str4;
        this.appliedVoucherCount = str5;
        this.totalVoucherCount = str6;
        this.pTime = str7;
        this.endTime = str8;
        this.voucherIssueTime = str9;
        this.voucherExpireTime = str10;
        this.deeplink = str11;
        this.realTimestamp = j;
        this.instIds = list;
        this.algoOrdTypes = list2;
        this.claimed = z2;
        this.voucherType = tacticsVoucherType;
        this.arbitrageTotalPnlInfo = arbitrageTotalPnlInfo;
        this.leveragePrincipal = num;
        this.totalInterestAmt = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00de: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r44v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r44v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r44v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r44v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r44v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r44v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r44v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r44v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r44v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r44v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r44v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r44v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0062: ARITH (r44v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0066: INVOKE  STATIC call: android.os.SystemClock.elapsedRealtime():long A[MD:():long (c), WRAPPED] (LINE:4369)) : (r35v0 long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x006d: ARITH (r44v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r37v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0075: ARITH (r44v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r38v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0080: ARITH (r44v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? false : (r39v0 boolean))
  (wrap:com.okinc.unify_trade.biz.TacticsVoucherType:?: TERNARY null = ((wrap:int:0x008b: ARITH (r44v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.TacticsVoucherType) : (r40v0 com.okinc.unify_trade.biz.TacticsVoucherType))
  (wrap:com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo:?: TERNARY null = ((wrap:int:0x0096: ARITH (r44v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo) : (r41v0 com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00a1: ARITH (r44v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r42v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ac: ARITH (r44v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.util.List<java.lang.String>, java.util.List<java.lang.String>, boolean, com.okinc.unify_trade.biz.TacticsVoucherType, com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo, java.lang.Integer, java.lang.String):void (m)] (LINE:4356) call: com.okinc.unify_trade.biz.LossInsuranceBean.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.util.List, java.util.List, boolean, com.okinc.unify_trade.biz.TacticsVoucherType, com.okinc.unify_trade.biz.ArbitrageTotalPnlInfo, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ LossInsuranceBean(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, long j, List list, List list2, boolean z2, TacticsVoucherType tacticsVoucherType, ArbitrageTotalPnlInfo arbitrageTotalPnlInfo, Integer num, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? SystemClock.elapsedRealtime() : j, (i & 8192) != 0 ? null : list, (i & 16384) != 0 ? null : list2, (i & 32768) != 0 ? false : z2, (i & 65536) != 0 ? null : tacticsVoucherType, (i & 131072) != 0 ? null : arbitrageTotalPnlInfo, (i & 262144) != 0 ? null : num, (i & 524288) != 0 ? null : str12);
    }
}
