package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class UserOperation implements Parcelable {
    private String callData;
    private String callGasLimit;
    private String factory;
    private String factoryData;
    private String initCode;
    private String maxFeePerGas;
    private String maxPriorityFeePerGas;
    private String nonce;
    private String paymaster;
    private String paymasterAndData;
    private String paymasterData;
    private String paymasterPostOpGasLimit;
    private Integer paymasterType;
    private String paymasterVerificationGasLimit;
    private String preVerificationGas;
    private String sender;
    private String signature;
    private transient String uopHash;
    private String verificationGasLimit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UserOperation> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UserOperation> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserOperation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UserOperation(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserOperation[] newArray(int i) {
            return new UserOperation[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UserOperation() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, 524287, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sender;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.maxFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.maxPriorityFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.paymasterAndData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.paymaster;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.paymasterVerificationGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.paymasterPostOpGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.paymasterData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component18() {
        return this.paymasterType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.initCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.factory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.factoryData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.callData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.callGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.verificationGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.preVerificationGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserOperation copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Integer num, @NotNull String str18) {
        Intrinsics.checkNotNullParameter(str18, "");
        return new UserOperation(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, num, str18);
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
        if (!(obj instanceof UserOperation)) {
            return false;
        }
        UserOperation userOperation = (UserOperation) obj;
        return Intrinsics.EZpvd((Object) this.sender, (Object) userOperation.sender) && Intrinsics.EZpvd((Object) this.nonce, (Object) userOperation.nonce) && Intrinsics.EZpvd((Object) this.initCode, (Object) userOperation.initCode) && Intrinsics.EZpvd((Object) this.factory, (Object) userOperation.factory) && Intrinsics.EZpvd((Object) this.factoryData, (Object) userOperation.factoryData) && Intrinsics.EZpvd((Object) this.callData, (Object) userOperation.callData) && Intrinsics.EZpvd((Object) this.callGasLimit, (Object) userOperation.callGasLimit) && Intrinsics.EZpvd((Object) this.verificationGasLimit, (Object) userOperation.verificationGasLimit) && Intrinsics.EZpvd((Object) this.preVerificationGas, (Object) userOperation.preVerificationGas) && Intrinsics.EZpvd((Object) this.maxFeePerGas, (Object) userOperation.maxFeePerGas) && Intrinsics.EZpvd((Object) this.maxPriorityFeePerGas, (Object) userOperation.maxPriorityFeePerGas) && Intrinsics.EZpvd((Object) this.paymasterAndData, (Object) userOperation.paymasterAndData) && Intrinsics.EZpvd((Object) this.paymaster, (Object) userOperation.paymaster) && Intrinsics.EZpvd((Object) this.paymasterVerificationGasLimit, (Object) userOperation.paymasterVerificationGasLimit) && Intrinsics.EZpvd((Object) this.paymasterPostOpGasLimit, (Object) userOperation.paymasterPostOpGasLimit) && Intrinsics.EZpvd((Object) this.paymasterData, (Object) userOperation.paymasterData) && Intrinsics.EZpvd((Object) this.signature, (Object) userOperation.signature) && Intrinsics.EZpvd(this.paymasterType, userOperation.paymasterType) && Intrinsics.EZpvd((Object) this.uopHash, (Object) userOperation.uopHash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallData() {
        return this.callData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallGasLimit() {
        return this.callGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFactory() {
        return this.factory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFactoryData() {
        return this.factoryData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitCode() {
        return this.initCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxFeePerGas() {
        return this.maxFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPriorityFeePerGas() {
        return this.maxPriorityFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymaster() {
        return this.paymaster;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymasterAndData() {
        return this.paymasterAndData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymasterData() {
        return this.paymasterData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymasterPostOpGasLimit() {
        return this.paymasterPostOpGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPaymasterType() {
        return this.paymasterType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymasterVerificationGasLimit() {
        return this.paymasterVerificationGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreVerificationGas() {
        return this.preVerificationGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSender() {
        return this.sender;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUopHash() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVerificationGasLimit() {
        return this.verificationGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.sender;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.nonce;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.initCode;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.factory;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.factoryData;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.callData;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.callGasLimit;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.verificationGasLimit;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.preVerificationGas;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.maxFeePerGas;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.maxPriorityFeePerGas;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.paymasterAndData;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.paymaster;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.paymasterVerificationGasLimit;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.paymasterPostOpGasLimit;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.paymasterData;
        int iHashCode16 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.signature;
        int iHashCode17 = str17 == null ? 0 : str17.hashCode();
        Integer num = this.paymasterType;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.uopHash.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallData(String str) {
        this.callData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallGasLimit(String str) {
        this.callGasLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFactory(String str) {
        this.factory = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFactoryData(String str) {
        this.factoryData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInitCode(String str) {
        this.initCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxFeePerGas(String str) {
        this.maxFeePerGas = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxPriorityFeePerGas(String str) {
        this.maxPriorityFeePerGas = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNonce(String str) {
        this.nonce = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymaster(String str) {
        this.paymaster = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymasterAndData(String str) {
        this.paymasterAndData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymasterData(String str) {
        this.paymasterData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymasterPostOpGasLimit(String str) {
        this.paymasterPostOpGasLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymasterType(Integer num) {
        this.paymasterType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymasterVerificationGasLimit(String str) {
        this.paymasterVerificationGasLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPreVerificationGas(String str) {
        this.preVerificationGas = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSender(String str) {
        this.sender = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignature(String str) {
        this.signature = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUopHash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uopHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVerificationGasLimit(String str) {
        this.verificationGasLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserOperation(sender=" + this.sender + ", nonce=" + this.nonce + ", initCode=" + this.initCode + ", factory=" + this.factory + ", factoryData=" + this.factoryData + ", callData=" + this.callData + ", callGasLimit=" + this.callGasLimit + ", verificationGasLimit=" + this.verificationGasLimit + ", preVerificationGas=" + this.preVerificationGas + ", maxFeePerGas=" + this.maxFeePerGas + ", maxPriorityFeePerGas=" + this.maxPriorityFeePerGas + ", paymasterAndData=" + this.paymasterAndData + ", paymaster=" + this.paymaster + ", paymasterVerificationGasLimit=" + this.paymasterVerificationGasLimit + ", paymasterPostOpGasLimit=" + this.paymasterPostOpGasLimit + ", paymasterData=" + this.paymasterData + ", signature=" + this.signature + ", paymasterType=" + this.paymasterType + ", uopHash=" + this.uopHash + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.sender);
        parcel.writeString(this.nonce);
        parcel.writeString(this.initCode);
        parcel.writeString(this.factory);
        parcel.writeString(this.factoryData);
        parcel.writeString(this.callData);
        parcel.writeString(this.callGasLimit);
        parcel.writeString(this.verificationGasLimit);
        parcel.writeString(this.preVerificationGas);
        parcel.writeString(this.maxFeePerGas);
        parcel.writeString(this.maxPriorityFeePerGas);
        parcel.writeString(this.paymasterAndData);
        parcel.writeString(this.paymaster);
        parcel.writeString(this.paymasterVerificationGasLimit);
        parcel.writeString(this.paymasterPostOpGasLimit);
        parcel.writeString(this.paymasterData);
        parcel.writeString(this.signature);
        Integer num = this.paymasterType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.uopHash);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.UserOperation.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserOperation> serializer() {
            return UserOperation$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserOperation(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Integer num, String str18, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.sender = null;
        } else {
            this.sender = str;
        }
        if ((i & 2) == 0) {
            this.nonce = null;
        } else {
            this.nonce = str2;
        }
        if ((i & 4) == 0) {
            this.initCode = null;
        } else {
            this.initCode = str3;
        }
        if ((i & 8) == 0) {
            this.factory = null;
        } else {
            this.factory = str4;
        }
        if ((i & 16) == 0) {
            this.factoryData = null;
        } else {
            this.factoryData = str5;
        }
        if ((i & 32) == 0) {
            this.callData = null;
        } else {
            this.callData = str6;
        }
        if ((i & 64) == 0) {
            this.callGasLimit = null;
        } else {
            this.callGasLimit = str7;
        }
        if ((i & 128) == 0) {
            this.verificationGasLimit = null;
        } else {
            this.verificationGasLimit = str8;
        }
        if ((i & 256) == 0) {
            this.preVerificationGas = null;
        } else {
            this.preVerificationGas = str9;
        }
        if ((i & 512) == 0) {
            this.maxFeePerGas = null;
        } else {
            this.maxFeePerGas = str10;
        }
        if ((i & 1024) == 0) {
            this.maxPriorityFeePerGas = null;
        } else {
            this.maxPriorityFeePerGas = str11;
        }
        if ((i & 2048) == 0) {
            this.paymasterAndData = null;
        } else {
            this.paymasterAndData = str12;
        }
        if ((i & 4096) == 0) {
            this.paymaster = null;
        } else {
            this.paymaster = str13;
        }
        if ((i & 8192) == 0) {
            this.paymasterVerificationGasLimit = null;
        } else {
            this.paymasterVerificationGasLimit = str14;
        }
        if ((i & 16384) == 0) {
            this.paymasterPostOpGasLimit = null;
        } else {
            this.paymasterPostOpGasLimit = str15;
        }
        if ((32768 & i) == 0) {
            this.paymasterData = null;
        } else {
            this.paymasterData = str16;
        }
        if ((65536 & i) == 0) {
            this.signature = null;
        } else {
            this.signature = str17;
        }
        if ((131072 & i) == 0) {
            this.paymasterType = null;
        } else {
            this.paymasterType = num;
        }
        this.uopHash = (i & 262144) == 0 ? "" : str18;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(UserOperation userOperation, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || userOperation.sender != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, userOperation.sender);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || userOperation.nonce != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, userOperation.nonce);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || userOperation.initCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, userOperation.initCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || userOperation.factory != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, userOperation.factory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || userOperation.factoryData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, userOperation.factoryData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || userOperation.callData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, userOperation.callData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || userOperation.callGasLimit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, userOperation.callGasLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || userOperation.verificationGasLimit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, userOperation.verificationGasLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || userOperation.preVerificationGas != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, userOperation.preVerificationGas);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || userOperation.maxFeePerGas != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, userOperation.maxFeePerGas);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || userOperation.maxPriorityFeePerGas != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, userOperation.maxPriorityFeePerGas);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || userOperation.paymasterAndData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, userOperation.paymasterAndData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || userOperation.paymaster != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, userOperation.paymaster);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || userOperation.paymasterVerificationGasLimit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, userOperation.paymasterVerificationGasLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || userOperation.paymasterPostOpGasLimit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, userOperation.paymasterPostOpGasLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || userOperation.paymasterData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, userOperation.paymasterData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || userOperation.signature != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, userOperation.signature);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || userOperation.paymasterType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.INSTANCE, userOperation.paymasterType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) && Intrinsics.EZpvd((Object) userOperation.uopHash, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 18, userOperation.uopHash);
    }

    public UserOperation(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Integer num, @NotNull String str18) {
        Intrinsics.checkNotNullParameter(str18, "");
        this.sender = str;
        this.nonce = str2;
        this.initCode = str3;
        this.factory = str4;
        this.factoryData = str5;
        this.callData = str6;
        this.callGasLimit = str7;
        this.verificationGasLimit = str8;
        this.preVerificationGas = str9;
        this.maxFeePerGas = str10;
        this.maxPriorityFeePerGas = str11;
        this.paymasterAndData = str12;
        this.paymaster = str13;
        this.paymasterVerificationGasLimit = str14;
        this.paymasterPostOpGasLimit = str15;
        this.paymasterData = str16;
        this.signature = str17;
        this.paymasterType = num;
        this.uopHash = str18;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00cf: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r40v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r40v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r40v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r40v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r40v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r40v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r40v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r40v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r40v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r40v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r40v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r40v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r40v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r40v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r40v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r40v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r40v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0093: ARITH (r40v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r38v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r40v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void (m)] (LINE:1383) call: com.okinc.business.defi.biz.net.bean.UserOperation.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ UserOperation(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Integer num, String str18, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17, (i & 131072) != 0 ? null : num, (i & 262144) != 0 ? "" : str18);
    }
}
