package com.okinc.planet.biz_userprofile.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetAvatarInfo implements Parcelable {
    public final String AEQbTJ;
    public final String EZpvd;
    public final String KWHzl;
    public final String copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final Parcelable.Creator<PlanetAvatarInfo> CREATOR = new Creator();
    public static final PlanetAvatarInfo OLrzqt = new PlanetAvatarInfo(null, null, "", "");

    public static final class Creator implements Parcelable.Creator<PlanetAvatarInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlanetAvatarInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PlanetAvatarInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlanetAvatarInfo[] newArray(int i) {
            return new PlanetAvatarInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PlanetAvatarInfo copy$default(PlanetAvatarInfo planetAvatarInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = planetAvatarInfo.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = planetAvatarInfo.AEQbTJ;
        }
        if ((i & 4) != 0) {
            str3 = planetAvatarInfo.EZpvd;
        }
        if ((i & 8) != 0) {
            str4 = planetAvatarInfo.copydefault;
        }
        return planetAvatarInfo.AEQbTJ(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlanetAvatarInfo AEQbTJ(String str, String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new PlanetAvatarInfo(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.copydefault;
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
        if (!(obj instanceof PlanetAvatarInfo)) {
            return false;
        }
        PlanetAvatarInfo planetAvatarInfo = (PlanetAvatarInfo) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) planetAvatarInfo.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) planetAvatarInfo.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) planetAvatarInfo.EZpvd) && Intrinsics.EZpvd((Object) this.copydefault, (Object) planetAvatarInfo.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.KWHzl;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.AEQbTJ;
        return (((((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PlanetAvatarInfo(url=" + this.KWHzl + ", originUrl=" + this.AEQbTJ + ", nickName=" + this.EZpvd + ", targetId=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.copydefault);
    }

    public PlanetAvatarInfo(String str, String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.KWHzl = str;
        this.AEQbTJ = str2;
        this.EZpvd = str3;
        this.copydefault = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:9) call: com.okinc.planet.biz_userprofile.data.PlanetAvatarInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PlanetAvatarInfo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, str3, str4);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetAvatarInfo.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
