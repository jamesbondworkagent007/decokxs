package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestOrder implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    public static final String BABYLON_ORDER_STATUS_READY_TO_REDEEM = "readyRedeem";
    public static final String BABYLON_ORDER_STATUS_REDEEM_SUBMITTED = "redeemSubmitted";
    public static final String BABYLON_ORDER_STATUS_STAKED = "staked";
    public static final String BABYLON_ORDER_STATUS_STAKE_IN_PROCESS = "stakeInProcess";
    public static final String BABYLON_ORDER_STATUS_UNBONDING = "unbonding";
    public static final String ORDER_STATUS_ACTIVATING = "activating";
    public static final String ORDER_STATUS_ACTIVE = "active";
    public static final String ORDER_STATUS_UNSTAKED = "unstaked";
    public static final String ORDER_STATUS_UNSTAKING = "unstaking";
    private final Integer assetIndex;
    private final String babylonOrderStatus;
    private final String currencyAmount;
    private final boolean isAllowedRedeem;
    private final Boolean isOverflow;
    private final String orderStatus;
    private final Map<String, String> redeemExtra;
    private final String redeemId;
    private final Boolean redeemNeedUnbond;
    private final InvestTipInfoVo remainTimeTip;
    private final String stakeTime;
    private final String stakedAmount;
    private final String tokenSymbol;
    private final UnableRedeemTip unableRedeemTip;
    private final String validatorName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestOrder> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestOrder> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestOrder createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string5 = parcel.readString();
            UnableRedeemTip unableRedeemTipCreateFromParcel = parcel.readInt() == 0 ? null : UnableRedeemTip.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new InvestOrder(string, string2, string3, string4, z, string5, unableRedeemTipCreateFromParcel, linkedHashMap, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? InvestTipInfoVo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestOrder[] newArray(int i) {
            return new InvestOrder[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestOrder() {
        this((String) null, (String) null, (String) null, (String) null, false, (String) null, (UnableRedeemTip) null, (Map) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (String) null, (Integer) null, (InvestTipInfoVo) null, 32767, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.stakedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.babylonOrderStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.isOverflow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component12() {
        return this.redeemNeedUnbond;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.stakeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component14() {
        return this.assetIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component15() {
        return this.remainTimeTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.validatorName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isAllowedRedeem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.redeemId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnableRedeemTip component7() {
        return this.unableRedeemTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component8() {
        return this.redeemExtra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.orderStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestOrder copy(@NotNull String str, String str2, String str3, String str4, boolean z, String str5, UnableRedeemTip unableRedeemTip, Map<String, String> map, String str6, String str7, Boolean bool, Boolean bool2, String str8, Integer num, InvestTipInfoVo investTipInfoVo) {
        Intrinsics.checkNotNullParameter(str, "");
        return new InvestOrder(str, str2, str3, str4, z, str5, unableRedeemTip, map, str6, str7, bool, bool2, str8, num, investTipInfoVo);
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
        if (!(obj instanceof InvestOrder)) {
            return false;
        }
        InvestOrder investOrder = (InvestOrder) obj;
        return Intrinsics.EZpvd((Object) this.stakedAmount, (Object) investOrder.stakedAmount) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) investOrder.tokenSymbol) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) investOrder.currencyAmount) && Intrinsics.EZpvd((Object) this.validatorName, (Object) investOrder.validatorName) && this.isAllowedRedeem == investOrder.isAllowedRedeem && Intrinsics.EZpvd((Object) this.redeemId, (Object) investOrder.redeemId) && Intrinsics.EZpvd(this.unableRedeemTip, investOrder.unableRedeemTip) && Intrinsics.EZpvd(this.redeemExtra, investOrder.redeemExtra) && Intrinsics.EZpvd((Object) this.orderStatus, (Object) investOrder.orderStatus) && Intrinsics.EZpvd((Object) this.babylonOrderStatus, (Object) investOrder.babylonOrderStatus) && Intrinsics.EZpvd(this.isOverflow, investOrder.isOverflow) && Intrinsics.EZpvd(this.redeemNeedUnbond, investOrder.redeemNeedUnbond) && Intrinsics.EZpvd((Object) this.stakeTime, (Object) investOrder.stakeTime) && Intrinsics.EZpvd(this.assetIndex, investOrder.assetIndex) && Intrinsics.EZpvd(this.remainTimeTip, investOrder.remainTimeTip);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAssetIndex() {
        return this.assetIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBabylonOrderStatus() {
        return this.babylonOrderStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderStatus() {
        return this.orderStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getRedeemExtra() {
        return this.redeemExtra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRedeemId() {
        return this.redeemId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getRedeemNeedUnbond() {
        return this.redeemNeedUnbond;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getRemainTimeTip() {
        return this.remainTimeTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStakeTime() {
        return this.stakeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStakedAmount() {
        return this.stakedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnableRedeemTip getUnableRedeemTip() {
        return this.unableRedeemTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValidatorName() {
        return this.validatorName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.stakedAmount.hashCode();
        String str = this.tokenSymbol;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.currencyAmount;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.validatorName;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        int iHashCode5 = Boolean.hashCode(this.isAllowedRedeem);
        String str4 = this.redeemId;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        UnableRedeemTip unableRedeemTip = this.unableRedeemTip;
        int iHashCode7 = unableRedeemTip == null ? 0 : unableRedeemTip.hashCode();
        Map<String, String> map = this.redeemExtra;
        int iHashCode8 = map == null ? 0 : map.hashCode();
        String str5 = this.orderStatus;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.babylonOrderStatus;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        Boolean bool = this.isOverflow;
        int iHashCode11 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.redeemNeedUnbond;
        int iHashCode12 = bool2 == null ? 0 : bool2.hashCode();
        String str7 = this.stakeTime;
        int iHashCode13 = str7 == null ? 0 : str7.hashCode();
        Integer num = this.assetIndex;
        int iHashCode14 = num == null ? 0 : num.hashCode();
        InvestTipInfoVo investTipInfoVo = this.remainTimeTip;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (investTipInfoVo == null ? 0 : investTipInfoVo.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAllowedRedeem() {
        return this.isAllowedRedeem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isOverflow() {
        return this.isOverflow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestOrder(stakedAmount=" + this.stakedAmount + ", tokenSymbol=" + this.tokenSymbol + ", currencyAmount=" + this.currencyAmount + ", validatorName=" + this.validatorName + ", isAllowedRedeem=" + this.isAllowedRedeem + ", redeemId=" + this.redeemId + ", unableRedeemTip=" + this.unableRedeemTip + ", redeemExtra=" + this.redeemExtra + ", orderStatus=" + this.orderStatus + ", babylonOrderStatus=" + this.babylonOrderStatus + ", isOverflow=" + this.isOverflow + ", redeemNeedUnbond=" + this.redeemNeedUnbond + ", stakeTime=" + this.stakeTime + ", assetIndex=" + this.assetIndex + ", remainTimeTip=" + this.remainTimeTip + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.stakedAmount);
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.currencyAmount);
        parcel.writeString(this.validatorName);
        parcel.writeInt(this.isAllowedRedeem ? 1 : 0);
        parcel.writeString(this.redeemId);
        UnableRedeemTip unableRedeemTip = this.unableRedeemTip;
        if (unableRedeemTip == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            unableRedeemTip.writeToParcel(parcel, i);
        }
        Map<String, String> map = this.redeemExtra;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        parcel.writeString(this.orderStatus);
        parcel.writeString(this.babylonOrderStatus);
        Boolean bool = this.isOverflow;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.redeemNeedUnbond;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.stakeTime);
        Integer num = this.assetIndex;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        InvestTipInfoVo investTipInfoVo = this.remainTimeTip;
        if (investTipInfoVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ InvestOrder(int i, String str, String str2, String str3, String str4, boolean z, String str5, UnableRedeemTip unableRedeemTip, Map map, String str6, String str7, Boolean bool, Boolean bool2, String str8, Integer num, InvestTipInfoVo investTipInfoVo, SerializationConstructorMarker serializationConstructorMarker) {
        this.stakedAmount = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.tokenSymbol = null;
        } else {
            this.tokenSymbol = str2;
        }
        if ((i & 4) == 0) {
            this.currencyAmount = null;
        } else {
            this.currencyAmount = str3;
        }
        if ((i & 8) == 0) {
            this.validatorName = null;
        } else {
            this.validatorName = str4;
        }
        this.isAllowedRedeem = (i & 16) == 0 ? false : z;
        if ((i & 32) == 0) {
            this.redeemId = null;
        } else {
            this.redeemId = str5;
        }
        if ((i & 64) == 0) {
            this.unableRedeemTip = null;
        } else {
            this.unableRedeemTip = unableRedeemTip;
        }
        if ((i & 128) == 0) {
            this.redeemExtra = null;
        } else {
            this.redeemExtra = map;
        }
        if ((i & 256) == 0) {
            this.orderStatus = null;
        } else {
            this.orderStatus = str6;
        }
        if ((i & 512) == 0) {
            this.babylonOrderStatus = null;
        } else {
            this.babylonOrderStatus = str7;
        }
        if ((i & 1024) == 0) {
            this.isOverflow = null;
        } else {
            this.isOverflow = bool;
        }
        if ((i & 2048) == 0) {
            this.redeemNeedUnbond = null;
        } else {
            this.redeemNeedUnbond = bool2;
        }
        if ((i & 4096) == 0) {
            this.stakeTime = null;
        } else {
            this.stakeTime = str8;
        }
        if ((i & 8192) == 0) {
            this.assetIndex = null;
        } else {
            this.assetIndex = num;
        }
        if ((i & 16384) == 0) {
            this.remainTimeTip = null;
        } else {
            this.remainTimeTip = investTipInfoVo;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestOrder investOrder, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investOrder.stakedAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, investOrder.stakedAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investOrder.tokenSymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, investOrder.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investOrder.currencyAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, investOrder.currencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investOrder.validatorName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, investOrder.validatorName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investOrder.isAllowedRedeem) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, investOrder.isAllowedRedeem);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investOrder.redeemId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, investOrder.redeemId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || investOrder.unableRedeemTip != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, UnableRedeemTip$$serializer.INSTANCE, investOrder.unableRedeemTip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || investOrder.redeemExtra != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], investOrder.redeemExtra);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || investOrder.orderStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, investOrder.orderStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || investOrder.babylonOrderStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, investOrder.babylonOrderStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || investOrder.isOverflow != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, investOrder.isOverflow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || investOrder.redeemNeedUnbond != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, investOrder.redeemNeedUnbond);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || investOrder.stakeTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, investOrder.stakeTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || investOrder.assetIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, investOrder.assetIndex);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && investOrder.remainTimeTip == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, InvestTipInfoVo$$serializer.INSTANCE, investOrder.remainTimeTip);
    }

    public InvestOrder(@NotNull String str, String str2, String str3, String str4, boolean z, String str5, UnableRedeemTip unableRedeemTip, Map<String, String> map, String str6, String str7, Boolean bool, Boolean bool2, String str8, Integer num, InvestTipInfoVo investTipInfoVo) {
        Intrinsics.checkNotNullParameter(str, "");
        this.stakedAmount = str;
        this.tokenSymbol = str2;
        this.currencyAmount = str3;
        this.validatorName = str4;
        this.isAllowedRedeem = z;
        this.redeemId = str5;
        this.unableRedeemTip = unableRedeemTip;
        this.redeemExtra = map;
        this.orderStatus = str6;
        this.babylonOrderStatus = str7;
        this.isOverflow = bool;
        this.redeemNeedUnbond = bool2;
        this.stakeTime = str8;
        this.assetIndex = num;
        this.remainTimeTip = investTipInfoVo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.UnableRedeemTip:?: TERNARY null = ((wrap:int:0x0034: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.UnableRedeemTip) : (r23v0 com.okinc.business.invest_biz.data.bean.UnableRedeemTip))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x003c: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r24v0 java.util.Map))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0054: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r27v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x005c: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r28v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x006c: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r30v0 java.lang.Integer))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x0074: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, com.okinc.business.invest_biz.data.bean.UnableRedeemTip, java.util.Map<java.lang.String, java.lang.String>, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Integer, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void (m)] (LINE:375) call: com.okinc.business.invest_biz.data.bean.InvestOrder.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, com.okinc.business.invest_biz.data.bean.UnableRedeemTip, java.util.Map, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Integer, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void type: THIS */
    public /* synthetic */ InvestOrder(String str, String str2, String str3, String str4, boolean z, String str5, UnableRedeemTip unableRedeemTip, Map map, String str6, String str7, Boolean bool, Boolean bool2, String str8, Integer num, InvestTipInfoVo investTipInfoVo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : unableRedeemTip, (i & 128) != 0 ? null : map, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : bool, (i & 2048) != 0 ? null : bool2, (i & 4096) != 0 ? null : str8, (i & 8192) != 0 ? null : num, (i & 16384) == 0 ? investTipInfoVo : null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestOrder.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InvestOrder> serializer() {
            return InvestOrder$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null, null, null, null, null, null, null};
    }
}
