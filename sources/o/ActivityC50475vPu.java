package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.Observer;
import com.okinc.tradeuilib.widget.oktinputlayout.core.InputLayoutState;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.RsiTrigger;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import com.okinc.unify_trade.bot.config.TriggerCond;
import com.okinc.unify_trade.bot.grid.viewmodel.SpotGridRsiPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vPu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC50475vPu extends AbstractActivityC48163uHh<uTJ, SpotGridRsiPresenter> {
    public static final Application Companion = new Application(null);

    /* JADX INFO: renamed from: o.vPu$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.DcMfJKDCKfqPDCfLja;
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return true;
    }

    /* JADX INFO: renamed from: o.vPu$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vPu.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ android.content.Intent getIntent$default(Application application, android.content.Context context, AdvancedTriggerSign advancedTriggerSign, StrategyConfigInfo strategyConfigInfo, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                strategyConfigInfo = null;
            }
            if ((i & 8) != 0) {
                str = null;
            }
            return application.AEQbTJ(context, advancedTriggerSign, strategyConfigInfo, str);
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, @NotNull AdvancedTriggerSign advancedTriggerSign, StrategyConfigInfo strategyConfigInfo, java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(advancedTriggerSign, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC50475vPu.class);
            intent.putExtra("trigger_sign", advancedTriggerSign);
            intent.putExtra("bot_config", strategyConfigInfo);
            android.content.Intent intentPutExtra = intent.putExtra("bot_ord_type", str);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            return intentPutExtra;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        OLrzqt();
        fetchVPNInfo();
        AhwBna();
        isConnected();
        ((SpotGridRsiPresenter) gHZMYf()).gEmmrt();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OLrzqt() {
        ((SpotGridRsiPresenter) gHZMYf()).EZpvd(getIntent().getExtras());
    }

    private final void fetchVPNInfo() {
        djBIcL();
        KWHzl();
        values();
        gEmmrt();
        valueOf();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void djBIcL() {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.OTwTPd);
        ((uTJ) sSMYrx()).values.setText(C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(C55688xof.Application.getDescription, C56423yEv.EZpvd(C56390yDp.OLrzqt("termRsi", strAYXKKw))), new java.lang.String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.vPA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50475vPu.OLrzqt(this.EZpvd, (java.util.List) obj);
            }
        }, 14, null));
        AppCompatImageView appCompatImageView = ((uTJ) sSMYrx()).gEmmrt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C33054mpH.EZpvd(appCompatImageView, C43454rpb.copydefault("images/trading_bot/android/trade_rsi_kline_spot_grid.png", this, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : C52761wXj.TaskDescription.DuR, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : new Function0() { // from class: o.vPy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC50475vPu.copydefault(this.copydefault);
            }
        }, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
    }

    public static final Unit OLrzqt(ActivityC50475vPu activityC50475vPu, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(C35334ntP.KWHzl(activityC50475vPu), C52761wXj.LoaderManager.ODXsMY));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(ActivityC50475vPu activityC50475vPu) {
        AppCompatTextView appCompatTextView = ((uTJ) activityC50475vPu.sSMYrx()).AhwBna;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(0);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void KWHzl() {
        C47988uAv c47988uAv = ((uTJ) sSMYrx()).valueOf;
        C47988uAv.setInputLabel$default(c47988uAv, C33070mpX.AYXKKw(C55688xof.Application.fromMediaItem), null, 2, null);
        C47988uAv.setInputLayoutState$default(c47988uAv, InputLayoutState.GREY_UN_CLICKABLE, false, 2, null);
        java.lang.String timePeriod = ((SpotGridRsiPresenter) gHZMYf()).KWHzl().getTimePeriod();
        if (timePeriod == null) {
            timePeriod = "";
        }
        C47988uAv.setInputContent$default(c47988uAv, timePeriod, false, false, 6, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void values() {
        C53530wnI c53530wnI = ((uTJ) sSMYrx()).AkhnZx;
        c53530wnI.setTitleText(C33070mpX.AYXKKw(C55688xof.Application.getACTION_SYSTEM_FALLBACK_PICK_IMAGESannotations));
        java.util.List<TradeMenuItemBean> listOLrzqt = ((SpotGridRsiPresenter) gHZMYf()).OLrzqt();
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c53530wnI.setTypeMenu(listOLrzqt, supportFragmentManager, new Function1() { // from class: o.vPv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50475vPu.AEQbTJ(this.EZpvd, (TradeMenuItemBean) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(ActivityC50475vPu activityC50475vPu, TradeMenuItemBean tradeMenuItemBean) {
        Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
        java.lang.Object data = tradeMenuItemBean.getData();
        Intrinsics.copydefault(data, "");
        java.lang.String mode = ((TriggerCond) data).getMode();
        ((SpotGridRsiPresenter) activityC50475vPu.gHZMYf()).KWHzl().setTriggerCond(mode);
        pUU.EZpvd(activityC50475vPu.getTAG(), "triggerCond: " + mode);
        ((SpotGridRsiPresenter) activityC50475vPu.gHZMYf()).gEmmrt();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gEmmrt() {
        ((uTJ) sSMYrx()).djBIcL.setMaxDecimal(0);
        C47988uAv.setInputContent$default(((uTJ) sSMYrx()).djBIcL, ((SpotGridRsiPresenter) gHZMYf()).KWHzl().getOversoldThold(), false, false, 6, null);
        ((uTJ) sSMYrx()).djBIcL.setOnTextChangeCallback(new Function2() { // from class: o.vPx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC50475vPu.copydefault(this.OLrzqt, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(ActivityC50475vPu activityC50475vPu, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        pUU.EZpvd(activityC50475vPu.getTAG(), "oversoldThreshold: " + str);
        ((SpotGridRsiPresenter) activityC50475vPu.gHZMYf()).KWHzl().setOversoldThold(str);
        if (activityC50475vPu.AEQbTJ()) {
            ((SpotGridRsiPresenter) activityC50475vPu.gHZMYf()).gEmmrt();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void valueOf() {
        C53530wnI c53530wnI = ((uTJ) sSMYrx()).fetchVPNInfo;
        c53530wnI.setTitleText(C33070mpX.AYXKKw(C55688xof.Application.heceqZ));
        java.util.List<TradeMenuItemBean> listCopydefault = ((SpotGridRsiPresenter) gHZMYf()).copydefault();
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c53530wnI.setTypeMenu(listCopydefault, supportFragmentManager, new Function1() { // from class: o.vPz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50475vPu.OLrzqt(this.EZpvd, (TradeMenuItemBean) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(ActivityC50475vPu activityC50475vPu, TradeMenuItemBean tradeMenuItemBean) {
        Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
        java.lang.Object data = tradeMenuItemBean.getData();
        Intrinsics.copydefault(data, "");
        java.lang.String str = (java.lang.String) data;
        ((SpotGridRsiPresenter) activityC50475vPu.gHZMYf()).KWHzl().setTimeframe(str);
        pUU.EZpvd(activityC50475vPu.getTAG(), "timeframe: " + str);
        ((SpotGridRsiPresenter) activityC50475vPu.gHZMYf()).gEmmrt();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AhwBna() {
        ((uTJ) sSMYrx()).EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.vPD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC50475vPu.gEmmrt(this.EZpvd, view);
            }
        });
        ((uTJ) sSMYrx()).KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.vPE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC50475vPu.OLrzqt(this.EZpvd, view);
            }
        });
        ((uTJ) sSMYrx()).isConnected.setOnClickListener(new View.OnClickListener() { // from class: o.vPF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC50475vPu.KWHzl(this.AEQbTJ, view);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void gEmmrt(ActivityC50475vPu activityC50475vPu, android.view.View view) {
        if (activityC50475vPu.copydefault()) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("trigger_sign", ((SpotGridRsiPresenter) activityC50475vPu.gHZMYf()).KWHzl());
            activityC50475vPu.setResult(-1, intent);
            activityC50475vPu.EZpvd();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(ActivityC50475vPu activityC50475vPu, android.view.View view) {
        ((SpotGridRsiPresenter) activityC50475vPu.gHZMYf()).KWHzl(!((SpotGridRsiPresenter) activityC50475vPu.gHZMYf()).EZpvd());
        ((uTJ) activityC50475vPu.sSMYrx()).values.setMaxLines(((SpotGridRsiPresenter) activityC50475vPu.gHZMYf()).EZpvd() ? Integer.MAX_VALUE : 2);
        ((uTJ) activityC50475vPu.sSMYrx()).KWHzl.setText(C33070mpX.AYXKKw(((SpotGridRsiPresenter) activityC50475vPu.gHZMYf()).EZpvd() ? C55688xof.Application.getNavigationItemCount : C55688xof.Application.getDisplayOptions));
    }

    public static final void KWHzl(ActivityC50475vPu activityC50475vPu, android.view.View view) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(C35334ntP.KWHzl(activityC50475vPu));
        viewOnClickListenerC54939xaY.EZpvd(activityC50475vPu.getString(C55688xof.Application.DNMMPQ));
        java.lang.String string = activityC50475vPu.getString(C55688xof.Application.QWSkGZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.vPw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                ActivityC50475vPu.copydefault(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final boolean copydefault() {
        return AEQbTJ();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void isConnected() {
        ((SpotGridRsiPresenter) gHZMYf()).AEQbTJ().observe(this, new StateListAnimator(new Function1() { // from class: o.vPs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50475vPu.KWHzl(this.copydefault, (RsiTrigger) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(ActivityC50475vPu activityC50475vPu, RsiTrigger rsiTrigger) {
        Intrinsics.checkNotNullParameter(rsiTrigger, "");
        AppCompatTextView appCompatTextView = ((uTJ) activityC50475vPu.sSMYrx()).DbNXlk;
        xMR xmr = xMR.copydefault;
        java.lang.String triggerNum = rsiTrigger.getTriggerNum();
        appCompatTextView.setText(xmr.copydefault(triggerNum != null ? triggerNum : ""));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final boolean AEQbTJ() {
        java.lang.String strAkhnZx = ((uTJ) sSMYrx()).djBIcL.AkhnZx();
        if (C33129mqd.AEQbTJ(strAkhnZx, 100)) {
            ((uTJ) sSMYrx()).djBIcL.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.OJuSTm, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.hCLrkq)), C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault("100")), C56390yDp.OLrzqt("unit", ""))));
            return false;
        }
        if (C33129mqd.gEmmrt(strAkhnZx, 1)) {
            ((uTJ) sSMYrx()).djBIcL.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.UlJrfe, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.hCLrkq)), C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault("1")), C56390yDp.OLrzqt("unit", ""))));
            return false;
        }
        ((uTJ) sSMYrx()).djBIcL.copydefault();
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void EZpvd() {
        C33054mpH.OLrzqt(C35334ntP.KWHzl(this), ((uTJ) sSMYrx()).getRoot());
        finish();
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
