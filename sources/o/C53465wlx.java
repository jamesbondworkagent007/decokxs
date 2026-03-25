package o;

import com.okinc.unify_trade.biz.bot.EarnType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wlx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53465wlx {

    /* JADX INFO: renamed from: o.wlx$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[EarnType.values().length];
            try {
                iArr[EarnType.Ratio.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[EarnType.Absolute.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    public static final int copydefault(@NotNull EarnType earnType) {
        Intrinsics.checkNotNullParameter(earnType, "");
        int i = ActionBar.EZpvd[earnType.ordinal()];
        if (i == 1) {
            return C48033uCm.Fragment.HJWChPhFGucI;
        }
        if (i == 2) {
            return C48033uCm.Fragment.sanrWj;
        }
        throw new NoWhenBranchMatchedException();
    }
}
