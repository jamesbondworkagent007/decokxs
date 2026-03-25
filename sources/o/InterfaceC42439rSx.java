package o;

import androidx.activity.result.ActivityResultLauncher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rSx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC42439rSx extends InterfaceC43217rlC {
    public static final Application Companion = Application.OLrzqt;

    void OLrzqt(@NotNull android.app.Activity activity, @NotNull java.lang.String str, long j, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull InterfaceC42438rSw interfaceC42438rSw, int i);

    void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher);

    /* JADX INFO: renamed from: o.rSx$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        public static final /* synthetic */ Application OLrzqt = new Application();

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.rSx$StateListAnimator */
    public static final class StateListAnimator {
        public static /* synthetic */ void initSDK$default(InterfaceC42439rSx interfaceC42439rSx, android.app.Activity activity, java.lang.String str, long j, java.lang.String str2, java.lang.String str3, InterfaceC42438rSw interfaceC42438rSw, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initSDK");
            }
            interfaceC42439rSx.OLrzqt(activity, str, j, str2, str3, interfaceC42438rSw, (i2 & 64) != 0 ? 0 : i);
        }
    }
}
