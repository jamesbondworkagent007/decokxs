package com.okinc.okimcore.model.remote;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class IMAuthResponse implements Parcelable {
    public static final int $stable = 0;
    private final String token;
    private final long userUid;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<IMAuthResponse> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<IMAuthResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IMAuthResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new IMAuthResponse(parcel.readString(), parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IMAuthResponse[] newArray(int i) {
            return new IMAuthResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ IMAuthResponse copy$default(IMAuthResponse iMAuthResponse, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = iMAuthResponse.token;
        }
        if ((i & 2) != 0) {
            j = iMAuthResponse.userUid;
        }
        return iMAuthResponse.copy(str, j);
    }

    @SerialName("token")
    public static /* synthetic */ void getToken$annotations() {
    }

    @SerialName("userUid")
    public static /* synthetic */ void getUserUid$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IMAuthResponse copy(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return new IMAuthResponse(str, j);
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
        if (!(obj instanceof IMAuthResponse)) {
            return false;
        }
        IMAuthResponse iMAuthResponse = (IMAuthResponse) obj;
        return Intrinsics.EZpvd((Object) this.token, (Object) iMAuthResponse.token) && this.userUid == iMAuthResponse.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUserUid() {
        return this.userUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.token.hashCode() * 31) + Long.hashCode(this.userUid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IMAuthResponse(token=" + this.token + ", userUid=" + this.userUid + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.token);
        parcel.writeLong(this.userUid);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.IMAuthResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<IMAuthResponse> serializer() {
            return IMAuthResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IMAuthResponse(int i, String str, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, IMAuthResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.token = str;
        this.userUid = j;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(IMAuthResponse iMAuthResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, iMAuthResponse.token);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, iMAuthResponse.userUid);
    }

    public IMAuthResponse(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.token = str;
        this.userUid = j;
    }
}
