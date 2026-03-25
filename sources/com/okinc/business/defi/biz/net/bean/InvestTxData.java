package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class InvestTxData implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private Long aggregateId;
    private List<InvestTxCoinInfo> investInCoins;
    private InvestInfo investInfo;
    private List<InvestTxCoinInfo> investOutCoins;
    private Integer investmentDetailType;
    private Long investmentId;
    private InvestTxCoinInfo lpTokenInfo;
    private Long projectId;
    private boolean redeemShowNum;
    private String validateName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestTxData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestTxData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTxData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            InvestTxCoinInfo investTxCoinInfoCreateFromParcel = parcel.readInt() == 0 ? null : InvestTxCoinInfo.CREATOR.createFromParcel(parcel);
            InvestInfo investInfoCreateFromParcel = parcel.readInt() == 0 ? null : InvestInfo.CREATOR.createFromParcel(parcel);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(InvestTxCoinInfo.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(InvestTxCoinInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new InvestTxData(investTxCoinInfoCreateFromParcel, investInfoCreateFromParcel, numValueOf, lValueOf, arrayList, arrayList2, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTxData[] newArray(int i) {
            return new InvestTxData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestTxData() {
        this((InvestTxCoinInfo) null, (InvestInfo) null, (Integer) null, (Long) null, (List) null, (List) null, false, (Long) null, (Long) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTxCoinInfo component1() {
        return this.lpTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.validateName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestInfo component2() {
        return this.investInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.investmentDetailType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component4() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTxCoinInfo> component5() {
        return this.investInCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTxCoinInfo> component6() {
        return this.investOutCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.redeemShowNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component8() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component9() {
        return this.aggregateId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTxData copy(InvestTxCoinInfo investTxCoinInfo, InvestInfo investInfo, Integer num, Long l, List<InvestTxCoinInfo> list, List<InvestTxCoinInfo> list2, boolean z, Long l2, Long l3, String str) {
        return new InvestTxData(investTxCoinInfo, investInfo, num, l, list, list2, z, l2, l3, str);
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
        if (!(obj instanceof InvestTxData)) {
            return false;
        }
        InvestTxData investTxData = (InvestTxData) obj;
        return Intrinsics.EZpvd(this.lpTokenInfo, investTxData.lpTokenInfo) && Intrinsics.EZpvd(this.investInfo, investTxData.investInfo) && Intrinsics.EZpvd(this.investmentDetailType, investTxData.investmentDetailType) && Intrinsics.EZpvd(this.projectId, investTxData.projectId) && Intrinsics.EZpvd(this.investInCoins, investTxData.investInCoins) && Intrinsics.EZpvd(this.investOutCoins, investTxData.investOutCoins) && this.redeemShowNum == investTxData.redeemShowNum && Intrinsics.EZpvd(this.investmentId, investTxData.investmentId) && Intrinsics.EZpvd(this.aggregateId, investTxData.aggregateId) && Intrinsics.EZpvd((Object) this.validateName, (Object) investTxData.validateName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getAggregateId() {
        return this.aggregateId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTxCoinInfo> getInvestInCoins() {
        return this.investInCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestInfo getInvestInfo() {
        return this.investInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTxCoinInfo> getInvestOutCoins() {
        return this.investOutCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInvestmentDetailType() {
        return this.investmentDetailType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTxCoinInfo getLpTokenInfo() {
        return this.lpTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getProjectId() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getRedeemShowNum() {
        return this.redeemShowNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValidateName() {
        return this.validateName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        InvestTxCoinInfo investTxCoinInfo = this.lpTokenInfo;
        int iHashCode = investTxCoinInfo == null ? 0 : investTxCoinInfo.hashCode();
        InvestInfo investInfo = this.investInfo;
        int iHashCode2 = investInfo == null ? 0 : investInfo.hashCode();
        Integer num = this.investmentDetailType;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Long l = this.projectId;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        List<InvestTxCoinInfo> list = this.investInCoins;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        List<InvestTxCoinInfo> list2 = this.investOutCoins;
        int iHashCode6 = list2 == null ? 0 : list2.hashCode();
        int iHashCode7 = Boolean.hashCode(this.redeemShowNum);
        Long l2 = this.investmentId;
        int iHashCode8 = l2 == null ? 0 : l2.hashCode();
        Long l3 = this.aggregateId;
        int iHashCode9 = l3 == null ? 0 : l3.hashCode();
        String str = this.validateName;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAggregateId(Long l) {
        this.aggregateId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestInCoins(List<InvestTxCoinInfo> list) {
        this.investInCoins = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestInfo(InvestInfo investInfo) {
        this.investInfo = investInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestOutCoins(List<InvestTxCoinInfo> list) {
        this.investOutCoins = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestmentDetailType(Integer num) {
        this.investmentDetailType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestmentId(Long l) {
        this.investmentId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLpTokenInfo(InvestTxCoinInfo investTxCoinInfo) {
        this.lpTokenInfo = investTxCoinInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProjectId(Long l) {
        this.projectId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRedeemShowNum(boolean z) {
        this.redeemShowNum = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValidateName(String str) {
        this.validateName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestTxData(lpTokenInfo=" + this.lpTokenInfo + ", investInfo=" + this.investInfo + ", investmentDetailType=" + this.investmentDetailType + ", projectId=" + this.projectId + ", investInCoins=" + this.investInCoins + ", investOutCoins=" + this.investOutCoins + ", redeemShowNum=" + this.redeemShowNum + ", investmentId=" + this.investmentId + ", aggregateId=" + this.aggregateId + ", validateName=" + this.validateName + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        InvestTxCoinInfo investTxCoinInfo = this.lpTokenInfo;
        if (investTxCoinInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTxCoinInfo.writeToParcel(parcel, i);
        }
        InvestInfo investInfo = this.investInfo;
        if (investInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investInfo.writeToParcel(parcel, i);
        }
        Integer num = this.investmentDetailType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l = this.projectId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        List<InvestTxCoinInfo> list = this.investInCoins;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<InvestTxCoinInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<InvestTxCoinInfo> list2 = this.investOutCoins;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<InvestTxCoinInfo> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.redeemShowNum ? 1 : 0);
        Long l2 = this.investmentId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Long l3 = this.aggregateId;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        parcel.writeString(this.validateName);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.InvestTxData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestTxData> serializer() {
            return InvestTxData$$serializer.INSTANCE;
        }
    }

    static {
        InvestTxCoinInfo$$serializer investTxCoinInfo$$serializer = InvestTxCoinInfo$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, new ArrayListSerializer(investTxCoinInfo$$serializer), new ArrayListSerializer(investTxCoinInfo$$serializer), null, null, null, null};
    }

    public /* synthetic */ InvestTxData(int i, InvestTxCoinInfo investTxCoinInfo, InvestInfo investInfo, Integer num, Long l, List list, List list2, boolean z, Long l2, Long l3, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.lpTokenInfo = null;
        } else {
            this.lpTokenInfo = investTxCoinInfo;
        }
        if ((i & 2) == 0) {
            this.investInfo = null;
        } else {
            this.investInfo = investInfo;
        }
        if ((i & 4) == 0) {
            this.investmentDetailType = null;
        } else {
            this.investmentDetailType = num;
        }
        if ((i & 8) == 0) {
            this.projectId = null;
        } else {
            this.projectId = l;
        }
        if ((i & 16) == 0) {
            this.investInCoins = null;
        } else {
            this.investInCoins = list;
        }
        if ((i & 32) == 0) {
            this.investOutCoins = null;
        } else {
            this.investOutCoins = list2;
        }
        if ((i & 64) == 0) {
            this.redeemShowNum = false;
        } else {
            this.redeemShowNum = z;
        }
        if ((i & 128) == 0) {
            this.investmentId = null;
        } else {
            this.investmentId = l2;
        }
        if ((i & 256) == 0) {
            this.aggregateId = null;
        } else {
            this.aggregateId = l3;
        }
        if ((i & 512) == 0) {
            this.validateName = null;
        } else {
            this.validateName = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(InvestTxData investTxData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investTxData.lpTokenInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, InvestTxCoinInfo$$serializer.INSTANCE, investTxData.lpTokenInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investTxData.investInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, InvestInfo$$serializer.INSTANCE, investTxData.investInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investTxData.investmentDetailType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, investTxData.investmentDetailType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investTxData.projectId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, investTxData.projectId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investTxData.investInCoins != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], investTxData.investInCoins);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investTxData.investOutCoins != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], investTxData.investOutCoins);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || investTxData.redeemShowNum) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, investTxData.redeemShowNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || investTxData.investmentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, investTxData.investmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || investTxData.aggregateId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.INSTANCE, investTxData.aggregateId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && investTxData.validateName == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, investTxData.validateName);
    }

    public InvestTxData(InvestTxCoinInfo investTxCoinInfo, InvestInfo investInfo, Integer num, Long l, List<InvestTxCoinInfo> list, List<InvestTxCoinInfo> list2, boolean z, Long l2, Long l3, String str) {
        this.lpTokenInfo = investTxCoinInfo;
        this.investInfo = investInfo;
        this.investmentDetailType = num;
        this.projectId = l;
        this.investInCoins = list;
        this.investOutCoins = list2;
        this.redeemShowNum = z;
        this.investmentId = l2;
        this.aggregateId = l3;
        this.validateName = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:com.okinc.business.defi.biz.net.bean.InvestTxCoinInfo:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.InvestTxCoinInfo) : (r12v0 com.okinc.business.defi.biz.net.bean.InvestTxCoinInfo))
  (wrap:com.okinc.business.defi.biz.net.bean.InvestInfo:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.InvestInfo) : (r13v0 com.okinc.business.defi.biz.net.bean.InvestInfo))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r14v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r15v0 java.lang.Long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r16v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r17v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r19v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r20v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (null java.lang.String))
 A[MD:(com.okinc.business.defi.biz.net.bean.InvestTxCoinInfo, com.okinc.business.defi.biz.net.bean.InvestInfo, java.lang.Integer, java.lang.Long, java.util.List<com.okinc.business.defi.biz.net.bean.InvestTxCoinInfo>, java.util.List<com.okinc.business.defi.biz.net.bean.InvestTxCoinInfo>, boolean, java.lang.Long, java.lang.Long, java.lang.String):void (m)] (LINE:254) call: com.okinc.business.defi.biz.net.bean.InvestTxData.<init>(com.okinc.business.defi.biz.net.bean.InvestTxCoinInfo, com.okinc.business.defi.biz.net.bean.InvestInfo, java.lang.Integer, java.lang.Long, java.util.List, java.util.List, boolean, java.lang.Long, java.lang.Long, java.lang.String):void type: THIS */
    public /* synthetic */ InvestTxData(InvestTxCoinInfo investTxCoinInfo, InvestInfo investInfo, Integer num, Long l, List list, List list2, boolean z, Long l2, Long l3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : investTxCoinInfo, (i & 2) != 0 ? null : investInfo, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : l2, (i & 256) != 0 ? null : l3, (i & 512) == 0 ? str : null);
    }
}
