package com.okinc.business.market.features.smart_money.signal.ui.widget;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalMultiplierTagUiModel implements Parcelable {
    public static final Parcelable.Creator<SignalMultiplierTagUiModel> CREATOR = new Creator();
    public final SignalMultiplierTagType AEQbTJ;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<SignalMultiplierTagUiModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalMultiplierTagUiModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignalMultiplierTagUiModel(SignalMultiplierTagType.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalMultiplierTagUiModel[] newArray(int i) {
            return new SignalMultiplierTagUiModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignalMultiplierTagUiModel copy$default(SignalMultiplierTagUiModel signalMultiplierTagUiModel, SignalMultiplierTagType signalMultiplierTagType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            signalMultiplierTagType = signalMultiplierTagUiModel.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = signalMultiplierTagUiModel.copydefault;
        }
        return signalMultiplierTagUiModel.AEQbTJ(signalMultiplierTagType, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalMultiplierTagType AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalMultiplierTagUiModel AEQbTJ(@NotNull SignalMultiplierTagType signalMultiplierTagType, @NotNull String str) {
        Intrinsics.checkNotNullParameter(signalMultiplierTagType, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new SignalMultiplierTagUiModel(signalMultiplierTagType, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
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
        if (!(obj instanceof SignalMultiplierTagUiModel)) {
            return false;
        }
        SignalMultiplierTagUiModel signalMultiplierTagUiModel = (SignalMultiplierTagUiModel) obj;
        return this.AEQbTJ == signalMultiplierTagUiModel.AEQbTJ && Intrinsics.EZpvd((Object) this.copydefault, (Object) signalMultiplierTagUiModel.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalMultiplierTagUiModel(type=" + this.AEQbTJ + ", text=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ.name());
        parcel.writeString(this.copydefault);
    }

    public SignalMultiplierTagUiModel(@NotNull SignalMultiplierTagType signalMultiplierTagType, @NotNull String str) {
        Intrinsics.checkNotNullParameter(signalMultiplierTagType, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = signalMultiplierTagType;
        this.copydefault = str;
    }
}
