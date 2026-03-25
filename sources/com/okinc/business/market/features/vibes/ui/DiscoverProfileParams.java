package com.okinc.business.market.features.vibes.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class DiscoverProfileParams implements Parcelable {
    public static final Parcelable.Creator<DiscoverProfileParams> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String EZpvd;
    public final String OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<DiscoverProfileParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DiscoverProfileParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DiscoverProfileParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DiscoverProfileParams[] newArray(int i) {
            return new DiscoverProfileParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DiscoverProfileParams copy$default(DiscoverProfileParams discoverProfileParams, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = discoverProfileParams.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = discoverProfileParams.AEQbTJ;
        }
        if ((i & 4) != 0) {
            str3 = discoverProfileParams.OLrzqt;
        }
        if ((i & 8) != 0) {
            str4 = discoverProfileParams.EZpvd;
        }
        return discoverProfileParams.EZpvd(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DiscoverProfileParams EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new DiscoverProfileParams(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.EZpvd;
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
        if (!(obj instanceof DiscoverProfileParams)) {
            return false;
        }
        DiscoverProfileParams discoverProfileParams = (DiscoverProfileParams) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) discoverProfileParams.copydefault) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) discoverProfileParams.AEQbTJ) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) discoverProfileParams.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) discoverProfileParams.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DiscoverProfileParams(authorId=" + this.copydefault + ", kolName=" + this.AEQbTJ + ", avatarUrl=" + this.OLrzqt + ", source=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.EZpvd);
    }

    public DiscoverProfileParams(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.copydefault = str;
        this.AEQbTJ = str2;
        this.OLrzqt = str3;
        this.EZpvd = str4;
    }
}
