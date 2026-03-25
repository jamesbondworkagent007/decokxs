package o;

import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.ok_kyc_core.common.From;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonAction;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
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
import com.okinc.ok_kyc_core.data.remote.networkmodel.UpdateFormAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.VirtualActionAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.WalletCardChoice;
import com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase;
import com.okinc.web.WebActivity;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC42162rIq;
import o.C43662rtX;
import o.C52761wXj;
import o.rSF;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rJp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42188rJp extends AbstractC42060rEw<AbstractC43799rwB, rJH> {
    public static final Application Companion = new Application(null);
    public static final int iwGUEr = 8;
    public SelectWalletVerificationAppModel AubY;
    public final InterfaceC56387yDm getNewProxyInstance;
    public final InterfaceC56387yDm zLjUOn;
    public final int AuCTelauCTel = C43662rtX.TaskDescription.AxsJAY;
    public final InterfaceC56387yDm wlaJM = C56392yDr.copydefault(new Function0() { // from class: o.rJC
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C42188rJp.djBIcL(this.KWHzl);
        }
    });

    /* JADX INFO: renamed from: o.rJp$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ButtonAction.values().length];
            try {
                iArr[ButtonAction.Quit.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            EZpvd = iArr;
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
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull SelectWalletVerificationAppModel selectWalletVerificationAppModel) {
        Intrinsics.checkNotNullParameter(selectWalletVerificationAppModel, "");
        this.AubY = selectWalletVerificationAppModel;
    }

    /* JADX INFO: renamed from: o.rJp$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rJp.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public C42188rJp() {
        Function0 function0 = new Function0() { // from class: o.rJI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42188rJp.valueOf(this.AEQbTJ);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.ok_kyc_core.presentation.satoshiTemplate.SelectWalletVerificationFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.ok_kyc_core.presentation.satoshiTemplate.SelectWalletVerificationFragment$special$$inlined$viewModels$default$2
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
        this.zLjUOn = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(rJH.class), new Function0<ViewModelStore>() { // from class: com.okinc.ok_kyc_core.presentation.satoshiTemplate.SelectWalletVerificationFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.ok_kyc_core.presentation.satoshiTemplate.SelectWalletVerificationFragment$special$$inlined$viewModels$default$4
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
        this.getNewProxyInstance = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C42163rIr.class), new Function0<ViewModelStore>() { // from class: com.okinc.ok_kyc_core.presentation.satoshiTemplate.SelectWalletVerificationFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.ok_kyc_core.presentation.satoshiTemplate.SelectWalletVerificationFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.ok_kyc_core.presentation.satoshiTemplate.SelectWalletVerificationFragment$special$$inlined$activityViewModels$default$3
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

    public static final rQO djBIcL(C42188rJp c42188rJp) {
        androidx.fragment.app.FragmentManager childFragmentManager = c42188rJp.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        FragmentActivity fragmentActivityRequireActivity = c42188rJp.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return new rQO(childFragmentManager, fragmentActivityRequireActivity);
    }

    /* JADX INFO: renamed from: o.rJp$PendingIntent */
    public static final class PendingIntent implements ViewModelProvider.Factory {
        public PendingIntent() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            C43746rvB c43746rvB = new C43746rvB(new rAP(), InterfaceC43709ruR.Companion.AEQbTJ(C42188rJp.this.AYXKKw(), C42188rJp.this.valueOf()), null, 4, null);
            return new rJH(new C41970rBn(new rBD(c43746rvB), new rBP(c43746rvB), new C41973rBq(c43746rvB), new C41975rBs(c43746rvB), new rBF(c43746rvB), new rBE(c43746rvB), new rBB(c43746rvB), new C41979rBw(c43746rvB), new SingleFileUploadUseCase(c43746rvB), new rBA(c43746rvB)), new rBQ(new C41978rBv(c43746rvB), new C41982rBz(c43746rvB)), new rBT(new C41977rBu(c43746rvB), new C41981rBy(c43746rvB), new C41971rBo(c43746rvB), new C41968rBl(c43746rvB)));
        }
    }

    /* JADX DEBUG: Method merged with bridge method: fetchVPNInfo()Lo/rFj; */
    @Override // o.AbstractC42060rEw
    /* JADX INFO: renamed from: fARcdN, reason: merged with bridge method [inline-methods] */
    public rJH fetchVPNInfo() {
        return (rJH) this.zLjUOn.getValue();
    }

    public static final ViewModelProvider.Factory valueOf(C42188rJp c42188rJp) {
        return c42188rJp.new PendingIntent();
    }

    public final SelectWalletVerificationAppModel fIwbmz() {
        SelectWalletVerificationAppModel selectWalletVerificationAppModel = this.AubY;
        if (selectWalletVerificationAppModel != null) {
            return selectWalletVerificationAppModel;
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
        OLrzqt((SelectWalletVerificationAppModel) pageComponentAppModel);
        java.lang.String id = fIwbmz().getId();
        if (id != null) {
            C43739ruv c43739ruv = new C43739ruv();
            java.lang.String strAYXKKw = AYXKKw();
            java.util.HashMap<java.lang.String, java.lang.String> mapValueOf = valueOf();
            PageComponentProfile pageComponentProfileAhwBna = AhwBna();
            c43739ruv.AEQbTJ(id, strAYXKKw, "selectWalletVerificationMethod", (456 & 8) != 0 ? null : null, mapValueOf, (pageComponentProfileAhwBna == null || (countryOfResidence = pageComponentProfileAhwBna.getCountryOfResidence()) == null) ? "" : countryOfResidence, (456 & 64) != 0 ? null : null, (456 & 128) != 0 ? null : null, (456 & 256) != 0 ? null : null);
        }
    }

    @Override // o.AbstractC42060rEw, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, new TaskDescription());
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* JADX INFO: renamed from: o.rJp$TaskDescription */
    public static final class TaskDescription extends OnBackPressedCallback {
        public TaskDescription() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            C42188rJp.this.fetchVPNInfo().wlaJM();
        }
    }

    /* JADX INFO: renamed from: o.rJp$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ SelectWalletVerificationAppModel EZpvd;
        public final /* synthetic */ AbstractC43799rwB KWHzl;
        public final /* synthetic */ C42188rJp OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C42188rJp c42188rJp, SelectWalletVerificationAppModel selectWalletVerificationAppModel, AbstractC43799rwB abstractC43799rwB) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c42188rJp;
            this.EZpvd = selectWalletVerificationAppModel;
            this.KWHzl = abstractC43799rwB;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                java.util.ArrayList<WalletCardChoice> cardChoice = this.OLrzqt.fIwbmz().getCardChoice();
                if (cardChoice != null) {
                    for (WalletCardChoice walletCardChoice : cardChoice) {
                        if (Intrinsics.EZpvd((java.lang.Object) walletCardChoice.getValue(), (java.lang.Object) this.EZpvd.getDefaultMethod()) && walletCardChoice.getCta() != null) {
                            rJH rjhFetchVPNInfo = this.OLrzqt.fetchVPNInfo();
                            C52794wYp c52794wYp = this.KWHzl.AYXKKw;
                            CTAButtonAppModel cta = walletCardChoice.getCta();
                            java.lang.String strAYXKKw = this.OLrzqt.AYXKKw();
                            java.lang.String strCopydefault = this.OLrzqt.copydefault();
                            java.lang.String id = this.OLrzqt.fIwbmz().getId();
                            if (id == null) {
                                id = "";
                            }
                            AbstractC42074rFj.onButtonClicked$default(rjhFetchVPNInfo, c52794wYp, cta, strAYXKKw, strCopydefault, id, this.OLrzqt.valueOf(), new C43739ruv(), this.OLrzqt.KWHzl().OLrzqt(), this.OLrzqt.getActivity(), java.lang.Boolean.FALSE, null, null, null, null, null, null, null, 130048, null);
                        }
                    }
                }
            }
        }
    }

    public final void KWHzl(final AbstractC43799rwB abstractC43799rwB, final SelectWalletVerificationAppModel selectWalletVerificationAppModel) {
        copydefault(abstractC43799rwB, selectWalletVerificationAppModel);
        if (Intrinsics.EZpvd((java.lang.Object) selectWalletVerificationAppModel.getDefaultMethod(), (java.lang.Object) "1")) {
            abstractC43799rwB.EZpvd.setVisibility(8);
            abstractC43799rwB.OLrzqt.setVisibility(0);
            abstractC43799rwB.AEQbTJ.setVisibility(0);
            abstractC43799rwB.KWHzl.setText(C33070mpX.AYXKKw(C43662rtX.Dialog.QSBOWP));
            abstractC43799rwB.isConnected.setText(C33070mpX.AYXKKw(C43662rtX.Dialog.OHqIaq));
            abstractC43799rwB.DbNXlk.setText(C33070mpX.AYXKKw(C43662rtX.Dialog.hBpjJd));
            abstractC43799rwB.AkhnZx.setText(C33070mpX.AYXKKw(C43662rtX.Dialog.dHguZz));
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C43662rtX.Dialog.RdAHlO);
            java.lang.String str = C33069mpW.OLrzqt(C33070mpX.AYXKKw(C43662rtX.Dialog.ODXsMY), C56423yEv.EZpvd(C56390yDp.OLrzqt("option", strAYXKKw))) + "\u200b";
            abstractC43799rwB.AuCTel.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            abstractC43799rwB.AuCTel.setText(C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.rJx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C42188rJp.OLrzqt(selectWalletVerificationAppModel, this, abstractC43799rwB, (java.util.List) obj);
                }
            }, 14, null));
            return;
        }
        abstractC43799rwB.EZpvd.setVisibility(0);
        abstractC43799rwB.OLrzqt.setVisibility(8);
        abstractC43799rwB.AEQbTJ.setVisibility(8);
        abstractC43799rwB.KWHzl.setText(C33070mpX.AYXKKw(C43662rtX.Dialog.dmfpNf));
        abstractC43799rwB.isConnected.setText(C33070mpX.AYXKKw(C43662rtX.Dialog.hrNTAI));
        abstractC43799rwB.DbNXlk.setText(C33070mpX.AYXKKw(C43662rtX.Dialog.OFhtUX));
        abstractC43799rwB.AkhnZx.setText(C33070mpX.AYXKKw(C43662rtX.Dialog.DLWbHP));
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C43662rtX.Dialog.gwTjWJ);
        java.lang.String str2 = C33069mpW.OLrzqt(C33070mpX.AYXKKw(C43662rtX.Dialog.ODXsMY), C56423yEv.EZpvd(C56390yDp.OLrzqt("option", strAYXKKw2))) + "\u200b";
        abstractC43799rwB.AuCTel.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        abstractC43799rwB.AuCTel.setText(C33061mpO.setupSpanStyles$default(str2, new java.lang.String[]{strAYXKKw2}, 0, null, false, new Function1() { // from class: o.rJy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42188rJp.AEQbTJ(selectWalletVerificationAppModel, this, abstractC43799rwB, (java.util.List) obj);
            }
        }, 14, null));
    }

    /* JADX INFO: renamed from: o.rJp$ActionBar */
    public static final class ActionBar extends android.text.style.ClickableSpan {
        public final /* synthetic */ AbstractC43799rwB EZpvd;
        public final /* synthetic */ SelectWalletVerificationAppModel KWHzl;
        public final /* synthetic */ C42188rJp OLrzqt;

        public ActionBar(SelectWalletVerificationAppModel selectWalletVerificationAppModel, C42188rJp c42188rJp, AbstractC43799rwB abstractC43799rwB) {
            this.KWHzl = selectWalletVerificationAppModel;
            this.OLrzqt = c42188rJp;
            this.EZpvd = abstractC43799rwB;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl.setDefaultMethod("2");
            this.OLrzqt.KWHzl(this.EZpvd, this.KWHzl);
        }
    }

    public static final Unit OLrzqt(SelectWalletVerificationAppModel selectWalletVerificationAppModel, C42188rJp c42188rJp, AbstractC43799rwB abstractC43799rwB, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        list.add(new ActionBar(selectWalletVerificationAppModel, c42188rJp, abstractC43799rwB));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.rJp$LoaderManager */
    public static final class LoaderManager extends android.text.style.ClickableSpan {
        public final /* synthetic */ SelectWalletVerificationAppModel KWHzl;
        public final /* synthetic */ AbstractC43799rwB OLrzqt;
        public final /* synthetic */ C42188rJp copydefault;

        public LoaderManager(SelectWalletVerificationAppModel selectWalletVerificationAppModel, C42188rJp c42188rJp, AbstractC43799rwB abstractC43799rwB) {
            this.KWHzl = selectWalletVerificationAppModel;
            this.copydefault = c42188rJp;
            this.OLrzqt = abstractC43799rwB;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl.setDefaultMethod("1");
            this.copydefault.KWHzl(this.OLrzqt, this.KWHzl);
        }
    }

    public static final Unit AEQbTJ(SelectWalletVerificationAppModel selectWalletVerificationAppModel, C42188rJp c42188rJp, AbstractC43799rwB abstractC43799rwB, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        list.add(new LoaderManager(selectWalletVerificationAppModel, c42188rJp, abstractC43799rwB));
        return Unit.INSTANCE;
    }

    public final void copydefault(AbstractC43799rwB abstractC43799rwB, SelectWalletVerificationAppModel selectWalletVerificationAppModel) {
        java.lang.String time;
        java.lang.String balance;
        java.util.ArrayList<WalletCardChoice> cardChoice = selectWalletVerificationAppModel.getCardChoice();
        if (cardChoice != null && cardChoice.size() == 2) {
            abstractC43799rwB.AuCTel.setVisibility(0);
        } else {
            abstractC43799rwB.AuCTel.setVisibility(8);
        }
        java.util.ArrayList<WalletCardChoice> cardChoice2 = selectWalletVerificationAppModel.getCardChoice();
        if (cardChoice2 != null) {
            for (WalletCardChoice walletCardChoice : cardChoice2) {
                if (Intrinsics.EZpvd((java.lang.Object) walletCardChoice.getValue(), (java.lang.Object) selectWalletVerificationAppModel.getDefaultMethod())) {
                    C52794wYp c52794wYp = abstractC43799rwB.AYXKKw;
                    CTAButtonAppModel cta = walletCardChoice.getCta();
                    c52794wYp.setText(cta != null ? cta.getText() : null);
                    final java.lang.String faqUrl = walletCardChoice.getFaqUrl();
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) faqUrl)) {
                        abstractC43799rwB.gEmmrt.OLrzqt.setVisibility(0);
                        abstractC43799rwB.gEmmrt.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.rJE
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                C42188rJp.OLrzqt(faqUrl, this, view);
                            }
                        });
                    } else {
                        abstractC43799rwB.gEmmrt.OLrzqt.setVisibility(8);
                    }
                }
            }
        }
        if (Intrinsics.EZpvd((java.lang.Object) selectWalletVerificationAppModel.getDefaultMethod(), (java.lang.Object) "1")) {
            abstractC43799rwB.copydefault.setText(C33070mpX.AYXKKw(C43662rtX.Dialog.QSLkRj));
            abstractC43799rwB.values.setVisibility(8);
            return;
        }
        java.util.ArrayList<WalletCardChoice> cardChoice3 = selectWalletVerificationAppModel.getCardChoice();
        if (cardChoice3 != null) {
            time = "";
            balance = time;
            for (WalletCardChoice walletCardChoice2 : cardChoice3) {
                if (Intrinsics.EZpvd((java.lang.Object) walletCardChoice2.getValue(), (java.lang.Object) "2")) {
                    time = walletCardChoice2.getTime();
                    if (time == null) {
                        time = "";
                    }
                    balance = walletCardChoice2.getBalance();
                    if (balance == null) {
                        balance = "";
                    }
                }
            }
        } else {
            time = "";
            balance = time;
        }
        abstractC43799rwB.copydefault.setText(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C43662rtX.Dialog.QCjLjM), C56424yEw.gEmmrt(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, time), C56390yDp.OLrzqt("balance", balance))), new java.lang.String[]{time}, 0, null, false, new Function1() { // from class: o.rJG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42188rJp.copydefault((java.util.List) obj);
            }
        }, 14, null), new java.lang.String[]{balance}, 0, null, false, new Function1() { // from class: o.rJv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42188rJp.OLrzqt((java.util.List) obj);
            }
        }, 14, null));
        abstractC43799rwB.values.setVisibility(0);
        java.util.ArrayList<WalletCardChoice> cardChoice4 = selectWalletVerificationAppModel.getCardChoice();
        if (cardChoice4 != null) {
            for (WalletCardChoice walletCardChoice3 : cardChoice4) {
                if (Intrinsics.EZpvd((java.lang.Object) walletCardChoice3.getValue(), (java.lang.Object) "2")) {
                    java.lang.String time2 = walletCardChoice3.getTime();
                    time = time2 == null ? "" : time2;
                }
            }
        }
        abstractC43799rwB.values.setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C43662rtX.Dialog.OxVOHk), C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, time))));
    }

    public static final void OLrzqt(java.lang.String str, C42188rJp c42188rJp, android.view.View view) {
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("title", ""));
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        FragmentActivity fragmentActivityRequireActivity = c42188rJp.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        WebActivity.TaskDescription.openPage$default(taskDescription, fragmentActivityRequireActivity, bundleBundleOf, null, 4, null);
    }

    public static final Unit copydefault(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.StyleSpan(1));
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.StyleSpan(1));
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(AbstractC43799rwB abstractC43799rwB, SelectWalletVerificationAppModel selectWalletVerificationAppModel) {
        abstractC43799rwB.djBIcL.setText("1");
        abstractC43799rwB.AhwBna.setText("2");
        abstractC43799rwB.valueOf.setText("3");
        KWHzl(abstractC43799rwB, selectWalletVerificationAppModel);
        C52794wYp c52794wYp = abstractC43799rwB.AYXKKw;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this, selectWalletVerificationAppModel, abstractC43799rwB));
    }

    @Override // o.AbstractC42060rEw, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AbstractC43799rwB abstractC43799rwBAEQbTJ = AEQbTJ();
        if (abstractC43799rwBAEQbTJ != null) {
            android.os.Bundle arguments = getArguments();
            PageComponentAppModel pageComponentAppModel = arguments != null ? (PageComponentAppModel) arguments.getParcelable("arg") : null;
            Intrinsics.copydefault(pageComponentAppModel, "");
            final SelectWalletVerificationAppModel selectWalletVerificationAppModel = (SelectWalletVerificationAppModel) pageComponentAppModel;
            AEQbTJ(abstractC43799rwBAEQbTJ, selectWalletVerificationAppModel);
            AbstractC43982rzZ abstractC43982rzZ = abstractC43799rwBAEQbTJ.gEmmrt;
            android.widget.TextView textView = abstractC43982rzZ.djBIcL;
            java.lang.String pageTitle = selectWalletVerificationAppModel.getPageTitle();
            if (pageTitle == null) {
                pageTitle = "";
            }
            textView.setText(pageTitle);
            abstractC43982rzZ.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.rJw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C42188rJp.OLrzqt(selectWalletVerificationAppModel, this, view2);
                }
            });
            java.lang.Boolean canClose = selectWalletVerificationAppModel.getCanClose();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (Intrinsics.EZpvd(canClose, bool)) {
                abstractC43982rzZ.AEQbTJ.setVisibility(8);
            } else {
                abstractC43982rzZ.AEQbTJ.setVisibility(0);
            }
            if (Intrinsics.EZpvd(selectWalletVerificationAppModel.getCanGoBack(), bool)) {
                abstractC43982rzZ.KWHzl.setVisibility(8);
            } else {
                abstractC43982rzZ.KWHzl.setVisibility(0);
                abstractC43982rzZ.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.rJu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        C42188rJp.OLrzqt(this.EZpvd, view2);
                    }
                });
            }
        }
        LiveData<C43734ruq<kotlin.Pair<C43700ruI, C52794wYp>>> liveDataFetchVPNInfo = fetchVPNInfo().fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C43733rup.copydefault(liveDataFetchVPNInfo, viewLifecycleOwner, new Function1() { // from class: o.rJA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42188rJp.AEQbTJ(this.OLrzqt, (C43734ruq) obj);
            }
        });
        LiveData<C43734ruq<kotlin.Pair<android.view.View, java.lang.Boolean>>> liveDataGEmmrt = fetchVPNInfo().gEmmrt();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        C43733rup.copydefault(liveDataGEmmrt, viewLifecycleOwner2, new Function1() { // from class: o.rJz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42188rJp.valueOf(this.EZpvd, (C43734ruq) obj);
            }
        });
        LiveData<C43734ruq<kotlin.Pair<From, ResultStatus>>> liveDataDjBIcL = fetchVPNInfo().djBIcL();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        C43733rup.copydefault(liveDataDjBIcL, viewLifecycleOwner3, new Function1() { // from class: o.rJB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42188rJp.AhwBna(this.EZpvd, (C43734ruq) obj);
            }
        });
        MutableLiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> mutableLiveDataKWHzl = KWHzl().KWHzl();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        C43733rup.copydefault(mutableLiveDataKWHzl, viewLifecycleOwner4, new Function1() { // from class: o.rJD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42188rJp.AYXKKw(this.OLrzqt, (C43734ruq) obj);
            }
        });
        rSF rsf = (rSF) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(rSF.class));
        if (rsf != null) {
            rSF.Application.refreshFeatureRestrictionRepository$default(rsf, LifecycleOwnerKt.getLifecycleScope(this), null, 2, null);
        }
    }

    public static final void OLrzqt(SelectWalletVerificationAppModel selectWalletVerificationAppModel, C42188rJp c42188rJp, android.view.View view) {
        Quit quitKWHzl;
        java.lang.String countryOfResidence;
        if (selectWalletVerificationAppModel.getQuit() != null) {
            Quit quit = selectWalletVerificationAppModel.getQuit();
            Intrinsics.copydefault(quit);
            if (Intrinsics.EZpvd(quit.getShouldShow(), java.lang.Boolean.FALSE)) {
                c42188rJp.KWHzl().OLrzqt(null, c42188rJp.fetchVPNInfo().AhwBna(""), c42188rJp.AYXKKw(), c42188rJp.valueOf(), null, selectWalletVerificationAppModel.getId());
                return;
            }
        }
        rJH rjhFetchVPNInfo = c42188rJp.fetchVPNInfo();
        if (selectWalletVerificationAppModel.getQuit() != null) {
            quitKWHzl = selectWalletVerificationAppModel.getQuit();
            Intrinsics.copydefault(quitKWHzl);
        } else {
            quitKWHzl = c42188rJp.KWHzl().KWHzl(c42188rJp.requireActivity());
        }
        Quit quit2 = quitKWHzl;
        androidx.fragment.app.FragmentManager childFragmentManager = c42188rJp.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        PageComponentProfile pageComponentProfileAhwBna = c42188rJp.AhwBna();
        java.lang.String str = (pageComponentProfileAhwBna == null || (countryOfResidence = pageComponentProfileAhwBna.getCountryOfResidence()) == null) ? "" : countryOfResidence;
        java.lang.String strAYXKKw = c42188rJp.AYXKKw();
        java.util.HashMap<java.lang.String, java.lang.String> mapValueOf = c42188rJp.valueOf();
        java.lang.String id = selectWalletVerificationAppModel.getId();
        rjhFetchVPNInfo.copydefault(quit2, childFragmentManager, str, strAYXKKw, mapValueOf, id == null ? "" : id);
    }

    public static final void OLrzqt(C42188rJp c42188rJp, android.view.View view) {
        c42188rJp.fetchVPNInfo().wlaJM();
    }

    public static final Unit AEQbTJ(C42188rJp c42188rJp, C43734ruq c43734ruq) {
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
                    c42188rJp.KWHzl().OLrzqt(c43700ruI.OLrzqt().getViewModel());
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
                c42188rJp.KWHzl().KWHzl(c43700ruI.KWHzl());
                c42188rJp.KWHzl().AEQbTJ(c43700ruI.EZpvd());
                if (!(c43700ruI.OLrzqt().getViewModel() instanceof PopUpAppModel) && !(c43700ruI.OLrzqt().getViewModel() instanceof UpdateFormAppModel) && (viewModel = c43700ruI.OLrzqt().getViewModel()) != null && Intrinsics.EZpvd(viewModel.getPageStack(), bool)) {
                    ActivityC42162rIq.TaskDescription taskDescription = ActivityC42162rIq.Companion;
                    FragmentActivity fragmentActivityRequireActivity = c42188rJp.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    ActivityC42162rIq.TaskDescription.goActivity$default(taskDescription, fragmentActivityRequireActivity, c42188rJp.AYXKKw(), c42188rJp.copydefault(), c42188rJp.valueOf(), c43700ruI.OLrzqt(), c42188rJp.gEmmrt(), null, 64, null);
                } else {
                    PageComponentAppModel viewModel2 = c43700ruI.OLrzqt().getViewModel();
                    if (viewModel2 instanceof FormAppModel) {
                        c42188rJp.KWHzl().ejfBZ();
                        c42188rJp.fetchVPNInfo().EZpvd(c43700ruI.OLrzqt().getViewModel(), c43700ruI.KWHzl(), c43700ruI.EZpvd(), pageComponentProfile, c43700ruI.copydefault());
                    } else if (viewModel2 instanceof ResultAppModel) {
                        c42188rJp.KWHzl().ejfBZ();
                        c42188rJp.fetchVPNInfo().AEQbTJ(c43700ruI.OLrzqt().getViewModel(), c43700ruI.KWHzl(), c43700ruI.EZpvd(), pageComponentProfile, c43700ruI.copydefault());
                    } else if (viewModel2 instanceof VirtualActionAppModel) {
                        c42188rJp.KWHzl(pageComponentProfile);
                        AbstractC42074rFj.navigateVirtualAction$default(c42188rJp.fetchVPNInfo(), c43700ruI.OLrzqt().getViewModel(), (C52794wYp) pair.getSecond(), c43700ruI.KWHzl(), ActivityC42162rIq.Companion.EZpvd(c43700ruI.KWHzl()), c43700ruI.EZpvd(), c42188rJp.KWHzl().OLrzqt(), c42188rJp.requireActivity(), null, null, MLKEMEngine.KyberPolyBytes, null);
                    } else if (viewModel2 instanceof PopUpAppModel) {
                        FragmentActivity activity = c42188rJp.getActivity();
                        if (activity != null) {
                            rJH rjhFetchVPNInfo = c42188rJp.fetchVPNInfo();
                            PageComponentAppModel viewModel3 = c43700ruI.OLrzqt().getViewModel();
                            java.lang.String strKWHzl = c43700ruI.KWHzl();
                            java.util.HashMap<java.lang.String, java.lang.String> mapEZpvd = c43700ruI.EZpvd();
                            androidx.fragment.app.FragmentManager childFragmentManager = c42188rJp.getChildFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                            AbstractC42074rFj.navigatePopUpAction$default(rjhFetchVPNInfo, viewModel3, activity, childFragmentManager, strKWHzl, mapEZpvd, null, 32, null);
                        }
                    } else if (viewModel2 instanceof ProcessingAppModel) {
                        if (c42188rJp.getActivity() != null) {
                            c42188rJp.fetchVPNInfo().OLrzqt(c43700ruI.OLrzqt().getViewModel(), c43700ruI.KWHzl(), c43700ruI.AEQbTJ(), c43700ruI.EZpvd(), pageComponentProfile, c43700ruI.copydefault());
                        }
                    } else if (viewModel2 instanceof UpdateFormAppModel) {
                        MutableLiveData<C43734ruq<UpdateFormAppModel>> mutableLiveDataDjBIcL = c42188rJp.KWHzl().djBIcL();
                        PageComponentAppModel viewModel4 = c43700ruI.OLrzqt().getViewModel();
                        Intrinsics.copydefault(viewModel4, "");
                        mutableLiveDataDjBIcL.setValue(new C43734ruq<>((UpdateFormAppModel) viewModel4));
                    }
                }
            } else {
                c42188rJp.KWHzl().OLrzqt(false);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C42188rJp c42188rJp, C43734ruq c43734ruq) {
        kotlin.Pair pair;
        if (c43734ruq != null && (pair = (kotlin.Pair) c43734ruq.EZpvd()) != null) {
            c42188rJp.KWHzl().valueOf().setValue(new C43734ruq<>(pair.getSecond()));
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

    public static final Unit AhwBna(C42188rJp c42188rJp, C43734ruq c43734ruq) {
        Intrinsics.checkNotNullParameter(c43734ruq, "");
        kotlin.Pair pair = (kotlin.Pair) c43734ruq.EZpvd();
        if (pair != null) {
            c42188rJp.KWHzl().AEQbTJ((ResultStatus) pair.getSecond(), (From) pair.getFirst());
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C42188rJp c42188rJp, C43734ruq c43734ruq) {
        C52794wYp c52794wYpOLrzqt;
        java.lang.String id;
        kotlin.Pair pair = (kotlin.Pair) c43734ruq.EZpvd();
        if (pair != null) {
            CTAButtonAppModel cTAButtonAppModel = (CTAButtonAppModel) pair.getFirst();
            DialogInformation dialogInformation = (DialogInformation) pair.getSecond();
            ButtonAction action = cTAButtonAppModel.getAction();
            if (action != null && Activity.EZpvd[action.ordinal()] == 1) {
                c42188rJp.KWHzl().OLrzqt(null, From.NONE, c42188rJp.AYXKKw(), c42188rJp.valueOf(), null, c42188rJp.fIwbmz().getId());
            } else {
                rJH rjhFetchVPNInfo = c42188rJp.fetchVPNInfo();
                if (dialogInformation.getButton() != null) {
                    c52794wYpOLrzqt = dialogInformation.getButton();
                } else {
                    c52794wYpOLrzqt = !dialogInformation.isPopUp() ? c42188rJp.fetchVPNInfo().OLrzqt() : null;
                }
                C52794wYp c52794wYp = c52794wYpOLrzqt;
                java.lang.String strAYXKKw = c42188rJp.AYXKKw();
                java.lang.String strCopydefault = c42188rJp.copydefault();
                if (C33129mqd.OLrzqt((java.lang.CharSequence) dialogInformation.getPageId())) {
                    id = dialogInformation.getPageId();
                } else {
                    id = c42188rJp.fIwbmz().getId();
                    if (id == null) {
                        id = "";
                    }
                }
                AbstractC42074rFj.onButtonClicked$default(rjhFetchVPNInfo, c52794wYp, cTAButtonAppModel, strAYXKKw, strCopydefault, id, c42188rJp.valueOf(), new C43739ruv(), c42188rJp.KWHzl().OLrzqt(), c42188rJp.getActivity(), java.lang.Boolean.TRUE, null, null, null, null, null, null, null, 130048, null);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC42060rEw, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ejfBZ();
        AuCTel();
    }

    private final void AuCTel() {
        rJH rjhFetchVPNInfo = fetchVPNInfo();
        rjhFetchVPNInfo.copydefault();
        rjhFetchVPNInfo.gEmmrt().removeObservers(getViewLifecycleOwner());
        rjhFetchVPNInfo.djBIcL().removeObservers(getViewLifecycleOwner());
        rjhFetchVPNInfo.fetchVPNInfo().removeObservers(getViewLifecycleOwner());
    }
}
