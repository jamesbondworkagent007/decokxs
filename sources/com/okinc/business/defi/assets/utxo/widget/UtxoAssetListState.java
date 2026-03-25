package com.okinc.business.defi.assets.utxo.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class UtxoAssetListState implements Parcelable {
    public static final Parcelable.Creator<UtxoAssetListState> CREATOR = new Creator();
    public final boolean AEQbTJ;
    public final Integer OLrzqt;
    public final List<UtxoAssetDisplayItem> copydefault;

    public static final class Creator implements Parcelable.Creator<UtxoAssetListState> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoAssetListState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(UtxoAssetDisplayItem.CREATOR.createFromParcel(parcel));
            }
            return new UtxoAssetListState(arrayList, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoAssetListState[] newArray(int i) {
            return new UtxoAssetListState[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.assets.utxo.widget.UtxoAssetListState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UtxoAssetListState copy$default(UtxoAssetListState utxoAssetListState, List list, boolean z, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = utxoAssetListState.copydefault;
        }
        if ((i & 2) != 0) {
            z = utxoAssetListState.AEQbTJ;
        }
        if ((i & 4) != 0) {
            num = utxoAssetListState.OLrzqt;
        }
        return utxoAssetListState.AEQbTJ(list, z, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UtxoAssetListState AEQbTJ(@NotNull List<UtxoAssetDisplayItem> list, boolean z, Integer num) {
        Intrinsics.checkNotNullParameter(list, "");
        return new UtxoAssetListState(list, z, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UtxoAssetDisplayItem> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
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
        if (!(obj instanceof UtxoAssetListState)) {
            return false;
        }
        UtxoAssetListState utxoAssetListState = (UtxoAssetListState) obj;
        return Intrinsics.EZpvd(this.copydefault, utxoAssetListState.copydefault) && this.AEQbTJ == utxoAssetListState.AEQbTJ && Intrinsics.EZpvd(this.OLrzqt, utxoAssetListState.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = Boolean.hashCode(this.AEQbTJ);
        Integer num = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UtxoAssetListState(items=" + this.copydefault + ", noMoreData=" + this.AEQbTJ + ", page=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        List<UtxoAssetDisplayItem> list = this.copydefault;
        parcel.writeInt(list.size());
        Iterator<UtxoAssetDisplayItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        Integer num = this.OLrzqt;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public UtxoAssetListState(@NotNull List<UtxoAssetDisplayItem> list, boolean z, Integer num) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
        this.AEQbTJ = z;
        this.OLrzqt = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 java.util.List)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
 A[MD:(java.util.List<com.okinc.business.defi.assets.utxo.widget.UtxoAssetDisplayItem>, boolean, java.lang.Integer):void (m)] (LINE:9) call: com.okinc.business.defi.assets.utxo.widget.UtxoAssetListState.<init>(java.util.List, boolean, java.lang.Integer):void type: THIS */
    public /* synthetic */ UtxoAssetListState(List list, boolean z, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : num);
    }
}
