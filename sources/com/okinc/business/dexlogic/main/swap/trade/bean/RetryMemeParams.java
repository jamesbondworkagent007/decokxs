package com.okinc.business.dexlogic.main.swap.trade.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class RetryMemeParams implements Parcelable {
    private final String amount;
    private final String chainId;
    private final Boolean customPriorityFee;
    private String customSlippage;
    private int direction;
    private final String fromTokenContractAddress;
    private final String fromTokenSymbol;
    private final String gasPrice;
    private boolean isEnableJito;
    private boolean isMemeTimeOut;
    private String maxSlippage;
    private final String mevInfo;
    private final String priorityFee;
    private String priorityFeeType;
    private final String referId;
    private String routerModeType;
    private final String slippage;
    private Integer slippageType;
    private final String toTokenContractAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RetryMemeParams> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<RetryMemeParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RetryMemeParams createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RetryMemeParams(string, string2, string3, string4, string5, string6, boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RetryMemeParams[] newArray(int i) {
            return new RetryMemeParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.fromTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.isEnableJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.mevInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component13() {
        return this.isMemeTimeOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.priorityFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.customSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component18() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component19() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromTokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.toTokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.customPriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.referId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RetryMemeParams copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, Boolean bool, @NotNull String str7, @NotNull String str8, @NotNull String str9, boolean z, String str10, boolean z2, @NotNull String str11, @NotNull String str12, String str13, String str14, Integer num, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        return new RetryMemeParams(str, str2, str3, str4, str5, str6, bool, str7, str8, str9, z, str10, z2, str11, str12, str13, str14, num, i);
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
        if (!(obj instanceof RetryMemeParams)) {
            return false;
        }
        RetryMemeParams retryMemeParams = (RetryMemeParams) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) retryMemeParams.chainId) && Intrinsics.EZpvd((Object) this.fromTokenContractAddress, (Object) retryMemeParams.fromTokenContractAddress) && Intrinsics.EZpvd((Object) this.toTokenContractAddress, (Object) retryMemeParams.toTokenContractAddress) && Intrinsics.EZpvd((Object) this.slippage, (Object) retryMemeParams.slippage) && Intrinsics.EZpvd((Object) this.priorityFee, (Object) retryMemeParams.priorityFee) && Intrinsics.EZpvd((Object) this.gasPrice, (Object) retryMemeParams.gasPrice) && Intrinsics.EZpvd(this.customPriorityFee, retryMemeParams.customPriorityFee) && Intrinsics.EZpvd((Object) this.amount, (Object) retryMemeParams.amount) && Intrinsics.EZpvd((Object) this.referId, (Object) retryMemeParams.referId) && Intrinsics.EZpvd((Object) this.fromTokenSymbol, (Object) retryMemeParams.fromTokenSymbol) && this.isEnableJito == retryMemeParams.isEnableJito && Intrinsics.EZpvd((Object) this.mevInfo, (Object) retryMemeParams.mevInfo) && this.isMemeTimeOut == retryMemeParams.isMemeTimeOut && Intrinsics.EZpvd((Object) this.routerModeType, (Object) retryMemeParams.routerModeType) && Intrinsics.EZpvd((Object) this.priorityFeeType, (Object) retryMemeParams.priorityFeeType) && Intrinsics.EZpvd((Object) this.customSlippage, (Object) retryMemeParams.customSlippage) && Intrinsics.EZpvd((Object) this.maxSlippage, (Object) retryMemeParams.maxSlippage) && Intrinsics.EZpvd(this.slippageType, retryMemeParams.slippageType) && this.direction == retryMemeParams.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCustomPriorityFee() {
        return this.customPriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomSlippage() {
        return this.customSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenContractAddress() {
        return this.fromTokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenSymbol() {
        return this.fromTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSlippage() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMevInfo() {
        return this.mevInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFeeType() {
        return this.priorityFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferId() {
        return this.referId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRouterModeType() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSlippageType() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenContractAddress() {
        return this.toTokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainId.hashCode();
        int iHashCode2 = this.fromTokenContractAddress.hashCode();
        int iHashCode3 = this.toTokenContractAddress.hashCode();
        int iHashCode4 = this.slippage.hashCode();
        int iHashCode5 = this.priorityFee.hashCode();
        int iHashCode6 = this.gasPrice.hashCode();
        Boolean bool = this.customPriorityFee;
        int iHashCode7 = bool == null ? 0 : bool.hashCode();
        int iHashCode8 = this.amount.hashCode();
        int iHashCode9 = this.referId.hashCode();
        int iHashCode10 = this.fromTokenSymbol.hashCode();
        int iHashCode11 = Boolean.hashCode(this.isEnableJito);
        String str = this.mevInfo;
        int iHashCode12 = str == null ? 0 : str.hashCode();
        int iHashCode13 = Boolean.hashCode(this.isMemeTimeOut);
        int iHashCode14 = this.routerModeType.hashCode();
        int iHashCode15 = this.priorityFeeType.hashCode();
        String str2 = this.customSlippage;
        int iHashCode16 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.maxSlippage;
        int iHashCode17 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.slippageType;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.direction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isEnableJito() {
        return this.isEnableJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isMemeTimeOut() {
        return this.isMemeTimeOut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCustomSlippage(String str) {
        this.customSlippage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDirection(int i) {
        this.direction = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnableJito(boolean z) {
        this.isEnableJito = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxSlippage(String str) {
        this.maxSlippage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMemeTimeOut(boolean z) {
        this.isMemeTimeOut = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriorityFeeType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.priorityFeeType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRouterModeType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.routerModeType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlippageType(Integer num) {
        this.slippageType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RetryMemeParams(chainId=" + this.chainId + ", fromTokenContractAddress=" + this.fromTokenContractAddress + ", toTokenContractAddress=" + this.toTokenContractAddress + ", slippage=" + this.slippage + ", priorityFee=" + this.priorityFee + ", gasPrice=" + this.gasPrice + ", customPriorityFee=" + this.customPriorityFee + ", amount=" + this.amount + ", referId=" + this.referId + ", fromTokenSymbol=" + this.fromTokenSymbol + ", isEnableJito=" + this.isEnableJito + ", mevInfo=" + this.mevInfo + ", isMemeTimeOut=" + this.isMemeTimeOut + ", routerModeType=" + this.routerModeType + ", priorityFeeType=" + this.priorityFeeType + ", customSlippage=" + this.customSlippage + ", maxSlippage=" + this.maxSlippage + ", slippageType=" + this.slippageType + ", direction=" + this.direction + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainId);
        parcel.writeString(this.fromTokenContractAddress);
        parcel.writeString(this.toTokenContractAddress);
        parcel.writeString(this.slippage);
        parcel.writeString(this.priorityFee);
        parcel.writeString(this.gasPrice);
        Boolean bool = this.customPriorityFee;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.amount);
        parcel.writeString(this.referId);
        parcel.writeString(this.fromTokenSymbol);
        parcel.writeInt(this.isEnableJito ? 1 : 0);
        parcel.writeString(this.mevInfo);
        parcel.writeInt(this.isMemeTimeOut ? 1 : 0);
        parcel.writeString(this.routerModeType);
        parcel.writeString(this.priorityFeeType);
        parcel.writeString(this.customSlippage);
        parcel.writeString(this.maxSlippage);
        Integer num = this.slippageType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.direction);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.swap.trade.bean.RetryMemeParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RetryMemeParams> serializer() {
            return RetryMemeParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RetryMemeParams(int i, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, String str9, boolean z, String str10, boolean z2, String str11, String str12, String str13, String str14, Integer num, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (389023 != (i & 389023)) {
            PluginExceptionsKt.throwMissingFieldException(i, 389023, RetryMemeParams$$serializer.INSTANCE.getDescriptor());
        }
        this.chainId = str;
        this.fromTokenContractAddress = str2;
        this.toTokenContractAddress = str3;
        this.slippage = str4;
        this.priorityFee = str5;
        this.gasPrice = (i & 32) == 0 ? "" : str6;
        this.customPriorityFee = (i & 64) == 0 ? null : bool;
        this.amount = str7;
        this.referId = str8;
        this.fromTokenSymbol = str9;
        this.isEnableJito = z;
        this.mevInfo = str10;
        this.isMemeTimeOut = (i & 4096) == 0 ? false : z2;
        this.routerModeType = str11;
        this.priorityFeeType = str12;
        this.customSlippage = str13;
        this.maxSlippage = str14;
        this.slippageType = (i & 131072) == 0 ? Integer.valueOf(SlippageMode.Dynamic.getType()) : num;
        this.direction = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$OKDex_dex_impl(RetryMemeParams retryMemeParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, retryMemeParams.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, retryMemeParams.fromTokenContractAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, retryMemeParams.toTokenContractAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, retryMemeParams.slippage);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, retryMemeParams.priorityFee);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) retryMemeParams.gasPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, retryMemeParams.gasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || retryMemeParams.customPriorityFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, retryMemeParams.customPriorityFee);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, retryMemeParams.amount);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, retryMemeParams.referId);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, retryMemeParams.fromTokenSymbol);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 10, retryMemeParams.isEnableJito);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, retryMemeParams.mevInfo);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || retryMemeParams.isMemeTimeOut) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, retryMemeParams.isMemeTimeOut);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 13, retryMemeParams.routerModeType);
        compositeEncoder.encodeStringElement(serialDescriptor, 14, retryMemeParams.priorityFeeType);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, retryMemeParams.customSlippage);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, retryMemeParams.maxSlippage);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.INSTANCE, retryMemeParams.slippageType);
        } else {
            Integer num = retryMemeParams.slippageType;
            int type = SlippageMode.Dynamic.getType();
            if (num == null || num.intValue() != type) {
            }
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 18, retryMemeParams.direction);
    }

    public RetryMemeParams(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, Boolean bool, @NotNull String str7, @NotNull String str8, @NotNull String str9, boolean z, String str10, boolean z2, @NotNull String str11, @NotNull String str12, String str13, String str14, Integer num, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        this.chainId = str;
        this.fromTokenContractAddress = str2;
        this.toTokenContractAddress = str3;
        this.slippage = str4;
        this.priorityFee = str5;
        this.gasPrice = str6;
        this.customPriorityFee = bool;
        this.amount = str7;
        this.referId = str8;
        this.fromTokenSymbol = str9;
        this.isEnableJito = z;
        this.mevInfo = str10;
        this.isMemeTimeOut = z2;
        this.routerModeType = str11;
        this.priorityFeeType = str12;
        this.customSlippage = str13;
        this.maxSlippage = str14;
        this.slippageType = num;
        this.direction = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0052: CONSTRUCTOR 
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r42v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r42v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r29v0 java.lang.Boolean))
  (r30v0 java.lang.String)
  (r31v0 java.lang.String)
  (r32v0 java.lang.String)
  (r33v0 boolean)
  (r34v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r42v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r35v0 boolean))
  (r36v0 java.lang.String)
  (r37v0 java.lang.String)
  (r38v0 java.lang.String)
  (r39v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0020: ARITH (r42v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002d: INVOKE 
  (wrap:int:0x0025: INVOKE 
  (wrap:com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode:0x0023: SGET  A[WRAPPED] (LINE:93) com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode.Dynamic com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode)
 VIRTUAL call: com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode.getType():int A[MD:():int (m), WRAPPED] (LINE:93))
 STATIC call: java.lang.Integer.valueOf(int):java.lang.Integer A[MD:(int):java.lang.Integer (c), WRAPPED] (LINE:93)) : (r40v0 java.lang.Integer))
  (r41v0 int)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int):void (m)] (LINE:75) call: com.okinc.business.dexlogic.main.swap.trade.bean.RetryMemeParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int):void type: THIS */
    public /* synthetic */ RetryMemeParams(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, String str9, boolean z, String str10, boolean z2, String str11, String str12, String str13, String str14, Integer num, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? null : bool, str7, str8, str9, z, str10, (i2 & 4096) != 0 ? false : z2, str11, str12, str13, str14, (i2 & 131072) != 0 ? Integer.valueOf(SlippageMode.Dynamic.getType()) : num, i);
    }
}
