package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.C7715ap;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C26954jm {
    public static final C7715ap copydefault(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        C7715ap.ActionBar actionBar = new C7715ap.ActionBar();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("FaceMatches"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.PictureInPictureParams.KWHzl, new EX("Person"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.PendingIntent.copydefault, new EX("Timestamp"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault) {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    actionBar.copydefault(C26742ji.copydefault(interfaceC5095En));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        actionBar.copydefault(stateListAnimatorEZpvd.AYXKKw());
                    } else if (numOLrzqt != null) {
                        stateListAnimatorEZpvd.copydefault();
                    } else {
                        actionBar.OLrzqt();
                        return actionBar.AEQbTJ();
                    }
                }
            } else {
                InterfaceC5095En.ActionBar actionBarKWHzl = interfaceC5095En.KWHzl(c5101Et);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (actionBarKWHzl.EZpvd()) {
                    if (!actionBarKWHzl.copydefault()) {
                        actionBarKWHzl.gEmmrt();
                    } else {
                        arrayList.add(C20447gh.EZpvd(interfaceC5095En));
                    }
                }
                actionBar.AEQbTJ(arrayList);
            }
        }
    }
}
