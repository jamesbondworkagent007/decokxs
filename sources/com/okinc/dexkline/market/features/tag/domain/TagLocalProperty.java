package com.okinc.dexkline.market.features.tag.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class TagLocalProperty implements Parcelable {
    public static final Parcelable.Creator<TagLocalProperty> CREATOR = new Creator();
    public final Float AEQbTJ;
    public final Float AYXKKw;
    public final Integer EZpvd;
    public final Integer KWHzl;
    public final Float OLrzqt;
    public final Integer copydefault;
    public final Integer djBIcL;

    public static final class Creator implements Parcelable.Creator<TagLocalProperty> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TagLocalProperty createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TagLocalProperty(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TagLocalProperty[] newArray(int i) {
            return new TagLocalProperty[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TagLocalProperty() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TagLocalProperty copy$default(TagLocalProperty tagLocalProperty, Float f, Float f2, Integer num, Integer num2, Integer num3, Integer num4, Float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = tagLocalProperty.OLrzqt;
        }
        if ((i & 2) != 0) {
            f2 = tagLocalProperty.AYXKKw;
        }
        Float f4 = f2;
        if ((i & 4) != 0) {
            num = tagLocalProperty.EZpvd;
        }
        Integer num5 = num;
        if ((i & 8) != 0) {
            num2 = tagLocalProperty.djBIcL;
        }
        Integer num6 = num2;
        if ((i & 16) != 0) {
            num3 = tagLocalProperty.KWHzl;
        }
        Integer num7 = num3;
        if ((i & 32) != 0) {
            num4 = tagLocalProperty.copydefault;
        }
        Integer num8 = num4;
        if ((i & 64) != 0) {
            f3 = tagLocalProperty.AEQbTJ;
        }
        return tagLocalProperty.EZpvd(f, f4, num5, num6, num7, num8, f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TagLocalProperty EZpvd(Float f, Float f2, Integer num, Integer num2, Integer num3, Integer num4, Float f3) {
        return new TagLocalProperty(f, f2, num, num2, num3, num4, f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float copydefault() {
        return this.AEQbTJ;
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
        if (!(obj instanceof TagLocalProperty)) {
            return false;
        }
        TagLocalProperty tagLocalProperty = (TagLocalProperty) obj;
        return Intrinsics.EZpvd(this.OLrzqt, tagLocalProperty.OLrzqt) && Intrinsics.EZpvd(this.AYXKKw, tagLocalProperty.AYXKKw) && Intrinsics.EZpvd(this.EZpvd, tagLocalProperty.EZpvd) && Intrinsics.EZpvd(this.djBIcL, tagLocalProperty.djBIcL) && Intrinsics.EZpvd(this.KWHzl, tagLocalProperty.KWHzl) && Intrinsics.EZpvd(this.copydefault, tagLocalProperty.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, tagLocalProperty.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Float f = this.OLrzqt;
        int iHashCode = f == null ? 0 : f.hashCode();
        Float f2 = this.AYXKKw;
        int iHashCode2 = f2 == null ? 0 : f2.hashCode();
        Integer num = this.EZpvd;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.djBIcL;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.KWHzl;
        int iHashCode5 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.copydefault;
        int iHashCode6 = num4 == null ? 0 : num4.hashCode();
        Float f3 = this.AEQbTJ;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (f3 != null ? f3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TagLocalProperty(devHoldingRatio=" + this.OLrzqt + ", suspiciousHoldingRatio=" + this.AYXKKw + ", sniperCount=" + this.EZpvd + ", verifiedSniperCount=" + this.djBIcL + ", launchedTokenCount=" + this.KWHzl + ", devCreateTokenCount=" + this.copydefault + ", bundleHoldingRatio=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Float f = this.OLrzqt;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.AYXKKw;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        Integer num = this.EZpvd;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.djBIcL;
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
        Integer num4 = this.copydefault;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Float f3 = this.AEQbTJ;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f3.floatValue());
        }
    }

    public TagLocalProperty(Float f, Float f2, Integer num, Integer num2, Integer num3, Integer num4, Float f3) {
        this.OLrzqt = f;
        this.AYXKKw = f2;
        this.EZpvd = num;
        this.djBIcL = num2;
        this.KWHzl = num3;
        this.copydefault = num4;
        this.AEQbTJ = f3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r7v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r8v0 java.lang.Float))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r10v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r12v0 java.lang.Integer))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r13v0 java.lang.Float))
 A[MD:(java.lang.Float, java.lang.Float, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Float):void (m)] (LINE:38) call: com.okinc.dexkline.market.features.tag.domain.TagLocalProperty.<init>(java.lang.Float, java.lang.Float, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Float):void type: THIS */
    public /* synthetic */ TagLocalProperty(Float f, Float f2, Integer num, Integer num2, Integer num3, Integer num4, Float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : num4, (i & 64) != 0 ? null : f3);
    }
}
