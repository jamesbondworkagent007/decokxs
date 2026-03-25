package com.okinc.business.market.features.meme.ui.views;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class ToolButton implements Parcelable {
    public static final Parcelable.Creator<ToolButton> CREATOR = new Creator();
    public final String AEQbTJ;
    public final Integer EZpvd;
    public final Integer KWHzl;
    public final String OLrzqt;
    public final Parcelable copydefault;

    public static final class Creator implements Parcelable.Creator<ToolButton> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ToolButton createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ToolButton(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readParcelable(ToolButton.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ToolButton[] newArray(int i) {
            return new ToolButton[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ToolButton() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ToolButton copy$default(ToolButton toolButton, Integer num, Integer num2, String str, String str2, Parcelable parcelable, int i, Object obj) {
        if ((i & 1) != 0) {
            num = toolButton.EZpvd;
        }
        if ((i & 2) != 0) {
            num2 = toolButton.KWHzl;
        }
        Integer num3 = num2;
        if ((i & 4) != 0) {
            str = toolButton.OLrzqt;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = toolButton.AEQbTJ;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            parcelable = toolButton.copydefault;
        }
        return toolButton.EZpvd(num, num3, str3, str4, parcelable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Parcelable EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ToolButton EZpvd(@DrawableRes Integer num, @ColorInt Integer num2, @NotNull String str, @NotNull String str2, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ToolButton(num, num2, str, str2, parcelable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer OLrzqt() {
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
        if (!(obj instanceof ToolButton)) {
            return false;
        }
        ToolButton toolButton = (ToolButton) obj;
        return Intrinsics.EZpvd(this.EZpvd, toolButton.EZpvd) && Intrinsics.EZpvd(this.KWHzl, toolButton.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) toolButton.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) toolButton.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, toolButton.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.EZpvd;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.KWHzl;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        int iHashCode3 = this.OLrzqt.hashCode();
        int iHashCode4 = this.AEQbTJ.hashCode();
        Parcelable parcelable = this.copydefault;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (parcelable != null ? parcelable.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ToolButton(icon=" + this.EZpvd + ", tint=" + this.KWHzl + ", text=" + this.OLrzqt + ", key=" + this.AEQbTJ + ", extras=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.EZpvd;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.KWHzl;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.AEQbTJ);
        parcel.writeParcelable(this.copydefault, i);
    }

    public ToolButton(@DrawableRes Integer num, @ColorInt Integer num2, @NotNull String str, @NotNull String str2, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = num;
        this.KWHzl = num2;
        this.OLrzqt = str;
        this.AEQbTJ = str2;
        this.copydefault = parcelable;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r6v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:android.os.Parcelable:?: TERNARY null = ((wrap:int:0x001f: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null android.os.Parcelable) : (r9v0 android.os.Parcelable))
 A[MD:(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, android.os.Parcelable):void (m)] (LINE:28) call: com.okinc.business.market.features.meme.ui.views.ToolButton.<init>(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, android.os.Parcelable):void type: THIS */
    public /* synthetic */ ToolButton(Integer num, Integer num2, String str, String str2, Parcelable parcelable, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : parcelable);
    }
}
