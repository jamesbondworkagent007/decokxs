package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.camera.video.AudioStats;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.OKAppBarLayoutBehavior;
import com.okinc.business.defi.biz.core.ticker.WalletTickerManager;
import com.okinc.business.defi.biz.core.ws.channel.WalletCoinAssetSubManager;
import com.okinc.business.defi.wallet.tx.history.OverviewCoinDetailFragment$initObserver$1;
import com.okinc.business.defi.wallet.tx.history.OverviewCoinDetailFragment$initObserver$4;
import com.okinc.business.defi.wallet.tx.history.OverviewCoinDetailFragment$onViewCreated$4;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C12827cuN;
import o.C13754dXa;
import o.C52761wXj;
import o.C57439yiT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gBu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19422gBu extends AbstractC32998moE {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public C19398gAx AEQbTJ;
    public final java.lang.String AYXKKw;
    public boolean AhwBna;
    public AbstractC16581emd AkhnZx;
    public final InterfaceC56387yDm AuCTel;
    public gBT DbNXlk;
    public final InterfaceC56387yDm KWHzl;
    public boolean OLrzqt;
    public WalletCoinAssetSubManager.TaskDescription copydefault;
    public final C43316rmw djBIcL;
    public C57439yiT.Application ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public C57439yiT.StateListAnimator fIwbmz;
    public gBU fetchVPNInfo;
    public boolean gEmmrt;
    public Function1<? super C19419gBr, Unit> isConnected;
    public final int valueOf = C13754dXa.TaskDescription.DGUQLIhJrIAr;
    public final InterfaceC56387yDm values;

    /* JADX INFO: renamed from: o.gBu$Fragment */
    public static final /* synthetic */ class Fragment implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull Function1<? super C19419gBr, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.isConnected = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.valueOf;
    }

    public C19422gBu() {
        final Function0 function0 = null;
        this.fARcdN = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(gFG.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tx.history.OverviewCoinDetailFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tx.history.OverviewCoinDetailFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.tx.history.OverviewCoinDetailFragment$special$$inlined$activityViewModels$default$3
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
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.tx.history.OverviewCoinDetailFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.tx.history.OverviewCoinDetailFragment$special$$inlined$viewModels$default$2
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
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(gEV.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tx.history.OverviewCoinDetailFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tx.history.OverviewCoinDetailFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.tx.history.OverviewCoinDetailFragment$special$$inlined$viewModels$default$5
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C19503gEu.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tx.history.OverviewCoinDetailFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tx.history.OverviewCoinDetailFragment$special$$inlined$activityViewModels$default$5
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.tx.history.OverviewCoinDetailFragment$special$$inlined$activityViewModels$default$6
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
        this.AuCTel = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C19443gCo.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tx.history.OverviewCoinDetailFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tx.history.OverviewCoinDetailFragment$special$$inlined$activityViewModels$default$8
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.tx.history.OverviewCoinDetailFragment$special$$inlined$activityViewModels$default$9
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
        this.djBIcL = new C43316rmw();
        this.AYXKKw = C19422gBu.class.getName();
    }

    /* JADX INFO: renamed from: o.gBu$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gBu.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C19422gBu AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C19422gBu c19422gBu = new C19422gBu();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("metaId", str);
            bundle.putString("walletId", str2);
            bundle.putBoolean("showCoinInfo", z);
            bundle.putString("coinType", str3);
            c19422gBu.setArguments(bundle);
            return c19422gBu;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gFG gEmmrt() {
        return (gFG) this.fARcdN.getValue();
    }

    public final gEV OLrzqt() {
        return (gEV) this.values.getValue();
    }

    private final C19503gEu KWHzl() {
        return (C19503gEu) this.KWHzl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C19443gCo valueOf() {
        return (C19443gCo) this.AuCTel.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(view);
        Intrinsics.copydefault(viewDataBindingBind);
        AbstractC16581emd abstractC16581emd = (AbstractC16581emd) viewDataBindingBind;
        this.AkhnZx = abstractC16581emd;
        if (abstractC16581emd == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd = null;
        }
        ViewGroup.LayoutParams layoutParams = abstractC16581emd.KWHzl.getLayoutParams();
        CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            OKAppBarLayoutBehavior oKAppBarLayoutBehavior = new OKAppBarLayoutBehavior(null, null, 3, null);
            oKAppBarLayoutBehavior.setLimitId(C13754dXa.ActionBar.ZNPcth);
            layoutParams2.setBehavior(oKAppBarLayoutBehavior);
            AbstractC16581emd abstractC16581emd2 = this.AkhnZx;
            if (abstractC16581emd2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16581emd2 = null;
            }
            abstractC16581emd2.KWHzl.setLayoutParams(layoutParams2);
            AbstractC16581emd abstractC16581emd3 = this.AkhnZx;
            if (abstractC16581emd3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16581emd3 = null;
            }
            abstractC16581emd3.KWHzl.requestLayout();
        }
        AbstractC16581emd abstractC16581emd4 = this.AkhnZx;
        if (abstractC16581emd4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd4 = null;
        }
        abstractC16581emd4.KWHzl.setOnClickListener(null);
        AhwBna();
    }

    private final void AhwBna() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleKt.getCoroutineScope(getViewLifecycleOwner().getLifecycle()), null, null, new OverviewCoinDetailFragment$initObserver$1(this, null), 3, null);
        AbstractC16581emd abstractC16581emd = this.AkhnZx;
        if (abstractC16581emd == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd = null;
        }
        android.widget.TextView textView = abstractC16581emd.djBIcL;
        textView.setOnClickListener(new ActionBar(textView, 1000L, this));
        AbstractC16581emd abstractC16581emd2 = this.AkhnZx;
        if (abstractC16581emd2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd2 = null;
        }
        android.widget.ImageView imageView = abstractC16581emd2.copydefault;
        imageView.setOnClickListener(new TaskDescription(imageView, 1000L, this));
        BuildersKt__Builders_commonKt.launch$default(LifecycleKt.getCoroutineScope(getViewLifecycleOwner().getLifecycle()), null, null, new OverviewCoinDetailFragment$initObserver$4(this, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        if (context instanceof gBT) {
            this.DbNXlk = (gBT) context;
        }
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        if (!this.OLrzqt) {
            OLrzqt().KWHzl(new Function0() { // from class: o.gBy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C19422gBu.fARcdN(this.copydefault);
                }
            });
            this.OLrzqt = false;
        }
        copydefault();
        AEQbTJ();
        OLrzqt().ejfBZ();
    }

    public static final Unit fARcdN(C19422gBu c19422gBu) {
        c19422gBu.OLrzqt().valueOf();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.gBu$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C19422gBu copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C19422gBu c19422gBu) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = c19422gBu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                gBT gbt = this.copydefault.DbNXlk;
                if (gbt != null) {
                    gbt.AkhnZx();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.gBu$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C19422gBu OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C19422gBu c19422gBu) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c19422gBu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String strDjBIcL;
            C10854bwM c10854bwMAhwBna;
            C10854bwM c10854bwMKWHzl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.content.Context context = this.OLrzqt.getContext();
                if (context != null) {
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                    viewOnClickListenerC54939xaY.setTitle(context.getString(C13754dXa.FragmentManager.KDccX));
                    int i = C13754dXa.FragmentManager.onChildrenLoaded;
                    kotlin.Pair[] pairArr = new kotlin.Pair[1];
                    gEV gevOLrzqt = this.OLrzqt.OLrzqt();
                    if (gevOLrzqt == null || (c10854bwMAhwBna = gevOLrzqt.AhwBna()) == null || (c10854bwMKWHzl = c10854bwMAhwBna.KWHzl()) == null || (strDjBIcL = c10854bwMKWHzl.djBIcL()) == null) {
                        strDjBIcL = "";
                    }
                    pairArr[0] = C56390yDp.OLrzqt("chainName", strDjBIcL);
                    viewOnClickListenerC54939xaY.EZpvd(C33069mpW.KWHzl(context, i, C56424yEw.AYXKKw(pairArr)));
                    java.lang.String string = context.getString(C13754dXa.FragmentManager.DarRvM);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, string, (View.OnClickListener) null, 2, (java.lang.Object) null);
                    viewOnClickListenerC54939xaY.show();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.gBu$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C19422gBu EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C19422gBu c19422gBu) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = c19422gBu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                gBT gbt = this.EZpvd.DbNXlk;
                if (gbt != null) {
                    gbt.AkhnZx();
                }
            }
        }
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        EZpvd();
        OLrzqt().fIwbmz();
    }

    public final void AEQbTJ() {
        WalletTickerManager.CoinPrice value = OLrzqt().AYXKKw().getValue();
        if (value == null) {
            OLrzqt().AYXKKw().observe(this, new Fragment(new Function1() { // from class: o.gBF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19422gBu.OLrzqt(this.EZpvd, (WalletTickerManager.CoinPrice) obj);
                }
            }));
        } else {
            copydefault(this, value);
        }
    }

    public static final void copydefault(C19422gBu c19422gBu, WalletTickerManager.CoinPrice coinPrice) {
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(coinPrice.getCoinId()));
        if (c10854bwMKWHzl != null) {
            c19422gBu.KWHzl().KWHzl(c10854bwMKWHzl);
            c19422gBu.KWHzl().EZpvd(c10854bwMKWHzl.fetchVPNInfo(), c10854bwMKWHzl.OLrzqt());
            if (!c10854bwMKWHzl.getNewProxyInstance() || !c10854bwMKWHzl.giSNqX()) {
                c19422gBu.KWHzl().KWHzl(coinPrice);
            }
            c19422gBu.KWHzl().copydefault(c10854bwMKWHzl);
        }
    }

    public static final Unit OLrzqt(C19422gBu c19422gBu, WalletTickerManager.CoinPrice coinPrice) {
        if (coinPrice == null) {
            return Unit.INSTANCE;
        }
        copydefault(c19422gBu, coinPrice);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String string;
        android.os.Bundle arguments;
        java.lang.String string2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        this.OLrzqt = true;
        gEV gevOLrzqt = OLrzqt();
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("metaId")) == null || (arguments = getArguments()) == null || (string2 = arguments.getString("walletId")) == null) {
            return;
        }
        gevOLrzqt.KWHzl(string, string2);
        OLrzqt().valueOf();
        OLrzqt().AuCTel();
        AbstractC16581emd abstractC16581emd = this.AkhnZx;
        AbstractC16581emd abstractC16581emd2 = null;
        if (abstractC16581emd == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd = null;
        }
        abstractC16581emd.AkhnZx.setLayoutManager(new LinearLayoutManager(getContext()));
        AbstractC16581emd abstractC16581emd3 = this.AkhnZx;
        if (abstractC16581emd3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd3 = null;
        }
        abstractC16581emd3.AkhnZx.setItemViewCacheSize(10);
        AbstractC16581emd abstractC16581emd4 = this.AkhnZx;
        if (abstractC16581emd4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd4 = null;
        }
        abstractC16581emd4.AkhnZx.setAdapter(this.djBIcL);
        AbstractC16581emd abstractC16581emd5 = this.AkhnZx;
        if (abstractC16581emd5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd5 = null;
        }
        abstractC16581emd5.AkhnZx.addOnScrollListener(new StateListAnimator());
        C19398gAx c19398gAx = new C19398gAx(new Function2() { // from class: o.gBI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C19422gBu.OLrzqt(this.KWHzl, (C19419gBr) obj, ((java.lang.Integer) obj2).intValue());
            }
        });
        c19398gAx.OLrzqt(new Function0() { // from class: o.gBM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19422gBu.fIwbmz(this.OLrzqt);
            }
        });
        c19398gAx.AEQbTJ(new Function0() { // from class: o.gBP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19422gBu.fetchVPNInfo(this.OLrzqt);
            }
        });
        this.AEQbTJ = c19398gAx;
        BuildersKt__Builders_commonKt.launch$default(LifecycleKt.getCoroutineScope(getViewLifecycleOwner().getLifecycle()), null, null, new OverviewCoinDetailFragment$onViewCreated$4(this, null), 3, null);
        C43316rmw c43316rmw = this.djBIcL;
        C19398gAx c19398gAx2 = this.AEQbTJ;
        if (c19398gAx2 == null) {
            Intrinsics.gEmmrt("");
            c19398gAx2 = null;
        }
        c43316rmw.register(C19419gBr.class, c19398gAx2);
        this.ejfBZ = new PendingIntent();
        AbstractC16581emd abstractC16581emd6 = this.AkhnZx;
        if (abstractC16581emd6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd6 = null;
        }
        abstractC16581emd6.EZpvd.setOnSelectedListener(this.ejfBZ);
        AbstractC16581emd abstractC16581emd7 = this.AkhnZx;
        if (abstractC16581emd7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd7 = null;
        }
        abstractC16581emd7.OLrzqt.setOnAssetVisibilityToggled(new Function0() { // from class: o.gBO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19422gBu.fJNWhG(this.EZpvd);
            }
        });
        OLrzqt().values().observe(getViewLifecycleOwner(), new Fragment(new Function1() { // from class: o.gBz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19422gBu.AEQbTJ(this.KWHzl, (gBU) obj);
            }
        }));
        OLrzqt().AkhnZx().observe(getViewLifecycleOwner(), new Fragment(new Function1() { // from class: o.gBw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19422gBu.KWHzl(this.EZpvd, (java.util.List) obj);
            }
        }));
        AbstractC16581emd abstractC16581emd8 = this.AkhnZx;
        if (abstractC16581emd8 == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd8 = null;
        }
        C33546myW c33546myW = abstractC16581emd8.isConnected;
        c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.gBA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                C19422gBu.EZpvd(this.AEQbTJ, interfaceC57934yrl);
            }
        });
        int i = 0;
        c33546myW.AhwBna(false);
        AbstractC16581emd abstractC16581emd9 = this.AkhnZx;
        if (abstractC16581emd9 == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd9 = null;
        }
        android.widget.ImageView imageView = abstractC16581emd9.AYXKKw;
        if (OLrzqt().DbNXlk()) {
            AbstractC16581emd abstractC16581emd10 = this.AkhnZx;
            if (abstractC16581emd10 == null) {
                Intrinsics.gEmmrt("");
                abstractC16581emd10 = null;
            }
            android.widget.ImageView imageView2 = abstractC16581emd10.AYXKKw;
            imageView2.setOnClickListener(new Activity(imageView2, 1000L, this));
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        AbstractC16581emd abstractC16581emd11 = this.AkhnZx;
        if (abstractC16581emd11 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16581emd2 = abstractC16581emd11;
        }
        abstractC16581emd2.values.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
    }

    /* JADX INFO: renamed from: o.gBu$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.OnScrollListener {
        public StateListAnimator() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            gBU gbu;
            Intrinsics.checkNotNullParameter(recyclerView, "");
            C19422gBu.this.AhwBna = i != 0;
            if (C19422gBu.this.AhwBna || (gbu = C19422gBu.this.fetchVPNInfo) == null) {
                return;
            }
            C19422gBu c19422gBu = C19422gBu.this;
            c19422gBu.fetchVPNInfo = null;
            c19422gBu.OLrzqt(gbu);
        }
    }

    public static final Unit OLrzqt(C19422gBu c19422gBu, C19419gBr c19419gBr, int i) {
        Intrinsics.checkNotNullParameter(c19419gBr, "");
        Function1<? super C19419gBr, Unit> function1 = c19422gBu.isConnected;
        if (function1 != null) {
            function1.invoke(c19419gBr);
        }
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(C19422gBu c19422gBu) {
        androidx.fragment.app.FragmentManager childFragmentManager = c19422gBu.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        new C14461dlr(childFragmentManager, "completeAddress-overviewCoinDetail", null, null, null, false, 60, null).EZpvd();
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(C19422gBu c19422gBu) {
        java.lang.String strDjBIcL;
        C10854bwM c10854bwMAhwBna;
        C10854bwM c10854bwMKWHzl;
        android.content.Context context = c19422gBu.getContext();
        if (context != null) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.setTitle(context.getString(C13754dXa.FragmentManager.KDccX));
            int i = C13754dXa.FragmentManager.onChildrenLoaded;
            kotlin.Pair[] pairArr = new kotlin.Pair[1];
            gEV gevOLrzqt = c19422gBu.OLrzqt();
            if (gevOLrzqt == null || (c10854bwMAhwBna = gevOLrzqt.AhwBna()) == null || (c10854bwMKWHzl = c10854bwMAhwBna.KWHzl()) == null || (strDjBIcL = c10854bwMKWHzl.djBIcL()) == null) {
                strDjBIcL = "";
            }
            pairArr[0] = C56390yDp.OLrzqt("chainName", strDjBIcL);
            viewOnClickListenerC54939xaY.EZpvd(C33069mpW.KWHzl(context, i, C56424yEw.AYXKKw(pairArr)));
            java.lang.String string = context.getString(C13754dXa.FragmentManager.DarRvM);
            Intrinsics.checkNotNullExpressionValue(string, "");
            ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, string, (View.OnClickListener) null, 2, (java.lang.Object) null);
            viewOnClickListenerC54939xaY.show();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.gBu$PendingIntent */
    public static final class PendingIntent implements C57439yiT.Application {
        public PendingIntent() {
        }

        @Override // o.C57439yiT.Application
        public void KWHzl(int i, C57439yiT.StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            C19422gBu.this.gEmmrt = true;
            C19422gBu.this.fIwbmz = stateListAnimator;
            C19422gBu.this.AEQbTJ(stateListAnimator);
            C14724dqp.EZpvd.AEQbTJ(100L);
        }

        @Override // o.C57439yiT.Application
        public void EZpvd() {
            gBU value = C19422gBu.this.OLrzqt().values().getValue();
            if (value != null) {
                C19422gBu c19422gBu = C19422gBu.this;
                c19422gBu.gEmmrt = false;
                c19422gBu.fIwbmz = null;
                c19422gBu.copydefault(value);
                C14724dqp.EZpvd.AEQbTJ(100L);
            }
        }
    }

    public static final Unit fJNWhG(final C19422gBu c19422gBu) {
        C19398gAx c19398gAx = c19422gBu.AEQbTJ;
        AbstractC16581emd abstractC16581emd = null;
        if (c19398gAx == null) {
            Intrinsics.gEmmrt("");
            c19398gAx = null;
        }
        c19398gAx.KWHzl(C13912dbY.copydefault.djBIcL());
        gBU value = c19422gBu.OLrzqt().values().getValue();
        if (value != null) {
            if (!c19422gBu.gEmmrt) {
                AbstractC16581emd abstractC16581emd2 = c19422gBu.AkhnZx;
                if (abstractC16581emd2 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16581emd2 = null;
                }
                gBL gbl = abstractC16581emd2.OLrzqt;
                C13821dZn c13821dZn = C13821dZn.EZpvd;
                gbl.setCoinCount(c13821dZn.OLrzqt(value.KWHzl()), false);
                AbstractC16581emd abstractC16581emd3 = c19422gBu.AkhnZx;
                if (abstractC16581emd3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16581emd3 = null;
                }
                abstractC16581emd3.OLrzqt.setValuation(c13821dZn.OLrzqt(value.OLrzqt()));
                AbstractC16581emd abstractC16581emd4 = c19422gBu.AkhnZx;
                if (abstractC16581emd4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16581emd4 = null;
                }
                C57439yiT c57439yiT = abstractC16581emd4.EZpvd;
                java.util.List<C10331bmT> listFetchVPNInfo = c19422gBu.OLrzqt().fetchVPNInfo();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listFetchVPNInfo, 10));
                for (C10331bmT c10331bmT : listFetchVPNInfo) {
                    arrayList.add(new C57444yiY(c10331bmT.copydefault(), C33129mqd.AEQbTJ(c10331bmT.AEQbTJ()), C33129mqd.AEQbTJ(c10331bmT.KWHzl()), C33129mqd.AEQbTJ(c10331bmT.EZpvd()), c10331bmT.OLrzqt()));
                }
                c57439yiT.setData(arrayList, C13912dbY.copydefault.djBIcL() ? null : "*****", new Function1() { // from class: o.gBJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C19422gBu.EZpvd(((java.lang.Double) obj).doubleValue());
                    }
                });
            } else {
                c19422gBu.gEmmrt = false;
                c19422gBu.fIwbmz = null;
                AbstractC16581emd abstractC16581emd5 = c19422gBu.AkhnZx;
                if (abstractC16581emd5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16581emd5 = null;
                }
                gBL gbl2 = abstractC16581emd5.OLrzqt;
                C13821dZn c13821dZn2 = C13821dZn.EZpvd;
                gbl2.setCoinCount(c13821dZn2.OLrzqt(value.KWHzl()), false);
                AbstractC16581emd abstractC16581emd6 = c19422gBu.AkhnZx;
                if (abstractC16581emd6 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16581emd6 = null;
                }
                abstractC16581emd6.OLrzqt.setValuation(c13821dZn2.OLrzqt(value.OLrzqt()));
                AbstractC16581emd abstractC16581emd7 = c19422gBu.AkhnZx;
                if (abstractC16581emd7 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16581emd7 = null;
                }
                C57439yiT c57439yiT2 = abstractC16581emd7.EZpvd;
                java.util.List<C10331bmT> listFetchVPNInfo2 = c19422gBu.OLrzqt().fetchVPNInfo();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listFetchVPNInfo2, 10));
                for (C10331bmT c10331bmT2 : listFetchVPNInfo2) {
                    arrayList2.add(new C57444yiY(c10331bmT2.copydefault(), C33129mqd.AEQbTJ(c10331bmT2.AEQbTJ()), C33129mqd.AEQbTJ(c10331bmT2.KWHzl()), C33129mqd.AEQbTJ(c10331bmT2.EZpvd()), c10331bmT2.OLrzqt()));
                }
                c57439yiT2.setData(arrayList2, C13912dbY.copydefault.djBIcL() ? null : "*****", new Function1() { // from class: o.gBK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C19422gBu.djBIcL(((java.lang.Double) obj).doubleValue());
                    }
                });
            }
            AbstractC16581emd abstractC16581emd8 = c19422gBu.AkhnZx;
            if (abstractC16581emd8 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16581emd = abstractC16581emd8;
            }
            abstractC16581emd.AkhnZx.post(new java.lang.Runnable() { // from class: o.gBH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C19422gBu.AuCTel(this.AEQbTJ);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final java.lang.String EZpvd(double d) {
        return C54873xYm.formatPriceChangePercentage$default(C33129mqd.EZpvd(java.lang.Double.valueOf(d)), 0, 0, true, DisplaySign.AUTO, null, 19, null);
    }

    public static final java.lang.String djBIcL(double d) {
        return C54873xYm.formatPriceChangePercentage$default(C33129mqd.EZpvd(java.lang.Double.valueOf(d)), 0, 0, true, DisplaySign.AUTO, null, 19, null);
    }

    public static final void AuCTel(C19422gBu c19422gBu) {
        C43316rmw c43316rmw = c19422gBu.djBIcL;
        c43316rmw.notifyItemRangeChanged(0, c43316rmw.getItemCount());
    }

    public static final Unit AEQbTJ(C19422gBu c19422gBu, gBU gbu) {
        if (c19422gBu.AhwBna) {
            c19422gBu.fetchVPNInfo = gbu;
            return Unit.INSTANCE;
        }
        Intrinsics.copydefault(gbu);
        c19422gBu.OLrzqt(gbu);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c19422gBu, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C19422gBu c19422gBu, java.util.List list) {
        AbstractC16581emd abstractC16581emd = c19422gBu.AkhnZx;
        AbstractC16581emd abstractC16581emd2 = null;
        if (abstractC16581emd == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd = null;
        }
        abstractC16581emd.valueOf.setVisibility((list == null || list.isEmpty()) ? 8 : 0);
        AbstractC16581emd abstractC16581emd3 = c19422gBu.AkhnZx;
        if (abstractC16581emd3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16581emd2 = abstractC16581emd3;
        }
        C21321gxZ c21321gxZ = abstractC16581emd2.valueOf;
        androidx.fragment.app.FragmentManager childFragmentManager = c19422gBu.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c21321gxZ.copydefault(childFragmentManager, list);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(final C19422gBu c19422gBu, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c19422gBu.OLrzqt().KWHzl(new Function0() { // from class: o.gBx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19422gBu.ejfBZ(this.AEQbTJ);
            }
        });
    }

    public static final Unit ejfBZ(C19422gBu c19422gBu) {
        AbstractC16581emd abstractC16581emd = c19422gBu.AkhnZx;
        if (abstractC16581emd == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd = null;
        }
        abstractC16581emd.isConnected.AEQbTJ();
        c19422gBu.OLrzqt().valueOf();
        c19422gBu.OLrzqt().AuCTel();
        return Unit.INSTANCE;
    }

    public final void copydefault(gBU gbu) {
        AbstractC16581emd abstractC16581emd = this.AkhnZx;
        AbstractC16581emd abstractC16581emd2 = null;
        if (abstractC16581emd == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd = null;
        }
        gBL gbl = abstractC16581emd.OLrzqt;
        C13821dZn c13821dZn = C13821dZn.EZpvd;
        gBL.setCoinCount$default(gbl, c13821dZn.OLrzqt(gbu.KWHzl()), false, 2, null);
        AbstractC16581emd abstractC16581emd3 = this.AkhnZx;
        if (abstractC16581emd3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16581emd2 = abstractC16581emd3;
        }
        abstractC16581emd2.OLrzqt.setValuation(c13821dZn.OLrzqt(gbu.OLrzqt()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(C57439yiT.StateListAnimator stateListAnimator) {
        AbstractC16581emd abstractC16581emd = this.AkhnZx;
        AbstractC16581emd abstractC16581emd2 = null;
        if (abstractC16581emd == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd = null;
        }
        gBL gbl = abstractC16581emd.OLrzqt;
        C13821dZn c13821dZn = C13821dZn.EZpvd;
        java.util.Iterator<T> it = stateListAnimator.OLrzqt().iterator();
        double dCopydefault = AudioStats.AUDIO_AMPLITUDE_NONE;
        double dOLrzqt = 0.0d;
        while (it.hasNext()) {
            dOLrzqt += ((C57444yiY) it.next()).OLrzqt();
        }
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(java.lang.Double.valueOf(dOLrzqt));
        C57444yiY c57444yiY = (C57444yiY) CollectionsKt___CollectionsKt.firstOrNull(stateListAnimator.OLrzqt());
        gBL.setCoinCount$default(gbl, c13821dZn.OLrzqt(C54862xYb.convertToString$default(bigDecimalEZpvd, false, c57444yiY != null ? java.lang.Integer.valueOf(c57444yiY.EZpvd()) : null, null, 5, null)), false, 2, null);
        AbstractC16581emd abstractC16581emd3 = this.AkhnZx;
        if (abstractC16581emd3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16581emd2 = abstractC16581emd3;
        }
        gBL gbl2 = abstractC16581emd2.OLrzqt;
        C13821dZn c13821dZn2 = C13821dZn.EZpvd;
        java.util.Iterator<T> it2 = stateListAnimator.OLrzqt().iterator();
        while (it2.hasNext()) {
            dCopydefault += ((C57444yiY) it2.next()).copydefault();
        }
        gbl2.setValuation(c13821dZn2.OLrzqt(C54880xYt.formatValuationFromAsset$default(C54862xYb.convertToString$default(C33129mqd.EZpvd(java.lang.Double.valueOf(dCopydefault)), false, null, null, 7, null), null, false, 0, false, 15, null)));
    }

    /* JADX INFO: renamed from: o.gBu$LoaderManager */
    public static final class LoaderManager extends DiffUtil.Callback {
        public final /* synthetic */ java.util.List<C19419gBr> KWHzl;
        public final /* synthetic */ java.util.List<C19419gBr> copydefault;

        public LoaderManager(java.util.List<C19419gBr> list, java.util.List<C19419gBr> list2) {
            this.copydefault = list;
            this.KWHzl = list2;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getOldListSize() {
            return this.copydefault.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getNewListSize() {
            return this.KWHzl.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areItemsTheSame(int i, int i2) {
            C19419gBr c19419gBr = this.copydefault.get(i);
            C19419gBr c19419gBr2 = this.KWHzl.get(i2);
            return c19419gBr.KWHzl() == c19419gBr2.KWHzl() && c19419gBr.EZpvd() == c19419gBr2.EZpvd() && Intrinsics.EZpvd((java.lang.Object) c19419gBr.copydefault(), (java.lang.Object) c19419gBr2.copydefault());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areContentsTheSame(int i, int i2) {
            return Intrinsics.EZpvd(this.copydefault.get(i), this.KWHzl.get(i2));
        }
    }

    private final void AEQbTJ(java.util.List<C19419gBr> list) {
        try {
            java.util.List<?> items = this.djBIcL.getItems();
            Intrinsics.checkNotNullExpressionValue(items, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : items) {
                if (obj instanceof C19419gBr) {
                    arrayList.add(obj);
                }
            }
            DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new LoaderManager(arrayList, list));
            Intrinsics.checkNotNullExpressionValue(diffResultCalculateDiff, "");
            this.djBIcL.setItems(list);
            diffResultCalculateDiff.dispatchUpdatesTo(this.djBIcL);
        } catch (java.lang.Exception unused) {
            this.djBIcL.setItems(list);
            this.djBIcL.notifyDataSetChanged();
        }
    }

    public final void OLrzqt(gBU gbu) {
        AEQbTJ(gbu.copydefault());
        AbstractC16581emd abstractC16581emd = null;
        if (!this.gEmmrt) {
            AbstractC16581emd abstractC16581emd2 = this.AkhnZx;
            if (abstractC16581emd2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16581emd2 = null;
            }
            gBL gbl = abstractC16581emd2.OLrzqt;
            C13821dZn c13821dZn = C13821dZn.EZpvd;
            gbl.setCoinCount(c13821dZn.OLrzqt(gbu.KWHzl()), false);
            AbstractC16581emd abstractC16581emd3 = this.AkhnZx;
            if (abstractC16581emd3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16581emd3 = null;
            }
            abstractC16581emd3.OLrzqt.setValuation(c13821dZn.OLrzqt(gbu.OLrzqt()));
            AbstractC16581emd abstractC16581emd4 = this.AkhnZx;
            if (abstractC16581emd4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16581emd4 = null;
            }
            C57439yiT c57439yiT = abstractC16581emd4.EZpvd;
            java.util.List<C10331bmT> listFetchVPNInfo = OLrzqt().fetchVPNInfo();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listFetchVPNInfo, 10));
            for (C10331bmT c10331bmT : listFetchVPNInfo) {
                arrayList.add(new C57444yiY(c10331bmT.copydefault(), C33129mqd.AEQbTJ(c10331bmT.AEQbTJ()), C33129mqd.AEQbTJ(c10331bmT.KWHzl()), C33129mqd.AEQbTJ(c10331bmT.EZpvd()), c10331bmT.OLrzqt()));
            }
            c57439yiT.setData(arrayList, !C13912dbY.copydefault.djBIcL() ? "*****" : null, new Function1() { // from class: o.gBG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19422gBu.AEQbTJ(((java.lang.Double) obj).doubleValue());
                }
            });
        }
        AbstractC16581emd abstractC16581emd5 = this.AkhnZx;
        if (abstractC16581emd5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd5 = null;
        }
        if (abstractC16581emd5.EZpvd.getVisibility() == 0) {
            AbstractC16581emd abstractC16581emd6 = this.AkhnZx;
            if (abstractC16581emd6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16581emd6 = null;
            }
            abstractC16581emd6.fetchVPNInfo.setVisibility(0);
            AbstractC16581emd abstractC16581emd7 = this.AkhnZx;
            if (abstractC16581emd7 == null) {
                Intrinsics.gEmmrt("");
                abstractC16581emd7 = null;
            }
            abstractC16581emd7.DbNXlk.setVisibility(0);
            AbstractC16581emd abstractC16581emd8 = this.AkhnZx;
            if (abstractC16581emd8 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16581emd = abstractC16581emd8;
            }
            NestedScrollView nestedScrollView = abstractC16581emd.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
            C55296xhK.OLrzqt(nestedScrollView, java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f));
            return;
        }
        AbstractC16581emd abstractC16581emd9 = this.AkhnZx;
        if (abstractC16581emd9 == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd9 = null;
        }
        abstractC16581emd9.fetchVPNInfo.setVisibility(8);
        AbstractC16581emd abstractC16581emd10 = this.AkhnZx;
        if (abstractC16581emd10 == null) {
            Intrinsics.gEmmrt("");
            abstractC16581emd10 = null;
        }
        abstractC16581emd10.DbNXlk.setVisibility(8);
        AbstractC16581emd abstractC16581emd11 = this.AkhnZx;
        if (abstractC16581emd11 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16581emd = abstractC16581emd11;
        }
        NestedScrollView nestedScrollView2 = abstractC16581emd.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(nestedScrollView2, "");
        C55296xhK.OLrzqt(nestedScrollView2, java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(12.0f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f));
    }

    public static final java.lang.String AEQbTJ(double d) {
        return C54873xYm.formatPriceChangePercentage$default(C33129mqd.EZpvd(java.lang.Double.valueOf(d)), 0, 0, true, DisplaySign.AUTO, null, 19, null);
    }

    public final void copydefault() {
        AbstractC58260yxt abstractC58260yxtAEQbTJ = C58156yvv.AEQbTJ(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(OLrzqt().isConnected(), false), this, Lifecycle.Event.ON_DESTROY);
        final Function1 function1 = new Function1() { // from class: o.gBE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19422gBu.AEQbTJ(this.OLrzqt, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gBB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19422gBu.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gBC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19422gBu.copydefault((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gBD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19422gBu.OLrzqt(function12, obj);
            }
        });
        Intrinsics.copydefault(interfaceC58217yxCAEQbTJ);
        addDisposable(interfaceC58217yxCAEQbTJ);
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C19422gBu c19422gBu, AbstractC12782ctV abstractC12782ctV) {
        C10525bqB c10525bqBAEQbTJ;
        java.util.Map<java.lang.String, java.util.List<C10525bqB>> mapHrNTAI = abstractC12782ctV.hrNTAI();
        C10854bwM c10854bwMAhwBna = c19422gBu.OLrzqt().AhwBna();
        java.lang.Object obj = null;
        java.util.List<C10525bqB> listEZpvd = mapHrNTAI.get(c10854bwMAhwBna != null ? c10854bwMAhwBna.fJNWhG() : null);
        if (listEZpvd == null) {
            listEZpvd = yDY.AhwBna();
        }
        java.util.Iterator<T> it = listEZpvd.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            C10525bqB c10525bqB = (C10525bqB) next;
            C10854bwM c10854bwMAhwBna2 = c19422gBu.OLrzqt().AhwBna();
            if (c10854bwMAhwBna2 != null && c10525bqB.OLrzqt() == c10854bwMAhwBna2.AhwBna()) {
                obj = next;
                break;
            }
        }
        C10525bqB c10525bqB2 = (C10525bqB) obj;
        if ((listEZpvd.isEmpty() || c10525bqB2 == null) && (c10525bqBAEQbTJ = abstractC12782ctV.AEQbTJ(java.lang.Long.valueOf(C10953byF.KWHzl.EZpvd(c19422gBu.OLrzqt().gEmmrt())))) != null) {
            listEZpvd = C56402yEa.EZpvd(c10525bqBAEQbTJ);
        }
        c19422gBu.EZpvd();
        java.lang.String str = c19422gBu.AYXKKw;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        java.util.Iterator<T> it2 = listEZpvd.iterator();
        while (it2.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(((C10525bqB) it2.next()).OLrzqt()));
        }
        c19422gBu.copydefault = c19422gBu.new Dialog(str, arrayList);
        WalletCoinAssetSubManager walletCoinAssetSubManagerZLjUOn = C11205cFp.EZpvd.zLjUOn();
        WalletCoinAssetSubManager.TaskDescription taskDescription = c19422gBu.copydefault;
        Intrinsics.copydefault(taskDescription);
        walletCoinAssetSubManagerZLjUOn.AEQbTJ(taskDescription);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.gBu$Dialog */
    public static final class Dialog extends WalletCoinAssetSubManager.TaskDescription {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(java.lang.String str, java.util.List<java.lang.Long> list) {
            super(str, null, list, false, 10, null);
            Intrinsics.copydefault((java.lang.Object) str);
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(java.util.List<WalletCoinAssetSubManager.SubResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            C19422gBu.this.OLrzqt().valueOf();
            C19422gBu.this.OLrzqt().AuCTel();
        }
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        WalletCoinAssetSubManager.TaskDescription taskDescription = this.copydefault;
        if (taskDescription != null) {
            C11205cFp.EZpvd.zLjUOn().OLrzqt(taskDescription);
        }
    }
}
