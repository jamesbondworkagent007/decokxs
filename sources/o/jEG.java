package o;

import android.text.InputFilter;
import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.market.features.address_tracker.ui.AddTrackerParams;
import com.okinc.business.market.features.address_tracker.ui.TrackerGroupSelectionParams;
import com.okinc.business.market.features.address_tracker_sa.ui.user_management.AddAddressTrackerGroupViewModel;
import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C25655jBl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class jEG extends jER implements InterfaceC25660jBq {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public Function0<Unit> KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public C23393hxQ copydefault;

    public jEG() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.user_management.AddTrackerBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.user_management.AddTrackerBottomSheet$special$$inlined$viewModels$default$2
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AddAddressTrackerGroupViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.user_management.AddTrackerBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.user_management.AddTrackerBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.user_management.AddTrackerBottomSheet$special$$inlined$viewModels$default$5
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
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jEG.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jEG$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ jEG newInstance$default(ActionBar actionBar, AddTrackerParams addTrackerParams, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                function0 = null;
            }
            return actionBar.EZpvd(addTrackerParams, function0);
        }

        public final jEG EZpvd(@NotNull AddTrackerParams addTrackerParams, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(addTrackerParams, "");
            java.util.List<CommonGroupUiModel> listKWHzl = addTrackerParams.KWHzl();
            if (listKWHzl != null && listKWHzl.size() == 1) {
                java.util.List<CommonGroupUiModel> listKWHzl2 = addTrackerParams.KWHzl();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl2, 10));
                java.util.Iterator<T> it = listKWHzl2.iterator();
                while (it.hasNext()) {
                    arrayList.add(CommonGroupUiModel.copy$default((CommonGroupUiModel) it.next(), 0, null, 0, 0, 0, true, false, 95, null));
                }
                addTrackerParams = AddTrackerParams.copy$default(addTrackerParams, arrayList, false, null, null, 14, null);
            }
            jEG jeg = new jEG();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.add_tracker", addTrackerParams);
            jeg.setArguments(bundle);
            jeg.KWHzl = function0;
            return jeg;
        }
    }

    /* JADX DEBUG: Possible override for method o.jER.KWHzl()V */
    public final AddTrackerParams KWHzl() {
        AddTrackerParams addTrackerParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (addTrackerParams = (AddTrackerParams) BundleCompat.getParcelable(arguments, "key.add_tracker", AddTrackerParams.class)) == null) ? new AddTrackerParams(null, false, null, null, 15, null) : addTrackerParams;
    }

    public final AddAddressTrackerGroupViewModel EZpvd() {
        return (AddAddressTrackerGroupViewModel) this.OLrzqt.getValue();
    }

    public static final class Application implements android.text.TextWatcher {
        public final /* synthetic */ C55001xbh AEQbTJ;
        public final /* synthetic */ jEG copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application(C55001xbh c55001xbh, jEG jeg) {
            this.AEQbTJ = c55001xbh;
            this.copydefault = jeg;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            if (this.AEQbTJ.isConnected().length() <= 30) {
                this.copydefault.EZpvd().EZpvd(this.AEQbTJ.isConnected());
            }
        }
    }

    public static final class StateListAnimator implements android.text.TextWatcher {
        public final /* synthetic */ C23393hxQ EZpvd;
        public final /* synthetic */ C55001xbh copydefault;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator(C55001xbh c55001xbh, C23393hxQ c23393hxQ) {
            this.copydefault = c55001xbh;
            this.EZpvd = c23393hxQ;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            jEG.this.EZpvd().KWHzl(this.copydefault.isConnected());
            if (!jEG.this.OLrzqt(this.copydefault.isConnected()) && this.copydefault.isConnected().length() > 0) {
                this.EZpvd.KWHzl.setErrorText(C33070mpX.AYXKKw(C23274hvD.Fragment.OnBackPressedDispatcherOnBackPressedCancellable));
            } else {
                this.EZpvd.KWHzl.values();
            }
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C23274hvD.Fragment.addCallbackdefault));
        wxq.setDividerVisibility(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.copydefault = C23393hxQ.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
    }

    private final void AhwBna() {
        C23393hxQ c23393hxQ = this.copydefault;
        if (c23393hxQ != null) {
            C52794wYp c52794wYpCopydefault = c23393hxQ.OLrzqt.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
            }
            C52794wYp c52794wYpAEQbTJ = c23393hxQ.OLrzqt.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setVisibility(0);
            }
            C52794wYp c52794wYpAEQbTJ2 = c23393hxQ.OLrzqt.AEQbTJ();
            if (c52794wYpAEQbTJ2 != null) {
                c52794wYpAEQbTJ2.setOKDSType(260);
            }
            C52794wYp c52794wYpAEQbTJ3 = c23393hxQ.OLrzqt.AEQbTJ();
            if (c52794wYpAEQbTJ3 != null) {
                c52794wYpAEQbTJ3.setOnClickListener(new PendingIntent(c52794wYpAEQbTJ3, 1000L, this));
            }
            C55001xbh c55001xbhAkhnZx = c23393hxQ.KWHzl.AkhnZx();
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.addTextChangedListener(new StateListAnimator(c55001xbhAkhnZx, c23393hxQ));
            }
            C55001xbh c55001xbhAkhnZx2 = c23393hxQ.EZpvd.AkhnZx();
            if (c55001xbhAkhnZx2 != null) {
                c55001xbhAkhnZx2.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(30)});
            }
            if (c55001xbhAkhnZx2 != null) {
                c55001xbhAkhnZx2.addTextChangedListener(new Application(c55001xbhAkhnZx2, this));
            }
            AEQbTJ();
        }
    }

    public final void AEQbTJ() {
        C55018xby c55018xby;
        C23393hxQ c23393hxQ = this.copydefault;
        if (c23393hxQ == null || (c55018xby = c23393hxQ.copydefault) == null) {
            return;
        }
        c55018xby.setFragmentManager(getChildFragmentManager());
        java.util.List<CommonGroupUiModel> listKWHzl = EZpvd().EZpvd().getValue().KWHzl();
        if (listKWHzl.size() > 1) {
            c55018xby.setBottomSheet(C25655jBl.StateListAnimator.newInstance$default(C25655jBl.Companion, new TrackerGroupSelectionParams(GroupSelectionMode.INDIVIDUAL, listKWHzl, null, null, false, KWHzl().EZpvd(), 28, null), null, 2, null));
        } else {
            c55018xby.setBottomSheet(null);
            c55018xby.setState(3);
        }
    }

    public final boolean OLrzqt(java.lang.String str) {
        java.util.List listGEmmrt = yDY.gEmmrt(java.lang.Long.valueOf(C33129mqd.valueOf("1")), java.lang.Long.valueOf(C33129mqd.valueOf("501")));
        InterfaceC9739bbK interfaceC9739bbKAhwBna = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).AhwBna();
        java.util.Iterator it = listGEmmrt.iterator();
        while (it.hasNext()) {
            if (interfaceC9739bbKAhwBna.AEQbTJ(str, ((java.lang.Number) it.next()).longValue())) {
                return true;
            }
        }
        return false;
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ jEG copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, jEG jeg) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = jeg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            jEH jeh;
            java.lang.Object next;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                jBN.copydefault.KWHzl(DexTrackEventParameter.AddressManagementButtonName.ADD_TO_GROUP);
                jEI value = this.copydefault.EZpvd().EZpvd().getValue();
                java.util.List<C25642jAz> listEZpvd = C56402yEa.EZpvd(new C25642jAz(value.AEQbTJ(), value.EZpvd()));
                java.util.Iterator<T> it = value.KWHzl().iterator();
                while (true) {
                    jeh = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((CommonGroupUiModel) next).copydefault()) {
                            break;
                        }
                    }
                }
                CommonGroupUiModel commonGroupUiModel = (CommonGroupUiModel) next;
                if (commonGroupUiModel != null) {
                    int iKWHzl = commonGroupUiModel.KWHzl();
                    ActivityResultCaller parentFragment = this.copydefault.getParentFragment();
                    jEH jeh2 = parentFragment instanceof jEH ? (jEH) parentFragment : null;
                    if (jeh2 == null) {
                        KeyEventDispatcher.Component activity = this.copydefault.getActivity();
                        if (activity instanceof jEH) {
                            jeh = (jEH) activity;
                        }
                    } else {
                        jeh = jeh2;
                    }
                    if (jeh != null) {
                        jeh.AEQbTJ(iKWHzl, listEZpvd);
                    }
                }
                this.copydefault.dismissAllowingStateLoss();
                Function0 function0 = this.copydefault.KWHzl;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ jEG KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, jEG jeg) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = jeg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        djBIcL();
        AhwBna();
        C25390ivn.collectOnViewLifecycle$default(this, EZpvd().EZpvd(), null, new TaskDescription(), 2, null);
    }

    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(jEI jei, Continuation<? super Unit> continuation) {
            wYF wyf;
            C52794wYp c52794wYpCopydefault;
            boolean z = true;
            boolean z2 = Intrinsics.EZpvd((java.lang.Object) jei.AEQbTJ(), (java.lang.Object) jEG.this.KWHzl().copydefault()) && Intrinsics.EZpvd((java.lang.Object) jei.EZpvd(), (java.lang.Object) jEG.this.KWHzl().OLrzqt()) && Intrinsics.EZpvd(jei.KWHzl(), jEG.this.KWHzl().KWHzl());
            C23393hxQ c23393hxQ = jEG.this.copydefault;
            if (c23393hxQ != null && (wyf = c23393hxQ.OLrzqt) != null && (c52794wYpCopydefault = wyf.copydefault()) != null) {
                if (z2 || jei.AEQbTJ().length() <= 0) {
                    z = false;
                    c52794wYpCopydefault.setEnabled(z);
                } else {
                    java.util.List<CommonGroupUiModel> listKWHzl = jei.KWHzl();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (T t : listKWHzl) {
                        if (((CommonGroupUiModel) t).copydefault()) {
                            arrayList.add(t);
                        }
                    }
                    if (!(!arrayList.isEmpty()) || jei.EZpvd().length() > 30 || !jEG.this.OLrzqt(jei.AEQbTJ())) {
                    }
                    c52794wYpCopydefault.setEnabled(z);
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final void djBIcL() {
        java.util.List<CommonGroupUiModel> listKWHzl = KWHzl().KWHzl();
        if (listKWHzl != null && !listKWHzl.isEmpty()) {
            EZpvd().copydefault(listKWHzl, KWHzl().copydefault(), KWHzl().OLrzqt());
            C23393hxQ c23393hxQ = this.copydefault;
            if (c23393hxQ != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listKWHzl) {
                    if (((CommonGroupUiModel) obj).copydefault()) {
                        arrayList.add(obj);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((CommonGroupUiModel) it.next()).EZpvd());
                }
                EZpvd(arrayList2);
                C55001xbh c55001xbhAkhnZx = c23393hxQ.KWHzl.AkhnZx();
                if (c55001xbhAkhnZx != null) {
                    c55001xbhAkhnZx.setText(KWHzl().copydefault());
                }
                C55001xbh c55001xbhAkhnZx2 = c23393hxQ.EZpvd.AkhnZx();
                if (c55001xbhAkhnZx2 != null) {
                    c55001xbhAkhnZx2.setText(KWHzl().OLrzqt());
                    return;
                }
                return;
            }
            return;
        }
        EZpvd().OLrzqt();
    }

    public final void EZpvd(java.util.List<java.lang.String> list) {
        android.content.Context context;
        java.lang.String strJoinToString$default;
        C23393hxQ c23393hxQ = this.copydefault;
        if (c23393hxQ == null || (context = getContext()) == null) {
            return;
        }
        if (list.isEmpty()) {
            strJoinToString$default = context.getString(C23274hvD.Fragment.unregisterOnBackInvokedCallback);
        } else {
            strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, " ", null, null, 0, null, null, 62, null);
        }
        Intrinsics.copydefault((java.lang.Object) strJoinToString$default);
        C55001xbh c55001xbhAkhnZx = c23393hxQ.copydefault.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setText(strJoinToString$default);
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        this.copydefault = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C55018xby c55018xby;
        super.onDestroyView();
        C23393hxQ c23393hxQ = this.copydefault;
        if (c23393hxQ != null && (c55018xby = c23393hxQ.copydefault) != null) {
            c55018xby.setBottomSheet(null);
        }
        this.copydefault = null;
    }

    @Override // o.InterfaceC25660jBq
    public void EZpvd(@NotNull InterfaceC25657jBn interfaceC25657jBn, @NotNull TrackerGroupSelectionParams trackerGroupSelectionParams, @NotNull java.util.List<CommonGroupUiModel> list) {
        Intrinsics.checkNotNullParameter(interfaceC25657jBn, "");
        Intrinsics.checkNotNullParameter(trackerGroupSelectionParams, "");
        Intrinsics.checkNotNullParameter(list, "");
        EZpvd().copydefault(list);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((CommonGroupUiModel) obj).copydefault()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((CommonGroupUiModel) it.next()).EZpvd());
        }
        EZpvd(arrayList2);
        AEQbTJ();
    }
}
