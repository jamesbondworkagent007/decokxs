package com.okinc.wallet.core.sign.evm;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class EVMAuthorization implements Parcelable {
    public static final int $stable = 0;
    private final String address;
    private final String chainId;
    private final String nonce;
    private final String r;
    private final String s;
    private final String yParity;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EVMAuthorization> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EVMAuthorization> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EVMAuthorization createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EVMAuthorization(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EVMAuthorization[] newArray(int i) {
            return new EVMAuthorization[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EVMAuthorization copy$default(EVMAuthorization eVMAuthorization, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eVMAuthorization.nonce;
        }
        if ((i & 2) != 0) {
            str2 = eVMAuthorization.address;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = eVMAuthorization.chainId;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = eVMAuthorization.yParity;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = eVMAuthorization.r;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = eVMAuthorization.s;
        }
        return eVMAuthorization.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.yParity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EVMAuthorization copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new EVMAuthorization(str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof EVMAuthorization)) {
            return false;
        }
        EVMAuthorization eVMAuthorization = (EVMAuthorization) obj;
        return Intrinsics.EZpvd((Object) this.nonce, (Object) eVMAuthorization.nonce) && Intrinsics.EZpvd((Object) this.address, (Object) eVMAuthorization.address) && Intrinsics.EZpvd((Object) this.chainId, (Object) eVMAuthorization.chainId) && Intrinsics.EZpvd((Object) this.yParity, (Object) eVMAuthorization.yParity) && Intrinsics.EZpvd((Object) this.r, (Object) eVMAuthorization.r) && Intrinsics.EZpvd((Object) this.s, (Object) eVMAuthorization.s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getR() {
        return this.r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getS() {
        return this.s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getYParity() {
        return this.yParity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.nonce;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.address;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.chainId;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.yParity;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.r;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.s;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EVMAuthorization(nonce=" + this.nonce + ", address=" + this.address + ", chainId=" + this.chainId + ", yParity=" + this.yParity + ", r=" + this.r + ", s=" + this.s + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.nonce);
        parcel.writeString(this.address);
        parcel.writeString(this.chainId);
        parcel.writeString(this.yParity);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.evm.EVMAuthorization.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EVMAuthorization> serializer() {
            return EVMAuthorization$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EVMAuthorization(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, EVMAuthorization$$serializer.INSTANCE.getDescriptor());
        }
        this.nonce = str;
        this.address = str2;
        this.chainId = str3;
        if ((i & 8) == 0) {
            this.yParity = null;
        } else {
            this.yParity = str4;
        }
        if ((i & 16) == 0) {
            this.r = null;
        } else {
            this.r = str5;
        }
        if ((i & 32) == 0) {
            this.s = null;
        } else {
            this.s = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(EVMAuthorization eVMAuthorization, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, eVMAuthorization.nonce);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, eVMAuthorization.address);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, eVMAuthorization.chainId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || eVMAuthorization.yParity != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, eVMAuthorization.yParity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || eVMAuthorization.r != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, eVMAuthorization.r);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && eVMAuthorization.s == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, eVMAuthorization.s);
    }

    public EVMAuthorization(String str, String str2, String str3, String str4, String str5, String str6) {
        this.nonce = str;
        this.address = str2;
        this.chainId = str3;
        this.yParity = str4;
        this.r = str5;
        this.s = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:204) call: com.okinc.wallet.core.sign.evm.EVMAuthorization.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ EVMAuthorization(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
