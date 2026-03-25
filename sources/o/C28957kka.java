package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dex.market.common.DexFragmentNavigator;
import com.okinc.business.dex.utils.CDNSourceManager;
import com.okinc.business.market.features.module.domain.type.ModuleCategoryType;
import com.okinc.business.market.features.module.ui.ModuleFragment$displayShortcuts$1$shortcuts$1$1$1;
import com.okinc.business.market.features.module.ui.ModuleFragment$displayShortcuts$1$shortcuts$1$2$1;
import com.okinc.business.market.features.module.ui.ModuleFragment$displayShortcuts$1$shortcuts$1$3$1;
import com.okinc.business.market.features.module.ui.ModuleViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC22421hez;
import o.ActivityC28975kks;
import o.C23274hvD;
import o.C29644kxY;
import o.C52761wXj;
import o.InterfaceC29579kwM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28957kka extends AbstractC28900kjW implements InterfaceC29581kwO {
    public hAY AhwBna;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final android.os.Handler gEmmrt;
    public final C29578kwL isConnected;
    public java.lang.Runnable valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AYXKKw = 8;

    /* JADX INFO: renamed from: o.kka$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    public C28957kka() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.module.ui.ModuleFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.module.ui.ModuleFragment$special$$inlined$viewModels$default$2
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
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ModuleViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.module.ui.ModuleFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.module.ui.ModuleFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.module.ui.ModuleFragment$special$$inlined$viewModels$default$5
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
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.kkf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28957kka.DbNXlk();
            }
        });
        this.gEmmrt = new android.os.Handler(android.os.Looper.getMainLooper());
        this.isConnected = new C29578kwL(this);
    }

    public final ModuleViewModel AhwBna() {
        return (ModuleViewModel) this.fetchVPNInfo.getValue();
    }

    private final java.lang.String fIwbmz() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("key.module_fragment")) == null) ? "unknown" : string;
    }

    private final xWA fetchVPNInfo() {
        return (xWA) this.djBIcL.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xWA DbNXlk() {
        java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(xWA.class));
        if (listKWHzl != null) {
            return (xWA) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl);
        }
        return null;
    }

    /* JADX INFO: renamed from: o.kka$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kka.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key.module_fragment", str);
        setArguments(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hAY hayCopydefault = hAY.copydefault(layoutInflater, viewGroup, false);
        this.AhwBna = hayCopydefault;
        if (hayCopydefault != null) {
            return hayCopydefault.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        valueOf();
        ejfBZ();
        fARcdN();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        AhwBna().AhwBna();
        isConnected();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AhwBna().copydefault();
        if (this.valueOf == null) {
            values();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        isConnected();
        this.AhwBna = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        LinearLayoutCompat linearLayoutCompat;
        isConnected();
        hAY hay = this.AhwBna;
        if (hay != null && (linearLayoutCompat = hay.AhwBna) != null) {
            linearLayoutCompat.removeAllViews();
        }
        this.AhwBna = null;
        super.onDestroyView();
    }

    @Override // o.InterfaceC29581kwO
    public void AEQbTJ(@NotNull InterfaceC29579kwM interfaceC29579kwM) {
        Intrinsics.checkNotNullParameter(interfaceC29579kwM, "");
        if (interfaceC29579kwM instanceof InterfaceC29579kwM.TaskDescription) {
            AkhnZx();
        } else {
            this.isConnected.AEQbTJ(interfaceC29579kwM);
        }
    }

    private final void fARcdN() {
        AhwBna().EZpvd();
    }

    public final void valueOf() {
        LinearLayoutCompat.LayoutParams layoutParams;
        hAY hay = this.AhwBna;
        if (hay != null) {
            hay.AhwBna.removeAllViews();
            java.util.List listOLrzqt = C56402yEa.OLrzqt();
            android.content.Context context = hay.AhwBna.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C29034kly c29034kly = new C29034kly(context, null, 0, 6, null);
            int i = C23274hvD.ActionBar.AuCTelauCTel;
            android.content.Context context2 = c29034kly.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            c29034kly.setContent(C33070mpX.EZpvd(i, context2), "web3_dex_market_home_shortcut_signal_0", c29034kly.getContext().getString(C23274hvD.Fragment.ZpNRhN), new ModuleFragment$displayShortcuts$1$shortcuts$1$1$1(this));
            listOLrzqt.add(c29034kly);
            android.content.Context context3 = hay.AhwBna.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            C29034kly c29034kly2 = new C29034kly(context3, null, 0, 6, null);
            int i2 = C23274hvD.ActionBar.sSMYrx;
            android.content.Context context4 = c29034kly2.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            c29034kly2.setContent(C33070mpX.EZpvd(i2, context4), "web3_dex_market_home_shortcut_tracker_0", c29034kly2.getContext().getString(C23274hvD.Fragment.onPostMessage), new ModuleFragment$displayShortcuts$1$shortcuts$1$2$1(this));
            listOLrzqt.add(c29034kly2);
            android.content.Context context5 = hay.AhwBna.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            C29034kly c29034kly3 = new C29034kly(context5, null, 0, 6, null);
            int i3 = C23274hvD.ActionBar.zLjUOn;
            android.content.Context context6 = c29034kly3.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            c29034kly3.setContent(C33070mpX.EZpvd(i3, context6), "web3_dex_market_home_shortcut_pump_0", c29034kly3.getContext().getString(C23274hvD.Fragment.UPzgla), new ModuleFragment$displayShortcuts$1$shortcuts$1$3$1(this));
            listOLrzqt.add(c29034kly3);
            xWA xwaFetchVPNInfo = fetchVPNInfo();
            if (xwaFetchVPNInfo != null && xwaFetchVPNInfo.copydefault("dapp")) {
                android.content.Context context7 = hay.AhwBna.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "");
                final C29034kly c29034kly4 = new C29034kly(context7, null, 0, 6, null);
                int i4 = C52761wXj.TaskDescription.OuxcSI;
                android.content.Context context8 = c29034kly4.getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "");
                c29034kly4.setContent(C33070mpX.EZpvd(i4, context8), "web3_dex_market_home_shortcut_dapps_0", c29034kly4.getContext().getString(C23274hvD.Fragment.DGUQLIOvDItG), new Function0() { // from class: o.kkb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C28957kka.AEQbTJ(this.AEQbTJ, c29034kly4);
                    }
                });
                listOLrzqt.add(c29034kly4);
            }
            xWA xwaFetchVPNInfo2 = fetchVPNInfo();
            if (xwaFetchVPNInfo2 != null && xwaFetchVPNInfo2.copydefault("nft")) {
                android.content.Context context9 = hay.AhwBna.getContext();
                Intrinsics.checkNotNullExpressionValue(context9, "");
                final C29034kly c29034kly5 = new C29034kly(context9, null, 0, 6, null);
                int i5 = C52761wXj.TaskDescription.getSupportedCipherSuites;
                android.content.Context context10 = c29034kly5.getContext();
                Intrinsics.checkNotNullExpressionValue(context10, "");
                c29034kly5.setContent(C33070mpX.EZpvd(i5, context10), "web3_dex_market_home_shortcut_nft_0", c29034kly5.getContext().getString(C23274hvD.Fragment.gtCCJH), new Function0() { // from class: o.kkd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C28957kka.AhwBna(this.copydefault, c29034kly5);
                    }
                });
                listOLrzqt.add(c29034kly5);
            }
            xWA xwaFetchVPNInfo3 = fetchVPNInfo();
            if (xwaFetchVPNInfo3 != null && xwaFetchVPNInfo3.copydefault("explore")) {
                android.content.Context context11 = hay.AhwBna.getContext();
                Intrinsics.checkNotNullExpressionValue(context11, "");
                final C29034kly c29034kly6 = new C29034kly(context11, null, 0, 6, null);
                int i6 = C52761wXj.TaskDescription.BVXAa;
                android.content.Context context12 = c29034kly6.getContext();
                Intrinsics.checkNotNullExpressionValue(context12, "");
                c29034kly6.setContent(C33070mpX.EZpvd(i6, context12), "web3_dex_market_home_shortcut_explorer_0", c29034kly6.getContext().getString(C23274hvD.Fragment.zOIQXb), new Function0() { // from class: o.kke
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C28957kka.EZpvd(this.AEQbTJ, c29034kly6);
                    }
                });
                listOLrzqt.add(c29034kly6);
            }
            java.util.List listFARcdN = C56402yEa.fARcdN(listOLrzqt);
            int iEZpvd = EZpvd(listFARcdN.size());
            int i7 = 0;
            for (java.lang.Object obj : listFARcdN) {
                if (i7 < 0) {
                    yDY.AYXKKw();
                }
                C29034kly c29034kly7 = (C29034kly) obj;
                if (i7 > 0) {
                    android.view.View view = new android.view.View(hay.AhwBna.getContext());
                    if (listFARcdN.size() > 4) {
                        layoutParams = new LinearLayoutCompat.LayoutParams(iEZpvd, -2);
                    } else {
                        layoutParams = new LinearLayoutCompat.LayoutParams(0, -2, 1.0f);
                    }
                    hay.AhwBna.addView(view, layoutParams);
                }
                hay.AhwBna.addView(c29034kly7, new LinearLayoutCompat.LayoutParams(-2, -2));
                i7++;
            }
            C29032klw c29032klw = hay.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c29032klw, "");
            c29032klw.setVisibility(listFARcdN.size() <= 4 ? 8 : 0);
            if (listFARcdN.size() > 4) {
                android.widget.HorizontalScrollView horizontalScrollView = hay.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(horizontalScrollView, "");
                C29032klw c29032klw2 = hay.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c29032klw2, "");
                C29028kls.OLrzqt(horizontalScrollView, c29032klw2);
            }
        }
    }

    public static final Unit AEQbTJ(C28957kka c28957kka, C29034kly c29034kly) {
        androidx.fragment.app.FragmentManager parentFragmentManager;
        C21847hOn.EZpvd(c28957kka.fIwbmz(), (114682 & 2) != 0 ? null : "dapps", (114682 & 4) != 0 ? null : null, (114682 & 8) != 0 ? null : null, (114682 & 16) != 0 ? null : null, (114682 & 32) != 0 ? null : null, (114682 & 64) != 0 ? null : null, (114682 & 128) != 0 ? null : null, (114682 & 256) != 0 ? null : null, (114682 & 512) != 0 ? null : null, (114682 & 1024) != 0 ? null : null, (114682 & 2048) != 0 ? null : null, (114682 & 4096) != 0 ? null : null, (114682 & 8192) != 0 ? null : null, c28957kka.AhwBna().OLrzqt(), (32768 & 114682) != 0 ? null : null, (114682 & 65536) != 0 ? null : null);
        xWA xwaFetchVPNInfo = c28957kka.fetchVPNInfo();
        if (xwaFetchVPNInfo != null) {
            android.content.Context context = c29034kly.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            androidx.fragment.app.Fragment parentFragment = c28957kka.getParentFragment();
            if (parentFragment == null || (parentFragmentManager = parentFragment.getParentFragmentManager()) == null) {
                parentFragmentManager = c28957kka.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            }
            xwaFetchVPNInfo.OLrzqt(context, parentFragmentManager, java.lang.Integer.valueOf(C23274hvD.Application.zeUYeG));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C28957kka c28957kka, C29034kly c29034kly) {
        C21847hOn.EZpvd(c28957kka.fIwbmz(), (114682 & 2) != 0 ? null : "nft", (114682 & 4) != 0 ? null : null, (114682 & 8) != 0 ? null : null, (114682 & 16) != 0 ? null : null, (114682 & 32) != 0 ? null : null, (114682 & 64) != 0 ? null : null, (114682 & 128) != 0 ? null : null, (114682 & 256) != 0 ? null : null, (114682 & 512) != 0 ? null : null, (114682 & 1024) != 0 ? null : null, (114682 & 2048) != 0 ? null : null, (114682 & 4096) != 0 ? null : null, (114682 & 8192) != 0 ? null : null, c28957kka.AhwBna().OLrzqt(), (32768 & 114682) != 0 ? null : null, (114682 & 65536) != 0 ? null : null);
        xWA xwaFetchVPNInfo = c28957kka.fetchVPNInfo();
        if (xwaFetchVPNInfo != null) {
            android.content.Context context = c29034kly.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            xwaFetchVPNInfo.EZpvd(context);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C28957kka c28957kka, C29034kly c29034kly) {
        C21847hOn.EZpvd(c28957kka.fIwbmz(), (114682 & 2) != 0 ? null : "explorer", (114682 & 4) != 0 ? null : null, (114682 & 8) != 0 ? null : null, (114682 & 16) != 0 ? null : null, (114682 & 32) != 0 ? null : null, (114682 & 64) != 0 ? null : null, (114682 & 128) != 0 ? null : null, (114682 & 256) != 0 ? null : null, (114682 & 512) != 0 ? null : null, (114682 & 1024) != 0 ? null : null, (114682 & 2048) != 0 ? null : null, (114682 & 4096) != 0 ? null : null, (114682 & 8192) != 0 ? null : null, c28957kka.AhwBna().OLrzqt(), (32768 & 114682) != 0 ? null : null, (114682 & 65536) != 0 ? null : null);
        xWA xwaFetchVPNInfo = c28957kka.fetchVPNInfo();
        if (xwaFetchVPNInfo != null) {
            android.content.Context context = c29034kly.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            xwaFetchVPNInfo.copydefault(context);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int EZpvd(int i) {
        LinearLayoutCompat linearLayoutCompat;
        int i2 = getResources().getDisplayMetrics().widthPixels;
        int iDp2px$default = C55298xhM.dp2px$default(78.0f, null, 1, null);
        hAY hay = this.AhwBna;
        int paddingStart = (hay == null || (linearLayoutCompat = hay.AhwBna) == null) ? 0 : linearLayoutCompat.getPaddingStart();
        int iDp2px$default2 = C55298xhM.dp2px$default(4.0f, null, 1, null);
        int i3 = i - 1;
        int i4 = 2;
        if (2 > i3) {
            return iDp2px$default2;
        }
        int i5 = iDp2px$default2;
        while (true) {
            float f = i4;
            float f2 = (0.5f + f) * iDp2px$default;
            float f3 = i2 - paddingStart;
            int i6 = (int) ((f3 - f2) / f);
            if (i6 < iDp2px$default2 || f2 + (i4 * i6) > f3) {
                break;
            }
            if (i4 == i3) {
                return i6;
            }
            i4++;
            i5 = i6;
        }
    }

    public final void djBIcL() {
        AhwBna().EZpvd();
    }

    private final void ejfBZ() {
        AhwBna().AEQbTJ().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.kkc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28957kka.EZpvd(this.KWHzl, (C28970kkn) obj);
            }
        }));
    }

    public static final Unit EZpvd(C28957kka c28957kka, C28970kkn c28970kkn) {
        LinearLayoutCompat root;
        LinearLayoutCompat root2;
        if (!c28970kkn.AEQbTJ()) {
            if (C33129mqd.KWHzl((java.util.Collection) c28970kkn.copydefault())) {
                hAY hay = c28957kka.AhwBna;
                if (hay != null && (root2 = hay.getRoot()) != null) {
                    root2.setVisibility(0);
                }
                c28957kka.KWHzl(c28970kkn.copydefault());
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c28957kka, true, (java.lang.String) null, 2, (java.lang.Object) null);
            } else {
                hAY hay2 = c28957kka.AhwBna;
                if (hay2 != null && (root = hay2.getRoot()) != null) {
                    root.setVisibility(8);
                }
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c28957kka, false, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(final java.util.List<C28897kjT> list) {
        hAY hay = this.AhwBna;
        if (hay != null) {
            java.lang.Integer numValueOf = list != null ? java.lang.Integer.valueOf(list.size()) : null;
            int i = 0;
            if (numValueOf != null && numValueOf.intValue() == 1) {
                final C28897kjT c28897kjT = (C28897kjT) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
                CardView cardView = hay.isConnected;
                cardView.setVisibility(0);
                android.widget.ImageView imageView = hay.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                C22361hds.OLrzqt(imageView, CDNSourceManager.ImageSource.ModuleBanner);
                hay.fetchVPNInfo.setText(c28897kjT.AuCTel());
                hay.DbNXlk.setText(c28897kjT.gEmmrt());
                android.widget.FrameLayout frameLayout = hay.copydefault;
                Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                kLW.copydefault(frameLayout, c28897kjT.djBIcL(), (30 & 2) != 0 ? new C25385ivi(null, null, 0.0f, 0, 15, null) : null, (30 & 4) != 0 ? 20.0f : 0.0f, (30 & 8) != 0 ? 14.0f : 0.0f, (30 & 16) != 0 ? null : null);
                cardView.setContentDescription("web3_dex_market_home_module_list_item_0");
                C25352ivB.setOnDoubleCheckClickListener$default(cardView, 0L, new Function1() { // from class: o.kkj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C28957kka.EZpvd(c28897kjT, this, (android.view.View) obj);
                    }
                }, 1, null);
                hay.OLrzqt.setVisibility(8);
                hay.valueOf.setVisibility(8);
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 2) {
                hay.isConnected.setVisibility(8);
                hay.OLrzqt.setVisibility(0);
                hay.EZpvd.setContent(list.get(0), "web3_dex_market_home_module_list_item_0", new Function1() { // from class: o.kkh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C28957kka.KWHzl(list, this, (C28897kjT) obj);
                    }
                });
                hay.EZpvd.setFullWidth();
                hay.AkhnZx.setContent(list.get(1), "web3_dex_market_home_module_list_item_1", new Function1() { // from class: o.kki
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C28957kka.AEQbTJ(list, this, (C28897kjT) obj);
                    }
                });
                hay.AkhnZx.setFullWidth();
                hay.valueOf.setVisibility(8);
                return;
            }
            hay.isConnected.setVisibility(8);
            hay.OLrzqt.setVisibility(8);
            hay.valueOf.setVisibility(0);
            LinearLayoutCompat linearLayoutCompat = hay.djBIcL;
            linearLayoutCompat.removeAllViews();
            if (list != null) {
                for (java.lang.Object obj : list) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    final C28897kjT c28897kjT2 = (C28897kjT) obj;
                    android.content.Context contextRequireContext = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    C28985klB c28985klB = new C28985klB(contextRequireContext, null, 0, 6, null);
                    c28985klB.setContent(c28897kjT2, "web3_dex_market_home_module_list_item_" + i, new Function1() { // from class: o.kkg
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return C28957kka.AEQbTJ(c28897kjT2, this, (C28897kjT) obj2);
                        }
                    });
                    linearLayoutCompat.addView(c28985klB);
                    i++;
                }
            }
        }
    }

    public static final Unit EZpvd(C28897kjT c28897kjT, C28957kka c28957kka, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC22421hez.Companion.EZpvd(new AbstractC22421hez.TaskDescription(c28897kjT.valueOf()));
        c28957kka.KWHzl(c28897kjT);
        C21847hOn.EZpvd(c28957kka.fIwbmz(), (114682 & 2) != 0 ? null : c28897kjT.AhwBna(), (114682 & 4) != 0 ? null : null, (114682 & 8) != 0 ? null : null, (114682 & 16) != 0 ? null : null, (114682 & 32) != 0 ? null : null, (114682 & 64) != 0 ? null : null, (114682 & 128) != 0 ? null : null, (114682 & 256) != 0 ? null : null, (114682 & 512) != 0 ? null : null, (114682 & 1024) != 0 ? null : null, (114682 & 2048) != 0 ? null : null, (114682 & 4096) != 0 ? null : null, (114682 & 8192) != 0 ? null : null, c28957kka.AhwBna().OLrzqt(), (32768 & 114682) != 0 ? null : null, (114682 & 65536) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.util.List list, C28957kka c28957kka, C28897kjT c28897kjT) {
        Intrinsics.checkNotNullParameter(c28897kjT, "");
        AbstractC22421hez.Companion.EZpvd(new AbstractC22421hez.TaskDescription(((C28897kjT) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).valueOf()));
        c28957kka.KWHzl(c28897kjT);
        C21847hOn.EZpvd(c28957kka.fIwbmz(), (114682 & 2) != 0 ? null : c28897kjT.AhwBna(), (114682 & 4) != 0 ? null : null, (114682 & 8) != 0 ? null : null, (114682 & 16) != 0 ? null : null, (114682 & 32) != 0 ? null : null, (114682 & 64) != 0 ? null : null, (114682 & 128) != 0 ? null : null, (114682 & 256) != 0 ? null : null, (114682 & 512) != 0 ? null : null, (114682 & 1024) != 0 ? null : null, (114682 & 2048) != 0 ? null : null, (114682 & 4096) != 0 ? null : null, (114682 & 8192) != 0 ? null : null, c28957kka.AhwBna().OLrzqt(), (32768 & 114682) != 0 ? null : null, (114682 & 65536) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.util.List list, C28957kka c28957kka, C28897kjT c28897kjT) {
        Intrinsics.checkNotNullParameter(c28897kjT, "");
        AbstractC22421hez.Companion.EZpvd(new AbstractC22421hez.TaskDescription(((C28897kjT) CollectionsKt___CollectionsKt.AubY(list)).valueOf()));
        c28957kka.KWHzl(c28897kjT);
        C21847hOn.EZpvd(c28957kka.fIwbmz(), (114682 & 2) != 0 ? null : c28897kjT.AhwBna(), (114682 & 4) != 0 ? null : null, (114682 & 8) != 0 ? null : null, (114682 & 16) != 0 ? null : null, (114682 & 32) != 0 ? null : null, (114682 & 64) != 0 ? null : null, (114682 & 128) != 0 ? null : null, (114682 & 256) != 0 ? null : null, (114682 & 512) != 0 ? null : null, (114682 & 1024) != 0 ? null : null, (114682 & 2048) != 0 ? null : null, (114682 & 4096) != 0 ? null : null, (114682 & 8192) != 0 ? null : null, c28957kka.AhwBna().OLrzqt(), (32768 & 114682) != 0 ? null : null, (114682 & 65536) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C28897kjT c28897kjT, C28957kka c28957kka, C28897kjT c28897kjT2) {
        Intrinsics.checkNotNullParameter(c28897kjT2, "");
        AbstractC22421hez.Companion.EZpvd(new AbstractC22421hez.TaskDescription(c28897kjT.valueOf()));
        c28957kka.KWHzl(c28897kjT2);
        C21847hOn.EZpvd(c28957kka.fIwbmz(), (114682 & 2) != 0 ? null : c28897kjT2.AhwBna(), (114682 & 4) != 0 ? null : null, (114682 & 8) != 0 ? null : null, (114682 & 16) != 0 ? null : null, (114682 & 32) != 0 ? null : null, (114682 & 64) != 0 ? null : null, (114682 & 128) != 0 ? null : null, (114682 & 256) != 0 ? null : null, (114682 & 512) != 0 ? null : null, (114682 & 1024) != 0 ? null : null, (114682 & 2048) != 0 ? null : null, (114682 & 4096) != 0 ? null : null, (114682 & 8192) != 0 ? null : null, c28957kka.AhwBna().OLrzqt(), (32768 & 114682) != 0 ? null : null, (114682 & 65536) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    public final void AkhnZx() {
        C21847hOn.EZpvd(fIwbmz(), (114682 & 2) != 0 ? null : "sm_signal", (114682 & 4) != 0 ? null : null, (114682 & 8) != 0 ? null : null, (114682 & 16) != 0 ? null : null, (114682 & 32) != 0 ? null : null, (114682 & 64) != 0 ? null : null, (114682 & 128) != 0 ? null : null, (114682 & 256) != 0 ? null : null, (114682 & 512) != 0 ? null : null, (114682 & 1024) != 0 ? null : null, (114682 & 2048) != 0 ? null : null, (114682 & 4096) != 0 ? null : null, (114682 & 8192) != 0 ? null : null, AhwBna().OLrzqt(), (32768 & 114682) != 0 ? null : null, (114682 & 65536) != 0 ? null : null);
        DexFragmentNavigator dexFragmentNavigatorAEQbTJ = C27723kAz.AEQbTJ(this);
        if (dexFragmentNavigatorAEQbTJ != null) {
            C29644kxY c29644kxYNewInstance$default = C29644kxY.Application.newInstance$default(C29644kxY.Companion, "Smart money_DL", false, null, 6, null);
            dexFragmentNavigatorAEQbTJ.EZpvd(c29644kxYNewInstance$default, (6 & 2) != 0 ? c29644kxYNewInstance$default.getClass().getName() : null, (6 & 4) != 0 ? new DexFragmentNavigator.Activity(0, 0, 0, 0, false, false, null, null, 255, null) : null);
        }
    }

    public final void AYXKKw() {
        C21847hOn.EZpvd(fIwbmz(), (114682 & 2) != 0 ? null : "memepump", (114682 & 4) != 0 ? null : null, (114682 & 8) != 0 ? null : null, (114682 & 16) != 0 ? null : null, (114682 & 32) != 0 ? null : null, (114682 & 64) != 0 ? null : null, (114682 & 128) != 0 ? null : null, (114682 & 256) != 0 ? null : null, (114682 & 512) != 0 ? null : null, (114682 & 1024) != 0 ? null : null, (114682 & 2048) != 0 ? null : null, (114682 & 4096) != 0 ? null : null, (114682 & 8192) != 0 ? null : null, AhwBna().OLrzqt(), (32768 & 114682) != 0 ? null : null, (114682 & 65536) != 0 ? null : null);
        DexFragmentNavigator dexFragmentNavigatorAEQbTJ = C27723kAz.AEQbTJ(this);
        if (dexFragmentNavigatorAEQbTJ != null) {
            C28569kdJ c28569kdJKWHzl = C28569kdJ.Companion.KWHzl("default_trade");
            dexFragmentNavigatorAEQbTJ.EZpvd(c28569kdJKWHzl, (6 & 2) != 0 ? c28569kdJKWHzl.getClass().getName() : null, (6 & 4) != 0 ? new DexFragmentNavigator.Activity(0, 0, 0, 0, false, false, null, null, 255, null) : null);
        }
    }

    public final void gEmmrt() {
        jBN.copydefault.KWHzl();
        android.content.Intent intent = new android.content.Intent(requireActivity(), (java.lang.Class<?>) ActivityC25672jCb.class);
        intent.putExtra("key.page_from", "market_tracker");
        startActivity(intent);
    }

    public final void KWHzl(C28897kjT c28897kjT) {
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c28897kjT.KWHzl())) {
            DexFragmentNavigator dexFragmentNavigatorAEQbTJ = C27723kAz.AEQbTJ(this);
            if (dexFragmentNavigatorAEQbTJ != null) {
                C28979kkw c28979kkwKWHzl = C28979kkw.Companion.KWHzl(c28897kjT.fJNWhG());
                dexFragmentNavigatorAEQbTJ.EZpvd(c28979kkwKWHzl, (6 & 2) != 0 ? c28979kkwKWHzl.getClass().getName() : null, (6 & 4) != 0 ? new DexFragmentNavigator.Activity(0, 0, 0, 0, false, false, null, null, 255, null) : null);
                return;
            }
            return;
        }
        if (c28897kjT.OLrzqt() == ModuleCategoryType.GENERAL) {
            ActivityC28975kks.ActionBar actionBar = ActivityC28975kks.Companion;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            startActivity(actionBar.KWHzl(fragmentActivityRequireActivity, c28897kjT.fJNWhG()));
        }
    }

    public final void values() {
        java.lang.Runnable runnable = this.valueOf;
        if (runnable != null) {
            this.gEmmrt.postDelayed(runnable, 5000L);
        }
    }

    public final void isConnected() {
        java.lang.Runnable runnable = this.valueOf;
        if (runnable != null) {
            this.gEmmrt.removeCallbacks(runnable);
        }
        this.gEmmrt.removeCallbacksAndMessages(null);
        this.valueOf = null;
    }
}
