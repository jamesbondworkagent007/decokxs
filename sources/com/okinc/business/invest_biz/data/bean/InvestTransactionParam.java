package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData$$serializer;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestPoolV3;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestPoolV3$$serializer;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56402yEa;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestTransactionParam implements Parcelable {
    public static final int POOL_VERSION_2 = 1;
    public static final int POOL_VERSION_3 = 2;
    private final Long analysisPlatformId;
    private final long chainId;
    private final Integer estTime;
    private final List<InvestInputData> inputList;
    private final Integer investType;
    private final List<Long> investmentIdList;
    private final Boolean isBorrowSupply;
    private final boolean isHalfApproved;
    private final boolean isSingle;
    private final Integer nextOrderType;
    private final InvestPoolV3 poolInvestV3;
    private final Integer poolVersion;
    private final Long relatedInvestmentId;
    private final String router;
    private final Integer stakingMode;
    private final String tokenId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestTransactionParam> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(InvestInputData$$serializer.INSTANCE), null, null, null, null, null, null, new ArrayListSerializer(LongSerializer.INSTANCE), null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<InvestTransactionParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTransactionParam createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(InvestInputData.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            long j = parcel.readLong();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList3.add(Long.valueOf(parcel.readLong()));
            }
            return new InvestTransactionParam(arrayList, z, z2, j, numValueOf, lValueOf, string, arrayList3, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : InvestPoolV3.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTransactionParam[] newArray(int i) {
            return new InvestTransactionParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestTransactionParam() {
        this((List) null, false, false, 0L, (Integer) null, (Long) null, (String) null, (List) null, (Long) null, (Integer) null, (String) null, (Integer) null, (Integer) null, (InvestPoolV3) null, (Integer) null, (Boolean) null, 65535, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: com.okinc.business.invest_biz.data.bean.InvestTransactionParam */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestTransactionParam copy$default(InvestTransactionParam investTransactionParam, List list, boolean z, boolean z2, long j, Integer num, Long l, String str, List list2, Long l2, Integer num2, String str2, Integer num3, Integer num4, InvestPoolV3 investPoolV3, Integer num5, Boolean bool, int i, Object obj) {
        return investTransactionParam.copy((i & 1) != 0 ? investTransactionParam.inputList : list, (i & 2) != 0 ? investTransactionParam.isSingle : z, (i & 4) != 0 ? investTransactionParam.isHalfApproved : z2, (i & 8) != 0 ? investTransactionParam.chainId : j, (i & 16) != 0 ? investTransactionParam.investType : num, (i & 32) != 0 ? investTransactionParam.analysisPlatformId : l, (i & 64) != 0 ? investTransactionParam.router : str, (i & 128) != 0 ? investTransactionParam.investmentIdList : list2, (i & 256) != 0 ? investTransactionParam.relatedInvestmentId : l2, (i & 512) != 0 ? investTransactionParam.estTime : num2, (i & 1024) != 0 ? investTransactionParam.tokenId : str2, (i & 2048) != 0 ? investTransactionParam.poolVersion : num3, (i & 4096) != 0 ? investTransactionParam.nextOrderType : num4, (i & 8192) != 0 ? investTransactionParam.poolInvestV3 : investPoolV3, (i & 16384) != 0 ? investTransactionParam.stakingMode : num5, (i & 32768) != 0 ? investTransactionParam.isBorrowSupply : bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestInputData> component1() {
        return this.inputList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.estTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component12() {
        return this.poolVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component13() {
        return this.nextOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestPoolV3 component14() {
        return this.poolInvestV3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component15() {
        return this.stakingMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component16() {
        return this.isBorrowSupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isSingle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isHalfApproved;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component6() {
        return this.analysisPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.router;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component8() {
        return this.investmentIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component9() {
        return this.relatedInvestmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTransactionParam copy(List<InvestInputData> list, boolean z, boolean z2, long j, Integer num, Long l, @NotNull String str, @NotNull List<Long> list2, Long l2, Integer num2, String str2, Integer num3, Integer num4, InvestPoolV3 investPoolV3, Integer num5, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new InvestTransactionParam(list, z, z2, j, num, l, str, list2, l2, num2, str2, num3, num4, investPoolV3, num5, bool);
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
        if (!(obj instanceof InvestTransactionParam)) {
            return false;
        }
        InvestTransactionParam investTransactionParam = (InvestTransactionParam) obj;
        return Intrinsics.EZpvd(this.inputList, investTransactionParam.inputList) && this.isSingle == investTransactionParam.isSingle && this.isHalfApproved == investTransactionParam.isHalfApproved && this.chainId == investTransactionParam.chainId && Intrinsics.EZpvd(this.investType, investTransactionParam.investType) && Intrinsics.EZpvd(this.analysisPlatformId, investTransactionParam.analysisPlatformId) && Intrinsics.EZpvd((Object) this.router, (Object) investTransactionParam.router) && Intrinsics.EZpvd(this.investmentIdList, investTransactionParam.investmentIdList) && Intrinsics.EZpvd(this.relatedInvestmentId, investTransactionParam.relatedInvestmentId) && Intrinsics.EZpvd(this.estTime, investTransactionParam.estTime) && Intrinsics.EZpvd((Object) this.tokenId, (Object) investTransactionParam.tokenId) && Intrinsics.EZpvd(this.poolVersion, investTransactionParam.poolVersion) && Intrinsics.EZpvd(this.nextOrderType, investTransactionParam.nextOrderType) && Intrinsics.EZpvd(this.poolInvestV3, investTransactionParam.poolInvestV3) && Intrinsics.EZpvd(this.stakingMode, investTransactionParam.stakingMode) && Intrinsics.EZpvd(this.isBorrowSupply, investTransactionParam.isBorrowSupply);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getAnalysisPlatformId() {
        return this.analysisPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getEstTime() {
        return this.estTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestInputData> getInputList() {
        return this.inputList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getInvestType() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getInvestmentIdList() {
        return this.investmentIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getNextOrderType() {
        return this.nextOrderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestPoolV3 getPoolInvestV3() {
        return this.poolInvestV3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPoolVersion() {
        return this.poolVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getRelatedInvestmentId() {
        return this.relatedInvestmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRouter() {
        return this.router;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStakingMode() {
        return this.stakingMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenId() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<InvestInputData> list = this.inputList;
        int iHashCode = list == null ? 0 : list.hashCode();
        int iHashCode2 = Boolean.hashCode(this.isSingle);
        int iHashCode3 = Boolean.hashCode(this.isHalfApproved);
        int iHashCode4 = Long.hashCode(this.chainId);
        Integer num = this.investType;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        Long l = this.analysisPlatformId;
        int iHashCode6 = l == null ? 0 : l.hashCode();
        int iHashCode7 = this.router.hashCode();
        int iHashCode8 = this.investmentIdList.hashCode();
        Long l2 = this.relatedInvestmentId;
        int iHashCode9 = l2 == null ? 0 : l2.hashCode();
        Integer num2 = this.estTime;
        int iHashCode10 = num2 == null ? 0 : num2.hashCode();
        String str = this.tokenId;
        int iHashCode11 = str == null ? 0 : str.hashCode();
        Integer num3 = this.poolVersion;
        int iHashCode12 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.nextOrderType;
        int iHashCode13 = num4 == null ? 0 : num4.hashCode();
        InvestPoolV3 investPoolV3 = this.poolInvestV3;
        int iHashCode14 = investPoolV3 == null ? 0 : investPoolV3.hashCode();
        Integer num5 = this.stakingMode;
        int iHashCode15 = num5 == null ? 0 : num5.hashCode();
        Boolean bool = this.isBorrowSupply;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (bool == null ? 0 : bool.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isBorrowSupply() {
        return this.isBorrowSupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHalfApproved() {
        return this.isHalfApproved;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSingle() {
        return this.isSingle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestTransactionParam(inputList=" + this.inputList + ", isSingle=" + this.isSingle + ", isHalfApproved=" + this.isHalfApproved + ", chainId=" + this.chainId + ", investType=" + this.investType + ", analysisPlatformId=" + this.analysisPlatformId + ", router=" + this.router + ", investmentIdList=" + this.investmentIdList + ", relatedInvestmentId=" + this.relatedInvestmentId + ", estTime=" + this.estTime + ", tokenId=" + this.tokenId + ", poolVersion=" + this.poolVersion + ", nextOrderType=" + this.nextOrderType + ", poolInvestV3=" + this.poolInvestV3 + ", stakingMode=" + this.stakingMode + ", isBorrowSupply=" + this.isBorrowSupply + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<InvestInputData> list = this.inputList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<InvestInputData> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.isSingle ? 1 : 0);
        parcel.writeInt(this.isHalfApproved ? 1 : 0);
        parcel.writeLong(this.chainId);
        Integer num = this.investType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l = this.analysisPlatformId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.router);
        List<Long> list2 = this.investmentIdList;
        parcel.writeInt(list2.size());
        Iterator<Long> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeLong(it2.next().longValue());
        }
        Long l2 = this.relatedInvestmentId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Integer num2 = this.estTime;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.tokenId);
        Integer num3 = this.poolVersion;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.nextOrderType;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        InvestPoolV3 investPoolV3 = this.poolInvestV3;
        if (investPoolV3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investPoolV3.writeToParcel(parcel, i);
        }
        Integer num5 = this.stakingMode;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Boolean bool = this.isBorrowSupply;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ InvestTransactionParam(int i, List list, boolean z, boolean z2, long j, Integer num, Long l, String str, List list2, Long l2, Integer num2, String str2, Integer num3, Integer num4, InvestPoolV3 investPoolV3, Integer num5, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        this.inputList = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.isSingle = false;
        } else {
            this.isSingle = z;
        }
        if ((i & 4) == 0) {
            this.isHalfApproved = false;
        } else {
            this.isHalfApproved = z2;
        }
        this.chainId = (i & 8) == 0 ? 0L : j;
        if ((i & 16) == 0) {
            this.investType = null;
        } else {
            this.investType = num;
        }
        if ((i & 32) == 0) {
            this.analysisPlatformId = null;
        } else {
            this.analysisPlatformId = l;
        }
        this.router = (i & 64) == 0 ? "" : str;
        this.investmentIdList = (i & 128) == 0 ? yDY.AhwBna() : list2;
        if ((i & 256) == 0) {
            this.relatedInvestmentId = null;
        } else {
            this.relatedInvestmentId = l2;
        }
        if ((i & 512) == 0) {
            this.estTime = null;
        } else {
            this.estTime = num2;
        }
        if ((i & 1024) == 0) {
            this.tokenId = null;
        } else {
            this.tokenId = str2;
        }
        if ((i & 2048) == 0) {
            this.poolVersion = null;
        } else {
            this.poolVersion = num3;
        }
        if ((i & 4096) == 0) {
            this.nextOrderType = null;
        } else {
            this.nextOrderType = num4;
        }
        if ((i & 8192) == 0) {
            this.poolInvestV3 = null;
        } else {
            this.poolInvestV3 = investPoolV3;
        }
        if ((i & 16384) == 0) {
            this.stakingMode = null;
        } else {
            this.stakingMode = num5;
        }
        if ((i & 32768) == 0) {
            this.isBorrowSupply = null;
        } else {
            this.isBorrowSupply = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestTransactionParam investTransactionParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(investTransactionParam.inputList, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], investTransactionParam.inputList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investTransactionParam.isSingle) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, investTransactionParam.isSingle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investTransactionParam.isHalfApproved) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, investTransactionParam.isHalfApproved);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investTransactionParam.chainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 3, investTransactionParam.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investTransactionParam.investType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, investTransactionParam.investType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investTransactionParam.analysisPlatformId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, investTransactionParam.analysisPlatformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) investTransactionParam.router, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, investTransactionParam.router);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(investTransactionParam.investmentIdList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], investTransactionParam.investmentIdList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || investTransactionParam.relatedInvestmentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.INSTANCE, investTransactionParam.relatedInvestmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || investTransactionParam.estTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, investTransactionParam.estTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || investTransactionParam.tokenId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, investTransactionParam.tokenId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || investTransactionParam.poolVersion != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, investTransactionParam.poolVersion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || investTransactionParam.nextOrderType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.INSTANCE, investTransactionParam.nextOrderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || investTransactionParam.poolInvestV3 != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, InvestPoolV3$$serializer.INSTANCE, investTransactionParam.poolInvestV3);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || investTransactionParam.stakingMode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, IntSerializer.INSTANCE, investTransactionParam.stakingMode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && investTransactionParam.isBorrowSupply == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, investTransactionParam.isBorrowSupply);
    }

    public InvestTransactionParam(List<InvestInputData> list, boolean z, boolean z2, long j, Integer num, Long l, @NotNull String str, @NotNull List<Long> list2, Long l2, Integer num2, String str2, Integer num3, Integer num4, InvestPoolV3 investPoolV3, Integer num5, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.inputList = list;
        this.isSingle = z;
        this.isHalfApproved = z2;
        this.chainId = j;
        this.investType = num;
        this.analysisPlatformId = l;
        this.router = str;
        this.investmentIdList = list2;
        this.relatedInvestmentId = l2;
        this.estTime = num2;
        this.tokenId = str2;
        this.poolVersion = num3;
        this.nextOrderType = num4;
        this.poolInvestV3 = investPoolV3;
        this.stakingMode = num5;
        this.isBorrowSupply = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b1: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r18v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000d: ARITH (r35v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r35v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r20v0 boolean) : false)
  (wrap:long:?: TERNARY null = ((wrap:int:0x001d: ARITH (r35v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r21v0 long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0026: ARITH (r35v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r23v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x002e: ARITH (r35v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r24v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r35v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003f: ARITH (r35v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0043: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:22)) : (r26v0 java.util.List))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x004a: ARITH (r35v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r27v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0052: ARITH (r35v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r28v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r35v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0062: ARITH (r35v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r30v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x006a: ARITH (r35v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r31v0 java.lang.Integer))
  (wrap:com.okinc.business.invest_biz.data.logic.ws.bean.InvestPoolV3:0x007a: TERNARY null = ((wrap:int:0x0072: ARITH (r35v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.logic.ws.bean.InvestPoolV3) : (r32v0 com.okinc.business.invest_biz.data.logic.ws.bean.InvestPoolV3))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x007c: ARITH (r35v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r33v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0087: ARITH (r35v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r34v0 java.lang.Boolean))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData>, boolean, boolean, long, java.lang.Integer, java.lang.Long, java.lang.String, java.util.List<java.lang.Long>, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, com.okinc.business.invest_biz.data.logic.ws.bean.InvestPoolV3, java.lang.Integer, java.lang.Boolean):void (m)] (LINE:14) call: com.okinc.business.invest_biz.data.bean.InvestTransactionParam.<init>(java.util.List, boolean, boolean, long, java.lang.Integer, java.lang.Long, java.lang.String, java.util.List, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, com.okinc.business.invest_biz.data.logic.ws.bean.InvestPoolV3, java.lang.Integer, java.lang.Boolean):void type: THIS */
    public /* synthetic */ InvestTransactionParam(List list, boolean z, boolean z2, long j, Integer num, Long l, String str, List list2, Long l2, Integer num2, String str2, Integer num3, Integer num4, InvestPoolV3 investPoolV3, Integer num5, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? false : z, (i & 4) == 0 ? z2 : false, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : l, (i & 64) != 0 ? "" : str, (i & 128) != 0 ? yDY.AhwBna() : list2, (i & 256) != 0 ? null : l2, (i & 512) != 0 ? null : num2, (i & 1024) != 0 ? null : str2, (i & 2048) != 0 ? null : num3, (i & 4096) != 0 ? null : num4, (i & 8192) != 0 ? null : investPoolV3, (i & 16384) != 0 ? null : num5, (i & 32768) != 0 ? null : bool);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestTransactionParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InvestTransactionParam> serializer() {
            return InvestTransactionParam$$serializer.INSTANCE;
        }

        public final InvestTransactionParam copydefault(List<Long> list, List<InvestInputData> list2, long j, long j2, int i, boolean z) {
            return new InvestTransactionParam((List) list2, z, false, j, Integer.valueOf(i), Long.valueOf(j2), (String) null, (List) list, (Long) null, (Integer) null, (String) null, (Integer) null, (Integer) null, (InvestPoolV3) null, (Integer) null, (Boolean) null, 65348, (DefaultConstructorMarker) null);
        }

        public final InvestTransactionParam OLrzqt(@NotNull TransactionConfig transactionConfig) {
            Intrinsics.checkNotNullParameter(transactionConfig, "");
            return copydefault(C56402yEa.EZpvd(Long.valueOf(transactionConfig.isConnected())), transactionConfig.valueOf(), transactionConfig.copydefault(), transactionConfig.OLrzqt(), transactionConfig.djBIcL(), transactionConfig.AwvSrB());
        }

        public static /* synthetic */ InvestTransactionParam instanceForUniV3Redeem$default(Companion companion, TransactionConfig transactionConfig, String str, int i, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                i = 2;
            }
            return companion.AEQbTJ(transactionConfig, str, i);
        }

        public final InvestTransactionParam AEQbTJ(@NotNull TransactionConfig transactionConfig, @NotNull String str, int i) {
            Intrinsics.checkNotNullParameter(transactionConfig, "");
            Intrinsics.checkNotNullParameter(str, "");
            return InvestTransactionParam.copy$default(OLrzqt(transactionConfig), null, false, false, 0L, null, null, null, null, null, null, str, Integer.valueOf(i), null, null, null, null, 62463, null);
        }

        public static /* synthetic */ InvestTransactionParam instanceForV3FarmInvest$default(Companion companion, TransactionConfig transactionConfig, String str, int i, boolean z, Integer num, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                i = 2;
            }
            return companion.EZpvd(transactionConfig, str, i, z, num);
        }

        public final InvestTransactionParam EZpvd(@NotNull TransactionConfig transactionConfig, @NotNull String str, int i, boolean z, Integer num) {
            Intrinsics.checkNotNullParameter(transactionConfig, "");
            Intrinsics.checkNotNullParameter(str, "");
            return InvestTransactionParam.copy$default(copydefault(C56402yEa.EZpvd(Long.valueOf(transactionConfig.isConnected())), transactionConfig.valueOf(), transactionConfig.copydefault(), transactionConfig.OLrzqt(), transactionConfig.djBIcL(), transactionConfig.AwvSrB()), null, false, z, 0L, null, null, null, null, null, null, str, Integer.valueOf(i), num, null, null, null, 58363, null);
        }

        public static /* synthetic */ InvestTransactionParam instanceForUniV3Invest$default(Companion companion, TransactionConfig transactionConfig, String str, int i, boolean z, Integer num, InvestPoolV3 investPoolV3, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                i = 2;
            }
            return companion.KWHzl(transactionConfig, str, i, z, num, investPoolV3);
        }

        public final InvestTransactionParam KWHzl(@NotNull TransactionConfig transactionConfig, @NotNull String str, int i, boolean z, Integer num, @NotNull InvestPoolV3 investPoolV3) {
            Intrinsics.checkNotNullParameter(transactionConfig, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(investPoolV3, "");
            return InvestTransactionParam.copy$default(EZpvd(transactionConfig, str, i, z, num), null, false, false, 0L, null, null, null, null, null, null, null, null, null, investPoolV3, null, null, 57343, null);
        }

        public final InvestTransactionParam OLrzqt(@NotNull TransactionConfig transactionConfig, @NotNull List<InvestInputData> list, long j, boolean z) {
            Intrinsics.checkNotNullParameter(transactionConfig, "");
            Intrinsics.checkNotNullParameter(list, "");
            return InvestTransactionParam.copy$default(copydefault(C56402yEa.EZpvd(Long.valueOf(transactionConfig.isConnected())), list, transactionConfig.copydefault(), transactionConfig.OLrzqt(), transactionConfig.djBIcL(), transactionConfig.AwvSrB()), null, false, z, 0L, null, null, null, null, Long.valueOf(j), null, null, null, null, null, null, null, 65275, null);
        }
    }
}
