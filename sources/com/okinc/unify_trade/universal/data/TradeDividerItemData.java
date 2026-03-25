package com.okinc.unify_trade.universal.data;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33052mpF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class TradeDividerItemData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TradeDividerItemData> CREATOR = new Creator();
    private int lineColor;
    private int marginBottom;
    private int marginTop;

    public static final class Creator implements Parcelable.Creator<TradeDividerItemData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeDividerItemData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TradeDividerItemData(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeDividerItemData[] newArray(int i) {
            return new TradeDividerItemData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeDividerItemData() {
        this(0, 0, 0, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TradeDividerItemData copy$default(TradeDividerItemData tradeDividerItemData, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = tradeDividerItemData.marginTop;
        }
        if ((i4 & 2) != 0) {
            i2 = tradeDividerItemData.marginBottom;
        }
        if ((i4 & 4) != 0) {
            i3 = tradeDividerItemData.lineColor;
        }
        return tradeDividerItemData.copy(i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.marginTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.marginBottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.lineColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeDividerItemData copy(int i, int i2, int i3) {
        return new TradeDividerItemData(i, i2, i3);
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
        if (!(obj instanceof TradeDividerItemData)) {
            return false;
        }
        TradeDividerItemData tradeDividerItemData = (TradeDividerItemData) obj;
        return this.marginTop == tradeDividerItemData.marginTop && this.marginBottom == tradeDividerItemData.marginBottom && this.lineColor == tradeDividerItemData.lineColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLineColor() {
        return this.lineColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMarginBottom() {
        return this.marginBottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMarginTop() {
        return this.marginTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.marginTop) * 31) + Integer.hashCode(this.marginBottom)) * 31) + Integer.hashCode(this.lineColor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLineColor(int i) {
        this.lineColor = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarginBottom(int i) {
        this.marginBottom = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarginTop(int i) {
        this.marginTop = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeDividerItemData(marginTop=" + this.marginTop + ", marginBottom=" + this.marginBottom + ", lineColor=" + this.lineColor + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.marginTop);
        parcel.writeInt(this.marginBottom);
        parcel.writeInt(this.lineColor);
    }

    public TradeDividerItemData(int i, int i2, int i3) {
        this.marginTop = i;
        this.marginBottom = i2;
        this.lineColor = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r7v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0008: INVOKE 
  (16 int)
  (wrap:android.content.Context:?: CAST (android.content.Context) (null android.content.Context))
  (1 int)
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (null java.lang.Object))
 STATIC call: o.mpF.dpInt$default(int, android.content.Context, int, java.lang.Object):int A[MD:(int, android.content.Context, int, java.lang.Object):int (m), WRAPPED] (LINE:55)) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r7v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0010: INVOKE 
  (16 int)
  (wrap:android.content.Context:?: CAST (android.content.Context) (null android.content.Context))
  (1 int)
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (null java.lang.Object))
 STATIC call: o.mpF.dpInt$default(int, android.content.Context, int, java.lang.Object):int A[MD:(int, android.content.Context, int, java.lang.Object):int (m), WRAPPED] (LINE:56)) : (r5v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0014: ARITH (r7v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 int))
 A[MD:(int, int, int):void (m)] (LINE:54) call: com.okinc.unify_trade.universal.data.TradeDividerItemData.<init>(int, int, int):void type: THIS */
    public /* synthetic */ TradeDividerItemData(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? C33052mpF.dpInt$default(16, (Context) null, 1, (Object) null) : i, (i4 & 2) != 0 ? C33052mpF.dpInt$default(16, (Context) null, 1, (Object) null) : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
