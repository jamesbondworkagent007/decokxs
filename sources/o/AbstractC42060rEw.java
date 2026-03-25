package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.fragment.FragmentKt;
import com.google.android.gms.common.Scopes;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.ok_kyc_core.common.Constant;
import com.okinc.ok_kyc_core.data.NavOptions;
import com.okinc.ok_kyc_core.data.amani.AmaniVideoCallParams;
import com.okinc.ok_kyc_core.data.eop.VendorConfig;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorTokenResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentProfile;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UpdateFormAppModel;
import com.okinc.ok_kyc_core.ocrvendor.VendorEvent;
import com.okinc.ok_kyc_core.presentation.base.BaseKYCFragment$amaniForResultLauncher$1$1;
import com.okinc.ok_kyc_core.presentation.base.BaseKYCFragment$amaniVideoCallLauncher$1$1;
import com.okinc.ok_kyc_core.presentation.base.BaseKYCFragment$eopCardLauncher$1$1;
import com.okinc.ok_kyc_core.presentation.base.BaseKYCFragment$eopLivenessLauncher$1$1;
import com.okinc.ok_kyc_core.presentation.base.BaseKYCFragment$initPermissionStateObservable$1$1$2;
import com.okinc.ok_kyc_core.presentation.base.BaseKYCFragment$jumioForResultLauncher$1$1;
import com.okinc.ok_kyc_core.presentation.base.BaseKYCFragment$jumpToMultiVendor$1;
import com.okinc.ok_kyc_core.presentation.base.BaseKYCFragment$nfcLauncher$1$1;
import com.okinc.ok_kyc_core.presentation.base.BaseKYCFragment$onViewCreated$4$1$1;
import com.okinc.ok_kyc_core.presentation.base.BaseKYCFragment$openDefaultFlow$1;
import com.okinc.ok_kyc_core.presentation.base.BaseKYCFragment$openJumioFlow$1;
import com.okinc.ok_kyc_core.presentation.base.BaseKYCFragment$routeCardVendor$3;
import com.okinc.ok_kyc_core.service.EopImageInfo;
import com.okinc.ok_kyc_core_api.ComplianceTheme;
import com.okinc.ok_kyc_core_api.PermissionState;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC42074rFj;
import o.AbstractC43697ruF;
import o.ActivityC42040rEc;
import o.C43662rtX;
import o.C52761wXj;
import o.rFW;
import org.jetbrains.annotations.NotNull;
import pub.devrel.easypermissions.AppSettingsDialog;

