package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C35581ny;
import o.C5098Eq;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C38444pZ {
    public static final C35581ny OLrzqt(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        C35581ny.ActionBar actionBar = new C35581ny.ActionBar();
        AbstractC5105Ex.Fragment fragment = AbstractC5105Ex.Fragment.KWHzl;
        C5101Et c5101Et = new C5101Et(fragment, new EX("DetectedSignatures"));
        C5101Et c5101Et2 = new C5101Et(fragment, new EX("SplitDocuments"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("Type"));
        C5101Et c5101Et4 = new C5101Et(fragment, new EX("UndetectedSignatures"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault) {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault2) {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        actionBar.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            InterfaceC5095En.ActionBar actionBarKWHzl = interfaceC5095En.KWHzl(c5101Et4);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            while (actionBarKWHzl.EZpvd()) {
                                if (!actionBarKWHzl.copydefault()) {
                                    actionBarKWHzl.gEmmrt();
                                } else {
                                    arrayList.add(C45651su.OLrzqt(interfaceC5095En));
                                }
                            }
                            actionBar.copydefault(arrayList);
                        } else if (numOLrzqt != null) {
                            stateListAnimatorEZpvd.copydefault();
                        } else {
                            actionBar.OLrzqt();
                            return actionBar.AEQbTJ();
                        }
                    }
                } else {
                    InterfaceC5095En.ActionBar actionBarKWHzl2 = interfaceC5095En.KWHzl(c5101Et2);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    while (actionBarKWHzl2.EZpvd()) {
                        if (!actionBarKWHzl2.copydefault()) {
                            actionBarKWHzl2.gEmmrt();
                        } else {
                            arrayList2.add(C42496rV.EZpvd(interfaceC5095En));
                        }
                    }
                    actionBar.EZpvd(arrayList2);
                }
            } else {
                InterfaceC5095En.ActionBar actionBarKWHzl3 = interfaceC5095En.KWHzl(c5101Et);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                while (actionBarKWHzl3.EZpvd()) {
                    if (!actionBarKWHzl3.copydefault()) {
                        actionBarKWHzl3.gEmmrt();
                    } else {
                        arrayList3.add(C38309pU.EZpvd(interfaceC5095En));
                    }
                }
                actionBar.KWHzl(arrayList3);
            }
        }
    }
}
