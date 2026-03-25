package com.okinc.business.market.features.module.ui.detail.header;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.OnBackPressedDispatcher;
import androidx.collection.ArrayMapKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.business.defi.share.Web3ShareService;
import com.okinc.business.defi.share.bean.Web3ShareModel;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.utils.CDNSourceManager;
import com.okinc.business.dexlogic.bean.ShareLinkVO;
import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.dexui.chain_picker.ChainPickerParams;
import com.okinc.business.market.data.model.ModuleBoostTokenData;
import com.okinc.business.market.features.module.domain.ModuleDetailEventManager;
import com.okinc.business.market.features.module.domain.type.TimeType;
import com.okinc.business.market.features.module.ui.detail.ModuleDetailViewModel;
import com.okinc.business.market.features.module.ui.detail.ModuleInfo;
import com.okinc.business.market.features.module.ui.detail.header.ModuleDetailFragment;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$1;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$2;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$3;
import com.okinc.business.utils.FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$4;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.wallet.api.WalletReferralSource;
import java.math.RoundingMode;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractActivityC33041mov;
import o.AbstractC28982kkz;
import o.AbstractC43238rlX;
import o.C21485hBc;
import o.C21490hBh;
import o.C21847hOn;
import o.C22361hds;
import o.C23272hvB;
import o.C23274hvD;
import o.C23311hvo;
import o.C23407hxe;
import o.C25352ivB;
import o.C25382ivf;
import o.C28899kjV;
import o.C28953kkW;
import o.C28979kkw;
import o.C28984klA;
import o.C29019klj;
import o.C29020klk;
import o.C29024klo;
import o.C31197lpV;
import o.C32113mPz;
import o.C32866mlf;
import o.C33054mpH;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C33492mxV;
import o.C33512mxp;
import o.C43246rlf;
import o.C43251rlk;
import o.C52761wXj;
import o.C52794wYp;
import o.C55113xdn;
import o.C55244xgL;
import o.C55296xhK;
import o.C55298xhM;
import o.C56390yDp;
import o.C56392yDr;
import o.C56524yIo;
import o.C57659ymb;
import o.C59405zgS;
import o.C59443zhD;
import o.C9706bae;
import o.InterfaceC23406hxd;
import o.InterfaceC28933kkC;
import o.InterfaceC29021kll;
import o.InterfaceC43294rma;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC9738bbJ;
import o.InterfaceC9852bdR;
import o.gKZ;
import o.kLY;
import o.pTD;
import o.rVN;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class ModuleDetailFragment extends AbstractC28982kkz implements InterfaceC23406hxd {
    public C23407hxe AYXKKw;
    public AppBarLayout.OnOffsetChangedListener AhwBna;
    public TabLayout.OnTabSelectedListener AkhnZx;
    public boolean DbNXlk;

    @yCM
    public C9706bae deeplinkReferralCodeHandler;
    public final InterfaceC56387yDm djBIcL;
    public C21485hBc gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public Boolean valueOf;

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
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
        public final /* synthetic */ void onChanged(Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    public static final class Dialog implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ Fragment AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(Fragment fragment) {
            this.AEQbTJ = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            Object next;
            Iterator it = C59405zgS.EZpvd(this.AEQbTJ, (Function1<? super Fragment, ? extends Fragment>) ((Function1<? super Object, ? extends Object>) C31197lpV.StateListAnimator.AnonymousClass1.KWHzl)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Fragment) next) instanceof C28979kkw) {
                    break;
                }
            }
            Fragment fragment = (Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            FragmentActivity fragmentActivityRequireActivity = this.AEQbTJ.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            return fragmentActivityRequireActivity;
        }
    }

    public ModuleDetailFragment() {
        C31197lpV c31197lpV = C31197lpV.EZpvd;
        Dialog dialog = new Dialog(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$1(dialog));
        final Function0 function0 = null;
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ModuleDetailViewModel.class), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new FragmentUtils$marketMatchViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd));
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.okinc.business.market.features.module.ui.detail.header.ModuleDetailFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.module.ui.detail.header.ModuleDetailFragment$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ModuleDetailEventManager.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.module.ui.detail.header.ModuleDetailFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.module.ui.detail.header.ModuleDetailFragment$special$$inlined$viewModels$default$4
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.module.ui.detail.header.ModuleDetailFragment$special$$inlined$viewModels$default$5
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ModuleDetailViewModel AhwBna() {
        return (ModuleDetailViewModel) this.isConnected.getValue();
    }

    public final ModuleDetailEventManager djBIcL() {
        return (ModuleDetailEventManager) this.djBIcL.getValue();
    }

    /* JADX DEBUG: Possible override for method o.kkz.AEQbTJ()V */
    public final C9706bae AEQbTJ() {
        C9706bae c9706bae = this.deeplinkReferralCodeHandler;
        if (c9706bae != null) {
            return c9706bae;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21485hBc c21485hBcOLrzqt = C21485hBc.OLrzqt(layoutInflater, viewGroup, false);
        this.gEmmrt = c21485hBcOLrzqt;
        if (c21485hBcOLrzqt != null) {
            return c21485hBcOLrzqt.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C21485hBc c21485hBc = this.gEmmrt;
        if (c21485hBc != null) {
            AEQbTJ(true);
            if (C55296xhK.OLrzqt(C43246rlf.OLrzqt.valueOf())) {
                c21485hBc.AYXKKw.setRotationY(0.0f);
                c21485hBc.gEmmrt.setRotationY(180.0f);
            }
            ImageView imageView = c21485hBc.AhwBna;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C22361hds.OLrzqt(imageView, CDNSourceManager.ImageSource.ModuleBanner);
            ImageView imageView2 = c21485hBc.wlaJM;
            imageView2.setOnClickListener(new TaskDescription(imageView2, 1000L, this));
            c21485hBc.sSMYrx.setVisibility(0);
            gEmmrt();
            KWHzl(c21485hBc);
            valueOf();
            AYXKKw();
        }
        fetchVPNInfo();
    }

    public final void gEmmrt() {
        ImageView imageView;
        C21485hBc c21485hBc = this.gEmmrt;
        if (c21485hBc == null || (imageView = c21485hBc.sSMYrx) == null) {
            return;
        }
        C25352ivB.setOnDoubleCheckClickListener$default(imageView, 0L, new Function1() { // from class: o.kkJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ModuleDetailFragment.AhwBna(this.OLrzqt, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit AhwBna(ModuleDetailFragment moduleDetailFragment, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        String string = view.getContext().getString(C23274hvD.Fragment.zDUObI);
        Intrinsics.checkNotNullExpressionValue(string, "");
        gKZ gkz = gKZ.EZpvd;
        String strOLrzqt = gkz.OLrzqt(gkz.KWHzl("dex/market/homecustomlist"), C56390yDp.OLrzqt("moduleType", moduleDetailFragment.AhwBna().OLrzqt()), C56390yDp.OLrzqt("moduleName", moduleDetailFragment.AhwBna().AEQbTJ()));
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.AkhnZx(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().copydefault(), 0);
        String strDbNXlk = interfaceC9738bbJ != null ? interfaceC9738bbJ.DbNXlk() : null;
        Web3ShareModel web3ShareModelEZpvd = Web3ShareModel.Companion.EZpvd(string, strOLrzqt, "DEX_Market_Tokenlist", (40 & 8) != 0 ? null : null, strDbNXlk == null ? "" : strDbNXlk, (40 & 32) != 0 ? null : WalletReferralSource.MARKET_LIST);
        Web3ShareService web3ShareService = (Web3ShareService) C43251rlk.copydefault(Web3ShareService.class);
        FragmentActivity activity = moduleDetailFragment.getActivity();
        Intrinsics.copydefault(activity, "");
        Web3ShareService.Application.share$default(web3ShareService, (AbstractActivityC33041mov) activity, web3ShareModelEZpvd, null, 4, null);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        C21490hBh c21490hBh;
        LinearLayout linearLayout;
        C21485hBc c21485hBc;
        C21490hBh c21490hBh2;
        C29020klk c29020klk;
        super.onResume();
        C21485hBc c21485hBc2 = this.gEmmrt;
        if (c21485hBc2 == null || (c21490hBh = c21485hBc2.hDKMBd) == null || (linearLayout = c21490hBh.KWHzl) == null || linearLayout.getVisibility() != 0 || (c21485hBc = this.gEmmrt) == null || (c21490hBh2 = c21485hBc.hDKMBd) == null || (c29020klk = c21490hBh2.OLrzqt) == null) {
            return;
        }
        c29020klk.KWHzl();
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ FragmentActivity EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C28899kjV OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, FragmentActivity fragmentActivity, C28899kjV c28899kjV) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = fragmentActivity;
            this.OLrzqt = c28899kjV;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), this.EZpvd, this.OLrzqt.KWHzl(), null, Activity.OLrzqt, 4, null);
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ ModuleDetailFragment EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, ModuleDetailFragment moduleDetailFragment) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = moduleDetailFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            OnBackPressedDispatcher onBackPressedDispatcher;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                FragmentActivity activity = this.EZpvd.getActivity();
                if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
                    return;
                }
                onBackPressedDispatcher.onBackPressed();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        C21490hBh c21490hBh;
        LinearLayout linearLayout;
        C21485hBc c21485hBc;
        C21490hBh c21490hBh2;
        C29020klk c29020klk;
        super.onPause();
        C21485hBc c21485hBc2 = this.gEmmrt;
        if (c21485hBc2 == null || (c21490hBh = c21485hBc2.hDKMBd) == null || (linearLayout = c21490hBh.KWHzl) == null || linearLayout.getVisibility() != 0 || (c21485hBc = this.gEmmrt) == null || (c21490hBh2 = c21485hBc.hDKMBd) == null || (c29020klk = c21490hBh2.OLrzqt) == null) {
            return;
        }
        c29020klk.EZpvd();
    }

    public static final void KWHzl(ModuleDetailFragment moduleDetailFragment, AppBarLayout appBarLayout, int i) {
        C21485hBc c21485hBc = moduleDetailFragment.gEmmrt;
        if (c21485hBc != null) {
            if (Math.abs(i) >= C55298xhM.dp2px$default(30.0f, null, 1, null)) {
                c21485hBc.AxsJAY.setText(c21485hBc.QfsBiF.getText());
                c21485hBc.gHZMYf.setBackgroundColor(C25382ivf.KWHzl(C52761wXj.Activity.EZpvd));
            } else {
                c21485hBc.gHZMYf.setBackgroundColor(C25382ivf.KWHzl(C32113mPz.ActionBar.ORxRYg));
                c21485hBc.AxsJAY.setText("");
            }
        }
    }

    public final void AYXKKw() {
        AppBarLayout appBarLayout;
        AppBarLayout.OnOffsetChangedListener onOffsetChangedListener = new AppBarLayout.OnOffsetChangedListener() { // from class: o.kkG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout2, int i) {
                ModuleDetailFragment.KWHzl(this.KWHzl, appBarLayout2, i);
            }
        };
        C21485hBc c21485hBc = this.gEmmrt;
        if (c21485hBc != null && (appBarLayout = c21485hBc.OLrzqt) != null) {
            appBarLayout.addOnOffsetChangedListener(onOffsetChangedListener);
        }
        this.AhwBna = onOffsetChangedListener;
    }

    private final void fetchVPNInfo() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ModuleDetailFragment$initObserver$1(this, null), 3, null);
        djBIcL().EZpvd().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.kkF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ModuleDetailFragment.KWHzl(this.AEQbTJ, (InterfaceC29021kll) obj);
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(ModuleDetailFragment moduleDetailFragment, InterfaceC29021kll interfaceC29021kll) {
        boolean zBooleanValue;
        InterfaceC29021kll.TaskDescription taskDescription;
        if (interfaceC29021kll instanceof InterfaceC29021kll.TaskDescription) {
            InterfaceC28933kkC value = moduleDetailFragment.AhwBna().KWHzl().getValue();
            InterfaceC28933kkC.TaskDescription taskDescription2 = value instanceof InterfaceC28933kkC.TaskDescription ? (InterfaceC28933kkC.TaskDescription) value : null;
            ModuleInfo moduleInfoEZpvd = taskDescription2 != null ? taskDescription2.EZpvd() : null;
            if (moduleDetailFragment.valueOf == null) {
                InterfaceC29021kll.TaskDescription taskDescription3 = (InterfaceC29021kll.TaskDescription) interfaceC29021kll;
                if (!taskDescription3.copydefault()) {
                    Boolean boolValueOf = Boolean.valueOf(moduleInfoEZpvd != null ? moduleInfoEZpvd.isConnected() : taskDescription3.OLrzqt().ejfBZ());
                    moduleDetailFragment.valueOf = boolValueOf;
                    zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : false;
                    taskDescription = (InterfaceC29021kll.TaskDescription) interfaceC29021kll;
                    boolean z = taskDescription.OLrzqt().AkhnZx() == null;
                    if (!taskDescription.OLrzqt().isConnected().isEmpty()) {
                        moduleDetailFragment.KWHzl(taskDescription.OLrzqt());
                    } else if (zBooleanValue) {
                        moduleDetailFragment.AEQbTJ(taskDescription.OLrzqt());
                    } else if (z) {
                        moduleDetailFragment.OLrzqt(taskDescription.OLrzqt());
                    } else {
                        moduleDetailFragment.EZpvd(taskDescription.OLrzqt());
                    }
                    moduleDetailFragment.AEQbTJ(false);
                    moduleDetailFragment.values();
                    rVN.reportFullyDrawn$default((Fragment) moduleDetailFragment, true, (String) null, 2, (Object) null);
                } else {
                    Boolean bool = moduleDetailFragment.valueOf;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    }
                    taskDescription = (InterfaceC29021kll.TaskDescription) interfaceC29021kll;
                    if (taskDescription.OLrzqt().AkhnZx() == null) {
                    }
                    if (!taskDescription.OLrzqt().isConnected().isEmpty()) {
                    }
                    moduleDetailFragment.AEQbTJ(false);
                    moduleDetailFragment.values();
                    rVN.reportFullyDrawn$default((Fragment) moduleDetailFragment, true, (String) null, 2, (Object) null);
                }
            }
        } else if (Intrinsics.EZpvd(interfaceC29021kll, InterfaceC29021kll.Application.KWHzl)) {
            renderError$default(moduleDetailFragment, null, 1, null);
            moduleDetailFragment.AEQbTJ(false);
            moduleDetailFragment.values();
            rVN.reportFullyDrawn$default((Fragment) moduleDetailFragment, false, (String) null, 2, (Object) null);
        } else if (!Intrinsics.EZpvd(interfaceC29021kll, InterfaceC29021kll.ActionBar.AEQbTJ)) {
            if (!(interfaceC29021kll instanceof InterfaceC29021kll.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            moduleDetailFragment.AEQbTJ(((InterfaceC29021kll.StateListAnimator) interfaceC29021kll).AEQbTJ());
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(final ModuleInfo moduleInfo) {
        C21485hBc c21485hBc = this.gEmmrt;
        if (c21485hBc != null) {
            c21485hBc.QfsBiF.setText(moduleInfo.djBIcL());
            c21485hBc.AuCTelauCTel.setText(moduleInfo.djBIcL());
            if (!StringsKt__StringsKt.fARcdN((CharSequence) moduleInfo.copydefault())) {
                TextView textView = c21485hBc.AwvSrB;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                String strCopydefault = moduleInfo.copydefault();
                DisplaySign displaySign = DisplaySign.EXCEPT_ZERO;
                kLY.formatPercentage$default(textView, strCopydefault, displaySign, Float.valueOf(-99.999f), Float.valueOf(99999.0f), null, 16, null);
                TextView textView2 = c21485hBc.uzCIH;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                kLY.formatPercentage$default(textView2, moduleInfo.copydefault(), displaySign, Float.valueOf(-99.999f), Float.valueOf(99999.0f), null, 16, null);
            }
            if ((!StringsKt__StringsKt.fARcdN((CharSequence) moduleInfo.AEQbTJ())) && !moduleInfo.AhwBna()) {
                ImageView imageView = c21485hBc.valueOf;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(0);
                C25352ivB.setOnDoubleCheckClickListener$default(c21485hBc.valueOf, 0L, new Function1() { // from class: o.kkL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ModuleDetailFragment.copydefault(this.KWHzl, moduleInfo, (android.view.View) obj);
                    }
                }, 1, null);
                c21485hBc.fJNWhG.setDescriptionTextStyle(C52761wXj.LoaderManager.KWHzl, C52761wXj.Activity.DCUTEIddSDPG, 24.0f);
                c21485hBc.fJNWhG.setMarginRequiredOnIvWhenClosed(8.0f);
                c21485hBc.fJNWhG.setDescription(moduleInfo.AEQbTJ(), true);
            } else {
                ImageView imageView2 = c21485hBc.valueOf;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                imageView2.setVisibility(8);
            }
            String strEZpvd = C33492mxV.OLrzqt() ? moduleInfo.EZpvd() : moduleInfo.KWHzl();
            if (!StringsKt__StringsKt.fARcdN((CharSequence) strEZpvd)) {
                ImageView imageView3 = c21485hBc.AhwBna;
                Intrinsics.checkNotNullExpressionValue(imageView3, "");
                imageView3.setVisibility(0);
                ImageView imageView4 = c21485hBc.AhwBna;
                Intrinsics.checkNotNullExpressionValue(imageView4, "");
                C33054mpH.AEQbTJ(imageView4, strEZpvd);
            }
        }
    }

    public static final Unit copydefault(ModuleDetailFragment moduleDetailFragment, ModuleInfo moduleInfo, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Context context = moduleDetailFragment.getContext();
        if (context != null) {
            C25352ivB.OLrzqt(context, moduleInfo.djBIcL(), moduleInfo.AEQbTJ(), C23274hvD.Fragment.buildRccMetadata);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void updateShareConfig$default(ModuleDetailFragment moduleDetailFragment, ShareLinkVO shareLinkVO, int i, Object obj) {
        if ((i & 1) != 0) {
            shareLinkVO = null;
        }
        moduleDetailFragment.AEQbTJ(shareLinkVO);
    }

    public final void AEQbTJ(final ShareLinkVO shareLinkVO) {
        C21485hBc c21485hBc;
        if (shareLinkVO == null || !C33129mqd.OLrzqt((CharSequence) shareLinkVO.getDeeplink()) || !C33129mqd.OLrzqt((CharSequence) shareLinkVO.getWebUrl()) || (c21485hBc = this.gEmmrt) == null) {
            return;
        }
        C25352ivB.setOnDoubleCheckClickListener$default(c21485hBc.sSMYrx, 0L, new Function1() { // from class: o.kkE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ModuleDetailFragment.KWHzl(shareLinkVO, this, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, RemoteMessageConst.Notification.ICON, "share", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(boolean z) {
        C21485hBc c21485hBc = this.gEmmrt;
        if (c21485hBc != null) {
            if (z) {
                C55113xdn c55113xdn = c21485hBc.isConnected;
                Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                C22361hds.OLrzqt(c55113xdn, CDNSourceManager.LottieSource.DEX_MARKET_MODULE_LOADING);
                c21485hBc.isConnected.playAnimation();
                return;
            }
            c21485hBc.isConnected.copydefault();
            c21485hBc.AkhnZx.setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        ViewPager viewPager;
        C55113xdn c55113xdn;
        C55113xdn c55113xdn2;
        C55244xgL c55244xgL;
        AppBarLayout appBarLayout;
        C21485hBc c21485hBc = this.gEmmrt;
        if (c21485hBc != null && (appBarLayout = c21485hBc.OLrzqt) != null) {
            appBarLayout.removeOnOffsetChangedListener(this.AhwBna);
        }
        this.AhwBna = null;
        C21485hBc c21485hBc2 = this.gEmmrt;
        if (c21485hBc2 != null && (c55244xgL = c21485hBc2.AEQbTJ) != null) {
            c55244xgL.KWHzl();
        }
        this.AkhnZx = null;
        C21485hBc c21485hBc3 = this.gEmmrt;
        if (c21485hBc3 != null && (c55113xdn2 = c21485hBc3.isConnected) != null) {
            c55113xdn2.clearAnimation();
        }
        C21485hBc c21485hBc4 = this.gEmmrt;
        if (c21485hBc4 != null && (c55113xdn = c21485hBc4.isConnected) != null) {
            c55113xdn.copydefault();
        }
        C21485hBc c21485hBc5 = this.gEmmrt;
        if (c21485hBc5 != null && (viewPager = c21485hBc5.QbewEr) != null) {
            viewPager.setAdapter(null);
        }
        C23407hxe c23407hxe = this.AYXKKw;
        if (c23407hxe != null) {
            c23407hxe.dismiss();
        }
        this.AYXKKw = null;
        this.gEmmrt = null;
        super.onDestroyView();
    }

    public final void valueOf() {
        C21485hBc c21485hBc = this.gEmmrt;
        if (c21485hBc != null) {
            C25352ivB.setOnDoubleCheckClickListener$default(c21485hBc.djBIcL, 0L, new Function1() { // from class: o.kkA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ModuleDetailFragment.AEQbTJ(this.KWHzl, (android.view.View) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit AEQbTJ(ModuleDetailFragment moduleDetailFragment, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C23407hxe c23407hxe = moduleDetailFragment.AYXKKw;
        if (c23407hxe != null) {
            c23407hxe.dismiss();
        }
        C23407hxe c23407hxeCopydefault = C23407hxe.Companion.copydefault(new ChainPickerParams(moduleDetailFragment.AhwBna().gEmmrt().getValue()));
        moduleDetailFragment.AYXKKw = c23407hxeCopydefault;
        if (c23407hxeCopydefault != null) {
            FragmentManager childFragmentManager = moduleDetailFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c23407hxeCopydefault.show(childFragmentManager);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC23406hxd
    public void KWHzl(@NotNull MarketChainBean marketChainBean) {
        ImageView imageView;
        Intrinsics.checkNotNullParameter(marketChainBean, "");
        C21485hBc c21485hBc = this.gEmmrt;
        if (c21485hBc != null && (imageView = c21485hBc.djBIcL) != null) {
            if (Intrinsics.EZpvd((Object) marketChainBean.getChainId(), (Object) "-100")) {
                imageView.setImageResource(C52761wXj.TaskDescription.createSocket);
            } else {
                C57659ymb.EZpvd(imageView, marketChainBean.getChainLogo(), C52761wXj.TaskDescription.dzCpvv);
            }
        }
        AhwBna().AEQbTJ(Intrinsics.EZpvd((Object) marketChainBean.getChainId(), (Object) "-100") ? "all" : marketChainBean.getChainId());
    }

    public final void KWHzl(C21485hBc c21485hBc) {
        ViewPager viewPager = c21485hBc.QbewEr;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        viewPager.setAdapter(new StateListAnimator(this, childFragmentManager));
        viewPager.setOffscreenPageLimit(TimeType.Companion.AEQbTJ());
        C55244xgL c55244xgL = c21485hBc.AEQbTJ;
        c55244xgL.setOKDSSize(-5);
        c55244xgL.setStyle(2);
        c55244xgL.setupWithViewPager(c21485hBc.QbewEr);
        c55244xgL.EZpvd(c55244xgL.KWHzl(r1.AEQbTJ() - 1));
        LoaderManager loaderManager = new LoaderManager();
        c55244xgL.copydefault(loaderManager);
        this.AkhnZx = loaderManager;
    }

    public static final class LoaderManager implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public LoaderManager() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                ModuleDetailFragment.this.djBIcL().AEQbTJ(TimeType.Companion.EZpvd(tab.getPosition()));
            }
        }
    }

    public final void EZpvd(C28899kjV c28899kjV) {
        String str;
        C21485hBc c21485hBc = this.gEmmrt;
        if (c21485hBc != null) {
            InterfaceC28933kkC value = AhwBna().KWHzl().getValue();
            InterfaceC28933kkC.TaskDescription taskDescription = value instanceof InterfaceC28933kkC.TaskDescription ? (InterfaceC28933kkC.TaskDescription) value : null;
            ModuleInfo moduleInfoEZpvd = taskDescription != null ? taskDescription.EZpvd() : null;
            ConstraintLayout constraintLayout = c21485hBc.KWHzl;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            boolean z = false;
            constraintLayout.setVisibility(0);
            ConstraintLayout constraintLayout2 = c21485hBc.fIwbmz;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(8);
            final String strValues = c28899kjV.values();
            if (!(!StringsKt__StringsKt.fARcdN((CharSequence) strValues)) || Intrinsics.EZpvd((Object) strValues, (Object) "--")) {
                strValues = null;
            }
            if (strValues == null) {
                if (moduleInfoEZpvd == null || (strValues = moduleInfoEZpvd.djBIcL()) == null || !(!StringsKt__StringsKt.fARcdN((CharSequence) strValues))) {
                    strValues = null;
                }
                if (strValues == null) {
                    strValues = c28899kjV.values();
                }
            }
            final String strOLrzqt = c28899kjV.OLrzqt();
            if (!(!StringsKt__StringsKt.fARcdN((CharSequence) strOLrzqt))) {
                strOLrzqt = null;
            }
            if (strOLrzqt == null) {
                strOLrzqt = moduleInfoEZpvd != null ? moduleInfoEZpvd.AEQbTJ() : null;
                if (strOLrzqt == null) {
                    strOLrzqt = "";
                }
            }
            boolean zAhwBna = moduleInfoEZpvd != null ? moduleInfoEZpvd.AhwBna() : false;
            String strAEQbTJ = c28899kjV.AEQbTJ();
            if (!(!StringsKt__StringsKt.fARcdN((CharSequence) strAEQbTJ))) {
                strAEQbTJ = null;
            }
            if (strAEQbTJ == null) {
                String strCopydefault = moduleInfoEZpvd != null ? moduleInfoEZpvd.copydefault() : null;
                str = strCopydefault == null ? "" : strCopydefault;
            } else {
                str = strAEQbTJ;
            }
            c21485hBc.QfsBiF.setText(strValues);
            c21485hBc.AhwBna.setVisibility(0);
            c21485hBc.fetchVPNInfo.setVisibility(0);
            c21485hBc.values.setVisibility(0);
            c21485hBc.aKErDB.setVisibility(0);
            c21485hBc.aKErDB.setVisibility(0);
            ImageView imageView = c21485hBc.valueOf;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            if ((!StringsKt__StringsKt.fARcdN((CharSequence) strOLrzqt)) && !zAhwBna) {
                z = true;
            }
            C25352ivB.OLrzqt(imageView, z);
            C25352ivB.setOnDoubleCheckClickListener$default(c21485hBc.valueOf, 0L, new Function1() { // from class: o.kkD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ModuleDetailFragment.KWHzl(this.EZpvd, strValues, strOLrzqt, (android.view.View) obj);
                }
            }, 1, null);
            TextView textView = c21485hBc.AwvSrB;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            kLY.formatPercentage$default(textView, str, DisplaySign.EXCEPT_ZERO, Float.valueOf(-99.999f), Float.valueOf(99999.0f), null, 16, null);
            c21485hBc.QUSxYX.setText(StringsKt__StringsKt.fARcdN((CharSequence) c28899kjV.fetchVPNInfo()) ? "--" : C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, c28899kjV.fetchVPNInfo(), true, RoundingMode.DOWN, true, false, false, false, null, false, false, 496, null));
            c21485hBc.QOLQEE.setText(StringsKt__StringsKt.fARcdN((CharSequence) c28899kjV.gEmmrt()) ? "--" : C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, c28899kjV.gEmmrt(), true, RoundingMode.DOWN, false, false, false, false, null, false, false, 500, null));
            c21485hBc.QVAiDq.setText(pTD.KWHzl(this, C23274hvD.FragmentManager.ejfBZ, C33129mqd.AhwBna(c28899kjV.DbNXlk()), ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("num", Integer.valueOf(C33129mqd.AhwBna(c28899kjV.DbNXlk()))))));
            KWHzl(c28899kjV.copydefault(), c28899kjV.EZpvd());
        }
    }

    public static final Unit KWHzl(ModuleDetailFragment moduleDetailFragment, String str, String str2, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Context context = moduleDetailFragment.getContext();
        if (context != null) {
            C25352ivB.OLrzqt(context, str, str2, C23274hvD.Fragment.buildRccMetadata);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(C28899kjV c28899kjV) {
        C28899kjV c28899kjV2;
        ModuleInfo moduleInfoEZpvd;
        String str;
        C21485hBc c21485hBc = this.gEmmrt;
        if (c21485hBc != null) {
            InterfaceC28933kkC value = AhwBna().KWHzl().getValue();
            InterfaceC28933kkC.TaskDescription taskDescription = value instanceof InterfaceC28933kkC.TaskDescription ? (InterfaceC28933kkC.TaskDescription) value : null;
            if (taskDescription != null) {
                moduleInfoEZpvd = taskDescription.EZpvd();
                c28899kjV2 = c28899kjV;
            } else {
                c28899kjV2 = c28899kjV;
                moduleInfoEZpvd = null;
            }
            AEQbTJ(this, c21485hBc, c28899kjV2, moduleInfoEZpvd);
            String strAEQbTJ = c28899kjV.AEQbTJ();
            if (!(!StringsKt__StringsKt.fARcdN((CharSequence) strAEQbTJ))) {
                strAEQbTJ = null;
            }
            if (strAEQbTJ != null) {
                str = strAEQbTJ;
            } else {
                String strCopydefault = moduleInfoEZpvd != null ? moduleInfoEZpvd.copydefault() : null;
                if (strCopydefault == null) {
                    strAEQbTJ = "";
                    str = strAEQbTJ;
                } else {
                    str = strCopydefault;
                }
            }
            TextView textView = c21485hBc.uzCIH;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            kLY.formatPercentage$default(textView, str, DisplaySign.EXCEPT_ZERO, Float.valueOf(-99.999f), Float.valueOf(99999.0f), null, 16, null);
            TextView textView2 = c21485hBc.AubY;
            C23272hvB c23272hvB = C23272hvB.KWHzl;
            String strFetchVPNInfo = c28899kjV.fetchVPNInfo();
            RoundingMode roundingMode = RoundingMode.DOWN;
            textView2.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, strFetchVPNInfo, true, roundingMode, true, false, false, false, null, false, false, 496, null));
            c21485hBc.getNewProxyInstance.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, c28899kjV.gEmmrt(), true, roundingMode, false, false, false, false, null, false, false, 500, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AEQbTJ(ModuleDetailFragment moduleDetailFragment, C21485hBc c21485hBc, C28899kjV c28899kjV, ModuleInfo moduleInfo) {
        String strKWHzl;
        if (moduleDetailFragment.DbNXlk) {
            return;
        }
        moduleDetailFragment.DbNXlk = true;
        ConstraintLayout constraintLayout = c21485hBc.fIwbmz;
        String str = "";
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(0);
        ConstraintLayout constraintLayout2 = c21485hBc.KWHzl;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        constraintLayout2.setVisibility(8);
        String strValues = c28899kjV.values();
        if (!(!StringsKt__StringsKt.fARcdN((CharSequence) strValues)) || Intrinsics.EZpvd((Object) strValues, (Object) "--")) {
            strValues = null;
        }
        if (strValues == null) {
            strValues = moduleInfo != null ? moduleInfo.djBIcL() : null;
            if (strValues == null) {
                strValues = c28899kjV.values();
            }
        }
        c21485hBc.AuCTelauCTel.setText(strValues);
        String strAYXKKw = C33492mxV.OLrzqt() ? c28899kjV.AYXKKw() : c28899kjV.valueOf();
        if (C33492mxV.OLrzqt()) {
            strKWHzl = moduleInfo != null ? moduleInfo.EZpvd() : null;
        } else if (moduleInfo != null) {
            strKWHzl = moduleInfo.KWHzl();
        }
        if (strAYXKKw != null) {
            if (!C33129mqd.OLrzqt((CharSequence) strAYXKKw)) {
                strAYXKKw = null;
            }
            if (strAYXKKw != null) {
                strKWHzl = strAYXKKw;
            }
        }
        if (C33129mqd.OLrzqt((CharSequence) strKWHzl)) {
            ImageView imageView = c21485hBc.AhwBna;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            ImageView imageView2 = c21485hBc.AhwBna;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            C33054mpH.AEQbTJ(imageView2, strKWHzl);
        } else {
            ImageView imageView3 = c21485hBc.AhwBna;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            imageView3.setVisibility(8);
        }
        String strOLrzqt = c28899kjV.OLrzqt();
        if (!(!StringsKt__StringsKt.fARcdN((CharSequence) strOLrzqt))) {
            strOLrzqt = null;
        }
        if (strOLrzqt == null) {
            String strAEQbTJ = moduleInfo != null ? moduleInfo.AEQbTJ() : null;
            if (strAEQbTJ != null) {
                str = strAEQbTJ;
            }
        } else {
            str = strOLrzqt;
        }
        c21485hBc.fJNWhG.setDescriptionTextStyle(C52761wXj.LoaderManager.KWHzl, C52761wXj.Activity.DCUTEIddSDPG, 24.0f);
        c21485hBc.fJNWhG.setMarginRequiredOnIvWhenClosed(8.0f);
        c21485hBc.fJNWhG.setDescription(str, true);
    }

    public final void AEQbTJ(C28899kjV c28899kjV) {
        C21485hBc c21485hBc = this.gEmmrt;
        if (c21485hBc != null) {
            InterfaceC28933kkC value = AhwBna().KWHzl().getValue();
            InterfaceC28933kkC.TaskDescription taskDescription = value instanceof InterfaceC28933kkC.TaskDescription ? (InterfaceC28933kkC.TaskDescription) value : null;
            copydefault(this, c21485hBc, c28899kjV, taskDescription != null ? taskDescription.EZpvd() : null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void copydefault(final ModuleDetailFragment moduleDetailFragment, C21485hBc c21485hBc, C28899kjV c28899kjV, ModuleInfo moduleInfo) {
        String strKWHzl;
        if (moduleDetailFragment.DbNXlk) {
            return;
        }
        moduleDetailFragment.DbNXlk = true;
        ConstraintLayout constraintLayout = c21485hBc.fIwbmz;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(0);
        ConstraintLayout constraintLayout2 = c21485hBc.KWHzl;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        constraintLayout2.setVisibility(8);
        String strValues = c28899kjV.values();
        if (!(!StringsKt__StringsKt.fARcdN((CharSequence) strValues)) || Intrinsics.EZpvd((Object) strValues, (Object) "--")) {
            strValues = null;
        }
        if (strValues == null) {
            strValues = moduleInfo != null ? moduleInfo.djBIcL() : null;
            if (strValues == null) {
                strValues = c28899kjV.values();
            }
        }
        c21485hBc.AuCTelauCTel.setText(strValues);
        String strAYXKKw = C33492mxV.OLrzqt() ? c28899kjV.AYXKKw() : c28899kjV.valueOf();
        if (C33492mxV.OLrzqt()) {
            strKWHzl = moduleInfo != null ? moduleInfo.EZpvd() : null;
        } else if (moduleInfo != null) {
            strKWHzl = moduleInfo.KWHzl();
        }
        if (strAYXKKw != null) {
            if (!C33129mqd.OLrzqt((CharSequence) strAYXKKw)) {
                strAYXKKw = null;
            }
            if (strAYXKKw != null) {
                strKWHzl = strAYXKKw;
            }
        }
        if (C33129mqd.OLrzqt((CharSequence) strKWHzl)) {
            ImageView imageView = c21485hBc.AhwBna;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            ImageView imageView2 = c21485hBc.AhwBna;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            C33054mpH.AEQbTJ(imageView2, strKWHzl);
        } else {
            ImageView imageView3 = c21485hBc.AhwBna;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            imageView3.setVisibility(8);
        }
        String strOLrzqt = c28899kjV.OLrzqt();
        if (!(!StringsKt__StringsKt.fARcdN((CharSequence) strOLrzqt))) {
            strOLrzqt = null;
        }
        if (strOLrzqt == null) {
            strOLrzqt = moduleInfo != null ? moduleInfo.AEQbTJ() : null;
            if (strOLrzqt == null) {
                strOLrzqt = "";
            }
        }
        c21485hBc.fJNWhG.setDescriptionTextStyle(C52761wXj.LoaderManager.KWHzl, C52761wXj.Activity.DCUTEIddSDPG, 24.0f);
        c21485hBc.fJNWhG.setMarginRequiredOnIvWhenClosed(2.0f);
        c21485hBc.fJNWhG.setDescription(strOLrzqt, false);
        TextView textView = c21485hBc.uzCIH;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        TextView textView2 = c21485hBc.AubY;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
        TextView textView3 = c21485hBc.getNewProxyInstance;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(8);
        TextView textView4 = c21485hBc.getFieldNames;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        textView4.setVisibility(8);
        TextView textView5 = c21485hBc.zsXlph;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        textView5.setVisibility(8);
        TextView textView6 = c21485hBc.iwGUEr;
        Intrinsics.checkNotNullExpressionValue(textView6, "");
        textView6.setVisibility(8);
        c21485hBc.zuBGHE.setVisibility(0);
        C25352ivB.setOnDoubleCheckClickListener$default(c21485hBc.zuBGHE, 0L, new Function1() { // from class: o.kkH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ModuleDetailFragment.copydefault(this.EZpvd, (android.view.View) obj);
            }
        }, 1, null);
        if (c28899kjV.KWHzl() == null || c28899kjV.KWHzl().length() == 0) {
            C52794wYp c52794wYp = c21485hBc.copydefault;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(8);
        } else {
            FragmentActivity activity = moduleDetailFragment.getActivity();
            if (activity != null) {
                float fDp2px$default = C55298xhM.dp2px$default(36.0f, null, 1, null);
                C52794wYp c52794wYp2 = c21485hBc.copydefault;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(fDp2px$default);
                gradientDrawable.setColor(C25382ivf.copydefault(C52761wXj.Activity.invokespecialDPHOMC, activity));
                c52794wYp2.setBackground(gradientDrawable);
                C52794wYp c52794wYp3 = c21485hBc.copydefault;
                Intrinsics.checkNotNullExpressionValue(c52794wYp3, "");
                c52794wYp3.setVisibility(0);
                C52794wYp c52794wYp4 = c21485hBc.copydefault;
                c52794wYp4.setOnClickListener(new ActionBar(c52794wYp4, 1000L, activity, c28899kjV));
            }
        }
        if (c28899kjV.djBIcL() == null || c28899kjV.djBIcL().isEmpty()) {
            LinearLayout linearLayout = c21485hBc.hDKMBd.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(8);
            return;
        }
        LinearLayout linearLayout2 = c21485hBc.hDKMBd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout2.setVisibility(0);
        c21485hBc.hDKMBd.OLrzqt.setCarouselItems(c28899kjV.djBIcL(), new Function1() { // from class: o.kkN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ModuleDetailFragment.AEQbTJ((android.content.Context) obj);
            }
        }, new Function1() { // from class: o.kkK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ModuleDetailFragment.copydefault(this.EZpvd, (ModuleBoostTokenData) obj);
            }
        }, C29019klj.Companion.EZpvd());
        ViewGroup.LayoutParams layoutParams = c21485hBc.djSkpj.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = moduleDetailFragment.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.ORxRYg);
            c21485hBc.djSkpj.setLayoutParams(marginLayoutParams);
        }
    }

    public static final Unit copydefault(ModuleDetailFragment moduleDetailFragment, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C28984klA c28984klA = new C28984klA();
        FragmentManager childFragmentManager = moduleDetailFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c28984klA.show(childFragmentManager);
        C32866mlf.onEvent$default("DEX_Boost_Section_Click", (TrackChannel[]) null, new Function1() { // from class: o.kkM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ModuleDetailFragment.KWHzl((EventParamsList) obj);
            }
        }, 1, (Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, RemoteMessageConst.Notification.ICON, "info_icon", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final class Activity implements Function1<AbstractC43238rlX, Unit> {
        public static final Activity OLrzqt = new Activity();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(AbstractC43238rlX abstractC43238rlX) {
            Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(AbstractC43238rlX abstractC43238rlX) {
            copydefault(abstractC43238rlX);
            return Unit.INSTANCE;
        }
    }

    public static final Object AEQbTJ(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return new C29024klo(context, null, 0, 6, null);
    }

    public static final Unit copydefault(ModuleDetailFragment moduleDetailFragment, final ModuleBoostTokenData moduleBoostTokenData) {
        Intrinsics.checkNotNullParameter(moduleBoostTokenData, "");
        Context context = moduleDetailFragment.getContext();
        if (context != null) {
            C25352ivB.openMarketDetailPage$default(context, "default_trade", new TokenBase(C33129mqd.gEmmrt(moduleBoostTokenData.getChainId()), C33129mqd.gEmmrt(moduleBoostTokenData.getTokenAddress()), C33129mqd.gEmmrt(moduleBoostTokenData.getTokenLogo()), null, null, C33129mqd.gEmmrt(moduleBoostTokenData.getTokenName()), null, 0, 0, 0, 0, null, "module_list", null, null, null, null, 0, 0, false, null, null, false, false, null, moduleDetailFragment.AhwBna().OLrzqt(), null, 0, false, null, null, false, -33558568, null), C21847hOn.OLrzqt(moduleDetailFragment.AhwBna().copydefault()), null, new int[0], 8, null);
        }
        C32866mlf.onEvent$default("DEX_Boost_Section_Click", (TrackChannel[]) null, new Function1() { // from class: o.kkI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ModuleDetailFragment.copydefault(moduleBoostTokenData, (EventParamsList) obj);
            }
        }, 1, (Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ModuleBoostTokenData moduleBoostTokenData, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "listed_token", C33129mqd.gEmmrt(moduleBoostTokenData.getTokenAddress()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void renderError$default(ModuleDetailFragment moduleDetailFragment, C28899kjV c28899kjV, int i, Object obj) {
        if ((i & 1) != 0) {
            c28899kjV = null;
        }
        moduleDetailFragment.KWHzl(c28899kjV);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(C28899kjV c28899kjV) {
        String strAEQbTJ;
        String strOLrzqt;
        C21485hBc c21485hBc = this.gEmmrt;
        if (c21485hBc != null) {
            InterfaceC28933kkC value = AhwBna().KWHzl().getValue();
            InterfaceC28933kkC.TaskDescription taskDescription = value instanceof InterfaceC28933kkC.TaskDescription ? (InterfaceC28933kkC.TaskDescription) value : null;
            ModuleInfo moduleInfoEZpvd = taskDescription != null ? taskDescription.EZpvd() : null;
            if (c28899kjV == null || (strOLrzqt = c28899kjV.OLrzqt()) == null) {
                strAEQbTJ = moduleInfoEZpvd != null ? moduleInfoEZpvd.AEQbTJ() : "";
            } else {
                strAEQbTJ = StringsKt__StringsKt.fARcdN((CharSequence) strOLrzqt) ^ true ? strOLrzqt : null;
                if (strAEQbTJ == null) {
                }
            }
            boolean zAhwBna = moduleInfoEZpvd != null ? moduleInfoEZpvd.AhwBna() : false;
            c21485hBc.OLrzqt.setExpanded(true, true);
            c21485hBc.fetchVPNInfo.setVisibility(8);
            c21485hBc.values.setVisibility(8);
            c21485hBc.aKErDB.setVisibility(8);
            c21485hBc.dNCPSb.setBackgroundColor(C25382ivf.KWHzl(C52761wXj.Activity.invokespecialODCBUN));
            c21485hBc.RcXXUw.setBackgroundColor(C25382ivf.KWHzl(C52761wXj.Activity.invokespecialODCBUN));
            c21485hBc.AwvSrB.setText("--");
            Context context = getContext();
            if (context != null) {
                c21485hBc.AwvSrB.setTextColor(C25382ivf.KWHzl(context, C52761wXj.Activity.fdOvFl));
            }
            c21485hBc.QUSxYX.setText("--");
            c21485hBc.QOLQEE.setText("--");
            c21485hBc.QVAiDq.setText(pTD.KWHzl(this, C23274hvD.FragmentManager.ejfBZ, 0, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("num", "0"))));
            ImageView imageView = c21485hBc.valueOf;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C25352ivB.OLrzqt(imageView, (StringsKt__StringsKt.fARcdN((CharSequence) strAEQbTJ) ^ true) && !zAhwBna);
        }
    }

    public final void KWHzl(String str, String str2) {
        C21485hBc c21485hBc = this.gEmmrt;
        if (c21485hBc != null) {
            View view = c21485hBc.dNCPSb;
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            view.setBackgroundColor(C33512mxp.tradeRiseGraph$default(c33512mxp, contextRequireContext, 0.0f, 2, null));
            View view2 = c21485hBc.RcXXUw;
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            view2.setBackgroundColor(C33512mxp.tradeFallGraph$default(c33512mxp, contextRequireContext2, 0.0f, 2, null));
            int iDp2px$default = C55298xhM.dp2px$default(0.0f, null, 1, null);
            int iDp2px$default2 = C55298xhM.dp2px$default(6.0f, null, 1, null);
            Float fFIwbmz = C59443zhD.fIwbmz(str);
            Float fValueOf = Float.valueOf(fFIwbmz != null ? fFIwbmz.floatValue() : 0.0f);
            if (fValueOf.floatValue() <= 2.0f) {
                fValueOf = null;
            }
            c21485hBc.dNCPSb.setLayoutParams(new LinearLayout.LayoutParams(iDp2px$default, iDp2px$default2, fValueOf != null ? fValueOf.floatValue() : 2.0f));
            c21485hBc.OcIXYQ.setText(C33069mpW.copydefault(this, C23274hvD.Fragment.arDRxL, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("percentage", C23311hvo.formatPercentWithoutSymbol$default(str, false, 0, null, true, 0, 7, null)))));
            int iDp2px$default3 = C55298xhM.dp2px$default(0.0f, null, 1, null);
            int iDp2px$default4 = C55298xhM.dp2px$default(6.0f, null, 1, null);
            Float fFIwbmz2 = C59443zhD.fIwbmz(str2);
            Float fValueOf2 = Float.valueOf(fFIwbmz2 != null ? fFIwbmz2.floatValue() : 0.0f);
            Float f = fValueOf2.floatValue() > 2.0f ? fValueOf2 : null;
            c21485hBc.RcXXUw.setLayoutParams(new LinearLayout.LayoutParams(iDp2px$default3, iDp2px$default4, f != null ? f.floatValue() : 2.0f));
            c21485hBc.QKVWgx.setText(C33069mpW.copydefault(this, C23274hvD.Fragment.ddauOi, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("percentage", C23311hvo.formatPercentWithoutSymbol$default(str2, false, 0, null, true, 0, 7, null)))));
        }
    }

    private final void values() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C9706bae c9706baeAEQbTJ = AEQbTJ();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            C9706bae.handleIfNeeded$default(c9706baeAEQbTJ, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), activity, "dex/market/homecustomlist", null, 8, null);
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public final class StateListAnimator extends FragmentStatePagerAdapter {
        public final FragmentManager AEQbTJ;
        public final /* synthetic */ ModuleDetailFragment KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull ModuleDetailFragment moduleDetailFragment, FragmentManager fragmentManager) {
            super(fragmentManager);
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            this.KWHzl = moduleDetailFragment;
            this.AEQbTJ = fragmentManager;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return TimeType.Companion.AEQbTJ();
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        public Fragment getItem(int i) {
            return C28953kkW.Companion.AEQbTJ(TimeType.Companion.EZpvd(i), this.KWHzl.AhwBna().copydefault());
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i) {
            return C33070mpX.AYXKKw(TimeType.Companion.OLrzqt(i));
        }
    }

    public static final Unit KWHzl(ShareLinkVO shareLinkVO, ModuleDetailFragment moduleDetailFragment, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) CollectionsKt___CollectionsKt.AkhnZx(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).gEmmrt().copydefault(), 0);
        String strDbNXlk = interfaceC9738bbJ != null ? interfaceC9738bbJ.DbNXlk() : null;
        String str = strDbNXlk == null ? "" : strDbNXlk;
        Web3ShareModel.Application application = Web3ShareModel.Companion;
        String webUrl = shareLinkVO.getWebUrl();
        Intrinsics.copydefault((Object) webUrl);
        String deeplink = shareLinkVO.getDeeplink();
        Intrinsics.copydefault((Object) deeplink);
        Web3ShareModel web3ShareModelEZpvd = application.EZpvd(webUrl, deeplink, "DEX_Market_Tokenlist", (40 & 8) != 0 ? null : null, str, (40 & 32) != 0 ? null : WalletReferralSource.MARKET_LIST);
        Web3ShareService web3ShareService = (Web3ShareService) C43251rlk.copydefault(Web3ShareService.class);
        FragmentActivity activity = moduleDetailFragment.getActivity();
        Intrinsics.copydefault(activity, "");
        Web3ShareService.Application.share$default(web3ShareService, (AbstractActivityC33041mov) activity, web3ShareModelEZpvd, null, 4, null);
        if (Intrinsics.EZpvd(moduleDetailFragment.valueOf, Boolean.TRUE)) {
            C32866mlf.onEvent$default("DEX_Boost_Section_Click", (TrackChannel[]) null, new Function1() { // from class: o.kkO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ModuleDetailFragment.OLrzqt((EventParamsList) obj);
                }
            }, 1, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
