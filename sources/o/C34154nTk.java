package o;

import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.imui.group.info.adapter.TopMembersAdapter;
import com.okinc.im.imui.group.info.fragment.GroupProfileTopMembersFragment$initViewModel$1;
import com.okinc.im.imui.group.info.fragment.GroupProfileTopMembersFragment$initViewModel$2;
import com.okinc.im.imui.group.info.viewmodel.GroupProfileViewModel;
import com.okinc.im.imui.relationlist.model.SelectionActionType;
import com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import o.ActivityC37424ota;
import o.C35399nuc;
import o.C37290oqz;
import o.nWQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nTk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C34154nTk extends AbstractC32996moC implements TopMembersAdapter.ActionBar {
    public final InterfaceC56387yDm AhwBna;
    public nJL KWHzl;
    public ViewOnClickListenerC54939xaY OLrzqt;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.nTq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C34154nTk.AhwBna(this.copydefault);
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.nTr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C34154nTk.OLrzqt();
        }
    });
    public final ActivityResultLauncher<android.content.Intent> copydefault = C37290oqz.registerForImNewChatActivityResult$default(C37290oqz.copydefault, this, (C37290oqz.StateListAnimator) null, 1, (java.lang.Object) null);
    public final int EZpvd = C35399nuc.Dialog.QHmsKR;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.EZpvd;
    }

    public C34154nTk() {
        final Function0 function0 = null;
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(GroupProfileViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.group.info.fragment.GroupProfileTopMembersFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.group.info.fragment.GroupProfileTopMembersFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.group.info.fragment.GroupProfileTopMembersFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: Access modifiers changed from: private */
    public final GroupProfileViewModel djBIcL() {
        return (GroupProfileViewModel) this.AhwBna.getValue();
    }

    public final TopMembersAdapter KWHzl() {
        return (TopMembersAdapter) this.AEQbTJ.getValue();
    }

    public static final TopMembersAdapter AhwBna(C34154nTk c34154nTk) {
        TopMembersAdapter topMembersAdapter = new TopMembersAdapter();
        topMembersAdapter.EZpvd(c34154nTk);
        return topMembersAdapter;
    }

    public final C34151nTh EZpvd() {
        return (C34151nTh) this.AYXKKw.getValue();
    }

    public static final C34151nTh OLrzqt() {
        return new C34151nTh();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        nJL njlEZpvd = nJL.EZpvd(layoutInflater, viewGroup, false);
        this.KWHzl = njlEZpvd;
        if (njlEZpvd != null) {
            return njlEZpvd.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.OLrzqt;
        if (viewOnClickListenerC54939xaY != null) {
            viewOnClickListenerC54939xaY.dismiss();
        }
        this.KWHzl = null;
        super.onDestroyView();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        nJL njl = this.KWHzl;
        if (njl != null) {
            njl.OLrzqt.copydefault.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.UkuJRw));
            njl.copydefault.setAdapter(KWHzl());
            njl.AEQbTJ.setAdapter(EZpvd());
            njl.AEQbTJ.addItemDecoration(new C57593ylO(C55298xhM.dp2px$default(12.0f, null, 1, null), false, false));
        }
        gEmmrt();
    }

    private final void gEmmrt() {
        StateFlow<GroupProfileViewModel.TaskDescription> stateFlowAhwBna = djBIcL().AhwBna();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C37721ozF.collectOnLifecycle$default(stateFlowAhwBna, viewLifecycleOwner, (Lifecycle.State) null, new GroupProfileTopMembersFragment$initViewModel$1(this, null), 2, (java.lang.Object) null);
        SharedFlow<GroupProfileViewModel.ActionBar> sharedFlowCopydefault = djBIcL().copydefault();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        C37721ozF.collectOnLifecycle$default(sharedFlowCopydefault, viewLifecycleOwner2, (Lifecycle.State) null, new GroupProfileTopMembersFragment$initViewModel$2(this, null), 2, (java.lang.Object) null);
    }

    public final void EZpvd(C34157nTn c34157nTn) {
        nJL njl = this.KWHzl;
        if (njl != null) {
            if (c34157nTn.EZpvd()) {
                njl.OLrzqt.copydefault.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.asBinder));
                njl.OLrzqt.copydefault.setTextColor(ContextCompat.getColor(requireContext(), C35399nuc.Application.djBIcL));
                android.widget.TextView textView = njl.OLrzqt.KWHzl;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(8);
                android.widget.ImageView imageView = njl.OLrzqt.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(8);
                njl.OLrzqt.EZpvd.setClickable(false);
                return;
            }
            njl.OLrzqt.copydefault.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.UkuJRw));
            java.lang.String localized$default = pTB.formatLocalized$default(java.lang.String.valueOf(c34157nTn.KWHzl()), null, 1, null);
            android.widget.TextView textView2 = njl.OLrzqt.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            C55307xhV.AEQbTJ(textView2, localized$default);
            android.widget.ImageView imageView2 = njl.OLrzqt.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(0);
            android.widget.LinearLayout linearLayout = njl.OLrzqt.EZpvd;
            linearLayout.setOnClickListener(new TaskDescription(linearLayout, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.nTk$Application */
    public static final class Application implements Function1<EventParamsList, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            OLrzqt(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            java.lang.String strAYXKKw = C34154nTk.this.djBIcL().AYXKKw();
            EventParamsList.put$default(eventParamsList, "channel_id", strAYXKKw == null ? "" : strAYXKKw, false, 4, null);
            EventParamsList.put$default(eventParamsList, "channel_type", "0", false, 4, null);
        }
    }

    public final void copydefault(final GroupProfileViewModel.ActionBar actionBar) {
        if (actionBar instanceof GroupProfileViewModel.ActionBar.Application) {
            ActivityResultLauncher<android.content.Intent> activityResultLauncher = this.copydefault;
            ActivityC37424ota.TaskDescription taskDescription = ActivityC37424ota.Companion;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            activityResultLauncher.launch(taskDescription.KWHzl(contextRequireContext, (26 & 2) != 0 ? null : ((GroupProfileViewModel.ActionBar.Application) actionBar).KWHzl(), (26 & 4) != 0 ? null : SelectionActionType.ADD_MEMBER_TO_GROUP, (26 & 8) != 0 ? null : djBIcL().AYXKKw(), (26 & 16) != 0 ? null : null));
            return;
        }
        if (actionBar instanceof GroupProfileViewModel.ActionBar.C0420ActionBar) {
            nSP nsp = new nSP(new Function1() { // from class: o.nTm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34154nTk.OLrzqt(this.AEQbTJ, actionBar, (PaymentRequiredStatus) obj);
                }
            });
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            nsp.show(childFragmentManager);
            return;
        }
        if (actionBar instanceof GroupProfileViewModel.ActionBar.StateListAnimator) {
            InterfaceC8171axh interfaceC8171axh = (InterfaceC8171axh) C43251rlk.OLrzqt(InterfaceC8171axh.class);
            if (interfaceC8171axh != null) {
                FragmentActivity fragmentActivityRequireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                interfaceC8171axh.EZpvd(fragmentActivityRequireActivity, 1, new java.util.ArrayList<>(((GroupProfileViewModel.ActionBar.StateListAnimator) actionBar).AEQbTJ()));
                return;
            }
            return;
        }
        if (!(actionBar instanceof GroupProfileViewModel.ActionBar.Activity)) {
            throw new NoWhenBranchMatchedException();
        }
        nWM nwm = nWM.EZpvd;
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaYOLrzqt = nwm.OLrzqt(contextRequireContext2, ((GroupProfileViewModel.ActionBar.Activity) actionBar).copydefault());
        this.OLrzqt = viewOnClickListenerC54939xaYOLrzqt;
        if (viewOnClickListenerC54939xaYOLrzqt != null) {
            viewOnClickListenerC54939xaYOLrzqt.show();
        }
    }

    /* JADX INFO: renamed from: o.nTk$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C34154nTk KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C34154nTk c34154nTk) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = c34154nTk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C32866mlf.onEvent$default("IMChat_Details_MemberList_Click", (TrackChannel[]) null, this.KWHzl.new Application(), 1, (java.lang.Object) null);
                nWQ.Activity activity = nWQ.Companion;
                android.content.Context contextRequireContext = this.KWHzl.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                java.lang.String strAYXKKw = this.KWHzl.djBIcL().AYXKKw();
                this.KWHzl.startActivity(activity.copydefault(contextRequireContext, strAYXKKw != null ? strAYXKKw : "", this.KWHzl.djBIcL().AkhnZx()));
            }
        }
    }

    public static final Unit OLrzqt(C34154nTk c34154nTk, GroupProfileViewModel.ActionBar actionBar, PaymentRequiredStatus paymentRequiredStatus) {
        Intrinsics.checkNotNullParameter(paymentRequiredStatus, "");
        ActivityResultLauncher<android.content.Intent> activityResultLauncher = c34154nTk.copydefault;
        ActivityC37424ota.TaskDescription taskDescription = ActivityC37424ota.Companion;
        android.content.Context contextRequireContext = c34154nTk.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        activityResultLauncher.launch(taskDescription.KWHzl(contextRequireContext, ((GroupProfileViewModel.ActionBar.C0420ActionBar) actionBar).KWHzl(), SelectionActionType.ADD_MEMBER_TO_GROUP, c34154nTk.djBIcL().AYXKKw(), java.lang.Boolean.valueOf(paymentRequiredStatus == PaymentRequiredStatus.NOT_REQUIRED)));
        return Unit.INSTANCE;
    }

    @Override // com.okinc.im.imui.group.info.adapter.TopMembersAdapter.ActionBar
    public void OLrzqt(@NotNull GroupMemberInfo groupMemberInfo) {
        AbstractC33963nMi abstractC33963nMi;
        android.widget.LinearLayout linearLayout;
        Intrinsics.checkNotNullParameter(groupMemberInfo, "");
        nJL njl = this.KWHzl;
        if (njl == null || (abstractC33963nMi = njl.OLrzqt) == null || (linearLayout = abstractC33963nMi.EZpvd) == null) {
            return;
        }
        linearLayout.performClick();
    }

    @Override // com.okinc.im.imui.group.info.adapter.TopMembersAdapter.ActionBar
    public void copydefault() {
        djBIcL().EZpvd();
    }
}
