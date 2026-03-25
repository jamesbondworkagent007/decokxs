package com.okinc.business.market.features.home_favorite_list.ui.edit;

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
public final class WatchlistEditParams implements Parcelable {
    public final String AEQbTJ;
    public final int EZpvd;
    public final List<Integer> OLrzqt;
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public static final Parcelable.Creator<WatchlistEditParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<WatchlistEditParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WatchlistEditParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new WatchlistEditParams(string, i, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WatchlistEditParams[] newArray(int i) {
            return new WatchlistEditParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.home_favorite_list.ui.edit.WatchlistEditParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WatchlistEditParams copy$default(WatchlistEditParams watchlistEditParams, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = watchlistEditParams.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            i = watchlistEditParams.EZpvd;
        }
        if ((i2 & 4) != 0) {
            list = watchlistEditParams.OLrzqt;
        }
        return watchlistEditParams.OLrzqt(str, i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WatchlistEditParams OLrzqt(@NotNull String str, int i, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new WatchlistEditParams(str, i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
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
        if (!(obj instanceof WatchlistEditParams)) {
            return false;
        }
        WatchlistEditParams watchlistEditParams = (WatchlistEditParams) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) watchlistEditParams.AEQbTJ) && this.EZpvd == watchlistEditParams.EZpvd && Intrinsics.EZpvd(this.OLrzqt, watchlistEditParams.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + Integer.hashCode(this.EZpvd)) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WatchlistEditParams(chainId=" + this.AEQbTJ + ", groupId=" + this.EZpvd + ", groups=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeInt(this.EZpvd);
        List<Integer> list = this.OLrzqt;
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
    }

    public WatchlistEditParams(@NotNull String str, int i, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = str;
        this.EZpvd = i;
        this.OLrzqt = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 int)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:10)) : (r3v0 java.util.List))
 A[MD:(java.lang.String, int, java.util.List<java.lang.Integer>):void (m)] (LINE:7) call: com.okinc.business.market.features.home_favorite_list.ui.edit.WatchlistEditParams.<init>(java.lang.String, int, java.util.List):void type: THIS */
    public /* synthetic */ WatchlistEditParams(String str, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? yDY.AhwBna() : list);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.home_favorite_list.ui.edit.WatchlistEditParams.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
