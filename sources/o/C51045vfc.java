package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleDestroyedException;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.WithLifecycleStateKt;
import com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawViewModel$confirmWithdraw$1;
import com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawViewModel$debounceFetchMarginBalance$1;
import com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawViewModel$fetchMarginBalance$1;
import com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawViewModel$init$1;
import com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawViewModel$observeWebSocket$2$1;
import com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawViewModel$special$$inlined$map$1$2$1;
import com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawViewModel$special$$inlined$map$2$2$1;
import com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawViewModel$tickerState$1;
import com.okinc.tradingbot.impl.futures_grid.dto.MarginBalanceType;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C48033uCm;
import o.uLU;
import o.wUL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vfc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51045vfc extends uLN<TaskDescription> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final C51053vfk AEQbTJ;
    public final C51052vfj AYXKKw;
    public Job AhwBna;
    public final StateFlow<uLU<Activity>> AkhnZx;
    public final StateFlow<StateListAnimator> AuCTel;
    public final Flow<java.lang.String> DbNXlk;
    public final MutableStateFlow<java.lang.String> EZpvd;
    public final MutableStateFlow<StateListAnimator> OLrzqt;
    public final MutableStateFlow<uLU<Activity>> copydefault;
    public final CoroutineDispatcher djBIcL;
    public Job fARcdN;
    public final CoroutineDispatcher fetchVPNInfo;
    public MarginBalanceType gEmmrt;
    public final Flow<java.lang.String> isConnected;
    public java.lang.String valueOf;
    public final SavedStateHandle values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<java.lang.String> AEQbTJ() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<StateListAnimator> OLrzqt() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<uLU<Activity>> copydefault() {
        return this.AkhnZx;
    }

    public C51045vfc(@NotNull C51052vfj c51052vfj, @NotNull C51053vfk c51053vfk, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineDispatcher coroutineDispatcher2, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(c51052vfj, "");
        Intrinsics.checkNotNullParameter(c51053vfk, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.AYXKKw = c51052vfj;
        this.AEQbTJ = c51053vfk;
        this.djBIcL = coroutineDispatcher;
        this.fetchVPNInfo = coroutineDispatcher2;
        this.values = savedStateHandle;
        MutableStateFlow<uLU<Activity>> MutableStateFlow = StateFlowKt.MutableStateFlow(uLU.StateListAnimator.loading$default(uLU.Companion, false, 1, null));
        this.copydefault = MutableStateFlow;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<StateListAnimator> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new StateListAnimator(null, false, null, false, false, 31, null));
        this.OLrzqt = MutableStateFlow2;
        this.AuCTel = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<java.lang.String> MutableStateFlow3 = StateFlowKt.MutableStateFlow("");
        this.EZpvd = MutableStateFlow3;
        Fragment fragment = new Fragment(savedStateHandle.getStateFlow("data", new TacticsData(null, null, null, null, null, null, false, null, null, 0, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, 3, null)));
        this.DbNXlk = fragment;
        this.isConnected = new FragmentManager(FlowKt.flowCombine(fragment, MutableStateFlow3, new FuturesGridWithdrawViewModel$tickerState$1(null)), this);
    }

    /* JADX INFO: renamed from: o.vfc$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vfc.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.vfc$Fragment */
    public static final class Fragment implements Flow<java.lang.String> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: o.vfc$Fragment$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                FuturesGridWithdrawViewModel$special$$inlined$map$1$2$1 futuresGridWithdrawViewModel$special$$inlined$map$1$2$1;
                if (continuation instanceof FuturesGridWithdrawViewModel$special$$inlined$map$1$2$1) {
                    futuresGridWithdrawViewModel$special$$inlined$map$1$2$1 = (FuturesGridWithdrawViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = futuresGridWithdrawViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        futuresGridWithdrawViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        futuresGridWithdrawViewModel$special$$inlined$map$1$2$1 = new FuturesGridWithdrawViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = futuresGridWithdrawViewModel$special$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = futuresGridWithdrawViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    java.lang.String lastPrice = ((TacticsData) obj).getLastPrice();
                    futuresGridWithdrawViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(lastPrice, futuresGridWithdrawViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Fragment(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.String> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.vfc$FragmentManager */
    public static final class FragmentManager implements Flow<java.lang.String> {
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ C51045vfc copydefault;

        /* JADX INFO: renamed from: o.vfc$FragmentManager$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;
            public final /* synthetic */ C51045vfc copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, C51045vfc c51045vfc) {
                this.KWHzl = flowCollector;
                this.copydefault = c51045vfc;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                FuturesGridWithdrawViewModel$special$$inlined$map$2$2$1 futuresGridWithdrawViewModel$special$$inlined$map$2$2$1;
                if (continuation instanceof FuturesGridWithdrawViewModel$special$$inlined$map$2$2$1) {
                    futuresGridWithdrawViewModel$special$$inlined$map$2$2$1 = (FuturesGridWithdrawViewModel$special$$inlined$map$2$2$1) continuation;
                    int i = futuresGridWithdrawViewModel$special$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        futuresGridWithdrawViewModel$special$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        futuresGridWithdrawViewModel$special$$inlined$map$2$2$1 = new FuturesGridWithdrawViewModel$special$$inlined$map$2$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = futuresGridWithdrawViewModel$special$$inlined$map$2$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = futuresGridWithdrawViewModel$special$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.lang.String strKWHzl = C50964veA.KWHzl(C56033xvF.getBotPrice$default(this.copydefault.KWHzl().getInstType(), this.copydefault.KWHzl().getInstId(), (java.lang.String) obj, false, false, null, null, 120, null));
                    futuresGridWithdrawViewModel$special$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(strKWHzl, futuresGridWithdrawViewModel$special$$inlined$map$2$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public FragmentManager(Flow flow, C51045vfc c51045vfc) {
            this.EZpvd = flow;
            this.copydefault = c51045vfc;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.String> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass5(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final TacticsData KWHzl() {
        TacticsData tacticsData = (TacticsData) this.values.get("data");
        return tacticsData == null ? new TacticsData(null, null, null, null, null, null, false, null, null, 0, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, 3, null) : tacticsData;
    }

    /* JADX INFO: renamed from: o.vfc$StateListAnimator */
    public static final class StateListAnimator {
        public final boolean AEQbTJ;
        public final java.lang.String EZpvd;
        public final boolean KWHzl;
        public final boolean OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, false, null, false, false, 31, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, boolean z, java.lang.String str2, boolean z2, boolean z3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.EZpvd;
            }
            if ((i & 2) != 0) {
                z = stateListAnimator.OLrzqt;
            }
            boolean z4 = z;
            if ((i & 4) != 0) {
                str2 = stateListAnimator.copydefault;
            }
            java.lang.String str3 = str2;
            if ((i & 8) != 0) {
                z2 = stateListAnimator.AEQbTJ;
            }
            boolean z5 = z2;
            if ((i & 16) != 0) {
                z3 = stateListAnimator.KWHzl;
            }
            return stateListAnimator.AEQbTJ(str, z4, str3, z5, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull java.lang.String str, boolean z, java.lang.String str2, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str, z, str2, z2, z3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) stateListAnimator.EZpvd) && this.OLrzqt == stateListAnimator.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault) && this.AEQbTJ == stateListAnimator.AEQbTJ && this.KWHzl == stateListAnimator.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            int iHashCode2 = java.lang.Boolean.hashCode(this.OLrzqt);
            java.lang.String str = this.copydefault;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UiState(withdrawAmount=" + this.EZpvd + ", isWithdrawAmountValid=" + this.OLrzqt + ", withdrawAmountError=" + this.copydefault + ", isConfirmEnabled=" + this.AEQbTJ + ", isProcessing=" + this.KWHzl + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str, boolean z, java.lang.String str2, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
            this.OLrzqt = z;
            this.copydefault = str2;
            this.AEQbTJ = z2;
            this.KWHzl = z3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:boolean:0x000b: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r5v0 boolean))
  (wrap:java.lang.String:0x0011: TERNARY null = ((wrap:int:0x000c: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001a: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
 A[MD:(java.lang.String, boolean, java.lang.String, boolean, boolean):void (m)] (LINE:84) call: o.vfc.StateListAnimator.<init>(java.lang.String, boolean, java.lang.String, boolean, boolean):void type: THIS */
        public /* synthetic */ StateListAnimator(java.lang.String str, boolean z, java.lang.String str2, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3);
        }
    }

    /* JADX INFO: renamed from: o.vfc$Activity */
    public static final class Activity {
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = activity.copydefault;
            }
            if ((i & 4) != 0) {
                str3 = activity.OLrzqt;
            }
            return activity.KWHzl(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new Activity(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) activity.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            int iHashCode2 = this.copydefault.hashCode();
            java.lang.String str = this.OLrzqt;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MarginBalanceData(maxAmt=" + this.KWHzl + ", lever=" + this.copydefault + ", accAmt=" + this.OLrzqt + ")";
        }

        public Activity(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.KWHzl = str;
            this.copydefault = str2;
            this.OLrzqt = str3;
        }
    }

    /* JADX INFO: renamed from: o.vfc$TaskDescription */
    public interface TaskDescription {

        /* JADX INFO: renamed from: o.vfc$TaskDescription$ActionBar */
        public static final class ActionBar implements TaskDescription {
            public static final ActionBar copydefault = new ActionBar();

            private ActionBar() {
            }
        }

        /* JADX INFO: renamed from: o.vfc$TaskDescription$Application */
        public static final class Application implements TaskDescription {
            public static final Application AEQbTJ = new Application();

            private Application() {
            }
        }

        /* JADX INFO: renamed from: o.vfc$TaskDescription$StateListAnimator */
        public static final class StateListAnimator implements TaskDescription {
            public final java.lang.String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.copydefault;
                }
                return stateListAnimator.OLrzqt(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator OLrzqt(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new StateListAnimator(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String copydefault() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((StateListAnimator) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "ShowError(message=" + this.copydefault + ")";
            }

            public StateListAnimator(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = str;
            }
        }

        /* JADX INFO: renamed from: o.vfc$TaskDescription$Activity */
        public static final class Activity implements TaskDescription {
            public final java.lang.String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = activity.OLrzqt;
                }
                return activity.AEQbTJ(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity AEQbTJ(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Activity(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((Activity) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "ShowSuccess(withdrawnAmount=" + this.OLrzqt + ")";
            }

            public Activity(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = str;
            }
        }
    }

    /* JADX INFO: renamed from: o.vfc$Application */
    public interface Application {

        /* JADX INFO: renamed from: o.vfc$Application$Activity */
        public static final class Activity implements Application {
            public final MarginBalanceType AEQbTJ;
            public final java.lang.String EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, MarginBalanceType marginBalanceType, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = activity.EZpvd;
                }
                if ((i & 2) != 0) {
                    marginBalanceType = activity.AEQbTJ;
                }
                return activity.copydefault(str, marginBalanceType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final MarginBalanceType KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity copydefault(@NotNull java.lang.String str, @NotNull MarginBalanceType marginBalanceType) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(marginBalanceType, "");
                return new Activity(str, marginBalanceType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                Activity activity = (Activity) obj;
                return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd) && this.AEQbTJ == activity.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Initialize(algoId=" + this.EZpvd + ", type=" + this.AEQbTJ + ")";
            }

            public Activity(@NotNull java.lang.String str, @NotNull MarginBalanceType marginBalanceType) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(marginBalanceType, "");
                this.EZpvd = str;
                this.AEQbTJ = marginBalanceType;
            }
        }

        /* JADX INFO: renamed from: o.vfc$Application$Dialog */
        public static final class Dialog implements Application {
            public final java.lang.String AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Dialog copy$default(Dialog dialog, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = dialog.AEQbTJ;
                }
                return dialog.OLrzqt(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Dialog OLrzqt(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Dialog(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Dialog) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((Dialog) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "UpdateWithdrawAmount(amount=" + this.AEQbTJ + ")";
            }

            public Dialog(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.AEQbTJ = str;
            }
        }

        /* JADX INFO: renamed from: o.vfc$Application$ActionBar */
        public static final class ActionBar implements Application {
            public final MarginBalanceType KWHzl;
            public final java.lang.String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, MarginBalanceType marginBalanceType, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = actionBar.copydefault;
                }
                if ((i & 2) != 0) {
                    marginBalanceType = actionBar.KWHzl;
                }
                return actionBar.copydefault(str, marginBalanceType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String OLrzqt() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final MarginBalanceType copydefault() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar copydefault(@NotNull java.lang.String str, @NotNull MarginBalanceType marginBalanceType) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(marginBalanceType, "");
                return new ActionBar(str, marginBalanceType);
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
                return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) actionBar.copydefault) && this.KWHzl == actionBar.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.copydefault.hashCode() * 31) + this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "ConfirmWithdraw(algoId=" + this.copydefault + ", type=" + this.KWHzl + ")";
            }

            public ActionBar(@NotNull java.lang.String str, @NotNull MarginBalanceType marginBalanceType) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(marginBalanceType, "");
                this.copydefault = str;
                this.KWHzl = marginBalanceType;
            }
        }

        /* JADX INFO: renamed from: o.vfc$Application$StateListAnimator */
        public static final class StateListAnimator implements Application {
            public static final StateListAnimator KWHzl = new StateListAnimator();

            private StateListAnimator() {
            }
        }

        /* JADX INFO: renamed from: o.vfc$Application$Application, reason: collision with other inner class name */
        public static final class C0984Application implements Application {
            public static final C0984Application EZpvd = new C0984Application();

            private C0984Application() {
            }
        }

        /* JADX INFO: renamed from: o.vfc$Application$TaskDescription */
        public static final class TaskDescription implements Application {
            public static final TaskDescription OLrzqt = new TaskDescription();

            private TaskDescription() {
            }
        }
    }

    public final void AEQbTJ(@NotNull Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "");
        if (this.fARcdN == null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FuturesGridWithdrawViewModel$init$1(this, lifecycle, null), 3, null);
        }
    }

    public final void copydefault(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        if (application instanceof Application.Activity) {
            Application.Activity activity = (Application.Activity) application;
            AEQbTJ(activity.AEQbTJ(), activity.KWHzl());
            return;
        }
        if (application instanceof Application.Dialog) {
            EZpvd(((Application.Dialog) application).OLrzqt());
            return;
        }
        if (application instanceof Application.ActionBar) {
            Application.ActionBar actionBar = (Application.ActionBar) application;
            OLrzqt(actionBar.OLrzqt(), actionBar.copydefault());
        } else if (application instanceof Application.StateListAnimator) {
            AhwBna();
        } else if (application instanceof Application.C0984Application) {
            djBIcL();
        } else {
            if (!(application instanceof Application.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            EZpvd();
        }
    }

    private final void djBIcL() {
        Job job = this.fARcdN;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.fARcdN = null;
        Job job2 = this.AhwBna;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.AhwBna = null;
        pUU.EZpvd("FuturesGridWithdrawViewModel", "websocket and debounce tasks cleared");
    }

    public final void AEQbTJ(java.lang.String str, MarginBalanceType marginBalanceType) {
        pUU.EZpvd("FuturesGridWithdrawViewModel", "Initialize: algoId=" + str + ", type=" + marginBalanceType);
        this.valueOf = str;
        this.gEmmrt = marginBalanceType;
        java.lang.String strKWHzl = this.OLrzqt.getValue().KWHzl();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl)) {
            strKWHzl = "0";
        }
        copydefault(str, marginBalanceType, strKWHzl);
    }

    public final void copydefault(java.lang.String str, MarginBalanceType marginBalanceType, java.lang.String str2) {
        wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new FuturesGridWithdrawViewModel$fetchMarginBalance$1(this, str2, str, marginBalanceType, null), 3, null);
    }

    public final void EZpvd(java.lang.String str) {
        Activity activityKWHzl = this.AkhnZx.getValue().KWHzl();
        if (activityKWHzl == null) {
            return;
        }
        StateListAnimator value = this.OLrzqt.getValue();
        boolean zAEQbTJ = AEQbTJ(str, activityKWHzl.OLrzqt());
        this.OLrzqt.setValue(StateListAnimator.copy$default(value, str, zAEQbTJ, zAEQbTJ ? null : OLrzqt(str, activityKWHzl.OLrzqt()), zAEQbTJ && C33129mqd.OLrzqt((java.lang.CharSequence) str) && !value.copydefault(), false, 16, null));
        OLrzqt(str);
        pUU.EZpvd("FuturesGridWithdrawViewModel", "Update withdraw amount: " + str + ", valid: " + zAEQbTJ);
    }

    public final void OLrzqt(java.lang.String str) {
        MarginBalanceType marginBalanceType;
        Job job = this.AhwBna;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        java.lang.String str2 = this.valueOf;
        if (str2 == null || (marginBalanceType = this.gEmmrt) == null) {
            return;
        }
        this.AhwBna = wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new FuturesGridWithdrawViewModel$debounceFetchMarginBalance$1(str, this, str2, marginBalanceType, null), 3, null);
    }

    public final void OLrzqt(java.lang.String str, MarginBalanceType marginBalanceType) {
        StateListAnimator value = this.OLrzqt.getValue();
        java.lang.String strKWHzl = value.KWHzl();
        if (value.OLrzqt() && C33129mqd.OLrzqt((java.lang.CharSequence) strKWHzl)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FuturesGridWithdrawViewModel$confirmWithdraw$1(this, value, str, marginBalanceType, strKWHzl, null), 3, null);
        } else {
            pUU.valueOf("FuturesGridWithdrawViewModel", "Cannot confirm withdraw: invalid amount");
        }
    }

    public final void EZpvd() {
        Activity activityKWHzl = this.AkhnZx.getValue().KWHzl();
        if (activityKWHzl == null) {
            return;
        }
        EZpvd(activityKWHzl.OLrzqt());
    }

    private final void AhwBna() {
        this.OLrzqt.setValue(StateListAnimator.copy$default(this.OLrzqt.getValue(), null, true, null, false, false, 25, null));
    }

    public final boolean AEQbTJ(java.lang.String str, java.lang.String str2) {
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return true;
        }
        return C33129mqd.AEQbTJ(str, 0) && C33129mqd.valueOf(str, str2);
    }

    public final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2) {
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return null;
        }
        if (C33129mqd.valueOf(str, 0)) {
            return C33070mpX.AYXKKw(C48033uCm.Fragment.OijiEz);
        }
        if (C33129mqd.AEQbTJ(str, str2)) {
            return C33070mpX.AYXKKw(C48033uCm.Fragment.dPkBzA);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object EZpvd(Lifecycle lifecycle, Continuation<? super Job> continuation) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        if (state.compareTo(Lifecycle.State.CREATED) < 0) {
            throw new java.lang.IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
        boolean zIsDispatchNeeded = immediate.isDispatchNeeded(continuation.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.djBIcL, null, new FuturesGridWithdrawViewModel$observeWebSocket$2$1(this, null), 2, null);
            }
        }
        return WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, immediate, new Function0<Job>() { // from class: com.okinc.tradingbot.impl.futures_grid.FuturesGridWithdrawViewModel$observeWebSocket$$inlined$withStateAtLeast$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Job invoke() {
                return wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this.this$0), this.this$0.djBIcL, null, new FuturesGridWithdrawViewModel$observeWebSocket$2$1(this.this$0, null), 2, null);
            }
        }, continuation);
    }
}
