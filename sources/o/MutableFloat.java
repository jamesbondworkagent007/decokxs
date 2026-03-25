package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.WebViewMethodCalledOnWrongThreadViolation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class MutableFloat {
    public static final WebViewMethodCalledOnWrongThreadViolation EZpvd(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        WebViewMethodCalledOnWrongThreadViolation.Activity activity = new WebViewMethodCalledOnWrongThreadViolation.Activity();
        AbstractC5105Ex.ActionBar actionBar = AbstractC5105Ex.ActionBar.EZpvd;
        C5101Et c5101Et = new C5101Et(actionBar, new EX("Mixed"));
        C5101Et c5101Et2 = new C5101Et(actionBar, new EX("Negative"));
        C5101Et c5101Et3 = new C5101Et(actionBar, new EX("Neutral"));
        C5101Et c5101Et4 = new C5101Et(actionBar, new EX("Positive"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity2 = new C5098Eq.Activity();
        activity2.EZpvd(c5101Et);
        activity2.EZpvd(c5101Et2);
        activity2.EZpvd(c5101Et3);
        activity2.EZpvd(c5101Et4);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity2.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                activity.AEQbTJ(java.lang.Float.valueOf(stateListAnimatorEZpvd.valueOf()));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    activity.copydefault(java.lang.Float.valueOf(stateListAnimatorEZpvd.valueOf()));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        activity.EZpvd(java.lang.Float.valueOf(stateListAnimatorEZpvd.valueOf()));
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            activity.OLrzqt(java.lang.Float.valueOf(stateListAnimatorEZpvd.valueOf()));
                        } else if (numOLrzqt != null) {
                            stateListAnimatorEZpvd.copydefault();
                        } else {
                            activity.AEQbTJ();
                            return activity.copydefault();
                        }
                    }
                }
            }
        }
    }
}
