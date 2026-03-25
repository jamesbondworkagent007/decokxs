package o;

import com.okinc.dexkline.domain.model.market.detail.CoinRiskLevel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mVc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32252mVc {

    /* JADX INFO: renamed from: o.mVc$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CoinRiskLevel.values().length];
            try {
                iArr[CoinRiskLevel.LOW.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CoinRiskLevel.MEDIUM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[CoinRiskLevel.HIGH.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    public static final kotlin.Pair<java.lang.Integer, java.lang.Integer> KWHzl(@NotNull CoinRiskLevel coinRiskLevel) {
        Intrinsics.checkNotNullParameter(coinRiskLevel, "");
        int i = TaskDescription.copydefault[coinRiskLevel.ordinal()];
        if (i == 1) {
            return C56390yDp.OLrzqt(java.lang.Integer.valueOf(C52761wXj.TaskDescription.hQkvHM), java.lang.Integer.valueOf(C52761wXj.ActionBar.DNMMPQ));
        }
        if (i == 2) {
            return C56390yDp.OLrzqt(java.lang.Integer.valueOf(C52761wXj.TaskDescription.ZqidTP), java.lang.Integer.valueOf(C52761wXj.Activity.gdmIOq));
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C56390yDp.OLrzqt(java.lang.Integer.valueOf(C52761wXj.TaskDescription.zNQIcI), java.lang.Integer.valueOf(C52761wXj.ActionBar.DsrFlB));
    }
}
