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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestUserClaimInfoResponse implements Parcelable {
    private final Boolean canClaimAll;
    private final String coinAmount;
    private final String currencyAmount;
    private final InvestUserRewardDetailPromptInformation extraData;
    private final Long investmentId;
    private final List<InvestUserUnClaimTokenInfo> rewardTokenInfos;
    private final String userAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestUserClaimInfoResponse> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(InvestUserUnClaimTokenInfo$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<InvestUserClaimInfoResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUserClaimInfoResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList = null;
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string = parcel.readString();
            String string2 = parcel.readString();
            InvestUserRewardDetailPromptInformation investUserRewardDetailPromptInformationCreateFromParcel = parcel.readInt() == 0 ? null : InvestUserRewardDetailPromptInformation.CREATOR.createFromParcel(parcel);
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(InvestUserUnClaimTokenInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new InvestUserClaimInfoResponse(boolValueOf, string, string2, investUserRewardDetailPromptInformationCreateFromParcel, lValueOf, arrayList, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUserClaimInfoResponse[] newArray(int i) {
            return new InvestUserClaimInfoResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestUserClaimInfoResponse() {
        this((Boolean) null, (String) null, (String) null, (InvestUserRewardDetailPromptInformation) null, (Long) null, (List) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.invest_biz.data.bean.InvestUserClaimInfoResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestUserClaimInfoResponse copy$default(InvestUserClaimInfoResponse investUserClaimInfoResponse, Boolean bool, String str, String str2, InvestUserRewardDetailPromptInformation investUserRewardDetailPromptInformation, Long l, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = investUserClaimInfoResponse.canClaimAll;
        }
        if ((i & 2) != 0) {
            str = investUserClaimInfoResponse.coinAmount;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = investUserClaimInfoResponse.currencyAmount;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            investUserRewardDetailPromptInformation = investUserClaimInfoResponse.extraData;
        }
        InvestUserRewardDetailPromptInformation investUserRewardDetailPromptInformation2 = investUserRewardDetailPromptInformation;
        if ((i & 16) != 0) {
            l = investUserClaimInfoResponse.investmentId;
        }
        Long l2 = l;
        if ((i & 32) != 0) {
            list = investUserClaimInfoResponse.rewardTokenInfos;
        }
        List list2 = list;
        if ((i & 64) != 0) {
            str3 = investUserClaimInfoResponse.userAddress;
        }
        return investUserClaimInfoResponse.copy(bool, str4, str5, investUserRewardDetailPromptInformation2, l2, list2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.canClaimAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUserRewardDetailPromptInformation component4() {
        return this.extraData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component5() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUserUnClaimTokenInfo> component6() {
        return this.rewardTokenInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.userAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUserClaimInfoResponse copy(Boolean bool, String str, String str2, InvestUserRewardDetailPromptInformation investUserRewardDetailPromptInformation, Long l, List<InvestUserUnClaimTokenInfo> list, String str3) {
        return new InvestUserClaimInfoResponse(bool, str, str2, investUserRewardDetailPromptInformation, l, list, str3);
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
        if (!(obj instanceof InvestUserClaimInfoResponse)) {
            return false;
        }
        InvestUserClaimInfoResponse investUserClaimInfoResponse = (InvestUserClaimInfoResponse) obj;
        return Intrinsics.EZpvd(this.canClaimAll, investUserClaimInfoResponse.canClaimAll) && Intrinsics.EZpvd((Object) this.coinAmount, (Object) investUserClaimInfoResponse.coinAmount) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) investUserClaimInfoResponse.currencyAmount) && Intrinsics.EZpvd(this.extraData, investUserClaimInfoResponse.extraData) && Intrinsics.EZpvd(this.investmentId, investUserClaimInfoResponse.investmentId) && Intrinsics.EZpvd(this.rewardTokenInfos, investUserClaimInfoResponse.rewardTokenInfos) && Intrinsics.EZpvd((Object) this.userAddress, (Object) investUserClaimInfoResponse.userAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCanClaimAll() {
        return this.canClaimAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmount() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUserRewardDetailPromptInformation getExtraData() {
        return this.extraData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUserUnClaimTokenInfo> getRewardTokenInfos() {
        return this.rewardTokenInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserAddress() {
        return this.userAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.canClaimAll;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        String str = this.coinAmount;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.currencyAmount;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        InvestUserRewardDetailPromptInformation investUserRewardDetailPromptInformation = this.extraData;
        int iHashCode4 = investUserRewardDetailPromptInformation == null ? 0 : investUserRewardDetailPromptInformation.hashCode();
        Long l = this.investmentId;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        List<InvestUserUnClaimTokenInfo> list = this.rewardTokenInfos;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        String str3 = this.userAddress;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUserClaimInfoResponse(canClaimAll=" + this.canClaimAll + ", coinAmount=" + this.coinAmount + ", currencyAmount=" + this.currencyAmount + ", extraData=" + this.extraData + ", investmentId=" + this.investmentId + ", rewardTokenInfos=" + this.rewardTokenInfos + ", userAddress=" + this.userAddress + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Boolean bool = this.canClaimAll;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.coinAmount);
        parcel.writeString(this.currencyAmount);
        InvestUserRewardDetailPromptInformation investUserRewardDetailPromptInformation = this.extraData;
        if (investUserRewardDetailPromptInformation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investUserRewardDetailPromptInformation.writeToParcel(parcel, i);
        }
        Long l = this.investmentId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        List<InvestUserUnClaimTokenInfo> list = this.rewardTokenInfos;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<InvestUserUnClaimTokenInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.userAddress);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestUserClaimInfoResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestUserClaimInfoResponse> serializer() {
            return InvestUserClaimInfoResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestUserClaimInfoResponse(int i, Boolean bool, String str, String str2, InvestUserRewardDetailPromptInformation investUserRewardDetailPromptInformation, Long l, List list, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.canClaimAll = null;
        } else {
            this.canClaimAll = bool;
        }
        if ((i & 2) == 0) {
            this.coinAmount = null;
        } else {
            this.coinAmount = str;
        }
        if ((i & 4) == 0) {
            this.currencyAmount = null;
        } else {
            this.currencyAmount = str2;
        }
        if ((i & 8) == 0) {
            this.extraData = null;
        } else {
            this.extraData = investUserRewardDetailPromptInformation;
        }
        if ((i & 16) == 0) {
            this.investmentId = null;
        } else {
            this.investmentId = l;
        }
        if ((i & 32) == 0) {
            this.rewardTokenInfos = null;
        } else {
            this.rewardTokenInfos = list;
        }
        if ((i & 64) == 0) {
            this.userAddress = null;
        } else {
            this.userAddress = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestUserClaimInfoResponse investUserClaimInfoResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investUserClaimInfoResponse.canClaimAll != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, investUserClaimInfoResponse.canClaimAll);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investUserClaimInfoResponse.coinAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, investUserClaimInfoResponse.coinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investUserClaimInfoResponse.currencyAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, investUserClaimInfoResponse.currencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investUserClaimInfoResponse.extraData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, InvestUserRewardDetailPromptInformation$$serializer.INSTANCE, investUserClaimInfoResponse.extraData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investUserClaimInfoResponse.investmentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, investUserClaimInfoResponse.investmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investUserClaimInfoResponse.rewardTokenInfos != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], investUserClaimInfoResponse.rewardTokenInfos);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && investUserClaimInfoResponse.userAddress == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, investUserClaimInfoResponse.userAddress);
    }

    public InvestUserClaimInfoResponse(Boolean bool, String str, String str2, InvestUserRewardDetailPromptInformation investUserRewardDetailPromptInformation, Long l, List<InvestUserUnClaimTokenInfo> list, String str3) {
        this.canClaimAll = bool;
        this.coinAmount = str;
        this.currencyAmount = str2;
        this.extraData = investUserRewardDetailPromptInformation;
        this.investmentId = l;
        this.rewardTokenInfos = list;
        this.userAddress = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r7v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestUserRewardDetailPromptInformation:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestUserRewardDetailPromptInformation) : (r10v0 com.okinc.business.invest_biz.data.bean.InvestUserRewardDetailPromptInformation))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r11v0 java.lang.Long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r12v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.Boolean, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestUserRewardDetailPromptInformation, java.lang.Long, java.util.List<com.okinc.business.invest_biz.data.bean.InvestUserUnClaimTokenInfo>, java.lang.String):void (m)] (LINE:326) call: com.okinc.business.invest_biz.data.bean.InvestUserClaimInfoResponse.<init>(java.lang.Boolean, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestUserRewardDetailPromptInformation, java.lang.Long, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ InvestUserClaimInfoResponse(Boolean bool, String str, String str2, InvestUserRewardDetailPromptInformation investUserRewardDetailPromptInformation, Long l, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : investUserRewardDetailPromptInformation, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str3);
    }
}
