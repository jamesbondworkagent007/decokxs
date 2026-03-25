package o;

import android.os.Build;

/* JADX INFO: renamed from: o.yms, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@java.lang.Deprecated
public class C57676yms {
    public static int AEQbTJ(android.content.Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int KWHzl(android.content.Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static android.graphics.Point EZpvd(android.content.Context context) {
        android.view.Display defaultDisplay;
        if (Build.VERSION.SDK_INT >= 30) {
            defaultDisplay = context.getDisplay();
        } else {
            defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
        }
        android.graphics.Point point = new android.graphics.Point();
        defaultDisplay.getRealSize(point);
        return point;
    }

    public static int copydefault(android.content.Context context) {
        return EZpvd(context).y;
    }

    public static int AYXKKw(android.content.Context context) {
        android.content.res.Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int[] OLrzqt(android.content.Context context) {
        android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
        android.graphics.Point point = new android.graphics.Point();
        defaultDisplay.getSize(point);
        return new int[]{point.x, point.y};
    }

    public static int EZpvd(android.content.Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static boolean valueOf(android.content.Context context) {
        android.view.Display defaultDisplay = AhwBna(context).getDefaultDisplay();
        android.graphics.Point point = new android.graphics.Point();
        android.graphics.Point point2 = new android.graphics.Point();
        defaultDisplay.getSize(point);
        defaultDisplay.getRealSize(point2);
        return (point2.x == point.x && point2.y == point.y) ? false : true;
    }

    public static android.view.WindowManager AhwBna(android.content.Context context) {
        return (android.view.WindowManager) context.getSystemService("window");
    }
}
