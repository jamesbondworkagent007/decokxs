package o;

import com.okinc.assets.api.model.ValuationCurrency;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: renamed from: o.ayb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC8218ayb extends InterfaceC43217rlC {
    public static final StateListAnimator Companion = StateListAnimator.AEQbTJ;

    Flow<kotlin.Pair<java.util.List<ValuationCurrency>, ValuationCurrency>> EZpvd();

    java.util.Set<ValuationCurrency> KWHzl();

    StateFlow<ValuationCurrency> OLrzqt();

    java.lang.Iterable<ValuationCurrency> copydefault();

    /* JADX INFO: renamed from: o.ayb$StateListAnimator */
    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator AEQbTJ = new StateListAnimator();
        public static final java.util.List<ValuationCurrency> copydefault = C56402yEa.EZpvd(new ValuationCurrency("USD", "$"));

        private StateListAnimator() {
        }
    }
}
