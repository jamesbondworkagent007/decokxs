package o;

import android.os.Build;
import android.view.View;
import android.widget.CompoundButton;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentResultListener;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.UpdateInfoInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.UpdateInfoSource;
import com.okinc.business.defi.wallet.passkey.common.bean.InternalUpdateInfoResult;
import com.okinc.components.track.TrackChannel;
import com.okinc.okuser.data.User;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.fMM;
import o.fMR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fMF extends AbstractActivityC33041mov {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final ActivityResultLauncher<java.lang.String> copydefault;

    public fMF() {
        ActivityResultLauncher<java.lang.String> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new fMM.StateListAnimator(), new ActivityResultCallback() { // from class: o.fME
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                fMF.AEQbTJ(this.copydefault, (java.lang.Boolean) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.copydefault = activityResultLauncherRegisterForActivityResult;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fMF.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) fMF.class);
            intent.putExtra("extra_chain_index", str);
            context.startActivity(intent);
        }
    }

    public static final void AEQbTJ(fMF fmf, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        fmf.finish();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.okinc.okuser.data.UserInfo info;
        if (bundle != null) {
            bundle.clear();
        }
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        final C16254egU c16254egUEZpvd = C16254egU.EZpvd(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c16254egUEZpvd, "");
        setContentView(c16254egUEZpvd.getRoot());
        fMR.Application application = fMR.Companion;
        UpdateInfoSource updateInfoSource = UpdateInfoSource.ADD_PASSKEY;
        java.lang.String stringExtra = getIntent().getStringExtra("extra_chain_index");
        if (stringExtra == null) {
            stringExtra = "";
        }
        fMR fmrAEQbTJ = application.AEQbTJ(new UpdateInfoInput(updateInfoSource, stringExtra), false, false);
        getSupportFragmentManager().setFragmentResultListener("UpdateInfoFragmentRequestKey", this, new FragmentResultListener() { // from class: o.fMD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                fMF.EZpvd(c16254egUEZpvd, this, str, bundle2);
            }
        });
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        java.lang.String realEmail = null;
        fragmentTransactionBeginTransaction.add(fmrAEQbTJ, (java.lang.String) null);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        android.widget.TextView textView = c16254egUEZpvd.gEmmrt;
        User userOLrzqt = ((InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class)).OLrzqt();
        if (userOLrzqt != null && (info = userOLrzqt.getInfo()) != null) {
            realEmail = info.getRealEmail();
        }
        textView.setText(realEmail);
        c16254egUEZpvd.copydefault.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.fMH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                fMF.KWHzl(c16254egUEZpvd, compoundButton, z);
            }
        });
        C52794wYp c52794wYp = c16254egUEZpvd.EZpvd;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
        C52794wYp c52794wYp2 = c16254egUEZpvd.AEQbTJ;
        c52794wYp2.setOnClickListener(new Application(c52794wYp2, 1000L, c16254egUEZpvd, fmrAEQbTJ));
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fMG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                fMF.KWHzl(this.AEQbTJ);
            }
        });
    }

    public static final void KWHzl(C16254egU c16254egU, android.widget.CompoundButton compoundButton, boolean z) {
        c16254egU.AEQbTJ.setEnabled(z);
    }

    public static final void KWHzl(fMF fmf) {
        rVN.reportFullyDrawn$default((android.app.Activity) fmf, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void EZpvd(C16254egU c16254egU, fMF fmf, java.lang.String str, android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (android.os.Parcelable) bundle.getParcelable("UpdateInfoFragmentResultKey", InternalUpdateInfoResult.class);
        } else {
            parcelable = bundle.getParcelable("UpdateInfoFragmentResultKey");
        }
        InternalUpdateInfoResult internalUpdateInfoResult = (InternalUpdateInfoResult) parcelable;
        if (internalUpdateInfoResult == null) {
            return;
        }
        if (internalUpdateInfoResult instanceof InternalUpdateInfoResult.Success) {
            c16254egU.AEQbTJ.fIwbmz();
            fmf.copydefault.launch(((InternalUpdateInfoResult.Success) internalUpdateInfoResult).OLrzqt());
            return;
        }
        if (internalUpdateInfoResult instanceof InternalUpdateInfoResult.Failed) {
            c16254egU.AEQbTJ.fIwbmz();
            java.lang.String strEZpvd = ((InternalUpdateInfoResult.Failed) internalUpdateInfoResult).EZpvd();
            if (strEZpvd != null) {
                C55326xho.toastWithFailedIcon$default(strEZpvd, 0, 1, (java.lang.Object) null);
                return;
            }
            return;
        }
        if (Intrinsics.EZpvd(internalUpdateInfoResult, InternalUpdateInfoResult.Cancelled.AEQbTJ)) {
            c16254egU.AEQbTJ.fIwbmz();
        } else {
            if (!Intrinsics.EZpvd(internalUpdateInfoResult, InternalUpdateInfoResult.EmailRecovery.EZpvd)) {
                throw new NoWhenBranchMatchedException();
            }
            c16254egU.AEQbTJ.fIwbmz();
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ fMF KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, fMF fmf) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = fmf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.finish();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C16254egU EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ fMR OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C16254egU c16254egU, fMR fmr) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = c16254egU;
            this.OLrzqt = fmr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.AEQbTJ.OLrzqt(0L);
                this.OLrzqt.AEQbTJ();
                C32866mlf.onEvent$default("Wallet_PasskeyAdd_Confirm_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            }
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
