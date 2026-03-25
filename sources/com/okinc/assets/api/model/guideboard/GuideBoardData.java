package com.okinc.assets.api.model.guideboard;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class GuideBoardData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<GuideBoardData> CREATOR = new Creator();
    private final List<EarnApy> earnOffers;
    private final List<TickerData> tickers;

    public static final class Creator implements Parcelable.Creator<GuideBoardData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GuideBoardData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(EarnApy.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(TickerData.CREATOR.createFromParcel(parcel));
            }
            return new GuideBoardData(arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GuideBoardData[] newArray(int i) {
            return new GuideBoardData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GuideBoardData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.api.model.guideboard.GuideBoardData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GuideBoardData copy$default(GuideBoardData guideBoardData, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = guideBoardData.earnOffers;
        }
        if ((i & 2) != 0) {
            list2 = guideBoardData.tickers;
        }
        return guideBoardData.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EarnApy> component1() {
        return this.earnOffers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TickerData> component2() {
        return this.tickers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GuideBoardData copy(@NotNull List<EarnApy> list, @NotNull List<TickerData> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new GuideBoardData(list, list2);
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
        if (!(obj instanceof GuideBoardData)) {
            return false;
        }
        GuideBoardData guideBoardData = (GuideBoardData) obj;
        return Intrinsics.EZpvd(this.earnOffers, guideBoardData.earnOffers) && Intrinsics.EZpvd(this.tickers, guideBoardData.tickers);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EarnApy> getEarnOffers() {
        return this.earnOffers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TickerData> getTickers() {
        return this.tickers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.earnOffers.hashCode() * 31) + this.tickers.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GuideBoardData(earnOffers=" + this.earnOffers + ", tickers=" + this.tickers + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<EarnApy> list = this.earnOffers;
        parcel.writeInt(list.size());
        Iterator<EarnApy> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<TickerData> list2 = this.tickers;
        parcel.writeInt(list2.size());
        Iterator<TickerData> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public GuideBoardData(@NotNull List<EarnApy> list, @NotNull List<TickerData> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.earnOffers = list;
        this.tickers = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:10)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:11)) : (r2v0 java.util.List))
 A[MD:(java.util.List<com.okinc.assets.api.model.guideboard.EarnApy>, java.util.List<com.okinc.assets.api.model.guideboard.TickerData>):void (m)] (LINE:9) call: com.okinc.assets.api.model.guideboard.GuideBoardData.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ GuideBoardData(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2);
    }
}
