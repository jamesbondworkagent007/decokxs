package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C11967ce;
import o.C5098Eq;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C30378lY {
    public static final C11967ce KWHzl(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        C11967ce.TaskDescription taskDescription = new C11967ce.TaskDescription();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.ActionBar.EZpvd, new EX("Confidence"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("DetectedText"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("Geometry"));
        AbstractC5105Ex.FragmentManager fragmentManager = AbstractC5105Ex.FragmentManager.AEQbTJ;
        C5101Et c5101Et4 = new C5101Et(fragmentManager, new EX("Id"));
        C5101Et c5101Et5 = new C5101Et(fragmentManager, new EX("ParentId"));
        C5101Et c5101Et6 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("Type"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
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
                taskDescription.AEQbTJ(java.lang.Float.valueOf(stateListAnimatorEZpvd.valueOf()));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    taskDescription.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo());
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        taskDescription.copydefault(C20765gn.OLrzqt(interfaceC5095En));
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            taskDescription.AEQbTJ(java.lang.Integer.valueOf(stateListAnimatorEZpvd.djBIcL()));
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                taskDescription.EZpvd(java.lang.Integer.valueOf(stateListAnimatorEZpvd.djBIcL()));
                            } else {
                                int iCopydefault6 = c5101Et6.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    taskDescription.KWHzl(AbstractC12020cf.copydefault.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo()));
                                } else if (numOLrzqt != null) {
                                    stateListAnimatorEZpvd.copydefault();
                                } else {
                                    taskDescription.OLrzqt();
                                    return taskDescription.EZpvd();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
