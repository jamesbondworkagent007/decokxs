package com.okinc.business.market.features.meme.selection_filter;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeSelectionParams implements Parcelable {
    public static final Parcelable.Creator<MemeSelectionParams> CREATOR = new Creator();
    public final String EZpvd;
    public final int KWHzl;
    public final List<MemeSelection> copydefault;

    public static final class Creator implements Parcelable.Creator<MemeSelectionParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeSelectionParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(MemeSelection.CREATOR.createFromParcel(parcel));
            }
            return new MemeSelectionParams(arrayList, parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeSelectionParams[] newArray(int i) {
            return new MemeSelectionParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MemeSelectionParams() {
        this(null, null, 0, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.meme.selection_filter.MemeSelectionParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MemeSelectionParams copy$default(MemeSelectionParams memeSelectionParams, List list, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = memeSelectionParams.copydefault;
        }
        if ((i2 & 2) != 0) {
            str = memeSelectionParams.EZpvd;
        }
        if ((i2 & 4) != 0) {
            i = memeSelectionParams.KWHzl;
        }
        return memeSelectionParams.KWHzl(list, str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeSelectionParams KWHzl(@NotNull List<MemeSelection> list, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new MemeSelectionParams(list, str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MemeSelection> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
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
        if (!(obj instanceof MemeSelectionParams)) {
            return false;
        }
        MemeSelectionParams memeSelectionParams = (MemeSelectionParams) obj;
        return Intrinsics.EZpvd(this.copydefault, memeSelectionParams.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) memeSelectionParams.EZpvd) && this.KWHzl == memeSelectionParams.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.copydefault.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + Integer.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeSelectionParams(items=" + this.copydefault + ", title=" + this.EZpvd + ", tabId=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<MemeSelection> list = this.copydefault;
        parcel.writeInt(list.size());
        Iterator<MemeSelection> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.EZpvd);
        parcel.writeInt(this.KWHzl);
    }

    public MemeSelectionParams(@NotNull List<MemeSelection> list, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = list;
        this.EZpvd = str;
        this.KWHzl = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:33)) : (r1v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000e: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(java.util.List<com.okinc.business.market.features.meme.selection_filter.MemeSelection>, java.lang.String, int):void (m)] (LINE:32) call: com.okinc.business.market.features.meme.selection_filter.MemeSelectionParams.<init>(java.util.List, java.lang.String, int):void type: THIS */
    public /* synthetic */ MemeSelectionParams(List list, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? yDY.AhwBna() : list, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i);
    }
}
