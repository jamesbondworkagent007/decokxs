package o;

import com.okinc.buysell.data.FrequencyType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ltF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C31393ltF {

    /* JADX INFO: renamed from: o.ltF$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[FrequencyType.values().length];
            try {
                iArr[FrequencyType.ONE_TIME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[FrequencyType.DAILY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[FrequencyType.WEEKLY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[FrequencyType.BIWEEKLY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[FrequencyType.MONTHLY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            KWHzl = iArr;
        }
    }

    public static final java.lang.String OLrzqt(@NotNull FrequencyType frequencyType) {
        Intrinsics.checkNotNullParameter(frequencyType, "");
        int i = StateListAnimator.KWHzl[frequencyType.ordinal()];
        if (i == 1) {
            return "one_time";
        }
        if (i == 2) {
            return FrequencyType.DAILY.getValue();
        }
        if (i == 3) {
            return FrequencyType.WEEKLY.getValue();
        }
        if (i == 4) {
            return "twice_monthly";
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return FrequencyType.MONTHLY.getValue();
    }
}
