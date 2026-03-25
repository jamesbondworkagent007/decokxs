package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.C9622bZ;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C30347lV {
    public static final C9622bZ OLrzqt(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        C9622bZ.ActionBar actionBar = new C9622bZ.ActionBar();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.ActionBar.EZpvd, new EX("Confidence"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("Type"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                actionBar.EZpvd(java.lang.Float.valueOf(stateListAnimatorEZpvd.valueOf()));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    actionBar.copydefault(AbstractC9463bW.OLrzqt.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                } else if (numOLrzqt != null) {
                    stateListAnimatorEZpvd.copydefault();
                } else {
                    actionBar.KWHzl();
                    return actionBar.copydefault();
                }
            }
        }
    }
}
