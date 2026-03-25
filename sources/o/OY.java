package o;

import android.os.Build;
import com.engagelab.privates.common.constants.MTCommonConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class OY {
    public final android.content.Context EZpvd;
    public final int KWHzl;
    public final int OLrzqt;
    public final int copydefault;

    public interface TaskDescription {
        int KWHzl();

        int OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int copydefault() {
        return this.OLrzqt;
    }

    public OY(StateListAnimator stateListAnimator) {
        int i;
        this.EZpvd = stateListAnimator.KWHzl;
        if (EZpvd(stateListAnimator.AEQbTJ)) {
            i = stateListAnimator.copydefault / 2;
        } else {
            i = stateListAnimator.copydefault;
        }
        this.KWHzl = i;
        int iAEQbTJ = AEQbTJ(stateListAnimator.AEQbTJ, stateListAnimator.gEmmrt, stateListAnimator.AhwBna);
        float fKWHzl = stateListAnimator.valueOf.KWHzl() * stateListAnimator.valueOf.OLrzqt() * 4;
        int iRound = java.lang.Math.round(stateListAnimator.EZpvd * fKWHzl);
        int iRound2 = java.lang.Math.round(fKWHzl * stateListAnimator.djBIcL);
        int i2 = iAEQbTJ - i;
        if (iRound2 + iRound <= i2) {
            this.OLrzqt = iRound2;
            this.copydefault = iRound;
        } else {
            float f = i2;
            float f2 = stateListAnimator.EZpvd;
            float f3 = stateListAnimator.djBIcL;
            float f4 = f / (f2 + f3);
            this.OLrzqt = java.lang.Math.round(f3 * f4);
            this.copydefault = java.lang.Math.round(f4 * stateListAnimator.EZpvd);
        }
        if (android.util.Log.isLoggable("MemorySizeCalculator", 3)) {
            copydefault(this.OLrzqt);
            copydefault(this.copydefault);
            copydefault(i);
            copydefault(iAEQbTJ);
            stateListAnimator.AEQbTJ.getMemoryClass();
            EZpvd(stateListAnimator.AEQbTJ);
        }
    }

    public static int AEQbTJ(android.app.ActivityManager activityManager, float f, float f2) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (EZpvd(activityManager)) {
            f = f2;
        }
        return java.lang.Math.round(memoryClass * f);
    }

    public final java.lang.String copydefault(int i) {
        return android.text.format.Formatter.formatFileSize(this.EZpvd, i);
    }

    public static boolean EZpvd(android.app.ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    public static final class StateListAnimator {
        public static final int OLrzqt;
        public android.app.ActivityManager AEQbTJ;
        public float EZpvd;
        public final android.content.Context KWHzl;
        public TaskDescription valueOf;
        public float djBIcL = 2.0f;
        public float gEmmrt = 0.4f;
        public float AhwBna = 0.33f;
        public int copydefault = 4194304;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            OLrzqt = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public StateListAnimator(android.content.Context context) {
            this.EZpvd = OLrzqt;
            this.KWHzl = context;
            this.AEQbTJ = (android.app.ActivityManager) context.getSystemService(MTCommonConstants.Lifecycle.KEY_ACTIVITY);
            this.valueOf = new Activity(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !OY.EZpvd(this.AEQbTJ)) {
                return;
            }
            this.EZpvd = 0.0f;
        }

        public OY KWHzl() {
            return new OY(this);
        }
    }

    public static final class Activity implements TaskDescription {
        public final android.util.DisplayMetrics AEQbTJ;

        public Activity(android.util.DisplayMetrics displayMetrics) {
            this.AEQbTJ = displayMetrics;
        }

        @Override // o.OY.TaskDescription
        public int KWHzl() {
            return this.AEQbTJ.widthPixels;
        }

        @Override // o.OY.TaskDescription
        public int OLrzqt() {
            return this.AEQbTJ.heightPixels;
        }
    }
}
