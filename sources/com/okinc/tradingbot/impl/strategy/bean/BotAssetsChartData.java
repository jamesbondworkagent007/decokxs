package com.okinc.tradingbot.impl.strategy.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotAssetsChartData implements Parcelable {
    public static final Parcelable.Creator<BotAssetsChartData> CREATOR = new Creator();
    public final String AEQbTJ;
    public final Entry EZpvd;
    public final List<Entry> KWHzl;
    public final boolean OLrzqt;
    public final Entry copydefault;

    public static final class Creator implements Parcelable.Creator<BotAssetsChartData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotAssetsChartData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Entry entry = (Entry) parcel.readParcelable(BotAssetsChartData.class.getClassLoader());
            Entry entry2 = (Entry) parcel.readParcelable(BotAssetsChartData.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(BotAssetsChartData.class.getClassLoader()));
            }
            return new BotAssetsChartData(entry, entry2, arrayList, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotAssetsChartData[] newArray(int i) {
            return new BotAssetsChartData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotAssetsChartData() {
        this(null, null, null, false, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.tradingbot.impl.strategy.bean.BotAssetsChartData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BotAssetsChartData copy$default(BotAssetsChartData botAssetsChartData, Entry entry, Entry entry2, List list, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            entry = botAssetsChartData.EZpvd;
        }
        if ((i & 2) != 0) {
            entry2 = botAssetsChartData.copydefault;
        }
        Entry entry3 = entry2;
        if ((i & 4) != 0) {
            list = botAssetsChartData.KWHzl;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            z = botAssetsChartData.OLrzqt;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str = botAssetsChartData.AEQbTJ;
        }
        return botAssetsChartData.KWHzl(entry, entry3, list2, z2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Entry EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Entry KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotAssetsChartData KWHzl(@NotNull Entry entry, @NotNull Entry entry2, @NotNull List<? extends Entry> list, boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(entry, "");
        Intrinsics.checkNotNullParameter(entry2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new BotAssetsChartData(entry, entry2, list, z, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Entry> copydefault() {
        return this.KWHzl;
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
        if (!(obj instanceof BotAssetsChartData)) {
            return false;
        }
        BotAssetsChartData botAssetsChartData = (BotAssetsChartData) obj;
        return Intrinsics.EZpvd(this.EZpvd, botAssetsChartData.EZpvd) && Intrinsics.EZpvd(this.copydefault, botAssetsChartData.copydefault) && Intrinsics.EZpvd(this.KWHzl, botAssetsChartData.KWHzl) && this.OLrzqt == botAssetsChartData.OLrzqt && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) botAssetsChartData.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.EZpvd.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotAssetsChartData(min=" + this.EZpvd + ", max=" + this.copydefault + ", total=" + this.KWHzl + ", isRise=" + this.OLrzqt + ", usdtRate=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.EZpvd, i);
        parcel.writeParcelable(this.copydefault, i);
        List<Entry> list = this.KWHzl;
        parcel.writeInt(list.size());
        Iterator<Entry> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeInt(this.OLrzqt ? 1 : 0);
        parcel.writeString(this.AEQbTJ);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.github.mikephil.charting.data.Entry> */
    /* JADX WARN: Multi-variable type inference failed */
    public BotAssetsChartData(@NotNull Entry entry, @NotNull Entry entry2, @NotNull List<? extends Entry> list, boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(entry, "");
        Intrinsics.checkNotNullParameter(entry2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = entry;
        this.copydefault = entry2;
        this.KWHzl = list;
        this.OLrzqt = z;
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
  (wrap:com.github.mikephil.charting.data.Entry:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.github.mikephil.charting.data.Entry:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:84) call: com.github.mikephil.charting.data.Entry.<init>():void type: CONSTRUCTOR) : (r4v0 com.github.mikephil.charting.data.Entry))
  (wrap:com.github.mikephil.charting.data.Entry:0x0012: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.github.mikephil.charting.data.Entry:0x000f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:85) call: com.github.mikephil.charting.data.Entry.<init>():void type: CONSTRUCTOR) : (r5v0 com.github.mikephil.charting.data.Entry))
  (wrap:java.util.List:0x001b: TERNARY null = ((wrap:int:0x0013: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0017: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:86)) : (r6v0 java.util.List))
  (wrap:boolean:0x0021: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r7v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("1") : (r8v0 java.lang.String))
 A[MD:(com.github.mikephil.charting.data.Entry, com.github.mikephil.charting.data.Entry, java.util.List<? extends com.github.mikephil.charting.data.Entry>, boolean, java.lang.String):void (m)] (LINE:83) call: com.okinc.tradingbot.impl.strategy.bean.BotAssetsChartData.<init>(com.github.mikephil.charting.data.Entry, com.github.mikephil.charting.data.Entry, java.util.List, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ BotAssetsChartData(Entry entry, Entry entry2, List list, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Entry() : entry, (i & 2) != 0 ? new Entry() : entry2, (i & 4) != 0 ? yDY.AhwBna() : list, (i & 8) != 0 ? true : z, (i & 16) != 0 ? "1" : str);
    }
}
