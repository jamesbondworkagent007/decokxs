package o;

import com.okinc.business.market.features.coindetail.ui.snipers.HoldActivity;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jPx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26045jPx {

    /* JADX INFO: renamed from: o.jPx$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[HoldActivity.values().length];
            try {
                iArr[HoldActivity.HOLD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[HoldActivity.BUY_MORE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[HoldActivity.SELL_PART.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[HoldActivity.SELL_ALL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[HoldActivity.TRANSFER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            OLrzqt = iArr;
        }
    }

    public static final jPA copydefault(@NotNull HoldActivity holdActivity) {
        jPA jpa;
        Intrinsics.checkNotNullParameter(holdActivity, "");
        int i = Application.OLrzqt[holdActivity.ordinal()];
        if (i == 1) {
            return new jPA(C57406yhn.Activity.gEmmrt, java.lang.Integer.valueOf(C52761wXj.ActionBar.DCUTEI));
        }
        if (i == 2) {
            jpa = new jPA(C57406yhn.Activity.fetchVPNInfo, null);
        } else if (i == 3) {
            jpa = new jPA(C57406yhn.Activity.getNewProxyInstance, null);
        } else {
            if (i != 4) {
                if (i == 5) {
                    return new jPA(C57406yhn.Activity.gEmmrt, java.lang.Integer.valueOf(C52761wXj.Activity.gdmIOq));
                }
                return new jPA(C57406yhn.Activity.gEmmrt, java.lang.Integer.valueOf(C52761wXj.Activity.DCUTEIddSDPG));
            }
            jpa = new jPA(C57406yhn.Activity.fIwbmz, null);
        }
        return jpa;
    }
}
