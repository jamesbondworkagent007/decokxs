package o;

import android.content.pm.PackageManager;
import android.os.Build;
import android.view.WindowManager;
import androidx.core.view.WindowCompat;
import androidx.window.layout.WindowMetricsCalculator;
import com.engagelab.privates.push.constants.MTPushConstants;

/* JADX INFO: renamed from: o.arj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7857arj {
    public static int AEQbTJ = 0;
    public static boolean EZpvd = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int AYXKKw() {
        return Build.VERSION.SDK_INT;
    }

    public static java.lang.String copydefault() {
        return Build.VERSION.RELEASE;
    }

    public static java.lang.String OLrzqt() {
        return android.os.Build.MODEL;
    }

    public static java.lang.String KWHzl() {
        return android.os.Build.BRAND;
    }

    public static java.lang.String valueOf() {
        return android.os.Build.PRODUCT;
    }

    public static java.lang.String EZpvd() {
        return android.os.Build.DEVICE;
    }

    public static java.lang.String AEQbTJ() {
        return android.os.Build.MANUFACTURER;
    }

    public static float OLrzqt(android.content.Context context) {
        return context.getApplicationContext().getResources().getDisplayMetrics().density;
    }

    public static float AYXKKw(android.content.Context context) {
        return context.getApplicationContext().getResources().getDisplayMetrics().scaledDensity;
    }

    public static int djBIcL(android.content.Context context) {
        return context.getApplicationContext().getResources().getDisplayMetrics().widthPixels;
    }

    public static int AhwBna(android.content.Context context) {
        return context.getApplicationContext().getResources().getDisplayMetrics().heightPixels;
    }

    public static int[] AkhnZx(android.content.Context context) {
        android.graphics.Rect bounds = WindowMetricsCalculator.getOrCreate().computeCurrentWindowMetrics((android.app.Activity) context).getBounds();
        return new int[]{bounds.width(), bounds.height()};
    }

    public static int[] fetchVPNInfo(android.content.Context context) {
        int[] iArrAkhnZx = AkhnZx(context);
        return new int[]{(int) C7865arr.AEQbTJ(iArrAkhnZx[0]), (int) C7865arr.AEQbTJ(iArrAkhnZx[1])};
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int KWHzl(android.content.Context context) {
        int height;
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            height = activity.getActionBar() != null ? activity.getActionBar().getHeight() : 0;
        }
        if (height != 0) {
            return height;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        return (context.getTheme() == null || !context.getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) ? height : android.util.TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    public static int EZpvd(android.content.Context context) {
        return (int) C7865arr.AEQbTJ(KWHzl(context));
    }

    public static int gEmmrt(android.content.Context context) {
        return (int) C7865arr.AEQbTJ(AEQbTJ(context));
    }

    public static int AEQbTJ(android.content.Context context) {
        return C33570myu.KWHzl(context);
    }

    public static int isConnected(android.content.Context context) {
        return (int) C7865arr.AEQbTJ(valueOf(context));
    }

    public static int valueOf(android.content.Context context) {
        if (EZpvd) {
            return AEQbTJ;
        }
        EZpvd = true;
        int iOLrzqt = C33570myu.OLrzqt();
        AEQbTJ = iOLrzqt;
        return iOLrzqt;
    }

    public static int copydefault(android.content.Context context) {
        try {
            return context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public static boolean AEQbTJ(android.app.Activity activity) {
        return (activity.getWindow().getAttributes().flags & 1024) == 1024;
    }

    public static void AEQbTJ(android.app.Activity activity, boolean z) {
        android.view.Window window = activity.getWindow();
        if (z) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.flags |= 1024;
            if (Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | MTPushConstants.Message.CODE_MESSAGE_OPENED);
            return;
        }
        WindowManager.LayoutParams attributes2 = window.getAttributes();
        attributes2.flags &= -1025;
        if (Build.VERSION.SDK_INT >= 28) {
            attributes2.layoutInDisplayCutoutMode = 0;
        }
        window.setAttributes(attributes2);
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-1029));
    }

    public static boolean OLrzqt(android.app.Activity activity) {
        android.view.View decorView;
        android.view.Window window = activity.getWindow();
        return (window == null || (decorView = window.getDecorView()) == null || (decorView.getSystemUiVisibility() & 1280) != 1280) ? false : true;
    }

    public static void KWHzl(boolean z, android.app.Activity activity) {
        if (activity == null) {
            return;
        }
        android.view.Window window = activity.getWindow();
        WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightStatusBars(!z);
    }
}
