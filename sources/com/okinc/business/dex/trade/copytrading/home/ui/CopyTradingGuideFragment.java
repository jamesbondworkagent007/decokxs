package com.okinc.business.dex.trade.copytrading.home.ui;

import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingGuideFragment;
import com.okinc.business.dex.trade.copytrading.home.viewmodel.CopyTradingGuideVM;
import com.okinc.business.dex.utils.CDNSourceManager;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C21518hCi;
import o.C22361hds;
import o.C23274hvD;
import o.C25382ivf;
import o.C25389ivm;
import o.C25390ivn;
import o.C33069mpW;
import o.C33070mpX;
import o.C33574myy;
import o.C43251rlk;
import o.C52761wXj;
import o.C52794wYp;
import o.C55296xhK;
import o.C56390yDp;
import o.C56392yDr;
import o.C56423yEv;
import o.C56524yIo;
import o.InterfaceC54856xXw;
import o.InterfaceC54859xXz;
import o.InterfaceC56387yDm;
import o.gLQ;
import o.gSN;
import o.gTI;
import o.gVZ;
import o.rVN;
import o.xWO;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingGuideFragment extends gVZ<C21518hCi> {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final ActivityResultLauncher<gSN.Application> AEQbTJ;
    public final InterfaceC56387yDm copydefault;

    @yCM
    public gTI editStrategyNavigator;

    public static final void OLrzqt(gSN.StateListAnimator stateListAnimator) {
    }

    public CopyTradingGuideFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingGuideFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingGuideFragment$special$$inlined$viewModels$default$2
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CopyTradingGuideVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingGuideFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingGuideFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingGuideFragment$special$$inlined$viewModels$default$5
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
        ActivityResultLauncher<gSN.Application> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new gSN(), new ActivityResultCallback() { // from class: o.gUZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                CopyTradingGuideFragment.OLrzqt((gSN.StateListAnimator) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AEQbTJ = activityResultLauncherRegisterForActivityResult;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingGuideFragment.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final CopyTradingGuideFragment copydefault() {
            return new CopyTradingGuideFragment();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CopyTradingGuideVM AYXKKw() {
        return (CopyTradingGuideVM) this.copydefault.getValue();
    }

    /* JADX DEBUG: Possible override for method o.gVZ.OLrzqt()V */
    public final gTI OLrzqt() {
        gTI gti = this.editStrategyNavigator;
        if (gti != null) {
            return gti;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.hTH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C21518hCi OLrzqt(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21518hCi c21518hCiEZpvd = C21518hCi.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21518hCiEZpvd, "");
        return c21518hCiEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.hTH
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C21518hCi c21518hCi, Bundle bundle) {
        Intrinsics.checkNotNullParameter(c21518hCi, "");
        AYXKKw().copydefault();
        c21518hCi.getRoot().setContentDescription("web3_dex_copytrading_guide_container");
        c21518hCi.copydefault.setContentDescription("web3_dex_copytrading_guide_connect_btn");
        LottieAnimationView lottieAnimationView = c21518hCi.AhwBna;
        Intrinsics.checkNotNullExpressionValue(lottieAnimationView, "");
        C22361hds.OLrzqt(lottieAnimationView, CDNSourceManager.LottieSource.TradeCopyTradeGuide);
        String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.Dfv);
        c21518hCi.valueOf.setText(C33574myy.setupSpanStyles$default(C33069mpW.copydefault(C23274hvD.Fragment.fsw, C56423yEv.EZpvd(C56390yDp.OLrzqt("highlight", strAYXKKw))), new String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.gVa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CopyTradingGuideFragment.OLrzqt((java.util.List) obj);
            }
        }, 14, null));
        C52794wYp c52794wYp = c21518hCi.copydefault;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        KWHzl();
        c21518hCi.getRoot().post(new Runnable() { // from class: o.gUY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                CopyTradingGuideFragment.copydefault(this.AEQbTJ);
            }
        });
    }

    public static final Unit OLrzqt(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new ForegroundColorSpan(C25382ivf.KWHzl(C52761wXj.Activity.dvKsVJ)));
        return Unit.INSTANCE;
    }

    public static final void copydefault(CopyTradingGuideFragment copyTradingGuideFragment) {
        rVN.reportFullyDrawn$default((Fragment) copyTradingGuideFragment, true, (String) null, 2, (Object) null);
    }

    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(gLQ glq, Continuation<? super Unit> continuation) {
            CopyTradingGuideFragment.this.KWHzl();
            return Unit.INSTANCE;
        }
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().AEQbTJ(), null, new Application(), 2, null);
    }

    @Override // o.hTH, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        KWHzl();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd() {
        NestedScrollView nestedScrollViewAEQbTJ;
        C21518hCi c21518hCi = (C21518hCi) fARcdN();
        if (c21518hCi == null || (nestedScrollViewAEQbTJ = c21518hCi.getRoot()) == null || nestedScrollViewAEQbTJ.getContext() == null) {
            return;
        }
        if (!AYXKKw().OLrzqt()) {
            AEQbTJ();
        } else if (AYXKKw().KWHzl()) {
            OLrzqt().EZpvd(LifecycleOwnerKt.getLifecycleScope(this), this.AEQbTJ, (64 & 4) != 0 ? null : null, (64 & 8) != 0 ? null : null, (64 & 16) != 0 ? null : null, (64 & 32) != 0 ? DexTrackEventParameter.EditStrategyFrom.DASHBOARD : DexTrackEventParameter.EditStrategyFrom.DASHBOARD, (64 & 64) != 0 ? null : null);
        } else {
            C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CopyTradingGuideFragment$handlePrimaryClick$1(this, null), 3, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl() {
        C52794wYp c52794wYp;
        String strAYXKKw;
        C21518hCi c21518hCi = (C21518hCi) fARcdN();
        if (c21518hCi == null || (c52794wYp = c21518hCi.copydefault) == null) {
            return;
        }
        if (!AYXKKw().OLrzqt()) {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.apLTlu);
        } else if (!AYXKKw().KWHzl() && !(AYXKKw().AEQbTJ().getValue() instanceof gLQ.TaskDescription)) {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.QWpYiD);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.hGuIrQ);
        }
        c52794wYp.setText(strAYXKKw);
    }

    public final void AEQbTJ() {
        xWO xwo = (xWO) C43251rlk.copydefault(xWO.class);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        xWO.ActionBar.showConnectWalletDialog$default(xwo, childFragmentManager, new ActionBar(), (List) null, yDY.gEmmrt(UnsupportedWalletType.HardwareWallet, UnsupportedWalletType.MPCWallet, UnsupportedWalletType.PrivateKeyWallet), (InterfaceC54856xXw) null, 20, (Object) null);
    }

    public static final class ActionBar implements InterfaceC54859xXz {
        public ActionBar() {
        }

        @Override // o.InterfaceC54859xXz
        public void EZpvd() {
            CopyTradingGuideFragment.this.KWHzl();
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ CopyTradingGuideFragment EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, CopyTradingGuideFragment copyTradingGuideFragment) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = copyTradingGuideFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.EZpvd();
            }
        }
    }
}
