package o;

import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.market_place.presenter.SignalBotLeadUserPresenter;
import com.okinc.unify_trade.biz.SignalBotSubsInfoBean;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.EmptyData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC51215vin;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vuW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51834vuW extends AbstractC54505xKx<uOS, SignalBotLeadUserPresenter> {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public boolean AEQbTJ;
    public C43316rmw copydefault = new C43316rmw();
    public java.lang.String OLrzqt = "";
    public java.lang.String EZpvd = "";
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.vuV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C51834vuW.EZpvd(this.KWHzl));
        }
    });

    /* JADX INFO: renamed from: o.vuW$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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
        return C48033uCm.Activity.htlTjW;
    }

    public static final /* synthetic */ SignalBotLeadUserPresenter KWHzl(C51834vuW c51834vuW) {
        return c51834vuW.dxcTrN();
    }

    /* JADX INFO: renamed from: o.vuW$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vuW.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ AbstractC32996moC newInstance$default(Activity activity, java.lang.String str, boolean z, java.lang.String str2, boolean z2, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                z2 = false;
            }
            return activity.copydefault(str, z, str2, z2);
        }

        public final AbstractC32996moC copydefault(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C51834vuW c51834vuW = new C51834vuW();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("id", str);
            bundle.putBoolean("from", z);
            bundle.putString("source", str2);
            bundle.putBoolean("extra_use_large_tabs", z2);
            c51834vuW.setArguments(bundle);
            return c51834vuW;
        }
    }

    public final boolean EZpvd() {
        return ((java.lang.Boolean) this.AYXKKw.getValue()).booleanValue();
    }

    public static final boolean EZpvd(C51834vuW c51834vuW) {
        android.os.Bundle arguments = c51834vuW.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("extra_use_large_tabs", false);
        }
        return false;
    }

    @Override // o.AbstractC54505xKx, o.AbstractC56129xww, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        KWHzl();
    }

    private final void KWHzl() {
        java.lang.String string;
        java.lang.String string2;
        android.os.Bundle arguments = getArguments();
        java.lang.String str = "";
        if (arguments == null || (string = arguments.getString("id", "")) == null) {
            string = "";
        }
        this.OLrzqt = string;
        android.os.Bundle arguments2 = getArguments();
        this.AEQbTJ = arguments2 != null ? arguments2.getBoolean("from", false) : false;
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 == null || (string2 = arguments3.getString("source", "")) == null) {
            string2 = "";
        }
        if (Intrinsics.EZpvd((java.lang.Object) string2, (java.lang.Object) "signal_square")) {
            str = "1";
        } else if (Intrinsics.EZpvd((java.lang.Object) string2, (java.lang.Object) "signalDetail")) {
            str = "2";
        }
        this.EZpvd = str;
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        uOS uosGGvvIC = gGvvIC();
        AEQbTJ(uosGGvvIC);
        uosGGvvIC.OLrzqt.OLrzqt((InterfaceC57901yrE) new Application());
        final RecyclerView recyclerView = uosGGvvIC.KWHzl;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        this.copydefault.register(SignalBotSubsInfoBean.class, new C51903vvm(this.AEQbTJ, new yHO() { // from class: o.vva
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C51834vuW.copydefault(this.AEQbTJ, recyclerView, (SignalBotSubsInfoBean) obj, (java.lang.String) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
        this.copydefault.register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.vuZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51834vuW.EZpvd(this.AEQbTJ, (EmptyData) obj);
            }
        }));
        recyclerView.setAdapter(this.copydefault);
        recyclerView.addItemDecoration(new C31703mAu(ContextCompat.getColor(requireContext(), C52761wXj.Activity.zuBGHE), C55298xhM.dpInt$default(0.5f, (android.content.Context) null, 1, (java.lang.Object) null), ContextCompat.getColor(requireContext(), C52761wXj.Activity.zuBGHE), 0));
    }

    /* JADX INFO: renamed from: o.vuW$Application */
    public static final class Application implements InterfaceC57901yrE {
        public Application() {
        }

        @Override // o.InterfaceC57903yrG
        public void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
            C51834vuW.KWHzl(C51834vuW.this).KWHzl(C51834vuW.this.OLrzqt, true);
        }

        /* JADX DEBUG: Class process forced to load method for inline: com.okinc.tradingbot.impl.market_place.presenter.SignalBotLeadUserPresenter.loadData$default(com.okinc.tradingbot.impl.market_place.presenter.SignalBotLeadUserPresenter, java.lang.String, boolean, int, java.lang.Object):void */
        @Override // o.InterfaceC57900yrD
        public void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
            SignalBotLeadUserPresenter.loadData$default(C51834vuW.KWHzl(C51834vuW.this), C51834vuW.this.OLrzqt, false, 2, null);
        }
    }

    public static final Unit copydefault(C51834vuW c51834vuW, RecyclerView recyclerView, SignalBotSubsInfoBean signalBotSubsInfoBean, java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(signalBotSubsInfoBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        c51834vuW.copydefault(str, i);
        ActivityC51215vin.TaskDescription taskDescription = ActivityC51215vin.Companion;
        android.content.Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        java.lang.String signalChanId = signalBotSubsInfoBean.getSignalChanId();
        ActivityC51215vin.TaskDescription.startActivity$default(taskDescription, context, signalChanId == null ? "" : signalChanId, "2", null, 8, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C51834vuW c51834vuW, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        c51834vuW.dxcTrN().KWHzl(c51834vuW.OLrzqt, true);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(uOS uos) {
        if (EZpvd()) {
            C55254xgV c55254xgV = uos.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55254xgV, "");
            c55254xgV.setVisibility(0);
            uos.EZpvd.setOKDSSize(44);
            uos.EZpvd.copydefault().addTab(uos.EZpvd.copydefault().newTab().setText(C48033uCm.Fragment.invokespecialDPHOMC));
        }
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        dxcTrN().KWHzl(this.OLrzqt, true);
        AEQbTJ();
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        dxcTrN().copydefault().observe(this, new TaskDescription(new Function1() { // from class: o.vuX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51834vuW.copydefault(this.copydefault, (java.util.List) obj);
            }
        }));
        dxcTrN().AEQbTJ().AhwBna().observe(this, new TaskDescription(new Function1() { // from class: o.vuY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51834vuW.OLrzqt(this.copydefault, (java.lang.Exception) obj);
            }
        }));
        dxcTrN().OLrzqt().observe(this, new TaskDescription(new Function1() { // from class: o.vvb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51834vuW.EZpvd(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
    }

    public static final Unit copydefault(C51834vuW c51834vuW, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c51834vuW.AEQbTJ((java.util.List<SignalBotSubsInfoBean>) list);
        c51834vuW.gGvvIC().OLrzqt.AEQbTJ();
        c51834vuW.gGvvIC().OLrzqt.valueOf();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c51834vuW, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C51834vuW c51834vuW, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        C43316rmw c43316rmw = c51834vuW.copydefault;
        CommonEmptyData.ActionBar actionBar = CommonEmptyData.Companion;
        java.lang.String message = exc.getMessage();
        C33064mpR.OLrzqt(c43316rmw, (java.util.List<? extends java.lang.Object>) CommonEmptyData.ActionBar.buildErrorData$default(actionBar, message == null ? "" : message, 50, false, null, null, false, 60, null));
        c51834vuW.gGvvIC().OLrzqt.AEQbTJ();
        c51834vuW.gGvvIC().OLrzqt.valueOf();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c51834vuW, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C51834vuW c51834vuW, boolean z) {
        c51834vuW.gGvvIC().OLrzqt.AhwBna(z);
        return Unit.INSTANCE;
    }

    private final void AEQbTJ(java.util.List<SignalBotSubsInfoBean> list) {
        C43316rmw c43316rmw = this.copydefault;
        if (list == null) {
            list = yDY.AhwBna();
        }
        C49952uyJ.updateDataOrEmpty$default(c43316rmw, list, C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 50, null, null, false, 56, null);
    }

    public final void AEQbTJ() {
        C32866mlf.onEvent$default("PersonalPage_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.vuT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51834vuW.EZpvd(this.copydefault, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(C51834vuW c51834vuW, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "from", c51834vuW.EZpvd, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void copydefault(final java.lang.String str, final int i) {
        C32866mlf.onEvent$default("PersonalPage_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.vuU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51834vuW.AEQbTJ(this.KWHzl, str, i, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(C51834vuW c51834vuW, java.lang.String str, int i, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "from", c51834vuW.EZpvd, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.ORDER, C33129mqd.gEmmrt(java.lang.Integer.valueOf(i + 1)), false, 4, null);
        return Unit.INSTANCE;
    }
}
