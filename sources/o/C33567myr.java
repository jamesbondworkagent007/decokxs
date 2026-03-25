package o;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.WindowCompat;

/* JADX INFO: renamed from: o.myr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33567myr {
    public static void AEQbTJ(android.app.Activity activity, boolean z) {
        copydefault(activity);
        WindowCompat.getInsetsController(activity.getWindow(), activity.getWindow().getDecorView()).setAppearanceLightStatusBars(z);
    }

    public static void copydefault(android.app.Activity activity) {
        android.view.Window window = activity.getWindow();
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1280);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }

    public static void AEQbTJ(android.view.Window window) {
        window.clearFlags(67108864);
        window.getDecorView().setSystemUiVisibility(AppCompatDelegate.getDefaultNightMode() == 2 ? window.getDecorView().getSystemUiVisibility() | 1280 : 9472);
        window.setStatusBarColor(0);
    }

    @java.lang.Deprecated
    public static void AEQbTJ(android.app.Activity activity, int i) {
        android.view.Window window = activity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(activity.getResources().getColor(i));
    }

    public static int EZpvd(android.app.Activity activity) {
        WindowCompat.getInsetsController(activity.getWindow(), activity.getWindow().getDecorView()).setAppearanceLightStatusBars(true);
        return 3;
    }

    public static int AEQbTJ(android.app.Activity activity) {
        WindowCompat.getInsetsController(activity.getWindow(), activity.getWindow().getDecorView()).setAppearanceLightStatusBars(false);
        return 3;
    }
}
