package o;

import com.okinc.cruilib.view.listitem.share.OKCRTrend;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mJg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C31932mJg {

    /* JADX INFO: renamed from: o.mJg$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKCRTrend.values().length];
            try {
                iArr[OKCRTrend.UP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKCRTrend.FLAT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OKCRTrend.DOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    public static final int EZpvd(@NotNull OKCRTrend oKCRTrend, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(oKCRTrend, "");
        Intrinsics.checkNotNullParameter(context, "");
        int i = Application.KWHzl[oKCRTrend.ordinal()];
        if (i == 1 || i == 2) {
            return C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
    }
}
