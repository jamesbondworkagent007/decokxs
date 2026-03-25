package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.tradingbot.impl.market_place.my_bot.itembinder.MySignalListData;
import com.okinc.tradingbot.impl.market_place.my_bot.itembinder.MySignalListItemData;
import com.okinc.tradingbot.impl.market_place.my_bot.presenter.MyBotSignalListPresenter;
import com.okinc.uilab.stateful.StatefulView;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.biz.EmptyResp;
import com.okinc.unify_trade.biz.SignalDetails;
import com.okinc.unify_trade.biz.SignalListItem;
import com.okinc.unify_trade.biz.SwitchRenewData;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.EmptyData;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC51215vin;
import o.C48033uCm;
import o.C51396vmI;
import o.C55688xof;
import o.vYX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vsk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51742vsk extends AbstractC54505xKx<AbstractC50798vau, MyBotSignalListPresenter> {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public android.widget.Toast EZpvd;
    public final C43316rmw OLrzqt = new C43316rmw();

    /* JADX INFO: renamed from: o.vsk$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
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
        return C48033uCm.Activity.ONJgbh;
    }

    /* JADX INFO: renamed from: o.vsk$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vsk.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C51742vsk newInstance$default(Application application, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            return application.OLrzqt(z);
        }

        public final C51742vsk OLrzqt(boolean z) {
            C51742vsk c51742vsk = new C51742vsk();
            c51742vsk.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("enable_refresh", java.lang.Boolean.valueOf(z))));
            return c51742vsk;
        }
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        wPQ.OLrzqt(view);
        C33546myW c33546myW = gGvvIC().AEQbTJ;
        android.os.Bundle arguments = getArguments();
        c33546myW.djBIcL(arguments != null ? arguments.getBoolean("enable_refresh") : true);
        EZpvd();
        djBIcL();
        AEQbTJ();
        copydefault();
        C56028xvA.registerBotFragmentTrack$default(this, "MyBotSignalListFragment", new kotlin.Pair[0], null, 8, null);
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        dxcTrN().AYXKKw();
        C32866mlf.onEvent$default("MySignal_Full_Page_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        android.widget.Toast toast = this.EZpvd;
        if (toast != null) {
            toast.cancel();
        }
    }

    private final void copydefault() {
        getChildFragmentManager().setFragmentResultListener("SUB_CONFIRM_TYPE", this, new FragmentResultListener() { // from class: o.vsn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C51742vsk.copydefault(this.copydefault, str, bundle);
            }
        });
    }

    public static final void copydefault(C51742vsk c51742vsk, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        SignalDetails signalDetails = (SignalDetails) bundle.getParcelable("SUB_CONFIRM_DATA");
        if (signalDetails == null) {
            signalDetails = new SignalDetails(null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 67108863, null);
        }
        c51742vsk.dxcTrN().KWHzl(c51742vsk.dxcTrN().AEQbTJ(signalDetails));
    }

    public final void EZpvd() {
        gGvvIC().EZpvd.setLayoutManager(new LinearLayoutManager(getContext()));
        this.OLrzqt.register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.vsA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51742vsk.KWHzl(this.OLrzqt, (EmptyData) obj);
            }
        }));
        this.OLrzqt.register(MySignalListItemData.class, new C51708vsC(new Function2() { // from class: o.vsz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51742vsk.AEQbTJ(this.KWHzl, (MySignalListItemData) obj, (java.lang.String) obj2);
            }
        }, new Function2() { // from class: o.vsj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51742vsk.EZpvd(this.KWHzl, (MySignalListItemData) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        }));
        gGvvIC().AEQbTJ.setNoMoreDataEffective(true);
        gGvvIC().AEQbTJ.AhwBna(true);
        gGvvIC().AEQbTJ.KWHzl(new InterfaceC57900yrD() { // from class: o.vsq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C51742vsk.KWHzl(this.copydefault, interfaceC57934yrl);
            }
        });
        gGvvIC().AEQbTJ.OLrzqt(new InterfaceC57903yrG() { // from class: o.vsp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                C51742vsk.EZpvd(this.EZpvd, interfaceC57934yrl);
            }
        });
        gGvvIC().EZpvd.setAdapter(this.OLrzqt);
    }

    public static final Unit KWHzl(C51742vsk c51742vsk, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        c51742vsk.dxcTrN().AYXKKw();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C51742vsk c51742vsk, MySignalListItemData mySignalListItemData, java.lang.String str) {
        Intrinsics.checkNotNullParameter(mySignalListItemData, "");
        Intrinsics.checkNotNullParameter(str, "");
        c51742vsk.EZpvd(mySignalListItemData, str);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C51742vsk c51742vsk, MySignalListItemData mySignalListItemData, boolean z) {
        Intrinsics.checkNotNullParameter(mySignalListItemData, "");
        c51742vsk.AEQbTJ(mySignalListItemData);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C51742vsk c51742vsk, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c51742vsk.dxcTrN().KWHzl(C33129mqd.addS$default(c51742vsk.dxcTrN().AEQbTJ(), 1, null, null, null, 14, null));
        c51742vsk.dxcTrN().AYXKKw();
    }

    public static final void EZpvd(C51742vsk c51742vsk, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c51742vsk.KWHzl();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.vin.TaskDescription.startActivity$default(o.vin$TaskDescription, android.content.Context, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object):void */
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [152=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void EZpvd(MySignalListItemData mySignalListItemData, java.lang.String str) {
        switch (str.hashCode()) {
            case -1479888800:
                if (str.equals("use_signal")) {
                    AEQbTJ("use");
                    BotTradeData botTradeDataOLrzqt = dxcTrN().OLrzqt(mySignalListItemData.EZpvd());
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        ActivityC52122vzt.Companion.OLrzqt(activity, botTradeDataOLrzqt, (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : "my_bot_signal", (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
                    }
                    break;
                }
                break;
            case -1012216673:
                if (str.equals("view_signal_config")) {
                    AEQbTJ("configuration");
                    SignalListItem signalListItemEZpvd = dxcTrN().EZpvd(mySignalListItemData.EZpvd());
                    vYX.StateListAnimator stateListAnimator = vYX.Companion;
                    androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    stateListAnimator.OLrzqt(signalListItemEZpvd, childFragmentManager);
                    break;
                }
                break;
            case 1463146650:
                if (str.equals("renew_signal")) {
                    AEQbTJ("renewal");
                    SignalDetails signalDetailsCopydefault = dxcTrN().copydefault(mySignalListItemData.EZpvd());
                    C51396vmI.Activity activity2 = C51396vmI.Companion;
                    androidx.fragment.app.FragmentManager childFragmentManager2 = getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                    activity2.AEQbTJ(signalDetailsCopydefault, childFragmentManager2);
                    break;
                }
                break;
            case 2131909064:
                if (str.equals("signal_detail")) {
                    AEQbTJ("details");
                    android.content.Context context = getContext();
                    if (context != null) {
                        ActivityC51215vin.TaskDescription taskDescription = ActivityC51215vin.Companion;
                        java.lang.String signalChanId = mySignalListItemData.EZpvd().getSignalChanId();
                        ActivityC51215vin.TaskDescription.startActivity$default(taskDescription, context, signalChanId == null ? "" : signalChanId, "3", null, 8, null);
                    }
                    break;
                }
                break;
        }
    }

    private final void AEQbTJ(final java.lang.String str) {
        C32866mlf.onEvent$default("MySignal_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.vsm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51742vsk.EZpvd(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str, true);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final MySignalListItemData mySignalListItemData) {
        AEQbTJ("auto_renewal");
        java.lang.String simpleDate$default = pTA.formatSimpleDate$default(new Date(C33129mqd.valueOf(mySignalListItemData.EZpvd().getSubscriptionExpireTime())), null, 1, null);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.sQOHWT));
        int i = C55688xof.Application.ScLVFT;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        java.lang.String signalChanName = mySignalListItemData.EZpvd().getSignalChanName();
        if (signalChanName == null) {
            signalChanName = "";
        }
        pairArr[0] = C56390yDp.OLrzqt("name", signalChanName);
        pairArr[1] = C56390yDp.OLrzqt("dateTime", simpleDate$default);
        viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatCustomAction), new View.OnClickListener() { // from class: o.vsr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51742vsk.copydefault(mySignalListItemData, this, viewOnClickListenerC54939xaY, view);
            }
        });
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.DjWNei);
        Intrinsics.copydefault(strAYXKKw, "");
        ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, (java.lang.CharSequence) strAYXKKw, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(MySignalListItemData mySignalListItemData, C51742vsk c51742vsk, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        java.lang.String signalChanId = mySignalListItemData.EZpvd().getSignalChanId();
        if (signalChanId == null) {
            signalChanId = "";
        }
        c51742vsk.dxcTrN().EZpvd(new SwitchRenewData(signalChanId, java.lang.Boolean.FALSE));
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final void djBIcL() {
        getParentFragmentManager().setFragmentResultListener("refresh_bot_action", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vsw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C51742vsk.AEQbTJ(this.KWHzl, str, bundle);
            }
        });
    }

    public static final void AEQbTJ(C51742vsk c51742vsk, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (c51742vsk.isVisible()) {
            c51742vsk.KWHzl();
        }
    }

    public final void KWHzl() {
        dxcTrN().KWHzl("1");
        dxcTrN().AYXKKw();
    }

    private final void AEQbTJ() {
        C56126xwt<java.lang.String> c56126xwtDbNXlk = finit().DbNXlk();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56126xwtDbNXlk.AEQbTJ(viewLifecycleOwner, new Function1() { // from class: o.vsl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51742vsk.OLrzqt(this.EZpvd, (java.lang.String) obj);
            }
        });
        C56111xwe<java.util.List<EmptyResp>> c56111xweEZpvd = dxcTrN().EZpvd();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56111xweEZpvd.observe(viewLifecycleOwner2, new StateListAnimator(new Function1() { // from class: o.vso
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51742vsk.EZpvd(this.OLrzqt, (java.util.List) obj);
            }
        }));
        C56111xwe<java.util.List<EmptyResp>> c56111xweKWHzl = dxcTrN().KWHzl();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56111xweKWHzl.observe(viewLifecycleOwner3, new StateListAnimator(new Function1() { // from class: o.vsu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51742vsk.AEQbTJ(this.EZpvd, (java.util.List) obj);
            }
        }));
        C56111xwe<MySignalListData> c56111xweOLrzqt = dxcTrN().OLrzqt();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        c56111xweOLrzqt.observe(viewLifecycleOwner4, new StateListAnimator(new Function1() { // from class: o.vsv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51742vsk.KWHzl(this.KWHzl, (MySignalListData) obj);
            }
        }));
        dxcTrN().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.vst
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51742vsk.AEQbTJ(this.copydefault, (androidx.core.util.Pair) obj);
            }
        }));
        dxcTrN().getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.vss
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51742vsk.OLrzqt(this.copydefault, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit OLrzqt(C51742vsk c51742vsk, java.lang.String str) {
        if (c51742vsk.isResumed() && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "PULL_START")) {
            c51742vsk.KWHzl();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C51742vsk c51742vsk, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c51742vsk.dxcTrN().AYXKKw();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C51742vsk c51742vsk, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C55688xof.Application.DHEdFZ), 0, 1, (java.lang.Object) null);
        c51742vsk.dxcTrN().AYXKKw();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C51742vsk c51742vsk, MySignalListData mySignalListData) {
        Intrinsics.checkNotNullParameter(mySignalListData, "");
        if (c51742vsk.dxcTrN().gEmmrt()) {
            C49952uyJ.updateDataOrEmpty$default(c51742vsk.OLrzqt, mySignalListData.copydefault(), C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 0, null, null, false, 60, null);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c51742vsk, true, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            C33064mpR.KWHzl(c51742vsk.OLrzqt, mySignalListData.copydefault());
        }
        C33546myW c33546myW = c51742vsk.gGvvIC().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        C57589ylK.KWHzl(c33546myW, C33129mqd.OLrzqt(mySignalListData.AEQbTJ(), java.lang.Integer.valueOf(mySignalListData.copydefault().size())));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r13v1, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r14v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C51742vsk c51742vsk, androidx.core.util.Pair pair) {
        if (Intrinsics.EZpvd(pair.first, (java.lang.Object) c51742vsk.dxcTrN().AhwBna().bB_())) {
            C33064mpR.OLrzqt(c51742vsk.OLrzqt, (java.util.List<? extends java.lang.Object>) CommonEmptyData.ActionBar.buildErrorData$default(CommonEmptyData.Companion, C33129mqd.gEmmrt(((java.lang.Exception) pair.second).getMessage()), 0, false, null, null, false, 62, null));
            C33546myW c33546myW = c51742vsk.gGvvIC().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
            C57589ylK.finishStatus$default(c33546myW, false, 1, null);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c51742vsk, false, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
            if (message != null) {
                C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r10v4, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C51742vsk c51742vsk, androidx.core.util.Pair pair) {
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c51742vsk.dxcTrN().copydefault().bB_())) {
            if (((java.lang.Boolean) pair.second).booleanValue()) {
                c51742vsk.EZpvd = C55328xhq.showWithLoading$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C55688xof.Application.haRtnV), null, 0, null, 0, 0, 62, null);
            } else {
                android.widget.Toast toast = c51742vsk.EZpvd;
                if (toast != null) {
                    toast.cancel();
                }
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c51742vsk.dxcTrN().AhwBna().bB_())) {
            if (((java.lang.Boolean) pair.second).booleanValue()) {
                c51742vsk.showLoading();
            } else {
                c51742vsk.dismissLoading();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void showLoading() {
        if (this.OLrzqt.getItems().size() == 0) {
            gGvvIC().copydefault.setLoadingDelayedTime(200L);
            gGvvIC().copydefault.setStatus(StatefulView.Status.Loading);
        }
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void dismissLoading() {
        gGvvIC().copydefault.setStatus(StatefulView.Status.Content);
    }
}
