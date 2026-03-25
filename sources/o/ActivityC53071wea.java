package o;

import android.view.View;
import androidx.lifecycle.Observer;
import com.okinc.tradeuilib.widget.oktinputlayout.core.InputLayoutState;
import com.okinc.unify_trade.biz.RsiTrigger;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import com.okinc.unify_trade.bot.config.TimeFrame;
import com.okinc.unify_trade.bot.config.TriggerCond;
import com.okinc.unify_trade.bot.contract_grid.viewModel.ContractGridRsiPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: renamed from: o.wea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class ActivityC53071wea extends AbstractActivityC48163uHh<uZO, ContractGridRsiPresenter> {

    /* JADX INFO: renamed from: o.wea$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
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
        return C48033uCm.Activity.DVmcag;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        KWHzl();
        DbNXlk();
        OLrzqt();
        AkhnZx();
        ((ContractGridRsiPresenter) gHZMYf()).AhwBna();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void KWHzl() {
        ContractGridRsiPresenter contractGridRsiPresenter = (ContractGridRsiPresenter) gHZMYf();
        android.content.Intent intent = getIntent();
        contractGridRsiPresenter.KWHzl(intent != null ? intent.getExtras() : null);
    }

    private final void DbNXlk() {
        djBIcL();
        copydefault();
        valueOf();
        gEmmrt();
        AhwBna();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void djBIcL() {
        ((uZO) sSMYrx()).DbNXlk.setText(C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(C55688xof.Application.shouldCenterSingleButton, C56423yEv.EZpvd(C56390yDp.OLrzqt("termRsi", C33070mpX.AYXKKw(C55688xof.Application.OTwTPd)))), new java.lang.String[]{C33070mpX.AYXKKw(C55688xof.Application.OTwTPd)}, 0, null, false, new Function1() { // from class: o.wdX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC53071wea.copydefault(this.copydefault, (java.util.List) obj);
            }
        }, 14, null));
        android.widget.ImageView imageView = ((uZO) sSMYrx()).isConnected;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.EZpvd(imageView, C43454rpb.copydefault("images/trading_bot/android/trade_rsi_kline_futures_grid.png", this, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : C52761wXj.TaskDescription.DuR, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : new Function0() { // from class: o.web
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC53071wea.OLrzqt(this.AEQbTJ);
            }
        }, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
    }

    public static final Unit copydefault(ActivityC53071wea activityC53071wea, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(activityC53071wea, C52761wXj.LoaderManager.ODXsMY));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(ActivityC53071wea activityC53071wea) {
        android.widget.TextView textView = ((uZO) activityC53071wea.sSMYrx()).AkhnZx;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        android.widget.TextView textView2 = ((uZO) activityC53071wea.sSMYrx()).fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(0);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault() {
        C47988uAv.setInputLabel$default(((uZO) sSMYrx()).gEmmrt, C33070mpX.AYXKKw(C55688xof.Application.fromMediaItem), null, 2, null);
        C47988uAv.setInputLayoutState$default(((uZO) sSMYrx()).gEmmrt, InputLayoutState.GREY_UN_CLICKABLE, false, 2, null);
        C47988uAv c47988uAv = ((uZO) sSMYrx()).gEmmrt;
        java.lang.String timePeriod = ((ContractGridRsiPresenter) gHZMYf()).valueOf().getTimePeriod();
        if (timePeriod == null) {
            timePeriod = "";
        }
        C47988uAv.setInputContent$default(c47988uAv, timePeriod, false, false, 6, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void valueOf() {
        C53530wnI c53530wnI = ((uZO) sSMYrx()).AuCTel;
        c53530wnI.setTitleText(C33070mpX.AYXKKw(C55688xof.Application.getACTION_SYSTEM_FALLBACK_PICK_IMAGESannotations));
        java.util.List<TradeMenuItemBean> listKWHzl = ((ContractGridRsiPresenter) gHZMYf()).KWHzl();
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c53530wnI.setTypeMenu(listKWHzl, supportFragmentManager, new Function1() { // from class: o.wek
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC53071wea.EZpvd(this.AEQbTJ, (TradeMenuItemBean) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(ActivityC53071wea activityC53071wea, TradeMenuItemBean tradeMenuItemBean) {
        Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
        java.lang.Object data = tradeMenuItemBean.getData();
        Intrinsics.copydefault(data, "");
        java.lang.String mode = ((TriggerCond) data).getMode();
        ((ContractGridRsiPresenter) activityC53071wea.gHZMYf()).valueOf().setTriggerCond(mode);
        pUU.KWHzl(activityC53071wea.getTAG(), "triggerCond: " + mode);
        ((ContractGridRsiPresenter) activityC53071wea.gHZMYf()).AhwBna();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gEmmrt() {
        ((uZO) sSMYrx()).values.setMaxDecimal(0);
        C47988uAv.setInputContent$default(((uZO) sSMYrx()).values, ((ContractGridRsiPresenter) gHZMYf()).valueOf().getOversoldThold(), false, false, 6, null);
        ((uZO) sSMYrx()).values.setOnTextChangeCallback(new Function2() { // from class: o.wdY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC53071wea.EZpvd(this.KWHzl, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(ActivityC53071wea activityC53071wea, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        pUU.KWHzl(activityC53071wea.getTAG(), "oversoldThreshold: " + str);
        ((ContractGridRsiPresenter) activityC53071wea.gHZMYf()).valueOf().setOversoldThold(str);
        if (activityC53071wea.EZpvd()) {
            ((ContractGridRsiPresenter) activityC53071wea.gHZMYf()).AhwBna();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AhwBna() {
        C53530wnI c53530wnI = ((uZO) sSMYrx()).fJNWhG;
        c53530wnI.setTitleText(C33070mpX.AYXKKw(C55688xof.Application.heceqZ));
        java.util.List<TradeMenuItemBean> listCopydefault = ((ContractGridRsiPresenter) gHZMYf()).copydefault();
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c53530wnI.setTypeMenu(listCopydefault, supportFragmentManager, new Function1() { // from class: o.weg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC53071wea.OLrzqt(this.OLrzqt, (TradeMenuItemBean) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(ActivityC53071wea activityC53071wea, TradeMenuItemBean tradeMenuItemBean) {
        Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
        java.lang.Object data = tradeMenuItemBean.getData();
        Intrinsics.copydefault(data, "");
        java.lang.String frame = ((TimeFrame) data).getFrame();
        ((ContractGridRsiPresenter) activityC53071wea.gHZMYf()).valueOf().setTimeframe(frame);
        pUU.KWHzl(activityC53071wea.getTAG(), "timeframe: " + frame);
        ((ContractGridRsiPresenter) activityC53071wea.gHZMYf()).AhwBna();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OLrzqt() {
        ((uZO) sSMYrx()).KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.wef
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC53071wea.copydefault(this.AEQbTJ, view);
            }
        });
        ((uZO) sSMYrx()).EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.wec
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC53071wea.djBIcL(this.copydefault, view);
            }
        });
        ((uZO) sSMYrx()).valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.wee
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC53071wea.KWHzl(this.KWHzl, view);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(ActivityC53071wea activityC53071wea, android.view.View view) {
        if (activityC53071wea.AEQbTJ()) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("trigger_sign", ((ContractGridRsiPresenter) activityC53071wea.gHZMYf()).valueOf());
            Unit unit = Unit.INSTANCE;
            activityC53071wea.setResult(-1, intent);
            activityC53071wea.finish();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void djBIcL(ActivityC53071wea activityC53071wea, android.view.View view) {
        ((ContractGridRsiPresenter) activityC53071wea.gHZMYf()).OLrzqt(!((ContractGridRsiPresenter) activityC53071wea.gHZMYf()).OLrzqt());
        ((uZO) activityC53071wea.sSMYrx()).DbNXlk.setMaxLines(((ContractGridRsiPresenter) activityC53071wea.gHZMYf()).OLrzqt() ? Integer.MAX_VALUE : 2);
        ((uZO) activityC53071wea.sSMYrx()).EZpvd.setText(C33070mpX.AYXKKw(((ContractGridRsiPresenter) activityC53071wea.gHZMYf()).OLrzqt() ? C55688xof.Application.getNavigationItemCount : C55688xof.Application.getDisplayOptions));
    }

    public static final void KWHzl(ActivityC53071wea activityC53071wea, android.view.View view) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityC53071wea);
        viewOnClickListenerC54939xaY.EZpvd(activityC53071wea.getString(C55688xof.Application.DNMMPQ));
        java.lang.String string = activityC53071wea.getString(C55688xof.Application.QWSkGZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.wed
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                ActivityC53071wea.AEQbTJ(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final boolean AEQbTJ() {
        return EZpvd();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AkhnZx() {
        ((ContractGridRsiPresenter) gHZMYf()).EZpvd().observe(this, new StateListAnimator(new Function1() { // from class: o.wdZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC53071wea.EZpvd(this.copydefault, (RsiTrigger) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(ActivityC53071wea activityC53071wea, RsiTrigger rsiTrigger) {
        Intrinsics.checkNotNullParameter(rsiTrigger, "");
        android.widget.TextView textView = ((uZO) activityC53071wea.sSMYrx()).ejfBZ;
        xMR xmr = xMR.copydefault;
        java.lang.String triggerNum = rsiTrigger.getTriggerNum();
        textView.setText(xmr.copydefault(triggerNum != null ? triggerNum : ""));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final boolean EZpvd() {
        java.lang.String strAkhnZx = ((uZO) sSMYrx()).values.AkhnZx();
        if (C33129mqd.AEQbTJ(strAkhnZx, 100)) {
            ((uZO) sSMYrx()).values.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.OJuSTm, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.hCLrkq)), C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault("100")), C56390yDp.OLrzqt("unit", ""))));
            return false;
        }
        if (C33129mqd.gEmmrt(strAkhnZx, 1)) {
            ((uZO) sSMYrx()).values.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.UlJrfe, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.hCLrkq)), C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault("1")), C56390yDp.OLrzqt("unit", ""))));
            return false;
        }
        ((uZO) sSMYrx()).values.copydefault();
        return true;
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
