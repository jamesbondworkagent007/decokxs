package com.okinc.tradelite.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.ColorRes;
import androidx.annotation.StyleRes;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class ToolTipParams implements Parcelable {
    public static final Parcelable.Creator<ToolTipParams> CREATOR = new Creator();
    public String AEQbTJ;
    public Integer EZpvd;
    public ArrayList<ToolTipNote> KWHzl;
    public String OLrzqt;
    public Integer copydefault;
    public Integer djBIcL;
    public Integer valueOf;

    public static final class Creator implements Parcelable.Creator<ToolTipParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ToolTipParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ToolTipNote.CREATOR.createFromParcel(parcel));
                }
            }
            return new ToolTipParams(string, string2, numValueOf, numValueOf2, numValueOf3, numValueOf4, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ToolTipParams[] newArray(int i) {
            return new ToolTipParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ToolTipParams() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.tradelite.bean.ToolTipParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ToolTipParams copy$default(ToolTipParams toolTipParams, String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toolTipParams.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = toolTipParams.OLrzqt;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            num = toolTipParams.djBIcL;
        }
        Integer num5 = num;
        if ((i & 8) != 0) {
            num2 = toolTipParams.copydefault;
        }
        Integer num6 = num2;
        if ((i & 16) != 0) {
            num3 = toolTipParams.valueOf;
        }
        Integer num7 = num3;
        if ((i & 32) != 0) {
            num4 = toolTipParams.EZpvd;
        }
        Integer num8 = num4;
        if ((i & 64) != 0) {
            arrayList = toolTipParams.KWHzl;
        }
        return toolTipParams.KWHzl(str, str3, num5, num6, num7, num8, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ToolTipParams KWHzl(String str, String str2, @StyleRes Integer num, @StyleRes Integer num2, @ColorRes Integer num3, @ColorRes Integer num4, ArrayList<ToolTipNote> arrayList) {
        return new ToolTipParams(str, str2, num, num2, num3, num4, arrayList);
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
        if (!(obj instanceof ToolTipParams)) {
            return false;
        }
        ToolTipParams toolTipParams = (ToolTipParams) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) toolTipParams.AEQbTJ) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) toolTipParams.OLrzqt) && Intrinsics.EZpvd(this.djBIcL, toolTipParams.djBIcL) && Intrinsics.EZpvd(this.copydefault, toolTipParams.copydefault) && Intrinsics.EZpvd(this.valueOf, toolTipParams.valueOf) && Intrinsics.EZpvd(this.EZpvd, toolTipParams.EZpvd) && Intrinsics.EZpvd(this.KWHzl, toolTipParams.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.AEQbTJ;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.OLrzqt;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.djBIcL;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.copydefault;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.valueOf;
        int iHashCode5 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.EZpvd;
        int iHashCode6 = num4 == null ? 0 : num4.hashCode();
        ArrayList<ToolTipNote> arrayList = this.KWHzl;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (arrayList != null ? arrayList.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ToolTipParams(title=" + this.AEQbTJ + ", description=" + this.OLrzqt + ", titleStyle=" + this.djBIcL + ", descriptionStyle=" + this.copydefault + ", titleColor=" + this.valueOf + ", descriptionColor=" + this.EZpvd + ", noteList=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.OLrzqt);
        Integer num = this.djBIcL;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.copydefault;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.valueOf;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.EZpvd;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        ArrayList<ToolTipNote> arrayList = this.KWHzl;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<ToolTipNote> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public ToolTipParams(String str, String str2, @StyleRes Integer num, @StyleRes Integer num2, @ColorRes Integer num3, @ColorRes Integer num4, ArrayList<ToolTipNote> arrayList) {
        this.AEQbTJ = str;
        this.OLrzqt = str2;
        this.djBIcL = num;
        this.copydefault = num2;
        this.valueOf = num3;
        this.EZpvd = num4;
        this.KWHzl = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r10v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r12v0 java.lang.Integer))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r13v0 java.util.ArrayList))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.util.ArrayList<com.okinc.tradelite.bean.ToolTipNote>):void (m)] (LINE:9) call: com.okinc.tradelite.bean.ToolTipParams.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.util.ArrayList):void type: THIS */
    public /* synthetic */ ToolTipParams(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : num4, (i & 64) != 0 ? null : arrayList);
    }
}
