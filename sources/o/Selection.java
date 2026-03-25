package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.FileObserver;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class Selection {
    public static final FileObserver copydefault(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        FileObserver.StateListAnimator stateListAnimator = new FileObserver.StateListAnimator();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("DocumentClassifierName"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.SharedElementCallback.AEQbTJ, new EX("LatestVersionCreatedAt"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("LatestVersionName"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("LatestVersionStatus"));
        C5101Et c5101Et5 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("NumberOfVersions"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                stateListAnimator.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    stateListAnimator.EZpvd(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        stateListAnimator.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo());
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            stateListAnimator.EZpvd(OnObbStateChangeListener.OLrzqt.copydefault(stateListAnimatorEZpvd.fetchVPNInfo()));
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                stateListAnimator.EZpvd(java.lang.Integer.valueOf(stateListAnimatorEZpvd.djBIcL()));
                            } else if (numOLrzqt != null) {
                                stateListAnimatorEZpvd.copydefault();
                            } else {
                                stateListAnimator.copydefault();
                                return stateListAnimator.AEQbTJ();
                            }
                        }
                    }
                }
            }
        }
    }
}
