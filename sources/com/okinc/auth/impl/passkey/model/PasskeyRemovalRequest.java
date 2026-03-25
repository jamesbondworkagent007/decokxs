package com.okinc.auth.impl.passkey.model;

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

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class PasskeyRemovalRequest implements Parcelable {
    public static final int $stable = 0;
    public final String credentialId;
    public final String mfaSessionId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PasskeyRemovalRequest> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Creator implements Parcelable.Creator<PasskeyRemovalRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyRemovalRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PasskeyRemovalRequest(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyRemovalRequest[] newArray(int i) {
            return new PasskeyRemovalRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyRemovalRequest copy$default(PasskeyRemovalRequest passkeyRemovalRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passkeyRemovalRequest.credentialId;
        }
        if ((i & 2) != 0) {
            str2 = passkeyRemovalRequest.mfaSessionId;
        }
        return passkeyRemovalRequest.copydefault(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyRemovalRequest copydefault(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new PasskeyRemovalRequest(str, str2);
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
        if (!(obj instanceof PasskeyRemovalRequest)) {
            return false;
        }
        PasskeyRemovalRequest passkeyRemovalRequest = (PasskeyRemovalRequest) obj;
        return Intrinsics.EZpvd((Object) this.credentialId, (Object) passkeyRemovalRequest.credentialId) && Intrinsics.EZpvd((Object) this.mfaSessionId, (Object) passkeyRemovalRequest.mfaSessionId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.credentialId.hashCode() * 31) + this.mfaSessionId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyRemovalRequest(credentialId=" + this.credentialId + ", mfaSessionId=" + this.mfaSessionId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.credentialId);
        parcel.writeString(this.mfaSessionId);
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.PasskeyRemovalRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PasskeyRemovalRequest> serializer() {
            return PasskeyRemovalRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PasskeyRemovalRequest(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, PasskeyRemovalRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.credentialId = str;
        this.mfaSessionId = str2;
    }

    public static final /* synthetic */ void copydefault(PasskeyRemovalRequest passkeyRemovalRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, passkeyRemovalRequest.credentialId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, passkeyRemovalRequest.mfaSessionId);
    }

    public PasskeyRemovalRequest(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.credentialId = str;
        this.mfaSessionId = str2;
    }
}
