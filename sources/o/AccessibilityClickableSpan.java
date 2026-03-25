package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.RemoteCallbackList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class AccessibilityClickableSpan {
    public static final RemoteCallbackList EZpvd(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        RemoteCallbackList.Activity activity = new RemoteCallbackList.Activity();
        AbstractC5105Ex.Activity activity2 = AbstractC5105Ex.Activity.OLrzqt;
        C5101Et c5101Et = new C5101Et(activity2, new EX("AverageAccuracy"));
        C5101Et c5101Et2 = new C5101Et(activity2, new EX("AverageF1Score"));
        C5101Et c5101Et3 = new C5101Et(activity2, new EX("AveragePrecision"));
        C5101Et c5101Et4 = new C5101Et(activity2, new EX("AverageRecall"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity3 = new C5098Eq.Activity();
        activity3.EZpvd(c5101Et);
        activity3.EZpvd(c5101Et2);
        activity3.EZpvd(c5101Et3);
        activity3.EZpvd(c5101Et4);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity3.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                activity.AEQbTJ(java.lang.Double.valueOf(stateListAnimatorEZpvd.AhwBna()));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    activity.EZpvd(java.lang.Double.valueOf(stateListAnimatorEZpvd.AhwBna()));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        activity.KWHzl(java.lang.Double.valueOf(stateListAnimatorEZpvd.AhwBna()));
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            activity.OLrzqt(java.lang.Double.valueOf(stateListAnimatorEZpvd.AhwBna()));
                        } else if (numOLrzqt != null) {
                            stateListAnimatorEZpvd.copydefault();
                        } else {
                            activity.copydefault();
                            return activity.OLrzqt();
                        }
                    }
                }
            }
        }
    }
}
