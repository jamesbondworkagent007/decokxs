package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C11914cd;
import o.C5098Eq;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C30379lZ {
    public static final C11914cd AEQbTJ(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        C11914cd.StateListAnimator stateListAnimator = new C11914cd.StateListAnimator();
        AbstractC5105Ex.PictureInPictureParams pictureInPictureParams = AbstractC5105Ex.PictureInPictureParams.KWHzl;
        C5101Et c5101Et = new C5101Et(pictureInPictureParams, new EX("Input"));
        C5101Et c5101Et2 = new C5101Et(pictureInPictureParams, new EX("Output"));
        C5101Et c5101Et3 = new C5101Et(pictureInPictureParams, new EX("Validation"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                stateListAnimator.AEQbTJ(C30377lX.KWHzl(interfaceC5095En));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    stateListAnimator.EZpvd(C30377lX.KWHzl(interfaceC5095En));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        stateListAnimator.AEQbTJ(C33470mx.AEQbTJ(interfaceC5095En));
                    } else if (numOLrzqt != null) {
                        stateListAnimatorEZpvd.copydefault();
                    } else {
                        stateListAnimator.KWHzl();
                        return stateListAnimator.OLrzqt();
                    }
                }
            }
        }
    }
}
