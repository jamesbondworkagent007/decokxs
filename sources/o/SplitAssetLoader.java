package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.NavigationRes;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SplitAssetLoader {
    public static final NavigationRes copydefault(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        NavigationRes.TaskDescription taskDescription = new NavigationRes.TaskDescription();
        AbstractC5105Ex.TaskDescription taskDescription2 = AbstractC5105Ex.TaskDescription.OLrzqt;
        C5101Et c5101Et = new C5101Et(taskDescription2, new EX("ChallengeRequiredOnNewDevice"));
        C5101Et c5101Et2 = new C5101Et(taskDescription2, new EX("DeviceOnlyRememberedOnUserPrompt"));
        C5098Eq.TaskDescription taskDescription3 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                taskDescription.EZpvd(stateListAnimatorEZpvd.AEQbTJ());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    taskDescription.KWHzl(stateListAnimatorEZpvd.AEQbTJ());
                } else if (numOLrzqt != null) {
                    stateListAnimatorEZpvd.copydefault();
                } else {
                    taskDescription.AEQbTJ();
                    return taskDescription.OLrzqt();
                }
            }
        }
    }
}
