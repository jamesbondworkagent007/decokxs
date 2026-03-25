package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradingbot.impl.order.strategy.smarticeberg.presenter.SmartIcebergLimitPricePresenter;
import com.okinc.unify_trade.biz.DigitInfoBean;
import com.okinc.unify_trade.biz.IceBergReq;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wes, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C53089wes extends AbstractC49945uyC<AbstractC48596uXg, SmartIcebergLimitPricePresenter> {
    public final int AEQbTJ = C48033uCm.Activity.sYcwUD;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.wev
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53089wes.OLrzqt(this.KWHzl);
        }
    });
    public IceBergReq OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull IceBergReq iceBergReq) {
        Intrinsics.checkNotNullParameter(iceBergReq, "");
        this.OLrzqt = iceBergReq;
    }

    public static final /* synthetic */ AbstractC48596uXg EZpvd(C53089wes c53089wes) {
        return c53089wes.values();
    }

    public final IceBergReq copydefault() {
        IceBergReq iceBergReq = this.OLrzqt;
        if (iceBergReq != null) {
            return iceBergReq;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    private final C55887xsS fARcdN() {
        return (C55887xsS) this.KWHzl.getValue();
    }

    public static final C55887xsS OLrzqt(C53089wes c53089wes) {
        java.lang.String string;
        java.lang.String string2;
        android.os.Bundle arguments = c53089wes.getArguments();
        java.lang.String str = "";
        if (arguments == null || (string = arguments.getString("bot_inst_type")) == null) {
            string = "";
        }
        android.os.Bundle arguments2 = c53089wes.getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("bot_inst_id")) != null) {
            str = string2;
        }
        return new C55887xsS(string, str);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AuCTel();
        ejfBZ();
        fJNWhG();
    }

    private final void AuCTel() {
        IceBergReq iceBergReq;
        IceBergReq iceBergReq2;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (iceBergReq2 = (IceBergReq) arguments.getParcelable("bot_grid_req")) == null || (iceBergReq = (IceBergReq) xVA.EZpvd(iceBergReq2)) == null) {
            iceBergReq = new IceBergReq((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 4095, (DefaultConstructorMarker) null);
        }
        OLrzqt(iceBergReq);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.AlertController1));
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new ActionBar(imageViewKWHzl, 1000L, this));
    }

    private final void ejfBZ() {
        final C47988uAv c47988uAv = values().OLrzqt;
        C47988uAv.setInputContent$default(c47988uAv, copydefault().getPxLimit(), false, false, 6, null);
        DigitInfoBean digitInfoBeanIsConnected = fARcdN().isConnected();
        c47988uAv.setInputUnit(digitInfoBeanIsConnected.getSymbol());
        c47988uAv.setMaxDecimal(digitInfoBeanIsConnected.getDigit());
        c47988uAv.KWHzl(new uBH(new Function0() { // from class: o.wet
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53089wes.copydefault(this.KWHzl, c47988uAv);
            }
        }));
        c47988uAv.OLrzqt(new Function2() { // from class: o.wer
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53089wes.copydefault((C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
    }

    public static final Unit copydefault(C53089wes c53089wes, C47988uAv c47988uAv) {
        c53089wes.copydefault().setPxLimit(c47988uAv.AkhnZx());
        if (c47988uAv.hasFocus()) {
            c47988uAv.setInputErrorMsg(xVK.EZpvd.EZpvd(c47988uAv.AkhnZx(), c53089wes.fARcdN().gEmmrt(), c53089wes.fARcdN().djBIcL()));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C47988uAv c47988uAv, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (!z && c47988uAv.AkhnZx().length() > 0) {
            C32866mlf.onEvent$default("IcebergBotPlaceOrder_Full_InputBox_Input", (TrackChannel[]) null, new Function1() { // from class: o.weA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53089wes.copydefault((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("input_type", "limit_price", true);
        return Unit.INSTANCE;
    }

    private final void fJNWhG() {
        C52794wYp c52794wYp = values().copydefault;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void isConnected() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: o.wes$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C53089wes EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C53089wes c53089wes) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c53089wes;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.isConnected();
            }
        }
    }

    /* JADX INFO: renamed from: o.wes$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C53089wes AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C53089wes c53089wes) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = c53089wes;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C53089wes.EZpvd(this.AEQbTJ).OLrzqt.AEQbTJ();
                C53089wes.EZpvd(this.AEQbTJ).OLrzqt.AuCTelauCTel();
                if (C33129mqd.valueOf(this.AEQbTJ.copydefault().getPxLimit(), 0)) {
                    this.AEQbTJ.copydefault().setPxLimit("");
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putParcelable("bot_grid_req", this.AEQbTJ.copydefault());
                this.AEQbTJ.getParentFragmentManager().setFragmentResult("limit_price_setting", bundle);
                this.AEQbTJ.isConnected();
            }
        }
    }
}
