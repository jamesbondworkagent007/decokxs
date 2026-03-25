package com.okinc.business.invest_biz.data.bean;

import com.okinc.business.invest_biz.data.bean.response.RewardCryptos;
import com.okinc.business.invest_biz.data.bean.response.RewardCryptos$$serializer;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class AggregateItem {
    public final BackgroundImage airDrop;
    public final String bonusEndTime;
    public final String bonusSponsor;
    public final String bonusStartTime;
    public final String borrowableAmount;
    public final List<InvestTokenWithAmount> depositCryptos;
    public final boolean displaySafeTag;
    public final boolean hasBonus;
    public final InvestPlatformLogo investLogo;
    public final List<InvestTag> investTagList;
    public final int itemType;
    public final String jumpParam;
    public final String leftSubTitle;
    public final String leftTitle;
    public final List<InvestmentNetworkLogo> networkLogo;
    public final PointsInfo pointsInfo;
    public final AggregateItemRateType rateType;
    public final RewardCryptos rewardCryptos;
    public final String rightSubTitle;
    public final String rightTitle;
    public final String tvl;
    public final boolean tvlDisplay;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, AggregateItemRateType.Companion.serializer(), null, null, null, new ArrayListSerializer(InvestmentNetworkLogo$$serializer.INSTANCE), null, new ArrayListSerializer(InvestTag$$serializer.INSTANCE), null, null, new ArrayListSerializer(InvestTokenWithAmount$$serializer.INSTANCE), null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AggregateItem() {
        this((BackgroundImage) null, false, 0, (String) null, (String) null, (String) null, (String) null, (AggregateItemRateType) null, (String) null, (String) null, false, (List) null, (InvestPlatformLogo) null, (List) null, (PointsInfo) null, (RewardCryptos) null, (List) null, (String) null, (String) null, (String) null, false, (String) null, 4194303, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.bonusStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> AYXKKw() {
        return this.depositCryptos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.hasBonus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.jumpParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AggregateItemRateType AuCTel() {
        return this.rateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.leftTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BackgroundImage EZpvd() {
        return this.airDrop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AggregateItem KWHzl(@NotNull BackgroundImage backgroundImage, boolean z, int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull AggregateItemRateType aggregateItemRateType, @NotNull String str5, @NotNull String str6, boolean z2, @NotNull List<InvestmentNetworkLogo> list, @NotNull InvestPlatformLogo investPlatformLogo, @NotNull List<InvestTag> list2, PointsInfo pointsInfo, RewardCryptos rewardCryptos, @NotNull List<InvestTokenWithAmount> list3, @NotNull String str7, @NotNull String str8, @NotNull String str9, boolean z3, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(backgroundImage, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(aggregateItemRateType, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(investPlatformLogo, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new AggregateItem(backgroundImage, z, i, str, str2, str3, str4, aggregateItemRateType, str5, str6, z2, list, investPlatformLogo, list2, pointsInfo, rewardCryptos, list3, str7, str8, str9, z3, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.bonusSponsor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.bonusEndTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestPlatformLogo djBIcL() {
        return this.investLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RewardCryptos ejfBZ() {
        return this.rewardCryptos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AggregateItem)) {
            return false;
        }
        AggregateItem aggregateItem = (AggregateItem) obj;
        return Intrinsics.EZpvd(this.airDrop, aggregateItem.airDrop) && this.hasBonus == aggregateItem.hasBonus && this.itemType == aggregateItem.itemType && Intrinsics.EZpvd((Object) this.jumpParam, (Object) aggregateItem.jumpParam) && Intrinsics.EZpvd((Object) this.leftTitle, (Object) aggregateItem.leftTitle) && Intrinsics.EZpvd((Object) this.leftSubTitle, (Object) aggregateItem.leftSubTitle) && Intrinsics.EZpvd((Object) this.rightTitle, (Object) aggregateItem.rightTitle) && this.rateType == aggregateItem.rateType && Intrinsics.EZpvd((Object) this.rightSubTitle, (Object) aggregateItem.rightSubTitle) && Intrinsics.EZpvd((Object) this.tvl, (Object) aggregateItem.tvl) && this.tvlDisplay == aggregateItem.tvlDisplay && Intrinsics.EZpvd(this.networkLogo, aggregateItem.networkLogo) && Intrinsics.EZpvd(this.investLogo, aggregateItem.investLogo) && Intrinsics.EZpvd(this.investTagList, aggregateItem.investTagList) && Intrinsics.EZpvd(this.pointsInfo, aggregateItem.pointsInfo) && Intrinsics.EZpvd(this.rewardCryptos, aggregateItem.rewardCryptos) && Intrinsics.EZpvd(this.depositCryptos, aggregateItem.depositCryptos) && Intrinsics.EZpvd((Object) this.bonusSponsor, (Object) aggregateItem.bonusSponsor) && Intrinsics.EZpvd((Object) this.bonusStartTime, (Object) aggregateItem.bonusStartTime) && Intrinsics.EZpvd((Object) this.bonusEndTime, (Object) aggregateItem.bonusEndTime) && this.displaySafeTag == aggregateItem.displaySafeTag && Intrinsics.EZpvd((Object) this.borrowableAmount, (Object) aggregateItem.borrowableAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fARcdN() {
        return this.rightSubTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestmentNetworkLogo> fIwbmz() {
        return this.networkLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PointsInfo fJNWhG() {
        return this.pointsInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fetchVPNInfo() {
        return this.itemType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.displaySafeTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFieldNames() {
        return this.tvlDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String hDKMBd() {
        return this.tvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.airDrop.hashCode();
        int iHashCode2 = Boolean.hashCode(this.hasBonus);
        int iHashCode3 = Integer.hashCode(this.itemType);
        int iHashCode4 = this.jumpParam.hashCode();
        int iHashCode5 = this.leftTitle.hashCode();
        int iHashCode6 = this.leftSubTitle.hashCode();
        int iHashCode7 = this.rightTitle.hashCode();
        int iHashCode8 = this.rateType.hashCode();
        int iHashCode9 = this.rightSubTitle.hashCode();
        int iHashCode10 = this.tvl.hashCode();
        int iHashCode11 = Boolean.hashCode(this.tvlDisplay);
        int iHashCode12 = this.networkLogo.hashCode();
        int iHashCode13 = this.investLogo.hashCode();
        int iHashCode14 = this.investTagList.hashCode();
        PointsInfo pointsInfo = this.pointsInfo;
        int iHashCode15 = pointsInfo == null ? 0 : pointsInfo.hashCode();
        RewardCryptos rewardCryptos = this.rewardCryptos;
        return (((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (rewardCryptos != null ? rewardCryptos.hashCode() : 0)) * 31) + this.depositCryptos.hashCode()) * 31) + this.bonusSponsor.hashCode()) * 31) + this.bonusStartTime.hashCode()) * 31) + this.bonusEndTime.hashCode()) * 31) + Boolean.hashCode(this.displaySafeTag)) * 31) + this.borrowableAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTag> isConnected() {
        return this.investTagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String iwGUEr() {
        return this.rightTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AggregateItem(airDrop=" + this.airDrop + ", hasBonus=" + this.hasBonus + ", itemType=" + this.itemType + ", jumpParam=" + this.jumpParam + ", leftTitle=" + this.leftTitle + ", leftSubTitle=" + this.leftSubTitle + ", rightTitle=" + this.rightTitle + ", rateType=" + this.rateType + ", rightSubTitle=" + this.rightSubTitle + ", tvl=" + this.tvl + ", tvlDisplay=" + this.tvlDisplay + ", networkLogo=" + this.networkLogo + ", investLogo=" + this.investLogo + ", investTagList=" + this.investTagList + ", pointsInfo=" + this.pointsInfo + ", rewardCryptos=" + this.rewardCryptos + ", depositCryptos=" + this.depositCryptos + ", bonusSponsor=" + this.bonusSponsor + ", bonusStartTime=" + this.bonusStartTime + ", bonusEndTime=" + this.bonusEndTime + ", displaySafeTag=" + this.displaySafeTag + ", borrowableAmount=" + this.borrowableAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.borrowableAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.leftSubTitle;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.AggregateItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AggregateItem> serializer() {
            return AggregateItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AggregateItem(int i, BackgroundImage backgroundImage, boolean z, int i2, String str, String str2, String str3, String str4, AggregateItemRateType aggregateItemRateType, String str5, String str6, boolean z2, List list, InvestPlatformLogo investPlatformLogo, List list2, PointsInfo pointsInfo, RewardCryptos rewardCryptos, List list3, String str7, String str8, String str9, boolean z3, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        this.airDrop = (i & 1) == 0 ? new BackgroundImage((String) null, (String) null, 3, (DefaultConstructorMarker) null) : backgroundImage;
        if ((i & 2) == 0) {
            this.hasBonus = false;
        } else {
            this.hasBonus = z;
        }
        if ((i & 4) == 0) {
            this.itemType = 0;
        } else {
            this.itemType = i2;
        }
        if ((i & 8) == 0) {
            this.jumpParam = "";
        } else {
            this.jumpParam = str;
        }
        if ((i & 16) == 0) {
            this.leftTitle = "";
        } else {
            this.leftTitle = str2;
        }
        if ((i & 32) == 0) {
            this.leftSubTitle = "";
        } else {
            this.leftSubTitle = str3;
        }
        if ((i & 64) == 0) {
            this.rightTitle = "";
        } else {
            this.rightTitle = str4;
        }
        this.rateType = (i & 128) == 0 ? AggregateItemRateType.APY : aggregateItemRateType;
        if ((i & 256) == 0) {
            this.rightSubTitle = "";
        } else {
            this.rightSubTitle = str5;
        }
        if ((i & 512) == 0) {
            this.tvl = "";
        } else {
            this.tvl = str6;
        }
        if ((i & 1024) == 0) {
            this.tvlDisplay = false;
        } else {
            this.tvlDisplay = z2;
        }
        this.networkLogo = (i & 2048) == 0 ? yDY.AhwBna() : list;
        this.investLogo = (i & 4096) == 0 ? new InvestPlatformLogo((List) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null) : investPlatformLogo;
        this.investTagList = (i & 8192) == 0 ? yDY.AhwBna() : list2;
        if ((i & 16384) == 0) {
            this.pointsInfo = null;
        } else {
            this.pointsInfo = pointsInfo;
        }
        if ((32768 & i) == 0) {
            this.rewardCryptos = null;
        } else {
            this.rewardCryptos = rewardCryptos;
        }
        this.depositCryptos = (65536 & i) == 0 ? yDY.AhwBna() : list3;
        if ((131072 & i) == 0) {
            this.bonusSponsor = "";
        } else {
            this.bonusSponsor = str7;
        }
        if ((262144 & i) == 0) {
            this.bonusStartTime = "";
        } else {
            this.bonusStartTime = str8;
        }
        if ((524288 & i) == 0) {
            this.bonusEndTime = "";
        } else {
            this.bonusEndTime = str9;
        }
        if ((1048576 & i) == 0) {
            this.displaySafeTag = false;
        } else {
            this.displaySafeTag = z3;
        }
        if ((i & 2097152) == 0) {
            this.borrowableAmount = "";
        } else {
            this.borrowableAmount = str10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [307=7] */
    public static final /* synthetic */ void AEQbTJ(AggregateItem aggregateItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(aggregateItem.airDrop, new BackgroundImage((String) null, (String) null, 3, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, BackgroundImage$$serializer.INSTANCE, aggregateItem.airDrop);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || aggregateItem.hasBonus) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, aggregateItem.hasBonus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || aggregateItem.itemType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, aggregateItem.itemType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) aggregateItem.jumpParam, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, aggregateItem.jumpParam);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) aggregateItem.leftTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, aggregateItem.leftTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) aggregateItem.leftSubTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, aggregateItem.leftSubTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) aggregateItem.rightTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, aggregateItem.rightTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || aggregateItem.rateType != AggregateItemRateType.APY) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], aggregateItem.rateType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) aggregateItem.rightSubTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, aggregateItem.rightSubTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) aggregateItem.tvl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, aggregateItem.tvl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || aggregateItem.tvlDisplay) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 10, aggregateItem.tvlDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(aggregateItem.networkLogo, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], aggregateItem.networkLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(aggregateItem.investLogo, new InvestPlatformLogo((List) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 12, InvestPlatformLogo$$serializer.INSTANCE, aggregateItem.investLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd(aggregateItem.investTagList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 13, kSerializerArr[13], aggregateItem.investTagList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || aggregateItem.pointsInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, PointsInfo$$serializer.INSTANCE, aggregateItem.pointsInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || aggregateItem.rewardCryptos != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, RewardCryptos$$serializer.INSTANCE, aggregateItem.rewardCryptos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd(aggregateItem.depositCryptos, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], aggregateItem.depositCryptos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) aggregateItem.bonusSponsor, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, aggregateItem.bonusSponsor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) aggregateItem.bonusStartTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, aggregateItem.bonusStartTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) aggregateItem.bonusEndTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, aggregateItem.bonusEndTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || aggregateItem.displaySafeTag) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 20, aggregateItem.displaySafeTag);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) && Intrinsics.EZpvd((Object) aggregateItem.borrowableAmount, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 21, aggregateItem.borrowableAmount);
    }

    public AggregateItem(@NotNull BackgroundImage backgroundImage, boolean z, int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull AggregateItemRateType aggregateItemRateType, @NotNull String str5, @NotNull String str6, boolean z2, @NotNull List<InvestmentNetworkLogo> list, @NotNull InvestPlatformLogo investPlatformLogo, @NotNull List<InvestTag> list2, PointsInfo pointsInfo, RewardCryptos rewardCryptos, @NotNull List<InvestTokenWithAmount> list3, @NotNull String str7, @NotNull String str8, @NotNull String str9, boolean z3, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(backgroundImage, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(aggregateItemRateType, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(investPlatformLogo, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.airDrop = backgroundImage;
        this.hasBonus = z;
        this.itemType = i;
        this.jumpParam = str;
        this.leftTitle = str2;
        this.leftSubTitle = str3;
        this.rightTitle = str4;
        this.rateType = aggregateItemRateType;
        this.rightSubTitle = str5;
        this.tvl = str6;
        this.tvlDisplay = z2;
        this.networkLogo = list;
        this.investLogo = investPlatformLogo;
        this.investTagList = list2;
        this.pointsInfo = pointsInfo;
        this.rewardCryptos = rewardCryptos;
        this.depositCryptos = list3;
        this.bonusSponsor = str7;
        this.bonusStartTime = str8;
        this.bonusEndTime = str9;
        this.displaySafeTag = z3;
        this.borrowableAmount = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0127: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.bean.BackgroundImage:?: TERNARY null = ((wrap:int:0x0002: ARITH (r46v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000a: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:310) call: com.okinc.business.invest_biz.data.bean.BackgroundImage.<init>(java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r24v0 com.okinc.business.invest_biz.data.bean.BackgroundImage))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r46v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0018: ARITH (r46v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r26v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r46v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r46v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r46v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r46v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.AggregateItemRateType:?: TERNARY null = ((wrap:int:0x0042: ARITH (r46v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0046: SGET  A[WRAPPED] (LINE:324) com.okinc.business.invest_biz.data.bean.AggregateItemRateType.APY com.okinc.business.invest_biz.data.bean.AggregateItemRateType) : (r31v0 com.okinc.business.invest_biz.data.bean.AggregateItemRateType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r46v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r46v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005b: ARITH (r46v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0063: ARITH (r46v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0067: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:332)) : (r35v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestPlatformLogo:?: TERNARY null = ((wrap:int:0x006e: ARITH (r46v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x008e: CONSTRUCTOR 
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.util.List, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:334) call: com.okinc.business.invest_biz.data.bean.InvestPlatformLogo.<init>(java.util.List, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r36v0 com.okinc.business.invest_biz.data.bean.InvestPlatformLogo))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0094: ARITH (r46v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0098: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:336)) : (r37v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.bean.PointsInfo:?: TERNARY null = ((wrap:int:0x00a1: ARITH (r46v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.PointsInfo) : (r38v0 com.okinc.business.invest_biz.data.bean.PointsInfo))
  (wrap:com.okinc.business.invest_biz.data.bean.response.RewardCryptos:?: TERNARY null = ((wrap:int:0x00ac: ARITH (r46v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.response.RewardCryptos) : (r39v0 com.okinc.business.invest_biz.data.bean.response.RewardCryptos))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00b7: ARITH (r46v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00bb: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:342)) : (r40v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r46v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r46v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r46v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r46v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? false : (r44v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r46v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
 A[MD:(com.okinc.business.invest_biz.data.bean.BackgroundImage, boolean, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.AggregateItemRateType, java.lang.String, java.lang.String, boolean, java.util.List<com.okinc.business.invest_biz.data.bean.InvestmentNetworkLogo>, com.okinc.business.invest_biz.data.bean.InvestPlatformLogo, java.util.List<com.okinc.business.invest_biz.data.bean.InvestTag>, com.okinc.business.invest_biz.data.bean.PointsInfo, com.okinc.business.invest_biz.data.bean.response.RewardCryptos, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:308) call: com.okinc.business.invest_biz.data.bean.AggregateItem.<init>(com.okinc.business.invest_biz.data.bean.BackgroundImage, boolean, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.AggregateItemRateType, java.lang.String, java.lang.String, boolean, java.util.List, com.okinc.business.invest_biz.data.bean.InvestPlatformLogo, java.util.List, com.okinc.business.invest_biz.data.bean.PointsInfo, com.okinc.business.invest_biz.data.bean.response.RewardCryptos, java.util.List, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ AggregateItem(BackgroundImage backgroundImage, boolean z, int i, String str, String str2, String str3, String str4, AggregateItemRateType aggregateItemRateType, String str5, String str6, boolean z2, List list, InvestPlatformLogo investPlatformLogo, List list2, PointsInfo pointsInfo, RewardCryptos rewardCryptos, List list3, String str7, String str8, String str9, boolean z3, String str10, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new BackgroundImage((String) null, (String) null, 3, (DefaultConstructorMarker) null) : backgroundImage, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? "" : str4, (i2 & 128) != 0 ? AggregateItemRateType.APY : aggregateItemRateType, (i2 & 256) != 0 ? "" : str5, (i2 & 512) != 0 ? "" : str6, (i2 & 1024) != 0 ? false : z2, (i2 & 2048) != 0 ? yDY.AhwBna() : list, (i2 & 4096) != 0 ? new InvestPlatformLogo((List) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null) : investPlatformLogo, (i2 & 8192) != 0 ? yDY.AhwBna() : list2, (i2 & 16384) != 0 ? null : pointsInfo, (i2 & 32768) != 0 ? null : rewardCryptos, (i2 & 65536) != 0 ? yDY.AhwBna() : list3, (i2 & 131072) != 0 ? "" : str7, (i2 & 262144) != 0 ? "" : str8, (i2 & 524288) != 0 ? "" : str9, (i2 & 1048576) != 0 ? false : z3, (i2 & 2097152) != 0 ? "" : str10);
    }
}
