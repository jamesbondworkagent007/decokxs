package com.okinc.kline.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class TrendlineBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TrendlineBean> CREATOR = new Creator();
    private String color;
    private int linestyle;
    private int linewidth;
    private boolean visible;

    public static final class Creator implements Parcelable.Creator<TrendlineBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrendlineBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TrendlineBean(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrendlineBean[] newArray(int i) {
            return new TrendlineBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TrendlineBean() {
        this(null, 0, 0, false, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TrendlineBean copy$default(TrendlineBean trendlineBean, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = trendlineBean.color;
        }
        if ((i3 & 2) != 0) {
            i = trendlineBean.linestyle;
        }
        if ((i3 & 4) != 0) {
            i2 = trendlineBean.linewidth;
        }
        if ((i3 & 8) != 0) {
            z = trendlineBean.visible;
        }
        return trendlineBean.copy(str, i, i2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.color;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.linestyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.linewidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.visible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrendlineBean copy(@NotNull String str, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TrendlineBean(str, i, i2, z);
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
        if (!(obj instanceof TrendlineBean)) {
            return false;
        }
        TrendlineBean trendlineBean = (TrendlineBean) obj;
        return Intrinsics.EZpvd((Object) this.color, (Object) trendlineBean.color) && this.linestyle == trendlineBean.linestyle && this.linewidth == trendlineBean.linewidth && this.visible == trendlineBean.visible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getColor() {
        return this.color;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLinestyle() {
        return this.linestyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLinewidth() {
        return this.linewidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getVisible() {
        return this.visible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.color.hashCode() * 31) + Integer.hashCode(this.linestyle)) * 31) + Integer.hashCode(this.linewidth)) * 31) + Boolean.hashCode(this.visible);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.color = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLinestyle(int i) {
        this.linestyle = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLinewidth(int i) {
        this.linewidth = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVisible(boolean z) {
        this.visible = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrendlineBean(color=" + this.color + ", linestyle=" + this.linestyle + ", linewidth=" + this.linewidth + ", visible=" + this.visible + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.color);
        parcel.writeInt(this.linestyle);
        parcel.writeInt(this.linewidth);
        parcel.writeInt(this.visible ? 1 : 0);
    }

    public TrendlineBean(@NotNull String str, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.color = str;
        this.linestyle = i;
        this.linewidth = i2;
        this.visible = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("#787B86") : (r2v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r4v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r5v0 boolean))
 A[MD:(java.lang.String, int, int, boolean):void (m)] (LINE:177) call: com.okinc.kline.data.TrendlineBean.<init>(java.lang.String, int, int, boolean):void type: THIS */
    public /* synthetic */ TrendlineBean(String str, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "#787B86" : str, (i3 & 2) != 0 ? 2 : i, (i3 & 4) != 0 ? 1 : i2, (i3 & 8) != 0 ? true : z);
    }
}
