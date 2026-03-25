package o;

import com.okinc.unify_trade.biz.SignalPositionReqGroup;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xpH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55717xpH {
    public final java.lang.String EZpvd;
    public SignalPositionReqGroup KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalPositionReqGroup EZpvd() {
        return this.KWHzl;
    }

    public abstract void EZpvd(@NotNull java.lang.String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    public abstract void copydefault(@NotNull java.lang.String str, @NotNull java.util.ArrayList<StrategyPositionResponse> arrayList);

    public AbstractC55717xpH(@NotNull SignalPositionReqGroup signalPositionReqGroup, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(signalPositionReqGroup, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = signalPositionReqGroup;
        this.copydefault = str;
        this.EZpvd = "signal_bot_position_instids_listener_key-" + signalPositionReqGroup.getAlgoId();
    }
}
