package o;

import android.os.Build;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bumptech.glide.Glide;
import com.okinc.okex.center.bean.TroubleshootResultPageData;
import com.okinc.okex.center.ui.SupportTroubleshootActivity$initViewModel$1$4;
import com.okinc.okex.center.ui.SupportTroubleshootActivity$initViewModel$1$5;
import com.okinc.okex.center.ui.SupportTroubleshootResultActivity;
import com.okinc.okex.center.viewmodel.SupportTroubleshootViewModel;
import com.okinc.okex.debug.bean.DetectIssueParams;
import com.okinc.uilab.edit.OKEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C45040siL;
import o.C47315tni;
import o.C52761wXj;
import o.InterfaceC8104awT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sgX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ActivityC44946sgX extends AbstractActivityC44870sfA {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AYXKKw;
    public boolean AhwBna;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.sha
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC44946sgX.gEmmrt(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.shb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC44946sgX.DbNXlk(this.copydefault);
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.shd
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC44946sgX.AhwBna(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.shc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(ActivityC44946sgX.KWHzl());
        }
    });

    /* JADX INFO: renamed from: o.sgX$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public boolean AYXKKw() {
        return true;
    }

    /* JADX INFO: renamed from: o.sgX$StateListAnimator */
    public static final class StateListAnimator implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ AbstractC47288tnH KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        public StateListAnimator(android.view.View view, AbstractC47288tnH abstractC47288tnH) {
            this.copydefault = view;
            this.KWHzl = abstractC47288tnH;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.copydefault.isLaidOut()) {
                this.copydefault.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.KWHzl.copydefault.fullScroll(130);
            }
        }
    }

    public ActivityC44946sgX() {
        final Function0 function0 = null;
        this.AYXKKw = new ViewModelLazy(C56524yIo.AEQbTJ(SupportTroubleshootViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.center.ui.SupportTroubleshootActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.center.ui.SupportTroubleshootActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.center.ui.SupportTroubleshootActivity$special$$inlined$viewModels$default$3
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
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    public final SupportTroubleshootViewModel valueOf() {
        return (SupportTroubleshootViewModel) this.AYXKKw.getValue();
    }

    public final AbstractC47288tnH AhwBna() {
        return (AbstractC47288tnH) this.AEQbTJ.getValue();
    }

    public static final AbstractC47288tnH gEmmrt(ActivityC44946sgX activityC44946sgX) {
        return AbstractC47288tnH.AEQbTJ(activityC44946sgX.getLayoutInflater());
    }

    public final DetectIssueParams gEmmrt() {
        return (DetectIssueParams) this.EZpvd.getValue();
    }

    public static final DetectIssueParams DbNXlk(ActivityC44946sgX activityC44946sgX) {
        if (Build.VERSION.SDK_INT >= 33) {
            return (DetectIssueParams) activityC44946sgX.getIntent().getParcelableExtra("ARG_DETECT_ISSUE_PARAMS", DetectIssueParams.class);
        }
        return (DetectIssueParams) activityC44946sgX.getIntent().getParcelableExtra("ARG_DETECT_ISSUE_PARAMS");
    }

    /* JADX INFO: renamed from: o.sgX$Activity */
    public static final class Activity implements android.text.TextWatcher {
        public final /* synthetic */ AbstractC47288tnH AEQbTJ;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity(AbstractC47288tnH abstractC47288tnH) {
            this.AEQbTJ = abstractC47288tnH;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            android.graphics.drawable.Drawable drawableKWHzl;
            java.lang.String string = editable != null ? editable.toString() : null;
            if (string == null) {
                string = "";
            }
            boolean zCopydefault = ActivityC44946sgX.this.valueOf().copydefault(string);
            boolean zOLrzqt = ActivityC44946sgX.this.valueOf().OLrzqt(string);
            OKEditText oKEditText = this.AEQbTJ.AYXKKw;
            if (zCopydefault) {
                drawableKWHzl = C33070mpX.KWHzl(C47315tni.Application.fARcdN);
            } else {
                drawableKWHzl = C33070mpX.KWHzl(C47315tni.Application.fIwbmz);
            }
            oKEditText.setBackground(drawableKWHzl);
            android.widget.TextView textView = this.AEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            boolean z = false;
            textView.setVisibility(zCopydefault ^ true ? 0 : 8);
            C52794wYp c52794wYp = this.AEQbTJ.KWHzl;
            if (zCopydefault && zOLrzqt) {
                z = true;
            }
            c52794wYp.setEnabled(z);
            if (zCopydefault) {
                return;
            }
            NestedScrollView nestedScrollView = this.AEQbTJ.copydefault;
            Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
            nestedScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new StateListAnimator(nestedScrollView, this.AEQbTJ));
        }
    }

    /* JADX DEBUG: Possible override for method com.okinc.okex.common.ui.OKSupportBaseActivity.AEQbTJ()V */
    /* JADX DEBUG: Possible override for method o.sfA.AEQbTJ()V */
    /* JADX DEBUG: Possible override for method o.snZ.AEQbTJ()V */
    public final java.lang.Boolean AEQbTJ() {
        return (java.lang.Boolean) this.KWHzl.getValue();
    }

    public static final java.lang.Boolean AhwBna(ActivityC44946sgX activityC44946sgX) {
        DetectIssueParams detectIssueParamsGEmmrt = activityC44946sgX.gEmmrt();
        if (detectIssueParamsGEmmrt == null) {
            return null;
        }
        activityC44946sgX.valueOf().OLrzqt(detectIssueParamsGEmmrt.getCurrencyId());
        java.lang.Integer chainId = detectIssueParamsGEmmrt.getChainId();
        if (chainId != null) {
            chainId.intValue();
            activityC44946sgX.valueOf().EZpvd(detectIssueParamsGEmmrt.getChainId().intValue());
        }
        activityC44946sgX.AhwBna().AYXKKw.setText(detectIssueParamsGEmmrt.getTxid());
        return java.lang.Boolean.valueOf(activityC44946sgX.AhwBna().KWHzl.performClick());
    }

    /* JADX INFO: renamed from: o.sgX$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sgX.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ android.content.Intent createIntent$default(ActionBar actionBar, android.content.Context context, DetectIssueParams detectIssueParams, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                detectIssueParams = null;
            }
            return actionBar.OLrzqt(context, detectIssueParams);
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context, DetectIssueParams detectIssueParams) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC44946sgX.class);
            if (detectIssueParams != null) {
                intent.putExtra("ARG_DETECT_ISSUE_PARAMS", detectIssueParams);
            }
            return intent;
        }
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public android.view.View AkhnZx() {
        android.view.View root = AhwBna().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public void initFrameContent(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        isConnected();
        fetchVPNInfo();
        OLrzqt(9, new Function0() { // from class: o.she
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC44946sgX.isConnected(this.AEQbTJ);
            }
        });
    }

    public static final Unit isConnected(ActivityC44946sgX activityC44946sgX) {
        activityC44946sgX.valueOf().KWHzl();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC44870sfA, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        AbstractC47288tnH abstractC47288tnHAhwBna = AhwBna();
        ViewCompat.setOnApplyWindowInsetsListener(abstractC47288tnHAhwBna.getRoot(), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.shf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return ActivityC44946sgX.OLrzqt(view, windowInsetsCompat);
            }
        });
        if (this.AhwBna) {
            abstractC47288tnHAhwBna.KWHzl.setText(C33070mpX.AYXKKw(C47315tni.PendingIntent.KWHzl));
            abstractC47288tnHAhwBna.KWHzl.fIwbmz();
            setInputStates$default(this, false, valueOf().AYXKKw(), false, 5, null);
        }
    }

    public static final WindowInsetsCompat OLrzqt(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        view.setPadding(0, 0, 0, windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom);
        return windowInsetsCompat;
    }

    @Override // o.AbstractActivityC44870sfA, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        AhwBna().getRoot().setOnApplyWindowInsetsListener(null);
        super.onPause();
    }

    private final void isConnected() {
        SupportTroubleshootViewModel supportTroubleshootViewModelValueOf = valueOf();
        supportTroubleshootViewModelValueOf.DbNXlk().observe(this, new Application(new Function1() { // from class: o.shg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC44946sgX.OLrzqt(this.copydefault, (kotlin.Pair) obj);
            }
        }));
        supportTroubleshootViewModelValueOf.fetchVPNInfo().observe(this, new Application(new Function1() { // from class: o.shi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC44946sgX.OLrzqt(this.EZpvd, (java.lang.String) obj);
            }
        }));
        supportTroubleshootViewModelValueOf.djBIcL().observe(this, new Application(new Function1() { // from class: o.shj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC44946sgX.AEQbTJ(this.copydefault, (java.lang.Integer) obj);
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SupportTroubleshootActivity$initViewModel$1$4(supportTroubleshootViewModelValueOf, this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SupportTroubleshootActivity$initViewModel$1$5(supportTroubleshootViewModelValueOf, this, null), 3, null);
    }

    public static final Unit OLrzqt(ActivityC44946sgX activityC44946sgX, kotlin.Pair pair) {
        activityC44946sgX.copydefault((java.lang.String) pair.component1(), (java.lang.String) pair.component2());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC44946sgX activityC44946sgX, java.lang.String str) {
        Intrinsics.copydefault((java.lang.Object) str);
        activityC44946sgX.copydefault(str);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC44946sgX activityC44946sgX, java.lang.Integer num) {
        if (num != null) {
            activityC44946sgX.OLrzqt(num.intValue());
            activityC44946sgX.valueOf().EZpvd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.sgX$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC44946sgX EZpvd;
        public final /* synthetic */ AbstractC47288tnH OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC44946sgX activityC44946sgX, AbstractC47288tnH abstractC47288tnH) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = activityC44946sgX;
            this.OLrzqt = abstractC47288tnH;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C45363soQ.onSessionIdEvent$default("SupportCenter_Transaction_DepositStatusChecker_Click", false, null, 3, null);
                this.EZpvd.AhwBna = false;
                C33570myu.AEQbTJ(this.OLrzqt.KWHzl.getContext(), this.OLrzqt.KWHzl);
                SupportTroubleshootViewModel supportTroubleshootViewModelValueOf = this.EZpvd.valueOf();
                android.text.Editable text = this.EZpvd.AhwBna().AYXKKw.getText();
                java.lang.String string = text != null ? text.toString() : null;
                if (string == null) {
                    string = "";
                }
                supportTroubleshootViewModelValueOf.AEQbTJ(string);
            }
        }
    }

    public final void OLrzqt(int i) {
        if (i == 7002) {
            InterfaceC8104awT.StateListAnimator.routeLogin$default((InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class), getMActivity(), null, 2, null);
        }
    }

    private final void fetchVPNInfo() {
        AbstractC47288tnH abstractC47288tnHAhwBna = AhwBna();
        java.lang.String string = getString(C47315tni.PendingIntent.DarRvM);
        Intrinsics.checkNotNullExpressionValue(string, "");
        int color = ContextCompat.getColor(this, C52761wXj.Activity.fdOvFl);
        android.widget.TextView textView = abstractC47288tnHAhwBna.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        java.lang.CharSequence charSequenceAEQbTJ = C45395sow.AEQbTJ(string, textView, getString(C47315tni.PendingIntent.DCUTEI), color, (32 & 8) != 0 ? true : true, (32 & 16) != 0 ? null : java.lang.Integer.valueOf(C47315tni.Fragment.EZpvd), (32 & 32) != 0, new Function0() { // from class: o.shh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC44946sgX.values(this.EZpvd);
            }
        });
        abstractC47288tnHAhwBna.AEQbTJ.setHighlightColor(ContextCompat.getColor(this, C52761wXj.Activity.aBDePw));
        abstractC47288tnHAhwBna.AEQbTJ.setText(charSequenceAEQbTJ);
        abstractC47288tnHAhwBna.AhwBna.setBottomSheet(C45180skt.Companion.KWHzl());
        C55001xbh c55001xbhAkhnZx = abstractC47288tnHAhwBna.AhwBna.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setEllipsize(TextUtils.TruncateAt.END);
            c55001xbhAkhnZx.setCompoundDrawablePadding(C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ffGIBT));
        }
        abstractC47288tnHAhwBna.EZpvd.setBottomSheet(C45042siN.Companion.EZpvd());
        C55001xbh c55001xbhAkhnZx2 = abstractC47288tnHAhwBna.EZpvd.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            c55001xbhAkhnZx2.setEllipsize(TextUtils.TruncateAt.END);
        }
        abstractC47288tnHAhwBna.AYXKKw.setFilters(new android.text.InputFilter[]{new InputFilter.LengthFilter(255)});
        abstractC47288tnHAhwBna.AYXKKw.setCursorStyleWeb3();
        OKEditText oKEditText = abstractC47288tnHAhwBna.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        oKEditText.addTextChangedListener(new Activity(abstractC47288tnHAhwBna));
        C52794wYp c52794wYp = abstractC47288tnHAhwBna.KWHzl;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this, abstractC47288tnHAhwBna));
        setInputStates$default(this, false, false, false, 7, null);
        valueOf().KWHzl();
    }

    public static final Unit values(ActivityC44946sgX activityC44946sgX) {
        C45363soQ.onSessionIdEvent$default("SupportCenter_DepositStatusChecker_ToolTip_Click", false, null, 3, null);
        C45040siL.ActionBar actionBar = C45040siL.Companion;
        androidx.fragment.app.FragmentManager supportFragmentManager = activityC44946sgX.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        actionBar.OLrzqt(supportFragmentManager);
        return Unit.INSTANCE;
    }

    public final void KWHzl(OKEditText oKEditText) {
        oKEditText.setFocusableInTouchMode(false);
        oKEditText.setFocusable(false);
        oKEditText.setFocusableInTouchMode(true);
        oKEditText.setFocusable(true);
    }

    private final int djBIcL() {
        return ((java.lang.Number) this.gEmmrt.getValue()).intValue();
    }

    public static final int KWHzl() {
        return C33070mpX.OLrzqt(C52761wXj.StateListAnimator.AxsJAYaxsJAY);
    }

    public final void copydefault(java.lang.String str, java.lang.String str2) {
        AbstractC47288tnH abstractC47288tnHAhwBna = AhwBna();
        C55001xbh c55001xbhAkhnZx = abstractC47288tnHAhwBna.AhwBna.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setText(str);
        }
        C55001xbh c55001xbhAkhnZx2 = abstractC47288tnHAhwBna.EZpvd.AkhnZx();
        if (c55001xbhAkhnZx2 != null) {
            c55001xbhAkhnZx2.setText("");
        }
        OKEditText oKEditText = abstractC47288tnHAhwBna.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        KWHzl(oKEditText);
        C55018xby c55018xby = abstractC47288tnHAhwBna.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55018xby, "");
        c55018xby.setVisibility(valueOf().fJNWhG() ? 0 : 8);
        android.widget.TextView textView = abstractC47288tnHAhwBna.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(valueOf().ejfBZ() ? 0 : 8);
        OKEditText oKEditText2 = abstractC47288tnHAhwBna.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(oKEditText2, "");
        oKEditText2.setVisibility(valueOf().ejfBZ() ? 0 : 8);
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
            C55001xbh c55001xbhAkhnZx3 = abstractC47288tnHAhwBna.AhwBna.AkhnZx();
            if (c55001xbhAkhnZx3 != null) {
                c55001xbhAkhnZx3.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            }
        } else {
            Glide.KWHzl(abstractC47288tnHAhwBna.AhwBna).EZpvd(str2).OLrzqt((RX<?>) new C5448Sc().copydefault(djBIcL(), djBIcL())).OLrzqt(new Fragment(abstractC47288tnHAhwBna));
        }
        valueOf().EZpvd(-2);
    }

    /* JADX INFO: renamed from: o.sgX$Fragment */
    public static final class Fragment extends AbstractC5449Sd<android.graphics.drawable.Drawable> {
        public final /* synthetic */ AbstractC47288tnH OLrzqt;

        @Override // o.InterfaceC5462Sq
        public void a_(android.graphics.drawable.Drawable drawable) {
        }

        public Fragment(AbstractC47288tnH abstractC47288tnH) {
            this.OLrzqt = abstractC47288tnH;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        @Override // o.InterfaceC5462Sq
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(drawable, "");
            C55001xbh c55001xbhAkhnZx = this.OLrzqt.AhwBna.AkhnZx();
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            }
        }
    }

    public final void copydefault(java.lang.String str) {
        AbstractC47288tnH abstractC47288tnHAhwBna = AhwBna();
        C55001xbh c55001xbhAkhnZx = abstractC47288tnHAhwBna.EZpvd.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setText(str);
        }
        OKEditText oKEditText = abstractC47288tnHAhwBna.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        KWHzl(oKEditText);
        boolean zEjfBZ = valueOf().ejfBZ();
        android.widget.TextView textView = abstractC47288tnHAhwBna.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(zEjfBZ ? 0 : 8);
        OKEditText oKEditText2 = abstractC47288tnHAhwBna.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(oKEditText2, "");
        oKEditText2.setVisibility(zEjfBZ ? 0 : 8);
    }

    public static /* synthetic */ void setInputStates$default(ActivityC44946sgX activityC44946sgX, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        activityC44946sgX.EZpvd(z, z2, z3);
    }

    public final void EZpvd(boolean z, boolean z2, boolean z3) {
        AbstractC47288tnH abstractC47288tnHAhwBna = AhwBna();
        int i = 3;
        boolean z4 = false;
        abstractC47288tnHAhwBna.AhwBna.setState((abstractC47288tnHAhwBna.KWHzl.fJNWhG() || !z) ? 3 : 0);
        C55018xby c55018xby = abstractC47288tnHAhwBna.EZpvd;
        if (!abstractC47288tnHAhwBna.KWHzl.fJNWhG() && z2) {
            i = 0;
        }
        c55018xby.setState(i);
        OKEditText oKEditText = abstractC47288tnHAhwBna.AYXKKw;
        if (!abstractC47288tnHAhwBna.KWHzl.fJNWhG() && z3) {
            z4 = true;
        }
        oKEditText.setEnabled(z4);
        C52794wYp c52794wYp = abstractC47288tnHAhwBna.KWHzl;
        SupportTroubleshootViewModel supportTroubleshootViewModelValueOf = valueOf();
        android.text.Editable text = abstractC47288tnHAhwBna.AYXKKw.getText();
        java.lang.String string = text != null ? text.toString() : null;
        if (string == null) {
            string = "";
        }
        c52794wYp.setEnabled(supportTroubleshootViewModelValueOf.OLrzqt(string));
    }

    public final void AEQbTJ(TroubleshootResultPageData troubleshootResultPageData) {
        startActivity(SupportTroubleshootResultActivity.Companion.EZpvd(this, troubleshootResultPageData));
    }

    @Override // o.AbstractActivityC44870sfA, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC44870sfA, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // o.AbstractActivityC44870sfA, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
