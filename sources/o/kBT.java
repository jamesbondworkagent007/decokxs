package o;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.market.features.vibes.domain.VibesTimeRange;
import com.okinc.business.market.features.vibes.ui.VibesViewModel;
import com.okinc.dapp.bean.VibeFeedsParamsBean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C22366hdx;
import o.InterfaceC27746kBv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class kBT extends androidx.fragment.app.Fragment {
    public final InterfaceC56387yDm EZpvd;
    public C22321hdE copydefault;

    public kBT() {
        final Function0 function0 = null;
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(VibesViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.vibes.ui.chart.VibesChartFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.vibes.ui.chart.VibesChartFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.vibes.ui.chart.VibesChartFragment$special$$inlined$activityViewModels$default$3
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VibesViewModel AEQbTJ() {
        return (VibesViewModel) this.EZpvd.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C22321hdE c22321hdEEZpvd = C22321hdE.EZpvd(layoutInflater, viewGroup, false);
        this.copydefault = c22321hdEEZpvd;
        if (c22321hdEEZpvd != null) {
            return c22321hdEEZpvd.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        copydefault();
    }

    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(VibesViewModel.Companion.ChartDisplayUnit chartDisplayUnit, Continuation<? super Unit> continuation) {
            android.widget.TextView textView;
            C22321hdE c22321hdE = kBT.this.copydefault;
            if (c22321hdE != null && (textView = c22321hdE.EZpvd) != null) {
                textView.setText(chartDisplayUnit != VibesViewModel.Companion.ChartDisplayUnit.PRICE ? C33070mpX.AYXKKw(C22366hdx.StateListAnimator.QVAiDq) : C33070mpX.AYXKKw(C22366hdx.StateListAnimator.QUSxYX));
            }
            InterfaceC27746kBv value = kBT.this.AEQbTJ().copydefault().getValue();
            InterfaceC27746kBv.ActionBar actionBar = value instanceof InterfaceC27746kBv.ActionBar ? (InterfaceC27746kBv.ActionBar) value : null;
            if (actionBar != null) {
                kBT.this.copydefault(actionBar);
            }
            return Unit.INSTANCE;
        }
    }

    private final void copydefault() {
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().AYXKKw(), null, new ActionBar(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().copydefault(), null, new Application(), 2, null);
    }

    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC27746kBv interfaceC27746kBv, Continuation<? super Unit> continuation) {
            if (interfaceC27746kBv instanceof InterfaceC27746kBv.ActionBar) {
                kBT.this.copydefault((InterfaceC27746kBv.ActionBar) interfaceC27746kBv);
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) kBT.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            } else if (!Intrinsics.EZpvd(interfaceC27746kBv, InterfaceC27746kBv.TaskDescription.AEQbTJ) && !Intrinsics.EZpvd(interfaceC27746kBv, InterfaceC27746kBv.Application.KWHzl)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
    }

    public final void copydefault(final InterfaceC27746kBv.ActionBar actionBar) {
        kBK kbk;
        C22321hdE c22321hdE = this.copydefault;
        if (c22321hdE == null || (kbk = c22321hdE.OLrzqt) == null) {
            return;
        }
        kbk.EZpvd(actionBar.OLrzqt().OLrzqt(), actionBar.OLrzqt().EZpvd(), actionBar.OLrzqt().copydefault(), AEQbTJ().AYXKKw().getValue() == VibesViewModel.Companion.ChartDisplayUnit.PRICE, AEQbTJ().OLrzqt().getValue().copydefault() == VibesTimeRange.TIME_24H, new Function1() { // from class: o.kBR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kBT.KWHzl(this.AEQbTJ, actionBar, (java.util.List) obj);
            }
        });
    }

    public static final Unit KWHzl(kBT kbt, InterfaceC27746kBv.ActionBar actionBar, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        kAU kau = (kAU) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (kau != null) {
            VibesViewModel vibesViewModelAEQbTJ = kbt.AEQbTJ();
            long jKWHzl = kbt.AEQbTJ().KWHzl().KWHzl();
            vibesViewModelAEQbTJ.copydefault("kol_kline", (30 & 2) != 0 ? null : null, (30 & 4) != 0 ? null : null, (30 & 8) != 0 ? null : null, (30 & 16) != 0 ? null : null, java.lang.String.valueOf(jKWHzl), actionBar.OLrzqt().gEmmrt());
            kbt.AEQbTJ(C33129mqd.valueOf(kau.OLrzqt()), actionBar.OLrzqt().gEmmrt(), actionBar.OLrzqt().valueOf(), null, C33129mqd.AhwBna(actionBar.OLrzqt().KWHzl()), kbt.AEQbTJ().OLrzqt().getValue().copydefault().getDiscoverDuration(), kbt.AEQbTJ().OLrzqt().getValue().copydefault().getDiscoverUnit().getValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, long j2, int i2) {
        xWA xwa;
        java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(xWA.class));
        if (listKWHzl == null || (xwa = (xWA) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl)) == null) {
            return;
        }
        VibeFeedsParamsBean vibeFeedsParamsBean = new VibeFeedsParamsBean(j, java.lang.String.valueOf(AEQbTJ().KWHzl().KWHzl()), str2, str, i, j2, i2, str3);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            xwa.copydefault(activity, vibeFeedsParamsBean);
        }
    }
}
