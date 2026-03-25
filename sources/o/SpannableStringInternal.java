package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.HardwarePropertiesManager;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SpannableStringInternal {
    public static final HardwarePropertiesManager KWHzl(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        HardwarePropertiesManager.TaskDescription taskDescription = new HardwarePropertiesManager.TaskDescription();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("Page"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("Type"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                taskDescription.OLrzqt(java.lang.Integer.valueOf(stateListAnimatorEZpvd.djBIcL()));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    taskDescription.copydefault(HandlerExecutor.EZpvd.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo()));
                } else if (numOLrzqt != null) {
                    stateListAnimatorEZpvd.copydefault();
                } else {
                    taskDescription.AEQbTJ();
                    return taskDescription.copydefault();
                }
            }
        }
    }
}
