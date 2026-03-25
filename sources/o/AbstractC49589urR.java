package o;

import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import kotlin.jvm.internal.Intrinsics;
import o.xMJ;

/* JADX INFO: renamed from: o.urR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC49589urR {
    public final TradeLiveData<xMJ.StateListAnimator> KWHzl = new TradeLiveData<>();
    public final TradeLiveData<xMJ.TaskDescription> EZpvd = new TradeLiveData<>();
    public final Observer<xMJ.StateListAnimator> OLrzqt = new Observer() { // from class: o.urQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            AbstractC49589urR.OLrzqt(this.EZpvd, (xMJ.StateListAnimator) obj);
        }
    };
    public final Observer<xMJ.TaskDescription> copydefault = new Observer() { // from class: o.urN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            AbstractC49589urR.EZpvd(this.EZpvd, (xMJ.TaskDescription) obj);
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<xMJ.TaskDescription> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<xMJ.StateListAnimator> OLrzqt() {
        return this.KWHzl;
    }

    public static final void OLrzqt(AbstractC49589urR abstractC49589urR, xMJ.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        abstractC49589urR.KWHzl.postValue(stateListAnimator);
    }

    public static final void EZpvd(AbstractC49589urR abstractC49589urR, xMJ.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        abstractC49589urR.EZpvd.postValue(taskDescription);
    }
}
