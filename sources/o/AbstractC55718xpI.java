package o;

import com.okinc.unify_trade.biz.SignalPositionReqGroup;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xpI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55718xpI {
    public final java.lang.String AEQbTJ;
    public SignalPositionReqGroup EZpvd;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalPositionReqGroup EZpvd() {
        return this.EZpvd;
    }

    public abstract void KWHzl(@NotNull java.lang.String str, @NotNull java.util.ArrayList<StrategyPositionResponse> arrayList);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    public AbstractC55718xpI(@NotNull SignalPositionReqGroup signalPositionReqGroup, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(signalPositionReqGroup, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = signalPositionReqGroup;
        this.AEQbTJ = str;
        this.KWHzl = "signal_bot_positions_listener_key-" + signalPositionReqGroup.getInstId();
    }
}
