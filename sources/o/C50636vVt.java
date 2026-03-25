package o;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.okinc.tradingbot.impl.order.strategy.recurring.view.data.FirstTimeBuyOption;
import com.okinc.tradingbot.impl.order.strategy.recurring.view.data.RecurringBuyFrequency;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C50636vVt;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vVt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50636vVt extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public yHO<? super FirstTimeBuyOption, ? super java.lang.Integer, ? super java.lang.Integer, Unit> copydefault;
    public final MutableState gEmmrt = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(FirstTimeBuyOption.Companion.EZpvd(), null, 2, null);
    public final MutableIntState djBIcL = SnapshotIntStateKt.mutableIntStateOf(12);
    public final MutableIntState OLrzqt = SnapshotIntStateKt.mutableIntStateOf(0);
    public final MutableState EZpvd = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(RecurringBuyFrequency.DAILY, null, 2, null);
    public final boolean AEQbTJ = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.AEQbTJ;
    }

    /* JADX INFO: renamed from: o.vVt$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vVt.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.vVt$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C50636vVt newInstance$default(StateListAnimator stateListAnimator, FirstTimeBuyOption firstTimeBuyOption, int i, int i2, RecurringBuyFrequency recurringBuyFrequency, yHO yho, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                firstTimeBuyOption = FirstTimeBuyOption.Companion.EZpvd();
            }
            if ((i3 & 2) != 0) {
                i = 12;
            }
            int i4 = i;
            if ((i3 & 4) != 0) {
                i2 = 0;
            }
            int i5 = i2;
            if ((i3 & 8) != 0) {
                recurringBuyFrequency = RecurringBuyFrequency.DAILY;
            }
            RecurringBuyFrequency recurringBuyFrequency2 = recurringBuyFrequency;
            if ((i3 & 16) != 0) {
                yho = null;
            }
            return stateListAnimator.OLrzqt(firstTimeBuyOption, i4, i5, recurringBuyFrequency2, yho);
        }

        public final C50636vVt OLrzqt(@NotNull FirstTimeBuyOption firstTimeBuyOption, int i, int i2, @NotNull RecurringBuyFrequency recurringBuyFrequency, yHO<? super FirstTimeBuyOption, ? super java.lang.Integer, ? super java.lang.Integer, Unit> yho) {
            Intrinsics.checkNotNullParameter(firstTimeBuyOption, "");
            Intrinsics.checkNotNullParameter(recurringBuyFrequency, "");
            C50636vVt c50636vVt = new C50636vVt();
            c50636vVt.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("initial_first_buy_time_option", java.lang.Integer.valueOf(firstTimeBuyOption.ordinal())), C56390yDp.OLrzqt("initial_time_index", java.lang.Integer.valueOf(i)), C56390yDp.OLrzqt("initial_day_index", java.lang.Integer.valueOf(i2)), C56390yDp.OLrzqt("frequency", java.lang.Integer.valueOf(recurringBuyFrequency.ordinal()))));
            c50636vVt.copydefault = yho;
            return c50636vVt;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            FirstTimeBuyOption.Application application = FirstTimeBuyOption.Companion;
            FirstTimeBuyOption firstTimeBuyOptionEZpvd = (FirstTimeBuyOption) CollectionsKt___CollectionsKt.AkhnZx(FirstTimeBuyOption.getEntries(), arguments.getInt("initial_first_buy_time_option", application.EZpvd().ordinal()));
            if (firstTimeBuyOptionEZpvd == null) {
                firstTimeBuyOptionEZpvd = application.EZpvd();
            }
            AEQbTJ(firstTimeBuyOptionEZpvd);
            EZpvd(arguments.getInt("initial_time_index", 12));
            AEQbTJ(arguments.getInt("initial_day_index", 0));
            RecurringBuyFrequency recurringBuyFrequency = RecurringBuyFrequency.DAILY;
            RecurringBuyFrequency recurringBuyFrequency2 = (RecurringBuyFrequency) CollectionsKt___CollectionsKt.AkhnZx(RecurringBuyFrequency.getEntries(), arguments.getInt("frequency", recurringBuyFrequency.ordinal()));
            if (recurringBuyFrequency2 != null) {
                recurringBuyFrequency = recurringBuyFrequency2;
            }
            KWHzl(recurringBuyFrequency);
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setCloseVisibility(false);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setDividerVisibility(false);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C48033uCm.Fragment.aGOrKO));
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(14);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        wyf.setSecondaryText(C33070mpX.AYXKKw(C55688xof.Application.onConfigurationChanged));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOnClickListener(new TaskDescription(c52794wYpAEQbTJ2, 1000L, this));
        }
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSType(257);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new Activity(c52794wYpCopydefault2, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.vVt$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C50636vVt EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C50636vVt c50636vVt) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = c50636vVt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                yHO yho = this.EZpvd.copydefault;
                if (yho != null) {
                    yho.invoke(this.EZpvd.AEQbTJ(), java.lang.Integer.valueOf(this.EZpvd.EZpvd()), java.lang.Integer.valueOf(this.EZpvd.copydefault()));
                }
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.vVt$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C50636vVt EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C50636vVt c50636vVt) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c50636vVt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.content.Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(870849261, true, new Application()));
        constraintLayout.addView(composeView);
    }

    /* JADX INFO: renamed from: o.vVt$Application */
    public static final class Application implements Function2<Composer, java.lang.Integer, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            EZpvd(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void EZpvd(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(870849261, i, -1, "com.okinc.tradingbot.impl.order.strategy.recurring.view.RecurringBuyFrequencyStartTimeBottomSheet.onCreateContent.<anonymous>.<anonymous> (RecurringBuyFrequencyStartTimeBottomSheet.kt:196)");
                }
                NestedScrollConnection nestedScrollConnectionRememberNestedScrollInteropConnection = NestedScrollInteropConnectionKt.rememberNestedScrollInteropConnection(null, composer, 0, 1);
                FirstTimeBuyOption firstTimeBuyOptionAEQbTJ = C50636vVt.this.AEQbTJ();
                int iEZpvd = C50636vVt.this.EZpvd();
                int iCopydefault = C50636vVt.this.copydefault();
                RecurringBuyFrequency recurringBuyFrequencyOLrzqt = C50636vVt.this.OLrzqt();
                composer.startReplaceableGroup(2067396782);
                boolean zChangedInstance = composer.changedInstance(C50636vVt.this);
                final C50636vVt c50636vVt = C50636vVt.this;
                java.lang.Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: o.vVp
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C50636vVt.Application.EZpvd(c50636vVt, (FirstTimeBuyOption) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(2067401480);
                boolean zChangedInstance2 = composer.changedInstance(C50636vVt.this);
                final C50636vVt c50636vVt2 = C50636vVt.this;
                java.lang.Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: o.vVs
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C50636vVt.Application.KWHzl(c50636vVt2, ((java.lang.Integer) obj).intValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function1 function12 = (Function1) objRememberedValue2;
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(2067406027);
                boolean zChangedInstance3 = composer.changedInstance(C50636vVt.this);
                final C50636vVt c50636vVt3 = C50636vVt.this;
                java.lang.Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: o.vVw
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C50636vVt.Application.OLrzqt(c50636vVt3, ((java.lang.Integer) obj).intValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceableGroup();
                C50637vVu.OLrzqt(nestedScrollConnectionRememberNestedScrollInteropConnection, firstTimeBuyOptionAEQbTJ, iEZpvd, iCopydefault, recurringBuyFrequencyOLrzqt, function1, function12, (Function1) objRememberedValue3, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        public static final Unit EZpvd(C50636vVt c50636vVt, FirstTimeBuyOption firstTimeBuyOption) {
            Intrinsics.checkNotNullParameter(firstTimeBuyOption, "");
            c50636vVt.AEQbTJ(firstTimeBuyOption);
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(C50636vVt c50636vVt, int i) {
            c50636vVt.AEQbTJ(i);
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(C50636vVt c50636vVt, int i) {
            c50636vVt.EZpvd(i);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.copydefault = null;
        super.onDestroyView();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final FirstTimeBuyOption AEQbTJ() {
        return (FirstTimeBuyOption) this.gEmmrt.getValue();
    }

    public final void AEQbTJ(FirstTimeBuyOption firstTimeBuyOption) {
        this.gEmmrt.setValue(firstTimeBuyOption);
    }

    public final int copydefault() {
        return this.djBIcL.getIntValue();
    }

    public final void EZpvd(int i) {
        this.djBIcL.setIntValue(i);
    }

    public final int EZpvd() {
        return this.OLrzqt.getIntValue();
    }

    public final void AEQbTJ(int i) {
        this.OLrzqt.setIntValue(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final RecurringBuyFrequency OLrzqt() {
        return (RecurringBuyFrequency) this.EZpvd.getValue();
    }

    public final void KWHzl(RecurringBuyFrequency recurringBuyFrequency) {
        this.EZpvd.setValue(recurringBuyFrequency);
    }
}
