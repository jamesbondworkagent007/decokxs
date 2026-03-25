package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C33900nK;
import o.C5098Eq;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C40974qi {
    public static final C33900nK KWHzl(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        C33900nK.TaskDescription taskDescription = new C33900nK.TaskDescription();
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("ExpenseDocument"));
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("IdentityDocument"));
        C5101Et c5101Et3 = new C5101Et(pictureInPictureParams, new EX("LendingDocument"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                taskDescription.KWHzl(C40868qg.copydefault(interfaceC5095En));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    taskDescription.EZpvd(C40415qV.copydefault(interfaceC5095En));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        taskDescription.KWHzl(C42949rg.KWHzl(interfaceC5095En));
                    } else if (numOLrzqt != null) {
                        stateListAnimatorEZpvd.copydefault();
                    } else {
                        taskDescription.OLrzqt();
                        return taskDescription.EZpvd();
                    }
                }
            }
        }
    }
}
