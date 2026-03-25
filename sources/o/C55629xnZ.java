package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.tradeapi.bean.MarketDataSource;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_trade.MarektTradeNewApiExKt$createNewWatchListSource$1;
import com.okinc.unify_trade.MarektTradeNewApiExKt$createNewWatchListSource$5;
import com.okinc.unify_trade.MarektTradeNewApiExKt$quickWatchDataSource$1;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xnZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55629xnZ {

    /* JADX INFO: renamed from: o.xnZ$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean OLrzqt(WatchListData watchListData) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <R> java.lang.Object AEQbTJ(@NotNull xTK xtk, boolean z, @NotNull Function1<? super java.util.List<? extends MarketDataSource>, ? extends java.util.List<? extends R>> function1, @NotNull Function1<? super java.util.List<? extends R>, Unit> function12, @NotNull Continuation<? super Result<? extends xTS>> continuation) throws java.lang.Throwable {
        MarektTradeNewApiExKt$quickWatchDataSource$1 marektTradeNewApiExKt$quickWatchDataSource$1;
        xTS xug;
        xTK xtk2;
        xTK xtk3;
        xTS xts;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof MarektTradeNewApiExKt$quickWatchDataSource$1) {
            marektTradeNewApiExKt$quickWatchDataSource$1 = (MarektTradeNewApiExKt$quickWatchDataSource$1) continuation;
            int i = marektTradeNewApiExKt$quickWatchDataSource$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marektTradeNewApiExKt$quickWatchDataSource$1.label = i - Integer.MIN_VALUE;
            } else {
                marektTradeNewApiExKt$quickWatchDataSource$1 = new MarektTradeNewApiExKt$quickWatchDataSource$1(continuation);
            }
        }
        java.lang.Object obj = marektTradeNewApiExKt$quickWatchDataSource$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marektTradeNewApiExKt$quickWatchDataSource$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("WatchListInit", " quickWatchDataSource  start ");
            xug = C55608xnE.isLogin$default(null, 1, null) ? new xUG(xtk, null, null, z, null, 22, null) : new C54771xUs(xtk, null, null, z, null, 22, null);
            xug.AEQbTJ((Function1) function1, (Function1) function12);
            try {
                Result.Application application = Result.Companion;
                xtk2 = xtk;
            } catch (java.lang.Throwable th) {
                th = th;
                xtk2 = xtk;
            }
            try {
                marektTradeNewApiExKt$quickWatchDataSource$1.L$0 = xtk2;
                marektTradeNewApiExKt$quickWatchDataSource$1.L$1 = xug;
                marektTradeNewApiExKt$quickWatchDataSource$1.label = 1;
                if (xug.KWHzl(marektTradeNewApiExKt$quickWatchDataSource$1) == objCopydefault) {
                    return objCopydefault;
                }
                xts = xug;
                xtk3 = xtk2;
            } catch (java.lang.Throwable th2) {
                th = th2;
                xtk3 = xtk2;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                xts = xug;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xts = (xTS) marektTradeNewApiExKt$quickWatchDataSource$1.L$1;
            xtk3 = (xTK) marektTradeNewApiExKt$quickWatchDataSource$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (java.lang.Throwable th3) {
                th = th3;
                xug = xts;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                xts = xug;
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl(xts);
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = (xTS) objM7377constructorimpl;
            if (!xtk3.KWHzl()) {
                xts.valueOf();
            }
        }
        return Result.m7377constructorimpl(objM7377constructorimpl);
    }

    public static /* synthetic */ java.lang.Object quickWatchDataSource$default(xTK xtk, boolean z, Function1 function1, Function1 function12, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return AEQbTJ(xtk, z, function1, function12, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(@NotNull InterfaceC54577xNn interfaceC54577xNn, @NotNull LifecycleOwner lifecycleOwner, @NotNull MutableLiveData<SourceResp<xTS>> mutableLiveData, xTS xts, @NotNull Function1<? super WatchListData, java.lang.Boolean> function1, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarektTradeNewApiExKt$createNewWatchListSource$1 marektTradeNewApiExKt$createNewWatchListSource$1;
        java.lang.Object objAEQbTJ;
        final MutableLiveData<SourceResp<xTS>> mutableLiveData2;
        xTS xts2;
        Function1<? super WatchListData, java.lang.Boolean> function12;
        java.util.HashMap<java.lang.String, TickersData> map;
        java.util.HashMap<java.lang.String, TickersData> map2;
        final xTS c54771xUs;
        java.util.HashMap<java.lang.String, TickersData> map3;
        java.util.HashMap<java.lang.String, TickersData> map4;
        if (continuation instanceof MarektTradeNewApiExKt$createNewWatchListSource$1) {
            marektTradeNewApiExKt$createNewWatchListSource$1 = (MarektTradeNewApiExKt$createNewWatchListSource$1) continuation;
            int i = marektTradeNewApiExKt$createNewWatchListSource$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marektTradeNewApiExKt$createNewWatchListSource$1.label = i - Integer.MIN_VALUE;
            } else {
                marektTradeNewApiExKt$createNewWatchListSource$1 = new MarektTradeNewApiExKt$createNewWatchListSource$1(continuation);
            }
        }
        java.lang.Object obj = marektTradeNewApiExKt$createNewWatchListSource$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marektTradeNewApiExKt$createNewWatchListSource$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
            xNF xnf = new xNF();
            marektTradeNewApiExKt$createNewWatchListSource$1.L$0 = mutableLiveData;
            marektTradeNewApiExKt$createNewWatchListSource$1.L$1 = xts;
            marektTradeNewApiExKt$createNewWatchListSource$1.L$2 = function1;
            marektTradeNewApiExKt$createNewWatchListSource$1.label = 1;
            objAEQbTJ = interfaceC54577xNnKWHzl.AEQbTJ(false, xnf, marektTradeNewApiExKt$createNewWatchListSource$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            mutableLiveData2 = mutableLiveData;
            xts2 = xts;
            function12 = function1;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Function1<? super WatchListData, java.lang.Boolean> function13 = (Function1) marektTradeNewApiExKt$createNewWatchListSource$1.L$2;
            xts2 = (xTS) marektTradeNewApiExKt$createNewWatchListSource$1.L$1;
            mutableLiveData2 = (MutableLiveData) marektTradeNewApiExKt$createNewWatchListSource$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
            function12 = function13;
        }
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            if (C55608xnE.isLogin$default(null, 1, null)) {
                C54760xUh c54760xUh = new C54760xUh(mutableLiveData2);
                if (xts2 == null || (map3 = xts2.ejfBZ()) == null) {
                    map3 = new java.util.HashMap<>();
                }
                java.util.HashMap<java.lang.String, TickersData> map5 = map3;
                if (xts2 == null || (map4 = xts2.KWHzl()) == null) {
                    map4 = new java.util.HashMap<>();
                }
                c54771xUs = new xUG(c54760xUh, map5, map4, false, function12, 8, null);
            } else {
                C54760xUh c54760xUh2 = new C54760xUh(mutableLiveData2);
                if (xts2 == null || (map = xts2.ejfBZ()) == null) {
                    map = new java.util.HashMap<>();
                }
                java.util.HashMap<java.lang.String, TickersData> map6 = map;
                if (xts2 == null || (map2 = xts2.KWHzl()) == null) {
                    map2 = new java.util.HashMap<>();
                }
                c54771xUs = new C54771xUs(c54760xUh2, map6, map2, false, function12, 8, null);
            }
            c54771xUs.KWHzl(new Function2() { // from class: o.xob
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return C55629xnZ.KWHzl(mutableLiveData2, c54771xUs, ((java.lang.Boolean) obj2).booleanValue(), (java.lang.Exception) obj3);
                }
            });
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl != null) {
            C55608xnE.EZpvd(mutableLiveData2, false, (xTS) null, new java.lang.Exception(thM7380exceptionOrNullimpl.getMessage()));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object createNewWatchListSource$default(InterfaceC54577xNn interfaceC54577xNn, LifecycleOwner lifecycleOwner, MutableLiveData mutableLiveData, xTS xts, Function1 function1, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            xts = null;
        }
        xTS xts2 = xts;
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: o.xnY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(C55629xnZ.OLrzqt((WatchListData) obj2));
                }
            };
        }
        return EZpvd(interfaceC54577xNn, lifecycleOwner, mutableLiveData, xts2, function1, continuation);
    }

    public static final Unit KWHzl(MutableLiveData mutableLiveData, xTS xts, boolean z, java.lang.Exception exc) {
        if (!mutableLiveData.hasActiveObservers()) {
            xts.valueOf();
        }
        if (z) {
            C55608xnE.EZpvd((MutableLiveData<SourceResp<xTS>>) mutableLiveData, true, xts, (java.lang.Exception) null);
        } else {
            C55608xnE.EZpvd((MutableLiveData<SourceResp<xTS>>) mutableLiveData, false, (xTS) null, exc);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object OLrzqt(@NotNull InterfaceC54577xNn interfaceC54577xNn, @NotNull MutableLiveData<SourceResp<xTS>> mutableLiveData, @NotNull C54588xNy c54588xNy, boolean z, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarektTradeNewApiExKt$createNewWatchListSource$5 marektTradeNewApiExKt$createNewWatchListSource$5;
        java.lang.Object objAEQbTJ;
        final MutableLiveData<SourceResp<xTS>> mutableLiveData2;
        boolean z2;
        final xTS c54771xUs;
        if (continuation instanceof MarektTradeNewApiExKt$createNewWatchListSource$5) {
            marektTradeNewApiExKt$createNewWatchListSource$5 = (MarektTradeNewApiExKt$createNewWatchListSource$5) continuation;
            int i = marektTradeNewApiExKt$createNewWatchListSource$5.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marektTradeNewApiExKt$createNewWatchListSource$5.label = i - Integer.MIN_VALUE;
            } else {
                marektTradeNewApiExKt$createNewWatchListSource$5 = new MarektTradeNewApiExKt$createNewWatchListSource$5(continuation);
            }
        }
        java.lang.Object obj = marektTradeNewApiExKt$createNewWatchListSource$5.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marektTradeNewApiExKt$createNewWatchListSource$5.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            new MutableLiveData().observeForever(new Activity(new Function1() { // from class: o.xoh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C55629xnZ.EZpvd((SourceResp) obj2);
                }
            }));
            pUU.KWHzl("WatchListInit", "start init OKTrade  Data ");
            InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
            marektTradeNewApiExKt$createNewWatchListSource$5.L$0 = mutableLiveData;
            marektTradeNewApiExKt$createNewWatchListSource$5.Z$0 = z;
            marektTradeNewApiExKt$createNewWatchListSource$5.label = 1;
            objAEQbTJ = interfaceC54577xNnKWHzl.AEQbTJ(false, c54588xNy, marektTradeNewApiExKt$createNewWatchListSource$5);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            mutableLiveData2 = mutableLiveData;
            z2 = z;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z3 = marektTradeNewApiExKt$createNewWatchListSource$5.Z$0;
            mutableLiveData2 = (MutableLiveData) marektTradeNewApiExKt$createNewWatchListSource$5.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
            z2 = z3;
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl != null) {
            C55608xnE.EZpvd(mutableLiveData2, false, (xTS) null, new java.lang.Exception(thM7380exceptionOrNullimpl.getMessage()));
        }
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            if (C55608xnE.isLogin$default(null, 1, null)) {
                c54771xUs = new xUG(new C54760xUh(mutableLiveData2), null, null, z2, null, 22, null);
            } else {
                c54771xUs = new C54771xUs(new C54760xUh(mutableLiveData2), null, null, z2, null, 22, null);
            }
            c54771xUs.KWHzl(new Function2() { // from class: o.xog
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return C55629xnZ.EZpvd(mutableLiveData2, c54771xUs, ((java.lang.Boolean) obj2).booleanValue(), (java.lang.Exception) obj3);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object createNewWatchListSource$default(InterfaceC54577xNn interfaceC54577xNn, MutableLiveData mutableLiveData, C54588xNy c54588xNy, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c54588xNy = new xNF();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return OLrzqt(interfaceC54577xNn, mutableLiveData, c54588xNy, z, continuation);
    }

    public static final Unit EZpvd(SourceResp sourceResp) {
        pUU.KWHzl("WatchListInit", " init OKTrade  success ");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(MutableLiveData mutableLiveData, xTS xts, boolean z, java.lang.Exception exc) {
        if (!mutableLiveData.hasActiveObservers()) {
            xts.valueOf();
        }
        if (z) {
            C55608xnE.EZpvd((MutableLiveData<SourceResp<xTS>>) mutableLiveData, true, xts, (java.lang.Exception) null);
        } else {
            C55608xnE.EZpvd((MutableLiveData<SourceResp<xTS>>) mutableLiveData, false, (xTS) null, exc);
        }
        return Unit.INSTANCE;
    }

    public static final C55700xor EZpvd(@NotNull final androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.unify_trade.MarektTradeNewApiExKt$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return fragment;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.unify_trade.MarektTradeNewApiExKt$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        return ((C55698xop) FragmentViewModelLazyKt.createViewModelLazy(fragment, C56524yIo.AEQbTJ(C55698xop.class), new Function0<ViewModelStore>() { // from class: com.okinc.unify_trade.MarektTradeNewApiExKt$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.unify_trade.MarektTradeNewApiExKt$special$$inlined$viewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.unify_trade.MarektTradeNewApiExKt$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }).getValue()).copydefault();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: VM */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C55700xor AEQbTJ(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        final Function0 function0 = null;
        return ((C55698xop) new ViewModelLazy(C56524yIo.AEQbTJ(C55698xop.class), new Function0<ViewModelStore>() { // from class: com.okinc.unify_trade.MarektTradeNewApiExKt$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = abstractActivityC33041mov.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.unify_trade.MarektTradeNewApiExKt$special$$inlined$viewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = abstractActivityC33041mov.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.unify_trade.MarektTradeNewApiExKt$special$$inlined$viewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = abstractActivityC33041mov.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }).getValue()).copydefault();
    }
}
