package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.Enum;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ThreadDeath {
    public static final Enum EZpvd(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        Enum.ActionBar actionBar = new Enum.ActionBar();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("AccessKeyId"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.SharedElementCallback.AEQbTJ, new EX("Expiration"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("SecretKey"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("SessionToken"));
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
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                actionBar.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    actionBar.copydefault(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        actionBar.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            actionBar.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                        } else if (numOLrzqt != null) {
                            stateListAnimatorEZpvd.copydefault();
                        } else {
                            actionBar.KWHzl();
                            return actionBar.OLrzqt();
                        }
                    }
                }
            }
        }
    }
}
