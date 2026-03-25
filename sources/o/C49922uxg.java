package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.manager.MarginModeManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import o.C54520xLl;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uxg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49922uxg extends AbstractC49393unh {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public Function1<? super java.lang.String, Unit> AEQbTJ;
    public Function1<? super TradePositionManager.MarginModeType, Unit> AhwBna;
    public java.lang.String EZpvd;
    public BizInstrument KWHzl;
    public java.lang.String OLrzqt;
    public yHO<? super android.app.Activity, ? super java.lang.String, ? super java.lang.String, Unit> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull Function1<? super TradePositionManager.MarginModeType, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AhwBna = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> */
    public final Function1<java.lang.String, Unit> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function1<? super java.lang.String, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49393unh
    public java.lang.String djBIcL() {
        return "SwitchMarginModeBottomSheetFragment";
    }

    /* JADX INFO: renamed from: o.uxg$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uxg.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C49922uxg newInstance$default(Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, yHO yho, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                str3 = null;
            }
            return activity.AEQbTJ(str, str2, str3, yho);
        }

        public final C49922uxg AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull yHO<? super android.app.Activity, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
            Intrinsics.checkNotNullParameter(yho, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("marginCoin", str3);
            bundle.putString("instId", str);
            bundle.putString("bizType", str2);
            C49922uxg c49922uxg = new C49922uxg();
            c49922uxg.setArguments(bundle);
            c49922uxg.valueOf = yho;
            return c49922uxg;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(0);
        android.os.Bundle arguments = getArguments();
        BizInstrument suggestedInstrument$default = null;
        this.EZpvd = arguments != null ? arguments.getString("instId") : null;
        android.os.Bundle arguments2 = getArguments();
        this.OLrzqt = arguments2 != null ? arguments2.getString("bizType") : null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            java.lang.String str = this.OLrzqt;
            suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str == null ? "" : str, this.EZpvd, null, null, 12, null);
        }
        this.KWHzl = suggestedInstrument$default;
    }

    public static /* synthetic */ void reportUserBehavior$default(C49922uxg c49922uxg, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        c49922uxg.copydefault(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(java.lang.String str, java.lang.String str2) {
        C54520xLl c54520xLl = C54520xLl.KWHzl;
        java.lang.String str3 = this.EZpvd;
        java.lang.String str4 = str3 == null ? "" : str3;
        java.lang.String str5 = this.OLrzqt;
        java.lang.String str6 = str5 == null ? "" : str5;
        java.util.Map mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt("selected_margin_mode", str));
        if (str2 != null) {
            mapDjBIcL.put("selected_margin_coin", str);
        }
        Unit unit = Unit.INSTANCE;
        c54520xLl.AEQbTJ(new C54520xLl.Activity("user", "click", "switch_margin_mode", str4, str6, mapDjBIcL));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        MarginModeManager marginModeManagerIsConnected;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        TradePositionManager.MarginModeType marginModeTypeCopydefault = null;
        C32866mlf.onEvent$default("PlaceOrder_Top_MarginModePage_View", (TrackChannel[]) null, new Function1() { // from class: o.uxe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49922uxg.AEQbTJ(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        super.onCreateContent(constraintLayout);
        AbstractC49540uqV abstractC49540uqV = (AbstractC49540uqV) DataBindingUtil.inflate(android.view.LayoutInflater.from(requireContext()), C49511upt.StateListAnimator.getNewProxyInstance, constraintLayout, false);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt.isConnected()) != null) {
            marginModeTypeCopydefault = marginModeManagerIsConnected.copydefault(this.KWHzl);
        }
        android.widget.LinearLayout linearLayout = abstractC49540uqV.OLrzqt;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o.uxf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C49922uxg.AEQbTJ(this.copydefault, view);
            }
        });
        Intrinsics.copydefault(linearLayout);
        OLrzqt(linearLayout, marginModeTypeCopydefault == TradePositionManager.MarginModeType.CROSSED);
        android.widget.LinearLayout linearLayout2 = abstractC49540uqV.AEQbTJ;
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: o.uxc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C49922uxg.OLrzqt(this.KWHzl, view);
            }
        });
        Intrinsics.copydefault(linearLayout2);
        OLrzqt(linearLayout2, marginModeTypeCopydefault == TradePositionManager.MarginModeType.ISOLATED);
        if (AEQbTJ()) {
            abstractC49540uqV.AhwBna.setVisibility(0);
            abstractC49540uqV.AhwBna.setOnClickListener(new View.OnClickListener() { // from class: o.uxh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C49922uxg.AhwBna(this.EZpvd, view);
                }
            });
        } else {
            abstractC49540uqV.AhwBna.setVisibility(8);
        }
        Intrinsics.copydefault(abstractC49540uqV);
        OLrzqt(abstractC49540uqV);
        constraintLayout.addView(abstractC49540uqV.getRoot());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(C49922uxg c49922uxg, EventParamsList eventParamsList) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String str2 = c49922uxg.OLrzqt;
        if (str2 != null) {
            java.lang.String lowerCase = str2.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            str = lowerCase == null ? "" : lowerCase;
        }
        EventParamsList.put$default(eventParamsList, "biz_type", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C49922uxg c49922uxg, android.view.View view) {
        c49922uxg.copydefault("cross");
        Function1<? super TradePositionManager.MarginModeType, Unit> function1 = c49922uxg.AhwBna;
        if (function1 != null) {
            function1.invoke(TradePositionManager.MarginModeType.CROSSED);
        }
        reportUserBehavior$default(c49922uxg, "cross", null, 2, null);
        Intrinsics.copydefault(view);
        C49402unq.copydefault(view, "switch_mgn_mode", C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.MODE, "cross")), new java.lang.Class[0]);
        c49922uxg.dismissAllowingStateLoss();
    }

    public static final void OLrzqt(C49922uxg c49922uxg, android.view.View view) {
        c49922uxg.copydefault("isolated");
        Function1<? super TradePositionManager.MarginModeType, Unit> function1 = c49922uxg.AhwBna;
        if (function1 != null) {
            function1.invoke(TradePositionManager.MarginModeType.ISOLATED);
        }
        reportUserBehavior$default(c49922uxg, "isolated", null, 2, null);
        Intrinsics.copydefault(view);
        C49402unq.copydefault(view, "switch_mgn_mode", C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.MODE, "isolated")), new java.lang.Class[0]);
        c49922uxg.dismissAllowingStateLoss();
    }

    public static final void AhwBna(C49922uxg c49922uxg, android.view.View view) {
        yHO<? super android.app.Activity, ? super java.lang.String, ? super java.lang.String, Unit> yho;
        c49922uxg.copydefault("margin_mode_settings");
        FragmentActivity activity = c49922uxg.getActivity();
        if (activity != null && (yho = c49922uxg.valueOf) != null) {
            java.lang.String str = c49922uxg.OLrzqt;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = c49922uxg.EZpvd;
            yho.invoke(activity, str, str2 != null ? str2 : "");
        }
        Intrinsics.copydefault(view);
        C49402unq.reportTrack$default(view, "change_margin_mode_activity", null, new java.lang.Class[0], 2, null);
        c49922uxg.dismissAllowingStateLoss();
    }

    private final void copydefault(final java.lang.String str) {
        C32866mlf.onEvent$default("PlaceOrder_Top_MarginModePage_Click", (TrackChannel[]) null, new Function1() { // from class: o.uxd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49922uxg.EZpvd(this.EZpvd, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(C49922uxg c49922uxg, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String str2 = c49922uxg.OLrzqt;
        EventParamsList.put$default(eventParamsList, "biz_type", str2 == null ? "" : str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(AbstractC49540uqV abstractC49540uqV) {
        java.lang.String string;
        MarginModeManager marginModeManagerIsConnected;
        if (copydefault()) {
            android.widget.LinearLayout linearLayout = abstractC49540uqV.copydefault;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(0);
            C54984xbQ c54984xbQ = abstractC49540uqV.KWHzl;
            BizInstrument bizInstrument = this.KWHzl;
            TradePositionManager.MarginModeType marginModeTypeCopydefault = null;
            c54984xbQ.setText(bizInstrument != null ? bizInstrument.getQuoteSymbol() : null);
            C54984xbQ c54984xbQ2 = abstractC49540uqV.EZpvd;
            BizInstrument bizInstrument2 = this.KWHzl;
            c54984xbQ2.setText(bizInstrument2 != null ? bizInstrument2.getTradeSymbol() : null);
            android.os.Bundle arguments = getArguments();
            if (arguments == null || (string = arguments.getString("marginCoin")) == null) {
                string = "margin_quote";
            }
            if (Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) "margin_base")) {
                abstractC49540uqV.EZpvd.setSelectedStyle(true, 3);
                abstractC49540uqV.KWHzl.setSelectedStyle(false, 3);
            } else {
                abstractC49540uqV.EZpvd.setSelectedStyle(false, 3);
                abstractC49540uqV.KWHzl.setSelectedStyle(true, 3);
            }
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null && (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt.isConnected()) != null) {
                marginModeTypeCopydefault = marginModeManagerIsConnected.copydefault(this.KWHzl);
            }
            C54984xbQ c54984xbQ3 = abstractC49540uqV.KWHzl;
            TradePositionManager.MarginModeType marginModeType = marginModeTypeCopydefault;
            c54984xbQ3.setOnClickListener(new Application(c54984xbQ3, 1000L, this, marginModeType));
            C54984xbQ c54984xbQ4 = abstractC49540uqV.EZpvd;
            c54984xbQ4.setOnClickListener(new StateListAnimator(c54984xbQ4, 1000L, this, marginModeType));
            return;
        }
        android.widget.LinearLayout linearLayout2 = abstractC49540uqV.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout2.setVisibility(8);
    }

    /* JADX INFO: renamed from: o.uxg$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ TradePositionManager.MarginModeType AEQbTJ;
        public final /* synthetic */ C49922uxg KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C49922uxg c49922uxg, TradePositionManager.MarginModeType marginModeType) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c49922uxg;
            this.AEQbTJ = marginModeType;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String strName;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C49922uxg c49922uxg = this.KWHzl;
                TradePositionManager.MarginModeType marginModeType = this.AEQbTJ;
                if (marginModeType == null || (strName = marginModeType.name()) == null) {
                    strName = "";
                }
                c49922uxg.copydefault(strName, "margin_quote");
                Function1<java.lang.String, Unit> function1KWHzl = this.KWHzl.KWHzl();
                if (function1KWHzl != null) {
                    function1KWHzl.invoke("margin_quote");
                }
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.uxg$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ TradePositionManager.MarginModeType EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C49922uxg copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C49922uxg c49922uxg, TradePositionManager.MarginModeType marginModeType) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = c49922uxg;
            this.EZpvd = marginModeType;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String strName;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C49922uxg c49922uxg = this.copydefault;
                TradePositionManager.MarginModeType marginModeType = this.EZpvd;
                if (marginModeType == null || (strName = marginModeType.name()) == null) {
                    strName = "";
                }
                c49922uxg.copydefault(strName, "margin_base");
                Function1<java.lang.String, Unit> function1KWHzl = this.copydefault.KWHzl();
                if (function1KWHzl != null) {
                    function1KWHzl.invoke("margin_base");
                }
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    public final boolean copydefault() {
        java.lang.String marginMode$default;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        MarginModeManager marginModeManagerIsConnected;
        if (!Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) "MARGIN")) {
            return false;
        }
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 == null || (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt2.isConnected()) == null) {
            marginMode$default = null;
        } else {
            java.lang.String str = this.EZpvd;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = this.OLrzqt;
            if (str2 == null) {
                str2 = "";
            }
            marginMode$default = MarginModeManager.getMarginMode$default(marginModeManagerIsConnected, str, str2, null, false, null, 28, null);
        }
        if (!Intrinsics.EZpvd((java.lang.Object) marginMode$default, (java.lang.Object) "cross")) {
            return Intrinsics.EZpvd((java.lang.Object) marginMode$default, (java.lang.Object) "isolated") && (interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt()) != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && newProxyInstance.DbNXlk();
        }
        C54794xVo c54794xVo = C54794xVo.copydefault;
        return c54794xVo.valueOf() | c54794xVo.AhwBna();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AEQbTJ() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        xOW newProxyInstance = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.getNewProxyInstance() : null;
        if (newProxyInstance == null || !newProxyInstance.AhwBna()) {
            if (newProxyInstance == null || !newProxyInstance.AuCTel()) {
                BizInstrument bizInstrument = this.KWHzl;
                if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getInstType() : null), (java.lang.Object) "SPOT")) {
                    BizInstrument bizInstrument2 = this.KWHzl;
                    if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument2 != null ? bizInstrument2.getInstType() : null), (java.lang.Object) "OPTION")) {
                        return true;
                    }
                }
            } else {
                BizInstrument bizInstrument3 = this.KWHzl;
                if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument3 != null ? bizInstrument3.getInstType() : null), (java.lang.Object) "SPOT")) {
                    BizInstrument bizInstrument4 = this.KWHzl;
                    if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument4 != null ? bizInstrument4.getInstType() : null), (java.lang.Object) "MARGIN")) {
                    }
                }
            }
        }
        return false;
    }

    public final void OLrzqt(android.widget.LinearLayout linearLayout, boolean z) {
        linearLayout.setBackgroundResource(z ? C49511upt.TaskDescription.valueOf : C49511upt.TaskDescription.AYXKKw);
    }
}
