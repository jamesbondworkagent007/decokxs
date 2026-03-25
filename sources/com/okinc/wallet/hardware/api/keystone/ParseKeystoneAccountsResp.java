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
public final class ParseKeystoneAccountsResp implements Parcelable {
    private final KeystoneMultiAccount multiAccount;
    private final int progress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ParseKeystoneAccountsResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ParseKeystoneAccountsResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ParseKeystoneAccountsResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ParseKeystoneAccountsResp(parcel.readInt(), parcel.readInt() == 0 ? null : KeystoneMultiAccount.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ParseKeystoneAccountsResp[] newArray(int i) {
            return new ParseKeystoneAccountsResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ParseKeystoneAccountsResp copy$default(ParseKeystoneAccountsResp parseKeystoneAccountsResp, int i, KeystoneMultiAccount keystoneMultiAccount, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = parseKeystoneAccountsResp.progress;
        }
        if ((i2 & 2) != 0) {
            keystoneMultiAccount = parseKeystoneAccountsResp.multiAccount;
        }
        return parseKeystoneAccountsResp.copy(i, keystoneMultiAccount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.progress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneMultiAccount component2() {
        return this.multiAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ParseKeystoneAccountsResp copy(int i, KeystoneMultiAccount keystoneMultiAccount) {
        return new ParseKeystoneAccountsResp(i, keystoneMultiAccount);
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
        if (!(obj instanceof ParseKeystoneAccountsResp)) {
            return false;
        }
        ParseKeystoneAccountsResp parseKeystoneAccountsResp = (ParseKeystoneAccountsResp) obj;
        return this.progress == parseKeystoneAccountsResp.progress && Intrinsics.EZpvd(this.multiAccount, parseKeystoneAccountsResp.multiAccount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneMultiAccount getMultiAccount() {
        return this.multiAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getProgress() {
        return this.progress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.progress);
        KeystoneMultiAccount keystoneMultiAccount = this.multiAccount;
        return (iHashCode * 31) + (keystoneMultiAccount == null ? 0 : keystoneMultiAccount.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ParseKeystoneAccountsResp(progress=" + this.progress + ", multiAccount=" + this.multiAccount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.progress);
        KeystoneMultiAccount keystoneMultiAccount = this.multiAccount;
        if (keystoneMultiAccount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            keystoneMultiAccount.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.keystone.ParseKeystoneAccountsResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ParseKeystoneAccountsResp> serializer() {
            return ParseKeystoneAccountsResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ParseKeystoneAccountsResp(int i, int i2, KeystoneMultiAccount keystoneMultiAccount, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ParseKeystoneAccountsResp$$serializer.INSTANCE.getDescriptor());
        }
        this.progress = i2;
        this.multiAccount = keystoneMultiAccount;
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(ParseKeystoneAccountsResp parseKeystoneAccountsResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, parseKeystoneAccountsResp.progress);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, KeystoneMultiAccount$$serializer.INSTANCE, parseKeystoneAccountsResp.multiAccount);
    }

    public ParseKeystoneAccountsResp(int i, KeystoneMultiAccount keystoneMultiAccount) {
        this.progress = i;
        this.multiAccount = keystoneMultiAccount;
    }
}
