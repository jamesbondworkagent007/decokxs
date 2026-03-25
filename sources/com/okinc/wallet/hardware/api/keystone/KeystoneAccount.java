package com.okinc.wallet.hardware.api.keystone;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class KeystoneAccount implements Parcelable {
    public static final int $stable = 0;
    private final String chain;
    private final String chainCode;
    private final long chainId;
    private final String extendedPublicKey;
    private final boolean isLedgerLivePath;
    private final String path;
    private final String publicKey;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<KeystoneAccount> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<KeystoneAccount> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KeystoneAccount createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new KeystoneAccount(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KeystoneAccount[] newArray(int i) {
            return new KeystoneAccount[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.extendedPublicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isLedgerLivePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneAccount copy(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new KeystoneAccount(str, j, str2, str3, str4, str5, z);
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
        if (!(obj instanceof KeystoneAccount)) {
            return false;
        }
        KeystoneAccount keystoneAccount = (KeystoneAccount) obj;
        return Intrinsics.EZpvd((Object) this.chain, (Object) keystoneAccount.chain) && this.chainId == keystoneAccount.chainId && Intrinsics.EZpvd((Object) this.path, (Object) keystoneAccount.path) && Intrinsics.EZpvd((Object) this.chainCode, (Object) keystoneAccount.chainCode) && Intrinsics.EZpvd((Object) this.publicKey, (Object) keystoneAccount.publicKey) && Intrinsics.EZpvd((Object) this.extendedPublicKey, (Object) keystoneAccount.extendedPublicKey) && this.isLedgerLivePath == keystoneAccount.isLedgerLivePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChain() {
        return this.chain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainCode() {
        return this.chainCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtendedPublicKey() {
        return this.extendedPublicKey;
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
        return (((((((((((this.chain.hashCode() * 31) + Long.hashCode(this.chainId)) * 31) + this.path.hashCode()) * 31) + this.chainCode.hashCode()) * 31) + this.publicKey.hashCode()) * 31) + this.extendedPublicKey.hashCode()) * 31) + Boolean.hashCode(this.isLedgerLivePath);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isLedgerLivePath() {
        return this.isLedgerLivePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KeystoneAccount(chain=" + this.chain + ", chainId=" + this.chainId + ", path=" + this.path + ", chainCode=" + this.chainCode + ", publicKey=" + this.publicKey + ", extendedPublicKey=" + this.extendedPublicKey + ", isLedgerLivePath=" + this.isLedgerLivePath + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chain);
        parcel.writeLong(this.chainId);
        parcel.writeString(this.path);
        parcel.writeString(this.chainCode);
        parcel.writeString(this.publicKey);
        parcel.writeString(this.extendedPublicKey);
        parcel.writeInt(this.isLedgerLivePath ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.keystone.KeystoneAccount.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KeystoneAccount> serializer() {
            return KeystoneAccount$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KeystoneAccount(int i, String str, long j, String str2, String str3, String str4, String str5, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, KeystoneAccount$$serializer.INSTANCE.getDescriptor());
        }
        this.chain = str;
        this.chainId = j;
        this.path = str2;
        this.chainCode = str3;
        this.publicKey = str4;
        this.extendedPublicKey = str5;
        this.isLedgerLivePath = z;
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(KeystoneAccount keystoneAccount, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, keystoneAccount.chain);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, keystoneAccount.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, keystoneAccount.path);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, keystoneAccount.chainCode);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, keystoneAccount.publicKey);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, keystoneAccount.extendedPublicKey);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 6, keystoneAccount.isLedgerLivePath);
    }

    public KeystoneAccount(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.chain = str;
        this.chainId = j;
        this.path = str2;
        this.chainCode = str3;
        this.publicKey = str4;
        this.extendedPublicKey = str5;
        this.isLedgerLivePath = z;
    }
}
