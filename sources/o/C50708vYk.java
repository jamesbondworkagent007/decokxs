package o;

import com.okinc.tradingbot.impl.order.strategy.signalbot.ui.SignCreateStepType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vYk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50708vYk implements InterfaceC47982uAp {
    public final SignCreateStepType OLrzqt;

    /* JADX INFO: renamed from: o.vYk$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SignCreateStepType.values().length];
            try {
                iArr[SignCreateStepType.STEP_1.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SignCreateStepType.STEP_2.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    public C50708vYk(@NotNull SignCreateStepType signCreateStepType) {
        Intrinsics.checkNotNullParameter(signCreateStepType, "");
        this.OLrzqt = signCreateStepType;
    }

    @Override // o.InterfaceC47982uAp
    public androidx.fragment.app.Fragment getFragment(java.lang.Object obj) {
        int i = StateListAnimator.AEQbTJ[this.OLrzqt.ordinal()];
        if (i == 1) {
            return vXZ.Companion.OLrzqt();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C50702vYe.Companion.OLrzqt();
    }
}
