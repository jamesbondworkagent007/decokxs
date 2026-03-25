package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C36761oh;
import o.C5098Eq;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C43426rp {
    public static final C36761oh AEQbTJ(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        C36761oh.StateListAnimator stateListAnimator = new C36761oh.StateListAnimator();
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et = new C5101Et(fragment, new EX("DocumentGroups"));
        C5101Et c5101Et2 = new C5101Et(fragment, new EX("UndetectedDocumentTypes"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault) {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    InterfaceC5095En.ActionBar actionBarKWHzl = interfaceC5095En.KWHzl(c5101Et2);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (actionBarKWHzl.EZpvd()) {
                        if (!actionBarKWHzl.copydefault()) {
                            actionBarKWHzl.gEmmrt();
                        } else {
                            arrayList.add(actionBarKWHzl.fetchVPNInfo());
                        }
                    }
                    stateListAnimator.KWHzl(arrayList);
                } else if (numOLrzqt != null) {
                    stateListAnimatorEZpvd.copydefault();
                } else {
                    stateListAnimator.OLrzqt();
                    return stateListAnimator.KWHzl();
                }
            } else {
                InterfaceC5095En.ActionBar actionBarKWHzl2 = interfaceC5095En.KWHzl(c5101Et);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                while (actionBarKWHzl2.EZpvd()) {
                    if (!actionBarKWHzl2.copydefault()) {
                        actionBarKWHzl2.gEmmrt();
                    } else {
                        arrayList2.add(C38444pZ.OLrzqt(interfaceC5095En));
                    }
                }
                stateListAnimator.AEQbTJ(arrayList2);
            }
        }
    }
}
