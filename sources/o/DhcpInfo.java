package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.JobInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DhcpInfo {
    public static final JobInfo OLrzqt(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        JobInfo.Activity activity = new JobInfo.Activity();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.TaskDescription.OLrzqt, new EX("CaseSensitive"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity2 = new C5098Eq.Activity();
        activity2.EZpvd(c5101Et);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity2.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                activity.AEQbTJ(java.lang.Boolean.valueOf(stateListAnimatorEZpvd.AEQbTJ()));
            } else if (numOLrzqt != null) {
                stateListAnimatorEZpvd.copydefault();
            } else {
                activity.KWHzl();
                return activity.OLrzqt();
            }
        }
    }
}
