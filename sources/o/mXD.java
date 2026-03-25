package o;

import com.okinc.dexkline.market.features.coindetail.ui.snipers.HoldActivity;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mXD {

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

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
            KWHzl = iArr;
        }
    }

    public static final C32328mXy EZpvd(@NotNull HoldActivity holdActivity) {
        C32328mXy c32328mXy;
        Intrinsics.checkNotNullParameter(holdActivity, "");
        int i = ActionBar.KWHzl[holdActivity.ordinal()];
        if (i == 1) {
            return new C32328mXy(C57406yhn.Activity.gEmmrt, java.lang.Integer.valueOf(C52761wXj.ActionBar.DCUTEI));
        }
        if (i == 2) {
            c32328mXy = new C32328mXy(C57406yhn.Activity.fetchVPNInfo, null);
        } else if (i == 3) {
            c32328mXy = new C32328mXy(C57406yhn.Activity.getNewProxyInstance, null);
        } else {
            if (i != 4) {
                if (i == 5) {
                    return new C32328mXy(C57406yhn.Activity.gEmmrt, java.lang.Integer.valueOf(C52761wXj.Activity.gdmIOq));
                }
                return new C32328mXy(C57406yhn.Activity.gEmmrt, java.lang.Integer.valueOf(C52761wXj.Activity.DCUTEIddSDPG));
            }
            c32328mXy = new C32328mXy(C57406yhn.Activity.fIwbmz, null);
        }
        return c32328mXy;
    }
}
