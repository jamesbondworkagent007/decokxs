package com.okinc.wallet.core.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class KeystonePubKeyInfo implements Parcelable {
    public static final int $stable = 0;
    private final String basePath;
    private final Long chainId;
    private final String derivePath;
    private final String deriveType;
    private final String extendedPublicKey;
    private final String index;
    private final String publicKey;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<KeystonePubKeyInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<KeystonePubKeyInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KeystonePubKeyInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new KeystonePubKeyInfo(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KeystonePubKeyInfo[] newArray(int i) {
            return new KeystonePubKeyInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KeystonePubKeyInfo() {
        this((Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KeystonePubKeyInfo copy$default(KeystonePubKeyInfo keystonePubKeyInfo, Long l, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            l = keystonePubKeyInfo.chainId;
        }
        if ((i & 2) != 0) {
            str = keystonePubKeyInfo.publicKey;
        }
        String str7 = str;
        if ((i & 4) != 0) {
            str2 = keystonePubKeyInfo.extendedPublicKey;
        }
        String str8 = str2;
        if ((i & 8) != 0) {
            str3 = keystonePubKeyInfo.basePath;
        }
        String str9 = str3;
        if ((i & 16) != 0) {
            str4 = keystonePubKeyInfo.derivePath;
        }
        String str10 = str4;
        if ((i & 32) != 0) {
            str5 = keystonePubKeyInfo.deriveType;
        }
        String str11 = str5;
        if ((i & 64) != 0) {
            str6 = keystonePubKeyInfo.index;
        }
        return keystonePubKeyInfo.copy(l, str7, str8, str9, str10, str11, str6);
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
        return this.extendedPublicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.basePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.derivePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.deriveType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystonePubKeyInfo copy(Long l, String str, String str2, String str3, String str4, String str5, String str6) {
        return new KeystonePubKeyInfo(l, str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof KeystonePubKeyInfo)) {
            return false;
        }
        KeystonePubKeyInfo keystonePubKeyInfo = (KeystonePubKeyInfo) obj;
        return Intrinsics.EZpvd(this.chainId, keystonePubKeyInfo.chainId) && Intrinsics.EZpvd((Object) this.publicKey, (Object) keystonePubKeyInfo.publicKey) && Intrinsics.EZpvd((Object) this.extendedPublicKey, (Object) keystonePubKeyInfo.extendedPublicKey) && Intrinsics.EZpvd((Object) this.basePath, (Object) keystonePubKeyInfo.basePath) && Intrinsics.EZpvd((Object) this.derivePath, (Object) keystonePubKeyInfo.derivePath) && Intrinsics.EZpvd((Object) this.deriveType, (Object) keystonePubKeyInfo.deriveType) && Intrinsics.EZpvd((Object) this.index, (Object) keystonePubKeyInfo.index);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBasePath() {
        return this.basePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDerivePath() {
        return this.derivePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeriveType() {
        return this.deriveType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtendedPublicKey() {
        return this.extendedPublicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIndex() {
        return this.index;
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
        String str2 = this.extendedPublicKey;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.basePath;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.derivePath;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.deriveType;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.index;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KeystonePubKeyInfo(chainId=" + this.chainId + ", publicKey=" + this.publicKey + ", extendedPublicKey=" + this.extendedPublicKey + ", basePath=" + this.basePath + ", derivePath=" + this.derivePath + ", deriveType=" + this.deriveType + ", index=" + this.index + ")";
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
        parcel.writeString(this.extendedPublicKey);
        parcel.writeString(this.basePath);
        parcel.writeString(this.derivePath);
        parcel.writeString(this.deriveType);
        parcel.writeString(this.index);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.wallet.KeystonePubKeyInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KeystonePubKeyInfo> serializer() {
            return KeystonePubKeyInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KeystonePubKeyInfo(int i, Long l, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.extendedPublicKey = null;
        } else {
            this.extendedPublicKey = str2;
        }
        if ((i & 8) == 0) {
            this.basePath = null;
        } else {
            this.basePath = str3;
        }
        if ((i & 16) == 0) {
            this.derivePath = null;
        } else {
            this.derivePath = str4;
        }
        if ((i & 32) == 0) {
            this.deriveType = null;
        } else {
            this.deriveType = str5;
        }
        if ((i & 64) == 0) {
            this.index = null;
        } else {
            this.index = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(KeystonePubKeyInfo keystonePubKeyInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || keystonePubKeyInfo.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, keystonePubKeyInfo.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || keystonePubKeyInfo.publicKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, keystonePubKeyInfo.publicKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || keystonePubKeyInfo.extendedPublicKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, keystonePubKeyInfo.extendedPublicKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || keystonePubKeyInfo.basePath != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, keystonePubKeyInfo.basePath);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || keystonePubKeyInfo.derivePath != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, keystonePubKeyInfo.derivePath);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || keystonePubKeyInfo.deriveType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, keystonePubKeyInfo.deriveType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && keystonePubKeyInfo.index == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, keystonePubKeyInfo.index);
    }

    public KeystonePubKeyInfo(Long l, String str, String str2, String str3, String str4, String str5, String str6) {
        this.chainId = l;
        this.publicKey = str;
        this.extendedPublicKey = str2;
        this.basePath = str3;
        this.derivePath = str4;
        this.deriveType = str5;
        this.index = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r7v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:16) call: com.okinc.wallet.core.wallet.KeystonePubKeyInfo.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ KeystonePubKeyInfo(Long l, String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }
}
