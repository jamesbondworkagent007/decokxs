package o;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.market_place.presenter.BotLeadPendingStrategyPresenter;
import com.okinc.unify_trade.biz.BotLeadProfitSummaryModel;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.market_place.userpage.BotLeadStrateShowData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vvu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51911vvu extends AbstractC54505xKx<uOW, BotLeadPendingStrategyPresenter> {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final C43316rmw AEQbTJ = new C43316rmw();
    public boolean OLrzqt;
    public boolean copydefault;

    /* JADX INFO: renamed from: o.vvu$Fragment */
    public static final /* synthetic */ class Fragment implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.fdOvFl;
    }

    /* JADX INFO: renamed from: o.vvu$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vvu.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final androidx.fragment.app.Fragment OLrzqt() {
            return new C51911vvu();
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        showLoading();
        this.AEQbTJ.register(BotLeadStrateShowData.class, new C51900vvj(new Function1() { // from class: o.vvE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51911vvu.EZpvd(this.AEQbTJ, (BotLeadStrateShowData) obj);
            }
        }));
        this.AEQbTJ.register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.vvC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51911vvu.copydefault(this.OLrzqt, (EmptyData) obj);
            }
        }));
        RecyclerView recyclerView = gGvvIC().KWHzl;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.AEQbTJ);
        gGvvIC().copydefault.OLrzqt(new InterfaceC57903yrG() { // from class: o.vvD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                C51911vvu.EZpvd(this.copydefault, interfaceC57934yrl);
            }
        });
        gGvvIC().copydefault.KWHzl(new InterfaceC57900yrD() { // from class: o.vvF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C51911vvu.KWHzl(this.AEQbTJ, interfaceC57934yrl);
            }
        });
        C55312xha c55312xhaValueOf = gGvvIC().gEmmrt.valueOf();
        if (c55312xhaValueOf != null) {
            c55312xhaValueOf.setOnClickListener(new ActionBar(c55312xhaValueOf, 1000L, c55312xhaValueOf));
            C55320xhi c55320xhiKWHzl = c55312xhaValueOf.KWHzl();
            if (c55320xhiKWHzl != null) {
                android.content.Context context = c55312xhaValueOf.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c55320xhiKWHzl.setText(C33069mpW.KWHzl(context, C55688xof.Application.onPrepare, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", "USDT"))));
            }
        }
        C55312xha c55312xhaValueOf2 = gGvvIC().AYXKKw.valueOf();
        if (c55312xhaValueOf2 != null) {
            c55312xhaValueOf2.setOnClickListener(new StateListAnimator(c55312xhaValueOf2, 1000L, c55312xhaValueOf2));
            C55320xhi c55320xhiKWHzl2 = c55312xhaValueOf2.KWHzl();
            if (c55320xhiKWHzl2 != null) {
                android.content.Context context2 = c55312xhaValueOf2.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                c55320xhiKWHzl2.setText(C33069mpW.KWHzl(context2, C55688xof.Application.onRemoveQueueItem, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", "USDT"))));
            }
        }
    }

    public static final Unit EZpvd(C51911vvu c51911vvu, BotLeadStrateShowData botLeadStrateShowData) {
        Intrinsics.checkNotNullParameter(botLeadStrateShowData, "");
        FragmentActivity activity = c51911vvu.getActivity();
        if (activity != null) {
            ActivityC51164vhp.Companion.EZpvd(activity, botLeadStrateShowData);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C51911vvu c51911vvu, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        int emptyType = emptyData.getEmptyType();
        if (emptyType == 6) {
            BotTradeData botTradeData = new BotTradeData("grid", "BTC-USDT", "SPOT", (android.os.Parcelable) null, false, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, (DefaultConstructorMarker) null);
            FragmentActivity activity = c51911vvu.getActivity();
            if (activity != null) {
                ActivityC52122vzt.Companion.OLrzqt(activity, botTradeData, (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : "BotLeadPendingStrategyFragment", (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
            }
        } else if (emptyType == 8) {
            c51911vvu.dxcTrN().AhwBna();
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C51911vvu c51911vvu, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c51911vvu.gGvvIC().copydefault.AhwBna(true);
        c51911vvu.dxcTrN().AhwBna();
    }

    public static final void KWHzl(C51911vvu c51911vvu, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c51911vvu.dxcTrN().djBIcL();
    }

    /* JADX INFO: renamed from: o.vvu$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.KWHzl.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.vvu$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.AEQbTJ.dismiss();
        }
    }

    @Override // o.AbstractC54505xKx
    public void uzCIH() {
        super.uzCIH();
        dxcTrN().AhwBna();
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        dxcTrN().gEmmrt().observe(this, new Fragment(new Function1() { // from class: o.vvv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51911vvu.EZpvd(this.KWHzl, (java.lang.String) obj);
            }
        }));
        dxcTrN().AEQbTJ().observe(this, new Fragment(new Function1() { // from class: o.vvy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51911vvu.OLrzqt(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        dxcTrN().copydefault().observe(this, new Fragment(new Function1() { // from class: o.vvx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51911vvu.copydefault(this.AEQbTJ, (java.util.List) obj);
            }
        }));
        dxcTrN().OLrzqt().observe(this, new Fragment(new Function1() { // from class: o.vvz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51911vvu.AEQbTJ(this.KWHzl, (BotLeadProfitSummaryModel) obj);
            }
        }));
        dxcTrN().KWHzl().AhwBna().observe(this, new Fragment(new Function1() { // from class: o.vvw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51911vvu.KWHzl(this.KWHzl, (java.lang.Exception) obj);
            }
        }));
        dxcTrN().EZpvd().AhwBna().observe(this, new Fragment(new Function1() { // from class: o.vvA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51911vvu.copydefault(this.OLrzqt, (java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit EZpvd(C51911vvu c51911vvu, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            c51911vvu.gGvvIC().values.setText(pTB.formatLocalized$default(str, null, 1, null));
        } else {
            c51911vvu.gGvvIC().values.setText("--");
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C51911vvu c51911vvu, boolean z) {
        c51911vvu.gGvvIC().copydefault.AhwBna(z);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C51911vvu c51911vvu, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (!c51911vvu.copydefault) {
            c51911vvu.copydefault = true;
            c51911vvu.EZpvd();
        }
        c51911vvu.KWHzl();
        C49952uyJ.updateDataOrEmpty$default(c51911vvu.AEQbTJ, list, C33070mpX.AYXKKw(C55688xof.Application.onSetRating), 60, C33070mpX.AYXKKw(C55688xof.Application.hdBMmm), null, false, 48, null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c51911vvu, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C51911vvu c51911vvu, BotLeadProfitSummaryModel botLeadProfitSummaryModel) {
        Intrinsics.checkNotNullParameter(botLeadProfitSummaryModel, "");
        if (!c51911vvu.OLrzqt) {
            c51911vvu.OLrzqt = true;
            c51911vvu.EZpvd();
        }
        c51911vvu.AEQbTJ(botLeadProfitSummaryModel);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C51911vvu c51911vvu, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        if (!c51911vvu.OLrzqt) {
            c51911vvu.OLrzqt = true;
            c51911vvu.EZpvd();
        }
        c51911vvu.KWHzl();
        uOW uowGGvvIC = c51911vvu.gGvvIC();
        uowGGvvIC.valueOf.setText("--");
        uowGGvvIC.djBIcL.setText("--");
        uowGGvvIC.values.setText("--");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vvu$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C55312xha copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C55312xha c55312xha) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = c55312xha;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.IMediaSessionStub);
                android.content.Context context = this.copydefault.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.EZpvd(strAYXKKw);
                java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C55688xof.Application.onCreate);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new Activity(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.vvu$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C55312xha EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C55312xha c55312xha) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = c55312xha;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.setMediaController);
                android.content.Context context = this.EZpvd.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.EZpvd(strAYXKKw);
                java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C55688xof.Application.onCreate);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new TaskDescription(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public static final Unit copydefault(C51911vvu c51911vvu, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        c51911vvu.dxcTrN().AYXKKw();
        if (!c51911vvu.copydefault) {
            c51911vvu.copydefault = true;
            c51911vvu.EZpvd();
        }
        c51911vvu.KWHzl();
        C33064mpR.OLrzqt(c51911vvu.AEQbTJ, (java.util.List<? extends java.lang.Object>) CommonEmptyData.ActionBar.buildErrorData$default(CommonEmptyData.Companion, null, 60, false, null, null, false, 61, null));
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c51911vvu, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        if (this.copydefault && this.OLrzqt) {
            dismissLoading();
        }
    }

    public final void KWHzl() {
        gGvvIC().copydefault.AEQbTJ();
        gGvvIC().copydefault.valueOf();
    }

    public final void AEQbTJ(BotLeadProfitSummaryModel botLeadProfitSummaryModel) {
        uOW uowGGvvIC = gGvvIC();
        android.widget.TextView textView = uowGGvvIC.valueOf;
        java.lang.String accumulatedProfitSharing = botLeadProfitSummaryModel.getAccumulatedProfitSharing();
        java.lang.String str = accumulatedProfitSharing == null ? "" : accumulatedProfitSharing;
        java.lang.String profitSharingCcy = botLeadProfitSummaryModel.getProfitSharingCcy();
        textView.setText(wUW.withColorUnderlineStyle$default(C56033xvF.getBotPnl$default("", "", str, profitSharingCcy == null ? "" : profitSharingCcy, false, false, null, false, null, null, null, 2032, null), C33070mpX.copydefault(C52761wXj.Activity.iRxXKY), C33070mpX.copydefault(C32113mPz.ActionBar.zLjUOn), C55298xhM.dp2pxFloat$default(5.0f, null, 1, null), null, 8, null), TextView.BufferType.SPANNABLE);
        android.widget.TextView textView2 = uowGGvvIC.djBIcL;
        java.lang.String estimatedProfitSharing = botLeadProfitSummaryModel.getEstimatedProfitSharing();
        java.lang.String str2 = estimatedProfitSharing == null ? "" : estimatedProfitSharing;
        java.lang.String profitSharingCcy2 = botLeadProfitSummaryModel.getProfitSharingCcy();
        textView2.setText(C56033xvF.getBotPnl$default("", "", str2, profitSharingCcy2 == null ? "" : profitSharingCcy2, false, false, null, false, null, null, null, 2032, null));
        C55258xgZ c55258xgZ = uowGGvvIC.gEmmrt;
        int i = C55688xof.Application.onPrepare;
        java.lang.String profitSharingCcy3 = botLeadProfitSummaryModel.getProfitSharingCcy();
        if (profitSharingCcy3 == null) {
            profitSharingCcy3 = "USDT";
        }
        c55258xgZ.setText(C33069mpW.copydefault(this, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", profitSharingCcy3))));
        C55258xgZ c55258xgZ2 = uowGGvvIC.AYXKKw;
        int i2 = C55688xof.Application.onRemoveQueueItem;
        java.lang.String profitSharingCcy4 = botLeadProfitSummaryModel.getProfitSharingCcy();
        c55258xgZ2.setText(C33069mpW.copydefault(this, i2, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", profitSharingCcy4 != null ? profitSharingCcy4 : "USDT"))));
    }
}
