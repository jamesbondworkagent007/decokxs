package com.okinc.business.defi.wallet.mine.data;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class DerviationEVM implements Parcelable {
    private String address;
    private Integer addressType;
    private String currencyAmount;
    private String derivePath;
    private String tag;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DerviationEVM> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<DerviationEVM> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DerviationEVM createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DerviationEVM(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DerviationEVM[] newArray(int i) {
            return new DerviationEVM[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DerviationEVM() {
        this((String) null, (String) null, (Integer) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DerviationEVM copy$default(DerviationEVM derviationEVM, String str, String str2, Integer num, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = derviationEVM.tag;
        }
        if ((i & 2) != 0) {
            str2 = derviationEVM.derivePath;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            num = derviationEVM.addressType;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str3 = derviationEVM.address;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = derviationEVM.currencyAmount;
        }
        return derviationEVM.copy(str, str5, num2, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.derivePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DerviationEVM copy(String str, String str2, Integer num, String str3, String str4) {
        return new DerviationEVM(str, str2, num, str3, str4);
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
        if (!(obj instanceof DerviationEVM)) {
            return false;
        }
        DerviationEVM derviationEVM = (DerviationEVM) obj;
        return Intrinsics.EZpvd((Object) this.tag, (Object) derviationEVM.tag) && Intrinsics.EZpvd((Object) this.derivePath, (Object) derviationEVM.derivePath) && Intrinsics.EZpvd(this.addressType, derviationEVM.addressType) && Intrinsics.EZpvd((Object) this.address, (Object) derviationEVM.address) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) derviationEVM.currencyAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDerivePath() {
        return this.derivePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.tag;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.derivePath;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.addressType;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str3 = this.address;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.currencyAmount;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressType(Integer num) {
        this.addressType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyAmount(String str) {
        this.currencyAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDerivePath(String str) {
        this.derivePath = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTag(String str) {
        this.tag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DerviationEVM(tag=" + this.tag + ", derivePath=" + this.derivePath + ", addressType=" + this.addressType + ", address=" + this.address + ", currencyAmount=" + this.currencyAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tag);
        parcel.writeString(this.derivePath);
        Integer num = this.addressType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.address);
        parcel.writeString(this.currencyAmount);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.data.DerviationEVM.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DerviationEVM> serializer() {
            return DerviationEVM$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DerviationEVM(int i, String str, String str2, Integer num, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tag = null;
        } else {
            this.tag = str;
        }
        if ((i & 2) == 0) {
            this.derivePath = null;
        } else {
            this.derivePath = str2;
        }
        if ((i & 4) == 0) {
            this.addressType = null;
        } else {
            this.addressType = num;
        }
        if ((i & 8) == 0) {
            this.address = null;
        } else {
            this.address = str3;
        }
        if ((i & 16) == 0) {
            this.currencyAmount = null;
        } else {
            this.currencyAmount = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(DerviationEVM derviationEVM, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || derviationEVM.tag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, derviationEVM.tag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || derviationEVM.derivePath != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, derviationEVM.derivePath);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || derviationEVM.addressType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, derviationEVM.addressType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || derviationEVM.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, derviationEVM.address);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && derviationEVM.currencyAmount == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, derviationEVM.currencyAmount);
    }

    public DerviationEVM(String str, String str2, Integer num, String str3, String str4) {
        this.tag = str;
        this.derivePath = str2;
        this.addressType = num;
        this.address = str3;
        this.currencyAmount = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r7v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.business.defi.wallet.mine.data.DerviationEVM.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DerviationEVM(String str, String str2, Integer num, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
