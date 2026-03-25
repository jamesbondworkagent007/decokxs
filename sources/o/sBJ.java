package o;

import androidx.activity.result.ActivityResultCallback;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.okex.common.ui.OKSupportBaseActivity;
import com.okinc.okex.uploadlog.UploadLogActivity$initViewModel$1;
import com.okinc.okex.uploadlog.viewmodel.UploadLogViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47315tni;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sBJ extends sBK {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.sBO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return sBJ.valueOf(this.AEQbTJ);
        }
    });
    public final AbstractC55115xdp gEmmrt = C55119xdt.AEQbTJ.KWHzl(this, new ActivityResultCallback() { // from class: o.sBL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(java.lang.Object obj) {
            sBJ.AEQbTJ(this.copydefault, (android.net.Uri) obj);
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.sBP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return sBJ.AhwBna(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.sBU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return sBJ.fetchVPNInfo(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.sBR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return sBJ.isConnected(this.OLrzqt);
        }
    });

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public boolean AYXKKw() {
        return false;
    }

    public sBJ() {
        final Function0 function0 = null;
        this.AhwBna = new ViewModelLazy(C56524yIo.AEQbTJ(UploadLogViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.uploadlog.UploadLogActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.uploadlog.UploadLogActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.uploadlog.UploadLogActivity$special$$inlined$viewModels$default$3
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
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UploadLogViewModel djBIcL() {
        return (UploadLogViewModel) this.AhwBna.getValue();
    }

    /* JADX DEBUG: Possible override for method com.okinc.okex.common.ui.OKSupportBaseActivity.AEQbTJ()V */
    /* JADX DEBUG: Possible override for method o.snZ.AEQbTJ()V */
    public final AbstractC47296tnP AEQbTJ() {
        return (AbstractC47296tnP) this.KWHzl.getValue();
    }

    public static final AbstractC47296tnP valueOf(sBJ sbj) {
        return AbstractC47296tnP.copydefault(sbj.getLayoutInflater());
    }

    public static final void AEQbTJ(sBJ sbj, android.net.Uri uri) {
        if (uri != null) {
            sbj.djBIcL().AEQbTJ(uri);
        }
    }

    /* JADX DEBUG: Possible override for method com.okinc.okex.common.ui.OKSupportBaseActivity.EZpvd()V */
    /* JADX DEBUG: Possible override for method o.snZ.EZpvd()V */
    public final java.lang.String EZpvd() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    public static final java.lang.String AhwBna(sBJ sbj) {
        android.os.Bundle extras;
        android.content.Intent intent = sbj.getIntent();
        java.lang.String string = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("ARG_FORM_ID");
        return string == null ? "" : string;
    }

    public final java.lang.String AhwBna() {
        return (java.lang.String) this.AEQbTJ.getValue();
    }

    public static final java.lang.String fetchVPNInfo(sBJ sbj) {
        android.os.Bundle extras;
        android.content.Intent intent = sbj.getIntent();
        java.lang.String string = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("ARG_FIELD_ID");
        return string == null ? "" : string;
    }

    public final java.lang.String gEmmrt() {
        return (java.lang.String) this.AYXKKw.getValue();
    }

    public static final java.lang.String isConnected(sBJ sbj) {
        android.os.Bundle extras;
        android.content.Intent intent = sbj.getIntent();
        java.lang.String string = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("ARG_STATUS_FIELD_ID");
        return string == null ? "" : string;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sBJ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) sBJ.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_FORM_ID", str), C56390yDp.OLrzqt("ARG_FIELD_ID", str2), C56390yDp.OLrzqt("ARG_STATUS_FIELD_ID", str3)));
            return intent;
        }
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public android.view.View AkhnZx() {
        android.view.View root = AEQbTJ().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public void initFrameContent(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        OKSupportBaseActivity.setErrorRetryClickListener$default(this, 0, new Function0() { // from class: o.sBQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return sBJ.DbNXlk(this.EZpvd);
            }
        }, 1, null);
        getSupportFragmentManager().setFragmentResultListener("KEY_FRAGMENT_ACTIONS", this, new FragmentResultListener() { // from class: o.sBT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                sBJ.AEQbTJ(this.OLrzqt, str, bundle);
            }
        });
        AEQbTJ((AbstractC32996moC) sCA.Companion.KWHzl(), false);
        valueOf();
    }

    public static final Unit DbNXlk(sBJ sbj) {
        sbj.KWHzl();
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(sBJ sbj, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        sbj.EZpvd(bundle);
    }

    private final void valueOf() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new UploadLogActivity$initViewModel$1(this, null), 3, null);
        djBIcL().KWHzl().observe(this, new C32991mny(new Function1() { // from class: o.sBM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sBJ.AEQbTJ((java.lang.String) obj);
            }
        }));
        KWHzl();
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55326xho.toastWithFailedIcon$default(str, 0, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void EZpvd(android.os.Bundle bundle) {
        if (bundle.containsKey("KEY_SELECT_ATTACHMENT")) {
            this.gEmmrt.EZpvd();
        } else if (bundle.containsKey("KEY_RESULT_SHOWN")) {
            AEQbTJ().KWHzl.postDelayed(new java.lang.Runnable() { // from class: o.sBN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    sBJ.AkhnZx(this.KWHzl);
                }
            }, 500L);
        }
    }

    public static final void AkhnZx(sBJ sbj) {
        sbj.KWHzl("");
    }

    public final void KWHzl() {
        djBIcL().OLrzqt(EZpvd(), AhwBna(), gEmmrt());
    }

    public static /* synthetic */ void replaceFragment$default(sBJ sbj, AbstractC32996moC abstractC32996moC, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        sbj.AEQbTJ(abstractC32996moC, z);
    }

    public final void AEQbTJ(AbstractC32996moC abstractC32996moC, boolean z) {
        C33570myu.copydefault((android.app.Activity) this);
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        if (z) {
            fragmentTransactionBeginTransaction.setCustomAnimations(C52761wXj.Application.AkhnZx, C52761wXj.Application.fetchVPNInfo);
        }
        fragmentTransactionBeginTransaction.replace(C47315tni.TaskDescription.dvKsVJ, abstractC32996moC, abstractC32996moC.getTAG());
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    @Override // o.sBK, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.sBK, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.sBK, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.sBK, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // o.sBK, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
