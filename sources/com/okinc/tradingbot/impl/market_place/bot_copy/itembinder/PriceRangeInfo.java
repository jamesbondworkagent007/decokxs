package com.okinc.tradingbot.impl.market_place.bot_copy.itembinder;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.RecurringListItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class PriceRangeInfo implements Parcelable {
    public static final Parcelable.Creator<PriceRangeInfo> CREATOR = new Creator();
    public final String AEQbTJ;
    public final List<RecurringListItem> EZpvd;
    public final boolean KWHzl;
    public String OLrzqt;
    public boolean copydefault;

    public static final class Creator implements Parcelable.Creator<PriceRangeInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriceRangeInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(PriceRangeInfo.class.getClassLoader()));
            }
            return new PriceRangeInfo(string, string2, arrayList, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PriceRangeInfo[] newArray(int i) {
            return new PriceRangeInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.PriceRangeInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PriceRangeInfo copy$default(PriceRangeInfo priceRangeInfo, String str, String str2, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = priceRangeInfo.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = priceRangeInfo.AEQbTJ;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            list = priceRangeInfo.EZpvd;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            z = priceRangeInfo.KWHzl;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = priceRangeInfo.copydefault;
        }
        return priceRangeInfo.OLrzqt(str, str3, list2, z3, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRangeInfo OLrzqt(@NotNull String str, @NotNull String str2, @NotNull List<RecurringListItem> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new PriceRangeInfo(str, str2, list, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RecurringListItem> copydefault() {
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
        if (!(obj instanceof PriceRangeInfo)) {
            return false;
        }
        PriceRangeInfo priceRangeInfo = (PriceRangeInfo) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) priceRangeInfo.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) priceRangeInfo.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, priceRangeInfo.EZpvd) && this.KWHzl == priceRangeInfo.KWHzl && this.copydefault == priceRangeInfo.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + Boolean.hashCode(this.KWHzl)) * 31) + Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PriceRangeInfo(title=" + this.OLrzqt + ", investCcy=" + this.AEQbTJ + ", recurringList=" + this.EZpvd + ", showAllDrawable=" + this.KWHzl + ", showAll=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.AEQbTJ);
        List<RecurringListItem> list = this.EZpvd;
        parcel.writeInt(list.size());
        Iterator<RecurringListItem> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        parcel.writeInt(this.KWHzl ? 1 : 0);
        parcel.writeInt(this.copydefault ? 1 : 0);
    }

    public PriceRangeInfo(@NotNull String str, @NotNull String str2, @NotNull List<RecurringListItem> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = str;
        this.AEQbTJ = str2;
        this.EZpvd = list;
        this.KWHzl = z;
        this.copydefault = z2;
    }
}
