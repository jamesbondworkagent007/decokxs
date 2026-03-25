package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.SharedPreferencesBackupHelper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ConnectivityThread {
    public static final SharedPreferencesBackupHelper OLrzqt(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        SharedPreferencesBackupHelper.TaskDescription taskDescription = new SharedPreferencesBackupHelper.TaskDescription();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("PasswordPolicy"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                taskDescription.OLrzqt(LegacyExceptionUtils.EZpvd(interfaceC5095En));
            } else if (numOLrzqt != null) {
                stateListAnimatorEZpvd.copydefault();
            } else {
                taskDescription.copydefault();
                return taskDescription.AEQbTJ();
            }
        }
    }
}
