package o;

import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.tradingbot.impl.order.strategy.contractdca.presenter.ContractDcaMakeOrderConfirmPresenter;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.bot.data.LabelData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class vDY extends AbstractC49945uyC<AbstractC48662uZs, ContractDcaMakeOrderConfirmPresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final boolean AEQbTJ = true;
    public Function0<Unit> OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return C48033uCm.Activity.dXcUrg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.AEQbTJ;
    }

    public static final /* synthetic */ AbstractC48662uZs OLrzqt(vDY vdy) {
        return vdy.values();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vDY.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void AEQbTJ(@NotNull DcaOrderReq dcaOrderReq, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(dcaOrderReq, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(function0, "");
            vDY vdy = new vDY();
            vdy.OLrzqt = function0;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("ket_order_req", dcaOrderReq);
            vdy.setArguments(bundle);
            vdy.show(fragmentManager, "ContractDcaMakeOrderConfirmDialog");
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        final DcaTriggerParam dcaTriggerParam;
        java.lang.String instType;
        java.lang.String instId;
        java.util.List<DcaTriggerParam> triggerParams;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        DcaOrderReq dcaOrderReq = arguments != null ? (DcaOrderReq) arguments.getParcelable("ket_order_req") : null;
        if (!(dcaOrderReq instanceof DcaOrderReq)) {
            dcaOrderReq = null;
        }
        if (dcaOrderReq == null || (triggerParams = dcaOrderReq.getTriggerParams()) == null) {
            dcaTriggerParam = null;
        } else {
            java.util.Iterator<T> it = triggerParams.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                DcaTriggerParam dcaTriggerParam2 = (DcaTriggerParam) next;
                if (Intrinsics.EZpvd((java.lang.Object) (dcaTriggerParam2 != null ? dcaTriggerParam2.getTriggerAction() : null), (java.lang.Object) TtmlNode.START)) {
                    break;
                }
            }
            dcaTriggerParam = (DcaTriggerParam) next;
        }
        RecyclerView recyclerView = values().EZpvd;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(TacticsInsideItemData.class, new C52510wOb(null, null, new Function0() { // from class: o.vDX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vDY.EZpvd(dcaTriggerParam, this);
            }
        }));
        c59534zip.register(AutoVipProfitInfo.class, new C54145wyo(16, false, 2, null));
        c59534zip.register(LabelData.class, new C51278vjx());
        recyclerView.setAdapter(c59534zip);
        C33064mpR.OLrzqt(c59534zip, (java.util.List<? extends java.lang.Object>) OLrzqt().KWHzl(dcaOrderReq, dcaTriggerParam));
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(C33070mpX.AYXKKw(C55688xof.Application.sCB));
        if (C33129mqd.AEQbTJ(dcaOrderReq != null ? dcaOrderReq.getMaxSafetyOrds() : null, 1) && (dcaOrderReq == null || !Intrinsics.EZpvd(dcaOrderReq.getReserveFunds(), java.lang.Boolean.TRUE))) {
            arrayList.add(C33070mpX.AYXKKw(C55688xof.Application.zFtALg));
        }
        arrayList.add(C33070mpX.AYXKKw(C55688xof.Application.hGuIrQ));
        android.widget.TextView textView = values().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(C33129mqd.AEQbTJ(java.lang.Integer.valueOf(arrayList.size()), 1) ? 0 : 8);
        values().AYXKKw.addView(copydefault((java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList)));
        values().AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.vDU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                vDY.copydefault(this.OLrzqt, arrayList, view2);
            }
        });
        values().copydefault.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vDW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                vDY.EZpvd(this.copydefault, compoundButton, z);
            }
        });
        values().KWHzl.setText(C56033xvF.getCoinTitle$default((dcaOrderReq == null || (instType = dcaOrderReq.getInstType()) == null) ? "" : instType, (dcaOrderReq == null || (instId = dcaOrderReq.getInstId()) == null) ? "" : instId, false, null, null, 28, null));
        copydefault(dcaOrderReq);
    }

    public static final Unit EZpvd(DcaTriggerParam dcaTriggerParam, vDY vdy) {
        java.lang.String strKWHzl = C56033xvF.KWHzl(dcaTriggerParam != null ? dcaTriggerParam.getTimePeriod() : null, dcaTriggerParam != null ? dcaTriggerParam.getTimeframe() : null, dcaTriggerParam != null ? dcaTriggerParam.getTriggerCond() : null, dcaTriggerParam != null ? dcaTriggerParam.getThold() : null);
        android.content.Context contextRequireContext = vdy.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.EZpvd(strKWHzl);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.fraLem), new View.OnClickListener() { // from class: o.vDV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vDY.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        return Unit.INSTANCE;
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void copydefault(vDY vdy, java.util.List list, android.view.View view) {
        vdy.copydefault = !vdy.copydefault;
        vdy.values().AYXKKw.removeAllViews();
        if (!vdy.copydefault) {
            vdy.values().AYXKKw.addView(vdy.copydefault((java.lang.String) CollectionsKt___CollectionsKt.AuCTelauCTel(list)));
        } else {
            int i = 0;
            for (java.lang.Object obj : list) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                vdy.values().AYXKKw.addView(vdy.copydefault((java.lang.String) obj), i);
                i++;
            }
        }
        vdy.values().AEQbTJ.setText(C33070mpX.AYXKKw(vdy.copydefault ? C55688xof.Application.getNavigationItemCount : C55688xof.Application.getDisplayOptions));
    }

    public static final void EZpvd(vDY vdy, android.widget.CompoundButton compoundButton, boolean z) {
        vdy.values().copydefault.setChecked(z);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.LayoutRes));
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Application(imageViewKWHzl, 1000L, this));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        pUU.KWHzl("BotOrder", "二次确认页 ContractDca onDetach");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault() {
        C32866mlf.onEvent$default("BotPlaceOrder_Sheet_ConfirmOrder_Click", (TrackChannel[]) null, new Function1() { // from class: o.vEa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vDY.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("button_type", "contract_dca", true);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, OtpEventTracker.OTP_EVENT_VALUE_CANCEL, true);
        return Unit.INSTANCE;
    }

    public final android.widget.TextView copydefault(java.lang.String str) {
        android.widget.TextView textView = new android.widget.TextView(requireContext());
        textView.setTextColor(C33070mpX.copydefault(C32113mPz.ActionBar.iwGUEr));
        textView.setTextSize(2, 12.0f);
        textView.setTypeface(C55051xce.OLrzqt.valueOf());
        textView.setMaxLines(this.copydefault ? Integer.MAX_VALUE : 2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLineSpacing(C55298xhM.dp$default(2, (android.content.Context) null, 1, (java.lang.Object) null), 1.0f);
        textView.setText(str);
        return textView;
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ vDY AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, vDY vdy) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = vdy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt;
            C54630xPm c54630xPmAuCTelauCTel;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (vDY.OLrzqt(this.AEQbTJ).copydefault.isChecked() && (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) != null && (c54630xPmAuCTelauCTel = interfaceC54581xNrOLrzqt.AuCTelauCTel()) != null) {
                    C54630xPm.setOrderConfirm$default(c54630xPmAuCTelauCTel, false, null, 2, null);
                }
                Function0 function0 = this.AEQbTJ.OLrzqt;
                if (function0 != null) {
                    function0.invoke();
                }
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ vDY KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, vDY vdy) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = vdy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.copydefault();
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    public final void copydefault(DcaOrderReq dcaOrderReq) {
        java.lang.String direction;
        java.lang.String direction2;
        java.lang.String lever;
        if (dcaOrderReq == null || (direction = dcaOrderReq.getDirection()) == null) {
            direction = "";
        }
        int iValueOf = C56033xvF.valueOf(direction);
        C55251xgS c55251xgS = values().djBIcL;
        c55251xgS.setOKDSStyle(iValueOf);
        if (dcaOrderReq == null || (direction2 = dcaOrderReq.getDirection()) == null) {
            direction2 = "";
        }
        c55251xgS.setText(C56033xvF.AhwBna(direction2));
        C55251xgS c55251xgS2 = values().gEmmrt;
        c55251xgS2.setOKDSStyle(iValueOf);
        if (dcaOrderReq == null || (lever = dcaOrderReq.getLever()) == null) {
            lever = "";
        }
        c55251xgS2.setText(C56033xvF.getBotLever$default(lever, false, 2, null));
        C55251xgS c55251xgS3 = values().valueOf;
        Intrinsics.checkNotNullExpressionValue(c55251xgS3, "");
        c55251xgS3.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) (dcaOrderReq != null ? dcaOrderReq.getProfitSharingRatio() : null)) ? 0 : 8);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
        }
    }
}
