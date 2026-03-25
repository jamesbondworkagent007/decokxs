package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C47280tn;
import o.C5098Eq;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C48562uW {
    public static final C47280tn copydefault(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        C47280tn.Application application = new C47280tn.Application();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("ContentType"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("S3Uri"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                application.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    application.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                } else if (numOLrzqt != null) {
                    stateListAnimatorEZpvd.copydefault();
                } else {
                    application.KWHzl();
                    return application.EZpvd();
                }
            }
        }
    }
}
