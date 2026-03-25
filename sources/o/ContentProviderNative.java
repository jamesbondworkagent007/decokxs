package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.FloatKeyframeSet;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ContentProviderNative {
    public static final FloatKeyframeSet copydefault(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        FloatKeyframeSet.ActionBar actionBar = new FloatKeyframeSet.ActionBar();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("EventAction"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                actionBar.EZpvd(FloatEvaluator.EZpvd.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
            } else if (numOLrzqt != null) {
                stateListAnimatorEZpvd.copydefault();
            } else {
                actionBar.EZpvd();
                return actionBar.KWHzl();
            }
        }
    }
}
