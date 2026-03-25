package com.okinc.business.invest_biz.data.bean;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.InterfaceC25470ixN;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestUserRewardInfoByInvestment implements Parcelable, InterfaceC25470ixN {
    private final List<InvestUserRewardElementInfo> baseDefiTokenInfos;
    private final ButtonType buttonType;
    private final String callDataExtJson;
    private final Long chainId;
    private final InvestUserRewardsAction claimMode;
    private final String currencyAmount;
    private final InvestUserAssetDetailClaimPromptInformation extraData;
    private final String network;
    private final RewardType rewardType;
    private final List<InvestBaseDefiTokenInfo> unclaimedTokenList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestUserRewardInfoByInvestment> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(InvestUserRewardElementInfo$$serializer.INSTANCE), ButtonType.Companion.serializer(), InvestUserRewardsAction.Companion.serializer(), null, null, RewardType.Companion.serializer(), null, new ArrayListSerializer(InvestBaseDefiTokenInfo$$serializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<InvestUserRewardInfoByInvestment> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUserRewardInfoByInvestment createFromParcel(Parcel parcel) {
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
            return new InvestUserRewardInfoByInvestment(arrayList, buttonTypeValueOf, investUserRewardsActionValueOf, string, investUserAssetDetailClaimPromptInformationCreateFromParcel, rewardTypeValueOf, string2, arrayList3, parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUserRewardInfoByInvestment[] newArray(int i) {
            return new InvestUserRewardInfoByInvestment[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestUserRewardInfoByInvestment() {
        this((List) null, (ButtonType) null, (InvestUserRewardsAction) null, (String) null, (InvestUserAssetDetailClaimPromptInformation) null, (RewardType) null, (String) null, (List) null, (String) null, (Long) null, 1023, (DefaultConstructorMarker) null);
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
    public final InvestUserRewardInfoByInvestment copy(List<InvestUserRewardElementInfo> list, @NotNull ButtonType buttonType, @NotNull InvestUserRewardsAction investUserRewardsAction, String str, InvestUserAssetDetailClaimPromptInformation investUserAssetDetailClaimPromptInformation, @NotNull RewardType rewardType, String str2, @NotNull List<InvestBaseDefiTokenInfo> list2, @NotNull String str3, Long l) {
        Intrinsics.checkNotNullParameter(buttonType, "");
        Intrinsics.checkNotNullParameter(investUserRewardsAction, "");
        Intrinsics.checkNotNullParameter(rewardType, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new InvestUserRewardInfoByInvestment(list, buttonType, investUserRewardsAction, str, investUserAssetDetailClaimPromptInformation, rewardType, str2, list2, str3, l);
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
        if (!(obj instanceof InvestUserRewardInfoByInvestment)) {
            return false;
        }
        InvestUserRewardInfoByInvestment investUserRewardInfoByInvestment = (InvestUserRewardInfoByInvestment) obj;
        return Intrinsics.EZpvd(this.baseDefiTokenInfos, investUserRewardInfoByInvestment.baseDefiTokenInfos) && this.buttonType == investUserRewardInfoByInvestment.buttonType && this.claimMode == investUserRewardInfoByInvestment.claimMode && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) investUserRewardInfoByInvestment.currencyAmount) && Intrinsics.EZpvd(this.extraData, investUserRewardInfoByInvestment.extraData) && this.rewardType == investUserRewardInfoByInvestment.rewardType && Intrinsics.EZpvd((Object) this.callDataExtJson, (Object) investUserRewardInfoByInvestment.callDataExtJson) && Intrinsics.EZpvd(this.unclaimedTokenList, investUserRewardInfoByInvestment.unclaimedTokenList) && Intrinsics.EZpvd((Object) this.network, (Object) investUserRewardInfoByInvestment.network) && Intrinsics.EZpvd(this.chainId, investUserRewardInfoByInvestment.chainId);
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
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (l != null ? l.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUserRewardInfoByInvestment(baseDefiTokenInfos=" + this.baseDefiTokenInfos + ", buttonType=" + this.buttonType + ", claimMode=" + this.claimMode + ", currencyAmount=" + this.currencyAmount + ", extraData=" + this.extraData + ", rewardType=" + this.rewardType + ", callDataExtJson=" + this.callDataExtJson + ", unclaimedTokenList=" + this.unclaimedTokenList + ", network=" + this.network + ", chainId=" + this.chainId + ")";
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
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestUserRewardInfoByInvestment> serializer() {
            return InvestUserRewardInfoByInvestment$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestUserRewardInfoByInvestment(int i, List list, ButtonType buttonType, InvestUserRewardsAction investUserRewardsAction, String str, InvestUserAssetDetailClaimPromptInformation investUserAssetDetailClaimPromptInformation, RewardType rewardType, String str2, List list2, String str3, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.baseDefiTokenInfos = null;
        } else {
            this.baseDefiTokenInfos = list;
        }
        if ((i & 2) == 0) {
            this.buttonType = ButtonType.CLAIM_TYPE_NO_NEED_SHOW;
        } else {
            this.buttonType = buttonType;
        }
        if ((i & 4) == 0) {
            this.claimMode = InvestUserRewardsAction.COMMON;
        } else {
            this.claimMode = investUserRewardsAction;
        }
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
        if ((i & 32) == 0) {
            this.rewardType = RewardType.COMMON;
        } else {
            this.rewardType = rewardType;
        }
        if ((i & 64) == 0) {
            this.callDataExtJson = null;
        } else {
            this.callDataExtJson = str2;
        }
        if ((i & 128) == 0) {
            this.unclaimedTokenList = yDY.AhwBna();
        } else {
            this.unclaimedTokenList = list2;
        }
        if ((i & 256) == 0) {
            this.network = "";
        } else {
            this.network = str3;
        }
        if ((i & 512) == 0) {
            this.chainId = null;
        } else {
            this.chainId = l;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [57=5] */
    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestUserRewardInfoByInvestment investUserRewardInfoByInvestment, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investUserRewardInfoByInvestment.getBaseDefiTokenInfos() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], investUserRewardInfoByInvestment.getBaseDefiTokenInfos());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investUserRewardInfoByInvestment.getButtonType() != ButtonType.CLAIM_TYPE_NO_NEED_SHOW) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], investUserRewardInfoByInvestment.getButtonType());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investUserRewardInfoByInvestment.getClaimMode() != InvestUserRewardsAction.COMMON) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], investUserRewardInfoByInvestment.getClaimMode());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investUserRewardInfoByInvestment.getCurrencyAmount() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, investUserRewardInfoByInvestment.getCurrencyAmount());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investUserRewardInfoByInvestment.getExtraData() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, InvestUserAssetDetailClaimPromptInformation$$serializer.INSTANCE, investUserRewardInfoByInvestment.getExtraData());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investUserRewardInfoByInvestment.getRewardType() != RewardType.COMMON) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], investUserRewardInfoByInvestment.getRewardType());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || investUserRewardInfoByInvestment.getCallDataExtJson() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, investUserRewardInfoByInvestment.getCallDataExtJson());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(investUserRewardInfoByInvestment.getUnclaimedTokenList(), yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], investUserRewardInfoByInvestment.getUnclaimedTokenList());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) investUserRewardInfoByInvestment.getNetwork(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, investUserRewardInfoByInvestment.getNetwork());
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && investUserRewardInfoByInvestment.getChainId() == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.INSTANCE, investUserRewardInfoByInvestment.getChainId());
    }

    public InvestUserRewardInfoByInvestment(List<InvestUserRewardElementInfo> list, @NotNull ButtonType buttonType, @NotNull InvestUserRewardsAction investUserRewardsAction, String str, InvestUserAssetDetailClaimPromptInformation investUserAssetDetailClaimPromptInformation, @NotNull RewardType rewardType, String str2, @NotNull List<InvestBaseDefiTokenInfo> list2, @NotNull String str3, Long l) {
        Intrinsics.checkNotNullParameter(buttonType, "");
        Intrinsics.checkNotNullParameter(investUserRewardsAction, "");
        Intrinsics.checkNotNullParameter(rewardType, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str3, "");
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
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0067: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r12v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.bean.ButtonType:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000e: SGET  A[WRAPPED] (LINE:62) com.okinc.business.invest_biz.data.bean.ButtonType.CLAIM_TYPE_NO_NEED_SHOW com.okinc.business.invest_biz.data.bean.ButtonType) : (r13v0 com.okinc.business.invest_biz.data.bean.ButtonType))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0016: SGET  A[WRAPPED] (LINE:63) com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction.COMMON com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction) : (r14v0 com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailClaimPromptInformation:?: TERNARY null = ((wrap:int:0x0021: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailClaimPromptInformation) : (r16v0 com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailClaimPromptInformation))
  (wrap:com.okinc.business.invest_biz.data.bean.RewardType:?: TERNARY null = ((wrap:int:0x0029: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002d: SGET  A[WRAPPED] (LINE:66) com.okinc.business.invest_biz.data.bean.RewardType.COMMON com.okinc.business.invest_biz.data.bean.RewardType) : (r17v0 com.okinc.business.invest_biz.data.bean.RewardType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003a: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003e: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:68)) : (r19v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x004e: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.Long) : (null java.lang.Long))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo>, com.okinc.business.invest_biz.data.bean.ButtonType, com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailClaimPromptInformation, com.okinc.business.invest_biz.data.bean.RewardType, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo>, java.lang.String, java.lang.Long):void (m)] (LINE:60) call: com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment.<init>(java.util.List, com.okinc.business.invest_biz.data.bean.ButtonType, com.okinc.business.invest_biz.data.bean.InvestUserRewardsAction, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailClaimPromptInformation, com.okinc.business.invest_biz.data.bean.RewardType, java.lang.String, java.util.List, java.lang.String, java.lang.Long):void type: THIS */
    public /* synthetic */ InvestUserRewardInfoByInvestment(List list, ButtonType buttonType, InvestUserRewardsAction investUserRewardsAction, String str, InvestUserAssetDetailClaimPromptInformation investUserAssetDetailClaimPromptInformation, RewardType rewardType, String str2, List list2, String str3, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? ButtonType.CLAIM_TYPE_NO_NEED_SHOW : buttonType, (i & 4) != 0 ? InvestUserRewardsAction.COMMON : investUserRewardsAction, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : investUserAssetDetailClaimPromptInformation, (i & 32) != 0 ? RewardType.COMMON : rewardType, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? yDY.AhwBna() : list2, (i & 256) != 0 ? "" : str3, (i & 512) == 0 ? l : null);
    }
}
