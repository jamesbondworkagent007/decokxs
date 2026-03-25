package com.okinc.business.defi.api.bean.passkeywallet.cedefi;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class EnableLimitOrderInput implements Parcelable {
    public static final Parcelable.Creator<EnableLimitOrderInput> CREATOR = new Creator();
    public final String AEQbTJ;

    public static final class Creator implements Parcelable.Creator<EnableLimitOrderInput> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EnableLimitOrderInput createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EnableLimitOrderInput(parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EnableLimitOrderInput[] newArray(int i) {
            return new EnableLimitOrderInput[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EnableLimitOrderInput copy$default(EnableLimitOrderInput enableLimitOrderInput, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = enableLimitOrderInput.AEQbTJ;
        }
        return enableLimitOrderInput.AEQbTJ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EnableLimitOrderInput AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new EnableLimitOrderInput(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.AEQbTJ;
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
        return (obj instanceof EnableLimitOrderInput) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) ((EnableLimitOrderInput) obj).AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EnableLimitOrderInput(chainIndex=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
    }

    public EnableLimitOrderInput(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }
}
