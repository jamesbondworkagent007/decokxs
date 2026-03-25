package o;

import android.view.KeyEvent;
import android.view.View;
import android.widget.CompoundButton;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.view.ViewGroupKt;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.GridStopTriggerType;
import com.okinc.unify_trade.bot.config.TimeFrame;
import com.okinc.unify_trade.bot.config.TriggerCond;
import com.okinc.unify_trade.bot.contract_grid.viewModel.ContractGridTriggerPresenter;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;
import o.vFP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class vFA extends AbstractActivityC48163uHh<uTF, ContractGridTriggerPresenter> {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final ActivityResultLauncher<android.content.Intent> AEQbTJ = DbNXlk();
    public final boolean OLrzqt = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.siEkQe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ContractGridTriggerPresenter EZpvd(vFA vfa) {
        return (ContractGridTriggerPresenter) vfa.gHZMYf();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ uTF copydefault(vFA vfa) {
        return (uTF) vfa.sSMYrx();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vFA.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final android.content.Intent copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull ContractGridReq contractGridReq) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(contractGridReq, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) vFA.class);
            intent.putExtra("bot_condition_type", str);
            android.content.Intent intentPutExtra = intent.putExtra("bot_grid_req", contractGridReq);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            return intentPutExtra;
        }
    }

    private final boolean values() {
        return C48291uMa.Companion.AEQbTJ().OLrzqt();
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AuCTel();
        fIwbmz();
        fARcdN();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C54782xVc.AEQbTJ.AhwBna(((ContractGridTriggerPresenter) gHZMYf()).KWHzl().AhwBna());
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        C54782xVc.AEQbTJ.AYXKKw();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AuCTel() {
        ((ContractGridTriggerPresenter) gHZMYf()).copydefault(getIntent().getExtras());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fIwbmz() {
        java.lang.String strAEQbTJ = ((ContractGridTriggerPresenter) gHZMYf()).AEQbTJ();
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) TtmlNode.START)) {
            EZpvd();
        } else if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) "stop")) {
            djBIcL();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fARcdN() {
        android.widget.LinearLayout linearLayout = ((uTF) sSMYrx()).djBIcL;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        for (KeyEvent.Callback callback : ViewGroupKt.getChildren(linearLayout)) {
            InterfaceC50054vAe interfaceC50054vAe = callback instanceof InterfaceC50054vAe ? (InterfaceC50054vAe) callback : null;
            if (interfaceC50054vAe != null) {
                interfaceC50054vAe.AEQbTJ(new Function1() { // from class: o.vFL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return vFA.KWHzl(this.AEQbTJ, (android.view.View) obj);
                    }
                });
            }
        }
        ((uTF) sSMYrx()).AhwBna.setClickAction(new View.OnClickListener() { // from class: o.vFO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vFA.copydefault(this.copydefault, view);
            }
        });
        ((uTF) sSMYrx()).AhwBna.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vFN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                vFA.OLrzqt(this.KWHzl, compoundButton, z);
            }
        });
        C52794wYp c52794wYp = ((uTF) sSMYrx()).EZpvd;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(final vFA vfa, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        java.lang.Object tag = view.getTag();
        final java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        if (str != null) {
            vfa.copydefault(str);
            if (Intrinsics.EZpvd((java.lang.Object) ((ContractGridTriggerPresenter) vfa.gHZMYf()).AEQbTJ(), (java.lang.Object) TtmlNode.START)) {
                ((ContractGridTriggerPresenter) vfa.gHZMYf()).EZpvd(str);
                vfa.fetchVPNInfo();
            } else {
                ((ContractGridTriggerPresenter) vfa.gHZMYf()).OLrzqt(str);
                vfa.AkhnZx();
                vfa.copydefault();
            }
            C32866mlf.onEvent$default("BotPlaceOrder_AdvancedSetting_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.vFJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return vFA.OLrzqt(this.EZpvd, str, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(vFA vfa, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "contract_grid", false, 4, null);
        EventParamsList.put$default(eventParamsList, ((ContractGridTriggerPresenter) vfa.gHZMYf()).AEQbTJ(), str, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(vFA vfa, android.view.View view) {
        java.lang.String strAYXKKw;
        if (Intrinsics.EZpvd((java.lang.Object) ((ContractGridTriggerPresenter) vfa.gHZMYf()).AEQbTJ(), (java.lang.Object) TtmlNode.START)) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.onMenuItemSelected);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsPickMultipleVisualMedia);
        }
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(strAYXKKw);
        java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C55688xof.Application.QWSkGZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.vFB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                vFA.OLrzqt(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(vFA vfa, android.widget.CompoundButton compoundButton, boolean z) {
        if (Intrinsics.EZpvd((java.lang.Object) ((ContractGridTriggerPresenter) vfa.gHZMYf()).AEQbTJ(), (java.lang.Object) TtmlNode.START)) {
            ((ContractGridTriggerPresenter) vfa.gHZMYf()).copydefault().setBasePos(java.lang.Boolean.valueOf(z));
            pUU.KWHzl(vfa.getTAG(), "build when start change to " + z);
            return;
        }
        java.lang.String str = z ? "1" : "2";
        ((ContractGridTriggerPresenter) vfa.gHZMYf()).AhwBna().setStopType(str);
        pUU.KWHzl(vfa.getTAG(), "sell when stop change to " + str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd() {
        ((uTF) sSMYrx()).OLrzqt.setTitle(C33070mpX.AYXKKw(C55688xof.Application.sendMediaButton));
        OLrzqt();
        KWHzl();
        AEQbTJ();
        fetchVPNInfo();
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ vFA EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, vFA vfa) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = vfa;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (vFA.copydefault(this.EZpvd).AEQbTJ.OLrzqt() && vFA.copydefault(this.EZpvd).AYXKKw.OLrzqt()) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("bot_grid_req", vFA.EZpvd(this.EZpvd).copydefault());
                    intent.putExtra("type", vFA.EZpvd(this.EZpvd).AEQbTJ());
                    this.EZpvd.setResult(-1, intent);
                    this.EZpvd.finish();
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void djBIcL() {
        ((uTF) sSMYrx()).OLrzqt.setTitle(C33070mpX.AYXKKw(C55688xof.Application.setShuffleModeEnabledRemoved));
        isConnected();
        gEmmrt();
        AhwBna();
        valueOf();
        copydefault();
        AkhnZx();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX DEBUG: Possible override for method o.xKr.OLrzqt()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt() {
        ((uTF) sSMYrx()).KWHzl.setTag(GridStartTriggerType.INSTANT.getMode());
        ((uTF) sSMYrx()).AEQbTJ.setTag(GridStartTriggerType.PRICE.getMode());
        ((uTF) sSMYrx()).AYXKKw.setTag(GridStartTriggerType.RSI_14.getMode());
        ((uTF) sSMYrx()).valueOf.setTag(GridStartTriggerType.TRADINGVIEW.getMode());
        copydefault(((ContractGridTriggerPresenter) gHZMYf()).EZpvd().getIndicator());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Presenter */
    /* JADX DEBUG: Possible override for method o.xKr.KWHzl()Ljava/lang/Class; */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl() {
        C53567wnt c53567wnt = ((uTF) sSMYrx()).AEQbTJ;
        final java.lang.String strFetchVPNInfo = ((ContractGridTriggerPresenter) gHZMYf()).KWHzl().fetchVPNInfo();
        C53567wnt.firstInputConfig$default(c53567wnt, C33070mpX.AYXKKw(C55688xof.Application.ActionBar), strFetchVPNInfo, "", java.lang.Integer.valueOf(((ContractGridTriggerPresenter) gHZMYf()).KWHzl().isConnected().getDigit()), false, 16, null);
        c53567wnt.AEQbTJ(new yHO() { // from class: o.vFI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return vFA.AEQbTJ(this.EZpvd, strFetchVPNInfo, (C47988uAv) obj, (java.lang.String) obj2, ((java.lang.Boolean) obj3).booleanValue());
            }
        });
        xMR xmr = xMR.copydefault;
        java.lang.String strCopydefault = xmr.copydefault("0");
        java.lang.String strCopydefault2 = xmr.copydefault("3600");
        C53567wnt.secondInputConfig$default(c53567wnt, C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsGetContent), C33070mpX.AYXKKw(C55688xof.Application.ActionBarDrawerToggle), strCopydefault + "-" + strCopydefault2, 0, false, 16, null);
        c53567wnt.EZpvd(new yHO() { // from class: o.vFK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return vFA.OLrzqt(this.copydefault, (C47988uAv) obj, (java.lang.String) obj2, ((java.lang.Boolean) obj3).booleanValue());
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object AEQbTJ(vFA vfa, java.lang.String str, C47988uAv c47988uAv, java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        pUU.EZpvd(vfa.getTAG(), "startTriggerPrice: " + str2 + " " + str);
        ((ContractGridTriggerPresenter) vfa.gHZMYf()).EZpvd().setTriggerPx(vfa.KWHzl(str2));
        if (c47988uAv.hasFocus()) {
            xVK xvk = xVK.EZpvd;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String[] strArrEZpvd = xvk.EZpvd(str2, ((ContractGridTriggerPresenter) vfa.gHZMYf()).KWHzl().gEmmrt(), ((ContractGridTriggerPresenter) vfa.gHZMYf()).KWHzl().djBIcL());
            if (strArrEZpvd != null && strArrEZpvd.length > 1) {
                return strArrEZpvd;
            }
        }
        return C56038xvK.AEQbTJ(((ContractGridTriggerPresenter) vfa.gHZMYf()).copydefault());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object OLrzqt(vFA vfa, C47988uAv c47988uAv, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        pUU.EZpvd(vfa.getTAG(), "startDelay: " + str);
        ((ContractGridTriggerPresenter) vfa.gHZMYf()).EZpvd().setDelaySeconds(str);
        return C56042xvO.AEQbTJ(((ContractGridTriggerPresenter) vfa.gHZMYf()).EZpvd().getIndicator(), str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ() {
        final C53570wnw c53570wnw = ((uTF) sSMYrx()).AYXKKw;
        Intrinsics.copydefault(c53570wnw);
        c53570wnw.setVisibility(values() ^ true ? 0 : 8);
        c53570wnw.setRsiEditListener(new View.OnClickListener() { // from class: o.vFF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vFA.EZpvd(this.OLrzqt, c53570wnw, view);
            }
        });
        xMR xmr = xMR.copydefault;
        java.lang.String strCopydefault = xmr.copydefault("0");
        java.lang.String strCopydefault2 = xmr.copydefault("3600");
        C53570wnw.firstInputConfig$default(c53570wnw, C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsGetContent), C33070mpX.AYXKKw(C55688xof.Application.ActionBarDrawerToggle), strCopydefault + "-" + strCopydefault2, 0, false, 16, null);
        c53570wnw.KWHzl(new Function2() { // from class: o.vFE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vFA.AEQbTJ(this.OLrzqt, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(vFA vfa, C53570wnw c53570wnw, android.view.View view) {
        vfa.OLrzqt(TtmlNode.START);
        vFP.Application application = vFP.Companion;
        android.content.Context context = c53570wnw.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        vfa.AEQbTJ.launch(application.OLrzqt(context, ((ContractGridTriggerPresenter) vfa.gHZMYf()).KWHzl().gEmmrt(), ((ContractGridTriggerPresenter) vfa.gHZMYf()).EZpvd()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object AEQbTJ(vFA vfa, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        pUU.EZpvd(vfa.getTAG(), "startDelay: " + str);
        ((ContractGridTriggerPresenter) vfa.gHZMYf()).EZpvd().setDelaySeconds(str);
        return C56042xvO.AEQbTJ(((ContractGridTriggerPresenter) vfa.gHZMYf()).EZpvd().getIndicator(), str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fetchVPNInfo() {
        AdvancedTriggerSign advancedTriggerSignEZpvd = ((ContractGridTriggerPresenter) gHZMYf()).EZpvd();
        uTF utf = (uTF) sSMYrx();
        java.lang.String indicator = advancedTriggerSignEZpvd.getIndicator();
        if (Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) GridStartTriggerType.INSTANT.getMode())) {
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) GridStartTriggerType.PRICE.getMode())) {
            utf.AEQbTJ.setFirstContent(EZpvd(advancedTriggerSignEZpvd.getTriggerPx()));
            utf.AEQbTJ.setSecondContent(advancedTriggerSignEZpvd.getDelaySeconds());
            java.lang.String triggerPx = advancedTriggerSignEZpvd.getTriggerPx();
            if (triggerPx == null || triggerPx.length() == 0) {
                utf.AEQbTJ.copydefault();
                return;
            }
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) GridStartTriggerType.RSI_14.getMode())) {
            C53570wnw c53570wnw = utf.AYXKKw;
            int i = C55688xof.Application.PipHintTrackerKttrackPipAnimationHintViewflow1ExternalSyntheticLambda0;
            java.lang.String timePeriod = advancedTriggerSignEZpvd.getTimePeriod();
            if (timePeriod == null) {
                timePeriod = "";
            }
            java.lang.String strCopydefault = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt(MTPushConstants.NotificationTime.KEY_DAYS, timePeriod)));
            java.lang.String strKWHzl = TriggerCond.Companion.KWHzl(advancedTriggerSignEZpvd.getTriggerCond());
            xMR xmr = xMR.copydefault;
            java.lang.String oversoldThold = advancedTriggerSignEZpvd.getOversoldThold();
            if (oversoldThold == null) {
                oversoldThold = "";
            }
            java.lang.String strCopydefault2 = xmr.copydefault(oversoldThold);
            TimeFrame.Application application = TimeFrame.Companion;
            java.lang.String timeframe = advancedTriggerSignEZpvd.getTimeframe();
            c53570wnw.setRsiContent(strCopydefault, strKWHzl, strCopydefault2, application.copydefault(timeframe != null ? timeframe : ""));
            utf.AYXKKw.setFirstContent(advancedTriggerSignEZpvd.getDelaySeconds());
            return;
        }
        Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) GridStartTriggerType.TRADINGVIEW.getMode());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void gEmmrt() {
        ((uTF) sSMYrx()).KWHzl.setTitle(C33070mpX.AYXKKw(GridStopTriggerType.MANUAL_STOP.getDesc()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void isConnected() {
        ((uTF) sSMYrx()).KWHzl.setTag(GridStopTriggerType.MANUAL_STOP.getMode());
        ((uTF) sSMYrx()).AEQbTJ.setTag(GridStopTriggerType.PRICE.getMode());
        ((uTF) sSMYrx()).AYXKKw.setTag(GridStopTriggerType.RSI_14.getMode());
        ((uTF) sSMYrx()).valueOf.setTag(GridStopTriggerType.TRADINGVIEW.getMode());
        copydefault(((ContractGridTriggerPresenter) gHZMYf()).AhwBna().getIndicator());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AhwBna() {
        C53567wnt c53567wnt = ((uTF) sSMYrx()).AEQbTJ;
        final java.lang.String strFetchVPNInfo = ((ContractGridTriggerPresenter) gHZMYf()).KWHzl().fetchVPNInfo();
        C53567wnt.firstInputConfig$default(c53567wnt, C33070mpX.AYXKKw(C55688xof.Application.ActionBar), strFetchVPNInfo, "", java.lang.Integer.valueOf(((ContractGridTriggerPresenter) gHZMYf()).KWHzl().isConnected().getDigit()), false, 16, null);
        c53567wnt.AEQbTJ(new yHO() { // from class: o.vFy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return vFA.EZpvd(this.AEQbTJ, strFetchVPNInfo, (C47988uAv) obj, (java.lang.String) obj2, ((java.lang.Boolean) obj3).booleanValue());
            }
        });
        xMR xmr = xMR.copydefault;
        java.lang.String strCopydefault = xmr.copydefault("0");
        java.lang.String strCopydefault2 = xmr.copydefault("3600");
        C53567wnt.secondInputConfig$default(c53567wnt, C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsGetMultipleContentsCompanion), C33070mpX.AYXKKw(C55688xof.Application.ActionBarDrawerToggle), strCopydefault + "-" + strCopydefault2, 0, false, 16, null);
        c53567wnt.EZpvd(new yHO() { // from class: o.vFw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return vFA.copydefault(this.KWHzl, (C47988uAv) obj, (java.lang.String) obj2, ((java.lang.Boolean) obj3).booleanValue());
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object EZpvd(vFA vfa, java.lang.String str, C47988uAv c47988uAv, java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        pUU.EZpvd(vfa.getTAG(), "stopTriggerPrice: " + str2 + " " + str);
        ((ContractGridTriggerPresenter) vfa.gHZMYf()).AhwBna().setTriggerPx(vfa.KWHzl(str2));
        if (c47988uAv.hasFocus()) {
            xVK xvk = xVK.EZpvd;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String[] strArrEZpvd = xvk.EZpvd(str2, ((ContractGridTriggerPresenter) vfa.gHZMYf()).KWHzl().gEmmrt(), ((ContractGridTriggerPresenter) vfa.gHZMYf()).KWHzl().djBIcL());
            if (strArrEZpvd != null && strArrEZpvd.length > 1) {
                return strArrEZpvd;
            }
        }
        return C56038xvK.OLrzqt(((ContractGridTriggerPresenter) vfa.gHZMYf()).copydefault());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object copydefault(vFA vfa, C47988uAv c47988uAv, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        pUU.EZpvd(vfa.getTAG(), "stopDelay: " + str);
        ((ContractGridTriggerPresenter) vfa.gHZMYf()).AhwBna().setDelaySeconds(str);
        return C56042xvO.AEQbTJ(((ContractGridTriggerPresenter) vfa.gHZMYf()).AhwBna().getIndicator(), str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String KWHzl(java.lang.String str) {
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return null;
        }
        return C56033xvF.KWHzl(str, ((ContractGridTriggerPresenter) gHZMYf()).KWHzl().AhwBna());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void valueOf() {
        final C53570wnw c53570wnw = ((uTF) sSMYrx()).AYXKKw;
        Intrinsics.copydefault(c53570wnw);
        c53570wnw.setVisibility(values() ^ true ? 0 : 8);
        c53570wnw.setRsiEditListener(new View.OnClickListener() { // from class: o.vFH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vFA.AEQbTJ(this.OLrzqt, c53570wnw, view);
            }
        });
        xMR xmr = xMR.copydefault;
        java.lang.String strCopydefault = xmr.copydefault("0");
        java.lang.String strCopydefault2 = xmr.copydefault("3600");
        C53570wnw.firstInputConfig$default(c53570wnw, C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsGetMultipleContentsCompanion), C33070mpX.AYXKKw(C55688xof.Application.ActionBarDrawerToggle), strCopydefault + "-" + strCopydefault2, 0, false, 16, null);
        c53570wnw.KWHzl(new Function2() { // from class: o.vFG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vFA.OLrzqt(this.copydefault, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(vFA vfa, C53570wnw c53570wnw, android.view.View view) {
        vfa.OLrzqt("stop");
        vFP.Application application = vFP.Companion;
        android.content.Context context = c53570wnw.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        vfa.AEQbTJ.launch(application.OLrzqt(context, ((ContractGridTriggerPresenter) vfa.gHZMYf()).KWHzl().gEmmrt(), ((ContractGridTriggerPresenter) vfa.gHZMYf()).AhwBna()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object OLrzqt(vFA vfa, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        pUU.EZpvd(vfa.getTAG(), "stopDelay: " + str);
        ((ContractGridTriggerPresenter) vfa.gHZMYf()).AhwBna().setDelaySeconds(str);
        return C56042xvO.AEQbTJ(((ContractGridTriggerPresenter) vfa.gHZMYf()).AhwBna().getIndicator(), str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault() {
        uTF utf = (uTF) sSMYrx();
        kotlin.Pair<java.lang.Boolean, java.lang.Boolean> pairOLrzqt = ((ContractGridTriggerPresenter) gHZMYf()).OLrzqt();
        boolean zBooleanValue = pairOLrzqt.component1().booleanValue();
        boolean zBooleanValue2 = pairOLrzqt.component2().booleanValue();
        android.view.View view = utf.copydefault;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(zBooleanValue ? 0 : 8);
        C53425wlJ c53425wlJ = utf.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c53425wlJ, "");
        c53425wlJ.setVisibility(zBooleanValue ? 0 : 8);
        utf.AhwBna.setEnable(zBooleanValue2);
        utf.AhwBna.setTitle(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsOpenMultipleDocuments));
    }

    private final void OLrzqt(final java.lang.String str) {
        C32866mlf.onEvent$default("BotPlaceOrder_RSISheet_RSICondition_Click", (TrackChannel[]) null, new Function1() { // from class: o.vFD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vFA.KWHzl(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("bot_type", "contract_grid", true);
        eventParamsList.put("condition_type", str, true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AkhnZx() {
        AdvancedTriggerSign advancedTriggerSignAhwBna = ((ContractGridTriggerPresenter) gHZMYf()).AhwBna();
        uTF utf = (uTF) sSMYrx();
        java.lang.String indicator = advancedTriggerSignAhwBna.getIndicator();
        if (!Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) GridStopTriggerType.MANUAL_STOP.getMode())) {
            if (Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) GridStopTriggerType.PRICE.getMode())) {
                utf.AEQbTJ.setFirstContent(EZpvd(advancedTriggerSignAhwBna.getTriggerPx()));
                utf.AEQbTJ.setSecondContent(advancedTriggerSignAhwBna.getDelaySeconds());
                java.lang.String triggerPx = advancedTriggerSignAhwBna.getTriggerPx();
                if (triggerPx == null || triggerPx.length() == 0) {
                    utf.AEQbTJ.copydefault();
                }
            } else if (Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) GridStopTriggerType.RSI_14.getMode())) {
                C53570wnw c53570wnw = utf.AYXKKw;
                int i = C55688xof.Application.PipHintTrackerKttrackPipAnimationHintViewflow1ExternalSyntheticLambda0;
                java.lang.String timePeriod = advancedTriggerSignAhwBna.getTimePeriod();
                if (timePeriod == null) {
                    timePeriod = "";
                }
                java.lang.String strCopydefault = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt(MTPushConstants.NotificationTime.KEY_DAYS, timePeriod)));
                java.lang.String strKWHzl = TriggerCond.Companion.KWHzl(advancedTriggerSignAhwBna.getTriggerCond());
                xMR xmr = xMR.copydefault;
                java.lang.String oversoldThold = advancedTriggerSignAhwBna.getOversoldThold();
                if (oversoldThold == null) {
                    oversoldThold = "";
                }
                java.lang.String strCopydefault2 = xmr.copydefault(oversoldThold);
                TimeFrame.Application application = TimeFrame.Companion;
                java.lang.String timeframe = advancedTriggerSignAhwBna.getTimeframe();
                c53570wnw.setRsiContent(strCopydefault, strKWHzl, strCopydefault2, application.copydefault(timeframe != null ? timeframe : ""));
                utf.AYXKKw.setFirstContent(advancedTriggerSignAhwBna.getDelaySeconds());
            } else if (Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) GridStopTriggerType.TRADINGVIEW.getMode())) {
                ((ContractGridTriggerPresenter) gHZMYf()).AhwBna().setStopType("1");
            }
        }
        utf.AhwBna.setChecked(Intrinsics.EZpvd((java.lang.Object) advancedTriggerSignAhwBna.getStopType(), (java.lang.Object) "1"));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String EZpvd(java.lang.String str) {
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return null;
        }
        java.lang.String strOLrzqt = C56033xvF.OLrzqt(str, ((ContractGridTriggerPresenter) gHZMYf()).KWHzl().AhwBna());
        int digit = ((ContractGridTriggerPresenter) gHZMYf()).KWHzl().isConnected().getDigit();
        return C33129mqd.formatS$default(strOLrzqt, java.lang.Integer.valueOf(digit), null, RoundingMode.HALF_UP, 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(java.lang.String str) {
        android.widget.LinearLayout linearLayout = ((uTF) sSMYrx()).djBIcL;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        for (android.view.View view : ViewGroupKt.getChildren(linearLayout)) {
            InterfaceC50054vAe interfaceC50054vAe = view instanceof InterfaceC50054vAe ? (InterfaceC50054vAe) view : null;
            if (interfaceC50054vAe != null) {
                interfaceC50054vAe.setSelect(Intrinsics.EZpvd(view.getTag(), (java.lang.Object) str));
            }
        }
    }

    public final ActivityResultLauncher<android.content.Intent> DbNXlk() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.vFC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                vFA.KWHzl(this.KWHzl, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        return activityResultLauncherRegisterForActivityResult;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(vFA vfa, ActivityResult activityResult) {
        android.content.Intent data;
        android.os.Bundle extras;
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null || (extras = data.getExtras()) == null) {
            return;
        }
        ((ContractGridTriggerPresenter) vfa.gHZMYf()).copydefault((AdvancedTriggerSign) extras.getParcelable("trigger_sign"));
        if (Intrinsics.EZpvd((java.lang.Object) ((ContractGridTriggerPresenter) vfa.gHZMYf()).AEQbTJ(), (java.lang.Object) TtmlNode.START)) {
            vfa.fetchVPNInfo();
        } else {
            vfa.AkhnZx();
        }
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
