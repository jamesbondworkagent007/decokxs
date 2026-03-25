package o;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.net.bean.MoreFunctionInfo;
import com.okinc.business.defi.biz.net.bean.MoreFunctionModuleInfo;
import com.okinc.business.defi.biz.net.bean.SingleTeeStatus;
import com.okinc.business.defi.wallet.home.WalletHomeMoreFragment$setupAdapter$2$1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C12827cuN;
import o.C13754dXa;
import o.dTQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eUq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15770eUq extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final C59534zip KWHzl = new C59534zip();
    public final InterfaceC56387yDm OLrzqt;

    /* JADX INFO: renamed from: o.eUq$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.eUq$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eUq.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C15770eUq newInstance$default(ActionBar actionBar, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            return actionBar.KWHzl(list, z);
        }

        public final C15770eUq KWHzl(@NotNull java.util.List<MoreFunctionModuleInfo> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            C15770eUq c15770eUq = new C15770eUq();
            c15770eUq.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("data", new java.util.ArrayList(list)), C56390yDp.OLrzqt("show_wallet_name", java.lang.Boolean.valueOf(z))));
            return c15770eUq;
        }
    }

    public C15770eUq() {
        final Function0 function0 = null;
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C18060fbK.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.WalletHomeMoreFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.WalletHomeMoreFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.WalletHomeMoreFragment$special$$inlined$activityViewModels$default$3
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

    private final java.util.ArrayList<MoreFunctionModuleInfo> EZpvd() {
        java.util.ArrayList<MoreFunctionModuleInfo> parcelableArrayList;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (parcelableArrayList = arguments.getParcelableArrayList("data")) == null) ? new java.util.ArrayList<>() : parcelableArrayList;
    }

    private final C18060fbK KWHzl() {
        return (C18060fbK) this.OLrzqt.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.view.View viewAEQbTJ = AEQbTJ(constraintLayout);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        android.content.Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = C55298xhM.copydefault(16.0f, context);
        Unit unit = Unit.INSTANCE;
        constraintLayout.addView(viewAEQbTJ, layoutParams);
        AEQbTJ();
        copydefault();
        OLrzqt();
        android.view.View view = getView();
        if (view != null) {
            view.post(new java.lang.Runnable() { // from class: o.eUu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C15770eUq.OLrzqt(this.EZpvd);
                }
            });
        }
    }

    public static final void OLrzqt(C15770eUq c15770eUq) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c15770eUq, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void OLrzqt() {
        KWHzl().EZpvd().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.eUm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15770eUq.EZpvd(this.copydefault, (SingleTeeStatus) obj);
            }
        }));
    }

    public static final Unit EZpvd(C15770eUq c15770eUq, SingleTeeStatus singleTeeStatus) {
        c15770eUq.KWHzl.notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    public final RecyclerView AEQbTJ(ConstraintLayout constraintLayout) {
        RecyclerView recyclerView = new RecyclerView(constraintLayout.getContext());
        recyclerView.setId(C13754dXa.ActionBar.getHeight);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), 2);
        gridLayoutManager.setSpanSizeLookup(new TaskDescription());
        recyclerView.setLayoutManager(gridLayoutManager);
        android.content.Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(24.0f, context);
        android.content.Context context2 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iCopydefault2 = C55298xhM.copydefault(24.0f, context2);
        android.content.Context context3 = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        recyclerView.setPaddingRelative(iCopydefault, recyclerView.getPaddingTop(), iCopydefault2, C55298xhM.copydefault(24.0f, context3));
        recyclerView.addItemDecoration(new C18069fbT());
        recyclerView.setAdapter(this.KWHzl);
        return recyclerView;
    }

    /* JADX INFO: renamed from: o.eUq$TaskDescription */
    public static final class TaskDescription extends GridLayoutManager.SpanSizeLookup {
        public TaskDescription() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            java.lang.Object obj = C15770eUq.this.KWHzl.getItems().get(i);
            if (!(obj instanceof C18062fbM)) {
                if (obj instanceof C18063fbN) {
                    return 1;
                }
                boolean z = obj instanceof C18065fbP;
            }
            return 2;
        }
    }

    private final void AEQbTJ() {
        this.KWHzl.register(C18062fbM.class, new C18066fbQ());
        this.KWHzl.register(C18063fbN.class, new C18068fbS(new Function1() { // from class: o.eUo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15770eUq.OLrzqt(this.KWHzl, (C18063fbN) obj);
            }
        }));
        this.KWHzl.register(C18065fbP.class, new C18071fbV(LifecycleOwnerKt.getLifecycleScope(this), new Function1() { // from class: o.eUp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15770eUq.KWHzl(this.EZpvd, (C18065fbP) obj);
            }
        }, new Function1() { // from class: o.eUs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15770eUq.OLrzqt(this.EZpvd, (C18065fbP) obj);
            }
        }));
    }

    public static final Unit OLrzqt(C15770eUq c15770eUq, C18063fbN c18063fbN) {
        Intrinsics.checkNotNullParameter(c18063fbN, "");
        MoreFunctionInfo moreFunctionInfo = new MoreFunctionInfo(c18063fbN.OLrzqt(), c18063fbN.gEmmrt(), c18063fbN.EZpvd(), c18063fbN.djBIcL(), c18063fbN.copydefault(), c18063fbN.KWHzl(), c18063fbN.fetchVPNInfo(), c18063fbN.valueOf(), c18063fbN.AYXKKw(), c18063fbN.AhwBna(), (java.lang.Integer) null, (java.lang.Integer) null, 3072, (DefaultConstructorMarker) null);
        FragmentActivity fragmentActivityRequireActivity = c15770eUq.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        C18061fbL.openDetailPage$default(moreFunctionInfo, fragmentActivityRequireActivity, false, 2, null);
        c15770eUq.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C15770eUq c15770eUq, C18065fbP c18065fbP) {
        Intrinsics.checkNotNullParameter(c18065fbP, "");
        if (c18065fbP.KWHzl().AubY()) {
            if (!c18065fbP.KWHzl().RJOkX()) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c15770eUq), null, null, new WalletHomeMoreFragment$setupAdapter$2$1(c15770eUq, c18065fbP, null), 3, null);
            } else {
                android.content.Context context = c15770eUq.getContext();
                if (context != null) {
                    dTQ.TaskDescription.enterTeeReNewPageAndCheck$default((dTQ) C43251rlk.copydefault(dTQ.class), context, c18065fbP.KWHzl(), null, "sa_wallet_more", 4, null);
                    c15770eUq.dismissAllowingStateLoss();
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C15770eUq c15770eUq, C18065fbP c18065fbP) {
        Intrinsics.checkNotNullParameter(c18065fbP, "");
        c15770eUq.KWHzl().EZpvd(c18065fbP.KWHzl().DbNXlk(), c18065fbP.KWHzl().ejfBZ());
        return Unit.INSTANCE;
    }

    private final void copydefault() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
        if (abstractC12782ctV != null && abstractC12782ctV.AubY() && ((dTQ) C43251rlk.copydefault(dTQ.class)).copydefault()) {
            arrayList.add(new C18062fbM(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ComponentActivity5)));
            android.os.Bundle arguments = getArguments();
            arrayList.add(new C18065fbP(abstractC12782ctV, arguments != null && arguments.getBoolean("show_wallet_name", true)));
        }
        for (MoreFunctionModuleInfo moreFunctionModuleInfo : EZpvd()) {
            java.lang.String moduleName = moreFunctionModuleInfo.getModuleName();
            if (moduleName == null) {
                moduleName = "";
            }
            arrayList.add(new C18062fbM(moduleName));
            java.util.List<MoreFunctionInfo> homeModules = moreFunctionModuleInfo.getHomeModules();
            if (homeModules != null) {
                for (MoreFunctionInfo moreFunctionInfo : homeModules) {
                    arrayList.add(new C18063fbN(moreFunctionInfo.getId(), moreFunctionInfo.getName(), moreFunctionInfo.getDayIcon(), moreFunctionInfo.getNightIcon(), moreFunctionInfo.getJumpUrl(), moreFunctionInfo.getJumpType(), moreFunctionInfo.getSupportWalletType(), moreFunctionInfo.getRecommendFlag(), moreFunctionInfo.getProjectCount(), moreFunctionInfo.getProjectCountText(), moreFunctionInfo.getLocaleBuildEnum()));
                }
            }
        }
        this.KWHzl.setItems(arrayList);
        this.KWHzl.notifyDataSetChanged();
    }
}
