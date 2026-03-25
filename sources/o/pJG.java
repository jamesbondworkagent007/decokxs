package o;

import com.okinc.lib.monitor.bean.FragmentInfo;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes16.dex */
public class pJG {
    public void EZpvd(WeakReference<androidx.fragment.app.Fragment> weakReference, java.lang.String str, java.lang.String str2, pJS pjs) {
        AEQbTJ(weakReference, str, str2, pjs);
    }

    public void AEQbTJ(final WeakReference<androidx.fragment.app.Fragment> weakReference, final java.lang.String str, final java.lang.String str2, final pJS pjs) {
        if (weakReference.get() != null && weakReference.get().getView() != null) {
            weakReference.get().getView().post(new java.lang.Runnable() { // from class: o.pJJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    this.AEQbTJ.OLrzqt(weakReference, str, str2, pjs);
                }
            });
            return;
        }
        pUU.KWHzl("Monitor.Lifecycle", "renderEnd " + str2);
        copydefault(weakReference.get(), str, str2, pjs);
    }

    public final /* synthetic */ void OLrzqt(WeakReference weakReference, java.lang.String str, java.lang.String str2, pJS pjs) {
        copydefault((androidx.fragment.app.Fragment) weakReference.get(), str, str2, pjs);
        pUU.KWHzl("Monitor.Lifecycle", "post view renderEnd " + str2);
    }

    public final void copydefault(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.String str2, pJS pjs) {
        java.util.List<C38022pJi> listAEQbTJ;
        if (fragment == null || (listAEQbTJ = C38024pJk.AEQbTJ(fragment)) == null || listAEQbTJ.isEmpty()) {
            return;
        }
        FragmentInfo fragmentInfo = new FragmentInfo();
        fragmentInfo.time = android.os.SystemClock.elapsedRealtime();
        fragmentInfo.activityName = str;
        fragmentInfo.fragmentName = str2;
        fragmentInfo.fragment = new WeakReference<>(fragment);
        for (C38022pJi c38022pJi : listAEQbTJ) {
            fragmentInfo.setCost(c38022pJi.copydefault, c38022pJi.EZpvd);
        }
        fragmentInfo.calculateTotalCost();
        if (pjs != null) {
            pjs.EZpvd(fragmentInfo);
        }
        C38024pJk.KWHzl(fragment);
    }
}
