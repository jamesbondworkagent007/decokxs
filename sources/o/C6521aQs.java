package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.auth.api.passkey.PasskeyResetRemoveType;
import com.okinc.auth.impl.passkey.model.AuthenticatorSelectModel;
import com.okinc.auth.impl.passkey.ui.resetremove.selection.BatchResetRemovePasskeyViewModel;
import com.okinc.auth.impl.passkey.ui.resetremove.selection.ResetRemovePasskeySelectionActivity;
import com.okinc.auth.impl.passkey.ui.resetremove.selection.batch.BatchResetRemovePasskeyFragment$initView$2$2;
import com.okinc.auth.impl.passkey.ui.resetremove.selection.batch.BatchResetRemovePasskeyFragment$initView$2$3;
import com.okinc.auth.impl.widget.SimpleToolBar;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aQs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6521aQs extends AbstractC6523aQu {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public C6449aPZ EZpvd;
    public C8249azF OLrzqt;
    public final InterfaceC56387yDm gEmmrt;
    public final int AEQbTJ = C8206ayP.Application.sSMYrx;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.aQp
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C6521aQs.EZpvd(this.EZpvd);
        }
    });

    /* JADX INFO: renamed from: o.aQs$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    public C6521aQs() {
        final Function0 function0 = null;
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BatchResetRemovePasskeyViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.passkey.ui.resetremove.selection.batch.BatchResetRemovePasskeyFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.passkey.ui.resetremove.selection.batch.BatchResetRemovePasskeyFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.passkey.ui.resetremove.selection.batch.BatchResetRemovePasskeyFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.aQu.AEQbTJ()V */
    public final BatchResetRemovePasskeyViewModel AEQbTJ() {
        return (BatchResetRemovePasskeyViewModel) this.gEmmrt.getValue();
    }

    /* JADX INFO: renamed from: o.aQs$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aQs.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C6521aQs AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull PasskeyResetRemoveType passkeyResetRemoveType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(passkeyResetRemoveType, "");
            C6521aQs c6521aQs = new C6521aQs();
            c6521aQs.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_TITLE_REMOVE_RESET", str), C56390yDp.OLrzqt("ARG_DESC_REMOVE_RESET", str2), C56390yDp.OLrzqt("ARG_RESET_REMOVE_TYPE", passkeyResetRemoveType)));
            return c6521aQs;
        }
    }

    public final PasskeyResetRemoveType KWHzl() {
        return (PasskeyResetRemoveType) this.KWHzl.getValue();
    }

    public static final PasskeyResetRemoveType EZpvd(C6521aQs c6521aQs) {
        PasskeyResetRemoveType passkeyResetRemoveType;
        android.os.Bundle arguments = c6521aQs.getArguments();
        return (arguments == null || (passkeyResetRemoveType = (PasskeyResetRemoveType) arguments.getParcelable("ARG_RESET_REMOVE_TYPE")) == null) ? PasskeyResetRemoveType.BatchReset.EZpvd : passkeyResetRemoveType;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C8249azF c8249azFAEQbTJ = C8249azF.AEQbTJ(layoutInflater, viewGroup, false);
        this.OLrzqt = c8249azFAEQbTJ;
        if (c8249azFAEQbTJ != null) {
            return c8249azFAEQbTJ.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("ARG_TITLE_REMOVE_RESET") : null;
        android.os.Bundle arguments2 = getArguments();
        java.lang.String string2 = arguments2 != null ? arguments2.getString("ARG_DESC_REMOVE_RESET") : null;
        C8249azF c8249azF = this.OLrzqt;
        if (c8249azF != null) {
            SimpleToolBar simpleToolBar = c8249azF.copydefault;
            simpleToolBar.setNavigationIconVisible(false);
            simpleToolBar.setRightIconOnClickListener(new Function0() { // from class: o.aQq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C6521aQs.AhwBna(this.EZpvd);
                }
            });
            c8249azF.AhwBna.setText(string);
            c8249azF.KWHzl.setText(string2);
            this.EZpvd = new C6449aPZ(new Function1() { // from class: o.aQt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C6521aQs.copydefault(this.OLrzqt, (AuthenticatorSelectModel) obj);
                }
            });
            c8249azF.AEQbTJ.setText(EZpvd());
            C52794wYp c52794wYp = c8249azF.AEQbTJ;
            c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
            RecyclerView recyclerView = c8249azF.OLrzqt;
            recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
            C6449aPZ c6449aPZ = this.EZpvd;
            if (c6449aPZ == null) {
                Intrinsics.gEmmrt("");
                c6449aPZ = null;
            }
            recyclerView.setAdapter(c6449aPZ);
            recyclerView.setItemAnimator(null);
            recyclerView.addItemDecoration(new C57593ylO(C55298xhM.dp2px$default(16.0f, null, 1, null), false, false));
        }
        BatchResetRemovePasskeyViewModel batchResetRemovePasskeyViewModelAEQbTJ = AEQbTJ();
        batchResetRemovePasskeyViewModelAEQbTJ.EZpvd().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.aQr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6521aQs.AEQbTJ(this.EZpvd, (java.util.List) obj);
            }
        }));
        Flow flowOnEach = FlowKt.onEach(batchResetRemovePasskeyViewModelAEQbTJ.KWHzl(), new BatchResetRemovePasskeyFragment$initView$2$2(this, null));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        FlowKt.launchIn(flowOnEach, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
        Flow flowOnEach2 = FlowKt.onEach(batchResetRemovePasskeyViewModelAEQbTJ.OLrzqt(), new BatchResetRemovePasskeyFragment$initView$2$3(null));
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        FlowKt.launchIn(flowOnEach2, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2));
        batchResetRemovePasskeyViewModelAEQbTJ.copydefault().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.aQx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6521aQs.OLrzqt(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final Unit AhwBna(C6521aQs c6521aQs) {
        FragmentActivity activity = c6521aQs.getActivity();
        ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity = activity instanceof ResetRemovePasskeySelectionActivity ? (ResetRemovePasskeySelectionActivity) activity : null;
        if (resetRemovePasskeySelectionActivity != null) {
            resetRemovePasskeySelectionActivity.OLrzqt();
        }
        c6521aQs.copydefault(OtpEventTracker.OTP_EVENT_VALUE_CANCEL);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C6521aQs c6521aQs, AuthenticatorSelectModel authenticatorSelectModel) {
        Intrinsics.checkNotNullParameter(authenticatorSelectModel, "");
        c6521aQs.AEQbTJ().AEQbTJ(authenticatorSelectModel);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.aQs$ActionBar */
    public static final class ActionBar implements Function0<Unit> {
        public final /* synthetic */ C6521aQs EZpvd;
        public final /* synthetic */ java.util.List<java.lang.String> OLrzqt;
        public final /* synthetic */ ResetRemovePasskeySelectionActivity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity, C6521aQs c6521aQs, java.util.List<java.lang.String> list) {
            this.copydefault = resetRemovePasskeySelectionActivity;
            this.EZpvd = c6521aQs;
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }

        public final void EZpvd() {
            this.copydefault.copydefault(this.EZpvd.KWHzl(), this.OLrzqt);
        }
    }

    /* JADX INFO: renamed from: o.aQs$TaskDescription */
    public static final class TaskDescription implements Function0<Unit> {
        public final /* synthetic */ ResetRemovePasskeySelectionActivity AEQbTJ;
        public final /* synthetic */ java.util.List<java.lang.String> OLrzqt;
        public final /* synthetic */ C6521aQs copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity, C6521aQs c6521aQs, java.util.List<java.lang.String> list) {
            this.AEQbTJ = resetRemovePasskeySelectionActivity;
            this.copydefault = c6521aQs;
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            OLrzqt();
            return Unit.INSTANCE;
        }

        public final void OLrzqt() {
            this.AEQbTJ.copydefault(this.copydefault.KWHzl(), this.OLrzqt);
        }
    }

    public static final Unit AEQbTJ(C6521aQs c6521aQs, java.util.List list) {
        C6449aPZ c6449aPZ = c6521aQs.EZpvd;
        if (c6449aPZ == null) {
            Intrinsics.gEmmrt("");
            c6449aPZ = null;
        }
        c6449aPZ.submitList(list);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C6521aQs c6521aQs, java.lang.Boolean bool) {
        C52794wYp c52794wYp;
        C8249azF c8249azF = c6521aQs.OLrzqt;
        if (c8249azF != null && (c52794wYp = c8249azF.AEQbTJ) != null) {
            c52794wYp.setEnabled(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    public final java.lang.String EZpvd() {
        PasskeyResetRemoveType passkeyResetRemoveTypeKWHzl = KWHzl();
        return passkeyResetRemoveTypeKWHzl instanceof PasskeyResetRemoveType.BatchRemove ? C33070mpX.AYXKKw(C8206ayP.Dialog.getFieldNames) : passkeyResetRemoveTypeKWHzl instanceof PasskeyResetRemoveType.BatchReset ? C33070mpX.AYXKKw(C8206ayP.Dialog.RAQtXZ) : C33070mpX.AYXKKw(C8206ayP.Dialog.RAQtXZ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(final java.lang.String str) {
        PasskeyResetRemoveType passkeyResetRemoveTypeKWHzl = KWHzl();
        if (passkeyResetRemoveTypeKWHzl instanceof PasskeyResetRemoveType.BatchRemove) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("PasskeyMultipleRemove_Full_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aQw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C6521aQs.EZpvd(str, (EventParamsList) obj);
                }
            });
        } else if (passkeyResetRemoveTypeKWHzl instanceof PasskeyResetRemoveType.BatchReset) {
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("PasskeyMultipleReset_Full_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.aQy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C6521aQs.OLrzqt(str, (EventParamsList) obj);
                }
            });
        }
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str, true);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, str, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.aQs$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C6521aQs KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C6521aQs c6521aQs) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = c6521aQs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.util.List listAhwBna;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                FragmentActivity activity = this.KWHzl.getActivity();
                ResetRemovePasskeySelectionActivity resetRemovePasskeySelectionActivity = activity instanceof ResetRemovePasskeySelectionActivity ? (ResetRemovePasskeySelectionActivity) activity : null;
                if (resetRemovePasskeySelectionActivity == null) {
                    return;
                }
                java.util.List<AuthenticatorSelectModel> value = this.KWHzl.AEQbTJ().AEQbTJ().getValue();
                boolean z = false;
                if (value != null && !value.isEmpty()) {
                    java.util.Iterator<T> it = value.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        if (((AuthenticatorSelectModel) it.next()).OLrzqt().fetchVPNInfo() && (i = i + 1) < 0) {
                            yDY.djBIcL();
                        }
                    }
                    if (i > 0) {
                        z = true;
                    }
                }
                java.util.List<AuthenticatorSelectModel> value2 = this.KWHzl.AEQbTJ().AEQbTJ().getValue();
                if (value2 == null) {
                    listAhwBna = yDY.AhwBna();
                } else {
                    listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(value2, 10));
                    java.util.Iterator<T> it2 = value2.iterator();
                    while (it2.hasNext()) {
                        listAhwBna.add(((AuthenticatorSelectModel) it2.next()).OLrzqt().copydefault());
                    }
                }
                if (z) {
                    resetRemovePasskeySelectionActivity.KWHzl(new ActionBar(resetRemovePasskeySelectionActivity, this.KWHzl, listAhwBna));
                } else {
                    resetRemovePasskeySelectionActivity.AEQbTJ("", new TaskDescription(resetRemovePasskeySelectionActivity, this.KWHzl, listAhwBna));
                }
                this.KWHzl.copydefault(Web3SecurityTrackEvent.VALUE_CONFIRM);
            }
        }
    }

    private final void AhwBna() {
        PasskeyResetRemoveType passkeyResetRemoveTypeKWHzl = KWHzl();
        if (passkeyResetRemoveTypeKWHzl instanceof PasskeyResetRemoveType.BatchRemove) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.onEvent$default("PasskeyMultipleRemove_Full_Page_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
        } else if (passkeyResetRemoveTypeKWHzl instanceof PasskeyResetRemoveType.BatchReset) {
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.onEvent$default("PasskeyMultipleReset_Full_Page_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1) null, 2, (java.lang.Object) null);
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AhwBna();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.OLrzqt = null;
    }
}
