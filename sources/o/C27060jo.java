package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.C7980au;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C27060jo {
    public static final C7980au KWHzl(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        C7980au.ActionBar actionBar = new C7980au.ActionBar();
        AbstractC5105Ex.ActionBar actionBar2 = AbstractC5105Ex.ActionBar.EZpvd;
        C5101Et c5101Et = new C5101Et(actionBar2, new EX("X"));
        C5101Et c5101Et2 = new C5101Et(actionBar2, new EX("Y"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                actionBar.OLrzqt(java.lang.Float.valueOf(stateListAnimatorEZpvd.valueOf()));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    actionBar.EZpvd(java.lang.Float.valueOf(stateListAnimatorEZpvd.valueOf()));
                } else if (numOLrzqt != null) {
                    stateListAnimatorEZpvd.copydefault();
                } else {
                    actionBar.copydefault();
                    return actionBar.OLrzqt();
                }
            }
        }
    }
}
