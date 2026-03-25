package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C25541iyf;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestUserAssetDetailByPosition implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final InvestAssetPositionType assetPositionType;
    private final List<InvestBaseDefiTokenInfo> assetsTokenList;
    private final boolean isNarrow;
    private boolean isReverse;
    private final boolean needInvest;
    private final String nftLogo;
    private final List<PositionExtInfo> positionExtInfoList;
    private final String positionName;
    private final String positionStatus;
    private String range;
    private String reverseRange;
    private final List<InvestUserRewardInfoByInvestment> rewardDefiTokenInfo;
    private final String settlementTime;
    private final boolean showIncreaseLiquidity;
    private String tokenId;
    private final String totalValue;
    private final List<InvestUserRewardInfoByInvestment> unclaimFeesDefiTokenInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestUserAssetDetailByPosition> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestUserAssetDetailByPosition> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUserAssetDetailByPosition createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList4.add(InvestBaseDefiTokenInfo.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList4;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList5.add(InvestUserRewardInfoByInvestment.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList5;
            }
            boolean z2 = parcel.readInt() != 0;
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList6.add(InvestUserRewardInfoByInvestment.CREATOR.createFromParcel(parcel));
                }
                arrayList3 = arrayList6;
            }
            String string7 = parcel.readString();
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            InvestAssetPositionType investAssetPositionTypeValueOf = parcel.readInt() == 0 ? null : InvestAssetPositionType.valueOf(parcel.readString());
            int i7 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                arrayList7.add(PositionExtInfo.CREATOR.createFromParcel(parcel));
            }
            return new InvestUserAssetDetailByPosition(arrayList, string, string2, string3, string4, z, arrayList2, z2, string5, string6, arrayList3, string7, z3, z4, investAssetPositionTypeValueOf, arrayList7, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUserAssetDetailByPosition[] newArray(int i) {
            return new InvestUserAssetDetailByPosition[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestUserAssetDetailByPosition() {
        this((List) null, (String) null, (String) null, (String) null, (String) null, false, (List) null, false, (String) null, (String) null, (List) null, (String) null, false, false, (InvestAssetPositionType) null, (List) null, (String) null, 131071, (DefaultConstructorMarker) null);
    }

    @SerialName("assetPositionType")
    public static /* synthetic */ void getAssetPositionType$annotations() {
    }

    @SerialName("positionExtInfoList")
    public static /* synthetic */ void getPositionExtInfoList$annotations() {
    }

    @SerialName("settlementTime")
    public static /* synthetic */ void getSettlementTime$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestBaseDefiTokenInfo> component1() {
        return this.assetsTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.totalValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUserRewardInfoByInvestment> component11() {
        return this.unclaimFeesDefiTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.nftLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component13() {
        return this.isNarrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.needInvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestAssetPositionType component15() {
        return this.assetPositionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PositionExtInfo> component16() {
        return this.positionExtInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.settlementTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.positionName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.positionStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.range;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.reverseRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isReverse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUserRewardInfoByInvestment> component7() {
        return this.rewardDefiTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.showIncreaseLiquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUserAssetDetailByPosition copy(List<InvestBaseDefiTokenInfo> list, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, List<InvestUserRewardInfoByInvestment> list2, boolean z2, @NotNull String str5, String str6, List<InvestUserRewardInfoByInvestment> list3, @NotNull String str7, boolean z3, boolean z4, InvestAssetPositionType investAssetPositionType, @NotNull List<PositionExtInfo> list4, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list4, "");
        return new InvestUserAssetDetailByPosition(list, str, str2, str3, str4, z, list2, z2, str5, str6, list3, str7, z3, z4, investAssetPositionType, list4, str8);
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
        if (!(obj instanceof InvestUserAssetDetailByPosition)) {
            return false;
        }
        InvestUserAssetDetailByPosition investUserAssetDetailByPosition = (InvestUserAssetDetailByPosition) obj;
        return Intrinsics.EZpvd(this.assetsTokenList, investUserAssetDetailByPosition.assetsTokenList) && Intrinsics.EZpvd((Object) this.positionName, (Object) investUserAssetDetailByPosition.positionName) && Intrinsics.EZpvd((Object) this.positionStatus, (Object) investUserAssetDetailByPosition.positionStatus) && Intrinsics.EZpvd((Object) this.range, (Object) investUserAssetDetailByPosition.range) && Intrinsics.EZpvd((Object) this.reverseRange, (Object) investUserAssetDetailByPosition.reverseRange) && this.isReverse == investUserAssetDetailByPosition.isReverse && Intrinsics.EZpvd(this.rewardDefiTokenInfo, investUserAssetDetailByPosition.rewardDefiTokenInfo) && this.showIncreaseLiquidity == investUserAssetDetailByPosition.showIncreaseLiquidity && Intrinsics.EZpvd((Object) this.tokenId, (Object) investUserAssetDetailByPosition.tokenId) && Intrinsics.EZpvd((Object) this.totalValue, (Object) investUserAssetDetailByPosition.totalValue) && Intrinsics.EZpvd(this.unclaimFeesDefiTokenInfo, investUserAssetDetailByPosition.unclaimFeesDefiTokenInfo) && Intrinsics.EZpvd((Object) this.nftLogo, (Object) investUserAssetDetailByPosition.nftLogo) && this.isNarrow == investUserAssetDetailByPosition.isNarrow && this.needInvest == investUserAssetDetailByPosition.needInvest && this.assetPositionType == investUserAssetDetailByPosition.assetPositionType && Intrinsics.EZpvd(this.positionExtInfoList, investUserAssetDetailByPosition.positionExtInfoList) && Intrinsics.EZpvd((Object) this.settlementTime, (Object) investUserAssetDetailByPosition.settlementTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestAssetPositionType getAssetPositionType() {
        return this.assetPositionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestBaseDefiTokenInfo> getAssetsTokenList() {
        return this.assetsTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedInvest() {
        return this.needInvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftLogo() {
        return this.nftLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PositionExtInfo> getPositionExtInfoList() {
        return this.positionExtInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPositionName() {
        return this.positionName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPositionStatus() {
        return this.positionStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRange() {
        return this.range;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReverseRange() {
        return this.reverseRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUserRewardInfoByInvestment> getRewardDefiTokenInfo() {
        return this.rewardDefiTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettlementTime() {
        return this.settlementTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowIncreaseLiquidity() {
        return this.showIncreaseLiquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenId() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalValue() {
        return this.totalValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUserRewardInfoByInvestment> getUnclaimFeesDefiTokenInfo() {
        return this.unclaimFeesDefiTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<InvestBaseDefiTokenInfo> list = this.assetsTokenList;
        int iHashCode = list == null ? 0 : list.hashCode();
        int iHashCode2 = this.positionName.hashCode();
        int iHashCode3 = this.positionStatus.hashCode();
        int iHashCode4 = this.range.hashCode();
        int iHashCode5 = this.reverseRange.hashCode();
        int iHashCode6 = Boolean.hashCode(this.isReverse);
        List<InvestUserRewardInfoByInvestment> list2 = this.rewardDefiTokenInfo;
        int iHashCode7 = list2 == null ? 0 : list2.hashCode();
        int iHashCode8 = Boolean.hashCode(this.showIncreaseLiquidity);
        int iHashCode9 = this.tokenId.hashCode();
        String str = this.totalValue;
        int iHashCode10 = str == null ? 0 : str.hashCode();
        List<InvestUserRewardInfoByInvestment> list3 = this.unclaimFeesDefiTokenInfo;
        int iHashCode11 = list3 == null ? 0 : list3.hashCode();
        int iHashCode12 = this.nftLogo.hashCode();
        int iHashCode13 = Boolean.hashCode(this.isNarrow);
        int iHashCode14 = Boolean.hashCode(this.needInvest);
        InvestAssetPositionType investAssetPositionType = this.assetPositionType;
        int iHashCode15 = investAssetPositionType == null ? 0 : investAssetPositionType.hashCode();
        int iHashCode16 = this.positionExtInfoList.hashCode();
        String str2 = this.settlementTime;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (str2 == null ? 0 : str2.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNarrow() {
        return this.isNarrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isReverse() {
        return this.isReverse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRange(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.range = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReverse(boolean z) {
        this.isReverse = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReverseRange(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.reverseRange = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUserAssetDetailByPosition(assetsTokenList=" + this.assetsTokenList + ", positionName=" + this.positionName + ", positionStatus=" + this.positionStatus + ", range=" + this.range + ", reverseRange=" + this.reverseRange + ", isReverse=" + this.isReverse + ", rewardDefiTokenInfo=" + this.rewardDefiTokenInfo + ", showIncreaseLiquidity=" + this.showIncreaseLiquidity + ", tokenId=" + this.tokenId + ", totalValue=" + this.totalValue + ", unclaimFeesDefiTokenInfo=" + this.unclaimFeesDefiTokenInfo + ", nftLogo=" + this.nftLogo + ", isNarrow=" + this.isNarrow + ", needInvest=" + this.needInvest + ", assetPositionType=" + this.assetPositionType + ", positionExtInfoList=" + this.positionExtInfoList + ", settlementTime=" + this.settlementTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<InvestBaseDefiTokenInfo> list = this.assetsTokenList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<InvestBaseDefiTokenInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.positionName);
        parcel.writeString(this.positionStatus);
        parcel.writeString(this.range);
        parcel.writeString(this.reverseRange);
        parcel.writeInt(this.isReverse ? 1 : 0);
        List<InvestUserRewardInfoByInvestment> list2 = this.rewardDefiTokenInfo;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<InvestUserRewardInfoByInvestment> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.showIncreaseLiquidity ? 1 : 0);
        parcel.writeString(this.tokenId);
        parcel.writeString(this.totalValue);
        List<InvestUserRewardInfoByInvestment> list3 = this.unclaimFeesDefiTokenInfo;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<InvestUserRewardInfoByInvestment> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.nftLogo);
        parcel.writeInt(this.isNarrow ? 1 : 0);
        parcel.writeInt(this.needInvest ? 1 : 0);
        InvestAssetPositionType investAssetPositionType = this.assetPositionType;
        if (investAssetPositionType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(investAssetPositionType.name());
        }
        List<PositionExtInfo> list4 = this.positionExtInfoList;
        parcel.writeInt(list4.size());
        Iterator<PositionExtInfo> it4 = list4.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.settlementTime);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailByPosition.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestUserAssetDetailByPosition> serializer() {
            return InvestUserAssetDetailByPosition$$serializer.INSTANCE;
        }
    }

    static {
        InvestUserRewardInfoByInvestment$$serializer investUserRewardInfoByInvestment$$serializer = InvestUserRewardInfoByInvestment$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(InvestBaseDefiTokenInfo$$serializer.INSTANCE), null, null, null, null, null, new ArrayListSerializer(investUserRewardInfoByInvestment$$serializer), null, null, null, new ArrayListSerializer(investUserRewardInfoByInvestment$$serializer), null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.invest_biz.data.bean.InvestAssetPositionType", InvestAssetPositionType.values()), new ArrayListSerializer(PositionExtInfo$$serializer.INSTANCE), null};
    }

    public /* synthetic */ InvestUserAssetDetailByPosition(int i, List list, String str, String str2, String str3, String str4, boolean z, List list2, boolean z2, String str5, String str6, List list3, String str7, boolean z3, boolean z4, InvestAssetPositionType investAssetPositionType, List list4, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.assetsTokenList = null;
        } else {
            this.assetsTokenList = list;
        }
        if ((i & 2) == 0) {
            this.positionName = "";
        } else {
            this.positionName = str;
        }
        if ((i & 4) == 0) {
            this.positionStatus = "";
        } else {
            this.positionStatus = str2;
        }
        if ((i & 8) == 0) {
            this.range = "";
        } else {
            this.range = str3;
        }
        if ((i & 16) == 0) {
            this.reverseRange = "";
        } else {
            this.reverseRange = str4;
        }
        if ((i & 32) == 0) {
            this.isReverse = false;
        } else {
            this.isReverse = z;
        }
        if ((i & 64) == 0) {
            this.rewardDefiTokenInfo = null;
        } else {
            this.rewardDefiTokenInfo = list2;
        }
        if ((i & 128) == 0) {
            this.showIncreaseLiquidity = false;
        } else {
            this.showIncreaseLiquidity = z2;
        }
        if ((i & 256) == 0) {
            this.tokenId = "";
        } else {
            this.tokenId = str5;
        }
        if ((i & 512) == 0) {
            this.totalValue = null;
        } else {
            this.totalValue = str6;
        }
        if ((i & 1024) == 0) {
            this.unclaimFeesDefiTokenInfo = null;
        } else {
            this.unclaimFeesDefiTokenInfo = list3;
        }
        if ((i & 2048) == 0) {
            this.nftLogo = "";
        } else {
            this.nftLogo = str7;
        }
        if ((i & 4096) == 0) {
            this.isNarrow = false;
        } else {
            this.isNarrow = z3;
        }
        if ((i & 8192) == 0) {
            this.needInvest = false;
        } else {
            this.needInvest = z4;
        }
        if ((i & 16384) == 0) {
            this.assetPositionType = null;
        } else {
            this.assetPositionType = investAssetPositionType;
        }
        this.positionExtInfoList = (32768 & i) == 0 ? yDY.AhwBna() : list4;
        if ((i & 65536) == 0) {
            this.settlementTime = null;
        } else {
            this.settlementTime = str8;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestUserAssetDetailByPosition investUserAssetDetailByPosition, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investUserAssetDetailByPosition.assetsTokenList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], investUserAssetDetailByPosition.assetsTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investUserAssetDetailByPosition.positionName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, investUserAssetDetailByPosition.positionName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investUserAssetDetailByPosition.positionStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investUserAssetDetailByPosition.positionStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) investUserAssetDetailByPosition.range, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, investUserAssetDetailByPosition.range);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) investUserAssetDetailByPosition.reverseRange, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, investUserAssetDetailByPosition.reverseRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investUserAssetDetailByPosition.isReverse) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, investUserAssetDetailByPosition.isReverse);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || investUserAssetDetailByPosition.rewardDefiTokenInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], investUserAssetDetailByPosition.rewardDefiTokenInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || investUserAssetDetailByPosition.showIncreaseLiquidity) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, investUserAssetDetailByPosition.showIncreaseLiquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) investUserAssetDetailByPosition.tokenId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, investUserAssetDetailByPosition.tokenId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || investUserAssetDetailByPosition.totalValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, investUserAssetDetailByPosition.totalValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || investUserAssetDetailByPosition.unclaimFeesDefiTokenInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], investUserAssetDetailByPosition.unclaimFeesDefiTokenInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) investUserAssetDetailByPosition.nftLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, investUserAssetDetailByPosition.nftLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || investUserAssetDetailByPosition.isNarrow) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, investUserAssetDetailByPosition.isNarrow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || investUserAssetDetailByPosition.needInvest) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 13, investUserAssetDetailByPosition.needInvest);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || investUserAssetDetailByPosition.assetPositionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, kSerializerArr[14], investUserAssetDetailByPosition.assetPositionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd(investUserAssetDetailByPosition.positionExtInfoList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 15, kSerializerArr[15], investUserAssetDetailByPosition.positionExtInfoList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && investUserAssetDetailByPosition.settlementTime == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, investUserAssetDetailByPosition.settlementTime);
    }

    public InvestUserAssetDetailByPosition(List<InvestBaseDefiTokenInfo> list, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, List<InvestUserRewardInfoByInvestment> list2, boolean z2, @NotNull String str5, String str6, List<InvestUserRewardInfoByInvestment> list3, @NotNull String str7, boolean z3, boolean z4, InvestAssetPositionType investAssetPositionType, @NotNull List<PositionExtInfo> list4, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list4, "");
        this.assetsTokenList = list;
        this.positionName = str;
        this.positionStatus = str2;
        this.range = str3;
        this.reverseRange = str4;
        this.isReverse = z;
        this.rewardDefiTokenInfo = list2;
        this.showIncreaseLiquidity = z2;
        this.tokenId = str5;
        this.totalValue = str6;
        this.unclaimFeesDefiTokenInfo = list3;
        this.nftLogo = str7;
        this.isNarrow = z3;
        this.needInvest = z4;
        this.assetPositionType = investAssetPositionType;
        this.positionExtInfoList = list4;
        this.settlementTime = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b7: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r19v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002c: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r24v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0035: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r25v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003d: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r26v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0055: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r29v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r30v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0064: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006c: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r32v0 boolean) : false)
  (wrap:com.okinc.business.invest_biz.data.bean.InvestAssetPositionType:?: TERNARY null = ((wrap:int:0x0073: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestAssetPositionType) : (r33v0 com.okinc.business.invest_biz.data.bean.InvestAssetPositionType))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x007e: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0082: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:163)) : (r34v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008b: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List<com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment>, boolean, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment>, java.lang.String, boolean, boolean, com.okinc.business.invest_biz.data.bean.InvestAssetPositionType, java.util.List<com.okinc.business.invest_biz.data.bean.PositionExtInfo>, java.lang.String):void (m)] (LINE:145) call: com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailByPosition.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List, boolean, java.lang.String, java.lang.String, java.util.List, java.lang.String, boolean, boolean, com.okinc.business.invest_biz.data.bean.InvestAssetPositionType, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ InvestUserAssetDetailByPosition(List list, String str, String str2, String str3, String str4, boolean z, List list2, boolean z2, String str5, String str6, List list3, String str7, boolean z3, boolean z4, InvestAssetPositionType investAssetPositionType, List list4, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : list3, (i & 2048) == 0 ? str7 : "", (i & 4096) != 0 ? false : z3, (i & 8192) == 0 ? z4 : false, (i & 16384) != 0 ? null : investAssetPositionType, (i & 32768) != 0 ? yDY.AhwBna() : list4, (i & 65536) != 0 ? null : str8);
    }

    public final boolean isActive() {
        return C25541iyf.OLrzqt(this.positionStatus);
    }
}
