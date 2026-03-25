package o;

import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import kotlin.jvm.internal.Intrinsics;
import o.xMJ;

/* JADX INFO: renamed from: o.urW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC49594urW {
    public final TradeLiveData<xMJ.StateListAnimator> KWHzl = new TradeLiveData<>();
    public final TradeLiveData<xMJ.TaskDescription> AEQbTJ = new TradeLiveData<>();
    public final Observer<xMJ.StateListAnimator> copydefault = new Observer() { // from class: o.urT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            AbstractC49594urW.KWHzl(this.OLrzqt, (xMJ.StateListAnimator) obj);
        }
    };
    public final Observer<xMJ.TaskDescription> OLrzqt = new Observer() { // from class: o.urV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            AbstractC49594urW.OLrzqt(this.OLrzqt, (xMJ.TaskDescription) obj);
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<xMJ.StateListAnimator> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<xMJ.TaskDescription> OLrzqt() {
        return this.AEQbTJ;
    }

    public static final void KWHzl(AbstractC49594urW abstractC49594urW, xMJ.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        abstractC49594urW.KWHzl.postValue(stateListAnimator);
    }

    public static final void OLrzqt(AbstractC49594urW abstractC49594urW, xMJ.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        abstractC49594urW.AEQbTJ.postValue(taskDescription);
    }
}
