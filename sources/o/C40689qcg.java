package o;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.tabs.TabLayout;
import com.okinc.market.discover.features.markets.MarketsSubPage;
import com.okinc.market.discover.features.markets.sub.favorites.delegate.DefaultMarketFavoritesSelectionDelegate$setFavoritesSelectionListeners$2$2;
import com.okinc.market.discover.features.markets.sub.favorites.delegate.DefaultMarketFavoritesSelectionDelegate$updateMenuIconIfFavorites$3;
import com.okinc.market.discover.features.markets.sub.favorites.viewmodel.MarketsFavoritesGroupViewModel;
import com.okinc.market.watch.data.UserGroup;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C40694qcl;
import o.C52761wXj;
import o.jSB;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qcg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40689qcg {
    public C55244xgL AEQbTJ;
    public androidx.fragment.app.Fragment EZpvd;
    public android.content.Context KWHzl;
    public final java.lang.String OLrzqt = "DefaultMarketFavoritesSelectionDelegate";
    public Function0<MarketsFavoritesGroupViewModel> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd() {
        this.EZpvd = null;
        this.KWHzl = null;
        this.copydefault = null;
    }

    public final MarketsFavoritesGroupViewModel OLrzqt() {
        Function0<MarketsFavoritesGroupViewModel> function0 = this.copydefault;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    public void copydefault(@NotNull final androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.EZpvd = fragment;
        this.KWHzl = fragment.getContext();
        this.copydefault = new Function0() { // from class: o.qco
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C40689qcg.AEQbTJ(fragment);
            }
        };
    }

    /* JADX INFO: renamed from: o.qcg$Application */
    public static final class Application implements TabLayout.OnTabSelectedListener {
        public Application() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                C40689qcg.this.AEQbTJ(tab, true);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            if (tab != null) {
                C40689qcg.this.AEQbTJ(tab, false);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            if (tab != null) {
                C40689qcg.this.OLrzqt(tab);
            }
        }
    }

    public void KWHzl(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull C55244xgL c55244xgL) {
        Lifecycle lifecycle;
        Intrinsics.checkNotNullParameter(interfaceC49363unD, "");
        Intrinsics.checkNotNullParameter(c55244xgL, "");
        this.AEQbTJ = c55244xgL;
        if (c55244xgL != null) {
            c55244xgL.copydefault(new Application());
        }
        MarketsFavoritesGroupViewModel marketsFavoritesGroupViewModelOLrzqt = OLrzqt();
        if (marketsFavoritesGroupViewModelOLrzqt != null) {
            interfaceC49363unD.collectLatestOnLifecycle(marketsFavoritesGroupViewModelOLrzqt, new MutablePropertyReference1Impl() { // from class: com.okinc.market.discover.features.markets.sub.favorites.delegate.DefaultMarketFavoritesSelectionDelegate$setFavoritesSelectionListeners$2$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj) {
                    return ((MarketsFavoritesGroupViewModel.StateListAnimator) obj).AEQbTJ();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj, Object obj2) {
                    ((MarketsFavoritesGroupViewModel.StateListAnimator) obj).copydefault((UserGroup) obj2);
                }
            }, Lifecycle.State.RESUMED, new DefaultMarketFavoritesSelectionDelegate$setFavoritesSelectionListeners$2$2(this));
        }
        jSB.Application application = jSB.Companion;
        androidx.fragment.app.Fragment fragment = this.EZpvd;
        if (fragment == null || (lifecycle = fragment.getLifecycle()) == null) {
            return;
        }
        application.EZpvd(lifecycle, new Function1() { // from class: o.qcn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40689qcg.EZpvd(this.copydefault, (jSB) obj);
            }
        });
        AEQbTJ();
    }

    public static final /* synthetic */ java.lang.Object OLrzqt(C40689qcg c40689qcg, UserGroup userGroup, Continuation continuation) {
        c40689qcg.KWHzl(userGroup);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C40689qcg c40689qcg, jSB jsb) {
        MarketsFavoritesGroupViewModel marketsFavoritesGroupViewModelOLrzqt;
        Intrinsics.checkNotNullParameter(jsb, "");
        C41298qoF.AEQbTJ.EZpvd(c40689qcg.OLrzqt, "FavoritesEditingChangedEvent: " + jsb);
        if ((jsb instanceof jSB.FragmentManager) && (marketsFavoritesGroupViewModelOLrzqt = c40689qcg.OLrzqt()) != null) {
            marketsFavoritesGroupViewModelOLrzqt.OLrzqt(((jSB.FragmentManager) jsb).AEQbTJ());
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(UserGroup userGroup) {
        java.lang.String strAYXKKw;
        android.widget.TextView textViewEZpvd;
        C41298qoF.AEQbTJ.EZpvd(this.OLrzqt, "update current favorites group [currentFavoritesGroup: " + userGroup + "]");
        TabLayout.Tab tabKWHzl = KWHzl();
        if (tabKWHzl == null) {
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) (userGroup != null ? userGroup.getGroupName() : null), (java.lang.Object) "ALL") || userGroup == null) {
            strAYXKKw = C33070mpX.AYXKKw(MarketsSubPage.FAVORITES.getTitleResId());
        } else {
            strAYXKKw = KWHzl(userGroup.getTranslatedGroupName());
        }
        android.view.View customView = tabKWHzl.getCustomView();
        C54989xbV c54989xbV = customView instanceof C54989xbV ? (C54989xbV) customView : null;
        if (c54989xbV != null && (textViewEZpvd = c54989xbV.EZpvd()) != null) {
            textViewEZpvd.setText(strAYXKKw);
        }
        tabKWHzl.setText(strAYXKKw);
        AEQbTJ(tabKWHzl, tabKWHzl.isSelected());
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(C55298xhM.sp2pxFloat$default(14.0f, null, 1, null));
        paint.setAntiAlias(true);
        float fDp2pxFloat$default = C55298xhM.dp2pxFloat$default(100.0f, null, 1, null);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            float fMeasureText = paint.measureText(java.lang.String.valueOf(str.charAt(i2)));
            if (!C33129mqd.copydefault(java.lang.Float.valueOf(fDp2pxFloat$default), java.lang.Float.valueOf(fMeasureText))) {
                break;
            }
            fDp2pxFloat$default -= fMeasureText;
            i++;
        }
        return C59454zhO.AkhnZx(str, i) + (C33129mqd.OLrzqt(java.lang.Integer.valueOf(str.length()), java.lang.Integer.valueOf(i)) ? "" : "...");
    }

    public final boolean EZpvd(TabLayout.Tab tab) {
        return tab.getPosition() == 0;
    }

    public final TabLayout.Tab KWHzl() {
        C55244xgL c55244xgL;
        androidx.fragment.app.Fragment fragment = this.EZpvd;
        if (fragment == null || !fragment.isAdded() || (c55244xgL = this.AEQbTJ) == null) {
            return null;
        }
        int iAhwBna = c55244xgL.AhwBna();
        for (int i = 0; i < iAhwBna; i++) {
            TabLayout.Tab tabKWHzl = c55244xgL.KWHzl(i);
            if (tabKWHzl != null && EZpvd(tabKWHzl)) {
                return tabKWHzl;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(TabLayout.Tab tab, boolean z) {
        LifecycleCoroutineScope lifecycleScope;
        java.lang.CharSequence text;
        if (EZpvd(tab)) {
            android.view.View customView = tab.getCustomView();
            C54989xbV c54989xbV = customView instanceof C54989xbV ? (C54989xbV) customView : null;
            if (c54989xbV == null) {
                return;
            }
            android.widget.ImageView imageViewAEQbTJ = c54989xbV.AEQbTJ();
            android.widget.TextView textViewEZpvd = c54989xbV.EZpvd();
            android.widget.ImageView imageViewOLrzqt = c54989xbV.OLrzqt();
            if (Intrinsics.EZpvd((java.lang.Object) textViewEZpvd.getText(), (java.lang.Object) C33070mpX.AYXKKw(MarketsSubPage.FAVORITES.getTitleResId())) || tab.getText() == null || ((text = tab.getText()) != null && text.length() == 0)) {
                imageViewAEQbTJ.setVisibility(8);
                imageViewAEQbTJ.setImageDrawable(null);
                ViewGroup.LayoutParams layoutParams = textViewEZpvd.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    layoutParams2.setMarginStart(0);
                    textViewEZpvd.setLayoutParams(layoutParams2);
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            } else {
                imageViewAEQbTJ.setVisibility(0);
                imageViewAEQbTJ.setImageResource(z ? qZH.Activity.zLjUOn : qZH.Activity.AubY);
                ViewGroup.LayoutParams layoutParams3 = textViewEZpvd.getLayoutParams();
                if (layoutParams3 != null) {
                    ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                    android.content.Context context = textViewEZpvd.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    layoutParams4.setMarginStart(C55298xhM.KWHzl(4.0f, context));
                    textViewEZpvd.setLayoutParams(layoutParams4);
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            }
            androidx.fragment.app.Fragment fragment = this.EZpvd;
            if (fragment == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment)) == null) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new DefaultMarketFavoritesSelectionDelegate$updateMenuIconIfFavorites$3(imageViewOLrzqt, z, this, null), 3, null);
        }
    }

    public final void OLrzqt(final TabLayout.Tab tab) {
        androidx.fragment.app.Fragment fragment = this.EZpvd;
        if (fragment != null && EZpvd(tab)) {
            InterfaceC38466pZv interfaceC38466pZvCopydefault = C38470pZz.copydefault(fragment);
            if (interfaceC38466pZvCopydefault != null) {
                interfaceC38466pZvCopydefault.AEQbTJ();
            }
            android.widget.ImageView imageViewEZpvd = C55243xgK.EZpvd(tab);
            if (imageViewEZpvd != null) {
                imageViewEZpvd.setImageResource(C52761wXj.TaskDescription.dUDNAs);
            }
            C40694qcl.Application application = C40694qcl.Companion;
            androidx.fragment.app.FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            application.KWHzl(childFragmentManager, new Function0() { // from class: o.qci
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C40689qcg.KWHzl(tab);
                }
            });
        }
    }

    public static final Unit KWHzl(TabLayout.Tab tab) {
        android.widget.ImageView imageViewEZpvd = C55243xgK.EZpvd(tab);
        if (imageViewEZpvd != null) {
            imageViewEZpvd.setImageResource(C52761wXj.TaskDescription.QSLkRj);
        }
        return Unit.INSTANCE;
    }

    public void AEQbTJ() {
        MarketsFavoritesGroupViewModel marketsFavoritesGroupViewModelOLrzqt = OLrzqt();
        if (marketsFavoritesGroupViewModelOLrzqt != null) {
            marketsFavoritesGroupViewModelOLrzqt.AEQbTJ("favorites_selection_init");
        }
    }

    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        MarketsFavoritesGroupViewModel marketsFavoritesGroupViewModelOLrzqt = OLrzqt();
        if (marketsFavoritesGroupViewModelOLrzqt != null) {
            marketsFavoritesGroupViewModelOLrzqt.OLrzqt(str);
        }
    }

    public static final MarketsFavoritesGroupViewModel AEQbTJ(final androidx.fragment.app.Fragment fragment) {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.market.discover.features.markets.sub.favorites.delegate.DefaultMarketFavoritesSelectionDelegate$attachFavoritesSelectionContext$lambda$0$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return fragment;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.discover.features.markets.sub.favorites.delegate.DefaultMarketFavoritesSelectionDelegate$attachFavoritesSelectionContext$lambda$0$$inlined$viewModels$default$2
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
        return (MarketsFavoritesGroupViewModel) FragmentViewModelLazyKt.createViewModelLazy(fragment, C56524yIo.AEQbTJ(MarketsFavoritesGroupViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.discover.features.markets.sub.favorites.delegate.DefaultMarketFavoritesSelectionDelegate$attachFavoritesSelectionContext$lambda$0$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.discover.features.markets.sub.favorites.delegate.DefaultMarketFavoritesSelectionDelegate$attachFavoritesSelectionContext$lambda$0$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.discover.features.markets.sub.favorites.delegate.DefaultMarketFavoritesSelectionDelegate$attachFavoritesSelectionContext$lambda$0$$inlined$viewModels$default$5
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
                    defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }).getValue();
    }
}
