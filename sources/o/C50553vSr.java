package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.ViewKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.biz.TradeType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.tradingbot.impl.order.strategy.data.BotModel;
import com.okinc.tradingbot.impl.order.strategy.grid.dialog.SmartEarnAllocationBottomSheet;
import com.okinc.unify_trade.biz.AIData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.SpotGridTpSlConfig;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.TrailingPxResp;
import com.okinc.unify_trade.biz.bot.EarnType;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.biz.bot.SmartEarnRequestParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.ActivityC50456vPb;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.vPC;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vSr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50553vSr extends ConstraintLayout implements InterfaceC53558wnk {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public C48608uXs AEQbTJ;
    public Function0<java.lang.Boolean> AYXKKw;
    public Function0<Unit> AhwBna;
    public Function1<? super java.lang.Boolean, java.lang.Boolean> AkhnZx;
    public Function0<Unit> AuCTel;
    public Function0<Unit> DbNXlk;
    public final InterfaceC56387yDm EZpvd;
    public ActivityResultLauncher<android.content.Intent> KWHzl;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm djBIcL;
    public boolean fARcdN;
    public Function0<java.lang.Boolean> fetchVPNInfo;
    public C55850xri gEmmrt;
    public Function0<java.lang.Boolean> isConnected;
    public Function0<java.lang.String> valueOf;
    public Function0<Unit> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50553vSr(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C50553vSr(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void hDKMBd() {
        this.AkhnZx = null;
        this.values = null;
        this.DbNXlk = null;
        this.AhwBna = null;
        this.isConnected = null;
        this.fetchVPNInfo = null;
        this.AYXKKw = null;
        this.valueOf = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSmartEarnPreCheck(@NotNull Function0<java.lang.Boolean> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AYXKKw = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalInvestAmtCallback(Function0<java.lang.String> function0) {
        this.valueOf = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpSlPostCheck(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AhwBna = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpSlPreCheck(@NotNull Function0<java.lang.Boolean> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.isConnected = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrailingPostCheck(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.values = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrailingPreCheck(@NotNull Function1<? super java.lang.Boolean, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AkhnZx = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrailingUpChange(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.DbNXlk = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrailingUpErrCheck(@NotNull Function0<java.lang.Boolean> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.fetchVPNInfo = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerStrategyPostCheck(Function0<Unit> function0) {
        this.AuCTel = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:82) call: o.vSr.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C50553vSr(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50553vSr(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.vSx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50553vSr.KWHzl(context);
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.vSw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50553vSr.EZpvd();
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.vSy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50553vSr.copydefault();
            }
        });
        this.gEmmrt = new C55850xri("", "", null, null);
        zLjUOn();
        AuCTelauCTel();
    }

    /* JADX INFO: renamed from: o.vSr$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vSr.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static final androidx.fragment.app.FragmentManager KWHzl(android.content.Context context) {
        Intrinsics.copydefault(context, "");
        return ((AppCompatActivity) context).getSupportFragmentManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.fragment.app.FragmentManager getNewProxyInstance() {
        return (androidx.fragment.app.FragmentManager) this.copydefault.getValue();
    }

    public static final C55872xsD EZpvd() {
        return new C55872xsD();
    }

    private final C55872xsD getFieldNames() {
        return (C55872xsD) this.djBIcL.getValue();
    }

    private final BizInstrument uzCIH() {
        return (BizInstrument) this.EZpvd.getValue();
    }

    public static final BizInstrument copydefault() {
        BizInstrument bizInstrumentEZpvd = xLX.OLrzqt(BizInfoConfig.DefaultBizConfig.copydefault).EZpvd();
        if (bizInstrumentEZpvd == null) {
            return null;
        }
        return bizInstrumentEZpvd;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AubY();
    }

    private final void zLjUOn() {
        this.AEQbTJ = C48608uXs.OLrzqt(android.view.LayoutInflater.from(getContext()), this);
        refreshVisibleState$default(this, null, 1, null);
    }

    private final void AuCTelauCTel() {
        C48608uXs c48608uXs = this.AEQbTJ;
        C48608uXs c48608uXs2 = null;
        if (c48608uXs == null) {
            Intrinsics.gEmmrt("");
            c48608uXs = null;
        }
        c48608uXs.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.vSu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50553vSr.fJNWhG(this.AEQbTJ, view);
            }
        });
        C48608uXs c48608uXs3 = this.AEQbTJ;
        if (c48608uXs3 == null) {
            Intrinsics.gEmmrt("");
            c48608uXs3 = null;
        }
        C55258xgZ c55258xgZ = c48608uXs3.AEQbTJ;
        c55258xgZ.setOnClickListener(new TaskDescription(c55258xgZ, 1000L, this));
        C48608uXs c48608uXs4 = this.AEQbTJ;
        if (c48608uXs4 == null) {
            Intrinsics.gEmmrt("");
            c48608uXs4 = null;
        }
        c48608uXs4.gEmmrt.KWHzl(new View.OnClickListener() { // from class: o.vSq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50553vSr.djBIcL(this.OLrzqt, view);
            }
        });
        C48608uXs c48608uXs5 = this.AEQbTJ;
        if (c48608uXs5 == null) {
            Intrinsics.gEmmrt("");
            c48608uXs5 = null;
        }
        c48608uXs5.AhwBna.KWHzl(new View.OnClickListener() { // from class: o.vSA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50553vSr.AYXKKw(this.OLrzqt, view);
            }
        });
        C48608uXs c48608uXs6 = this.AEQbTJ;
        if (c48608uXs6 == null) {
            Intrinsics.gEmmrt("");
            c48608uXs6 = null;
        }
        c48608uXs6.AYXKKw.KWHzl(new View.OnClickListener() { // from class: o.vSE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50553vSr.DbNXlk(this.OLrzqt, view);
            }
        });
        C48608uXs c48608uXs7 = this.AEQbTJ;
        if (c48608uXs7 == null) {
            Intrinsics.gEmmrt("");
            c48608uXs7 = null;
        }
        c48608uXs7.fetchVPNInfo.KWHzl(new View.OnClickListener() { // from class: o.vSC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50553vSr.AkhnZx(this.OLrzqt, view);
            }
        });
        C48608uXs c48608uXs8 = this.AEQbTJ;
        if (c48608uXs8 == null) {
            Intrinsics.gEmmrt("");
            c48608uXs8 = null;
        }
        c48608uXs8.isConnected.KWHzl(new View.OnClickListener() { // from class: o.vSH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50553vSr.isConnected(this.EZpvd, view);
            }
        });
        C48608uXs c48608uXs9 = this.AEQbTJ;
        if (c48608uXs9 == null) {
            Intrinsics.gEmmrt("");
            c48608uXs9 = null;
        }
        c48608uXs9.values.KWHzl(new View.OnClickListener() { // from class: o.vSI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50553vSr.fetchVPNInfo(this.EZpvd, view);
            }
        });
        C48608uXs c48608uXs10 = this.AEQbTJ;
        if (c48608uXs10 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c48608uXs2 = c48608uXs10;
        }
        c48608uXs2.djBIcL.KWHzl(new View.OnClickListener() { // from class: o.vSJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50553vSr.values(this.EZpvd, view);
            }
        });
    }

    public static final void fJNWhG(C50553vSr c50553vSr, android.view.View view) {
        C48608uXs c48608uXs = c50553vSr.AEQbTJ;
        if (c48608uXs == null) {
            Intrinsics.gEmmrt("");
            c48608uXs = null;
        }
        Group group = c48608uXs.EZpvd;
        Intrinsics.checkNotNullExpressionValue(group, "");
        boolean z = !(group.getVisibility() == 0);
        c50553vSr.OLrzqt(java.lang.Boolean.valueOf(z));
        if (z) {
            C32866mlf.onEvent$default("BotPlaceOrder_AdvancedSetting_DropDown_Click", (TrackChannel[]) null, new Function1() { // from class: o.vSG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C50553vSr.copydefault((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        SPUtils.put("sp_tag_visible_state_spot_grid", java.lang.Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public static final void djBIcL(final C50553vSr c50553vSr, android.view.View view) {
        StrategyConfigInfo strategyConfigInfoOLrzqt;
        SmartEarnConfig earnConfig;
        C56028xvA.botClickTrack$default("smartEarn", null, 2, null);
        if (!c50553vSr.getFieldNames().AkhnZx()) {
            android.content.Context context = c50553vSr.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.setTitle(C48033uCm.Fragment.OAUGar);
            viewOnClickListenerC54939xaY.copydefault(C48033uCm.Fragment.DAgZj);
            viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.trackPipAnimationHintView, new View.OnClickListener() { // from class: o.vSD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C50553vSr.KWHzl(viewOnClickListenerC54939xaY, view2);
                }
            });
            viewOnClickListenerC54939xaY.show();
            return;
        }
        Function0<java.lang.Boolean> function0 = c50553vSr.AYXKKw;
        if (function0 == null || !function0.invoke().booleanValue() || (strategyConfigInfoOLrzqt = c50553vSr.getFieldNames().OLrzqt()) == null || (earnConfig = strategyConfigInfoOLrzqt.getEarnConfig()) == null) {
            return;
        }
        SmartEarnAllocationBottomSheet.StateListAnimator stateListAnimator = SmartEarnAllocationBottomSheet.Companion;
        java.lang.String marketPx = c50553vSr.getFieldNames().copydefault().getMarketPx();
        stateListAnimator.KWHzl(marketPx == null ? "" : marketPx, c50553vSr.getFieldNames().copydefault().getMinPx(), c50553vSr.getFieldNames().copydefault().getMaxPx(), earnConfig, c50553vSr.getFieldNames().copydefault().getEarnParam(), new BotModel("", c50553vSr.getFieldNames().copydefault().getInstId(), c50553vSr.getFieldNames().copydefault().getInstType())).show(c50553vSr.getNewProxyInstance(), "SmartEarnAllocationBottomSheet");
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(c50553vSr);
        if (lifecycleOwner != null) {
            c50553vSr.getNewProxyInstance().setFragmentResultListener("SmartEarnRequest", lifecycleOwner, new FragmentResultListener() { // from class: o.vSB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                    C50553vSr.OLrzqt(this.AEQbTJ, str, bundle);
                }
            });
        }
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX INFO: renamed from: o.vSr$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C50553vSr EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C50553vSr c50553vSr) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = c50553vSr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                new vQX().show(this.EZpvd.getNewProxyInstance(), "SpotGridExplainedDialog");
            }
        }
    }

    public static final void OLrzqt(C50553vSr c50553vSr, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        SmartEarnRequestParam smartEarnRequestParam = (SmartEarnRequestParam) bundle.getParcelable(SmartEarnRequestParam.Key);
        C48608uXs c48608uXs = null;
        EarnType earnType = smartEarnRequestParam != null ? smartEarnRequestParam.getEarnType() : null;
        if (smartEarnRequestParam == null || !smartEarnRequestParam.getEnabled() || earnType == null || c50553vSr.uzCIH() == null) {
            C48608uXs c48608uXs2 = c50553vSr.AEQbTJ;
            if (c48608uXs2 == null) {
                Intrinsics.gEmmrt("");
                c48608uXs2 = null;
            }
            c48608uXs2.gEmmrt.setActiveContent(C33070mpX.AYXKKw(C55688xof.Application.StyleableRes));
            c50553vSr.getFieldNames().copydefault().setEarnParam(null);
            return;
        }
        java.lang.String earnMinLimit = smartEarnRequestParam.getEarnMinLimit();
        if (earnMinLimit == null) {
            earnMinLimit = "";
        }
        java.lang.String earnMaxLimit = smartEarnRequestParam.getEarnMaxLimit();
        if (earnMaxLimit == null) {
            earnMaxLimit = "";
        }
        InterfaceC56538yJb interfaceC56538yJbEZpvd = C56547yJk.EZpvd(earnMinLimit, earnMaxLimit);
        BizInstrument bizInstrumentUzCIH = c50553vSr.uzCIH();
        if (bizInstrumentUzCIH != null) {
            java.lang.String strEZpvd = C56033xvF.EZpvd((InterfaceC56538yJb<java.lang.String>) interfaceC56538yJbEZpvd, earnType, bizInstrumentUzCIH);
            smartEarnRequestParam.setRegionDisplay(strEZpvd);
            c50553vSr.getFieldNames().copydefault().setEarnParam(smartEarnRequestParam);
            C48608uXs c48608uXs3 = c50553vSr.AEQbTJ;
            if (c48608uXs3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c48608uXs = c48608uXs3;
            }
            c48608uXs.gEmmrt.setActiveContent(strEZpvd);
            return;
        }
        throw new java.lang.IllegalArgumentException("Required value was null.".toString());
    }

    public static final void AYXKKw(C50553vSr c50553vSr, android.view.View view) {
        Function0<java.lang.Boolean> function0 = c50553vSr.fetchVPNInfo;
        if (function0 == null || !function0.invoke().booleanValue()) {
            if (c50553vSr.AkhnZx()) {
                C55326xho.toast$default(C55688xof.Application.onEvent, (android.graphics.drawable.Drawable) null, 3000, (java.lang.Integer) null, 0, 0, 29, (java.lang.Object) null);
            } else if (c50553vSr.getFieldNames().fetchVPNInfo()) {
                C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C55688xof.Application.ExperimentalLevel), 0, 1, (java.lang.Object) null);
            } else {
                c50553vSr.iwGUEr();
            }
            onTrackClickEvent$default(c50553vSr, "trailing_up", null, 2, null);
        }
    }

    public static final void DbNXlk(C50553vSr c50553vSr, android.view.View view) {
        if (c50553vSr.AkhnZx()) {
            C55326xho.toast$default(C55688xof.Application.onEvent, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        } else {
            c50553vSr.iwGUEr();
        }
        onTrackClickEvent$default(c50553vSr, "trailing_down", null, 2, null);
    }

    public static final void AkhnZx(C50553vSr c50553vSr, android.view.View view) {
        if (c50553vSr.AkhnZx()) {
            C55326xho.toast$default(C55688xof.Application.RatingCompatStyle, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        } else {
            c50553vSr.OLrzqt(TtmlNode.START);
        }
        onTrackClickEvent$default(c50553vSr, "start_condition", null, 2, null);
    }

    public static final void isConnected(C50553vSr c50553vSr, android.view.View view) {
        if (c50553vSr.AkhnZx()) {
            C55326xho.toast$default(C55688xof.Application.RatingCompatStyle, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        } else {
            c50553vSr.OLrzqt("stop");
        }
        onTrackClickEvent$default(c50553vSr, "stop_condition", null, 2, null);
    }

    public static final void fetchVPNInfo(C50553vSr c50553vSr, android.view.View view) {
        Function0<java.lang.Boolean> function0 = c50553vSr.isConnected;
        if (function0 == null || function0.invoke().booleanValue()) {
            c50553vSr.djBIcL();
            onTrackClickEvent$default(c50553vSr, "tp_sl", null, 2, null);
        }
    }

    public static final void values(C50553vSr c50553vSr, android.view.View view) {
        Function0<java.lang.Boolean> function0 = c50553vSr.isConnected;
        if (function0 == null || function0.invoke().booleanValue()) {
            c50553vSr.djBIcL();
            onTrackClickEvent$default(c50553vSr, "tp_sl", null, 2, null);
        }
    }

    public final void djBIcL() {
        java.lang.String strInvoke;
        vPC.StateListAnimator stateListAnimator = vPC.Companion;
        GridReq gridReqCopydefault = getFieldNames().copydefault();
        Function0<java.lang.String> function0 = this.valueOf;
        if (function0 == null || (strInvoke = function0.invoke()) == null) {
            strInvoke = "0";
        }
        vPC.StateListAnimator.newInstance$default(stateListAnimator, gridReqCopydefault, false, "from_create", "grid", strInvoke, null, 32, null).show(getNewProxyInstance(), vPC.class.getSimpleName());
    }

    public static /* synthetic */ void refreshVisibleState$default(C50553vSr c50553vSr, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        c50553vSr.OLrzqt(bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void OLrzqt(java.lang.Boolean bool) {
        int i;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : SPUtils.getBoolean("sp_tag_visible_state_spot_grid", false);
        C48608uXs c48608uXs = this.AEQbTJ;
        C48608uXs c48608uXs2 = null;
        if (c48608uXs == null) {
            Intrinsics.gEmmrt("");
            c48608uXs = null;
        }
        Group group = c48608uXs.EZpvd;
        Intrinsics.checkNotNullExpressionValue(group, "");
        group.setVisibility(zBooleanValue ? 0 : 8);
        C48608uXs c48608uXs3 = this.AEQbTJ;
        if (c48608uXs3 == null) {
            Intrinsics.gEmmrt("");
            c48608uXs3 = null;
        }
        C53573wnz c53573wnz = c48608uXs3.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c53573wnz, "");
        if (zBooleanValue) {
            C56071xvr c56071xvr = C56071xvr.gEmmrt;
            i = (!c56071xvr.ejfBZ() || c56071xvr.hDKMBd()) ? 0 : 8;
        }
        c53573wnz.setVisibility(i);
        C48608uXs c48608uXs4 = this.AEQbTJ;
        if (c48608uXs4 == null) {
            Intrinsics.gEmmrt("");
            c48608uXs4 = null;
        }
        uBL ubl = c48608uXs4.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(ubl, "");
        ubl.setVisibility((zBooleanValue && this.fARcdN) ? 0 : 8);
        int i2 = zBooleanValue ? C52761wXj.TaskDescription.DNMMPQ : C52761wXj.TaskDescription.DCUTEIddSDPG;
        C48608uXs c48608uXs5 = this.AEQbTJ;
        if (c48608uXs5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c48608uXs2 = c48608uXs5;
        }
        c48608uXs2.KWHzl.setImageResource(i2);
    }

    public final void iwGUEr() {
        if (isConnected()) {
            vRR vrr = new vRR();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("bot_grid_req", getFieldNames().copydefault());
            bundle.putBoolean("disable_trailing_up", getFieldNames().fetchVPNInfo());
            bundle.putParcelable("trailing_default_px", getFieldNames().gEmmrt());
            vrr.setArguments(bundle);
            vrr.show(getNewProxyInstance(), "SpotGridTrailingDialog");
        }
    }

    public final void OLrzqt(java.lang.String str) {
        ActivityC50456vPb.StateListAnimator stateListAnimator = ActivityC50456vPb.Companion;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        android.content.Intent intentEZpvd = stateListAnimator.EZpvd(context, str, getFieldNames().copydefault(), getFieldNames().OLrzqt());
        ActivityResultLauncher<android.content.Intent> activityResultLauncher = this.KWHzl;
        if (activityResultLauncher == null) {
            Intrinsics.gEmmrt("");
            activityResultLauncher = null;
        }
        activityResultLauncher.launch(intentEZpvd);
    }

    private final void AubY() {
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner != null) {
            getNewProxyInstance().setFragmentResultListener("trailing_settings", lifecycleOwner, new FragmentResultListener() { // from class: o.vSt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                    C50553vSr.EZpvd(this.KWHzl, str, bundle);
                }
            });
            getNewProxyInstance().setFragmentResultListener("tp_sl_settings", lifecycleOwner, new FragmentResultListener() { // from class: o.vSs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                    C50553vSr.AYXKKw(this.KWHzl, str, bundle);
                }
            });
        }
    }

    public static final void EZpvd(C50553vSr c50553vSr, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c50553vSr.getFieldNames().OLrzqt(bundle);
        c50553vSr.AuCTel();
        Function0<Unit> function0 = c50553vSr.DbNXlk;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void AYXKKw(C50553vSr c50553vSr, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c50553vSr.getFieldNames().AEQbTJ(bundle);
        c50553vSr.fetchVPNInfo();
    }

    public final void AEQbTJ(@NotNull AIData aIData) {
        Intrinsics.checkNotNullParameter(aIData, "");
        getFieldNames().OLrzqt(aIData);
        AuCTel();
        fARcdN();
        fetchVPNInfo();
        if (aIData.isToManual()) {
            OLrzqt(java.lang.Boolean.TRUE);
        }
    }

    public final void KWHzl(@NotNull GridReq gridReq, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(gridReq, "");
        Intrinsics.checkNotNullParameter(str, "");
        getFieldNames().AEQbTJ(gridReq, str);
    }

    @Override // o.InterfaceC53558wnk
    public void AEQbTJ(@NotNull final Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        C48608uXs c48608uXs = this.AEQbTJ;
        C48608uXs c48608uXs2 = null;
        if (c48608uXs == null) {
            Intrinsics.gEmmrt("");
            c48608uXs = null;
        }
        c48608uXs.DbNXlk.setOnSelectedCallback(new Function1() { // from class: o.vSF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50553vSr.OLrzqt(function1, this, (java.lang.String) obj);
            }
        });
        C48608uXs c48608uXs3 = this.AEQbTJ;
        if (c48608uXs3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c48608uXs2 = c48608uXs3;
        }
        c48608uXs2.DbNXlk.setFm(getNewProxyInstance());
    }

    public static final Unit OLrzqt(Function1 function1, C50553vSr c50553vSr, java.lang.String str) {
        function1.invoke(str);
        c50553vSr.getFieldNames().copydefault().setTradeQuoteCcy(str);
        c50553vSr.fetchVPNInfo();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    @Override // o.InterfaceC53558wnk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String EZpvd(ViewModelStoreOwner viewModelStoreOwner, BizInstrument bizInstrument, @NotNull TradeType tradeType) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        C48608uXs c48608uXs = this.AEQbTJ;
        if (c48608uXs == null) {
            Intrinsics.gEmmrt("");
            c48608uXs = null;
        }
        int i = 0;
        c48608uXs.DbNXlk.copydefault(viewModelStoreOwner, bizInstrument, tradeType, false);
        this.fARcdN = bizInstrument != null ? bizInstrument.isDisplayTradeReceive() : false;
        C48608uXs c48608uXs2 = this.AEQbTJ;
        if (c48608uXs2 == null) {
            Intrinsics.gEmmrt("");
            c48608uXs2 = null;
        }
        uBL ubl = c48608uXs2.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(ubl, "");
        if (this.fARcdN) {
            C48608uXs c48608uXs3 = this.AEQbTJ;
            if (c48608uXs3 == null) {
                Intrinsics.gEmmrt("");
                c48608uXs3 = null;
            }
            Group group = c48608uXs3.EZpvd;
            Intrinsics.checkNotNullExpressionValue(group, "");
            if (group.getVisibility() != 0) {
            }
        } else {
            i = 8;
        }
        ubl.setVisibility(i);
        GridReq gridReqCopydefault = getFieldNames().copydefault();
        java.lang.String strAhwBna = AhwBna();
        C48608uXs c48608uXs4 = this.AEQbTJ;
        if (c48608uXs4 == null) {
            Intrinsics.gEmmrt("");
            c48608uXs4 = null;
        }
        uBL ubl2 = c48608uXs4.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(ubl2, "");
        gridReqCopydefault.setTradeQuoteCcy(ubl2.getVisibility() == 0 ? strAhwBna : null);
        return AhwBna();
    }

    @Override // o.InterfaceC53558wnk
    public java.lang.String AhwBna() {
        C48608uXs c48608uXs = this.AEQbTJ;
        if (c48608uXs == null) {
            Intrinsics.gEmmrt("");
            c48608uXs = null;
        }
        return c48608uXs.DbNXlk.OLrzqt();
    }

    public final void OLrzqt(@NotNull StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        getFieldNames().AEQbTJ(strategyConfigInfo);
        C48608uXs c48608uXs = this.AEQbTJ;
        if (c48608uXs == null) {
            Intrinsics.gEmmrt("");
            c48608uXs = null;
        }
        c48608uXs.gEmmrt.setContentDisableColor(!getFieldNames().AkhnZx());
    }

    public static /* synthetic */ void syncTrailingResp$default(C50553vSr c50553vSr, TrailingPxResp trailingPxResp, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            trailingPxResp = null;
        }
        c50553vSr.KWHzl(trailingPxResp);
    }

    public final void KWHzl(TrailingPxResp trailingPxResp) {
        getFieldNames().AEQbTJ(trailingPxResp);
        AuCTel();
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        getFieldNames().KWHzl(str);
    }

    public final void fJNWhG() {
        this.KWHzl = AYXKKw();
    }

    public final void AuCTel() {
        if (AkhnZx()) {
            C48608uXs c48608uXs = this.AEQbTJ;
            C48608uXs c48608uXs2 = null;
            if (c48608uXs == null) {
                Intrinsics.gEmmrt("");
                c48608uXs = null;
            }
            c48608uXs.AhwBna.setActiveContent(C33070mpX.AYXKKw(C55688xof.Application.MediaMetadataCompatRatingKey));
            C48608uXs c48608uXs3 = this.AEQbTJ;
            if (c48608uXs3 == null) {
                Intrinsics.gEmmrt("");
                c48608uXs3 = null;
            }
            c48608uXs3.AhwBna.setContentDisableColor(true);
            C48608uXs c48608uXs4 = this.AEQbTJ;
            if (c48608uXs4 == null) {
                Intrinsics.gEmmrt("");
                c48608uXs4 = null;
            }
            c48608uXs4.AYXKKw.setActiveContent(C33070mpX.AYXKKw(C55688xof.Application.MediaMetadataCompatRatingKey));
            C48608uXs c48608uXs5 = this.AEQbTJ;
            if (c48608uXs5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c48608uXs2 = c48608uXs5;
            }
            c48608uXs2.AYXKKw.setContentDisableColor(true);
        } else {
            fIwbmz();
            ejfBZ();
            AEQbTJ();
        }
        Function0<Unit> function0 = this.values;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void fIwbmz() {
        TrailingConfig trailingUpConfig = getFieldNames().copydefault().getTrailingUpConfig();
        C48608uXs c48608uXs = null;
        if (trailingUpConfig == null || !trailingUpConfig.getEnabled()) {
            C48608uXs c48608uXs2 = this.AEQbTJ;
            if (c48608uXs2 == null) {
                Intrinsics.gEmmrt("");
                c48608uXs2 = null;
            }
            c48608uXs2.AhwBna.setActiveContent(C33070mpX.AYXKKw(C55688xof.Application.StyleableRes));
            C48608uXs c48608uXs3 = this.AEQbTJ;
            if (c48608uXs3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c48608uXs = c48608uXs3;
            }
            c48608uXs.AhwBna.setContentDisableColor(getFieldNames().fetchVPNInfo());
            return;
        }
        C48608uXs c48608uXs4 = this.AEQbTJ;
        if (c48608uXs4 == null) {
            Intrinsics.gEmmrt("");
            c48608uXs4 = null;
        }
        c48608uXs4.AhwBna.setActiveContent(getFieldNames().AYXKKw());
        C48608uXs c48608uXs5 = this.AEQbTJ;
        if (c48608uXs5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c48608uXs = c48608uXs5;
        }
        c48608uXs.AhwBna.setContentDisableColor(false);
    }

    public final void ejfBZ() {
        TrailingConfig trailingDownConfig = getFieldNames().copydefault().getTrailingDownConfig();
        C48608uXs c48608uXs = null;
        if (trailingDownConfig == null || !trailingDownConfig.getEnabled()) {
            C48608uXs c48608uXs2 = this.AEQbTJ;
            if (c48608uXs2 == null) {
                Intrinsics.gEmmrt("");
                c48608uXs2 = null;
            }
            c48608uXs2.AYXKKw.setActiveContent(C33070mpX.AYXKKw(C55688xof.Application.StyleableRes));
        } else {
            C48608uXs c48608uXs3 = this.AEQbTJ;
            if (c48608uXs3 == null) {
                Intrinsics.gEmmrt("");
                c48608uXs3 = null;
            }
            c48608uXs3.AYXKKw.setActiveContent(getFieldNames().AhwBna());
        }
        C48608uXs c48608uXs4 = this.AEQbTJ;
        if (c48608uXs4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c48608uXs = c48608uXs4;
        }
        c48608uXs.AYXKKw.setContentDisableColor(false);
    }

    public final void fetchVPNInfo() {
        this.gEmmrt = new C55850xri(getFieldNames().copydefault().getInstType(), getFieldNames().copydefault().getInstId(), getFieldNames().copydefault().getSourceCcy(), getFieldNames().copydefault().getTradeQuoteCcy());
        java.lang.String value = getFieldNames().djBIcL().getTp().getValue();
        C48608uXs c48608uXs = null;
        if (value == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) value)) {
            C48608uXs c48608uXs2 = this.AEQbTJ;
            if (c48608uXs2 == null) {
                Intrinsics.gEmmrt("");
                c48608uXs2 = null;
            }
            c48608uXs2.values.setActiveContent(C33070mpX.AYXKKw(C55688xof.Application.StyleableRes));
        } else {
            C48608uXs c48608uXs3 = this.AEQbTJ;
            if (c48608uXs3 == null) {
                Intrinsics.gEmmrt("");
                c48608uXs3 = null;
            }
            c48608uXs3.values.setActiveContent(this.gEmmrt.AkhnZx(getFieldNames().djBIcL()) + this.gEmmrt.values(getFieldNames().djBIcL()));
        }
        java.lang.String value2 = getFieldNames().djBIcL().getSl().getValue();
        if (value2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) value2)) {
            C48608uXs c48608uXs4 = this.AEQbTJ;
            if (c48608uXs4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c48608uXs = c48608uXs4;
            }
            c48608uXs.djBIcL.setActiveContent(C33070mpX.AYXKKw(C55688xof.Application.StyleableRes));
        } else {
            C48608uXs c48608uXs5 = this.AEQbTJ;
            if (c48608uXs5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c48608uXs = c48608uXs5;
            }
            c48608uXs.djBIcL.setActiveContent(this.gEmmrt.gEmmrt(getFieldNames().djBIcL()) + this.gEmmrt.valueOf(getFieldNames().djBIcL()));
        }
        AEQbTJ();
        Function0<Unit> function0 = this.AhwBna;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void values() {
        C48608uXs c48608uXs = this.AEQbTJ;
        C48608uXs c48608uXs2 = null;
        if (c48608uXs == null) {
            Intrinsics.gEmmrt("");
            c48608uXs = null;
        }
        c48608uXs.gEmmrt.setActiveContent(C33070mpX.AYXKKw(C55688xof.Application.StyleableRes));
        C48608uXs c48608uXs3 = this.AEQbTJ;
        if (c48608uXs3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c48608uXs2 = c48608uXs3;
        }
        c48608uXs2.gEmmrt.setContentDisableColor(!getFieldNames().AkhnZx());
    }

    public final void fARcdN() {
        kotlin.Pair<java.lang.String, java.lang.String> pairValueOf = getFieldNames().valueOf();
        C48608uXs c48608uXs = this.AEQbTJ;
        C48608uXs c48608uXs2 = null;
        if (c48608uXs == null) {
            Intrinsics.gEmmrt("");
            c48608uXs = null;
        }
        c48608uXs.fetchVPNInfo.setActiveContent(pairValueOf.getFirst());
        C48608uXs c48608uXs3 = this.AEQbTJ;
        if (c48608uXs3 == null) {
            Intrinsics.gEmmrt("");
            c48608uXs3 = null;
        }
        c48608uXs3.fetchVPNInfo.setContentDisableColor(AkhnZx());
        C48608uXs c48608uXs4 = this.AEQbTJ;
        if (c48608uXs4 == null) {
            Intrinsics.gEmmrt("");
            c48608uXs4 = null;
        }
        c48608uXs4.isConnected.setActiveContent(pairValueOf.getSecond());
        C48608uXs c48608uXs5 = this.AEQbTJ;
        if (c48608uXs5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c48608uXs2 = c48608uXs5;
        }
        c48608uXs2.isConnected.setContentDisableColor(AkhnZx());
        AEQbTJ();
    }

    public final void OLrzqt(@NotNull GridReq gridReq, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(gridReq, "");
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd(gridReq, str);
        values();
    }

    public final void EZpvd(@NotNull GridReq gridReq, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(gridReq, "");
        Intrinsics.checkNotNullParameter(str, "");
        gridReq.getSignParams().clear();
        gridReq.setTrailingUpConfig(null);
        gridReq.setTrailingDownConfig(null);
        gridReq.setTpTriggerPx(null);
        gridReq.setSlTriggerPx(null);
        gridReq.setEarnParam(null);
        gridReq.setTpslTriggerParamReq(new TpSlTriggerParamReqResp((java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, 7, (DefaultConstructorMarker) null));
        getFieldNames().AEQbTJ(gridReq, str);
        AuCTel();
        fARcdN();
        fetchVPNInfo();
    }

    public final void setControlSelectedListener(final Function1<? super java.lang.String, Unit> function1) {
        C48608uXs c48608uXs = this.AEQbTJ;
        if (c48608uXs == null) {
            Intrinsics.gEmmrt("");
            c48608uXs = null;
        }
        c48608uXs.OLrzqt.setControlSelectedListener(new Function1() { // from class: o.vSz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50553vSr.AEQbTJ(function1, this, (java.lang.String) obj);
            }
        });
    }

    public static final Unit AEQbTJ(Function1 function1, C50553vSr c50553vSr, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (function1 != null) {
            function1.invoke(str);
        }
        onTrackClickEvent$default(c50553vSr, null, Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1") ? "arithmetic" : "geometric", 1, null);
        return Unit.INSTANCE;
    }

    public final void setControlSelected(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C48608uXs c48608uXs = this.AEQbTJ;
        if (c48608uXs == null) {
            Intrinsics.gEmmrt("");
            c48608uXs = null;
        }
        c48608uXs.OLrzqt.setControlSelected(str);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xvO.trailingUpPxError$default(com.okinc.unify_trade.biz.GridReq, java.lang.String, boolean, int, java.lang.Object):java.lang.String */
    public final void AEQbTJ() {
        SpotGridTpSlConfig spotGridTpSlConfig;
        java.lang.String strAYXKKw;
        java.lang.String strInvoke;
        SpotGridTpSlConfig spotGridTpSlConfig2;
        java.lang.String strAYXKKw2;
        C55872xsD fieldNames = getFieldNames();
        C48608uXs c48608uXs = this.AEQbTJ;
        C48608uXs c48608uXs2 = null;
        if (c48608uXs == null) {
            Intrinsics.gEmmrt("");
            c48608uXs = null;
        }
        C53573wnz c53573wnz = c48608uXs.AhwBna;
        GridReq gridReqCopydefault = fieldNames.copydefault();
        TrailingPxResp trailingPxRespGEmmrt = fieldNames.gEmmrt();
        c53573wnz.setInputErrorMsg(C56042xvO.trailingUpPxError$default(gridReqCopydefault, trailingPxRespGEmmrt != null ? trailingPxRespGEmmrt.getMaxTrailingUpPx() : null, false, 4, null));
        C48608uXs c48608uXs3 = this.AEQbTJ;
        if (c48608uXs3 == null) {
            Intrinsics.gEmmrt("");
            c48608uXs3 = null;
        }
        C53573wnz c53573wnz2 = c48608uXs3.AYXKKw;
        GridReq gridReqCopydefault2 = fieldNames.copydefault();
        TrailingPxResp trailingPxRespGEmmrt2 = fieldNames.gEmmrt();
        c53573wnz2.setInputErrorMsg(C56042xvO.trailingDownPxError$default(gridReqCopydefault2, trailingPxRespGEmmrt2 != null ? trailingPxRespGEmmrt2.getMinTrailingDownPx() : null, false, 4, null));
        C48608uXs c48608uXs4 = this.AEQbTJ;
        if (c48608uXs4 == null) {
            Intrinsics.gEmmrt("");
            c48608uXs4 = null;
        }
        c48608uXs4.fetchVPNInfo.setInputErrorMsg(C56042xvO.OLrzqt(fieldNames.copydefault()));
        C48608uXs c48608uXs5 = this.AEQbTJ;
        if (c48608uXs5 == null) {
            Intrinsics.gEmmrt("");
            c48608uXs5 = null;
        }
        c48608uXs5.isConnected.setInputErrorMsg(C56042xvO.KWHzl(fieldNames.copydefault()));
        C55850xri c55850xri = this.gEmmrt;
        TpSlTriggerParam tpSlTriggerParamDjBIcL = fieldNames.djBIcL();
        StrategyConfigInfo strategyConfigInfoOLrzqt = getFieldNames().OLrzqt();
        if (strategyConfigInfoOLrzqt == null || (spotGridTpSlConfig = strategyConfigInfoOLrzqt.getTpslConfig()) == null) {
            spotGridTpSlConfig = new SpotGridTpSlConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
        }
        C54782xVc c54782xVc = C54782xVc.AEQbTJ;
        xMJ.Application value = c54782xVc.AhwBna().getValue();
        if (value == null || (strAYXKKw = value.AYXKKw()) == null) {
            strAYXKKw = "";
        }
        java.lang.String strAEQbTJ = c55850xri.AEQbTJ(tpSlTriggerParamDjBIcL, spotGridTpSlConfig, strAYXKKw);
        C48608uXs c48608uXs6 = this.AEQbTJ;
        if (c48608uXs6 == null) {
            Intrinsics.gEmmrt("");
            c48608uXs6 = null;
        }
        c48608uXs6.values.setInputErrorMsg(strAEQbTJ);
        C55850xri c55850xri2 = this.gEmmrt;
        TpSlTriggerParam tpSlTriggerParamDjBIcL2 = fieldNames.djBIcL();
        Function0<java.lang.String> function0 = this.valueOf;
        if (function0 == null || (strInvoke = function0.invoke()) == null) {
            strInvoke = "0";
        }
        StrategyConfigInfo strategyConfigInfoOLrzqt2 = getFieldNames().OLrzqt();
        if (strategyConfigInfoOLrzqt2 == null || (spotGridTpSlConfig2 = strategyConfigInfoOLrzqt2.getTpslConfig()) == null) {
            spotGridTpSlConfig2 = new SpotGridTpSlConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 31, (DefaultConstructorMarker) null);
        }
        xMJ.Application value2 = c54782xVc.AhwBna().getValue();
        if (value2 == null || (strAYXKKw2 = value2.AYXKKw()) == null) {
            strAYXKKw2 = "";
        }
        java.lang.String strEZpvd = c55850xri2.EZpvd(tpSlTriggerParamDjBIcL2, strInvoke, spotGridTpSlConfig2, strAYXKKw2);
        C48608uXs c48608uXs7 = this.AEQbTJ;
        if (c48608uXs7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c48608uXs2 = c48608uXs7;
        }
        c48608uXs2.djBIcL.setInputErrorMsg(strEZpvd);
    }

    public final boolean DbNXlk() {
        C48608uXs c48608uXs = this.AEQbTJ;
        C48608uXs c48608uXs2 = null;
        if (c48608uXs == null) {
            Intrinsics.gEmmrt("");
            c48608uXs = null;
        }
        boolean zEZpvd = c48608uXs.AhwBna.EZpvd();
        C48608uXs c48608uXs3 = this.AEQbTJ;
        if (c48608uXs3 == null) {
            Intrinsics.gEmmrt("");
            c48608uXs3 = null;
        }
        boolean zEZpvd2 = c48608uXs3.AYXKKw.EZpvd();
        C48608uXs c48608uXs4 = this.AEQbTJ;
        if (c48608uXs4 == null) {
            Intrinsics.gEmmrt("");
            c48608uXs4 = null;
        }
        boolean zEZpvd3 = c48608uXs4.fetchVPNInfo.EZpvd();
        C48608uXs c48608uXs5 = this.AEQbTJ;
        if (c48608uXs5 == null) {
            Intrinsics.gEmmrt("");
            c48608uXs5 = null;
        }
        boolean zEZpvd4 = c48608uXs5.isConnected.EZpvd();
        C48608uXs c48608uXs6 = this.AEQbTJ;
        if (c48608uXs6 == null) {
            Intrinsics.gEmmrt("");
            c48608uXs6 = null;
        }
        boolean zEZpvd5 = c48608uXs6.values.EZpvd();
        C48608uXs c48608uXs7 = this.AEQbTJ;
        if (c48608uXs7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c48608uXs2 = c48608uXs7;
        }
        return zEZpvd || zEZpvd2 || zEZpvd3 || zEZpvd4 || zEZpvd5 || c48608uXs2.djBIcL.EZpvd();
    }

    public final boolean isConnected() {
        boolean z = false;
        boolean z2 = C33129mqd.OLrzqt((java.lang.CharSequence) getFieldNames().copydefault().getMinPx()) && C33129mqd.OLrzqt((java.lang.CharSequence) getFieldNames().copydefault().getMaxPx()) && C33129mqd.OLrzqt((java.lang.CharSequence) getFieldNames().copydefault().getGridNum());
        Function1<? super java.lang.Boolean, java.lang.Boolean> function1 = this.AkhnZx;
        if (function1 != null && !function1.invoke(java.lang.Boolean.valueOf(z2)).booleanValue()) {
            z = true;
        }
        return !z;
    }

    public final ActivityResultLauncher<android.content.Intent> AYXKKw() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = ViewKt.findFragment(this).registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.vSv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C50553vSr.KWHzl(this.EZpvd, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        return activityResultLauncherRegisterForActivityResult;
    }

    public static final void KWHzl(C50553vSr c50553vSr, ActivityResult activityResult) {
        android.content.Intent data;
        android.os.Bundle extras;
        Function0<Unit> function0;
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null || (extras = data.getExtras()) == null) {
            return;
        }
        c50553vSr.getFieldNames().EZpvd(extras);
        c50553vSr.fARcdN();
        if (!Intrinsics.EZpvd((java.lang.Object) extras.getString("type"), (java.lang.Object) TtmlNode.START) || (function0 = c50553vSr.AuCTel) == null) {
            return;
        }
        function0.invoke();
    }

    public final boolean AkhnZx() {
        return Intrinsics.EZpvd((java.lang.Object) getFieldNames().EZpvd(), (java.lang.Object) "default_usdt");
    }

    public final void gEmmrt() {
        getFieldNames().copydefault().setTrailingUpConfig(null);
        getFieldNames().copydefault().setTrailingDownConfig(null);
        AuCTel();
    }

    public static /* synthetic */ void onTrackClickEvent$default(C50553vSr c50553vSr, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        c50553vSr.EZpvd(str, str2);
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2) {
        C55867xrz.KWHzl.copydefault("grid", str, str2);
    }

    public final TpSlTriggerParam valueOf() {
        return getFieldNames().djBIcL();
    }
}
