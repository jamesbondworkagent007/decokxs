package com.okinc.im.imui.group.joinreview.displaymodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.im.widgets.AvatarInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class JoinRequestDisplayModel implements Parcelable {
    public final boolean AEQbTJ;
    public final String AYXKKw;
    public final String EZpvd;
    public final String KWHzl;
    public final AvatarInfo copydefault;
    public final boolean valueOf;
    public static final int OLrzqt = AvatarInfo.KWHzl;
    public static final Parcelable.Creator<JoinRequestDisplayModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<JoinRequestDisplayModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JoinRequestDisplayModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new JoinRequestDisplayModel(parcel.readString(), (AvatarInfo) parcel.readParcelable(JoinRequestDisplayModel.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JoinRequestDisplayModel[] newArray(int i) {
            return new JoinRequestDisplayModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ JoinRequestDisplayModel copy$default(JoinRequestDisplayModel joinRequestDisplayModel, String str, AvatarInfo avatarInfo, String str2, String str3, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = joinRequestDisplayModel.KWHzl;
        }
        if ((i & 2) != 0) {
            avatarInfo = joinRequestDisplayModel.copydefault;
        }
        AvatarInfo avatarInfo2 = avatarInfo;
        if ((i & 4) != 0) {
            str2 = joinRequestDisplayModel.AYXKKw;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = joinRequestDisplayModel.EZpvd;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            z = joinRequestDisplayModel.valueOf;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = joinRequestDisplayModel.AEQbTJ;
        }
        return joinRequestDisplayModel.AEQbTJ(str, avatarInfo2, str4, str5, z3, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JoinRequestDisplayModel AEQbTJ(@NotNull String str, @NotNull AvatarInfo avatarInfo, @NotNull String str2, @NotNull String str3, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(avatarInfo, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new JoinRequestDisplayModel(str, avatarInfo, str2, str3, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AvatarInfo copydefault() {
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
        if (!(obj instanceof JoinRequestDisplayModel)) {
            return false;
        }
        JoinRequestDisplayModel joinRequestDisplayModel = (JoinRequestDisplayModel) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) joinRequestDisplayModel.KWHzl) && Intrinsics.EZpvd(this.copydefault, joinRequestDisplayModel.copydefault) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) joinRequestDisplayModel.AYXKKw) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) joinRequestDisplayModel.EZpvd) && this.valueOf == joinRequestDisplayModel.valueOf && this.AEQbTJ == joinRequestDisplayModel.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.KWHzl.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + Boolean.hashCode(this.valueOf)) * 31) + Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "JoinRequestDisplayModel(id=" + this.KWHzl + ", avatar=" + this.copydefault + ", name=" + this.AYXKKw + ", description=" + this.EZpvd + ", isSelected=" + this.valueOf + ", isLoading=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeParcelable(this.copydefault, i);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.EZpvd);
        parcel.writeInt(this.valueOf ? 1 : 0);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
    }

    public JoinRequestDisplayModel(@NotNull String str, @NotNull AvatarInfo avatarInfo, @NotNull String str2, @NotNull String str3, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(avatarInfo, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.KWHzl = str;
        this.copydefault = avatarInfo;
        this.AYXKKw = str2;
        this.EZpvd = str3;
        this.valueOf = z;
        this.AEQbTJ = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 com.okinc.im.widgets.AvatarInfo)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r14v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
 A[MD:(java.lang.String, com.okinc.im.widgets.AvatarInfo, java.lang.String, java.lang.String, boolean, boolean):void (m)] (LINE:8) call: com.okinc.im.imui.group.joinreview.displaymodel.JoinRequestDisplayModel.<init>(java.lang.String, com.okinc.im.widgets.AvatarInfo, java.lang.String, java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ JoinRequestDisplayModel(String str, AvatarInfo avatarInfo, String str2, String str3, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, avatarInfo, str2, str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
    }
}
