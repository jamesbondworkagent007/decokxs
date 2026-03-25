package o;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
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
import o.C50626vVj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vVj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50626vVj extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public java.lang.String AEQbTJ;
    public RecurringBuyFrequency AYXKKw;
    public final MutableState AhwBna;
    public final MutableIntState AkhnZx;
    public final MutableState DbNXlk;
    public wYF EZpvd;
    public final boolean KWHzl;
    public FirstTimeBuyOption OLrzqt;
    public int djBIcL;
    public yHS<? super java.lang.String, ? super RecurringBuyFrequency, ? super java.lang.Integer, ? super java.lang.Integer, ? super FirstTimeBuyOption, Unit> fetchVPNInfo;
    public yHT<? super RecurringBuyFrequency, ? super java.lang.Integer, ? super java.lang.Integer, ? super FirstTimeBuyOption, Unit> gEmmrt;
    public final MutableState isConnected;
    public int valueOf;
    public final MutableIntState values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.KWHzl;
    }

    public C50626vVj() {
        RecurringBuyFrequency recurringBuyFrequency = RecurringBuyFrequency.DAILY;
        this.AYXKKw = recurringBuyFrequency;
        this.djBIcL = 12;
        FirstTimeBuyOption.Application application = FirstTimeBuyOption.Companion;
        this.OLrzqt = application.EZpvd();
        this.isConnected = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(recurringBuyFrequency, null, 2, null);
        this.AkhnZx = SnapshotIntStateKt.mutableIntStateOf(0);
        this.values = SnapshotIntStateKt.mutableIntStateOf(12);
        this.DbNXlk = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(application.EZpvd(), null, 2, null);
        this.AhwBna = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
        this.AEQbTJ = "";
        this.KWHzl = true;
    }

    /* JADX INFO: renamed from: o.vVj$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vVj.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.vVj$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C50626vVj newInstance$default(ActionBar actionBar, RecurringBuyFrequency recurringBuyFrequency, int i, int i2, FirstTimeBuyOption firstTimeBuyOption, yHT yht, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                recurringBuyFrequency = RecurringBuyFrequency.DAILY;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            int i4 = i;
            if ((i3 & 4) != 0) {
                i2 = 12;
            }
            int i5 = i2;
            if ((i3 & 8) != 0) {
                firstTimeBuyOption = FirstTimeBuyOption.Companion.EZpvd();
            }
            FirstTimeBuyOption firstTimeBuyOption2 = firstTimeBuyOption;
            if ((i3 & 16) != 0) {
                yht = null;
            }
            return actionBar.KWHzl(recurringBuyFrequency, i4, i5, firstTimeBuyOption2, yht);
        }

        public final C50626vVj KWHzl(@NotNull RecurringBuyFrequency recurringBuyFrequency, int i, int i2, @NotNull FirstTimeBuyOption firstTimeBuyOption, yHT<? super RecurringBuyFrequency, ? super java.lang.Integer, ? super java.lang.Integer, ? super FirstTimeBuyOption, Unit> yht) {
            Intrinsics.checkNotNullParameter(recurringBuyFrequency, "");
            Intrinsics.checkNotNullParameter(firstTimeBuyOption, "");
            C50626vVj c50626vVj = new C50626vVj();
            c50626vVj.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("initial_frequency_index", java.lang.Integer.valueOf(recurringBuyFrequency.ordinal())), C56390yDp.OLrzqt("initial_sub_period_index", java.lang.Integer.valueOf(i)), C56390yDp.OLrzqt("initial_time_index", java.lang.Integer.valueOf(i2)), C56390yDp.OLrzqt("initial_first_buy_time_option", java.lang.Integer.valueOf(firstTimeBuyOption.ordinal())), C56390yDp.OLrzqt("is_modification_mode", java.lang.Boolean.FALSE)));
            c50626vVj.gEmmrt = yht;
            return c50626vVj;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.vVj$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C50626vVj newInstanceForModification$default(ActionBar actionBar, java.lang.String str, RecurringBuyFrequency recurringBuyFrequency, int i, int i2, FirstTimeBuyOption firstTimeBuyOption, yHS yhs, int i3, java.lang.Object obj) {
            if ((i3 & 2) != 0) {
                recurringBuyFrequency = RecurringBuyFrequency.DAILY;
            }
            RecurringBuyFrequency recurringBuyFrequency2 = recurringBuyFrequency;
            if ((i3 & 4) != 0) {
                i = 0;
            }
            int i4 = i;
            if ((i3 & 8) != 0) {
                i2 = 12;
            }
            int i5 = i2;
            if ((i3 & 16) != 0) {
                firstTimeBuyOption = FirstTimeBuyOption.Companion.EZpvd();
            }
            FirstTimeBuyOption firstTimeBuyOption2 = firstTimeBuyOption;
            if ((i3 & 32) != 0) {
                yhs = null;
            }
            return actionBar.KWHzl(str, recurringBuyFrequency2, i4, i5, firstTimeBuyOption2, yhs);
        }

        public final C50626vVj KWHzl(@NotNull java.lang.String str, @NotNull RecurringBuyFrequency recurringBuyFrequency, int i, int i2, @NotNull FirstTimeBuyOption firstTimeBuyOption, yHS<? super java.lang.String, ? super RecurringBuyFrequency, ? super java.lang.Integer, ? super java.lang.Integer, ? super FirstTimeBuyOption, Unit> yhs) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(recurringBuyFrequency, "");
            Intrinsics.checkNotNullParameter(firstTimeBuyOption, "");
            C50626vVj c50626vVj = new C50626vVj();
            c50626vVj.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("initial_frequency_index", java.lang.Integer.valueOf(recurringBuyFrequency.ordinal())), C56390yDp.OLrzqt("initial_sub_period_index", java.lang.Integer.valueOf(i)), C56390yDp.OLrzqt("initial_time_index", java.lang.Integer.valueOf(i2)), C56390yDp.OLrzqt("initial_first_buy_time_option", java.lang.Integer.valueOf(firstTimeBuyOption.ordinal())), C56390yDp.OLrzqt("is_modification_mode", java.lang.Boolean.TRUE), C56390yDp.OLrzqt("algo_id", str)));
            c50626vVj.fetchVPNInfo = yhs;
            return c50626vVj;
        }
    }

    public final boolean KWHzl() {
        return ((EZpvd() == this.valueOf || AEQbTJ() == this.djBIcL) && copydefault() == this.OLrzqt && OLrzqt() == this.AYXKKw) ? false : true;
    }

    /* JADX INFO: renamed from: o.vVj$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C50626vVj copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C50626vVj c50626vVj) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c50626vVj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (this.copydefault.djBIcL()) {
                    yHS yhs = this.copydefault.fetchVPNInfo;
                    if (yhs != null) {
                        java.lang.String str = this.copydefault.AEQbTJ;
                        RecurringBuyFrequency recurringBuyFrequencyOLrzqt = this.copydefault.OLrzqt();
                        int iEZpvd = this.copydefault.EZpvd();
                        int iAEQbTJ = this.copydefault.AEQbTJ();
                        yhs.invoke(str, recurringBuyFrequencyOLrzqt, java.lang.Integer.valueOf(iEZpvd), java.lang.Integer.valueOf(iAEQbTJ), this.copydefault.copydefault());
                    }
                } else {
                    yHT yht = this.copydefault.gEmmrt;
                    if (yht != null) {
                        RecurringBuyFrequency recurringBuyFrequencyOLrzqt2 = this.copydefault.OLrzqt();
                        int iEZpvd2 = this.copydefault.EZpvd();
                        int iAEQbTJ2 = this.copydefault.AEQbTJ();
                        yht.invoke(recurringBuyFrequencyOLrzqt2, java.lang.Integer.valueOf(iEZpvd2), java.lang.Integer.valueOf(iAEQbTJ2), this.copydefault.copydefault());
                    }
                }
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            RecurringBuyFrequency recurringBuyFrequency = RecurringBuyFrequency.DAILY;
            RecurringBuyFrequency recurringBuyFrequency2 = (RecurringBuyFrequency) CollectionsKt___CollectionsKt.AkhnZx(RecurringBuyFrequency.getEntries(), arguments.getInt("initial_frequency_index", recurringBuyFrequency.ordinal()));
            if (recurringBuyFrequency2 != null) {
                recurringBuyFrequency = recurringBuyFrequency2;
            }
            int i = arguments.getInt("initial_sub_period_index", 0);
            int i2 = arguments.getInt("initial_time_index", 12);
            FirstTimeBuyOption.Application application = FirstTimeBuyOption.Companion;
            FirstTimeBuyOption firstTimeBuyOptionEZpvd = (FirstTimeBuyOption) CollectionsKt___CollectionsKt.AkhnZx(FirstTimeBuyOption.getEntries(), arguments.getInt("initial_first_buy_time_option", application.EZpvd().ordinal()));
            if (firstTimeBuyOptionEZpvd == null) {
                firstTimeBuyOptionEZpvd = application.EZpvd();
            }
            this.AYXKKw = recurringBuyFrequency;
            this.valueOf = i;
            this.djBIcL = i2;
            this.OLrzqt = firstTimeBuyOptionEZpvd;
            OLrzqt(recurringBuyFrequency);
            EZpvd(i);
            KWHzl(i2);
            AEQbTJ(firstTimeBuyOptionEZpvd);
            EZpvd(arguments.getBoolean("is_modification_mode", false));
            this.AEQbTJ = arguments.getString("algo_id", "");
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
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C48033uCm.Fragment.Rtjmuc));
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.PipHintTrackerKt));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new TaskDescription(c52794wYpCopydefault, 1000L, this));
        }
        this.EZpvd = wyf;
        AhwBna();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AhwBna() {
        C52794wYp c52794wYpCopydefault;
        boolean zKWHzl = djBIcL() ? KWHzl() : true;
        wYF wyf = this.EZpvd;
        if (wyf == null || (c52794wYpCopydefault = wyf.copydefault()) == null) {
            return;
        }
        c52794wYpCopydefault.setEnabled(zKWHzl);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.content.Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-991955251, true, new StateListAnimator()));
        constraintLayout.addView(composeView);
    }

    /* JADX INFO: renamed from: o.vVj$StateListAnimator */
    public static final class StateListAnimator implements Function2<Composer, java.lang.Integer, Unit> {

        /* JADX INFO: renamed from: o.vVj$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public final /* synthetic */ class C0983StateListAnimator {
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[RecurringBuyFrequency.values().length];
                try {
                    iArr[RecurringBuyFrequency.WEEKLY.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[RecurringBuyFrequency.MONTHLY.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                copydefault = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            OLrzqt(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void OLrzqt(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-991955251, i, -1, "com.okinc.tradingbot.impl.order.strategy.recurring.view.RecurringBuyFrequencySelectionBottomSheet.onCreateContent.<anonymous>.<anonymous> (RecurringBuyFrequencySelectionBottomSheet.kt:261)");
                }
                RecurringBuyFrequency recurringBuyFrequencyOLrzqt = C50626vVj.this.OLrzqt();
                FirstTimeBuyOption firstTimeBuyOptionCopydefault = C50626vVj.this.copydefault();
                int iEZpvd = C50626vVj.this.EZpvd();
                int iAEQbTJ = C50626vVj.this.AEQbTJ();
                boolean zDjBIcL = C50626vVj.this.djBIcL();
                composer.startReplaceableGroup(-1951909506);
                boolean zChangedInstance = composer.changedInstance(C50626vVj.this);
                final C50626vVj c50626vVj = C50626vVj.this;
                java.lang.Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: o.vVh
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C50626vVj.StateListAnimator.EZpvd(c50626vVj, (RecurringBuyFrequency) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(-1951884894);
                boolean zChangedInstance2 = composer.changedInstance(C50626vVj.this);
                final C50626vVj c50626vVj2 = C50626vVj.this;
                java.lang.Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new yHO() { // from class: o.vVi
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.yHO
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                            return C50626vVj.StateListAnimator.KWHzl(c50626vVj2, (FirstTimeBuyOption) obj, (vUQ) obj2, (C50657vWn) obj3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                C50622vVf.AEQbTJ(recurringBuyFrequencyOLrzqt, firstTimeBuyOptionCopydefault, iEZpvd, iAEQbTJ, zDjBIcL, function1, (yHO) objRememberedValue2, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Unit EZpvd(C50626vVj c50626vVj, RecurringBuyFrequency recurringBuyFrequency) {
            int iKWHzl;
            Intrinsics.checkNotNullParameter(recurringBuyFrequency, "");
            c50626vVj.OLrzqt(recurringBuyFrequency);
            if (c50626vVj.copydefault() != FirstTimeBuyOption.BUY_CUSTOM) {
                iKWHzl = 0;
            } else {
                int i = C0983StateListAnimator.copydefault[recurringBuyFrequency.ordinal()];
                if (i == 1) {
                    iKWHzl = C56046xvS.AEQbTJ.KWHzl();
                } else if (i == 2) {
                    iKWHzl = C56046xvS.AEQbTJ.EZpvd();
                }
            }
            c50626vVj.EZpvd(iKWHzl);
            c50626vVj.AhwBna();
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(C50626vVj c50626vVj, FirstTimeBuyOption firstTimeBuyOption, vUQ vuq, C50657vWn c50657vWn) {
            Intrinsics.checkNotNullParameter(firstTimeBuyOption, "");
            c50626vVj.AEQbTJ(firstTimeBuyOption);
            c50626vVj.EZpvd(vuq.copydefault());
            c50626vVj.KWHzl(c50657vWn.OLrzqt());
            c50626vVj.AhwBna();
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.gEmmrt = null;
        this.fetchVPNInfo = null;
        this.EZpvd = null;
        super.onDestroyView();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final RecurringBuyFrequency OLrzqt() {
        return (RecurringBuyFrequency) this.isConnected.getValue();
    }

    public final void OLrzqt(RecurringBuyFrequency recurringBuyFrequency) {
        this.isConnected.setValue(recurringBuyFrequency);
    }

    public final int EZpvd() {
        return this.AkhnZx.getIntValue();
    }

    public final void EZpvd(int i) {
        this.AkhnZx.setIntValue(i);
    }

    public final int AEQbTJ() {
        return this.values.getIntValue();
    }

    public final void KWHzl(int i) {
        this.values.setIntValue(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final FirstTimeBuyOption copydefault() {
        return (FirstTimeBuyOption) this.DbNXlk.getValue();
    }

    public final void AEQbTJ(FirstTimeBuyOption firstTimeBuyOption) {
        this.DbNXlk.setValue(firstTimeBuyOption);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean djBIcL() {
        return ((java.lang.Boolean) this.AhwBna.getValue()).booleanValue();
    }

    public final void EZpvd(boolean z) {
        this.AhwBna.setValue(java.lang.Boolean.valueOf(z));
    }
}
