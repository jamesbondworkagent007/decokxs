package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.suQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C45668suQ {
    public final InterfaceC45711svG AEQbTJ;
    public final C45706svB copydefault;

    @yCM
    public C45668suQ(@NotNull InterfaceC45711svG interfaceC45711svG, @NotNull C45706svB c45706svB) {
        Intrinsics.checkNotNullParameter(interfaceC45711svG, "");
        Intrinsics.checkNotNullParameter(c45706svB, "");
        this.AEQbTJ = interfaceC45711svG;
        this.copydefault = c45706svB;
    }

    public final void EZpvd(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        try {
            if (!lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                this.AEQbTJ.AEQbTJ("Lifecycle not ready for navigation refresh");
                return;
            }
            final InterfaceC33215msJ interfaceC33215msJ = lifecycleOwner instanceof InterfaceC33215msJ ? (InterfaceC33215msJ) lifecycleOwner : null;
            if (interfaceC33215msJ == null) {
                this.AEQbTJ.OLrzqt("Owner is not ILiteMainContainerContract");
                return;
            }
            BottomNavigationView bottomNavigationViewKWHzl = interfaceC33215msJ.KWHzl();
            if (bottomNavigationViewKWHzl != null) {
                bottomNavigationViewKWHzl.post(new java.lang.Runnable() { // from class: o.suT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C45668suQ.copydefault(this.OLrzqt, interfaceC33215msJ);
                    }
                });
            } else {
                this.AEQbTJ.OLrzqt("Navigation bar is null");
            }
        } catch (java.lang.Exception e) {
            this.AEQbTJ.OLrzqt("Error in tryRefreshBottomNavigation", e);
        }
    }

    public static final void copydefault(C45668suQ c45668suQ, InterfaceC33215msJ interfaceC33215msJ) {
        try {
            boolean zEZpvd = interfaceC33215msJ.EZpvd(((c45668suQ.copydefault.copydefault(true, true) ^ true) && Intrinsics.EZpvd((java.lang.Object) interfaceC33215msJ.EZpvd(), (java.lang.Object) "LiteHeroFragmentTag")) ? "LiteHomePageId" : null, true);
            c45668suQ.AEQbTJ.AEQbTJ("Navigation tabs refreshed. " + zEZpvd);
        } catch (java.lang.Exception e) {
            c45668suQ.AEQbTJ.OLrzqt("Failed to refresh navigation tabs", e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(android.app.Activity activity) {
        if (activity != 0) {
            try {
                if (!activity.isFinishing()) {
                    if (activity == 0 || !activity.isDestroyed()) {
                        if (!(activity instanceof InterfaceC33215msJ)) {
                            this.AEQbTJ.OLrzqt("Activity is not ILiteMainContainerContract");
                            return;
                        } else {
                            ((InterfaceC33215msJ) activity).EZpvd("LiteHomePageId", false);
                            this.AEQbTJ.AEQbTJ("Hero tab hidden");
                            return;
                        }
                    }
                }
            } catch (java.lang.Exception e) {
                this.AEQbTJ.OLrzqt("Failed to hide hero tab", e);
                return;
            }
        }
        this.AEQbTJ.AEQbTJ("Activity is finishing/destroyed, skipping tab hide");
    }
}
