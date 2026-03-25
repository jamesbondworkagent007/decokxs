package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ben, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9927ben extends AbstractC14668dpm {
    public final InterfaceC56387yDm AhwBna;
    public AbstractC16535elk EZpvd;
    public final C59534zip KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public Function1<? super java.lang.Boolean, Unit> copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    public C9927ben() {
        final Function0 function0 = new Function0() { // from class: o.bem
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C9927ben.AYXKKw(this.KWHzl);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.assets.coinmanagement.ChainUpdateBottomSubFragment$special$$inlined$viewModels$default$1
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C9936bew.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.assets.coinmanagement.ChainUpdateBottomSubFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.assets.coinmanagement.ChainUpdateBottomSubFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.assets.coinmanagement.ChainUpdateBottomSubFragment$special$$inlined$viewModels$default$4
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
        this.KWHzl = new C59534zip();
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.ber
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C9927ben.AhwBna(this.OLrzqt);
            }
        });
    }

    /* JADX INFO: renamed from: o.ben$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ben.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C9927ben AEQbTJ(long j) {
            C9927ben c9927ben = new C9927ben();
            c9927ben.ensureArguments().putLong("coinId", j);
            return c9927ben;
        }

        public final C9927ben OLrzqt(long j) {
            C9927ben c9927ben = new C9927ben();
            c9927ben.ensureArguments().putLong("real_chain_id", j);
            return c9927ben;
        }
    }

    public static final ViewModelStoreOwner AYXKKw(C9927ben c9927ben) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c9927ben.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C9936bew KWHzl() {
        return (C9936bew) this.AhwBna.getValue();
    }

    /* JADX INFO: renamed from: o.ben$ActionBar */
    public static final class ActionBar implements WalletUpdateWorker.TaskDescription {
        public ActionBar() {
        }

        @Override // com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.TaskDescription
        public void KWHzl() {
            C9927ben.this.dismissLoading();
            C9927ben.this.KWHzl().OLrzqt();
            AbstractC16535elk abstractC16535elk = C9927ben.this.EZpvd;
            AbstractC16535elk abstractC16535elk2 = null;
            if (abstractC16535elk == null) {
                Intrinsics.gEmmrt("");
                abstractC16535elk = null;
            }
            android.widget.TextView textView = abstractC16535elk.AhwBna;
            C9927ben c9927ben = C9927ben.this;
            int i = C13754dXa.FragmentManager.OnBackPressedDispatcherKt;
            C10854bwM c10854bwMKWHzl = c9927ben.KWHzl().KWHzl();
            java.lang.String strDjBIcL = c10854bwMKWHzl != null ? c10854bwMKWHzl.djBIcL() : null;
            if (strDjBIcL == null) {
                strDjBIcL = "";
            }
            textView.setText(pTD.copydefault(c9927ben, i, C56423yEv.EZpvd(C56390yDp.OLrzqt("chain_name", strDjBIcL))));
            AbstractC16535elk abstractC16535elk3 = C9927ben.this.EZpvd;
            if (abstractC16535elk3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16535elk3 = null;
            }
            abstractC16535elk3.getRoot().getLayoutParams().height = -2;
            AbstractC16535elk abstractC16535elk4 = C9927ben.this.EZpvd;
            if (abstractC16535elk4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16535elk4 = null;
            }
            android.view.View root = abstractC16535elk4.getRoot();
            AbstractC16535elk abstractC16535elk5 = C9927ben.this.EZpvd;
            if (abstractC16535elk5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16535elk5 = null;
            }
            root.setLayoutParams(abstractC16535elk5.getRoot().getLayoutParams());
            AbstractC16535elk abstractC16535elk6 = C9927ben.this.EZpvd;
            if (abstractC16535elk6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16535elk6 = null;
            }
            abstractC16535elk6.djBIcL.setVisibility(0);
            AbstractC16535elk abstractC16535elk7 = C9927ben.this.EZpvd;
            if (abstractC16535elk7 == null) {
                Intrinsics.gEmmrt("");
                abstractC16535elk7 = null;
            }
            abstractC16535elk7.copydefault.setVisibility(0);
            AbstractC16535elk abstractC16535elk8 = C9927ben.this.EZpvd;
            if (abstractC16535elk8 == null) {
                Intrinsics.gEmmrt("");
                abstractC16535elk8 = null;
            }
            abstractC16535elk8.valueOf.setVisibility(8);
            AbstractC16535elk abstractC16535elk9 = C9927ben.this.EZpvd;
            if (abstractC16535elk9 == null) {
                Intrinsics.gEmmrt("");
                abstractC16535elk9 = null;
            }
            abstractC16535elk9.OLrzqt.setVisibility(8);
            AbstractC16535elk abstractC16535elk10 = C9927ben.this.EZpvd;
            if (abstractC16535elk10 == null) {
                Intrinsics.gEmmrt("");
                abstractC16535elk10 = null;
            }
            abstractC16535elk10.AYXKKw.setVisibility(0);
            AbstractC16535elk abstractC16535elk11 = C9927ben.this.EZpvd;
            if (abstractC16535elk11 == null) {
                Intrinsics.gEmmrt("");
                abstractC16535elk11 = null;
            }
            android.widget.TextView textView2 = abstractC16535elk11.AYXKKw;
            C9927ben c9927ben2 = C9927ben.this;
            int i2 = C13754dXa.FragmentManager.setSupportProgressBarIndeterminateVisibility;
            C10854bwM c10854bwMKWHzl2 = c9927ben2.KWHzl().KWHzl();
            java.lang.String strDjBIcL2 = c10854bwMKWHzl2 != null ? c10854bwMKWHzl2.djBIcL() : null;
            if (strDjBIcL2 == null) {
                strDjBIcL2 = "";
            }
            textView2.setText(pTD.copydefault(c9927ben2, i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("chainName", strDjBIcL2))));
            ViewGroup.LayoutParams layoutParams = C9927ben.this.OLrzqt().AYXKKw.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.height = -2;
            layoutParams2.gravity = 80;
            C9927ben.this.OLrzqt().AYXKKw.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = C9927ben.this.OLrzqt().valueOf.getLayoutParams();
            layoutParams3.height = -2;
            C9927ben.this.OLrzqt().valueOf.setLayoutParams(layoutParams3);
            AbstractC16535elk abstractC16535elk12 = C9927ben.this.EZpvd;
            if (abstractC16535elk12 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16535elk2 = abstractC16535elk12;
            }
            abstractC16535elk2.EZpvd.setText(C9927ben.this.getString(C13754dXa.FragmentManager.registerOnBackInvokedCallback));
        }

        @Override // com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.TaskDescription
        public void EZpvd(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            C9927ben.this.dismissLoading();
            java.lang.String string = C9927ben.this.getString(C13754dXa.FragmentManager.addCallbackdefault);
            Intrinsics.checkNotNullExpressionValue(string, "");
            C55326xho.toastWithFailedIcon$default(string, 0, 1, (java.lang.Object) null);
        }
    }

    public final ActionBar EZpvd() {
        return (ActionBar) this.OLrzqt.getValue();
    }

    public static final ActionBar AhwBna(C9927ben c9927ben) {
        return c9927ben.new ActionBar();
    }

    @Override // o.AbstractC14668dpm
    public android.view.View AEQbTJ(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        OLrzqt(false);
        EZpvd(false);
        KWHzl(false);
        copydefault(false);
        OLrzqt(0);
        AbstractC16535elk abstractC16535elkCopydefault = AbstractC16535elk.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        this.EZpvd = abstractC16535elkCopydefault;
        AbstractC16535elk abstractC16535elk = null;
        if (abstractC16535elkCopydefault == null) {
            Intrinsics.gEmmrt("");
            abstractC16535elkCopydefault = null;
        }
        ViewGroup.LayoutParams layoutParams = abstractC16535elkCopydefault.getRoot().getLayoutParams();
        android.content.Context context = getContext();
        layoutParams.height = context != null ? (int) (((double) C55302xhQ.AEQbTJ(context)) * 0.86d) : -2;
        AbstractC16535elk abstractC16535elk2 = this.EZpvd;
        if (abstractC16535elk2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16535elk = abstractC16535elk2;
        }
        android.view.View root = abstractC16535elk.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.AbstractC57212yeE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        java.lang.Long lValueOf = arguments != null ? java.lang.Long.valueOf(arguments.getLong("coinId")) : null;
        android.os.Bundle arguments2 = getArguments();
        java.lang.Long lValueOf2 = arguments2 != null ? java.lang.Long.valueOf(arguments2.getLong("real_chain_id")) : null;
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 != null && arguments3.containsKey("coinId") && lValueOf != null) {
            KWHzl().EZpvd(lValueOf.longValue());
        } else {
            android.os.Bundle arguments4 = getArguments();
            if (arguments4 != null && arguments4.containsKey("real_chain_id") && lValueOf2 != null) {
                KWHzl().AEQbTJ(lValueOf2.longValue());
            }
        }
        AbstractC16535elk abstractC16535elk = this.EZpvd;
        if (abstractC16535elk == null) {
            Intrinsics.gEmmrt("");
            abstractC16535elk = null;
        }
        android.widget.TextView textView = abstractC16535elk.AhwBna;
        int i = C13754dXa.FragmentManager.OnBackPressedDispatcherApi33ImplExternalSyntheticLambda0;
        C10854bwM c10854bwMKWHzl = KWHzl().KWHzl();
        java.lang.String strDjBIcL = c10854bwMKWHzl != null ? c10854bwMKWHzl.djBIcL() : null;
        if (strDjBIcL == null) {
            strDjBIcL = "";
        }
        textView.setText(pTD.copydefault(this, i, C56423yEv.EZpvd(C56390yDp.OLrzqt("chain_name", strDjBIcL))));
        AbstractC16535elk abstractC16535elk2 = this.EZpvd;
        if (abstractC16535elk2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16535elk2 = null;
        }
        android.widget.ImageView imageView = abstractC16535elk2.djBIcL;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C10854bwM c10854bwMKWHzl2 = KWHzl().KWHzl();
        C33054mpH.KWHzl(imageView, c10854bwMKWHzl2 != null ? c10854bwMKWHzl2.AYXKKw() : null);
        AbstractC16535elk abstractC16535elk3 = this.EZpvd;
        if (abstractC16535elk3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16535elk3 = null;
        }
        abstractC16535elk3.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.bes
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C9927ben.EZpvd(this.KWHzl, view2);
            }
        });
        OLrzqt().AYXKKw.setBackgroundResource(C13754dXa.Activity.DsrFlB);
        AbstractC16535elk abstractC16535elk4 = this.EZpvd;
        if (abstractC16535elk4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16535elk4 = null;
        }
        abstractC16535elk4.valueOf.setAdapter(this.KWHzl);
        this.KWHzl.register(C9983bfq.class, new C10053bhG());
        C33064mpR.OLrzqt(this.KWHzl, KWHzl().EZpvd());
        WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).KWHzl(EZpvd());
        view.post(new java.lang.Runnable() { // from class: o.bep
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C9927ben.valueOf(this.EZpvd);
            }
        });
    }

    public static final void EZpvd(C9927ben c9927ben, android.view.View view) {
        if (c9927ben.KWHzl().AEQbTJ()) {
            Function1<? super java.lang.Boolean, Unit> function1 = c9927ben.copydefault;
            if (function1 != null) {
                function1.invoke(java.lang.Boolean.TRUE);
                return;
            }
            return;
        }
        c9927ben.AhwBna();
    }

    public static final void valueOf(C9927ben c9927ben) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c9927ben, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void AhwBna() {
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        new C14461dlr(childFragmentManager, "completeAddress-chainUpdateBottom", new Function1() { // from class: o.beo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C9927ben.AEQbTJ(this.copydefault, (java.lang.String) obj);
            }
        }, null, null, false, 48, null).EZpvd();
    }

    public static final Unit AEQbTJ(C9927ben c9927ben, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c9927ben.showLoading();
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).EZpvd(EZpvd());
    }
}
