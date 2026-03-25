package o;

import com.okinc.market.time.filter.PeriodEnum;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qpm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41384qpm {

    /* JADX INFO: renamed from: o.qpm$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PeriodEnum.values().length];
            try {
                iArr[PeriodEnum.RANKING_PERIOD_1D.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PeriodEnum.RANKING_PERIOD_1H.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PeriodEnum.RANKING_PERIOD_1M.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[PeriodEnum.RANKING_PERIOD_1W.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[PeriodEnum.RANKING_PERIOD_5M.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            OLrzqt = iArr;
        }
    }

    public static final java.lang.String OLrzqt(@NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(periodEnum, "");
        int i = ActionBar.OLrzqt[periodEnum.ordinal()];
        if (i == 1) {
            InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
            if (interfaceC46557tYt != null && interfaceC46557tYt.EZpvd() == 0) {
                return C33070mpX.AYXKKw(qZH.PendingIntent.zLAIeZ);
            }
            return C33070mpX.AYXKKw(qZH.PendingIntent.Th);
        }
        if (i == 2) {
            return C33070mpX.AYXKKw(qZH.PendingIntent.reset);
        }
        if (i == 3) {
            return C33070mpX.AYXKKw(qZH.PendingIntent.DQzvGNdrmXxu);
        }
        if (i == 4) {
            return C33070mpX.AYXKKw(qZH.PendingIntent.isReflectionWorking);
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return C33070mpX.AYXKKw(qZH.PendingIntent.DQzvGN);
    }
}
