package o;

import com.okinc.business.invest_biz.data.contants.RateType;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iyB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25511iyB {

    /* JADX INFO: renamed from: o.iyB$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RateType.values().length];
            try {
                iArr[RateType.APR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RateType.APY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    public static final Triple<java.lang.String, java.lang.String, java.lang.String> OLrzqt(@NotNull RateType rateType, @NotNull android.content.Context context) {
        Triple<java.lang.String, java.lang.String, java.lang.String> triple;
        Intrinsics.checkNotNullParameter(rateType, "");
        Intrinsics.checkNotNullParameter(context, "");
        int i = Application.OLrzqt[rateType.ordinal()];
        if (i == 1) {
            triple = new Triple<>(context.getString(C25493ixk.FragmentManager.sSMYrx), context.getString(C25493ixk.FragmentManager.QKVWgx), context.getString(C25493ixk.FragmentManager.DTwDnp));
        } else {
            if (i != 2) {
                return null;
            }
            triple = new Triple<>(context.getString(C25493ixk.FragmentManager.OcIXYQ), context.getString(C25493ixk.FragmentManager.QOLQEE), context.getString(C25493ixk.FragmentManager.ORxRYg));
        }
        return triple;
    }
}
