package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C53945wv {
    public static final void copydefault(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C48882ue c48882ue) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c48882ue, "");
        AbstractC5105Ex.StateListAnimator stateListAnimator = AbstractC5105Ex.StateListAnimator.copydefault;
        C5101Et c5101Et = new C5101Et(stateListAnimator, new EX("Formality"));
        C5101Et c5101Et2 = new C5101Et(stateListAnimator, new EX("Profanity"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        AbstractC46962th abstractC46962thEZpvd = c48882ue.EZpvd();
        if (abstractC46962thEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, abstractC46962thEZpvd.EZpvd());
        }
        AbstractC46132tJ abstractC46132tJCopydefault = c48882ue.copydefault();
        if (abstractC46132tJCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et2, abstractC46132tJCopydefault.EZpvd());
        }
        ebEZpvd.AEQbTJ();
    }
}
