package com.okinc.business.defi.biz.net.bean;

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

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class BackupCloudTypeRequest implements Parcelable {
    public static final int $stable = 0;
    private final String mpcId;
    private final String uId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BackupCloudTypeRequest> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BackupCloudTypeRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BackupCloudTypeRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BackupCloudTypeRequest(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BackupCloudTypeRequest[] newArray(int i) {
            return new BackupCloudTypeRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BackupCloudTypeRequest copy$default(BackupCloudTypeRequest backupCloudTypeRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = backupCloudTypeRequest.mpcId;
        }
        if ((i & 2) != 0) {
            str2 = backupCloudTypeRequest.uId;
        }
        return backupCloudTypeRequest.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.uId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BackupCloudTypeRequest copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new BackupCloudTypeRequest(str, str2);
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
        if (!(obj instanceof BackupCloudTypeRequest)) {
            return false;
        }
        BackupCloudTypeRequest backupCloudTypeRequest = (BackupCloudTypeRequest) obj;
        return Intrinsics.EZpvd((Object) this.mpcId, (Object) backupCloudTypeRequest.mpcId) && Intrinsics.EZpvd((Object) this.uId, (Object) backupCloudTypeRequest.uId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMpcId() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUId() {
        return this.uId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.mpcId.hashCode() * 31) + this.uId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BackupCloudTypeRequest(mpcId=" + this.mpcId + ", uId=" + this.uId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.mpcId);
        parcel.writeString(this.uId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.BackupCloudTypeRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BackupCloudTypeRequest> serializer() {
            return BackupCloudTypeRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BackupCloudTypeRequest(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, BackupCloudTypeRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.mpcId = str;
        this.uId = str2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(BackupCloudTypeRequest backupCloudTypeRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, backupCloudTypeRequest.mpcId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, backupCloudTypeRequest.uId);
    }

    public BackupCloudTypeRequest(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.mpcId = str;
        this.uId = str2;
    }
}
