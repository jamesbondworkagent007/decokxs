package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.Proxy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ExportResult {
    public static final Proxy EZpvd(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        Proxy.Activity activity = new Proxy.Activity();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("ErrorCode"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("ErrorMessage"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("Index"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity2 = new C5098Eq.Activity();
        activity2.EZpvd(c5101Et);
        activity2.EZpvd(c5101Et2);
        activity2.EZpvd(c5101Et3);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity2.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                activity.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    activity.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        activity.AEQbTJ(java.lang.Integer.valueOf(stateListAnimatorEZpvd.djBIcL()));
                    } else if (numOLrzqt != null) {
                        stateListAnimatorEZpvd.copydefault();
                    } else {
                        activity.copydefault();
                        return activity.KWHzl();
                    }
                }
            }
        }
    }
}
