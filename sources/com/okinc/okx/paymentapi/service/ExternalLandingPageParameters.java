package com.okinc.okx.paymentapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class ExternalLandingPageParameters implements Parcelable {
    public static final Parcelable.Creator<ExternalLandingPageParameters> CREATOR = new Creator();
    public final ExternalLandingPageType AEQbTJ;

    public static final class Creator implements Parcelable.Creator<ExternalLandingPageParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExternalLandingPageParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ExternalLandingPageParameters((ExternalLandingPageType) parcel.readParcelable(ExternalLandingPageParameters.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExternalLandingPageParameters[] newArray(int i) {
            return new ExternalLandingPageParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ExternalLandingPageParameters copy$default(ExternalLandingPageParameters externalLandingPageParameters, ExternalLandingPageType externalLandingPageType, int i, Object obj) {
        if ((i & 1) != 0) {
            externalLandingPageType = externalLandingPageParameters.AEQbTJ;
        }
        return externalLandingPageParameters.copydefault(externalLandingPageType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExternalLandingPageParameters copydefault(@NotNull ExternalLandingPageType externalLandingPageType) {
        Intrinsics.checkNotNullParameter(externalLandingPageType, "");
        return new ExternalLandingPageParameters(externalLandingPageType);
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
        return (obj instanceof ExternalLandingPageParameters) && Intrinsics.EZpvd(this.AEQbTJ, ((ExternalLandingPageParameters) obj).AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ExternalLandingPageParameters(landingType=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.AEQbTJ, i);
    }

    public ExternalLandingPageParameters(@NotNull ExternalLandingPageType externalLandingPageType) {
        Intrinsics.checkNotNullParameter(externalLandingPageType, "");
        this.AEQbTJ = externalLandingPageType;
    }
}
