package o;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.botDetail.ui.OverviewRingChartFragment$initView$1;
import com.okinc.tradingbot.impl.botDetail.ui.OverviewRingChartViewModel;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.wUO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uIl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48194uIl extends AbstractC48193uIk {
    public final InterfaceC56387yDm AYXKKw;
    public C48337uNt AhwBna;
    public boolean djBIcL;
    public final int gEmmrt = C48033uCm.Activity.finit;
    public final InterfaceC56387yDm valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
    }

    public C48194uIl() {
        final Function0 function0 = null;
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.OverviewRingChartFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.OverviewRingChartFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.OverviewRingChartFragment$special$$inlined$activityViewModels$default$3
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
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.OverviewRingChartFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.OverviewRingChartFragment$special$$inlined$viewModels$default$2
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OverviewRingChartViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.OverviewRingChartFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.OverviewRingChartFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.botDetail.ui.OverviewRingChartFragment$special$$inlined$viewModels$default$5
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
    }

    private final TacticsDetailPresenter AhwBna() {
        return (TacticsDetailPresenter) this.AYXKKw.getValue();
    }

    /* JADX DEBUG: Possible override for method o.uIk.KWHzl()V */
    public final OverviewRingChartViewModel KWHzl() {
        return (OverviewRingChartViewModel) this.valueOf.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AhwBna = C48337uNt.copydefault(view);
        StateFlow<OverviewRingChartViewModel.TaskDescription> stateFlowKWHzl = KWHzl().KWHzl();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C52692wUv.copydefault(stateFlowKWHzl, viewLifecycleOwner, Lifecycle.State.CREATED, new OverviewRingChartFragment$initView$1(this, null));
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void copydefault(@NotNull TacticsData tacticsData, boolean z) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        if (!isAdded() || tacticsData.getHistory()) {
            valueOf();
        } else {
            this.djBIcL = z;
            KWHzl().EZpvd(tacticsData);
        }
    }

    public final void EZpvd(OverviewRingChartViewModel.TaskDescription taskDescription) throws java.io.IOException {
        wUK wuk;
        if (taskDescription == null) {
            valueOf();
            return;
        }
        java.lang.String str = (java.lang.String) AhwBna().KWHzl(new Function1() { // from class: o.uIn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48194uIl.EZpvd((C55887xsS) obj);
            }
        });
        java.lang.String str2 = (java.lang.String) AhwBna().KWHzl(new Function1() { // from class: o.uIt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48194uIl.KWHzl((C55887xsS) obj);
            }
        });
        C48337uNt c48337uNt = this.AhwBna;
        if (c48337uNt == null || (wuk = c48337uNt.copydefault) == null) {
            return;
        }
        wuk.setVisibility(0);
        wuk.setChartData(copydefault(taskDescription, str), KWHzl(taskDescription, str2), this.djBIcL);
        wuk.setHeaderTitle(C33070mpX.AYXKKw(C55688xof.Application.getSelectedTab), new C48199uIq(wuk));
        wuk.setBaseCcyDisplay(C33069mpW.copydefault(C48033uCm.Fragment.DcMfJKfNLfdT, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, str))), uLP.AEQbTJ(taskDescription.OLrzqt()));
        wuk.setQuoteCcyDisplay(C33069mpW.copydefault(C48033uCm.Fragment.DcMfJKfNLfdT, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, str2))), uLP.AEQbTJ(taskDescription.copydefault()));
    }

    public static final java.lang.String EZpvd(C55887xsS c55887xsS) {
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        java.lang.String strOLrzqt = c55887xsS.OLrzqt();
        return strOLrzqt == null ? "" : strOLrzqt;
    }

    public static final java.lang.String KWHzl(C55887xsS c55887xsS) {
        Intrinsics.checkNotNullParameter(c55887xsS, "");
        java.lang.String strAkhnZx = c55887xsS.AkhnZx();
        return strAkhnZx == null ? "" : strAkhnZx;
    }

    public static final Unit EZpvd(wUK wuk) {
        android.content.Context context = wuk.getContext();
        if (context != null) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.getSelectedTab));
            viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C48033uCm.Fragment.RWIpjU));
            ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C33070mpX.AYXKKw(C55688xof.Application.onCreate), (View.OnClickListener) null, 2, (java.lang.Object) null);
            viewOnClickListenerC54939xaY.show();
        }
        return Unit.INSTANCE;
    }

    public final void valueOf() {
        wUK wuk;
        C48337uNt c48337uNt = this.AhwBna;
        if (c48337uNt == null || (wuk = c48337uNt.copydefault) == null) {
            return;
        }
        wuk.setVisibility(8);
    }

    public final wUO.TaskDescription copydefault(OverviewRingChartViewModel.TaskDescription taskDescription, java.lang.String str) {
        return new wUO.TaskDescription(taskDescription.AEQbTJ(), str, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ)), null);
    }

    public final wUO.TaskDescription KWHzl(OverviewRingChartViewModel.TaskDescription taskDescription, java.lang.String str) {
        return new wUO.TaskDescription(taskDescription.KWHzl(), str, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.RAQtXZ)), null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AhwBna = null;
    }
}
