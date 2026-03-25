package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.market.data.model.watchlist.FavoriteAction;
import com.okinc.business.market.features.group.domain.CommonGroupData;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import com.okinc.business.market.widget.home_filter.HomeChainFilterUiModel;
import com.okinc.business.trade.features.home.domain.model.TradingBizType;
import com.okinc.business.trade.features.home.tokenlist.ui.TokenListContentFragment$addListener$1;
import com.okinc.business.trade.features.home.tokenlist.ui.TokenListContentFragment$addListener$2;
import com.okinc.business.trade.features.home.tokenlist.ui.TokenListContentFragment$handleFavoriteStatusResult$1;
import com.okinc.business.trade.features.home.tokenlist.ui.TokenListContentFragment$setListener$1;
import com.okinc.business.trade.features.home.tokenlist.ui.TokenListContentFragment$subscribeToken$1;
import com.okinc.business.trade.features.home.tokenlist.ui.TokenListContentFragment$toggleCollection$1;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C22366hdx;
import o.InterfaceC28386kZm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kZJ extends AbstractC31214lpm implements kCQ {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public Function1<? super DexMultiTokenInfoBean, Unit> AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public C22318hdB EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.kZO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return kZJ.isConnected(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm djBIcL;

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
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

    public kZJ() {
        final Function0 function0 = new Function0() { // from class: o.kZR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kZJ.values(this.EZpvd);
            }
        };
        Function0 function02 = new Function0() { // from class: o.kZU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kZJ.djBIcL();
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.tokenlist.ui.TokenListContentFragment$special$$inlined$viewModels$default$1
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
        final Function0 function03 = null;
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C30384laD.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.tokenlist.ui.TokenListContentFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.tokenlist.ui.TokenListContentFragment$special$$inlined$viewModels$default$3
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
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function02);
        Function0 function04 = new Function0() { // from class: o.kZS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kZJ.AkhnZx();
            }
        };
        final Function0<androidx.fragment.app.Fragment> function05 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.trade.features.home.tokenlist.ui.TokenListContentFragment$special$$inlined$viewModels$default$5
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.tokenlist.ui.TokenListContentFragment$special$$inlined$viewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function05.invoke();
            }
        });
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C30429law.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.tokenlist.ui.TokenListContentFragment$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.tokenlist.ui.TokenListContentFragment$special$$inlined$viewModels$default$8
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
                Function0 function06 = function03;
                if (function06 != null && (creationExtras = (CreationExtras) function06.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function04);
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.kZT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kZJ.AYXKKw();
            }
        });
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kZJ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final kZJ KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull java.lang.String str3, java.lang.String str4, @NotNull Function1<? super DexMultiTokenInfoBean, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(function1, "");
            kZJ kzj = new kZJ();
            kzj.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("chain_id", str), C56390yDp.OLrzqt("extra_universal_1", str2), C56390yDp.OLrzqt("extra_universal_2", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("extra_universal_3", str4), C56390yDp.OLrzqt("from_token_address", str3)));
            kzj.AEQbTJ = function1;
            return kzj;
        }
    }

    public final kZH AhwBna() {
        return (kZH) this.copydefault.getValue();
    }

    public static final kZH isConnected(kZJ kzj) {
        androidx.fragment.app.FragmentManager childFragmentManager = kzj.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        return new kZH(childFragmentManager);
    }

    public final C30384laD valueOf() {
        return (C30384laD) this.AhwBna.getValue();
    }

    public static final ViewModelStoreOwner values(kZJ kzj) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = kzj.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    public static final ViewModelProvider.Factory djBIcL() {
        return new C30382laB();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory AkhnZx() {
        return new C30382laB();
    }

    public final C30429law values() {
        return (C30429law) this.djBIcL.getValue();
    }

    public final kCM gEmmrt() {
        return (kCM) this.KWHzl.getValue();
    }

    public static final kCM AYXKKw() {
        return new kCM();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("chain_id") : null;
        java.lang.String str = string == null ? "" : string;
        android.os.Bundle arguments2 = getArguments();
        java.lang.String string2 = arguments2 != null ? arguments2.getString("extra_universal_1") : null;
        java.lang.String str2 = string2 == null ? "" : string2;
        android.os.Bundle arguments3 = getArguments();
        boolean z = arguments3 != null ? arguments3.getBoolean("extra_universal_2") : true;
        android.os.Bundle arguments4 = getArguments();
        java.lang.String string3 = arguments4 != null ? arguments4.getString("extra_universal_3") : null;
        android.os.Bundle arguments5 = getArguments();
        java.lang.String string4 = arguments5 != null ? arguments5.getString("from_token_address") : null;
        values().KWHzl(valueOf().OLrzqt(), valueOf().AEQbTJ(), str, str2, z, string4 == null ? "" : string4, string3);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C22318hdB c22318hdBEZpvd = C22318hdB.EZpvd(layoutInflater, viewGroup, false);
        this.EZpvd = c22318hdBEZpvd;
        if (c22318hdBEZpvd != null) {
            return c22318hdBEZpvd.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC31214lpm
    public void OLrzqt() {
        AppCompatTextView appCompatTextView;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C22318hdB c22318hdB = this.EZpvd;
        if (c22318hdB != null && (recyclerView2 = c22318hdB.AEQbTJ) != null) {
            recyclerView2.setLayoutManager(C33047mpA.KWHzl(requireContext()));
        }
        C22318hdB c22318hdB2 = this.EZpvd;
        if (c22318hdB2 != null && (recyclerView = c22318hdB2.AEQbTJ) != null) {
            recyclerView.setAdapter(AhwBna());
        }
        C22318hdB c22318hdB3 = this.EZpvd;
        if (c22318hdB3 != null && (appCompatTextView = c22318hdB3.djBIcL) != null) {
            appCompatTextView.setText(C33070mpX.AYXKKw(C22366hdx.StateListAnimator.QKVWgx));
        }
        AhwBna().KWHzl();
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        kLP klp;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TokenListContentFragment$setListener$1(this, null), 3, null);
        AhwBna().KWHzl(new Function1() { // from class: o.kZP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kZJ.AEQbTJ(this.OLrzqt, (DexMultiTokenInfoBean) obj);
            }
        });
        AhwBna().EZpvd(new Function1() { // from class: o.kZQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kZJ.gEmmrt(this.EZpvd, (DexMultiTokenInfoBean) obj);
            }
        });
        AhwBna().EZpvd(new Function0() { // from class: o.kZN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kZJ.DbNXlk(this.OLrzqt);
            }
        });
        C22318hdB c22318hdB = this.EZpvd;
        if (c22318hdB != null && (klp = c22318hdB.KWHzl) != null) {
            klp.setCallback(new ActionBar());
        }
        valueOf().copydefault().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.kZM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kZJ.AEQbTJ(this.copydefault, (kotlin.Pair) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(final kZJ kzj, final DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        if (kzj.KWHzl(dexMultiTokenInfoBean)) {
            kzj.AEQbTJ(dexMultiTokenInfoBean, new Function0() { // from class: o.kZV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return kZJ.OLrzqt(this.EZpvd, dexMultiTokenInfoBean);
                }
            });
        } else {
            kzj.OLrzqt(dexMultiTokenInfoBean);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(kZJ kzj, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        kzj.OLrzqt(dexMultiTokenInfoBean);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(kZJ kzj, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        C25352ivB.startVibrator$default(0L, 1, null);
        kzj.EZpvd(dexMultiTokenInfoBean);
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(kZJ kzj) {
        kzj.values().gEmmrt();
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements kLR {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.kLR
        public void AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
        }

        public ActionBar() {
        }

        @Override // o.kLR
        public void copydefault(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            kZJ.this.values().copydefault(str);
        }
    }

    public static final Unit AEQbTJ(kZJ kzj, kotlin.Pair pair) {
        kzj.values().copydefault((DexMultiTokenInfoBean) pair.getFirst());
        return Unit.INSTANCE;
    }

    public final void EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TokenListContentFragment$toggleCollection$1(dexMultiTokenInfoBean, this, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.kZJ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleFavoriteStatusResult$default(kZJ kzj, FavoriteAction favoriteAction, java.util.List list, java.util.List list2, java.util.List list3, DexMultiTokenInfoBean dexMultiTokenInfoBean, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            list2 = yDY.AhwBna();
        }
        java.util.List list4 = list2;
        if ((i & 8) != 0) {
            list3 = yDY.AhwBna();
        }
        kzj.copydefault(favoriteAction, list, list4, list3, dexMultiTokenInfoBean);
    }

    public final void copydefault(FavoriteAction favoriteAction, java.util.List<HomeToken> list, java.util.List<java.lang.Integer> list2, java.util.List<java.lang.Integer> list3, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TokenListContentFragment$handleFavoriteStatusResult$1(this, favoriteAction, list, list2, list3, dexMultiTokenInfoBean, null), 3, null);
    }

    @Override // o.kCQ
    public void AEQbTJ(@NotNull java.util.List<HomeToken> list, @NotNull kotlin.Pair<? extends java.util.List<java.lang.Integer>, ? extends java.util.List<java.lang.Integer>> pair) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(pair, "");
        java.util.List<java.lang.Integer> listComponent1 = pair.component1();
        java.util.List<java.lang.Integer> listComponent2 = pair.component2();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOLrzqt = values().OLrzqt();
        if (dexMultiTokenInfoBeanOLrzqt != null) {
            copydefault(FavoriteAction.UpdateWatchList, list, listComponent1, listComponent2, dexMultiTokenInfoBeanOLrzqt);
        }
    }

    public final void KWHzl(java.util.List<CommonGroupData> list) {
        kLP klp;
        C22318hdB c22318hdB = this.EZpvd;
        if (c22318hdB == null || (klp = c22318hdB.KWHzl) == null) {
            return;
        }
        klp.setVisibility(list.isEmpty() ^ true ? 0 : 8);
        klp.OLrzqt(false);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (CommonGroupData commonGroupData : list) {
            arrayList.add(new HomeChainFilterUiModel(C33129mqd.gEmmrt(java.lang.Integer.valueOf(commonGroupData.OLrzqt())), C25352ivB.copydefault(commonGroupData.AEQbTJ(), 14), null, 4, null));
        }
        klp.setQuickPickOptions(arrayList);
        HomeChainFilterUiModel homeChainFilterUiModel = (HomeChainFilterUiModel) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (homeChainFilterUiModel != null) {
            kLP.setSelection$default(klp, homeChainFilterUiModel, 0, 1, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void isConnected() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TokenListContentFragment$addListener$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TokenListContentFragment$addListener$2(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(boolean z) {
        RecyclerView recyclerView;
        C55113xdn c55113xdn;
        C22318hdB c22318hdB = this.EZpvd;
        if (c22318hdB != null && (c55113xdn = c22318hdB.OLrzqt) != null) {
            c55113xdn.setVisibility(z ? 0 : 8);
        }
        C22318hdB c22318hdB2 = this.EZpvd;
        if (c22318hdB2 == null || (recyclerView = c22318hdB2.AEQbTJ) == null) {
            return;
        }
        recyclerView.setVisibility(z ? 4 : 0);
    }

    public final void fetchVPNInfo() {
        kLP klp;
        kLP klp2;
        kLP klp3;
        int i = 8;
        if (!values().valueOf()) {
            C22318hdB c22318hdB = this.EZpvd;
            if (c22318hdB == null || (klp3 = c22318hdB.KWHzl) == null) {
                return;
            }
            klp3.setVisibility(8);
            return;
        }
        if (valueOf().EZpvd().getValue().length() > 0) {
            C22318hdB c22318hdB2 = this.EZpvd;
            if (c22318hdB2 == null || (klp2 = c22318hdB2.KWHzl) == null) {
                return;
            }
            klp2.setVisibility(8);
            return;
        }
        C22318hdB c22318hdB3 = this.EZpvd;
        if (c22318hdB3 == null || (klp = c22318hdB3.KWHzl) == null) {
            return;
        }
        if (c22318hdB3 != null && klp != null && klp.EZpvd()) {
            i = 0;
        }
        klp.setVisibility(i);
    }

    public final void DbNXlk() {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        boolean z = values().AEQbTJ().getValue() instanceof InterfaceC28386kZm.Application;
        C22318hdB c22318hdB = this.EZpvd;
        if (c22318hdB != null && (appCompatTextView2 = c22318hdB.EZpvd) != null) {
            appCompatTextView2.setVisibility(z ? 0 : 8);
        }
        C22318hdB c22318hdB2 = this.EZpvd;
        if (c22318hdB2 == null || (appCompatTextView = c22318hdB2.djBIcL) == null) {
            return;
        }
        appCompatTextView.setVisibility(z ? 0 : 8);
    }

    public final boolean KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        TradingBizType tradingBizTypeOLrzqt = valueOf().OLrzqt();
        TradingBizType tradingBizType = TradingBizType.Bridge;
        return (tradingBizTypeOLrzqt != tradingBizType && dexMultiTokenInfoBean.isNonPlatformCoin()) || (valueOf().OLrzqt() == tradingBizType && dexMultiTokenInfoBean.isThirdPartyToken());
    }

    public final void AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean, Function0<Unit> function0) {
        C24346icB.Companion.AEQbTJ(dexMultiTokenInfoBean, function0).show(getParentFragmentManager(), "javaClass");
    }

    public final void OLrzqt(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TokenListContentFragment$subscribeToken$1(this, dexMultiTokenInfoBean, null), 3, null);
    }

    @Override // o.AbstractC31214lpm
    public void bc_() {
        values().djBIcL();
    }
}
