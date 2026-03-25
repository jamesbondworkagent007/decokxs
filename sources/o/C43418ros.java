package o;

import com.okinc.core.util.SPUtils;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ros, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43418ros implements InterfaceC32978mnl {
    public static final int AEQbTJ;
    public static final java.lang.String AhwBna;
    public static final ReentrantReadWriteLock EZpvd;
    public static boolean KWHzl;
    public static final C43418ros OLrzqt = new C43418ros();
    public static boolean copydefault;
    public static StateListAnimator gEmmrt;

    /* JADX INFO: renamed from: o.ros$StateListAnimator */
    public interface StateListAnimator {
        void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateListAnimator KWHzl() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReentrantReadWriteLock OLrzqt() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return AhwBna;
    }

    private C43418ros() {
    }

    static {
        java.lang.String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        AhwBna = string;
        EZpvd = new ReentrantReadWriteLock();
        AEQbTJ = 8;
    }

    public static /* synthetic */ void init$default(C43418ros c43418ros, android.app.Application application, boolean z, StateListAnimator stateListAnimator, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            stateListAnimator = null;
        }
        c43418ros.OLrzqt(application, z, stateListAnimator);
    }

    public final void OLrzqt(@NotNull android.app.Application application, boolean z, StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(application, "");
        pUU.KWHzl("PushOptimization", "attachBaseContext pushOptimizationHit " + z);
        gEmmrt = stateListAnimator;
        KWHzl = SPUtils.getBoolean("sp_pull_main_running_key", false, "sp_push_process_file_name");
        application.deleteSharedPreferences("sp_push_process_file_name");
        if (KWHzl) {
            if (z) {
                EZpvd.writeLock().lock();
            }
            pUU.KWHzl("PushOptimization", "push process pull");
            return;
        }
        pUU.KWHzl("PushOptimization", "not push process pull");
    }

    @Override // o.InterfaceC32978mnl
    public void AEQbTJ() {
        pUU.KWHzl("PushOptimization", "OnActivityLaunch");
        if (copydefault) {
            return;
        }
        copydefault = true;
        if (KWHzl) {
            ReentrantReadWriteLock reentrantReadWriteLock = EZpvd;
            if (reentrantReadWriteLock.writeLock().isHeldByCurrentThread()) {
                reentrantReadWriteLock.writeLock().unlock();
            }
        }
        if (EZpvd.isWriteLocked()) {
            pUU.copydefault("PushOptimization", "OnActivityLaunch writeLocked");
            StateListAnimator stateListAnimator = gEmmrt;
            if (stateListAnimator != null) {
                stateListAnimator.copydefault("", "", "", java.lang.String.valueOf(AhwBna), "locked");
            }
        }
    }

    public void EZpvd(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        pUU.KWHzl("PushOptimization", "OnActivityCreated " + activity.getClass().getSimpleName());
        if (copydefault) {
            return;
        }
        copydefault = true;
        if (KWHzl) {
            ReentrantReadWriteLock reentrantReadWriteLock = EZpvd;
            if (reentrantReadWriteLock.writeLock().isHeldByCurrentThread()) {
                reentrantReadWriteLock.writeLock().unlock();
            }
        }
        if (EZpvd.isWriteLocked()) {
            pUU.copydefault("PushOptimization", "OnActivityCreated writeLocked");
            StateListAnimator stateListAnimator = gEmmrt;
            if (stateListAnimator != null) {
                stateListAnimator.copydefault("", "", "", java.lang.String.valueOf(AhwBna), "locked");
            }
        }
    }
}
