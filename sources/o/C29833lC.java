package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.C8986bN;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C29833lC {
    public static final C8986bN copydefault(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        C8986bN.TaskDescription taskDescription = new C8986bN.TaskDescription();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("KinesisVideoStream"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                taskDescription.OLrzqt(C21887hQ.KWHzl(interfaceC5095En));
            } else if (numOLrzqt != null) {
                stateListAnimatorEZpvd.copydefault();
            } else {
                taskDescription.KWHzl();
                return taskDescription.EZpvd();
            }
        }
    }
}
