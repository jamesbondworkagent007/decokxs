package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.SpotSearchBotResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.SpotSearchBotsDexTradersResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.SpotSearchDexTokenResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.SpotSearchTraderResponseBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class SpotSearchBotsDexTradersBean implements Parcelable {
    private final List<SpotSearchBotBean> bots;
    private final List<SpotSearchDexTokenBean> dexTokens;
    private final List<SpotSearchTraderBean> traders;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SpotSearchBotsDexTradersBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SpotSearchBotsDexTradersBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotSearchBotsDexTradersBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SpotSearchDexTokenBean.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(SpotSearchTraderBean.CREATOR.createFromParcel(parcel));
            }
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList3.add(SpotSearchBotBean.CREATOR.createFromParcel(parcel));
            }
            return new SpotSearchBotsDexTradersBean(arrayList, arrayList2, arrayList3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotSearchBotsDexTradersBean[] newArray(int i) {
            return new SpotSearchBotsDexTradersBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpotSearchBotsDexTradersBean() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.shared.net.responsebean.SpotSearchBotsDexTradersBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SpotSearchBotsDexTradersBean copy$default(SpotSearchBotsDexTradersBean spotSearchBotsDexTradersBean, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = spotSearchBotsDexTradersBean.dexTokens;
        }
        if ((i & 2) != 0) {
            list2 = spotSearchBotsDexTradersBean.traders;
        }
        if ((i & 4) != 0) {
            list3 = spotSearchBotsDexTradersBean.bots;
        }
        return spotSearchBotsDexTradersBean.copy(list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SpotSearchDexTokenBean> component1() {
        return this.dexTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SpotSearchTraderBean> component2() {
        return this.traders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SpotSearchBotBean> component3() {
        return this.bots;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotSearchBotsDexTradersBean copy(@NotNull List<SpotSearchDexTokenBean> list, @NotNull List<SpotSearchTraderBean> list2, @NotNull List<SpotSearchBotBean> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new SpotSearchBotsDexTradersBean(list, list2, list3);
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
        if (!(obj instanceof SpotSearchBotsDexTradersBean)) {
            return false;
        }
        SpotSearchBotsDexTradersBean spotSearchBotsDexTradersBean = (SpotSearchBotsDexTradersBean) obj;
        return Intrinsics.EZpvd(this.dexTokens, spotSearchBotsDexTradersBean.dexTokens) && Intrinsics.EZpvd(this.traders, spotSearchBotsDexTradersBean.traders) && Intrinsics.EZpvd(this.bots, spotSearchBotsDexTradersBean.bots);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SpotSearchBotBean> getBots() {
        return this.bots;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SpotSearchDexTokenBean> getDexTokens() {
        return this.dexTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SpotSearchTraderBean> getTraders() {
        return this.traders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.dexTokens.hashCode() * 31) + this.traders.hashCode()) * 31) + this.bots.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotSearchBotsDexTradersBean(dexTokens=" + this.dexTokens + ", traders=" + this.traders + ", bots=" + this.bots + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<SpotSearchDexTokenBean> list = this.dexTokens;
        parcel.writeInt(list.size());
        Iterator<SpotSearchDexTokenBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<SpotSearchTraderBean> list2 = this.traders;
        parcel.writeInt(list2.size());
        Iterator<SpotSearchTraderBean> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<SpotSearchBotBean> list3 = this.bots;
        parcel.writeInt(list3.size());
        Iterator<SpotSearchBotBean> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
    }

    public SpotSearchBotsDexTradersBean(@NotNull List<SpotSearchDexTokenBean> list, @NotNull List<SpotSearchTraderBean> list2, @NotNull List<SpotSearchBotBean> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.dexTokens = list;
        this.traders = list2;
        this.bots = list3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:13)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:14)) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r3v0 java.util.List))
 A[MD:(java.util.List<com.okinc.crcore.shared.net.responsebean.SpotSearchDexTokenBean>, java.util.List<com.okinc.crcore.shared.net.responsebean.SpotSearchTraderBean>, java.util.List<com.okinc.crcore.shared.net.responsebean.SpotSearchBotBean>):void (m)] (LINE:12) call: com.okinc.crcore.shared.net.responsebean.SpotSearchBotsDexTradersBean.<init>(java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ SpotSearchBotsDexTradersBean(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? yDY.AhwBna() : list3);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.SpotSearchBotsDexTradersBean.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final SpotSearchBotsDexTradersBean KWHzl(@NotNull SpotSearchBotsDexTradersResponseBean spotSearchBotsDexTradersResponseBean) {
            Intrinsics.checkNotNullParameter(spotSearchBotsDexTradersResponseBean, "");
            List<SpotSearchDexTokenResponseBean> defiCoins = spotSearchBotsDexTradersResponseBean.getDefiCoins();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(defiCoins, 10));
            Iterator<T> it = defiCoins.iterator();
            while (it.hasNext()) {
                arrayList.add(SpotSearchDexTokenBean.Companion.KWHzl((SpotSearchDexTokenResponseBean) it.next()));
            }
            List<SpotSearchTraderResponseBean> social = spotSearchBotsDexTradersResponseBean.getSocial();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(social, 10));
            Iterator<T> it2 = social.iterator();
            while (it2.hasNext()) {
                arrayList2.add(SpotSearchTraderBean.Companion.KWHzl((SpotSearchTraderResponseBean) it2.next()));
            }
            List<SpotSearchBotResponseBean> tradingBot = spotSearchBotsDexTradersResponseBean.getTradingBot();
            ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(tradingBot, 10));
            Iterator<T> it3 = tradingBot.iterator();
            while (it3.hasNext()) {
                arrayList3.add(SpotSearchBotBean.Companion.AEQbTJ((SpotSearchBotResponseBean) it3.next()));
            }
            return new SpotSearchBotsDexTradersBean(arrayList, arrayList2, arrayList3);
        }
    }
}
