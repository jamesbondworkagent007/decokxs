package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.Observer;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.tradingbot.impl.order.strategy.contractdca.presenter.ContractDcaStartConditionPresenter;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.bot.config.ContractDcaTriggerType;
import com.okinc.unify_trade.bot.config.TimeFrame;
import com.okinc.unify_trade.bot.config.TriggerCond;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vCk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ActivityC50114vCk extends AbstractActivityC48163uHh<uYK, ContractDcaStartConditionPresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final ActivityResultLauncher<android.content.Intent> AEQbTJ;
    public final java.util.Map<java.lang.String, java.lang.Integer> OLrzqt = C56424yEw.gEmmrt(C56390yDp.OLrzqt(ContractDcaTriggerType.INSTANT.getMode(), java.lang.Integer.valueOf(C48033uCm.Application.zNQIcI)), C56390yDp.OLrzqt(ContractDcaTriggerType.RSI.getMode(), java.lang.Integer.valueOf(C48033uCm.Application.ComponentActivityReportFullyDrawnExecutorApi16Impl)), C56390yDp.OLrzqt(ContractDcaTriggerType.WEB_HOOK.getMode(), java.lang.Integer.valueOf(C48033uCm.Application.DeprecatedSinceApi)), C56390yDp.OLrzqt(ContractDcaTriggerType.PRICE.getMode(), java.lang.Integer.valueOf(C48033uCm.Application.MediaSessionCompatResultReceiverWrapper1)));

    /* JADX INFO: renamed from: o.vCk$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.hKJZrr;
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ContractDcaStartConditionPresenter AEQbTJ(ActivityC50114vCk activityC50114vCk) {
        return (ContractDcaStartConditionPresenter) activityC50114vCk.gHZMYf();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ uYK KWHzl(ActivityC50114vCk activityC50114vCk) {
        return (uYK) activityC50114vCk.sSMYrx();
    }

    public ActivityC50114vCk() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.vCp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC50114vCk.OLrzqt(this.OLrzqt, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AEQbTJ = activityResultLauncherRegisterForActivityResult;
    }

    public final boolean copydefault() {
        return C48291uMa.Companion.AEQbTJ().OLrzqt();
    }

    /* JADX INFO: renamed from: o.vCk$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vCk.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void KWHzl(@NotNull android.content.Context context, TacticsData tacticsData) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC50114vCk.class);
            intent.putExtra("data", tacticsData);
            context.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        valueOf();
        values();
        EZpvd();
        AEQbTJ();
        AhwBna();
        djBIcL();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void valueOf() {
        ContractDcaStartConditionPresenter contractDcaStartConditionPresenter = (ContractDcaStartConditionPresenter) gHZMYf();
        android.content.Intent intent = getIntent();
        contractDcaStartConditionPresenter.copydefault(intent != null ? (TacticsData) intent.getParcelableExtra("data") : null);
        ((ContractDcaStartConditionPresenter) gHZMYf()).OLrzqt();
        ((ContractDcaStartConditionPresenter) gHZMYf()).valueOf();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void values() {
        ((uYK) sSMYrx()).gEmmrt.setOnSelectedChanged(new yHO() { // from class: o.vCq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return ActivityC50114vCk.AEQbTJ(this.copydefault, ((java.lang.Integer) obj).intValue(), ((java.lang.Boolean) obj2).booleanValue(), ((java.lang.Boolean) obj3).booleanValue());
            }
        });
        C52701wVd c52701wVd = ((uYK) sSMYrx()).gEmmrt;
        java.util.Map<java.lang.String, java.lang.Integer> map = this.OLrzqt;
        DcaTriggerParam dcaTriggerParamDjBIcL = ((ContractDcaStartConditionPresenter) gHZMYf()).djBIcL();
        java.lang.Integer num = map.get(dcaTriggerParamDjBIcL != null ? dcaTriggerParamDjBIcL.getTriggerStrategy() : null);
        C52701wVd.setSelectedId$default(c52701wVd, num != null ? num.intValue() : C48033uCm.Application.zNQIcI, false, 2, null);
        KWHzl();
        C52702wVe c52702wVe = ((uYK) sSMYrx()).AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c52702wVe, "");
        c52702wVe.setVisibility(copydefault() ^ true ? 0 : 8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r7v5, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(ActivityC50114vCk activityC50114vCk, int i, boolean z, boolean z2) {
        DcaTriggerParam dcaTriggerParamDjBIcL;
        android.view.View root = ((uYK) activityC50114vCk.sSMYrx()).EZpvd.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        int i2 = 8;
        root.setVisibility((i == C48033uCm.Application.ComponentActivityReportFullyDrawnExecutorApi16Impl && z) ? 0 : 8);
        C47988uAv c47988uAv = ((uYK) activityC50114vCk.sSMYrx()).djBIcL;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        if (i == C48033uCm.Application.MediaSessionCompatResultReceiverWrapper1 && z) {
            i2 = 0;
        }
        c47988uAv.setVisibility(i2);
        if (z && (dcaTriggerParamDjBIcL = ((ContractDcaStartConditionPresenter) activityC50114vCk.gHZMYf()).djBIcL()) != null) {
            java.util.Map<java.lang.String, java.lang.Integer> map = activityC50114vCk.OLrzqt;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<java.lang.String, java.lang.Integer> entry : map.entrySet()) {
                if (entry.getValue().intValue() == i) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            dcaTriggerParamDjBIcL.setTriggerStrategy((java.lang.String) CollectionsKt___CollectionsKt.RcXXUw(linkedHashMap.keySet()));
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v24, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Possible override for method o.xKr.KWHzl()Ljava/lang/Class; */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl() {
        TacticsData tacticsDataAYXKKw = ((ContractDcaStartConditionPresenter) gHZMYf()).AYXKKw();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (tacticsDataAYXKKw != null ? tacticsDataAYXKKw.getAlgoId() : null))) {
            DcaTriggerParam dcaTriggerParamDjBIcL = ((ContractDcaStartConditionPresenter) gHZMYf()).djBIcL();
            if (Intrinsics.EZpvd((java.lang.Object) (dcaTriggerParamDjBIcL != null ? dcaTriggerParamDjBIcL.getTriggerStrategy() : null), (java.lang.Object) ContractDcaTriggerType.PRICE.getMode())) {
                C52702wVe c52702wVe = ((uYK) sSMYrx()).copydefault;
                Intrinsics.checkNotNullExpressionValue(c52702wVe, "");
                c52702wVe.setVisibility(8);
                C52702wVe c52702wVe2 = ((uYK) sSMYrx()).AYXKKw;
                Intrinsics.checkNotNullExpressionValue(c52702wVe2, "");
                c52702wVe2.setVisibility(8);
                C52702wVe c52702wVe3 = ((uYK) sSMYrx()).AhwBna;
                Intrinsics.checkNotNullExpressionValue(c52702wVe3, "");
                c52702wVe3.setVisibility(8);
                ((uYK) sSMYrx()).KWHzl.setSubTitle(C33070mpX.AYXKKw(C55688xof.Application.gCZUJG));
                ((uYK) sSMYrx()).KWHzl.setCheckedDisable();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd() {
        uWI uwi = ((uYK) sSMYrx()).EZpvd;
        uwi.getRoot().setOnClickListener(null);
        AppCompatTextView appCompatTextView = uwi.OLrzqt;
        appCompatTextView.setOnClickListener(new Application(appCompatTextView, 1000L, this));
        gEmmrt();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AhwBna() {
        C52794wYp c52794wYp = ((uYK) sSMYrx()).AEQbTJ;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void djBIcL() {
        ((ContractDcaStartConditionPresenter) gHZMYf()).AEQbTJ().observe(this, new TaskDescription(new Function1() { // from class: o.vCo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50114vCk.KWHzl(this.OLrzqt, (StrategyResponse) obj);
            }
        }));
        ((ContractDcaStartConditionPresenter) gHZMYf()).copydefault().AhwBna().observe(this, new Observer() { // from class: o.vCr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                ActivityC50114vCk.copydefault((java.lang.Exception) obj);
            }
        });
    }

    public static final Unit KWHzl(ActivityC50114vCk activityC50114vCk, StrategyResponse strategyResponse) {
        Intrinsics.checkNotNullParameter(strategyResponse, "");
        C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.onMultiWindowModeChanged, 0, 1, (java.lang.Object) null);
        activityC50114vCk.finish();
        return Unit.INSTANCE;
    }

    public static final void copydefault(java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void gEmmrt() {
        java.lang.String thold;
        java.lang.String timeframe;
        uWI uwi = ((uYK) sSMYrx()).EZpvd;
        AppCompatTextView appCompatTextView = uwi.AYXKKw;
        TriggerCond.Activity activity = TriggerCond.Companion;
        DcaTriggerParam dcaTriggerParamDjBIcL = ((ContractDcaStartConditionPresenter) gHZMYf()).djBIcL();
        appCompatTextView.setText(activity.KWHzl(dcaTriggerParamDjBIcL != null ? dcaTriggerParamDjBIcL.getTriggerCond() : null));
        AppCompatTextView appCompatTextView2 = uwi.EZpvd;
        DcaTriggerParam dcaTriggerParamDjBIcL2 = ((ContractDcaStartConditionPresenter) gHZMYf()).djBIcL();
        appCompatTextView2.setText(dcaTriggerParamDjBIcL2 != null ? dcaTriggerParamDjBIcL2.getTimePeriod() : null);
        AppCompatTextView appCompatTextView3 = uwi.valueOf;
        xMR xmr = xMR.copydefault;
        DcaTriggerParam dcaTriggerParamDjBIcL3 = ((ContractDcaStartConditionPresenter) gHZMYf()).djBIcL();
        java.lang.String str = "";
        if (dcaTriggerParamDjBIcL3 == null || (thold = dcaTriggerParamDjBIcL3.getThold()) == null) {
            thold = "";
        }
        appCompatTextView3.setText(xmr.copydefault(thold));
        AppCompatTextView appCompatTextView4 = uwi.AEQbTJ;
        TimeFrame.Application application = TimeFrame.Companion;
        DcaTriggerParam dcaTriggerParamDjBIcL4 = ((ContractDcaStartConditionPresenter) gHZMYf()).djBIcL();
        if (dcaTriggerParamDjBIcL4 != null && (timeframe = dcaTriggerParamDjBIcL4.getTimeframe()) != null) {
            str = timeframe;
        }
        appCompatTextView4.setText(application.copydefault(str));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ() {
        C47988uAv c47988uAv = ((uYK) sSMYrx()).djBIcL;
        BizInstrument bizInstrumentKWHzl = ((ContractDcaStartConditionPresenter) gHZMYf()).KWHzl();
        c47988uAv.setInputUnit(bizInstrumentKWHzl != null ? bizInstrumentKWHzl.getQuoteSymbol() : null);
        c47988uAv.setMaxDecimal(((ContractDcaStartConditionPresenter) gHZMYf()).AhwBna());
        c47988uAv.setOnTextChangeCallback(new Function2() { // from class: o.vCn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC50114vCk.copydefault(this.copydefault, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        DcaTriggerParam dcaTriggerParamDjBIcL = ((ContractDcaStartConditionPresenter) gHZMYf()).djBIcL();
        C47988uAv.setInputContent$default(c47988uAv, dcaTriggerParamDjBIcL != null ? dcaTriggerParamDjBIcL.getTriggerPx() : null, false, false, 6, null);
    }

    /* JADX INFO: renamed from: o.vCk$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ ActivityC50114vCk OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC50114vCk activityC50114vCk) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = activityC50114vCk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (this.OLrzqt.OLrzqt()) {
                    TacticsData tacticsDataAYXKKw = ActivityC50114vCk.AEQbTJ(this.OLrzqt).AYXKKw();
                    java.lang.String algoId = tacticsDataAYXKKw != null ? tacticsDataAYXKKw.getAlgoId() : null;
                    if (algoId == null || algoId.length() == 0) {
                        ActivityC50114vCk activityC50114vCk = this.OLrzqt;
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("data", ActivityC50114vCk.AEQbTJ(this.OLrzqt).AEQbTJ(ActivityC50114vCk.KWHzl(this.OLrzqt).djBIcL.AkhnZx()));
                        Unit unit = Unit.INSTANCE;
                        activityC50114vCk.setResult(-1, intent);
                        this.OLrzqt.finish();
                        return;
                    }
                    ActivityC50114vCk.AEQbTJ(this.OLrzqt).OLrzqt(ActivityC50114vCk.KWHzl(this.OLrzqt).djBIcL.AkhnZx());
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.vCk$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC50114vCk OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC50114vCk activityC50114vCk) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = activityC50114vCk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ActivityResultLauncher activityResultLauncher = this.OLrzqt.AEQbTJ;
                android.content.Intent intent = new android.content.Intent(this.OLrzqt, (java.lang.Class<?>) ActivityC50127vCx.class);
                intent.putExtra("triggerSign", ActivityC50114vCk.AEQbTJ(this.OLrzqt).djBIcL());
                intent.putExtra(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, ActivityC50114vCk.AEQbTJ(this.OLrzqt).EZpvd());
                TacticsData tacticsDataAYXKKw = ActivityC50114vCk.AEQbTJ(this.OLrzqt).AYXKKw();
                intent.putExtra("bot_inst_id", tacticsDataAYXKKw != null ? tacticsDataAYXKKw.getInstId() : null);
                activityResultLauncher.launch(intent);
            }
        }
    }

    public static final Unit copydefault(ActivityC50114vCk activityC50114vCk, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        activityC50114vCk.OLrzqt();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: Binding */
    /* JADX DEBUG: Possible override for method o.xKr.OLrzqt()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OLrzqt() {
        DcaTriggerParam dcaTriggerParamDjBIcL = ((ContractDcaStartConditionPresenter) gHZMYf()).djBIcL();
        if (!Intrinsics.EZpvd((java.lang.Object) (dcaTriggerParamDjBIcL != null ? dcaTriggerParamDjBIcL.getTriggerStrategy() : null), (java.lang.Object) ContractDcaTriggerType.PRICE.getMode())) {
            return true;
        }
        kotlin.Pair<java.lang.Boolean, java.lang.String> pairCopydefault = ((ContractDcaStartConditionPresenter) gHZMYf()).copydefault(((uYK) sSMYrx()).djBIcL.AkhnZx());
        boolean zBooleanValue = pairCopydefault.component1().booleanValue();
        java.lang.String strComponent2 = pairCopydefault.component2();
        if (zBooleanValue) {
            ((uYK) sSMYrx()).djBIcL.copydefault();
            return true;
        }
        ((uYK) sSMYrx()).djBIcL.setInputErrorMsg(strComponent2);
        ((uYK) sSMYrx()).djBIcL.zsXlph();
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(ActivityC50114vCk activityC50114vCk, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            ContractDcaStartConditionPresenter contractDcaStartConditionPresenter = (ContractDcaStartConditionPresenter) activityC50114vCk.gHZMYf();
            android.content.Intent data = activityResult.getData();
            contractDcaStartConditionPresenter.KWHzl(data != null ? (DcaTriggerParam) data.getParcelableExtra("data") : null);
            activityC50114vCk.gEmmrt();
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
