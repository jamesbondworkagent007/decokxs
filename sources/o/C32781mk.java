package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C12548cp;
import o.C5098Eq;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C32781mk {
    public static final C12548cp EZpvd(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        C12548cp.Activity activity = new C12548cp.Activity();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.ActionBar.EZpvd, new EX("Confidence"));
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("FaceId"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("Reasons"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("UserId"));
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
                activity.copydefault(java.lang.Float.valueOf(stateListAnimatorEZpvd.valueOf()));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    activity.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault3) {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            activity.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
                        } else if (numOLrzqt != null) {
                            stateListAnimatorEZpvd.copydefault();
                        } else {
                            activity.copydefault();
                            return activity.KWHzl();
                        }
                    } else {
                        InterfaceC5095En.ActionBar actionBarKWHzl = interfaceC5095En.KWHzl(c5101Et3);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        while (actionBarKWHzl.EZpvd()) {
                            if (!actionBarKWHzl.copydefault()) {
                                actionBarKWHzl.gEmmrt();
                            } else {
                                arrayList.add(AbstractC12391cm.AEQbTJ.AEQbTJ(actionBarKWHzl.fetchVPNInfo()));
                            }
                        }
                        activity.AEQbTJ(arrayList);
                    }
                }
            }
        }
    }
}
