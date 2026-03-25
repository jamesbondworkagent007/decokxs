package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.TradingBotStrategyListResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.TradingBotStrategyResponseBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class TradingBotStrategyListBean implements Parcelable {
    private final List<TradingBotStrategyBean> strategy;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TradingBotStrategyListBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TradingBotStrategyListBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradingBotStrategyListBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TradingBotStrategyBean.CREATOR.createFromParcel(parcel));
            }
            return new TradingBotStrategyListBean(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradingBotStrategyListBean[] newArray(int i) {
            return new TradingBotStrategyListBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradingBotStrategyListBean() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.shared.net.responsebean.TradingBotStrategyListBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TradingBotStrategyListBean copy$default(TradingBotStrategyListBean tradingBotStrategyListBean, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tradingBotStrategyListBean.strategy;
        }
        return tradingBotStrategyListBean.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradingBotStrategyBean> component1() {
        return this.strategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradingBotStrategyListBean copy(@NotNull List<TradingBotStrategyBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new TradingBotStrategyListBean(list);
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
        return (obj instanceof TradingBotStrategyListBean) && Intrinsics.EZpvd(this.strategy, ((TradingBotStrategyListBean) obj).strategy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradingBotStrategyBean> getStrategy() {
        return this.strategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.strategy.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradingBotStrategyListBean(strategy=" + this.strategy + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<TradingBotStrategyBean> list = this.strategy;
        parcel.writeInt(list.size());
        Iterator<TradingBotStrategyBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public TradingBotStrategyListBean(@NotNull List<TradingBotStrategyBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.strategy = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:14)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.crcore.shared.net.responsebean.TradingBotStrategyBean>):void (m)] (LINE:13) call: com.okinc.crcore.shared.net.responsebean.TradingBotStrategyListBean.<init>(java.util.List):void type: THIS */
    public /* synthetic */ TradingBotStrategyListBean(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.TradingBotStrategyListBean.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final List<TradingBotStrategyListBean> OLrzqt(@NotNull List<TradingBotStrategyListResponseBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ArrayList<TradingBotStrategyResponseBean> strategy = ((TradingBotStrategyListResponseBean) it.next()).getStrategy();
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(strategy, 10));
                Iterator<T> it2 = strategy.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(TradingBotStrategyBean.Companion.AEQbTJ((TradingBotStrategyResponseBean) it2.next()));
                }
                arrayList.add(new TradingBotStrategyListBean(arrayList2));
            }
            return arrayList;
        }
    }
}
