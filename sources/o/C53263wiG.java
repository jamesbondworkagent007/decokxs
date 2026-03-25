package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaAdvancedParams;
import com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaManualPresenter;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wiG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53263wiG extends AbstractC49945uyC<AbstractC48605uXp, SpotDcaManualPresenter> {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final int AEQbTJ = C48033uCm.Activity.fTEjYi;
    public SpotDcaAdvancedParams copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.AEQbTJ;
    }

    @Override // o.AbstractC49945uyC
    public boolean AkhnZx() {
        return true;
    }

    public static final /* synthetic */ AbstractC48605uXp OLrzqt(C53263wiG c53263wiG) {
        return c53263wiG.values();
    }

    /* JADX INFO: renamed from: o.wiG$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wiG.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            new C53263wiG().show(fragmentManager, "SpotDcaStopLossModifyDialog");
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fJNWhG();
        fARcdN();
        AuCTel();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.DwQSDd));
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Activity(imageViewKWHzl, 1000L, this));
    }

    private final void fJNWhG() {
        SpotDcaAdvancedParams value = OLrzqt().valueOf().getValue();
        this.copydefault = value != null ? SpotDcaAdvancedParams.copy$default(value, null, null, null, null, null, null, null, 127, null) : null;
    }

    private final void fARcdN() {
        java.lang.String min;
        java.lang.String max;
        java.lang.String strEZpvd;
        BotRangeConfig slPct;
        BotRangeConfig slPct2;
        C47988uAv c47988uAv = values().copydefault;
        c47988uAv.setMaxDecimal(2);
        StrategyConfigInfo value = OLrzqt().KWHzl().getValue();
        C52658wTo c52658wTo = C52658wTo.AEQbTJ;
        Intrinsics.copydefault(c47988uAv);
        xMR xmr = xMR.copydefault;
        if (value == null || (slPct2 = value.getSlPct()) == null || (min = slPct2.getMin()) == null) {
            min = "0.0005";
        }
        java.lang.String hundredfold$default = xMR.formatHundredfold$default(xmr, min, 0, false, null, 14, null);
        if (value == null || (slPct = value.getSlPct()) == null || (max = slPct.getMax()) == null) {
            max = "0.9999";
        }
        java.lang.String hundredfold$default2 = xMR.formatHundredfold$default(xmr, max, 0, false, null, 14, null);
        SpotDcaAdvancedParams spotDcaAdvancedParams = this.copydefault;
        c52658wTo.copydefault(c47988uAv, new BotRangeConfig(hundredfold$default, hundredfold$default2, xMR.formatHundredfold$default(xmr, (spotDcaAdvancedParams == null || (strEZpvd = spotDcaAdvancedParams.EZpvd()) == null) ? "" : strEZpvd, 0, false, null, 14, null), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 56, (DefaultConstructorMarker) null), (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, new Function1() { // from class: o.wiH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53263wiG.AEQbTJ((java.lang.String) obj);
            }
        });
        c47988uAv.setOnTextChangeCallback(new Function2() { // from class: o.wiF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53263wiG.KWHzl(this.OLrzqt, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        c47988uAv.setOnFocusChangeCallback(new Function2() { // from class: o.wiD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53263wiG.copydefault(this.OLrzqt, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) OLrzqt().ejfBZ().getValue()) || Intrinsics.EZpvd(OLrzqt().djBIcL().getValue(), java.lang.Boolean.TRUE)) {
            return;
        }
        android.widget.TextView textView = values().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        android.widget.TextView textView2 = values().AEQbTJ;
        java.lang.String value2 = OLrzqt().ejfBZ().getValue();
        if (value2 == null) {
            value2 = "";
        }
        textView2.setText(value2);
        C47988uAv.setInputErrorMsg$default(values().copydefault, null, 1, null);
    }

    public static final java.lang.String AEQbTJ(java.lang.String str) {
        if (str == null) {
            return null;
        }
        xMR xmr = xMR.copydefault;
        return xMR.formatICUPercent$default(xmr, xmr.OLrzqt((java.lang.Object) str), RoundingMode.DOWN, null, null, null, null, 60, null);
    }

    public static final Unit KWHzl(C53263wiG c53263wiG, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        c53263wiG.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C53263wiG c53263wiG, C47988uAv c47988uAv, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (!z && C33129mqd.OLrzqt((java.lang.CharSequence) c47988uAv.AkhnZx())) {
            c53263wiG.copydefault("sl_target");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean copydefault() {
        if (values().copydefault.uzCIH()) {
            values().copydefault.copydefault();
            return true;
        }
        C52658wTo c52658wTo = C52658wTo.AEQbTJ;
        C47988uAv c47988uAv = values().copydefault;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        c52658wTo.OLrzqt(c47988uAv, "%");
        return !values().copydefault.getFieldNames();
    }

    private final void AuCTel() {
        C52794wYp c52794wYp = values().KWHzl;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void isConnected() {
        values().copydefault.AEQbTJ();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    private final void copydefault(final java.lang.String str) {
        C32866mlf.onEvent$default("DCABotPlaceOrder_AdvancedSetting_InputBox_Input", (TrackChannel[]) null, new Function1() { // from class: o.wiI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53263wiG.copydefault(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("bot_type", "spot_dca", true);
        eventParamsList.put("input_type", str, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wiG$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C53263wiG KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C53263wiG c53263wiG) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = c53263wiG;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (this.KWHzl.copydefault()) {
                    java.lang.String strAkhnZx = C53263wiG.OLrzqt(this.KWHzl).copydefault.AkhnZx();
                    SpotDcaAdvancedParams spotDcaAdvancedParams = this.KWHzl.copydefault;
                    if (spotDcaAdvancedParams != null) {
                        spotDcaAdvancedParams.AEQbTJ(C33129mqd.AEQbTJ(strAkhnZx, 0) ? xMR.formatHundredQuot$default(xMR.copydefault, strAkhnZx, 0, false, null, 14, null) : "");
                    }
                    SpotDcaAdvancedParams spotDcaAdvancedParams2 = this.KWHzl.copydefault;
                    if (spotDcaAdvancedParams2 != null) {
                        this.KWHzl.OLrzqt().AEQbTJ(spotDcaAdvancedParams2);
                    }
                    this.KWHzl.isConnected();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wiG$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C53263wiG AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C53263wiG c53263wiG) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = c53263wiG;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.isConnected();
            }
        }
    }
}
