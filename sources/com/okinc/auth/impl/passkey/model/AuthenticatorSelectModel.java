package com.okinc.auth.impl.passkey.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthenticatorSelectModel implements Parcelable {
    public static final Parcelable.Creator<AuthenticatorSelectModel> CREATOR = new Creator();
    public boolean AEQbTJ;
    public final AuthenticatorDisplayModel copydefault;

    public static final class Creator implements Parcelable.Creator<AuthenticatorSelectModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthenticatorSelectModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AuthenticatorSelectModel(parcel.readInt() != 0, AuthenticatorDisplayModel.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AuthenticatorSelectModel[] newArray(int i) {
            return new AuthenticatorSelectModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AuthenticatorSelectModel copy$default(AuthenticatorSelectModel authenticatorSelectModel, boolean z, AuthenticatorDisplayModel authenticatorDisplayModel, int i, Object obj) {
        if ((i & 1) != 0) {
            z = authenticatorSelectModel.AEQbTJ;
        }
        if ((i & 2) != 0) {
            authenticatorDisplayModel = authenticatorSelectModel.copydefault;
        }
        return authenticatorSelectModel.EZpvd(z, authenticatorDisplayModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthenticatorSelectModel EZpvd(boolean z, @NotNull AuthenticatorDisplayModel authenticatorDisplayModel) {
        Intrinsics.checkNotNullParameter(authenticatorDisplayModel, "");
        return new AuthenticatorSelectModel(z, authenticatorDisplayModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthenticatorDisplayModel OLrzqt() {
        return this.copydefault;
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
        if (!(obj instanceof AuthenticatorSelectModel)) {
            return false;
        }
        AuthenticatorSelectModel authenticatorSelectModel = (AuthenticatorSelectModel) obj;
        return this.AEQbTJ == authenticatorSelectModel.AEQbTJ && Intrinsics.EZpvd(this.copydefault, authenticatorSelectModel.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Boolean.hashCode(this.AEQbTJ) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AuthenticatorSelectModel(isSelected=" + this.AEQbTJ + ", data=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        this.copydefault.writeToParcel(parcel, i);
    }

    public AuthenticatorSelectModel(boolean z, @NotNull AuthenticatorDisplayModel authenticatorDisplayModel) {
        Intrinsics.checkNotNullParameter(authenticatorDisplayModel, "");
        this.AEQbTJ = z;
        this.copydefault = authenticatorDisplayModel;
    }
}
