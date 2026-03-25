package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.market.data.constant.TokenGroupActionType;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerAddressGroupUIModel;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerManageAddressGroupViewModel;
import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import com.okinc.components.track.TrackChannel;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.InterfaceC26239jXb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class jFH extends wXX implements InterfaceC26241jXd {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public C21625hGh AEQbTJ;
    public Function0<Unit> KWHzl;
    public jDB OLrzqt;
    public java.lang.String copydefault = "";
    public final InterfaceC56387yDm djBIcL;

    @Override // o.wXX
    public boolean getHasFooter() {
        return false;
    }

    @Override // o.wXX
    public float getHeightScale() {
        return 40.0f;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    public jFH() {
        final Function0 function0 = null;
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TrackerManageAddressGroupViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.ManageAddressMigrateGroupSelectionFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.ManageAddressMigrateGroupSelectionFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.ManageAddressMigrateGroupSelectionFragment$special$$inlined$activityViewModels$default$3
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
    public final TrackerManageAddressGroupViewModel KWHzl() {
        return (TrackerManageAddressGroupViewModel) this.djBIcL.getValue();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jFH.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final jFH EZpvd() {
            return new jFH();
        }
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        super.onSetBehavior(bottomSheetBehavior);
        bottomSheetBehavior.setDraggable(true);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        java.lang.String string = wxq.getContext().getString(C23274hvD.Fragment.fGT);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AEQbTJ();
        EZpvd();
        copydefault();
        KWHzl().valueOf();
        C25390ivn.collectOnViewLifecycle$default(this, KWHzl().KWHzl(), null, new StateListAnimator(), 2, null);
    }

    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<TrackerAddressGroupUIModel> list, Continuation<? super Unit> continuation) {
            if (list.size() > 1) {
                jFH.this.AEQbTJ(CollectionsKt___CollectionsKt.copydefault((java.util.List) list, C56548yJl.AhwBna(1, list.size())));
            } else {
                jFH jfh = jFH.this;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (T t : list) {
                    if (((TrackerAddressGroupUIModel) t).EZpvd() != -1) {
                        arrayList.add(t);
                    }
                }
                jfh.AEQbTJ(arrayList);
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) jFH.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return Unit.INSTANCE;
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AEQbTJ = C21625hGh.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
    }

    public final void AEQbTJ(java.util.List<TrackerAddressGroupUIModel> list) {
        RecyclerView recyclerView;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (TrackerAddressGroupUIModel trackerAddressGroupUIModel : list) {
            arrayList.add(new jDG(java.lang.String.valueOf(trackerAddressGroupUIModel.EZpvd()), jFN.OLrzqt(trackerAddressGroupUIModel, contextRequireContext), trackerAddressGroupUIModel.valueOf()));
        }
        this.OLrzqt = new jDB(arrayList, new java.util.ArrayList(), new Function0() { // from class: o.jFK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jFH.KWHzl(this.KWHzl);
            }
        });
        C21625hGh c21625hGh = this.AEQbTJ;
        if (c21625hGh == null || (recyclerView = c21625hGh.EZpvd) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(contextRequireContext, 1, false));
        recyclerView.setAdapter(this.OLrzqt);
    }

    public static final Unit KWHzl(jFH jfh) {
        jfh.OLrzqt();
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Function0<Unit> function0 = this.KWHzl;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void AEQbTJ() {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.copydefault)) {
            C32866mlf.onEvent$default(this.copydefault, (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        }
    }

    public final void EZpvd() {
        C52794wYp c52794wYp;
        C21625hGh c21625hGh = this.AEQbTJ;
        if (c21625hGh == null || (c52794wYp = c21625hGh.OLrzqt) == null) {
            return;
        }
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt() {
        C52794wYp c52794wYp;
        boolean z;
        java.util.ArrayList<java.lang.String> arrayListCopydefault;
        C21625hGh c21625hGh = this.AEQbTJ;
        if (c21625hGh == null || (c52794wYp = c21625hGh.OLrzqt) == null) {
            return;
        }
        jDB jdb = this.OLrzqt;
        if (jdb == null || (arrayListCopydefault = jdb.copydefault()) == null) {
            z = false;
        } else {
            z = true;
            if (!(!arrayListCopydefault.isEmpty())) {
            }
        }
        c52794wYp.setEnabled(z);
    }

    public final void copydefault() {
        android.widget.LinearLayout linearLayout;
        C21625hGh c21625hGh = this.AEQbTJ;
        if (c21625hGh == null || (linearLayout = c21625hGh.AEQbTJ) == null) {
            return;
        }
        linearLayout.setOnClickListener(new Application(linearLayout, 1000L, this));
    }

    @Override // o.InterfaceC26241jXd
    public void valueOf() {
        KWHzl().valueOf();
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ jFH EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, jFH jfh) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = jfh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.util.List<CommonGroupUiModel> listEZpvd;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                java.lang.Object value = this.EZpvd.KWHzl().fetchVPNInfo().getValue();
                InterfaceC26239jXb.ActionBar actionBar = value instanceof InterfaceC26239jXb.ActionBar ? (InterfaceC26239jXb.ActionBar) value : null;
                if (C33129mqd.copydefault((java.lang.Object) ((actionBar == null || (listEZpvd = actionBar.EZpvd()) == null) ? null : java.lang.Integer.valueOf(listEZpvd.size())), (java.lang.Object) 20)) {
                    C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.getSupportedCipherSuites, 0, 1, (java.lang.Object) null);
                    return;
                }
                C25639jAw c25639jAwOLrzqt = C25639jAw.Companion.OLrzqt("", null, TokenGroupActionType.NEW);
                androidx.fragment.app.FragmentManager childFragmentManager = this.EZpvd.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c25639jAwOLrzqt.show(childFragmentManager);
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ jFH KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, jFH jfh) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = jfh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                jDB jdb = this.KWHzl.OLrzqt;
                java.util.List listCopydefault = jdb != null ? jdb.copydefault() : null;
                if (listCopydefault == null) {
                    listCopydefault = yDY.AhwBna();
                }
                TrackerManageAddressGroupViewModel trackerManageAddressGroupViewModelKWHzl = this.KWHzl.KWHzl();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
                java.util.Iterator it = listCopydefault.iterator();
                while (it.hasNext()) {
                    arrayList.add(java.lang.Long.valueOf(C33129mqd.valueOf((java.lang.String) it.next())));
                }
                trackerManageAddressGroupViewModelKWHzl.KWHzl(arrayList);
                jBN.copydefault.KWHzl(DexTrackEventParameter.AddressManagementButtonName.MOVE);
                this.KWHzl.dismiss();
            }
        }
    }
}
