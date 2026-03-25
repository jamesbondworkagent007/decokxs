package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.tradingbot.impl.signalClone.ui.SignalCloneViewModel$fetchAlgoInfo$2;
import com.okinc.tradingbot.impl.signalClone.ui.SignalCloneViewModel$fetchParameter$1;
import com.okinc.tradingbot.impl.signalClone.ui.SignalCloneViewModel$handleInputAmountChanged$1;
import com.okinc.tradingbot.impl.signalClone.ui.SignalCloneViewModel$handleSeekBarPercentChanged$1;
import com.okinc.tradingbot.impl.signalClone.ui.SignalCloneViewModel$placeOrder$2;
import com.okinc.tradingbot.impl.signalClone.ui.SignalCloneViewModel$refreshInputSettings$2;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.biz.StrategyResponse;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C48033uCm;
import o.C48158uHc;
import o.C52020vxx;
import o.C53736wrC;
import o.C55688xof;
import o.InterfaceC54581xNr;
import o.uLU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wsn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53826wsn extends uLN<TaskDescription> {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public C55887xsS AEQbTJ;
    public final C52020vxx AYXKKw;
    public java.lang.String AhwBna;
    public final CoroutineDispatcher AkhnZx;
    public final StateFlow<uLU<C53739wrF>> DbNXlk;
    public final MutableStateFlow<uLU<C53739wrF>> EZpvd;
    public final MutableStateFlow<uLU<C53740wrG>> OLrzqt;
    public final CoroutineDispatcher copydefault;
    public java.lang.String djBIcL;
    public final StateFlow<uLU<C53740wrG>> fetchVPNInfo;
    public final C48158uHc gEmmrt;
    public final C53736wrC valueOf;
    public final C53735wrB values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<uLU<C53740wrG>> EZpvd() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<uLU<C53739wrF>> copydefault() {
        return this.DbNXlk;
    }

    /* JADX INFO: renamed from: o.wsn$ActionBar */
    public static final class ActionBar extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public final /* synthetic */ C53826wsn OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(CoroutineExceptionHandler.Key key, C53826wsn c53826wsn) {
            super(key);
            this.OLrzqt = c53826wsn;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            pUU.AEQbTJ("SignalCloneViewModel", "Place order failed", th);
            this.OLrzqt.EZpvd(new TaskDescription.Activity(th));
        }
    }

    /* JADX INFO: renamed from: o.wsn$Application */
    public static final class Application extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public final /* synthetic */ C53826wsn OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(CoroutineExceptionHandler.Key key, C53826wsn c53826wsn) {
            super(key);
            this.OLrzqt = c53826wsn;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            pUU.AEQbTJ("SignalCloneViewModel", "Fetch algo info failed", th);
            this.OLrzqt.EZpvd.setValue(uLU.Companion.KWHzl(th));
        }
    }

    /* JADX INFO: renamed from: o.wsn$PendingIntent */
    public static final class PendingIntent extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public PendingIntent(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            pUU.AEQbTJ("SignalCloneViewModel", "Refresh input settings failed", th);
        }
    }

    @yCM
    public C53826wsn(@NotNull C48158uHc c48158uHc, @NotNull C52020vxx c52020vxx, @NotNull C53736wrC c53736wrC, @NotNull C53735wrB c53735wrB, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineDispatcher coroutineDispatcher2) {
        Intrinsics.checkNotNullParameter(c48158uHc, "");
        Intrinsics.checkNotNullParameter(c52020vxx, "");
        Intrinsics.checkNotNullParameter(c53736wrC, "");
        Intrinsics.checkNotNullParameter(c53735wrB, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
        this.gEmmrt = c48158uHc;
        this.AYXKKw = c52020vxx;
        this.valueOf = c53736wrC;
        this.values = c53735wrB;
        this.AkhnZx = coroutineDispatcher;
        this.copydefault = coroutineDispatcher2;
        uLU.StateListAnimator stateListAnimator = uLU.Companion;
        MutableStateFlow<uLU<C53740wrG>> MutableStateFlow = StateFlowKt.MutableStateFlow(stateListAnimator.EZpvd(true));
        this.OLrzqt = MutableStateFlow;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<uLU<C53739wrF>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(stateListAnimator.EZpvd(true));
        this.EZpvd = MutableStateFlow2;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow2);
        this.AhwBna = "";
        this.djBIcL = "";
    }

    /* JADX INFO: renamed from: o.wsn$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wsn.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.wsn$StateListAnimator */
    public interface StateListAnimator {

        /* JADX INFO: renamed from: o.wsn$StateListAnimator$TaskDescription */
        public static final class TaskDescription implements StateListAnimator {
            public final C48158uHc.StateListAnimator AEQbTJ;
            public final C52020vxx.Activity OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, C52020vxx.Activity activity, C48158uHc.StateListAnimator stateListAnimator, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    activity = taskDescription.OLrzqt;
                }
                if ((i & 2) != 0) {
                    stateListAnimator = taskDescription.AEQbTJ;
                }
                return taskDescription.AEQbTJ(activity, stateListAnimator);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C48158uHc.StateListAnimator AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription AEQbTJ(@NotNull C52020vxx.Activity activity, @NotNull C48158uHc.StateListAnimator stateListAnimator) {
                Intrinsics.checkNotNullParameter(activity, "");
                Intrinsics.checkNotNullParameter(stateListAnimator, "");
                return new TaskDescription(activity, stateListAnimator);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C52020vxx.Activity EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TaskDescription)) {
                    return false;
                }
                TaskDescription taskDescription = (TaskDescription) obj;
                return Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "FetchParameters(minimumInvestAmountInput=" + this.OLrzqt + ", balanceInput=" + this.AEQbTJ + ")";
            }

            public TaskDescription(@NotNull C52020vxx.Activity activity, @NotNull C48158uHc.StateListAnimator stateListAnimator) {
                Intrinsics.checkNotNullParameter(activity, "");
                Intrinsics.checkNotNullParameter(stateListAnimator, "");
                this.OLrzqt = activity;
                this.AEQbTJ = stateListAnimator;
            }
        }

        /* JADX INFO: renamed from: o.wsn$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0993StateListAnimator implements StateListAnimator {
            public final C53736wrC.StateListAnimator copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0993StateListAnimator copy$default(C0993StateListAnimator c0993StateListAnimator, C53736wrC.StateListAnimator stateListAnimator, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    stateListAnimator = c0993StateListAnimator.copydefault;
                }
                return c0993StateListAnimator.EZpvd(stateListAnimator);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C53736wrC.StateListAnimator AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0993StateListAnimator EZpvd(@NotNull C53736wrC.StateListAnimator stateListAnimator) {
                Intrinsics.checkNotNullParameter(stateListAnimator, "");
                return new C0993StateListAnimator(stateListAnimator);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0993StateListAnimator) && Intrinsics.EZpvd(this.copydefault, ((C0993StateListAnimator) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "FetchAlgoInfo(input=" + this.copydefault + ")";
            }

            public C0993StateListAnimator(@NotNull C53736wrC.StateListAnimator stateListAnimator) {
                Intrinsics.checkNotNullParameter(stateListAnimator, "");
                this.copydefault = stateListAnimator;
            }
        }

        /* JADX INFO: renamed from: o.wsn$StateListAnimator$Application */
        public static final class Application implements StateListAnimator {
            public final java.lang.String AEQbTJ;
            public final java.lang.String EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = application.EZpvd;
                }
                if ((i & 2) != 0) {
                    str2 = application.AEQbTJ;
                }
                return application.OLrzqt(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application OLrzqt(@NotNull java.lang.String str, java.lang.String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Application(str, str2);
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
                return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) application.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.EZpvd.hashCode();
                java.lang.String str = this.AEQbTJ;
                return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "RefreshInputSettings(botType=" + this.EZpvd + ", sourceCcy=" + this.AEQbTJ + ")";
            }

            public Application(@NotNull java.lang.String str, java.lang.String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = str;
                this.AEQbTJ = str2;
            }
        }

        /* JADX INFO: renamed from: o.wsn$StateListAnimator$ActionBar */
        public static final class ActionBar implements StateListAnimator {
            public final java.lang.String AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = actionBar.AEQbTJ;
                }
                return actionBar.EZpvd(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar EZpvd(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new ActionBar(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((ActionBar) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "InputAmountChanged(amount=" + this.AEQbTJ + ")";
            }

            public ActionBar(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.AEQbTJ = str;
            }
        }

        /* JADX INFO: renamed from: o.wsn$StateListAnimator$PendingIntent */
        public static final class PendingIntent implements StateListAnimator {
            public final float AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, float f, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    f = pendingIntent.AEQbTJ;
                }
                return pendingIntent.AEQbTJ(f);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PendingIntent AEQbTJ(float f) {
                return new PendingIntent(f);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final float KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PendingIntent) && java.lang.Float.compare(this.AEQbTJ, ((PendingIntent) obj).AEQbTJ) == 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return java.lang.Float.hashCode(this.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "SeekBarPercentChanged(percent=" + this.AEQbTJ + ")";
            }

            public PendingIntent(float f) {
                this.AEQbTJ = f;
            }
        }

        /* JADX INFO: renamed from: o.wsn$StateListAnimator$Activity */
        public static final class Activity implements StateListAnimator {
            public static final int OLrzqt = StrategyReqGroup.$stable;
            public final StrategyReqGroup EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, StrategyReqGroup strategyReqGroup, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    strategyReqGroup = activity.EZpvd;
                }
                return activity.EZpvd(strategyReqGroup);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity EZpvd(@NotNull StrategyReqGroup strategyReqGroup) {
                Intrinsics.checkNotNullParameter(strategyReqGroup, "");
                return new Activity(strategyReqGroup);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StrategyReqGroup OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd(this.EZpvd, ((Activity) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "PlaceOrder(requestGroup=" + this.EZpvd + ")";
            }

            public Activity(@NotNull StrategyReqGroup strategyReqGroup) {
                Intrinsics.checkNotNullParameter(strategyReqGroup, "");
                this.EZpvd = strategyReqGroup;
            }
        }
    }

    /* JADX INFO: renamed from: o.wsn$TaskDescription */
    public interface TaskDescription {

        /* JADX INFO: renamed from: o.wsn$TaskDescription$ActionBar */
        public static final class ActionBar implements TaskDescription {
            public static final int AEQbTJ = StrategyResponse.$stable;
            public final StrategyResponse KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, StrategyResponse strategyResponse, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    strategyResponse = actionBar.KWHzl;
                }
                return actionBar.AEQbTJ(strategyResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar AEQbTJ(@NotNull StrategyResponse strategyResponse) {
                Intrinsics.checkNotNullParameter(strategyResponse, "");
                return new ActionBar(strategyResponse);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StrategyResponse OLrzqt() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.KWHzl, ((ActionBar) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "OrderPlacedSuccess(strategyResponse=" + this.KWHzl + ")";
            }

            public ActionBar(@NotNull StrategyResponse strategyResponse) {
                Intrinsics.checkNotNullParameter(strategyResponse, "");
                this.KWHzl = strategyResponse;
            }
        }

        /* JADX INFO: renamed from: o.wsn$TaskDescription$Activity */
        public static final class Activity implements TaskDescription {
            public final java.lang.Throwable KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    th = activity.KWHzl;
                }
                return activity.KWHzl(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.Throwable KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity KWHzl(@NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new Activity(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd(this.KWHzl, ((Activity) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "OrderPlacedError(throwable=" + this.KWHzl + ")";
            }

            public Activity(@NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                this.KWHzl = th;
            }
        }
    }

    public final void copydefault(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        pUU.EZpvd("SignalCloneViewModel", "trigger action: " + stateListAnimator);
        if (stateListAnimator instanceof StateListAnimator.TaskDescription) {
            OLrzqt((StateListAnimator.TaskDescription) stateListAnimator);
            return;
        }
        if (stateListAnimator instanceof StateListAnimator.C0993StateListAnimator) {
            OLrzqt((StateListAnimator.C0993StateListAnimator) stateListAnimator);
            return;
        }
        if (stateListAnimator instanceof StateListAnimator.Application) {
            copydefault((StateListAnimator.Application) stateListAnimator);
            return;
        }
        if (stateListAnimator instanceof StateListAnimator.ActionBar) {
            AEQbTJ((StateListAnimator.ActionBar) stateListAnimator);
        } else if (stateListAnimator instanceof StateListAnimator.PendingIntent) {
            EZpvd((StateListAnimator.PendingIntent) stateListAnimator);
        } else {
            if (!(stateListAnimator instanceof StateListAnimator.Activity)) {
                throw new NoWhenBranchMatchedException();
            }
            KWHzl((StateListAnimator.Activity) stateListAnimator);
        }
    }

    public final void OLrzqt(StateListAnimator.C0993StateListAnimator c0993StateListAnimator) {
        wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.copydefault.plus(new Application(CoroutineExceptionHandler.Key, this)), null, new SignalCloneViewModel$fetchAlgoInfo$2(this, c0993StateListAnimator, null), 2, null);
    }

    public final void OLrzqt(StateListAnimator.TaskDescription taskDescription) {
        wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AkhnZx, null, new SignalCloneViewModel$fetchParameter$1(this, taskDescription, null), 2, null);
    }

    public final <T> T EZpvd(@NotNull Function1<? super C55887xsS, ? extends T> function1) {
        StrategyDetailsResponse strategyDetailsResponseOLrzqt;
        Intrinsics.checkNotNullParameter(function1, "");
        C55887xsS c55887xsS = this.AEQbTJ;
        C55887xsS c55887xsS2 = null;
        if (c55887xsS != null) {
            if (c55887xsS == null) {
                Intrinsics.gEmmrt("");
                c55887xsS = null;
            }
            return function1.invoke(c55887xsS);
        }
        C53739wrF c53739wrFKWHzl = this.DbNXlk.getValue().KWHzl();
        if (c53739wrFKWHzl == null || (strategyDetailsResponseOLrzqt = c53739wrFKWHzl.OLrzqt()) == null) {
            return null;
        }
        C55887xsS c55887xsS3 = new C55887xsS(strategyDetailsResponseOLrzqt.getInstType(), strategyDetailsResponseOLrzqt.getInstId());
        this.AEQbTJ = c55887xsS3;
        c55887xsS3.gEmmrt(strategyDetailsResponseOLrzqt.getTradeQuoteCcy());
        C55887xsS c55887xsS4 = this.AEQbTJ;
        if (c55887xsS4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c55887xsS2 = c55887xsS4;
        }
        return function1.invoke(c55887xsS2);
    }

    public final void copydefault(StateListAnimator.Application application) {
        wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.copydefault.plus(new PendingIntent(CoroutineExceptionHandler.Key)), null, new SignalCloneViewModel$refreshInputSettings$2(this, application, null), 2, null);
    }

    public final C53743wrJ copydefault(final java.lang.String str, final java.lang.String str2) {
        C53743wrJ c53743wrJ = (C53743wrJ) EZpvd(new Function1() { // from class: o.wsl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53826wsn.copydefault(this.OLrzqt, str, str2, (C55887xsS) obj);
            }
        });
        return c53743wrJ == null ? new C53743wrJ(null, 0, null, null, null, 0.0f, 63, null) : c53743wrJ;
    }

    public static final C53743wrJ copydefault(C53826wsn c53826wsn, java.lang.String str, java.lang.String str2, C55887xsS c55887xsS) {
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        return new C53743wrJ(c53826wsn.KWHzl(c55887xsS, str, str2), c53826wsn.AEQbTJ(c55887xsS), null, "", null, 0.0f, 52, null);
    }

    public final java.lang.String EZpvd(@NotNull final java.lang.String str, final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return (java.lang.String) EZpvd(new Function1() { // from class: o.wsm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53826wsn.EZpvd(this.EZpvd, str, str2, (C55887xsS) obj);
            }
        });
    }

    public static final java.lang.String EZpvd(C53826wsn c53826wsn, java.lang.String str, java.lang.String str2, C55887xsS c55887xsS) {
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        return c53826wsn.KWHzl(c55887xsS, str, str2);
    }

    public final java.lang.String KWHzl(C55887xsS c55887xsS, java.lang.String str, java.lang.String str2) {
        java.lang.String strDjBIcL = c55887xsS.djBIcL();
        if (Intrinsics.EZpvd((java.lang.Object) strDjBIcL, (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) strDjBIcL, (java.lang.Object) "FUTURES")) {
            BizInstrument bizInstrumentAhwBna = c55887xsS.AhwBna();
            str2 = bizInstrumentAhwBna != null ? bizInstrumentAhwBna.getMarginSymbol() : null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() == 0) {
                str2 = c55887xsS.AEQbTJ(str);
            }
        }
        java.lang.String str3 = str2 != null ? str2 : "";
        return str3.length() == 0 ? o.TaskDescription.AEQbTJ(c55887xsS.gEmmrt()).AEQbTJ() : str3;
    }

    public final int AEQbTJ(C55887xsS c55887xsS) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String strFJNWhG;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(c55887xsS.djBIcL())) != null) {
            BizInstrument bizInstrumentAhwBna = c55887xsS.AhwBna();
            java.lang.String instFamily = bizInstrumentAhwBna != null ? bizInstrumentAhwBna.getInstFamily() : null;
            if (instFamily == null) {
                instFamily = "";
            }
            if (Intrinsics.EZpvd((java.lang.Object) c55887xsS.djBIcL(), (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) c55887xsS.djBIcL(), (java.lang.Object) "FUTURES")) {
                strFJNWhG = abstractC54531xLwOLrzqt.fJNWhG(instFamily);
                if (strFJNWhG == null || strFJNWhG.length() == 0) {
                    strFJNWhG = "2";
                }
            } else {
                BizInstrument bizInstrumentAhwBna2 = c55887xsS.AhwBna();
                java.lang.String instFamily2 = bizInstrumentAhwBna2 != null ? bizInstrumentAhwBna2.getInstFamily() : null;
                IdxConfig idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(instFamily2 != null ? instFamily2 : "");
                quoteDig = idxConfigAkhnZx != null ? idxConfigAkhnZx.getQuoteDig() : null;
                if (quoteDig == null || quoteDig.length() == 0) {
                    strFJNWhG = "8";
                }
            }
            quoteDig = strFJNWhG;
        }
        return C33129mqd.AhwBna(quoteDig);
    }

    public final void AEQbTJ(StateListAnimator.ActionBar actionBar) {
        wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.copydefault, null, new SignalCloneViewModel$handleInputAmountChanged$1(this, actionBar, null), 2, null);
    }

    public final void EZpvd(StateListAnimator.PendingIntent pendingIntent) {
        wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.copydefault, null, new SignalCloneViewModel$handleSeekBarPercentChanged$1(this, pendingIntent, null), 2, null);
    }

    public final java.lang.String copydefault(java.lang.String str, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair2, java.lang.String str2) {
        java.lang.String strKWHzl;
        BigDecimal bigDecimalEZpvd;
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || pair == null || (strKWHzl = uLP.KWHzl(pair)) == null || (bigDecimalEZpvd = C33129mqd.EZpvd(strKWHzl)) == null) {
            return null;
        }
        if (C33129mqd.valueOf(str, bigDecimalEZpvd)) {
            return C33069mpW.copydefault(C48033uCm.Fragment.clearCurrentKeyboardTarget, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName1", C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2)), C56390yDp.OLrzqt("fieldName2", uLP.AEQbTJ(pair))));
        }
        if (C33129mqd.AEQbTJ(str, str2)) {
            return C33070mpX.AYXKKw(C48033uCm.Fragment.heceqZ);
        }
        java.lang.String strKWHzl2 = pair2 != null ? uLP.KWHzl(pair2) : null;
        if (strKWHzl2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl2) || !C33129mqd.AEQbTJ(str, uLP.KWHzl(pair2))) {
            return null;
        }
        return C33069mpW.copydefault(C48033uCm.Fragment.RcLksq, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName1", C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2)), C56390yDp.OLrzqt("fieldName2", uLP.AEQbTJ(pair2))));
    }

    public final void KWHzl(C52020vxx.ActionBar actionBar) {
        java.lang.String str;
        C53739wrF c53739wrFKWHzl = this.EZpvd.getValue().KWHzl();
        if (c53739wrFKWHzl == null) {
            return;
        }
        this.AhwBna = formatMargin$default(this, actionBar.OLrzqt(), c53739wrFKWHzl.OLrzqt(), false, 4, null);
        java.lang.String strAEQbTJ = actionBar.AEQbTJ();
        if (strAEQbTJ != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ)) {
            this.djBIcL = formatMargin$default(this, actionBar.AEQbTJ(), c53739wrFKWHzl.OLrzqt(), false, 4, null);
        }
        if (this.djBIcL.length() > 0 && this.AhwBna.length() > 0) {
            str = this.AhwBna + " - " + this.djBIcL;
        } else if (this.AhwBna.length() <= 0 || Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) "--")) {
            str = "";
        } else {
            str = "> " + this.AhwBna;
        }
        this.EZpvd.setValue(uLU.Companion.AEQbTJ(C53739wrF.copy$default(c53739wrFKWHzl, null, C53743wrJ.copy$default(c53739wrFKWHzl.KWHzl(), null, 0, null, str, null, 0.0f, 55, null), 1, null)));
    }

    public static /* synthetic */ java.lang.String formatMargin$default(C53826wsn c53826wsn, java.lang.String str, StrategyDetailsResponse strategyDetailsResponse, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return c53826wsn.KWHzl(str, strategyDetailsResponse, z);
    }

    public final java.lang.String KWHzl(@NotNull final java.lang.String str, @NotNull final StrategyDetailsResponse strategyDetailsResponse, final boolean z) {
        final InterfaceC54581xNr interfaceC54581xNrCopydefault;
        java.lang.String instId;
        final java.lang.String str2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        if (str.length() == 0 || (interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault()) == null) {
            return "--";
        }
        if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getOrderType(), (java.lang.Object) "smart_portfolio")) {
            instId = "BTC-" + strategyDetailsResponse.getInvestCcy();
        } else {
            instId = strategyDetailsResponse.getInstId();
        }
        final BizInstrument suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, strategyDetailsResponse.getInstType(), instId, null, null, 12, null);
        java.lang.String strEZpvd = EZpvd(strategyDetailsResponse.getOrderType(), strategyDetailsResponse.getSourceCcy());
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        if (strEZpvd.length() == 0) {
            java.lang.String quoteSymbol = suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null;
            str2 = quoteSymbol != null ? quoteSymbol : "";
        } else {
            str2 = strEZpvd;
        }
        final java.lang.String str3 = instId;
        return C53418wlC.copydefault((java.lang.String) EZpvd(new Function1() { // from class: o.wsq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53826wsn.OLrzqt(interfaceC54581xNrCopydefault, strategyDetailsResponse, suggestedInstrument$default, str3, str, str2, z, (C55887xsS) obj);
            }
        }));
    }

    public static final java.lang.String OLrzqt(InterfaceC54581xNr interfaceC54581xNr, StrategyDetailsResponse strategyDetailsResponse, BizInstrument bizInstrument, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, C55887xsS c55887xsS) {
        java.lang.String strAEQbTJ;
        C54536xML c54536xMLCopydefault;
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNr.OLrzqt(strategyDetailsResponse.getInstType());
        if (abstractC54531xLwOLrzqt == null) {
            return "--";
        }
        if (bizInstrument == null || (strAEQbTJ = bizInstrument.getInstFamily()) == null) {
            strAEQbTJ = xUW.KWHzl.AEQbTJ(str);
        }
        java.lang.String instType = strategyDetailsResponse.getInstType();
        if (Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) "FUTURES")) {
            c54536xMLCopydefault = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, strAEQbTJ, null, 2, null).copydefault(str2);
            if (c54536xMLCopydefault == null) {
                return "--";
            }
        } else {
            c54536xMLCopydefault = abstractC54531xLwOLrzqt.AhwBna(strAEQbTJ, str3).djBIcL(str2);
        }
        C54536xML c54536xMLCopydefault2 = c54536xMLCopydefault.AEQbTJ(true).copydefault();
        if (z) {
            c54536xMLCopydefault2.fetchVPNInfo();
        }
        return C53418wlC.copydefault(C54536xML.toSafeString$default(c54536xMLCopydefault2.djBIcL(), false, 1, null));
    }

    public final void KWHzl(StateListAnimator.Activity activity) {
        wUL.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AkhnZx.plus(new ActionBar(CoroutineExceptionHandler.Key, this)), null, new SignalCloneViewModel$placeOrder$2(this, activity, null), 2, null);
    }
}
