package com.okinc.tradingbot.impl.planet.ui;

import androidx.lifecycle.ViewModelKt;
import com.okinc.tradingbot.impl.planet.model.BotUiState;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC56429yFa;
import o.C53664wpk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.uLN;
import o.uLU;
import o.wUL;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class PlanetOngoingBotsViewModel extends uLN<Unit> {
    public final StateFlow<Boolean> EZpvd;
    public final C53664wpk KWHzl;
    public final MutableStateFlow<uLU<StateListAnimator>> OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final StateFlow<uLU<StateListAnimator>> valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<uLU<StateListAnimator>> copydefault() {
        return this.valueOf;
    }

    @yCM
    public PlanetOngoingBotsViewModel(@NotNull C53664wpk c53664wpk, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c53664wpk, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = c53664wpk;
        this.copydefault = coroutineDispatcher;
        MutableStateFlow<uLU<StateListAnimator>> MutableStateFlow = StateFlowKt.MutableStateFlow(uLU.Companion.EZpvd(true));
        this.OLrzqt = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        this.EZpvd = FlowKt.stateIn(new PendingIntent(MutableStateFlow), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), Boolean.FALSE);
    }

    public static final class Application extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public final /* synthetic */ PlanetOngoingBotsViewModel AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(CoroutineExceptionHandler.Key key, PlanetOngoingBotsViewModel planetOngoingBotsViewModel) {
            super(key);
            this.AEQbTJ = planetOngoingBotsViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            Object value;
            Object objCopydefault;
            pUU.AEQbTJ("PlanetOngoingBotsViewModel", "Failed to load more ongoing bots", th);
            MutableStateFlow mutableStateFlow = this.AEQbTJ.OLrzqt;
            do {
                value = mutableStateFlow.getValue();
                objCopydefault = (uLU) value;
                if (objCopydefault instanceof uLU.ActionBar) {
                    uLU.ActionBar actionBar = (uLU.ActionBar) objCopydefault;
                    objCopydefault = actionBar.copydefault(StateListAnimator.copy$default((StateListAnimator) actionBar.KWHzl(), null, false, null, false, 7, null));
                }
            } while (!mutableStateFlow.compareAndSet(value, objCopydefault));
        }
    }

    public static final class Fragment extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public final /* synthetic */ PlanetOngoingBotsViewModel EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fragment(CoroutineExceptionHandler.Key key, PlanetOngoingBotsViewModel planetOngoingBotsViewModel) {
            super(key);
            this.EZpvd = planetOngoingBotsViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            pUU.AEQbTJ("PlanetOngoingBotsViewModel", "Failed to load ongoing bots", th);
            this.EZpvd.OLrzqt.setValue(uLU.Companion.KWHzl(th));
        }
    }

    public static final class TaskDescription extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public TaskDescription(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
            pUU.AEQbTJ("PlanetOngoingBotsViewModel", "Failed to handle bot selection", th);
        }
    }

    public final BotUiState AEQbTJ() {
        uLU<StateListAnimator> value = this.OLrzqt.getValue();
        Object obj = null;
        if (!(value instanceof uLU.ActionBar)) {
            return null;
        }
        Iterator<T> it = ((StateListAnimator) ((uLU.ActionBar) value).KWHzl()).copydefault().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((BotUiState) next).isConnected()) {
                obj = next;
                break;
            }
        }
        return (BotUiState) obj;
    }

    public static final class PendingIntent implements Flow<Boolean> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsViewModel$PendingIntent$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.AEQbTJ = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0078 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                PlanetOngoingBotsViewModel$special$$inlined$map$1$2$1 planetOngoingBotsViewModel$special$$inlined$map$1$2$1;
                boolean z;
                Boolean boolKWHzl;
                if (continuation instanceof PlanetOngoingBotsViewModel$special$$inlined$map$1$2$1) {
                    planetOngoingBotsViewModel$special$$inlined$map$1$2$1 = (PlanetOngoingBotsViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = planetOngoingBotsViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        planetOngoingBotsViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        planetOngoingBotsViewModel$special$$inlined$map$1$2$1 = new PlanetOngoingBotsViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object obj2 = planetOngoingBotsViewModel$special$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = planetOngoingBotsViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    uLU ulu = (uLU) obj;
                    if (ulu instanceof uLU.ActionBar) {
                        List<BotUiState> listCopydefault = ((StateListAnimator) ((uLU.ActionBar) ulu).KWHzl()).copydefault();
                        if (!(listCopydefault instanceof Collection) || !listCopydefault.isEmpty()) {
                            Iterator<T> it = listCopydefault.iterator();
                            while (it.hasNext()) {
                                if (((BotUiState) it.next()).isConnected()) {
                                    z = true;
                                    break;
                                }
                            }
                            z = false;
                            boolKWHzl = C56443yFo.KWHzl(z);
                            planetOngoingBotsViewModel$special$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(boolKWHzl, planetOngoingBotsViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
                                return objCopydefault;
                            }
                        } else {
                            z = false;
                            boolKWHzl = C56443yFo.KWHzl(z);
                            planetOngoingBotsViewModel$special$$inlined$map$1$2$1.label = 1;
                            if (flowCollector.emit(boolKWHzl, planetOngoingBotsViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
                            }
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public PendingIntent(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final void EZpvd(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        if (actionBar instanceof ActionBar.TaskDescription) {
            OLrzqt(((ActionBar.TaskDescription) actionBar).EZpvd());
            return;
        }
        if ((actionBar instanceof ActionBar.Application) || (actionBar instanceof ActionBar.Activity)) {
            AEQbTJ(true);
        } else {
            if (!(actionBar instanceof ActionBar.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            KWHzl();
        }
    }

    public final void OLrzqt(String str) {
        wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.copydefault.plus(new TaskDescription(CoroutineExceptionHandler.Key)), null, new PlanetOngoingBotsViewModel$handleSelectBot$2(this, str, null), 2, null);
    }

    public final void AEQbTJ(boolean z) {
        this.OLrzqt.setValue(uLU.Companion.EZpvd(z));
        wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.copydefault.plus(new Fragment(CoroutineExceptionHandler.Key, this)), null, new PlanetOngoingBotsViewModel$loadOngoingBots$2(this, null), 2, null);
    }

    public final void KWHzl() {
        uLU<StateListAnimator> value;
        uLU<StateListAnimator> uluCopydefault;
        uLU<StateListAnimator> value2 = this.OLrzqt.getValue();
        if (value2 instanceof uLU.ActionBar) {
            StateListAnimator stateListAnimator = (StateListAnimator) ((uLU.ActionBar) value2).KWHzl();
            if (!stateListAnimator.OLrzqt() || stateListAnimator.KWHzl()) {
                return;
            }
            MutableStateFlow<uLU<StateListAnimator>> mutableStateFlow = this.OLrzqt;
            do {
                value = mutableStateFlow.getValue();
                uluCopydefault = value;
                if (uluCopydefault instanceof uLU.ActionBar) {
                    uLU.ActionBar actionBar = (uLU.ActionBar) uluCopydefault;
                    uluCopydefault = actionBar.copydefault(StateListAnimator.copy$default((StateListAnimator) actionBar.KWHzl(), null, false, null, true, 7, null));
                }
            } while (!mutableStateFlow.compareAndSet(value, uluCopydefault));
            wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.copydefault.plus(new Application(CoroutineExceptionHandler.Key, this)), null, new PlanetOngoingBotsViewModel$loadMoreOngoingBots$3(this, stateListAnimator, null), 2, null);
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public interface ActionBar {

        public static final class Activity implements ActionBar {
            public static final Activity AEQbTJ = new Activity();

            private Activity() {
            }
        }

        public static final class Application implements ActionBar {
            public static final Application copydefault = new Application();

            private Application() {
            }
        }

        public static final class StateListAnimator implements ActionBar {
            public static final StateListAnimator EZpvd = new StateListAnimator();

            private StateListAnimator() {
            }
        }

        public static final class TaskDescription implements ActionBar {
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = taskDescription.OLrzqt;
                }
                return taskDescription.AEQbTJ(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription AEQbTJ(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new TaskDescription(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) ((TaskDescription) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SelectBot(algoId=" + this.OLrzqt + ")";
            }

            public TaskDescription(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = str;
            }
        }
    }

    public static final class StateListAnimator {
        public final boolean EZpvd;
        public final String KWHzl;
        public final List<BotUiState> OLrzqt;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
            this(null, false, null, false, 15, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsViewModel$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, List list, boolean z, String str, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = stateListAnimator.OLrzqt;
            }
            if ((i & 2) != 0) {
                z = stateListAnimator.copydefault;
            }
            if ((i & 4) != 0) {
                str = stateListAnimator.KWHzl;
            }
            if ((i & 8) != 0) {
                z2 = stateListAnimator.EZpvd;
            }
            return stateListAnimator.EZpvd(list, z, str, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull List<BotUiState> list, boolean z, String str, boolean z2) {
            Intrinsics.checkNotNullParameter(list, "");
            return new StateListAnimator(list, z, str, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<BotUiState> copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt) && this.copydefault == stateListAnimator.copydefault && Intrinsics.EZpvd((Object) this.KWHzl, (Object) stateListAnimator.KWHzl) && this.EZpvd == stateListAnimator.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            int iHashCode2 = Boolean.hashCode(this.copydefault);
            String str = this.KWHzl;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UiState(ongoingBots=" + this.OLrzqt + ", hasMore=" + this.copydefault + ", lastShownAlgoId=" + this.KWHzl + ", isLoadingMore=" + this.EZpvd + ")";
        }

        public StateListAnimator(@NotNull List<BotUiState> list, boolean z, String str, boolean z2) {
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = list;
            this.copydefault = z;
            this.KWHzl = str;
            this.EZpvd = z2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:172)) : (r2v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0008: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(java.util.List<com.okinc.tradingbot.impl.planet.model.BotUiState>, boolean, java.lang.String, boolean):void (m)] (LINE:171) call: com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsViewModel.StateListAnimator.<init>(java.util.List, boolean, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ StateListAnimator(List list, boolean z, String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z2);
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.planet.ui.PlanetOngoingBotsViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
