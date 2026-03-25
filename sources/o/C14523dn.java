package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.Advanceable;
import o.C5098Eq;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C14523dn {
    public static final Advanceable copydefault(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        Advanceable.Application application = new Advanceable.Application();
        AbstractC5105Ex.PendingIntent pendingIntent = AbstractC5105Ex.PendingIntent.copydefault;
        C5101Et c5101Et = new C5101Et(pendingIntent, new EX("DurationMillis"));
        C5101Et c5101Et2 = new C5101Et(pendingIntent, new EX("EndTimestampMillis"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("ModerationLabel"));
        C5101Et c5101Et4 = new C5101Et(pendingIntent, new EX("StartTimestampMillis"));
        C5101Et c5101Et5 = new C5101Et(pendingIntent, new EX("Timestamp"));
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
                application.EZpvd(java.lang.Long.valueOf(stateListAnimatorEZpvd.AYXKKw()));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    application.OLrzqt(java.lang.Long.valueOf(stateListAnimatorEZpvd.AYXKKw()));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        application.EZpvd(C26477jd.AEQbTJ(interfaceC5095En));
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            application.copydefault(java.lang.Long.valueOf(stateListAnimatorEZpvd.AYXKKw()));
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                application.EZpvd(stateListAnimatorEZpvd.AYXKKw());
                            } else if (numOLrzqt != null) {
                                stateListAnimatorEZpvd.copydefault();
                            } else {
                                application.EZpvd();
                                return application.AEQbTJ();
                            }
                        }
                    }
                }
            }
        }
    }
}
