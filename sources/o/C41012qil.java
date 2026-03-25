package o;

import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.ITradingCalendarEventVo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarEconomicTypeVo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarTokenUnlockTypeVo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarType;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qil, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41012qil extends AbstractC49400uno<ActionBar, java.util.List<? extends C41054qja>> {
    public final CoroutineDispatcher OLrzqt;

    /* JADX INFO: renamed from: o.qil$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradingCalendarType.values().length];
            try {
                iArr[TradingCalendarType.ALL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TradingCalendarType.ECONOMIC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TradingCalendarType.TOKEN_UNLOCK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.qil$ActionBar */
    public static final class ActionBar {
        public final java.util.List<ITradingCalendarEventVo> EZpvd;
        public final java.util.List<C41054qja> KWHzl;
        public final TradingCalendarType copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qil$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.util.List list, java.util.List list2, TradingCalendarType tradingCalendarType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = actionBar.KWHzl;
            }
            if ((i & 2) != 0) {
                list2 = actionBar.EZpvd;
            }
            if ((i & 4) != 0) {
                tradingCalendarType = actionBar.copydefault;
            }
            return actionBar.KWHzl(list, list2, tradingCalendarType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ITradingCalendarEventVo> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull java.util.List<C41054qja> list, @NotNull java.util.List<? extends ITradingCalendarEventVo> list2, @NotNull TradingCalendarType tradingCalendarType) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(tradingCalendarType, "");
            return new ActionBar(list, list2, tradingCalendarType);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C41054qja> OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TradingCalendarType copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd) && this.copydefault == actionBar.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Params(dayList=" + this.KWHzl + ", eventList=" + this.EZpvd + ", type=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.ITradingCalendarEventVo> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(@NotNull java.util.List<C41054qja> list, @NotNull java.util.List<? extends ITradingCalendarEventVo> list2, @NotNull TradingCalendarType tradingCalendarType) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(tradingCalendarType, "");
            this.KWHzl = list;
            this.EZpvd = list2;
            this.copydefault = tradingCalendarType;
        }
    }

    @yCM
    public C41012qil(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull ActionBar actionBar, @NotNull Continuation<? super java.util.List<C41054qja>> continuation) {
        java.util.Iterator<C41054qja> it = actionBar.OLrzqt().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().AYXKKw()) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = 0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it2 = actionBar.OLrzqt().iterator();
        while (it2.hasNext()) {
            C41054qja c41054qjaCopy$default = C41054qja.copy$default((C41054qja) it2.next(), null, null, false, false, 0L, false, 63, null);
            c41054qjaCopy$default.EZpvd(false);
            c41054qjaCopy$default.AEQbTJ(false);
            arrayList.add(c41054qjaCopy$default);
        }
        java.util.List<ITradingCalendarEventVo> listAEQbTJ = AEQbTJ(actionBar.copydefault(), actionBar.AEQbTJ());
        java.util.Map<java.lang.Long, ? extends ITradingCalendarEventVo> linkedHashMap = new LinkedHashMap<>(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listAEQbTJ, 10)), 16));
        for (java.lang.Object obj : listAEQbTJ) {
            linkedHashMap.put(C56443yFo.KWHzl(((ITradingCalendarEventVo) obj).OLrzqt().AEQbTJ()), obj);
        }
        return EZpvd(arrayList, i, linkedHashMap);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.ITradingCalendarEventVo> */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.List<ITradingCalendarEventVo> AEQbTJ(TradingCalendarType tradingCalendarType, java.util.List<? extends ITradingCalendarEventVo> list) {
        java.util.ArrayList arrayList;
        int i = TaskDescription.EZpvd[tradingCalendarType.ordinal()];
        if (i == 1) {
            return list;
        }
        if (i == 2) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (obj instanceof TradingCalendarEconomicTypeVo) {
                    arrayList.add(obj);
                }
            }
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (obj2 instanceof TradingCalendarTokenUnlockTypeVo) {
                    arrayList.add(obj2);
                }
            }
        }
        return arrayList;
    }

    public final java.util.List<C41054qja> EZpvd(java.util.List<C41054qja> list, int i, java.util.Map<java.lang.Long, ? extends ITradingCalendarEventVo> map) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        int size = list.size();
        for (int i2 = i; i2 < size; i2++) {
            EZpvd(list, map, booleanRef, i2);
        }
        for (int i3 = i - 1; -1 < i3; i3--) {
            EZpvd(list, map, booleanRef, i3);
        }
        return list;
    }

    public static final void EZpvd(java.util.List<C41054qja> list, java.util.Map<java.lang.Long, ? extends ITradingCalendarEventVo> map, Ref.BooleanRef booleanRef, int i) {
        C41054qja c41054qja = list.get(i);
        c41054qja.AEQbTJ(map.get(java.lang.Long.valueOf(c41054qja.AEQbTJ())) != null);
        if (!c41054qja.copydefault() || booleanRef.element) {
            return;
        }
        c41054qja.EZpvd(true);
        booleanRef.element = true;
    }
}
