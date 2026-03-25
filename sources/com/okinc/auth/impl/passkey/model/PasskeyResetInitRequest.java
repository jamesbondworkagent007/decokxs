package com.okinc.auth.impl.passkey.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class PasskeyResetInitRequest implements Parcelable {
    public final String mfaSessionId;
    public final List<String> removeCredentialIds;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PasskeyResetInitRequest> CREATOR = new Creator();
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Creator implements Parcelable.Creator<PasskeyResetInitRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyResetInitRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PasskeyResetInitRequest(parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyResetInitRequest[] newArray(int i) {
            return new PasskeyResetInitRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.auth.impl.passkey.model.PasskeyResetInitRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PasskeyResetInitRequest copy$default(PasskeyResetInitRequest passkeyResetInitRequest, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passkeyResetInitRequest.mfaSessionId;
        }
        if ((i & 2) != 0) {
            list = passkeyResetInitRequest.removeCredentialIds;
        }
        return passkeyResetInitRequest.OLrzqt(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyResetInitRequest OLrzqt(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new PasskeyResetInitRequest(str, list);
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
        if (!(obj instanceof PasskeyResetInitRequest)) {
            return false;
        }
        PasskeyResetInitRequest passkeyResetInitRequest = (PasskeyResetInitRequest) obj;
        return Intrinsics.EZpvd((Object) this.mfaSessionId, (Object) passkeyResetInitRequest.mfaSessionId) && Intrinsics.EZpvd(this.removeCredentialIds, passkeyResetInitRequest.removeCredentialIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.mfaSessionId.hashCode() * 31) + this.removeCredentialIds.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyResetInitRequest(mfaSessionId=" + this.mfaSessionId + ", removeCredentialIds=" + this.removeCredentialIds + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.mfaSessionId);
        parcel.writeStringList(this.removeCredentialIds);
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.PasskeyResetInitRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PasskeyResetInitRequest> serializer() {
            return PasskeyResetInitRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PasskeyResetInitRequest(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, PasskeyResetInitRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.mfaSessionId = str;
        this.removeCredentialIds = list;
    }

    public static final /* synthetic */ void AEQbTJ(PasskeyResetInitRequest passkeyResetInitRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, passkeyResetInitRequest.mfaSessionId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], passkeyResetInitRequest.removeCredentialIds);
    }

    public PasskeyResetInitRequest(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.mfaSessionId = str;
        this.removeCredentialIds = list;
    }
}
