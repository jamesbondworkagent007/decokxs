package o;

import com.okinc.market.ticker.datasource.impl.CountDownEventDataSource$bindWatchListEvent$1;
import com.okinc.market.ticker.datasource.impl.CountDownEventDataSource$bindWatchListEvent$2;
import com.okinc.market.ticker.datasource.impl.CountDownEventDataSource$bindWatchListEvent$3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: renamed from: o.qUu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40409qUu {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.qUt
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C40409qUu.EZpvd();
        }
    });

    /* JADX INFO: renamed from: o.qUu$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qUu.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @yCM
    public C40409qUu() {
    }

    public static final xND EZpvd() {
        return (xND) C43251rlk.copydefault(xND.class);
    }

    public final xND KWHzl() {
        return (xND) this.AEQbTJ.getValue();
    }

    public Flow<C40398qUj> AEQbTJ() {
        return FlowKt.onStart(FlowKt.onEach(FlowKt.callbackFlow(new CountDownEventDataSource$bindWatchListEvent$1(this, null)), new CountDownEventDataSource$bindWatchListEvent$2(null)), new CountDownEventDataSource$bindWatchListEvent$3(null));
    }
}
