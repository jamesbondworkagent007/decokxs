package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.assets.api.utils.PnlState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class PnlDetailV2 implements Parcelable {
    public static final Parcelable.Creator<PnlDetailV2> CREATOR = new Creator();
    public final PnlState AEQbTJ;
    public final String EZpvd;

    public static final class Creator implements Parcelable.Creator<PnlDetailV2> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PnlDetailV2 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PnlDetailV2(parcel.readString(), PnlState.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PnlDetailV2[] newArray(int i) {
            return new PnlDetailV2[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PnlDetailV2 copy$default(PnlDetailV2 pnlDetailV2, String str, PnlState pnlState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pnlDetailV2.EZpvd;
        }
        if ((i & 2) != 0) {
            pnlState = pnlDetailV2.AEQbTJ;
        }
        return pnlDetailV2.copydefault(str, pnlState);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnlDetailV2 copydefault(@NotNull String str, @NotNull PnlState pnlState) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(pnlState, "");
        return new PnlDetailV2(str, pnlState);
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
        if (!(obj instanceof PnlDetailV2)) {
            return false;
        }
        PnlDetailV2 pnlDetailV2 = (PnlDetailV2) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) pnlDetailV2.EZpvd) && this.AEQbTJ == pnlDetailV2.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PnlDetailV2(value=" + this.EZpvd + ", state=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AEQbTJ.name());
    }

    public PnlDetailV2(@NotNull String str, @NotNull PnlState pnlState) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(pnlState, "");
        this.EZpvd = str;
        this.AEQbTJ = pnlState;
    }
}
