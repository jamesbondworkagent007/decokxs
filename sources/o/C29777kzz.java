package o;

import com.okinc.business.market.features.trader.domain.model.Traders;
import com.okinc.business.market.features.trader.domain.model.TradersRequestParam;
import com.okinc.business.market.features.trader.domain.usecase.TradersUseCase$getTradersList$1;
import com.okinc.business.market.features.trader.domain.usecase.TradersUseCase$getTradersListgIAlus$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.trader.domain.usecase.TradersUseCase$subscribe$$inlined$mapNotNull$1$2$1;
import com.okinc.business.market.features.trader.domain.usecase.TradersUseCase$subscribe$1;
import com.okinc.business.market.features.trader.ui.model.TraderPnLFilter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kzz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29777kzz {
    public final CoroutineDispatcher AEQbTJ;
    public final C29728kzC EZpvd;
    public final InterfaceC29729kzD KWHzl;
    public final CoroutineScope OLrzqt;

    /* JADX INFO: renamed from: o.kzz$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TraderPnLFilter.values().length];
            try {
                iArr[TraderPnLFilter.TOTAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TraderPnLFilter.REALIZED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TraderPnLFilter.UNREALIZED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    @yCM
    public C29777kzz(@NotNull InterfaceC29729kzD interfaceC29729kzD, @NotNull C29728kzC c29728kzC, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC29729kzD, "");
        Intrinsics.checkNotNullParameter(c29728kzC, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC29729kzD;
        this.EZpvd = c29728kzC;
        this.AEQbTJ = coroutineDispatcher;
        this.OLrzqt = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull TradersRequestParam tradersRequestParam, @NotNull Continuation<? super Result<? extends java.util.List<Traders>>> continuation) {
        TradersUseCase$getTradersList$1 tradersUseCase$getTradersList$1;
        if (continuation instanceof TradersUseCase$getTradersList$1) {
            tradersUseCase$getTradersList$1 = (TradersUseCase$getTradersList$1) continuation;
            int i = tradersUseCase$getTradersList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tradersUseCase$getTradersList$1.label = i - Integer.MIN_VALUE;
            } else {
                tradersUseCase$getTradersList$1 = new TradersUseCase$getTradersList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = tradersUseCase$getTradersList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tradersUseCase$getTradersList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            TradersUseCase$getTradersListgIAlus$$inlined$dexRunCatching$1 tradersUseCase$getTradersListgIAlus$$inlined$dexRunCatching$1 = new TradersUseCase$getTradersListgIAlus$$inlined$dexRunCatching$1(null, this, tradersRequestParam);
            tradersUseCase$getTradersList$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, tradersUseCase$getTradersListgIAlus$$inlined$dexRunCatching$1, tradersUseCase$getTradersList$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final java.util.List<Traders> copydefault(@NotNull java.util.List<Traders> list, @NotNull final C27721kAx c27721kAx) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c27721kAx, "");
        Function1 function1 = new Function1() { // from class: o.kzB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Float.valueOf(C29777kzz.copydefault(c27721kAx, (Traders) obj));
            }
        };
        int i = 0;
        if (c27721kAx.OLrzqt()) {
            java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(list, new ActionBar(function1));
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            for (java.lang.Object obj : listEZpvd) {
                int i2 = i + 1;
                if (i < 0) {
                    yDY.AYXKKw();
                }
                Traders traders = (Traders) obj;
                arrayList.add(traders.copydefault((16382 & 1) != 0 ? traders.OLrzqt : i2, (16382 & 2) != 0 ? traders.EZpvd : null, (16382 & 4) != 0 ? traders.AhwBna : null, (16382 & 8) != 0 ? traders.DbNXlk : null, (16382 & 16) != 0 ? traders.AYXKKw : null, (16382 & 32) != 0 ? traders.copydefault : null, (16382 & 64) != 0 ? traders.valueOf : null, (16382 & 128) != 0 ? traders.isConnected : null, (16382 & 256) != 0 ? traders.gEmmrt : null, (16382 & 512) != 0 ? traders.djBIcL : null, (16382 & 1024) != 0 ? traders.fetchVPNInfo : null, (16382 & 2048) != 0 ? traders.values : null, (16382 & 4096) != 0 ? traders.AEQbTJ : null, (16382 & 8192) != 0 ? traders.KWHzl : null));
                i = i2;
            }
            return arrayList;
        }
        java.util.List listEZpvd2 = CollectionsKt___CollectionsKt.EZpvd(list, new TaskDescription(function1));
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd2, 10));
        for (java.lang.Object obj2 : listEZpvd2) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            Traders traders2 = (Traders) obj2;
            arrayList2.add(traders2.copydefault((16382 & 1) != 0 ? traders2.OLrzqt : list.size() - i, (16382 & 2) != 0 ? traders2.EZpvd : null, (16382 & 4) != 0 ? traders2.AhwBna : null, (16382 & 8) != 0 ? traders2.DbNXlk : null, (16382 & 16) != 0 ? traders2.AYXKKw : null, (16382 & 32) != 0 ? traders2.copydefault : null, (16382 & 64) != 0 ? traders2.valueOf : null, (16382 & 128) != 0 ? traders2.isConnected : null, (16382 & 256) != 0 ? traders2.gEmmrt : null, (16382 & 512) != 0 ? traders2.djBIcL : null, (16382 & 1024) != 0 ? traders2.fetchVPNInfo : null, (16382 & 2048) != 0 ? traders2.values : null, (16382 & 4096) != 0 ? traders2.AEQbTJ : null, (16382 & 8192) != 0 ? traders2.KWHzl : null));
            i++;
        }
        return arrayList2;
    }

    public static final float copydefault(C27721kAx c27721kAx, Traders traders) {
        Intrinsics.checkNotNullParameter(traders, "");
        int i = StateListAnimator.AEQbTJ[c27721kAx.AEQbTJ().ordinal()];
        if (i == 1) {
            return C33129mqd.djBIcL(traders.AYXKKw());
        }
        if (i == 2) {
            return C33129mqd.djBIcL(traders.gEmmrt());
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C33129mqd.djBIcL(traders.fetchVPNInfo());
    }

    /* JADX INFO: renamed from: o.kzz$Activity */
    public static final class Activity implements Flow<java.util.List<? extends Traders>> {
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ C29777kzz copydefault;

        /* JADX INFO: renamed from: o.kzz$Activity$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;
            public final /* synthetic */ C29777kzz OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, C29777kzz c29777kzz) {
                this.KWHzl = flowCollector;
                this.OLrzqt = c29777kzz;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                TradersUseCase$subscribe$$inlined$mapNotNull$1$2$1 tradersUseCase$subscribe$$inlined$mapNotNull$1$2$1;
                java.lang.Object objM7386unboximpl;
                FlowCollector flowCollector;
                if (continuation instanceof TradersUseCase$subscribe$$inlined$mapNotNull$1$2$1) {
                    tradersUseCase$subscribe$$inlined$mapNotNull$1$2$1 = (TradersUseCase$subscribe$$inlined$mapNotNull$1$2$1) continuation;
                    int i = tradersUseCase$subscribe$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        tradersUseCase$subscribe$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        tradersUseCase$subscribe$$inlined$mapNotNull$1$2$1 = new TradersUseCase$subscribe$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = tradersUseCase$subscribe$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = tradersUseCase$subscribe$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector2 = this.KWHzl;
                    C29728kzC c29728kzC = this.OLrzqt.EZpvd;
                    tradersUseCase$subscribe$$inlined$mapNotNull$1$2$1.L$0 = flowCollector2;
                    tradersUseCase$subscribe$$inlined$mapNotNull$1$2$1.label = 1;
                    java.lang.Object objEZpvd = c29728kzC.EZpvd((java.util.List) obj, tradersUseCase$subscribe$$inlined$mapNotNull$1$2$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7386unboximpl = objEZpvd;
                    flowCollector = flowCollector2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                        return Unit.INSTANCE;
                    }
                    FlowCollector flowCollector3 = (FlowCollector) tradersUseCase$subscribe$$inlined$mapNotNull$1$2$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    objM7386unboximpl = ((Result) obj2).m7386unboximpl();
                    flowCollector = flowCollector3;
                }
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                    objM7386unboximpl = null;
                }
                if (objM7386unboximpl != null) {
                    tradersUseCase$subscribe$$inlined$mapNotNull$1$2$1.L$0 = null;
                    tradersUseCase$subscribe$$inlined$mapNotNull$1$2$1.label = 2;
                    if (flowCollector.emit(objM7386unboximpl, tradersUseCase$subscribe$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public Activity(Flow flow, C29777kzz c29777kzz) {
            this.EZpvd = flow;
            this.copydefault = c29777kzz;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends Traders>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass4(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull TradersRequestParam tradersRequestParam, @NotNull Continuation<? super Flow<? extends java.util.List<Traders>>> continuation) throws java.lang.Throwable {
        TradersUseCase$subscribe$1 tradersUseCase$subscribe$1;
        C29777kzz c29777kzz;
        if (continuation instanceof TradersUseCase$subscribe$1) {
            tradersUseCase$subscribe$1 = (TradersUseCase$subscribe$1) continuation;
            int i = tradersUseCase$subscribe$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tradersUseCase$subscribe$1.label = i - Integer.MIN_VALUE;
            } else {
                tradersUseCase$subscribe$1 = new TradersUseCase$subscribe$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = tradersUseCase$subscribe$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tradersUseCase$subscribe$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            copydefault();
            InterfaceC29729kzD interfaceC29729kzD = this.KWHzl;
            tradersUseCase$subscribe$1.L$0 = this;
            tradersUseCase$subscribe$1.label = 1;
            objKWHzl = interfaceC29729kzD.KWHzl(tradersRequestParam, tradersUseCase$subscribe$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c29777kzz = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c29777kzz = (C29777kzz) tradersUseCase$subscribe$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        return new Activity((Flow) objKWHzl, c29777kzz);
    }

    public final void copydefault() {
        CoroutineScopeKt.cancel$default(this.OLrzqt, null, 1, null);
        this.KWHzl.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.kzz$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            this.OLrzqt = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Function1 function1 = this.OLrzqt;
            return yET.KWHzl((java.lang.Comparable) function1.invoke(t), (java.lang.Comparable) function1.invoke(t2));
        }
    }

    /* JADX INFO: renamed from: o.kzz$ActionBar */
    public static final class ActionBar<T> implements java.util.Comparator {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            this.EZpvd = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Function1 function1 = this.EZpvd;
            return yET.KWHzl((java.lang.Comparable) function1.invoke(t2), (java.lang.Comparable) function1.invoke(t));
        }
    }
}
