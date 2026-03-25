package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.OnEditorActionListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class BufferedOutputStream {
    public static final OnEditorActionListener OLrzqt(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        OnEditorActionListener.Activity activity = new OnEditorActionListener.Activity();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new C5128Fu("AccessKeyId"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.SharedElementCallback.AEQbTJ, new C5128Fu("Expiration"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new C5128Fu("SecretAccessKey"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new C5128Fu("SessionToken"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity2 = new C5098Eq.Activity();
        activity2.KWHzl(new C5128Fu("Credentials"));
        activity2.KWHzl(new C5127Ft("https://sts.amazonaws.com/doc/2011-06-15/", null, 2, null));
        activity2.EZpvd(c5101Et);
        activity2.EZpvd(c5101Et2);
        activity2.EZpvd(c5101Et3);
        activity2.EZpvd(c5101Et4);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity2.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                activity.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    activity.KWHzl(C5173Hn.AEQbTJ.copydefault(stateListAnimatorEZpvd.fetchVPNInfo()));
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        activity.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            activity.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
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
    }
}
