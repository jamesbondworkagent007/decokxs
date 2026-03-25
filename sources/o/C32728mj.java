package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C12338cl;
import o.C5098Eq;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C32728mj {
    public static final C12338cl copydefault(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        C12338cl.ActionBar actionBar = new C12338cl.ActionBar();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("FaceId"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("Reasons"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("UserId"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                actionBar.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault2) {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        actionBar.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                    } else if (numOLrzqt != null) {
                        stateListAnimatorEZpvd.copydefault();
                    } else {
                        actionBar.AEQbTJ();
                        return actionBar.copydefault();
                    }
                } else {
                    InterfaceC5095En.ActionBar actionBarKWHzl = interfaceC5095En.KWHzl(c5101Et2);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (actionBarKWHzl.EZpvd()) {
                        if (!actionBarKWHzl.copydefault()) {
                            actionBarKWHzl.gEmmrt();
                        } else {
                            arrayList.add(AbstractC12444cn.AEQbTJ.OLrzqt(actionBarKWHzl.fetchVPNInfo()));
                        }
                    }
                    actionBar.copydefault(arrayList);
                }
            }
        }
    }
}
