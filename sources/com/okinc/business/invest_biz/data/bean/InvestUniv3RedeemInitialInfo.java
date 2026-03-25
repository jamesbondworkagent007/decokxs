package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount$$serializer;
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
import o.C25541iyf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestUniv3RedeemInitialInfo implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final Long analysisPlatformId;
    private final long chainId;
    private final String feeRate;
    private final int investType;
    private final long investmentId;
    private final String investmentName;
    private final boolean isSupportSwap;
    private final String lowerPrice;
    private final InvestTokenWithAmount lpTokenInfo;
    private final String network;
    private final String networkLogo;
    private final String platformLogo;
    private final String platformName;
    private final String positionStatus;
    private final PromptInformation promptInformation;
    private final List<InvestTokenWithAmount> receiveTokenList;
    private final Integer redeemMethod;
    private final int refreshTime;
    private final boolean supportZap;
    private final String tokenId;
    private final List<InvestTokenWithAmount> underlyingTokenList;
    private final String upperPrice;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestUniv3RedeemInitialInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestUniv3RedeemInitialInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUniv3RedeemInitialInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            long j = parcel.readLong();
            String string = parcel.readString();
            int i = parcel.readInt();
            long j2 = parcel.readLong();
            String string2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string3 = parcel.readString();
            InvestTokenWithAmount investTokenWithAmountCreateFromParcel = parcel.readInt() == 0 ? null : InvestTokenWithAmount.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            PromptInformation promptInformationCreateFromParcel = parcel.readInt() == 0 ? null : PromptInformation.CREATOR.createFromParcel(parcel);
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                arrayList.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
                i3++;
                i2 = i2;
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i4 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i4);
            int i5 = 0;
            while (i5 != i4) {
                arrayList2.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
                i5++;
                i4 = i4;
            }
            return new InvestUniv3RedeemInitialInfo(lValueOf, j, string, i, j2, string2, z, string3, investTokenWithAmountCreateFromParcel, string4, string5, string6, string7, string8, promptInformationCreateFromParcel, arrayList, numValueOf, arrayList2, parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUniv3RedeemInitialInfo[] newArray(int i) {
            return new InvestUniv3RedeemInitialInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestUniv3RedeemInitialInfo() {
        this((Long) null, 0L, (String) null, 0, 0L, (String) null, false, (String) null, (InvestTokenWithAmount) null, (String) null, (String) null, (String) null, (String) null, (String) null, (PromptInformation) null, (List) null, (Integer) null, (List) null, (String) null, false, 0, (String) null, 4194303, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.analysisPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.platformLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.positionStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PromptInformation component15() {
        return this.promptInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component16() {
        return this.receiveTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component17() {
        return this.redeemMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component18() {
        return this.underlyingTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.upperPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component20() {
        return this.supportZap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component21() {
        return this.refreshTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.investmentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isSupportSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.lowerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount component9() {
        return this.lpTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUniv3RedeemInitialInfo copy(Long l, long j, @NotNull String str, int i, long j2, @NotNull String str2, boolean z, @NotNull String str3, InvestTokenWithAmount investTokenWithAmount, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, PromptInformation promptInformation, @NotNull List<InvestTokenWithAmount> list, Integer num, @NotNull List<InvestTokenWithAmount> list2, @NotNull String str9, boolean z2, int i2, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new InvestUniv3RedeemInitialInfo(l, j, str, i, j2, str2, z, str3, investTokenWithAmount, str4, str5, str6, str7, str8, promptInformation, list, num, list2, str9, z2, i2, str10);
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
        if (!(obj instanceof InvestUniv3RedeemInitialInfo)) {
            return false;
        }
        InvestUniv3RedeemInitialInfo investUniv3RedeemInitialInfo = (InvestUniv3RedeemInitialInfo) obj;
        return Intrinsics.EZpvd(this.analysisPlatformId, investUniv3RedeemInitialInfo.analysisPlatformId) && this.chainId == investUniv3RedeemInitialInfo.chainId && Intrinsics.EZpvd((Object) this.feeRate, (Object) investUniv3RedeemInitialInfo.feeRate) && this.investType == investUniv3RedeemInitialInfo.investType && this.investmentId == investUniv3RedeemInitialInfo.investmentId && Intrinsics.EZpvd((Object) this.investmentName, (Object) investUniv3RedeemInitialInfo.investmentName) && this.isSupportSwap == investUniv3RedeemInitialInfo.isSupportSwap && Intrinsics.EZpvd((Object) this.lowerPrice, (Object) investUniv3RedeemInitialInfo.lowerPrice) && Intrinsics.EZpvd(this.lpTokenInfo, investUniv3RedeemInitialInfo.lpTokenInfo) && Intrinsics.EZpvd((Object) this.network, (Object) investUniv3RedeemInitialInfo.network) && Intrinsics.EZpvd((Object) this.networkLogo, (Object) investUniv3RedeemInitialInfo.networkLogo) && Intrinsics.EZpvd((Object) this.platformLogo, (Object) investUniv3RedeemInitialInfo.platformLogo) && Intrinsics.EZpvd((Object) this.platformName, (Object) investUniv3RedeemInitialInfo.platformName) && Intrinsics.EZpvd((Object) this.positionStatus, (Object) investUniv3RedeemInitialInfo.positionStatus) && Intrinsics.EZpvd(this.promptInformation, investUniv3RedeemInitialInfo.promptInformation) && Intrinsics.EZpvd(this.receiveTokenList, investUniv3RedeemInitialInfo.receiveTokenList) && Intrinsics.EZpvd(this.redeemMethod, investUniv3RedeemInitialInfo.redeemMethod) && Intrinsics.EZpvd(this.underlyingTokenList, investUniv3RedeemInitialInfo.underlyingTokenList) && Intrinsics.EZpvd((Object) this.upperPrice, (Object) investUniv3RedeemInitialInfo.upperPrice) && this.supportZap == investUniv3RedeemInitialInfo.supportZap && this.refreshTime == investUniv3RedeemInitialInfo.refreshTime && Intrinsics.EZpvd((Object) this.tokenId, (Object) investUniv3RedeemInitialInfo.tokenId);
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
    public final String getFeeRate() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getInvestType() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentName() {
        return this.investmentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLowerPrice() {
        return this.lowerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount getLpTokenInfo() {
        return this.lpTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkLogo() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformLogo() {
        return this.platformLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformName() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPositionStatus() {
        return this.positionStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PromptInformation getPromptInformation() {
        return this.promptInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getReceiveTokenList() {
        return this.receiveTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRedeemMethod() {
        return this.redeemMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRefreshTime() {
        return this.refreshTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportZap() {
        return this.supportZap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenId() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getUnderlyingTokenList() {
        return this.underlyingTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpperPrice() {
        return this.upperPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.analysisPlatformId;
        int iHashCode = l == null ? 0 : l.hashCode();
        int iHashCode2 = Long.hashCode(this.chainId);
        int iHashCode3 = this.feeRate.hashCode();
        int iHashCode4 = Integer.hashCode(this.investType);
        int iHashCode5 = Long.hashCode(this.investmentId);
        int iHashCode6 = this.investmentName.hashCode();
        int iHashCode7 = Boolean.hashCode(this.isSupportSwap);
        int iHashCode8 = this.lowerPrice.hashCode();
        InvestTokenWithAmount investTokenWithAmount = this.lpTokenInfo;
        int iHashCode9 = investTokenWithAmount == null ? 0 : investTokenWithAmount.hashCode();
        int iHashCode10 = this.network.hashCode();
        int iHashCode11 = this.networkLogo.hashCode();
        int iHashCode12 = this.platformLogo.hashCode();
        int iHashCode13 = this.platformName.hashCode();
        int iHashCode14 = this.positionStatus.hashCode();
        PromptInformation promptInformation = this.promptInformation;
        int iHashCode15 = promptInformation == null ? 0 : promptInformation.hashCode();
        int iHashCode16 = this.receiveTokenList.hashCode();
        Integer num = this.redeemMethod;
        return (((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.underlyingTokenList.hashCode()) * 31) + this.upperPrice.hashCode()) * 31) + Boolean.hashCode(this.supportZap)) * 31) + Integer.hashCode(this.refreshTime)) * 31) + this.tokenId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSupportSwap() {
        return this.isSupportSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUniv3RedeemInitialInfo(analysisPlatformId=" + this.analysisPlatformId + ", chainId=" + this.chainId + ", feeRate=" + this.feeRate + ", investType=" + this.investType + ", investmentId=" + this.investmentId + ", investmentName=" + this.investmentName + ", isSupportSwap=" + this.isSupportSwap + ", lowerPrice=" + this.lowerPrice + ", lpTokenInfo=" + this.lpTokenInfo + ", network=" + this.network + ", networkLogo=" + this.networkLogo + ", platformLogo=" + this.platformLogo + ", platformName=" + this.platformName + ", positionStatus=" + this.positionStatus + ", promptInformation=" + this.promptInformation + ", receiveTokenList=" + this.receiveTokenList + ", redeemMethod=" + this.redeemMethod + ", underlyingTokenList=" + this.underlyingTokenList + ", upperPrice=" + this.upperPrice + ", supportZap=" + this.supportZap + ", refreshTime=" + this.refreshTime + ", tokenId=" + this.tokenId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.analysisPlatformId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeLong(this.chainId);
        parcel.writeString(this.feeRate);
        parcel.writeInt(this.investType);
        parcel.writeLong(this.investmentId);
        parcel.writeString(this.investmentName);
        parcel.writeInt(this.isSupportSwap ? 1 : 0);
        parcel.writeString(this.lowerPrice);
        InvestTokenWithAmount investTokenWithAmount = this.lpTokenInfo;
        if (investTokenWithAmount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTokenWithAmount.writeToParcel(parcel, i);
        }
        parcel.writeString(this.network);
        parcel.writeString(this.networkLogo);
        parcel.writeString(this.platformLogo);
        parcel.writeString(this.platformName);
        parcel.writeString(this.positionStatus);
        PromptInformation promptInformation = this.promptInformation;
        if (promptInformation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promptInformation.writeToParcel(parcel, i);
        }
        List<InvestTokenWithAmount> list = this.receiveTokenList;
        parcel.writeInt(list.size());
        Iterator<InvestTokenWithAmount> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        Integer num = this.redeemMethod;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<InvestTokenWithAmount> list2 = this.underlyingTokenList;
        parcel.writeInt(list2.size());
        Iterator<InvestTokenWithAmount> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.upperPrice);
        parcel.writeInt(this.supportZap ? 1 : 0);
        parcel.writeInt(this.refreshTime);
        parcel.writeString(this.tokenId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemInitialInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestUniv3RedeemInitialInfo> serializer() {
            return InvestUniv3RedeemInitialInfo$$serializer.INSTANCE;
        }
    }

    static {
        InvestTokenWithAmount$$serializer investTokenWithAmount$$serializer = InvestTokenWithAmount$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(investTokenWithAmount$$serializer), null, new ArrayListSerializer(investTokenWithAmount$$serializer), null, null, null, null};
    }

    public /* synthetic */ InvestUniv3RedeemInitialInfo(int i, Long l, long j, String str, int i2, long j2, String str2, boolean z, String str3, InvestTokenWithAmount investTokenWithAmount, String str4, String str5, String str6, String str7, String str8, PromptInformation promptInformation, List list, Integer num, List list2, String str9, boolean z2, int i3, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.analysisPlatformId = null;
        } else {
            this.analysisPlatformId = l;
        }
        if ((i & 2) == 0) {
            this.chainId = 0L;
        } else {
            this.chainId = j;
        }
        if ((i & 4) == 0) {
            this.feeRate = "";
        } else {
            this.feeRate = str;
        }
        if ((i & 8) == 0) {
            this.investType = 0;
        } else {
            this.investType = i2;
        }
        this.investmentId = (i & 16) != 0 ? j2 : 0L;
        if ((i & 32) == 0) {
            this.investmentName = "";
        } else {
            this.investmentName = str2;
        }
        if ((i & 64) == 0) {
            this.isSupportSwap = false;
        } else {
            this.isSupportSwap = z;
        }
        if ((i & 128) == 0) {
            this.lowerPrice = "";
        } else {
            this.lowerPrice = str3;
        }
        if ((i & 256) == 0) {
            this.lpTokenInfo = null;
        } else {
            this.lpTokenInfo = investTokenWithAmount;
        }
        if ((i & 512) == 0) {
            this.network = "";
        } else {
            this.network = str4;
        }
        if ((i & 1024) == 0) {
            this.networkLogo = "";
        } else {
            this.networkLogo = str5;
        }
        if ((i & 2048) == 0) {
            this.platformLogo = "";
        } else {
            this.platformLogo = str6;
        }
        if ((i & 4096) == 0) {
            this.platformName = "";
        } else {
            this.platformName = str7;
        }
        if ((i & 8192) == 0) {
            this.positionStatus = "";
        } else {
            this.positionStatus = str8;
        }
        if ((i & 16384) == 0) {
            this.promptInformation = null;
        } else {
            this.promptInformation = promptInformation;
        }
        this.receiveTokenList = (32768 & i) == 0 ? new ArrayList() : list;
        if ((65536 & i) == 0) {
            this.redeemMethod = null;
        } else {
            this.redeemMethod = num;
        }
        this.underlyingTokenList = (131072 & i) == 0 ? new ArrayList() : list2;
        if ((262144 & i) == 0) {
            this.upperPrice = "";
        } else {
            this.upperPrice = str9;
        }
        if ((524288 & i) == 0) {
            this.supportZap = false;
        } else {
            this.supportZap = z2;
        }
        if ((1048576 & i) == 0) {
            this.refreshTime = 0;
        } else {
            this.refreshTime = i3;
        }
        if ((i & 2097152) == 0) {
            this.tokenId = "";
        } else {
            this.tokenId = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestUniv3RedeemInitialInfo investUniv3RedeemInitialInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investUniv3RedeemInitialInfo.analysisPlatformId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, investUniv3RedeemInitialInfo.analysisPlatformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investUniv3RedeemInitialInfo.chainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, investUniv3RedeemInitialInfo.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investUniv3RedeemInitialInfo.feeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investUniv3RedeemInitialInfo.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investUniv3RedeemInitialInfo.investType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, investUniv3RedeemInitialInfo.investType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investUniv3RedeemInitialInfo.investmentId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 4, investUniv3RedeemInitialInfo.investmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) investUniv3RedeemInitialInfo.investmentName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, investUniv3RedeemInitialInfo.investmentName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || investUniv3RedeemInitialInfo.isSupportSwap) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, investUniv3RedeemInitialInfo.isSupportSwap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) investUniv3RedeemInitialInfo.lowerPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, investUniv3RedeemInitialInfo.lowerPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || investUniv3RedeemInitialInfo.lpTokenInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, InvestTokenWithAmount$$serializer.INSTANCE, investUniv3RedeemInitialInfo.lpTokenInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) investUniv3RedeemInitialInfo.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, investUniv3RedeemInitialInfo.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) investUniv3RedeemInitialInfo.networkLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, investUniv3RedeemInitialInfo.networkLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) investUniv3RedeemInitialInfo.platformLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, investUniv3RedeemInitialInfo.platformLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) investUniv3RedeemInitialInfo.platformName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, investUniv3RedeemInitialInfo.platformName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) investUniv3RedeemInitialInfo.positionStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, investUniv3RedeemInitialInfo.positionStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || investUniv3RedeemInitialInfo.promptInformation != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, PromptInformation$$serializer.INSTANCE, investUniv3RedeemInitialInfo.promptInformation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd(investUniv3RedeemInitialInfo.receiveTokenList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 15, kSerializerArr[15], investUniv3RedeemInitialInfo.receiveTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || investUniv3RedeemInitialInfo.redeemMethod != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, IntSerializer.INSTANCE, investUniv3RedeemInitialInfo.redeemMethod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd(investUniv3RedeemInitialInfo.underlyingTokenList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 17, kSerializerArr[17], investUniv3RedeemInitialInfo.underlyingTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) investUniv3RedeemInitialInfo.upperPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, investUniv3RedeemInitialInfo.upperPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || investUniv3RedeemInitialInfo.supportZap) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 19, investUniv3RedeemInitialInfo.supportZap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || investUniv3RedeemInitialInfo.refreshTime != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 20, investUniv3RedeemInitialInfo.refreshTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) && Intrinsics.EZpvd((Object) investUniv3RedeemInitialInfo.tokenId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 21, investUniv3RedeemInitialInfo.tokenId);
    }

    public InvestUniv3RedeemInitialInfo(Long l, long j, @NotNull String str, int i, long j2, @NotNull String str2, boolean z, @NotNull String str3, InvestTokenWithAmount investTokenWithAmount, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, PromptInformation promptInformation, @NotNull List<InvestTokenWithAmount> list, Integer num, @NotNull List<InvestTokenWithAmount> list2, @NotNull String str9, boolean z2, int i2, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.analysisPlatformId = l;
        this.chainId = j;
        this.feeRate = str;
        this.investType = i;
        this.investmentId = j2;
        this.investmentName = str2;
        this.isSupportSwap = z;
        this.lowerPrice = str3;
        this.lpTokenInfo = investTokenWithAmount;
        this.network = str4;
        this.networkLogo = str5;
        this.platformLogo = str6;
        this.platformName = str7;
        this.positionStatus = str8;
        this.promptInformation = promptInformation;
        this.receiveTokenList = list;
        this.redeemMethod = num;
        this.underlyingTokenList = list2;
        this.upperPrice = str9;
        this.supportZap = z2;
        this.refreshTime = i2;
        this.tokenId = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0107: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r50v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r26v0 java.lang.Long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r50v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r27v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r50v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001e: ARITH (r50v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r30v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0026: ARITH (r50v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r31v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r50v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0035: ARITH (r50v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r50v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.models.InvestTokenWithAmount:?: TERNARY null = ((wrap:int:0x0045: ARITH (r50v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.models.InvestTokenWithAmount) : (r36v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r50v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r50v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r50v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:0x0070: TERNARY null = ((wrap:int:0x0067: ARITH (r50v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:0x007b: TERNARY null = ((wrap:int:0x0072: ARITH (r50v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.PromptInformation:?: TERNARY null = ((wrap:int:0x007d: ARITH (r50v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.PromptInformation) : (r42v0 com.okinc.business.invest_biz.data.bean.PromptInformation))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0088: ARITH (r50v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x008e: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:32) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r43v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0096: ARITH (r50v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r44v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00a1: ARITH (r50v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00a7: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:34) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r45v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00af: ARITH (r50v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00ba: ARITH (r50v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? false : (r47v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00c5: ARITH (r50v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r48v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d0: ARITH (r50v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
 A[MD:(java.lang.Long, long, java.lang.String, int, long, java.lang.String, boolean, java.lang.String, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.PromptInformation, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.lang.Integer, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.lang.String, boolean, int, java.lang.String):void (m)] (LINE:16) call: com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemInitialInfo.<init>(java.lang.Long, long, java.lang.String, int, long, java.lang.String, boolean, java.lang.String, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.PromptInformation, java.util.List, java.lang.Integer, java.util.List, java.lang.String, boolean, int, java.lang.String):void type: THIS */
    public /* synthetic */ InvestUniv3RedeemInitialInfo(Long l, long j, String str, int i, long j2, String str2, boolean z, String str3, InvestTokenWithAmount investTokenWithAmount, String str4, String str5, String str6, String str7, String str8, PromptInformation promptInformation, List list, Integer num, List list2, String str9, boolean z2, int i2, String str10, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : l, (i3 & 2) != 0 ? 0L : j, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? 0 : i, (i3 & 16) == 0 ? j2 : 0L, (i3 & 32) != 0 ? "" : str2, (i3 & 64) != 0 ? false : z, (i3 & 128) != 0 ? "" : str3, (i3 & 256) != 0 ? null : investTokenWithAmount, (i3 & 512) != 0 ? "" : str4, (i3 & 1024) != 0 ? "" : str5, (i3 & 2048) != 0 ? "" : str6, (i3 & 4096) != 0 ? "" : str7, (i3 & 8192) != 0 ? "" : str8, (i3 & 16384) != 0 ? null : promptInformation, (i3 & 32768) != 0 ? new ArrayList() : list, (i3 & 65536) != 0 ? null : num, (i3 & 131072) != 0 ? new ArrayList() : list2, (i3 & 262144) != 0 ? "" : str9, (i3 & 524288) != 0 ? false : z2, (i3 & 1048576) != 0 ? 0 : i2, (i3 & 2097152) != 0 ? "" : str10);
    }

    public final boolean isActive() {
        return C25541iyf.OLrzqt(this.positionStatus);
    }
}
