package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.TabHost;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C20712gm {
    public static final TabHost OLrzqt(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        TabHost.Activity activity = new TabHost.Activity();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("CollectionId"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.ActionBar.EZpvd, new EX("FaceMatchThreshold"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity2 = new C5098Eq.Activity();
        activity2.EZpvd(c5101Et);
        activity2.EZpvd(c5101Et2);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity2.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                activity.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    activity.KWHzl(java.lang.Float.valueOf(stateListAnimatorEZpvd.valueOf()));
                } else if (numOLrzqt != null) {
                    stateListAnimatorEZpvd.copydefault();
                } else {
                    activity.OLrzqt();
                    return activity.AEQbTJ();
                }
            }
        }
    }
}
