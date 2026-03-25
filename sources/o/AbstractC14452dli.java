package o;

import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dli, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14452dli {
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    public AbstractC14452dli(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    public final boolean OLrzqt() {
        boolean zKWHzl = ABTestManager.AEQbTJ.KWHzl(new StateListAnimator(), AmplitudeName.WEB3);
        pUU.KWHzl("BaseWalletOnOffFeature", "flagName: " + this.OLrzqt + ", isEnable: " + zKWHzl);
        return zKWHzl;
    }

    /* JADX INFO: renamed from: o.dli$StateListAnimator */
    public final class StateListAnimator extends C32927mmn {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public StateListAnimator() {
        }

        @Override // o.C32927mmn, o.InterfaceC32926mmm
        public java.lang.String EZpvd() {
            return AbstractC14452dli.this.AEQbTJ();
        }
    }
}