/* JADX INFO: renamed from: o.rEw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC42060rEw<BINDING extends ViewDataBinding, VM extends AbstractC42074rFj> extends androidx.fragment.app.Fragment {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final int AEQbTJ;
    public BINDING AYXKKw;
    public final ActivityResultLauncher<android.content.Intent> AhwBna;
    public final ActivityResultLauncher<android.content.Intent> AkhnZx;
    public final ActivityResultLauncher<android.content.Intent> AuCTel;
    public final ActivityResultLauncher<android.content.Intent> DbNXlk;
    public final ActivityResultLauncher<android.content.Intent> EZpvd;
    public final java.lang.String OLrzqt;
    public final MutableLiveData<C43734ruq<PageComponentAppModel>> copydefault;
    public final ActivityResultLauncher<android.content.Intent> djBIcL;
    public final ActivityResultLauncher<android.content.Intent> ejfBZ;
    public java.lang.String fARcdN;
    public java.util.HashMap<java.lang.String, java.lang.String> fIwbmz;
    public final ActivityResultLauncher<android.content.Intent> fJNWhG;
    public java.lang.Boolean fetchVPNInfo;
    public final ActivityResultLauncher<android.content.Intent> gEmmrt;
    public final InterfaceC56387yDm getFieldNames;
    public PageComponentProfile hDKMBd;
    public final InterfaceC56387yDm isConnected;
    public final InterfaceC56387yDm uzCIH;
    public final InterfaceC56387yDm valueOf;
    public java.lang.String values;

    /* JADX INFO: renamed from: o.rEw$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.rEw$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[NavOptions.values().length];
            try {
                iArr[NavOptions.Default.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[NavOptions.NoAnimation.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[NavOptions.CleanBackStack.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[NavOptions.CleanBackStackWithNoAmin.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[NavOptions.PopUtilDifferentDestination.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[PermissionState.values().length];
            try {
                iArr2[PermissionState.Granted.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[PermissionState.DENIED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            EZpvd = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BINDING AEQbTJ() {
        return this.AYXKKw;
    }

    public abstract void AEQbTJ(@NotNull UpdateFormAppModel updateFormAppModel);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PageComponentProfile AhwBna() {
        return this.hDKMBd;
    }

    public abstract C42163rIr KWHzl();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(PageComponentProfile pageComponentProfile) {
        this.hDKMBd = pageComponentProfile;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.lang.Boolean bool) {
        this.fetchVPNInfo = bool;
    }

    public abstract int OLrzqt();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivityResultLauncher<android.content.Intent> djBIcL() {
        return this.fJNWhG;
    }

    public abstract VM fetchVPNInfo();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivityResultLauncher<android.content.Intent> gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Type inference failed for r1v11. Raw type applied. Possible types: androidx.activity.result.ActivityResultLauncher<I>, java.lang.Object, androidx.activity.result.ActivityResultLauncher<android.content.Intent> */
    /* JADX DEBUG: Type inference failed for r1v13. Raw type applied. Possible types: androidx.activity.result.ActivityResultLauncher<I>, java.lang.Object, androidx.activity.result.ActivityResultLauncher<android.content.Intent> */
    /* JADX DEBUG: Type inference failed for r1v15. Raw type applied. Possible types: androidx.activity.result.ActivityResultLauncher<I>, java.lang.Object, androidx.activity.result.ActivityResultLauncher<android.content.Intent> */
    /* JADX DEBUG: Type inference failed for r1v17. Raw type applied. Possible types: androidx.activity.result.ActivityResultLauncher<I>, java.lang.Object, androidx.activity.result.ActivityResultLauncher<android.content.Intent> */
    /* JADX DEBUG: Type inference failed for r1v19. Raw type applied. Possible types: androidx.activity.result.ActivityResultLauncher<I>, java.lang.Object, androidx.activity.result.ActivityResultLauncher<android.content.Intent> */
    /* JADX DEBUG: Type inference failed for r1v21. Raw type applied. Possible types: androidx.activity.result.ActivityResultLauncher<I>, java.lang.Object, androidx.activity.result.ActivityResultLauncher<android.content.Intent> */
    /* JADX DEBUG: Type inference failed for r1v23. Raw type applied. Possible types: androidx.activity.result.ActivityResultLauncher<I>, java.lang.Object, androidx.activity.result.ActivityResultLauncher<android.content.Intent> */
    /* JADX DEBUG: Type inference failed for r1v7. Raw type applied. Possible types: androidx.activity.result.ActivityResultLauncher<I>, java.lang.Object, androidx.activity.result.ActivityResultLauncher<android.content.Intent> */
    /* JADX DEBUG: Type inference failed for r1v9. Raw type applied. Possible types: androidx.activity.result.ActivityResultLauncher<I>, java.lang.Object, androidx.activity.result.ActivityResultLauncher<android.content.Intent> */
    public AbstractC42060rEw() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.ok_kyc_core.presentation.base.BaseKYCFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.ok_kyc_core.presentation.base.BaseKYCFragment$special$$inlined$viewModels$default$2
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C42038rEa.class), new Function0<ViewModelStore>() { // from class: com.okinc.ok_kyc_core.presentation.base.BaseKYCFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.ok_kyc_core.presentation.base.BaseKYCFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.ok_kyc_core.presentation.base.BaseKYCFragment$special$$inlined$viewModels$default$5
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
        this.getFieldNames = C56392yDr.copydefault(new Function0() { // from class: o.rET
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC42060rEw.ejfBZ(this.KWHzl);
            }
        });
        this.uzCIH = C56392yDr.copydefault(new Function0() { // from class: o.rFc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC42060rEw.fIwbmz(this.KWHzl);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.rEY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC42060rEw.fARcdN(this.KWHzl);
            }
        });
        this.fIwbmz = new java.util.HashMap<>();
        this.fARcdN = "";
        this.values = "";
        this.AEQbTJ = 123;
        this.OLrzqt = "GetYourIDReady_CameraPermession_Button_Click";
        this.copydefault = new MutableLiveData<>();
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.rEB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                AbstractC42060rEw.ejfBZ(this.EZpvd, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.ejfBZ = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.rEz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                AbstractC42060rEw.AkhnZx(this.copydefault, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.AkhnZx = activityResultLauncherRegisterForActivityResult2;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.rEC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                AbstractC42060rEw.valueOf(this.AEQbTJ, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult3, "");
        this.EZpvd = activityResultLauncherRegisterForActivityResult3;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult4 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.rEF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                AbstractC42060rEw.DbNXlk(this.AEQbTJ, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult4, "");
        this.djBIcL = activityResultLauncherRegisterForActivityResult4;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult5 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.rEI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                AbstractC42060rEw.AuCTel(this.EZpvd, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult5, "");
        this.AuCTel = activityResultLauncherRegisterForActivityResult5;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult6 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.rEG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                AbstractC42060rEw.isConnected(this.AEQbTJ, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult6, "");
        this.gEmmrt = activityResultLauncherRegisterForActivityResult6;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult7 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.rEE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                AbstractC42060rEw.fJNWhG(this.KWHzl, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult7, "");
        this.fJNWhG = activityResultLauncherRegisterForActivityResult7;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult8 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.rEU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                AbstractC42060rEw.values(this.KWHzl, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult8, "");
        this.DbNXlk = activityResultLauncherRegisterForActivityResult8;
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult9 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.rEX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                AbstractC42060rEw.fetchVPNInfo(this.KWHzl, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult9, "");
        this.AhwBna = activityResultLauncherRegisterForActivityResult9;
    }

    public final C42038rEa EZpvd() {
        return (C42038rEa) this.isConnected.getValue();
    }

    public final java.lang.String AYXKKw() {
        return (java.lang.String) this.getFieldNames.getValue();
    }

    public static final java.lang.String ejfBZ(AbstractC42060rEw abstractC42060rEw) {
        java.lang.String string;
        android.os.Bundle arguments = abstractC42060rEw.getArguments();
        return (arguments == null || (string = arguments.getString("playbook")) == null) ? abstractC42060rEw.KWHzl().fetchVPNInfo() : string;
    }

    public final java.util.HashMap<java.lang.String, java.lang.String> valueOf() {
        return (java.util.HashMap) this.uzCIH.getValue();
    }

    public static final java.util.HashMap fIwbmz(AbstractC42060rEw abstractC42060rEw) {
        android.os.Bundle arguments = abstractC42060rEw.getArguments();
        java.io.Serializable serializable = arguments != null ? arguments.getSerializable("playbookParams") : null;
        java.util.HashMap map = serializable instanceof java.util.HashMap ? (java.util.HashMap) serializable : null;
        return map == null ? abstractC42060rEw.KWHzl().AhwBna() : map;
    }

    public final java.lang.String copydefault() {
        return (java.lang.String) this.valueOf.getValue();
    }

    public static final java.lang.String fARcdN(AbstractC42060rEw abstractC42060rEw) {
        return ActivityC42162rIq.Companion.EZpvd(abstractC42060rEw.AYXKKw());
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.util.List<java.lang.Integer> arrayList;
        super.onCreate(bundle);
        if (bundle != null) {
            java.lang.String string = bundle.getString("OCR_TARGET_ID");
            if (string == null) {
                string = "";
            }
            this.values = string;
            java.lang.String string2 = bundle.getString("OCR_TARGET_TAG");
            this.fARcdN = string2 != null ? string2 : "";
            java.io.Serializable serializable = bundle.getSerializable("OCR_CTA_VALUE_TAG");
            java.util.HashMap<java.lang.String, java.lang.String> map = serializable instanceof java.util.HashMap ? (java.util.HashMap) serializable : null;
            if (map == null) {
                map = new java.util.HashMap<>();
            }
            this.fIwbmz = map;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) bundle.getString(OtcExtraKeys.SESSIONID))) {
                pUU.KWHzl("qjf", "sessionId in use");
                EZpvd().EZpvd(bundle.getString(OtcExtraKeys.SESSIONID));
                EZpvd().OLrzqt(java.lang.Integer.valueOf(bundle.getInt("vendorType")));
                EZpvd().KWHzl(bundle.getString("cardSessionId"));
                EZpvd().OLrzqt(bundle.getString("cardCheckType"));
                C42038rEa c42038rEaEZpvd = EZpvd();
                int[] intArray = bundle.getIntArray("featuresQueue");
                if (intArray == null || (arrayList = yDV.sSMYrx(intArray)) == null) {
                    arrayList = new java.util.ArrayList<>();
                }
                c42038rEaEZpvd.AEQbTJ(arrayList);
                C42038rEa c42038rEaEZpvd2 = EZpvd();
                VendorConfig vendorConfig = (VendorConfig) bundle.getParcelable("vendorConfig");
                if (vendorConfig == null) {
                    vendorConfig = new VendorConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 1048575, (DefaultConstructorMarker) null);
                }
                c42038rEaEZpvd2.AEQbTJ(vendorConfig);
                EZpvd().AhwBna(bundle.getString("token"));
                EZpvd().AEQbTJ(bundle.getString("server_url"));
                EZpvd().copydefault(bundle.getString("NFC_MRZ"));
            }
        }
        fetchVPNInfo().valueOf(AYXKKw());
        fetchVPNInfo().EZpvd(valueOf());
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.app.ActionBar actionBar;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        FragmentActivity activity = getActivity();
        if (activity != null && (actionBar = activity.getActionBar()) != null) {
            actionBar.setDisplayShowHomeEnabled(false);
        }
        BINDING binding = (BINDING) DataBindingUtil.inflate(getLayoutInflater(), OLrzqt(), viewGroup, false);
        this.AYXKKw = binding;
        if (binding != null) {
            binding.setLifecycleOwner(getViewLifecycleOwner());
        }
        BINDING binding2 = this.AYXKKw;
        Intrinsics.copydefault(binding2);
        return binding2.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.os.Bundle arguments = getArguments();
        PageComponentProfile pageComponentProfile = arguments != null ? (PageComponentProfile) arguments.getParcelable(Scopes.PROFILE) : null;
        this.hDKMBd = pageComponentProfile instanceof PageComponentProfile ? pageComponentProfile : null;
        isConnected();
        values();
        DbNXlk();
        AkhnZx();
        fetchVPNInfo().ejfBZ().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.rEM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC42060rEw.values(this.copydefault, (C43734ruq) obj);
            }
        }));
        fetchVPNInfo().AYXKKw().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.rEN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC42060rEw.AkhnZx(this.OLrzqt, (C43734ruq) obj);
            }
        }));
        fetchVPNInfo().AhwBna().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.rEL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC42060rEw.fJNWhG(this.EZpvd, (C43734ruq) obj);
            }
        }));
        fetchVPNInfo().AEQbTJ().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.rEQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC42060rEw.DbNXlk(this.EZpvd, (C43734ruq) obj);
            }
        }));
        pUU.KWHzl("BaseKYCFragment", java.lang.String.valueOf(FragmentKt.findNavController(this).getBackQueue().size()));
        pUU.KWHzl("BaseKYCFragment", "playbook=" + AYXKKw() + "   activityPlaybook=" + KWHzl().fetchVPNInfo());
    }

    public static final Unit values(AbstractC42060rEw abstractC42060rEw, C43734ruq c43734ruq) {
        abstractC42060rEw.KWHzl().KWHzl().setValue(c43734ruq);
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(AbstractC42060rEw abstractC42060rEw, C43734ruq c43734ruq) {
        abstractC42060rEw.KWHzl().KWHzl().setValue(c43734ruq);
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(AbstractC42060rEw abstractC42060rEw, C43734ruq c43734ruq) {
        rFR rfr = (rFR) c43734ruq.EZpvd();
        if (rfr != null) {
            java.util.HashMap<java.lang.String, java.lang.String> mapEZpvd = rfr.EZpvd();
            Intrinsics.copydefault(mapEZpvd, "");
            abstractC42060rEw.fIwbmz = mapEZpvd;
            abstractC42060rEw.fARcdN = rfr.AhwBna();
            abstractC42060rEw.values = rfr.AEQbTJ();
            abstractC42060rEw.OLrzqt(rfr.copydefault(), rfr.gEmmrt(), rfr.KWHzl(), rfr.OLrzqt(), rfr.djBIcL());
        }
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(AbstractC42060rEw abstractC42060rEw, C43734ruq c43734ruq) {
        AmaniVideoCallParams amaniVideoCallParams = (AmaniVideoCallParams) c43734ruq.EZpvd();
        if (amaniVideoCallParams != null) {
            java.util.HashMap<java.lang.String, java.lang.String> ctaValue = amaniVideoCallParams.getCtaValue();
            Intrinsics.copydefault(ctaValue, "");
            abstractC42060rEw.fIwbmz = ctaValue;
            abstractC42060rEw.fARcdN = amaniVideoCallParams.getTarget();
            abstractC42060rEw.values = amaniVideoCallParams.getId();
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractC42060rEw), null, null, new BaseKYCFragment$onViewCreated$4$1$1(abstractC42060rEw, amaniVideoCallParams, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    public final void isConnected() {
        LiveData<C43734ruq<rFW>> liveDataAkhnZx = fetchVPNInfo().AkhnZx();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C43733rup.copydefault(liveDataAkhnZx, viewLifecycleOwner, new Function1() { // from class: o.rER
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC42060rEw.fetchVPNInfo(this.EZpvd, (C43734ruq) obj);
            }
        });
    }

    public static final Unit fetchVPNInfo(AbstractC42060rEw abstractC42060rEw, C43734ruq c43734ruq) {
        Intrinsics.checkNotNullParameter(c43734ruq, "");
        rFW rfw = (rFW) c43734ruq.EZpvd();
        if (rfw != null) {
            abstractC42060rEw.KWHzl(rfw);
        }
        return Unit.INSTANCE;
    }

    public void values() {
        LiveData<C43734ruq<java.lang.String>> liveDataIsConnected = fetchVPNInfo().isConnected();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C43733rup.copydefault(liveDataIsConnected, viewLifecycleOwner, new Function1() { // from class: o.rEW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC42060rEw.gEmmrt(this.KWHzl, (C43734ruq) obj);
            }
        });
    }

    public static final Unit gEmmrt(AbstractC42060rEw abstractC42060rEw, C43734ruq c43734ruq) {
        Intrinsics.checkNotNullParameter(c43734ruq, "");
        java.lang.String str = (java.lang.String) c43734ruq.EZpvd();
        if (str != null) {
            android.content.Context context = abstractC42060rEw.getContext();
            C55326xho.toast$default(str, context != null ? context.getDrawable(C43662rtX.Activity.OqFWZa) : null, 0, (java.lang.Integer) null, 0, 0, 30, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public void DbNXlk() {
        LiveData<C43734ruq<kotlin.Pair<java.lang.String, java.lang.Integer>>> liveDataUzCIH = fetchVPNInfo().uzCIH();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C43733rup.copydefault(liveDataUzCIH, viewLifecycleOwner, new Function1() { // from class: o.rED
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC42060rEw.isConnected(this.copydefault, (C43734ruq) obj);
            }
        });
    }

    public static final Unit isConnected(AbstractC42060rEw abstractC42060rEw, C43734ruq c43734ruq) {
        final C55284xgz c55284xgzKWHzl;
        android.view.Window window;
        Intrinsics.checkNotNullParameter(c43734ruq, "");
        kotlin.Pair pair = (kotlin.Pair) c43734ruq.EZpvd();
        if (pair != null) {
            java.lang.String str = (java.lang.String) pair.component1();
            int iIntValue = ((java.lang.Number) pair.component2()).intValue();
            if (abstractC42060rEw.isAdded()) {
                android.view.View view = abstractC42060rEw.getView();
                if (view == null) {
                    FragmentActivity activity = abstractC42060rEw.getActivity();
                    view = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
                }
                if (view != null && (c55284xgzKWHzl = C55284xgz.Companion.KWHzl(view, str)) != null) {
                    c55284xgzKWHzl.isConnected(iIntValue);
                    c55284xgzKWHzl.djBIcL(0);
                    c55284xgzKWHzl.AEQbTJ(str);
                    c55284xgzKWHzl.AEQbTJ(2000);
                    c55284xgzKWHzl.EZpvd(new View.OnClickListener() { // from class: o.rEO
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view2) {
                            AbstractC42060rEw.AEQbTJ(c55284xgzKWHzl, view2);
                        }
                    });
                    c55284xgzKWHzl.hDKMBd();
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C55284xgz c55284xgz, android.view.View view) {
        c55284xgz.copydefault();
    }

    public final void KWHzl(rFW rfw) {
        try {
            if (rfw instanceof rFW.TaskDescription) {
                NavController navControllerFindNavController = FragmentKt.findNavController(this);
                int i = TaskDescription.KWHzl[((rFW.TaskDescription) rfw).AEQbTJ().ordinal()];
                if (i == 1) {
                    navControllerFindNavController.navigate(((rFW.TaskDescription) rfw).copydefault(), ((rFW.TaskDescription) rfw).EZpvd());
                    return;
                }
                if (i == 2) {
                    NavDestination currentDestination = navControllerFindNavController.getCurrentDestination();
                    if (currentDestination != null) {
                        navControllerFindNavController.navigate(((rFW.TaskDescription) rfw).copydefault(), ((rFW.TaskDescription) rfw).EZpvd(), NavOptions.Builder.setPopUpTo$default(new NavOptions.Builder(), currentDestination.getId(), true, false, 4, (java.lang.Object) null).setEnterAnim(C52761wXj.Application.fetchVPNInfo).build());
                        return;
                    } else {
                        navControllerFindNavController.navigate(((rFW.TaskDescription) rfw).copydefault(), ((rFW.TaskDescription) rfw).EZpvd(), new NavOptions.Builder().setEnterAnim(C52761wXj.Application.fetchVPNInfo).build());
                        return;
                    }
                }
                if (i == 3) {
                    navControllerFindNavController.navigate(((rFW.TaskDescription) rfw).copydefault(), ((rFW.TaskDescription) rfw).EZpvd(), NavOptions.Builder.setPopUpTo$default(new NavOptions.Builder(), C43662rtX.ActionBar.isReflectionWorking, true, false, 4, (java.lang.Object) null).setEnterAnim(C52761wXj.Application.AkhnZx).build());
                    return;
                }
                if (i == 4) {
                    navControllerFindNavController.navigate(((rFW.TaskDescription) rfw).copydefault(), ((rFW.TaskDescription) rfw).EZpvd(), NavOptions.Builder.setPopUpTo$default(new NavOptions.Builder(), C43662rtX.ActionBar.isReflectionWorking, true, false, 4, (java.lang.Object) null).build());
                    return;
                } else {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    NavDestination currentDestination2 = navControllerFindNavController.getCurrentDestination();
                    if (currentDestination2 != null) {
                        FragmentKt.findNavController(this).navigate(((rFW.TaskDescription) rfw).copydefault(), ((rFW.TaskDescription) rfw).EZpvd(), NavOptions.Builder.setPopUpTo$default(new NavOptions.Builder(), currentDestination2.getId(), true, false, 4, (java.lang.Object) null).build());
                        return;
                    }
                    return;
                }
            }
            if (rfw instanceof rFW.StateListAnimator) {
                KWHzl().fJNWhG();
                if (FragmentKt.findNavController(this).getBackQueue().size() == 2) {
                    pUU.KWHzl("BaseKYCFragment", "back");
                    KWHzl().AuCTel();
                } else {
                    FragmentKt.findNavController(this).navigateUp();
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final void OLrzqt(java.util.List<java.lang.Integer> list, MultiVendorTokenResp multiVendorTokenResp, java.lang.String str, java.lang.String str2, VendorConfig vendorConfig) {
        java.lang.String certificateType;
        java.lang.String countryOfResidence;
        C43701ruJ c43701ruJ = C43701ruJ.EZpvd;
        c43701ruJ.AEQbTJ();
        VendorConfig vendorConfig2 = vendorConfig == null ? new VendorConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 1048575, (DefaultConstructorMarker) null) : vendorConfig;
        vendorConfig2.setSource(KWHzl().values().getValue());
        vendorConfig2.setSourceCode(fetchVPNInfo().OLrzqt(valueOf()));
        PageComponentProfile pageComponentProfile = this.hDKMBd;
        if (pageComponentProfile == null || (certificateType = pageComponentProfile.getCertificateType()) == null) {
            certificateType = "";
        }
        vendorConfig2.setCertificateTypeOnboarding(certificateType);
        c43701ruJ.OLrzqt(multiVendorTokenResp.getVendorType());
        boolean zContains = list.contains(java.lang.Integer.valueOf(Constant.UploadFileType.LIVE_FACE.getImageTypeVal()));
        if (isAdded()) {
            if (list.size() == 1 && zContains) {
                PageComponentProfile pageComponentProfile2 = this.hDKMBd;
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseKYCFragment$jumpToMultiVendor$1(this, vendorConfig2, multiVendorTokenResp, (pageComponentProfile2 == null || (countryOfResidence = pageComponentProfile2.getCountryOfResidence()) == null) ? "" : countryOfResidence, null), 3, null);
            } else {
                AEQbTJ(list, multiVendorTokenResp, str, str2, vendorConfig2);
            }
        }
    }

    public final void AEQbTJ(java.util.List<java.lang.Integer> list, MultiVendorTokenResp multiVendorTokenResp, java.lang.String str, final java.lang.String str2, final VendorConfig vendorConfig) {
        EZpvd().AhwBna(multiVendorTokenResp.getToken());
        EZpvd().AEQbTJ(multiVendorTokenResp.getServerUrl());
        EZpvd().OLrzqt(multiVendorTokenResp.getVendorType());
        EZpvd().EZpvd(multiVendorTokenResp.getSessionId());
        EZpvd().KWHzl(str);
        EZpvd().OLrzqt(str2);
        EZpvd().AEQbTJ(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list));
        EZpvd().AEQbTJ(vendorConfig);
        java.lang.String[] strArr = {"android.permission.CAMERA"};
        if (C33625mzw.OLrzqt().OLrzqt(requireActivity(), (java.lang.String[]) java.util.Arrays.copyOf(strArr, 1))) {
            java.lang.Integer vendorType = multiVendorTokenResp.getVendorType();
            int vendorType2 = Constant.VendorType.EOP.getVendorType();
            if (vendorType != null && vendorType.intValue() == vendorType2) {
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("OKCard_Get_Router_Result", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rEA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return AbstractC42060rEw.copydefault(str2, vendorConfig, (EventParamsList) obj);
                    }
                });
                if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) Constant.CardVendorType.JUMIO.getCardVendorType())) {
                    copydefault(vendorConfig);
                    return;
                } else {
                    if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) Constant.CardVendorType.DEFAULT.getCardVendorType())) {
                        java.lang.String sessionId = multiVendorTokenResp.getSessionId();
                        EZpvd(vendorConfig, sessionId != null ? sessionId : "");
                        return;
                    }
                    return;
                }
            }
            int vendorType3 = Constant.VendorType.AMANI.getVendorType();
            if (vendorType != null && vendorType.intValue() == vendorType3) {
                TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("TRKYC_Vendor_StartAmani_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rEJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return AbstractC42060rEw.AEQbTJ(this.copydefault, (EventParamsList) obj);
                    }
                });
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseKYCFragment$routeCardVendor$3(this, multiVendorTokenResp, null), 3, null);
                return;
            }
            return;
        }
        ActivityC42040rEc.Application application = ActivityC42040rEc.Companion;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        application.AEQbTJ(fragmentActivityRequireActivity, strArr, this.ejfBZ);
    }

    public static final Unit copydefault(java.lang.String str, VendorConfig vendorConfig, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("result", "success", false);
        eventParamsList.put("type", java.lang.String.valueOf(str), false);
        eventParamsList.put("flow_source", C33129mqd.gEmmrt(vendorConfig != null ? vendorConfig.getSource() : null), false);
        eventParamsList.put(EopTrackEvent.KEY_SOURCE_CODE, C33129mqd.gEmmrt(vendorConfig != null ? vendorConfig.getSourceCode() : null), false);
        java.lang.String strZsXlph = ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph();
        eventParamsList.put(EopTrackEvent.KEY_COR, strZsXlph != null ? strZsXlph : "", false);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractC42060rEw abstractC42060rEw, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("flow_source", C33129mqd.gEmmrt(abstractC42060rEw.KWHzl().values().getValue()), false);
        eventParamsList.put(EopTrackEvent.KEY_SOURCE_CODE, abstractC42060rEw.fetchVPNInfo().OLrzqt(abstractC42060rEw.valueOf()), false);
        eventParamsList.put("is_support_nfc", C43693ruB.EZpvd(rTN.KWHzl.OLrzqt()), false);
        eventParamsList.put(EopTrackEvent.KEY_COR, ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph(), false);
        return Unit.INSTANCE;
    }

    public final void EZpvd(VendorConfig vendorConfig, java.lang.String str) {
        java.lang.String countryOfResidence;
        PageComponentProfile pageComponentProfile = this.hDKMBd;
        if (pageComponentProfile == null || (countryOfResidence = pageComponentProfile.getCountryOfResidence()) == null) {
            countryOfResidence = "";
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BaseKYCFragment$openDefaultFlow$1(vendorConfig, this, str, countryOfResidence, null), 3, null);
    }

    public final void copydefault(VendorConfig vendorConfig) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragmentActivityRequireActivity), null, null, new BaseKYCFragment$openJumioFlow$1(this, vendorConfig, null), 3, null);
    }

    public static /* synthetic */ void vendorSuccessResult$default(AbstractC42060rEw abstractC42060rEw, int i, int i2, java.lang.String str, java.util.ArrayList arrayList, java.lang.String str2, java.lang.Integer num, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: vendorSuccessResult");
        }
        if ((i3 & 16) != 0) {
            str2 = null;
        }
        java.lang.String str3 = str2;
        if ((i3 & 32) != 0) {
            num = 0;
        }
        abstractC42060rEw.EZpvd(i, i2, str, arrayList, str3, num);
    }

    public final void EZpvd(int i, int i2, java.lang.String str, java.util.ArrayList<EopImageInfo> arrayList, java.lang.String str2, java.lang.Integer num) {
        if (i == Constant.VendorType.EOP.getVendorType()) {
            AbstractC42074rFj abstractC42074rFjFetchVPNInfo = fetchVPNInfo();
            java.lang.String str3 = this.values;
            java.lang.String str4 = this.fARcdN;
            java.util.HashMap<java.lang.String, java.lang.String> map = this.fIwbmz;
            Intrinsics.copydefault(map, "");
            abstractC42074rFjFetchVPNInfo.KWHzl(str3, str4, map, new java.util.HashMap<>(), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), str, arrayList, KWHzl().fetchVPNInfo(), KWHzl().AhwBna(), this.hDKMBd, str2, num);
        }
    }

    public final void KWHzl(java.lang.String str) {
        pUU.KWHzl("qjf", "videoCallFinish()-->");
        AbstractC42074rFj abstractC42074rFjFetchVPNInfo = fetchVPNInfo();
        java.lang.String str2 = this.values;
        java.lang.String str3 = this.fARcdN;
        java.util.HashMap<java.lang.String, java.lang.String> map = this.fIwbmz;
        java.util.HashMap map2 = new java.util.HashMap();
        int vendorType = Constant.VendorType.AMANI_VIDEO_CALL.getVendorType();
        AbstractC42074rFj.navigateToOcrVendor$default(abstractC42074rFjFetchVPNInfo, str2, str3, map, map2, java.lang.Integer.valueOf(vendorType), null, str, null, KWHzl().fetchVPNInfo(), KWHzl().AhwBna(), this.hDKMBd, null, null, 6304, null);
    }

    public static final void ejfBZ(AbstractC42060rEw abstractC42060rEw, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            android.content.Intent data = activityResult.getData();
            java.lang.String[] stringArrayExtra = data != null ? data.getStringArrayExtra("vendor_permission") : null;
            java.lang.String[] strArr = stringArrayExtra instanceof java.lang.String[] ? stringArrayExtra : null;
            if (strArr != null) {
                if (!(strArr.length == 0)) {
                    C33625mzw.OLrzqt().EZpvd(abstractC42060rEw.requireActivity(), strArr, abstractC42060rEw.getResources().getString(C43662rtX.Dialog.valueOf), abstractC42060rEw.AEQbTJ, null);
                }
            } else if (Intrinsics.EZpvd(abstractC42060rEw.fetchVPNInfo, java.lang.Boolean.TRUE)) {
                abstractC42060rEw.KWHzl(rFW.StateListAnimator.AEQbTJ);
            }
        }
    }

    public final void AkhnZx() {
        KWHzl().AYXKKw().removeObservers(this);
        C43733rup.copydefault(KWHzl().AYXKKw(), this, new Function1() { // from class: o.rEV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC42060rEw.valueOf(this.OLrzqt, (C43734ruq) obj);
            }
        });
    }

    public static final Unit valueOf(AbstractC42060rEw abstractC42060rEw, C43734ruq c43734ruq) {
        Triple triple = (Triple) c43734ruq.EZpvd();
        if (triple != null) {
            int i = TaskDescription.EZpvd[((PermissionState) triple.getFirst()).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((java.lang.Number) triple.getSecond()).intValue() == 1001 && ContextCompat.checkSelfPermission(abstractC42060rEw.requireActivity(), "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    pUU.KWHzl("GPS_SUBMIT", "onPermissionsDenied->Coarse granted, proceeding with Coarse.");
                    AbstractC42074rFj abstractC42074rFjFetchVPNInfo = abstractC42060rEw.fetchVPNInfo();
                    FragmentActivity fragmentActivityRequireActivity = abstractC42060rEw.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    abstractC42074rFjFetchVPNInfo.KWHzl(fragmentActivityRequireActivity);
                } else {
                    java.lang.Integer numValueOf = abstractC42060rEw.EZpvd().valueOf();
                    int vendorType = Constant.VendorType.EOP.getVendorType();
                    if (numValueOf != null && numValueOf.intValue() == vendorType) {
                        java.lang.String str = abstractC42060rEw.OLrzqt;
                        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                        C32866mlf.EZpvd(str, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rEK
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return AbstractC42060rEw.EZpvd((EventParamsList) obj);
                            }
                        });
                        pUU.KWHzl("kyc_in_house", "GetYourIDReady_CameraPermession_Button_Click reject");
                    }
                    if (C60121zwJ.copydefault(abstractC42060rEw.requireActivity(), (java.util.List) triple.getThird())) {
                        new AppSettingsDialog.ActionBar(abstractC42060rEw.requireActivity()).AEQbTJ().AEQbTJ();
                    }
                    if (((java.lang.Number) triple.getSecond()).intValue() == 1001) {
                        AbstractC42074rFj.onLocationPermissionDenied$default(abstractC42060rEw.fetchVPNInfo(), null, 1, null);
                        AbstractC42074rFj.cancelLoading$default(abstractC42060rEw.fetchVPNInfo(), abstractC42060rEw.fetchVPNInfo().OLrzqt(), abstractC42060rEw.requireActivity(), false, 4, null);
                    } else {
                        finishWithErrorResult$default(abstractC42060rEw, VendorEvent.VENDOR_PERMISSIONS_DENIED, null, 2, null);
                    }
                }
            } else if (((java.lang.Number) triple.getSecond()).intValue() == 1001) {
                pUU.KWHzl("GPS_SUBMIT", "onPermissionsGranted->" + triple.getFirst());
                AbstractC42074rFj abstractC42074rFjFetchVPNInfo2 = abstractC42060rEw.fetchVPNInfo();
                FragmentActivity fragmentActivityRequireActivity2 = abstractC42060rEw.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
                abstractC42074rFjFetchVPNInfo2.KWHzl(fragmentActivityRequireActivity2);
            } else {
                java.lang.Integer numValueOf2 = abstractC42060rEw.EZpvd().valueOf();
                int vendorType2 = Constant.VendorType.EOP.getVendorType();
                if (numValueOf2 != null && numValueOf2.intValue() == vendorType2) {
                    java.lang.String strEZpvd = abstractC42060rEw.EZpvd().EZpvd();
                    if (Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) Constant.CardVendorType.JUMIO.getCardVendorType())) {
                        abstractC42060rEw.copydefault(abstractC42060rEw.EZpvd().djBIcL());
                    } else if (Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) Constant.CardVendorType.DEFAULT.getCardVendorType())) {
                        abstractC42060rEw.EZpvd(abstractC42060rEw.EZpvd().djBIcL(), abstractC42060rEw.EZpvd().gEmmrt());
                    }
                    java.lang.String str2 = abstractC42060rEw.OLrzqt;
                    TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
                    C32866mlf.EZpvd(str2, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.rEH
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return AbstractC42060rEw.OLrzqt((EventParamsList) obj);
                        }
                    });
                } else {
                    int vendorType3 = Constant.VendorType.AMANI.getVendorType();
                    if (numValueOf2 != null && numValueOf2.intValue() == vendorType3) {
                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractC42060rEw), null, null, new BaseKYCFragment$initPermissionStateObservable$1$1$2(abstractC42060rEw, null), 3, null);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "allow", false, 4, null);
        java.lang.String strZsXlph = ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph();
        eventParamsList.put(EopTrackEvent.KEY_COR, strZsXlph != null ? strZsXlph : "", false);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "reject", false, 4, null);
        java.lang.String strZsXlph = ((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).zsXlph();
        eventParamsList.put(EopTrackEvent.KEY_COR, strZsXlph != null ? strZsXlph : "", false);
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(AbstractC42060rEw abstractC42060rEw, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(activityResult, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractC42060rEw), null, null, new BaseKYCFragment$jumioForResultLauncher$1$1(abstractC42060rEw, activityResult, null), 3, null);
    }

    public static final void valueOf(AbstractC42060rEw abstractC42060rEw, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(activityResult, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractC42060rEw), null, null, new BaseKYCFragment$amaniForResultLauncher$1$1(activityResult, abstractC42060rEw, null), 3, null);
    }

    public static final void DbNXlk(AbstractC42060rEw abstractC42060rEw, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(activityResult, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractC42060rEw), null, null, new BaseKYCFragment$eopCardLauncher$1$1(abstractC42060rEw, activityResult, null), 3, null);
    }

    public static final void AuCTel(AbstractC42060rEw abstractC42060rEw, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(activityResult, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractC42060rEw), null, null, new BaseKYCFragment$nfcLauncher$1$1(abstractC42060rEw, activityResult, null), 3, null);
    }

    public static final void isConnected(AbstractC42060rEw abstractC42060rEw, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(activityResult, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractC42060rEw), null, null, new BaseKYCFragment$eopLivenessLauncher$1$1(abstractC42060rEw, activityResult, null), 3, null);
    }

    public static final void fJNWhG(AbstractC42060rEw abstractC42060rEw, ActivityResult activityResult) {
        android.os.Bundle extras;
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == -1) {
            android.content.Intent data = activityResult.getData();
            if (data == null || (extras = data.getExtras()) == null) {
                return;
            }
            rTU rtu = (rTU) C43251rlk.OLrzqt(rTU.class);
            if ((rtu != null ? rtu.EZpvd(extras) : null) != null) {
                abstractC42060rEw.fetchVPNInfo().OLrzqt(null, abstractC42060rEw.getActivity(), ButtonStyle.Text, ComplianceTheme.OKX);
                return;
            }
            return;
        }
        if (activityResult.getResultCode() == 0) {
            pUU.EZpvd("facial", "用户点击了返回----quit by user cancel");
        }
    }

    public static final void values(AbstractC42060rEw abstractC42060rEw, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            android.content.Intent data = activityResult.getData();
            UpdateFormAppModel updateFormAppModel = data != null ? (UpdateFormAppModel) data.getParcelableExtra("update_form_data") : null;
            UpdateFormAppModel updateFormAppModel2 = updateFormAppModel instanceof UpdateFormAppModel ? updateFormAppModel : null;
            if (updateFormAppModel2 != null) {
                abstractC42060rEw.AEQbTJ(updateFormAppModel2);
            }
        }
    }

    public static final void fetchVPNInfo(AbstractC42060rEw abstractC42060rEw, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(activityResult, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractC42060rEw), null, null, new BaseKYCFragment$amaniVideoCallLauncher$1$1(activityResult, abstractC42060rEw, null), 3, null);
    }

    public static /* synthetic */ void finishWithErrorResult$default(AbstractC42060rEw abstractC42060rEw, VendorEvent vendorEvent, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: finishWithErrorResult");
        }
        if ((i & 2) != 0) {
            str = "";
        }
        abstractC42060rEw.KWHzl(vendorEvent, str);
    }

    public final void KWHzl(VendorEvent vendorEvent, java.lang.String str) {
        if (AbstractC42074rFj.Companion.EZpvd().contains(vendorEvent)) {
            fetchVPNInfo().AEQbTJ(new AbstractC43697ruF.StateListAnimator(vendorEvent, this.fARcdN, this.fIwbmz, str), AYXKKw(), copydefault(), this.values, valueOf(), null, getActivity(), new Function0() { // from class: o.rES
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC42060rEw.AuCTel(this.EZpvd);
                }
            });
            C55326xho.toast$default(getString(C43662rtX.Dialog.Dmq), C33070mpX.KWHzl(C43662rtX.Activity.OqFWZa), 0, (java.lang.Integer) null, 0, 0, 30, (java.lang.Object) null);
        } else {
            fetchVPNInfo().AEQbTJ(new AbstractC43697ruF.Activity(vendorEvent, this.fARcdN, this.fIwbmz), AYXKKw(), copydefault(), this.values, valueOf(), null, getActivity(), new Function0() { // from class: o.rEP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC42060rEw.fJNWhG(this.AEQbTJ);
                }
            });
        }
    }

    public static final Unit AuCTel(AbstractC42060rEw abstractC42060rEw) {
        if (Intrinsics.EZpvd(abstractC42060rEw.fetchVPNInfo, java.lang.Boolean.TRUE)) {
            abstractC42060rEw.KWHzl(rFW.StateListAnimator.AEQbTJ);
        }
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(AbstractC42060rEw abstractC42060rEw) {
        if (Intrinsics.EZpvd(abstractC42060rEw.fetchVPNInfo, java.lang.Boolean.TRUE)) {
            abstractC42060rEw.KWHzl(rFW.StateListAnimator.AEQbTJ);
        }
        return Unit.INSTANCE;
    }

    public final void ejfBZ() {
        BINDING binding = this.AYXKKw;
        if (binding != null) {
            binding.unbind();
        }
        this.AYXKKw = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        AbstractC42074rFj abstractC42074rFjFetchVPNInfo = fetchVPNInfo();
        abstractC42074rFjFetchVPNInfo.isConnected().removeObservers(getViewLifecycleOwner());
        abstractC42074rFjFetchVPNInfo.uzCIH().removeObservers(getViewLifecycleOwner());
        abstractC42074rFjFetchVPNInfo.ejfBZ().removeObservers(getViewLifecycleOwner());
        abstractC42074rFjFetchVPNInfo.AkhnZx().removeObservers(getViewLifecycleOwner());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        super.onSaveInstanceState(bundle);
        bundle.putString("OCR_TARGET_ID", this.values);
        bundle.putString("OCR_TARGET_TAG", this.fARcdN);
        bundle.putSerializable("OCR_CTA_VALUE_TAG", this.fIwbmz);
        pUU.KWHzl("qjf", getClass().getName() + "---onSaveInstanceState--->");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) EZpvd().gEmmrt())) {
            bundle.putString(OtcExtraKeys.SESSIONID, EZpvd().gEmmrt());
            java.lang.Integer numValueOf = EZpvd().valueOf();
            bundle.putInt("vendorType", numValueOf != null ? numValueOf.intValue() : 0);
            bundle.putString("cardSessionId", EZpvd().KWHzl());
            bundle.putString("cardCheckType", EZpvd().EZpvd());
            bundle.putIntArray("featuresQueue", CollectionsKt___CollectionsKt.fARcdN((java.util.Collection<java.lang.Integer>) EZpvd().AEQbTJ()));
            VendorConfig vendorConfigDjBIcL = EZpvd().djBIcL();
            if (vendorConfigDjBIcL == null) {
                vendorConfigDjBIcL = new VendorConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 1048575, (DefaultConstructorMarker) null);
            }
            bundle.putParcelable("vendorConfig", vendorConfigDjBIcL);
            bundle.putString("token", EZpvd().AYXKKw());
            bundle.putString("server_url", EZpvd().OLrzqt());
            bundle.putString("NFC_MRZ", EZpvd().copydefault());
        }
    }

    /* JADX INFO: renamed from: o.rEw$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rEw.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
