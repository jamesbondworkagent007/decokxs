package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.invest_biz.data.contants.ChartInterval;
import com.okinc.business.invest_biz.ui.screens.tvl_chart.TvlChartDialogParams;
import com.okinc.business.invest_biz.ui.screens.tvl_chart.TvlChartViewModel;
import com.okinc.business.invest_biz.ui.widget.product_details.ProductDetailsChartType;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.FlowCollector;
import o.C25493ixk;
import o.C52761wXj;
import o.InterfaceC26824jjc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jiZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C26768jiZ extends AbstractC26765jiW implements InterfaceC27387juI {
    public static final /* synthetic */ yJA<java.lang.Object>[] AYXKKw = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(C26768jiZ.class, "contentBinding", "getContentBinding()Lcom/okinc/business/invest_biz/databinding/DialogTvlChartBinding;", 0))};
    public static final Application Companion = new Application(null);
    public static final int djBIcL = 8;
    public final yIP AhwBna = C27589jxz.EZpvd(this);
    public final InterfaceC56387yDm gEmmrt;

    public C26768jiZ() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.invest_biz.ui.screens.tvl_chart.TvlChartDialog$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.screens.tvl_chart.TvlChartDialog$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TvlChartViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.tvl_chart.TvlChartDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.tvl_chart.TvlChartDialog$special$$inlined$viewModels$default$4
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.tvl_chart.TvlChartDialog$special$$inlined$viewModels$default$5
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

    public final TvlChartDialogParams gEmmrt() {
        TvlChartDialogParams tvlChartDialogParams;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (tvlChartDialogParams = (TvlChartDialogParams) BundleCompat.getParcelable(arguments, "key.params", TvlChartDialogParams.class)) == null) {
            throw new java.lang.IllegalStateException("Must provide TVL chart params".toString());
        }
        return tvlChartDialogParams;
    }

    /* JADX DEBUG: Possible override for method o.jiW.AEQbTJ()V */
    public final C23741iHp AEQbTJ() {
        return (C23741iHp) this.AhwBna.getValue(this, AYXKKw[0]);
    }

    public final void OLrzqt(C23741iHp c23741iHp) {
        this.AhwBna.KWHzl(this, AYXKKw[0], c23741iHp);
    }

    public final TvlChartViewModel AhwBna() {
        return (TvlChartViewModel) this.gEmmrt.getValue();
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        OLrzqt(C23741iHp.copydefault(getLayoutInflater(), constraintLayout, true));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        C55118xds root;
        android.graphics.drawable.Drawable background;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AYXKKw();
        C27589jxz.collectOnViewLifecycle$default(this, AhwBna().copydefault(), null, new TaskDescription(), 2, null);
        AhwBna().AEQbTJ(gEmmrt().AEQbTJ(), ChartInterval.Week);
        AEQbTJ(gEmmrt().OLrzqt());
        C54946xaf binding = getBinding();
        if (binding == null || (root = binding.getRoot()) == null || (background = root.getBackground()) == null) {
            return;
        }
        C33057mpK.copydefault(background, C33070mpX.copydefault(C52761wXj.Activity.hOMIpD));
    }

    /* JADX INFO: renamed from: o.jiZ$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC26824jjc interfaceC26824jjc, Continuation<? super Unit> continuation) {
            C26768jiZ.this.KWHzl(interfaceC26824jjc);
            return Unit.INSTANCE;
        }
    }

    @Override // o.InterfaceC27387juI
    public void copydefault(@NotNull ChartInterval chartInterval) {
        Intrinsics.checkNotNullParameter(chartInterval, "");
        AhwBna().AEQbTJ(gEmmrt().AEQbTJ(), chartInterval);
    }

    @Override // o.InterfaceC27387juI
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (z) {
            str = gEmmrt().OLrzqt();
        }
        AEQbTJ(str);
        OLrzqt(str2);
    }

    private final void AYXKKw() {
        AEQbTJ().copydefault.EZpvd(this, ProductDetailsChartType.Tvl);
        C55173xeu c55173xeu = AEQbTJ().AEQbTJ;
        java.lang.String string = getString(C25493ixk.FragmentManager.gBtXYZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setTitle(string);
        java.lang.String string2 = getString(C25493ixk.FragmentManager.fupbxE);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeu.setRetry(string2);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.jiY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C26768jiZ.KWHzl(this.OLrzqt, view);
            }
        });
    }

    public static final void KWHzl(C26768jiZ c26768jiZ, android.view.View view) {
        c26768jiZ.AhwBna().AEQbTJ(c26768jiZ.gEmmrt().AEQbTJ(), ChartInterval.Week);
    }

    public final void KWHzl(InterfaceC26824jjc interfaceC26824jjc) {
        C23741iHp c23741iHpAEQbTJ = AEQbTJ();
        LinearLayoutCompat linearLayoutCompat = c23741iHpAEQbTJ.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        boolean z = interfaceC26824jjc instanceof InterfaceC26824jjc.TaskDescription;
        linearLayoutCompat.setVisibility(z ? 0 : 8);
        C55113xdn c55113xdn = c23741iHpAEQbTJ.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(interfaceC26824jjc instanceof InterfaceC26824jjc.ActionBar ? 0 : 8);
        C55173xeu c55173xeu = c23741iHpAEQbTJ.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(interfaceC26824jjc instanceof InterfaceC26824jjc.Activity ? 0 : 8);
        if (z) {
            OLrzqt((InterfaceC26824jjc.TaskDescription) interfaceC26824jjc);
        }
    }

    public final void OLrzqt(InterfaceC26824jjc.TaskDescription taskDescription) {
        AEQbTJ().gEmmrt.setText(taskDescription.AEQbTJ());
        AEQbTJ().copydefault.setData(taskDescription.EZpvd());
    }

    public final void OLrzqt(java.lang.String str) {
        android.widget.TextView textView = AEQbTJ().AhwBna;
        textView.setVisibility(str.length() > 0 ? 0 : 4);
        textView.setText(str);
    }

    /* JADX INFO: renamed from: o.jiZ$Application */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jiZ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C26768jiZ KWHzl(long j, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            TvlChartDialogParams tvlChartDialogParams = new TvlChartDialogParams(j, str);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.params", tvlChartDialogParams);
            C26768jiZ c26768jiZ = new C26768jiZ();
            c26768jiZ.setArguments(bundle);
            return c26768jiZ;
        }
    }

    public final void AEQbTJ(java.lang.String str) {
        if (str.length() != 0) {
            str = C27586jxw.localizeLargeValueStrategy$default(C27586jxw.OLrzqt, C33129mqd.EZpvd(str), null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, 10, null);
        }
        if (str.length() == 0) {
            str = "--";
        }
        AEQbTJ().valueOf.setTickerText(str, true, false);
    }
}
