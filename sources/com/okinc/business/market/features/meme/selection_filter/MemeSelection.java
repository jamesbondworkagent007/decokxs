package com.okinc.business.market.features.meme.selection_filter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.DrawableRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeSelection implements Parcelable {
    public static final Parcelable.Creator<MemeSelection> CREATOR = new Creator();
    public final String AEQbTJ;
    public final boolean AhwBna;
    public final Integer EZpvd;
    public final String KWHzl;
    public final Integer OLrzqt;
    public final String copydefault;
    public final String gEmmrt;

    public static final class Creator implements Parcelable.Creator<MemeSelection> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeSelection createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MemeSelection(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeSelection[] newArray(int i) {
            return new MemeSelection[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MemeSelection copy$default(MemeSelection memeSelection, String str, Integer num, String str2, Integer num2, boolean z, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = memeSelection.gEmmrt;
        }
        if ((i & 2) != 0) {
            num = memeSelection.OLrzqt;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            str2 = memeSelection.KWHzl;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            num2 = memeSelection.EZpvd;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            z = memeSelection.AhwBna;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str3 = memeSelection.AEQbTJ;
        }
        String str6 = str3;
        if ((i & 64) != 0) {
            str4 = memeSelection.copydefault;
        }
        return memeSelection.KWHzl(str, num3, str5, num4, z2, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeSelection KWHzl(@NotNull String str, @DrawableRes Integer num, @NotNull String str2, @DrawableRes Integer num2, boolean z, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new MemeSelection(str, num, str2, num2, z, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer copydefault() {
        return this.OLrzqt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemeSelection)) {
            return false;
        }
        MemeSelection memeSelection = (MemeSelection) obj;
        return Intrinsics.EZpvd((Object) this.gEmmrt, (Object) memeSelection.gEmmrt) && Intrinsics.EZpvd(this.OLrzqt, memeSelection.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) memeSelection.KWHzl) && Intrinsics.EZpvd(this.EZpvd, memeSelection.EZpvd) && this.AhwBna == memeSelection.AhwBna && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) memeSelection.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) memeSelection.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gEmmrt.hashCode();
        Integer num = this.OLrzqt;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        int iHashCode3 = this.KWHzl.hashCode();
        Integer num2 = this.EZpvd;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + Boolean.hashCode(this.AhwBna)) * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeSelection(title=" + this.gEmmrt + ", icon=" + this.OLrzqt + ", iconUrl=" + this.KWHzl + ", iconPlaceholder=" + this.EZpvd + ", selected=" + this.AhwBna + ", key=" + this.AEQbTJ + ", contentDescription=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.gEmmrt);
        Integer num = this.OLrzqt;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.KWHzl);
        Integer num2 = this.EZpvd;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeInt(this.AhwBna ? 1 : 0);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.copydefault);
    }

    public MemeSelection(@NotNull String str, @DrawableRes Integer num, @NotNull String str2, @DrawableRes Integer num2, boolean z, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.gEmmrt = str;
        this.OLrzqt = num;
        this.KWHzl = str2;
        this.EZpvd = num2;
        this.AhwBna = z;
        this.AEQbTJ = str3;
        this.copydefault = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r15v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r15v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0011: ARITH (r15v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r11v0 java.lang.Integer) : (null java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0017: ARITH (r15v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r15v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r15v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r14v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, boolean, java.lang.String, java.lang.String):void (m)] (LINE:19) call: com.okinc.business.market.features.meme.selection_filter.MemeSelection.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MemeSelection(String str, Integer num, String str2, Integer num2, boolean z, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? num2 : null, (i & 16) != 0 ? false : z, (i & 32) != 0 ? "" : str3, (i & 64) == 0 ? str4 : "");
    }
}
