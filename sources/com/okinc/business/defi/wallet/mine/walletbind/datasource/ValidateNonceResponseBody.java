package com.okinc.business.defi.wallet.mine.walletbind.datasource;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class ValidateNonceResponseBody implements Parcelable {
    public static final int $stable = 0;
    private final String maskedUserName;
    private final String publicKey;
    private final String threshold;
    private final String uid;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ValidateNonceResponseBody> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ValidateNonceResponseBody> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ValidateNonceResponseBody createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ValidateNonceResponseBody(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ValidateNonceResponseBody[] newArray(int i) {
            return new ValidateNonceResponseBody[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ValidateNonceResponseBody() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ValidateNonceResponseBody copy$default(ValidateNonceResponseBody validateNonceResponseBody, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validateNonceResponseBody.publicKey;
        }
        if ((i & 2) != 0) {
            str2 = validateNonceResponseBody.maskedUserName;
        }
        if ((i & 4) != 0) {
            str3 = validateNonceResponseBody.threshold;
        }
        if ((i & 8) != 0) {
            str4 = validateNonceResponseBody.uid;
        }
        return validateNonceResponseBody.copy(str, str2, str3, str4);
    }

    @SerialName("maskedUserName")
    public static /* synthetic */ void getMaskedUserName$annotations() {
    }

    @SerialName("publicKey")
    public static /* synthetic */ void getPublicKey$annotations() {
    }

    @SerialName("threshold")
    public static /* synthetic */ void getThreshold$annotations() {
    }

    @SerialName("uid")
    public static /* synthetic */ void getUid$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.maskedUserName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.threshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ValidateNonceResponseBody copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new ValidateNonceResponseBody(str, str2, str3, str4);
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
        if (!(obj instanceof ValidateNonceResponseBody)) {
            return false;
        }
        ValidateNonceResponseBody validateNonceResponseBody = (ValidateNonceResponseBody) obj;
        return Intrinsics.EZpvd((Object) this.publicKey, (Object) validateNonceResponseBody.publicKey) && Intrinsics.EZpvd((Object) this.maskedUserName, (Object) validateNonceResponseBody.maskedUserName) && Intrinsics.EZpvd((Object) this.threshold, (Object) validateNonceResponseBody.threshold) && Intrinsics.EZpvd((Object) this.uid, (Object) validateNonceResponseBody.uid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaskedUserName() {
        return this.maskedUserName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getThreshold() {
        return this.threshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUid() {
        return this.uid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.publicKey.hashCode() * 31) + this.maskedUserName.hashCode()) * 31) + this.threshold.hashCode()) * 31) + this.uid.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ValidateNonceResponseBody(publicKey=" + this.publicKey + ", maskedUserName=" + this.maskedUserName + ", threshold=" + this.threshold + ", uid=" + this.uid + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.publicKey);
        parcel.writeString(this.maskedUserName);
        parcel.writeString(this.threshold);
        parcel.writeString(this.uid);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.walletbind.datasource.ValidateNonceResponseBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ValidateNonceResponseBody> serializer() {
            return ValidateNonceResponseBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ValidateNonceResponseBody(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.publicKey = "";
        } else {
            this.publicKey = str;
        }
        if ((i & 2) == 0) {
            this.maskedUserName = "";
        } else {
            this.maskedUserName = str2;
        }
        if ((i & 4) == 0) {
            this.threshold = "";
        } else {
            this.threshold = str3;
        }
        if ((i & 8) == 0) {
            this.uid = "";
        } else {
            this.uid = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ValidateNonceResponseBody validateNonceResponseBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) validateNonceResponseBody.publicKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, validateNonceResponseBody.publicKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) validateNonceResponseBody.maskedUserName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, validateNonceResponseBody.maskedUserName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) validateNonceResponseBody.threshold, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, validateNonceResponseBody.threshold);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) validateNonceResponseBody.uid, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, validateNonceResponseBody.uid);
    }

    public ValidateNonceResponseBody(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.publicKey = str;
        this.maskedUserName = str2;
        this.threshold = str3;
        this.uid = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:51) call: com.okinc.business.defi.wallet.mine.walletbind.datasource.ValidateNonceResponseBody.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ValidateNonceResponseBody(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
