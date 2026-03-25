package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.C56292y;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C22076hX {
    public static final C56292y KWHzl(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        C56292y.Activity activity = new C56292y.Activity();
        AbstractC5105Ex.PendingIntent pendingIntent = AbstractC5105Ex.PendingIntent.copydefault;
        C5101Et c5101Et = new C5101Et(pendingIntent, new EX("DurationMillis"));
        C5101Et c5101Et2 = new C5101Et(pendingIntent, new EX("EndTimestampMillis"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("Label"));
        C5101Et c5101Et4 = new C5101Et(pendingIntent, new EX("StartTimestampMillis"));
        C5101Et c5101Et5 = new C5101Et(pendingIntent, new EX("Timestamp"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity2 = new C5098Eq.Activity();
        activity2.EZpvd(c5101Et);
        activity2.EZpvd(c5101Et2);
        activity2.EZpvd(c5101Et3);
        activity2.EZpvd(c5101Et4);
        activity2.EZpvd(c5101Et5);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity2.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                activity.KWHzl(java.lang.Long.valueOf(stateListAnimatorEZpvd.AYXKKw()));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    activity.EZpvd(java.lang.Long.valueOf(stateListAnimatorEZpvd.AYXKKw()));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        activity.copydefault(C24291ib.AEQbTJ(interfaceC5095En));
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            activity.OLrzqt(java.lang.Long.valueOf(stateListAnimatorEZpvd.AYXKKw()));
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                activity.AEQbTJ(stateListAnimatorEZpvd.AYXKKw());
                            } else if (numOLrzqt != null) {
                                stateListAnimatorEZpvd.copydefault();
                            } else {
                                activity.AEQbTJ();
                                return activity.copydefault();
                            }
                        }
                    }
                }
            }
        }
    }
}
