package o;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.autofill.HintConstants;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC8104awT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fIm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC17523fIm extends AbstractActivityC33013moT {
    public final ActivityResultLauncher<android.content.Intent> EZpvd;
    public int KWHzl;
    public final InterfaceC56387yDm copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;
    public java.lang.String AhwBna = "";
    public final C58216yxB OLrzqt = new C58216yxB();

    /* JADX INFO: renamed from: o.fIm$Activity */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58216yxB OLrzqt() {
        return this.OLrzqt;
    }

    public ActivityC17523fIm() {
        final Function0 function0 = null;
        this.copydefault = new ViewModelLazy(C56524yIo.AEQbTJ(fIG.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.mpc.RestoreMpcActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.mpc.RestoreMpcActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.mpc.RestoreMpcActivity$special$$inlined$viewModels$default$3
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
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.fIw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC17523fIm.OLrzqt(this.EZpvd, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.EZpvd = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: renamed from: o.fIm$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fIm.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ void start$default(ActionBar actionBar, android.content.Context context, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                str = "";
            }
            if ((i2 & 4) != 0) {
                i = 0;
            }
            actionBar.AEQbTJ(context, str, i);
        }

        public final void AEQbTJ(@NotNull android.content.Context context, java.lang.String str, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC17523fIm.class);
            intent.putExtra(HintConstants.AUTOFILL_HINT_PASSWORD, str);
            intent.putExtra("type", i);
            context.startActivity(intent);
        }
    }

    public final fIG valueOf() {
        return (fIG) this.copydefault.getValue();
    }

    public static final void OLrzqt(ActivityC17523fIm activityC17523fIm, ActivityResult activityResult) {
        if (activityResult.getResultCode() == 1) {
            activityC17523fIm.finish();
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C13754dXa.TaskDescription.QSBOWP);
        java.lang.String stringExtra = getIntent().getStringExtra(HintConstants.AUTOFILL_HINT_PASSWORD);
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.AhwBna = stringExtra;
        final int intExtra = getIntent().getIntExtra("type", 0);
        C32866mlf.onEvent$default("Web3MPC_WalletRestore_Page_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        androidx.fragment.app.Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(C13754dXa.ActionBar.HJWChPRAkuRW);
        Intrinsics.copydefault(fragmentFindFragmentById, "");
        fIC fic = (fIC) fragmentFindFragmentById;
        fic.AEQbTJ(0);
        fic.copydefault(0);
        fic.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.IntegerRes));
        dZP dzp = dZP.OLrzqt;
        java.lang.String strAhwBna = dzp.AhwBna();
        java.lang.String strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.RawRes, C56423yEv.EZpvd(C56390yDp.OLrzqt("acctaddress", strAhwBna)));
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(strCopydefault);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fbC)), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, strAhwBna, 0, false, 6, (java.lang.Object) null), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strCopydefault, strAhwBna, 0, false, 6, (java.lang.Object) null) + strAhwBna.length(), 33);
        fic.AEQbTJ(spannableStringBuilder);
        fic.KWHzl(C14392dkb.AEQbTJ.copydefault(this));
        fic.KWHzl(new Function0() { // from class: o.fIx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC17523fIm.OLrzqt(this.OLrzqt, intExtra);
            }
        });
        fic.EZpvd(new Function0() { // from class: o.fIA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC17523fIm.AEQbTJ(this.EZpvd, intExtra);
            }
        });
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fIy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC17523fIm.copydefault(this.KWHzl);
            }
        });
        if (intExtra == 1) {
            eRI.OLrzqt.OLrzqt(this, dzp.AhwBna(), new Function2() { // from class: o.fIr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return ActivityC17523fIm.EZpvd(this.EZpvd, (android.view.View) obj, (ViewOnClickListenerC54939xaY) obj2);
                }
            });
        }
        valueOf().copydefault().observe(this, new Activity(new Function1() { // from class: o.fIv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17523fIm.AEQbTJ(this.OLrzqt, intExtra, (java.lang.Integer) obj);
            }
        }));
    }

    public static final Unit OLrzqt(final ActivityC17523fIm activityC17523fIm, final int i) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) activityC17523fIm.AhwBna)) {
            activityC17523fIm.AEQbTJ(i);
        } else {
            androidx.fragment.app.FragmentManager supportFragmentManager = activityC17523fIm.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            new C14469dlz(supportFragmentManager, activityC17523fIm, null, null, new Function1() { // from class: o.fIq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC17523fIm.EZpvd(this.AEQbTJ, i, (java.lang.String) obj);
                }
            }, new Function0() { // from class: o.fIp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC17523fIm.KWHzl();
                }
            }, null, null, 200, null).EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC17523fIm activityC17523fIm, int i, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC17523fIm.AhwBna = str;
        activityC17523fIm.AEQbTJ(i);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(final ActivityC17523fIm activityC17523fIm, final int i) {
        C32866mlf.onEvent$default("Web3ImportMPCWallet_Btm_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.fIt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17523fIm.OLrzqt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) activityC17523fIm.AhwBna)) {
            androidx.fragment.app.FragmentManager supportFragmentManager = activityC17523fIm.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("from", "restore_mpc");
            bundle.putInt(OtcExtraKeys.MODE, 1);
            Unit unit = Unit.INSTANCE;
            new C14469dlz(supportFragmentManager, activityC17523fIm, bundle, null, new Function1() { // from class: o.fIu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC17523fIm.copydefault(i, activityC17523fIm, (java.lang.String) obj);
                }
            }, new Function0() { // from class: o.fIs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC17523fIm.AEQbTJ();
                }
            }, null, null, 200, null).EZpvd();
        } else if (i != 2) {
            ActivityC18845fqB.Companion.copydefault(activityC17523fIm, activityC17523fIm.AhwBna, i != 2);
        } else {
            activityC17523fIm.EZpvd.launch(ActivityC18845fqB.Companion.KWHzl(activityC17523fIm, activityC17523fIm.AhwBna, i != 2));
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("scan", "1", false));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(int i, ActivityC17523fIm activityC17523fIm, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (i != 2) {
            ActivityC18845fqB.Companion.copydefault(activityC17523fIm, str, i != 2);
        } else {
            activityC17523fIm.EZpvd.launch(ActivityC18845fqB.Companion.KWHzl(activityC17523fIm, str, i != 2));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ() {
        return Unit.INSTANCE;
    }

    public static final void copydefault(ActivityC17523fIm activityC17523fIm) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC17523fIm, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit EZpvd(ActivityC17523fIm activityC17523fIm, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        activityC17523fIm.finish();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC17523fIm activityC17523fIm, int i, java.lang.Integer num) {
        activityC17523fIm.dismissLoading();
        if ((num != null && num.intValue() == 0) || ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 2))) {
            final java.lang.String str = (num != null && num.intValue() == 1) ? MTPushConstants.Manufacturer.HUAWEI : (num != null && num.intValue() == 2) ? "google" : "unknow";
            C32866mlf.onEvent$default("Web3MPC_WalletRestoreCloud_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.fIz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC17523fIm.copydefault(str, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            C14606dod c14606dodEZpvd = C14606dod.Companion.EZpvd(activityC17523fIm.AhwBna, num.intValue(), i != 2);
            androidx.fragment.app.FragmentManager supportFragmentManager = activityC17523fIm.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c14606dodEZpvd.show(supportFragmentManager, "RestoreMpcActivity");
        } else {
            C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.OptIn), 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("cloud_service", str, false));
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(int i) {
        if (C14392dkb.AEQbTJ.OLrzqt()) {
            C14606dod c14606dodEZpvd = C14606dod.Companion.EZpvd(this.AhwBna, 1, i != 2);
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c14606dodEZpvd.show(supportFragmentManager, "RestoreMpcActivity");
            return;
        }
        showLoadingAtOnceCannotCancel();
        java.lang.String strEZpvd = dZP.OLrzqt.EZpvd();
        if (strEZpvd.length() == 0) {
            InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class);
            if (interfaceC8104awT != null) {
                InterfaceC8104awT.StateListAnimator.routeLoginFromMpcWallet$default(interfaceC8104awT, this, null, null, null, null, null, 48, null);
                return;
            }
            return;
        }
        valueOf().OLrzqt(strEZpvd);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == 1) {
            finish();
        }
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.KWHzl == 1) {
            return;
        }
        super.onBackPressed();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.OLrzqt.OLrzqt();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
