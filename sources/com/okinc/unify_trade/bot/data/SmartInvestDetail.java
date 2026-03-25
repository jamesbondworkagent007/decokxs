package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class SmartInvestDetail implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SmartInvestDetail> CREATOR = new Creator();
    private List<SmartInvestData> investList;
    private final String totalInvestPx;
    private final String totalQuoteInvestPx;

    public static final class Creator implements Parcelable.Creator<SmartInvestDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartInvestDetail createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SmartInvestData.CREATOR.createFromParcel(parcel));
            }
            return new SmartInvestDetail(string, string2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartInvestDetail[] newArray(int i) {
            return new SmartInvestDetail[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.bot.data.SmartInvestDetail */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SmartInvestDetail copy$default(SmartInvestDetail smartInvestDetail, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = smartInvestDetail.totalInvestPx;
        }
        if ((i & 2) != 0) {
            str2 = smartInvestDetail.totalQuoteInvestPx;
        }
        if ((i & 4) != 0) {
            list = smartInvestDetail.investList;
        }
        return smartInvestDetail.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.totalInvestPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.totalQuoteInvestPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SmartInvestData> component3() {
        return this.investList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartInvestDetail copy(@NotNull String str, @NotNull String str2, @NotNull List<SmartInvestData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new SmartInvestDetail(str, str2, list);
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
        if (!(obj instanceof SmartInvestDetail)) {
            return false;
        }
        SmartInvestDetail smartInvestDetail = (SmartInvestDetail) obj;
        return Intrinsics.EZpvd((Object) this.totalInvestPx, (Object) smartInvestDetail.totalInvestPx) && Intrinsics.EZpvd((Object) this.totalQuoteInvestPx, (Object) smartInvestDetail.totalQuoteInvestPx) && Intrinsics.EZpvd(this.investList, smartInvestDetail.investList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SmartInvestData> getInvestList() {
        return this.investList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalInvestPx() {
        return this.totalInvestPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalQuoteInvestPx() {
        return this.totalQuoteInvestPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.totalInvestPx.hashCode() * 31) + this.totalQuoteInvestPx.hashCode()) * 31) + this.investList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvestList(@NotNull List<SmartInvestData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.investList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmartInvestDetail(totalInvestPx=" + this.totalInvestPx + ", totalQuoteInvestPx=" + this.totalQuoteInvestPx + ", investList=" + this.investList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.totalInvestPx);
        parcel.writeString(this.totalQuoteInvestPx);
        List<SmartInvestData> list = this.investList;
        parcel.writeInt(list.size());
        Iterator<SmartInvestData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public SmartInvestDetail(@NotNull String str, @NotNull String str2, @NotNull List<SmartInvestData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.totalInvestPx = str;
        this.totalQuoteInvestPx = str2;
        this.investList = list;
    }
}
