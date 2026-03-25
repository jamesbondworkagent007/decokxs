package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.Observer;
import com.okinc.tradeuilib.widget.oktinputlayout.core.InputLayoutState;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.RsiTrigger;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import com.okinc.unify_trade.bot.config.TimeFrame;
import com.okinc.unify_trade.bot.config.TriggerCond;
import com.okinc.unify_trade.bot.contract_grid.viewModel.ContractGridRsiPresenter;
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

/* JADX INFO: loaded from: classes16.dex */
public final class vFP extends AbstractActivityC48163uHh<uTC, ContractGridRsiPresenter> {
    public static final Application Companion = new Application(null);

    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.DcMfJKDCKfqP;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vFP.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull AdvancedTriggerSign advancedTriggerSign) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(advancedTriggerSign, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) vFP.class);
            intent.putExtra("bot_inst_id", str);
            android.content.Intent intentPutExtra = intent.putExtra("trigger_sign", advancedTriggerSign);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            return intentPutExtra;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AEQbTJ();
        fetchVPNInfo();
        valueOf();
        isConnected();
        ((ContractGridRsiPresenter) gHZMYf()).AhwBna();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AEQbTJ() {
        ((ContractGridRsiPresenter) gHZMYf()).KWHzl(getIntent().getExtras());
    }

    private final void fetchVPNInfo() {
        djBIcL();
        copydefault();
        AkhnZx();
        gEmmrt();
        AhwBna();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void djBIcL() {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.OTwTPd);
        ((uTC) sSMYrx()).isConnected.setText(C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(C55688xof.Application.getMediaId, C56423yEv.EZpvd(C56390yDp.OLrzqt("termRsi", strAYXKKw))), new java.lang.String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.vFU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vFP.KWHzl(this.copydefault, (java.util.List) obj);
            }
        }, 14, null));
        AppCompatImageView appCompatImageView = ((uTC) sSMYrx()).fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        C33054mpH.EZpvd(appCompatImageView, C43454rpb.copydefault("images/trading_bot/android/trade_rsi_kline_futures_grid.png", this, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : C52761wXj.TaskDescription.DuR, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : new Function0() { // from class: o.vFQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vFP.OLrzqt(this.OLrzqt);
            }
        }, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
    }

    public static final Unit KWHzl(vFP vfp, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(C35334ntP.KWHzl(vfp), C52761wXj.LoaderManager.ODXsMY));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(vFP vfp) {
        AppCompatTextView appCompatTextView = ((uTC) vfp.sSMYrx()).AYXKKw;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(0);
        AppCompatTextView appCompatTextView2 = ((uTC) vfp.sSMYrx()).gEmmrt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        appCompatTextView2.setVisibility(0);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault() {
        C47988uAv c47988uAv = ((uTC) sSMYrx()).AhwBna;
        C47988uAv.setInputLabel$default(c47988uAv, C33070mpX.AYXKKw(C55688xof.Application.fromMediaItem), null, 2, null);
        C47988uAv.setInputLayoutState$default(c47988uAv, InputLayoutState.GREY_UN_CLICKABLE, false, 2, null);
        java.lang.String timePeriod = ((ContractGridRsiPresenter) gHZMYf()).valueOf().getTimePeriod();
        if (timePeriod == null) {
            timePeriod = "";
        }
        C47988uAv.setInputContent$default(c47988uAv, timePeriod, false, false, 6, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AkhnZx() {
        C53530wnI c53530wnI = ((uTC) sSMYrx()).AkhnZx;
        c53530wnI.setTitleText(C33070mpX.AYXKKw(C55688xof.Application.getACTION_SYSTEM_FALLBACK_PICK_IMAGESannotations));
        java.util.List<TradeMenuItemBean> listKWHzl = ((ContractGridRsiPresenter) gHZMYf()).KWHzl();
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c53530wnI.setTypeMenu(listKWHzl, supportFragmentManager, new Function1() { // from class: o.vFR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vFP.copydefault(this.EZpvd, (TradeMenuItemBean) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(vFP vfp, TradeMenuItemBean tradeMenuItemBean) {
        Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
        java.lang.Object data = tradeMenuItemBean.getData();
        Intrinsics.copydefault(data, "");
        java.lang.String mode = ((TriggerCond) data).getMode();
        ((ContractGridRsiPresenter) vfp.gHZMYf()).valueOf().setTriggerCond(mode);
        pUU.KWHzl(vfp.getTAG(), "triggerCond: " + mode);
        ((ContractGridRsiPresenter) vfp.gHZMYf()).AhwBna();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gEmmrt() {
        ((uTC) sSMYrx()).djBIcL.setMaxDecimal(0);
        C47988uAv.setInputContent$default(((uTC) sSMYrx()).djBIcL, ((ContractGridRsiPresenter) gHZMYf()).valueOf().getOversoldThold(), false, false, 6, null);
        ((uTC) sSMYrx()).djBIcL.setOnTextChangeCallback(new Function2() { // from class: o.vFX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vFP.KWHzl(this.copydefault, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(vFP vfp, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        pUU.KWHzl(vfp.getTAG(), "oversoldThreshold: " + str);
        ((ContractGridRsiPresenter) vfp.gHZMYf()).valueOf().setOversoldThold(str);
        if (vfp.EZpvd()) {
            ((ContractGridRsiPresenter) vfp.gHZMYf()).AhwBna();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AhwBna() {
        C53530wnI c53530wnI = ((uTC) sSMYrx()).DbNXlk;
        c53530wnI.setTitleText(C33070mpX.AYXKKw(C55688xof.Application.heceqZ));
        java.util.List<TradeMenuItemBean> listCopydefault = ((ContractGridRsiPresenter) gHZMYf()).copydefault();
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c53530wnI.setTypeMenu(listCopydefault, supportFragmentManager, new Function1() { // from class: o.vFM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vFP.EZpvd(this.OLrzqt, (TradeMenuItemBean) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(vFP vfp, TradeMenuItemBean tradeMenuItemBean) {
        Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
        java.lang.Object data = tradeMenuItemBean.getData();
        Intrinsics.copydefault(data, "");
        java.lang.String frame = ((TimeFrame) data).getFrame();
        ((ContractGridRsiPresenter) vfp.gHZMYf()).valueOf().setTimeframe(frame);
        pUU.KWHzl(vfp.getTAG(), "timeframe: " + frame);
        ((ContractGridRsiPresenter) vfp.gHZMYf()).AhwBna();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void valueOf() {
        ((uTC) sSMYrx()).EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.vFV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vFP.AYXKKw(this.AEQbTJ, view);
            }
        });
        ((uTC) sSMYrx()).copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.vFW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vFP.OLrzqt(this.AEQbTJ, view);
            }
        });
        ((uTC) sSMYrx()).fIwbmz.setOnClickListener(new View.OnClickListener() { // from class: o.vFY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vFP.EZpvd(this.AEQbTJ, view);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AYXKKw(vFP vfp, android.view.View view) {
        if (vfp.KWHzl()) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("trigger_sign", ((ContractGridRsiPresenter) vfp.gHZMYf()).valueOf());
            vfp.setResult(-1, intent);
            vfp.OLrzqt();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(vFP vfp, android.view.View view) {
        ((ContractGridRsiPresenter) vfp.gHZMYf()).OLrzqt(!((ContractGridRsiPresenter) vfp.gHZMYf()).OLrzqt());
        ((uTC) vfp.sSMYrx()).isConnected.setMaxLines(((ContractGridRsiPresenter) vfp.gHZMYf()).OLrzqt() ? Integer.MAX_VALUE : 2);
        ((uTC) vfp.sSMYrx()).copydefault.setText(C33070mpX.AYXKKw(((ContractGridRsiPresenter) vfp.gHZMYf()).OLrzqt() ? C55688xof.Application.getNavigationItemCount : C55688xof.Application.getDisplayOptions));
    }

    public static final void EZpvd(vFP vfp, android.view.View view) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(vfp);
        viewOnClickListenerC54939xaY.EZpvd(vfp.getString(C55688xof.Application.DNMMPQ));
        java.lang.String string = vfp.getString(C55688xof.Application.QWSkGZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.vFT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                vFP.KWHzl(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Possible override for method o.xKr.KWHzl()Ljava/lang/Class; */
    public final boolean KWHzl() {
        return EZpvd();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void isConnected() {
        ((ContractGridRsiPresenter) gHZMYf()).EZpvd().observe(this, new TaskDescription(new Function1() { // from class: o.vFS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vFP.copydefault(this.copydefault, (RsiTrigger) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(vFP vfp, RsiTrigger rsiTrigger) {
        Intrinsics.checkNotNullParameter(rsiTrigger, "");
        AppCompatTextView appCompatTextView = ((uTC) vfp.sSMYrx()).values;
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
    private final boolean EZpvd() {
        java.lang.String strAkhnZx = ((uTC) sSMYrx()).djBIcL.AkhnZx();
        if (C33129mqd.AEQbTJ(strAkhnZx, 100)) {
            ((uTC) sSMYrx()).djBIcL.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.OJuSTm, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.hCLrkq)), C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault("100")), C56390yDp.OLrzqt("unit", ""))));
            return false;
        }
        if (C33129mqd.gEmmrt(strAkhnZx, 1)) {
            ((uTC) sSMYrx()).djBIcL.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.UlJrfe, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.hCLrkq)), C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault("1")), C56390yDp.OLrzqt("unit", ""))));
            return false;
        }
        ((uTC) sSMYrx()).djBIcL.copydefault();
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OLrzqt() {
        C33054mpH.OLrzqt(C35334ntP.KWHzl(this), ((uTC) sSMYrx()).getRoot());
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
