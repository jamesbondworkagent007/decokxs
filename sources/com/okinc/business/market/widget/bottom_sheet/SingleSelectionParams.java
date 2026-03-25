package com.okinc.business.market.widget.bottom_sheet;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class SingleSelectionParams implements Parcelable {
    public static final Parcelable.Creator<SingleSelectionParams> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String EZpvd;
    public final List<SingleSelectionUiModel> copydefault;

    public static final class Creator implements Parcelable.Creator<SingleSelectionParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SingleSelectionParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SingleSelectionUiModel.CREATOR.createFromParcel(parcel));
            }
            return new SingleSelectionParams(arrayList, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SingleSelectionParams[] newArray(int i) {
            return new SingleSelectionParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SingleSelectionParams() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.widget.bottom_sheet.SingleSelectionParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SingleSelectionParams copy$default(SingleSelectionParams singleSelectionParams, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = singleSelectionParams.copydefault;
        }
        if ((i & 2) != 0) {
            str = singleSelectionParams.AEQbTJ;
        }
        if ((i & 4) != 0) {
            str2 = singleSelectionParams.EZpvd;
        }
        return singleSelectionParams.OLrzqt(list, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SingleSelectionUiModel> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SingleSelectionParams OLrzqt(@NotNull List<SingleSelectionUiModel> list, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SingleSelectionParams(list, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
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
        if (!(obj instanceof SingleSelectionParams)) {
            return false;
        }
        SingleSelectionParams singleSelectionParams = (SingleSelectionParams) obj;
        return Intrinsics.EZpvd(this.copydefault, singleSelectionParams.copydefault) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) singleSelectionParams.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) singleSelectionParams.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SingleSelectionParams(options=" + this.copydefault + ", source=" + this.AEQbTJ + ", selectedKey=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<SingleSelectionUiModel> list = this.copydefault;
        parcel.writeInt(list.size());
        Iterator<SingleSelectionUiModel> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.EZpvd);
    }

    public SingleSelectionParams(@NotNull List<SingleSelectionUiModel> list, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = list;
        this.AEQbTJ = str;
        this.EZpvd = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:33)) : (r2v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.business.market.widget.bottom_sheet.SingleSelectionUiModel>, java.lang.String, java.lang.String):void (m)] (LINE:32) call: com.okinc.business.market.widget.bottom_sheet.SingleSelectionParams.<init>(java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SingleSelectionParams(List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
