package o;

import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.FragmentKt;
import com.okinc.ok_kyc_core.common.From;
import com.okinc.ok_kyc_core.common.VendorSource;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonAction;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogInformation;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FormAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Onboarding;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Polling;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ProcessingAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Quit;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ResultAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ResultStatus;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UpdateFormAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.VirtualActionAppModel;
import com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase;
import com.okinc.ok_kyc_core.presentation.processing.ProcessingFragment$getWCResult$1;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC42162rIq;
import o.ActivityC42454rTl;
import o.C43662rtX;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rIF extends AbstractC42060rEw<AbstractC43800rwC, rIM> {
    public ProcessingAppModel AubY;
    public final InterfaceC56387yDm getNewProxyInstance;
    public final int iwGUEr = C43662rtX.TaskDescription.wlaJM;
    public final InterfaceC56387yDm wlaJM = C56392yDr.copydefault(new Function0() { // from class: o.rIN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return rIF.gEmmrt(this.copydefault);
        }
    });
    public final InterfaceC56387yDm zLjUOn;

    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
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

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ButtonAction.values().length];
            try {
                iArr[ButtonAction.Quit.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[ButtonStyle.values().length];
            try {
                iArr2[ButtonStyle.Primary.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42060rEw
    public void AEQbTJ(@NotNull UpdateFormAppModel updateFormAppModel) {
        Intrinsics.checkNotNullParameter(updateFormAppModel, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC42060rEw
    public int OLrzqt() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull ProcessingAppModel processingAppModel) {
        Intrinsics.checkNotNullParameter(processingAppModel, "");
        this.AubY = processingAppModel;
    }

    public rIF() {
        Function0 function0 = new Function0() { // from class: o.rIL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return rIF.AYXKKw(this.EZpvd);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.ok_kyc_core.presentation.processing.ProcessingFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.ok_kyc_core.presentation.processing.ProcessingFragment$special$$inlined$viewModels$default$2
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
        this.zLjUOn = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(rIM.class), new Function0<ViewModelStore>() { // from class: com.okinc.ok_kyc_core.presentation.processing.ProcessingFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.ok_kyc_core.presentation.processing.ProcessingFragment$special$$inlined$viewModels$default$4
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
        this.getNewProxyInstance = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C42163rIr.class), new Function0<ViewModelStore>() { // from class: com.okinc.ok_kyc_core.presentation.processing.ProcessingFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.ok_kyc_core.presentation.processing.ProcessingFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.ok_kyc_core.presentation.processing.ProcessingFragment$special$$inlined$activityViewModels$default$3
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

    private final rQO fARcdN() {
        return (rQO) this.wlaJM.getValue();
    }

    public static final rQO gEmmrt(rIF rif) {
        androidx.fragment.app.FragmentManager childFragmentManager = rif.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        FragmentActivity fragmentActivityRequireActivity = rif.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return new rQO(childFragmentManager, fragmentActivityRequireActivity);
    }

    public static final class Activity implements ViewModelProvider.Factory {
        public Activity() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            C43746rvB c43746rvB = new C43746rvB(new rAP(), InterfaceC43709ruR.Companion.AEQbTJ(rIF.this.AYXKKw(), rIF.this.valueOf()), null, 4, null);
            C41970rBn c41970rBn = new C41970rBn(new rBD(c43746rvB), new rBP(c43746rvB), new C41973rBq(c43746rvB), new C41975rBs(c43746rvB), new rBF(c43746rvB), new rBE(c43746rvB), new rBB(c43746rvB), new C41979rBw(c43746rvB), new SingleFileUploadUseCase(c43746rvB), new rBA(c43746rvB));
            rBT rbt = new rBT(new C41977rBu(c43746rvB), new C41981rBy(c43746rvB), new C41971rBo(c43746rvB), new C41968rBl(c43746rvB));
            return new rIM(new rBH(c43746rvB), c41970rBn, new rBQ(new C41978rBv(c43746rvB), new C41982rBz(c43746rvB)), rbt);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: fetchVPNInfo()Lo/rFj; */
    @Override // o.AbstractC42060rEw
    /* JADX INFO: renamed from: fJNWhG, reason: merged with bridge method [inline-methods] */
    public rIM fetchVPNInfo() {
        return (rIM) this.zLjUOn.getValue();
    }

    public static final ViewModelProvider.Factory AYXKKw(rIF rif) {
        return rif.new Activity();
    }

    public final ProcessingAppModel AuCTel() {
        ProcessingAppModel processingAppModel = this.AubY;
        if (processingAppModel != null) {
            return processingAppModel;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractC42060rEw
    public C42163rIr KWHzl() {
        return (C42163rIr) this.getNewProxyInstance.getValue();
    }

    @Override // o.AbstractC42060rEw, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String countryOfResidence;
        super.onCreate(bundle);
        KWHzl(java.lang.Boolean.FALSE);
        android.os.Bundle arguments = getArguments();
        PageComponentAppModel pageComponentAppModel = arguments != null ? (PageComponentAppModel) arguments.getParcelable("arg") : null;
        Intrinsics.copydefault(pageComponentAppModel, "");
        OLrzqt((ProcessingAppModel) pageComponentAppModel);
        android.os.Bundle arguments2 = getArguments();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (arguments2 != null ? arguments2.getString("redirectUrl") : null)) && requireActivity() != null) {
            C42163rIr c42163rIrKWHzl = KWHzl();
            VendorSource vendorSource = VendorSource.URL_VENDOR;
            c42163rIrKWHzl.copydefault(vendorSource);
            fetchVPNInfo().EZpvd(vendorSource);
        }
        java.lang.String id = AuCTel().getId();
        if (id != null) {
            C43739ruv c43739ruv = new C43739ruv();
            java.lang.String strAYXKKw = AYXKKw();
            java.util.HashMap<java.lang.String, java.lang.String> mapValueOf = valueOf();
            PageComponentProfile pageComponentProfileAhwBna = AhwBna();
            java.lang.String str = (pageComponentProfileAhwBna == null || (countryOfResidence = pageComponentProfileAhwBna.getCountryOfResidence()) == null) ? "" : countryOfResidence;
            ProcessingAppModel processingAppModelAuCTel = AuCTel();
            c43739ruv.AEQbTJ(id, strAYXKKw, "processing", (456 & 8) != 0 ? null : null, mapValueOf, str, (456 & 64) != 0 ? null : processingAppModelAuCTel != null ? processingAppModelAuCTel.getAmplitudeParams() : null, (456 & 128) != 0 ? null : null, (456 & 256) != 0 ? null : null);
        }
    }

    @Override // o.AbstractC42060rEw, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, new Application());
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public static final class Application extends OnBackPressedCallback {
        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
        }

        public Application() {
            super(true);
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ rIF EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, rIF rif, android.view.View view2) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = rif;
            this.copydefault = view2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C52794wYp c52794wYp = (C52794wYp) this.AEQbTJ;
                NavDestination currentDestination = FragmentKt.findNavController(this.EZpvd).getCurrentDestination();
                if (currentDestination == null || currentDestination.getId() != C43662rtX.ActionBar.RTWSvT) {
                    return;
                }
                rIM rimFetchVPNInfo = this.EZpvd.fetchVPNInfo();
                CTAButtonAppModel cTAButtonAppModelKWHzl = ((C42249rLw) this.copydefault).KWHzl();
                java.lang.String strAYXKKw = this.EZpvd.AYXKKw();
                java.lang.String strCopydefault = this.EZpvd.copydefault();
                java.lang.String id = this.EZpvd.AuCTel().getId();
                if (id == null) {
                    id = "";
                }
                AbstractC42074rFj.onButtonClicked$default(rimFetchVPNInfo, c52794wYp, cTAButtonAppModelKWHzl, strAYXKKw, strCopydefault, id, this.EZpvd.valueOf(), new C43739ruv(), this.EZpvd.KWHzl().OLrzqt(), this.EZpvd.getActivity(), null, null, null, null, null, null, null, null, 130560, null);
            }
        }
    }

    @Override // o.AbstractC42060rEw, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AbstractC43800rwC abstractC43800rwCAEQbTJ = AEQbTJ();
        if (abstractC43800rwCAEQbTJ != null) {
            android.os.Bundle arguments = getArguments();
            PageComponentAppModel pageComponentAppModel = arguments != null ? (PageComponentAppModel) arguments.getParcelable("arg") : null;
            Intrinsics.copydefault(pageComponentAppModel, "");
            final ProcessingAppModel processingAppModel = (ProcessingAppModel) pageComponentAppModel;
            abstractC43800rwCAEQbTJ.OLrzqt.removeAllViews();
            final AbstractC43977rzU abstractC43977rzU = abstractC43800rwCAEQbTJ.gEmmrt;
            abstractC43977rzU.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.rIK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    rIF.AEQbTJ(processingAppModel, abstractC43977rzU, this, view2);
                }
            });
            if (Intrinsics.EZpvd(processingAppModel.getCanClose(), java.lang.Boolean.FALSE)) {
                abstractC43977rzU.AEQbTJ.setVisibility(8);
            } else {
                abstractC43977rzU.AEQbTJ.setVisibility(0);
            }
            abstractC43977rzU.KWHzl.setVisibility(8);
            hDKMBd();
            if (processingAppModel.getItems().isEmpty()) {
                abstractC43800rwCAEQbTJ.OLrzqt.setVisibility(8);
                abstractC43800rwCAEQbTJ.copydefault.setVisibility(0);
                if (C33129mqd.OLrzqt((java.lang.CharSequence) processingAppModel.getTitle())) {
                    android.widget.TextView textView = abstractC43800rwCAEQbTJ.KWHzl;
                    java.lang.String title = processingAppModel.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    textView.setText(title);
                    abstractC43800rwCAEQbTJ.KWHzl.setVisibility(0);
                } else {
                    abstractC43800rwCAEQbTJ.KWHzl.setVisibility(8);
                }
                if (C33129mqd.OLrzqt((java.lang.CharSequence) processingAppModel.getSubtitle())) {
                    android.widget.TextView textView2 = abstractC43800rwCAEQbTJ.EZpvd;
                    java.lang.String subtitle = processingAppModel.getSubtitle();
                    if (subtitle == null) {
                        subtitle = "";
                    }
                    textView2.setText(subtitle);
                    abstractC43800rwCAEQbTJ.EZpvd.setVisibility(0);
                } else {
                    abstractC43800rwCAEQbTJ.EZpvd.setVisibility(8);
                }
                abstractC43800rwCAEQbTJ.AhwBna.KWHzl(0L);
            } else {
                abstractC43800rwCAEQbTJ.OLrzqt.setVisibility(0);
                abstractC43800rwCAEQbTJ.copydefault.setVisibility(8);
                rQO rqoFARcdN = fARcdN();
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                for (android.view.View view2 : rqoFARcdN.AEQbTJ(contextRequireContext, childFragmentManager, processingAppModel, fetchVPNInfo(), this)) {
                    abstractC43800rwCAEQbTJ.OLrzqt.addView(view2);
                    KWHzl(view2);
                }
            }
            CtaAppModel cta = processingAppModel.getCta();
            if (cta != null) {
                abstractC43800rwCAEQbTJ.AEQbTJ.copydefault.setVisibility(0);
                rQO rqoFARcdN2 = fARcdN();
                android.content.Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                androidx.fragment.app.FragmentManager childFragmentManager2 = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                for (android.view.View view3 : rqoFARcdN2.KWHzl(contextRequireContext2, childFragmentManager2, cta, fetchVPNInfo(), this)) {
                    abstractC43800rwCAEQbTJ.AEQbTJ.copydefault.addView(view3);
                    KWHzl(view3);
                }
            }
        }
        LiveData<C43734ruq<kotlin.Pair<C43700ruI, C52794wYp>>> liveDataFetchVPNInfo = fetchVPNInfo().fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C43733rup.copydefault(liveDataFetchVPNInfo, viewLifecycleOwner, new Function1() { // from class: o.rIH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rIF.copydefault(this.EZpvd, (C43734ruq) obj);
            }
        });
        LiveData<C43734ruq<kotlin.Pair<android.view.View, java.lang.Boolean>>> liveDataGEmmrt = fetchVPNInfo().gEmmrt();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        C43733rup.copydefault(liveDataGEmmrt, viewLifecycleOwner2, new Function1() { // from class: o.rIG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rIF.AYXKKw(this.copydefault, (C43734ruq) obj);
            }
        });
        LiveData<C43734ruq<kotlin.Pair<From, ResultStatus>>> liveDataDjBIcL = fetchVPNInfo().djBIcL();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        C43733rup.copydefault(liveDataDjBIcL, viewLifecycleOwner3, new Function1() { // from class: o.rII
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rIF.AhwBna(this.OLrzqt, (C43734ruq) obj);
            }
        });
        MutableLiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> mutableLiveDataKWHzl = KWHzl().KWHzl();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        C43733rup.copydefault(mutableLiveDataKWHzl, viewLifecycleOwner4, new Function1() { // from class: o.rIJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rIF.valueOf(this.AEQbTJ, (C43734ruq) obj);
            }
        });
        if (Intrinsics.EZpvd(AuCTel().isLocalPolling(), java.lang.Boolean.TRUE)) {
            AEQbTJ(AuCTel());
        } else {
            copydefault(AuCTel());
        }
    }

    public static final void AEQbTJ(ProcessingAppModel processingAppModel, AbstractC43977rzU abstractC43977rzU, rIF rif, android.view.View view) {
        java.lang.String countryOfResidence;
        Quit quit = processingAppModel.getQuit();
        if (quit != null) {
            if (Intrinsics.EZpvd(quit.getShouldShow(), java.lang.Boolean.TRUE)) {
                rIM rimFetchVPNInfo = rif.fetchVPNInfo();
                Quit quit2 = processingAppModel.getQuit();
                androidx.fragment.app.FragmentManager childFragmentManager = rif.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                PageComponentProfile pageComponentProfileAhwBna = rif.AhwBna();
                java.lang.String str = (pageComponentProfileAhwBna == null || (countryOfResidence = pageComponentProfileAhwBna.getCountryOfResidence()) == null) ? "" : countryOfResidence;
                java.lang.String strAYXKKw = rif.AYXKKw();
                java.util.HashMap<java.lang.String, java.lang.String> mapValueOf = rif.valueOf();
                java.lang.String id = processingAppModel.getId();
                rimFetchVPNInfo.copydefault(quit2, childFragmentManager, str, strAYXKKw, mapValueOf, id == null ? "" : id);
                return;
            }
            rif.KWHzl().OLrzqt(null, rif.fetchVPNInfo().AhwBna(""), rif.AYXKKw(), rif.valueOf(), processingAppModel.getOnExit(), processingAppModel.getId());
            return;
        }
        rif.KWHzl().OLrzqt(null, rif.fetchVPNInfo().AhwBna(""), rif.AYXKKw(), rif.valueOf(), processingAppModel.getOnExit(), processingAppModel.getId());
    }

    public static final Unit copydefault(rIF rif, C43734ruq c43734ruq) {
        PageComponentProfile pageComponentProfile;
        PageComponentAppModel viewModel;
        java.lang.Integer maxLevel;
        Intrinsics.checkNotNullParameter(c43734ruq, "");
        kotlin.Pair pair = (kotlin.Pair) c43734ruq.EZpvd();
        if (pair != null) {
            C43700ruI c43700ruI = (C43700ruI) pair.getFirst();
            if (c43700ruI.OLrzqt().getOnDemandFeatureFlagEnabled()) {
                java.lang.Boolean boolValueOf = c43700ruI.valueOf();
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                if (Intrinsics.EZpvd(boolValueOf, bool)) {
                    rif.KWHzl().OLrzqt(c43700ruI.OLrzqt().getViewModel());
                }
                PageComponentProfile profile = c43700ruI.OLrzqt().getProfile();
                if (profile != null) {
                    if (profile.getMaxLevel() == null || ((maxLevel = profile.getMaxLevel()) != null && maxLevel.intValue() == -1)) {
                        profile = null;
                    }
                    pageComponentProfile = profile;
                } else {
                    pageComponentProfile = null;
                }
                rif.KWHzl().KWHzl(c43700ruI.KWHzl());
                rif.KWHzl().AEQbTJ(c43700ruI.EZpvd());
                if (!(c43700ruI.OLrzqt().getViewModel() instanceof PopUpAppModel) && !(c43700ruI.OLrzqt().getViewModel() instanceof UpdateFormAppModel) && (viewModel = c43700ruI.OLrzqt().getViewModel()) != null && Intrinsics.EZpvd(viewModel.getPageStack(), bool)) {
                    ActivityC42162rIq.TaskDescription taskDescription = ActivityC42162rIq.Companion;
                    FragmentActivity fragmentActivityRequireActivity = rif.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    ActivityC42162rIq.TaskDescription.goActivity$default(taskDescription, fragmentActivityRequireActivity, rif.AYXKKw(), rif.copydefault(), rif.valueOf(), c43700ruI.OLrzqt(), rif.gEmmrt(), null, 64, null);
                } else {
                    PageComponentAppModel viewModel2 = c43700ruI.OLrzqt().getViewModel();
                    if (viewModel2 instanceof FormAppModel) {
                        rif.fetchVPNInfo().EZpvd(c43700ruI.OLrzqt().getViewModel(), c43700ruI.KWHzl(), c43700ruI.EZpvd(), pageComponentProfile, c43700ruI.copydefault());
                    } else if (viewModel2 instanceof ResultAppModel) {
                        rif.fetchVPNInfo().AEQbTJ(c43700ruI.OLrzqt().getViewModel(), c43700ruI.KWHzl(), c43700ruI.EZpvd(), pageComponentProfile, c43700ruI.copydefault());
                    } else if (viewModel2 instanceof VirtualActionAppModel) {
                        rif.KWHzl(pageComponentProfile);
                        AbstractC42074rFj.navigateVirtualAction$default(rif.fetchVPNInfo(), c43700ruI.OLrzqt().getViewModel(), (C52794wYp) pair.getSecond(), c43700ruI.KWHzl(), ActivityC42162rIq.Companion.EZpvd(c43700ruI.KWHzl()), c43700ruI.EZpvd(), rif.KWHzl().OLrzqt(), rif.requireActivity(), null, null, MLKEMEngine.KyberPolyBytes, null);
                    } else if (viewModel2 instanceof PopUpAppModel) {
                        FragmentActivity activity = rif.getActivity();
                        if (activity != null) {
                            rIM rimFetchVPNInfo = rif.fetchVPNInfo();
                            PageComponentAppModel viewModel3 = c43700ruI.OLrzqt().getViewModel();
                            java.lang.String strKWHzl = c43700ruI.KWHzl();
                            java.util.HashMap<java.lang.String, java.lang.String> mapEZpvd = c43700ruI.EZpvd();
                            androidx.fragment.app.FragmentManager childFragmentManager = rif.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                            AbstractC42074rFj.navigatePopUpAction$default(rimFetchVPNInfo, viewModel3, activity, childFragmentManager, strKWHzl, mapEZpvd, null, 32, null);
                        }
                    } else if (viewModel2 instanceof ProcessingAppModel) {
                        PageComponentAppModel viewModel4 = c43700ruI.OLrzqt().getViewModel();
                        Intrinsics.copydefault(viewModel4, "");
                        rif.copydefault((ProcessingAppModel) viewModel4);
                    } else if (viewModel2 instanceof UpdateFormAppModel) {
                        MutableLiveData<C43734ruq<UpdateFormAppModel>> mutableLiveDataDjBIcL = rif.KWHzl().djBIcL();
                        PageComponentAppModel viewModel5 = c43700ruI.OLrzqt().getViewModel();
                        Intrinsics.copydefault(viewModel5, "");
                        mutableLiveDataDjBIcL.setValue(new C43734ruq<>((UpdateFormAppModel) viewModel5));
                    }
                }
            } else {
                rif.KWHzl().OLrzqt(false);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(rIF rif, C43734ruq c43734ruq) {
        kotlin.Pair pair;
        if (c43734ruq != null && (pair = (kotlin.Pair) c43734ruq.EZpvd()) != null) {
            rif.KWHzl().valueOf().setValue(new C43734ruq<>(pair.getSecond()));
            if (!((java.lang.Boolean) pair.getSecond()).booleanValue()) {
                java.lang.Object first = pair.getFirst();
                Intrinsics.copydefault(first, "");
                ((C52794wYp) first).fIwbmz();
            } else {
                java.lang.Object first2 = pair.getFirst();
                Intrinsics.copydefault(first2, "");
                C52794wYp.startLoading$default((C52794wYp) first2, 0L, 1, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(rIF rif, C43734ruq c43734ruq) {
        Intrinsics.checkNotNullParameter(c43734ruq, "");
        kotlin.Pair pair = (kotlin.Pair) c43734ruq.EZpvd();
        if (pair != null) {
            rif.KWHzl().OLrzqt(rif.AYXKKw(), rif.valueOf());
            rif.KWHzl().AEQbTJ((ResultStatus) pair.getSecond(), (From) pair.getFirst());
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(rIF rif, C43734ruq c43734ruq) {
        C52794wYp c52794wYpOLrzqt;
        java.lang.String id;
        kotlin.Pair pair = (kotlin.Pair) c43734ruq.EZpvd();
        if (pair != null) {
            CTAButtonAppModel cTAButtonAppModel = (CTAButtonAppModel) pair.getFirst();
            DialogInformation dialogInformation = (DialogInformation) pair.getSecond();
            ButtonAction action = cTAButtonAppModel.getAction();
            if (action != null && StateListAnimator.EZpvd[action.ordinal()] == 1) {
                rif.KWHzl().OLrzqt(null, From.NONE, rif.AYXKKw(), rif.valueOf(), rif.AuCTel().getOnExit(), rif.AuCTel().getId());
            } else {
                rIM rimFetchVPNInfo = rif.fetchVPNInfo();
                if (dialogInformation.getButton() != null) {
                    c52794wYpOLrzqt = dialogInformation.getButton();
                } else {
                    c52794wYpOLrzqt = !dialogInformation.isPopUp() ? rif.fetchVPNInfo().OLrzqt() : null;
                }
                C52794wYp c52794wYp = c52794wYpOLrzqt;
                java.lang.String strAYXKKw = rif.AYXKKw();
                java.lang.String strCopydefault = rif.copydefault();
                if (C33129mqd.OLrzqt((java.lang.CharSequence) dialogInformation.getPageId())) {
                    id = dialogInformation.getPageId();
                } else {
                    id = rif.AuCTel().getId();
                    if (id == null) {
                        id = "";
                    }
                }
                AbstractC42074rFj.onButtonClicked$default(rimFetchVPNInfo, c52794wYp, cTAButtonAppModel, strAYXKKw, strCopydefault, id, rif.valueOf(), new C43739ruv(), rif.KWHzl().OLrzqt(), rif.getActivity(), java.lang.Boolean.TRUE, null, null, null, null, null, null, null, 130048, null);
            }
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final ProcessingAppModel processingAppModel) {
        java.lang.String url;
        ActivityC42454rTl.Application application = ActivityC42454rTl.Companion;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        java.lang.String str = "";
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        Polling polling = processingAppModel.getPolling();
        if (polling != null && (url = polling.getUrl()) != null) {
            str = url;
        }
        application.KWHzl(fragmentActivityRequireActivity, str, processingAppModel.getProcessTimeOut(), new Function1() { // from class: o.rIP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rIF.KWHzl(this.AEQbTJ, processingAppModel, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit KWHzl(rIF rif, ProcessingAppModel processingAppModel, boolean z) {
        java.util.HashMap<java.lang.String, java.lang.String> map;
        java.lang.String target;
        rIM rimFetchVPNInfo = rif.fetchVPNInfo();
        java.lang.String strAYXKKw = rif.AYXKKw();
        java.lang.String strCopydefault = rif.copydefault();
        java.util.HashMap<java.lang.String, java.lang.String> mapValueOf = rif.valueOf();
        java.lang.String id = processingAppModel.getId();
        java.lang.String str = id == null ? "" : id;
        Onboarding onboarding = processingAppModel.getOnboarding();
        java.lang.String str2 = (onboarding == null || (target = onboarding.getTarget()) == null) ? "" : target;
        Onboarding onboarding2 = processingAppModel.getOnboarding();
        if (onboarding2 == null || (map = onboarding2.getOnboardingParam()) == null) {
            map = new java.util.HashMap<>();
        }
        rimFetchVPNInfo.copydefault(strAYXKKw, strCopydefault, mapValueOf, str, str2, map);
        return Unit.INSTANCE;
    }

    public final void copydefault(ProcessingAppModel processingAppModel) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ProcessingFragment$getWCResult$1(this, processingAppModel, null), 3, null);
    }

    private final void KWHzl(final android.view.View view) {
        C52794wYp c52794wYp;
        if (view instanceof C42249rLw) {
            java.util.Iterator<T> it = fetchVPNInfo().AuCTelauCTel().iterator();
            while (it.hasNext()) {
                C42249rLw c42249rLw = (C42249rLw) view;
                if (Intrinsics.EZpvd((java.lang.Object) c42249rLw.EZpvd(), (java.lang.Object) ((rAX) it.next()).OLrzqt())) {
                    AbstractC43890rxn abstractC43890rxnAEQbTJ = c42249rLw.AEQbTJ();
                    if (abstractC43890rxnAEQbTJ != null && (c52794wYp = abstractC43890rxnAEQbTJ.AEQbTJ) != null) {
                        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this, view));
                    }
                    fetchVPNInfo().fIwbmz().AEQbTJ().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.rIO
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return rIF.copydefault(view, (java.lang.Boolean) obj);
                        }
                    }));
                }
            }
        }
    }

    public static final Unit copydefault(android.view.View view, java.lang.Boolean bool) {
        AbstractC43890rxn abstractC43890rxnAEQbTJ;
        C52794wYp c52794wYp;
        C42249rLw c42249rLw = (C42249rLw) view;
        ButtonStyle style = c42249rLw.KWHzl().getStyle();
        if (style != null && StateListAnimator.copydefault[style.ordinal()] == 1 && (abstractC43890rxnAEQbTJ = c42249rLw.AEQbTJ()) != null && (c52794wYp = abstractC43890rxnAEQbTJ.AEQbTJ) != null) {
            c52794wYp.setEnabled(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    private final void hDKMBd() {
        fetchVPNInfo().OLrzqt(AuCTel());
    }

    @Override // o.AbstractC42060rEw, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ejfBZ();
        fIwbmz();
    }

    private final void fIwbmz() {
        rIM rimFetchVPNInfo = fetchVPNInfo();
        rimFetchVPNInfo.copydefault();
        rimFetchVPNInfo.fIwbmz().AEQbTJ().removeObservers(getViewLifecycleOwner());
        rimFetchVPNInfo.gEmmrt().removeObservers(getViewLifecycleOwner());
        rimFetchVPNInfo.djBIcL().removeObservers(getViewLifecycleOwner());
        rimFetchVPNInfo.fetchVPNInfo().removeObservers(getViewLifecycleOwner());
        rimFetchVPNInfo.hDKMBd().removeObservers(getViewLifecycleOwner());
    }
}
