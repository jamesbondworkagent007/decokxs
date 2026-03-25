package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.OnActivityPausedListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ParameterUtils {
    public static final OnActivityPausedListener OLrzqt(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        OnActivityPausedListener.StateListAnimator stateListAnimator = new OnActivityPausedListener.StateListAnimator();
        AbstractC5105Ex.SharedElementCallback sharedElementCallback = AbstractC5105Ex.SharedElementCallback.AEQbTJ;
        C5101Et c5101Et = new C5101Et(sharedElementCallback, new EX("CreationDate"));
        C5101Et c5101Et2 = new C5101Et(sharedElementCallback, new EX("LastModifiedDate"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("ProviderName"));
        C5101Et c5101Et4 = new C5101Et(AbstractC5105Ex.StateListAnimator.copydefault, new EX("ProviderType"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                stateListAnimator.KWHzl(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    stateListAnimator.EZpvd(C5173Hn.AEQbTJ.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo()));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        stateListAnimator.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            stateListAnimator.EZpvd(ClientTransactionHandler.EZpvd.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo()));
                        } else if (numOLrzqt != null) {
                            stateListAnimatorEZpvd.copydefault();
                        } else {
                            stateListAnimator.OLrzqt();
                            return stateListAnimator.KWHzl();
                        }
                    }
                }
            }
        }
    }
}
