package com.okinc.im.widgets;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class AvatarInfo implements Parcelable {
    public static final Parcelable.Creator<AvatarInfo> CREATOR = new Creator();
    public static final int KWHzl = 0;
    public final String EZpvd;
    public final String OLrzqt;
    public final float copydefault;

    public static final class Creator implements Parcelable.Creator<AvatarInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AvatarInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AvatarInfo(parcel.readString(), parcel.readString(), parcel.readFloat());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AvatarInfo[] newArray(int i) {
            return new AvatarInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AvatarInfo copy$default(AvatarInfo avatarInfo, String str, String str2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = avatarInfo.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = avatarInfo.EZpvd;
        }
        if ((i & 4) != 0) {
            f = avatarInfo.copydefault;
        }
        return avatarInfo.copydefault(str, str2, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AvatarInfo copydefault(@NotNull String str, @NotNull String str2, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AvatarInfo(str, str2, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.OLrzqt;
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
        if (!(obj instanceof AvatarInfo)) {
            return false;
        }
        AvatarInfo avatarInfo = (AvatarInfo) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) avatarInfo.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) avatarInfo.EZpvd) && Float.compare(this.copydefault, avatarInfo.copydefault) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + Float.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AvatarInfo(avatarUrl=" + this.OLrzqt + ", displayName=" + this.EZpvd + ", fontSize=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.EZpvd);
        parcel.writeFloat(this.copydefault);
    }

    public AvatarInfo(@NotNull String str, @NotNull String str2, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = str;
        this.EZpvd = str2;
        this.copydefault = f;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (44.0f float) : (r3v0 float))
 A[MD:(java.lang.String, java.lang.String, float):void (m)] (LINE:97) call: com.okinc.im.widgets.AvatarInfo.<init>(java.lang.String, java.lang.String, float):void type: THIS */
    public /* synthetic */ AvatarInfo(String str, String str2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? 44.0f : f);
    }
}
