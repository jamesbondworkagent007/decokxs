package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.ProcessMemoryState;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PerfMeasurement {
    public static final ProcessMemoryState EZpvd(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        ProcessMemoryState.StateListAnimator stateListAnimator = new ProcessMemoryState.StateListAnimator();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("Name"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("Priority"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                stateListAnimator.OLrzqt(Person.KWHzl.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo()));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    stateListAnimator.copydefault(java.lang.Integer.valueOf(stateListAnimatorEZpvd.djBIcL()));
                } else if (numOLrzqt != null) {
                    stateListAnimatorEZpvd.copydefault();
                } else {
                    stateListAnimator.KWHzl();
                    return stateListAnimator.copydefault();
                }
            }
        }
    }
}
