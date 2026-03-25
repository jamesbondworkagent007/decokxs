package com.okinc.wallet.core.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class KeystoneAddressInfo implements Parcelable {
    private String address;
    private Integer addressType;
    private Long chainId;
    private Integer index;
    private String path;
    private String publicKey;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<KeystoneAddressInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<KeystoneAddressInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KeystoneAddressInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new KeystoneAddressInfo(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KeystoneAddressInfo[] newArray(int i) {
            return new KeystoneAddressInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KeystoneAddressInfo() {
        this((Long) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KeystoneAddressInfo copy$default(KeystoneAddressInfo keystoneAddressInfo, Long l, String str, String str2, String str3, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = keystoneAddressInfo.chainId;
        }
        if ((i & 2) != 0) {
            str = keystoneAddressInfo.publicKey;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = keystoneAddressInfo.path;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = keystoneAddressInfo.address;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            num = keystoneAddressInfo.addressType;
        }
        Integer num3 = num;
        if ((i & 32) != 0) {
            num2 = keystoneAddressInfo.index;
        }
        return keystoneAddressInfo.copy(l, str4, str5, str6, num3, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneAddressInfo copy(Long l, String str, String str2, String str3, Integer num, Integer num2) {
        return new KeystoneAddressInfo(l, str, str2, str3, num, num2);
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
        if (!(obj instanceof KeystoneAddressInfo)) {
            return false;
        }
        KeystoneAddressInfo keystoneAddressInfo = (KeystoneAddressInfo) obj;
        return Intrinsics.EZpvd(this.chainId, keystoneAddressInfo.chainId) && Intrinsics.EZpvd((Object) this.publicKey, (Object) keystoneAddressInfo.publicKey) && Intrinsics.EZpvd((Object) this.path, (Object) keystoneAddressInfo.path) && Intrinsics.EZpvd((Object) this.address, (Object) keystoneAddressInfo.address) && Intrinsics.EZpvd(this.addressType, keystoneAddressInfo.addressType) && Intrinsics.EZpvd(this.index, keystoneAddressInfo.index);
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
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getIndex() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPath() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.chainId;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.publicKey;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.path;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.address;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.addressType;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        Integer num2 = this.index;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (num2 != null ? num2.hashCode() : 0);
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
    public final void setChainId(Long l) {
        this.chainId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIndex(Integer num) {
        this.index = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPath(String str) {
        this.path = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPublicKey(String str) {
        this.publicKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KeystoneAddressInfo(chainId=" + this.chainId + ", publicKey=" + this.publicKey + ", path=" + this.path + ", address=" + this.address + ", addressType=" + this.addressType + ", index=" + this.index + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.chainId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.publicKey);
        parcel.writeString(this.path);
        parcel.writeString(this.address);
        Integer num = this.addressType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.index;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.wallet.KeystoneAddressInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KeystoneAddressInfo> serializer() {
            return KeystoneAddressInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KeystoneAddressInfo(int i, Long l, String str, String str2, String str3, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = null;
        } else {
            this.chainId = l;
        }
        if ((i & 2) == 0) {
            this.publicKey = null;
        } else {
            this.publicKey = str;
        }
        if ((i & 4) == 0) {
            this.path = null;
        } else {
            this.path = str2;
        }
        if ((i & 8) == 0) {
            this.address = null;
        } else {
            this.address = str3;
        }
        if ((i & 16) == 0) {
            this.addressType = null;
        } else {
            this.addressType = num;
        }
        if ((i & 32) == 0) {
            this.index = null;
        } else {
            this.index = num2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(KeystoneAddressInfo keystoneAddressInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || keystoneAddressInfo.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, keystoneAddressInfo.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || keystoneAddressInfo.publicKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, keystoneAddressInfo.publicKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || keystoneAddressInfo.path != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, keystoneAddressInfo.path);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || keystoneAddressInfo.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, keystoneAddressInfo.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || keystoneAddressInfo.addressType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, keystoneAddressInfo.addressType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && keystoneAddressInfo.index == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, keystoneAddressInfo.index);
    }

    public KeystoneAddressInfo(Long l, String str, String str2, String str3, Integer num, Integer num2) {
        this.chainId = l;
        this.publicKey = str;
        this.path = str2;
        this.address = str3;
        this.addressType = num;
        this.index = num2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r6v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r10v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer):void (m)] (LINE:29) call: com.okinc.wallet.core.wallet.KeystoneAddressInfo.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ KeystoneAddressInfo(Long l, String str, String str2, String str3, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2);
    }
}
