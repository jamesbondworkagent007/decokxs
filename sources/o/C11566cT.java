package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.WebViewFactoryProvider;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C11566cT {
    public static final WebViewFactoryProvider KWHzl(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        WebViewFactoryProvider.Application application = new WebViewFactoryProvider.Application();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("Codec"));
        AbstractC5105Ex.PendingIntent pendingIntent = AbstractC5105Ex.PendingIntent.copydefault;
        C5101Et c5101Et2 = new C5101Et(pendingIntent, new EX("DurationMillis"));
        C5101Et c5101Et3 = new C5101Et(pendingIntent, new EX("NumberOfChannels"));
        C5101Et c5101Et4 = new C5101Et(pendingIntent, new EX("SampleRate"));
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
                application.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    application.AEQbTJ(java.lang.Long.valueOf(stateListAnimatorEZpvd.AYXKKw()));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        application.EZpvd(java.lang.Long.valueOf(stateListAnimatorEZpvd.AYXKKw()));
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            application.KWHzl(java.lang.Long.valueOf(stateListAnimatorEZpvd.AYXKKw()));
                        } else if (numOLrzqt != null) {
                            stateListAnimatorEZpvd.copydefault();
                        } else {
                            application.AEQbTJ();
                            return application.KWHzl();
                        }
                    }
                }
            }
        }
    }
}
