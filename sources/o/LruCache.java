package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.ServiceConnectionLeakedViolation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class LruCache {
    public static final ServiceConnectionLeakedViolation AEQbTJ(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        ServiceConnectionLeakedViolation.Activity activity = new ServiceConnectionLeakedViolation.Activity();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("MaskCharacter"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("MaskMode"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("PiiEntityTypes"));
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
                    activity.OLrzqt(CustomViolation.KWHzl.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        InterfaceC5095En.ActionBar actionBarKWHzl = interfaceC5095En.KWHzl(c5101Et3);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        while (actionBarKWHzl.EZpvd()) {
                            if (!actionBarKWHzl.copydefault()) {
                                actionBarKWHzl.gEmmrt();
                            } else {
                                arrayList.add(NetworkViolation.KWHzl.AEQbTJ(actionBarKWHzl.fetchVPNInfo()));
                            }
                        }
                        activity.KWHzl(arrayList);
                    } else if (numOLrzqt != null) {
                        stateListAnimatorEZpvd.copydefault();
                    } else {
                        activity.AEQbTJ();
                        return activity.EZpvd();
                    }
                }
            }
        }
    }
}
