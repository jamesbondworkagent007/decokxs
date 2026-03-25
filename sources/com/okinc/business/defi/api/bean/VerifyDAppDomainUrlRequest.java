package com.okinc.business.defi.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class VerifyDAppDomainUrlRequest implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<VerifyDAppDomainUrlRequest> CREATOR = new Creator();
    private final String url;

    public static final class Creator implements Parcelable.Creator<VerifyDAppDomainUrlRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VerifyDAppDomainUrlRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new VerifyDAppDomainUrlRequest(parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VerifyDAppDomainUrlRequest[] newArray(int i) {
            return new VerifyDAppDomainUrlRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VerifyDAppDomainUrlRequest copy$default(VerifyDAppDomainUrlRequest verifyDAppDomainUrlRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyDAppDomainUrlRequest.url;
        }
        return verifyDAppDomainUrlRequest.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VerifyDAppDomainUrlRequest copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new VerifyDAppDomainUrlRequest(str);
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
        return (obj instanceof VerifyDAppDomainUrlRequest) && Intrinsics.EZpvd((Object) this.url, (Object) ((VerifyDAppDomainUrlRequest) obj).url);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.url.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VerifyDAppDomainUrlRequest(url=" + this.url + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.url);
    }

    public VerifyDAppDomainUrlRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
    }
}
