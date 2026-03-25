package com.okinc.business.defi.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class VerifyDAppDomainRequest implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<VerifyDAppDomainRequest> CREATOR = new Creator();
    private final String clientId;
    private final String manifestJson;

    public static final class Creator implements Parcelable.Creator<VerifyDAppDomainRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VerifyDAppDomainRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new VerifyDAppDomainRequest(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VerifyDAppDomainRequest[] newArray(int i) {
            return new VerifyDAppDomainRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VerifyDAppDomainRequest copy$default(VerifyDAppDomainRequest verifyDAppDomainRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyDAppDomainRequest.clientId;
        }
        if ((i & 2) != 0) {
            str2 = verifyDAppDomainRequest.manifestJson;
        }
        return verifyDAppDomainRequest.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.clientId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.manifestJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VerifyDAppDomainRequest copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new VerifyDAppDomainRequest(str, str2);
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
        if (!(obj instanceof VerifyDAppDomainRequest)) {
            return false;
        }
        VerifyDAppDomainRequest verifyDAppDomainRequest = (VerifyDAppDomainRequest) obj;
        return Intrinsics.EZpvd((Object) this.clientId, (Object) verifyDAppDomainRequest.clientId) && Intrinsics.EZpvd((Object) this.manifestJson, (Object) verifyDAppDomainRequest.manifestJson);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClientId() {
        return this.clientId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getManifestJson() {
        return this.manifestJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.clientId.hashCode() * 31) + this.manifestJson.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VerifyDAppDomainRequest(clientId=" + this.clientId + ", manifestJson=" + this.manifestJson + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.clientId);
        parcel.writeString(this.manifestJson);
    }

    public VerifyDAppDomainRequest(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.clientId = str;
        this.manifestJson = str2;
    }
}
