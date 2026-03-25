package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaAdvancedParams;
import com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaStartConditionPresenter;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.TimeFrame;
import com.okinc.unify_trade.bot.config.TriggerCond;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;

/* JADX INFO: renamed from: o.wgG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ActivityC53157wgG extends AbstractActivityC48163uHh<uYS, SpotDcaStartConditionPresenter> {
    public final ActivityResultLauncher<android.content.Intent> EZpvd;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.wgF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC53157wgG.KWHzl(this.OLrzqt);
        }
    });
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.RcvFxC;
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SpotDcaStartConditionPresenter EZpvd(ActivityC53157wgG activityC53157wgG) {
        return (SpotDcaStartConditionPresenter) activityC53157wgG.gHZMYf();
    }

    public ActivityC53157wgG() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.wgD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC53157wgG.copydefault(this.AEQbTJ, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.EZpvd = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String KWHzl() {
        return (java.lang.String) this.KWHzl.getValue();
    }

    public static final java.lang.String KWHzl(ActivityC53157wgG activityC53157wgG) {
        android.content.Intent intent = activityC53157wgG.getIntent();
        if (intent != null) {
            return intent.getStringExtra("bot_inst_id");
        }
        return null;
    }

    /* JADX INFO: renamed from: o.wgG$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wgG.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        EZpvd();
        copydefault();
        OLrzqt();
        AEQbTJ();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void EZpvd() {
        SpotDcaStartConditionPresenter spotDcaStartConditionPresenter = (SpotDcaStartConditionPresenter) gHZMYf();
        android.content.Intent intent = getIntent();
        spotDcaStartConditionPresenter.KWHzl(intent != null ? (SpotDcaAdvancedParams) intent.getParcelableExtra("data") : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault() {
        ((uYS) sSMYrx()).AhwBna.setOnSelectedChanged(new yHO() { // from class: o.wgC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return ActivityC53157wgG.AEQbTJ(this.KWHzl, ((java.lang.Integer) obj).intValue(), ((java.lang.Boolean) obj2).booleanValue(), ((java.lang.Boolean) obj3).booleanValue());
            }
        });
        C52701wVd c52701wVd = ((uYS) sSMYrx()).AhwBna;
        SpotDcaAdvancedParams spotDcaAdvancedParamsKWHzl = ((SpotDcaStartConditionPresenter) gHZMYf()).KWHzl();
        C52701wVd.setSelectedId$default(c52701wVd, (spotDcaAdvancedParamsKWHzl != null ? spotDcaAdvancedParamsKWHzl.AEQbTJ() : null) == GridStartTriggerType.INSTANT ? C48033uCm.Application.zNQIcI : C48033uCm.Application.ComponentActivityReportFullyDrawnExecutorApi16Impl, false, 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(ActivityC53157wgG activityC53157wgG, int i, boolean z, boolean z2) {
        if (i == C48033uCm.Application.ComponentActivityReportFullyDrawnExecutorApi16Impl) {
            android.view.View root = ((uYS) activityC53157wgG.sSMYrx()).copydefault.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setVisibility(z ? 0 : 8);
        }
        SpotDcaAdvancedParams spotDcaAdvancedParamsKWHzl = ((SpotDcaStartConditionPresenter) activityC53157wgG.gHZMYf()).KWHzl();
        if (spotDcaAdvancedParamsKWHzl != null) {
            spotDcaAdvancedParamsKWHzl.EZpvd(i == C48033uCm.Application.ComponentActivityReportFullyDrawnExecutorApi16Impl ? GridStartTriggerType.RSI_14 : GridStartTriggerType.INSTANT);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OLrzqt() {
        uWI uwi = ((uYS) sSMYrx()).copydefault;
        uwi.getRoot().setOnClickListener(null);
        AppCompatTextView appCompatTextView = uwi.OLrzqt;
        appCompatTextView.setOnClickListener(new Application(appCompatTextView, 1000L, this));
        valueOf();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AEQbTJ() {
        C52794wYp c52794wYp = ((uYS) sSMYrx()).EZpvd;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void valueOf() {
        java.lang.String thold;
        java.lang.String timeframe;
        java.util.List<DcaTriggerParam> listAYXKKw;
        SpotDcaAdvancedParams spotDcaAdvancedParamsKWHzl = ((SpotDcaStartConditionPresenter) gHZMYf()).KWHzl();
        DcaTriggerParam dcaTriggerParam = (spotDcaAdvancedParamsKWHzl == null || (listAYXKKw = spotDcaAdvancedParamsKWHzl.AYXKKw()) == null) ? null : (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(listAYXKKw);
        uWI uwi = ((uYS) sSMYrx()).copydefault;
        uwi.AYXKKw.setText(TriggerCond.Companion.KWHzl(dcaTriggerParam != null ? dcaTriggerParam.getTriggerCond() : null));
        uwi.EZpvd.setText(dcaTriggerParam != null ? dcaTriggerParam.getTimePeriod() : null);
        AppCompatTextView appCompatTextView = uwi.valueOf;
        xMR xmr = xMR.copydefault;
        java.lang.String str = "";
        if (dcaTriggerParam == null || (thold = dcaTriggerParam.getThold()) == null) {
            thold = "";
        }
        appCompatTextView.setText(xmr.copydefault(thold));
        AppCompatTextView appCompatTextView2 = uwi.AEQbTJ;
        TimeFrame.Application application = TimeFrame.Companion;
        if (dcaTriggerParam != null && (timeframe = dcaTriggerParam.getTimeframe()) != null) {
            str = timeframe;
        }
        appCompatTextView2.setText(application.copydefault(str));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(ActivityC53157wgG activityC53157wgG, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            SpotDcaAdvancedParams spotDcaAdvancedParamsKWHzl = ((SpotDcaStartConditionPresenter) activityC53157wgG.gHZMYf()).KWHzl();
            if (spotDcaAdvancedParamsKWHzl != null) {
                android.content.Intent data = activityResult.getData();
                spotDcaAdvancedParamsKWHzl.EZpvd(data != null ? data.getParcelableArrayListExtra("data") : null);
            }
            activityC53157wgG.valueOf();
        }
    }

    /* JADX INFO: renamed from: o.wgG$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ ActivityC53157wgG EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC53157wgG activityC53157wgG) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = activityC53157wgG;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                ActivityC53157wgG activityC53157wgG = this.EZpvd;
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("data", ActivityC53157wgG.EZpvd(this.EZpvd).KWHzl());
                Unit unit = Unit.INSTANCE;
                activityC53157wgG.setResult(-1, intent);
                this.EZpvd.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.wgG$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ ActivityC53157wgG copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC53157wgG activityC53157wgG) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = activityC53157wgG;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.util.List<DcaTriggerParam> listAYXKKw;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                ActivityResultLauncher activityResultLauncher = this.copydefault.EZpvd;
                android.content.Intent intent = new android.content.Intent(this.copydefault, (java.lang.Class<?>) ActivityC53155wgE.class);
                DcaTriggerParam[] dcaTriggerParamArr = new DcaTriggerParam[1];
                SpotDcaAdvancedParams spotDcaAdvancedParamsKWHzl = ActivityC53157wgG.EZpvd(this.copydefault).KWHzl();
                dcaTriggerParamArr[0] = (spotDcaAdvancedParamsKWHzl == null || (listAYXKKw = spotDcaAdvancedParamsKWHzl.AYXKKw()) == null) ? null : (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(listAYXKKw);
                intent.putParcelableArrayListExtra("data", yDY.copydefault(dcaTriggerParamArr));
                intent.putExtra("bot_inst_id", this.copydefault.KWHzl());
                activityResultLauncher.launch(intent);
            }
        }
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
