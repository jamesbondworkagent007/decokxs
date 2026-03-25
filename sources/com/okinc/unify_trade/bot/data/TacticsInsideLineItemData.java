package com.okinc.unify_trade.bot.data;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33052mpF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class TacticsInsideLineItemData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TacticsInsideLineItemData> CREATOR = new Creator();
    private int lineColor;
    private int marginBottom;
    private int marginTop;

    public static final class Creator implements Parcelable.Creator<TacticsInsideLineItemData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsInsideLineItemData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TacticsInsideLineItemData(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsInsideLineItemData[] newArray(int i) {
            return new TacticsInsideLineItemData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TacticsInsideLineItemData() {
        this(0, 0, 0, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TacticsInsideLineItemData copy$default(TacticsInsideLineItemData tacticsInsideLineItemData, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = tacticsInsideLineItemData.marginTop;
        }
        if ((i4 & 2) != 0) {
            i2 = tacticsInsideLineItemData.marginBottom;
        }
        if ((i4 & 4) != 0) {
            i3 = tacticsInsideLineItemData.lineColor;
        }
        return tacticsInsideLineItemData.copy(i, i2, i3);
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
    public final TacticsInsideLineItemData copy(int i, int i2, int i3) {
        return new TacticsInsideLineItemData(i, i2, i3);
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
        if (!(obj instanceof TacticsInsideLineItemData)) {
            return false;
        }
        TacticsInsideLineItemData tacticsInsideLineItemData = (TacticsInsideLineItemData) obj;
        return this.marginTop == tacticsInsideLineItemData.marginTop && this.marginBottom == tacticsInsideLineItemData.marginBottom && this.lineColor == tacticsInsideLineItemData.lineColor;
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
        return "TacticsInsideLineItemData(marginTop=" + this.marginTop + ", marginBottom=" + this.marginBottom + ", lineColor=" + this.lineColor + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.marginTop);
        parcel.writeInt(this.marginBottom);
        parcel.writeInt(this.lineColor);
    }

    public TacticsInsideLineItemData(int i, int i2, int i3) {
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
 STATIC call: o.mpF.dpInt$default(int, android.content.Context, int, java.lang.Object):int A[MD:(int, android.content.Context, int, java.lang.Object):int (m), WRAPPED] (LINE:1317)) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r7v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0010: INVOKE 
  (16 int)
  (wrap:android.content.Context:?: CAST (android.content.Context) (null android.content.Context))
  (1 int)
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (null java.lang.Object))
 STATIC call: o.mpF.dpInt$default(int, android.content.Context, int, java.lang.Object):int A[MD:(int, android.content.Context, int, java.lang.Object):int (m), WRAPPED] (LINE:1318)) : (r5v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0014: ARITH (r7v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 int))
 A[MD:(int, int, int):void (m)] (LINE:1316) call: com.okinc.unify_trade.bot.data.TacticsInsideLineItemData.<init>(int, int, int):void type: THIS */
    public /* synthetic */ TacticsInsideLineItemData(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? C33052mpF.dpInt$default(16, (Context) null, 1, (Object) null) : i, (i4 & 2) != 0 ? C33052mpF.dpInt$default(16, (Context) null, 1, (Object) null) : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
