package o;

import android.os.Build;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C57026yae;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57026yae {
    public static final C57026yae copydefault = new C57026yae();

    private C57026yae() {
    }

    public final boolean copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.bluetooth.BluetoothManager bluetoothManager = (android.bluetooth.BluetoothManager) context.getSystemService("bluetooth");
        return (bluetoothManager != null ? bluetoothManager.getAdapter() : null) != null;
    }

    public final boolean EZpvd(@NotNull android.content.Context context) {
        android.bluetooth.BluetoothAdapter adapter;
        Intrinsics.checkNotNullParameter(context, "");
        android.bluetooth.BluetoothManager bluetoothManager = (android.bluetooth.BluetoothManager) context.getSystemService("bluetooth");
        return (bluetoothManager == null || (adapter = bluetoothManager.getAdapter()) == null || adapter.getState() != 12) ? false : true;
    }

    public final void OLrzqt(@NotNull FragmentActivity fragmentActivity, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        android.bluetooth.BluetoothManager bluetoothManager = (android.bluetooth.BluetoothManager) fragmentActivity.getSystemService("bluetooth");
        android.bluetooth.BluetoothAdapter adapter = bluetoothManager != null ? bluetoothManager.getAdapter() : null;
        if (adapter == null) {
            function02.invoke();
            return;
        }
        if (adapter.getState() == 12) {
            function0.invoke();
            return;
        }
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
        Activity activity = new Activity();
        activity.EZpvd(function0, function02);
        fragmentTransactionBeginTransaction.add(activity, (java.lang.String) null).commitAllowingStateLoss();
    }

    public final boolean OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return Build.VERSION.SDK_INT < 31 ? ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0 && ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0 : ContextCompat.checkSelfPermission(context, "android.permission.BLUETOOTH_SCAN") == 0 && ContextCompat.checkSelfPermission(context, "android.permission.BLUETOOTH_CONNECT") == 0;
    }

    public final void AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        if (OLrzqt(fragmentActivity)) {
            function0.invoke();
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 && ActivityCompat.shouldShowRequestPermissionRationale(fragmentActivity, "android.permission.BLUETOOTH_SCAN")) {
            function02.invoke();
            return;
        }
        if (i >= 29 && ActivityCompat.shouldShowRequestPermissionRationale(fragmentActivity, "android.permission.ACCESS_FINE_LOCATION")) {
            function02.invoke();
            return;
        }
        if (ActivityCompat.shouldShowRequestPermissionRationale(fragmentActivity, "android.permission.ACCESS_COARSE_LOCATION")) {
            function02.invoke();
            return;
        }
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.KWHzl(function0, function02);
        fragmentTransactionBeginTransaction.add(stateListAnimator, (java.lang.String) null).commitAllowingStateLoss();
    }

    /* JADX INFO: renamed from: o.yae$Activity */
    public static final class Activity extends androidx.fragment.app.Fragment {
        public Function0<Unit> AEQbTJ;
        public Function0<Unit> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            this.EZpvd = function0;
            this.AEQbTJ = function02;
        }

        @Override // androidx.fragment.app.Fragment
        public void onCreate(android.os.Bundle bundle) {
            super.onCreate(bundle);
            if (bundle != null) {
                getParentFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
            } else {
                registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.yac
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void onActivityResult(java.lang.Object obj) {
                        C57026yae.Activity.AEQbTJ(this.KWHzl, (ActivityResult) obj);
                    }
                }).launch(new android.content.Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
            }
        }

        public static final void AEQbTJ(Activity activity, ActivityResult activityResult) {
            Function0<Unit> function0 = null;
            if (activityResult.getResultCode() == -1) {
                Function0<Unit> function02 = activity.EZpvd;
                if (function02 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    function0 = function02;
                }
                function0.invoke();
            } else {
                Function0<Unit> function03 = activity.AEQbTJ;
                if (function03 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    function0 = function03;
                }
                function0.invoke();
            }
            activity.getParentFragmentManager().beginTransaction().remove(activity).commitAllowingStateLoss();
        }
    }

    /* JADX INFO: renamed from: o.yae$StateListAnimator */
    public static final class StateListAnimator extends androidx.fragment.app.Fragment {
        public Function0<Unit> AEQbTJ;
        public Function0<Unit> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(@NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            this.AEQbTJ = function0;
            this.OLrzqt = function02;
        }

        @Override // androidx.fragment.app.Fragment
        public void onCreate(android.os.Bundle bundle) {
            super.onCreate(bundle);
            if (bundle != null) {
                getParentFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
            } else if (Build.VERSION.SDK_INT >= 31) {
                registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback() { // from class: o.yaf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void onActivityResult(java.lang.Object obj) {
                        C57026yae.StateListAnimator.KWHzl(this.EZpvd, (java.util.Map) obj);
                    }
                }).launch(new java.lang.String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"});
            } else {
                registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback() { // from class: o.yal
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void onActivityResult(java.lang.Object obj) {
                        C57026yae.StateListAnimator.copydefault(this.EZpvd, (java.util.Map) obj);
                    }
                }).launch(new java.lang.String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"});
            }
        }

        public static final void KWHzl(StateListAnimator stateListAnimator, java.util.Map map) {
            java.lang.Object obj = map.get("android.permission.BLUETOOTH_SCAN");
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            Function0<Unit> function0 = null;
            if (Intrinsics.EZpvd(obj, bool) && Intrinsics.EZpvd(map.get("android.permission.BLUETOOTH_CONNECT"), bool)) {
                Function0<Unit> function02 = stateListAnimator.AEQbTJ;
                if (function02 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    function0 = function02;
                }
                function0.invoke();
            } else {
                Function0<Unit> function03 = stateListAnimator.OLrzqt;
                if (function03 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    function0 = function03;
                }
                function0.invoke();
            }
            stateListAnimator.getParentFragmentManager().beginTransaction().remove(stateListAnimator).commitAllowingStateLoss();
        }

        public static final void copydefault(StateListAnimator stateListAnimator, java.util.Map map) {
            java.lang.Object obj = map.get("android.permission.ACCESS_COARSE_LOCATION");
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            Function0<Unit> function0 = null;
            if (Intrinsics.EZpvd(obj, bool) && Intrinsics.EZpvd(map.get("android.permission.ACCESS_FINE_LOCATION"), bool)) {
                Function0<Unit> function02 = stateListAnimator.AEQbTJ;
                if (function02 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    function0 = function02;
                }
                function0.invoke();
            } else {
                Function0<Unit> function03 = stateListAnimator.OLrzqt;
                if (function03 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    function0 = function03;
                }
                function0.invoke();
            }
            stateListAnimator.getParentFragmentManager().beginTransaction().remove(stateListAnimator).commitAllowingStateLoss();
        }
    }
}
