package o;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.os.BundleKt;
import com.okinc.business.defi.wallet.hardware.bluetooth.HardwareWalletBluetoothDelegate;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.eGU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eGQ extends eCI {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final ActivityResultLauncher<java.lang.Integer> AEQbTJ;

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eGQ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void copydefault(@NotNull android.content.Context context, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) eGQ.class);
            intent.putExtra(OtcExtraKeys.MODE, i);
            context.startActivity(intent);
        }
    }

    public eGQ() {
        ActivityResultLauncher<java.lang.Integer> activityResultLauncherRegisterForActivityResult = registerForActivityResult(eGU.TaskDescription.copydefault, new ActivityResultCallback() { // from class: o.eGP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                eGQ.AEQbTJ(this.KWHzl, (java.lang.Boolean) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AEQbTJ = activityResultLauncherRegisterForActivityResult;
    }

    private final int EZpvd() {
        android.content.Intent intent = getIntent();
        if (intent != null) {
            return intent.getIntExtra(OtcExtraKeys.MODE, 1);
        }
        return 1;
    }

    public static final void AEQbTJ(eGQ egq, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            egq.finish();
        }
    }

    @Override // o.eCI
    public eFN KWHzl() {
        return new eFN("images/web3_wallet/onekey_introduction.png", C33069mpW.copydefault(C13754dXa.FragmentManager.DTeKQX, C56423yEv.EZpvd(C56390yDp.OLrzqt("hardwarename", C33070mpX.AYXKKw(C13754dXa.FragmentManager.sendBehavioSecData)))), true, yDY.AhwBna(new eFL(C13754dXa.Activity.gGvvIC, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getCustomAction), null, 4, null)));
    }

    @Override // o.eCI
    public void copydefault(@NotNull eFL efl) {
        Intrinsics.checkNotNullParameter(efl, "");
        super.copydefault(efl);
        HardwareWalletBluetoothDelegate hardwareWalletBluetoothDelegate = new HardwareWalletBluetoothDelegate();
        getLifecycle().addObserver(hardwareWalletBluetoothDelegate);
        hardwareWalletBluetoothDelegate.EZpvd(this, new Function0() { // from class: o.eGR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eGQ.copydefault(this.OLrzqt);
            }
        }, new Function0() { // from class: o.eGS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eGQ.AEQbTJ(this.EZpvd);
            }
        });
    }

    public static final Unit copydefault(eGQ egq) {
        egq.AEQbTJ.launch(java.lang.Integer.valueOf(egq.EZpvd()));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(eGQ egq) {
        egq.finish();
        return Unit.INSTANCE;
    }

    @Override // o.eCI
    public void AEQbTJ() {
        super.AEQbTJ();
        copydefault(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaItem));
    }

    private final void copydefault(java.lang.String str) {
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, this, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
    }

    @Override // o.eCI, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.eCI, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.eCI, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.eCI, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // o.eCI, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
