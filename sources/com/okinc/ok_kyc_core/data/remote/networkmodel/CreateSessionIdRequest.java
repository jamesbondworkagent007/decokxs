package com.okinc.ok_kyc_core.data.remote.networkmodel;

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

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class CreateSessionIdRequest implements Parcelable {
    public static final int $stable = 0;
    private final boolean nfcSupport;
    private final String sessionId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CreateSessionIdRequest> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<CreateSessionIdRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateSessionIdRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CreateSessionIdRequest(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateSessionIdRequest[] newArray(int i) {
            return new CreateSessionIdRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CreateSessionIdRequest copy$default(CreateSessionIdRequest createSessionIdRequest, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createSessionIdRequest.sessionId;
        }
        if ((i & 2) != 0) {
            z = createSessionIdRequest.nfcSupport;
        }
        return createSessionIdRequest.copy(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.nfcSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateSessionIdRequest copy(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CreateSessionIdRequest(str, z);
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
        if (!(obj instanceof CreateSessionIdRequest)) {
            return false;
        }
        CreateSessionIdRequest createSessionIdRequest = (CreateSessionIdRequest) obj;
        return Intrinsics.EZpvd((Object) this.sessionId, (Object) createSessionIdRequest.sessionId) && this.nfcSupport == createSessionIdRequest.nfcSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNfcSupport() {
        return this.nfcSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.sessionId.hashCode() * 31) + Boolean.hashCode(this.nfcSupport);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreateSessionIdRequest(sessionId=" + this.sessionId + ", nfcSupport=" + this.nfcSupport + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.sessionId);
        parcel.writeInt(this.nfcSupport ? 1 : 0);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CreateSessionIdRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateSessionIdRequest> serializer() {
            return CreateSessionIdRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateSessionIdRequest(int i, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, CreateSessionIdRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionId = str;
        this.nfcSupport = z;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CreateSessionIdRequest createSessionIdRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, createSessionIdRequest.sessionId);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, createSessionIdRequest.nfcSupport);
    }

    public CreateSessionIdRequest(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sessionId = str;
        this.nfcSupport = z;
    }
}
