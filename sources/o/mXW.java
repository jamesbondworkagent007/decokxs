package o;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.dexkline.dex.api.bean.TokenBase;
import com.okinc.dexkline.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.dexkline.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.dexkline.market.features.data.domain.type.DataTabType;
import com.okinc.dexkline.market.features.data.ui.CoinDetailDataFragment$redirectTo$1$1;
import com.okinc.dexkline.market.features.data.ui.CoinDetailDataViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class mXW extends AbstractC32331mYa {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm KWHzl;
    public oNI OLrzqt;
    public java.lang.Integer copydefault;

    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
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
    public final oNI KWHzl() {
        return this.OLrzqt;
    }

    public mXW() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.dexkline.market.features.data.ui.CoinDetailDataFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.dexkline.market.features.data.ui.CoinDetailDataFragment$special$$inlined$viewModels$default$2
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CoinDetailDataViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.data.ui.CoinDetailDataFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.data.ui.CoinDetailDataFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.data.ui.CoinDetailDataFragment$special$$inlined$viewModels$default$5
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
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.data.ui.CoinDetailDataFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.data.ui.CoinDetailDataFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.data.ui.CoinDetailDataFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.mYa.AEQbTJ()V */
    public final CoinDetailDataViewModel AEQbTJ() {
        return (CoinDetailDataViewModel) this.KWHzl.getValue();
    }

    private final MarketCoinDetailViewModel AhwBna() {
        return (MarketCoinDetailViewModel) this.AEQbTJ.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        oNI oniCopydefault = oNI.copydefault(getLayoutInflater(), viewGroup, false);
        this.OLrzqt = oniCopydefault;
        if (oniCopydefault != null) {
            return oniCopydefault.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        valueOf();
        gEmmrt();
        AYXKKw();
        CoinDetailDataViewModel.loadAllData$default(AEQbTJ(), false, false, 3, null);
    }

    private final void valueOf() {
        oNI oni = this.OLrzqt;
        if (oni != null) {
            oni.AhwBna.AhwBna(false);
            oni.AhwBna.OLrzqt(new InterfaceC57903yrG() { // from class: o.mXS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57903yrG
                public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                    mXW.KWHzl(this.copydefault, interfaceC57934yrl);
                }
            });
            C55173xeu c55173xeu = oni.KWHzl;
            c55173xeu.setTitle("Error Global");
            c55173xeu.setSubTitle((java.lang.CharSequence) "Please retry");
            c55173xeu.setRetry("Reload");
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.mXT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    mXW.AEQbTJ(this.OLrzqt, view);
                }
            });
        }
    }

    public static final void KWHzl(mXW mxw, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        CoinDetailDataViewModel.loadAllData$default(mxw.AEQbTJ(), false, true, 1, null);
    }

    public static final void AEQbTJ(mXW mxw, android.view.View view) {
        CoinDetailDataViewModel.loadAllData$default(mxw.AEQbTJ(), false, false, 3, null);
    }

    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(mXJ mxj, Continuation<? super Unit> continuation) {
            C55113xdn c55113xdn;
            oNI oniKWHzl = mXW.this.KWHzl();
            if (oniKWHzl != null && (c55113xdn = oniKWHzl.AEQbTJ) != null) {
                c55113xdn.setAnimation(mXW.this.AEQbTJ().KWHzl(Intrinsics.EZpvd((java.lang.Object) pFN.OLrzqt.AEQbTJ(), (java.lang.Object) "kline_dark")));
            }
            oNI oniKWHzl2 = mXW.this.KWHzl();
            if (oniKWHzl2 != null) {
                mXW mxw = mXW.this;
                android.widget.ScrollView scrollView = oniKWHzl2.djBIcL;
                Intrinsics.checkNotNullExpressionValue(scrollView, "");
                scrollView.setVisibility(mxj.OLrzqt().KWHzl() ? 0 : 8);
                C55113xdn c55113xdn2 = oniKWHzl2.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                c55113xdn2.setVisibility(mxj.OLrzqt().KWHzl() ? 0 : 8);
                C55173xeu c55173xeu = oniKWHzl2.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                c55173xeu.setVisibility(mxj.KWHzl() ? 0 : 8);
                boolean z = (mxj.OLrzqt().KWHzl() || mxj.KWHzl()) ? false : true;
                NestedScrollView nestedScrollView = oniKWHzl2.copydefault;
                Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
                nestedScrollView.setVisibility(z ? 0 : 8);
                if (z) {
                    rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) mxw, true, (java.lang.String) null, 2, (java.lang.Object) null);
                    java.lang.Integer num = mxw.copydefault;
                    if (num != null) {
                        mxw.KWHzl(DataTabType.values()[num.intValue()]);
                    }
                }
                if (!mxj.OLrzqt().copydefault()) {
                    C33546myW c33546myW = oniKWHzl2.AhwBna;
                    Intrinsics.checkNotNullExpressionValue(c33546myW, "");
                    C57589ylK.KWHzl(c33546myW, true);
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final void gEmmrt() {
        mUN.collectOnViewLifecycle$default(this, AEQbTJ().EZpvd(), null, new TaskDescription(), 2, null);
    }

    private final void AYXKKw() {
        AhwBna().gEmmrt().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.mXU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return mXW.copydefault(this.KWHzl, (InterfaceC32140mQz) obj);
            }
        }));
    }

    public static final Unit copydefault(mXW mxw, InterfaceC32140mQz interfaceC32140mQz) {
        if (interfaceC32140mQz != null && interfaceC32140mQz.KWHzl() == CoinDetailTabType.DATA.ordinal() && interfaceC32140mQz.copydefault() < DataTabType.values().length) {
            mXJ value = mxw.AEQbTJ().EZpvd().getValue();
            if (!value.OLrzqt().KWHzl() && !value.KWHzl()) {
                mxw.KWHzl(DataTabType.values()[interfaceC32140mQz.copydefault()]);
            } else {
                mxw.copydefault = java.lang.Integer.valueOf(interfaceC32140mQz.copydefault());
            }
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(DataTabType dataTabType) {
        oNI oni = this.OLrzqt;
        if (oni != null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CoinDetailDataFragment$redirectTo$1$1(dataTabType, oni, this, null), 3, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.OLrzqt = null;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mXW.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final mXW EZpvd(TokenBase tokenBase) {
            mXW mxw = new mXW();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("data", tokenBase);
            mxw.setArguments(bundle);
            return mxw;
        }
    }
}
