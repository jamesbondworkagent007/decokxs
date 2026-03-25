package o;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.multitype.selection.Selectable;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core.extension.SimulateEntityFunctionBottomSheet$logout$1;
import com.okinc.ok_kyc_core.extension.SimulateEntityFunctionBottomSheet$processLoginState$1;
import com.okinc.ok_kyc_core.extension.bean.TestAccount;
import com.okinc.ok_kyc_core.extension.bean.TestAccountData;
import com.okinc.ok_kyc_core.extension.bean.TestRegion;
import com.okinc.ok_kyc_core.extension.widget.SimulateEntityHeaderView;
import com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rCe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C41988rCe extends AbstractC52788wYj {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public TestRegion AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public SimulateEntityHeaderView KWHzl;
    public wYF copydefault;
    public TestAccount gEmmrt;
    public C55198xfS valueOf;
    public SimulateEntityHeaderView.LoginState OLrzqt = SimulateEntityHeaderView.LoginState.DEFAULT;
    public java.util.List<C55276xgr> AEQbTJ = new java.util.ArrayList();
    public java.util.List<C55276xgr> djBIcL = new java.util.ArrayList();

    /* JADX INFO: renamed from: o.rCe$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
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

    /* JADX INFO: renamed from: o.rCe$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SimulateEntityHeaderView.LoginState.values().length];
            try {
                iArr[SimulateEntityHeaderView.LoginState.LOGIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SimulateEntityHeaderView.LoginState.UNLOGIN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX INFO: renamed from: o.rCe$TaskDescription */
    public static final class TaskDescription extends TypeToken<java.util.List<? extends TestAccount>> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC52788wYj
    public java.lang.CharSequence EZpvd() {
        return "Simulation Entity";
    }

    public final void KWHzl(C52794wYp c52794wYp) {
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return true;
    }

    public C41988rCe() {
        Function0 function0 = new Function0() { // from class: o.rCj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41988rCe.OLrzqt();
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.ok_kyc_core.extension.SimulateEntityFunctionBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.ok_kyc_core.extension.SimulateEntityFunctionBottomSheet$special$$inlined$viewModels$default$2
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C42000rCq.class), new Function0<ViewModelStore>() { // from class: com.okinc.ok_kyc_core.extension.SimulateEntityFunctionBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.ok_kyc_core.extension.SimulateEntityFunctionBottomSheet$special$$inlined$viewModels$default$4
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
    }

    /* JADX INFO: renamed from: o.rCe$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rCe.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final C42000rCq KWHzl() {
        return (C42000rCq) this.AhwBna.getValue();
    }

    public static final ViewModelProvider.Factory OLrzqt() {
        return new FragmentManager();
    }

    /* JADX INFO: renamed from: o.rCe$FragmentManager */
    public static final class FragmentManager implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new C42000rCq();
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        copydefault(false);
        KWHzl().AEQbTJ().observe(this, new Activity(new Function1() { // from class: o.rCm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41988rCe.copydefault(this.copydefault, (ResponseData) obj);
            }
        }));
        KWHzl().KWHzl();
    }

    public static final Unit copydefault(C41988rCe c41988rCe, ResponseData responseData) {
        TestAccountData testAccountData = (TestAccountData) responseData.getData();
        if (testAccountData == null) {
            C55328xhq.show$default(C55328xhq.OLrzqt, "Your device doesn't support this feature", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
        } else {
            c41988rCe.copydefault(true);
            java.lang.String accountList = testAccountData.getAccountList();
            if (accountList.length() > 0) {
                try {
                    java.util.List<TestAccount> list = (java.util.List) new Gson().fromJson(C33514mxr.copydefault(accountList, com.google.android.exoplayer2.C.UTF8_NAME, BouncyCastleKeyManagementRepository.AES, "52e13ddb2ab24f81"), new TaskDescription().getType());
                    Intrinsics.copydefault(list);
                    for (TestAccount testAccount : list) {
                        c41988rCe.AEQbTJ.add(new C55276xgr(testAccount.getEntityDisplayName(), testAccount, null, false, false, null, null, 124, null));
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            java.util.List<TestRegion> regionList = testAccountData.getRegionList();
            if (regionList != null) {
                for (TestRegion testRegion : regionList) {
                    c41988rCe.djBIcL.add(new C55276xgr(testRegion.getRegionDisplayName(), testRegion, null, false, false, null, null, 124, null));
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC52788wYj, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        android.content.Context context = wxq.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        SimulateEntityHeaderView simulateEntityHeaderView = new SimulateEntityHeaderView(context, null, 0, 6, null);
        this.KWHzl = simulateEntityHeaderView;
        wxq.addView(simulateEntityHeaderView);
        SimulateEntityHeaderView simulateEntityHeaderView2 = this.KWHzl;
        SimulateEntityHeaderView simulateEntityHeaderView3 = null;
        if (simulateEntityHeaderView2 == null) {
            Intrinsics.gEmmrt("");
            simulateEntityHeaderView2 = null;
        }
        simulateEntityHeaderView2.setTopNotificationContent("If you choose to simulate the subject after logging in, we will automatically switch to another test account for you. Please do not modify the test account, including modifying the country of residence, entity, deposit and withdrawal, etc");
        SimulateEntityHeaderView simulateEntityHeaderView4 = this.KWHzl;
        if (simulateEntityHeaderView4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            simulateEntityHeaderView3 = simulateEntityHeaderView4;
        }
        simulateEntityHeaderView3.setLoginStatusCheckListener(new Function1() { // from class: o.rCn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41988rCe.KWHzl(this.copydefault, (SimulateEntityHeaderView.LoginState) obj);
            }
        });
    }

    public static final Unit KWHzl(C41988rCe c41988rCe, SimulateEntityHeaderView.LoginState loginState) {
        Intrinsics.checkNotNullParameter(loginState, "");
        int i = Application.AEQbTJ[loginState.ordinal()];
        if (i == 1) {
            c41988rCe.OLrzqt = SimulateEntityHeaderView.LoginState.LOGIN;
            if (C33129mqd.KWHzl((java.util.Collection) c41988rCe.AEQbTJ)) {
                C55198xfS c55198xfS = c41988rCe.valueOf;
                if (c55198xfS == null) {
                    Intrinsics.gEmmrt("");
                    c55198xfS = null;
                }
                c55198xfS.setSingleOneColumnData(c41988rCe.AEQbTJ, c41988rCe.valueOf());
            }
            c41988rCe.AYXKKw = null;
        } else if (i == 2) {
            c41988rCe.OLrzqt = SimulateEntityHeaderView.LoginState.UNLOGIN;
            if (C33129mqd.KWHzl((java.util.Collection) c41988rCe.djBIcL)) {
                C55198xfS c55198xfS2 = c41988rCe.valueOf;
                if (c55198xfS2 == null) {
                    Intrinsics.gEmmrt("");
                    c55198xfS2 = null;
                }
                c55198xfS2.setSingleOneColumnData(c41988rCe.djBIcL, c41988rCe.valueOf());
            }
            c41988rCe.gEmmrt = null;
        } else {
            c41988rCe.OLrzqt = SimulateEntityHeaderView.LoginState.DEFAULT;
        }
        return Unit.INSTANCE;
    }

    public final yHO<C55276xgr, C55276xgr, C55276xgr, Unit> valueOf() {
        return new yHO() { // from class: o.rCs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C41988rCe.EZpvd(this.KWHzl, (C55276xgr) obj, (C55276xgr) obj2, (C55276xgr) obj3);
            }
        };
    }

    public static final Unit EZpvd(C41988rCe c41988rCe, C55276xgr c55276xgr, C55276xgr c55276xgr2, C55276xgr c55276xgr3) {
        java.lang.Object objOLrzqt;
        SimulateEntityHeaderView.LoginState loginState = c41988rCe.OLrzqt;
        if (loginState == SimulateEntityHeaderView.LoginState.LOGIN) {
            objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
            Intrinsics.copydefault(objOLrzqt, "");
            c41988rCe.gEmmrt = (TestAccount) objOLrzqt;
        } else if (loginState == SimulateEntityHeaderView.LoginState.UNLOGIN) {
            objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
            Intrinsics.copydefault(objOLrzqt, "");
            c41988rCe.AYXKKw = (TestRegion) objOLrzqt;
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        this.valueOf = c55198xfS;
        c55198xfS.isConnected().setVisibility(8);
        c55198xfS.EZpvd(new ActionBar());
    }

    /* JADX INFO: renamed from: o.rCe$ActionBar */
    public static final class ActionBar extends C55268xgj {
        public ActionBar() {
            super(null, 0, 3, null);
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;ZZ)V */
        @Override // o.C55268xgj, o.InterfaceC55196xfQ
        /* JADX INFO: renamed from: copydefault */
        public void EZpvd(C55104xde<wZX> c55104xde, C55276xgr c55276xgr, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(c55104xde, "");
            Intrinsics.checkNotNullParameter(c55276xgr, "");
            super.EZpvd(c55104xde, c55276xgr, z, z2);
            if (z || EZpvd() != Selectable.Mode.Single) {
                return;
            }
            ((wZX) c55104xde.OLrzqt()).copydefault.setImageResource(C52761wXj.TaskDescription.dbwnZN);
        }
    }

    @Override // o.AbstractC52788wYj, o.wXX
    public void onFooterCreated(@NotNull final wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        this.copydefault = wyf;
        wyf.setPrimaryText("Confirm");
        wyf.setSecondaryText("Reset");
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.rCk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C41988rCe.OLrzqt(this.OLrzqt, wyf, view);
                }
            });
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.rCl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C41988rCe.KWHzl(this.AEQbTJ, view);
                }
            });
        }
    }

    public static final void OLrzqt(C41988rCe c41988rCe, wYF wyf, android.view.View view) {
        SimulateEntityHeaderView simulateEntityHeaderView = c41988rCe.KWHzl;
        if (simulateEntityHeaderView == null) {
            Intrinsics.gEmmrt("");
            simulateEntityHeaderView = null;
        }
        if (!simulateEntityHeaderView.AEQbTJ()) {
            C55328xhq.show$default(C55328xhq.OLrzqt, "Please choose login state", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            return;
        }
        SimulateEntityHeaderView.LoginState loginState = c41988rCe.OLrzqt;
        if ((loginState == SimulateEntityHeaderView.LoginState.LOGIN && c41988rCe.gEmmrt == null) || (loginState == SimulateEntityHeaderView.LoginState.UNLOGIN && c41988rCe.AYXKKw == null)) {
            C55328xhq.show$default(C55328xhq.OLrzqt, "Please choose a country or region", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            return;
        }
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        Intrinsics.copydefault(c52794wYpCopydefault);
        c41988rCe.OLrzqt(c52794wYpCopydefault);
    }

    public static final void KWHzl(C41988rCe c41988rCe, android.view.View view) {
        C55198xfS c55198xfS = c41988rCe.valueOf;
        if (c55198xfS == null) {
            Intrinsics.gEmmrt("");
            c55198xfS = null;
        }
        c55198xfS.values().AEQbTJ();
        C43655rtQ.OLrzqt.copydefault("");
        c41988rCe.gEmmrt = null;
        c41988rCe.AYXKKw = null;
        c41988rCe.copydefault();
        android.app.Dialog dialog = c41988rCe.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SimulateEntityFunctionBottomSheet$logout$1((InterfaceC8108awX) C43251rlk.copydefault(InterfaceC8108awX.class), null), 3, null);
    }

    public final void OLrzqt(C52794wYp c52794wYp) {
        InterfaceC8108awX interfaceC8108awX = (InterfaceC8108awX) C43251rlk.copydefault(InterfaceC8108awX.class);
        C52794wYp.startLoading$default(c52794wYp, 0L, 1, null);
        if (this.OLrzqt == SimulateEntityHeaderView.LoginState.LOGIN) {
            KWHzl(c52794wYp);
        }
        if (this.OLrzqt == SimulateEntityHeaderView.LoginState.UNLOGIN) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SimulateEntityFunctionBottomSheet$processLoginState$1(interfaceC8108awX, this, c52794wYp, null), 3, null);
        }
    }

    public final void copydefault(boolean z) {
        wYF wyf = this.copydefault;
        if (wyf != null) {
            wyf.setVisibility(z ? 0 : 8);
        }
        SimulateEntityHeaderView simulateEntityHeaderView = this.KWHzl;
        if (simulateEntityHeaderView == null) {
            Intrinsics.gEmmrt("");
            simulateEntityHeaderView = null;
        }
        simulateEntityHeaderView.setVisibility(z ? 0 : 8);
    }

    public final void copydefault(C52794wYp c52794wYp) {
        TestRegion testRegion = this.AYXKKw;
        if (testRegion != null) {
            C43655rtQ.OLrzqt.copydefault(testRegion.getCode());
            c52794wYp.fIwbmz();
            android.app.Dialog dialog = getDialog();
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }
}
