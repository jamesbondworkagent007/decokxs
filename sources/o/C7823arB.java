package o;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.atomic.AtomicInteger;
import o.C57869yqZ;

/* JADX INFO: renamed from: o.arB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7823arB {
    public static int AEQbTJ = 0;
    public static int EZpvd = 0;
    public static final AtomicInteger OLrzqt = new AtomicInteger(1);
    public static java.lang.String copydefault = "";

    public static void AEQbTJ(android.view.View view, android.graphics.drawable.Drawable drawable) {
        if (view != null) {
            view.setBackground(drawable);
        }
    }

    public static void EZpvd(android.view.ViewGroup viewGroup, android.view.View view) {
        if (viewGroup == null || view == null) {
            return;
        }
        if (viewGroup.isInLayout()) {
            viewGroup.removeViewInLayout(view);
        } else {
            viewGroup.removeView(view);
        }
    }

    public static android.view.View AEQbTJ(android.view.View view) {
        if (view != null && (view.getParent() instanceof android.view.ViewGroup)) {
            EZpvd((android.view.ViewGroup) view.getParent(), view);
        }
        return view;
    }

    public static RelativeLayout.LayoutParams KWHzl() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    public static CoordinatorLayout.LayoutParams copydefault() {
        return new CoordinatorLayout.LayoutParams(-1, -1);
    }

    public static ViewGroup.LayoutParams AEQbTJ() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public static C57869yqZ.Application OLrzqt() {
        return new C57869yqZ.Application(-1, -2);
    }

    public static void EZpvd(C7322ahe c7322ahe, LottieAnimationView lottieAnimationView, java.lang.String str) {
        java.io.InputStream inputStreamOLrzqt;
        if (C7911ask.AEQbTJ(c7322ahe.AEQbTJ)) {
            str = str + "_night.json";
            inputStreamOLrzqt = OLrzqt(str, c7322ahe);
        } else {
            inputStreamOLrzqt = null;
        }
        if (inputStreamOLrzqt == null) {
            str = str + ".json";
            inputStreamOLrzqt = OLrzqt(str, c7322ahe);
        }
        if (inputStreamOLrzqt != null) {
            lottieAnimationView.setAnimation(inputStreamOLrzqt, str);
        }
    }

    public static java.io.InputStream OLrzqt(java.lang.String str, C7322ahe c7322ahe) {
        C43045rhq c43045rhqIsConnected = c7322ahe.copydefault.isConnected();
        if (c43045rhqIsConnected != null) {
            return c43045rhqIsConnected.copydefault("images/" + str);
        }
        java.lang.String strAEQbTJ = AEQbTJ(str, c7322ahe.AEQbTJ);
        try {
            try {
                if (strAEQbTJ.startsWith("file://android_asset/")) {
                    return c7322ahe.AEQbTJ.getAssets().open(strAEQbTJ.replaceAll("file://android_asset/", ""));
                }
                return new java.io.FileInputStream(strAEQbTJ);
            } catch (java.lang.Exception unused) {
                return c7322ahe.AEQbTJ.getAssets().open(str);
            }
        } catch (java.lang.Exception unused2) {
            return null;
        }
    }

    public static java.lang.String AEQbTJ(java.lang.String str, android.content.Context context) {
        return C7788aqT.AEQbTJ().AhwBna().AEQbTJ(context, "images/" + str);
    }

    public static java.lang.String KWHzl(java.lang.String str, C7322ahe c7322ahe) {
        C43045rhq c43045rhqIsConnected = c7322ahe.copydefault.isConnected();
        if (c43045rhqIsConnected != null) {
            return c43045rhqIsConnected.AEQbTJ("images/" + str, true);
        }
        return AEQbTJ(str, c7322ahe.AEQbTJ);
    }
}
