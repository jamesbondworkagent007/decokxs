package com.okinc.tradelite.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.ColorRes;
import androidx.annotation.StyleRes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class ToolTipNote implements Parcelable {
    public static final Parcelable.Creator<ToolTipNote> CREATOR = new Creator();
    public Integer AEQbTJ;
    public Integer AYXKKw;
    public String EZpvd;
    public Integer KWHzl;
    public Integer OLrzqt;
    public String copydefault;
    public Integer valueOf;

    public static final class Creator implements Parcelable.Creator<ToolTipNote> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ToolTipNote createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ToolTipNote(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ToolTipNote[] newArray(int i) {
            return new ToolTipNote[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ToolTipNote() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ToolTipNote copy$default(ToolTipNote toolTipNote, String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toolTipNote.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = toolTipNote.copydefault;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            num = toolTipNote.OLrzqt;
        }
        Integer num6 = num;
        if ((i & 8) != 0) {
            num2 = toolTipNote.valueOf;
        }
        Integer num7 = num2;
        if ((i & 16) != 0) {
            num3 = toolTipNote.KWHzl;
        }
        Integer num8 = num3;
        if ((i & 32) != 0) {
            num4 = toolTipNote.AYXKKw;
        }
        Integer num9 = num4;
        if ((i & 64) != 0) {
            num5 = toolTipNote.AEQbTJ;
        }
        return toolTipNote.KWHzl(str, str3, num6, num7, num8, num9, num5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ToolTipNote KWHzl(String str, String str2, @StyleRes Integer num, @StyleRes Integer num2, @ColorRes Integer num3, @ColorRes Integer num4, Integer num5) {
        return new ToolTipNote(str, str2, num, num2, num3, num4, num5);
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
        if (!(obj instanceof ToolTipNote)) {
            return false;
        }
        ToolTipNote toolTipNote = (ToolTipNote) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) toolTipNote.EZpvd) && Intrinsics.EZpvd((Object) this.copydefault, (Object) toolTipNote.copydefault) && Intrinsics.EZpvd(this.OLrzqt, toolTipNote.OLrzqt) && Intrinsics.EZpvd(this.valueOf, toolTipNote.valueOf) && Intrinsics.EZpvd(this.KWHzl, toolTipNote.KWHzl) && Intrinsics.EZpvd(this.AYXKKw, toolTipNote.AYXKKw) && Intrinsics.EZpvd(this.AEQbTJ, toolTipNote.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.EZpvd;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.copydefault;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.OLrzqt;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.valueOf;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.KWHzl;
        int iHashCode5 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.AYXKKw;
        int iHashCode6 = num4 == null ? 0 : num4.hashCode();
        Integer num5 = this.AEQbTJ;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (num5 != null ? num5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ToolTipNote(label=" + this.EZpvd + ", value=" + this.copydefault + ", labelStyle=" + this.OLrzqt + ", valueStyle=" + this.valueOf + ", labelColor=" + this.KWHzl + ", valueColor=" + this.AYXKKw + ", spacing=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.copydefault);
        Integer num = this.OLrzqt;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.valueOf;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.KWHzl;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.AYXKKw;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.AEQbTJ;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
    }

    public ToolTipNote(String str, String str2, @StyleRes Integer num, @StyleRes Integer num2, @ColorRes Integer num3, @ColorRes Integer num4, Integer num5) {
        this.EZpvd = str;
        this.copydefault = str2;
        this.OLrzqt = num;
        this.valueOf = num2;
        this.KWHzl = num3;
        this.AYXKKw = num4;
        this.AEQbTJ = num5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r10v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r12v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r13v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer):void (m)] (LINE:20) call: com.okinc.tradelite.bean.ToolTipNote.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ ToolTipNote(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : num4, (i & 64) != 0 ? null : num5);
    }
}
