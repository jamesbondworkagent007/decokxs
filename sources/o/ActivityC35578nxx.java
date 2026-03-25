package o;

import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.uilab.edit.OKEditText;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC35548nxT;
import o.ActivityC35651nzQ;
import o.C35399nuc;
import o.C37290oqz;
import o.nAD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nxx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ActivityC35578nxx extends AbstractActivityC33044moy<nHT> {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm EZpvd;
    public final ActivityResultLauncher<android.content.Intent> AEQbTJ = C37290oqz.registerForImNewChatActivityResult$default(C37290oqz.copydefault, this, (C37290oqz.StateListAnimator) null, 1, (java.lang.Object) null);
    public final int OLrzqt = C35399nuc.Dialog.gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.OLrzqt;
    }

    public ActivityC35578nxx() {
        final Function0 function0 = null;
        this.EZpvd = new ViewModelLazy(C56524yIo.AEQbTJ(nAD.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.contacts.AddContactByUidNickNameActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.contacts.AddContactByUidNickNameActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.contacts.AddContactByUidNickNameActivity$special$$inlined$viewModels$default$3
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

    public final nAD EZpvd() {
        return (nAD) this.EZpvd.getValue();
    }

    /* JADX INFO: renamed from: o.nxx$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nxx.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC35578nxx.class);
        }
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        OLrzqt();
        copydefault();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.nxC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC35578nxx.EZpvd(this.EZpvd);
            }
        });
    }

    public static final void EZpvd(ActivityC35578nxx activityC35578nxx) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC35578nxx, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void copydefault() {
        final nHT nhtKWHzl = KWHzl();
        nhtKWHzl.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.nxv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC35578nxx.AEQbTJ(this.KWHzl, view);
            }
        });
        OKEditText oKEditText = nhtKWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        C33606mzd.copydefault(oKEditText, this, new Function1() { // from class: o.nxy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC35578nxx.copydefault(this.AEQbTJ, (java.lang.CharSequence) obj);
            }
        });
        nhtKWHzl.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.nxB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC35578nxx.OLrzqt(nhtKWHzl, this, view);
            }
        });
        nhtKWHzl.AEQbTJ.requestFocus();
    }

    public static final void AEQbTJ(ActivityC35578nxx activityC35578nxx, android.view.View view) {
        activityC35578nxx.onBackPressed();
    }

    public static final Unit copydefault(ActivityC35578nxx activityC35578nxx, java.lang.CharSequence charSequence) {
        activityC35578nxx.KWHzl().EZpvd.setEnabled(C33129mqd.OLrzqt(charSequence));
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(nHT nht, ActivityC35578nxx activityC35578nxx, android.view.View view) {
        java.lang.String string;
        android.text.Editable text = nht.AEQbTJ.getText();
        if (text == null || (string = text.toString()) == null) {
            return;
        }
        activityC35578nxx.EZpvd().copydefault(string);
    }

    private final void OLrzqt() {
        EZpvd().AEQbTJ().observe(this, new C32991mny(new Function1() { // from class: o.nxu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC35578nxx.KWHzl(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        EZpvd().KWHzl().observe(this, new C32991mny(new Function1() { // from class: o.nxt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC35578nxx.OLrzqt((java.lang.String) obj);
            }
        }));
        EZpvd().OLrzqt().observe(this, new C32991mny(new Function1() { // from class: o.nxw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC35578nxx.AEQbTJ(this.EZpvd, (nAD.Application) obj);
            }
        }));
    }

    public static final Unit KWHzl(ActivityC35578nxx activityC35578nxx, boolean z) {
        if (z) {
            activityC35578nxx.showLoading();
        } else {
            activityC35578nxx.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55326xho.toastWithFailedIcon$default(str, 0, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC35578nxx activityC35578nxx, nAD.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        activityC35578nxx.EZpvd(application);
        return Unit.INSTANCE;
    }

    public final void EZpvd(nAD.Application application) {
        if (application instanceof nAD.Application.C0887Application) {
            this.AEQbTJ.launch(ActivityC35548nxT.ActionBar.createIntent$default(ActivityC35548nxT.Companion, this, "uid", ((nAD.Application.C0887Application) application).AEQbTJ().getContactsId(), null, false, 16, null));
        } else {
            if (!(application instanceof nAD.Application.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            ActivityC35651nzQ.Activity activity = ActivityC35651nzQ.Companion;
            java.util.ArrayList<RelationInfo> arrayList = new java.util.ArrayList<>(((nAD.Application.ActionBar) application).copydefault());
            android.text.Editable text = KWHzl().AEQbTJ.getText();
            startActivity(activity.OLrzqt(this, arrayList, text != null ? text.toString() : null));
        }
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
