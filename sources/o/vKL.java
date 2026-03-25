package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.ViewKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.unify_trade.biz.AIData;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.SlippageControl;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.vFA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vKL extends android.widget.RelativeLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public uVE AEQbTJ;
    public ActivityResultLauncher<android.content.Intent> KWHzl;
    public Function1<? super java.lang.Boolean, Unit> OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public Function2<? super java.lang.String, ? super java.lang.Boolean, Unit> djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public Function0<Unit> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vKL(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vKL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenPositionPostCheck(Function1<? super java.lang.Boolean, Unit> function1) {
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlippageControlSettings(Function2<? super java.lang.String, ? super java.lang.Boolean, Unit> function2) {
        this.djBIcL = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerStrategyPostCheck(Function0<Unit> function0) {
        this.valueOf = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:71) call: o.vKL.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ vKL(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vKL(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.vKS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vKL.KWHzl(context);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.vKU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vKL.AEQbTJ();
            }
        });
        djBIcL();
        copydefault();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vKL.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static final androidx.fragment.app.FragmentManager KWHzl(android.content.Context context) {
        Intrinsics.copydefault(context, "");
        return ((AppCompatActivity) context).getSupportFragmentManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.fragment.app.FragmentManager values() {
        return (androidx.fragment.app.FragmentManager) this.copydefault.getValue();
    }

    public static final C55771xqI AEQbTJ() {
        return new C55771xqI();
    }

    private final C55771xqI fetchVPNInfo() {
        return (C55771xqI) this.gEmmrt.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AkhnZx();
    }

    public final void djBIcL() {
        this.AEQbTJ = (uVE) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.gsvlRV, this, true);
        refreshVisibleState$default(this, null, 1, null);
    }

    public final void copydefault() {
        uVE uve = this.AEQbTJ;
        uVE uve2 = null;
        if (uve == null) {
            Intrinsics.gEmmrt("");
            uve = null;
        }
        uve.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.vKR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vKL.valueOf(this.EZpvd, view);
            }
        });
        uVE uve3 = this.AEQbTJ;
        if (uve3 == null) {
            Intrinsics.gEmmrt("");
            uve3 = null;
        }
        C55258xgZ c55258xgZ = uve3.AEQbTJ;
        c55258xgZ.setOnClickListener(new Application(c55258xgZ, 1000L, this));
        uVE uve4 = this.AEQbTJ;
        if (uve4 == null) {
            Intrinsics.gEmmrt("");
            uve4 = null;
        }
        uve4.gEmmrt.KWHzl(new View.OnClickListener() { // from class: o.vKQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vKL.gEmmrt(this.OLrzqt, view);
            }
        });
        uVE uve5 = this.AEQbTJ;
        if (uve5 == null) {
            Intrinsics.gEmmrt("");
            uve5 = null;
        }
        uve5.djBIcL.KWHzl(new View.OnClickListener() { // from class: o.vKT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vKL.AYXKKw(this.AEQbTJ, view);
            }
        });
        uVE uve6 = this.AEQbTJ;
        if (uve6 == null) {
            Intrinsics.gEmmrt("");
            uve6 = null;
        }
        uve6.AhwBna.KWHzl(new View.OnClickListener() { // from class: o.vKX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vKL.AhwBna(this.KWHzl, view);
            }
        });
        uVE uve7 = this.AEQbTJ;
        if (uve7 == null) {
            Intrinsics.gEmmrt("");
            uve7 = null;
        }
        uve7.valueOf.KWHzl(new View.OnClickListener() { // from class: o.vKY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vKL.djBIcL(this.copydefault, view);
            }
        });
        uVE uve8 = this.AEQbTJ;
        if (uve8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            uve2 = uve8;
        }
        uve2.AYXKKw.setOnSwitchChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vKW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                vKL.AEQbTJ(this.copydefault, compoundButton, z);
            }
        });
    }

    public static final void valueOf(vKL vkl, android.view.View view) {
        uVE uve = vkl.AEQbTJ;
        if (uve == null) {
            Intrinsics.gEmmrt("");
            uve = null;
        }
        LinearLayoutCompat linearLayoutCompat = uve.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        boolean z = !(linearLayoutCompat.getVisibility() == 0);
        vkl.KWHzl(java.lang.Boolean.valueOf(z));
        if (z) {
            C32866mlf.onEvent$default("BotPlaceOrder_AdvancedSetting_DropDown_Click", (TrackChannel[]) null, new Function1() { // from class: o.vKP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return vKL.AEQbTJ((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        SPUtils.put("sp_tag_visible_state_contract_grid", java.lang.Boolean.valueOf(z));
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(vKL vkl, android.view.View view) {
        C50308vJp.Companion.AEQbTJ((1600 & 1) != 0 ? false : false, (1600 & 2) != 0 ? "" : "open", (1600 & 4) != 0 ? null : "", (1600 & 8) != 0 ? "" : vkl.fetchVPNInfo().OLrzqt().getInstId(), (1600 & 16) != 0 ? "" : vkl.fetchVPNInfo().OLrzqt().getInstType(), (1600 & 32) != 0 ? "" : null, (1600 & 64) == 0 ? null : "", (1600 & 128) != 0 ? null : vkl.fetchVPNInfo().OLrzqt().getOpenPosSlippage(), (1600 & 256) != 0 ? null : vkl.fetchVPNInfo().KWHzl(), (1600 & 512) != 0 ? null : vkl.fetchVPNInfo().OLrzqt(), (1600 & 1024) == 0 ? null : null).show(vkl.values(), C50308vJp.class.getSimpleName());
    }

    public static final void AYXKKw(vKL vkl, android.view.View view) {
        vkl.OLrzqt(TtmlNode.START);
        onTrackClickEvent$default(vkl, "start_condition", null, 2, null);
    }

    public static final void AhwBna(vKL vkl, android.view.View view) {
        vkl.OLrzqt("stop");
        onTrackClickEvent$default(vkl, "stop_condition", null, 2, null);
    }

    public static final void djBIcL(vKL vkl, android.view.View view) {
        vGZ.Companion.AEQbTJ(vkl.fetchVPNInfo().OLrzqt(), false, "from_create", "contract_grid", vkl.fetchVPNInfo().KWHzl()).show(vkl.values(), vGZ.class.getSimpleName());
        onTrackClickEvent$default(vkl, "tp_sl", null, 2, null);
    }

    public static final void AEQbTJ(vKL vkl, android.widget.CompoundButton compoundButton, boolean z) {
        vkl.fetchVPNInfo().OLrzqt().setBasePos(java.lang.Boolean.valueOf(z));
        Function1<? super java.lang.Boolean, Unit> function1 = vkl.OLrzqt;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(z));
        }
        pUU.KWHzl("FutureGridAdvancedSettingView", "start and build is: " + z);
        onTrackClickEvent$default(vkl, "market_price", null, 2, null);
    }

    public static /* synthetic */ void refreshVisibleState$default(vKL vkl, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        vkl.KWHzl(bool);
    }

    public final void KWHzl(java.lang.Boolean bool) {
        boolean zBooleanValue = bool != null ? bool.booleanValue() : SPUtils.getBoolean("sp_tag_visible_state_contract_grid", false);
        uVE uve = this.AEQbTJ;
        uVE uve2 = null;
        if (uve == null) {
            Intrinsics.gEmmrt("");
            uve = null;
        }
        LinearLayoutCompat linearLayoutCompat = uve.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(zBooleanValue ? 0 : 8);
        int i = zBooleanValue ? C52761wXj.TaskDescription.DNMMPQ : C52761wXj.TaskDescription.DCUTEIddSDPG;
        uVE uve3 = this.AEQbTJ;
        if (uve3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            uve2 = uve3;
        }
        uve2.OLrzqt.setImageResource(i);
    }

    public static /* synthetic */ void refreshSlippageControl$default(vKL vkl, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        vkl.OLrzqt(str, z);
    }

    public final void OLrzqt(java.lang.String str, boolean z) {
        java.lang.String strValueOf;
        if (z) {
            int i = C48033uCm.Fragment.DzOuPm;
            if (str == null) {
                str = "";
            }
            strValueOf = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("slippagePct", str)));
        } else {
            strValueOf = java.lang.String.valueOf(str);
        }
        uVE uve = this.AEQbTJ;
        if (uve == null) {
            Intrinsics.gEmmrt("");
            uve = null;
        }
        uve.gEmmrt.AEQbTJ().setText(strValueOf);
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ vKL EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, vKL vkl) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = vkl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                new vHM().show(this.EZpvd.values(), "FutureGridExplainedDialog");
            }
        }
    }

    public final void AkhnZx() {
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner != null) {
            values().setFragmentResultListener("tp_sl_settings", lifecycleOwner, new FragmentResultListener() { // from class: o.vKZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                    vKL.copydefault(this.AEQbTJ, str, bundle);
                }
            });
            values().setFragmentResultListener("slippage_control_settings", lifecycleOwner, new FragmentResultListener() { // from class: o.vKN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                    vKL.OLrzqt(this.AEQbTJ, str, bundle);
                }
            });
        }
    }

    public static final void copydefault(vKL vkl, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        vkl.fetchVPNInfo().copydefault(bundle);
        vkl.AYXKKw();
    }

    public static final void OLrzqt(vKL vkl, java.lang.String str, android.os.Bundle bundle) {
        java.lang.String strValueOf;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        java.lang.String string = bundle.getString("slippage_ratio_params");
        vkl.fetchVPNInfo().OLrzqt(bundle);
        boolean z = string == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string);
        if (z) {
            strValueOf = C33070mpX.AYXKKw(C48033uCm.Fragment.zlzhuY);
        } else {
            strValueOf = java.lang.String.valueOf(xMR.copydefault.EZpvd(string, 4, 0, RoundingMode.FLOOR));
        }
        vkl.OLrzqt(strValueOf, false);
        Function2<? super java.lang.String, ? super java.lang.Boolean, Unit> function2 = vkl.djBIcL;
        if (function2 != null) {
            if (z) {
                string = "0";
            }
            function2.invoke(string, java.lang.Boolean.FALSE);
        }
    }

    public final void copydefault(@NotNull AIData aIData) {
        Intrinsics.checkNotNullParameter(aIData, "");
        fetchVPNInfo().OLrzqt(aIData);
        DbNXlk();
        AYXKKw();
        if (aIData.isToManual()) {
            KWHzl(java.lang.Boolean.TRUE);
        }
    }

    public final void EZpvd(@NotNull ContractGridReq contractGridReq) {
        Intrinsics.checkNotNullParameter(contractGridReq, "");
        fetchVPNInfo().AEQbTJ(contractGridReq);
        gEmmrt();
        valueOf();
    }

    public final void isConnected() {
        this.KWHzl = EZpvd();
    }

    public final void AEQbTJ(@NotNull ContractGridReq contractGridReq) {
        Intrinsics.checkNotNullParameter(contractGridReq, "");
        contractGridReq.getSignParams().clear();
        contractGridReq.setTpTriggerPx(null);
        contractGridReq.setSlTriggerPx(null);
        contractGridReq.setTpRatio(null);
        contractGridReq.setSlRatio(null);
        fetchVPNInfo().AEQbTJ(contractGridReq);
        DbNXlk();
        AYXKKw();
        gEmmrt();
        valueOf();
    }

    public static /* synthetic */ void syncDefaultParams$default(vKL vkl, StrategyConfigInfo strategyConfigInfo, java.lang.String str, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.TRUE;
        }
        vkl.KWHzl(strategyConfigInfo, str, bool);
    }

    public final void KWHzl(@NotNull StrategyConfigInfo strategyConfigInfo, java.lang.String str, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        fetchVPNInfo().EZpvd(strategyConfigInfo);
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.FALSE)) {
            return;
        }
        copydefault(strategyConfigInfo, str);
    }

    public static /* synthetic */ void updateSlippageByDirect$default(vKL vkl, StrategyConfigInfo strategyConfigInfo, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        vkl.copydefault(strategyConfigInfo, str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(StrategyConfigInfo strategyConfigInfo, java.lang.String str) {
        java.lang.String askSlippage;
        SlippageControl slippageControl;
        SlippageControl slippageControl2;
        SlippageControl slippageControl3;
        java.lang.String askSlippage2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3327612:
                    if (!str.equals("long")) {
                        askSlippage = "";
                    } else if (strategyConfigInfo == null || (slippageControl = strategyConfigInfo.getSlippageControl()) == null) {
                        askSlippage = null;
                    } else {
                        askSlippage = slippageControl.getAskSlippage();
                    }
                    break;
                case 109413500:
                    if (!str.equals("short")) {
                        askSlippage = "";
                        break;
                    } else if (strategyConfigInfo != null && (slippageControl2 = strategyConfigInfo.getSlippageControl()) != null) {
                        askSlippage = slippageControl2.getBidSlippage();
                        break;
                    }
                    break;
                case 798171554:
                    if (!str.equals("hedging")) {
                        askSlippage = "";
                        break;
                    }
                    break;
                case 1844321735:
                    if (!str.equals("neutral")) {
                        askSlippage = "";
                        break;
                    } else if (strategyConfigInfo != null && (slippageControl3 = strategyConfigInfo.getSlippageControl()) != null && (askSlippage2 = slippageControl3.getAskSlippage()) != null) {
                        SlippageControl slippageControl4 = strategyConfigInfo.getSlippageControl();
                        askSlippage = C33129mqd.EZpvd(askSlippage2, slippageControl4 != null ? slippageControl4.getBidSlippage() : null);
                        break;
                    }
                    break;
                default:
                    askSlippage = "";
                    break;
            }
        } else {
            askSlippage = "";
        }
        refreshSlippageControl$default(this, xMR.copydefault.EZpvd(askSlippage != null ? askSlippage : "", 4, 0, RoundingMode.FLOOR), false, 2, null);
        Function2<? super java.lang.String, ? super java.lang.Boolean, Unit> function2 = this.djBIcL;
        if (function2 != null) {
            function2.invoke(askSlippage, java.lang.Boolean.TRUE);
        }
    }

    public final void gEmmrt() {
        java.lang.Boolean basePos = fetchVPNInfo().OLrzqt().getBasePos();
        uVE uve = this.AEQbTJ;
        uVE uve2 = null;
        if (uve == null) {
            Intrinsics.gEmmrt("");
            uve = null;
        }
        C53573wnz c53573wnz = uve.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c53573wnz, "");
        c53573wnz.setVisibility((basePos == null || Intrinsics.EZpvd((java.lang.Object) fetchVPNInfo().OLrzqt().getOrdVariant(), (java.lang.Object) "segmented_hedging")) ? 8 : 0);
        uVE uve3 = this.AEQbTJ;
        if (uve3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            uve2 = uve3;
        }
        uve2.AYXKKw.setSwitchChecked(basePos != null ? basePos.booleanValue() : true);
    }

    public final void OLrzqt(boolean z) {
        uVE uve = this.AEQbTJ;
        if (uve == null) {
            Intrinsics.gEmmrt("");
            uve = null;
        }
        C53573wnz c53573wnz = uve.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c53573wnz, "");
        c53573wnz.setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void valueOf() {
        boolean z;
        xOR xorCopydefault;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (xorCopydefault = interfaceC54581xNrOLrzqt.copydefault()) == null) {
            z = false;
        } else {
            z = true;
            if (!xorCopydefault.AYXKKw()) {
            }
        }
        uVE uve = this.AEQbTJ;
        if (uve == null) {
            Intrinsics.gEmmrt("");
            uve = null;
        }
        C53573wnz c53573wnz = uve.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c53573wnz, "");
        c53573wnz.setVisibility(z ? 8 : 0);
    }

    public final void AYXKKw() {
        uVE uve = this.AEQbTJ;
        if (uve == null) {
            Intrinsics.gEmmrt("");
            uve = null;
        }
        uve.valueOf.setActiveContent(fetchVPNInfo().valueOf());
        OLrzqt();
    }

    public final void DbNXlk() {
        kotlin.Pair<java.lang.String, java.lang.String> pairAYXKKw = fetchVPNInfo().AYXKKw();
        uVE uve = this.AEQbTJ;
        uVE uve2 = null;
        if (uve == null) {
            Intrinsics.gEmmrt("");
            uve = null;
        }
        uve.djBIcL.setActiveContent(pairAYXKKw.getFirst());
        uVE uve3 = this.AEQbTJ;
        if (uve3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            uve2 = uve3;
        }
        uve2.AhwBna.setActiveContent(pairAYXKKw.getSecond());
        OLrzqt();
    }

    public final void OLrzqt() {
        C55771xqI c55771xqIFetchVPNInfo = fetchVPNInfo();
        uVE uve = this.AEQbTJ;
        uVE uve2 = null;
        if (uve == null) {
            Intrinsics.gEmmrt("");
            uve = null;
        }
        uve.djBIcL.setInputErrorMsg(C56038xvK.AEQbTJ(c55771xqIFetchVPNInfo.OLrzqt()));
        uVE uve3 = this.AEQbTJ;
        if (uve3 == null) {
            Intrinsics.gEmmrt("");
            uve3 = null;
        }
        uve3.AhwBna.setInputErrorMsg(C56038xvK.OLrzqt(c55771xqIFetchVPNInfo.OLrzqt()));
        uVE uve4 = this.AEQbTJ;
        if (uve4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            uve2 = uve4;
        }
        C53573wnz c53573wnz = uve2.valueOf;
        java.lang.String strKWHzl = C56038xvK.KWHzl(c55771xqIFetchVPNInfo.OLrzqt());
        if (strKWHzl.length() == 0) {
            strKWHzl = C56038xvK.EZpvd(c55771xqIFetchVPNInfo.OLrzqt());
        }
        if (strKWHzl.length() == 0) {
            strKWHzl = C56038xvK.AEQbTJ(c55771xqIFetchVPNInfo.OLrzqt(), fetchVPNInfo().gEmmrt());
        }
        if (strKWHzl.length() == 0) {
            strKWHzl = C56038xvK.EZpvd(c55771xqIFetchVPNInfo.OLrzqt(), fetchVPNInfo().gEmmrt());
        }
        c53573wnz.setInputErrorMsg(strKWHzl);
    }

    public final boolean AhwBna() {
        uVE uve = this.AEQbTJ;
        uVE uve2 = null;
        if (uve == null) {
            Intrinsics.gEmmrt("");
            uve = null;
        }
        boolean zEZpvd = uve.djBIcL.EZpvd();
        uVE uve3 = this.AEQbTJ;
        if (uve3 == null) {
            Intrinsics.gEmmrt("");
            uve3 = null;
        }
        boolean zEZpvd2 = uve3.AhwBna.EZpvd();
        uVE uve4 = this.AEQbTJ;
        if (uve4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            uve2 = uve4;
        }
        return zEZpvd || zEZpvd2 || uve2.valueOf.EZpvd();
    }

    public final void OLrzqt(java.lang.String str) {
        vFA.Application application = vFA.Companion;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        android.content.Intent intentCopydefault = application.copydefault(context, str, fetchVPNInfo().OLrzqt());
        ActivityResultLauncher<android.content.Intent> activityResultLauncher = this.KWHzl;
        if (activityResultLauncher == null) {
            Intrinsics.gEmmrt("");
            activityResultLauncher = null;
        }
        activityResultLauncher.launch(intentCopydefault);
    }

    public final ActivityResultLauncher<android.content.Intent> EZpvd() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = ViewKt.findFragment(this).registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.vKV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                vKL.copydefault(this.copydefault, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        return activityResultLauncherRegisterForActivityResult;
    }

    public static final void copydefault(vKL vkl, ActivityResult activityResult) {
        android.content.Intent data;
        android.os.Bundle extras;
        Function0<Unit> function0;
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null || (extras = data.getExtras()) == null) {
            return;
        }
        vkl.fetchVPNInfo().KWHzl(extras);
        vkl.DbNXlk();
        vkl.gEmmrt();
        if (!Intrinsics.EZpvd((java.lang.Object) extras.getString("type"), (java.lang.Object) TtmlNode.START) || (function0 = vkl.valueOf) == null) {
            return;
        }
        function0.invoke();
    }

    public final void setControlSelectedListener(final Function1<? super java.lang.String, Unit> function1) {
        uVE uve = this.AEQbTJ;
        if (uve == null) {
            Intrinsics.gEmmrt("");
            uve = null;
        }
        uve.KWHzl.setControlSelectedListener(new Function1() { // from class: o.vKM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vKL.EZpvd(function1, this, (java.lang.String) obj);
            }
        });
    }

    public static final Unit EZpvd(Function1 function1, vKL vkl, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (function1 != null) {
            function1.invoke(str);
        }
        onTrackClickEvent$default(vkl, null, Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1") ? "arithmetic" : "geometric", 1, null);
        return Unit.INSTANCE;
    }

    public final void setControlSelected(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        uVE uve = this.AEQbTJ;
        if (uve == null) {
            Intrinsics.gEmmrt("");
            uve = null;
        }
        uve.KWHzl.setControlSelected(str);
    }

    public static /* synthetic */ void onTrackClickEvent$default(vKL vkl, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        vkl.EZpvd(str, str2);
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2) {
        C55867xrz.KWHzl.copydefault("contract_grid", str, str2);
    }
}
