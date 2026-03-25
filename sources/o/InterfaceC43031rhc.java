package o;

import com.okinc.market.common.bean.PayloadPeriod;
import com.okinc.marketapi.AnalysisTarget;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rhc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC43031rhc extends InterfaceC43217rlC {
    StateFlow<PayloadPeriod> AEQbTJ();

    void KWHzl(@NotNull AnalysisTarget analysisTarget);

    StateFlow<PayloadPeriod> copydefault();
}
