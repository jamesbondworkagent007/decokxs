package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestUniv3SubscribeInfo implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final Long analysisPlatformId;
    private final long chainId;
    private final String currentPrice;
    private final Integer currentTick;
    private final Integer displayDepthGraph;
    private final String feeRate;
    private final List<InvestTokenWithAmount> gainsTokenList;
    private final int investType;
    private final List<InvestTokenWithAmount> investWithTokenList;
    private final long investmentId;
    private final String investmentName;
    private final boolean isSupportSwap;
    private final boolean isSupportSwapDual;
    private final boolean isSupportSwapSingle;
    private final String lowerPrice;
    private final String network;
    private final String networkLogo;
    private final String platformLogo;
    private final String platformName;
    private final InvestUniv3SubscribePromptInformation promptInformation;
    private final List<InvestUniv3RangeInfoType> rangeInfo;
    private final InvestTokenWithAmount receiveTokenInfo;
    private final int refreshTime;
    private final String reserveFee;
    private final long sourceInvestmentId;
    private final Integer subscriptionMethod;
    private final boolean supportZap;
    private final List<InvestTokenWithAmount> swapToTokenList;
    private final Integer tickSpacing;
    private final List<InvestTokenWithAmount> underlyingTokenList;
    private final String uniV3Base;
    private final List<Integer> uniV3TickRange;
    private final String upperPrice;
    private final Integer walletBaseCoinId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestUniv3SubscribeInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestUniv3SubscribeInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUniv3SubscribeInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String str;
            Intrinsics.checkNotNullParameter(parcel, "");
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            long j = parcel.readLong();
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList2.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                arrayList3.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            long j2 = parcel.readLong();
            String string3 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            InvestUniv3SubscribePromptInformation investUniv3SubscribePromptInformationCreateFromParcel = parcel.readInt() == 0 ? null : InvestUniv3SubscribePromptInformation.CREATOR.createFromParcel(parcel);
            int i6 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i6);
            boolean z2 = z;
            int i7 = 0;
            while (i7 != i6) {
                arrayList4.add(InvestUniv3RangeInfoType.CREATOR.createFromParcel(parcel));
                i7++;
                i6 = i6;
            }
            InvestTokenWithAmount investTokenWithAmountCreateFromParcel = parcel.readInt() == 0 ? null : InvestTokenWithAmount.CREATOR.createFromParcel(parcel);
            String string9 = parcel.readString();
            long j3 = parcel.readLong();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i8 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i8);
            int i9 = 0;
            while (i9 != i8) {
                arrayList5.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
                i9++;
                i8 = i8;
            }
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i10 = parcel.readInt();
            Integer num = numValueOf3;
            ArrayList arrayList6 = new ArrayList(i10);
            int i11 = 0;
            while (i11 != i10) {
                arrayList6.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
                i11++;
                i10 = i10;
            }
            String string10 = parcel.readString();
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string11 = parcel.readString();
            if (parcel.readInt() == 0) {
                str = string10;
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                str = string10;
                int i13 = 0;
                while (i13 != i12) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                    i13++;
                    i12 = i12;
                }
            }
            return new InvestUniv3SubscribeInfo(lValueOf, j, string, numValueOf, string2, arrayList2, i3, arrayList3, j2, string3, z2, string4, string5, string6, string7, string8, investUniv3SubscribePromptInformationCreateFromParcel, arrayList4, investTokenWithAmountCreateFromParcel, string9, j3, numValueOf2, arrayList5, num, arrayList6, str, numValueOf4, string11, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUniv3SubscribeInfo[] newArray(int i) {
            return new InvestUniv3SubscribeInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestUniv3SubscribeInfo() {
        this((Long) null, 0L, (String) null, (Integer) null, (String) null, (List) null, 0, (List) null, 0L, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (InvestUniv3SubscribePromptInformation) null, (List) null, (InvestTokenWithAmount) null, (String) null, 0L, (Integer) null, (List) null, (Integer) null, (List) null, (String) null, (Integer) null, (String) null, (List) null, (Integer) null, 0, false, false, false, -1, 3, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.analysisPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.investmentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.isSupportSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.lowerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.platformLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUniv3SubscribePromptInformation component17() {
        return this.promptInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUniv3RangeInfoType> component18() {
        return this.rangeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount component19() {
        return this.receiveTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.reserveFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component21() {
        return this.sourceInvestmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component22() {
        return this.subscriptionMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component23() {
        return this.swapToTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component24() {
        return this.tickSpacing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component25() {
        return this.underlyingTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.upperPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component27() {
        return this.walletBaseCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.uniV3Base;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component29() {
        return this.uniV3TickRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component30() {
        return this.displayDepthGraph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component31() {
        return this.refreshTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component32() {
        return this.supportZap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component33() {
        return this.isSupportSwapDual;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component34() {
        return this.isSupportSwapSingle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.currentTick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component6() {
        return this.gainsTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component8() {
        return this.investWithTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component9() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUniv3SubscribeInfo copy(Long l, long j, @NotNull String str, Integer num, @NotNull String str2, @NotNull List<InvestTokenWithAmount> list, int i, @NotNull List<InvestTokenWithAmount> list2, long j2, @NotNull String str3, boolean z, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, InvestUniv3SubscribePromptInformation investUniv3SubscribePromptInformation, @NotNull List<InvestUniv3RangeInfoType> list3, InvestTokenWithAmount investTokenWithAmount, @NotNull String str9, long j3, Integer num2, @NotNull List<InvestTokenWithAmount> list4, Integer num3, @NotNull List<InvestTokenWithAmount> list5, @NotNull String str10, Integer num4, @NotNull String str11, List<Integer> list6, Integer num5, int i2, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new InvestUniv3SubscribeInfo(l, j, str, num, str2, list, i, list2, j2, str3, z, str4, str5, str6, str7, str8, investUniv3SubscribePromptInformation, list3, investTokenWithAmount, str9, j3, num2, list4, num3, list5, str10, num4, str11, list6, num5, i2, z2, z3, z4);
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
        if (!(obj instanceof InvestUniv3SubscribeInfo)) {
            return false;
        }
        InvestUniv3SubscribeInfo investUniv3SubscribeInfo = (InvestUniv3SubscribeInfo) obj;
        return Intrinsics.EZpvd(this.analysisPlatformId, investUniv3SubscribeInfo.analysisPlatformId) && this.chainId == investUniv3SubscribeInfo.chainId && Intrinsics.EZpvd((Object) this.currentPrice, (Object) investUniv3SubscribeInfo.currentPrice) && Intrinsics.EZpvd(this.currentTick, investUniv3SubscribeInfo.currentTick) && Intrinsics.EZpvd((Object) this.feeRate, (Object) investUniv3SubscribeInfo.feeRate) && Intrinsics.EZpvd(this.gainsTokenList, investUniv3SubscribeInfo.gainsTokenList) && this.investType == investUniv3SubscribeInfo.investType && Intrinsics.EZpvd(this.investWithTokenList, investUniv3SubscribeInfo.investWithTokenList) && this.investmentId == investUniv3SubscribeInfo.investmentId && Intrinsics.EZpvd((Object) this.investmentName, (Object) investUniv3SubscribeInfo.investmentName) && this.isSupportSwap == investUniv3SubscribeInfo.isSupportSwap && Intrinsics.EZpvd((Object) this.lowerPrice, (Object) investUniv3SubscribeInfo.lowerPrice) && Intrinsics.EZpvd((Object) this.network, (Object) investUniv3SubscribeInfo.network) && Intrinsics.EZpvd((Object) this.networkLogo, (Object) investUniv3SubscribeInfo.networkLogo) && Intrinsics.EZpvd((Object) this.platformLogo, (Object) investUniv3SubscribeInfo.platformLogo) && Intrinsics.EZpvd((Object) this.platformName, (Object) investUniv3SubscribeInfo.platformName) && Intrinsics.EZpvd(this.promptInformation, investUniv3SubscribeInfo.promptInformation) && Intrinsics.EZpvd(this.rangeInfo, investUniv3SubscribeInfo.rangeInfo) && Intrinsics.EZpvd(this.receiveTokenInfo, investUniv3SubscribeInfo.receiveTokenInfo) && Intrinsics.EZpvd((Object) this.reserveFee, (Object) investUniv3SubscribeInfo.reserveFee) && this.sourceInvestmentId == investUniv3SubscribeInfo.sourceInvestmentId && Intrinsics.EZpvd(this.subscriptionMethod, investUniv3SubscribeInfo.subscriptionMethod) && Intrinsics.EZpvd(this.swapToTokenList, investUniv3SubscribeInfo.swapToTokenList) && Intrinsics.EZpvd(this.tickSpacing, investUniv3SubscribeInfo.tickSpacing) && Intrinsics.EZpvd(this.underlyingTokenList, investUniv3SubscribeInfo.underlyingTokenList) && Intrinsics.EZpvd((Object) this.upperPrice, (Object) investUniv3SubscribeInfo.upperPrice) && Intrinsics.EZpvd(this.walletBaseCoinId, investUniv3SubscribeInfo.walletBaseCoinId) && Intrinsics.EZpvd((Object) this.uniV3Base, (Object) investUniv3SubscribeInfo.uniV3Base) && Intrinsics.EZpvd(this.uniV3TickRange, investUniv3SubscribeInfo.uniV3TickRange) && Intrinsics.EZpvd(this.displayDepthGraph, investUniv3SubscribeInfo.displayDepthGraph) && this.refreshTime == investUniv3SubscribeInfo.refreshTime && this.supportZap == investUniv3SubscribeInfo.supportZap && this.isSupportSwapDual == investUniv3SubscribeInfo.isSupportSwapDual && this.isSupportSwapSingle == investUniv3SubscribeInfo.isSupportSwapSingle;
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
    public final String getCurrentPrice() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrentTick() {
        return this.currentTick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDisplayDepthGraph() {
        return this.displayDepthGraph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeRate() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getGainsTokenList() {
        return this.gainsTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getInvestType() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getInvestWithTokenList() {
        return this.investWithTokenList;
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
    public final InvestUniv3SubscribePromptInformation getPromptInformation() {
        return this.promptInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUniv3RangeInfoType> getRangeInfo() {
        return this.rangeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount getReceiveTokenInfo() {
        return this.receiveTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRefreshTime() {
        return this.refreshTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReserveFee() {
        return this.reserveFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getSourceInvestmentId() {
        return this.sourceInvestmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSubscriptionMethod() {
        return this.subscriptionMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportZap() {
        return this.supportZap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getSwapToTokenList() {
        return this.swapToTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTickSpacing() {
        return this.tickSpacing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getUnderlyingTokenList() {
        return this.underlyingTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUniV3Base() {
        return this.uniV3Base;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getUniV3TickRange() {
        return this.uniV3TickRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpperPrice() {
        return this.upperPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getWalletBaseCoinId() {
        return this.walletBaseCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.analysisPlatformId;
        int iHashCode = l == null ? 0 : l.hashCode();
        int iHashCode2 = Long.hashCode(this.chainId);
        int iHashCode3 = this.currentPrice.hashCode();
        Integer num = this.currentTick;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        int iHashCode5 = this.feeRate.hashCode();
        int iHashCode6 = this.gainsTokenList.hashCode();
        int iHashCode7 = Integer.hashCode(this.investType);
        int iHashCode8 = this.investWithTokenList.hashCode();
        int iHashCode9 = Long.hashCode(this.investmentId);
        int iHashCode10 = this.investmentName.hashCode();
        int iHashCode11 = Boolean.hashCode(this.isSupportSwap);
        int iHashCode12 = this.lowerPrice.hashCode();
        int iHashCode13 = this.network.hashCode();
        int iHashCode14 = this.networkLogo.hashCode();
        int iHashCode15 = this.platformLogo.hashCode();
        int iHashCode16 = this.platformName.hashCode();
        InvestUniv3SubscribePromptInformation investUniv3SubscribePromptInformation = this.promptInformation;
        int iHashCode17 = investUniv3SubscribePromptInformation == null ? 0 : investUniv3SubscribePromptInformation.hashCode();
        int iHashCode18 = this.rangeInfo.hashCode();
        InvestTokenWithAmount investTokenWithAmount = this.receiveTokenInfo;
        int iHashCode19 = investTokenWithAmount == null ? 0 : investTokenWithAmount.hashCode();
        int iHashCode20 = this.reserveFee.hashCode();
        int iHashCode21 = Long.hashCode(this.sourceInvestmentId);
        Integer num2 = this.subscriptionMethod;
        int iHashCode22 = num2 == null ? 0 : num2.hashCode();
        int iHashCode23 = this.swapToTokenList.hashCode();
        Integer num3 = this.tickSpacing;
        int iHashCode24 = num3 == null ? 0 : num3.hashCode();
        int iHashCode25 = this.underlyingTokenList.hashCode();
        int iHashCode26 = this.upperPrice.hashCode();
        Integer num4 = this.walletBaseCoinId;
        int iHashCode27 = num4 == null ? 0 : num4.hashCode();
        int iHashCode28 = this.uniV3Base.hashCode();
        List<Integer> list = this.uniV3TickRange;
        int iHashCode29 = list == null ? 0 : list.hashCode();
        Integer num5 = this.displayDepthGraph;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + (num5 == null ? 0 : num5.hashCode())) * 31) + Integer.hashCode(this.refreshTime)) * 31) + Boolean.hashCode(this.supportZap)) * 31) + Boolean.hashCode(this.isSupportSwapDual)) * 31) + Boolean.hashCode(this.isSupportSwapSingle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSupportSwap() {
        return this.isSupportSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSupportSwapDual() {
        return this.isSupportSwapDual;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSupportSwapSingle() {
        return this.isSupportSwapSingle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUniv3SubscribeInfo(analysisPlatformId=" + this.analysisPlatformId + ", chainId=" + this.chainId + ", currentPrice=" + this.currentPrice + ", currentTick=" + this.currentTick + ", feeRate=" + this.feeRate + ", gainsTokenList=" + this.gainsTokenList + ", investType=" + this.investType + ", investWithTokenList=" + this.investWithTokenList + ", investmentId=" + this.investmentId + ", investmentName=" + this.investmentName + ", isSupportSwap=" + this.isSupportSwap + ", lowerPrice=" + this.lowerPrice + ", network=" + this.network + ", networkLogo=" + this.networkLogo + ", platformLogo=" + this.platformLogo + ", platformName=" + this.platformName + ", promptInformation=" + this.promptInformation + ", rangeInfo=" + this.rangeInfo + ", receiveTokenInfo=" + this.receiveTokenInfo + ", reserveFee=" + this.reserveFee + ", sourceInvestmentId=" + this.sourceInvestmentId + ", subscriptionMethod=" + this.subscriptionMethod + ", swapToTokenList=" + this.swapToTokenList + ", tickSpacing=" + this.tickSpacing + ", underlyingTokenList=" + this.underlyingTokenList + ", upperPrice=" + this.upperPrice + ", walletBaseCoinId=" + this.walletBaseCoinId + ", uniV3Base=" + this.uniV3Base + ", uniV3TickRange=" + this.uniV3TickRange + ", displayDepthGraph=" + this.displayDepthGraph + ", refreshTime=" + this.refreshTime + ", supportZap=" + this.supportZap + ", isSupportSwapDual=" + this.isSupportSwapDual + ", isSupportSwapSingle=" + this.isSupportSwapSingle + ")";
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
        parcel.writeString(this.currentPrice);
        Integer num = this.currentTick;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.feeRate);
        List<InvestTokenWithAmount> list = this.gainsTokenList;
        parcel.writeInt(list.size());
        Iterator<InvestTokenWithAmount> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.investType);
        List<InvestTokenWithAmount> list2 = this.investWithTokenList;
        parcel.writeInt(list2.size());
        Iterator<InvestTokenWithAmount> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeLong(this.investmentId);
        parcel.writeString(this.investmentName);
        parcel.writeInt(this.isSupportSwap ? 1 : 0);
        parcel.writeString(this.lowerPrice);
        parcel.writeString(this.network);
        parcel.writeString(this.networkLogo);
        parcel.writeString(this.platformLogo);
        parcel.writeString(this.platformName);
        InvestUniv3SubscribePromptInformation investUniv3SubscribePromptInformation = this.promptInformation;
        if (investUniv3SubscribePromptInformation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investUniv3SubscribePromptInformation.writeToParcel(parcel, i);
        }
        List<InvestUniv3RangeInfoType> list3 = this.rangeInfo;
        parcel.writeInt(list3.size());
        Iterator<InvestUniv3RangeInfoType> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        InvestTokenWithAmount investTokenWithAmount = this.receiveTokenInfo;
        if (investTokenWithAmount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTokenWithAmount.writeToParcel(parcel, i);
        }
        parcel.writeString(this.reserveFee);
        parcel.writeLong(this.sourceInvestmentId);
        Integer num2 = this.subscriptionMethod;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        List<InvestTokenWithAmount> list4 = this.swapToTokenList;
        parcel.writeInt(list4.size());
        Iterator<InvestTokenWithAmount> it4 = list4.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
        Integer num3 = this.tickSpacing;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        List<InvestTokenWithAmount> list5 = this.underlyingTokenList;
        parcel.writeInt(list5.size());
        Iterator<InvestTokenWithAmount> it5 = list5.iterator();
        while (it5.hasNext()) {
            it5.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.upperPrice);
        Integer num4 = this.walletBaseCoinId;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.uniV3Base);
        List<Integer> list6 = this.uniV3TickRange;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list6.size());
            Iterator<Integer> it6 = list6.iterator();
            while (it6.hasNext()) {
                parcel.writeInt(it6.next().intValue());
            }
        }
        Integer num5 = this.displayDepthGraph;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        parcel.writeInt(this.refreshTime);
        parcel.writeInt(this.supportZap ? 1 : 0);
        parcel.writeInt(this.isSupportSwapDual ? 1 : 0);
        parcel.writeInt(this.isSupportSwapSingle ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestUniv3SubscribeInfo> serializer() {
            return InvestUniv3SubscribeInfo$$serializer.INSTANCE;
        }
    }

    static {
        InvestTokenWithAmount$$serializer investTokenWithAmount$$serializer = InvestTokenWithAmount$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, new ArrayListSerializer(investTokenWithAmount$$serializer), null, new ArrayListSerializer(investTokenWithAmount$$serializer), null, null, null, null, null, null, null, null, null, new ArrayListSerializer(InvestUniv3RangeInfoType$$serializer.INSTANCE), null, null, null, null, new ArrayListSerializer(investTokenWithAmount$$serializer), null, new ArrayListSerializer(investTokenWithAmount$$serializer), null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null, null, null};
    }

    public /* synthetic */ InvestUniv3SubscribeInfo(int i, int i2, Long l, long j, String str, Integer num, String str2, List list, int i3, List list2, long j2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, InvestUniv3SubscribePromptInformation investUniv3SubscribePromptInformation, List list3, InvestTokenWithAmount investTokenWithAmount, String str9, long j3, Integer num2, List list4, Integer num3, List list5, String str10, Integer num4, String str11, List list6, Integer num5, int i4, boolean z2, boolean z3, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.currentPrice = "";
        } else {
            this.currentPrice = str;
        }
        if ((i & 8) == 0) {
            this.currentTick = null;
        } else {
            this.currentTick = num;
        }
        if ((i & 16) == 0) {
            this.feeRate = "";
        } else {
            this.feeRate = str2;
        }
        this.gainsTokenList = (i & 32) == 0 ? new ArrayList() : list;
        if ((i & 64) == 0) {
            this.investType = 0;
        } else {
            this.investType = i3;
        }
        this.investWithTokenList = (i & 128) == 0 ? new ArrayList() : list2;
        if ((i & 256) == 0) {
            this.investmentId = 0L;
        } else {
            this.investmentId = j2;
        }
        if ((i & 512) == 0) {
            this.investmentName = "";
        } else {
            this.investmentName = str3;
        }
        if ((i & 1024) == 0) {
            this.isSupportSwap = false;
        } else {
            this.isSupportSwap = z;
        }
        if ((i & 2048) == 0) {
            this.lowerPrice = "";
        } else {
            this.lowerPrice = str4;
        }
        if ((i & 4096) == 0) {
            this.network = "";
        } else {
            this.network = str5;
        }
        if ((i & 8192) == 0) {
            this.networkLogo = "";
        } else {
            this.networkLogo = str6;
        }
        if ((i & 16384) == 0) {
            this.platformLogo = "";
        } else {
            this.platformLogo = str7;
        }
        if ((32768 & i) == 0) {
            this.platformName = "";
        } else {
            this.platformName = str8;
        }
        if ((65536 & i) == 0) {
            this.promptInformation = null;
        } else {
            this.promptInformation = investUniv3SubscribePromptInformation;
        }
        this.rangeInfo = (131072 & i) == 0 ? new ArrayList() : list3;
        if ((262144 & i) == 0) {
            this.receiveTokenInfo = null;
        } else {
            this.receiveTokenInfo = investTokenWithAmount;
        }
        if ((524288 & i) == 0) {
            this.reserveFee = "";
        } else {
            this.reserveFee = str9;
        }
        this.sourceInvestmentId = (1048576 & i) != 0 ? j3 : 0L;
        if ((2097152 & i) == 0) {
            this.subscriptionMethod = null;
        } else {
            this.subscriptionMethod = num2;
        }
        this.swapToTokenList = (4194304 & i) == 0 ? new ArrayList() : list4;
        if ((8388608 & i) == 0) {
            this.tickSpacing = null;
        } else {
            this.tickSpacing = num3;
        }
        this.underlyingTokenList = (16777216 & i) == 0 ? new ArrayList() : list5;
        if ((33554432 & i) == 0) {
            this.upperPrice = "";
        } else {
            this.upperPrice = str10;
        }
        if ((67108864 & i) == 0) {
            this.walletBaseCoinId = null;
        } else {
            this.walletBaseCoinId = num4;
        }
        if ((134217728 & i) == 0) {
            this.uniV3Base = "";
        } else {
            this.uniV3Base = str11;
        }
        if ((268435456 & i) == 0) {
            this.uniV3TickRange = null;
        } else {
            this.uniV3TickRange = list6;
        }
        if ((536870912 & i) == 0) {
            this.displayDepthGraph = null;
        } else {
            this.displayDepthGraph = num5;
        }
        if ((1073741824 & i) == 0) {
            this.refreshTime = 0;
        } else {
            this.refreshTime = i4;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.supportZap = false;
        } else {
            this.supportZap = z2;
        }
        if ((i2 & 1) == 0) {
            this.isSupportSwapDual = false;
        } else {
            this.isSupportSwapDual = z3;
        }
        if ((i2 & 2) == 0) {
            this.isSupportSwapSingle = false;
        } else {
            this.isSupportSwapSingle = z4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [94=6] */
    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestUniv3SubscribeInfo investUniv3SubscribeInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investUniv3SubscribeInfo.analysisPlatformId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, investUniv3SubscribeInfo.analysisPlatformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investUniv3SubscribeInfo.chainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, investUniv3SubscribeInfo.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investUniv3SubscribeInfo.currentPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investUniv3SubscribeInfo.currentPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investUniv3SubscribeInfo.currentTick != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, investUniv3SubscribeInfo.currentTick);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) investUniv3SubscribeInfo.feeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, investUniv3SubscribeInfo.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(investUniv3SubscribeInfo.gainsTokenList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], investUniv3SubscribeInfo.gainsTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || investUniv3SubscribeInfo.investType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 6, investUniv3SubscribeInfo.investType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(investUniv3SubscribeInfo.investWithTokenList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], investUniv3SubscribeInfo.investWithTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || investUniv3SubscribeInfo.investmentId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 8, investUniv3SubscribeInfo.investmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) investUniv3SubscribeInfo.investmentName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, investUniv3SubscribeInfo.investmentName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || investUniv3SubscribeInfo.isSupportSwap) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 10, investUniv3SubscribeInfo.isSupportSwap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) investUniv3SubscribeInfo.lowerPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, investUniv3SubscribeInfo.lowerPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) investUniv3SubscribeInfo.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, investUniv3SubscribeInfo.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) investUniv3SubscribeInfo.networkLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, investUniv3SubscribeInfo.networkLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) investUniv3SubscribeInfo.platformLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, investUniv3SubscribeInfo.platformLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) investUniv3SubscribeInfo.platformName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, investUniv3SubscribeInfo.platformName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || investUniv3SubscribeInfo.promptInformation != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, InvestUniv3SubscribePromptInformation$$serializer.INSTANCE, investUniv3SubscribeInfo.promptInformation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd(investUniv3SubscribeInfo.rangeInfo, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 17, kSerializerArr[17], investUniv3SubscribeInfo.rangeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || investUniv3SubscribeInfo.receiveTokenInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, InvestTokenWithAmount$$serializer.INSTANCE, investUniv3SubscribeInfo.receiveTokenInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) investUniv3SubscribeInfo.reserveFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, investUniv3SubscribeInfo.reserveFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || investUniv3SubscribeInfo.sourceInvestmentId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 20, investUniv3SubscribeInfo.sourceInvestmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || investUniv3SubscribeInfo.subscriptionMethod != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, IntSerializer.INSTANCE, investUniv3SubscribeInfo.subscriptionMethod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd(investUniv3SubscribeInfo.swapToTokenList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 22, kSerializerArr[22], investUniv3SubscribeInfo.swapToTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || investUniv3SubscribeInfo.tickSpacing != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, IntSerializer.INSTANCE, investUniv3SubscribeInfo.tickSpacing);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd(investUniv3SubscribeInfo.underlyingTokenList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 24, kSerializerArr[24], investUniv3SubscribeInfo.underlyingTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) investUniv3SubscribeInfo.upperPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, investUniv3SubscribeInfo.upperPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || investUniv3SubscribeInfo.walletBaseCoinId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, IntSerializer.INSTANCE, investUniv3SubscribeInfo.walletBaseCoinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) investUniv3SubscribeInfo.uniV3Base, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, investUniv3SubscribeInfo.uniV3Base);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || investUniv3SubscribeInfo.uniV3TickRange != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, kSerializerArr[28], investUniv3SubscribeInfo.uniV3TickRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || investUniv3SubscribeInfo.displayDepthGraph != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, IntSerializer.INSTANCE, investUniv3SubscribeInfo.displayDepthGraph);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || investUniv3SubscribeInfo.refreshTime != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 30, investUniv3SubscribeInfo.refreshTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || investUniv3SubscribeInfo.supportZap) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 31, investUniv3SubscribeInfo.supportZap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || investUniv3SubscribeInfo.isSupportSwapDual) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 32, investUniv3SubscribeInfo.isSupportSwapDual);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || investUniv3SubscribeInfo.isSupportSwapSingle) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 33, investUniv3SubscribeInfo.isSupportSwapSingle);
        }
    }

    public InvestUniv3SubscribeInfo(Long l, long j, @NotNull String str, Integer num, @NotNull String str2, @NotNull List<InvestTokenWithAmount> list, int i, @NotNull List<InvestTokenWithAmount> list2, long j2, @NotNull String str3, boolean z, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, InvestUniv3SubscribePromptInformation investUniv3SubscribePromptInformation, @NotNull List<InvestUniv3RangeInfoType> list3, InvestTokenWithAmount investTokenWithAmount, @NotNull String str9, long j3, Integer num2, @NotNull List<InvestTokenWithAmount> list4, Integer num3, @NotNull List<InvestTokenWithAmount> list5, @NotNull String str10, Integer num4, @NotNull String str11, List<Integer> list6, Integer num5, int i2, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.analysisPlatformId = l;
        this.chainId = j;
        this.currentPrice = str;
        this.currentTick = num;
        this.feeRate = str2;
        this.gainsTokenList = list;
        this.investType = i;
        this.investWithTokenList = list2;
        this.investmentId = j2;
        this.investmentName = str3;
        this.isSupportSwap = z;
        this.lowerPrice = str4;
        this.network = str5;
        this.networkLogo = str6;
        this.platformLogo = str7;
        this.platformName = str8;
        this.promptInformation = investUniv3SubscribePromptInformation;
        this.rangeInfo = list3;
        this.receiveTokenInfo = investTokenWithAmount;
        this.reserveFee = str9;
        this.sourceInvestmentId = j3;
        this.subscriptionMethod = num2;
        this.swapToTokenList = list4;
        this.tickSpacing = num3;
        this.underlyingTokenList = list5;
        this.upperPrice = str10;
        this.walletBaseCoinId = num4;
        this.uniV3Base = str11;
        this.uniV3TickRange = list6;
        this.displayDepthGraph = num5;
        this.refreshTime = i2;
        this.supportZap = z2;
        this.isSupportSwapDual = z3;
        this.isSupportSwapSingle = z4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01a8: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r75v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r38v0 java.lang.Long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r75v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r39v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r75v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r75v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r42v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r75v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002d: ARITH (r75v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0033: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:103) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r44v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0039: ARITH (r75v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r45v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0041: ARITH (r75v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0047: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:105) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r46v0 java.util.List))
  (wrap:long:?: TERNARY null = ((wrap:int:0x004d: ARITH (r75v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r47v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r75v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005e: ARITH (r75v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r50v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r75v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006e: ARITH (r75v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:0x0081: TERNARY null = ((wrap:int:0x0078: ARITH (r75v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0083: ARITH (r75v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008f: ARITH (r75v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribePromptInformation:?: TERNARY null = ((wrap:int:0x009a: ARITH (r75v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribePromptInformation) : (r56v0 com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribePromptInformation))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00a5: ARITH (r75v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00ab: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:115) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r57v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.models.InvestTokenWithAmount:?: TERNARY null = ((wrap:int:0x00b3: ARITH (r75v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.models.InvestTokenWithAmount) : (r58v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00be: ARITH (r75v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x00c9: ARITH (r75v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r60v0 long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00d4: ARITH (r75v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r62v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00df: ARITH (r75v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00e5: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:120) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r63v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00ed: ARITH (r75v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r64v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00f8: ARITH (r75v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00fe: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:122) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r65v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0106: ARITH (r75v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0111: ARITH (r75v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r67v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011c: ARITH (r75v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0127: ARITH (r75v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r69v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0132: ARITH (r75v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r70v0 java.lang.Integer))
  (wrap:int:?: TERNARY null = ((wrap:int:0x013d: ARITH (r75v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r71v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0148: ARITH (r75v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? false : (r72v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0150: ARITH (r76v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r73v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0159: ARITH (r76v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r74v0 boolean))
 A[MD:(java.lang.Long, long, java.lang.String, java.lang.Integer, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, int, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, long, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribePromptInformation, java.util.List<com.okinc.business.invest_biz.data.bean.InvestUniv3RangeInfoType>, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.lang.String, long, java.lang.Integer, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.lang.Integer, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.lang.String, java.lang.Integer, java.lang.String, java.util.List<java.lang.Integer>, java.lang.Integer, int, boolean, boolean, boolean):void (m)] (LINE:97) call: com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeInfo.<init>(java.lang.Long, long, java.lang.String, java.lang.Integer, java.lang.String, java.util.List, int, java.util.List, long, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribePromptInformation, java.util.List, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.lang.String, long, java.lang.Integer, java.util.List, java.lang.Integer, java.util.List, java.lang.String, java.lang.Integer, java.lang.String, java.util.List, java.lang.Integer, int, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ InvestUniv3SubscribeInfo(Long l, long j, String str, Integer num, String str2, List list, int i, List list2, long j2, String str3, boolean z, String str4, String str5, String str6, String str7, String str8, InvestUniv3SubscribePromptInformation investUniv3SubscribePromptInformation, List list3, InvestTokenWithAmount investTokenWithAmount, String str9, long j3, Integer num2, List list4, Integer num3, List list5, String str10, Integer num4, String str11, List list6, Integer num5, int i2, boolean z2, boolean z3, boolean z4, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : l, (i3 & 2) != 0 ? 0L : j, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? null : num, (i3 & 16) != 0 ? "" : str2, (i3 & 32) != 0 ? new ArrayList() : list, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? new ArrayList() : list2, (i3 & 256) != 0 ? 0L : j2, (i3 & 512) != 0 ? "" : str3, (i3 & 1024) != 0 ? false : z, (i3 & 2048) != 0 ? "" : str4, (i3 & 4096) != 0 ? "" : str5, (i3 & 8192) != 0 ? "" : str6, (i3 & 16384) != 0 ? "" : str7, (i3 & 32768) != 0 ? "" : str8, (i3 & 65536) != 0 ? null : investUniv3SubscribePromptInformation, (i3 & 131072) != 0 ? new ArrayList() : list3, (i3 & 262144) != 0 ? null : investTokenWithAmount, (i3 & 524288) != 0 ? "" : str9, (i3 & 1048576) != 0 ? 0L : j3, (i3 & 2097152) != 0 ? null : num2, (i3 & 4194304) != 0 ? new ArrayList() : list4, (i3 & 8388608) != 0 ? null : num3, (i3 & 16777216) != 0 ? new ArrayList() : list5, (i3 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str10, (i3 & 67108864) != 0 ? null : num4, (i3 & 134217728) != 0 ? "" : str11, (i3 & 268435456) != 0 ? null : list6, (i3 & 536870912) != 0 ? null : num5, (i3 & 1073741824) != 0 ? 0 : i2, (i3 & Integer.MIN_VALUE) != 0 ? false : z2, (i4 & 1) != 0 ? false : z3, (i4 & 2) != 0 ? false : z4);
    }
}
