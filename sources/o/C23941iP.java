package o;

import aws.sdk.kotlin.services.rekognition.model.MalformedPolicyDocumentException;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;

/* JADX INFO: renamed from: o.iP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C23941iP {
    public static final void KWHzl(MalformedPolicyDocumentException.Activity activity, byte[] bArr) {
        EL el = new EL(bArr);
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("Code"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("Logref"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("Message"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity2 = new C5098Eq.Activity();
        activity2.EZpvd(c5101Et);
        activity2.EZpvd(c5101Et2);
        activity2.EZpvd(c5101Et3);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = el.EZpvd(activity2.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                activity.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    activity.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        activity.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
                    } else if (numOLrzqt == null) {
                        return;
                    } else {
                        stateListAnimatorEZpvd.copydefault();
                    }
                }
            }
        }
    }
}
