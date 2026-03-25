package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.auth.impl.mfa.ui.MfaViewModel;
import com.okinc.auth.impl.mfa.ui.face.VerifyMfaFaceFragment$initView$2;
import com.okinc.auth.impl.mfa.ui.face.VerifyMfaFaceFragment$initView$3;
import com.okinc.auth.impl.mfa.ui.face.VerifyMfaFaceFragment$initView$4;
import com.okinc.auth.impl.mfa.ui.face.VerifyMfaFaceFragment$initView$6;
import com.okinc.auth.impl.mfa.ui.face.VerifyMfaFaceViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import pub.devrel.easypermissions.AppSettingsDialog;

/* JADX INFO: renamed from: o.aDe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5818aDe extends AbstractC5757aCW {
    public final InterfaceC56387yDm AYXKKw;
    public final ActivityResultLauncher<android.content.Intent> AhwBna;
    public final int djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public C5672aAr valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5818aDe() {
        this(0, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.ayP.Application.accept int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:37) call: o.aDe.<init>(int):void type: THIS */
    public /* synthetic */ C5818aDe(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C8206ayP.Application.accept : i);
    }

    public C5818aDe(int i) {
        this.djBIcL = i;
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.auth.impl.mfa.ui.face.VerifyMfaFaceFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.auth.impl.mfa.ui.face.VerifyMfaFaceFragment$special$$inlined$viewModels$default$2
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(VerifyMfaFaceViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.mfa.ui.face.VerifyMfaFaceFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.mfa.ui.face.VerifyMfaFaceFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.mfa.ui.face.VerifyMfaFaceFragment$special$$inlined$viewModels$default$5
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MfaViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.mfa.ui.face.VerifyMfaFaceFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.mfa.ui.face.VerifyMfaFaceFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.mfa.ui.face.VerifyMfaFaceFragment$special$$inlined$activityViewModels$default$3
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
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.aDh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C5818aDe.KWHzl(this.OLrzqt, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AhwBna = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX DEBUG: Possible override for method o.aCW.OLrzqt()V */
    public final VerifyMfaFaceViewModel OLrzqt() {
        return (VerifyMfaFaceViewModel) this.AYXKKw.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MfaViewModel AYXKKw() {
        return (MfaViewModel) this.gEmmrt.getValue();
    }

    public static final void KWHzl(C5818aDe c5818aDe, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(activityResult, "");
        int resultCode = activityResult.getResultCode();
        if (resultCode == -1) {
            pUU.KWHzl("Face Verify Result", "Result OK");
            VerifyMfaFaceViewModel.retrieveFacialResult$default(c5818aDe.OLrzqt(), null, 1, null);
        } else {
            if (resultCode != 0) {
                return;
            }
            pUU.KWHzl("Face Verify Result", "Result Canceled");
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C5672aAr c5672aArOLrzqt = C5672aAr.OLrzqt(layoutInflater, viewGroup, false);
        this.valueOf = c5672aArOLrzqt;
        if (c5672aArOLrzqt != null) {
            return c5672aArOLrzqt.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.valueOf = null;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C5672aAr c5672aAr = this.valueOf;
        if (c5672aAr != null) {
            AYXKKw().uzCIH();
            C52794wYp c52794wYp = c5672aAr.KWHzl;
            c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
            android.widget.ImageView imageView = c5672aAr.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C33054mpH.EZpvd(imageView, C43454rpb.copydefault("images/account/common/faceverify/account_selfie_guide.webp", contextRequireContext, true), (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        }
        C6690aUB.KWHzl(OLrzqt().KWHzl(), this, new VerifyMfaFaceFragment$initView$2(this, null));
        C6690aUB.KWHzl(OLrzqt().EZpvd(), this, new VerifyMfaFaceFragment$initView$3(this, null));
        C6690aUB.KWHzl(OLrzqt().AEQbTJ(), this, new VerifyMfaFaceFragment$initView$4(this, null));
        getParentFragmentManager().setFragmentResultListener("REQUEST_FACE_VERIFY_RETRY", this, new FragmentResultListener() { // from class: o.aDc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                C5818aDe.AEQbTJ(this.AEQbTJ, str, bundle2);
            }
        });
        C6690aUB.KWHzl(OLrzqt().OLrzqt(), this, new VerifyMfaFaceFragment$initView$6(this, null));
    }

    public static final void AEQbTJ(C5818aDe c5818aDe, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (bundle.getBoolean("RESULT_FACE_VERIFY_RETRY")) {
            VerifyMfaFaceViewModel verifyMfaFaceViewModelOLrzqt = c5818aDe.OLrzqt();
            java.lang.String value = c5818aDe.AYXKKw().values().getValue();
            verifyMfaFaceViewModelOLrzqt.copydefault(value != null ? value : "", c5818aDe.AYXKKw().fIwbmz(), c5818aDe.AYXKKw().DbNXlk());
        }
    }

    public final void AhwBna() {
        if (C33625mzw.OLrzqt().OLrzqt(getActivity(), (java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[]{"android.permission.CAMERA"}, 1))) {
            VerifyMfaFaceViewModel verifyMfaFaceViewModelOLrzqt = OLrzqt();
            java.lang.String value = AYXKKw().values().getValue();
            if (value == null) {
                value = "";
            }
            verifyMfaFaceViewModelOLrzqt.copydefault(value, AYXKKw().fIwbmz(), AYXKKw().DbNXlk());
            return;
        }
        C60121zwJ.AEQbTJ(this, getString(C8206ayP.Dialog.fXYAwm), 3, "android.permission.CAMERA");
    }

    @Override // o.AbstractC32996moC, o.C60121zwJ.Activity
    public void onPermissionsGranted(int i, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        super.onPermissionsGranted(i, list);
        if (i == 3) {
            VerifyMfaFaceViewModel verifyMfaFaceViewModelOLrzqt = OLrzqt();
            java.lang.String value = AYXKKw().values().getValue();
            verifyMfaFaceViewModelOLrzqt.copydefault(value != null ? value : "", AYXKKw().fIwbmz(), AYXKKw().DbNXlk());
        }
    }

    @Override // o.AbstractC32996moC, o.C60121zwJ.Activity
    public void onPermissionsDenied(int i, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        super.onPermissionsDenied(i, list);
        if (i == 3 && C60121zwJ.KWHzl(this, list)) {
            new AppSettingsDialog.ActionBar(this).AEQbTJ().AEQbTJ();
        }
        pUU.copydefault("Account Grant Camera Permissions Denied");
    }

    /* JADX INFO: renamed from: o.aDe$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C5818aDe KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C5818aDe c5818aDe) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = c5818aDe;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.AhwBna();
            }
        }
    }
}
