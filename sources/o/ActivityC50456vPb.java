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
import com.okinc.core.util.SPUtils;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.GridStopTriggerType;
import com.okinc.unify_trade.bot.config.TimeFrame;
import com.okinc.unify_trade.bot.config.TriggerCond;
import com.okinc.unify_trade.bot.grid.viewmodel.GridTriggerConditionPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC50475vPu;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vPb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC50456vPb extends AbstractActivityC48163uHh<uTF, GridTriggerConditionPresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final ActivityResultLauncher<android.content.Intent> AEQbTJ = AuCTel();
    public final boolean EZpvd = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.siEkQe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ GridTriggerConditionPresenter AEQbTJ(ActivityC50456vPb activityC50456vPb) {
        return (GridTriggerConditionPresenter) activityC50456vPb.gHZMYf();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ uTF OLrzqt(ActivityC50456vPb activityC50456vPb) {
        return (uTF) activityC50456vPb.sSMYrx();
    }

    /* JADX INFO: renamed from: o.vPb$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vPb.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull GridReq gridReq, StrategyConfigInfo strategyConfigInfo) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(gridReq, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC50456vPb.class);
            intent.putExtra("bot_condition_type", str);
            intent.putExtra("bot_grid_req", gridReq);
            android.content.Intent intentPutExtra = intent.putExtra("bot_config", strategyConfigInfo);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
            return intentPutExtra;
        }
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        copydefault();
        AkhnZx();
        OLrzqt();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C54782xVc.AEQbTJ.AhwBna(((GridTriggerConditionPresenter) gHZMYf()).valueOf().AhwBna());
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        C54782xVc.AEQbTJ.AYXKKw();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault() {
        ((GridTriggerConditionPresenter) gHZMYf()).KWHzl(getIntent().getExtras());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AkhnZx() {
        java.lang.String strCopydefault = ((GridTriggerConditionPresenter) gHZMYf()).copydefault();
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) TtmlNode.START)) {
            KWHzl();
        } else if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "stop")) {
            gEmmrt();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OLrzqt() {
        android.widget.LinearLayout linearLayout = ((uTF) sSMYrx()).djBIcL;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        for (KeyEvent.Callback callback : ViewGroupKt.getChildren(linearLayout)) {
            InterfaceC50054vAe interfaceC50054vAe = callback instanceof InterfaceC50054vAe ? (InterfaceC50054vAe) callback : null;
            if (interfaceC50054vAe != null) {
                interfaceC50054vAe.AEQbTJ(new Function1() { // from class: o.vPl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC50456vPb.copydefault(this.KWHzl, (android.view.View) obj);
                    }
                });
            }
        }
        ((uTF) sSMYrx()).AhwBna.setClickAction(new View.OnClickListener() { // from class: o.vPp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC50456vPb.initListener$lambda$8(view);
            }
        });
        ((uTF) sSMYrx()).AhwBna.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vPq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                ActivityC50456vPb.AEQbTJ(this.KWHzl, compoundButton, z);
            }
        });
        C52794wYp c52794wYp = ((uTF) sSMYrx()).EZpvd;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(final ActivityC50456vPb activityC50456vPb, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        java.lang.Object tag = view.getTag();
        final java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        if (str != null) {
            if (((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).OLrzqt(str)) {
                android.content.Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C48033uCm.Fragment.HJWChPfrwjPh));
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.HJWChPdIKEqB), new View.OnClickListener() { // from class: o.vPc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        ActivityC50456vPb.copydefault(this.AEQbTJ, viewOnClickListenerC54939xaY, view2);
                    }
                });
                viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.HJWChPdNQGVJ), new View.OnClickListener() { // from class: o.vPh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        ActivityC50456vPb.KWHzl(this.OLrzqt, str, viewOnClickListenerC54939xaY, view2);
                    }
                });
                viewOnClickListenerC54939xaY.show();
                SPUtils.put(((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).AYXKKw(), java.lang.Boolean.FALSE);
            } else {
                activityC50456vPb.EZpvd(str);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(ActivityC50456vPb activityC50456vPb, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        activityC50456vPb.EZpvd(GridStartTriggerType.INSTANT.getMode());
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void KWHzl(ActivityC50456vPb activityC50456vPb, java.lang.String str, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        activityC50456vPb.EZpvd(str);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void initListener$lambda$8(android.view.View view) {
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.OptIn));
        java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C55688xof.Application.QWSkGZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.vPf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                ActivityC50456vPb.OLrzqt(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(ActivityC50456vPb activityC50456vPb, android.widget.CompoundButton compoundButton, boolean z) {
        java.lang.String str = z ? "1" : "2";
        ((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).isConnected().setStopType(str);
        pUU.KWHzl(activityC50456vPb.getTAG(), "stopType change to " + str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(final java.lang.String str) {
        AEQbTJ(str);
        if (Intrinsics.EZpvd((java.lang.Object) ((GridTriggerConditionPresenter) gHZMYf()).copydefault(), (java.lang.Object) TtmlNode.START)) {
            ((GridTriggerConditionPresenter) gHZMYf()).KWHzl(str);
            fIwbmz();
        } else {
            ((GridTriggerConditionPresenter) gHZMYf()).AEQbTJ(str);
            ejfBZ();
        }
        C32866mlf.onEvent$default("BotPlaceOrder_AdvancedSetting_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.vPo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50456vPb.OLrzqt(this.copydefault, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(ActivityC50456vPb activityC50456vPb, java.lang.String str, EventParamsList eventParamsList) {
        java.lang.String strategyType;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        StrategyConfigInfo strategyConfigInfoKWHzl = ((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).KWHzl();
        if (strategyConfigInfoKWHzl == null || (strategyType = strategyConfigInfoKWHzl.getStrategyType()) == null) {
            strategyType = "grid";
        }
        EventParamsList.put$default(eventParamsList, "bot_type", strategyType, false, 4, null);
        EventParamsList.put$default(eventParamsList, ((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).copydefault(), str, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vPb$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC50456vPb OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC50456vPb activityC50456vPb) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = activityC50456vPb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (ActivityC50456vPb.OLrzqt(this.OLrzqt).AEQbTJ.OLrzqt() && ActivityC50456vPb.OLrzqt(this.OLrzqt).AYXKKw.OLrzqt()) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putParcelableArrayListExtra("trigger_sign", ActivityC50456vPb.AEQbTJ(this.OLrzqt).djBIcL().getSignParams());
                    intent.putExtra("type", ActivityC50456vPb.AEQbTJ(this.OLrzqt).copydefault());
                    this.OLrzqt.setResult(-1, intent);
                    this.OLrzqt.finish();
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void KWHzl() {
        ((uTF) sSMYrx()).OLrzqt.setTitle(C33070mpX.AYXKKw(C55688xof.Application.sendMediaButton));
        valueOf();
        AhwBna();
        djBIcL();
        EZpvd();
        fIwbmz();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gEmmrt() {
        ((uTF) sSMYrx()).OLrzqt.setTitle(C33070mpX.AYXKKw(C55688xof.Application.setShuffleModeEnabledRemoved));
        isConnected();
        values();
        fetchVPNInfo();
        DbNXlk();
        AEQbTJ();
        ejfBZ();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void valueOf() {
        ((uTF) sSMYrx()).KWHzl.setTag(GridStartTriggerType.INSTANT.getMode());
        ((uTF) sSMYrx()).AEQbTJ.setTag(GridStartTriggerType.PRICE.getMode());
        ((uTF) sSMYrx()).AYXKKw.setTag(GridStartTriggerType.RSI_14.getMode());
        ((uTF) sSMYrx()).valueOf.setTag(GridStartTriggerType.TRADINGVIEW.getMode());
        AEQbTJ(((GridTriggerConditionPresenter) gHZMYf()).gEmmrt().getIndicator());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AhwBna() {
        C53567wnt c53567wnt = ((uTF) sSMYrx()).AEQbTJ;
        C53567wnt.firstInputConfig$default(c53567wnt, C33070mpX.AYXKKw(C55688xof.Application.ActionBar), ((GridTriggerConditionPresenter) gHZMYf()).AEQbTJ(), "", java.lang.Integer.valueOf(((GridTriggerConditionPresenter) gHZMYf()).AhwBna()), false, 16, null);
        c53567wnt.AEQbTJ(new yHO() { // from class: o.vPm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return ActivityC50456vPb.AEQbTJ(this.EZpvd, (C47988uAv) obj, (java.lang.String) obj2, ((java.lang.Boolean) obj3).booleanValue());
            }
        });
        xMR xmr = xMR.copydefault;
        java.lang.String strCopydefault = xmr.copydefault("0");
        java.lang.String strCopydefault2 = xmr.copydefault("3600");
        C53567wnt.secondInputConfig$default(c53567wnt, C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsGetContent), C33070mpX.AYXKKw(C55688xof.Application.ActionBarDrawerToggle), strCopydefault + "-" + strCopydefault2, 0, false, 16, null);
        c53567wnt.EZpvd(new yHO() { // from class: o.vPr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return ActivityC50456vPb.AYXKKw(this.OLrzqt, (C47988uAv) obj, (java.lang.String) obj2, ((java.lang.Boolean) obj3).booleanValue());
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object AEQbTJ(ActivityC50456vPb activityC50456vPb, C47988uAv c47988uAv, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        pUU.EZpvd(activityC50456vPb.getTAG(), "startTriggerPrice: " + str);
        ((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).gEmmrt().setTriggerPx(str);
        if (c47988uAv.hasFocus()) {
            xVK xvk = xVK.EZpvd;
            if (str == null) {
                str = "";
            }
            java.lang.String[] strArrEZpvd = xvk.EZpvd(str, ((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).valueOf().gEmmrt(), ((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).valueOf().djBIcL());
            if (strArrEZpvd != null && strArrEZpvd.length > 1) {
                return strArrEZpvd;
            }
        }
        return ((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).EZpvd();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object AYXKKw(ActivityC50456vPb activityC50456vPb, C47988uAv c47988uAv, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        pUU.EZpvd(activityC50456vPb.getTAG(), "startDelay: " + str);
        ((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).gEmmrt().setDelaySeconds(str);
        return C56042xvO.AEQbTJ(((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).gEmmrt().getIndicator(), str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void djBIcL() {
        final C53570wnw c53570wnw = ((uTF) sSMYrx()).AYXKKw;
        Intrinsics.copydefault(c53570wnw);
        c53570wnw.setVisibility(C56071xvr.gEmmrt.uzCIH() ^ true ? 0 : 8);
        c53570wnw.setRsiEditListener(new View.OnClickListener() { // from class: o.vPi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC50456vPb.KWHzl(this.copydefault, c53570wnw, view);
            }
        });
        xMR xmr = xMR.copydefault;
        java.lang.String strCopydefault = xmr.copydefault("0");
        java.lang.String strCopydefault2 = xmr.copydefault("3600");
        C53570wnw.firstInputConfig$default(c53570wnw, C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsGetContent), C33070mpX.AYXKKw(C55688xof.Application.ActionBarDrawerToggle), strCopydefault + "-" + strCopydefault2, 0, false, 16, null);
        c53570wnw.KWHzl(new Function2() { // from class: o.vPk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC50456vPb.OLrzqt(this.AEQbTJ, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.vPu.Application.getIntent$default(o.vPu$Application, android.content.Context, com.okinc.unify_trade.biz.AdvancedTriggerSign, com.okinc.unify_trade.biz.StrategyConfigInfo, java.lang.String, int, java.lang.Object):android.content.Intent */
    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r8v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(ActivityC50456vPb activityC50456vPb, C53570wnw c53570wnw, android.view.View view) {
        activityC50456vPb.KWHzl(TtmlNode.START);
        ActivityC50475vPu.Application application = ActivityC50475vPu.Companion;
        android.content.Context context = c53570wnw.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        activityC50456vPb.AEQbTJ.launch(ActivityC50475vPu.Application.getIntent$default(application, context, ((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).gEmmrt(), ((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).KWHzl(), null, 8, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object OLrzqt(ActivityC50456vPb activityC50456vPb, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        pUU.EZpvd(activityC50456vPb.getTAG(), "startDelay: " + str);
        ((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).gEmmrt().setDelaySeconds(str);
        return C56042xvO.AEQbTJ(((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).gEmmrt().getIndicator(), str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd() {
        StrategyConfigInfo strategyConfigInfoKWHzl = ((GridTriggerConditionPresenter) gHZMYf()).KWHzl();
        if (strategyConfigInfoKWHzl != null) {
            strategyConfigInfoKWHzl.getStrategyType();
        }
        C53420wlE c53420wlE = ((uTF) sSMYrx()).valueOf;
        Intrinsics.checkNotNullExpressionValue(c53420wlE, "");
        c53420wlE.setVisibility(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fIwbmz() {
        AdvancedTriggerSign advancedTriggerSignGEmmrt = ((GridTriggerConditionPresenter) gHZMYf()).gEmmrt();
        uTF utf = (uTF) sSMYrx();
        java.lang.String indicator = advancedTriggerSignGEmmrt.getIndicator();
        if (Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) GridStartTriggerType.INSTANT.getMode())) {
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) GridStartTriggerType.PRICE.getMode())) {
            utf.AEQbTJ.setFirstContent(advancedTriggerSignGEmmrt.getTriggerPx());
            utf.AEQbTJ.setSecondContent(advancedTriggerSignGEmmrt.getDelaySeconds());
            java.lang.String triggerPx = advancedTriggerSignGEmmrt.getTriggerPx();
            if (triggerPx == null || triggerPx.length() == 0) {
                utf.AEQbTJ.copydefault();
                return;
            }
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) GridStartTriggerType.RSI_14.getMode())) {
            C53570wnw c53570wnw = utf.AYXKKw;
            int i = C55688xof.Application.PipHintTrackerKttrackPipAnimationHintViewflow1ExternalSyntheticLambda0;
            java.lang.String timePeriod = advancedTriggerSignGEmmrt.getTimePeriod();
            if (timePeriod == null) {
                timePeriod = "";
            }
            java.lang.String strCopydefault = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt(MTPushConstants.NotificationTime.KEY_DAYS, timePeriod)));
            java.lang.String strKWHzl = TriggerCond.Companion.KWHzl(advancedTriggerSignGEmmrt.getTriggerCond());
            xMR xmr = xMR.copydefault;
            java.lang.String oversoldThold = advancedTriggerSignGEmmrt.getOversoldThold();
            if (oversoldThold == null) {
                oversoldThold = "";
            }
            java.lang.String strCopydefault2 = xmr.copydefault(oversoldThold);
            TimeFrame.Application application = TimeFrame.Companion;
            java.lang.String timeframe = advancedTriggerSignGEmmrt.getTimeframe();
            c53570wnw.setRsiContent(strCopydefault, strKWHzl, strCopydefault2, application.copydefault(timeframe != null ? timeframe : ""));
            utf.AYXKKw.setFirstContent(advancedTriggerSignGEmmrt.getDelaySeconds());
            return;
        }
        Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) GridStartTriggerType.TRADINGVIEW.getMode());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void isConnected() {
        ((uTF) sSMYrx()).KWHzl.setTag(GridStopTriggerType.MANUAL_STOP.getMode());
        ((uTF) sSMYrx()).AEQbTJ.setTag(GridStopTriggerType.PRICE.getMode());
        ((uTF) sSMYrx()).AYXKKw.setTag(GridStopTriggerType.RSI_14.getMode());
        ((uTF) sSMYrx()).valueOf.setTag(GridStopTriggerType.TRADINGVIEW.getMode());
        AEQbTJ(((GridTriggerConditionPresenter) gHZMYf()).isConnected().getIndicator());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void values() {
        ((uTF) sSMYrx()).KWHzl.setTitle(C33070mpX.AYXKKw(GridStopTriggerType.MANUAL_STOP.getDesc()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fetchVPNInfo() {
        C53567wnt c53567wnt = ((uTF) sSMYrx()).AEQbTJ;
        C53567wnt.firstInputConfig$default(c53567wnt, C33070mpX.AYXKKw(C55688xof.Application.ActionBar), ((GridTriggerConditionPresenter) gHZMYf()).AEQbTJ(), "", java.lang.Integer.valueOf(((GridTriggerConditionPresenter) gHZMYf()).AhwBna()), false, 16, null);
        c53567wnt.AEQbTJ(new yHO() { // from class: o.vPt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return ActivityC50456vPb.djBIcL(this.AEQbTJ, (C47988uAv) obj, (java.lang.String) obj2, ((java.lang.Boolean) obj3).booleanValue());
            }
        });
        xMR xmr = xMR.copydefault;
        java.lang.String strCopydefault = xmr.copydefault("0");
        java.lang.String strCopydefault2 = xmr.copydefault("3600");
        C53567wnt.secondInputConfig$default(c53567wnt, C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsGetMultipleContentsCompanion), C33070mpX.AYXKKw(C55688xof.Application.ActionBarDrawerToggle), strCopydefault + "-" + strCopydefault2, 0, false, 16, null);
        c53567wnt.EZpvd(new yHO() { // from class: o.vPd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return ActivityC50456vPb.valueOf(this.OLrzqt, (C47988uAv) obj, (java.lang.String) obj2, ((java.lang.Boolean) obj3).booleanValue());
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object djBIcL(ActivityC50456vPb activityC50456vPb, C47988uAv c47988uAv, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        pUU.EZpvd(activityC50456vPb.getTAG(), "stopTriggerPrice: " + str);
        ((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).isConnected().setTriggerPx(str);
        if (c47988uAv.hasFocus()) {
            xVK xvk = xVK.EZpvd;
            if (str == null) {
                str = "";
            }
            java.lang.String[] strArrEZpvd = xvk.EZpvd(str, ((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).valueOf().gEmmrt(), ((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).valueOf().djBIcL());
            if (strArrEZpvd != null && strArrEZpvd.length > 1) {
                return strArrEZpvd;
            }
        }
        return C56042xvO.KWHzl(((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).djBIcL());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object valueOf(ActivityC50456vPb activityC50456vPb, C47988uAv c47988uAv, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        pUU.EZpvd(activityC50456vPb.getTAG(), "stopDelay: " + str);
        ((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).isConnected().setDelaySeconds(str);
        return C56042xvO.AEQbTJ(((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).isConnected().getIndicator(), str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void DbNXlk() {
        final C53570wnw c53570wnw = ((uTF) sSMYrx()).AYXKKw;
        Intrinsics.copydefault(c53570wnw);
        c53570wnw.setVisibility(C56071xvr.gEmmrt.uzCIH() ^ true ? 0 : 8);
        c53570wnw.setRsiEditListener(new View.OnClickListener() { // from class: o.vPg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC50456vPb.OLrzqt(this.copydefault, c53570wnw, view);
            }
        });
        xMR xmr = xMR.copydefault;
        java.lang.String strCopydefault = xmr.copydefault("0");
        java.lang.String strCopydefault2 = xmr.copydefault("3600");
        C53570wnw.firstInputConfig$default(c53570wnw, C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsGetMultipleContentsCompanion), C33070mpX.AYXKKw(C55688xof.Application.ActionBarDrawerToggle), strCopydefault + "-" + strCopydefault2, 0, false, 16, null);
        c53570wnw.KWHzl(new Function2() { // from class: o.vPe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC50456vPb.EZpvd(this.AEQbTJ, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r8v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(ActivityC50456vPb activityC50456vPb, C53570wnw c53570wnw, android.view.View view) {
        activityC50456vPb.KWHzl("stop");
        ActivityC50475vPu.Application application = ActivityC50475vPu.Companion;
        android.content.Context context = c53570wnw.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        activityC50456vPb.AEQbTJ.launch(ActivityC50475vPu.Application.getIntent$default(application, context, ((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).isConnected(), ((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).KWHzl(), null, 8, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object EZpvd(ActivityC50456vPb activityC50456vPb, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        pUU.EZpvd(activityC50456vPb.getTAG(), "stopDelay: " + str);
        ((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).isConnected().setDelaySeconds(str);
        return C56042xvO.AEQbTJ(((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).isConnected().getIndicator(), str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AEQbTJ() {
        uTF utf = (uTF) sSMYrx();
        boolean z = !((GridTriggerConditionPresenter) gHZMYf()).DbNXlk();
        android.view.View view = utf.copydefault;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(z ? 0 : 8);
        C53425wlJ c53425wlJ = utf.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c53425wlJ, "");
        c53425wlJ.setVisibility(z ? 0 : 8);
        utf.AhwBna.setTitle(C33070mpX.AYXKKw(C55688xof.Application.markerClass));
    }

    private final void KWHzl(final java.lang.String str) {
        C32866mlf.onEvent$default("BotPlaceOrder_RSISheet_RSICondition_Click", (TrackChannel[]) null, new Function1() { // from class: o.vPn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC50456vPb.KWHzl(this.OLrzqt, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(ActivityC50456vPb activityC50456vPb, java.lang.String str, EventParamsList eventParamsList) {
        java.lang.String strategyType;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        StrategyConfigInfo strategyConfigInfoKWHzl = ((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).KWHzl();
        if (strategyConfigInfoKWHzl == null || (strategyType = strategyConfigInfoKWHzl.getStrategyType()) == null) {
            strategyType = "grid";
        }
        eventParamsList.put("bot_type", strategyType, true);
        eventParamsList.put("condition_type", str, true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void ejfBZ() {
        AdvancedTriggerSign advancedTriggerSignIsConnected = ((GridTriggerConditionPresenter) gHZMYf()).isConnected();
        uTF utf = (uTF) sSMYrx();
        java.lang.String indicator = advancedTriggerSignIsConnected.getIndicator();
        if (!Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) GridStopTriggerType.MANUAL_STOP.getMode())) {
            if (Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) GridStopTriggerType.PRICE.getMode())) {
                utf.AEQbTJ.setFirstContent(advancedTriggerSignIsConnected.getTriggerPx());
                utf.AEQbTJ.setSecondContent(advancedTriggerSignIsConnected.getDelaySeconds());
                java.lang.String triggerPx = advancedTriggerSignIsConnected.getTriggerPx();
                if (triggerPx == null || triggerPx.length() == 0) {
                    utf.AEQbTJ.copydefault();
                }
            } else if (Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) GridStopTriggerType.RSI_14.getMode())) {
                C53570wnw c53570wnw = utf.AYXKKw;
                int i = C55688xof.Application.PipHintTrackerKttrackPipAnimationHintViewflow1ExternalSyntheticLambda0;
                java.lang.String timePeriod = advancedTriggerSignIsConnected.getTimePeriod();
                if (timePeriod == null) {
                    timePeriod = "";
                }
                java.lang.String strCopydefault = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt(MTPushConstants.NotificationTime.KEY_DAYS, timePeriod)));
                java.lang.String strKWHzl = TriggerCond.Companion.KWHzl(advancedTriggerSignIsConnected.getTriggerCond());
                xMR xmr = xMR.copydefault;
                java.lang.String oversoldThold = advancedTriggerSignIsConnected.getOversoldThold();
                if (oversoldThold == null) {
                    oversoldThold = "";
                }
                java.lang.String strCopydefault2 = xmr.copydefault(oversoldThold);
                TimeFrame.Application application = TimeFrame.Companion;
                java.lang.String timeframe = advancedTriggerSignIsConnected.getTimeframe();
                c53570wnw.setRsiContent(strCopydefault, strKWHzl, strCopydefault2, application.copydefault(timeframe != null ? timeframe : ""));
                utf.AYXKKw.setFirstContent(advancedTriggerSignIsConnected.getDelaySeconds());
            } else {
                Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) GridStopTriggerType.TRADINGVIEW.getMode());
            }
        }
        utf.AhwBna.setChecked(Intrinsics.EZpvd((java.lang.Object) advancedTriggerSignIsConnected.getStopType(), (java.lang.Object) "1"));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AEQbTJ(java.lang.String str) {
        android.widget.LinearLayout linearLayout = ((uTF) sSMYrx()).djBIcL;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        for (android.view.View view : ViewGroupKt.getChildren(linearLayout)) {
            InterfaceC50054vAe interfaceC50054vAe = view instanceof InterfaceC50054vAe ? (InterfaceC50054vAe) view : null;
            if (interfaceC50054vAe != null) {
                interfaceC50054vAe.setSelect(Intrinsics.EZpvd(view.getTag(), (java.lang.Object) str));
            }
        }
    }

    private final ActivityResultLauncher<android.content.Intent> AuCTel() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.vPj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC50456vPb.copydefault(this.KWHzl, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        return activityResultLauncherRegisterForActivityResult;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(ActivityC50456vPb activityC50456vPb, ActivityResult activityResult) {
        android.content.Intent data;
        android.os.Bundle extras;
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null || (extras = data.getExtras()) == null) {
            return;
        }
        ((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).EZpvd(extras);
        if (Intrinsics.EZpvd((java.lang.Object) ((GridTriggerConditionPresenter) activityC50456vPb.gHZMYf()).copydefault(), (java.lang.Object) TtmlNode.START)) {
            activityC50456vPb.fIwbmz();
        } else {
            activityC50456vPb.ejfBZ();
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
