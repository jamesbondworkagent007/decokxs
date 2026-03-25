package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaMakeOrderConfirmPresenter;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.bot.config.TimeFrame;
import com.okinc.unify_trade.bot.config.TriggerCond;
import com.okinc.unify_trade.bot.data.LabelData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wiB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C53258wiB extends AbstractC49945uyC<uZS, SpotDcaMakeOrderConfirmPresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final boolean KWHzl = true;
    public Function0<Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return C48033uCm.Activity.gFTCsA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.KWHzl;
    }

    public static final /* synthetic */ uZS EZpvd(C53258wiB c53258wiB) {
        return c53258wiB.values();
    }

    /* JADX INFO: renamed from: o.wiB$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wiB.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void OLrzqt(@NotNull DcaOrderReq dcaOrderReq, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(dcaOrderReq, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(function0, "");
            C53258wiB c53258wiB = new C53258wiB();
            c53258wiB.OLrzqt = function0;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("ket_order_req", dcaOrderReq);
            c53258wiB.setArguments(bundle);
            c53258wiB.show(fragmentManager, "SpotDcaMakeOrderConfirmDialog");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01b5  */
    @Override // o.wXX, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String instType;
        java.lang.String instId;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        final DcaOrderReq dcaOrderReq = arguments != null ? (DcaOrderReq) arguments.getParcelable("ket_order_req") : null;
        RecyclerView recyclerView = values().AEQbTJ;
        int i = 0;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(TacticsInsideItemData.class, new C52510wOb(null, null, new Function0() { // from class: o.wiy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53258wiB.copydefault(dcaOrderReq, this);
            }
        }));
        c59534zip.register(LabelData.class, new C51278vjx());
        c59534zip.register(AutoVipProfitInfo.class, new C54145wyo(16, false, 2, null));
        recyclerView.setAdapter(c59534zip);
        C33064mpR.OLrzqt(c59534zip, (java.util.List<? extends java.lang.Object>) OLrzqt().AEQbTJ(dcaOrderReq));
        if (C33129mqd.valueOf(dcaOrderReq != null ? dcaOrderReq.getMaxSafetyOrds() : null, 1)) {
            android.widget.TextView textView = values().gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
        } else {
            android.widget.TextView textView2 = values().OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility((dcaOrderReq != null ? Intrinsics.EZpvd(dcaOrderReq.getReserveFunds(), java.lang.Boolean.TRUE) : false) ^ true ? 0 : 8);
            android.widget.TextView textView3 = values().copydefault;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility((dcaOrderReq != null ? Intrinsics.EZpvd(dcaOrderReq.getReserveFunds(), java.lang.Boolean.TRUE) : false) ^ true ? 0 : 8);
            android.widget.TextView textView4 = values().gEmmrt;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            textView4.setVisibility((dcaOrderReq == null || !Intrinsics.EZpvd(dcaOrderReq.getReserveFunds(), java.lang.Boolean.TRUE)) ? 8 : 0);
            android.widget.TextView textView5 = values().OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView5, "");
            if (textView5.getVisibility() == 0) {
                android.widget.TextView textView6 = values().gEmmrt;
                Intrinsics.checkNotNullExpressionValue(textView6, "");
                C57681ymx.margin$default(textView6, null, java.lang.Float.valueOf(8.0f), null, null, 13, null);
            } else {
                android.widget.TextView textView7 = values().gEmmrt;
                Intrinsics.checkNotNullExpressionValue(textView7, "");
                C57681ymx.margin$default(textView7, null, java.lang.Float.valueOf(16.0f), null, null, 13, null);
            }
        }
        values().copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.wiC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C53258wiB.KWHzl(this.EZpvd, view2);
            }
        });
        values().KWHzl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.wiz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C53258wiB.OLrzqt(this.copydefault, compoundButton, z);
            }
        });
        values().AYXKKw.setText(C56033xvF.getCoinTitle$default((dcaOrderReq == null || (instType = dcaOrderReq.getInstType()) == null) ? "" : instType, (dcaOrderReq == null || (instId = dcaOrderReq.getInstId()) == null) ? "" : instId, false, null, null, 28, null));
        android.widget.TextView textView8 = values().valueOf;
        Intrinsics.copydefault(textView8);
        if (C33129mqd.AhwBna(dcaOrderReq != null ? dcaOrderReq.getMaxSafetyOrds() : null, 0)) {
            if (!C33129mqd.AhwBna(dcaOrderReq != null ? dcaOrderReq.getMaxSafetyOrds() : null, 1)) {
            }
        } else {
            i = 8;
        }
        textView8.setVisibility(i);
        textView8.setText(C33070mpX.AYXKKw((dcaOrderReq == null || !Intrinsics.EZpvd(dcaOrderReq.getReserveFunds(), java.lang.Boolean.TRUE)) ? C55688xof.Application.QHmsKR : C55688xof.Application.DCUTEI));
    }

    public static final Unit copydefault(DcaOrderReq dcaOrderReq, C53258wiB c53258wiB) {
        java.lang.String timePeriod;
        java.lang.String timeframe;
        java.lang.String triggerCond;
        java.lang.String thold;
        java.util.List<DcaTriggerParam> triggerParams;
        DcaTriggerParam dcaTriggerParam = (dcaOrderReq == null || (triggerParams = dcaOrderReq.getTriggerParams()) == null) ? null : (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(triggerParams);
        int i = C55688xof.Application.setMediaUri;
        kotlin.Pair[] pairArr = new kotlin.Pair[4];
        java.lang.String str = "";
        if (dcaTriggerParam == null || (timePeriod = dcaTriggerParam.getTimePeriod()) == null) {
            timePeriod = "";
        }
        pairArr[0] = C56390yDp.OLrzqt("periodNum", c53258wiB.copydefault(timePeriod));
        TimeFrame.Application application = TimeFrame.Companion;
        if (dcaTriggerParam == null || (timeframe = dcaTriggerParam.getTimeframe()) == null) {
            timeframe = "";
        }
        pairArr[1] = C56390yDp.OLrzqt("chartTime", application.copydefault(timeframe));
        if (dcaTriggerParam == null || (triggerCond = dcaTriggerParam.getTriggerCond()) == null) {
            triggerCond = "";
        }
        pairArr[2] = C56390yDp.OLrzqt("triggerWhen", c53258wiB.KWHzl(triggerCond));
        if (dcaTriggerParam != null && (thold = dcaTriggerParam.getThold()) != null) {
            str = thold;
        }
        pairArr[3] = C56390yDp.OLrzqt("threshold", c53258wiB.OLrzqt(str));
        c53258wiB.AEQbTJ(C33069mpW.copydefault(c53258wiB, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(pairArr)));
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C53258wiB c53258wiB, android.view.View view) {
        android.widget.TextView textView = c53258wiB.values().gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        boolean z = !(textView.getVisibility() == 0);
        android.widget.TextView textView2 = c53258wiB.values().gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(z ? 0 : 8);
        c53258wiB.values().OLrzqt.setMaxLines(z ? Integer.MAX_VALUE : 2);
        c53258wiB.values().copydefault.setText(C33070mpX.AYXKKw(z ? C55688xof.Application.getNavigationItemCount : C55688xof.Application.getDisplayOptions));
    }

    public static final void OLrzqt(C53258wiB c53258wiB, android.widget.CompoundButton compoundButton, boolean z) {
        c53258wiB.values().KWHzl.setChecked(z);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.ruDxL));
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Activity(imageViewKWHzl, 1000L, this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        pUU.KWHzl("BotOrder", "二次确认页 SpotDca onDetach");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault() {
        C32866mlf.onEvent$default("BotPlaceOrder_Sheet_ConfirmOrder_Click", (TrackChannel[]) null, new Function1() { // from class: o.wiE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53258wiB.copydefault((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("button_type", "spot_dca", true);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, OtpEventTracker.OTP_EVENT_VALUE_CANCEL, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wiB$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C53258wiB copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C53258wiB c53258wiB) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = c53258wiB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt;
            C54630xPm c54630xPmAuCTelauCTel;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (C53258wiB.EZpvd(this.copydefault).KWHzl.isChecked() && (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) != null && (c54630xPmAuCTelauCTel = interfaceC54581xNrOLrzqt.AuCTelauCTel()) != null) {
                    C54630xPm.setOrderConfirm$default(c54630xPmAuCTelauCTel, false, null, 2, null);
                }
                Function0 function0 = this.copydefault.OLrzqt;
                if (function0 != null) {
                    function0.invoke();
                }
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.wiB$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C53258wiB copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C53258wiB c53258wiB) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = c53258wiB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.copydefault();
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    public final java.lang.String copydefault(java.lang.String str) {
        return (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) ? "--" : xMR.copydefault.copydefault(str);
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        return (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) ? "--" : TriggerCond.Companion.KWHzl(str);
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        return (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) ? "--" : xMR.copydefault.copydefault(str);
    }

    private final void AEQbTJ(java.lang.String str) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.EZpvd(str);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.fraLem), new View.OnClickListener() { // from class: o.wiA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53258wiB.OLrzqt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new ActionBar(c52794wYpCopydefault, 1000L, this));
        }
    }
}
