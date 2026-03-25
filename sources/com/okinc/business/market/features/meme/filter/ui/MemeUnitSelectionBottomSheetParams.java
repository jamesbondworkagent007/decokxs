package com.okinc.business.market.features.meme.filter.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.features.meme.selection_filter.MemeSelection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeUnitSelectionBottomSheetParams implements Parcelable {
    public static final Parcelable.Creator<MemeUnitSelectionBottomSheetParams> CREATOR = new Creator();
    public final String EZpvd;
    public final List<MemeSelection> OLrzqt;

    public static final class Creator implements Parcelable.Creator<MemeUnitSelectionBottomSheetParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeUnitSelectionBottomSheetParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(MemeSelection.CREATOR.createFromParcel(parcel));
            }
            return new MemeUnitSelectionBottomSheetParams(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeUnitSelectionBottomSheetParams[] newArray(int i) {
            return new MemeUnitSelectionBottomSheetParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MemeUnitSelectionBottomSheetParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.meme.filter.ui.MemeUnitSelectionBottomSheetParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MemeUnitSelectionBottomSheetParams copy$default(MemeUnitSelectionBottomSheetParams memeUnitSelectionBottomSheetParams, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = memeUnitSelectionBottomSheetParams.EZpvd;
        }
        if ((i & 2) != 0) {
            list = memeUnitSelectionBottomSheetParams.OLrzqt;
        }
        return memeUnitSelectionBottomSheetParams.copydefault(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeUnitSelectionBottomSheetParams copydefault(@NotNull String str, @NotNull List<MemeSelection> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new MemeUnitSelectionBottomSheetParams(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MemeSelection> copydefault() {
        return this.OLrzqt;
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
        if (!(obj instanceof MemeUnitSelectionBottomSheetParams)) {
            return false;
        }
        MemeUnitSelectionBottomSheetParams memeUnitSelectionBottomSheetParams = (MemeUnitSelectionBottomSheetParams) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) memeUnitSelectionBottomSheetParams.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, memeUnitSelectionBottomSheetParams.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeUnitSelectionBottomSheetParams(title=" + this.EZpvd + ", selection=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        List<MemeSelection> list = this.OLrzqt;
        parcel.writeInt(list.size());
        Iterator<MemeSelection> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public MemeUnitSelectionBottomSheetParams(@NotNull String str, @NotNull List<MemeSelection> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = str;
        this.OLrzqt = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:26)) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.market.features.meme.selection_filter.MemeSelection>):void (m)] (LINE:24) call: com.okinc.business.market.features.meme.filter.ui.MemeUnitSelectionBottomSheetParams.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ MemeUnitSelectionBottomSheetParams(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list);
    }
}
