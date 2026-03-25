package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.okinc.account.api.service.UserInfoService;
import com.okinc.im.imui.group.create.CreateGroupFragment$initView$3;
import com.okinc.im.imui.group.create.CreateGroupFragment$observeUiEvents$1;
import com.okinc.im.imui.group.create.CreateGroupFragment$observeUiState$1;
import com.okinc.im.imui.group.create.CreateGroupFragment$startConversation$1;
import com.okinc.im.imui.group.create.IMEditProfileScenario;
import com.okinc.im.imui.group.create.adapter.CreateGroupAdapter;
import com.okinc.im.imui.group.create.model.CreateGroupDisplayItem;
import com.okinc.im.imui.group.create.viewmodel.CreateGroupViewModel;
import com.okinc.im.imui.picker.PickerSelectionType;
import com.okinc.im.imui.relationlist.model.GroupType;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC35723oBh;
import o.C35399nuc;
import o.C37152ooT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nQQ extends AbstractC34092nRc implements CreateGroupAdapter.TaskDescription, AbstractC35723oBh.Activity {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public nJD AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public BottomSheetDialogFragment KWHzl;
    public ViewOnClickListenerC54939xaY OLrzqt;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.nQT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return nQQ.gEmmrt(this.EZpvd);
        }
    });
    public final int AYXKKw = C35399nuc.Dialog.DarRvM;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CreateGroupDisplayItem.OptionKey.values().length];
            try {
                iArr[CreateGroupDisplayItem.OptionKey.INVITE_PERMISSIONS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AYXKKw;
    }

    public nQQ() {
        final Function0 function0 = null;
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CreateGroupViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.group.create.CreateGroupFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.group.create.CreateGroupFragment$special$$inlined$activityViewModels$default$2
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
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.group.create.CreateGroupFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.nRc.KWHzl()V */
    public final CreateGroupViewModel KWHzl() {
        return (CreateGroupViewModel) this.AhwBna.getValue();
    }

    public final CreateGroupAdapter EZpvd() {
        return (CreateGroupAdapter) this.copydefault.getValue();
    }

    public static final CreateGroupAdapter gEmmrt(nQQ nqq) {
        CreateGroupAdapter createGroupAdapter = new CreateGroupAdapter(nqq);
        createGroupAdapter.copydefault(nqq);
        return createGroupAdapter;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nQQ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final nQQ EZpvd() {
            return new nQQ();
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        nJD njdCopydefault = nJD.copydefault(layoutInflater, viewGroup, false);
        this.AEQbTJ = njdCopydefault;
        if (njdCopydefault != null) {
            return njdCopydefault.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.OLrzqt;
        if (viewOnClickListenerC54939xaY != null) {
            viewOnClickListenerC54939xaY.dismiss();
        }
        this.OLrzqt = null;
        BottomSheetDialogFragment bottomSheetDialogFragment = this.KWHzl;
        if (bottomSheetDialogFragment != null) {
            bottomSheetDialogFragment.dismissAllowingStateLoss();
        }
        this.KWHzl = null;
        this.AEQbTJ = null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        nJD njd = this.AEQbTJ;
        if (njd != null) {
            if (KWHzl().copydefault() != GroupType.PREMIUM) {
                android.content.Context context = njd.OLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                njd.OLrzqt.addItemDecoration(new C35941oJj(context, yED.AEQbTJ(java.lang.Integer.valueOf(CreateGroupAdapter.DisplayItemType.MEMBER_COUNT.ordinal())), 0, 0.0f, 0, 0, 60, null));
            }
            njd.OLrzqt.setAdapter(EZpvd());
            C52794wYp c52794wYp = njd.KWHzl;
            c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, njd, this));
        }
        getParentFragmentManager().setFragmentResultListener("GROUP_GUIDELINES_BOTTOM_SHEET_REQUEST_KEY", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.nQP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                nQQ.KWHzl(this.AEQbTJ, str, bundle2);
            }
        });
        AEQbTJ();
        valueOf();
        StateFlow<java.lang.Boolean> stateFlowValueOf = KWHzl().valueOf();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C37721ozF.collectOnLifecycle$default(stateFlowValueOf, viewLifecycleOwner, (Lifecycle.State) null, new CreateGroupFragment$initView$3(this, null), 2, (java.lang.Object) null);
    }

    public static final void KWHzl(nQQ nqq, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (bundle.getBoolean("GROUP_GUIDELINES_BOTTOM_SHEET_RESULT_KEY", false)) {
            nqq.KWHzl().KWHzl();
        }
    }

    public final void AEQbTJ() {
        SharedFlow<CreateGroupViewModel.Application> sharedFlowEZpvd = KWHzl().EZpvd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C37721ozF.collectOnLifecycle$default(sharedFlowEZpvd, viewLifecycleOwner, (Lifecycle.State) null, new CreateGroupFragment$observeUiEvents$1(this, null), 2, (java.lang.Object) null);
    }

    public final void valueOf() {
        StateFlow<CreateGroupViewModel.Activity> stateFlowAYXKKw = KWHzl().AYXKKw();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C37721ozF.collectOnLifecycle$default(stateFlowAYXKKw, viewLifecycleOwner, (Lifecycle.State) null, new CreateGroupFragment$observeUiState$1(this, null), 2, (java.lang.Object) null);
    }

    public final void KWHzl(CreateGroupViewModel.Activity activity) {
        final nJD njd = this.AEQbTJ;
        if (njd != null) {
            if (activity instanceof CreateGroupViewModel.Activity.C0415Activity) {
                EZpvd().OLrzqt((java.util.List) ((CreateGroupViewModel.Activity.C0415Activity) activity).AEQbTJ(), new Function0() { // from class: o.nQS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return nQQ.OLrzqt(njd);
                    }
                });
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
                return;
            }
            if (activity instanceof CreateGroupViewModel.Activity.LoaderManager) {
                njd.KWHzl.setEnabled(((CreateGroupViewModel.Activity.LoaderManager) activity).AEQbTJ());
                return;
            }
            if (activity instanceof CreateGroupViewModel.Activity.Application) {
                EZpvd().OLrzqt();
                return;
            }
            if (activity instanceof CreateGroupViewModel.Activity.TaskDescription) {
                C52794wYp.startLoading$default(njd.KWHzl, 0L, 1, null);
            } else if (activity instanceof CreateGroupViewModel.Activity.Dialog) {
                OLrzqt(((CreateGroupViewModel.Activity.Dialog) activity).AEQbTJ());
            } else if (activity instanceof CreateGroupViewModel.Activity.StateListAnimator) {
                EZpvd((CreateGroupViewModel.Activity.StateListAnimator) activity);
            }
        }
    }

    public static final Unit OLrzqt(final nJD njd) {
        njd.OLrzqt.post(new java.lang.Runnable() { // from class: o.nQU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                nQQ.copydefault(njd);
            }
        });
        return Unit.INSTANCE;
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ nQQ EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ nJD copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, nJD njd, nQQ nqq) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = njd;
            this.EZpvd = nqq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C33570myu.AEQbTJ(this.copydefault.KWHzl.getContext(), this.copydefault.KWHzl);
                if (this.EZpvd.KWHzl().OLrzqt().getValue().booleanValue()) {
                    this.EZpvd.KWHzl().KWHzl();
                } else {
                    new nQW().show(this.EZpvd.getParentFragmentManager(), this.EZpvd.getTAG());
                }
            }
        }
    }

    public static final void copydefault(nJD njd) {
        njd.OLrzqt.invalidateItemDecorations();
    }

    public final void EZpvd(final CreateGroupViewModel.Activity.StateListAnimator stateListAnimator) {
        C52794wYp c52794wYp;
        nJD njd = this.AEQbTJ;
        if (njd != null && (c52794wYp = njd.KWHzl) != null) {
            c52794wYp.setEnabled(false);
        }
        FragmentActivity activity = getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            nWM.EZpvd.copydefault(abstractActivityC33041mov, stateListAnimator.copydefault(), stateListAnimator.OLrzqt().getGroupId(), new Function0() { // from class: o.nQY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return nQQ.copydefault(this.OLrzqt, stateListAnimator);
                }
            });
        }
    }

    public static final Unit copydefault(nQQ nqq, CreateGroupViewModel.Activity.StateListAnimator stateListAnimator) {
        nqq.OLrzqt(stateListAnimator.OLrzqt());
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        IMEditProfileScenario.ImGroup imGroup = IMEditProfileScenario.ImGroup.copydefault;
        UserInfoService userInfoService = (UserInfoService) C43251rlk.copydefault(UserInfoService.class);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        UserInfoService.Application.startEditProfileFlow$default(userInfoService, fragmentActivityRequireActivity, imGroup.AEQbTJ(), null, new ActionBar(), imGroup.OLrzqt(), imGroup.EZpvd(), imGroup.copydefault(), 4, null);
    }

    public static final class ActionBar implements UserInfoService.Activity {
        public ActionBar() {
        }
    }

    public final void OLrzqt(GroupInfo groupInfo) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CreateGroupFragment$startConversation$1(this, groupInfo, OKConversation.Companion.AEQbTJ(OKConversationType.GROUP, groupInfo.getGroupId(), groupInfo.getName()), null), 3, null);
        C37290oqz c37290oqz = C37290oqz.copydefault;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c37290oqz.AEQbTJ(fragmentActivityRequireActivity);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ooT.Application.newInstance$default(o.ooT$Application, java.lang.String, boolean, java.lang.CharSequence, boolean, java.lang.CharSequence, com.okinc.im.imui.picker.PickerSelectionType, int, java.lang.Object):o.oBh */
    @Override // com.okinc.im.imui.group.create.adapter.CreateGroupAdapter.TaskDescription
    public void djBIcL() {
        nJD njd = this.AEQbTJ;
        if (njd != null) {
            C33570myu.AEQbTJ(njd.AEQbTJ.getContext(), njd.AEQbTJ);
        }
        C37152ooT.Application application = C37152ooT.Companion;
        java.lang.String string = getString(C35399nuc.LoaderManager.hTAtCx);
        Intrinsics.checkNotNullExpressionValue(string, "");
        AbstractC35723oBh abstractC35723oBhCopydefault = application.copydefault(string, (30 & 2) != 0, (30 & 4) != 0 ? null : null, (30 & 8) == 0 ? false : true, (30 & 16) == 0 ? null : null, (30 & 32) != 0 ? PickerSelectionType.ALL : PickerSelectionType.PHOTO);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        abstractC35723oBhCopydefault.show(childFragmentManager);
    }

    @Override // o.AbstractC35723oBh.Activity
    public void copydefault(@NotNull android.net.Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        KWHzl().OLrzqt(uri);
    }

    @Override // com.okinc.im.imui.group.create.adapter.CreateGroupAdapter.TaskDescription
    public void copydefault(java.lang.CharSequence charSequence) {
        KWHzl().copydefault(charSequence != null ? charSequence.toString() : null);
    }

    @Override // com.okinc.im.imui.group.create.adapter.CreateGroupAdapter.TaskDescription
    public void EZpvd(java.lang.CharSequence charSequence) {
        KWHzl().OLrzqt(charSequence != null ? charSequence.toString() : null);
    }

    @Override // com.okinc.im.imui.group.create.adapter.CreateGroupAdapter.TaskDescription
    public void AEQbTJ(@NotNull CreateGroupDisplayItem.OptionKey optionKey, boolean z) {
        Intrinsics.checkNotNullParameter(optionKey, "");
        EZpvd().OLrzqt(z);
        KWHzl().KWHzl(optionKey, z);
    }

    @Override // com.okinc.im.imui.group.create.adapter.CreateGroupAdapter.TaskDescription
    public void AEQbTJ(@NotNull CreateGroupDisplayItem.OptionKey optionKey) {
        Intrinsics.checkNotNullParameter(optionKey, "");
        if (TaskDescription.OLrzqt[optionKey.ordinal()] == 1) {
            BottomSheetDialogFragment bottomSheetDialogFragment = this.KWHzl;
            if (bottomSheetDialogFragment != null) {
                bottomSheetDialogFragment.dismiss();
            }
            C34097nRh c34097nRhKWHzl = C34097nRh.Companion.KWHzl();
            this.KWHzl = c34097nRhKWHzl;
            if (c34097nRhKWHzl != null) {
                c34097nRhKWHzl.show(getChildFragmentManager(), "InvitePermissionsBottomSheet");
            }
        }
    }

    public final void AYXKKw() {
        if (this.AEQbTJ != null) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.OLrzqt;
            if (viewOnClickListenerC54939xaY != null) {
                viewOnClickListenerC54939xaY.dismiss();
            }
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = new ViewOnClickListenerC54939xaY(contextRequireContext);
            viewOnClickListenerC54939xaY2.setTitle(C35399nuc.LoaderManager.QSbQqJ);
            viewOnClickListenerC54939xaY2.copydefault(C35399nuc.LoaderManager.registerKeyboardTarget);
            ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY2, C35399nuc.LoaderManager.getFieldNames, (View.OnClickListener) null, 2, (java.lang.Object) null);
            this.OLrzqt = viewOnClickListenerC54939xaY2;
            viewOnClickListenerC54939xaY2.show();
        }
    }
}
