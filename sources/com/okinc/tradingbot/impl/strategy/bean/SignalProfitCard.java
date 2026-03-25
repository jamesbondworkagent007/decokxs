package com.okinc.tradingbot.impl.strategy.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.SignalSortProfitData;
import com.okinc.unify_trade.biz.SignalProfits;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class SignalProfitCard implements Parcelable {
    public static final Parcelable.Creator<SignalProfitCard> CREATOR = new Creator();
    public final List<SignalSortProfitData> AEQbTJ;
    public final String AYXKKw;
    public final String EZpvd;
    public final String KWHzl;
    public final boolean OLrzqt;
    public final int copydefault;
    public final SignalProfits djBIcL;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<SignalProfitCard> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalProfitCard createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            SignalProfits signalProfits = (SignalProfits) parcel.readParcelable(SignalProfitCard.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(SignalSortProfitData.CREATOR.createFromParcel(parcel));
            }
            return new SignalProfitCard(signalProfits, string, string2, string3, i, arrayList, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalProfitCard[] newArray(int i) {
            return new SignalProfitCard[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.tradingbot.impl.strategy.bean.SignalProfitCard */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignalProfitCard copy$default(SignalProfitCard signalProfitCard, SignalProfits signalProfits, String str, String str2, String str3, int i, List list, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            signalProfits = signalProfitCard.djBIcL;
        }
        if ((i2 & 2) != 0) {
            str = signalProfitCard.EZpvd;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = signalProfitCard.AYXKKw;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = signalProfitCard.KWHzl;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            i = signalProfitCard.copydefault;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            list = signalProfitCard.AEQbTJ;
        }
        List list2 = list;
        if ((i2 & 64) != 0) {
            z = signalProfitCard.OLrzqt;
        }
        return signalProfitCard.AEQbTJ(signalProfits, str4, str5, str6, i3, list2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalProfitCard AEQbTJ(@NotNull SignalProfits signalProfits, @NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull List<SignalSortProfitData> list, boolean z) {
        Intrinsics.checkNotNullParameter(signalProfits, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new SignalProfitCard(signalProfits, str, str2, str3, i, list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SignalSortProfitData> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.KWHzl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalProfits djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalProfitCard)) {
            return false;
        }
        SignalProfitCard signalProfitCard = (SignalProfitCard) obj;
        return Intrinsics.EZpvd(this.djBIcL, signalProfitCard.djBIcL) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) signalProfitCard.EZpvd) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) signalProfitCard.AYXKKw) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) signalProfitCard.KWHzl) && this.copydefault == signalProfitCard.copydefault && Intrinsics.EZpvd(this.AEQbTJ, signalProfitCard.AEQbTJ) && this.OLrzqt == signalProfitCard.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.djBIcL.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + Integer.hashCode(this.copydefault)) * 31) + this.AEQbTJ.hashCode()) * 31) + Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalProfitCard(profits=" + this.djBIcL + ", profitPeriod=" + this.EZpvd + ", profitTitle=" + this.AYXKKw + ", profitRate=" + this.KWHzl + ", profitRateColor=" + this.copydefault + ", profitList=" + this.AEQbTJ + ", checkAll=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.djBIcL, i);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.KWHzl);
        parcel.writeInt(this.copydefault);
        List<SignalSortProfitData> list = this.AEQbTJ;
        parcel.writeInt(list.size());
        Iterator<SignalSortProfitData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.OLrzqt ? 1 : 0);
    }

    public SignalProfitCard(@NotNull SignalProfits signalProfits, @NotNull String str, @NotNull String str2, @NotNull String str3, int i, @NotNull List<SignalSortProfitData> list, boolean z) {
        Intrinsics.checkNotNullParameter(signalProfits, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.djBIcL = signalProfits;
        this.EZpvd = str;
        this.AYXKKw = str2;
        this.KWHzl = str3;
        this.copydefault = i;
        this.AEQbTJ = list;
        this.OLrzqt = z;
    }
}
