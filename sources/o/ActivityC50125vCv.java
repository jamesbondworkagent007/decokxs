package o;

import android.view.View;
import androidx.lifecycle.Observer;
import com.okinc.tradingbot.impl.order.strategy.contractdca.presenter.ContractDcaStopConditionPresenter;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import com.okinc.unify_trade.bot.config.ContractDcaStopConditionType;
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

/* JADX INFO: renamed from: o.vCv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ActivityC50125vCv extends AbstractActivityC48163uHh<uYL, ContractDcaStopConditionPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final java.util.Map<java.lang.String, java.lang.Integer> AEQbTJ = C56424yEw.gEmmrt(C56390yDp.OLrzqt(ContractDcaStopConditionType.DEFAULT.getMode(), java.lang.Integer.valueOf(C48033uCm.Application.MediaControllerCompatApi21CallbackProxy)), C56390yDp.OLrzqt(ContractDcaStopConditionType.END_ROUND_STOP.getMode(), java.lang.Integer.valueOf(C48033uCm.Application.zlzhuY)), C56390yDp.OLrzqt(ContractDcaStopConditionType.PRICE.getMode(), java.lang.Integer.valueOf(C48033uCm.Application.MediaSessionCompatMediaSessionImplBaseMediaSessionStub)));

    /* JADX INFO: renamed from: o.vCv$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
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
        return C48033uCm.Activity.OStAOF;
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ContractDcaStopConditionPresenter EZpvd(ActivityC50125vCv activityC50125vCv) {
        return (ContractDcaStopConditionPresenter) activityC50125vCv.gHZMYf();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ uYL copydefault(ActivityC50125vCv activityC50125vCv) {
        return (uYL) activityC50125vCv.sSMYrx();
    }

    /* JADX INFO: renamed from: o.vCv$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vCv.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void AEQbTJ(@NotNull android.content.Context context, @NotNull TacticsData tacticsData) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(tacticsData, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC50125vCv.class);
            intent.putExtra("data", tacticsData);
            context.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        copydefault();
        djBIcL();
        AEQbTJ();
        OLrzqt();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault() {
        ((ContractDcaStopConditionPresenter) gHZMYf()).KWHzl((TacticsData) getIntent().getParcelableExtra("data"));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void djBIcL() {
        DcaTriggerParam dcaTriggerParam;
        java.lang.String instType;
        java.lang.String instFamily;
        java.util.List<DcaTriggerParam> triggerParams;
        java.lang.Object next;
        C52702wVe c52702wVe = ((uYL) sSMYrx()).EZpvd;
        java.lang.String str = "";
        Intrinsics.checkNotNullExpressionValue(c52702wVe, "");
        TacticsData tacticsDataDjBIcL = ((ContractDcaStopConditionPresenter) gHZMYf()).djBIcL();
        java.lang.String algoId = tacticsDataDjBIcL != null ? tacticsDataDjBIcL.getAlgoId() : null;
        int iAhwBna = 8;
        c52702wVe.setVisibility(algoId == null || algoId.length() == 0 ? 0 : 8);
        ((uYL) sSMYrx()).gEmmrt.setOnSelectedChanged(new yHO() { // from class: o.vCu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return ActivityC50125vCv.OLrzqt(this.copydefault, ((java.lang.Integer) obj).intValue(), ((java.lang.Boolean) obj2).booleanValue(), ((java.lang.Boolean) obj3).booleanValue());
            }
        });
        TacticsData tacticsDataDjBIcL2 = ((ContractDcaStopConditionPresenter) gHZMYf()).djBIcL();
        if (tacticsDataDjBIcL2 == null || (triggerParams = tacticsDataDjBIcL2.getTriggerParams()) == null) {
            dcaTriggerParam = null;
        } else {
            java.util.Iterator<T> it = triggerParams.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                DcaTriggerParam dcaTriggerParam2 = (DcaTriggerParam) next;
                if (Intrinsics.EZpvd((java.lang.Object) (dcaTriggerParam2 != null ? dcaTriggerParam2.getTriggerAction() : null), (java.lang.Object) "stop")) {
                    break;
                }
            }
            dcaTriggerParam = (DcaTriggerParam) next;
        }
        AEQbTJ(dcaTriggerParam != null ? dcaTriggerParam.getTriggerCond() : null);
        KWHzl(dcaTriggerParam != null ? dcaTriggerParam.getTriggerStrategy() : null);
        C52701wVd c52701wVd = ((uYL) sSMYrx()).gEmmrt;
        java.lang.Integer num = this.AEQbTJ.get(dcaTriggerParam != null ? dcaTriggerParam.getTriggerStrategy() : null);
        C52701wVd.setSelectedId$default(c52701wVd, num != null ? num.intValue() : -1, false, 2, null);
        C53530wnI c53530wnI = ((uYL) sSMYrx()).AYXKKw;
        c53530wnI.setTitleText(C33070mpX.AYXKKw(C55688xof.Application.GFUIi));
        java.util.List<TradeMenuItemBean> listCopydefault = ((ContractDcaStopConditionPresenter) gHZMYf()).copydefault();
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c53530wnI.setTypeMenu(listCopydefault, supportFragmentManager, new Function1() { // from class: o.vCt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50125vCv.EZpvd(this.AEQbTJ, (TradeMenuItemBean) obj);
            }
        });
        final C47988uAv c47988uAv = ((uYL) sSMYrx()).AhwBna;
        BizInstrument bizInstrumentAEQbTJ = ((ContractDcaStopConditionPresenter) gHZMYf()).AEQbTJ();
        c47988uAv.setInputUnit(bizInstrumentAEQbTJ != null ? bizInstrumentAEQbTJ.getQuoteSymbol() : null);
        c47988uAv.setInputHint("> 0");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            TacticsData tacticsDataDjBIcL3 = ((ContractDcaStopConditionPresenter) gHZMYf()).djBIcL();
            if (tacticsDataDjBIcL3 == null || (instType = tacticsDataDjBIcL3.getInstType()) == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                BizInstrument bizInstrumentAEQbTJ2 = ((ContractDcaStopConditionPresenter) gHZMYf()).AEQbTJ();
                if (bizInstrumentAEQbTJ2 != null && (instFamily = bizInstrumentAEQbTJ2.getInstFamily()) != null) {
                    str = instFamily;
                }
                java.lang.String strFIwbmz = abstractC54531xLwOLrzqt.fIwbmz(str);
                if (strFIwbmz != null) {
                    iAhwBna = C33129mqd.AhwBna(strFIwbmz);
                }
            }
        }
        c47988uAv.setMaxDecimal(iAhwBna);
        c47988uAv.setOnTextChangeCallback(new Function2() { // from class: o.vCy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC50125vCv.EZpvd(c47988uAv, this, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        C47988uAv.setInputContent$default(c47988uAv, dcaTriggerParam != null ? dcaTriggerParam.getTriggerPx() : null, false, false, 6, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(ActivityC50125vCv activityC50125vCv, int i, boolean z, boolean z2) {
        android.widget.LinearLayout linearLayout = ((uYL) activityC50125vCv.sSMYrx()).valueOf;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility((i == C48033uCm.Application.MediaSessionCompatMediaSessionImplBaseMediaSessionStub && z) ? 0 : 8);
        if (z) {
            java.util.Map<java.lang.String, java.lang.Integer> map = activityC50125vCv.AEQbTJ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<java.lang.String, java.lang.Integer> entry : map.entrySet()) {
                if (entry.getValue().intValue() == i) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            activityC50125vCv.KWHzl((java.lang.String) CollectionsKt___CollectionsKt.RcXXUw(linkedHashMap.keySet()));
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC50125vCv activityC50125vCv, TradeMenuItemBean tradeMenuItemBean) {
        Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
        java.lang.Object data = tradeMenuItemBean.getData();
        activityC50125vCv.AEQbTJ(data instanceof java.lang.String ? (java.lang.String) data : null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C47988uAv c47988uAv, ActivityC50125vCv activityC50125vCv, C47988uAv c47988uAv2, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv2, "");
        c47988uAv.copydefault();
        activityC50125vCv.KWHzl();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AEQbTJ() {
        C52794wYp c52794wYp = ((uYL) sSMYrx()).AEQbTJ;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OLrzqt() {
        ((ContractDcaStopConditionPresenter) gHZMYf()).OLrzqt().observe(this, new ActionBar(new Function1() { // from class: o.vCw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50125vCv.OLrzqt(this.copydefault, (StrategyResponse) obj);
            }
        }));
        ((ContractDcaStopConditionPresenter) gHZMYf()).KWHzl().AhwBna().observe(this, new Observer() { // from class: o.vCs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                ActivityC50125vCv.OLrzqt((java.lang.Exception) obj);
            }
        });
    }

    public static final Unit OLrzqt(ActivityC50125vCv activityC50125vCv, StrategyResponse strategyResponse) {
        Intrinsics.checkNotNullParameter(strategyResponse, "");
        C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.onMultiWindowModeChanged, 0, 1, (java.lang.Object) null);
        activityC50125vCv.finish();
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(java.lang.String str) {
        ((ContractDcaStopConditionPresenter) gHZMYf()).OLrzqt(str);
        KWHzl();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(java.lang.String str) {
        TriggerCond triggerCondAEQbTJ = TriggerCond.Companion.AEQbTJ(str);
        if (triggerCondAEQbTJ == null) {
            triggerCondAEQbTJ = TriggerCond.CROSS_UP;
        }
        ((ContractDcaStopConditionPresenter) gHZMYf()).AEQbTJ(triggerCondAEQbTJ.getMode());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX DEBUG: Possible override for method o.xKr.KWHzl()Ljava/lang/Class; */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl() {
        java.lang.String strEZpvd = ((ContractDcaStopConditionPresenter) gHZMYf()).EZpvd();
        boolean zAEQbTJ = false;
        if (Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) ContractDcaStopConditionType.PRICE.getMode())) {
            zAEQbTJ = C33129mqd.AEQbTJ(((uYL) sSMYrx()).AhwBna.AkhnZx(), 0);
        } else if (Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) ContractDcaStopConditionType.END_ROUND_STOP.getMode()) || Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) ContractDcaStopConditionType.DEFAULT.getMode())) {
            zAEQbTJ = true;
        }
        ((uYL) sSMYrx()).AEQbTJ.setEnabled(zAEQbTJ);
    }

    /* JADX INFO: renamed from: o.vCv$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ ActivityC50125vCv EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC50125vCv activityC50125vCv) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = activityC50125vCv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (ActivityC50125vCv.EZpvd(this.EZpvd).EZpvd() != null && this.EZpvd.EZpvd()) {
                    TacticsData tacticsDataDjBIcL = ActivityC50125vCv.EZpvd(this.EZpvd).djBIcL();
                    java.lang.String algoId = tacticsDataDjBIcL != null ? tacticsDataDjBIcL.getAlgoId() : null;
                    if (algoId == null || algoId.length() == 0) {
                        ActivityC50125vCv activityC50125vCv = this.EZpvd;
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("data", ActivityC50125vCv.EZpvd(this.EZpvd).copydefault(ActivityC50125vCv.copydefault(this.EZpvd).AhwBna.AkhnZx()));
                        Unit unit = Unit.INSTANCE;
                        activityC50125vCv.setResult(-1, intent);
                        this.EZpvd.finish();
                        return;
                    }
                    ActivityC50125vCv.EZpvd(this.EZpvd).KWHzl(ActivityC50125vCv.copydefault(this.EZpvd).AhwBna.AkhnZx());
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean EZpvd() {
        boolean z;
        java.lang.String strAkhnZx = ((uYL) sSMYrx()).AhwBna.AkhnZx();
        if (Intrinsics.EZpvd((java.lang.Object) ((ContractDcaStopConditionPresenter) gHZMYf()).EZpvd(), (java.lang.Object) ContractDcaStopConditionType.PRICE.getMode())) {
            z = C33129mqd.AEQbTJ(strAkhnZx, 0);
        }
        if (!z) {
            ((uYL) sSMYrx()).AhwBna.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.ActivityResultContractsPickVisualMedia, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.ActionBar)), C56390yDp.OLrzqt("minValue", "0"), C56390yDp.OLrzqt("unit", ((uYL) sSMYrx()).AhwBna.fARcdN()))));
        } else {
            ((uYL) sSMYrx()).AhwBna.copydefault();
        }
        return z;
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
