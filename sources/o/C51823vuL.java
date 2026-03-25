package o;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradingbot.impl.market_place.presenter.BotLeadUserOrderPendingPresenter;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.biz.HomeStrategyCardInfo;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.EmptyData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC51071vgB;
import o.ActivityC52122vzt;
import o.ActivityC52272wFg;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vuL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C51823vuL extends AbstractC54505xKx<AbstractC48373uPb, BotLeadUserOrderPendingPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final C43316rmw AEQbTJ = new C43316rmw();
    public java.lang.String EZpvd;
    public boolean copydefault;

    /* JADX INFO: renamed from: o.vuL$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.DCUTEIdCUTEI;
    }

    /* JADX INFO: renamed from: o.vuL$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vuL.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C51823vuL copydefault(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            C51823vuL c51823vuL = new C51823vuL();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("id", str);
            bundle.putBoolean("type", z);
            c51823vuL.setArguments(bundle);
            return c51823vuL;
        }
    }

    @Override // o.AbstractC54505xKx, o.AbstractC56129xww, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        java.lang.String str = "";
        if (arguments != null && (string = arguments.getString("id", "")) != null) {
            str = string;
        }
        this.EZpvd = str;
        android.os.Bundle arguments2 = getArguments();
        this.copydefault = arguments2 != null ? arguments2.getBoolean("type", false) : false;
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        this.AEQbTJ.register(HomeStrategyCardInfo.class, new C51512voS(false, new Function2() { // from class: o.vuI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51823vuL.AEQbTJ(this.copydefault, (HomeStrategyCardInfo) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, null, null, true, null, 44, null));
        this.AEQbTJ.register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.vuM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51823vuL.OLrzqt(this.OLrzqt, (EmptyData) obj);
            }
        }));
        RecyclerView recyclerView = gGvvIC().copydefault;
        recyclerView.setAdapter(this.AEQbTJ);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        gGvvIC().copydefault.addItemDecoration(new C31703mAu(ContextCompat.getColor(requireContext(), C52761wXj.Activity.zuBGHE), C55298xhM.dpInt$default(0.5f, (android.content.Context) null, 1, (java.lang.Object) null), ContextCompat.getColor(requireContext(), C52761wXj.Activity.zuBGHE), 0));
        gGvvIC().AEQbTJ.OLrzqt(new InterfaceC57903yrG() { // from class: o.vuR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                C51823vuL.AEQbTJ(this.OLrzqt, interfaceC57934yrl);
            }
        });
        gGvvIC().AEQbTJ.KWHzl(new InterfaceC57900yrD() { // from class: o.vuN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C51823vuL.EZpvd(this.OLrzqt, interfaceC57934yrl);
            }
        });
        dxcTrN().AEQbTJ(copydefault());
        C52794wYp c52794wYp = gGvvIC().OLrzqt;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L));
        android.widget.FrameLayout frameLayout = gGvvIC().KWHzl;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(8);
    }

    public static final Unit AEQbTJ(C51823vuL c51823vuL, HomeStrategyCardInfo homeStrategyCardInfo, int i) {
        Intrinsics.checkNotNullParameter(homeStrategyCardInfo, "");
        if (c51823vuL.copydefault) {
            android.content.Context context = c51823vuL.getContext();
            if (context != null) {
                ActivityC52272wFg.Application application = ActivityC52272wFg.Companion;
                java.lang.String algoId = homeStrategyCardInfo.getAlgoId();
                java.lang.String str = algoId == null ? "" : algoId;
                java.lang.String algoOrdType = homeStrategyCardInfo.getAlgoOrdType();
                application.KWHzl(context, str, algoOrdType == null ? "" : algoOrdType, (984 & 8) != 0 ? null : null, (984 & 16) != 0 ? "" : null, (984 & 32) != 0 ? null : null, (984 & 64) != 0 ? null : null, (984 & 128) != 0 ? null : null, (984 & 256) != 0 ? false : false, (984 & 512) != 0 ? false : false);
            }
        } else {
            android.content.Context context2 = c51823vuL.getContext();
            if (context2 != null) {
                ActivityC51071vgB.TaskDescription taskDescription = ActivityC51071vgB.Companion;
                java.lang.String algoId2 = homeStrategyCardInfo.getAlgoId();
                java.lang.String algoOrdType2 = homeStrategyCardInfo.getAlgoOrdType();
                ActivityC51071vgB.TaskDescription.startActivity$default(taskDescription, context2, algoId2, algoOrdType2 == null ? "" : algoOrdType2, 67108864, null, 16, null);
            }
        }
        c51823vuL.AEQbTJ(homeStrategyCardInfo);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C51823vuL c51823vuL, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        c51823vuL.dxcTrN().AEQbTJ(c51823vuL.copydefault());
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C51823vuL c51823vuL, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c51823vuL.gGvvIC().AEQbTJ.AhwBna(true);
        c51823vuL.dxcTrN().AEQbTJ(c51823vuL.copydefault());
    }

    public static final void EZpvd(C51823vuL c51823vuL, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c51823vuL.dxcTrN().AEQbTJ();
    }

    @Override // o.AbstractC56129xww
    public void bt_() {
        super.bt_();
        TradeLiveData<java.util.List<HomeStrategyCardInfo>> tradeLiveDataCopydefault = dxcTrN().copydefault();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataCopydefault.observe(viewLifecycleOwner, new Application(new Function1() { // from class: o.vuO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51823vuL.KWHzl(this.KWHzl, (java.util.List) obj);
            }
        }));
        TradeLiveData<java.lang.Boolean> tradeLiveDataEZpvd = dxcTrN().EZpvd();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataEZpvd.observe(viewLifecycleOwner2, new Application(new Function1() { // from class: o.vuQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51823vuL.OLrzqt(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = dxcTrN().KWHzl().AhwBna();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner3, new Application(new Function1() { // from class: o.vuS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51823vuL.copydefault(this.copydefault, (java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit KWHzl(C51823vuL c51823vuL, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c51823vuL.AEQbTJ();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((HomeStrategyCardInfo) it.next()).setShowOperate(true ^ c51823vuL.copydefault);
        }
        if (list.isEmpty()) {
            c51823vuL.KWHzl(false);
        } else {
            C33064mpR.OLrzqt(c51823vuL.AEQbTJ, (java.util.List<? extends java.lang.Object>) list);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c51823vuL, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C51823vuL c51823vuL, boolean z) {
        c51823vuL.gGvvIC().AEQbTJ.AhwBna(z);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C51823vuL c51823vuL, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        c51823vuL.AEQbTJ();
        c51823vuL.KWHzl(true);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c51823vuL, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vuL$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C52794wYp c52794wYp = (C52794wYp) this.AEQbTJ;
                BotTradeData botTradeData = new BotTradeData("grid", "BTC-USDT", "SPOT", (android.os.Parcelable) null, false, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, (DefaultConstructorMarker) null);
                ActivityC52122vzt.Application application = ActivityC52122vzt.Companion;
                android.content.Context context = c52794wYp.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                application.OLrzqt(context, botTradeData, (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : "BotLeadUserOrderPending", (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
            }
        }
    }

    private final java.lang.String copydefault() {
        java.lang.String str = this.EZpvd;
        if (str != null) {
            return str;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    private final void AEQbTJ() {
        gGvvIC().AEQbTJ.AEQbTJ();
        gGvvIC().AEQbTJ.valueOf();
    }

    private final void KWHzl(boolean z) {
        C43453rpa c43453rpa = C43453rpa.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(requireContext(), "");
        if ((!c43453rpa.KWHzl(r1)) || z) {
            C33064mpR.OLrzqt(this.AEQbTJ, (java.util.List<? extends java.lang.Object>) CommonEmptyData.ActionBar.buildErrorData$default(CommonEmptyData.Companion, C33070mpX.AYXKKw(C55688xof.Application.iwGUEr), 60, false, null, null, false, 60, null));
        } else {
            C49952uyJ.updateDataOrEmpty$default(this.AEQbTJ, yDY.AhwBna(), C33070mpX.AYXKKw(C55688xof.Application.ActivityResultRegistryOwner), 60, null, null, false, 56, null);
        }
    }

    public final void AEQbTJ(final HomeStrategyCardInfo homeStrategyCardInfo) {
        C32866mlf.onEvent$default("LeadBotHomepage_RunningBots_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.vuP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51823vuL.copydefault(homeStrategyCardInfo, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(HomeStrategyCardInfo homeStrategyCardInfo, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String algoOrdType = homeStrategyCardInfo.getAlgoOrdType();
        EventParamsList.put$default(eventParamsList, "lead_bot_type", algoOrdType == null ? "" : algoOrdType, false, 4, null);
        return Unit.INSTANCE;
    }
}
