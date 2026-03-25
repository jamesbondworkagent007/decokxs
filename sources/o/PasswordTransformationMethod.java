package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.PooledStringReader;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PasswordTransformationMethod {
    public static final PooledStringReader copydefault(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        PooledStringReader.StateListAnimator stateListAnimator = new PooledStringReader.StateListAnimator();
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("FlywheelStatsS3Prefix"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                stateListAnimator.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
            } else if (numOLrzqt != null) {
                stateListAnimatorEZpvd.copydefault();
            } else {
                stateListAnimator.EZpvd();
                return stateListAnimator.copydefault();
            }
        }
    }
}
