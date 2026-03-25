package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletGasLimitRes implements Parcelable {
    private String gasLimit;
    private String gas_limit;
    private String invokeNotificationFee;
    private String l1DataGasPrice;
    private String l1DataGasUsed;
    private String l1GasPrice;
    private String l1GasUsed;
    private String l2GasPrice;
    private String l2GasUsed;
    private String maxGasLimit;
    private String minGasLimit;
    private String originGasLimit;
    private String overallFee;
    private Boolean queryGasLimitErrorUseDefault;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<WalletGasLimitRes> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<WalletGasLimitRes> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletGasLimitRes createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new WalletGasLimitRes(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletGasLimitRes[] newArray(int i) {
            return new WalletGasLimitRes[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletGasLimitRes() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.gas_limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.l1DataGasUsed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.l2GasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.l2GasUsed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.overallFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component14() {
        return this.queryGasLimitErrorUseDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.originGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.minGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.maxGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.invokeNotificationFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.l1GasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.l1GasUsed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.l1DataGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletGasLimitRes copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool) {
        return new WalletGasLimitRes(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, bool);
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
        if (!(obj instanceof WalletGasLimitRes)) {
            return false;
        }
        WalletGasLimitRes walletGasLimitRes = (WalletGasLimitRes) obj;
        return Intrinsics.EZpvd((Object) this.gas_limit, (Object) walletGasLimitRes.gas_limit) && Intrinsics.EZpvd((Object) this.gasLimit, (Object) walletGasLimitRes.gasLimit) && Intrinsics.EZpvd((Object) this.originGasLimit, (Object) walletGasLimitRes.originGasLimit) && Intrinsics.EZpvd((Object) this.minGasLimit, (Object) walletGasLimitRes.minGasLimit) && Intrinsics.EZpvd((Object) this.maxGasLimit, (Object) walletGasLimitRes.maxGasLimit) && Intrinsics.EZpvd((Object) this.invokeNotificationFee, (Object) walletGasLimitRes.invokeNotificationFee) && Intrinsics.EZpvd((Object) this.l1GasPrice, (Object) walletGasLimitRes.l1GasPrice) && Intrinsics.EZpvd((Object) this.l1GasUsed, (Object) walletGasLimitRes.l1GasUsed) && Intrinsics.EZpvd((Object) this.l1DataGasPrice, (Object) walletGasLimitRes.l1DataGasPrice) && Intrinsics.EZpvd((Object) this.l1DataGasUsed, (Object) walletGasLimitRes.l1DataGasUsed) && Intrinsics.EZpvd((Object) this.l2GasPrice, (Object) walletGasLimitRes.l2GasPrice) && Intrinsics.EZpvd((Object) this.l2GasUsed, (Object) walletGasLimitRes.l2GasUsed) && Intrinsics.EZpvd((Object) this.overallFee, (Object) walletGasLimitRes.overallFee) && Intrinsics.EZpvd(this.queryGasLimitErrorUseDefault, walletGasLimitRes.queryGasLimitErrorUseDefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasLimit() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGas_limit() {
        return this.gas_limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvokeNotificationFee() {
        return this.invokeNotificationFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getL1DataGasPrice() {
        return this.l1DataGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getL1DataGasUsed() {
        return this.l1DataGasUsed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getL1GasPrice() {
        return this.l1GasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getL1GasUsed() {
        return this.l1GasUsed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getL2GasPrice() {
        return this.l2GasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getL2GasUsed() {
        return this.l2GasUsed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxGasLimit() {
        return this.maxGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinGasLimit() {
        return this.minGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginGasLimit() {
        return this.originGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOverallFee() {
        return this.overallFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getQueryGasLimitErrorUseDefault() {
        return this.queryGasLimitErrorUseDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.gas_limit;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.gasLimit;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.originGasLimit;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.minGasLimit;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.maxGasLimit;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.invokeNotificationFee;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.l1GasPrice;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.l1GasUsed;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.l1DataGasPrice;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.l1DataGasUsed;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.l2GasPrice;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.l2GasUsed;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.overallFee;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        Boolean bool = this.queryGasLimitErrorUseDefault;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasLimit(String str) {
        this.gasLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGas_limit(String str) {
        this.gas_limit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvokeNotificationFee(String str) {
        this.invokeNotificationFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setL1DataGasPrice(String str) {
        this.l1DataGasPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setL1DataGasUsed(String str) {
        this.l1DataGasUsed = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setL1GasPrice(String str) {
        this.l1GasPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setL1GasUsed(String str) {
        this.l1GasUsed = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setL2GasPrice(String str) {
        this.l2GasPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setL2GasUsed(String str) {
        this.l2GasUsed = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxGasLimit(String str) {
        this.maxGasLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinGasLimit(String str) {
        this.minGasLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginGasLimit(String str) {
        this.originGasLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOverallFee(String str) {
        this.overallFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQueryGasLimitErrorUseDefault(Boolean bool) {
        this.queryGasLimitErrorUseDefault = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletGasLimitRes(gas_limit=" + this.gas_limit + ", gasLimit=" + this.gasLimit + ", originGasLimit=" + this.originGasLimit + ", minGasLimit=" + this.minGasLimit + ", maxGasLimit=" + this.maxGasLimit + ", invokeNotificationFee=" + this.invokeNotificationFee + ", l1GasPrice=" + this.l1GasPrice + ", l1GasUsed=" + this.l1GasUsed + ", l1DataGasPrice=" + this.l1DataGasPrice + ", l1DataGasUsed=" + this.l1DataGasUsed + ", l2GasPrice=" + this.l2GasPrice + ", l2GasUsed=" + this.l2GasUsed + ", overallFee=" + this.overallFee + ", queryGasLimitErrorUseDefault=" + this.queryGasLimitErrorUseDefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [int] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.gas_limit);
        parcel.writeString(this.gasLimit);
        parcel.writeString(this.originGasLimit);
        parcel.writeString(this.minGasLimit);
        parcel.writeString(this.maxGasLimit);
        parcel.writeString(this.invokeNotificationFee);
        parcel.writeString(this.l1GasPrice);
        parcel.writeString(this.l1GasUsed);
        parcel.writeString(this.l1DataGasPrice);
        parcel.writeString(this.l1DataGasUsed);
        parcel.writeString(this.l2GasPrice);
        parcel.writeString(this.l2GasUsed);
        parcel.writeString(this.overallFee);
        Boolean bool = this.queryGasLimitErrorUseDefault;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.WalletGasLimitRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletGasLimitRes> serializer() {
            return WalletGasLimitRes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletGasLimitRes(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.gas_limit = "";
        } else {
            this.gas_limit = str;
        }
        if ((i & 2) == 0) {
            this.gasLimit = "";
        } else {
            this.gasLimit = str2;
        }
        if ((i & 4) == 0) {
            this.originGasLimit = null;
        } else {
            this.originGasLimit = str3;
        }
        if ((i & 8) == 0) {
            this.minGasLimit = "";
        } else {
            this.minGasLimit = str4;
        }
        if ((i & 16) == 0) {
            this.maxGasLimit = "";
        } else {
            this.maxGasLimit = str5;
        }
        if ((i & 32) == 0) {
            this.invokeNotificationFee = null;
        } else {
            this.invokeNotificationFee = str6;
        }
        if ((i & 64) == 0) {
            this.l1GasPrice = null;
        } else {
            this.l1GasPrice = str7;
        }
        if ((i & 128) == 0) {
            this.l1GasUsed = null;
        } else {
            this.l1GasUsed = str8;
        }
        if ((i & 256) == 0) {
            this.l1DataGasPrice = null;
        } else {
            this.l1DataGasPrice = str9;
        }
        if ((i & 512) == 0) {
            this.l1DataGasUsed = null;
        } else {
            this.l1DataGasUsed = str10;
        }
        if ((i & 1024) == 0) {
            this.l2GasPrice = null;
        } else {
            this.l2GasPrice = str11;
        }
        if ((i & 2048) == 0) {
            this.l2GasUsed = null;
        } else {
            this.l2GasUsed = str12;
        }
        if ((i & 4096) == 0) {
            this.overallFee = null;
        } else {
            this.overallFee = str13;
        }
        if ((i & 8192) == 0) {
            this.queryGasLimitErrorUseDefault = null;
        } else {
            this.queryGasLimitErrorUseDefault = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(WalletGasLimitRes walletGasLimitRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) walletGasLimitRes.gas_limit, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, walletGasLimitRes.gas_limit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) walletGasLimitRes.gasLimit, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, walletGasLimitRes.gasLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || walletGasLimitRes.originGasLimit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, walletGasLimitRes.originGasLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) walletGasLimitRes.minGasLimit, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, walletGasLimitRes.minGasLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) walletGasLimitRes.maxGasLimit, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, walletGasLimitRes.maxGasLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || walletGasLimitRes.invokeNotificationFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, walletGasLimitRes.invokeNotificationFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || walletGasLimitRes.l1GasPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, walletGasLimitRes.l1GasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || walletGasLimitRes.l1GasUsed != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, walletGasLimitRes.l1GasUsed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || walletGasLimitRes.l1DataGasPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, walletGasLimitRes.l1DataGasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || walletGasLimitRes.l1DataGasUsed != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, walletGasLimitRes.l1DataGasUsed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || walletGasLimitRes.l2GasPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, walletGasLimitRes.l2GasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || walletGasLimitRes.l2GasUsed != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, walletGasLimitRes.l2GasUsed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || walletGasLimitRes.overallFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, walletGasLimitRes.overallFee);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && walletGasLimitRes.queryGasLimitErrorUseDefault == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.INSTANCE, walletGasLimitRes.queryGasLimitErrorUseDefault);
    }

    public WalletGasLimitRes(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool) {
        this.gas_limit = str;
        this.gasLimit = str2;
        this.originGasLimit = str3;
        this.minGasLimit = str4;
        this.maxGasLimit = str5;
        this.invokeNotificationFee = str6;
        this.l1GasPrice = str7;
        this.l1GasUsed = str8;
        this.l1DataGasPrice = str9;
        this.l1DataGasUsed = str10;
        this.l2GasPrice = str11;
        this.l2GasUsed = str12;
        this.overallFee = str13;
        this.queryGasLimitErrorUseDefault = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0091: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r30v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x006c: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.Boolean) : (null java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:114) call: com.okinc.business.defi.biz.net.bean.WalletGasLimitRes.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ WalletGasLimitRes(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) == 0 ? bool : null);
    }
}
