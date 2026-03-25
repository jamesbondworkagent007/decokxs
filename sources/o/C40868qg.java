package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C33711nD;
import o.C5098Eq;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C40868qg {
    public static final C33711nD copydefault(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        C33711nD.Activity activity = new C33711nD.Activity();
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et = new C5101Et(fragment, new EX("Blocks"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("ExpenseIndex"));
        C5101Et c5101Et3 = new C5101Et(fragment, new EX("LineItemGroups"));
        C5101Et c5101Et4 = new C5101Et(fragment, new EX("SummaryFields"));
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
            if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault) {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    activity.OLrzqt(java.lang.Integer.valueOf(stateListAnimatorEZpvd.djBIcL()));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault3) {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            InterfaceC5095En.ActionBar actionBarKWHzl = interfaceC5095En.KWHzl(c5101Et4);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            while (actionBarKWHzl.EZpvd()) {
                                if (!actionBarKWHzl.copydefault()) {
                                    actionBarKWHzl.gEmmrt();
                                } else {
                                    arrayList.add(C40762qe.copydefault(interfaceC5095En));
                                }
                            }
                            activity.OLrzqt(arrayList);
                        } else if (numOLrzqt != null) {
                            stateListAnimatorEZpvd.copydefault();
                        } else {
                            activity.AEQbTJ();
                            return activity.copydefault();
                        }
                    } else {
                        InterfaceC5095En.ActionBar actionBarKWHzl2 = interfaceC5095En.KWHzl(c5101Et3);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        while (actionBarKWHzl2.EZpvd()) {
                            if (!actionBarKWHzl2.copydefault()) {
                                actionBarKWHzl2.gEmmrt();
                            } else {
                                arrayList2.add(C43320rn.KWHzl(interfaceC5095En));
                            }
                        }
                        activity.KWHzl(arrayList2);
                    }
                }
            } else {
                InterfaceC5095En.ActionBar actionBarKWHzl3 = interfaceC5095En.KWHzl(c5101Et);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                while (actionBarKWHzl3.EZpvd()) {
                    if (!actionBarKWHzl3.copydefault()) {
                        actionBarKWHzl3.gEmmrt();
                    } else {
                        arrayList3.add(C39688px.KWHzl(interfaceC5095En));
                    }
                }
                activity.EZpvd(arrayList3);
            }
        }
    }
}
