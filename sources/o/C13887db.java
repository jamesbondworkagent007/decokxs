package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.ActionMenuPresenter;
import o.C5098Eq;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C13887db {
    public static final ActionMenuPresenter copydefault(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        ActionMenuPresenter.TaskDescription taskDescription = new ActionMenuPresenter.TaskDescription();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("Face"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.ActionBar.EZpvd, new EX("Similarity"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                taskDescription.copydefault(C14046de.AEQbTJ(interfaceC5095En));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    taskDescription.KWHzl(java.lang.Float.valueOf(stateListAnimatorEZpvd.valueOf()));
                } else if (numOLrzqt != null) {
                    stateListAnimatorEZpvd.copydefault();
                } else {
                    taskDescription.EZpvd();
                    return taskDescription.AEQbTJ();
                }
            }
        }
    }
}
