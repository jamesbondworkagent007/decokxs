package com.okinc.planet.biz_userprofile.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetBioContent implements Parcelable {
    public boolean EZpvd;
    public final String KWHzl;
    public final String copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public static final Parcelable.Creator<PlanetBioContent> CREATOR = new Creator();
    public static final PlanetBioContent AEQbTJ = new PlanetBioContent("", null);

    public static final class Creator implements Parcelable.Creator<PlanetBioContent> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlanetBioContent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PlanetBioContent(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlanetBioContent[] newArray(int i) {
            return new PlanetBioContent[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PlanetBioContent copy$default(PlanetBioContent planetBioContent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = planetBioContent.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = planetBioContent.copydefault;
        }
        return planetBioContent.EZpvd(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        String str;
        boolean z = this.EZpvd;
        if (z || (str = this.copydefault) == null) {
            str = this.KWHzl;
        }
        this.EZpvd = !z;
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlanetBioContent EZpvd(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PlanetBioContent(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        String str;
        return (!this.EZpvd || (str = this.copydefault) == null) ? this.KWHzl : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        String str = this.KWHzl;
        this.EZpvd = false;
        return str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlanetBioContent)) {
            return false;
        }
        PlanetBioContent planetBioContent = (PlanetBioContent) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) planetBioContent.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) planetBioContent.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        String str = this.copydefault;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PlanetBioContent(bio=" + this.KWHzl + ", translatedBio=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.copydefault);
    }

    public PlanetBioContent(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        this.copydefault = str2;
        this.EZpvd = true ^ (str2 == null || str2.length() == 0);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetBioContent.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final PlanetBioContent OLrzqt() {
            return PlanetBioContent.AEQbTJ;
        }
    }

    public final Boolean AYXKKw() {
        if (this.EZpvd) {
            return Boolean.TRUE;
        }
        if (copydefault().length() == 0) {
            return null;
        }
        return Boolean.FALSE;
    }

    public final boolean KWHzl() {
        String str = this.copydefault;
        return !(str == null || str.length() == 0);
    }
}
