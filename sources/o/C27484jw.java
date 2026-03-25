package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.C5893aF;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C27484jw {
    public static final C5893aF EZpvd(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        C5893aF.Activity activity = new C5893aF.Activity();
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et = new C5101Et(fragment, new EX("PersonsIndeterminate"));
        C5101Et c5101Et2 = new C5101Et(fragment, new EX("PersonsWithRequiredEquipment"));
        C5101Et c5101Et3 = new C5101Et(fragment, new EX("PersonsWithoutRequiredEquipment"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity2 = new C5098Eq.Activity();
        activity2.EZpvd(c5101Et);
        activity2.EZpvd(c5101Et2);
        activity2.EZpvd(c5101Et3);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity2.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault) {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault2) {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        InterfaceC5095En.ActionBar actionBarKWHzl = interfaceC5095En.KWHzl(c5101Et3);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        while (actionBarKWHzl.EZpvd()) {
                            if (!actionBarKWHzl.copydefault()) {
                                actionBarKWHzl.gEmmrt();
                            } else {
                                arrayList.add(java.lang.Integer.valueOf(actionBarKWHzl.djBIcL()));
                            }
                        }
                        activity.OLrzqt(arrayList);
                    } else if (numOLrzqt != null) {
                        stateListAnimatorEZpvd.copydefault();
                    } else {
                        activity.KWHzl();
                        return activity.copydefault();
                    }
                } else {
                    InterfaceC5095En.ActionBar actionBarKWHzl2 = interfaceC5095En.KWHzl(c5101Et2);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    while (actionBarKWHzl2.EZpvd()) {
                        if (!actionBarKWHzl2.copydefault()) {
                            actionBarKWHzl2.gEmmrt();
                        } else {
                            arrayList2.add(java.lang.Integer.valueOf(actionBarKWHzl2.djBIcL()));
                        }
                    }
                    activity.EZpvd(arrayList2);
                }
            } else {
                InterfaceC5095En.ActionBar actionBarKWHzl3 = interfaceC5095En.KWHzl(c5101Et);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                while (actionBarKWHzl3.EZpvd()) {
                    if (!actionBarKWHzl3.copydefault()) {
                        actionBarKWHzl3.gEmmrt();
                    } else {
                        arrayList3.add(java.lang.Integer.valueOf(actionBarKWHzl3.djBIcL()));
                    }
                }
                activity.copydefault(arrayList3);
            }
        }
    }
}
