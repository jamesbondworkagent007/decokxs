package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C45887t;
import o.C5098Eq;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C24291ib {
    public static final C45887t AEQbTJ(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        C45887t.StateListAnimator stateListAnimator = new C45887t.StateListAnimator();
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et = new C5101Et(fragment, new EX("Aliases"));
        C5101Et c5101Et2 = new C5101Et(fragment, new EX("Categories"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.ActionBar.EZpvd, new EX("Confidence"));
        C5101Et c5101Et4 = new C5101Et(fragment, new EX("Instances"));
        C5101Et c5101Et5 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("Name"));
        C5101Et c5101Et6 = new C5101Et(fragment, new EX("Parents"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        activity.EZpvd(c5101Et6);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault) {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault2) {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        stateListAnimator.copydefault(java.lang.Float.valueOf(stateListAnimatorEZpvd.valueOf()));
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault4) {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                stateListAnimator.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                            } else {
                                int iCopydefault6 = c5101Et6.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    InterfaceC5095En.ActionBar actionBarKWHzl = interfaceC5095En.KWHzl(c5101Et6);
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    while (actionBarKWHzl.EZpvd()) {
                                        if (!actionBarKWHzl.copydefault()) {
                                            actionBarKWHzl.gEmmrt();
                                        } else {
                                            arrayList.add(C26848jk.copydefault(interfaceC5095En));
                                        }
                                    }
                                    stateListAnimator.EZpvd(arrayList);
                                } else if (numOLrzqt != null) {
                                    stateListAnimatorEZpvd.copydefault();
                                } else {
                                    stateListAnimator.KWHzl();
                                    return stateListAnimator.OLrzqt();
                                }
                            }
                        } else {
                            InterfaceC5095En.ActionBar actionBarKWHzl2 = interfaceC5095En.KWHzl(c5101Et4);
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            while (actionBarKWHzl2.EZpvd()) {
                                if (!actionBarKWHzl2.copydefault()) {
                                    actionBarKWHzl2.gEmmrt();
                                } else {
                                    arrayList2.add(C21536hD.EZpvd(interfaceC5095En));
                                }
                            }
                            stateListAnimator.copydefault(arrayList2);
                        }
                    }
                } else {
                    InterfaceC5095En.ActionBar actionBarKWHzl3 = interfaceC5095En.KWHzl(c5101Et2);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    while (actionBarKWHzl3.EZpvd()) {
                        if (!actionBarKWHzl3.copydefault()) {
                            actionBarKWHzl3.gEmmrt();
                        } else {
                            arrayList3.add(C22103hY.EZpvd(interfaceC5095En));
                        }
                    }
                    stateListAnimator.KWHzl(arrayList3);
                }
            } else {
                InterfaceC5095En.ActionBar actionBarKWHzl4 = interfaceC5095En.KWHzl(c5101Et);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                while (actionBarKWHzl4.EZpvd()) {
                    if (!actionBarKWHzl4.copydefault()) {
                        actionBarKWHzl4.gEmmrt();
                    } else {
                        arrayList4.add(C21995hU.KWHzl(interfaceC5095En));
                    }
                }
                stateListAnimator.OLrzqt(arrayList4);
            }
        }
    }
}
