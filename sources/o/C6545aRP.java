package o;

import android.content.DialogInterface;
import android.os.Build;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aRP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6545aRP {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final ComponentActivity AEQbTJ;
    public final Function0<Unit> KWHzl;
    public final ActivityResultLauncher<android.content.Intent> OLrzqt;
    public final ActivityResultLauncher<android.content.Intent> copydefault;
    public final ActivityResultLauncher<java.lang.String[]> djBIcL;
    public final Function0<Unit> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String[] copydefault() {
        return Build.VERSION.SDK_INT >= 31 ? new java.lang.String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_ADVERTISE", "android.permission.BLUETOOTH_CONNECT"} : new java.lang.String[]{"android.permission.ACCESS_FINE_LOCATION"};
    }

    public C6545aRP(@NotNull ComponentActivity componentActivity, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(componentActivity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        this.AEQbTJ = componentActivity;
        this.valueOf = function0;
        this.KWHzl = function02;
        ActivityResultLauncher<java.lang.String[]> activityResultLauncherRegisterForActivityResult = componentActivity.registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback() { // from class: o.aRQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C6545aRP.AEQbTJ(this.OLrzqt, (java.util.Map) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.djBIcL = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult2 = componentActivity.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.aRM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C6545aRP.OLrzqt(this.copydefault, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.copydefault = activityResultLauncherRegisterForActivityResult2;
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult3 = componentActivity.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.aRN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C6545aRP.copydefault(this.EZpvd, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult3, "");
        this.OLrzqt = activityResultLauncherRegisterForActivityResult3;
    }

    /* JADX INFO: renamed from: o.aRP$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aRP.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static final void AEQbTJ(final C6545aRP c6545aRP, java.util.Map map) {
        for (java.lang.String str : c6545aRP.copydefault()) {
            if (!Intrinsics.EZpvd(map.get(str), java.lang.Boolean.TRUE)) {
                final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(c6545aRP.AEQbTJ);
                viewOnClickListenerC54939xaY.setTitle("grant permission to Bluetooth");
                viewOnClickListenerC54939xaY.EZpvd("make sure Bluetooth permission is granted for this device and try again.");
                viewOnClickListenerC54939xaY.AEQbTJ("later", new View.OnClickListener() { // from class: o.aRS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C6545aRP.copydefault(viewOnClickListenerC54939xaY, view);
                    }
                });
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C8206ayP.Dialog.QKVWgx), new View.OnClickListener() { // from class: o.aRT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C6545aRP.EZpvd(this.AEQbTJ, viewOnClickListenerC54939xaY, view);
                    }
                });
                viewOnClickListenerC54939xaY.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.aRY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(android.content.DialogInterface dialogInterface) {
                        C6545aRP.KWHzl(this.copydefault, dialogInterface);
                    }
                });
                viewOnClickListenerC54939xaY.show();
                return;
            }
        }
        c6545aRP.OLrzqt();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void EZpvd(C6545aRP c6545aRP, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        c6545aRP.KWHzl();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void KWHzl(C6545aRP c6545aRP, android.content.DialogInterface dialogInterface) {
        c6545aRP.KWHzl.invoke();
    }

    public static final void OLrzqt(C6545aRP c6545aRP, ActivityResult activityResult) {
        c6545aRP.AEQbTJ();
    }

    public static final void copydefault(final C6545aRP c6545aRP, ActivityResult activityResult) {
        if (c6545aRP.EZpvd()) {
            c6545aRP.valueOf.invoke();
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(c6545aRP.AEQbTJ);
        viewOnClickListenerC54939xaY.setTitle("enable bluetooth");
        viewOnClickListenerC54939xaY.EZpvd("Make sure Bluetooth is turned on and try again.");
        viewOnClickListenerC54939xaY.AEQbTJ("later", new View.OnClickListener() { // from class: o.aRU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C6545aRP.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C8206ayP.Dialog.QKVWgx), new View.OnClickListener() { // from class: o.aRV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C6545aRP.KWHzl(this.EZpvd, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.aRR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                C6545aRP.EZpvd(this.KWHzl, dialogInterface);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void KWHzl(C6545aRP c6545aRP, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        c6545aRP.gEmmrt();
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void EZpvd(C6545aRP c6545aRP, android.content.DialogInterface dialogInterface) {
        c6545aRP.KWHzl.invoke();
    }

    public final void AEQbTJ() {
        for (java.lang.String str : copydefault()) {
            if (ContextCompat.checkSelfPermission(this.AEQbTJ, str) != 0) {
                this.djBIcL.launch(copydefault());
                return;
            }
        }
        OLrzqt();
    }

    public final void OLrzqt() {
        if (EZpvd()) {
            this.valueOf.invoke();
        } else {
            this.OLrzqt.launch(new android.content.Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
        }
    }

    public final boolean EZpvd() {
        java.lang.Object systemService = this.AEQbTJ.getSystemService("bluetooth");
        android.bluetooth.BluetoothManager bluetoothManager = systemService instanceof android.bluetooth.BluetoothManager ? (android.bluetooth.BluetoothManager) systemService : null;
        android.bluetooth.BluetoothAdapter adapter = bluetoothManager != null ? bluetoothManager.getAdapter() : null;
        if (adapter == null) {
            pUU.copydefault("BluetoothPermissionHelper", "Bluetooth adapter not available");
            return false;
        }
        return adapter.isEnabled();
    }

    public final void KWHzl() {
        android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(android.net.Uri.fromParts("package", this.AEQbTJ.getPackageName(), null));
        this.copydefault.launch(intent);
    }

    public final void gEmmrt() {
        this.copydefault.launch(new android.content.Intent("android.settings.BLUETOOTH_SETTINGS"));
    }
}
