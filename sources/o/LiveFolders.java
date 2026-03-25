package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.NetworkInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class LiveFolders {
    public static final NetworkInfo KWHzl(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        NetworkInfo.Application application = new NetworkInfo.Application();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("Index"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("Languages"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                application.OLrzqt(java.lang.Integer.valueOf(stateListAnimatorEZpvd.djBIcL()));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    InterfaceC5095En.ActionBar actionBarKWHzl = interfaceC5095En.KWHzl(c5101Et2);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (actionBarKWHzl.EZpvd()) {
                        if (!actionBarKWHzl.copydefault()) {
                            actionBarKWHzl.gEmmrt();
                        } else {
                            arrayList.add(TextUtils.KWHzl(interfaceC5095En));
                        }
                    }
                    application.EZpvd(arrayList);
                } else if (numOLrzqt != null) {
                    stateListAnimatorEZpvd.copydefault();
                } else {
                    application.KWHzl();
                    return application.AEQbTJ();
                }
            }
        }
    }
}
