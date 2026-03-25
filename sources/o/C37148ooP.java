package o;

import android.os.PowerManager;
import android.view.WindowManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ooP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37148ooP {
    public PowerManager.WakeLock AEQbTJ;
    public final android.content.Context OLrzqt;

    public C37148ooP(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = context;
    }

    public final android.os.PowerManager OLrzqt() {
        java.lang.Object systemService = this.OLrzqt.getSystemService("power");
        Intrinsics.copydefault(systemService, "");
        return (android.os.PowerManager) systemService;
    }

    public final android.app.KeyguardManager EZpvd() {
        java.lang.Object systemService = this.OLrzqt.getSystemService("keyguard");
        Intrinsics.copydefault(systemService, "");
        return (android.app.KeyguardManager) systemService;
    }

    public final void copydefault() {
        C44124sEe.imLogVoiceCall$default("ScreenWakeHelper: wakeScreenForIncomingCall", null, 2, null);
        KWHzl();
        PowerManager.WakeLock wakeLockNewWakeLock = OLrzqt().newWakeLock(805306378, "okex_okim:incoming_call_wake");
        wakeLockNewWakeLock.acquire(30000L);
        this.AEQbTJ = wakeLockNewWakeLock;
        C44124sEe.imLogVoiceCall$default("ScreenWakeHelper: screen wake lock acquired", null, 2, null);
    }

    public final void KWHzl() {
        PowerManager.WakeLock wakeLock = this.AEQbTJ;
        if (wakeLock != null && wakeLock.isHeld()) {
            wakeLock.release();
            C44124sEe.imLogVoiceCall$default("ScreenWakeHelper: wake lock released", null, 2, null);
        }
        this.AEQbTJ = null;
    }

    public final void AEQbTJ(@NotNull WindowManager.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(layoutParams, "");
        layoutParams.flags |= 6815872;
        C44124sEe.imLogVoiceCall$default("ScreenWakeHelper: lock screen flags applied", null, 2, null);
    }

    public final boolean AEQbTJ() {
        return EZpvd().isKeyguardLocked();
    }
}
