package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotSwitchItemData;
import com.okinc.tradingbot.impl.market_place.bot_copy.presenter.SignalBotCopyPresenter;
import com.okinc.tradingbot.impl.strategy.bean.SignalSubsData;
import com.okinc.unify_trade.biz.SignalDetails;
import com.okinc.unify_trade.bot.data.BotParamItemData;
import com.okinc.unify_trade.bot.data.BotRemindData;
import com.okinc.unify_trade.bot.data.ItemData;
import com.okinc.unify_trade.bot.data.TacticsInsideLineItemData;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vmI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51396vmI extends AbstractC49945uyC<AbstractC48561uVz, SignalBotCopyPresenter> {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public SignalDetails KWHzl;
    public final int AEQbTJ = C48033uCm.Activity.jNexW;
    public final C43316rmw OLrzqt = new C43316rmw();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX INFO: renamed from: o.vmI$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vmI.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void AEQbTJ(@NotNull SignalDetails signalDetails, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(signalDetails, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            C51396vmI c51396vmI = new C51396vmI();
            c51396vmI.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("SUB_CONFIRM_DATA", signalDetails)));
            c51396vmI.show(fragmentManager, "SignalSubsConfirmDialog");
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        SignalDetails signalDetails;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (signalDetails = (SignalDetails) arguments.getParcelable("SUB_CONFIRM_DATA")) == null) {
            signalDetails = new SignalDetails(null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 67108863, null);
        }
        this.KWHzl = signalDetails;
        C55867xrz.KWHzl.valueOf(signalDetails.getType());
        fIwbmz();
        copydefault();
        isConnected();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new ActionBar(imageViewKWHzl, 1000L, this));
    }

    private final void fIwbmz() {
        wXQ wxq;
        android.widget.TextView textViewAYXKKw;
        C52794wYp c52794wYpCopydefault = values().EZpvd.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(false);
        }
        values().AEQbTJ.setLayoutManager(new LinearLayoutManager(getContext()));
        SignalDetails signalDetails = null;
        values().AEQbTJ.addItemDecoration(new C31703mAu(C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), 0));
        this.OLrzqt.register(BotParamItemData.class, new C51263vji());
        this.OLrzqt.register(ItemData.class, new wNH(null, null, null, null, null, 31, null));
        this.OLrzqt.register(BotRemindData.class, new C52491wNj());
        this.OLrzqt.register(TacticsInsideLineItemData.class, new C52512wOd());
        this.OLrzqt.register(BotSwitchItemData.class, new C51273vjs(new Function1() { // from class: o.vmK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51396vmI.OLrzqt(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        values().AEQbTJ.setAdapter(this.OLrzqt);
        SignalBotCopyPresenter signalBotCopyPresenterOLrzqt = OLrzqt();
        SignalDetails signalDetails2 = this.KWHzl;
        if (signalDetails2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            signalDetails = signalDetails2;
        }
        SignalSubsData signalSubsDataAEQbTJ = signalBotCopyPresenterOLrzqt.AEQbTJ(signalDetails);
        C54946xaf binding = getBinding();
        if (binding != null && (wxq = binding.KWHzl) != null && (textViewAYXKKw = wxq.AYXKKw()) != null) {
            textViewAYXKKw.setText(signalSubsDataAEQbTJ.AEQbTJ());
        }
        C33064mpR.OLrzqt(this.OLrzqt, (java.util.List<? extends java.lang.Object>) signalSubsDataAEQbTJ.OLrzqt());
    }

    public static final Unit OLrzqt(C51396vmI c51396vmI, boolean z) {
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        SignalDetails signalDetails = c51396vmI.KWHzl;
        SignalDetails signalDetails2 = null;
        if (signalDetails == null) {
            Intrinsics.gEmmrt("");
            signalDetails = null;
        }
        c55867xrz.valueOf(signalDetails.getType(), "auto_renewal");
        SignalDetails signalDetails3 = c51396vmI.KWHzl;
        if (signalDetails3 == null) {
            Intrinsics.gEmmrt("");
            signalDetails3 = null;
        }
        signalDetails3.setAutoRenewal(z);
        C43316rmw c43316rmw = c51396vmI.OLrzqt;
        SignalBotCopyPresenter signalBotCopyPresenterOLrzqt = c51396vmI.OLrzqt();
        SignalDetails signalDetails4 = c51396vmI.KWHzl;
        if (signalDetails4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            signalDetails2 = signalDetails4;
        }
        C33064mpR.OLrzqt(c43316rmw, (java.util.List<? extends java.lang.Object>) signalBotCopyPresenterOLrzqt.AEQbTJ(signalDetails2).OLrzqt());
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        AbstractC48561uVz abstractC48561uVzValues = values();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.IYdWPz);
        abstractC48561uVzValues.KWHzl.KWHzl(C33069mpW.copydefault(C55688xof.Application.ikcuIV, C56423yEv.EZpvd(C56390yDp.OLrzqt("agreement", strAYXKKw))), strAYXKKw, C33070mpX.AYXKKw(C55688xof.Application.iMXFZQ));
    }

    private final void isConnected() {
        C52794wYp c52794wYpAEQbTJ = values().EZpvd.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new TaskDescription(c52794wYpAEQbTJ, 1000L, this));
        }
        C52794wYp c52794wYpCopydefault = values().EZpvd.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new StateListAnimator(c52794wYpCopydefault, 1000L, this));
        }
        values().KWHzl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vmN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C51396vmI.copydefault(this.EZpvd, compoundButton, z);
            }
        });
    }

    public static final void copydefault(C51396vmI c51396vmI, android.widget.CompoundButton compoundButton, boolean z) {
        C52794wYp c52794wYpCopydefault = c51396vmI.values().EZpvd.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(z);
        }
    }

    /* JADX INFO: renamed from: o.vmI$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C51396vmI KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C51396vmI c51396vmI) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c51396vmI;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C55867xrz c55867xrz = C55867xrz.KWHzl;
                SignalDetails signalDetails = this.KWHzl.KWHzl;
                if (signalDetails == null) {
                    Intrinsics.gEmmrt("");
                    signalDetails = null;
                }
                c55867xrz.valueOf(signalDetails.getType(), EopTrackEvent.EXIT);
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.vmI$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C51396vmI AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C51396vmI c51396vmI) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = c51396vmI;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C55867xrz c55867xrz = C55867xrz.KWHzl;
                SignalDetails signalDetails = this.AEQbTJ.KWHzl;
                SignalDetails signalDetails2 = null;
                if (signalDetails == null) {
                    Intrinsics.gEmmrt("");
                    signalDetails = null;
                }
                c55867xrz.valueOf(signalDetails.getType(), Web3SecurityTrackEvent.VALUE_CONFIRM);
                androidx.fragment.app.FragmentManager parentFragmentManager = this.AEQbTJ.getParentFragmentManager();
                kotlin.Pair[] pairArr = new kotlin.Pair[1];
                SignalDetails signalDetails3 = this.AEQbTJ.KWHzl;
                if (signalDetails3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    signalDetails2 = signalDetails3;
                }
                pairArr[0] = C56390yDp.OLrzqt("SUB_CONFIRM_DATA", signalDetails2);
                parentFragmentManager.setFragmentResult("SUB_CONFIRM_TYPE", BundleKt.bundleOf(pairArr));
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.vmI$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C51396vmI KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C51396vmI c51396vmI) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c51396vmI;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C55867xrz c55867xrz = C55867xrz.KWHzl;
                SignalDetails signalDetails = this.KWHzl.KWHzl;
                if (signalDetails == null) {
                    Intrinsics.gEmmrt("");
                    signalDetails = null;
                }
                c55867xrz.valueOf(signalDetails.getType(), OtpEventTracker.OTP_EVENT_VALUE_CANCEL);
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }
}
