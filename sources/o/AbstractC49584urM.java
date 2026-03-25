package o;

import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC49464uoz;
import o.xMJ;

/* JADX INFO: renamed from: o.urM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC49584urM {
    public final TradeLiveData<xMJ.StateListAnimator> KWHzl = new TradeLiveData<>();
    public final TradeLiveData<xMJ.TaskDescription> EZpvd = new TradeLiveData<>();
    public final TradeLiveData<AbstractC49464uoz.Activity> OLrzqt = new TradeLiveData<>();
    public final Observer<xMJ.StateListAnimator> gEmmrt = new Observer() { // from class: o.urI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            AbstractC49584urM.copydefault(this.EZpvd, (xMJ.StateListAnimator) obj);
        }
    };
    public final Observer<xMJ.TaskDescription> copydefault = new Observer() { // from class: o.urO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            AbstractC49584urM.OLrzqt(this.AEQbTJ, (xMJ.TaskDescription) obj);
        }
    };
    public final Observer<AbstractC49464uoz.Activity> AEQbTJ = new Observer() { // from class: o.urP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            AbstractC49584urM.copydefault(this.OLrzqt, (AbstractC49464uoz.Activity) obj);
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<AbstractC49464uoz.Activity> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<xMJ.TaskDescription> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<xMJ.StateListAnimator> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Observer<AbstractC49464uoz.Activity> copydefault() {
        return this.AEQbTJ;
    }

    public static final void copydefault(AbstractC49584urM abstractC49584urM, xMJ.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        abstractC49584urM.KWHzl.postValue(stateListAnimator);
    }

    public static final void OLrzqt(AbstractC49584urM abstractC49584urM, xMJ.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        abstractC49584urM.EZpvd.postValue(taskDescription);
    }

    public static final void copydefault(AbstractC49584urM abstractC49584urM, AbstractC49464uoz.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        abstractC49584urM.OLrzqt.postValue(activity);
    }
}
