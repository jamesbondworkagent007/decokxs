package o;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.tradingbot.impl.order.strategy.data.BotModel;
import com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheetViewModel$state$1;
import com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheetViewModel$state$2;
import com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheetViewModel$submitChanges$1;
import com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheetViewModel$trigger$2;
import com.okinc.unify_trade.biz.bot.EarnType;
import com.okinc.unify_trade.biz.bot.EditEarnRequestDto;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.biz.bot.SmartEarnProperties;
import com.okinc.unify_trade.biz.bot.SmartEarnRequestParam;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vQv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50503vQv extends ViewModel {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final MutableStateFlow<ActionBar> AEQbTJ;
    public final C50545vSj AYXKKw;
    public final SavedStateHandle AhwBna;
    public final InterfaceC56387yDm DbNXlk;
    public final MutableSharedFlow<Activity> EZpvd;
    public final CoroutineDispatcher OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final StateFlow<FragmentManager> fetchVPNInfo;
    public final C50544vSi gEmmrt;
    public final SharedFlow<Activity> isConnected;
    public final InterfaceC56387yDm valueOf;
    public final StateFlow<ActionBar> values;

    /* JADX INFO: renamed from: o.vQv$Fragment */
    public final /* synthetic */ class Fragment {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[EarnType.values().length];
            try {
                iArr[EarnType.Ratio.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[EarnType.Absolute.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ActionBar> EZpvd() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<FragmentManager> KWHzl() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Activity> OLrzqt() {
        return this.isConnected;
    }

    public C50503vQv(@NotNull SavedStateHandle savedStateHandle, @NotNull C50544vSi c50544vSi, @NotNull C50545vSj c50545vSj, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c50544vSi, "");
        Intrinsics.checkNotNullParameter(c50545vSj, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AhwBna = savedStateHandle;
        this.gEmmrt = c50544vSi;
        this.AYXKKw = c50545vSj;
        this.OLrzqt = coroutineDispatcher;
        MutableSharedFlow<Activity> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.isConnected = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        DefaultConstructorMarker defaultConstructorMarker = null;
        MutableStateFlow<ActionBar> MutableStateFlow = StateFlowKt.MutableStateFlow(new ActionBar(0L, null, null, null, false, 31, defaultConstructorMarker));
        this.AEQbTJ = MutableStateFlow;
        this.values = FlowKt.asStateFlow(MutableStateFlow);
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.vQw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50503vQv.isConnected(this.copydefault);
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.vQy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50503vQv.AuCTel(this.KWHzl);
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.vQu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50503vQv.fJNWhG(this.EZpvd);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.vQC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50503vQv.values(this.KWHzl);
            }
        });
        this.fetchVPNInfo = FlowKt.stateIn(FlowKt.m7441catch(FlowKt.combine(MutableStateFlow, FlowLiveDataConversions.asFlow(C54782xVc.AEQbTJ.AhwBna()), new SmartEarnAllocationBottomSheetViewModel$state$1(this, null)), new SmartEarnAllocationBottomSheetViewModel$state$2(null)), CoroutineScopeKt.plus(ViewModelKt.getViewModelScope(this), coroutineDispatcher), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), new FragmentManager(false, null, null, null, null, 0 == true ? 1 : 0, null, 127, defaultConstructorMarker));
    }

    /* JADX INFO: renamed from: o.vQv$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vQv.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.vQv$PendingIntent */
    public static final class PendingIntent extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public final /* synthetic */ C50503vQv OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(CoroutineExceptionHandler.Key key, C50503vQv c50503vQv) {
            super(key);
            this.OLrzqt = c50503vQv;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            this.OLrzqt.EZpvd.tryEmit(new Activity.PendingIntent(th));
            th.printStackTrace();
            pUU.AEQbTJ("SmartEarnAllocationBottomSheetViewModel", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SmartEarnConfig valueOf() {
        return (SmartEarnConfig) this.valueOf.getValue();
    }

    public static final SmartEarnConfig isConnected(C50503vQv c50503vQv) {
        SmartEarnConfig smartEarnConfig = (SmartEarnConfig) c50503vQv.AhwBna.get("SmartEarnConfig");
        return smartEarnConfig == null ? new SmartEarnConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 1023, (DefaultConstructorMarker) null) : smartEarnConfig;
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> gEmmrt() {
        return (kotlin.Pair) this.DbNXlk.getValue();
    }

    public static final kotlin.Pair AuCTel(C50503vQv c50503vQv) {
        java.lang.String str = (java.lang.String) c50503vQv.AhwBna.get("MinPriceKey");
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) c50503vQv.AhwBna.get("MaxPriceKey");
        return C56390yDp.OLrzqt(str, str2 != null ? str2 : "");
    }

    public final SmartEarnProperties AEQbTJ() {
        return (SmartEarnProperties) this.djBIcL.getValue();
    }

    public static final SmartEarnProperties fJNWhG(C50503vQv c50503vQv) {
        return (SmartEarnProperties) c50503vQv.AhwBna.get("existing_smart_earn_param");
    }

    public final BotModel copydefault() {
        return (BotModel) this.copydefault.getValue();
    }

    public static final BotModel values(C50503vQv c50503vQv) {
        BotModel botModel = (BotModel) c50503vQv.AhwBna.get("bot_model");
        return botModel == null ? BotModel.Companion.KWHzl() : botModel;
    }

    public final void KWHzl(EarnType earnType) {
        ActionBar value;
        InterfaceC56538yJb<java.lang.String> interfaceC56538yJbEZpvd = this.gEmmrt.EZpvd(earnType, C56547yJk.EZpvd(valueOf().getDefaultMinRange(), valueOf().getDefaultMaxRange()), C56547yJk.EZpvd(gEmmrt().getFirst(), gEmmrt().getSecond()));
        MutableStateFlow<ActionBar> mutableStateFlow = this.AEQbTJ;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ActionBar.copy$default(value, java.lang.System.currentTimeMillis(), earnType, (java.lang.String) interfaceC56538yJbEZpvd.getStart(), (java.lang.String) interfaceC56538yJbEZpvd.getEndInclusive(), false, 16, null)));
    }

    public final Job copydefault(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), new PendingIntent(CoroutineExceptionHandler.Key, this), null, new SmartEarnAllocationBottomSheetViewModel$trigger$2(application, this, null), 2, null);
    }

    public final void AEQbTJ(Application.C0982Application c0982Application) {
        ActionBar value;
        ActionBar actionBarCopy$default;
        SmartEarnProperties smartEarnPropertiesKWHzl = c0982Application.KWHzl();
        EarnType earnType = smartEarnPropertiesKWHzl != null ? smartEarnPropertiesKWHzl.getEarnType() : null;
        MutableStateFlow<ActionBar> mutableStateFlow = this.AEQbTJ;
        do {
            value = mutableStateFlow.getValue();
            ActionBar actionBar = value;
            if (earnType != null) {
                C50544vSi c50544vSi = this.gEmmrt;
                java.lang.String earnMinLimit = smartEarnPropertiesKWHzl.getEarnMinLimit();
                if (earnMinLimit == null) {
                    earnMinLimit = "";
                }
                java.lang.String earnMaxLimit = smartEarnPropertiesKWHzl.getEarnMaxLimit();
                InterfaceC56538yJb<java.lang.String> interfaceC56538yJbEZpvd = c50544vSi.EZpvd(earnType, C56547yJk.EZpvd(earnMinLimit, earnMaxLimit != null ? earnMaxLimit : ""));
                actionBarCopy$default = actionBar.OLrzqt(java.lang.System.currentTimeMillis(), earnType, (java.lang.String) interfaceC56538yJbEZpvd.getStart(), (java.lang.String) interfaceC56538yJbEZpvd.getEndInclusive(), smartEarnPropertiesKWHzl.getEnabled());
            } else {
                InterfaceC56538yJb<java.lang.String> interfaceC56538yJbEZpvd2 = this.gEmmrt.EZpvd(actionBar.KWHzl(), C56547yJk.EZpvd(valueOf().getDefaultMinRange(), valueOf().getDefaultMaxRange()), C56547yJk.EZpvd(gEmmrt().getFirst(), gEmmrt().getSecond()));
                actionBarCopy$default = ActionBar.copy$default(actionBar, java.lang.System.currentTimeMillis(), null, (java.lang.String) interfaceC56538yJbEZpvd2.getStart(), (java.lang.String) interfaceC56538yJbEZpvd2.getEndInclusive(), false, 18, null);
            }
        } while (!mutableStateFlow.compareAndSet(value, actionBarCopy$default));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        SmartEarnAllocationBottomSheetViewModel$submitChanges$1 smartEarnAllocationBottomSheetViewModel$submitChanges$1;
        C50503vQv c50503vQv;
        MutableSharedFlow<Activity> mutableSharedFlow;
        Activity.TaskDescription taskDescription;
        if (continuation instanceof SmartEarnAllocationBottomSheetViewModel$submitChanges$1) {
            smartEarnAllocationBottomSheetViewModel$submitChanges$1 = (SmartEarnAllocationBottomSheetViewModel$submitChanges$1) continuation;
            int i = smartEarnAllocationBottomSheetViewModel$submitChanges$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                smartEarnAllocationBottomSheetViewModel$submitChanges$1.label = i - Integer.MIN_VALUE;
            } else {
                smartEarnAllocationBottomSheetViewModel$submitChanges$1 = new SmartEarnAllocationBottomSheetViewModel$submitChanges$1(this, continuation);
            }
        }
        java.lang.Object obj = smartEarnAllocationBottomSheetViewModel$submitChanges$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = smartEarnAllocationBottomSheetViewModel$submitChanges$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow<Activity> mutableSharedFlow2 = this.EZpvd;
            Activity.FragmentManager fragmentManager = Activity.FragmentManager.copydefault;
            smartEarnAllocationBottomSheetViewModel$submitChanges$1.L$0 = this;
            smartEarnAllocationBottomSheetViewModel$submitChanges$1.label = 1;
            if (mutableSharedFlow2.emit(fragmentManager, smartEarnAllocationBottomSheetViewModel$submitChanges$1) == objCopydefault) {
                return objCopydefault;
            }
            c50503vQv = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                c50503vQv = (C50503vQv) smartEarnAllocationBottomSheetViewModel$submitChanges$1.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow = c50503vQv.EZpvd;
                taskDescription = Activity.TaskDescription.copydefault;
                smartEarnAllocationBottomSheetViewModel$submitChanges$1.L$0 = null;
                smartEarnAllocationBottomSheetViewModel$submitChanges$1.label = 3;
                if (mutableSharedFlow.emit(taskDescription, smartEarnAllocationBottomSheetViewModel$submitChanges$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            c50503vQv = (C50503vQv) smartEarnAllocationBottomSheetViewModel$submitChanges$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        kotlin.Pair<java.lang.String, java.lang.String> pairAhwBna = c50503vQv.AhwBna();
        EditEarnRequestDto editEarnRequestDto = new EditEarnRequestDto(c50503vQv.copydefault().EZpvd(), C56443yFo.KWHzl(c50503vQv.AEQbTJ.getValue().EZpvd()), pairAhwBna.component1(), pairAhwBna.component2(), c50503vQv.AEQbTJ.getValue().KWHzl());
        C50545vSj c50545vSj = c50503vQv.AYXKKw;
        smartEarnAllocationBottomSheetViewModel$submitChanges$1.L$0 = c50503vQv;
        smartEarnAllocationBottomSheetViewModel$submitChanges$1.label = 2;
        if (c50545vSj.KWHzl(editEarnRequestDto, smartEarnAllocationBottomSheetViewModel$submitChanges$1) == objCopydefault) {
            return objCopydefault;
        }
        mutableSharedFlow = c50503vQv.EZpvd;
        taskDescription = Activity.TaskDescription.copydefault;
        smartEarnAllocationBottomSheetViewModel$submitChanges$1.L$0 = null;
        smartEarnAllocationBottomSheetViewModel$submitChanges$1.label = 3;
        if (mutableSharedFlow.emit(taskDescription, smartEarnAllocationBottomSheetViewModel$submitChanges$1) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> AhwBna() {
        int i = Fragment.KWHzl[this.AEQbTJ.getValue().KWHzl().ordinal()];
        if (i == 1) {
            return C56390yDp.OLrzqt(C33129mqd.divS$default(this.AEQbTJ.getValue().OLrzqt(), 100, null, null, null, 14, null), C33129mqd.divS$default(this.AEQbTJ.getValue().AEQbTJ(), 100, null, null, null, 14, null));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C56390yDp.OLrzqt(this.AEQbTJ.getValue().OLrzqt(), this.AEQbTJ.getValue().AEQbTJ());
    }

    /* JADX INFO: renamed from: o.vQv$Application */
    public interface Application {

        /* JADX INFO: renamed from: o.vQv$Application$TaskDescription */
        public static final class TaskDescription implements Application {
            public final EarnType OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, EarnType earnType, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    earnType = taskDescription.OLrzqt;
                }
                return taskDescription.EZpvd(earnType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription EZpvd(@NotNull EarnType earnType) {
                Intrinsics.checkNotNullParameter(earnType, "");
                return new TaskDescription(earnType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final EarnType copydefault() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && this.OLrzqt == ((TaskDescription) obj).OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "OnEarnTypeSelected(earnType=" + this.OLrzqt + ")";
            }

            public TaskDescription(@NotNull EarnType earnType) {
                Intrinsics.checkNotNullParameter(earnType, "");
                this.OLrzqt = earnType;
            }
        }

        /* JADX INFO: renamed from: o.vQv$Application$Fragment */
        public static final class Fragment implements Application {
            public final java.lang.String AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Fragment copy$default(Fragment fragment, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = fragment.AEQbTJ;
                }
                return fragment.copydefault(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Fragment copydefault(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Fragment(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Fragment) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((Fragment) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "OnXChanged(x=" + this.AEQbTJ + ")";
            }

            public Fragment(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.AEQbTJ = str;
            }
        }

        /* JADX INFO: renamed from: o.vQv$Application$Dialog */
        public static final class Dialog implements Application {
            public final java.lang.String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Dialog copy$default(Dialog dialog, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = dialog.KWHzl;
                }
                return dialog.AEQbTJ(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Dialog AEQbTJ(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Dialog(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Dialog) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((Dialog) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "OnYChanged(y=" + this.KWHzl + ")";
            }

            public Dialog(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.KWHzl = str;
            }
        }

        /* JADX INFO: renamed from: o.vQv$Application$Activity */
        public static final class Activity implements Application {
            public final boolean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = activity.copydefault;
                }
                return activity.OLrzqt(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity OLrzqt(boolean z) {
                return new Activity(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && this.copydefault == ((Activity) obj).copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return java.lang.Boolean.hashCode(this.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "OnToggle(enabled=" + this.copydefault + ")";
            }

            public Activity(boolean z) {
                this.copydefault = z;
            }
        }

        /* JADX INFO: renamed from: o.vQv$Application$ActionBar */
        public static final class ActionBar implements Application {
            public static final ActionBar EZpvd = new ActionBar();

            private ActionBar() {
            }
        }

        /* JADX INFO: renamed from: o.vQv$Application$PendingIntent */
        public static final class PendingIntent implements Application {
            public static final PendingIntent OLrzqt = new PendingIntent();

            private PendingIntent() {
            }
        }

        /* JADX INFO: renamed from: o.vQv$Application$StateListAnimator */
        public static final class StateListAnimator implements Application {
            public static final StateListAnimator EZpvd = new StateListAnimator();

            private StateListAnimator() {
            }
        }

        /* JADX INFO: renamed from: o.vQv$Application$Application, reason: collision with other inner class name */
        public static final class C0982Application implements Application {
            public final SmartEarnProperties OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0982Application copy$default(C0982Application c0982Application, SmartEarnProperties smartEarnProperties, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    smartEarnProperties = c0982Application.OLrzqt;
                }
                return c0982Application.EZpvd(smartEarnProperties);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0982Application EZpvd(SmartEarnProperties smartEarnProperties) {
                return new C0982Application(smartEarnProperties);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SmartEarnProperties KWHzl() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0982Application) && Intrinsics.EZpvd(this.OLrzqt, ((C0982Application) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                SmartEarnProperties smartEarnProperties = this.OLrzqt;
                if (smartEarnProperties == null) {
                    return 0;
                }
                return smartEarnProperties.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Init(earnRequestParam=" + this.OLrzqt + ")";
            }

            public C0982Application(SmartEarnProperties smartEarnProperties) {
                this.OLrzqt = smartEarnProperties;
            }
        }
    }

    /* JADX INFO: renamed from: o.vQv$ActionBar */
    public static final class ActionBar {
        public final long AEQbTJ;
        public final boolean EZpvd;
        public final EarnType KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
            this(0L, null, null, null, false, 31, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, long j, EarnType earnType, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = actionBar.AEQbTJ;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                earnType = actionBar.KWHzl;
            }
            EarnType earnType2 = earnType;
            if ((i & 4) != 0) {
                str = actionBar.OLrzqt;
            }
            java.lang.String str3 = str;
            if ((i & 8) != 0) {
                str2 = actionBar.copydefault;
            }
            java.lang.String str4 = str2;
            if ((i & 16) != 0) {
                z = actionBar.EZpvd;
            }
            return actionBar.OLrzqt(j2, earnType2, str3, str4, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final EarnType KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(long j, @NotNull EarnType earnType, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
            Intrinsics.checkNotNullParameter(earnType, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new ActionBar(j, earnType, str, str2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long copydefault() {
            return this.AEQbTJ;
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
            return this.AEQbTJ == actionBar.AEQbTJ && this.KWHzl == actionBar.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) actionBar.copydefault) && this.EZpvd == actionBar.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((java.lang.Long.hashCode(this.AEQbTJ) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UiControlState(version=" + this.AEQbTJ + ", earnType=" + this.KWHzl + ", inputX=" + this.OLrzqt + ", inputY=" + this.copydefault + ", enabled=" + this.EZpvd + ")";
        }

        public ActionBar(long j, @NotNull EarnType earnType, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
            Intrinsics.checkNotNullParameter(earnType, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.AEQbTJ = j;
            this.KWHzl = earnType;
            this.OLrzqt = str;
            this.copydefault = str2;
            this.EZpvd = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:long:0x0008: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0004: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:321)) : (r8v0 long))
  (wrap:com.okinc.unify_trade.biz.bot.EarnType:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.unify_trade.biz.bot.EarnType:0x000d: SGET  A[WRAPPED] (LINE:322) com.okinc.unify_trade.biz.bot.EarnType.Ratio com.okinc.unify_trade.biz.bot.EarnType) : (r10v0 com.okinc.unify_trade.biz.bot.EarnType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0020: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
 A[MD:(long, com.okinc.unify_trade.biz.bot.EarnType, java.lang.String, java.lang.String, boolean):void (m)] (LINE:320) call: o.vQv.ActionBar.<init>(long, com.okinc.unify_trade.biz.bot.EarnType, java.lang.String, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ ActionBar(long j, EarnType earnType, java.lang.String str, java.lang.String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? java.lang.System.currentTimeMillis() : j, (i & 2) != 0 ? EarnType.Ratio : earnType, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? false : z);
        }
    }

    /* JADX INFO: renamed from: o.vQv$TaskDescription */
    public static final class TaskDescription {
        public final C50546vSk EZpvd;
        public final C50546vSk OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, C50546vSk c50546vSk, C50546vSk c50546vSk2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c50546vSk = taskDescription.OLrzqt;
            }
            if ((i & 2) != 0) {
                c50546vSk2 = taskDescription.EZpvd;
            }
            return taskDescription.OLrzqt(c50546vSk, c50546vSk2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C50546vSk EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C50546vSk KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(C50546vSk c50546vSk, C50546vSk c50546vSk2) {
            return new TaskDescription(c50546vSk, c50546vSk2);
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
            return Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, taskDescription.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            C50546vSk c50546vSk = this.OLrzqt;
            int iHashCode = c50546vSk == null ? 0 : c50546vSk.hashCode();
            C50546vSk c50546vSk2 = this.EZpvd;
            return (iHashCode * 31) + (c50546vSk2 != null ? c50546vSk2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InputState(hasLowerBoundConditionMet=" + this.OLrzqt + ", hasUpperBoundConditionMet=" + this.EZpvd + ")";
        }

        public TaskDescription(C50546vSk c50546vSk, C50546vSk c50546vSk2) {
            this.OLrzqt = c50546vSk;
            this.EZpvd = c50546vSk2;
        }
    }

    /* JADX INFO: renamed from: o.vQv$FragmentManager */
    public static final class FragmentManager {
        public final boolean AEQbTJ;
        public final InterfaceC56538yJb<java.lang.String> AYXKKw;
        public final InterfaceC56538yJb<java.lang.String> EZpvd;
        public final TaskDescription KWHzl;
        public final EarnType OLrzqt;
        public final InterfaceC56538yJb<java.lang.String> copydefault;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
            this(false, null, null, null, null, null, null, 127, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.vQv$FragmentManager */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FragmentManager copy$default(FragmentManager fragmentManager, boolean z, EarnType earnType, java.lang.String str, InterfaceC56538yJb interfaceC56538yJb, InterfaceC56538yJb interfaceC56538yJb2, InterfaceC56538yJb interfaceC56538yJb3, TaskDescription taskDescription, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = fragmentManager.AEQbTJ;
            }
            if ((i & 2) != 0) {
                earnType = fragmentManager.OLrzqt;
            }
            EarnType earnType2 = earnType;
            if ((i & 4) != 0) {
                str = fragmentManager.valueOf;
            }
            java.lang.String str2 = str;
            if ((i & 8) != 0) {
                interfaceC56538yJb = fragmentManager.EZpvd;
            }
            InterfaceC56538yJb interfaceC56538yJb4 = interfaceC56538yJb;
            if ((i & 16) != 0) {
                interfaceC56538yJb2 = fragmentManager.copydefault;
            }
            InterfaceC56538yJb interfaceC56538yJb5 = interfaceC56538yJb2;
            if ((i & 32) != 0) {
                interfaceC56538yJb3 = fragmentManager.AYXKKw;
            }
            InterfaceC56538yJb interfaceC56538yJb6 = interfaceC56538yJb3;
            if ((i & 64) != 0) {
                taskDescription = fragmentManager.KWHzl;
            }
            return fragmentManager.EZpvd(z, earnType2, str2, interfaceC56538yJb4, interfaceC56538yJb5, interfaceC56538yJb6, taskDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC56538yJb<java.lang.String> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC56538yJb<java.lang.String> AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FragmentManager EZpvd(boolean z, @NotNull EarnType earnType, @NotNull java.lang.String str, @NotNull InterfaceC56538yJb<java.lang.String> interfaceC56538yJb, @NotNull InterfaceC56538yJb<java.lang.String> interfaceC56538yJb2, @NotNull InterfaceC56538yJb<java.lang.String> interfaceC56538yJb3, @NotNull TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(earnType, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(interfaceC56538yJb, "");
            Intrinsics.checkNotNullParameter(interfaceC56538yJb2, "");
            Intrinsics.checkNotNullParameter(interfaceC56538yJb3, "");
            Intrinsics.checkNotNullParameter(taskDescription, "");
            return new FragmentManager(z, earnType, str, interfaceC56538yJb, interfaceC56538yJb2, interfaceC56538yJb3, taskDescription);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC56538yJb<java.lang.String> EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final EarnType OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FragmentManager)) {
                return false;
            }
            FragmentManager fragmentManager = (FragmentManager) obj;
            return this.AEQbTJ == fragmentManager.AEQbTJ && this.OLrzqt == fragmentManager.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) fragmentManager.valueOf) && Intrinsics.EZpvd(this.EZpvd, fragmentManager.EZpvd) && Intrinsics.EZpvd(this.copydefault, fragmentManager.copydefault) && Intrinsics.EZpvd(this.AYXKKw, fragmentManager.AYXKKw) && Intrinsics.EZpvd(this.KWHzl, fragmentManager.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean gEmmrt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((java.lang.Boolean.hashCode(this.AEQbTJ) * 31) + this.OLrzqt.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UiState(isEnabled=" + this.AEQbTJ + ", earnType=" + this.OLrzqt + ", lastPrice=" + this.valueOf + ", defaultRange=" + this.EZpvd + ", estimatedRange=" + this.copydefault + ", limitRange=" + this.AYXKKw + ", inputState=" + this.KWHzl + ")";
        }

        public FragmentManager(boolean z, @NotNull EarnType earnType, @NotNull java.lang.String str, @NotNull InterfaceC56538yJb<java.lang.String> interfaceC56538yJb, @NotNull InterfaceC56538yJb<java.lang.String> interfaceC56538yJb2, @NotNull InterfaceC56538yJb<java.lang.String> interfaceC56538yJb3, @NotNull TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(earnType, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(interfaceC56538yJb, "");
            Intrinsics.checkNotNullParameter(interfaceC56538yJb2, "");
            Intrinsics.checkNotNullParameter(interfaceC56538yJb3, "");
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.AEQbTJ = z;
            this.OLrzqt = earnType;
            this.valueOf = str;
            this.EZpvd = interfaceC56538yJb;
            this.copydefault = interfaceC56538yJb2;
            this.AYXKKw = interfaceC56538yJb3;
            this.KWHzl = taskDescription;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0043: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r6v0 boolean))
  (wrap:com.okinc.unify_trade.biz.bot.EarnType:0x000b: TERNARY null = ((wrap:int:0x0005: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.unify_trade.biz.bot.EarnType:0x0009: SGET  A[WRAPPED] (LINE:335) com.okinc.unify_trade.biz.bot.EarnType.Ratio com.okinc.unify_trade.biz.bot.EarnType) : (r7v0 com.okinc.unify_trade.biz.bot.EarnType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:o.yJb:0x001d: TERNARY null = ((wrap:int:0x0015: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:o.yJb:0x0019: INVOKE (""), ("") STATIC call: o.yJk.EZpvd(java.lang.Comparable, java.lang.Comparable):o.yJb A[MD:<T extends java.lang.Comparable<? super T>>:(T extends java.lang.Comparable<? super T>, T extends java.lang.Comparable<? super T>):o.yJb<T extends java.lang.Comparable<? super T>> (m), WRAPPED] (LINE:337)) : (r9v0 o.yJb))
  (wrap:o.yJb:0x0026: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:o.yJb:0x0022: INVOKE (""), ("") STATIC call: o.yJk.EZpvd(java.lang.Comparable, java.lang.Comparable):o.yJb A[MD:<T extends java.lang.Comparable<? super T>>:(T extends java.lang.Comparable<? super T>, T extends java.lang.Comparable<? super T>):o.yJb<T extends java.lang.Comparable<? super T>> (m), WRAPPED] (LINE:338)) : (r10v0 o.yJb))
  (wrap:o.yJb:0x002f: TERNARY null = ((wrap:int:0x0027: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:o.yJb:0x002b: INVOKE (""), ("") STATIC call: o.yJk.EZpvd(java.lang.Comparable, java.lang.Comparable):o.yJb A[MD:<T extends java.lang.Comparable<? super T>>:(T extends java.lang.Comparable<? super T>, T extends java.lang.Comparable<? super T>):o.yJb<T extends java.lang.Comparable<? super T>> (m), WRAPPED] (LINE:339)) : (r11v0 o.yJb))
  (wrap:o.vQv$TaskDescription:?: TERNARY null = ((wrap:int:0x0030: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:o.vQv$TaskDescription:0x0037: CONSTRUCTOR (null o.vSk), (null o.vSk) A[MD:(o.vSk, o.vSk):void (m), WRAPPED] (LINE:340) call: o.vQv.TaskDescription.<init>(o.vSk, o.vSk):void type: CONSTRUCTOR) : (r12v0 o.vQv$TaskDescription))
 A[MD:(boolean, com.okinc.unify_trade.biz.bot.EarnType, java.lang.String, o.yJb<java.lang.String>, o.yJb<java.lang.String>, o.yJb<java.lang.String>, o.vQv$TaskDescription):void (m)] (LINE:333) call: o.vQv.FragmentManager.<init>(boolean, com.okinc.unify_trade.biz.bot.EarnType, java.lang.String, o.yJb, o.yJb, o.yJb, o.vQv$TaskDescription):void type: THIS */
        public /* synthetic */ FragmentManager(boolean z, EarnType earnType, java.lang.String str, InterfaceC56538yJb interfaceC56538yJb, InterfaceC56538yJb interfaceC56538yJb2, InterfaceC56538yJb interfaceC56538yJb3, TaskDescription taskDescription, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? EarnType.Ratio : earnType, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? C56547yJk.EZpvd("", "") : interfaceC56538yJb, (i & 16) != 0 ? C56547yJk.EZpvd("", "") : interfaceC56538yJb2, (i & 32) != 0 ? C56547yJk.EZpvd("", "") : interfaceC56538yJb3, (i & 64) != 0 ? new TaskDescription(null, null) : taskDescription);
        }
    }

    /* JADX INFO: renamed from: o.vQv$Activity */
    public interface Activity {

        /* JADX INFO: renamed from: o.vQv$Activity$ActionBar */
        public static final class ActionBar implements Activity {
            public static final ActionBar KWHzl = new ActionBar();

            private ActionBar() {
            }
        }

        /* JADX INFO: renamed from: o.vQv$Activity$Application */
        public static final class Application implements Activity {
            public static final Application EZpvd = new Application();

            private Application() {
            }
        }

        /* JADX INFO: renamed from: o.vQv$Activity$Activity, reason: collision with other inner class name */
        public static final class C0981Activity implements Activity {
            public static final C0981Activity copydefault = new C0981Activity();

            private C0981Activity() {
            }
        }

        /* JADX INFO: renamed from: o.vQv$Activity$TaskDescription */
        public static final class TaskDescription implements Activity {
            public static final TaskDescription copydefault = new TaskDescription();

            private TaskDescription() {
            }
        }

        /* JADX INFO: renamed from: o.vQv$Activity$FragmentManager */
        public static final class FragmentManager implements Activity {
            public static final FragmentManager copydefault = new FragmentManager();

            private FragmentManager() {
            }
        }

        /* JADX INFO: renamed from: o.vQv$Activity$PendingIntent */
        public static final class PendingIntent implements Activity {
            public final java.lang.Throwable EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ PendingIntent copy$default(PendingIntent pendingIntent, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    th = pendingIntent.EZpvd;
                }
                return pendingIntent.EZpvd(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.Throwable EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PendingIntent EZpvd(@NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new PendingIntent(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PendingIntent) && Intrinsics.EZpvd(this.EZpvd, ((PendingIntent) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "ToastError(throwable=" + this.EZpvd + ")";
            }

            public PendingIntent(@NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                this.EZpvd = th;
            }
        }

        /* JADX INFO: renamed from: o.vQv$Activity$StateListAnimator */
        public static final class StateListAnimator implements Activity {
            public final boolean AEQbTJ;
            public final EarnType EZpvd;
            public final java.lang.String KWHzl;
            public final java.lang.String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, EarnType earnType, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.KWHzl;
                }
                if ((i & 2) != 0) {
                    str2 = stateListAnimator.OLrzqt;
                }
                if ((i & 4) != 0) {
                    earnType = stateListAnimator.EZpvd;
                }
                if ((i & 8) != 0) {
                    z = stateListAnimator.AEQbTJ;
                }
                return stateListAnimator.AEQbTJ(str, str2, earnType, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull EarnType earnType, boolean z) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(earnType, "");
                return new StateListAnimator(str, str2, earnType, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String OLrzqt() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final EarnType copydefault() {
                return this.EZpvd;
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
                return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) stateListAnimator.OLrzqt) && this.EZpvd == stateListAnimator.EZpvd && this.AEQbTJ == stateListAnimator.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((((this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "AllGood(x=" + this.KWHzl + ", y=" + this.OLrzqt + ", earnType=" + this.EZpvd + ", isEnabled=" + this.AEQbTJ + ")";
            }

            public StateListAnimator(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull EarnType earnType, boolean z) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(earnType, "");
                this.KWHzl = str;
                this.OLrzqt = str2;
                this.EZpvd = earnType;
                this.AEQbTJ = z;
            }
        }

        /* JADX INFO: renamed from: o.vQv$Activity$Dialog */
        public static final class Dialog implements Activity {
            public static final int OLrzqt;
            public final SmartEarnRequestParam EZpvd;
            public final SmartEarnRequestParam KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int i = SmartEarnRequestParam.$stable;
                OLrzqt = i | i;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Dialog copy$default(Dialog dialog, SmartEarnRequestParam smartEarnRequestParam, SmartEarnRequestParam smartEarnRequestParam2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    smartEarnRequestParam = dialog.KWHzl;
                }
                if ((i & 2) != 0) {
                    smartEarnRequestParam2 = dialog.EZpvd;
                }
                return dialog.OLrzqt(smartEarnRequestParam, smartEarnRequestParam2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SmartEarnRequestParam AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SmartEarnRequestParam EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Dialog OLrzqt(@NotNull SmartEarnRequestParam smartEarnRequestParam, @NotNull SmartEarnRequestParam smartEarnRequestParam2) {
                Intrinsics.checkNotNullParameter(smartEarnRequestParam, "");
                Intrinsics.checkNotNullParameter(smartEarnRequestParam2, "");
                return new Dialog(smartEarnRequestParam, smartEarnRequestParam2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Dialog)) {
                    return false;
                }
                Dialog dialog = (Dialog) obj;
                return Intrinsics.EZpvd(this.KWHzl, dialog.KWHzl) && Intrinsics.EZpvd(this.EZpvd, dialog.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "ShowConfirmation(before=" + this.KWHzl + ", after=" + this.EZpvd + ")";
            }

            public Dialog(@NotNull SmartEarnRequestParam smartEarnRequestParam, @NotNull SmartEarnRequestParam smartEarnRequestParam2) {
                Intrinsics.checkNotNullParameter(smartEarnRequestParam, "");
                Intrinsics.checkNotNullParameter(smartEarnRequestParam2, "");
                this.KWHzl = smartEarnRequestParam;
                this.EZpvd = smartEarnRequestParam2;
            }
        }
    }
}
