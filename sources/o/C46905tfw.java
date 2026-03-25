package o;

import com.okinc.market.common.bean.PayloadPeriod;
import com.okinc.marketapi.AnalysisTarget;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tfw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46905tfw extends AbstractC43215rlA implements InterfaceC43031rhc {
    public final MutableStateFlow<PayloadPeriod> copydefault = StateFlowKt.MutableStateFlow(null);
    public final MutableStateFlow<PayloadPeriod> OLrzqt = StateFlowKt.MutableStateFlow(null);

    /* JADX INFO: renamed from: o.tfw$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AnalysisTarget.values().length];
            try {
                iArr[AnalysisTarget.SPOT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AnalysisTarget.FUTURES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    @Override // o.InterfaceC43031rhc
    public StateFlow<PayloadPeriod> AEQbTJ() {
        return FlowKt.asStateFlow(this.copydefault);
    }

    @Override // o.InterfaceC43031rhc
    public StateFlow<PayloadPeriod> copydefault() {
        return FlowKt.asStateFlow(this.OLrzqt);
    }

    @Override // o.InterfaceC43031rhc
    public void KWHzl(@NotNull AnalysisTarget analysisTarget) {
        Intrinsics.checkNotNullParameter(analysisTarget, "");
        int i = StateListAnimator.EZpvd[analysisTarget.ordinal()];
        if (i == 1) {
            this.copydefault.setValue(null);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.OLrzqt.setValue(null);
        }
    }
}
