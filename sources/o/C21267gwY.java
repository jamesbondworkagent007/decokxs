package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gwY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21267gwY extends AbstractC32996moC {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public AbstractC16511elM AEQbTJ;
    public Function1<? super java.lang.Boolean, Unit> AhwBna;
    public final InterfaceC56387yDm KWHzl;
    public final C59534zip OLrzqt;
    public final int copydefault = C13754dXa.TaskDescription.getLabel;
    public final InterfaceC56387yDm djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AhwBna = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    public C21267gwY() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.tx.history.ChainUpdateCoinDetailFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.tx.history.ChainUpdateCoinDetailFragment$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C9936bew.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tx.history.ChainUpdateCoinDetailFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tx.history.ChainUpdateCoinDetailFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.tx.history.ChainUpdateCoinDetailFragment$special$$inlined$viewModels$default$5
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
        this.OLrzqt = new C59534zip();
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.gwV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C21267gwY.copydefault(this.copydefault);
            }
        });
    }

    /* JADX INFO: renamed from: o.gwY$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gwY.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C21267gwY copydefault(long j) {
            C21267gwY c21267gwY = new C21267gwY();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("coinId", j);
            c21267gwY.setArguments(bundle);
            return c21267gwY;
        }
    }

    public final C9936bew KWHzl() {
        return (C9936bew) this.djBIcL.getValue();
    }

    /* JADX INFO: renamed from: o.gwY$ActionBar */
    public static final class ActionBar implements WalletUpdateWorker.TaskDescription {
        public ActionBar() {
        }

        @Override // com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.TaskDescription
        public void KWHzl() {
            C21267gwY.this.dismissLoading();
            C21267gwY.this.KWHzl().OLrzqt();
            AbstractC16511elM abstractC16511elM = C21267gwY.this.AEQbTJ;
            AbstractC16511elM abstractC16511elM2 = null;
            if (abstractC16511elM == null) {
                Intrinsics.gEmmrt("");
                abstractC16511elM = null;
            }
            android.widget.TextView textView = abstractC16511elM.OLrzqt;
            C21267gwY c21267gwY = C21267gwY.this;
            int i = C13754dXa.FragmentManager.OnBackPressedDispatcherKt;
            C10854bwM c10854bwMKWHzl = c21267gwY.KWHzl().KWHzl();
            java.lang.String strDjBIcL = c10854bwMKWHzl != null ? c10854bwMKWHzl.djBIcL() : null;
            if (strDjBIcL == null) {
                strDjBIcL = "";
            }
            textView.setText(pTD.copydefault(c21267gwY, i, C56423yEv.EZpvd(C56390yDp.OLrzqt("chain_name", strDjBIcL))));
            AbstractC16511elM abstractC16511elM3 = C21267gwY.this.AEQbTJ;
            if (abstractC16511elM3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16511elM3 = null;
            }
            abstractC16511elM3.KWHzl.setVisibility(8);
            AbstractC16511elM abstractC16511elM4 = C21267gwY.this.AEQbTJ;
            if (abstractC16511elM4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16511elM4 = null;
            }
            android.widget.ImageView imageView = abstractC16511elM4.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C14677dpv.OLrzqt(imageView, CDNSourceManager.ImageSource.UpgradeWalletVerified);
            AbstractC16511elM abstractC16511elM5 = C21267gwY.this.AEQbTJ;
            if (abstractC16511elM5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16511elM2 = abstractC16511elM5;
            }
            abstractC16511elM2.copydefault.setText(C21267gwY.this.getString(C13754dXa.FragmentManager.registerOnBackInvokedCallback));
        }

        @Override // com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.TaskDescription
        public void EZpvd(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            C21267gwY.this.dismissLoading();
            java.lang.String string = C21267gwY.this.getString(C13754dXa.FragmentManager.addCallbackdefault);
            Intrinsics.checkNotNullExpressionValue(string, "");
            C55326xho.toastWithFailedIcon$default(string, 0, 1, (java.lang.Object) null);
        }
    }

    public final ActionBar AEQbTJ() {
        return (ActionBar) this.KWHzl.getValue();
    }

    public static final ActionBar copydefault(C21267gwY c21267gwY) {
        return c21267gwY.new ActionBar();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(view);
        Intrinsics.copydefault(viewDataBindingBind);
        this.AEQbTJ = (AbstractC16511elM) viewDataBindingBind;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            KWHzl().EZpvd(arguments.getLong("coinId"));
            AbstractC16511elM abstractC16511elM = this.AEQbTJ;
            if (abstractC16511elM == null) {
                Intrinsics.gEmmrt("");
                abstractC16511elM = null;
            }
            android.widget.TextView textView = abstractC16511elM.OLrzqt;
            int i = C13754dXa.FragmentManager.OnBackPressedDispatcherApi33ImplExternalSyntheticLambda0;
            C10854bwM c10854bwMKWHzl = KWHzl().KWHzl();
            java.lang.String strDjBIcL = c10854bwMKWHzl != null ? c10854bwMKWHzl.djBIcL() : null;
            if (strDjBIcL == null) {
                strDjBIcL = "";
            }
            textView.setText(pTD.copydefault(this, i, C56423yEv.EZpvd(C56390yDp.OLrzqt("chain_name", strDjBIcL))));
            AbstractC16511elM abstractC16511elM2 = this.AEQbTJ;
            if (abstractC16511elM2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16511elM2 = null;
            }
            android.widget.ImageView imageView = abstractC16511elM2.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C14677dpv.OLrzqt(imageView, CDNSourceManager.ImageSource.UpgradeWalletHeader);
            AbstractC16511elM abstractC16511elM3 = this.AEQbTJ;
            if (abstractC16511elM3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16511elM3 = null;
            }
            android.widget.ImageView imageView2 = abstractC16511elM3.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            C10854bwM c10854bwMKWHzl2 = KWHzl().KWHzl();
            C33054mpH.KWHzl(imageView2, c10854bwMKWHzl2 != null ? c10854bwMKWHzl2.copydefault() : null);
            AbstractC16511elM abstractC16511elM4 = this.AEQbTJ;
            if (abstractC16511elM4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16511elM4 = null;
            }
            abstractC16511elM4.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.gwX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C21267gwY.copydefault(this.KWHzl, view2);
                }
            });
            AbstractC16511elM abstractC16511elM5 = this.AEQbTJ;
            if (abstractC16511elM5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16511elM5 = null;
            }
            abstractC16511elM5.AEQbTJ.setAdapter(this.OLrzqt);
            this.OLrzqt.register(C9983bfq.class, new C10053bhG());
            C33064mpR.OLrzqt(this.OLrzqt, KWHzl().EZpvd());
            WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).KWHzl(AEQbTJ());
            view.post(new java.lang.Runnable() { // from class: o.gwW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C21267gwY.AhwBna(this.AEQbTJ);
                }
            });
        }
    }

    public static final void copydefault(C21267gwY c21267gwY, android.view.View view) {
        if (c21267gwY.KWHzl().AEQbTJ()) {
            Function1<? super java.lang.Boolean, Unit> function1 = c21267gwY.AhwBna;
            if (function1 != null) {
                function1.invoke(java.lang.Boolean.valueOf(c21267gwY.KWHzl().AEQbTJ()));
                return;
            }
            return;
        }
        c21267gwY.copydefault();
    }

    public static final void AhwBna(C21267gwY c21267gwY) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c21267gwY, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void copydefault() {
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        new C14461dlr(childFragmentManager, "completeAddress-chainUpdateCoinDetail", new Function1() { // from class: o.gwZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C21267gwY.OLrzqt(this.EZpvd, (java.lang.String) obj);
            }
        }, null, null, false, 48, null).EZpvd();
    }

    public static final Unit OLrzqt(C21267gwY c21267gwY, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c21267gwY.showLoading();
        ActivityC21325gxd.Companion.OLrzqt(true);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).EZpvd(AEQbTJ());
    }
}
