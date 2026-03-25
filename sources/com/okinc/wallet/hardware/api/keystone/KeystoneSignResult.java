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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class KeystoneSignResult implements Parcelable {
    public static final int $stable = 0;
    private final String requestId;
    private final String signature;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<KeystoneSignResult> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<KeystoneSignResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KeystoneSignResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new KeystoneSignResult(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final KeystoneSignResult[] newArray(int i) {
            return new KeystoneSignResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KeystoneSignResult copy$default(KeystoneSignResult keystoneSignResult, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = keystoneSignResult.requestId;
        }
        if ((i & 2) != 0) {
            str2 = keystoneSignResult.signature;
        }
        return keystoneSignResult.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneSignResult copy(String str, String str2) {
        return new KeystoneSignResult(str, str2);
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
        if (!(obj instanceof KeystoneSignResult)) {
            return false;
        }
        KeystoneSignResult keystoneSignResult = (KeystoneSignResult) obj;
        return Intrinsics.EZpvd((Object) this.requestId, (Object) keystoneSignResult.requestId) && Intrinsics.EZpvd((Object) this.signature, (Object) keystoneSignResult.signature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.requestId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.signature;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KeystoneSignResult(requestId=" + this.requestId + ", signature=" + this.signature + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.requestId);
        parcel.writeString(this.signature);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.api.keystone.KeystoneSignResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KeystoneSignResult> serializer() {
            return KeystoneSignResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KeystoneSignResult(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, KeystoneSignResult$$serializer.INSTANCE.getDescriptor());
        }
        this.requestId = str;
        this.signature = str2;
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_api(KeystoneSignResult keystoneSignResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, keystoneSignResult.requestId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, keystoneSignResult.signature);
    }

    public KeystoneSignResult(String str, String str2) {
        this.requestId = str;
        this.signature = str2;
    }
}
