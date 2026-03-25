package o;

import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.ITradingCalendarEventVo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarEconomicTypeVo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarTokenUnlockTypeVo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC49371unL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qid, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41004qid extends AbstractC49400uno<Application, InterfaceC49371unL<? extends java.util.List<? extends ITradingCalendarEventVo>>> {
    public final CoroutineDispatcher OLrzqt;

    /* JADX INFO: renamed from: o.qid$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;

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
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public C41004qid(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull Application application, @NotNull Continuation<? super InterfaceC49371unL<? extends java.util.List<? extends ITradingCalendarEventVo>>> continuation) {
        InterfaceC49371unL<java.util.List<ITradingCalendarEventVo>> interfaceC49371unLCopydefault = application.copydefault();
        if (!(interfaceC49371unLCopydefault instanceof InterfaceC49371unL.TaskDescription) && !(interfaceC49371unLCopydefault instanceof InterfaceC49371unL.Application)) {
            if (!(interfaceC49371unLCopydefault instanceof InterfaceC49371unL.StateListAnimator) && !(interfaceC49371unLCopydefault instanceof InterfaceC49371unL.ActionBar)) {
                if (!(interfaceC49371unLCopydefault instanceof InterfaceC49371unL.Activity)) {
                    throw new NoWhenBranchMatchedException();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                InterfaceC49371unL<java.util.List<ITradingCalendarEventVo>> interfaceC49371unLCopydefault2 = application.copydefault();
                Intrinsics.copydefault(interfaceC49371unLCopydefault2, "");
                java.util.List list = (java.util.List) ((InterfaceC49371unL.Activity) interfaceC49371unLCopydefault2).copydefault();
                int i = ActionBar.AEQbTJ[application.OLrzqt().ordinal()];
                if (i == 1) {
                    return application.copydefault();
                }
                if (i == 2) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj : list) {
                        if (obj instanceof TradingCalendarEconomicTypeVo) {
                            arrayList2.add(obj);
                        }
                    }
                    arrayList.addAll(arrayList2);
                    if (arrayList.isEmpty()) {
                        return new InterfaceC49371unL.TaskDescription(null, 1, null);
                    }
                    return new InterfaceC49371unL.Activity(arrayList);
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    if (obj2 instanceof TradingCalendarTokenUnlockTypeVo) {
                        arrayList3.add(obj2);
                    }
                }
                arrayList.addAll(arrayList3);
                if (arrayList.isEmpty()) {
                    return new InterfaceC49371unL.TaskDescription(null, 1, null);
                }
                return new InterfaceC49371unL.Activity(arrayList);
            }
            return new InterfaceC49371unL.ActionBar(null, 1, null);
        }
        return new InterfaceC49371unL.TaskDescription(null, 1, null);
    }

    /* JADX INFO: renamed from: o.qid$Application */
    public static final class Application {
        public final TradingCalendarType KWHzl;
        public final InterfaceC49371unL<java.util.List<ITradingCalendarEventVo>> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qid$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, TradingCalendarType tradingCalendarType, InterfaceC49371unL interfaceC49371unL, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                tradingCalendarType = application.KWHzl;
            }
            if ((i & 2) != 0) {
                interfaceC49371unL = application.copydefault;
            }
            return application.AEQbTJ(tradingCalendarType, interfaceC49371unL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull TradingCalendarType tradingCalendarType, @NotNull InterfaceC49371unL<? extends java.util.List<? extends ITradingCalendarEventVo>> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(tradingCalendarType, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            return new Application(tradingCalendarType, interfaceC49371unL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TradingCalendarType OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC49371unL<java.util.List<ITradingCalendarEventVo>> copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return this.KWHzl == application.KWHzl && Intrinsics.EZpvd(this.copydefault, application.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Params(type=" + this.KWHzl + ", eventListVo=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.unL<? extends java.util.List<? extends com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.ITradingCalendarEventVo>> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(@NotNull TradingCalendarType tradingCalendarType, @NotNull InterfaceC49371unL<? extends java.util.List<? extends ITradingCalendarEventVo>> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(tradingCalendarType, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.KWHzl = tradingCalendarType;
            this.copydefault = interfaceC49371unL;
        }
    }
}
