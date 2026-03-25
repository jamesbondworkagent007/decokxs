package o;

import aws.sdk.kotlin.services.cognitoidentity.model.TooManyRequestsException;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;

/* JADX INFO: loaded from: classes2.dex */
public final class Iterator {
    public static final void copydefault(TooManyRequestsException.ActionBar actionBar, byte[] bArr) {
        EL el = new EL(bArr);
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("message"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                actionBar.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
            } else if (numOLrzqt == null) {
                return;
            } else {
                stateListAnimatorEZpvd.copydefault();
            }
        }
    }
}
