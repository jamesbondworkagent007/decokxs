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
import com.okinc.biz.TradeType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.tradeapi.bean.ParamBuilder;
import com.okinc.tradeuilib.order.trade.view.AccountMode;
import com.okinc.tradingbot.impl.order.strategy.twap.base.TwapFragment$initView$1;
import com.okinc.tradingbot.impl.order.strategy.twap.base.TwapFragment$initView$2;
import com.okinc.tradingbot.impl.order.strategy.twap.base.TwapFragment$initializeMarginSwitchView$1;
import com.okinc.tradingbot.impl.order.strategy.twap.base.TwapFragment$initializeMarginSwitchView$3;
import com.okinc.tradingbot.impl.order.strategy.twap.base.TwapFragment$initializeMarginSwitchView$4;
import com.okinc.tradingbot.impl.order.strategy.twap.base.TwapFragment$initializeMarginSwitchView$7;
import com.okinc.tradingbot.impl.order.strategy.twap.base.TwapTradePresenter;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.bot.data.BotGrafanaInfo;
import com.okinc.unify_trade.manager.MarginModeManager;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import com.okinc.unify_trade.universal.data.PositionLiveDataResp;
import com.okinc.unify_trade.universal.data.TradeCloseAvailable;
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
import o.C49861uwY;
import o.InterfaceC49433uoU;
import o.InterfaceC49499uph;
import o.InterfaceC8104awT;
import o.xDM;
import o.xMJ;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.wkl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC53400wkl extends AbstractC48165uHj<AbstractC48432uRe, TwapTradePresenter> implements InterfaceC49433uoU {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public xDM AEQbTJ;
    public TradeCloseAvailable AkhnZx;
    public MaxAvailableResp KWHzl;
    public boolean fetchVPNInfo;
    public final int values = C48033uCm.Activity.zOIQXb;
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.wkt
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC53400wkl.DbNXlk(this.EZpvd);
        }
    });
    public boolean AYXKKw = true;
    public final java.lang.Runnable fARcdN = new java.lang.Runnable() { // from class: o.wkr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public final void run() {
            AbstractC53400wkl.fetchVPNInfo(this.OLrzqt);
        }
    };
    public final java.util.ArrayList<InterfaceC49433uoU.Activity> isConnected = new java.util.ArrayList<>();
    public final java.util.ArrayList<java.lang.Object> valueOf = new java.util.ArrayList<>();
    public final Observer<PositionLiveDataResp> DbNXlk = new Observer() { // from class: o.wks
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            AbstractC53400wkl.copydefault(this.copydefault, (PositionLiveDataResp) obj);
        }
    };
    public final LoaderManager fJNWhG = new LoaderManager();
    public final FragmentManager ejfBZ = new FragmentManager();
    public Observer<java.lang.Boolean> AhwBna = new Observer() { // from class: o.wky
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            AbstractC53400wkl.KWHzl(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
        }
    };
    public Observer<java.lang.Boolean> uzCIH = new Observer() { // from class: o.wkw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            AbstractC53400wkl.valueOf(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
        }
    };
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.wkx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC53400wkl.AkhnZx(this.KWHzl);
        }
    });

    /* JADX INFO: renamed from: o.wkl$Dialog */
    public static final /* synthetic */ class Dialog implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.wkl$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class TaskDescription {
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

    public abstract void OLrzqt(@NotNull java.lang.String str, @NotNull TwapReq twapReq, @NotNull Function1<? super TwapReq, Unit> function1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MaxAvailableResp copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.ArrayList<InterfaceC49433uoU.Activity> djBIcL() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeCloseAvailable fetchVPNInfo() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.values;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC48432uRe gEmmrt(AbstractC53400wkl abstractC53400wkl) {
        return (AbstractC48432uRe) abstractC53400wkl.gGvvIC();
    }

    /* JADX INFO: renamed from: o.wkl$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wkl.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final AbstractC53400wkl copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "MARGIN")) {
                return C53398wkj.Companion.OLrzqt(str);
            }
            return new C53397wki();
        }
    }

    public static final ViewOnClickListenerC53541wnT DbNXlk(AbstractC53400wkl abstractC53400wkl) {
        android.content.Context contextRequireContext = abstractC53400wkl.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new ViewOnClickListenerC53541wnT(contextRequireContext, null, 0, 6, null);
    }

    public final ViewOnClickListenerC53541wnT AYXKKw() {
        return (ViewOnClickListenerC53541wnT) this.gEmmrt.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: gEmmrt()Landroid/view/View; */
    /* JADX DEBUG: Possible override for method o.uHj.AEQbTJ()V */
    @Override // o.AbstractC48165uHj
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ViewOnClickListenerC53541wnT gEmmrt() {
        return AYXKKw();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void fetchVPNInfo(AbstractC53400wkl abstractC53400wkl) {
        if (!abstractC53400wkl.isAdded() || abstractC53400wkl.isDetached() || abstractC53400wkl.getView() == null) {
            return;
        }
        InterfaceC49496upe interfaceC49496upeCopydefault = C53685wqE.copydefault.copydefault();
        BizInstrument bizInstrumentAhwBna = ((TwapTradePresenter) abstractC53400wkl.dxcTrN()).fvQaOB().AhwBna();
        androidx.fragment.app.FragmentManager childFragmentManager = abstractC53400wkl.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        interfaceC49496upeCopydefault.EZpvd(bizInstrumentAhwBna, childFragmentManager);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(AbstractC53400wkl abstractC53400wkl, PositionLiveDataResp positionLiveDataResp) {
        java.lang.String strAYXKKw;
        java.lang.String strGEmmrt;
        java.lang.String strGEmmrt2;
        TradeCloseAvailable tradeCloseAvailable;
        MarginModeManager marginModeManagerIsConnected;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(positionLiveDataResp, "");
        TradeCloseAvailable tradeCloseAvailable2 = tradeCloseAvailable;
        TradeCloseAvailable tradeCloseAvailable3 = new TradeCloseAvailable(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
        BizInstrument bizInstrumentAhwBna = ((TwapTradePresenter) abstractC53400wkl.dxcTrN()).fvQaOB().AhwBna();
        if (bizInstrumentAhwBna == null) {
            return;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String currentMarginMode$default = (interfaceC54581xNrOLrzqt == null || (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt.isConnected()) == null) ? null : MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected, false, null, 3, null);
        java.util.List<TradePositionManager.PositionItem> positions = positionLiveDataResp.getPositions();
        if (positions != null) {
            for (TradePositionManager.PositionItem positionItem : positions) {
                if (Intrinsics.EZpvd((java.lang.Object) bizInstrumentAhwBna.getInstId(), (java.lang.Object) positionItem.getInstId()) && Intrinsics.EZpvd((java.lang.Object) positionItem.getPosSide(), (java.lang.Object) "long") && Intrinsics.EZpvd((java.lang.Object) positionItem.getMarginModel(), (java.lang.Object) currentMarginMode$default)) {
                    tradeCloseAvailable = tradeCloseAvailable2;
                    tradeCloseAvailable.setLongLast(positionItem.getLast());
                    tradeCloseAvailable.setPosLong(C33129mqd.addS$default(tradeCloseAvailable.getPosLong(), positionItem.getPos(), null, null, null, 14, null));
                } else {
                    tradeCloseAvailable = tradeCloseAvailable2;
                }
                if (Intrinsics.EZpvd((java.lang.Object) bizInstrumentAhwBna.getInstId(), (java.lang.Object) positionItem.getInstId()) && Intrinsics.EZpvd((java.lang.Object) positionItem.getPosSide(), (java.lang.Object) "short") && Intrinsics.EZpvd((java.lang.Object) positionItem.getMarginModel(), (java.lang.Object) currentMarginMode$default)) {
                    tradeCloseAvailable.setShortLast(positionItem.getLast());
                    tradeCloseAvailable.setPosShort(C33129mqd.addS$default(tradeCloseAvailable.getPosShort(), positionItem.getPos(), null, null, null, 14, null));
                }
                tradeCloseAvailable2 = tradeCloseAvailable;
            }
        }
        TradeCloseAvailable tradeCloseAvailable4 = tradeCloseAvailable2;
        xMJ.Application value = C54782xVc.AEQbTJ.AhwBna().getValue();
        if (value == null || (strAYXKKw = value.AYXKKw()) == null) {
            strAYXKKw = "";
        }
        C54571xNh c54571xNhCreateAmtConvert$default = C55887xsS.createAmtConvert$default(((TwapTradePresenter) abstractC53400wkl.dxcTrN()).fvQaOB(), strAYXKKw, false, 2, null);
        ViewOnClickListenerC53541wnT viewOnClickListenerC53541wnTAYXKKw = abstractC53400wkl.AYXKKw();
        if (c54571xNhCreateAmtConvert$default == null || (strGEmmrt = c54571xNhCreateAmtConvert$default.gEmmrt(tradeCloseAvailable4.getPosShort())) == null) {
            strGEmmrt = "";
        }
        if (c54571xNhCreateAmtConvert$default != null && (strGEmmrt2 = c54571xNhCreateAmtConvert$default.gEmmrt(tradeCloseAvailable4.getPosLong())) != null) {
            str = strGEmmrt2;
        }
        viewOnClickListenerC53541wnTAYXKKw.KWHzl(strGEmmrt, str);
        abstractC53400wkl.AkhnZx = tradeCloseAvailable4;
    }

    /* JADX INFO: renamed from: o.wkl$LoaderManager */
    public static final class LoaderManager extends Observable.OnPropertyChangedCallback {
        public LoaderManager() {
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(androidx.databinding.Observable observable, int i) {
            C49861uwY.ActionBar actionBar = C49861uwY.Companion;
            AbstractC53400wkl.gEmmrt(AbstractC53400wkl.this).KWHzl.EZpvd(actionBar.copydefault().get());
            AbstractC53400wkl.this.hDKMBd();
            AbstractC53400wkl.gEmmrt(AbstractC53400wkl.this).AEQbTJ.getNewProxyInstance();
            AbstractC53400wkl.this.AYXKKw().AEQbTJ();
            AbstractC53400wkl.this.AuCTelauCTel();
            AbstractC53400wkl.this.AubY();
            AbstractC53400wkl.this.getFieldNames();
            C56028xvA.OLrzqt("TradeSideTabView", C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.SIDE, java.lang.String.valueOf(actionBar.copydefault().get()))));
        }
    }

    /* JADX INFO: renamed from: o.wkl$FragmentManager */
    public static final class FragmentManager extends Observable.OnPropertyChangedCallback {
        public FragmentManager() {
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(androidx.databinding.Observable observable, int i) {
            AbstractC53400wkl abstractC53400wkl = AbstractC53400wkl.this;
            abstractC53400wkl.AEQbTJ(abstractC53400wkl.AwvSrB());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(AbstractC53400wkl abstractC53400wkl, boolean z) {
        if (z) {
            ((AbstractC48432uRe) abstractC53400wkl.gGvvIC()).KWHzl.AYXKKw();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void valueOf(AbstractC53400wkl abstractC53400wkl, boolean z) {
        if (z) {
            C49924uxi.updateLeverage$default(((AbstractC48432uRe) abstractC53400wkl.gGvvIC()).KWHzl, null, 1, null);
        }
    }

    public final boolean fJNWhG() {
        xND xndAEQbTJ = C53685wqE.copydefault.OLrzqt().AEQbTJ();
        if (xndAEQbTJ != null) {
            return Intrinsics.EZpvd(xndAEQbTJ.values(), java.lang.Boolean.TRUE);
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void hDKMBd() {
        InterfaceC49904uxO c49901uxL;
        BizInstrument bizInstrumentAhwBna = ((TwapTradePresenter) dxcTrN()).fvQaOB().AhwBna();
        wUP wup = ((AbstractC48432uRe) gGvvIC()).EZpvd;
        AccountMode accountModeCopydefault = C49974uyf.EZpvd.copydefault();
        C54794xVo c54794xVo = C54794xVo.copydefault;
        if (c54794xVo.EZpvd()) {
            c49901uxL = new C49902uxM(bizInstrumentAhwBna, null);
        } else {
            c49901uxL = c54794xVo.valueOf() ? new C49901uxL(bizInstrumentAhwBna, null) : new C49905uxP(bizInstrumentAhwBna, java.lang.Boolean.valueOf(fJNWhG()));
        }
        wup.KWHzl(accountModeCopydefault, c49901uxL);
    }

    public final void copydefault(C49908uxS c49908uxS) {
        InterfaceC49899uxJ c49897uxH;
        c49908uxS.KWHzl(this, finit());
        C49974uyf c49974uyf = C49974uyf.EZpvd;
        AccountMode accountModeCopydefault = c49974uyf.copydefault();
        AccountMode accountModeCopydefault2 = c49974uyf.copydefault();
        int i = accountModeCopydefault2 == null ? -1 : TaskDescription.copydefault[accountModeCopydefault2.ordinal()];
        if (i == 1) {
            c49897uxH = new C49897uxH(new TwapFragment$initializeMarginSwitchView$1(this), new Function1() { // from class: o.wkL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(AbstractC53400wkl.OLrzqt((BizInstrument) obj));
                }
            });
        } else if (i == 2 || i == 3) {
            c49897uxH = new C49898uxI(new TwapFragment$initializeMarginSwitchView$3(this));
        } else {
            c49897uxH = new C49900uxK(new TwapFragment$initializeMarginSwitchView$4(this), new Function2() { // from class: o.wkM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return AbstractC53400wkl.OLrzqt(this.OLrzqt, (androidx.fragment.app.FragmentManager) obj, (Function0) obj2);
                }
            }, new yHO() { // from class: o.wkR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return AbstractC53400wkl.AEQbTJ((android.content.Context) obj, (java.lang.String) obj2, (java.lang.String) obj3);
                }
            });
        }
        C49908uxS.initView$default(c49908uxS, accountModeCopydefault, c49897uxH, false, 4, null);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new TwapFragment$initializeMarginSwitchView$7(this, null), 3, null);
    }

    public static final boolean OLrzqt(BizInstrument bizInstrument) {
        return C53685wqE.copydefault.copydefault().KWHzl(bizInstrument);
    }

    public static final Unit OLrzqt(AbstractC53400wkl abstractC53400wkl, androidx.fragment.app.FragmentManager fragmentManager, Function0 function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function0, "");
        InterfaceC49499uph interfaceC49499uph = (InterfaceC49499uph) C43251rlk.copydefault(InterfaceC49499uph.class);
        android.content.Context contextRequireContext = abstractC53400wkl.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        interfaceC49499uph.KWHzl(contextRequireContext, fragmentManager, function0);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(android.content.Context context, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        InterfaceC49499uph.StateListAnimator.startBorrowManagement$default((InterfaceC49499uph) C43251rlk.copydefault(InterfaceC49499uph.class), context, str, str2, null, 8, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(C49924uxi c49924uxi) {
        c49924uxi.setFm(getChildFragmentManager());
        c49924uxi.valueOf().copydefault.setHorizontalGravity(8388613);
        c49924uxi.AEQbTJ(this, BizInfoConfig.DefaultBizConfig.copydefault, (CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA & 4) != 0 ? false : false, new Function1() { // from class: o.wkS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC53400wkl.djBIcL((android.content.Context) obj);
            }
        }, new Function1() { // from class: o.wkQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC53400wkl.AEQbTJ((android.content.Context) obj);
            }
        }, new yHO() { // from class: o.wkP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return AbstractC53400wkl.KWHzl((android.app.Activity) obj, (java.lang.String) obj2, (java.lang.String) obj3);
            }
        }, (CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA & 64) != 0, (CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA & 128) != 0 ? false : false);
        c49924uxi.setOnMarginModelClickListener(new View.OnClickListener() { // from class: o.wkn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractC53400wkl.KWHzl(view);
            }
        });
        c49924uxi.setOnLeverageRightClickListener(new View.OnClickListener() { // from class: o.wkk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractC53400wkl.OLrzqt(view);
            }
        });
        c49924uxi.setCallback(new Function1() { // from class: o.wkp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC53400wkl.copydefault((android.content.Context) obj);
            }
        });
    }

    public static final Unit djBIcL(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C53685wqE.copydefault.OLrzqt().EZpvd(context);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if ((context instanceof FragmentActivity ? (FragmentActivity) context : null) != null) {
            C53685wqE.copydefault.KWHzl().EZpvd((FragmentActivity) context);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C53685wqE.copydefault.OLrzqt().EZpvd(activity, str, str2);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(android.view.View view) {
        C56028xvA.botClickTrack$default("marginModelAndLeverage-marginModel", null, 2, null);
    }

    public static final void OLrzqt(android.view.View view) {
        C56028xvA.botClickTrack$default("marginModelAndLeverage-Leverage", null, 2, null);
    }

    public static final Unit copydefault(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        InterfaceC8104awT.StateListAnimator.routeLogin$default((InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class), context, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getFieldNames() {
        ((TwapTradePresenter) dxcTrN()).fvQaOB().gEmmrt(AwvSrB());
        java.lang.String strAwvSrB = AwvSrB();
        C53448wlg c53448wlg = ((AbstractC48432uRe) gGvvIC()).AEQbTJ;
        TradeType tradeType = C49861uwY.Companion.copydefault().get();
        if (tradeType == null) {
            tradeType = TradeType.BUY_OPEN;
        }
        c53448wlg.copydefault(this, tradeType, new Function0() { // from class: o.wkB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC53400wkl.values(this.KWHzl);
            }
        });
        if (Intrinsics.EZpvd((java.lang.Object) strAwvSrB, (java.lang.Object) AwvSrB())) {
            return;
        }
        AEQbTJ(AwvSrB());
    }

    public static final Unit values(AbstractC53400wkl abstractC53400wkl) {
        abstractC53400wkl.finit().getNewProxyInstance().setValue(abstractC53400wkl.AwvSrB());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String AwvSrB() {
        return ((AbstractC48432uRe) gGvvIC()).AEQbTJ.fARcdN();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) ((TwapTradePresenter) dxcTrN()).fvQaOB().djBIcL(), (java.lang.Object) "SPOT")) {
            ((TwapTradePresenter) dxcTrN()).fvQaOB().gEmmrt(str);
            AxsJAY();
            C47988uAv.clearSeekBarData$default(((AbstractC48432uRe) gGvvIC()).AEQbTJ.DbNXlk(), false, 1, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v18, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        wPQ.copydefault(view);
        AYXKKw().setInputPanelView(((AbstractC48432uRe) gGvvIC()).AEQbTJ);
        AYXKKw().setInstManager(((TwapTradePresenter) dxcTrN()).fvQaOB());
        AYXKKw().setMarginModelViewModel(new TwapFragment$initView$1(this));
        ((AbstractC48432uRe) gGvvIC()).AEQbTJ.setInstManager(((TwapTradePresenter) dxcTrN()).fvQaOB());
        ((AbstractC48432uRe) gGvvIC()).AEQbTJ.setMarginModelViewModel(new TwapFragment$initView$2(this));
        AYXKKw().setRefreshCallback(new Function1() { // from class: o.wko
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC53400wkl.AhwBna(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        AYXKKw().setPlaceOrderClickCallback(new Function2() { // from class: o.wkm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC53400wkl.KWHzl(this.AEQbTJ, (java.lang.String) obj, (java.lang.String) obj2);
            }
        });
        fIwbmz();
        wlaJM();
        QKVWgx();
        C55867xrz.KWHzl.OLrzqt("twap", ((TwapTradePresenter) dxcTrN()).fvQaOB().gEmmrt());
        C56111xwe<java.lang.String> newProxyInstance = finit().getNewProxyInstance();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        newProxyInstance.observe(viewLifecycleOwner, new Dialog(new Function1() { // from class: o.wku
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC53400wkl.AEQbTJ(this.EZpvd, (java.lang.String) obj);
            }
        }));
        wUP wup = ((AbstractC48432uRe) gGvvIC()).EZpvd;
        Intrinsics.checkNotNullExpressionValue(wup, "");
        copydefault((C49908uxS) wup);
        C49924uxi c49924uxi = ((AbstractC48432uRe) gGvvIC()).KWHzl;
        Intrinsics.checkNotNullExpressionValue(c49924uxi, "");
        AEQbTJ(c49924uxi);
    }

    public static final Unit AhwBna(AbstractC53400wkl abstractC53400wkl, boolean z) {
        abstractC53400wkl.AEQbTJ(z);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(final AbstractC53400wkl abstractC53400wkl, final java.lang.String str, final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        if (abstractC53400wkl.KWHzl()) {
            return Unit.INSTANCE;
        }
        kotlin.Pair<TwapReq, java.lang.Boolean> pairCopydefault = ((AbstractC48432uRe) abstractC53400wkl.gGvvIC()).AEQbTJ.copydefault();
        if (pairCopydefault.getSecond().booleanValue()) {
            C49967uyY c49967uyY = C49967uyY.EZpvd;
            C53448wlg c53448wlg = ((AbstractC48432uRe) abstractC53400wkl.gGvvIC()).AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c53448wlg, "");
            c49967uyY.KWHzl(c53448wlg, C48033uCm.Application.fvQaOB, ((AbstractC48432uRe) abstractC53400wkl.gGvvIC()).AEQbTJ.gEmmrt());
            C33054mpH.EZpvd(abstractC53400wkl);
        }
        TwapReq first = pairCopydefault.getFirst();
        if (first != null) {
            abstractC53400wkl.OLrzqt(str, first, new Function1() { // from class: o.wkE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC53400wkl.EZpvd(this.EZpvd, str, str2, (TwapReq) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(final AbstractC53400wkl abstractC53400wkl, java.lang.String str, java.lang.String str2, TwapReq twapReq) {
        java.lang.String currentMarginMode$default;
        MarginModeManager marginModeManagerIsConnected;
        if (twapReq == null) {
            abstractC53400wkl.dismissLoading();
            return Unit.INSTANCE;
        }
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        final java.lang.String str3 = c54589xNz.EZpvd() ? "demo" : "live";
        C32866mlf.onEvent$default("app_trade_strategy_confirm_create_click", (TrackChannel[]) null, new Function1() { // from class: o.wkv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC53400wkl.EZpvd(str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C32866mlf.onEvent$default("BotPlaceOrder_PlaceOrder_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.wkz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC53400wkl.copydefault(str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        TwapTradePresenter twapTradePresenter = (TwapTradePresenter) abstractC53400wkl.dxcTrN();
        BizInstrument bizInstrumentAhwBna = ((TwapTradePresenter) abstractC53400wkl.dxcTrN()).fvQaOB().AhwBna();
        twapReq.setTradeBorrowMode(C56059xvf.EZpvd.fIwbmz() ? java.lang.Boolean.valueOf(C49983uyo.Companion.KWHzl(abstractC53400wkl.getActivity())) : null);
        twapReq.setLeftLevel(abstractC53400wkl.valueOf());
        twapReq.setRightLevel(abstractC53400wkl.isConnected());
        twapReq.setTradeQuoteCcy(abstractC53400wkl.AwvSrB());
        Unit unit = Unit.INSTANCE;
        java.lang.String str4 = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "clickBuy") ? "buy" : "sell";
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        java.lang.String strZLjUOn = abstractC53400wkl.zLjUOn();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt.isConnected()) == null || (currentMarginMode$default = MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected, false, null, 3, null)) == null) {
            currentMarginMode$default = "";
        }
        twapTradePresenter.AEQbTJ(bizInstrumentAhwBna, twapReq, str4, str2, bool, strZLjUOn, currentMarginMode$default, new yHO() { // from class: o.wkD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return AbstractC53400wkl.EZpvd((java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3);
            }
        }, new Function2() { // from class: o.wkC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC53400wkl.OLrzqt(this.KWHzl, (StrategyReqGroup) obj, (yHO) obj2);
            }
        });
        return unit;
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("entrust_type", "twap", true);
        eventParamsList.put(OtcExtraKeys.MODE, str, true);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String strWlaJM = (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM();
        if (strWlaJM != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strWlaJM)) {
            eventParamsList.put("account_type", strWlaJM, true);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "twap", false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(AbstractC53400wkl abstractC53400wkl, StrategyReqGroup strategyReqGroup, yHO yho) {
        Intrinsics.checkNotNullParameter(strategyReqGroup, "");
        Intrinsics.checkNotNullParameter(yho, "");
        AbstractC50583vTu abstractC50583vTuNewInstance$default = AbstractC50583vTu.Application.newInstance$default(AbstractC50583vTu.Companion, ((TwapTradePresenter) abstractC53400wkl.dxcTrN()).fvQaOB().gEmmrt(), ((TwapTradePresenter) abstractC53400wkl.dxcTrN()).fvQaOB().djBIcL(), strategyReqGroup, false, 8, null);
        if (abstractC50583vTuNewInstance$default != null) {
            abstractC50583vTuNewInstance$default.show(abstractC53400wkl.getChildFragmentManager(), AbstractC50583vTu.class.getSimpleName());
        }
        if (abstractC50583vTuNewInstance$default != null) {
            abstractC50583vTuNewInstance$default.copydefault((yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit>) yho);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractC53400wkl abstractC53400wkl, java.lang.String str) {
        abstractC53400wkl.hDKMBd();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v24, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final java.lang.String zLjUOn() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        AbstractC49896uxG abstractC49896uxGAhwBna;
        if (Intrinsics.EZpvd((java.lang.Object) ((TwapTradePresenter) dxcTrN()).fvQaOB().djBIcL(), (java.lang.Object) "MARGIN") && !values()) {
            if (((TwapTradePresenter) dxcTrN()).fvQaOB().fJNWhG()) {
                AbstractC49896uxG abstractC49896uxGAhwBna2 = ((AbstractC48432uRe) gGvvIC()).KWHzl.AhwBna();
                if (abstractC49896uxGAhwBna2 != null) {
                    return abstractC49896uxGAhwBna2.copydefault();
                }
            } else if (((TwapTradePresenter) dxcTrN()).fvQaOB().fARcdN() && (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && newProxyInstance.DbNXlk() && (abstractC49896uxGAhwBna = ((AbstractC48432uRe) gGvvIC()).KWHzl.AhwBna()) != null) {
                return abstractC49896uxGAhwBna.copydefault();
            }
        }
        return null;
    }

    public final void wlaJM() {
        getChildFragmentManager().setFragmentResultListener("bot_order", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.wkA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                AbstractC53400wkl.copydefault(this.KWHzl, str, bundle);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(AbstractC53400wkl abstractC53400wkl, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        StrategyReqGroup strategyReqGroup = (StrategyReqGroup) bundle.getParcelable("bot_order_data");
        if (strategyReqGroup != null) {
            ((TwapTradePresenter) abstractC53400wkl.dxcTrN()).OLrzqt(strategyReqGroup);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void QKVWgx() {
        C56111xwe<java.util.List<StrategyResponse>> c56111xweOLrzqt = ((TwapTradePresenter) dxcTrN()).OLrzqt();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweOLrzqt.observe(viewLifecycleOwner, new Dialog(new Function1() { // from class: o.wkI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC53400wkl.KWHzl(this.AEQbTJ, (java.util.List) obj);
            }
        }));
        ((TwapTradePresenter) dxcTrN()).EZpvd().AkhnZx().observe(getViewLifecycleOwner(), new Dialog(new Function1() { // from class: o.wkG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC53400wkl.copydefault(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = ((TwapTradePresenter) dxcTrN()).EZpvd().AhwBna();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner2, new Observer() { // from class: o.wkH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                AbstractC53400wkl.EZpvd(this.OLrzqt, (java.lang.Exception) obj);
            }
        });
        C56126xwt<java.lang.String> c56126xwtAYXKKw = finit().AYXKKw();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56126xwtAYXKKw.AEQbTJ(viewLifecycleOwner3, new Function1() { // from class: o.wkF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC53400wkl.KWHzl(this.KWHzl, (java.lang.String) obj);
            }
        });
        TradeLiveData<xMJ.Application> tradeLiveDataAhwBna = C54782xVc.AEQbTJ.AhwBna();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        tradeLiveDataAhwBna.observe(viewLifecycleOwner4, new Dialog(new Function1() { // from class: o.wkN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC53400wkl.AEQbTJ(this.KWHzl, (xMJ.Application) obj);
            }
        }));
        C56126xwt<java.lang.Boolean> c56126xwtOLrzqt = finit().OLrzqt();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        c56126xwtOLrzqt.EZpvd(viewLifecycleOwner5, this.AhwBna);
        C56126xwt<java.lang.Boolean> c56126xwtIwGUEr = finit().iwGUEr();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        c56126xwtIwGUEr.EZpvd(viewLifecycleOwner6, this.uzCIH);
        C56126xwt<ParamBuilder> c56126xwtAkhnZx = finit().AkhnZx();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        c56126xwtAkhnZx.AEQbTJ(viewLifecycleOwner7, new Function1() { // from class: o.wkJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC53400wkl.copydefault(this.KWHzl, (ParamBuilder) obj);
            }
        });
        C56126xwt<java.lang.Boolean> c56126xwtAhwBna = finit().AhwBna();
        LifecycleOwner viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "");
        c56126xwtAhwBna.AEQbTJ(viewLifecycleOwner8, new Function1() { // from class: o.wkK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC53400wkl.djBIcL(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit KWHzl(AbstractC53400wkl abstractC53400wkl, java.util.List list) {
        java.lang.String algoId;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(list, "");
        StrategyResponse strategyResponse = (StrategyResponse) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (strategyResponse != null && (algoId = strategyResponse.getAlgoId()) != null) {
            str = algoId;
        }
        abstractC53400wkl.finit().AuCTel().KWHzl(C56390yDp.OLrzqt("twap", str));
        abstractC53400wkl.AxsJAY();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC53400wkl abstractC53400wkl, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            abstractC53400wkl.showLoading();
        } else {
            abstractC53400wkl.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(AbstractC53400wkl abstractC53400wkl, java.lang.Exception exc) {
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String strGEmmrt = ((TwapTradePresenter) abstractC53400wkl.dxcTrN()).fvQaOB().gEmmrt();
        java.lang.String message2 = exc.getMessage();
        java.lang.String str = message2 == null ? "" : message2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        c55867xrz.KWHzl("bot_create_page", java.lang.String.valueOf(jCurrentTimeMillis), "twap", strGEmmrt, EopTrackEvent.KEY_RESULT_FAILED, new BotGrafanaInfo(null, str, null, (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.QbewEr()) ? false : true, 5, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(AbstractC53400wkl abstractC53400wkl, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C49924uxi.updateLeverage$default(((AbstractC48432uRe) abstractC53400wkl.gGvvIC()).KWHzl, null, 1, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractC53400wkl abstractC53400wkl, xMJ.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        if (abstractC53400wkl.fetchVPNInfo) {
            return Unit.INSTANCE;
        }
        if (C33129mqd.AEQbTJ(application.AYXKKw(), 0)) {
            abstractC53400wkl.fetchVPNInfo = true;
            abstractC53400wkl.AxsJAY();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(AbstractC53400wkl abstractC53400wkl, ParamBuilder paramBuilder) {
        Intrinsics.checkNotNullParameter(paramBuilder, "");
        ((AbstractC48432uRe) abstractC53400wkl.gGvvIC()).KWHzl.EZpvd(C49861uwY.Companion.copydefault().get());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit djBIcL(AbstractC53400wkl abstractC53400wkl, boolean z) {
        ((AbstractC48432uRe) abstractC53400wkl.gGvvIC()).KWHzl.EZpvd(C49861uwY.Companion.copydefault().get());
        return Unit.INSTANCE;
    }

    public static final void copydefault(AbstractC53400wkl abstractC53400wkl, android.view.View view, android.view.View view2) {
        C49960uyR.setWindowSoftInput$default(abstractC53400wkl, view, java.lang.Integer.valueOf(C48033uCm.Application.fvQaOB), view2, 0, 8, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fIwbmz() {
        C53448wlg c53448wlg = ((AbstractC48432uRe) gGvvIC()).AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c53448wlg, "");
        copydefault(this, c53448wlg.values(), c53448wlg.values());
        copydefault(this, c53448wlg.AYXKKw(), c53448wlg.AYXKKw());
        copydefault(this, c53448wlg.AkhnZx(), c53448wlg.AkhnZx());
        copydefault(this, c53448wlg.isConnected(), c53448wlg.isConnected());
        copydefault(this, c53448wlg.DbNXlk(), c53448wlg.DbNXlk());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC48165uHj
    public void AEQbTJ(boolean z) {
        iwGUEr();
        hDKMBd();
        getNewProxyInstance();
        ((AbstractC48432uRe) gGvvIC()).AEQbTJ.djBIcL(z);
        ((AbstractC48432uRe) gGvvIC()).AEQbTJ.getNewProxyInstance();
        AuCTelauCTel();
        AYXKKw().AEQbTJ();
        AubY();
        this.fetchVPNInfo = false;
        C50029uzh c50029uzh = C50029uzh.EZpvd;
        c50029uzh.KWHzl(this.fARcdN);
        c50029uzh.copydefault(this.fARcdN, 60L);
        getFieldNames();
        AYXKKw().EZpvd();
    }

    private final C53519wmy zsXlph() {
        return (C53519wmy) this.djBIcL.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C53519wmy AkhnZx(AbstractC53400wkl abstractC53400wkl) {
        return new C53519wmy(((AbstractC48432uRe) abstractC53400wkl.gGvvIC()).AEQbTJ.AhwBna());
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
        C49861uwY.Companion.copydefault().addOnPropertyChangedCallback(this.fJNWhG);
        if (!values()) {
            ((AbstractC48432uRe) gGvvIC()).KWHzl.AuCTel();
            ((AbstractC48432uRe) gGvvIC()).KWHzl.EZpvd(new Activity());
            ((AbstractC48432uRe) gGvvIC()).KWHzl.EZpvd(new ActionBar());
            ((AbstractC48432uRe) gGvvIC()).KWHzl.OLrzqt(new Application());
        }
        zsXlph().EZpvd();
        getFieldNames();
        ((AbstractC48432uRe) gGvvIC()).AEQbTJ.EZpvd(this.ejfBZ);
    }

    /* JADX INFO: renamed from: o.wkl$Activity */
    public static final class Activity implements yHO<java.lang.String, java.lang.Boolean, BizInstrument, Unit> {
        public Activity() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(java.lang.String str, java.lang.Boolean bool, BizInstrument bizInstrument) {
            EZpvd(str, bool.booleanValue(), bizInstrument);
            return Unit.INSTANCE;
        }

        public void EZpvd(java.lang.String str, boolean z, BizInstrument bizInstrument) {
            Intrinsics.checkNotNullParameter(str, "");
            AbstractC53400wkl.this.finit().djBIcL().KWHzl(bizInstrument);
        }
    }

    /* JADX INFO: renamed from: o.wkl$ActionBar */
    public static final class ActionBar implements Function0<Unit> {
        public ActionBar() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            AEQbTJ();
            return Unit.INSTANCE;
        }

        public void AEQbTJ() {
            AbstractC53400wkl.this.fARcdN();
        }
    }

    /* JADX INFO: renamed from: o.wkl$Application */
    public static final class Application implements Function1<java.lang.String, Unit> {
        public Application() {
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
            AbstractC53400wkl.this.AuCTel();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC48165uHj, o.AbstractC54505xKx, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        C50029uzh.EZpvd.KWHzl(this.fARcdN);
        C49861uwY.Companion.copydefault().removeOnPropertyChangedCallback(this.fJNWhG);
        AuCTelauCTel();
        ((AbstractC48432uRe) gGvvIC()).KWHzl.DbNXlk();
        ((AbstractC48432uRe) gGvvIC()).KWHzl.copydefault();
        ((AbstractC48432uRe) gGvvIC()).KWHzl.KWHzl();
        ((AbstractC48432uRe) gGvvIC()).KWHzl.EZpvd();
        zsXlph().copydefault();
        ((AbstractC48432uRe) gGvvIC()).AEQbTJ.AEQbTJ(this.ejfBZ);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C50029uzh.EZpvd.KWHzl(this.fARcdN);
        super.onDestroyView();
    }

    public final void AuCTel() {
        AYXKKw().AEQbTJ();
        AxsJAY();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fARcdN() {
        ((AbstractC48432uRe) gGvvIC()).AEQbTJ.getNewProxyInstance();
        AYXKKw().AEQbTJ();
        AuCTelauCTel();
        AubY();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void iwGUEr() {
        if (this.AYXKKw) {
            android.os.Bundle arguments = getArguments();
            java.lang.Object obj = arguments != null ? arguments.get(OtcExtraKeys.SIDE) : null;
            TradeType tradeType = obj instanceof TradeType ? (TradeType) obj : null;
            android.os.Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                arguments2.putParcelable(OtcExtraKeys.SIDE, null);
            }
            ((AbstractC48432uRe) gGvvIC()).copydefault.OLrzqt(tradeType);
            C53448wlg c53448wlg = ((AbstractC48432uRe) gGvvIC()).AEQbTJ;
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c53448wlg.setFragmentManager(childFragmentManager);
        } else {
            ((AbstractC48432uRe) gGvvIC()).copydefault.OLrzqt(((AbstractC48432uRe) gGvvIC()).copydefault.copydefault());
        }
        this.AYXKKw = false;
    }

    private final void AxsJAY() {
        AuCTelauCTel();
        AubY();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final boolean zuBGHE() {
        return yDY.gEmmrt("FUTURES", "SWAP").contains(((TwapTradePresenter) dxcTrN()).fvQaOB().djBIcL()) && C56059xvf.EZpvd.DbNXlk() && C49861uwY.Companion.copydefault().get() == TradeType.SELL_CLOSE;
    }

    public final void AubY() {
        if (zuBGHE()) {
            gHZMYf();
            sSMYrx();
        } else {
            sSMYrx();
        }
    }

    public final void AuCTelauCTel() {
        ORxRYg();
        OcIXYQ();
    }

    private final void gHZMYf() {
        C54782xVc.AEQbTJ.djBIcL().observeForever(this.DbNXlk);
    }

    private final void OcIXYQ() {
        C54782xVc.AEQbTJ.djBIcL().removeObserver(this.DbNXlk);
    }

    private final void ORxRYg() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.AEQbTJ(this.valueOf);
        }
        this.valueOf.clear();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v21, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void sSMYrx() {
        xOW newProxyInstance;
        xOV xovEZpvd;
        java.lang.Boolean boolValueOf;
        C56084xwD fieldNames;
        Function0<AbstractC49896uxG> function0DjBIcL;
        AbstractC49896uxG abstractC49896uxGInvoke;
        MarginModeManager marginModeManagerIsConnected;
        BizInstrument bizInstrumentAhwBna = ((TwapTradePresenter) dxcTrN()).fvQaOB().AhwBna();
        if (bizInstrumentAhwBna == null) {
            return;
        }
        java.lang.String strAEQbTJ = ((TwapTradePresenter) dxcTrN()).fvQaOB().AEQbTJ("twap");
        pUU.EZpvd("USDRename", "sub Available balance TWAP, " + bizInstrumentAhwBna.joinCcyRelevantToString() + ", tradeQuoteCcy:" + strAEQbTJ);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String currentMarginMode$default = (interfaceC54581xNrOLrzqt == null || (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt.isConnected()) == null) ? null : MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected, false, null, 3, null);
        if (currentMarginMode$default == null) {
            currentMarginMode$default = "";
        }
        java.lang.String instId = bizInstrumentAhwBna.getInstId();
        java.lang.String instType = bizInstrumentAhwBna.getInstType();
        if (values()) {
            currentMarginMode$default = "cross";
        } else if (Intrinsics.EZpvd((java.lang.Object) bizInstrumentAhwBna.getInstType(), (java.lang.Object) "SPOT") && (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || (xovEZpvd = newProxyInstance.EZpvd()) == null || !xovEZpvd.OLrzqt())) {
            currentMarginMode$default = "cash";
        }
        java.lang.String str = currentMarginMode$default;
        if (EZpvd(bizInstrumentAhwBna.getInstType())) {
            boolValueOf = java.lang.Boolean.valueOf(C49861uwY.Companion.copydefault().get() == TradeType.BUY_OPEN);
        } else {
            boolValueOf = null;
        }
        xMJ.Application value = C54782xVc.AEQbTJ.AhwBna().getValue();
        java.lang.String strAYXKKw = value != null ? value.AYXKKw() : null;
        java.lang.String strCopydefault = (!Intrinsics.EZpvd((java.lang.Object) bizInstrumentAhwBna.getInstType(), (java.lang.Object) "MARGIN") || (function0DjBIcL = ((AbstractC48432uRe) gGvvIC()).AEQbTJ.djBIcL()) == null || (abstractC49896uxGInvoke = function0DjBIcL.invoke()) == null) ? null : abstractC49896uxGInvoke.copydefault();
        java.lang.String strAYXKKw2 = (!yDY.gEmmrt("FUTURES", "SWAP").contains(bizInstrumentAhwBna.getInstType()) || interfaceC54581xNrOLrzqt == null || (fieldNames = interfaceC54581xNrOLrzqt.getFieldNames()) == null) ? null : fieldNames.AYXKKw();
        if (!Intrinsics.EZpvd((java.lang.Object) bizInstrumentAhwBna.getInstType(), (java.lang.Object) "SPOT")) {
            strAEQbTJ = null;
        }
        PendingIntent pendingIntent = new PendingIntent(bizInstrumentAhwBna, instId, instType, str, boolValueOf, strAYXKKw, strCopydefault, strAYXKKw2, strAEQbTJ);
        this.valueOf.clear();
        this.valueOf.add(pendingIntent);
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.copydefault(this.valueOf);
        }
    }

    /* JADX INFO: renamed from: o.wkl$PendingIntent */
    public static final class PendingIntent extends AbstractC55740xpe {
        public final /* synthetic */ BizInstrument EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(BizInstrument bizInstrument, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
            super(null, null, str2, str, str5, str4, str3, null, bool, str6, null, null, null, null, null, null, null, null, null, str7, 523267, null);
            this.EZpvd = bizInstrument;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.wPL.handleSimpleBorrow$default(o.wPL, com.okinc.unify_trade.biz.MaxAvailableResp, java.lang.String, java.lang.Boolean, int, java.lang.Object):com.okinc.unify_trade.biz.MaxAvailableResp */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
        @Override // o.AbstractC55740xpe
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void AEQbTJ(MaxAvailableResp maxAvailableResp, java.lang.String str, xDM xdm) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(xdm, "");
            AbstractC53400wkl.this.KWHzl = maxAvailableResp;
            AbstractC53400wkl.this.AEQbTJ = xdm;
            AbstractC53400wkl abstractC53400wkl = AbstractC53400wkl.this;
            abstractC53400wkl.KWHzl = wPL.handleSimpleBorrow$default(wPL.KWHzl, abstractC53400wkl.KWHzl, this.EZpvd.getInstType(), null, 4, null);
            java.lang.String instType = this.EZpvd.getInstType();
            switch (instType.hashCode()) {
                case -2027980370:
                    if (instType.equals("MARGIN")) {
                        AbstractC53400wkl.gEmmrt(AbstractC53400wkl.this).AEQbTJ.AEQbTJ(AbstractC53400wkl.this.KWHzl);
                    }
                    break;
                case 2552066:
                    if (instType.equals("SPOT")) {
                        AbstractC53400wkl.gEmmrt(AbstractC53400wkl.this).AEQbTJ.KWHzl(AbstractC53400wkl.this.KWHzl);
                    }
                    break;
                case 2558355:
                    if (instType.equals("SWAP")) {
                        AbstractC53400wkl.gEmmrt(AbstractC53400wkl.this).AEQbTJ.EZpvd(AbstractC53400wkl.this.KWHzl);
                        AbstractC53400wkl.this.AYXKKw().copydefault(AbstractC53400wkl.this.KWHzl);
                    }
                    break;
                case 214415088:
                    if (instType.equals("FUTURES")) {
                    }
                    break;
            }
            java.util.ArrayList<InterfaceC49433uoU.Activity> arrayListDjBIcL = AbstractC53400wkl.this.djBIcL();
            AbstractC53400wkl abstractC53400wkl2 = AbstractC53400wkl.this;
            java.util.Iterator<T> it = arrayListDjBIcL.iterator();
            while (it.hasNext()) {
                ((InterfaceC49433uoU.Activity) it.next()).AEQbTJ(abstractC53400wkl2.KWHzl == null, abstractC53400wkl2.KWHzl);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public void AEQbTJ(@NotNull final Function1<? super MaxAvailableResp, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        xDM xdm = this.AEQbTJ;
        if (xdm != null) {
            xDM.ActionBar.refreshOrderPrice$default(xdm, ((AbstractC48432uRe) gGvvIC()).AEQbTJ.OLrzqt(), false, new Function1() { // from class: o.wkq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC53400wkl.EZpvd(function1, (MaxAvailableResp) obj);
                }
            }, 2, null);
        }
    }

    public static final Unit EZpvd(Function1 function1, MaxAvailableResp maxAvailableResp) {
        function1.invoke(maxAvailableResp);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean KWHzl() {
        InterfaceC49496upe interfaceC49496upeCopydefault = C53685wqE.copydefault.copydefault();
        BizInstrument bizInstrumentAhwBna = ((TwapTradePresenter) dxcTrN()).fvQaOB().AhwBna();
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        return interfaceC49496upeCopydefault.EZpvd(bizInstrumentAhwBna, childFragmentManager);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String valueOf() {
        AbstractC49896uxG abstractC49896uxGAhwBna;
        C49924uxi c49924uxi = ((AbstractC48432uRe) gGvvIC()).KWHzl;
        Intrinsics.checkNotNullExpressionValue(c49924uxi, "");
        if (c49924uxi.getVisibility() != 0 || (abstractC49896uxGAhwBna = ((AbstractC48432uRe) gGvvIC()).KWHzl.AhwBna()) == null) {
            return null;
        }
        return abstractC49896uxGAhwBna.KWHzl();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String isConnected() {
        AbstractC49896uxG abstractC49896uxGAhwBna;
        C49924uxi c49924uxi = ((AbstractC48432uRe) gGvvIC()).KWHzl;
        Intrinsics.checkNotNullExpressionValue(c49924uxi, "");
        if (c49924uxi.getVisibility() != 0 || (abstractC49896uxGAhwBna = ((AbstractC48432uRe) gGvvIC()).KWHzl.AhwBna()) == null) {
            return null;
        }
        return abstractC49896uxGAhwBna.AEQbTJ();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean values() {
        return (Intrinsics.EZpvd((java.lang.Object) ((TwapTradePresenter) dxcTrN()).fvQaOB().djBIcL(), (java.lang.Object) "MARGIN") || Intrinsics.EZpvd((java.lang.Object) ((TwapTradePresenter) dxcTrN()).fvQaOB().djBIcL(), (java.lang.Object) "SPOT")) && C55697xoo.OLrzqt.isConnected() && C54794xVo.copydefault.EZpvd();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC49896uxG ejfBZ() {
        return ((AbstractC48432uRe) gGvvIC()).KWHzl.AhwBna();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(AbstractC48432uRe abstractC48432uRe) {
        pUU.EZpvd(getTAG(), "refreshLeverageUIAndVisibility -> instType: " + ((TwapTradePresenter) dxcTrN()).fvQaOB().djBIcL() + ", instId: " + ((TwapTradePresenter) dxcTrN()).fvQaOB().gEmmrt());
        AbstractC49896uxG abstractC49896uxGAhwBna = abstractC48432uRe.KWHzl.AhwBna();
        if (abstractC49896uxGAhwBna != null) {
            abstractC49896uxGAhwBna.KWHzl(new BizInfoConfig.CustomArgsBizConfig(((TwapTradePresenter) dxcTrN()).fvQaOB().djBIcL(), ((TwapTradePresenter) dxcTrN()).fvQaOB().gEmmrt()));
        }
        ConstraintLayout constraintLayout = abstractC48432uRe.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        androidx.transition.Fade fade = new androidx.transition.Fade();
        fade.setDuration(230L);
        androidx.transition.TransitionManager.beginDelayedTransition(constraintLayout, fade);
        C49924uxi.updateUi$default(abstractC48432uRe.KWHzl, null, 1, null);
        boolean zFetchVPNInfo = abstractC48432uRe.KWHzl.fetchVPNInfo();
        C49924uxi c49924uxi = abstractC48432uRe.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c49924uxi, "");
        c49924uxi.setVisibility(zFetchVPNInfo ? 0 : 8);
        abstractC48432uRe.EZpvd.EZpvd(zFetchVPNInfo, abstractC48432uRe.KWHzl.getId());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getNewProxyInstance() {
        AccountMode accountModeCopydefault = C49974uyf.EZpvd.copydefault();
        if (accountModeCopydefault == null) {
            return;
        }
        if (TaskDescription.copydefault[accountModeCopydefault.ordinal()] == 4 && Intrinsics.EZpvd((java.lang.Object) ((TwapTradePresenter) dxcTrN()).fvQaOB().djBIcL(), (java.lang.Object) "SPOT")) {
            AxsJAY();
            C47988uAv.clearSeekBarData$default(((AbstractC48432uRe) gGvvIC()).AEQbTJ.DbNXlk(), false, 1, null);
        }
        OLrzqt((AbstractC48432uRe) gGvvIC());
    }

    public final boolean EZpvd(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "MARGIN") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SPOT");
    }
}
