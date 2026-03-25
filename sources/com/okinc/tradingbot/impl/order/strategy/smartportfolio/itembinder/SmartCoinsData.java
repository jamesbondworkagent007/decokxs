package com.okinc.tradingbot.impl.order.strategy.smartportfolio.itembinder;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.bot.data.DistributeItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartCoinsData implements Parcelable {
    public static final Parcelable.Creator<SmartCoinsData> CREATOR = new Creator();
    public boolean EZpvd;
    public final float KWHzl;
    public final List<DistributeItem> OLrzqt;
    public String copydefault;

    public static final class Creator implements Parcelable.Creator<SmartCoinsData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartCoinsData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(SmartCoinsData.class.getClassLoader()));
            }
            return new SmartCoinsData(string, arrayList, parcel.readInt() != 0, parcel.readFloat());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartCoinsData[] newArray(int i) {
            return new SmartCoinsData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.order.strategy.smartportfolio.itembinder.SmartCoinsData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SmartCoinsData copy$default(SmartCoinsData smartCoinsData, String str, List list, boolean z, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = smartCoinsData.copydefault;
        }
        if ((i & 2) != 0) {
            list = smartCoinsData.OLrzqt;
        }
        if ((i & 4) != 0) {
            z = smartCoinsData.EZpvd;
        }
        if ((i & 8) != 0) {
            f = smartCoinsData.KWHzl;
        }
        return smartCoinsData.copydefault(str, list, z, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DistributeItem> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartCoinsData copydefault(@NotNull String str, @NotNull List<DistributeItem> list, boolean z, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new SmartCoinsData(str, list, z, f);
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
        if (!(obj instanceof SmartCoinsData)) {
            return false;
        }
        SmartCoinsData smartCoinsData = (SmartCoinsData) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) smartCoinsData.copydefault) && Intrinsics.EZpvd(this.OLrzqt, smartCoinsData.OLrzqt) && this.EZpvd == smartCoinsData.EZpvd && Float.compare(this.KWHzl, smartCoinsData.KWHzl) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + Boolean.hashCode(this.EZpvd)) * 31) + Float.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmartCoinsData(title=" + this.copydefault + ", distributeList=" + this.OLrzqt + ", showAll=" + this.EZpvd + ", topMargin=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        List<DistributeItem> list = this.OLrzqt;
        parcel.writeInt(list.size());
        Iterator<DistributeItem> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeInt(this.EZpvd ? 1 : 0);
        parcel.writeFloat(this.KWHzl);
    }

    public SmartCoinsData(@NotNull String str, @NotNull List<DistributeItem> list, boolean z, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = str;
        this.OLrzqt = list;
        this.EZpvd = z;
        this.KWHzl = f;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (r2v0 java.util.List)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:float:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (6.0f float) : (r4v0 float))
 A[MD:(java.lang.String, java.util.List<com.okinc.unify_trade.bot.data.DistributeItem>, boolean, float):void (m)] (LINE:127) call: com.okinc.tradingbot.impl.order.strategy.smartportfolio.itembinder.SmartCoinsData.<init>(java.lang.String, java.util.List, boolean, float):void type: THIS */
    public /* synthetic */ SmartCoinsData(String str, List list, boolean z, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? 6.0f : f);
    }
}
