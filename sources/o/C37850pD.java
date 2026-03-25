package o;

import com.google.common.net.HttpHeaders;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C35000nn;
import o.C5098Eq;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C37850pD {
    public static final C35000nn copydefault(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        C35000nn.Application application = new C35000nn.Application();
        AbstractC5105Ex.ActionBar actionBar = AbstractC5105Ex.ActionBar.EZpvd;
        C5101Et c5101Et = new C5101Et(actionBar, new EX("Height"));
        C5101Et c5101Et2 = new C5101Et(actionBar, new EX("Left"));
        C5101Et c5101Et3 = new C5101Et(actionBar, new EX("Top"));
        C5101Et c5101Et4 = new C5101Et(actionBar, new EX(HttpHeaders.WIDTH));
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
                application.KWHzl(stateListAnimatorEZpvd.valueOf());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    application.copydefault(stateListAnimatorEZpvd.valueOf());
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        application.EZpvd(stateListAnimatorEZpvd.valueOf());
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            application.OLrzqt(stateListAnimatorEZpvd.valueOf());
                        } else if (numOLrzqt != null) {
                            stateListAnimatorEZpvd.copydefault();
                        } else {
                            application.KWHzl();
                            return application.OLrzqt();
                        }
                    }
                }
            }
        }
    }
}
