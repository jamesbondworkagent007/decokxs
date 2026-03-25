package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Observable;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelStoreOwner;
import com.okinc.biz.TradeType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradeapi.bean.ParamBuilder;
import com.okinc.tradeuilib.order.trade.view.AccountMode;
import com.okinc.tradingbot.impl.order.strategy.smarticeberg.SmartIcebergFragment$initializeMarginSwitchView$1;
import com.okinc.tradingbot.impl.order.strategy.smarticeberg.SmartIcebergFragment$initializeMarginSwitchView$3;
import com.okinc.tradingbot.impl.order.strategy.smarticeberg.SmartIcebergFragment$initializeMarginSwitchView$4;
import com.okinc.tradingbot.impl.order.strategy.smarticeberg.SmartIcebergFragment$initializeMarginSwitchView$7;
import com.okinc.tradingbot.impl.order.strategy.smarticeberg.presenter.SmartIcebergPresenter;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.IceBergReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.bot.data.BotGrafanaInfo;
import com.okinc.unify_trade.manager.MarginModeManager;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC50583vTu;
import o.C48033uCm;
import o.InterfaceC49499uph;
import o.InterfaceC8104awT;
import o.xKK;
import o.xMJ;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.wds, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C53036wds extends AbstractC48165uHj<uQM, SmartIcebergPresenter> implements InterfaceC53558wnk {
    public boolean valueOf;
    public boolean values;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public final int OLrzqt = C48033uCm.Activity.gSBher;
    public final C56235xyw EZpvd = new C56235xyw();
    public boolean copydefault = true;
    public final java.lang.Runnable AYXKKw = new java.lang.Runnable() { // from class: o.wdA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public final void run() {
            C53036wds.AkhnZx(this.copydefault);
        }
    };
    public final Dialog AhwBna = new Dialog();
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.wdB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53036wds.fetchVPNInfo(this.copydefault);
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.wdC
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53036wds.isConnected(this.KWHzl);
        }
    });
    public final LoaderManager djBIcL = new LoaderManager();

    /* JADX INFO: renamed from: o.wds$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AccountMode.values().length];
            try {
                iArr[AccountMode.FUTURES.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AccountMode.MULTI.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountMode.PM.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountMode.TRADING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            copydefault = iArr;
        }
    }

    /* JADX INFO: renamed from: o.wds$Fragment */
    public static final /* synthetic */ class Fragment implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SmartIcebergPresenter AhwBna(C53036wds c53036wds) {
        return (SmartIcebergPresenter) c53036wds.dxcTrN();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ uQM djBIcL(C53036wds c53036wds) {
        return (uQM) c53036wds.gGvvIC();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AkhnZx(C53036wds c53036wds) {
        if (!c53036wds.isAdded() || c53036wds.isDetached() || c53036wds.getView() == null) {
            return;
        }
        InterfaceC49496upe interfaceC49496upeCopydefault = C53685wqE.copydefault.copydefault();
        BizInstrument bizInstrumentAhwBna = ((SmartIcebergPresenter) c53036wds.dxcTrN()).fvQaOB().AhwBna();
        androidx.fragment.app.FragmentManager childFragmentManager = c53036wds.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        interfaceC49496upeCopydefault.EZpvd(bizInstrumentAhwBna, childFragmentManager);
    }

    /* JADX INFO: renamed from: o.wds$Dialog */
    public static final class Dialog extends Observable.OnPropertyChangedCallback {
        public Dialog() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(androidx.databinding.Observable observable, int i) {
            C53036wds.this.copydefault().valueOf();
            C53036wds.initAdvanced$default(C53036wds.this, false, 1, null);
            TradeType tradeType = C49861uwY.Companion.copydefault().get();
            C53036wds.djBIcL(C53036wds.this).copydefault.EZpvd(tradeType);
            C53036wds.this.getFieldNames();
            if (tradeType != null) {
                C53036wds c53036wds = C53036wds.this;
                c53036wds.EZpvd(c53036wds, C53036wds.AhwBna(c53036wds).fvQaOB().AhwBna(), tradeType);
            }
            C56028xvA.OLrzqt("TradeSideTabView", C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.SIDE, java.lang.String.valueOf(tradeType))));
        }
    }

    public static final ViewOnClickListenerC53063weS fetchVPNInfo(C53036wds c53036wds) {
        android.content.Context contextRequireContext = c53036wds.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new ViewOnClickListenerC53063weS(contextRequireContext, null, 0, 6, null);
    }

    public final ViewOnClickListenerC53063weS copydefault() {
        return (ViewOnClickListenerC53063weS) this.KWHzl.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: gEmmrt()Landroid/view/View; */
    @Override // o.AbstractC48165uHj
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ViewOnClickListenerC53063weS gEmmrt() {
        return copydefault();
    }

    @Override // o.AbstractC48165uHj, o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C56028xvA.registerBotFragmentTrack$default(this, "SmartIcebergFragment", new kotlin.Pair[0], null, 8, null);
    }

    /* JADX INFO: renamed from: o.wds$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wds.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C53036wds copydefault() {
            return new C53036wds();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        wPQ.copydefault(view);
        ((uQM) gGvvIC()).EZpvd.copydefault();
        wUP wup = ((uQM) gGvvIC()).OLrzqt;
        Intrinsics.checkNotNullExpressionValue(wup, "");
        copydefault((C49908uxS) wup);
        C49924uxi c49924uxi = ((uQM) gGvvIC()).copydefault;
        Intrinsics.checkNotNullExpressionValue(c49924uxi, "");
        AEQbTJ(c49924uxi);
        copydefault().setInputPanelView(((uQM) gGvvIC()).KWHzl);
        copydefault().setInstManager(((SmartIcebergPresenter) dxcTrN()).fvQaOB());
        copydefault().setMarginModelViewModel(new Function0() { // from class: o.wdr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53036wds.DbNXlk(this.KWHzl);
            }
        });
        ViewOnClickListenerC53063weS viewOnClickListenerC53063weSCopydefault = copydefault();
        C53539wnR c53539wnR = ((uQM) gGvvIC()).AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c53539wnR, "");
        C53539wnR c53539wnR2 = ((uQM) gGvvIC()).AhwBna;
        Intrinsics.checkNotNullExpressionValue(c53539wnR2, "");
        viewOnClickListenerC53063weSCopydefault.copydefault(c53539wnR, c53539wnR2);
        copydefault().setRefreshCallback(new Function1() { // from class: o.wdp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53036wds.OLrzqt(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        copydefault().setPlaceOrderClickCallback(new Function2() { // from class: o.wdD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53036wds.OLrzqt(this.copydefault, (java.lang.String) obj, (java.lang.String) obj2);
            }
        });
        fARcdN();
        getNewProxyInstance();
        hDKMBd();
        C55867xrz.KWHzl.OLrzqt("smart_iceberg", ((SmartIcebergPresenter) dxcTrN()).fvQaOB().gEmmrt());
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final AbstractC49896uxG DbNXlk(C53036wds c53036wds) {
        return ((uQM) c53036wds.gGvvIC()).copydefault.AhwBna();
    }

    public static final Unit OLrzqt(C53036wds c53036wds, boolean z) {
        c53036wds.AEQbTJ(z);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v21, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(final C53036wds c53036wds, java.lang.String str, java.lang.String str2) {
        MarginModeManager marginModeManagerIsConnected;
        java.lang.String currentMarginMode$default;
        java.lang.String str3;
        java.lang.String str4 = "";
        Intrinsics.checkNotNullParameter(str, "");
        if (c53036wds.AYXKKw()) {
            return Unit.INSTANCE;
        }
        kotlin.Pair<IceBergReq, java.lang.Boolean> pairAEQbTJ = ((uQM) c53036wds.gGvvIC()).KWHzl.AEQbTJ();
        if (pairAEQbTJ.getSecond().booleanValue()) {
            C49967uyY c49967uyY = C49967uyY.EZpvd;
            C53056weL c53056weL = ((uQM) c53036wds.gGvvIC()).KWHzl;
            Intrinsics.checkNotNullExpressionValue(c53056weL, "");
            c49967uyY.KWHzl(c53056weL, C48033uCm.Application.fvQaOB, ((uQM) c53036wds.gGvvIC()).KWHzl.copydefault());
        }
        IceBergReq first = pairAEQbTJ.getFirst();
        if (first != null) {
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            final java.lang.String str5 = c54589xNz.EZpvd() ? "demo" : "live";
            C32866mlf.onEvent$default("app_trade_strategy_confirm_create_click", (TrackChannel[]) null, new Function1() { // from class: o.wdz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53036wds.copydefault(str5, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            C32866mlf.onEvent$default("BotPlaceOrder_PlaceOrder_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.wdG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53036wds.OLrzqt(str5, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            SmartIcebergPresenter smartIcebergPresenter = (SmartIcebergPresenter) c53036wds.dxcTrN();
            BizInstrument bizInstrumentAhwBna = ((SmartIcebergPresenter) c53036wds.dxcTrN()).fvQaOB().AhwBna();
            IceBergReq iceBergReqKWHzl = ((uQM) c53036wds.gGvvIC()).EZpvd.KWHzl();
            first.setPxLimit(iceBergReqKWHzl.getPxLimit());
            first.setAggressiveness(iceBergReqKWHzl.getAggressiveness());
            first.setTriggerParams(iceBergReqKWHzl.getTriggerParams());
            first.setTradeBorrowMode(C56059xvf.EZpvd.fIwbmz() ? java.lang.Boolean.valueOf(C49983uyo.Companion.KWHzl(c53036wds.getActivity())) : null);
            first.setLeftLevel(c53036wds.isConnected());
            first.setRightLevel(c53036wds.fetchVPNInfo());
            first.setTradeQuoteCcy(((SmartIcebergPresenter) c53036wds.dxcTrN()).fvQaOB().AEQbTJ("smart_iceberg"));
            java.lang.String str6 = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "clickBuy") ? "buy" : "sell";
            java.lang.String strValues = c53036wds.values();
            if (getPMAndMargin$default(c53036wds, null, 1, null)) {
                str4 = "cross";
            } else {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
                if (interfaceC54581xNrOLrzqt != null && (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt.isConnected()) != null && (currentMarginMode$default = MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected, false, null, 3, null)) != null) {
                    str3 = currentMarginMode$default;
                }
                smartIcebergPresenter.KWHzl(bizInstrumentAhwBna, first, str6, str2, java.lang.Boolean.FALSE, new yHO() { // from class: o.wdE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.yHO
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return C53036wds.KWHzl((java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3);
                    }
                }, strValues, str3, new Function2() { // from class: o.wdF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C53036wds.AEQbTJ(this.AEQbTJ, (StrategyReqGroup) obj, (yHO) obj2);
                    }
                });
            }
            str3 = str4;
            smartIcebergPresenter.KWHzl(bizInstrumentAhwBna, first, str6, str2, java.lang.Boolean.FALSE, new yHO() { // from class: o.wdE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return C53036wds.KWHzl((java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3);
                }
            }, strValues, str3, new Function2() { // from class: o.wdF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C53036wds.AEQbTJ(this.AEQbTJ, (StrategyReqGroup) obj, (yHO) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("entrust_type", "smart_iceberg", true);
        eventParamsList.put(OtcExtraKeys.MODE, str, true);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String strWlaJM = (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM();
        if (strWlaJM != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strWlaJM)) {
            eventParamsList.put("account_type", strWlaJM, true);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "smart_iceberg", false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C53036wds c53036wds, StrategyReqGroup strategyReqGroup, yHO yho) {
        Intrinsics.checkNotNullParameter(strategyReqGroup, "");
        Intrinsics.checkNotNullParameter(yho, "");
        AbstractC50583vTu abstractC50583vTuNewInstance$default = AbstractC50583vTu.Application.newInstance$default(AbstractC50583vTu.Companion, ((SmartIcebergPresenter) c53036wds.dxcTrN()).fvQaOB().gEmmrt(), ((SmartIcebergPresenter) c53036wds.dxcTrN()).fvQaOB().djBIcL(), strategyReqGroup, false, 8, null);
        if (abstractC50583vTuNewInstance$default != null) {
            abstractC50583vTuNewInstance$default.show(c53036wds.getChildFragmentManager(), AbstractC50583vTu.class.getSimpleName());
        }
        if (abstractC50583vTuNewInstance$default != null) {
            abstractC50583vTuNewInstance$default.copydefault((yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit>) yho);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Possible override for method o.uHj.AEQbTJ()V */
    public final InterfaceC53558wnk AEQbTJ() {
        return (InterfaceC53558wnk) this.gEmmrt.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C53036wds isConnected(final C53036wds c53036wds) {
        uBL ubl = ((uQM) c53036wds.gGvvIC()).valueOf;
        c53036wds.AEQbTJ(new Function1() { // from class: o.wdt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53036wds.EZpvd(this.AEQbTJ, (java.lang.String) obj);
            }
        });
        return c53036wds;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C53036wds c53036wds, java.lang.String str) {
        pUU.EZpvd("USDRename", "SmartIcebergFragment onTradeWith selected: " + str);
        ((SmartIcebergPresenter) c53036wds.dxcTrN()).fvQaOB().gEmmrt(str);
        ((uQM) c53036wds.gGvvIC()).KWHzl.EZpvd(true);
        c53036wds.fIwbmz();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void initAdvanced$default(C53036wds c53036wds, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c53036wds.EZpvd(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(boolean z) {
        ((uQM) gGvvIC()).EZpvd.copydefault(z);
        ((SmartIcebergPresenter) dxcTrN()).fvQaOB().gEmmrt(AEQbTJ().EZpvd(this, ((SmartIcebergPresenter) dxcTrN()).fvQaOB().AhwBna(), TradeType.BUY_OPEN));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final java.lang.String isConnected() {
        AbstractC49896uxG abstractC49896uxGAhwBna;
        C49924uxi c49924uxi = ((uQM) gGvvIC()).copydefault;
        Intrinsics.checkNotNullExpressionValue(c49924uxi, "");
        if (c49924uxi.getVisibility() != 0 || (abstractC49896uxGAhwBna = ((uQM) gGvvIC()).copydefault.AhwBna()) == null) {
            return null;
        }
        return abstractC49896uxGAhwBna.KWHzl();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final java.lang.String fetchVPNInfo() {
        AbstractC49896uxG abstractC49896uxGAhwBna;
        C49924uxi c49924uxi = ((uQM) gGvvIC()).copydefault;
        Intrinsics.checkNotNullExpressionValue(c49924uxi, "");
        if (c49924uxi.getVisibility() != 0 || (abstractC49896uxGAhwBna = ((uQM) gGvvIC()).copydefault.AhwBna()) == null) {
            return null;
        }
        return abstractC49896uxGAhwBna.AEQbTJ();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final java.lang.String values() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        AbstractC49896uxG abstractC49896uxGAhwBna;
        if (!Intrinsics.EZpvd((java.lang.Object) ((SmartIcebergPresenter) dxcTrN()).fvQaOB().djBIcL(), (java.lang.Object) "MARGIN") || getPMAndMargin$default(this, null, 1, null)) {
            return null;
        }
        if (((SmartIcebergPresenter) dxcTrN()).fvQaOB().fJNWhG()) {
            AbstractC49896uxG abstractC49896uxGAhwBna2 = ((uQM) gGvvIC()).copydefault.AhwBna();
            if (abstractC49896uxGAhwBna2 != null) {
                return abstractC49896uxGAhwBna2.copydefault();
            }
            return null;
        }
        if (!((SmartIcebergPresenter) dxcTrN()).fvQaOB().fARcdN() || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.DbNXlk() || (abstractC49896uxGAhwBna = ((uQM) gGvvIC()).copydefault.AhwBna()) == null) {
            return null;
        }
        return abstractC49896uxGAhwBna.copydefault();
    }

    private final void getNewProxyInstance() {
        getChildFragmentManager().setFragmentResultListener("bot_order", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.wdx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C53036wds.AEQbTJ(this.EZpvd, str, bundle);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(C53036wds c53036wds, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        StrategyReqGroup strategyReqGroup = (StrategyReqGroup) bundle.getParcelable("bot_order_data");
        if (strategyReqGroup != null) {
            ((SmartIcebergPresenter) c53036wds.dxcTrN()).copydefault(strategyReqGroup);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void hDKMBd() {
        C56111xwe<java.util.List<StrategyResponse>> c56111xweOLrzqt = ((SmartIcebergPresenter) dxcTrN()).OLrzqt();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweOLrzqt.observe(viewLifecycleOwner, new Fragment(new Function1() { // from class: o.wdP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53036wds.AEQbTJ(this.KWHzl, (java.util.List) obj);
            }
        }));
        ((SmartIcebergPresenter) dxcTrN()).EZpvd().AkhnZx().observe(getViewLifecycleOwner(), new Fragment(new Function1() { // from class: o.wdW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53036wds.EZpvd(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = ((SmartIcebergPresenter) dxcTrN()).EZpvd().AhwBna();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner2, new Observer() { // from class: o.wdV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C53036wds.AEQbTJ(this.AEQbTJ, (java.lang.Exception) obj);
            }
        });
        TradeLiveData<xMJ.Application> tradeLiveDataAhwBna = C54782xVc.AEQbTJ.AhwBna();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataAhwBna.observe(viewLifecycleOwner3, new Fragment(new Function1() { // from class: o.wdT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53036wds.AEQbTJ(this.copydefault, (xMJ.Application) obj);
            }
        }));
        C56126xwt<java.lang.Boolean> c56126xwtOLrzqt = finit().OLrzqt();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        c56126xwtOLrzqt.AEQbTJ(viewLifecycleOwner4, new Function1() { // from class: o.wdS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53036wds.AYXKKw(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        C56126xwt<java.lang.Boolean> c56126xwtIwGUEr = finit().iwGUEr();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        c56126xwtIwGUEr.AEQbTJ(viewLifecycleOwner5, new Function1() { // from class: o.wdU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53036wds.gEmmrt(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        C56126xwt<ParamBuilder> c56126xwtAkhnZx = finit().AkhnZx();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        c56126xwtAkhnZx.AEQbTJ(viewLifecycleOwner6, new Function1() { // from class: o.wdv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53036wds.KWHzl(this.AEQbTJ, (ParamBuilder) obj);
            }
        });
        C56126xwt<java.lang.Boolean> c56126xwtAhwBna = finit().AhwBna();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        c56126xwtAhwBna.AEQbTJ(viewLifecycleOwner7, new Function1() { // from class: o.wdu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53036wds.AhwBna(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit AEQbTJ(C53036wds c53036wds, java.util.List list) {
        java.lang.String algoId;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(list, "");
        StrategyResponse strategyResponse = (StrategyResponse) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (strategyResponse != null && (algoId = strategyResponse.getAlgoId()) != null) {
            str = algoId;
        }
        c53036wds.finit().AuCTel().KWHzl(C56390yDp.OLrzqt("smart_iceberg", str));
        c53036wds.fIwbmz();
        c53036wds.djBIcL();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C53036wds c53036wds, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c53036wds.showLoading();
        } else {
            c53036wds.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(C53036wds c53036wds, java.lang.Exception exc) {
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String strGEmmrt = ((SmartIcebergPresenter) c53036wds.dxcTrN()).fvQaOB().gEmmrt();
        java.lang.String message2 = exc.getMessage();
        java.lang.String str = message2 == null ? "" : message2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        c55867xrz.KWHzl("bot_create_page", java.lang.String.valueOf(jCurrentTimeMillis), "smart_iceberg", strGEmmrt, EopTrackEvent.KEY_RESULT_FAILED, new BotGrafanaInfo(null, str, null, (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.QbewEr()) ? false : true, 5, null));
    }

    public static final Unit AEQbTJ(C53036wds c53036wds, xMJ.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        if (c53036wds.valueOf) {
            return Unit.INSTANCE;
        }
        if (C33129mqd.AEQbTJ(application.AYXKKw(), 0)) {
            c53036wds.valueOf = true;
            c53036wds.fIwbmz();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AYXKKw(C53036wds c53036wds, boolean z) {
        if (z) {
            ((uQM) c53036wds.gGvvIC()).copydefault.AYXKKw();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit gEmmrt(C53036wds c53036wds, boolean z) {
        C49924uxi.updateLeverage$default(((uQM) c53036wds.gGvvIC()).copydefault, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C53036wds c53036wds, ParamBuilder paramBuilder) {
        Intrinsics.checkNotNullParameter(paramBuilder, "");
        ((uQM) c53036wds.gGvvIC()).copydefault.EZpvd(C49861uwY.Companion.copydefault().get());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AhwBna(C53036wds c53036wds, boolean z) {
        ((uQM) c53036wds.gGvvIC()).copydefault.EZpvd(C49861uwY.Companion.copydefault().get());
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C53036wds c53036wds, android.view.View view, android.view.View view2) {
        C49960uyR.setWindowSoftInput$default(c53036wds, view, java.lang.Integer.valueOf(C48033uCm.Application.fvQaOB), view2, 0, 8, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fARcdN() {
        C53056weL c53056weL = ((uQM) gGvvIC()).KWHzl;
        Intrinsics.checkNotNullExpressionValue(c53056weL, "");
        EZpvd(this, c53056weL.AYXKKw(), c53056weL.AYXKKw());
        EZpvd(this, c53056weL.AhwBna(), c53056weL.AhwBna());
        EZpvd(this, c53056weL.valueOf(), c53056weL.valueOf());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC48165uHj
    public void AEQbTJ(boolean z) {
        this.valueOf = false;
        iwGUEr();
        getFieldNames();
        ejfBZ();
        copydefault().valueOf();
        AuCTel();
        ((uQM) gGvvIC()).KWHzl.EZpvd(z);
        EZpvd(z);
        C50029uzh c50029uzh = C50029uzh.EZpvd;
        c50029uzh.KWHzl(this.AYXKKw);
        c50029uzh.copydefault(this.AYXKKw, 60L);
        copydefault().KWHzl();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AuCTel() {
        C56235xyw c56235xyw = this.EZpvd;
        c56235xyw.KWHzl("smart_iceberg");
        c56235xyw.AEQbTJ(((SmartIcebergPresenter) dxcTrN()).fvQaOB().gEmmrt());
        c56235xyw.OLrzqt(((SmartIcebergPresenter) dxcTrN()).fvQaOB().AEQbTJ("smart_iceberg"));
        c56235xyw.KWHzl(new Function1() { // from class: o.wdQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53036wds.copydefault(this.OLrzqt, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c56235xyw, 0L, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC48165uHj, o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        C49861uwY.Companion.copydefault().addOnPropertyChangedCallback(this.AhwBna);
        C49992uyx c49992uyxAEQbTJ = C49983uyo.Companion.AEQbTJ(getActivity());
        if (c49992uyxAEQbTJ != null) {
            c49992uyxAEQbTJ.EZpvd(this.djBIcL);
        }
        ((uQM) gGvvIC()).copydefault.AuCTel();
        ((uQM) gGvvIC()).copydefault.EZpvd(new TaskDescription());
        ((uQM) gGvvIC()).copydefault.EZpvd(new ActionBar());
        ((uQM) gGvvIC()).copydefault.OLrzqt(new StateListAnimator());
        ((uQM) gGvvIC()).KWHzl.EZpvd().EZpvd();
    }

    /* JADX INFO: renamed from: o.wds$TaskDescription */
    public static final class TaskDescription implements yHO<java.lang.String, java.lang.Boolean, BizInstrument, Unit> {
        public TaskDescription() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(java.lang.String str, java.lang.Boolean bool, BizInstrument bizInstrument) {
            KWHzl(str, bool.booleanValue(), bizInstrument);
            return Unit.INSTANCE;
        }

        public void KWHzl(java.lang.String str, boolean z, BizInstrument bizInstrument) {
            Intrinsics.checkNotNullParameter(str, "");
            C53036wds.this.finit().djBIcL().KWHzl(bizInstrument);
        }
    }

    /* JADX INFO: renamed from: o.wds$ActionBar */
    public static final class ActionBar implements Function0<Unit> {
        public ActionBar() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            OLrzqt();
            return Unit.INSTANCE;
        }

        public void OLrzqt() {
            C53036wds.this.copydefault().valueOf();
        }
    }

    /* JADX INFO: renamed from: o.wds$StateListAnimator */
    public static final class StateListAnimator implements Function1<java.lang.String, Unit> {
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.String str) {
            AEQbTJ(str);
            return Unit.INSTANCE;
        }

        public void AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C53036wds.this.valueOf();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC48165uHj, o.AbstractC54505xKx, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        C50029uzh.EZpvd.KWHzl(this.AYXKKw);
        copydefault().gEmmrt();
        C49861uwY.Companion.copydefault().removeOnPropertyChangedCallback(this.AhwBna);
        C49992uyx c49992uyxAEQbTJ = C49983uyo.Companion.AEQbTJ(getActivity());
        if (c49992uyxAEQbTJ != null) {
            c49992uyxAEQbTJ.OLrzqt(this.djBIcL);
        }
        ((uQM) gGvvIC()).copydefault.DbNXlk();
        ((uQM) gGvvIC()).copydefault.copydefault();
        ((uQM) gGvvIC()).copydefault.KWHzl();
        ((uQM) gGvvIC()).copydefault.EZpvd();
        this.EZpvd.AYXKKw();
        ((uQM) gGvvIC()).KWHzl.EZpvd().copydefault();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C50029uzh.EZpvd.KWHzl(this.AYXKKw);
        super.onDestroyView();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void iwGUEr() {
        if (this.copydefault) {
            android.os.Bundle arguments = getArguments();
            java.lang.Object obj = arguments != null ? arguments.get(OtcExtraKeys.SIDE) : null;
            TradeType tradeType = obj instanceof TradeType ? (TradeType) obj : null;
            android.os.Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                arguments2.putParcelable(OtcExtraKeys.SIDE, null);
            }
            ((uQM) gGvvIC()).AYXKKw.OLrzqt(tradeType);
        } else {
            ((uQM) gGvvIC()).AYXKKw.OLrzqt(((uQM) gGvvIC()).AYXKKw.copydefault());
        }
        this.copydefault = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final boolean AYXKKw() {
        InterfaceC49496upe interfaceC49496upeCopydefault = C53685wqE.copydefault.copydefault();
        BizInstrument bizInstrumentAhwBna = ((SmartIcebergPresenter) dxcTrN()).fvQaOB().AhwBna();
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        return interfaceC49496upeCopydefault.EZpvd(bizInstrumentAhwBna, childFragmentManager);
    }

    public final void valueOf() {
        copydefault().fIwbmz();
        fIwbmz();
    }

    /* JADX INFO: renamed from: o.wds$LoaderManager */
    public static final class LoaderManager extends Observable.OnPropertyChangedCallback {
        public LoaderManager() {
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(androidx.databinding.Observable observable, int i) {
            if (C56059xvf.EZpvd.fIwbmz() && Intrinsics.EZpvd((java.lang.Object) C53036wds.AhwBna(C53036wds.this).fvQaOB().djBIcL(), (java.lang.Object) "SPOT")) {
                C53036wds.this.fIwbmz();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fIwbmz() {
        ViewOnClickListenerC53063weS viewOnClickListenerC53063weSCopydefault = copydefault();
        viewOnClickListenerC53063weSCopydefault.isConnected();
        viewOnClickListenerC53063weSCopydefault.AkhnZx();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.weL.updateUi$default(o.weL, boolean, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void djBIcL() {
        C53056weL.updateUi$default(((uQM) gGvvIC()).KWHzl, false, 1, null);
        initAdvanced$default(this, false, 1, null);
    }

    public static /* synthetic */ boolean getPMAndMargin$default(C53036wds c53036wds, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c53036wds.OLrzqt(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OLrzqt(java.lang.String str) {
        return (Intrinsics.EZpvd((java.lang.Object) ((SmartIcebergPresenter) dxcTrN()).fvQaOB().djBIcL(), (java.lang.Object) "MARGIN") || Intrinsics.EZpvd((java.lang.Object) ((SmartIcebergPresenter) dxcTrN()).fvQaOB().djBIcL(), (java.lang.Object) "SPOT")) && C55697xoo.OLrzqt.isConnected() && C54794xVo.copydefault.EZpvd();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC53558wnk
    public void AEQbTJ(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        final uBL ubl = ((uQM) gGvvIC()).valueOf;
        ubl.setTradeQuoteCcyChange(new Function0() { // from class: o.wdw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53036wds.AEQbTJ(this.EZpvd, ubl);
            }
        });
        ubl.setOnSelectedCallback(function1);
        ubl.setFm(getChildFragmentManager());
        C56111xwe<java.lang.String> newProxyInstance = finit().getNewProxyInstance();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        newProxyInstance.observe(viewLifecycleOwner, new Fragment(new Function1() { // from class: o.wdy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53036wds.copydefault(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(C53036wds c53036wds, uBL ubl) {
        c53036wds.finit().getNewProxyInstance().setValue(ubl.OLrzqt());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C53036wds c53036wds, java.lang.String str) {
        c53036wds.getFieldNames();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC53558wnk
    public java.lang.String EZpvd(ViewModelStoreOwner viewModelStoreOwner, BizInstrument bizInstrument, @NotNull TradeType tradeType) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        ((uQM) gGvvIC()).valueOf.copydefault(viewModelStoreOwner, bizInstrument, tradeType, true);
        this.values = bizInstrument != null ? bizInstrument.isDisplayTradeReceive() : false;
        uBL ubl = ((uQM) gGvvIC()).valueOf;
        Intrinsics.checkNotNullExpressionValue(ubl, "");
        ubl.setVisibility(this.values ? 0 : 8);
        return AhwBna();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC53558wnk
    public java.lang.String AhwBna() {
        return ((uQM) gGvvIC()).valueOf.OLrzqt();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.uxS.initView$default(o.uxS, com.okinc.tradeuilib.order.trade.view.AccountMode, o.uxJ, boolean, int, java.lang.Object):void */
    private final void copydefault(C49908uxS c49908uxS) {
        InterfaceC49899uxJ c49897uxH;
        c49908uxS.KWHzl(this, finit());
        C49974uyf c49974uyf = C49974uyf.EZpvd;
        AccountMode accountModeCopydefault = c49974uyf.copydefault();
        AccountMode accountModeCopydefault2 = c49974uyf.copydefault();
        int i = accountModeCopydefault2 == null ? -1 : Application.copydefault[accountModeCopydefault2.ordinal()];
        if (i == 1) {
            c49897uxH = new C49897uxH(new SmartIcebergFragment$initializeMarginSwitchView$1(this), new Function1() { // from class: o.wdR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C53036wds.AEQbTJ((BizInstrument) obj));
                }
            });
        } else if (i == 2 || i == 3) {
            c49897uxH = new C49898uxI(new SmartIcebergFragment$initializeMarginSwitchView$3(this));
        } else {
            c49897uxH = new C49900uxK(new SmartIcebergFragment$initializeMarginSwitchView$4(this), new Function2() { // from class: o.wdN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C53036wds.AEQbTJ(this.OLrzqt, (androidx.fragment.app.FragmentManager) obj, (Function0) obj2);
                }
            }, new yHO() { // from class: o.wdO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return C53036wds.EZpvd((android.content.Context) obj, (java.lang.String) obj2, (java.lang.String) obj3);
                }
            });
        }
        C49908uxS.initView$default(c49908uxS, accountModeCopydefault, c49897uxH, false, 4, null);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new SmartIcebergFragment$initializeMarginSwitchView$7(this, null), 3, null);
    }

    public static final boolean AEQbTJ(BizInstrument bizInstrument) {
        return C53685wqE.copydefault.copydefault().KWHzl(bizInstrument);
    }

    public static final Unit AEQbTJ(C53036wds c53036wds, androidx.fragment.app.FragmentManager fragmentManager, Function0 function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function0, "");
        InterfaceC49499uph interfaceC49499uph = (InterfaceC49499uph) C43251rlk.copydefault(InterfaceC49499uph.class);
        android.content.Context contextRequireContext = c53036wds.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        interfaceC49499uph.KWHzl(contextRequireContext, fragmentManager, function0);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(android.content.Context context, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC49499uph.StateListAnimator.startBorrowManagement$default((InterfaceC49499uph) C43251rlk.copydefault(InterfaceC49499uph.class), context, str, str2, null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void ejfBZ() {
        AccountMode accountModeCopydefault = C49974uyf.EZpvd.copydefault();
        if (accountModeCopydefault == null) {
            return;
        }
        if (Application.copydefault[accountModeCopydefault.ordinal()] == 4 && Intrinsics.EZpvd((java.lang.Object) ((SmartIcebergPresenter) dxcTrN()).fvQaOB().djBIcL(), (java.lang.Object) "SPOT")) {
            C49924uxi.updateUi$default(((uQM) gGvvIC()).copydefault, null, 1, null);
            fIwbmz();
            C47988uAv.clearSeekBarData$default(((uQM) gGvvIC()).KWHzl.AYXKKw(), false, 1, null);
        }
        KWHzl((uQM) gGvvIC());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(uQM uqm) {
        pUU.EZpvd(getTAG(), "refreshLeverageUIAndVisibility -> instType: " + ((SmartIcebergPresenter) dxcTrN()).fvQaOB().djBIcL() + ", instId: " + ((SmartIcebergPresenter) dxcTrN()).fvQaOB().gEmmrt());
        AbstractC49896uxG abstractC49896uxGAhwBna = uqm.copydefault.AhwBna();
        if (abstractC49896uxGAhwBna != null) {
            abstractC49896uxGAhwBna.KWHzl(new BizInfoConfig.CustomArgsBizConfig(((SmartIcebergPresenter) dxcTrN()).fvQaOB().djBIcL(), ((SmartIcebergPresenter) dxcTrN()).fvQaOB().gEmmrt()));
        }
        ConstraintLayout constraintLayout = uqm.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        androidx.transition.Fade fade = new androidx.transition.Fade();
        fade.setDuration(230L);
        androidx.transition.TransitionManager.beginDelayedTransition(constraintLayout, fade);
        C49924uxi.updateUi$default(uqm.copydefault, null, 1, null);
        boolean zFetchVPNInfo = uqm.copydefault.fetchVPNInfo();
        C49924uxi c49924uxi = uqm.copydefault;
        Intrinsics.checkNotNullExpressionValue(c49924uxi, "");
        c49924uxi.setVisibility(zFetchVPNInfo ? 0 : 8);
        uqm.OLrzqt.EZpvd(zFetchVPNInfo, uqm.copydefault.getId());
    }

    private final void AEQbTJ(C49924uxi c49924uxi) {
        c49924uxi.valueOf().copydefault.setHorizontalGravity(8388613);
        c49924uxi.setFm(getChildFragmentManager());
        c49924uxi.AEQbTJ(this, BizInfoConfig.DefaultBizConfig.copydefault, (CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA & 4) != 0 ? false : false, new Function1() { // from class: o.wdH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53036wds.OLrzqt((android.content.Context) obj);
            }
        }, new Function1() { // from class: o.wdM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53036wds.EZpvd((android.content.Context) obj);
            }
        }, new yHO() { // from class: o.wdI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C53036wds.OLrzqt((android.app.Activity) obj, (java.lang.String) obj2, (java.lang.String) obj3);
            }
        }, (CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA & 64) != 0, (CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA & 128) != 0 ? false : false);
        c49924uxi.setOnMarginModelClickListener(new View.OnClickListener() { // from class: o.wdK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53036wds.OLrzqt(view);
            }
        });
        c49924uxi.setOnLeverageRightClickListener(new View.OnClickListener() { // from class: o.wdJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53036wds.EZpvd(view);
            }
        });
        c49924uxi.setCallback(new Function1() { // from class: o.wdL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53036wds.valueOf((android.content.Context) obj);
            }
        });
    }

    public static final Unit OLrzqt(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C53685wqE.copydefault.OLrzqt().EZpvd(context);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if ((context instanceof FragmentActivity ? (FragmentActivity) context : null) != null) {
            C53685wqE.copydefault.KWHzl().EZpvd((FragmentActivity) context);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C53685wqE.copydefault.OLrzqt().EZpvd(activity, str, str2);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(android.view.View view) {
        C56028xvA.botClickTrack$default("marginModelAndLeverage-marginModel", null, 2, null);
    }

    public static final void EZpvd(android.view.View view) {
        C56028xvA.botClickTrack$default("marginModelAndLeverage-Leverage", null, 2, null);
    }

    public static final Unit valueOf(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        InterfaceC8104awT.StateListAnimator.routeLogin$default((InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class), context, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getFieldNames() {
        InterfaceC49904uxO c49901uxL;
        BizInstrument bizInstrumentAhwBna = ((SmartIcebergPresenter) dxcTrN()).fvQaOB().AhwBna();
        wUP wup = ((uQM) gGvvIC()).OLrzqt;
        AccountMode accountModeCopydefault = C49974uyf.EZpvd.copydefault();
        C54794xVo c54794xVo = C54794xVo.copydefault;
        if (c54794xVo.EZpvd()) {
            c49901uxL = new C49902uxM(bizInstrumentAhwBna, null);
        } else {
            c49901uxL = c54794xVo.valueOf() ? new C49901uxL(bizInstrumentAhwBna, null) : new C49905uxP(bizInstrumentAhwBna, java.lang.Boolean.valueOf(fJNWhG()));
        }
        wup.KWHzl(accountModeCopydefault, c49901uxL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean fJNWhG() {
        xND xndAEQbTJ = C53685wqE.copydefault.OLrzqt().AEQbTJ();
        if (xndAEQbTJ != null) {
            return Intrinsics.EZpvd(xndAEQbTJ.values(), java.lang.Boolean.TRUE);
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C53036wds c53036wds, ResponseData responseData) {
        StrategyConfigInfo strategyConfigInfo;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.util.List list = (java.util.List) responseData.getData();
            if (list != null && (strategyConfigInfo = (StrategyConfigInfo) CollectionsKt___CollectionsKt.firstOrNull(list)) != null) {
                ((uQM) c53036wds.gGvvIC()).KWHzl.AEQbTJ(strategyConfigInfo);
                ((uQM) c53036wds.gGvvIC()).EZpvd.OLrzqt(strategyConfigInfo);
            }
        } else {
            C55326xho.toast$default(responseData.getMsg(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }
}
