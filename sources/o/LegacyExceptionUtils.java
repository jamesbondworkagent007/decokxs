package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.NotificationChannel;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class LegacyExceptionUtils {
    public static final NotificationChannel EZpvd(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        NotificationChannel.Activity activity = new NotificationChannel.Activity();
        AbstractC5105Ex.FragmentManager fragmentManager = AbstractC5105Ex.FragmentManager.AEQbTJ;
        C5101Et c5101Et = new C5101Et(fragmentManager, new EX("MinimumLength"));
        AbstractC5105Ex.TaskDescription taskDescription = AbstractC5105Ex.TaskDescription.OLrzqt;
        C5101Et c5101Et2 = new C5101Et(taskDescription, new EX("RequireLowercase"));
        C5101Et c5101Et3 = new C5101Et(taskDescription, new EX("RequireNumbers"));
        C5101Et c5101Et4 = new C5101Et(taskDescription, new EX("RequireSymbols"));
        C5101Et c5101Et5 = new C5101Et(taskDescription, new EX("RequireUppercase"));
        C5101Et c5101Et6 = new C5101Et(fragmentManager, new EX("TemporaryPasswordValidityDays"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity2 = new C5098Eq.Activity();
        activity2.EZpvd(c5101Et);
        activity2.EZpvd(c5101Et2);
        activity2.EZpvd(c5101Et3);
        activity2.EZpvd(c5101Et4);
        activity2.EZpvd(c5101Et5);
        activity2.EZpvd(c5101Et6);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity2.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                activity.KWHzl(java.lang.Integer.valueOf(stateListAnimatorEZpvd.djBIcL()));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    activity.OLrzqt(stateListAnimatorEZpvd.AEQbTJ());
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        activity.EZpvd(stateListAnimatorEZpvd.AEQbTJ());
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            activity.AEQbTJ(stateListAnimatorEZpvd.AEQbTJ());
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                activity.copydefault(stateListAnimatorEZpvd.AEQbTJ());
                            } else {
                                int iCopydefault6 = c5101Et6.copydefault();
                                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault6) {
                                    activity.AEQbTJ(stateListAnimatorEZpvd.djBIcL());
                                } else if (numOLrzqt != null) {
                                    stateListAnimatorEZpvd.copydefault();
                                } else {
                                    activity.OLrzqt();
                                    return activity.KWHzl();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
