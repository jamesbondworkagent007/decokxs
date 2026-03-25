package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.FileUriExposedException;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SpanWatcher {
    public static final FileUriExposedException KWHzl(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        FileUriExposedException.Activity activity = new FileUriExposedException.Activity();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.Fragment.KWHzl, new EX("ExtractedCharacters"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("Pages"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity2 = new C5098Eq.Activity();
        activity2.EZpvd(c5101Et);
        activity2.EZpvd(c5101Et2);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity2.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault) {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    activity.EZpvd(java.lang.Integer.valueOf(stateListAnimatorEZpvd.djBIcL()));
                } else if (numOLrzqt != null) {
                    stateListAnimatorEZpvd.copydefault();
                } else {
                    activity.AEQbTJ();
                    return activity.copydefault();
                }
            } else {
                InterfaceC5095En.ActionBar actionBarKWHzl = interfaceC5095En.KWHzl(c5101Et);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (actionBarKWHzl.EZpvd()) {
                    if (!actionBarKWHzl.copydefault()) {
                        actionBarKWHzl.gEmmrt();
                    } else {
                        arrayList.add(TimeKeyListener.AEQbTJ(interfaceC5095En));
                    }
                }
                activity.copydefault(arrayList);
            }
        }
    }
}
