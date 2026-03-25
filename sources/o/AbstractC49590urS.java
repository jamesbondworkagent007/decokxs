package o;

import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.okinc.unify_trade.biz.TradeStrategyInfoBean;
import com.okinc.unify_trade.biz.subscribe.OfflinePlan;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC49419uoG;
import o.AbstractC49464uoz;
import o.xMJ;

/* JADX INFO: renamed from: o.urS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC49590urS {
    public final TradeLiveData<xMJ.StateListAnimator> valueOf = new TradeLiveData<>();
    public final TradeLiveData<xMJ.TaskDescription> AEQbTJ = new TradeLiveData<>();
    public final TradeLiveData<AbstractC49419uoG.ActionBar> copydefault = new TradeLiveData<>();
    public final TradeLiveData<AbstractC49464uoz.Activity> OLrzqt = new TradeLiveData<>();
    public final TradeLiveData<java.util.ArrayList<TradeStrategyInfoBean>> gEmmrt = new TradeLiveData<>();
    public final TradeLiveData<OfflinePlan> isConnected = new TradeLiveData<>();
    public final Observer<xMJ.StateListAnimator> djBIcL = new Observer() { // from class: o.urU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            AbstractC49590urS.OLrzqt(this.AEQbTJ, (xMJ.StateListAnimator) obj);
        }
    };
    public final Observer<xMJ.TaskDescription> AhwBna = new Observer() { // from class: o.usa
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            AbstractC49590urS.KWHzl(this.copydefault, (xMJ.TaskDescription) obj);
        }
    };
    public final Observer<AbstractC49419uoG.ActionBar> EZpvd = new Observer() { // from class: o.urZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            AbstractC49590urS.EZpvd(this.KWHzl, (AbstractC49419uoG.ActionBar) obj);
        }
    };
    public final Observer<AbstractC49464uoz.Activity> KWHzl = new Observer() { // from class: o.urY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            AbstractC49590urS.EZpvd(this.EZpvd, (AbstractC49464uoz.Activity) obj);
        }
    };
    public final Observer<java.util.ArrayList<TradeStrategyInfoBean>> AYXKKw = new Observer() { // from class: o.urX
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            AbstractC49590urS.EZpvd(this.AEQbTJ, (java.util.ArrayList) obj);
        }
    };
    public final Observer<OfflinePlan> values = new Observer() { // from class: o.usb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            AbstractC49590urS.OLrzqt(this.OLrzqt, (OfflinePlan) obj);
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<xMJ.TaskDescription> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<OfflinePlan> AhwBna() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Observer<AbstractC49419uoG.ActionBar> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<AbstractC49464uoz.Activity> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<AbstractC49419uoG.ActionBar> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Observer<AbstractC49464uoz.Activity> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Observer<java.util.ArrayList<TradeStrategyInfoBean>> djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLiveData<xMJ.StateListAnimator> gEmmrt() {
        return this.valueOf;
    }

    public static final void OLrzqt(AbstractC49590urS abstractC49590urS, xMJ.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        abstractC49590urS.valueOf.postValue(stateListAnimator);
    }

    public static final void KWHzl(AbstractC49590urS abstractC49590urS, xMJ.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        abstractC49590urS.AEQbTJ.postValue(taskDescription);
    }

    public static final void EZpvd(AbstractC49590urS abstractC49590urS, AbstractC49419uoG.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        abstractC49590urS.copydefault.postValue(actionBar);
    }

    public static final void EZpvd(AbstractC49590urS abstractC49590urS, AbstractC49464uoz.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        abstractC49590urS.OLrzqt.postValue(activity);
    }

    public static final void EZpvd(AbstractC49590urS abstractC49590urS, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        abstractC49590urS.gEmmrt.postValue(arrayList);
    }

    public static final void OLrzqt(AbstractC49590urS abstractC49590urS, OfflinePlan offlinePlan) {
        Intrinsics.checkNotNullParameter(offlinePlan, "");
        abstractC49590urS.isConnected.postValue(offlinePlan);
    }
}
