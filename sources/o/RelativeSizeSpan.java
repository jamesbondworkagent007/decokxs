package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.StrictMode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class RelativeSizeSpan {
    public static final StrictMode KWHzl(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        StrictMode.Application application = new StrictMode.Application();
        AbstractC5105Ex.FragmentManager fragmentManager = AbstractC5105Ex.FragmentManager.AEQbTJ;
        C5101Et c5101Et = new C5101Et(fragmentManager, new EX("BeginOffset"));
        C5101Et c5101Et2 = new C5101Et(fragmentManager, new EX("EndOffset"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.ActionBar.EZpvd, new EX("Score"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("Text"));
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
                application.EZpvd(java.lang.Integer.valueOf(stateListAnimatorEZpvd.djBIcL()));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    application.copydefault(java.lang.Integer.valueOf(stateListAnimatorEZpvd.djBIcL()));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        application.copydefault(java.lang.Float.valueOf(stateListAnimatorEZpvd.valueOf()));
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            application.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                        } else if (numOLrzqt != null) {
                            stateListAnimatorEZpvd.copydefault();
                        } else {
                            application.OLrzqt();
                            return application.copydefault();
                        }
                    }
                }
            }
        }
    }
}
