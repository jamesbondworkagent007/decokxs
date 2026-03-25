package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: o.Qu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5414Qu {
    public static final boolean AEQbTJ;
    public static volatile C5414Qu EZpvd;
    public static volatile int KWHzl;
    public static final java.io.File OLrzqt;
    public static final boolean copydefault;
    public final int DbNXlk;
    public int djBIcL;
    public final int valueOf;
    public boolean AYXKKw = true;
    public final AtomicBoolean gEmmrt = new AtomicBoolean(false);
    public final boolean AhwBna = copydefault();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return KWHzl != -1 ? KWHzl : this.DbNXlk;
    }

    static {
        int i = Build.VERSION.SDK_INT;
        AEQbTJ = i < 29;
        copydefault = i >= 26;
        OLrzqt = new java.io.File("/proc/self/fd");
        KWHzl = -1;
    }

    public static C5414Qu EZpvd() {
        if (EZpvd == null) {
            synchronized (C5414Qu.class) {
                if (EZpvd == null) {
                    EZpvd = new C5414Qu();
                }
            }
        }
        return EZpvd;
    }

    public C5414Qu() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.DbNXlk = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
            this.valueOf = 0;
        } else {
            this.DbNXlk = TypedValues.TransitionType.TYPE_DURATION;
            this.valueOf = 128;
        }
    }

    public boolean AEQbTJ(int i, int i2, boolean z, boolean z2) {
        int i3;
        return z && this.AhwBna && copydefault && !AEQbTJ() && !z2 && i >= (i3 = this.valueOf) && i2 >= i3 && djBIcL();
    }

    public final boolean AEQbTJ() {
        return AEQbTJ && !this.gEmmrt.get();
    }

    public boolean copydefault(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean zAEQbTJ = AEQbTJ(i, i2, z, z2);
        if (zAEQbTJ) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zAEQbTJ;
    }

    public static boolean copydefault() {
        return (KWHzl() || OLrzqt()) ? false : true;
    }

    public static boolean OLrzqt() {
        if (Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return java.util.Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(android.os.Build.MODEL);
    }

    public static boolean KWHzl() {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        java.util.Iterator it = java.util.Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play").iterator();
        while (it.hasNext()) {
            if (android.os.Build.MODEL.startsWith((java.lang.String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean djBIcL() {
        boolean z;
        synchronized (this) {
            boolean z2 = true;
            int i = this.djBIcL + 1;
            this.djBIcL = i;
            if (i >= 50) {
                this.djBIcL = 0;
                if (OLrzqt.list().length >= valueOf()) {
                    z2 = false;
                }
                this.AYXKKw = z2;
                if (!z2) {
                    android.util.Log.isLoggable("Downsampler", 5);
                }
            }
            z = this.AYXKKw;
        }
        return z;
    }
}
