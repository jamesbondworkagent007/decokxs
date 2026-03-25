package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C32303mX;
import o.C5098Eq;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C38948pj {
    public static final C32303mX KWHzl(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        C32303mX.StateListAnimator stateListAnimator = new C32303mX.StateListAnimator();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("AdapterId"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("AdapterVersion"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.SharedElementCallback.AEQbTJ, new EX("CreationTime"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("FeatureTypes"));
        C5101Et c5101Et5 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("Status"));
        C5101Et c5101Et6 = new C5101Et(loaderManager, new EX("StatusMessage"));
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
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                stateListAnimator.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    stateListAnimator.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        stateListAnimator.EZpvd(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault4) {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                stateListAnimator.KWHzl(AbstractC32276mW.OLrzqt.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo()));
                            } else {
                                int iCopydefault6 = c5101Et6.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    stateListAnimator.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                                } else if (numOLrzqt != null) {
                                    stateListAnimatorEZpvd.copydefault();
                                } else {
                                    stateListAnimator.OLrzqt();
                                    return stateListAnimator.EZpvd();
                                }
                            }
                        } else {
                            InterfaceC5095En.ActionBar actionBarKWHzl = interfaceC5095En.KWHzl(c5101Et4);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            while (actionBarKWHzl.EZpvd()) {
                                if (!actionBarKWHzl.copydefault()) {
                                    actionBarKWHzl.gEmmrt();
                                } else {
                                    arrayList.add(AbstractC33846nI.EZpvd.copydefault(actionBarKWHzl.fetchVPNInfo()));
                                }
                            }
                            stateListAnimator.AEQbTJ(arrayList);
                        }
                    }
                }
            }
        }
    }
}
