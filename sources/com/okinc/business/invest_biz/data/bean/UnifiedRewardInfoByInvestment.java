package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.InterfaceC25470ixN;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class UnifiedRewardInfoByInvestment implements Parcelable, InterfaceC25470ixN {
    private final List<InvestUserRewardElementInfo> baseDefiTokenInfos;
    private final ButtonType buttonType;
    private final String callDataExtJson;
    private final Long chainId;
    private final InvestUserRewardsAction claimMode;
    private final String currencyAmount;
    private final InvestUserAssetDetailClaimPromptInformation extraData;
    private final InvestmentKind investmentCategory;
    private final long investmentId;
    private final String network;
    private final RewardType rewardType;
    private final List<InvestBaseDefiTokenInfo> unclaimedTokenList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UnifiedRewardInfoByInvestment> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(InvestUserRewardElementInfo$$serializer.INSTANCE), ButtonType.Companion.serializer(), InvestUserRewardsAction.Companion.serializer(), null, null, RewardType.Companion.serializer(), null, new ArrayListSerializer(InvestBaseDefiTokenInfo$$serializer.INSTANCE), null, null, null, InvestmentKind.Companion.serializer()};

    public static final class Creator implements Parcelable.Creator<UnifiedRewardInfoByInvestment> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnifiedRewardInfoByInvestment createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(InvestUserRewardElementInfo.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            ButtonType buttonTypeValueOf = ButtonType.valueOf(parcel.readString());
            InvestUserRewardsAction investUserRewardsActionValueOf = InvestUserRewardsAction.valueOf(parcel.readString());
            String string = parcel.readString();
            InvestUserAssetDetailClaimPromptInformation investUserAssetDetailClaimPromptInformationCreateFromParcel = parcel.readInt() == 0 ? null : InvestUserAssetDetailClaimPromptInformation.CREATOR.createFromParcel(parcel);
            RewardType rewardTypeValueOf = RewardType.valueOf(parcel.readString());
            String string2 = parcel.readString();
            int i3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList3.add(InvestBaseDefiTokenInfo.CREATOR.createFromParcel(parcel));
            }
            return new UnifiedRewardInfoByInvestment(arrayList, buttonTypeValueOf, investUserRewardsActionValueOf, string, investUserAssetDetailClaimPromptInformationCreateFromParcel, rewardTypeValueOf, string2, arrayList3, parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readLong(), InvestmentKind.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnifiedRewardInfoByInvestment[] newArray(int i) {
            return new UnifiedRewardInfoByInvestment[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UnifiedRewardInfoByInvestment() {
        this((List) null, (ButtonType) null, (InvestUserRewardsAction) null, (String) null, (InvestUserAssetDetailClaimPromptInformation) null, (RewardType) null, (String) null, (List) null, (String) null, (Long) null, 0L, (InvestmentKind) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUserRewardElementInfo> component1() {
        return this.baseDefiTokenInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component10() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component11() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestmentKind component12() {
        return this.investmentCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonType component2() {
        return this.buttonType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUserRewardsAction component3() {
        return this.claimMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUserAssetDetailClaimPromptInformation component5() {
        return this.extraData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RewardType component6() {
        return this.rewardType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.callDataExtJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestBaseDefiTokenInfo> component8() {
        return this.unclaimedTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnifiedRewardInfoByInvestment copy(List<InvestUserRewardElementInfo> list, @NotNull ButtonType buttonType, @NotNull InvestUserRewardsAction investUserRewardsAction, String str, InvestUserAssetDetailClaimPromptInformation investUserAssetDetailClaimPromptInformation, @NotNull RewardType rewardType, String str2, @NotNull List<InvestBaseDefiTokenInfo> list2, @NotNull String str3, Long l, long j, @NotNull InvestmentKind investmentKind) {
        Intrinsics.checkNotNullParameter(buttonType, "");
        Intrinsics.checkNotNullParameter(investUserRewardsAction, "");
        Intrinsics.checkNotNullParameter(rewardType, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(investmentKind, "");
        return new UnifiedRewardInfoByInvestment(list, buttonType, investUserRewardsAction, str, investUserAssetDetailClaimPromptInformation, rewardType, str2, list2, str3, l, j, investmentKind);
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
        if (!(obj instanceof UnifiedRewardInfoByInvestment)) {
            return false;
        }
        UnifiedRewardInfoByInvestment unifiedRewardInfoByInvestment = (UnifiedRewardInfoByInvestment) obj;
        return Intrinsics.EZpvd(this.baseDefiTokenInfos, unifiedRewardInfoByInvestment.baseDefiTokenInfos) && this.buttonType == unifiedRewardInfoByInvestment.buttonType && this.claimMode == unifiedRewardInfoByInvestment.claimMode && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) unifiedRewardInfoByInvestment.currencyAmount) && Intrinsics.EZpvd(this.extraData, unifiedRewardInfoByInvestment.extraData) && this.rewardType == unifiedRewardInfoByInvestment.rewardType && Intrinsics.EZpvd((Object) this.callDataExtJson, (Object) unifiedRewardInfoByInvestment.callDataExtJson) && Intrinsics.EZpvd(this.unclaimedTokenList, unifiedRewardInfoByInvestment.unclaimedTokenList) && Intrinsics.EZpvd((Object) this.network, (Object) unifiedRewardInfoByInvestment.network) && Intrinsics.EZpvd(this.chainId, unifiedRewardInfoByInvestment.chainId) && this.investmentId == unifiedRewardInfoByInvestment.investmentId && this.investmentCategory == unifiedRewardInfoByInvestment.investmentCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<InvestUserRewardElementInfo> getBaseDefiTokenInfos() {
        return this.baseDefiTokenInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ButtonType getButtonType() {
        return this.buttonType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getCallDataExtJson() {
        return this.callDataExtJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestUserRewardsAction getClaimMode() {
        return this.claimMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestUserAssetDetailClaimPromptInformation getExtraData() {
        return this.extraData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestmentKind getInvestmentCategory() {
        return this.investmentCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC25470ixN
    public RewardType getRewardType() {
        return this.rewardType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<InvestBaseDefiTokenInfo> getUnclaimedTokenList() {
        return this.unclaimedTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<InvestUserRewardElementInfo> list = this.baseDefiTokenInfos;
        int iHashCode = list == null ? 0 : list.hashCode();
        int iHashCode2 = this.buttonType.hashCode();
        int iHashCode3 = this.claimMode.hashCode();
        String str = this.currencyAmount;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        InvestUserAssetDetailClaimPromptInformation investUserAssetDetailClaimPromptInformation = this.extraData;
        int iHashCode5 = investUserAssetDetailClaimPromptInformation == null ? 0 : investUserAssetDetailClaimPromptInformation.hashCode();
        int iHashCode6 = this.rewardType.hashCode();
        String str2 = this.callDataExtJson;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        int iHashCode8 = this.unclaimedTokenList.hashCode();
        int iHashCode9 = this.network.hashCode();
        Long l = this.chainId;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (l != null ? l.hashCode() : 0)) * 31) + Long.hashCode(this.investmentId)) * 31) + this.investmentCategory.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UnifiedRewardInfoByInvestment(baseDefiTokenInfos=" + this.baseDefiTokenInfos + ", buttonType=" + this.buttonType + ", claimMode=" + this.claimMode + ", currencyAmount=" + this.currencyAmount + ", extraData=" + this.extraData + ", rewardType=" + this.rewardType + ", callDataExtJson=" + this.callDataExtJson + ", unclaimedTokenList=" + this.unclaimedTokenList + ", network=" + this.network + ", chainId=" + this.chainId + ", investmentId=" + this.investmentId + ", investmentCategory=" + this.investmentCategory + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<InvestUserRewardElementInfo> list = this.baseDefiTokenInfos;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<InvestUserRewardElementInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.buttonType.name());
        parcel.writeString(this.claimMode.name());
        parcel.writeString(this.currencyAmount);
        InvestUserAssetDetailClaimPromptInformation investUserAssetDetailClaimPromptInformation = this.extraData;
        if (investUserAssetDetailClaimPromptInformation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investUserAssetDetailClaimPromptInformation.writeToParcel(parcel, i);
        }
        parcel.writeString(this.rewardType.name());
        parcel.writeString(this.callDataExtJson);
        List<InvestBaseDefiTokenInfo> list2 = this.unclaimedTokenList;
        parcel.writeInt(list2.size());
        Iterator<InvestBaseDefiTokenInfo> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.network);
        Long l = this.chainId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeLong(this.investmentId);
        parcel.writeString(this.investmentCategory.name());
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.UnifiedRewardInfoByInvestment.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UnifiedRewardInfoByInvestment> serializer() {
            return UnifiedRewardInfoByInvestment$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UnifiedRewardInfoByInvestment(int i, List list, ButtonType buttonType, InvestUserRewardsAction investUserRewardsAction, String str, InvestUserAssetDetailClaimPromptInformation investUserAssetDetailClaimPromptInformation, RewardType rewardType, String str2, List list2, String str3, Long l, long j, InvestmentKind investmentKind, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.baseDefiTokenInfos = null;
        } else {
            this.baseDefiTokenInfos = list;
        }
        this.buttonType = (i & 2) == 0 ? ButtonType.CLAIM_TYPE_NO_NEED_SHOW : buttonType;
        this.claimMode = (i & 4) == 0 ? InvestUserRewardsAction.COMMON : investUserRewardsAction;
        if ((i & 8) == 0) {
            this.currencyAmount = null;
        } else {
            this.currencyAmount = str;
        }
        if ((i & 16) == 0) {
            this.extraData = null;
        } else {
            this.extraData = investUserAssetDetailClaimPromptInformation;
        }
        this.rewardType = (i & 32) == 0 ? RewardType.COMMON : rewardType;
        if ((i & 64) == 0) {
            this.callDataExtJson = null;
        } else {
            this.callDataExtJson = str2;
        }
        this.unclaimedTokenList = (i & 128) == 0 ? yDY.AhwBna() : list2;
        this.network = (i & 256) == 0 ? "" : str3;
        if ((i & 512) == 0) {
            this.chainId = null;
        } else {
            this.chainId = l;
        }
        this.investmentId = (i & 1024) == 0 ? 0L : j;
        this.investmentCategory = (i & 2048) == 0 ? InvestmentKind.Default : investmentKind;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [431=6] */
    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(UnifiedRewardInfoByInvestment unifiedRewardInfoByInvestment, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || unifiedRewardInfoByInvestment.getBaseDefiTokenInfos() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], unifiedRewardInfoByInvestment.getBaseDefiTokenInfos());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || unifiedRewardInfoByInvestment.getButtonType() != ButtonType.CLAIM_TYPE_NO_NEED_SHOW) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], unifiedRewardInfoByInvestment.getButtonType());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || unifiedRewardInfoByInvestment.getClaimMode() != InvestUserRewardsAction.COMMON) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], unifiedRewardInfoByInvestment.getClaimMode());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || unifiedRewardInfoByInvestment.getCurrencyAmount() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, unifiedRewardInfoByInvestment.getCurrencyAmount());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || unifiedRewardInfoByInvestment.getExtraData() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, InvestUserAssetDetailClaimPromptInformation$$serializer.INSTANCE, unifiedRewardInfoByInvestment.getExtraData());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || unifiedRewardInfoByInvestment.getRewardType() != RewardType.COMMON) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], unifiedRewardInfoByInvestment.getRewardType());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || unifiedRewardInfoByInvestment.getCallDataExtJson() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, unifiedRewardInfoByInvestment.getCallDataExtJson());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(unifiedRewardInfoByInvestment.getUnclaimedTokenList(), yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], unifiedRewardInfoByInvestment.getUnclaimedTokenList());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) unifiedRewardInfoByInvestment.getNetwork(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, unifiedRewardInfoByInvestment.getNetwork());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || unifiedRewardInfoByInvestment.getChainId() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.INSTANCE, unifiedRewardInfoByInvestment.getChainId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || unifiedRewardInfoByInvestment.investmentId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 10, unifiedRewardInfoByInvestment.investmentId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && unifiedRewardInfoByInvestment.investmentCategory == InvestmentKind.Default) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], unifiedRewardInfoByInvestment.investmentCategory);
    }

    public UnifiedRewardInfoByInvestment(List<InvestUserRewardElementInfo> list, @NotNull ButtonType buttonType, @NotNull InvestUserRewardsAction investUserRewardsAction, String str, InvestUserAssetDetailClaimPromptInformation investUserAssetDetailClaimPromptInformation, @NotNull RewardType rewardType, String str2, @NotNull List<InvestBaseDefiTokenInfo> list2, @NotNull String str3, Long l, long j, @NotNull InvestmentKind investmentKind) {
        Intrinsics.checkNotNullParameter(buttonType, "");
        Intrinsics.checkNotNullParameter(investUserRewardsAction, "");
        Intrinsics.checkNotNullParameter(rewardType, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(investmentKind, "");
        this.baseDefiTokenInfos = list;
        this.buttonType = buttonType;
        this.claimMode = investUserRewardsAction;
        this.currencyAmount = str;
        this.extraData = investUserAssetDetailClaimPromptInformation;
        this.rewardType = rewardType;
        this.callDataExtJson = str2;
        this.unclaimedTokenList = list2;
        this.network = str3;
        this.chainId = l;
        this.investmentId = j;
        this.investmentCategory = investmentKind;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0081: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r14v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.bean.ButtonType:?: TERNARY null = ((wrap:int:0x000a: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000e: SGET  A[WRAPPED] (LINE:436) com.okinc.business.invest_biz.data.bean.ButtonType.CLAIM_TYPE_NO_NEED_SHOW com.okinc.business.invest_biz.data.bean.ButtonType) : (r15v0 com.okinc.business.invest_biz.data.bean.ButtonType))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction:?: TERNARY null = ((wrap:int:0x0012: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0016: SGET  A[WRAPPED] (LINE:437) com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction.COMMON com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction) : (r16v0 com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailClaimPromptInformation:?: TERNARY null = ((wrap:int:0x0023: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailClaimPromptInformation) : (r18v0 com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailClaimPromptInformation))
  (wrap:com.okinc.business.invest_biz.data.bean.RewardType:?: TERNARY null = ((wrap:int:0x002b: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002f: SGET  A[WRAPPED] (LINE:440) com.okinc.business.invest_biz.data.bean.RewardType.COMMON com.okinc.business.invest_biz.data.bean.RewardType) : (r19v0 com.okinc.business.invest_biz.data.bean.RewardType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003c: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0040: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:442)) : (r21v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0050: ARITH (r27v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.Long) : (null java.lang.Long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0057: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r24v0 long))
  (wrap:com.okinc.business.invest_biz.data.contants.InvestmentKind:?: TERNARY null = ((wrap:int:0x0060: ARITH (r27v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0064: SGET  A[WRAPPED] (LINE:446) com.okinc.business.invest_biz.data.contants.InvestmentKind.Default com.okinc.business.invest_biz.data.contants.InvestmentKind) : (r26v0 com.okinc.business.invest_biz.data.contants.InvestmentKind))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo>, com.okinc.business.invest_biz.data.bean.ButtonType, com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailClaimPromptInformation, com.okinc.business.invest_biz.data.bean.RewardType, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo>, java.lang.String, java.lang.Long, long, com.okinc.business.invest_biz.data.contants.InvestmentKind):void (m)] (LINE:434) call: com.okinc.business.invest_biz.data.bean.UnifiedRewardInfoByInvestment.<init>(java.util.List, com.okinc.business.invest_biz.data.bean.ButtonType, com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailClaimPromptInformation, com.okinc.business.invest_biz.data.bean.RewardType, java.lang.String, java.util.List, java.lang.String, java.lang.Long, long, com.okinc.business.invest_biz.data.contants.InvestmentKind):void type: THIS */
    public /* synthetic */ UnifiedRewardInfoByInvestment(List list, ButtonType buttonType, InvestUserRewardsAction investUserRewardsAction, String str, InvestUserAssetDetailClaimPromptInformation investUserAssetDetailClaimPromptInformation, RewardType rewardType, String str2, List list2, String str3, Long l, long j, InvestmentKind investmentKind, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? ButtonType.CLAIM_TYPE_NO_NEED_SHOW : buttonType, (i & 4) != 0 ? InvestUserRewardsAction.COMMON : investUserRewardsAction, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : investUserAssetDetailClaimPromptInformation, (i & 32) != 0 ? RewardType.COMMON : rewardType, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? yDY.AhwBna() : list2, (i & 256) != 0 ? "" : str3, (i & 512) == 0 ? l : null, (i & 1024) != 0 ? 0L : j, (i & 2048) != 0 ? InvestmentKind.Default : investmentKind);
    }
}
