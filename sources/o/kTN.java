package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.dex.utils.CDNSourceManager;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.trade.features.home.autoconfirm.AutoConfirmEntryType;
import com.okinc.business.trade.features.home.autoconfirm.AutoConfirmLandingPageFragment$observeViewState$1;
import com.okinc.business.trade.features.home.autoconfirm.AutoConfirmLandingPageFragment$setupViews$1$3$1;
import com.okinc.business.trade.features.home.autoconfirm.AutoConfirmViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.web.WebActivity;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C23274hvD;
import o.kTU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class kTN extends kTZ {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public C21669hHy OLrzqt;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AutoConfirmEntryType.values().length];
            try {
                iArr[AutoConfirmEntryType.MARKET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AutoConfirmEntryType.STRATEGY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    public kTN() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.trade.features.home.autoconfirm.AutoConfirmLandingPageFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.autoconfirm.AutoConfirmLandingPageFragment$special$$inlined$viewModels$default$2
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AutoConfirmViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.autoconfirm.AutoConfirmLandingPageFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.autoconfirm.AutoConfirmLandingPageFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.autoconfirm.AutoConfirmLandingPageFragment$special$$inlined$viewModels$default$5
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
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.kTR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kTN.EZpvd(this.KWHzl);
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.kTO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kTN.copydefault(this.copydefault);
            }
        });
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kTN.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ kTN newInstance$default(ActionBar actionBar, AutoConfirmEntryType autoConfirmEntryType, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return actionBar.EZpvd(autoConfirmEntryType, str);
        }

        public final kTN EZpvd(@NotNull AutoConfirmEntryType autoConfirmEntryType, java.lang.String str) {
            Intrinsics.checkNotNullParameter(autoConfirmEntryType, "");
            kTN ktn = new kTN();
            ktn.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("arg_entry_type", autoConfirmEntryType.name()), C56390yDp.OLrzqt("arg_tracking_module", str)));
            return ktn;
        }
    }

    public final C21669hHy EZpvd() {
        C21669hHy c21669hHy = this.OLrzqt;
        Intrinsics.copydefault(c21669hHy);
        return c21669hHy;
    }

    public final AutoConfirmViewModel KWHzl() {
        return (AutoConfirmViewModel) this.KWHzl.getValue();
    }

    private final AutoConfirmEntryType valueOf() {
        return (AutoConfirmEntryType) this.AEQbTJ.getValue();
    }

    public static final AutoConfirmEntryType EZpvd(kTN ktn) {
        java.lang.String string;
        java.lang.Object objM7377constructorimpl;
        android.os.Bundle arguments = ktn.getArguments();
        if (arguments != null && (string = arguments.getString("arg_entry_type")) != null) {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(AutoConfirmEntryType.valueOf(string));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            AutoConfirmEntryType autoConfirmEntryType = (AutoConfirmEntryType) objM7377constructorimpl;
            if (autoConfirmEntryType != null) {
                return autoConfirmEntryType;
            }
        }
        return AutoConfirmEntryType.MARKET;
    }

    private final java.lang.String djBIcL() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    public static final java.lang.String copydefault(kTN ktn) {
        android.os.Bundle arguments = ktn.getArguments();
        if (arguments != null) {
            return arguments.getString("arg_tracking_module");
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.OLrzqt = C21669hHy.OLrzqt(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutAEQbTJ = EZpvd().getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutAEQbTJ, "");
        return constraintLayoutAEQbTJ;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        KWHzl().KWHzl(valueOf());
        isConnected();
        AEQbTJ();
        kTV.Companion.KWHzl();
        OLrzqt();
    }

    private final void isConnected() {
        C21669hHy c21669hHyEZpvd = EZpvd();
        android.widget.ImageView imageView = c21669hHyEZpvd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C22361hds.OLrzqt(imageView, CDNSourceManager.ImageSource.EoaAutoConfirmIntro);
        android.widget.ImageView backImage = c21669hHyEZpvd.EZpvd.getBackImage();
        backImage.setOnClickListener(new Application(backImage, 1000L, this));
        C55320xhi c55320xhi = c21669hHyEZpvd.AhwBna;
        c55320xhi.setOnClickListener(new Activity(c55320xhi, 1000L, this));
        c21669hHyEZpvd.OLrzqt.setContentDescription("web3_dex_dapp_token_info_confirm_button");
        c21669hHyEZpvd.OLrzqt.setOKDSSize(52);
        C25352ivB.setOnDoubleCheckClickListener$default(c21669hHyEZpvd.OLrzqt, 0L, new Function1() { // from class: o.kTS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kTN.OLrzqt(this.EZpvd, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit OLrzqt(kTN ktn, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if ((ktn.KWHzl().KWHzl().getValue() instanceof kTU.TaskDescription) || (ktn.KWHzl().KWHzl().getValue() instanceof kTU.LoaderManager)) {
            ktn.AEQbTJ(DexTrackEventParameter.ButtonName.OFF.getValue());
            C55326xho.toastWithSuccessfulIcon$default(C23274hvD.Fragment.IResultReceiverStubProxy, 0, 1, (java.lang.Object) null);
            ktn.KWHzl().EZpvd();
        } else {
            LifecycleOwner viewLifecycleOwner = ktn.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AutoConfirmLandingPageFragment$setupViews$1$3$1(ktn, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AutoConfirmLandingPageFragment$observeViewState$1(this, null), 3, null);
    }

    public final void KWHzl(kTU ktu) {
        java.lang.String string;
        EZpvd();
        if (ktu instanceof kTU.ActionBar) {
            return;
        }
        if (ktu instanceof kTU.Dialog) {
            EZpvd(null, false);
            EZpvd(false, 260, C23274hvD.Fragment.invokespecialhOMIpD);
            return;
        }
        if (ktu instanceof kTU.Application) {
            EZpvd(null, false);
            EZpvd(true, 257, C23274hvD.Fragment.DaTmkG);
            return;
        }
        if (ktu instanceof kTU.TaskDescription) {
            EZpvd(null, false);
            EZpvd(true, 260, C23274hvD.Fragment.invokespecialhOMIpD);
            return;
        }
        if (ktu instanceof kTU.LoaderManager) {
            kTU.LoaderManager loaderManager = (kTU.LoaderManager) ktu;
            EZpvd(copydefault(loaderManager.EZpvd(), loaderManager.OLrzqt()), true);
            EZpvd(true, 260, C23274hvD.Fragment.invokespecialhOMIpD);
            return;
        }
        if (ktu instanceof kTU.Fragment) {
            kTU.Fragment fragment = (kTU.Fragment) ktu;
            EZpvd(copydefault(fragment.KWHzl(), fragment.copydefault()), true);
            EZpvd(true, 257, C23274hvD.Fragment.DaTmkG);
            return;
        }
        boolean z = ktu instanceof kTU.FragmentManager;
        if (!z && !(ktu instanceof kTU.PendingIntent) && !(ktu instanceof kTU.AssistContent) && !(ktu instanceof kTU.VoiceInteractor) && !(ktu instanceof kTU.StateListAnimator) && !(ktu instanceof kTU.Activity)) {
            throw new NoWhenBranchMatchedException();
        }
        if (ktu instanceof kTU.AssistContent) {
            kTU.AssistContent assistContent = (kTU.AssistContent) ktu;
            string = copydefault(assistContent.KWHzl(), assistContent.EZpvd());
        } else if (ktu instanceof kTU.VoiceInteractor) {
            string = OLrzqt(((kTU.VoiceInteractor) ktu).EZpvd());
        } else if (ktu instanceof kTU.StateListAnimator) {
            string = OLrzqt(((kTU.StateListAnimator) ktu).KWHzl());
        } else if (z || (ktu instanceof kTU.Activity)) {
            string = getString(C23274hvD.Fragment.getPlaybackType);
            Intrinsics.checkNotNullExpressionValue(string, "");
        } else {
            string = getString(C23274hvD.Fragment.getAudioStream);
            Intrinsics.checkNotNullExpressionValue(string, "");
        }
        EZpvd(string, true);
        EZpvd(false, 260, C23274hvD.Fragment.invokespecialhOMIpD);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ kTN KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, kTN ktn) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = ktn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", "https://web3.okx.com/help/what-is-auto-confirm-in-okx-wallet"));
                WebActivity.TaskDescription taskDescription = WebActivity.Companion;
                FragmentActivity fragmentActivityRequireActivity = this.KWHzl.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                WebActivity.TaskDescription.openPage$default(taskDescription, fragmentActivityRequireActivity, bundleBundleOf, null, 4, null);
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ kTN AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, kTN ktn) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = ktn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.AEQbTJ(DexTrackEventParameter.ButtonName.BACK.getValue());
                FragmentActivity activity = this.AEQbTJ.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        }
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2) {
        int i;
        int i2 = TaskDescription.EZpvd[valueOf().ordinal()];
        if (i2 == 1) {
            i = C23274hvD.Fragment.MediaControllerCompatPlaybackInfo;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C23274hvD.Fragment.getVolumeControl;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return C33069mpW.KWHzl(contextRequireContext, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("value", C23322hvz.toLocalizedCurrencyNumberWithPrefix$default(str, false, null, false, false, 11, null)), C56390yDp.OLrzqt(CrashHianalyticsData.TIME, C23311hvo.EZpvd(str2))));
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        int i;
        int i2 = TaskDescription.EZpvd[valueOf().ordinal()];
        if (i2 == 1) {
            i = C23274hvD.Fragment.MediaControllerCompatTransportControls;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C23274hvD.Fragment.getMaxVolume;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return C33069mpW.KWHzl(contextRequireContext, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, C23311hvo.EZpvd(str))));
    }

    public final void EZpvd(java.lang.CharSequence charSequence, boolean z) {
        android.widget.TextView textView = EZpvd().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
        if (!z || charSequence == null) {
            return;
        }
        EZpvd().AEQbTJ.setText(charSequence);
    }

    public final void EZpvd(boolean z, int i, int i2) {
        EZpvd().OLrzqt.setEnabled(z);
        EZpvd().OLrzqt.setOKDSType(i);
        EZpvd().OLrzqt.setText(C33070mpX.AYXKKw(i2));
    }

    public final void OLrzqt() {
        final java.lang.String strDjBIcL = djBIcL();
        if (strDjBIcL == null) {
            return;
        }
        C32866mlf.onEvent$default("DEXTrade_AutoConfirm_FullPage_View", (TrackChannel[]) null, new Function1() { // from class: o.kTM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kTN.KWHzl(this.KWHzl, strDjBIcL, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(kTN ktn, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(ktn.KWHzl().copydefault()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "terminal", "android", false, 4, null);
        EventParamsList.put$default(eventParamsList, "module", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "auto_confirm", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final java.lang.String str) {
        final java.lang.String strDjBIcL = djBIcL();
        if (strDjBIcL == null) {
            return;
        }
        C32866mlf.onEvent$default("DEXTrade_AutoConfirm_FullPage_Click", (TrackChannel[]) null, new Function1() { // from class: o.kTQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kTN.OLrzqt(this.EZpvd, strDjBIcL, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(kTN ktn, java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(ktn.KWHzl().copydefault()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "terminal", "android", false, 4, null);
        EventParamsList.put$default(eventParamsList, "module", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "auto_confirm", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str2, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.OLrzqt = null;
    }
}
