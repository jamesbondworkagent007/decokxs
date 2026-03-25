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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class ValidateNonceRequestBody implements Parcelable {
    public static final int $stable = 0;
    private final String nonce;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ValidateNonceRequestBody> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<ValidateNonceRequestBody> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ValidateNonceRequestBody createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ValidateNonceRequestBody(parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ValidateNonceRequestBody[] newArray(int i) {
            return new ValidateNonceRequestBody[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ValidateNonceRequestBody() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ValidateNonceRequestBody copy$default(ValidateNonceRequestBody validateNonceRequestBody, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validateNonceRequestBody.nonce;
        }
        return validateNonceRequestBody.copy(str);
    }

    @SerialName("nonce")
    public static /* synthetic */ void getNonce$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ValidateNonceRequestBody copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ValidateNonceRequestBody(str);
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
        return (obj instanceof ValidateNonceRequestBody) && Intrinsics.EZpvd((Object) this.nonce, (Object) ((ValidateNonceRequestBody) obj).nonce);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.nonce.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ValidateNonceRequestBody(nonce=" + this.nonce + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.nonce);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.walletbind.datasource.ValidateNonceRequestBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ValidateNonceRequestBody> serializer() {
            return ValidateNonceRequestBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ValidateNonceRequestBody(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.nonce = "";
        } else {
            this.nonce = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ValidateNonceRequestBody validateNonceRequestBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd((Object) validateNonceRequestBody.nonce, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 0, validateNonceRequestBody.nonce);
    }

    public ValidateNonceRequestBody(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nonce = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:44) call: com.okinc.business.defi.wallet.mine.walletbind.datasource.ValidateNonceRequestBody.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ ValidateNonceRequestBody(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
