package o;

import android.view.View;
import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.core.util.SPUtils;
import com.okinc.unify_trade.biz.ArbitrageInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.trade.setting.setting_data.SettingType;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C48033uCm;
import o.C55688xof;
import o.InterfaceC49496upe;
import o.xMJ;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.wvw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53994wvw extends AbstractC56129xww<InterfaceC49435uoW> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public boolean AEQbTJ = SPUtils.getBoolean(C55697xoo.OLrzqt.copydefault() + " arbitrage_spread_type", true);
    public final InterfaceC56387yDm AYXKKw;
    public uZX AhwBna;
    public Observer<TickersData> AkhnZx;
    public Observer<C54780xVa> AuCTel;
    public java.lang.String DbNXlk;
    public final InterfaceC56387yDm KWHzl;
    public BizInstrument OLrzqt;
    public BizInstrument copydefault;
    public int djBIcL;
    public Observer<ArbitrageInfo> ejfBZ;
    public xMJ.Application fARcdN;
    public BizInstrument fIwbmz;
    public java.lang.String fJNWhG;
    public Observer<C54780xVa> fetchVPNInfo;
    public int gEmmrt;
    public Observer<TickersData> getNewProxyInstance;
    public Observer<ArbitrageInfo> isConnected;
    public int uzCIH;
    public BizInstrument valueOf;
    public xMJ.Application values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt() {
        this.AkhnZx = null;
        this.getNewProxyInstance = null;
        this.isConnected = null;
        this.ejfBZ = null;
        this.fetchVPNInfo = null;
        this.AuCTel = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.HJWChPOKBmQN;
    }

    public C53994wvw() {
        final Function0 function0 = null;
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(vBJ.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.depth.ArbitrageDepthFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.depth.ArbitrageDepthFragment$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.depth.ArbitrageDepthFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.depth.ArbitrageDepthFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.depth.ArbitrageDepthFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C53964wvS.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.depth.ArbitrageDepthFragment$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.depth.ArbitrageDepthFragment$special$$inlined$viewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.arbitrage.depth.ArbitrageDepthFragment$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.DbNXlk = "";
        this.fJNWhG = "";
    }

    /* JADX INFO: renamed from: o.wvw$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wvw.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final vBJ KWHzl() {
        return (vBJ) this.KWHzl.getValue();
    }

    public final C53964wvS copydefault() {
        return (C53964wvS) this.AYXKKw.getValue();
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C53959wvN c53959wvN;
        C49576urE c49576urEAEQbTJ;
        C53959wvN c53959wvN2;
        C49576urE c49576urEAEQbTJ2;
        C53959wvN c53959wvN3;
        C49576urE c49576urEOLrzqt;
        C53959wvN c53959wvN4;
        C49576urE c49576urEOLrzqt2;
        C53959wvN c53959wvN5;
        C49581urJ c49581urJKWHzl;
        C53959wvN c53959wvN6;
        C49581urJ c49581urJKWHzl2;
        C53959wvN c53959wvN7;
        C49581urJ c49581urJKWHzl3;
        C53959wvN c53959wvN8;
        C49581urJ c49581urJKWHzl4;
        uZX uzx;
        C53959wvN c53959wvN9;
        uZX uzx2;
        C53959wvN c53959wvN10;
        Intrinsics.checkNotNullParameter(view, "");
        this.AhwBna = (uZX) DataBindingUtil.bind(view);
        djBIcL();
        valueOf();
        values();
        fetchVPNInfo();
        FragmentActivity activity = getActivity();
        if (activity != null && (uzx2 = this.AhwBna) != null && (c53959wvN10 = uzx2.EZpvd) != null) {
            c53959wvN10.setTickerInfoActivity(activity);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null && (uzx = this.AhwBna) != null && (c53959wvN9 = uzx.OLrzqt) != null) {
            c53959wvN9.setTickerInfoActivity(activity2);
        }
        uZX uzx3 = this.AhwBna;
        if (uzx3 != null && (c53959wvN8 = uzx3.EZpvd) != null && (c49581urJKWHzl4 = c53959wvN8.KWHzl()) != null) {
            c49581urJKWHzl4.setLeftLegal(true);
        }
        uZX uzx4 = this.AhwBna;
        if (uzx4 != null && (c53959wvN7 = uzx4.OLrzqt) != null && (c49581urJKWHzl3 = c53959wvN7.KWHzl()) != null) {
            c49581urJKWHzl3.setLeftLegal(false);
        }
        uZX uzx5 = this.AhwBna;
        if (uzx5 != null && (c53959wvN6 = uzx5.EZpvd) != null && (c49581urJKWHzl2 = c53959wvN6.KWHzl()) != null) {
            c49581urJKWHzl2.setVmFactory(new C54080wxc(copydefault()));
        }
        uZX uzx6 = this.AhwBna;
        if (uzx6 != null && (c53959wvN5 = uzx6.OLrzqt) != null && (c49581urJKWHzl = c53959wvN5.KWHzl()) != null) {
            c49581urJKWHzl.setVmFactory(new C54080wxc(copydefault()));
        }
        FragmentActivity activity3 = getActivity();
        if (activity3 != null) {
            this.gEmmrt = ContextCompat.getColor(activity3, C32113mPz.ActionBar.hDKMBd);
            this.uzCIH = C33508mxl.copydefault(activity3);
            this.djBIcL = C33508mxl.AEQbTJ(activity3);
        }
        uZX uzx7 = this.AhwBna;
        if (uzx7 != null && (c53959wvN4 = uzx7.EZpvd) != null && (c49576urEOLrzqt2 = c53959wvN4.OLrzqt()) != null) {
            C49962uyT c49962uyT = C49962uyT.AEQbTJ;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            c49576urEOLrzqt2.setProgressColor(c49962uyT.copydefault(contextRequireContext));
        }
        uZX uzx8 = this.AhwBna;
        if (uzx8 != null && (c53959wvN3 = uzx8.OLrzqt) != null && (c49576urEOLrzqt = c53959wvN3.OLrzqt()) != null) {
            C49962uyT c49962uyT2 = C49962uyT.AEQbTJ;
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            c49576urEOLrzqt.setProgressColor(c49962uyT2.copydefault(contextRequireContext2));
        }
        uZX uzx9 = this.AhwBna;
        if (uzx9 != null && (c53959wvN2 = uzx9.EZpvd) != null && (c49576urEAEQbTJ2 = c53959wvN2.AEQbTJ()) != null) {
            C49962uyT c49962uyT3 = C49962uyT.AEQbTJ;
            android.content.Context contextRequireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
            c49576urEAEQbTJ2.setProgressColor(c49962uyT3.EZpvd(contextRequireContext3));
        }
        uZX uzx10 = this.AhwBna;
        if (uzx10 != null && (c53959wvN = uzx10.OLrzqt) != null && (c49576urEAEQbTJ = c53959wvN.AEQbTJ()) != null) {
            C49962uyT c49962uyT4 = C49962uyT.AEQbTJ;
            android.content.Context contextRequireContext4 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
            c49576urEAEQbTJ.setProgressColor(c49962uyT4.EZpvd(contextRequireContext4));
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        uZX uzx;
        C53959wvN c53959wvN;
        uZX uzx2;
        C53959wvN c53959wvN2;
        AEQbTJ();
        djBIcL();
        BizInstrument bizInstrument = this.OLrzqt;
        java.lang.String instType = bizInstrument != null ? bizInstrument.getInstType() : null;
        BizInstrument bizInstrument2 = this.valueOf;
        if (Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) (bizInstrument2 != null ? bizInstrument2.getInstType() : null))) {
            BizInstrument bizInstrument3 = this.OLrzqt;
            java.lang.String instId = bizInstrument3 != null ? bizInstrument3.getInstId() : null;
            BizInstrument bizInstrument4 = this.valueOf;
            if (Intrinsics.EZpvd((java.lang.Object) instId, (java.lang.Object) (bizInstrument4 != null ? bizInstrument4.getInstId() : null)) && (uzx2 = this.AhwBna) != null && (c53959wvN2 = uzx2.EZpvd) != null) {
                c53959wvN2.KWHzl(this.OLrzqt);
            }
        }
        BizInstrument bizInstrument5 = this.copydefault;
        java.lang.String instType2 = bizInstrument5 != null ? bizInstrument5.getInstType() : null;
        BizInstrument bizInstrument6 = this.fIwbmz;
        if (Intrinsics.EZpvd((java.lang.Object) instType2, (java.lang.Object) (bizInstrument6 != null ? bizInstrument6.getInstType() : null))) {
            BizInstrument bizInstrument7 = this.copydefault;
            java.lang.String instId2 = bizInstrument7 != null ? bizInstrument7.getInstId() : null;
            BizInstrument bizInstrument8 = this.fIwbmz;
            if (!Intrinsics.EZpvd((java.lang.Object) instId2, (java.lang.Object) (bizInstrument8 != null ? bizInstrument8.getInstId() : null)) || (uzx = this.AhwBna) == null || (c53959wvN = uzx.OLrzqt) == null) {
                return;
            }
            c53959wvN.KWHzl(this.copydefault);
        }
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        C53959wvN c53959wvN;
        C53959wvN c53959wvN2;
        DbNXlk();
        uZX uzx = this.AhwBna;
        if (uzx != null && (c53959wvN2 = uzx.EZpvd) != null) {
            c53959wvN2.valueOf();
        }
        uZX uzx2 = this.AhwBna;
        if (uzx2 == null || (c53959wvN = uzx2.OLrzqt) == null) {
            return;
        }
        c53959wvN.valueOf();
    }

    public final void isConnected() {
        this.AkhnZx = new Observer() { // from class: o.wvy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C53994wvw.KWHzl(this.OLrzqt, (TickersData) obj);
            }
        };
        this.getNewProxyInstance = new Observer() { // from class: o.wvz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C53994wvw.AEQbTJ(this.EZpvd, (TickersData) obj);
            }
        };
        this.isConnected = new Observer() { // from class: o.wvG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C53994wvw.AEQbTJ(this.EZpvd, (ArbitrageInfo) obj);
            }
        };
        this.ejfBZ = new Observer() { // from class: o.wvJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C53994wvw.OLrzqt(this.OLrzqt, (ArbitrageInfo) obj);
            }
        };
        this.fetchVPNInfo = new Observer() { // from class: o.wvL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C53994wvw.KWHzl(this.copydefault, (C54780xVa) obj);
            }
        };
        this.AuCTel = new Observer() { // from class: o.wvH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C53994wvw.OLrzqt(this.OLrzqt, (C54780xVa) obj);
            }
        };
    }

    public static final void KWHzl(C53994wvw c53994wvw, TickersData tickersData) {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(tickersData, "");
        c53994wvw.AEQbTJ(C54793xVn.OLrzqt.copydefault(tickersData));
        xMJ.Application application = c53994wvw.values;
        if (application == null || (strAYXKKw = application.AYXKKw()) == null) {
            strAYXKKw = "";
        }
        xMJ.Application application2 = c53994wvw.fARcdN;
        if (application2 != null && (strAYXKKw2 = application2.AYXKKw()) != null) {
            str = strAYXKKw2;
        }
        c53994wvw.copydefault(strAYXKKw, str, c53994wvw.EZpvd());
    }

    public static final void AEQbTJ(C53994wvw c53994wvw, TickersData tickersData) {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(tickersData, "");
        tickersData.getLast();
        c53994wvw.EZpvd(C54793xVn.OLrzqt.copydefault(tickersData));
        xMJ.Application application = c53994wvw.values;
        if (application == null || (strAYXKKw = application.AYXKKw()) == null) {
            strAYXKKw = "";
        }
        xMJ.Application application2 = c53994wvw.fARcdN;
        if (application2 != null && (strAYXKKw2 = application2.AYXKKw()) != null) {
            str = strAYXKKw2;
        }
        c53994wvw.copydefault(strAYXKKw, str, c53994wvw.EZpvd());
    }

    public static final void AEQbTJ(C53994wvw c53994wvw, ArbitrageInfo arbitrageInfo) {
        C53959wvN c53959wvN;
        C51006veq c51006veqEZpvd;
        java.lang.String strKWHzl;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(arbitrageInfo, "");
        c53994wvw.EZpvd(arbitrageInfo);
        BizInstrument bizInstrument = c53994wvw.valueOf;
        if (bizInstrument != null) {
            C53964wvS c53964wvSCopydefault = c53994wvw.copydefault();
            uZX uzx = c53994wvw.AhwBna;
            if (uzx != null && (c53959wvN = uzx.EZpvd) != null && (c51006veqEZpvd = c53959wvN.EZpvd()) != null && (strKWHzl = c51006veqEZpvd.KWHzl()) != null) {
                str = strKWHzl;
            }
            c53964wvSCopydefault.OLrzqt(bizInstrument, str, 3);
        }
    }

    public static final void OLrzqt(C53994wvw c53994wvw, ArbitrageInfo arbitrageInfo) {
        C53959wvN c53959wvN;
        C51006veq c51006veqEZpvd;
        java.lang.String strKWHzl;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(arbitrageInfo, "");
        c53994wvw.KWHzl(arbitrageInfo);
        BizInstrument bizInstrument = c53994wvw.fIwbmz;
        if (bizInstrument != null) {
            C53964wvS c53964wvSCopydefault = c53994wvw.copydefault();
            uZX uzx = c53994wvw.AhwBna;
            if (uzx != null && (c53959wvN = uzx.OLrzqt) != null && (c51006veqEZpvd = c53959wvN.EZpvd()) != null && (strKWHzl = c51006veqEZpvd.KWHzl()) != null) {
                str = strKWHzl;
            }
            c53964wvSCopydefault.AEQbTJ(bizInstrument, str, 3);
        }
    }

    public static final void KWHzl(C53994wvw c53994wvw, C54780xVa c54780xVa) {
        C53959wvN c53959wvN;
        C49576urE c49576urEAEQbTJ;
        C53959wvN c53959wvN2;
        C49576urE c49576urEOLrzqt;
        Intrinsics.checkNotNullParameter(c54780xVa, "");
        uZX uzx = c53994wvw.AhwBna;
        if (uzx != null && (c53959wvN2 = uzx.EZpvd) != null && (c49576urEOLrzqt = c53959wvN2.OLrzqt()) != null) {
            c49576urEOLrzqt.setDepthItems(c54780xVa.OLrzqt(), c54780xVa.EZpvd());
        }
        uZX uzx2 = c53994wvw.AhwBna;
        if (uzx2 == null || (c53959wvN = uzx2.EZpvd) == null || (c49576urEAEQbTJ = c53959wvN.AEQbTJ()) == null) {
            return;
        }
        c49576urEAEQbTJ.setDepthItems(c54780xVa.EZpvd(), c54780xVa.OLrzqt());
    }

    public static final void OLrzqt(C53994wvw c53994wvw, C54780xVa c54780xVa) {
        C53959wvN c53959wvN;
        C49576urE c49576urEAEQbTJ;
        C53959wvN c53959wvN2;
        C49576urE c49576urEOLrzqt;
        Intrinsics.checkNotNullParameter(c54780xVa, "");
        uZX uzx = c53994wvw.AhwBna;
        if (uzx != null && (c53959wvN2 = uzx.OLrzqt) != null && (c49576urEOLrzqt = c53959wvN2.OLrzqt()) != null) {
            c49576urEOLrzqt.setDepthItems(c54780xVa.OLrzqt(), c54780xVa.EZpvd());
        }
        uZX uzx2 = c53994wvw.AhwBna;
        if (uzx2 == null || (c53959wvN = uzx2.OLrzqt) == null || (c49576urEAEQbTJ = c53959wvN.AEQbTJ()) == null) {
            return;
        }
        c49576urEAEQbTJ.setDepthItems(c54780xVa.EZpvd(), c54780xVa.OLrzqt());
    }

    public final boolean EZpvd() {
        return Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) this.fJNWhG);
    }

    public final void AEQbTJ() {
        isConnected();
        copydefault().fJNWhG();
        Observer<TickersData> observer = this.AkhnZx;
        if (observer != null) {
            KWHzl().EZpvd().observeForever(observer);
        }
        Observer<TickersData> observer2 = this.getNewProxyInstance;
        if (observer2 != null) {
            KWHzl().valueOf().observeForever(observer2);
        }
        Observer<ArbitrageInfo> observer3 = this.isConnected;
        if (observer3 != null) {
            KWHzl().OLrzqt().observeForever(observer3);
        }
        Observer<ArbitrageInfo> observer4 = this.ejfBZ;
        if (observer4 != null) {
            KWHzl().copydefault().observeForever(observer4);
        }
        Observer<C54780xVa> observer5 = this.fetchVPNInfo;
        if (observer5 != null) {
            copydefault().EZpvd().observeForever(observer5);
        }
        Observer<C54780xVa> observer6 = this.AuCTel;
        if (observer6 != null) {
            copydefault().AhwBna().observeForever(observer6);
        }
    }

    private final void DbNXlk() {
        copydefault().fetchVPNInfo();
        copydefault().isConnected();
        copydefault().fIwbmz();
        Observer<TickersData> observer = this.AkhnZx;
        if (observer != null) {
            KWHzl().EZpvd().removeObserver(observer);
        }
        Observer<TickersData> observer2 = this.getNewProxyInstance;
        if (observer2 != null) {
            KWHzl().valueOf().removeObserver(observer2);
        }
        Observer<ArbitrageInfo> observer3 = this.isConnected;
        if (observer3 != null) {
            KWHzl().OLrzqt().removeObserver(observer3);
        }
        Observer<ArbitrageInfo> observer4 = this.ejfBZ;
        if (observer4 != null) {
            KWHzl().copydefault().removeObserver(observer4);
        }
        Observer<C54780xVa> observer5 = this.fetchVPNInfo;
        if (observer5 != null) {
            copydefault().EZpvd().removeObserver(observer5);
        }
        Observer<C54780xVa> observer6 = this.AuCTel;
        if (observer6 != null) {
            copydefault().AhwBna().removeObserver(observer6);
        }
        gEmmrt();
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(ArbitrageInfo arbitrageInfo) {
        C53959wvN c53959wvN;
        C53959wvN c53959wvN2;
        C51006veq c51006veqEZpvd;
        java.lang.String strKWHzl;
        C53959wvN c53959wvN3;
        C53959wvN c53959wvN4;
        xOU xouWlaJM;
        java.lang.String instId;
        java.lang.String instType;
        C53959wvN c53959wvN5;
        C53959wvN c53959wvN6;
        C53959wvN c53959wvN7;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        BizInstrument bizInstrumentCopydefault = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.copydefault(arbitrageInfo.getInstType(), arbitrageInfo.getInstId(), arbitrageInfo.getUly(), arbitrageInfo.getAlias()) : null;
        this.valueOf = bizInstrumentCopydefault;
        copydefault(bizInstrumentCopydefault);
        BizInstrument bizInstrument = this.OLrzqt;
        java.lang.String instType2 = bizInstrument != null ? bizInstrument.getInstType() : null;
        BizInstrument bizInstrument2 = this.valueOf;
        if (Intrinsics.EZpvd((java.lang.Object) instType2, (java.lang.Object) (bizInstrument2 != null ? bizInstrument2.getInstType() : null))) {
            BizInstrument bizInstrument3 = this.OLrzqt;
            java.lang.String instId2 = bizInstrument3 != null ? bizInstrument3.getInstId() : null;
            BizInstrument bizInstrument4 = this.valueOf;
            if (Intrinsics.EZpvd((java.lang.Object) instId2, (java.lang.Object) (bizInstrument4 != null ? bizInstrument4.getInstId() : null))) {
                return;
            }
        }
        BizInstrument bizInstrument5 = this.valueOf;
        this.OLrzqt = bizInstrument5;
        if (bizInstrument5 != null) {
            uZX uzx = this.AhwBna;
            if (uzx != null && (c53959wvN7 = uzx.EZpvd) != null) {
                c53959wvN7.setInstTitle(C54799xVt.AEQbTJ.OLrzqt(bizInstrument5));
            }
            uZX uzx2 = this.AhwBna;
            if (uzx2 != null && (c53959wvN6 = uzx2.EZpvd) != null) {
                c53959wvN6.KWHzl(bizInstrument5);
            }
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        java.lang.String str = "";
        if (interfaceC54581xNrOLrzqt == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null) {
            uZX uzx3 = this.AhwBna;
            if (uzx3 != null && (c53959wvN = uzx3.EZpvd) != null) {
                c53959wvN.setMargin(null);
            }
        } else {
            BizInstrument bizInstrument6 = this.OLrzqt;
            if (bizInstrument6 == null || (instId = bizInstrument6.getInstId()) == null) {
                instId = "";
            }
            BizInstrument bizInstrument7 = this.OLrzqt;
            if (bizInstrument7 == null || (instType = bizInstrument7.getInstType()) == null) {
                instType = "";
            }
            if (xouWlaJM.AhwBna(instId, instType)) {
                BizInstrument bizInstrument8 = this.OLrzqt;
                Intrinsics.copydefault(bizInstrument8, "");
                SpotInstrument spotInstrument = (SpotInstrument) bizInstrument8;
                uZX uzx4 = this.AhwBna;
                if (uzx4 != null && (c53959wvN5 = uzx4.EZpvd) != null) {
                    c53959wvN5.setMargin(spotInstrument.getLevel() + "X");
                }
            }
        }
        try {
            uZX uzx5 = this.AhwBna;
            if (uzx5 != null && (c53959wvN4 = uzx5.EZpvd) != null) {
                androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c53959wvN4.setLevelSelectedCallback(childFragmentManager, new Function0() { // from class: o.wvA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C53994wvw.AEQbTJ(this.OLrzqt);
                    }
                });
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ArbitageDepthFragment leftDepth", e);
        }
        uZX uzx6 = this.AhwBna;
        if (uzx6 != null && (c53959wvN3 = uzx6.EZpvd) != null) {
            c53959wvN3.setLastPriceText("--");
            c53959wvN3.setLastPriceTag("");
            c53959wvN3.setLastPriceColor(this.gEmmrt);
            c53959wvN3.OLrzqt().setDepthItems(yDY.AhwBna(), yDY.AhwBna());
            c53959wvN3.AEQbTJ().setDepthItems(yDY.AhwBna(), yDY.AhwBna());
        }
        copydefault().isConnected();
        BizInstrument bizInstrument9 = this.OLrzqt;
        if (bizInstrument9 != null) {
            C53964wvS c53964wvSCopydefault = copydefault();
            uZX uzx7 = this.AhwBna;
            if (uzx7 != null && (c53959wvN2 = uzx7.EZpvd) != null && (c51006veqEZpvd = c53959wvN2.EZpvd()) != null && (strKWHzl = c51006veqEZpvd.KWHzl()) != null) {
                str = strKWHzl;
            }
            c53964wvSCopydefault.OLrzqt(bizInstrument9, str, 3);
        }
        copydefault().values();
        C53964wvS.subLeftDepthSource$default(copydefault(), null, 1, null);
    }

    public static final Unit AEQbTJ(C53994wvw c53994wvw) {
        C53959wvN c53959wvN;
        C51006veq c51006veqEZpvd;
        BizInstrument bizInstrument = c53994wvw.OLrzqt;
        if (bizInstrument != null) {
            uZX uzx = c53994wvw.AhwBna;
            java.lang.String strKWHzl = (uzx == null || (c53959wvN = uzx.EZpvd) == null || (c51006veqEZpvd = c53959wvN.EZpvd()) == null) ? null : c51006veqEZpvd.KWHzl();
            SPUtils.put(C54790xVk.Companion.AEQbTJ(bizInstrument), strKWHzl);
            c53994wvw.copydefault().isConnected();
            C53964wvS c53964wvSCopydefault = c53994wvw.copydefault();
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            c53964wvSCopydefault.OLrzqt(bizInstrument, strKWHzl, 3);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(ArbitrageInfo arbitrageInfo) {
        C53959wvN c53959wvN;
        C53959wvN c53959wvN2;
        C51006veq c51006veqEZpvd;
        java.lang.String strKWHzl;
        C53959wvN c53959wvN3;
        C53959wvN c53959wvN4;
        xOU xouWlaJM;
        java.lang.String instId;
        java.lang.String instType;
        C53959wvN c53959wvN5;
        C53959wvN c53959wvN6;
        C53959wvN c53959wvN7;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        BizInstrument bizInstrumentCopydefault = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.copydefault(arbitrageInfo.getInstType(), arbitrageInfo.getInstId(), arbitrageInfo.getUly(), arbitrageInfo.getAlias()) : null;
        this.fIwbmz = bizInstrumentCopydefault;
        AEQbTJ(bizInstrumentCopydefault);
        BizInstrument bizInstrument = this.copydefault;
        java.lang.String instType2 = bizInstrument != null ? bizInstrument.getInstType() : null;
        BizInstrument bizInstrument2 = this.fIwbmz;
        if (Intrinsics.EZpvd((java.lang.Object) instType2, (java.lang.Object) (bizInstrument2 != null ? bizInstrument2.getInstType() : null))) {
            BizInstrument bizInstrument3 = this.copydefault;
            java.lang.String instId2 = bizInstrument3 != null ? bizInstrument3.getInstId() : null;
            BizInstrument bizInstrument4 = this.fIwbmz;
            if (Intrinsics.EZpvd((java.lang.Object) instId2, (java.lang.Object) (bizInstrument4 != null ? bizInstrument4.getInstId() : null))) {
                return;
            }
        }
        BizInstrument bizInstrument5 = this.fIwbmz;
        this.copydefault = bizInstrument5;
        if (bizInstrument5 != null) {
            uZX uzx = this.AhwBna;
            if (uzx != null && (c53959wvN7 = uzx.OLrzqt) != null) {
                c53959wvN7.setInstTitle(C54799xVt.AEQbTJ.OLrzqt(bizInstrument5));
            }
            uZX uzx2 = this.AhwBna;
            if (uzx2 != null && (c53959wvN6 = uzx2.OLrzqt) != null) {
                c53959wvN6.KWHzl(bizInstrument5);
            }
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        java.lang.String str = "";
        if (interfaceC54581xNrOLrzqt == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null) {
            uZX uzx3 = this.AhwBna;
            if (uzx3 != null && (c53959wvN = uzx3.OLrzqt) != null) {
                c53959wvN.setMargin(null);
            }
        } else {
            BizInstrument bizInstrument6 = this.copydefault;
            if (bizInstrument6 == null || (instId = bizInstrument6.getInstId()) == null) {
                instId = "";
            }
            BizInstrument bizInstrument7 = this.copydefault;
            if (bizInstrument7 == null || (instType = bizInstrument7.getInstType()) == null) {
                instType = "";
            }
            if (xouWlaJM.AhwBna(instId, instType)) {
                BizInstrument bizInstrument8 = this.copydefault;
                Intrinsics.copydefault(bizInstrument8, "");
                SpotInstrument spotInstrument = (SpotInstrument) bizInstrument8;
                uZX uzx4 = this.AhwBna;
                if (uzx4 != null && (c53959wvN5 = uzx4.OLrzqt) != null) {
                    c53959wvN5.setMargin(spotInstrument.getLevel() + "X");
                }
            }
        }
        try {
            uZX uzx5 = this.AhwBna;
            if (uzx5 != null && (c53959wvN4 = uzx5.OLrzqt) != null) {
                androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c53959wvN4.setLevelSelectedCallback(childFragmentManager, new Function0() { // from class: o.wvF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C53994wvw.AYXKKw(this.KWHzl);
                    }
                });
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ArbitageDepthFragment rightDepth", e);
        }
        uZX uzx6 = this.AhwBna;
        if (uzx6 != null && (c53959wvN3 = uzx6.OLrzqt) != null) {
            c53959wvN3.setLastPriceText("--");
            c53959wvN3.setLastPriceTag("");
            c53959wvN3.setLastPriceColor(this.gEmmrt);
            c53959wvN3.OLrzqt().setDepthItems(yDY.AhwBna(), yDY.AhwBna());
            c53959wvN3.AEQbTJ().setDepthItems(yDY.AhwBna(), yDY.AhwBna());
        }
        copydefault().fIwbmz();
        BizInstrument bizInstrument9 = this.copydefault;
        if (bizInstrument9 != null) {
            C53964wvS c53964wvSCopydefault = copydefault();
            uZX uzx7 = this.AhwBna;
            if (uzx7 != null && (c53959wvN2 = uzx7.OLrzqt) != null && (c51006veqEZpvd = c53959wvN2.EZpvd()) != null && (strKWHzl = c51006veqEZpvd.KWHzl()) != null) {
                str = strKWHzl;
            }
            c53964wvSCopydefault.AEQbTJ(bizInstrument9, str, 3);
        }
        copydefault().ejfBZ();
        copydefault().AuCTel();
    }

    public static final Unit AYXKKw(C53994wvw c53994wvw) {
        C53959wvN c53959wvN;
        C51006veq c51006veqEZpvd;
        BizInstrument bizInstrument = c53994wvw.copydefault;
        if (bizInstrument != null) {
            uZX uzx = c53994wvw.AhwBna;
            java.lang.String strKWHzl = (uzx == null || (c53959wvN = uzx.OLrzqt) == null || (c51006veqEZpvd = c53959wvN.EZpvd()) == null) ? null : c51006veqEZpvd.KWHzl();
            SPUtils.put(C54790xVk.Companion.AEQbTJ(bizInstrument), strKWHzl);
            c53994wvw.copydefault().fIwbmz();
            C53964wvS c53964wvSCopydefault = c53994wvw.copydefault();
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            c53964wvSCopydefault.AEQbTJ(bizInstrument, strKWHzl, 3);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(final BizInstrument bizInstrument) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        C53959wvN c53959wvN;
        java.lang.String strCopydefault;
        C53959wvN c53959wvN2;
        C53959wvN c53959wvN3;
        java.lang.String instType;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            if (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) {
                instType = "";
            }
            abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(instType);
        } else {
            abstractC54531xLwOLrzqt = null;
        }
        OLrzqt(bizInstrument);
        if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) yDY.gEmmrt("SPOT", "MARGIN")), bizInstrument != null ? bizInstrument.getInstType() : null)) {
            uZX uzx = this.AhwBna;
            if (uzx != null && (c53959wvN3 = uzx.EZpvd) != null) {
                c53959wvN3.setPriceArrow(false);
            }
            uZX uzx2 = this.AhwBna;
            if (uzx2 == null || (c53959wvN2 = uzx2.EZpvd) == null) {
                return;
            }
            c53959wvN2.setAmtArrow(false);
            return;
        }
        uZX uzx3 = this.AhwBna;
        if (uzx3 == null || (c53959wvN = uzx3.EZpvd) == null) {
            return;
        }
        if (abstractC54531xLwOLrzqt == null) {
            strCopydefault = null;
        } else if (bizInstrument == null) {
            return;
        } else {
            strCopydefault = abstractC54531xLwOLrzqt.copydefault(bizInstrument);
        }
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "linear")) {
            c53959wvN.setPriceArrow(false);
        } else {
            if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getInstType() : null), (java.lang.Object) "OPTION")) {
                c53959wvN.setPriceClickCallBack(new Function0() { // from class: o.wvO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C53994wvw.KWHzl(this.KWHzl, bizInstrument);
                    }
                });
                c53959wvN.setPriceArrow(true);
            }
        }
        c53959wvN.setAmtArrow(true);
        c53959wvN.setAmtClickCallBack(new Function0() { // from class: o.wvP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53994wvw.AhwBna(this.OLrzqt, bizInstrument);
            }
        });
    }

    public static final Unit KWHzl(C53994wvw c53994wvw, BizInstrument bizInstrument) {
        switchPriceUnit$default(c53994wvw, bizInstrument, false, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C53994wvw c53994wvw, BizInstrument bizInstrument) {
        switchAmtUnit$default(c53994wvw, bizInstrument, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(final BizInstrument bizInstrument) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        C53959wvN c53959wvN;
        java.lang.String strCopydefault;
        C53959wvN c53959wvN2;
        C53959wvN c53959wvN3;
        C53959wvN c53959wvN4;
        java.lang.String instType;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            if (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) {
                instType = "";
            }
            abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(instType);
        } else {
            abstractC54531xLwOLrzqt = null;
        }
        EZpvd(bizInstrument);
        java.lang.String strOLrzqt = abstractC54531xLwOLrzqt != null ? abstractC54531xLwOLrzqt.OLrzqt(bizInstrument) : null;
        java.lang.String strDjBIcL = abstractC54531xLwOLrzqt != null ? abstractC54531xLwOLrzqt.djBIcL(bizInstrument) : null;
        uZX uzx = this.AhwBna;
        if (uzx != null && (c53959wvN4 = uzx.OLrzqt) != null) {
            if (strDjBIcL == null) {
                strDjBIcL = "";
            }
            c53959wvN4.setPriceUnit(strDjBIcL);
            c53959wvN4.setAmtUnit(strOLrzqt != null ? strOLrzqt : "");
        }
        if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) yDY.gEmmrt("SPOT", "MARGIN")), bizInstrument != null ? bizInstrument.getInstType() : null)) {
            uZX uzx2 = this.AhwBna;
            if (uzx2 != null && (c53959wvN3 = uzx2.OLrzqt) != null) {
                c53959wvN3.setPriceArrow(false);
            }
            uZX uzx3 = this.AhwBna;
            if (uzx3 == null || (c53959wvN2 = uzx3.OLrzqt) == null) {
                return;
            }
            c53959wvN2.setAmtArrow(false);
            return;
        }
        uZX uzx4 = this.AhwBna;
        if (uzx4 == null || (c53959wvN = uzx4.OLrzqt) == null) {
            return;
        }
        if (abstractC54531xLwOLrzqt == null) {
            strCopydefault = null;
        } else if (bizInstrument == null) {
            return;
        } else {
            strCopydefault = abstractC54531xLwOLrzqt.copydefault(bizInstrument);
        }
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) "linear")) {
            c53959wvN.setPriceArrow(false);
        } else {
            if (!Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getInstType() : null), (java.lang.Object) "OPTION")) {
                c53959wvN.setPriceArrow(true);
                c53959wvN.setPriceClickCallBack(new Function0() { // from class: o.wvB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C53994wvw.valueOf(this.copydefault, bizInstrument);
                    }
                });
            }
        }
        c53959wvN.setAmtArrow(true);
        c53959wvN.setAmtClickCallBack(new Function0() { // from class: o.wvE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53994wvw.AYXKKw(this.KWHzl, bizInstrument);
            }
        });
    }

    public static final Unit valueOf(C53994wvw c53994wvw, BizInstrument bizInstrument) {
        c53994wvw.EZpvd(bizInstrument, false);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C53994wvw c53994wvw, BizInstrument bizInstrument) {
        c53994wvw.OLrzqt(bizInstrument, false);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(BizInstrument bizInstrument) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        C53959wvN c53959wvN;
        java.lang.String instType;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        java.lang.String str = "";
        if (interfaceC54581xNrCopydefault != null) {
            if (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) {
                instType = "";
            }
            abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(instType);
        } else {
            abstractC54531xLwOLrzqt = null;
        }
        java.lang.String strOLrzqt = abstractC54531xLwOLrzqt != null ? abstractC54531xLwOLrzqt.OLrzqt(bizInstrument) : null;
        java.lang.String strDjBIcL = abstractC54531xLwOLrzqt != null ? abstractC54531xLwOLrzqt.djBIcL(bizInstrument) : null;
        uZX uzx = this.AhwBna;
        if (uzx != null && (c53959wvN = uzx.EZpvd) != null) {
            c53959wvN.setPriceUnit(strDjBIcL == null ? "" : strDjBIcL);
            if (strOLrzqt == null) {
                strOLrzqt = "";
            }
            c53959wvN.setAmtUnit(strOLrzqt);
        }
        if (strDjBIcL == null) {
            strDjBIcL = "";
        }
        this.DbNXlk = strDjBIcL;
        xMJ.Application application = this.values;
        if (application == null || (strAYXKKw = application.AYXKKw()) == null) {
            strAYXKKw = "";
        }
        xMJ.Application application2 = this.fARcdN;
        if (application2 != null && (strAYXKKw2 = application2.AYXKKw()) != null) {
            str = strAYXKKw2;
        }
        copydefault(strAYXKKw, str, EZpvd());
    }

    public final void EZpvd(BizInstrument bizInstrument) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        C53959wvN c53959wvN;
        java.lang.String instType;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        java.lang.String str = "";
        if (interfaceC54581xNrCopydefault != null) {
            if (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) {
                instType = "";
            }
            abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(instType);
        } else {
            abstractC54531xLwOLrzqt = null;
        }
        java.lang.String strOLrzqt = abstractC54531xLwOLrzqt != null ? abstractC54531xLwOLrzqt.OLrzqt(bizInstrument) : null;
        java.lang.String strDjBIcL = abstractC54531xLwOLrzqt != null ? abstractC54531xLwOLrzqt.djBIcL(bizInstrument) : null;
        uZX uzx = this.AhwBna;
        if (uzx != null && (c53959wvN = uzx.OLrzqt) != null) {
            c53959wvN.setPriceUnit(strDjBIcL == null ? "" : strDjBIcL);
            if (strOLrzqt == null) {
                strOLrzqt = "";
            }
            c53959wvN.setAmtUnit(strOLrzqt);
        }
        if (strDjBIcL == null) {
            strDjBIcL = "";
        }
        this.fJNWhG = strDjBIcL;
        xMJ.Application application = this.values;
        if (application == null || (strAYXKKw = application.AYXKKw()) == null) {
            strAYXKKw = "";
        }
        xMJ.Application application2 = this.fARcdN;
        if (application2 != null && (strAYXKKw2 = application2.AYXKKw()) != null) {
            str = strAYXKKw2;
        }
        copydefault(strAYXKKw, str, EZpvd());
    }

    public static /* synthetic */ void switchPriceUnit$default(C53994wvw c53994wvw, BizInstrument bizInstrument, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        c53994wvw.EZpvd(bizInstrument, z);
    }

    public final void EZpvd(BizInstrument bizInstrument, boolean z) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instType;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            if (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) {
                instType = "";
            }
            abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(instType);
        } else {
            abstractC54531xLwOLrzqt = null;
        }
        java.lang.String instType2 = bizInstrument != null ? bizInstrument.getInstType() : null;
        if (Intrinsics.EZpvd((java.lang.Object) instType2, (java.lang.Object) "FUTURES") || Intrinsics.EZpvd((java.lang.Object) instType2, (java.lang.Object) "SWAP")) {
            if (Intrinsics.EZpvd((java.lang.Object) (abstractC54531xLwOLrzqt != null ? abstractC54531xLwOLrzqt.copydefault(bizInstrument) : null), (java.lang.Object) "inverse")) {
                SettingType settingType = SettingType.TRADING_LEGAL_UNIT;
                EZpvd(z, settingType, C54632xPo.OLrzqt(settingType));
            }
        }
    }

    public static /* synthetic */ void switchAmtUnit$default(C53994wvw c53994wvw, BizInstrument bizInstrument, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        c53994wvw.OLrzqt(bizInstrument, z);
    }

    public final void OLrzqt(BizInstrument bizInstrument, boolean z) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instType;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            if (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) {
                instType = "";
            }
            abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(instType);
        } else {
            abstractC54531xLwOLrzqt = null;
        }
        java.lang.String instType2 = bizInstrument != null ? bizInstrument.getInstType() : null;
        if (instType2 != null) {
            int iHashCode = instType2.hashCode();
            if (iHashCode == -1956807563) {
                if (instType2.equals("OPTION")) {
                    SettingType settingType = SettingType.TRADING_UNIT_OPTIONS;
                    EZpvd(z, settingType, C54632xPo.OLrzqt(settingType));
                    return;
                }
                return;
            }
            if (iHashCode != 2558355) {
                if (iHashCode != 214415088 || !instType2.equals("FUTURES")) {
                    return;
                }
            } else if (!instType2.equals("SWAP")) {
                return;
            }
            if (Intrinsics.EZpvd((java.lang.Object) (abstractC54531xLwOLrzqt != null ? abstractC54531xLwOLrzqt.copydefault(bizInstrument) : null), (java.lang.Object) "linear")) {
                SettingType settingType2 = SettingType.TRADING_UNIT_FUTURES_SWAP_USDT;
                EZpvd(z, settingType2, C54632xPo.OLrzqt(settingType2));
            } else {
                SettingType settingType3 = SettingType.TRADING_UNIT_FUTURES_SWAP_COIN;
                EZpvd(z, settingType3, C54632xPo.OLrzqt(settingType3));
            }
        }
    }

    public static /* synthetic */ void showDialog$default(C53994wvw c53994wvw, boolean z, SettingType settingType, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c53994wvw.EZpvd(z, settingType, list);
    }

    public static final void KWHzl(C53994wvw c53994wvw, SettingType settingType, boolean z) {
        c53994wvw.AkhnZx();
        c53994wvw.KWHzl().djBIcL().postValue(settingType);
        if (z) {
            c53994wvw.AhwBna();
        } else {
            c53994wvw.AYXKKw();
        }
        c53994wvw.finit().fIwbmz().KWHzl(Unit.INSTANCE);
    }

    public final void EZpvd(final boolean z, final SettingType settingType, java.util.List<? extends java.lang.Object> list) {
        try {
            if (settingType == SettingType.TRADING_LEGAL_UNIT) {
                AbstractC52792wYn abstractC52792wYnOLrzqt = C53685wqE.copydefault.copydefault().OLrzqt(new Function0() { // from class: o.wvK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C53994wvw.copydefault(this.copydefault, settingType, z);
                    }
                });
                androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                abstractC52792wYnOLrzqt.show(childFragmentManager);
                return;
            }
            if (settingType == SettingType.CURRENCY || settingType == SettingType.TRADING_UNIT_FUTURES_SWAP_USDT || settingType == SettingType.TRADING_UNIT_FUTURES_SWAP_COIN || settingType == SettingType.TRADING_UNIT_OPTIONS) {
                AbstractC52792wYn abstractC52792wYnTradeUnitContractAndOptionBottomSheet$default = InterfaceC49496upe.Application.tradeUnitContractAndOptionBottomSheet$default(C53685wqE.copydefault.copydefault(), z ? this.valueOf : this.fIwbmz, settingType, false, new yHO() { // from class: o.wvI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.yHO
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return C53994wvw.copydefault(this.AEQbTJ, settingType, z, (java.lang.String) obj, (java.lang.String) obj2, ((java.lang.Boolean) obj3).booleanValue());
                    }
                }, null, 16, null);
                androidx.fragment.app.FragmentManager childFragmentManager2 = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                abstractC52792wYnTradeUnitContractAndOptionBottomSheet$default.show(childFragmentManager2);
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("ArbitageDepthFragment show dialog", e);
        }
    }

    public static final Unit copydefault(C53994wvw c53994wvw, SettingType settingType, boolean z) {
        KWHzl(c53994wvw, settingType, z);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C53994wvw c53994wvw, SettingType settingType, boolean z, java.lang.String str, java.lang.String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        KWHzl(c53994wvw, settingType, z);
        return Unit.INSTANCE;
    }

    public final void AkhnZx() {
        OLrzqt(this.valueOf);
        EZpvd(this.fIwbmz);
    }

    public final void AhwBna() {
        C53959wvN c53959wvN;
        uZX uzx = this.AhwBna;
        if (uzx == null || (c53959wvN = uzx.EZpvd) == null) {
            return;
        }
        c53959wvN.EZpvd().EZpvd();
        c53959wvN.KWHzl().EZpvd();
    }

    public final void AYXKKw() {
        C53959wvN c53959wvN;
        uZX uzx = this.AhwBna;
        if (uzx == null || (c53959wvN = uzx.OLrzqt) == null) {
            return;
        }
        c53959wvN.EZpvd().EZpvd();
        c53959wvN.KWHzl().EZpvd();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(xMJ.Application application) {
        xMS xmsGEmmrt;
        java.lang.String strAhwBna;
        uZX uzx;
        C53959wvN c53959wvN;
        C53959wvN c53959wvN2;
        C53959wvN c53959wvN3;
        C53959wvN c53959wvN4;
        C53959wvN c53959wvN5;
        C53959wvN c53959wvN6;
        C53959wvN c53959wvN7;
        java.lang.String strAYXKKw;
        java.lang.String instType;
        java.lang.String instFamily;
        this.values = application;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null) {
            xmsGEmmrt = null;
        } else {
            BizInstrument bizInstrument = this.valueOf;
            if (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                BizInstrument bizInstrument2 = this.valueOf;
                if (bizInstrument2 == null || (instFamily = bizInstrument2.getInstFamily()) == null) {
                    instFamily = "";
                }
                xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily);
            }
        }
        if (xmsGEmmrt != null) {
            xMJ.Application application2 = this.values;
            if (application2 == null || (strAYXKKw = application2.AYXKKw()) == null) {
                strAYXKKw = "";
            }
            strAhwBna = xmsGEmmrt.AhwBna(strAYXKKw);
        } else {
            strAhwBna = null;
        }
        uZX uzx2 = this.AhwBna;
        java.lang.String strCopydefault = (uzx2 == null || (c53959wvN7 = uzx2.EZpvd) == null) ? null : c53959wvN7.copydefault();
        if (C33129mqd.AEQbTJ(strCopydefault) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            uZX uzx3 = this.AhwBna;
            if (uzx3 != null && (c53959wvN6 = uzx3.EZpvd) != null) {
                c53959wvN6.setLastPriceColor(this.gEmmrt);
            }
        } else {
            double dSubD$default = C33129mqd.subD$default(strAhwBna, strCopydefault, null, null, null, 14, null);
            if (dSubD$default == AudioStats.AUDIO_AMPLITUDE_NONE) {
                uZX uzx4 = this.AhwBna;
                if (uzx4 != null && (c53959wvN3 = uzx4.EZpvd) != null) {
                    c53959wvN3.setLastPriceColor(this.gEmmrt);
                }
            } else if (dSubD$default > AudioStats.AUDIO_AMPLITUDE_NONE) {
                uZX uzx5 = this.AhwBna;
                if (uzx5 != null && (c53959wvN2 = uzx5.EZpvd) != null) {
                    c53959wvN2.setLastPriceColor(this.uzCIH);
                }
            } else if (dSubD$default < AudioStats.AUDIO_AMPLITUDE_NONE && (uzx = this.AhwBna) != null && (c53959wvN = uzx.EZpvd) != null) {
                c53959wvN.setLastPriceColor(this.djBIcL);
            }
        }
        xMJ.Application application3 = this.values;
        java.lang.String strAYXKKw2 = application3 != null ? application3.AYXKKw() : null;
        if (strAYXKKw2 != null && strAYXKKw2.length() != 0) {
            uZX uzx6 = this.AhwBna;
            if (uzx6 == null || (c53959wvN5 = uzx6.EZpvd) == null) {
                return;
            }
            c53959wvN5.setLastPriceTag(strAhwBna);
            c53959wvN5.setLastPriceText(pTB.formatRoundToMax$default(xMR.copydefault.OLrzqt((java.lang.Object) (strAhwBna != null ? strAhwBna : "")), C33129mqd.AhwBna(xmsGEmmrt != null ? xmsGEmmrt.AEQbTJ() : null), null, 2, null));
            return;
        }
        uZX uzx7 = this.AhwBna;
        if (uzx7 == null || (c53959wvN4 = uzx7.EZpvd) == null) {
            return;
        }
        c53959wvN4.setLastPriceText("--");
        c53959wvN4.setLastPriceTag("");
        c53959wvN4.setLastPriceColor(this.gEmmrt);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(xMJ.Application application) {
        xMS xmsGEmmrt;
        java.lang.String strAhwBna;
        uZX uzx;
        C53959wvN c53959wvN;
        C53959wvN c53959wvN2;
        C53959wvN c53959wvN3;
        C53959wvN c53959wvN4;
        C53959wvN c53959wvN5;
        C53959wvN c53959wvN6;
        C53959wvN c53959wvN7;
        java.lang.String strAYXKKw;
        java.lang.String instType;
        java.lang.String instFamily;
        this.fARcdN = application;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null) {
            xmsGEmmrt = null;
        } else {
            BizInstrument bizInstrument = this.fIwbmz;
            if (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                BizInstrument bizInstrument2 = this.fIwbmz;
                if (bizInstrument2 == null || (instFamily = bizInstrument2.getInstFamily()) == null) {
                    instFamily = "";
                }
                xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily);
            }
        }
        if (xmsGEmmrt != null) {
            xMJ.Application application2 = this.fARcdN;
            if (application2 == null || (strAYXKKw = application2.AYXKKw()) == null) {
                strAYXKKw = "";
            }
            strAhwBna = xmsGEmmrt.AhwBna(strAYXKKw);
        } else {
            strAhwBna = null;
        }
        uZX uzx2 = this.AhwBna;
        java.lang.String strCopydefault = (uzx2 == null || (c53959wvN7 = uzx2.OLrzqt) == null) ? null : c53959wvN7.copydefault();
        if (C33129mqd.AEQbTJ(strCopydefault) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            uZX uzx3 = this.AhwBna;
            if (uzx3 != null && (c53959wvN6 = uzx3.OLrzqt) != null) {
                c53959wvN6.setLastPriceColor(this.gEmmrt);
            }
        } else {
            double dSubD$default = C33129mqd.subD$default(strAhwBna, strCopydefault, null, null, null, 14, null);
            if (dSubD$default == AudioStats.AUDIO_AMPLITUDE_NONE) {
                uZX uzx4 = this.AhwBna;
                if (uzx4 != null && (c53959wvN3 = uzx4.OLrzqt) != null) {
                    c53959wvN3.setLastPriceColor(this.gEmmrt);
                }
            } else if (dSubD$default > AudioStats.AUDIO_AMPLITUDE_NONE) {
                uZX uzx5 = this.AhwBna;
                if (uzx5 != null && (c53959wvN2 = uzx5.OLrzqt) != null) {
                    c53959wvN2.setLastPriceColor(this.uzCIH);
                }
            } else if (dSubD$default < AudioStats.AUDIO_AMPLITUDE_NONE && (uzx = this.AhwBna) != null && (c53959wvN = uzx.OLrzqt) != null) {
                c53959wvN.setLastPriceColor(this.djBIcL);
            }
        }
        xMJ.Application application3 = this.fARcdN;
        java.lang.String strAYXKKw2 = application3 != null ? application3.AYXKKw() : null;
        if (strAYXKKw2 != null && strAYXKKw2.length() != 0) {
            uZX uzx6 = this.AhwBna;
            if (uzx6 == null || (c53959wvN5 = uzx6.OLrzqt) == null) {
                return;
            }
            c53959wvN5.setLastPriceTag(strAhwBna);
            c53959wvN5.setLastPriceText(pTB.formatRoundToMax$default(xMR.copydefault.OLrzqt((java.lang.Object) (strAhwBna != null ? strAhwBna : "")), C33129mqd.AhwBna(xmsGEmmrt != null ? xmsGEmmrt.AEQbTJ() : null), null, 2, null));
            return;
        }
        uZX uzx7 = this.AhwBna;
        if (uzx7 == null || (c53959wvN4 = uzx7.OLrzqt) == null) {
            return;
        }
        c53959wvN4.setLastPriceText("--");
        c53959wvN4.setLastPriceTag("");
        c53959wvN4.setLastPriceColor(this.gEmmrt);
    }

    public final void fetchVPNInfo() {
        C53959wvN c53959wvN;
        C53959wvN c53959wvN2;
        C53959wvN c53959wvN3;
        uZX uzx = this.AhwBna;
        if (uzx != null && (c53959wvN3 = uzx.EZpvd) != null) {
            c53959wvN3.setSpreadVisible(true);
        }
        uZX uzx2 = this.AhwBna;
        if (uzx2 != null && (c53959wvN2 = uzx2.OLrzqt) != null) {
            c53959wvN2.setSpreadVisible(false);
        }
        uZX uzx3 = this.AhwBna;
        if (uzx3 == null || (c53959wvN = uzx3.EZpvd) == null) {
            return;
        }
        c53959wvN.setSpreadClickCallback(new Function0() { // from class: o.wvx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53994wvw.valueOf(this.KWHzl);
            }
        });
    }

    public static final Unit valueOf(C53994wvw c53994wvw) {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        c53994wvw.AEQbTJ = !c53994wvw.AEQbTJ;
        SPUtils.put(C55697xoo.OLrzqt.copydefault() + " arbitrage_spread_type", java.lang.Boolean.valueOf(c53994wvw.AEQbTJ));
        xMJ.Application application = c53994wvw.values;
        java.lang.String str = "";
        if (application == null || (strAYXKKw = application.AYXKKw()) == null) {
            strAYXKKw = "";
        }
        xMJ.Application application2 = c53994wvw.fARcdN;
        if (application2 != null && (strAYXKKw2 = application2.AYXKKw()) != null) {
            str = strAYXKKw2;
        }
        c53994wvw.copydefault(strAYXKKw, str, c53994wvw.EZpvd());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void refreshSpreadData$default(C53994wvw c53994wvw, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        c53994wvw.copydefault(str, str2, z);
    }

    public final void copydefault(java.lang.String str, java.lang.String str2, boolean z) {
        C53959wvN c53959wvN;
        int i;
        C53959wvN c53959wvN2;
        int iMax = java.lang.Math.max(KWHzl(str), KWHzl(str2));
        java.lang.String strDivS$default = "--";
        int i2 = 0;
        if (this.AEQbTJ) {
            if (z) {
                java.lang.String strSubS$default = C33129mqd.subS$default(str, str2, java.lang.Integer.valueOf(iMax), java.lang.Boolean.FALSE, null, 8, null);
                i = C33129mqd.AEQbTJ(strSubS$default) == AudioStats.AUDIO_AMPLITUDE_NONE ? this.gEmmrt : C33129mqd.AEQbTJ(strSubS$default) > AudioStats.AUDIO_AMPLITUDE_NONE ? this.uzCIH : C33129mqd.AEQbTJ(strSubS$default) < AudioStats.AUDIO_AMPLITUDE_NONE ? this.djBIcL : 0;
                java.lang.String str3 = C33129mqd.AEQbTJ(strSubS$default, 0) ? Marker.ANY_NON_NULL_MARKER : "";
                strDivS$default = str3 + xMR.copydefault.copydefault(strSubS$default);
            } else {
                i = this.gEmmrt;
            }
            uZX uzx = this.AhwBna;
            if (uzx == null || (c53959wvN2 = uzx.EZpvd) == null) {
                return;
            }
            c53959wvN2.setSpreadData(C33070mpX.AYXKKw(C55688xof.Application.onDrawerOpened), strDivS$default, i);
            return;
        }
        if (z) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            strDivS$default = C33129mqd.divS$default(C33129mqd.subS$default(str, str2, null, bool, null, 10, null), str, null, bool, null, 10, null);
            if (C33129mqd.AEQbTJ(strDivS$default) == AudioStats.AUDIO_AMPLITUDE_NONE) {
                i2 = this.gEmmrt;
            } else if (C33129mqd.AEQbTJ(strDivS$default) > AudioStats.AUDIO_AMPLITUDE_NONE) {
                i2 = this.uzCIH;
            } else if (C33129mqd.AEQbTJ(strDivS$default) < AudioStats.AUDIO_AMPLITUDE_NONE) {
                i2 = this.djBIcL;
            }
        } else {
            i2 = this.gEmmrt;
        }
        java.lang.String percentWithSymbol$default = strDivS$default;
        uZX uzx2 = this.AhwBna;
        if (uzx2 == null || (c53959wvN = uzx2.EZpvd) == null) {
            return;
        }
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.djSkpj);
        if (z) {
            percentWithSymbol$default = xMR.formatPercentWithSymbol$default(xMR.copydefault, percentWithSymbol$default, 0, 0, RoundingMode.DOWN, 6, null);
        }
        c53959wvN.setSpreadData(strAYXKKw, percentWithSymbol$default, i2);
    }

    public final int KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new char[]{'.'}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default.size() <= 1) {
            return 0;
        }
        return ((java.lang.String) listSplit$default.get(1)).length();
    }

    public final void values() {
        C53959wvN c53959wvN;
        C53959wvN c53959wvN2;
        uZX uzx = this.AhwBna;
        if (uzx != null && (c53959wvN2 = uzx.EZpvd) != null) {
            c53959wvN2.setPackUpVisible(false);
        }
        uZX uzx2 = this.AhwBna;
        if (uzx2 == null || (c53959wvN = uzx2.OLrzqt) == null) {
            return;
        }
        c53959wvN.setPackUpVisible(true);
    }

    public final void valueOf() {
        C53959wvN c53959wvN;
        android.widget.LinearLayout linearLayout;
        uZX uzx = this.AhwBna;
        if (uzx != null && (linearLayout = uzx.KWHzl) != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o.wvC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C53994wvw.AEQbTJ(this.copydefault, view);
                }
            });
        }
        uZX uzx2 = this.AhwBna;
        if (uzx2 == null || (c53959wvN = uzx2.OLrzqt) == null) {
            return;
        }
        c53959wvN.setPackUpClickListener(new Function0() { // from class: o.wvD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53994wvw.gEmmrt(this.KWHzl);
            }
        });
    }

    public static final void AEQbTJ(C53994wvw c53994wvw, android.view.View view) {
        android.widget.LinearLayout linearLayout;
        android.widget.LinearLayout linearLayout2;
        SPUtils.put(C55697xoo.OLrzqt.copydefault() + " arbitrage_depth_visible", java.lang.Boolean.TRUE);
        uZX uzx = c53994wvw.AhwBna;
        if (uzx != null && (linearLayout2 = uzx.KWHzl) != null) {
            linearLayout2.setVisibility(8);
        }
        uZX uzx2 = c53994wvw.AhwBna;
        if (uzx2 != null && (linearLayout = uzx2.copydefault) != null) {
            linearLayout.setVisibility(0);
        }
        c53994wvw.AEQbTJ();
    }

    public static final Unit gEmmrt(C53994wvw c53994wvw) {
        android.widget.LinearLayout linearLayout;
        android.widget.LinearLayout linearLayout2;
        SPUtils.put(C55697xoo.OLrzqt.copydefault() + " arbitrage_depth_visible", java.lang.Boolean.FALSE);
        uZX uzx = c53994wvw.AhwBna;
        if (uzx != null && (linearLayout2 = uzx.KWHzl) != null) {
            linearLayout2.setVisibility(0);
        }
        uZX uzx2 = c53994wvw.AhwBna;
        if (uzx2 != null && (linearLayout = uzx2.copydefault) != null) {
            linearLayout.setVisibility(8);
        }
        c53994wvw.DbNXlk();
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        android.widget.LinearLayout linearLayout;
        android.widget.LinearLayout linearLayout2;
        boolean z = SPUtils.getBoolean(C55697xoo.OLrzqt.copydefault() + " arbitrage_depth_visible", true);
        uZX uzx = this.AhwBna;
        if (uzx != null && (linearLayout2 = uzx.KWHzl) != null) {
            linearLayout2.setVisibility(z ? 8 : 0);
        }
        uZX uzx2 = this.AhwBna;
        if (uzx2 == null || (linearLayout = uzx2.copydefault) == null) {
            return;
        }
        linearLayout.setVisibility(z ? 0 : 8);
    }
}
