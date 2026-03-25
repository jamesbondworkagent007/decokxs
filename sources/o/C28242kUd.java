package o;

import com.okinc.business.trade.features.home.domain.model.BridgeForceUpdateState;
import com.okinc.business.trade.features.home.domain.model.SingleForceUpdateState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kUd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28242kUd {
    public final boolean AEQbTJ;
    public final boolean AYXKKw;
    public final boolean AhwBna;
    public final boolean EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean gEmmrt() {
        return this.AYXKKw;
    }

    public C28242kUd(@NotNull SingleForceUpdateState singleForceUpdateState, @NotNull BridgeForceUpdateState bridgeForceUpdateState) {
        Intrinsics.checkNotNullParameter(singleForceUpdateState, "");
        Intrinsics.checkNotNullParameter(bridgeForceUpdateState, "");
        this.OLrzqt = bridgeForceUpdateState.getBridgeForceUpgrade();
        this.AhwBna = singleForceUpdateState.getSimpleModeForceUpdateState() == 1;
        this.AYXKKw = singleForceUpdateState.getMemeModeForceUpdateState() == 1;
        this.AEQbTJ = singleForceUpdateState.getAdvancedModeForceUpdateState() == 1;
        this.KWHzl = singleForceUpdateState.getSwapModeForceUpdateState() == 3;
        this.EZpvd = singleForceUpdateState.getSwapModeForceUpdateState() == 1;
        this.copydefault = singleForceUpdateState.getSwapModeForceUpdateState() == 2;
    }
}
