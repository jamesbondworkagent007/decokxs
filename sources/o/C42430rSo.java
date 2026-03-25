package o;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.DialogInformation;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ListPickerPopUpAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ListPickerPopUpChoice;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import com.okinc.ok_kyc_core.presentation.resultTemplate.ResultFragment;
import com.okinc.ok_kyc_core.presentation.views.popup.ListPickerPopupBottomSheet$handleListeners$1;
import com.okinc.ok_kyc_core.presentation.views.popup.ListPickerPopupBottomSheet$onCreateContent$3;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C42430rSo;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rSo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C42430rSo extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public C43975rzS EZpvd;
    public Job OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public ListPickerPopUpAppModel djBIcL;
    public Job gEmmrt;
    public PageComponentAppModel isConnected;
    public final C43316rmw AhwBna = new C43316rmw();
    public final java.util.List<java.lang.Object> valueOf = new java.util.ArrayList();
    public final MutableStateFlow<java.lang.String> AEQbTJ = StateFlowKt.MutableStateFlow(null);
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.rSq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C42430rSo.djBIcL(this.copydefault);
        }
    });

    public C42430rSo() {
        final Function0 function0 = null;
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C42163rIr.class), new Function0<ViewModelStore>() { // from class: com.okinc.ok_kyc_core.presentation.views.popup.ListPickerPopupBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.ok_kyc_core.presentation.views.popup.ListPickerPopupBottomSheet$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.ok_kyc_core.presentation.views.popup.ListPickerPopupBottomSheet$special$$inlined$activityViewModels$default$3
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

    public final rQO OLrzqt() {
        return (rQO) this.AYXKKw.getValue();
    }

    public static final rQO djBIcL(C42430rSo c42430rSo) {
        androidx.fragment.app.FragmentManager childFragmentManager = c42430rSo.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        FragmentActivity fragmentActivityRequireActivity = c42430rSo.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return new rQO(childFragmentManager, fragmentActivityRequireActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C42163rIr KWHzl() {
        return (C42163rIr) this.copydefault.getValue();
    }

    /* JADX INFO: renamed from: o.rSo$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rSo.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C42430rSo KWHzl(@NotNull ListPickerPopUpAppModel listPickerPopUpAppModel, @NotNull PageComponentAppModel pageComponentAppModel) {
            Intrinsics.checkNotNullParameter(listPickerPopUpAppModel, "");
            Intrinsics.checkNotNullParameter(pageComponentAppModel, "");
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("listPickerPopUpAppModel", listPickerPopUpAppModel), C56390yDp.OLrzqt("page_component", pageComponentAppModel));
            C42430rSo c42430rSo = new C42430rSo();
            c42430rSo.setArguments(bundleBundleOf);
            return c42430rSo;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        PageComponentAppModel pageComponentAppModel;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            android.os.Bundle arguments = getArguments();
            ListPickerPopUpAppModel listPickerPopUpAppModel = arguments != null ? (ListPickerPopUpAppModel) arguments.getParcelable("listPickerPopUpAppModel", ListPickerPopUpAppModel.class) : null;
            Intrinsics.copydefault(listPickerPopUpAppModel);
            this.djBIcL = listPickerPopUpAppModel;
            android.os.Bundle arguments2 = getArguments();
            pageComponentAppModel = arguments2 != null ? (PageComponentAppModel) arguments2.getParcelable("page_component", PageComponentAppModel.class) : null;
            Intrinsics.copydefault(pageComponentAppModel);
            this.isConnected = pageComponentAppModel;
            return;
        }
        android.os.Bundle arguments3 = getArguments();
        ListPickerPopUpAppModel listPickerPopUpAppModel2 = arguments3 != null ? (ListPickerPopUpAppModel) arguments3.getParcelable("listPickerPopUpAppModel") : null;
        Intrinsics.copydefault(listPickerPopUpAppModel2);
        this.djBIcL = listPickerPopUpAppModel2;
        android.os.Bundle arguments4 = getArguments();
        pageComponentAppModel = arguments4 != null ? (PageComponentAppModel) arguments4.getParcelable("page_component") : null;
        Intrinsics.copydefault(pageComponentAppModel);
        this.isConnected = pageComponentAppModel;
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.EZpvd().setVisibility(8);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setStyle(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0191  */
    @Override // o.wXX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        ListPickerPopUpAppModel listPickerPopUpAppModel;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        C43975rzS c43975rzSAEQbTJ = C43975rzS.AEQbTJ(getLayoutInflater(), constraintLayout, true);
        this.EZpvd = c43975rzSAEQbTJ;
        ListPickerPopUpAppModel listPickerPopUpAppModel2 = null;
        byte b = 0;
        byte b2 = 0;
        if (c43975rzSAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            c43975rzSAEQbTJ = null;
        }
        RecyclerView recyclerView = c43975rzSAEQbTJ.AEQbTJ;
        recyclerView.setLayoutManager(C33047mpA.KWHzl(requireContext()));
        recyclerView.setAdapter(this.AhwBna);
        this.AhwBna.register(Dialog.class, new LoaderManager());
        this.AhwBna.register(ActionBar.class, new Application(this, new Function1() { // from class: o.rSn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C42430rSo.OLrzqt(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        this.AhwBna.register(Fragment.class, new Activity());
        this.AhwBna.register(FragmentManager.class, new TaskDescription());
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        AbstractC42074rFj abstractC42074rFjEZpvd = EZpvd(fragmentActivityRequireActivity);
        Job job = this.gEmmrt;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.gEmmrt = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ListPickerPopupBottomSheet$onCreateContent$3(this, abstractC42074rFjEZpvd, null), 3, null);
        if (abstractC42074rFjEZpvd != null) {
            ListPickerPopUpAppModel listPickerPopUpAppModel3 = this.djBIcL;
            if (listPickerPopUpAppModel3 == null) {
                Intrinsics.gEmmrt("");
                listPickerPopUpAppModel3 = null;
            }
            if (!listPickerPopUpAppModel3.getItemsTop().isEmpty()) {
                rQO rqoOLrzqt = OLrzqt();
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ListPickerPopUpAppModel listPickerPopUpAppModel4 = this.djBIcL;
                if (listPickerPopUpAppModel4 == null) {
                    Intrinsics.gEmmrt("");
                    listPickerPopUpAppModel4 = null;
                }
                this.valueOf.add(new Dialog(rqoOLrzqt.EZpvd(contextRequireContext, listPickerPopUpAppModel4.getItemsTop(), abstractC42074rFjEZpvd, this, ViewStatus.ListPickerPopup)));
            }
        }
        ListPickerPopUpAppModel listPickerPopUpAppModel5 = this.djBIcL;
        if (listPickerPopUpAppModel5 == null) {
            Intrinsics.gEmmrt("");
            listPickerPopUpAppModel5 = null;
        }
        java.util.List<ListPickerPopUpChoice> choices = listPickerPopUpAppModel5.getChoices();
        int i = 2;
        boolean z = false;
        if (choices != null && (!choices.isEmpty())) {
            java.util.Iterator<T> it = choices.iterator();
            while (it.hasNext()) {
                this.valueOf.add(new ActionBar((ListPickerPopUpChoice) it.next(), z, i, b2 == true ? 1 : 0));
            }
        }
        ListPickerPopUpAppModel listPickerPopUpAppModel6 = this.djBIcL;
        if (listPickerPopUpAppModel6 == null) {
            Intrinsics.gEmmrt("");
            listPickerPopUpAppModel6 = null;
        }
        java.util.List<ListPickerPopUpChoice> additionalChoices = listPickerPopUpAppModel6.getAdditionalChoices();
        if (additionalChoices != null && (!additionalChoices.isEmpty())) {
            this.valueOf.add(Fragment.EZpvd);
            java.util.Iterator<T> it2 = additionalChoices.iterator();
            while (it2.hasNext()) {
                this.valueOf.add(new ActionBar((ListPickerPopUpChoice) it2.next(), z, i, b == true ? 1 : 0));
            }
        }
        ListPickerPopUpAppModel listPickerPopUpAppModel7 = this.djBIcL;
        if (listPickerPopUpAppModel7 == null) {
            Intrinsics.gEmmrt("");
            listPickerPopUpAppModel7 = null;
        }
        java.lang.String defaultChoice = listPickerPopUpAppModel7.getDefaultChoice();
        if (defaultChoice != null && defaultChoice.length() != 0) {
            OLrzqt(defaultChoice);
        }
        if (abstractC42074rFjEZpvd != null) {
            ListPickerPopUpAppModel listPickerPopUpAppModel8 = this.djBIcL;
            if (listPickerPopUpAppModel8 == null) {
                Intrinsics.gEmmrt("");
                listPickerPopUpAppModel8 = null;
            }
            if (true ^ listPickerPopUpAppModel8.getItems().isEmpty()) {
                java.util.List<java.lang.Object> list = this.valueOf;
                if ((list instanceof java.util.Collection) && list.isEmpty()) {
                    this.valueOf.add(Fragment.EZpvd);
                    rQO rqoOLrzqt2 = OLrzqt();
                    android.content.Context contextRequireContext2 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                    listPickerPopUpAppModel = this.djBIcL;
                    if (listPickerPopUpAppModel != null) {
                    }
                    this.valueOf.add(new FragmentManager(rqoOLrzqt2.EZpvd(contextRequireContext2, listPickerPopUpAppModel2.getItems(), abstractC42074rFjEZpvd, this, ViewStatus.ListPickerPopup)));
                } else {
                    java.util.Iterator<T> it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (it3.next() instanceof Fragment) {
                            break;
                        }
                    }
                    this.valueOf.add(Fragment.EZpvd);
                    rQO rqoOLrzqt22 = OLrzqt();
                    android.content.Context contextRequireContext22 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext22, "");
                    listPickerPopUpAppModel = this.djBIcL;
                    if (listPickerPopUpAppModel != null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        listPickerPopUpAppModel2 = listPickerPopUpAppModel;
                    }
                    this.valueOf.add(new FragmentManager(rqoOLrzqt22.EZpvd(contextRequireContext22, listPickerPopUpAppModel2.getItems(), abstractC42074rFjEZpvd, this, ViewStatus.ListPickerPopup)));
                }
            }
        }
        this.AhwBna.setItems(this.valueOf);
        this.AhwBna.notifyDataSetChanged();
    }

    public static final Unit OLrzqt(C42430rSo c42430rSo, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c42430rSo.OLrzqt(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.rSo$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C52794wYp EZpvd;
        public final /* synthetic */ C42430rSo KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C42430rSo c42430rSo, android.view.View view2, C52794wYp c52794wYp) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = c42430rSo;
            this.OLrzqt = view2;
            this.EZpvd = c52794wYp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                java.lang.String str = (java.lang.String) this.KWHzl.AEQbTJ.getValue();
                ListPickerPopUpAppModel listPickerPopUpAppModel = this.KWHzl.djBIcL;
                PageComponentAppModel pageComponentAppModel = null;
                if (listPickerPopUpAppModel == null) {
                    Intrinsics.gEmmrt("");
                    listPickerPopUpAppModel = null;
                }
                java.lang.String id = listPickerPopUpAppModel.getId();
                if (str != null && str.length() != 0 && id != null && id.length() != 0) {
                    ((C42249rLw) this.OLrzqt).KWHzl().setValue(str);
                    ((C42249rLw) this.OLrzqt).KWHzl().setId(id);
                }
                MutableLiveData<C43734ruq<kotlin.Pair<CTAButtonAppModel, DialogInformation>>> mutableLiveDataKWHzl = this.KWHzl.KWHzl().KWHzl();
                CTAButtonAppModel cTAButtonAppModelKWHzl = ((C42249rLw) this.OLrzqt).KWHzl();
                PageComponentAppModel pageComponentAppModel2 = this.KWHzl.isConnected;
                if (pageComponentAppModel2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    pageComponentAppModel = pageComponentAppModel2;
                }
                java.lang.String id2 = pageComponentAppModel.getId();
                mutableLiveDataKWHzl.setValue(new C43734ruq<>(new kotlin.Pair(cTAButtonAppModelKWHzl, new DialogInformation(id2 != null ? id2 : "", false, this.EZpvd))));
            }
        }
    }

    @Override // o.wXX
    public void onCreateFooter(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateFooter(constraintLayout);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        AbstractC42074rFj abstractC42074rFjEZpvd = EZpvd(fragmentActivityRequireActivity);
        if (abstractC42074rFjEZpvd != null) {
            ListPickerPopUpAppModel listPickerPopUpAppModel = this.djBIcL;
            if (listPickerPopUpAppModel == null) {
                Intrinsics.gEmmrt("");
                listPickerPopUpAppModel = null;
            }
            CtaAppModel cta = listPickerPopUpAppModel.getCta();
            if (cta != null) {
                rQO rqoOLrzqt = OLrzqt();
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                for (android.view.View view : rqoOLrzqt.KWHzl(contextRequireContext, childFragmentManager, cta, abstractC42074rFjEZpvd, this)) {
                    ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
                    layoutParams.setMarginStart(getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.ORxRYg));
                    layoutParams.setMarginEnd(getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.ORxRYg));
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.gHZMYf);
                    layoutParams.startToStart = 0;
                    layoutParams.endToEnd = 0;
                    layoutParams.topToTop = 0;
                    layoutParams.bottomToBottom = 0;
                    view.setLayoutParams(layoutParams);
                    constraintLayout.addView(view);
                    KWHzl(view);
                }
            }
        }
    }

    public final void KWHzl(android.view.View view) {
        C52794wYp c52794wYp;
        if (view instanceof C42249rLw) {
            Job job = this.OLrzqt;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            this.OLrzqt = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ListPickerPopupBottomSheet$handleListeners$1(this, view, null), 3, null);
            AbstractC43890rxn abstractC43890rxnAEQbTJ = ((C42249rLw) view).AEQbTJ();
            if (abstractC43890rxnAEQbTJ == null || (c52794wYp = abstractC43890rxnAEQbTJ.AEQbTJ) == null) {
                return;
            }
            c52794wYp.setOnClickListener(new PendingIntent(c52794wYp, 1000L, this, view, c52794wYp));
        }
    }

    public final AbstractC42074rFj EZpvd(FragmentActivity fragmentActivity) {
        java.lang.Object next;
        androidx.fragment.app.Fragment fragmentFindFragmentById = fragmentActivity.getSupportFragmentManager().findFragmentById(C43662rtX.ActionBar.fXYAwm);
        Intrinsics.copydefault(fragmentFindFragmentById, "");
        java.util.List<androidx.fragment.app.Fragment> fragments = ((NavHostFragment) fragmentFindFragmentById).getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "");
        java.util.Iterator<T> it = fragments.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((androidx.fragment.app.Fragment) next).isVisible()) {
                break;
            }
        }
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
        if (fragment == null) {
            return null;
        }
        if (fragment instanceof C42165rIt) {
            return (AbstractC42074rFj) new ViewModelProvider(fragment).get(rIB.class);
        }
        if (fragment instanceof C42099rGh) {
            return (AbstractC42074rFj) new ViewModelProvider(fragment).get(rGL.class);
        }
        if (fragment instanceof rIF) {
            return (AbstractC42074rFj) new ViewModelProvider(fragment).get(rIM.class);
        }
        if (fragment instanceof ResultFragment) {
            return (AbstractC42074rFj) new ViewModelProvider(fragment).get(C42179rJg.class);
        }
        if (fragment instanceof C42188rJp) {
            return (AbstractC42074rFj) new ViewModelProvider(fragment).get(rJH.class);
        }
        if (fragment instanceof rJF) {
            return (AbstractC42074rFj) new ViewModelProvider(fragment).get(C42203rKd.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: o.rSo$Dialog */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Dialog {
        public final java.util.List<android.view.View> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rSo$Dialog */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Dialog copy$default(Dialog dialog, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = dialog.OLrzqt;
            }
            return dialog.OLrzqt(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<android.view.View> KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Dialog OLrzqt(@NotNull java.util.List<? extends android.view.View> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Dialog(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dialog) && Intrinsics.EZpvd(this.OLrzqt, ((Dialog) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ListPickerTopItemsUIData(views=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends android.view.View> */
        /* JADX WARN: Multi-variable type inference failed */
        public Dialog(@NotNull java.util.List<? extends android.view.View> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = list;
        }
    }

    /* JADX INFO: renamed from: o.rSo$ActionBar */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar {
        public boolean EZpvd;
        public final ListPickerPopUpChoice KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, ListPickerPopUpChoice listPickerPopUpChoice, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                listPickerPopUpChoice = actionBar.KWHzl;
            }
            if ((i & 2) != 0) {
                z = actionBar.EZpvd;
            }
            return actionBar.EZpvd(listPickerPopUpChoice, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull ListPickerPopUpChoice listPickerPopUpChoice, boolean z) {
            Intrinsics.checkNotNullParameter(listPickerPopUpChoice, "");
            return new ActionBar(listPickerPopUpChoice, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(boolean z) {
            this.EZpvd = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ListPickerPopUpChoice copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && this.EZpvd == actionBar.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ListPickerChoiceUIData(data=" + this.KWHzl + ", selected=" + this.EZpvd + ")";
        }

        public ActionBar(@NotNull ListPickerPopUpChoice listPickerPopUpChoice, boolean z) {
            Intrinsics.checkNotNullParameter(listPickerPopUpChoice, "");
            this.KWHzl = listPickerPopUpChoice;
            this.EZpvd = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.ok_kyc_core.data.remote.networkmodel.ListPickerPopUpChoice)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(com.okinc.ok_kyc_core.data.remote.networkmodel.ListPickerPopUpChoice, boolean):void (m)] (LINE:303) call: o.rSo.ActionBar.<init>(com.okinc.ok_kyc_core.data.remote.networkmodel.ListPickerPopUpChoice, boolean):void type: THIS */
        public /* synthetic */ ActionBar(ListPickerPopUpChoice listPickerPopUpChoice, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(listPickerPopUpChoice, (i & 2) != 0 ? false : z);
        }
    }

    /* JADX INFO: renamed from: o.rSo$Fragment */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class Fragment {
        public static final Fragment EZpvd = new Fragment();

        private Fragment() {
        }
    }

    /* JADX INFO: renamed from: o.rSo$FragmentManager */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class FragmentManager {
        public final java.util.List<android.view.View> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rSo$FragmentManager */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FragmentManager copy$default(FragmentManager fragmentManager, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = fragmentManager.EZpvd;
            }
            return fragmentManager.KWHzl(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<android.view.View> EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FragmentManager KWHzl(@NotNull java.util.List<? extends android.view.View> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new FragmentManager(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FragmentManager) && Intrinsics.EZpvd(this.EZpvd, ((FragmentManager) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ListPickerItemsUIData(views=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends android.view.View> */
        /* JADX WARN: Multi-variable type inference failed */
        public FragmentManager(@NotNull java.util.List<? extends android.view.View> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
        }
    }

    /* JADX INFO: renamed from: o.rSo$Application */
    /* JADX INFO: loaded from: classes23.dex */
    public final class Application extends AbstractC43310rmq<ActionBar, AbstractC43920ryQ> {
        public final /* synthetic */ C42430rSo EZpvd;
        public final Function1<java.lang.String, Unit> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C43662rtX.TaskDescription.OxVOHk;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(@NotNull C42430rSo c42430rSo, Function1<? super java.lang.String, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = c42430rSo;
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC43920ryQ> c43312rms, @NotNull final ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(actionBar, "");
            super.onBindViewHolder((C43312rms) c43312rms, actionBar);
            AbstractC43920ryQ abstractC43920ryQ = (AbstractC43920ryQ) c43312rms.OLrzqt();
            if (actionBar.copydefault().getConcatenatedTextList().length() > 0) {
                android.widget.TextView textView = abstractC43920ryQ.EZpvd;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(0);
                abstractC43920ryQ.EZpvd.setText(actionBar.copydefault().getConcatenatedTextList());
            } else {
                android.widget.TextView textView2 = abstractC43920ryQ.EZpvd;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(8);
            }
            java.lang.String subText = actionBar.copydefault().getSubText();
            if (subText != null && subText.length() != 0) {
                android.widget.TextView textView3 = abstractC43920ryQ.copydefault;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                textView3.setVisibility(0);
                abstractC43920ryQ.copydefault.setText(actionBar.copydefault().getSubText());
            } else {
                android.widget.TextView textView4 = abstractC43920ryQ.copydefault;
                Intrinsics.checkNotNullExpressionValue(textView4, "");
                textView4.setVisibility(8);
            }
            if (Intrinsics.EZpvd(actionBar.copydefault().getDisabled(), java.lang.Boolean.TRUE)) {
                abstractC43920ryQ.EZpvd.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
                abstractC43920ryQ.copydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe));
                abstractC43920ryQ.KWHzl.setOnClickListener(null);
            } else {
                abstractC43920ryQ.EZpvd.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                abstractC43920ryQ.copydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                abstractC43920ryQ.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.rSu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C42430rSo.Application.OLrzqt(actionBar, this, view);
                    }
                });
            }
            android.widget.ImageView imageView = abstractC43920ryQ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(actionBar.OLrzqt() ? 0 : 8);
        }

        public static final void OLrzqt(ActionBar actionBar, Application application, android.view.View view) {
            if (actionBar.OLrzqt()) {
                return;
            }
            application.OLrzqt.invoke(actionBar.copydefault().getValue());
        }
    }

    /* JADX INFO: renamed from: o.rSo$Activity */
    /* JADX INFO: loaded from: classes23.dex */
    public final class Activity extends AbstractC43310rmq<Fragment, AbstractC43918ryO> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C43662rtX.TaskDescription.QVsKAR;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC43918ryO> c43312rms, @NotNull Fragment fragment) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onBindViewHolder((C43312rms) c43312rms, fragment);
        }
    }

    /* JADX INFO: renamed from: o.rSo$TaskDescription */
    /* JADX INFO: loaded from: classes23.dex */
    public final class TaskDescription extends AbstractC43310rmq<FragmentManager, AbstractC43919ryP> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C43662rtX.TaskDescription.hrNTAI;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC43919ryP> c43312rms, @NotNull FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            super.onBindViewHolder((C43312rms) c43312rms, fragmentManager);
            AbstractC43919ryP abstractC43919ryP = (AbstractC43919ryP) c43312rms.OLrzqt();
            abstractC43919ryP.OLrzqt.removeAllViews();
            java.util.Iterator<T> it = fragmentManager.EZpvd().iterator();
            while (it.hasNext()) {
                abstractC43919ryP.OLrzqt.addView((android.view.View) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: o.rSo$LoaderManager */
    /* JADX INFO: loaded from: classes23.dex */
    public final class LoaderManager extends AbstractC43310rmq<Dialog, AbstractC43924ryU> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C43662rtX.TaskDescription.OJuSTm;
        }

        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return 0;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public LoaderManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC43924ryU> c43312rms, @NotNull Dialog dialog) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(dialog, "");
            super.onBindViewHolder((C43312rms) c43312rms, dialog);
            AbstractC43924ryU abstractC43924ryU = (AbstractC43924ryU) c43312rms.OLrzqt();
            abstractC43924ryU.copydefault.removeAllViews();
            java.util.Iterator<T> it = dialog.KWHzl().iterator();
            while (it.hasNext()) {
                abstractC43924ryU.copydefault.addView((android.view.View) it.next());
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Job job = this.OLrzqt;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        Job job2 = this.gEmmrt;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
        }
    }

    public final void OLrzqt(java.lang.String str) {
        java.util.List<java.lang.Object> list = this.valueOf;
        java.util.ArrayList<ActionBar> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof ActionBar) {
                arrayList.add(obj);
            }
        }
        boolean z = false;
        for (ActionBar actionBar : arrayList) {
            boolean z2 = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) actionBar.copydefault().getValue()) && !Intrinsics.EZpvd(actionBar.copydefault().getDisabled(), java.lang.Boolean.TRUE);
            actionBar.EZpvd(z2);
            if (z2) {
                z = true;
            }
        }
        if (z) {
            this.AEQbTJ.setValue(str);
        }
        this.AhwBna.notifyDataSetChanged();
    }
}
