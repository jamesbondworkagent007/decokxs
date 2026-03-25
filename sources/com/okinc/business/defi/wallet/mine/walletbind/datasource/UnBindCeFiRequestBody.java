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
public final class UnBindCeFiRequestBody implements Parcelable {
    public static final int $stable = 0;
    private final String nonce;
    private final String signature;
    private final String signatureAddressType;
    private final String signatureChainIndex;
    private final String walletAccountId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<UnBindCeFiRequestBody> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<UnBindCeFiRequestBody> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnBindCeFiRequestBody createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UnBindCeFiRequestBody(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnBindCeFiRequestBody[] newArray(int i) {
            return new UnBindCeFiRequestBody[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UnBindCeFiRequestBody() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UnBindCeFiRequestBody copy$default(UnBindCeFiRequestBody unBindCeFiRequestBody, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unBindCeFiRequestBody.walletAccountId;
        }
        if ((i & 2) != 0) {
            str2 = unBindCeFiRequestBody.signature;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = unBindCeFiRequestBody.nonce;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = unBindCeFiRequestBody.signatureAddressType;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = unBindCeFiRequestBody.signatureChainIndex;
        }
        return unBindCeFiRequestBody.copy(str, str6, str7, str8, str5);
    }

    @SerialName("nonce")
    public static /* synthetic */ void getNonce$annotations() {
    }

    @SerialName("signature")
    public static /* synthetic */ void getSignature$annotations() {
    }

    @SerialName("signatureAddressType")
    public static /* synthetic */ void getSignatureAddressType$annotations() {
    }

    @SerialName("signatureChainIndex")
    public static /* synthetic */ void getSignatureChainIndex$annotations() {
    }

    @SerialName("walletAccountId")
    public static /* synthetic */ void getWalletAccountId$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletAccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.signatureAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.signatureChainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnBindCeFiRequestBody copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new UnBindCeFiRequestBody(str, str2, str3, str4, str5);
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
        if (!(obj instanceof UnBindCeFiRequestBody)) {
            return false;
        }
        UnBindCeFiRequestBody unBindCeFiRequestBody = (UnBindCeFiRequestBody) obj;
        return Intrinsics.EZpvd((Object) this.walletAccountId, (Object) unBindCeFiRequestBody.walletAccountId) && Intrinsics.EZpvd((Object) this.signature, (Object) unBindCeFiRequestBody.signature) && Intrinsics.EZpvd((Object) this.nonce, (Object) unBindCeFiRequestBody.nonce) && Intrinsics.EZpvd((Object) this.signatureAddressType, (Object) unBindCeFiRequestBody.signatureAddressType) && Intrinsics.EZpvd((Object) this.signatureChainIndex, (Object) unBindCeFiRequestBody.signatureChainIndex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignatureAddressType() {
        return this.signatureAddressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignatureChainIndex() {
        return this.signatureChainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAccountId() {
        return this.walletAccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.walletAccountId.hashCode() * 31) + this.signature.hashCode()) * 31) + this.nonce.hashCode()) * 31) + this.signatureAddressType.hashCode()) * 31) + this.signatureChainIndex.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UnBindCeFiRequestBody(walletAccountId=" + this.walletAccountId + ", signature=" + this.signature + ", nonce=" + this.nonce + ", signatureAddressType=" + this.signatureAddressType + ", signatureChainIndex=" + this.signatureChainIndex + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.walletAccountId);
        parcel.writeString(this.signature);
        parcel.writeString(this.nonce);
        parcel.writeString(this.signatureAddressType);
        parcel.writeString(this.signatureChainIndex);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.walletbind.datasource.UnBindCeFiRequestBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UnBindCeFiRequestBody> serializer() {
            return UnBindCeFiRequestBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UnBindCeFiRequestBody(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.walletAccountId = "";
        } else {
            this.walletAccountId = str;
        }
        if ((i & 2) == 0) {
            this.signature = "";
        } else {
            this.signature = str2;
        }
        if ((i & 4) == 0) {
            this.nonce = "";
        } else {
            this.nonce = str3;
        }
        if ((i & 8) == 0) {
            this.signatureAddressType = "";
        } else {
            this.signatureAddressType = str4;
        }
        if ((i & 16) == 0) {
            this.signatureChainIndex = "";
        } else {
            this.signatureChainIndex = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(UnBindCeFiRequestBody unBindCeFiRequestBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) unBindCeFiRequestBody.walletAccountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, unBindCeFiRequestBody.walletAccountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) unBindCeFiRequestBody.signature, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, unBindCeFiRequestBody.signature);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) unBindCeFiRequestBody.nonce, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, unBindCeFiRequestBody.nonce);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) unBindCeFiRequestBody.signatureAddressType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, unBindCeFiRequestBody.signatureAddressType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) unBindCeFiRequestBody.signatureChainIndex, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, unBindCeFiRequestBody.signatureChainIndex);
    }

    public UnBindCeFiRequestBody(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.walletAccountId = str;
        this.signature = str2;
        this.nonce = str3;
        this.signatureAddressType = str4;
        this.signatureChainIndex = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:68) call: com.okinc.business.defi.wallet.mine.walletbind.datasource.UnBindCeFiRequestBody.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ UnBindCeFiRequestBody(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
