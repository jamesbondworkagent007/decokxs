package com.okinc.business.defi.wallet.hardware.bluetooth;

import android.app.Dialog;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.defi.wallet.hardware.bluetooth.HardwareWalletBluetoothDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C57026yae;
import o.eCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class HardwareWalletBluetoothDelegate implements DefaultLifecycleObserver {
    public Dialog AEQbTJ;
    public Dialog KWHzl;

    public static final Unit AEQbTJ() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.hardware.bluetooth.HardwareWalletBluetoothDelegate */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleBluetoothConnection$default(HardwareWalletBluetoothDelegate hardwareWalletBluetoothDelegate, FragmentActivity fragmentActivity, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: o.eFY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return HardwareWalletBluetoothDelegate.AEQbTJ();
                }
            };
        }
        if ((i & 4) != 0) {
            function02 = new Function0() { // from class: o.eFX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return HardwareWalletBluetoothDelegate.EZpvd();
                }
            };
        }
        hardwareWalletBluetoothDelegate.EZpvd(fragmentActivity, function0, function02);
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull final FragmentActivity fragmentActivity, @NotNull final Function0<Unit> function0, @NotNull final Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        C57026yae.copydefault.AEQbTJ(fragmentActivity, new Function0() { // from class: o.eFW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return HardwareWalletBluetoothDelegate.OLrzqt(this.EZpvd, fragmentActivity, function0, function02);
            }
        }, new Function0() { // from class: o.eFZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return HardwareWalletBluetoothDelegate.AEQbTJ(this.copydefault, fragmentActivity);
            }
        });
    }

    public static final Unit OLrzqt(HardwareWalletBluetoothDelegate hardwareWalletBluetoothDelegate, FragmentActivity fragmentActivity, Function0 function0, Function0 function02) {
        Dialog dialog = hardwareWalletBluetoothDelegate.AEQbTJ;
        if (dialog != null) {
            dialog.dismiss();
        }
        hardwareWalletBluetoothDelegate.AEQbTJ = null;
        hardwareWalletBluetoothDelegate.OLrzqt(fragmentActivity, function0, function02);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(final HardwareWalletBluetoothDelegate hardwareWalletBluetoothDelegate, FragmentActivity fragmentActivity) {
        if (hardwareWalletBluetoothDelegate.AEQbTJ != null) {
            return Unit.INSTANCE;
        }
        hardwareWalletBluetoothDelegate.AEQbTJ = eCM.KWHzl.copydefault(fragmentActivity, new Function0() { // from class: o.eFR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return HardwareWalletBluetoothDelegate.KWHzl(this.copydefault);
            }
        }, new Function0() { // from class: o.eFS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return HardwareWalletBluetoothDelegate.AEQbTJ(this.AEQbTJ);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(HardwareWalletBluetoothDelegate hardwareWalletBluetoothDelegate) {
        hardwareWalletBluetoothDelegate.AEQbTJ = null;
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(HardwareWalletBluetoothDelegate hardwareWalletBluetoothDelegate) {
        hardwareWalletBluetoothDelegate.AEQbTJ = null;
        return Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        super.onDestroy(lifecycleOwner);
        Dialog dialog = this.KWHzl;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.KWHzl = null;
        Dialog dialog2 = this.AEQbTJ;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
        this.AEQbTJ = null;
    }

    public final void OLrzqt(final FragmentActivity fragmentActivity, final Function0<Unit> function0, final Function0<Unit> function02) {
        C57026yae.copydefault.OLrzqt(fragmentActivity, new Function0() { // from class: o.eFQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return HardwareWalletBluetoothDelegate.OLrzqt(this.copydefault, function0);
            }
        }, new Function0() { // from class: o.eFU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return HardwareWalletBluetoothDelegate.copydefault(this.AEQbTJ, fragmentActivity, function0, function02);
            }
        });
    }

    public static final Unit OLrzqt(HardwareWalletBluetoothDelegate hardwareWalletBluetoothDelegate, Function0 function0) {
        Dialog dialog = hardwareWalletBluetoothDelegate.KWHzl;
        if (dialog != null) {
            dialog.dismiss();
        }
        hardwareWalletBluetoothDelegate.KWHzl = null;
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(HardwareWalletBluetoothDelegate hardwareWalletBluetoothDelegate, FragmentActivity fragmentActivity, Function0 function0, Function0 function02) {
        hardwareWalletBluetoothDelegate.copydefault(fragmentActivity, function0, function02);
        return Unit.INSTANCE;
    }

    public final void copydefault(final FragmentActivity fragmentActivity, final Function0<Unit> function0, final Function0<Unit> function02) {
        if (this.KWHzl != null) {
            return;
        }
        this.KWHzl = eCM.KWHzl.OLrzqt(fragmentActivity, new Function0() { // from class: o.eFP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return HardwareWalletBluetoothDelegate.gEmmrt(this.AEQbTJ, fragmentActivity, function0, function02);
            }
        }, new Function0() { // from class: o.eFT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return HardwareWalletBluetoothDelegate.copydefault(this.KWHzl, function02);
            }
        });
    }

    public static final Unit gEmmrt(HardwareWalletBluetoothDelegate hardwareWalletBluetoothDelegate, FragmentActivity fragmentActivity, Function0 function0, Function0 function02) {
        hardwareWalletBluetoothDelegate.OLrzqt(fragmentActivity, function0, function02);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(HardwareWalletBluetoothDelegate hardwareWalletBluetoothDelegate, Function0 function0) {
        hardwareWalletBluetoothDelegate.KWHzl = null;
        function0.invoke();
        return Unit.INSTANCE;
    }
}
