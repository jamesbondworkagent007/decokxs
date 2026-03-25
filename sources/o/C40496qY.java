package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C36655of;
import o.C5098Eq;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C40496qY {
    public static final C36655of AEQbTJ(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        C36655of.Activity activity = new C36655of.Activity();
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("Type"));
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("ValueDetection"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity2 = new C5098Eq.Activity();
        activity2.EZpvd(c5101Et);
        activity2.EZpvd(c5101Et2);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity2.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                activity.EZpvd(C39635pw.copydefault(interfaceC5095En));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    activity.AEQbTJ(C39635pw.copydefault(interfaceC5095En));
                } else if (numOLrzqt != null) {
                    stateListAnimatorEZpvd.copydefault();
                } else {
                    activity.EZpvd();
                    return activity.AEQbTJ();
                }
            }
        }
    }
}
