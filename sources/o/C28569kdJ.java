package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.business.market.features.meme.ui.MemeActivityViewModelV2;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC28637keY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kdJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28569kdJ extends AbstractC28606kdu<C23426hxx> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int valueOf = 8;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm values = C31200lpY.copydefault(this);
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.kdI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C28569kdJ.valueOf(this.OLrzqt);
        }
    });
    public boolean djBIcL = true;

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C23426hxx OLrzqt(C28569kdJ c28569kdJ) {
        return (C23426hxx) c28569kdJ.aX_();
    }

    public C28569kdJ() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.meme.MemeListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.meme.MemeListFragment$special$$inlined$viewModels$default$2
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MemeActivityViewModelV2.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.meme.MemeListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.meme.MemeListFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.meme.MemeListFragment$special$$inlined$viewModels$default$5
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

    /* JADX INFO: renamed from: o.kdJ$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kdJ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C28569kdJ KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C28569kdJ c28569kdJ = new C28569kdJ();
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, str);
            c28569kdJ.setArguments(bundle);
            return c28569kdJ;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C23426hxx KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C23426hxx c23426hxxAEQbTJ = C23426hxx.AEQbTJ(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c23426hxxAEQbTJ, "");
        return c23426hxxAEQbTJ;
    }

    private final java.lang.String isConnected() {
        return (java.lang.String) this.values.getValue();
    }

    public final C28910kjg AhwBna() {
        return (C28910kjg) this.AYXKKw.getValue();
    }

    public static final C28910kjg valueOf(C28569kdJ c28569kdJ) {
        return new C28910kjg(c28569kdJ, c28569kdJ.isConnected());
    }

    public final MemeActivityViewModelV2 djBIcL() {
        return (MemeActivityViewModelV2) this.AhwBna.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull C23426hxx c23426hxx, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(c23426hxx, "");
        MemeActivityViewModelV2.firstLoad$default(djBIcL(), false, 1, null);
        AkhnZx();
        DbNXlk();
        gEmmrt();
    }

    /* JADX INFO: renamed from: o.kdJ$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC28637keY interfaceC28637keY, Continuation<? super Unit> continuation) {
            C28696kfe c28696kfe;
            android.view.View customView;
            android.widget.TextView textView;
            ConstraintLayout root;
            android.content.Context context;
            android.view.View customView2;
            android.widget.TextView textView2;
            android.view.View customView3;
            android.widget.ImageView imageView;
            C55254xgV c55254xgV;
            C23426hxx c23426hxxOLrzqt = C28569kdJ.OLrzqt(C28569kdJ.this);
            if (c23426hxxOLrzqt != null) {
                C55113xdn c55113xdn = c23426hxxOLrzqt.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                C55173xeu c55173xeu = c23426hxxOLrzqt.EZpvd;
                Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                C28577kdR.AEQbTJ(interfaceC28637keY, c55113xdn, c55173xeu, (java.util.List<? extends android.view.View>) yDY.gEmmrt(c23426hxxOLrzqt.copydefault, c23426hxxOLrzqt.AYXKKw));
            }
            if (!Intrinsics.EZpvd(interfaceC28637keY, InterfaceC28637keY.TaskDescription.KWHzl) && !(interfaceC28637keY instanceof InterfaceC28637keY.StateListAnimator)) {
                if (!(interfaceC28637keY instanceof InterfaceC28637keY.Activity)) {
                    throw new NoWhenBranchMatchedException();
                }
                java.util.List<C28696kfe> listEZpvd = ((InterfaceC28637keY.Activity) interfaceC28637keY).EZpvd();
                C28569kdJ c28569kdJ = C28569kdJ.this;
                java.util.Iterator<T> it = listEZpvd.iterator();
                int i = 0;
                while (true) {
                    TabLayout.Tab tabCopydefault = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    C28696kfe c28696kfe2 = (C28696kfe) next;
                    C23426hxx c23426hxxOLrzqt2 = C28569kdJ.OLrzqt(c28569kdJ);
                    if (c23426hxxOLrzqt2 != null && (c55254xgV = c23426hxxOLrzqt2.copydefault) != null) {
                        tabCopydefault = c55254xgV.copydefault(i);
                    }
                    if (tabCopydefault != null && (customView3 = tabCopydefault.getCustomView()) != null && (imageView = (android.widget.ImageView) customView3.findViewById(C23274hvD.Application.onSearchResult)) != null) {
                        imageView.setVisibility(c28696kfe2.OLrzqt() ? 0 : 8);
                    }
                    if (tabCopydefault != null && (customView2 = tabCopydefault.getCustomView()) != null && (textView2 = (android.widget.TextView) customView2.findViewById(C23274hvD.Application.getChangingConfigurations)) != null) {
                        textView2.setText(c28696kfe2.AEQbTJ());
                    }
                    if (tabCopydefault != null) {
                        tabCopydefault.setText(c28696kfe2.AEQbTJ());
                    }
                    if (c28569kdJ.djBIcL && i == 0) {
                        if (tabCopydefault != null) {
                            tabCopydefault.select();
                        }
                        if (tabCopydefault != null && (customView = tabCopydefault.getCustomView()) != null && (textView = (android.widget.TextView) customView.findViewById(C23274hvD.Application.getChangingConfigurations)) != null) {
                            int i2 = C52761wXj.Activity.fdOvFl;
                            C23426hxx c23426hxxOLrzqt3 = C28569kdJ.OLrzqt(c28569kdJ);
                            if (c23426hxxOLrzqt3 != null && (root = c23426hxxOLrzqt3.getRoot()) != null && (context = root.getContext()) != null) {
                                textView.setTextColor(C25382ivf.copydefault(i2, context));
                            }
                        }
                    }
                    i++;
                }
                if (C28569kdJ.this.djBIcL) {
                    java.util.List<C28696kfe> listAhwBna = C28569kdJ.this.djBIcL().AhwBna();
                    java.lang.String strAEQbTJ = (listAhwBna == null || (c28696kfe = (C28696kfe) CollectionsKt___CollectionsKt.AkhnZx(listAhwBna, 0)) == null) ? null : c28696kfe.AEQbTJ();
                    C21847hOn.KWHzl(EopTrackEvent.KEY_BUTTON_NAME, strAEQbTJ != null ? strAEQbTJ : "");
                    C28569kdJ.this.djBIcL = false;
                }
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C28569kdJ.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    private final void DbNXlk() {
        C25390ivn.collectOnLifecycle$default(this, djBIcL().KWHzl(), null, new Application(), 2, null);
    }

    /* JADX INFO: renamed from: o.kdJ$ActionBar */
    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return OLrzqt(((java.lang.Boolean) obj).booleanValue(), continuation);
        }

        public final java.lang.Object OLrzqt(boolean z, Continuation<? super Unit> continuation) {
            android.view.View childAt;
            C55254xgV c55254xgV;
            TabLayout tabLayoutCopydefault;
            boolean z2 = !z;
            C23426hxx c23426hxxOLrzqt = C28569kdJ.OLrzqt(C28569kdJ.this);
            android.view.View childAt2 = (c23426hxxOLrzqt == null || (c55254xgV = c23426hxxOLrzqt.copydefault) == null || (tabLayoutCopydefault = c55254xgV.copydefault()) == null) ? null : tabLayoutCopydefault.getChildAt(0);
            android.view.ViewGroup viewGroup = childAt2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt2 : null;
            int childCount = viewGroup != null ? viewGroup.getChildCount() : 0;
            for (int i = 0; i < childCount; i++) {
                if (viewGroup != null && (childAt = viewGroup.getChildAt(i)) != null) {
                    childAt.setEnabled(z2);
                    childAt.setClickable(z2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void gEmmrt() {
        C25390ivn.collectOnLifecycle$default(this, djBIcL().gEmmrt(), null, new ActionBar(), 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AkhnZx() {
        C23426hxx c23426hxx = (C23426hxx) aX_();
        if (c23426hxx != null) {
            android.content.Context context = c23426hxx.getRoot().getContext();
            C33537myN c33537myN = c23426hxx.OLrzqt;
            c33537myN.setBackVisible(0);
            c33537myN.setSubDoVisible(0);
            c33537myN.setSubDoImageVisible(0);
            c33537myN.setSubDoImageResource(C52761wXj.TaskDescription.GGlJim);
            c33537myN.getDoImage().setBackground(null);
            c33537myN.getDoImage().setImageTintList(C25382ivf.copydefault(C52761wXj.Activity.fdOvFl));
            c33537myN.getDoImage().setOnClickListener(new View.OnClickListener() { // from class: o.kdM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C28569kdJ.copydefault(this.KWHzl, view);
                }
            });
            c33537myN.getTitle().setText(C33070mpX.OLrzqt(C23274hvD.Fragment.HJWChPRGtXKCDKRTZD, context));
            c33537myN.getTitle().setContentDescription("web3_dex_market_pump_appbar_title_view");
            ViewPager2 viewPager2 = c23426hxx.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(viewPager2, "");
            C28577kdR.AEQbTJ(viewPager2, (RecyclerView.Adapter<?>) AhwBna(), 2, false);
            C55173xeu c55173xeu = c23426hxx.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            C28577kdR.OLrzqt(this, c55173xeu, new Function0() { // from class: o.kdK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C28569kdJ.AhwBna(this.EZpvd);
                }
            });
            new TabLayoutMediator(c23426hxx.copydefault.copydefault(), c23426hxx.AYXKKw, true, false, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.kdL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i) {
                    C28569kdJ.KWHzl(this.KWHzl, tab, i);
                }
            }).attach();
            c23426hxx.copydefault.AEQbTJ(new Activity(context));
        }
    }

    public static final void copydefault(C28569kdJ c28569kdJ, android.view.View view) {
        c28569kdJ.AYXKKw();
    }

    public static final Unit AhwBna(C28569kdJ c28569kdJ) {
        MemeActivityViewModelV2.firstLoad$default(c28569kdJ.djBIcL(), false, 1, null);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C28569kdJ c28569kdJ, TabLayout.Tab tab, int i) {
        android.widget.TextView textView;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setCustomView(C23274hvD.Activity.iLAtSv);
        java.util.List<C28696kfe> listAhwBna = c28569kdJ.djBIcL().AhwBna();
        java.lang.String strAEQbTJ = null;
        if (listAhwBna != null) {
            java.util.Iterator<T> it = listAhwBna.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((C28696kfe) next).copydefault() == i) {
                        break;
                    }
                }
            }
            C28696kfe c28696kfe = (C28696kfe) next;
            if (c28696kfe != null) {
                strAEQbTJ = c28696kfe.AEQbTJ();
            }
        }
        java.lang.String str = strAEQbTJ != null ? strAEQbTJ : "";
        android.view.View customView = tab.getCustomView();
        if (customView != null && (textView = (android.widget.TextView) customView.findViewById(C23274hvD.Application.getChangingConfigurations)) != null) {
            textView.setText(str);
        }
        tab.setText(str);
    }

    /* JADX INFO: renamed from: o.kdJ$Activity */
    public static final class Activity implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ android.content.Context KWHzl;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        public Activity(android.content.Context context) {
            this.KWHzl = context;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            java.lang.String strValueOf;
            C28696kfe c28696kfe;
            android.widget.TextView textView;
            java.lang.CharSequence text;
            C28696kfe c28696kfe2;
            Intrinsics.checkNotNullParameter(tab, "");
            C28569kdJ.this.djBIcL().copydefault(tab.getPosition());
            android.view.View customView = tab.getCustomView();
            if (customView != null && (textView = (android.widget.TextView) customView.findViewById(C23274hvD.Application.getChangingConfigurations)) != null) {
                android.content.Context context = this.KWHzl;
                C28569kdJ c28569kdJ = C28569kdJ.this;
                textView.setTextAppearance(C52761wXj.LoaderManager.zLjUOn);
                int i = C52761wXj.Activity.fdOvFl;
                Intrinsics.copydefault(context);
                textView.setTextColor(C25382ivf.copydefault(i, context));
                java.util.List<C28696kfe> listAhwBna = c28569kdJ.djBIcL().AhwBna();
                if (listAhwBna == null || (c28696kfe2 = (C28696kfe) CollectionsKt___CollectionsKt.AkhnZx(listAhwBna, tab.getPosition())) == null || (text = c28696kfe2.AEQbTJ()) == null) {
                    text = tab.getText();
                }
                textView.setText(text);
            }
            java.util.List<C28696kfe> listAhwBna2 = C28569kdJ.this.djBIcL().AhwBna();
            if (listAhwBna2 == null || (c28696kfe = (C28696kfe) CollectionsKt___CollectionsKt.AkhnZx(listAhwBna2, tab.getPosition())) == null || (strValueOf = c28696kfe.AEQbTJ()) == null) {
                strValueOf = java.lang.String.valueOf(tab.getText());
            }
            C21847hOn.KWHzl(EopTrackEvent.KEY_BUTTON_NAME, strValueOf);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            android.view.View customView;
            android.widget.TextView textView;
            java.lang.CharSequence text;
            C28696kfe c28696kfe;
            if (tab == null || (customView = tab.getCustomView()) == null || (textView = (android.widget.TextView) customView.findViewById(C23274hvD.Application.getChangingConfigurations)) == null) {
                return;
            }
            android.content.Context context = this.KWHzl;
            C28569kdJ c28569kdJ = C28569kdJ.this;
            textView.setTextAppearance(C52761wXj.LoaderManager.AwvSrB);
            int i = C52761wXj.Activity.QwvEab;
            Intrinsics.copydefault(context);
            textView.setTextColor(C25382ivf.copydefault(i, context));
            java.util.List<C28696kfe> listAhwBna = c28569kdJ.djBIcL().AhwBna();
            if (listAhwBna == null || (c28696kfe = (C28696kfe) CollectionsKt___CollectionsKt.AkhnZx(listAhwBna, tab.getPosition())) == null || (text = c28696kfe.AEQbTJ()) == null) {
                text = tab.getText();
            }
            textView.setText(text);
        }
    }

    @Override // o.AbstractC21846hOm, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        ((xWN) C43251rlk.copydefault(xWN.class)).EZpvd(false);
        ((xWN) C43251rlk.copydefault(xWN.class)).KWHzl(false);
        djBIcL().AkhnZx();
    }

    @Override // o.AbstractC21846hOm, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        djBIcL().isConnected();
    }

    public final void AYXKKw() {
        C28703kfl c28703kflOLrzqt = C28703kfl.Companion.OLrzqt();
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c28703kflOLrzqt.show(childFragmentManager);
    }
}
