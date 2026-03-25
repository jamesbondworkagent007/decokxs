package com.okinc.wallet.core.tee;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class HPKEEncryptData implements Parcelable {
    public static final int $stable = 0;
    private final String ciphertextHex;
    private final String encapsulatedKeyHex;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<HPKEEncryptData> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<HPKEEncryptData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HPKEEncryptData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HPKEEncryptData(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HPKEEncryptData[] newArray(int i) {
            return new HPKEEncryptData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HPKEEncryptData() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HPKEEncryptData copy$default(HPKEEncryptData hPKEEncryptData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hPKEEncryptData.ciphertextHex;
        }
        if ((i & 2) != 0) {
            str2 = hPKEEncryptData.encapsulatedKeyHex;
        }
        return hPKEEncryptData.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ciphertextHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.encapsulatedKeyHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HPKEEncryptData copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new HPKEEncryptData(str, str2);
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
        if (!(obj instanceof HPKEEncryptData)) {
            return false;
        }
        HPKEEncryptData hPKEEncryptData = (HPKEEncryptData) obj;
        return Intrinsics.EZpvd((Object) this.ciphertextHex, (Object) hPKEEncryptData.ciphertextHex) && Intrinsics.EZpvd((Object) this.encapsulatedKeyHex, (Object) hPKEEncryptData.encapsulatedKeyHex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCiphertextHex() {
        return this.ciphertextHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEncapsulatedKeyHex() {
        return this.encapsulatedKeyHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.ciphertextHex.hashCode() * 31) + this.encapsulatedKeyHex.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HPKEEncryptData(ciphertextHex=" + this.ciphertextHex + ", encapsulatedKeyHex=" + this.encapsulatedKeyHex + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.ciphertextHex);
        parcel.writeString(this.encapsulatedKeyHex);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.tee.HPKEEncryptData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HPKEEncryptData> serializer() {
            return HPKEEncryptData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HPKEEncryptData(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ciphertextHex = "";
        } else {
            this.ciphertextHex = str;
        }
        if ((i & 2) == 0) {
            this.encapsulatedKeyHex = "";
        } else {
            this.encapsulatedKeyHex = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(HPKEEncryptData hPKEEncryptData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) hPKEEncryptData.ciphertextHex, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, hPKEEncryptData.ciphertextHex);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) hPKEEncryptData.encapsulatedKeyHex, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, hPKEEncryptData.encapsulatedKeyHex);
    }

    public HPKEEncryptData(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.ciphertextHex = str;
        this.encapsulatedKeyHex = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:20) call: com.okinc.wallet.core.tee.HPKEEncryptData.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HPKEEncryptData(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
