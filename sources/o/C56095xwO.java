package o;

import com.okinc.unify_trade.biz.AccountTradeConfig;
import com.okinc.unify_trade.core.basic.task.basic.TradeSettingTask$refreshTradeSettingTask$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ContextKt;

/* JADX INFO: renamed from: o.xwO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C56095xwO {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public C56097xwQ EZpvd;
    public C56106xwZ KWHzl = new C56106xwZ(null, null, 3, null);

    /* JADX INFO: renamed from: o.xwO$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xwO.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final Flow<C56106xwZ> EZpvd(boolean z, boolean z2) {
        return FlowKt.flowOn(FlowKt__ContextKt.buffer$default(FlowKt.callbackFlow(new TradeSettingTask$refreshTradeSettingTask$1(z, this, z2, null)), 0, null, 3, null), Dispatchers.getMain());
    }

    public final void EZpvd(C56106xwZ c56106xwZ, AccountTradeConfig accountTradeConfig) {
        c56106xwZ.OLrzqt(accountTradeConfig != null ? accountTradeConfig.getAccountConfig() : null);
        c56106xwZ.KWHzl(accountTradeConfig != null ? accountTradeConfig.getTradeConfig() : null);
    }
}
