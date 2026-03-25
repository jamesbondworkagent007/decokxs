package o;

import androidx.core.graphics.ColorUtils;
import com.okinc.business.invest_biz.data.contants.HealthRateLevel;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jwz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27536jwz {
    public static final C27536jwz OLrzqt = new C27536jwz();

    /* JADX INFO: renamed from: o.jwz$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[HealthRateLevel.values().length];
            try {
                iArr[HealthRateLevel.Yellow.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[HealthRateLevel.Red.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[HealthRateLevel.Green.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    private C27536jwz() {
    }

    public final int KWHzl(@NotNull HealthRateLevel healthRateLevel) {
        Intrinsics.checkNotNullParameter(healthRateLevel, "");
        int i = StateListAnimator.AEQbTJ[healthRateLevel.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? C52761wXj.Activity.fdOvFl : C25493ixk.TaskDescription.copydefault : C25493ixk.TaskDescription.KWHzl : C25493ixk.TaskDescription.AEQbTJ;
    }

    public final int EZpvd(int i, int i2) {
        return ColorUtils.setAlphaComponent(i, C33129mqd.AhwBna(java.lang.Double.valueOf(((double) 255) * (((double) i2) / 100.0d))));
    }
}
