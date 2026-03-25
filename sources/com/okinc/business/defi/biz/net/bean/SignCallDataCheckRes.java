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
public final class SignCallDataCheckRes implements Parcelable {
    private final SignCallDataCheckAdditionBean addtion;
    private final String contractAddress;
    private final String contractIcon;
    private final String contractName;
    private final String msg;
    private final Boolean result;
    private final String risk;
    private final String risk_msg;
    private final String tokenAddress;
    private final String tokenIcon;
    private final String tokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SignCallDataCheckRes> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SignCallDataCheckRes> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignCallDataCheckRes createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SignCallDataCheckRes(boolValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? SignCallDataCheckAdditionBean.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignCallDataCheckRes[] newArray(int i) {
            return new SignCallDataCheckRes[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignCallDataCheckRes() {
        this((Boolean) null, (String) null, (String) null, (String) null, (SignCallDataCheckAdditionBean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.result;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.tokenIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.risk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.risk_msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignCallDataCheckAdditionBean component5() {
        return this.addtion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.contractName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.contractIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignCallDataCheckRes copy(Boolean bool, String str, String str2, String str3, SignCallDataCheckAdditionBean signCallDataCheckAdditionBean, String str4, String str5, String str6, String str7, String str8, String str9) {
        return new SignCallDataCheckRes(bool, str, str2, str3, signCallDataCheckAdditionBean, str4, str5, str6, str7, str8, str9);
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
        if (!(obj instanceof SignCallDataCheckRes)) {
            return false;
        }
        SignCallDataCheckRes signCallDataCheckRes = (SignCallDataCheckRes) obj;
        return Intrinsics.EZpvd(this.result, signCallDataCheckRes.result) && Intrinsics.EZpvd((Object) this.msg, (Object) signCallDataCheckRes.msg) && Intrinsics.EZpvd((Object) this.risk, (Object) signCallDataCheckRes.risk) && Intrinsics.EZpvd((Object) this.risk_msg, (Object) signCallDataCheckRes.risk_msg) && Intrinsics.EZpvd(this.addtion, signCallDataCheckRes.addtion) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) signCallDataCheckRes.contractAddress) && Intrinsics.EZpvd((Object) this.contractName, (Object) signCallDataCheckRes.contractName) && Intrinsics.EZpvd((Object) this.contractIcon, (Object) signCallDataCheckRes.contractIcon) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) signCallDataCheckRes.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) signCallDataCheckRes.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenIcon, (Object) signCallDataCheckRes.tokenIcon);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignCallDataCheckAdditionBean getAddtion() {
        return this.addtion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractIcon() {
        return this.contractIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractName() {
        return this.contractName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getResult() {
        return this.result;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRisk() {
        return this.risk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRisk_msg() {
        return this.risk_msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenIcon() {
        return this.tokenIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.result;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        String str = this.msg;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.risk;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.risk_msg;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        SignCallDataCheckAdditionBean signCallDataCheckAdditionBean = this.addtion;
        int iHashCode5 = signCallDataCheckAdditionBean == null ? 0 : signCallDataCheckAdditionBean.hashCode();
        String str4 = this.contractAddress;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.contractName;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.contractIcon;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.tokenAddress;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.tokenSymbol;
        int iHashCode10 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.tokenIcon;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignCallDataCheckRes(result=" + this.result + ", msg=" + this.msg + ", risk=" + this.risk + ", risk_msg=" + this.risk_msg + ", addtion=" + this.addtion + ", contractAddress=" + this.contractAddress + ", contractName=" + this.contractName + ", contractIcon=" + this.contractIcon + ", tokenAddress=" + this.tokenAddress + ", tokenSymbol=" + this.tokenSymbol + ", tokenIcon=" + this.tokenIcon + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Boolean bool = this.result;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.msg);
        parcel.writeString(this.risk);
        parcel.writeString(this.risk_msg);
        SignCallDataCheckAdditionBean signCallDataCheckAdditionBean = this.addtion;
        if (signCallDataCheckAdditionBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            signCallDataCheckAdditionBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.contractAddress);
        parcel.writeString(this.contractName);
        parcel.writeString(this.contractIcon);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.tokenIcon);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.SignCallDataCheckRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignCallDataCheckRes> serializer() {
            return SignCallDataCheckRes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignCallDataCheckRes(int i, Boolean bool, String str, String str2, String str3, SignCallDataCheckAdditionBean signCallDataCheckAdditionBean, String str4, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.result = null;
        } else {
            this.result = bool;
        }
        if ((i & 2) == 0) {
            this.msg = null;
        } else {
            this.msg = str;
        }
        if ((i & 4) == 0) {
            this.risk = null;
        } else {
            this.risk = str2;
        }
        if ((i & 8) == 0) {
            this.risk_msg = null;
        } else {
            this.risk_msg = str3;
        }
        if ((i & 16) == 0) {
            this.addtion = null;
        } else {
            this.addtion = signCallDataCheckAdditionBean;
        }
        if ((i & 32) == 0) {
            this.contractAddress = null;
        } else {
            this.contractAddress = str4;
        }
        if ((i & 64) == 0) {
            this.contractName = null;
        } else {
            this.contractName = str5;
        }
        if ((i & 128) == 0) {
            this.contractIcon = null;
        } else {
            this.contractIcon = str6;
        }
        if ((i & 256) == 0) {
            this.tokenAddress = null;
        } else {
            this.tokenAddress = str7;
        }
        if ((i & 512) == 0) {
            this.tokenSymbol = null;
        } else {
            this.tokenSymbol = str8;
        }
        if ((i & 1024) == 0) {
            this.tokenIcon = null;
        } else {
            this.tokenIcon = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SignCallDataCheckRes signCallDataCheckRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || signCallDataCheckRes.result != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, signCallDataCheckRes.result);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || signCallDataCheckRes.msg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, signCallDataCheckRes.msg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || signCallDataCheckRes.risk != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, signCallDataCheckRes.risk);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || signCallDataCheckRes.risk_msg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, signCallDataCheckRes.risk_msg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || signCallDataCheckRes.addtion != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, SignCallDataCheckAdditionBean$$serializer.INSTANCE, signCallDataCheckRes.addtion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || signCallDataCheckRes.contractAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, signCallDataCheckRes.contractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || signCallDataCheckRes.contractName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, signCallDataCheckRes.contractName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || signCallDataCheckRes.contractIcon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, signCallDataCheckRes.contractIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || signCallDataCheckRes.tokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, signCallDataCheckRes.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || signCallDataCheckRes.tokenSymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, signCallDataCheckRes.tokenSymbol);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && signCallDataCheckRes.tokenIcon == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, signCallDataCheckRes.tokenIcon);
    }

    public SignCallDataCheckRes(Boolean bool, String str, String str2, String str3, SignCallDataCheckAdditionBean signCallDataCheckAdditionBean, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.result = bool;
        this.msg = str;
        this.risk = str2;
        this.risk_msg = str3;
        this.addtion = signCallDataCheckAdditionBean;
        this.contractAddress = str4;
        this.contractName = str5;
        this.contractIcon = str6;
        this.tokenAddress = str7;
        this.tokenSymbol = str8;
        this.tokenIcon = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006c: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r13v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:com.okinc.business.defi.biz.net.bean.SignCallDataCheckAdditionBean:?: TERNARY null = ((wrap:int:0x0020: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.SignCallDataCheckAdditionBean) : (r17v0 com.okinc.business.defi.biz.net.bean.SignCallDataCheckAdditionBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0050: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.biz.net.bean.SignCallDataCheckAdditionBean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:530) call: com.okinc.business.defi.biz.net.bean.SignCallDataCheckRes.<init>(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.biz.net.bean.SignCallDataCheckAdditionBean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SignCallDataCheckRes(Boolean bool, String str, String str2, String str3, SignCallDataCheckAdditionBean signCallDataCheckAdditionBean, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : signCallDataCheckAdditionBean, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) == 0 ? str9 : null);
    }
}
