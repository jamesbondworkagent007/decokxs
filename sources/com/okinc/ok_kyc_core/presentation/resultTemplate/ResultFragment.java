package com.okinc.ok_kyc_core.presentation.resultTemplate;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
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
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.common.net.HttpHeaders;
import com.okinc.ok_kyc_core.common.From;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonAction;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogInformation;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FormAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ProcessingAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.Quit;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ResultAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ResultStatus;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SelectWalletVerificationAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UpdateFormAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.VirtualActionAppModel;
import com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase;
import com.okinc.ok_kyc_core.presentation.resultTemplate.ResultFragment;
import com.okinc.web.WebActivity;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC42060rEw;
import o.AbstractC42074rFj;
import o.AbstractC43801rwD;
import o.AbstractC43890rxn;
import o.AbstractC43977rzU;
import o.ActivityC42162rIq;
import o.C33129mqd;
import o.C41968rBl;
import o.C41970rBn;
import o.C41971rBo;
import o.C41973rBq;
import o.C41975rBs;
import o.C41977rBu;
import o.C41978rBv;
import o.C41979rBw;
import o.C41981rBy;
import o.C41982rBz;
import o.C42163rIr;
import o.C42179rJg;
import o.C42249rLw;
import o.C43251rlk;
import o.C43662rtX;
import o.C43700ruI;
import o.C43733rup;
import o.C43734ruq;
import o.C43739ruv;
import o.C43746rvB;
import o.C52761wXj;
import o.C52794wYp;
import o.C55296xhK;
import o.C56390yDp;
import o.C56392yDr;
import o.C56444yFp;
import o.C56524yIo;
import o.InterfaceC32801mkT;
import o.InterfaceC37981pHw;
import o.InterfaceC43709ruR;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56445yFq;
import o.InterfaceC56514yIe;
import o.rAP;
import o.rAX;
import o.rBA;
import o.rBB;
import o.rBD;
import o.rBE;
import o.rBF;
import o.rBP;
import o.rBQ;
import o.rBT;
import o.rQO;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ResultFragment extends AbstractC42060rEw<AbstractC43801rwD, C42179rJg> {
    public ResultAppModel AubY;
    public final InterfaceC56387yDm getNewProxyInstance;
    public final InterfaceC56387yDm zsXlph;
    public final int iwGUEr = C43662rtX.TaskDescription.zuBGHE;
    public final InterfaceC56387yDm AuCTelauCTel = C56392yDr.copydefault(new Function0() { // from class: o.rJh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ResultFragment.AYXKKw(this.EZpvd);
        }
    });

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ButtonAction.values().length];
            try {
                iArr[ButtonAction.Quit.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[ButtonStyle.values().length];
            try {
                iArr2[ButtonStyle.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            OLrzqt = iArr2;
        }
    }

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.copydefault.invoke(obj);
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
    public final void copydefault(@NotNull ResultAppModel resultAppModel) {
        Intrinsics.checkNotNullParameter(resultAppModel, "");
        this.AubY = resultAppModel;
    }

    public ResultFragment() {
        Function0 function0 = new Function0() { // from class: o.rJi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ResultFragment.valueOf(this.AEQbTJ);
            }
        };
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.okinc.ok_kyc_core.presentation.resultTemplate.ResultFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.ok_kyc_core.presentation.resultTemplate.ResultFragment$special$$inlined$viewModels$default$2
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
        this.zsXlph = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C42179rJg.class), new Function0<ViewModelStore>() { // from class: com.okinc.ok_kyc_core.presentation.resultTemplate.ResultFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.ok_kyc_core.presentation.resultTemplate.ResultFragment$special$$inlined$viewModels$default$4
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
        this.getNewProxyInstance = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C42163rIr.class), new Function0<ViewModelStore>() { // from class: com.okinc.ok_kyc_core.presentation.resultTemplate.ResultFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.ok_kyc_core.presentation.resultTemplate.ResultFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.ok_kyc_core.presentation.resultTemplate.ResultFragment$special$$inlined$activityViewModels$default$3
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
        return (rQO) this.AuCTelauCTel.getValue();
    }

    public static final rQO AYXKKw(ResultFragment resultFragment) {
        FragmentManager childFragmentManager = resultFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        FragmentActivity fragmentActivityRequireActivity = resultFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return new rQO(childFragmentManager, fragmentActivityRequireActivity);
    }

    public static final class TaskDescription implements ViewModelProvider.Factory {
        public TaskDescription() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            C43746rvB c43746rvB = new C43746rvB(new rAP(), InterfaceC43709ruR.Companion.AEQbTJ(ResultFragment.this.AYXKKw(), ResultFragment.this.valueOf()), null, 4, null);
            return new C42179rJg(new C41970rBn(new rBD(c43746rvB), new rBP(c43746rvB), new C41973rBq(c43746rvB), new C41975rBs(c43746rvB), new rBF(c43746rvB), new rBE(c43746rvB), new rBB(c43746rvB), new C41979rBw(c43746rvB), new SingleFileUploadUseCase(c43746rvB), new rBA(c43746rvB)), new rBQ(new C41978rBv(c43746rvB), new C41982rBz(c43746rvB)), new rBT(new C41977rBu(c43746rvB), new C41981rBy(c43746rvB), new C41971rBo(c43746rvB), new C41968rBl(c43746rvB)));
        }
    }

    /* JADX DEBUG: Method merged with bridge method: fetchVPNInfo()Lo/rFj; */
    @Override // o.AbstractC42060rEw
    /* JADX INFO: renamed from: AuCTel, reason: merged with bridge method [inline-methods] */
    public C42179rJg fetchVPNInfo() {
        return (C42179rJg) this.zsXlph.getValue();
    }

    public static final ViewModelProvider.Factory valueOf(ResultFragment resultFragment) {
        return resultFragment.new TaskDescription();
    }

    public final ResultAppModel fIwbmz() {
        ResultAppModel resultAppModel = this.AubY;
        if (resultAppModel != null) {
            return resultAppModel;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractC42060rEw
    public C42163rIr KWHzl() {
        return (C42163rIr) this.getNewProxyInstance.getValue();
    }

    @Override // o.AbstractC42060rEw, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String countryOfResidence;
        super.onCreate(bundle);
        KWHzl(Boolean.FALSE);
        Bundle arguments = getArguments();
        PageComponentAppModel pageComponentAppModel = arguments != null ? (PageComponentAppModel) arguments.getParcelable("arg") : null;
        Intrinsics.copydefault(pageComponentAppModel, "");
        copydefault((ResultAppModel) pageComponentAppModel);
        String id = fIwbmz().getId();
        if (id != null) {
            C43739ruv c43739ruv = new C43739ruv();
            String strAYXKKw = AYXKKw();
            ResultStatus status = fIwbmz().getStatus();
            String strName = status != null ? status.name() : null;
            HashMap<String, String> mapValueOf = valueOf();
            PageComponentProfile pageComponentProfileAhwBna = AhwBna();
            String str = (pageComponentProfileAhwBna == null || (countryOfResidence = pageComponentProfileAhwBna.getCountryOfResidence()) == null) ? "" : countryOfResidence;
            ResultAppModel resultAppModelFIwbmz = fIwbmz();
            c43739ruv.AEQbTJ(id, strAYXKKw, "result", (456 & 8) != 0 ? null : strName, mapValueOf, str, (456 & 64) != 0 ? null : resultAppModelFIwbmz != null ? resultAppModelFIwbmz.getAmplitudeParams() : null, (456 & 128) != 0 ? null : null, (456 & 256) != 0 ? null : null);
        }
    }

    @Override // o.AbstractC42060rEw, androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, new StateListAnimator());
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public static final class StateListAnimator extends OnBackPressedCallback {
        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
        }

        public StateListAnimator() {
            super(true);
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ ResultFragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, ResultFragment resultFragment, View view2) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = resultFragment;
            this.AEQbTJ = view2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C52794wYp c52794wYp = (C52794wYp) this.OLrzqt;
                NavDestination currentDestination = FragmentKt.findNavController(this.copydefault).getCurrentDestination();
                if (currentDestination == null || currentDestination.getId() != C43662rtX.ActionBar.invokespecialdPnHjp) {
                    return;
                }
                C42179rJg c42179rJgFetchVPNInfo = this.copydefault.fetchVPNInfo();
                CTAButtonAppModel cTAButtonAppModelKWHzl = ((C42249rLw) this.AEQbTJ).KWHzl();
                String strAYXKKw = this.copydefault.AYXKKw();
                String strCopydefault = this.copydefault.copydefault();
                String id = this.copydefault.fIwbmz().getId();
                if (id == null) {
                    id = "";
                }
                AbstractC42074rFj.onButtonClicked$default(c42179rJgFetchVPNInfo, c52794wYp, cTAButtonAppModelKWHzl, strAYXKKw, strCopydefault, id, this.copydefault.valueOf(), new C43739ruv(), this.copydefault.KWHzl().OLrzqt(), this.copydefault.getActivity(), null, null, null, null, null, null, this.copydefault.djBIcL(), null, 97792, null);
            }
        }
    }

    @Override // o.AbstractC42060rEw, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        InterfaceC37981pHw interfaceC37981pHw;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fetchVPNInfo().zsXlph();
        AbstractC43801rwD abstractC43801rwDAEQbTJ = AEQbTJ();
        if (abstractC43801rwDAEQbTJ != null) {
            Bundle arguments = getArguments();
            PageComponentAppModel pageComponentAppModel = arguments != null ? (PageComponentAppModel) arguments.getParcelable("arg") : null;
            Intrinsics.copydefault(pageComponentAppModel, "");
            final ResultAppModel resultAppModel = (ResultAppModel) pageComponentAppModel;
            abstractC43801rwDAEQbTJ.KWHzl.removeAllViews();
            Integer numIsHidePro = resultAppModel.isHidePro();
            if (numIsHidePro != null) {
                numIsHidePro.intValue();
                KWHzl().KWHzl(resultAppModel.isHidePro().intValue());
            }
            final AbstractC43977rzU abstractC43977rzU = abstractC43801rwDAEQbTJ.valueOf;
            abstractC43977rzU.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.rIV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    ResultFragment.copydefault(resultAppModel, abstractC43977rzU, this, view2);
                }
            });
            if (Intrinsics.EZpvd(resultAppModel.getCanClose(), Boolean.FALSE)) {
                abstractC43977rzU.AEQbTJ.setVisibility(8);
            } else {
                abstractC43977rzU.AEQbTJ.setVisibility(0);
            }
            if (Intrinsics.EZpvd(resultAppModel.getCanGoBack(), Boolean.TRUE)) {
                abstractC43977rzU.KWHzl.setVisibility(0);
                abstractC43977rzU.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.rJd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        ResultFragment.EZpvd(this.KWHzl, view2);
                    }
                });
            } else {
                abstractC43977rzU.KWHzl.setVisibility(8);
            }
            if (C33129mqd.OLrzqt((CharSequence) resultAppModel.getFaqUrl())) {
                abstractC43977rzU.AEQbTJ.setVisibility(0);
                abstractC43977rzU.AEQbTJ.setImageResource(C43662rtX.Activity.sSMYrx);
            }
            EZpvd(resultAppModel);
            uzCIH();
            rQO rqoFARcdN = fARcdN();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            for (View view2 : rqoFARcdN.AEQbTJ(contextRequireContext, childFragmentManager, resultAppModel, fetchVPNInfo(), this)) {
                abstractC43801rwDAEQbTJ.KWHzl.addView(view2);
                copydefault(view2);
                if (view2 instanceof C42249rLw) {
                    InterfaceC32801mkT.ActionBar.setupClickProtection$default((InterfaceC32801mkT) C43251rlk.copydefault(InterfaceC32801mkT.class), view2, null, getContext(), null, null, 26, null);
                }
            }
            CtaAppModel cta = resultAppModel.getCta();
            if (cta != null) {
                rQO rqoFARcdN2 = fARcdN();
                Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                FragmentManager childFragmentManager2 = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                for (View view3 : rqoFARcdN2.KWHzl(contextRequireContext2, childFragmentManager2, cta, fetchVPNInfo(), this)) {
                    abstractC43801rwDAEQbTJ.AEQbTJ.copydefault.addView(view3);
                    copydefault(view3);
                }
            }
        }
        if (fIwbmz().getStatus() == ResultStatus.Success && (interfaceC37981pHw = (InterfaceC37981pHw) C43251rlk.OLrzqt(InterfaceC37981pHw.class)) != null) {
            interfaceC37981pHw.AEQbTJ();
        }
        LiveData<C43734ruq<Pair<C43700ruI, C52794wYp>>> liveDataFetchVPNInfo = fetchVPNInfo().fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C43733rup.copydefault(liveDataFetchVPNInfo, viewLifecycleOwner, new Function1() { // from class: o.rJc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ResultFragment.gEmmrt(this.OLrzqt, (C43734ruq) obj);
            }
        });
        LiveData<C43734ruq<Pair<View, Boolean>>> liveDataGEmmrt = fetchVPNInfo().gEmmrt();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        C43733rup.copydefault(liveDataGEmmrt, viewLifecycleOwner2, new Function1() { // from class: o.rJe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ResultFragment.AYXKKw(this.EZpvd, (C43734ruq) obj);
            }
        });
        LiveData<C43734ruq<Pair<From, ResultStatus>>> liveDataDjBIcL = fetchVPNInfo().djBIcL();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        C43733rup.copydefault(liveDataDjBIcL, viewLifecycleOwner3, new Function1() { // from class: o.rJa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ResultFragment.AhwBna(this.copydefault, (C43734ruq) obj);
            }
        });
        LiveData<C43734ruq<Boolean>> liveDataHDKMBd = fetchVPNInfo().hDKMBd();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        C43733rup.copydefault(liveDataHDKMBd, viewLifecycleOwner4, new Function1() { // from class: o.rJb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ResultFragment.djBIcL(this.EZpvd, (C43734ruq) obj);
            }
        });
        MutableLiveData<C43734ruq<Pair<CTAButtonAppModel, DialogInformation>>> mutableLiveDataKWHzl = KWHzl().KWHzl();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        C43733rup.copydefault(mutableLiveDataKWHzl, viewLifecycleOwner5, new Function1() { // from class: o.rJj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ResultFragment.valueOf(this.EZpvd, (C43734ruq) obj);
            }
        });
    }

    public static final void copydefault(ResultAppModel resultAppModel, AbstractC43977rzU abstractC43977rzU, ResultFragment resultFragment, View view) {
        ResultStatus status;
        ResultStatus status2;
        String countryOfResidence;
        if (C33129mqd.OLrzqt((CharSequence) resultAppModel.getFaqUrl())) {
            Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", resultAppModel.getFaqUrl()), C56390yDp.OLrzqt("title", ""));
            WebActivity.TaskDescription taskDescription = WebActivity.Companion;
            FragmentActivity fragmentActivityRequireActivity = resultFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            WebActivity.TaskDescription.openPage$default(taskDescription, fragmentActivityRequireActivity, bundleBundleOf, null, 4, null);
            return;
        }
        Quit quit = resultAppModel.getQuit();
        if (quit != null) {
            Boolean shouldShow = quit.getShouldShow();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.EZpvd(shouldShow, bool)) {
                C42179rJg c42179rJgFetchVPNInfo = resultFragment.fetchVPNInfo();
                Quit quit2 = resultAppModel.getQuit();
                FragmentManager childFragmentManager = resultFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                PageComponentProfile pageComponentProfileAhwBna = resultFragment.AhwBna();
                String str = (pageComponentProfileAhwBna == null || (countryOfResidence = pageComponentProfileAhwBna.getCountryOfResidence()) == null) ? "" : countryOfResidence;
                String strAYXKKw = resultFragment.AYXKKw();
                HashMap<String, String> mapValueOf = resultFragment.valueOf();
                String id = resultAppModel.getId();
                c42179rJgFetchVPNInfo.copydefault(quit2, childFragmentManager, str, strAYXKKw, mapValueOf, id == null ? "" : id);
                return;
            }
            C42163rIr c42163rIrKWHzl = resultFragment.KWHzl();
            if (Intrinsics.EZpvd(resultAppModel.isFlowSuccess(), bool)) {
                status2 = ResultStatus.Success;
            } else {
                status2 = resultAppModel.getStatus();
            }
            C42179rJg c42179rJgFetchVPNInfo2 = resultFragment.fetchVPNInfo();
            String strKWHzl = resultFragment.KWHzl(resultAppModel);
            c42163rIrKWHzl.KWHzl(status2, c42179rJgFetchVPNInfo2.AhwBna(strKWHzl != null ? strKWHzl : ""));
            return;
        }
        C42163rIr c42163rIrKWHzl2 = resultFragment.KWHzl();
        if (Intrinsics.EZpvd(resultAppModel.isFlowSuccess(), Boolean.TRUE)) {
            status = ResultStatus.Success;
        } else {
            status = resultAppModel.getStatus();
        }
        C42179rJg c42179rJgFetchVPNInfo3 = resultFragment.fetchVPNInfo();
        String strKWHzl2 = resultFragment.KWHzl(resultAppModel);
        c42163rIrKWHzl2.KWHzl(status, c42179rJgFetchVPNInfo3.AhwBna(strKWHzl2 != null ? strKWHzl2 : ""));
    }

    public static final void EZpvd(ResultFragment resultFragment, View view) {
        resultFragment.fetchVPNInfo().wlaJM();
    }

    public static final Unit gEmmrt(ResultFragment resultFragment, C43734ruq c43734ruq) {
        PageComponentAppModel viewModel;
        Integer maxLevel;
        Intrinsics.checkNotNullParameter(c43734ruq, "");
        Pair pair = (Pair) c43734ruq.EZpvd();
        if (pair != null) {
            C43700ruI c43700ruI = (C43700ruI) pair.getFirst();
            if (c43700ruI.OLrzqt().getOnDemandFeatureFlagEnabled()) {
                Boolean boolValueOf = c43700ruI.valueOf();
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.EZpvd(boolValueOf, bool)) {
                    resultFragment.KWHzl().OLrzqt(c43700ruI.OLrzqt().getViewModel());
                }
                PageComponentProfile profile = c43700ruI.OLrzqt().getProfile();
                if (profile == null || profile.getMaxLevel() == null || ((maxLevel = profile.getMaxLevel()) != null && maxLevel.intValue() == -1)) {
                    profile = null;
                }
                resultFragment.KWHzl().KWHzl(c43700ruI.KWHzl());
                resultFragment.KWHzl().AEQbTJ(c43700ruI.EZpvd());
                if (!(c43700ruI.OLrzqt().getViewModel() instanceof PopUpAppModel) && !(c43700ruI.OLrzqt().getViewModel() instanceof UpdateFormAppModel) && (viewModel = c43700ruI.OLrzqt().getViewModel()) != null && Intrinsics.EZpvd(viewModel.getPageStack(), bool)) {
                    ActivityC42162rIq.TaskDescription taskDescription = ActivityC42162rIq.Companion;
                    FragmentActivity fragmentActivityRequireActivity = resultFragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    ActivityC42162rIq.TaskDescription.goActivity$default(taskDescription, fragmentActivityRequireActivity, resultFragment.AYXKKw(), resultFragment.copydefault(), resultFragment.valueOf(), c43700ruI.OLrzqt(), resultFragment.gEmmrt(), null, 64, null);
                } else {
                    PageComponentAppModel viewModel2 = c43700ruI.OLrzqt().getViewModel();
                    if (viewModel2 instanceof FormAppModel) {
                        resultFragment.KWHzl().ejfBZ();
                        resultFragment.fetchVPNInfo().EZpvd(c43700ruI.OLrzqt().getViewModel(), c43700ruI.KWHzl(), c43700ruI.EZpvd(), profile, c43700ruI.copydefault());
                    } else if (viewModel2 instanceof ResultAppModel) {
                        resultFragment.KWHzl().ejfBZ();
                        resultFragment.fetchVPNInfo().AEQbTJ(c43700ruI.OLrzqt().getViewModel(), c43700ruI.KWHzl(), c43700ruI.EZpvd(), profile, c43700ruI.copydefault());
                    } else if (viewModel2 instanceof VirtualActionAppModel) {
                        resultFragment.KWHzl(profile);
                        AbstractC42074rFj.navigateVirtualAction$default(resultFragment.fetchVPNInfo(), c43700ruI.OLrzqt().getViewModel(), (C52794wYp) pair.getSecond(), c43700ruI.KWHzl(), ActivityC42162rIq.Companion.EZpvd(c43700ruI.KWHzl()), c43700ruI.EZpvd(), resultFragment.KWHzl().OLrzqt(), resultFragment.requireActivity(), null, null, MLKEMEngine.KyberPolyBytes, null);
                    } else if (viewModel2 instanceof PopUpAppModel) {
                        FragmentActivity activity = resultFragment.getActivity();
                        if (activity != null) {
                            C42179rJg c42179rJgFetchVPNInfo = resultFragment.fetchVPNInfo();
                            PageComponentAppModel viewModel3 = c43700ruI.OLrzqt().getViewModel();
                            String strKWHzl = c43700ruI.KWHzl();
                            HashMap<String, String> mapEZpvd = c43700ruI.EZpvd();
                            FragmentManager childFragmentManager = resultFragment.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                            AbstractC42074rFj.navigatePopUpAction$default(c42179rJgFetchVPNInfo, viewModel3, activity, childFragmentManager, strKWHzl, mapEZpvd, null, 32, null);
                        }
                    } else if (viewModel2 instanceof ProcessingAppModel) {
                        if (resultFragment.getActivity() != null) {
                            resultFragment.fetchVPNInfo().OLrzqt(c43700ruI.OLrzqt().getViewModel(), c43700ruI.KWHzl(), c43700ruI.AEQbTJ(), c43700ruI.EZpvd(), profile, c43700ruI.copydefault());
                        }
                    } else if (viewModel2 instanceof UpdateFormAppModel) {
                        MutableLiveData<C43734ruq<UpdateFormAppModel>> mutableLiveDataDjBIcL = resultFragment.KWHzl().djBIcL();
                        PageComponentAppModel viewModel4 = c43700ruI.OLrzqt().getViewModel();
                        Intrinsics.copydefault(viewModel4, "");
                        mutableLiveDataDjBIcL.setValue(new C43734ruq<>((UpdateFormAppModel) viewModel4));
                    } else if (viewModel2 instanceof SelectWalletVerificationAppModel) {
                        resultFragment.KWHzl().ejfBZ();
                        if (resultFragment.getActivity() != null) {
                            AbstractC42074rFj.navigateToSelectWalletVerificationPage$default(resultFragment.fetchVPNInfo(), c43700ruI.OLrzqt().getViewModel(), c43700ruI.KWHzl(), c43700ruI.EZpvd(), profile, null, 16, null);
                        }
                    } else if (viewModel2 != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                resultFragment.KWHzl().OLrzqt(false);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(ResultFragment resultFragment, C43734ruq c43734ruq) {
        Pair pair;
        if (c43734ruq != null && (pair = (Pair) c43734ruq.EZpvd()) != null) {
            resultFragment.KWHzl().valueOf().setValue(new C43734ruq<>(pair.getSecond()));
            if (!((Boolean) pair.getSecond()).booleanValue()) {
                Object first = pair.getFirst();
                Intrinsics.copydefault(first, "");
                ((C52794wYp) first).fIwbmz();
            } else {
                Object first2 = pair.getFirst();
                Intrinsics.copydefault(first2, "");
                C52794wYp.startLoading$default((C52794wYp) first2, 0L, 1, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(ResultFragment resultFragment, C43734ruq c43734ruq) {
        ResultStatus status;
        Intrinsics.checkNotNullParameter(c43734ruq, "");
        Pair pair = (Pair) c43734ruq.EZpvd();
        if (pair != null) {
            resultFragment.KWHzl().OLrzqt(resultFragment.AYXKKw(), resultFragment.valueOf());
            C42163rIr c42163rIrKWHzl = resultFragment.KWHzl();
            if (Intrinsics.EZpvd(resultFragment.fIwbmz().isFlowSuccess(), Boolean.TRUE)) {
                status = ResultStatus.Success;
            } else {
                status = resultFragment.fIwbmz().getStatus();
            }
            c42163rIrKWHzl.AEQbTJ(status, (From) pair.getFirst());
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(ResultFragment resultFragment, C43734ruq c43734ruq) {
        Intrinsics.checkNotNullParameter(c43734ruq, "");
        Boolean bool = (Boolean) c43734ruq.EZpvd();
        if (bool != null) {
            bool.booleanValue();
            C42163rIr c42163rIrKWHzl = resultFragment.KWHzl();
            ResultStatus status = resultFragment.fIwbmz().getStatus();
            C42179rJg c42179rJgFetchVPNInfo = resultFragment.fetchVPNInfo();
            String strKWHzl = resultFragment.KWHzl(resultFragment.fIwbmz());
            c42163rIrKWHzl.KWHzl(status, c42179rJgFetchVPNInfo.AhwBna(strKWHzl != null ? strKWHzl : ""));
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(ResultFragment resultFragment, C43734ruq c43734ruq) {
        C52794wYp c52794wYpOLrzqt;
        String id;
        Pair pair = (Pair) c43734ruq.EZpvd();
        if (pair != null) {
            CTAButtonAppModel cTAButtonAppModel = (CTAButtonAppModel) pair.getFirst();
            DialogInformation dialogInformation = (DialogInformation) pair.getSecond();
            ButtonAction action = cTAButtonAppModel.getAction();
            if (action != null && Activity.copydefault[action.ordinal()] == 1) {
                C42163rIr c42163rIrKWHzl = resultFragment.KWHzl();
                ResultStatus status = resultFragment.fIwbmz().getStatus();
                C42179rJg c42179rJgFetchVPNInfo = resultFragment.fetchVPNInfo();
                String strKWHzl = resultFragment.KWHzl(resultFragment.fIwbmz());
                c42163rIrKWHzl.OLrzqt(status, c42179rJgFetchVPNInfo.AhwBna(strKWHzl != null ? strKWHzl : ""), resultFragment.AYXKKw(), resultFragment.valueOf(), resultFragment.fIwbmz().getOnExit(), resultFragment.fIwbmz().getId());
            } else {
                C42179rJg c42179rJgFetchVPNInfo2 = resultFragment.fetchVPNInfo();
                if (dialogInformation.getButton() != null) {
                    c52794wYpOLrzqt = dialogInformation.getButton();
                } else {
                    c52794wYpOLrzqt = !dialogInformation.isPopUp() ? resultFragment.fetchVPNInfo().OLrzqt() : null;
                }
                String strAYXKKw = resultFragment.AYXKKw();
                String strCopydefault = resultFragment.copydefault();
                if (C33129mqd.OLrzqt((CharSequence) dialogInformation.getPageId())) {
                    id = dialogInformation.getPageId();
                } else {
                    id = resultFragment.fIwbmz().getId();
                    if (id == null) {
                        id = "";
                    }
                }
                AbstractC42074rFj.onButtonClicked$default(c42179rJgFetchVPNInfo2, c52794wYpOLrzqt, cTAButtonAppModel, strAYXKKw, strCopydefault, id, resultFragment.valueOf(), new C43739ruv(), resultFragment.KWHzl().OLrzqt(), resultFragment.getActivity(), Boolean.TRUE, null, null, null, null, null, null, null, 130048, null);
            }
        }
        return Unit.INSTANCE;
    }

    private final void copydefault(final View view) {
        C52794wYp c52794wYp;
        if (view instanceof C42249rLw) {
            Iterator<T> it = fetchVPNInfo().zLjUOn().iterator();
            while (it.hasNext()) {
                C42249rLw c42249rLw = (C42249rLw) view;
                if (Intrinsics.EZpvd((Object) c42249rLw.EZpvd(), (Object) ((rAX) it.next()).OLrzqt())) {
                    AbstractC43890rxn abstractC43890rxnAEQbTJ = c42249rLw.AEQbTJ();
                    if (abstractC43890rxnAEQbTJ != null && (c52794wYp = abstractC43890rxnAEQbTJ.AEQbTJ) != null) {
                        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this, view));
                    }
                    fetchVPNInfo().fIwbmz().AEQbTJ().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.rIZ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return ResultFragment.AEQbTJ(view, (java.lang.Boolean) obj);
                        }
                    }));
                }
            }
        }
    }

    public static final Unit AEQbTJ(View view, Boolean bool) {
        AbstractC43890rxn abstractC43890rxnAEQbTJ;
        C52794wYp c52794wYp;
        C42249rLw c42249rLw = (C42249rLw) view;
        ButtonStyle style = c42249rLw.KWHzl().getStyle();
        if (style != null && Activity.OLrzqt[style.ordinal()] == 1 && (abstractC43890rxnAEQbTJ = c42249rLw.AEQbTJ()) != null && (c52794wYp = abstractC43890rxnAEQbTJ.AEQbTJ) != null) {
            c52794wYp.setEnabled(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Illustrations {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Illustrations[] $VALUES;
        private final int imageId;
        private final String nameValue;
        public static final Illustrations SUCCESS = new Illustrations("SUCCESS", 0, "Success", C52761wXj.PendingIntent.uzCIH);
        public static final Illustrations SUCCESS_CONFETTI = new Illustrations("SUCCESS_CONFETTI", 1, "SuccessConfetti", C52761wXj.PendingIntent.AubY);
        public static final Illustrations WARNING = new Illustrations("WARNING", 2, HttpHeaders.WARNING, C52761wXj.PendingIntent.ejfBZ);
        public static final Illustrations WAITING = new Illustrations("WAITING", 3, "Waiting", C52761wXj.PendingIntent.iwGUEr);
        public static final Illustrations CONTINUE = new Illustrations("CONTINUE", 4, "Continue", C43662rtX.Activity.QkdxfA);
        public static final Illustrations RISK = new Illustrations("RISK", 5, "Risk", C52761wXj.PendingIntent.valueOf);
        public static final Illustrations READY = new Illustrations("READY", 6, "Ready", C43662rtX.Activity.QbewEr);
        public static final Illustrations QUESTION_SUCCESS = new Illustrations("QUESTION_SUCCESS", 7, "QuestionSuccess", C52761wXj.PendingIntent.uzCIH);
        public static final Illustrations QUESTION_FAIL = new Illustrations("QUESTION_FAIL", 8, "QuestionFail", C52761wXj.PendingIntent.valueOf);
        public static final Illustrations QUESTION_WARN = new Illustrations("QUESTION_WARN", 9, "QuestionWarn", C52761wXj.PendingIntent.ejfBZ);
        public static final Illustrations QUESTION_START = new Illustrations("QUESTION_START", 10, "QuestionStart", C43662rtX.Activity.QfsBiF);
        public static final Illustrations QUESTION_UPLOAD = new Illustrations("QUESTION_UPLOAD", 11, "QuestionUpload", C43662rtX.Activity.RdAHlO);
        public static final Illustrations QUESTION_PENDING = new Illustrations("QUESTION_PENDING", 12, "QuestionPending", C43662rtX.Activity.QfsBiF);
        public static final Illustrations RISK_QUESTIONNAIRE = new Illustrations("RISK_QUESTIONNAIRE", 13, "RiskQuestionnaire", C43662rtX.Activity.DCUTEI);
        public static final Illustrations RISK_SCAM = new Illustrations("RISK_SCAM", 14, "RiskScam", C43662rtX.Activity.QHmsKR);
        public static final Illustrations RISK_SUCCESS = new Illustrations("RISK_SUCCESS", 15, "RiskSuccess", C43662rtX.Activity.QHmsKR);
        public static final Illustrations PROCESSING = new Illustrations("PROCESSING", 16, "Processing", C52761wXj.PendingIntent.fIwbmz);
        public static final Illustrations VERIFICATION_SUCCESS = new Illustrations("VERIFICATION_SUCCESS", 17, "VerificationSuccess", C52761wXj.PendingIntent.uzCIH);
        public static final Illustrations TRANSACTION = new Illustrations("TRANSACTION", 18, "Transaction", C43662rtX.Activity.zuBGHE);
        public static final Illustrations SIGNATURE = new Illustrations("SIGNATURE", 19, RequestParameters.SIGNATURE, C43662rtX.Activity.AuCTelauCTel);
        public static final Illustrations REVIEW_IN_PROGRESS = new Illustrations("REVIEW_IN_PROGRESS", 20, "ReviewInProgress", C52761wXj.PendingIntent.fIwbmz);
        public static final Illustrations IN_PROGRESS = new Illustrations("IN_PROGRESS", 21, "InProgress", C52761wXj.PendingIntent.iwGUEr);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Illustrations[] $values() {
            return new Illustrations[]{SUCCESS, SUCCESS_CONFETTI, WARNING, WAITING, CONTINUE, RISK, READY, QUESTION_SUCCESS, QUESTION_FAIL, QUESTION_WARN, QUESTION_START, QUESTION_UPLOAD, QUESTION_PENDING, RISK_QUESTIONNAIRE, RISK_SCAM, RISK_SUCCESS, PROCESSING, VERIFICATION_SUCCESS, TRANSACTION, SIGNATURE, REVIEW_IN_PROGRESS, IN_PROGRESS};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Illustrations> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getImageId() {
            return this.imageId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNameValue() {
            return this.nameValue;
        }

        private Illustrations(String str, @IdRes int i, String str2, int i2) {
            this.nameValue = str2;
            this.imageId = i2;
        }

        static {
            Illustrations[] illustrationsArr$values = $values();
            $VALUES = illustrationsArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(illustrationsArr$values);
        }

        public static Illustrations valueOf(String str) {
            return (Illustrations) Enum.valueOf(Illustrations.class, str);
        }

        public static Illustrations[] values() {
            return (Illustrations[]) $VALUES.clone();
        }
    }

    public final Integer copydefault(String str) {
        if (str == null) {
            return null;
        }
        for (Illustrations illustrations : Illustrations.getEntries()) {
            if (Intrinsics.EZpvd((Object) illustrations.getNameValue(), (Object) str)) {
                return Integer.valueOf(illustrations.getImageId());
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(ResultAppModel resultAppModel) {
        LottieAnimationView lottieAnimationView;
        ResultStatus status = resultAppModel.getStatus();
        Integer numCopydefault = copydefault(status != null ? status.name() : null);
        if (numCopydefault != null) {
            int iIntValue = numCopydefault.intValue();
            AbstractC43801rwD abstractC43801rwDAEQbTJ = AEQbTJ();
            ImageView imageView = abstractC43801rwDAEQbTJ != null ? abstractC43801rwDAEQbTJ.copydefault : null;
            if (Intrinsics.EZpvd((Object) getResources().getResourceTypeName(iIntValue), (Object) "drawable")) {
                KWHzl(imageView, iIntValue);
                return;
            }
            AbstractC43801rwD abstractC43801rwDAEQbTJ2 = AEQbTJ();
            if (abstractC43801rwDAEQbTJ2 == null || (lottieAnimationView = abstractC43801rwDAEQbTJ2.OLrzqt) == null) {
                return;
            }
            ResultStatus status2 = resultAppModel.getStatus();
            if (Intrinsics.EZpvd((Object) (status2 != null ? status2.name() : null), (Object) "Waiting")) {
                lottieAnimationView.setRepeatCount(-1);
            } else {
                ResultStatus status3 = resultAppModel.getStatus();
                if (!Intrinsics.EZpvd((Object) (status3 != null ? status3.name() : null), (Object) "Processing")) {
                    ResultStatus status4 = resultAppModel.getStatus();
                    if (!Intrinsics.EZpvd((Object) (status4 != null ? status4.name() : null), (Object) "ReviewInProgress")) {
                        ResultStatus status5 = resultAppModel.getStatus();
                        if (!Intrinsics.EZpvd((Object) (status5 != null ? status5.name() : null), (Object) "InProgress")) {
                            lottieAnimationView.setRepeatCount(0);
                        }
                    }
                }
            }
            OLrzqt(lottieAnimationView, iIntValue);
        }
    }

    public final void OLrzqt(LottieAnimationView lottieAnimationView, int i) {
        AbstractC43801rwD abstractC43801rwDAEQbTJ = AEQbTJ();
        if (abstractC43801rwDAEQbTJ != null) {
            abstractC43801rwDAEQbTJ.copydefault.setVisibility(8);
            abstractC43801rwDAEQbTJ.OLrzqt.setVisibility(0);
        }
        lottieAnimationView.setAnimation(i);
        lottieAnimationView.playAnimation();
    }

    public final void KWHzl(ImageView imageView, @DrawableRes int i) {
        AbstractC43801rwD abstractC43801rwDAEQbTJ = AEQbTJ();
        if (abstractC43801rwDAEQbTJ != null) {
            abstractC43801rwDAEQbTJ.copydefault.setVisibility(0);
            abstractC43801rwDAEQbTJ.OLrzqt.setVisibility(8);
        }
        if (imageView != null) {
            imageView.setImageResource(i);
        }
    }

    private final void uzCIH() {
        fetchVPNInfo().EZpvd(fIwbmz());
    }

    public final String KWHzl(ResultAppModel resultAppModel) {
        CtaAppModel cta = resultAppModel.getCta();
        if (cta == null) {
            return null;
        }
        for (UIComponentAppModel uIComponentAppModel : cta.getItems()) {
            if (uIComponentAppModel instanceof CTAButtonAppModel) {
                CTAButtonAppModel cTAButtonAppModel = (CTAButtonAppModel) uIComponentAppModel;
                if (cTAButtonAppModel.getAction() == ButtonAction.Exit) {
                    return cTAButtonAppModel.getTarget();
                }
            }
        }
        return null;
    }

    @Override // o.AbstractC42060rEw, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ejfBZ();
        fJNWhG();
    }

    private final void fJNWhG() {
        C42179rJg c42179rJgFetchVPNInfo = fetchVPNInfo();
        c42179rJgFetchVPNInfo.copydefault();
        c42179rJgFetchVPNInfo.fIwbmz().AEQbTJ().removeObservers(getViewLifecycleOwner());
        c42179rJgFetchVPNInfo.gEmmrt().removeObservers(getViewLifecycleOwner());
        c42179rJgFetchVPNInfo.djBIcL().removeObservers(getViewLifecycleOwner());
        c42179rJgFetchVPNInfo.fetchVPNInfo().removeObservers(getViewLifecycleOwner());
        c42179rJgFetchVPNInfo.hDKMBd().removeObservers(getViewLifecycleOwner());
    }
}
