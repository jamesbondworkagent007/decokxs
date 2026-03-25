package com.okinc.tradingbot.impl.aiBot.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.tradingbot.impl.aiBot.domain.model.Indicator;
import com.okinc.unify_trade.biz.DataSetting;
import com.okinc.unify_trade.biz.TechnicalIndex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class MarketSignalSelectionResult implements Parcelable {
    public final List<String> EZpvd;
    public final String OLrzqt;
    public final List<Indicator> copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final Parcelable.Creator<MarketSignalSelectionResult> CREATOR = new Creator();
    public static final MarketSignalSelectionResult KWHzl = new MarketSignalSelectionResult(null, yDY.AhwBna(), yDY.AhwBna());

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<MarketSignalSelectionResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketSignalSelectionResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(MarketSignalSelectionResult.class.getClassLoader()));
            }
            return new MarketSignalSelectionResult(string, arrayListCreateStringArrayList, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketSignalSelectionResult[] newArray(int i) {
            return new MarketSignalSelectionResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.aiBot.domain.model.MarketSignalSelectionResult */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketSignalSelectionResult copy$default(MarketSignalSelectionResult marketSignalSelectionResult, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketSignalSelectionResult.OLrzqt;
        }
        if ((i & 2) != 0) {
            list = marketSignalSelectionResult.EZpvd;
        }
        if ((i & 4) != 0) {
            list2 = marketSignalSelectionResult.copydefault;
        }
        return marketSignalSelectionResult.EZpvd(str, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketSignalSelectionResult EZpvd(String str, @NotNull List<String> list, @NotNull List<? extends Indicator> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new MarketSignalSelectionResult(str, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Indicator> OLrzqt() {
        return this.copydefault;
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
        if (!(obj instanceof MarketSignalSelectionResult)) {
            return false;
        }
        MarketSignalSelectionResult marketSignalSelectionResult = (MarketSignalSelectionResult) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) marketSignalSelectionResult.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, marketSignalSelectionResult.EZpvd) && Intrinsics.EZpvd(this.copydefault, marketSignalSelectionResult.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.OLrzqt;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketSignalSelectionResult(thinkingInterval=" + this.OLrzqt + ", chartTimeframes=" + this.EZpvd + ", indicators=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeStringList(this.EZpvd);
        List<Indicator> list = this.copydefault;
        parcel.writeInt(list.size());
        Iterator<Indicator> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.okinc.tradingbot.impl.aiBot.domain.model.Indicator> */
    /* JADX WARN: Multi-variable type inference failed */
    public MarketSignalSelectionResult(String str, @NotNull List<String> list, @NotNull List<? extends Indicator> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.OLrzqt = str;
        this.EZpvd = list;
        this.copydefault = list2;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.aiBot.domain.model.MarketSignalSelectionResult.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final DataSetting EZpvd(@NotNull MarketSignalSelectionResult marketSignalSelectionResult) {
            Intrinsics.checkNotNullParameter(marketSignalSelectionResult, "");
            String strKWHzl = marketSignalSelectionResult.KWHzl();
            String str = strKWHzl != null ? strKWHzl : "";
            List<String> listEZpvd = marketSignalSelectionResult.EZpvd();
            List<Indicator> listOLrzqt = marketSignalSelectionResult.OLrzqt();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
            Iterator<T> it = listOLrzqt.iterator();
            while (it.hasNext()) {
                arrayList.add(MarketSignalSelectionResult.Companion.KWHzl((Indicator) it.next()));
            }
            return new DataSetting(str, listEZpvd, arrayList);
        }

        public final TechnicalIndex KWHzl(Indicator indicator) {
            List listAhwBna;
            String strDjBIcL = indicator.djBIcL();
            if (!(indicator instanceof Indicator.MultiValue)) {
                if (!(indicator instanceof Indicator.FixedParams)) {
                    if (!(indicator instanceof Indicator.NoParams)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listAhwBna = yDY.AhwBna();
                } else {
                    List<Number> listAhwBna2 = ((Indicator.FixedParams) indicator).AhwBna();
                    listAhwBna = new ArrayList(C56403yEb.AYXKKw(listAhwBna2, 10));
                    Iterator<T> it = listAhwBna2.iterator();
                    while (it.hasNext()) {
                        listAhwBna.add(((Number) it.next()).toString());
                    }
                }
            } else {
                List<Integer> listAhwBna3 = ((Indicator.MultiValue) indicator).AhwBna();
                listAhwBna = new ArrayList(C56403yEb.AYXKKw(listAhwBna3, 10));
                Iterator<T> it2 = listAhwBna3.iterator();
                while (it2.hasNext()) {
                    listAhwBna.add(String.valueOf(((Number) it2.next()).intValue()));
                }
            }
            return new TechnicalIndex(strDjBIcL, listAhwBna);
        }
    }
}
