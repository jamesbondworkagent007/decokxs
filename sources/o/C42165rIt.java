package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.ok_kyc_core.common.From;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FormAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ProcessingAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ResultAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ResultStatus;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SelectWalletVerificationAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UpdateFormAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.VirtualActionAppModel;
import com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase;
import com.okinc.ok_kyc_core.presentation.loading.LoadingFragment$onActivityCreated$4;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rIt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42165rIt extends AbstractC42060rEw<AbstractC43849rwz, rIB> {
    public final InterfaceC56387yDm AuCTelauCTel;
    public final int getNewProxyInstance = C43662rtX.TaskDescription.zLjUOn;
    public final InterfaceC56387yDm iwGUEr;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42060rEw
    public void AEQbTJ(@NotNull UpdateFormAppModel updateFormAppModel) {
        Intrinsics.checkNotNullParameter(updateFormAppModel, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42060rEw
    public int OLrzqt() {
        return this.getNewProxyInstance;
    }

    public C42165rIt() {
        Function0 function0 = new Function0() { // from class: o.rIz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42165rIt.KWHzl(this.OLrzqt);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.ok_kyc_core.presentation.loading.LoadingFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.ok_kyc_core.presentation.loading.LoadingFragment$special$$inlined$viewModels$default$2
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
        final Function0 function03 = null;
        this.AuCTelauCTel = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(rIB.class), new Function0<ViewModelStore>() { // from class: com.okinc.ok_kyc_core.presentation.loading.LoadingFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.ok_kyc_core.presentation.loading.LoadingFragment$special$$inlined$viewModels$default$4
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
        }, function0);
        this.iwGUEr = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C42163rIr.class), new Function0<ViewModelStore>() { // from class: com.okinc.ok_kyc_core.presentation.loading.LoadingFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.ok_kyc_core.presentation.loading.LoadingFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.ok_kyc_core.presentation.loading.LoadingFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: o.rIt$StateListAnimator */
    public static final class StateListAnimator implements ViewModelProvider.Factory {
        public StateListAnimator() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            C43746rvB c43746rvB = new C43746rvB(new rAP(), InterfaceC43709ruR.Companion.AEQbTJ(C42165rIt.this.KWHzl().fetchVPNInfo(), C42165rIt.this.KWHzl().AhwBna()), null, 4, null);
            return new rIB(new C41970rBn(new rBD(c43746rvB), new rBP(c43746rvB), new C41973rBq(c43746rvB), new C41975rBs(c43746rvB), new rBF(c43746rvB), new rBE(c43746rvB), new rBB(c43746rvB), new C41979rBw(c43746rvB), new SingleFileUploadUseCase(c43746rvB), new rBA(c43746rvB)), new rBQ(new C41978rBv(c43746rvB), new C41982rBz(c43746rvB)), new rBT(new C41977rBu(c43746rvB), new C41981rBy(c43746rvB), new C41971rBo(c43746rvB), new C41968rBl(c43746rvB)));
        }
    }

    /* JADX DEBUG: Method merged with bridge method: fetchVPNInfo()Lo/rFj; */
    @Override // o.AbstractC42060rEw
    /* JADX INFO: renamed from: fJNWhG, reason: merged with bridge method [inline-methods] */
    public rIB fetchVPNInfo() {
        return (rIB) this.AuCTelauCTel.getValue();
    }

    public static final ViewModelProvider.Factory KWHzl(C42165rIt c42165rIt) {
        return c42165rIt.new StateListAnimator();
    }

    @Override // o.AbstractC42060rEw
    public C42163rIr KWHzl() {
        return (C42163rIr) this.iwGUEr.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0119  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onActivityCreated(android.os.Bundle bundle) {
        C43961rzE c43961rzE;
        C52794wYp c52794wYp;
        java.lang.Object activity;
        super.onActivityCreated(bundle);
        KWHzl(java.lang.Boolean.TRUE);
        if (bundle == null) {
            PageComponentAppModel pageComponentAppModelGEmmrt = KWHzl().gEmmrt();
            if (pageComponentAppModelGEmmrt != null) {
                if (pageComponentAppModelGEmmrt instanceof FormAppModel) {
                    AbstractC42074rFj.navigateToFormPage$default(fetchVPNInfo(), pageComponentAppModelGEmmrt, KWHzl().fetchVPNInfo(), KWHzl().AhwBna(), KWHzl().isConnected(), null, 16, null);
                    activity = Unit.INSTANCE;
                } else if (pageComponentAppModelGEmmrt instanceof ResultAppModel) {
                    AbstractC42074rFj.navigateToResultPage$default(fetchVPNInfo(), pageComponentAppModelGEmmrt, KWHzl().fetchVPNInfo(), KWHzl().AhwBna(), KWHzl().isConnected(), null, 16, null);
                    activity = Unit.INSTANCE;
                } else if (pageComponentAppModelGEmmrt instanceof SelectWalletVerificationAppModel) {
                    AbstractC42074rFj.navigateToSelectWalletVerificationPage$default(fetchVPNInfo(), pageComponentAppModelGEmmrt, KWHzl().fetchVPNInfo(), KWHzl().AhwBna(), KWHzl().isConnected(), null, 16, null);
                    activity = Unit.INSTANCE;
                } else if (pageComponentAppModelGEmmrt instanceof ProcessingAppModel) {
                    activity = getActivity();
                    if (activity != null) {
                        AbstractC42074rFj.navigateToProcessingPage$default(fetchVPNInfo(), pageComponentAppModelGEmmrt, KWHzl().fetchVPNInfo(), "", KWHzl().AhwBna(), KWHzl().isConnected(), null, 32, null);
                    } else {
                        activity = null;
                    }
                } else if (pageComponentAppModelGEmmrt instanceof VirtualActionAppModel) {
                    AbstractC42074rFj.navigateVirtualAction$default(fetchVPNInfo(), pageComponentAppModelGEmmrt, null, KWHzl().fetchVPNInfo(), ActivityC42162rIq.Companion.EZpvd(KWHzl().fetchVPNInfo()), KWHzl().AhwBna(), KWHzl().OLrzqt(), requireActivity(), null, null, MLKEMEngine.KyberPolyBytes, null);
                    activity = Unit.INSTANCE;
                } else {
                    activity = getActivity();
                    if (activity != null) {
                        Intrinsics.copydefault(activity, "");
                        ((ActivityC42162rIq) activity).djBIcL();
                    }
                }
                if (activity == null) {
                }
            } else {
                fARcdN();
                Unit unit = Unit.INSTANCE;
            }
        }
        AbstractC43849rwz abstractC43849rwzAEQbTJ = AEQbTJ();
        if (abstractC43849rwzAEQbTJ != null && (c43961rzE = abstractC43849rwzAEQbTJ.OLrzqt) != null && (c52794wYp = c43961rzE.KWHzl) != null) {
            c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
        }
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new LoadingFragment$onActivityCreated$4(this, null));
        LiveData<C43734ruq<java.lang.Boolean>> liveDataKWHzl = fetchVPNInfo().KWHzl();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C43733rup.copydefault(liveDataKWHzl, viewLifecycleOwner, new Function1() { // from class: o.rIy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42165rIt.copydefault(this.KWHzl, (C43734ruq) obj);
            }
        });
        LiveData<C43734ruq<kotlin.Pair<From, ResultStatus>>> liveDataDjBIcL = fetchVPNInfo().djBIcL();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        C43733rup.copydefault(liveDataDjBIcL, viewLifecycleOwner2, new Function1() { // from class: o.rIA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42165rIt.AYXKKw(this.OLrzqt, (C43734ruq) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o.rIt$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C42165rIt AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C42165rIt c42165rIt) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = c42165rIt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.fARcdN();
            }
        }
    }

    public static final Unit copydefault(C42165rIt c42165rIt, C43734ruq c43734ruq) {
        Intrinsics.checkNotNullParameter(c43734ruq, "");
        java.lang.Boolean bool = (java.lang.Boolean) c43734ruq.EZpvd();
        if (bool != null) {
            bool.booleanValue();
            c42165rIt.KWHzl().OLrzqt((48 & 1) != 0 ? null : null, From.NONE, c42165rIt.KWHzl().fetchVPNInfo(), c42165rIt.KWHzl().AhwBna(), (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? null : null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C42165rIt c42165rIt, C43734ruq c43734ruq) {
        Intrinsics.checkNotNullParameter(c43734ruq, "");
        kotlin.Pair pair = (kotlin.Pair) c43734ruq.EZpvd();
        if (pair != null) {
            c42165rIt.KWHzl().AEQbTJ((ResultStatus) pair.getSecond(), (From) pair.getFirst());
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC42060rEw
    public void values() {
        LiveData<C43734ruq<java.lang.String>> liveDataIsConnected = fetchVPNInfo().isConnected();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C43733rup.copydefault(liveDataIsConnected, viewLifecycleOwner, new Function1() { // from class: o.rIx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42165rIt.AEQbTJ(this.copydefault, (C43734ruq) obj);
            }
        });
    }

    public static final Unit AEQbTJ(C42165rIt c42165rIt, C43734ruq c43734ruq) {
        C43961rzE c43961rzE;
        android.widget.TextView textView;
        C43961rzE c43961rzE2;
        LinearLayoutCompat root;
        C43963rzG c43963rzG;
        android.widget.FrameLayout root2;
        Intrinsics.checkNotNullParameter(c43734ruq, "");
        java.lang.String strAYXKKw = (java.lang.String) c43734ruq.EZpvd();
        if (strAYXKKw != null) {
            AbstractC43849rwz abstractC43849rwzAEQbTJ = c42165rIt.AEQbTJ();
            if (abstractC43849rwzAEQbTJ != null && (c43963rzG = abstractC43849rwzAEQbTJ.copydefault) != null && (root2 = c43963rzG.getRoot()) != null) {
                root2.setVisibility(8);
            }
            AbstractC43849rwz abstractC43849rwzAEQbTJ2 = c42165rIt.AEQbTJ();
            if (abstractC43849rwzAEQbTJ2 != null && (c43961rzE2 = abstractC43849rwzAEQbTJ2.OLrzqt) != null && (root = c43961rzE2.getRoot()) != null) {
                root.setVisibility(0);
            }
            AbstractC43849rwz abstractC43849rwzAEQbTJ3 = c42165rIt.AEQbTJ();
            if (abstractC43849rwzAEQbTJ3 != null && (c43961rzE = abstractC43849rwzAEQbTJ3.OLrzqt) != null && (textView = c43961rzE.copydefault) != null) {
                if (!C33129mqd.OLrzqt((java.lang.CharSequence) strAYXKKw)) {
                    strAYXKKw = C33070mpX.AYXKKw(C43662rtX.Dialog.AYXKKw);
                }
                textView.setText(strAYXKKw);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fARcdN() {
        AbstractC43977rzU abstractC43977rzU;
        C43961rzE c43961rzE;
        LinearLayoutCompat root;
        C43963rzG c43963rzG;
        android.widget.FrameLayout root2;
        AbstractC43849rwz abstractC43849rwzAEQbTJ = AEQbTJ();
        if (abstractC43849rwzAEQbTJ != null && (c43963rzG = abstractC43849rwzAEQbTJ.copydefault) != null && (root2 = c43963rzG.getRoot()) != null) {
            root2.setVisibility(0);
        }
        AbstractC43849rwz abstractC43849rwzAEQbTJ2 = AEQbTJ();
        if (abstractC43849rwzAEQbTJ2 != null && (c43961rzE = abstractC43849rwzAEQbTJ2.OLrzqt) != null && (root = c43961rzE.getRoot()) != null) {
            root.setVisibility(8);
        }
        AbstractC43849rwz abstractC43849rwzAEQbTJ3 = AEQbTJ();
        if (abstractC43849rwzAEQbTJ3 != null && (abstractC43977rzU = abstractC43849rwzAEQbTJ3.AEQbTJ) != null) {
            android.widget.ImageButton imageButton = abstractC43977rzU.KWHzl;
            if (imageButton != null) {
                imageButton.setVisibility(0);
            }
            android.widget.ImageView imageView = abstractC43977rzU.AEQbTJ;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            android.widget.ImageButton imageButton2 = abstractC43977rzU.KWHzl;
            if (imageButton2 != null) {
                imageButton2.setOnClickListener(new View.OnClickListener() { // from class: o.rIw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C42165rIt.copydefault(this.AEQbTJ, view);
                    }
                });
            }
        }
        AbstractC42074rFj.getOnboarding$default(fetchVPNInfo(), null, KWHzl().fetchVPNInfo(), ActivityC42162rIq.Companion.EZpvd(KWHzl().fetchVPNInfo()), KWHzl().AhwBna(), null, false, new Function1() { // from class: o.rID
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42165rIt.copydefault((java.lang.String) obj);
            }
        }, 48, null);
    }

    public static final void copydefault(C42165rIt c42165rIt, android.view.View view) {
        c42165rIt.KWHzl().AuCTel();
    }

    public static final Unit copydefault(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        C43693ruB.EZpvd("KYC_Onboarding_Start_Error", str);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC42060rEw, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ejfBZ();
        rIB ribFetchVPNInfo = fetchVPNInfo();
        ribFetchVPNInfo.fetchVPNInfo().removeObservers(getViewLifecycleOwner());
        ribFetchVPNInfo.KWHzl().removeObservers(getViewLifecycleOwner());
        ribFetchVPNInfo.djBIcL().removeObservers(getViewLifecycleOwner());
    }
}
