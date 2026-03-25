package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.selectgroupvoicecallmember.viewmodel.SelectGroupCallMemberViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC37525ovV;
import o.C35399nuc;
import o.C37290oqz;
import o.C37513ovJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.owt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37602owt extends AbstractC37512ovI {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int gEmmrt = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public C33926nKz AkhnZx;
    public final ActivityResultLauncher<android.content.Intent> djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final int valueOf = C35399nuc.Dialog.DGOPHZ;

    /* JADX INFO: renamed from: o.owt$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.valueOf;
    }

    public C37602owt() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.selectgroupvoicecallmember.SelectGroupCallMemberFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.selectgroupvoicecallmember.SelectGroupCallMemberFragment$special$$inlined$viewModels$default$2
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
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SelectGroupCallMemberViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.selectgroupvoicecallmember.SelectGroupCallMemberFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.selectgroupvoicecallmember.SelectGroupCallMemberFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.selectgroupvoicecallmember.SelectGroupCallMemberFragment$special$$inlined$viewModels$default$5
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
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.owu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37602owt.AhwBna(this.AEQbTJ);
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.oww
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37602owt.gEmmrt(this.OLrzqt);
            }
        });
        this.djBIcL = C37290oqz.copydefault.KWHzl(this, new ActionBar());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SelectGroupCallMemberViewModel AhwBna() {
        return (SelectGroupCallMemberViewModel) this.fetchVPNInfo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String gEmmrt() {
        return (java.lang.String) this.AYXKKw.getValue();
    }

    public static final java.lang.String AhwBna(C37602owt c37602owt) {
        android.os.Bundle arguments = c37602owt.getArguments();
        if (arguments != null) {
            return arguments.getString("ARG_GROUP_ID");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<java.lang.String> djBIcL() {
        return (java.util.List) this.AhwBna.getValue();
    }

    public static final java.util.ArrayList gEmmrt(C37602owt c37602owt) {
        android.os.Bundle arguments = c37602owt.getArguments();
        if (arguments != null) {
            return arguments.getStringArrayList("ARG_COMPLETE_LIST");
        }
        return null;
    }

    /* JADX INFO: renamed from: o.owt$ActionBar */
    public static final class ActionBar implements C37290oqz.StateListAnimator {
        public ActionBar() {
        }

        @Override // o.C37290oqz.StateListAnimator
        public void EZpvd(ActivityResult activityResult) {
            java.util.ArrayList<java.lang.String> arrayList;
            java.util.ArrayList<java.lang.String> arrayList2;
            Intrinsics.checkNotNullParameter(activityResult, "");
            if (activityResult.getResultCode() == -1) {
                android.content.Intent data = activityResult.getData();
                if (data != null && data.getBooleanExtra("IS_FINAL_RESULT", false)) {
                    android.content.Intent data2 = activityResult.getData();
                    if (data2 == null || (arrayList2 = data2.getStringArrayListExtra("RESULT_FINAL_KEY_LIST")) == null) {
                        arrayList2 = new java.util.ArrayList<>();
                    }
                    pUU.KWHzl("SelectGroupCallMemberFragment", "size of finalList is " + arrayList2.size());
                    C37602owt.this.copydefault(arrayList2);
                    return;
                }
                android.content.Intent data3 = activityResult.getData();
                if (data3 == null || (arrayList = data3.getStringArrayListExtra("RESULT_KEY_LIST")) == null) {
                    arrayList = new java.util.ArrayList<>();
                }
                C37602owt.this.getChildFragmentManager().setFragmentResult("REQUEST_UPDATE_SELECTION", BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_SELECTED_LIST", arrayList), C56390yDp.OLrzqt("ARG_GROUP_ID", C37602owt.this.gEmmrt())));
            }
        }
    }

    /* JADX INFO: renamed from: o.owt$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.owt.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C37602owt copydefault(java.lang.String str, java.util.List<java.lang.String> list) {
            C37602owt c37602owt = new C37602owt();
            c37602owt.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_GROUP_ID", str), C56390yDp.OLrzqt("ARG_COMPLETE_LIST", list)));
            return c37602owt;
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C33926nKz c33926nKzCopydefault = C33926nKz.copydefault(layoutInflater, viewGroup, false);
        this.AkhnZx = c33926nKzCopydefault;
        if (c33926nKzCopydefault != null) {
            return c33926nKzCopydefault.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AhwBna().KWHzl(gEmmrt());
        valueOf();
        values();
        fetchVPNInfo();
        isConnected();
        AYXKKw();
        view.post(new java.lang.Runnable() { // from class: o.owy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C37602owt.valueOf(this.OLrzqt);
            }
        });
    }

    public static final void valueOf(C37602owt c37602owt) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c37602owt, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void values() {
        C55230xfy c55230xfy;
        C33926nKz c33926nKz = this.AkhnZx;
        if (c33926nKz == null || (c55230xfy = c33926nKz.OLrzqt) == null) {
            return;
        }
        c55230xfy.setOnClickListener(new Application(c55230xfy, 1000L, this, c55230xfy));
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ovJ.StateListAnimator.newInstance$default(o.ovJ$StateListAnimator, java.util.List, java.lang.String, java.lang.Boolean, int, java.lang.Object):o.ovJ */
    private final void fetchVPNInfo() {
        getChildFragmentManager().beginTransaction().replace(C35399nuc.StateListAnimator.gkZNMa, C37513ovJ.StateListAnimator.newInstance$default(C37513ovJ.Companion, new java.util.ArrayList(), gEmmrt(), null, 4, null)).commitAllowingStateLoss();
    }

    private final void isConnected() {
        C33926nKz c33926nKz = this.AkhnZx;
        if (c33926nKz != null) {
            C52794wYp c52794wYp = c33926nKz.copydefault;
            android.content.Context context = c52794wYp.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iEZpvd = EZpvd();
            java.util.List<java.lang.String> value = AhwBna().EZpvd().getValue();
            c52794wYp.setText(C33069mpW.KWHzl(context, iEZpvd, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(value != null ? value.size() : 0)))));
            c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
        }
    }

    public final void copydefault(java.util.List<java.lang.String> list) {
        pUU.KWHzl("SelectGroupCallMemberFragment", "size of finalList is " + list.size());
        android.content.Intent intent = new android.content.Intent();
        intent.putStringArrayListExtra("LIST_FINAL_RESULT", new java.util.ArrayList<>(list));
        requireActivity().setResult(-1, intent);
        requireActivity().finish();
    }

    private final void KWHzl(int i) {
        C33926nKz c33926nKz = this.AkhnZx;
        if (c33926nKz != null) {
            C52794wYp c52794wYp = c33926nKz.copydefault;
            android.content.Context context = c52794wYp.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c52794wYp.setText(C33069mpW.KWHzl(context, EZpvd(), (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(i)))));
        }
    }

    /* JADX INFO: renamed from: o.owt$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C37602owt OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C37602owt c37602owt) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = c37602owt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                pUU.KWHzl("SelectRelationFragment", "Next button clicked");
                java.util.List<java.lang.String> value = this.OLrzqt.AhwBna().EZpvd().getValue();
                if (value == null) {
                    value = new java.util.ArrayList<>();
                }
                this.OLrzqt.copydefault(value);
            }
        }
    }

    /* JADX INFO: renamed from: o.owt$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C55230xfy KWHzl;
        public final /* synthetic */ C37602owt OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C37602owt c37602owt, C55230xfy c55230xfy) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c37602owt;
            this.KWHzl = c55230xfy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ActivityC37525ovV.ActionBar actionBar = ActivityC37525ovV.Companion;
                android.content.Context contextRequireContext = this.OLrzqt.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                java.util.List<java.lang.String> value = this.OLrzqt.AhwBna().EZpvd().getValue();
                if (value == null) {
                    value = yDY.AhwBna();
                }
                java.util.List<java.lang.String> listDjBIcL = this.OLrzqt.djBIcL();
                if (listDjBIcL == null) {
                    listDjBIcL = yDY.AhwBna();
                }
                android.content.Intent intentEZpvd = actionBar.EZpvd(contextRequireContext, value, listDjBIcL, this.OLrzqt.gEmmrt());
                ActivityOptionsCompat activityOptionsCompatMakeSceneTransitionAnimation = ActivityOptionsCompat.makeSceneTransitionAnimation(this.OLrzqt.requireActivity(), this.KWHzl, "shared_element_name");
                Intrinsics.checkNotNullExpressionValue(activityOptionsCompatMakeSceneTransitionAnimation, "");
                this.OLrzqt.djBIcL.launch(intentEZpvd, activityOptionsCompatMakeSceneTransitionAnimation);
            }
        }
    }

    private final int EZpvd() {
        java.util.List<java.lang.String> listDjBIcL = djBIcL();
        return (listDjBIcL == null || listDjBIcL.isEmpty()) ? C35399nuc.LoaderManager.cBPFI : C35399nuc.LoaderManager.gwwfep;
    }

    private final void valueOf() {
        AhwBna().KWHzl().observe(this, new TaskDescription(new Function1() { // from class: o.owz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37602owt.EZpvd(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        AhwBna().OLrzqt().observe(this, new TaskDescription(new Function1() { // from class: o.owB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37602owt.copydefault(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        AhwBna().copydefault().observe(this, new TaskDescription(new Function1() { // from class: o.owA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37602owt.AYXKKw(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final Unit EZpvd(C37602owt c37602owt, java.lang.Boolean bool) {
        C52794wYp c52794wYp;
        C33926nKz c33926nKz = c37602owt.AkhnZx;
        if (c33926nKz != null && (c52794wYp = c33926nKz.copydefault) != null) {
            c52794wYp.setEnabled(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C37602owt c37602owt, java.lang.Boolean bool) {
        C52794wYp c52794wYp;
        C55230xfy c55230xfy;
        C52794wYp c52794wYp2;
        C55230xfy c55230xfy2;
        pUU.KWHzl("SelectRelationFragment", "isDataListEmpty:" + bool);
        if (bool.booleanValue()) {
            C33926nKz c33926nKz = c37602owt.AkhnZx;
            if (c33926nKz != null && (c55230xfy2 = c33926nKz.OLrzqt) != null) {
                c55230xfy2.setVisibility(8);
            }
            C33926nKz c33926nKz2 = c37602owt.AkhnZx;
            if (c33926nKz2 != null && (c52794wYp2 = c33926nKz2.copydefault) != null) {
                c52794wYp2.setVisibility(8);
            }
        } else {
            C33926nKz c33926nKz3 = c37602owt.AkhnZx;
            if (c33926nKz3 != null && (c55230xfy = c33926nKz3.OLrzqt) != null) {
                c55230xfy.setVisibility(0);
            }
            C33926nKz c33926nKz4 = c37602owt.AkhnZx;
            if (c33926nKz4 != null && (c52794wYp = c33926nKz4.copydefault) != null) {
                c52794wYp.setVisibility(0);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C37602owt c37602owt, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c37602owt.showLoading();
        } else {
            c37602owt.releaseLoading();
        }
        return Unit.INSTANCE;
    }

    private final void AYXKKw() {
        getChildFragmentManager().setFragmentResultListener("REQUEST_KEY_SELECTION_LIST_CHANGED", this, new FragmentResultListener() { // from class: o.owx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C37602owt.EZpvd(this.OLrzqt, str, bundle);
            }
        });
        getChildFragmentManager().setFragmentResultListener("REQUEST_KEY_IS_DATA_LIST_EMPTY", this, new FragmentResultListener() { // from class: o.owC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C37602owt.copydefault(this.copydefault, str, bundle);
            }
        });
    }

    public static final void EZpvd(C37602owt c37602owt, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        java.util.List<java.lang.String> stringArrayList = bundle.getStringArrayList("RESULT_KEY_LIST");
        if (stringArrayList == null) {
            stringArrayList = yDY.AhwBna();
        }
        c37602owt.AhwBna().copydefault(stringArrayList);
        c37602owt.KWHzl(stringArrayList.size());
        FragmentKt.setFragmentResult(c37602owt, "REQUEST_KEY_SELECTION_LIST_CHANGED", bundle);
    }

    public static final void copydefault(C37602owt c37602owt, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c37602owt.AhwBna().OLrzqt(bundle.getBoolean("RESULT_IS_DATA_LIST_EMPTY"));
    }
}
